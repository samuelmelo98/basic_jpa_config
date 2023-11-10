package util;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HibernateUtil {

    private static  SessionFactory sessionFactory = null;
    private static  EntityManagerFactory entityManagerFactory = null;

    /**
     * Método  sem assinatura com static roda na class automatico.
     */
    static {
        try{
            System.out.println("Rodou static I !");
         sessionFactory = new Configuration().configure().buildSessionFactory();

        } catch(Exception e){
            e.printStackTrace();
            Logger.getGlobal().config("Erro ao criar a fabrica SessionFactory");
        }
    }

    static {
        try{
            System.out.println("Rodou static II !");
            entityManagerFactory =  Persistence.createEntityManagerFactory("PostgresDS");

        } catch(Exception e){
            e.printStackTrace();
            Logger.getGlobal().config("Erro ao criar a fabrica com RntityManagerFactory!");
        }
    }

    public static Session getSession(){
        return sessionFactory.openSession();
    }

    public static EntityManager getSessionEntityManager(){
        return entityManagerFactory.createEntityManager();
    }

}
