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
    public ModelAndView helloWorld(Map<String, Object> model) { 
		Issue issue = new Issue();
		model.put("issue", issue);
		System.out.println("inside method of / ");
		ModelAndView mv = new ModelAndView("Testing.jsp");
        List<String> statusList = new ArrayList<>();
        statusList.add("InProgress");
        statusList.add("AwaitingFeedback");
        statusList.add("Resolved");
        issueDao.saveIssue(new Issue());
        mv.addObject("issues", issueDao.getIssueList());
        model.put("statusList", statusList);
        return mv;  
		//return "IssueHome";
    }  
	
	@RequestMapping(value="/addIssue" , method=RequestMethod.POST)  
    //public ModelAndView addIssue(@ModelAttribute("IssueForm") Issue issue, Map<String, Object> model) {
    public ModelAndView addIssue() {  
		System.out.println("inside method of /addIssue ");
	//	System.out.println("issue bugid is " + issue.getBugId());
	//	issueDao.saveIssue(issue);
		issueDao.saveIssue(new Issue());
		System.out.println(" Saved sucessfully");
		ModelAndView mv = new ModelAndView("IssueHome.jsp");
		mv.addObject("issues", issueDao.getIssueList());
        return mv;  
		//return "IssueHome.jsp";
    } 
	
	@RequestMapping(value="/addIssue" , method=RequestMethod.GET)  
    //public ModelAndView addIssue(@ModelAttribute("IssueForm") Issue issue, Map<String, Object> model) {
    public ModelAndView getAddIssue(Map<String, Object> model) {  
		Issue issue = new Issue();
	//	mv.put("issue", issue);
		System.out.println("inside method of /addIssue ");
		System.out.println("issues for month 7 is" + issueDao.getIssuesForMonth());
	//	System.out.println("issue bugid is " + issue.getBugId());
	//	issueDao.saveIssue(issue);
	//	issueDao.saveIssue(new Issue());
	//	System.out.println(" Saved sucessfully");
		ModelAndView mv = new ModelAndView("addTicket.jsp");
		model.put("issue", issue);
		//mv.addObject("issues", issueDao.getIssueList());
        return mv;  
		//return "IssueHome.jsp";
    } 
	
	@RequestMapping(value="/checkStatus" , method=RequestMethod.GET)  
    //public ModelAndView addIssue(@ModelAttribute("IssueForm") Issue issue, Map<String, Object> model) {
    public ModelAndView checkStatus(Map<String, Object> model) {  
	//	Issue issue = new Issue();
	//	mv.put("issue", issue);
		System.out.println("inside method of /checkStatus ");
	//	System.out.println("issue bugid is " + issue.getBugId());
	//	issueDao.saveIssue(issue);
	//	issueDao.saveIssue(new Issue());
	//	System.out.println(" Saved sucessfully");
		ModelAndView mv = new ModelAndView("checkStatus.jsp");
		//model.put("issue", issue);
		
		mv.addObject("inprogress", 2 );
		mv.addObject("resolved",1);
		mv.addObject("awaitingfeedback",4);
		mv.addObject("closed", 3);
		
        return mv;  
		//return "IssueHome.jsp";
    } 
	
}
