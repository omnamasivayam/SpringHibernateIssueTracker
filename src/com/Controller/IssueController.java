package com.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.derby.impl.sql.catalog.SYSROUTINEPERMSRowFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Dao.IssueDaoImpl;
import com.Models.Issue;

@Controller
public class IssueController {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

	IssueDaoImpl issueDao = ctx.getBean("IssueDaoImpl", IssueDaoImpl.class);
	
	@RequestMapping("/")  
    public String helloWorld(Map<String, Object> model) { 
		Issue issue = new Issue();
		model.put("issue", issue);
		System.out.println("inside method of / ");
		ModelAndView mv = new ModelAndView("Testing.jsp");
        List<String> statusList = new ArrayList<>();
        statusList.add("InProgress");
        statusList.add("AwaitingFeedback");
        statusList.add("Resolved");
        model.put("statusList", statusList);
        
        return "Testing.jsp";  
		//return "IssueHome";
    }  
	
	@RequestMapping(value="/addIssue" , method=RequestMethod.POST)  
    public String addIssue(@ModelAttribute("IssueForm") Issue issue, Map<String, Object> model) {  
		System.out.println("inside method of /addIssue ");
		System.out.println("issue bugid is " + issue.getBugId());
		issueDao.saveIssue(issue);
		System.out.println(" Saved sucessfully");
	//	ModelAndView mv = new ModelAndView("IssueHome.jsp");
	//	mv.addObject("issue", issue);
      //  return mv;  
		return "IssueHome.jsp";
    } 
}
