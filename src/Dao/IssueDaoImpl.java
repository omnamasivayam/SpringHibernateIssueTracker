package Dao;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Models.Issue;

@Repository
public class IssueDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveIssue(Issue issue){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(issue);
		session.getTransaction().commit();	
	}

	public int getIssueCount()
	{
		String hql = "select count(*) from Issue";
		Query query = sessionFactory.openSession().createQuery(hql);
		return ((Long) query.uniqueResult()).intValue();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
