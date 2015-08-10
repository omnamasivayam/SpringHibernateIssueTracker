import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.IssueDaoImpl;
import Models.Issue;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		IssueDaoImpl issueDao = ctx.getBean("IssueDaoImpl", IssueDaoImpl.class);
		Issue issue = new Issue(1, "AR1234" , " this is the decription of the issue", "InProgress", new Date());
		System.out.println(issueDao.getIssueCount() + " the beginning");
		issueDao.saveIssue(issue);
		System.out.println(issueDao.getIssueCount());
		

	}

}
