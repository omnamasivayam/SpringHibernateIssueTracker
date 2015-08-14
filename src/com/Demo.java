package com;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Dao.IssueDaoImpl;
import com.Models.Issue;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("App ctx over");
		IssueDaoImpl issueDao = ctx.getBean("IssueDaoImpl", IssueDaoImpl.class);
		Issue issue = new Issue("AR1234", " this is the decription of the issue", "InProgress","OK OK OK ", new Date(), new Date());
		System.out.println(" the beginning");
		//System.out.println(issueDao.getIssueCount() + " the beginning");
		issueDao.saveIssue(issue);
		System.out.println(" Saved sucessfully");
		System.out.println(issueDao.getIssueCount());

	}

}
