import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SimpleTest
{
	public static void main(String[] args)
	{
		SessionFactory sessionFactory = new
        Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();

        Lecturer lecturer1 = new Lecturer();
        lecturer1.setFirstName("Fatma");
        lecturer1.setLastName("Meawad");

        session.save(lecturer1);
        tx.commit();

        System.out.println("The lecturer " + lecturer1.getFirstName()+ " " 
                            + lecturer1.getLastName()+" is successfully added to your database");
     }
}