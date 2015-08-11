package com.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Models.Issue;

@Controller
public class IssueController {
	
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
    public String addIssue(@ModelAttribute("userForm") Issue issue, Map<String, Object> model) {  
		System.out.println("inside method of /addIssue ");
		System.out.println("issue bugid is " + issue.getBugId());
        return "IssueHome.jsp";  
		//return "IssueHome";
    } 
}
