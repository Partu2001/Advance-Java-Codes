package hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainEmployee {

	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(EmployeeTable.class);
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		System.out.println("Table created in Database");

	}

}


