package com.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.Models.Issue;
import com.Operations.ReadFromFile;

@Repository("IssueDaoImpl")
public class IssueDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;
	
	private ReadFromFile sheetData = new ReadFromFile();

	private List<Issue> issueList = new ArrayList<Issue>();
	
	public ReadFromFile getSheetData() {
		return sheetData;
	}

	public void setSheetData(ReadFromFile sheetData) {
		this.sheetData = sheetData;
	}

	public List<Issue> getIssueList() {
		return issueList;
	}

	public void setIssueList(List<Issue> issueList) {
		this.issueList = issueList;
	}

	public void saveIssue(Issue issue) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try {
			issueList = sheetData.getListOfIssue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Issue issues: issueList){
			session.save(issues);
		}
		//session.save(issue);
		session.getTransaction().commit();
	}

	public int getIssueCount() {
		String hql = "select count(*) from Issue";
		Query query = sessionFactory.openSession().createQuery(hql);
		return ((Long) query.uniqueResult()).intValue();
	}
	
	//public Issue getIsssue(){
		
	//}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
