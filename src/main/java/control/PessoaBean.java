package control;

import model.Pessoa;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import util.HibernateUtil;

@Named("pp")
public class PessoaBean implements java.io.Serializable {
    private Pessoa pessoa = new Pessoa();
    /**
     * Instancia objeto para criar a ponte da configuração do banco com hibernate (SessionFactory)
     */
      SessionFactory sessionFactory = new Configuration().configure("META-INF/hibernate.cfg.xml").buildSessionFactory();
//         SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
         Session session = sessionFactory.openSession();
    /**
     * Configura o  manualmente sem o xml
     */
//   SessionFactory sessionFactory = new Configuration()
//        .setProperty("hibernate.connection.username","postgres")
//        .setProperty("hibernate.connection.driver_class","org.postgresql.Driver")
//        .setProperty("hibernate.connection.url","jdbc:postgresql://localhost:5432/test")
//        .setProperty()
//        .buildSessionFactory();
public void salvar(){
//    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PostgresDS");
//  EntityManager entityManager = entityManagerFactory.createEntityManager();
    try{

        /**
         * Configuração do JPA, via hebernate.cfg.xml e Classe.hbm.xml.
         * SessionFactory sessionFactory = new Configuration().configure("META-INF/hibernate.cfg.xml").buildSessionFactory();
         * Session session = sessionFactory.openSession();
         * 1º Transaction transaction = session.beginTransaction();
         * 2º  session.save(Entidade);
         * 3º  transaction.commit();
         * CONFIG HIBERNATE.CFG.XML
         * --------------------------***---------------------------------------
         * <?xml version="1.0" encoding="utf-8"?>
         * <!DOCTYPE hibernate-configuration SYSTEM
         *         "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
         * <hibernate-configuration>
         *     <session-factory>
         *
         *         <property name = "hibernate.dialect">
         *             org.hibernate.dialect.PostgreSQLDialect
         *         </property>
         *
         *         <property name = "hibernate.connection.driver_class">
         *             org.postgresql.Driver
         *         </property>
         *
         *         <!-- Assume test is the database name -->
         *
         *         <property name = "hibernate.connection.url">
         *             jdbc:postgresql://localhost:5432/test
         *         </property>
         *
         *         <property name = "hibernate.connection.username">
         *             postgres
         *         </property>
         *
         *         <property name = "hibernate.connection.password">
         *             admin
         *         </property>
         *         <property name="hibernate.format_sql">
         *             true
         *         </property>
         *         <property name="hibernate.show_sql">
         *             true
         *         </property>
         *         <property name="connection.autocommit">true</property>
         *         <property name="transaction.auto_close_session">true</property>
         *
         *         <!-- List of XML mapping files -->
         *         <mapping resource = "META-INF/Pessoa.hbm.xml"/> <!-- MY CLASS MAPPING-->
         *
         *     </session-factory>
         * </hibernate-configuration>
         * -----------------------------------------****-------------------------------------
         * Pessoa.hbm.xml
         *  CONFIG
         *
         *  <?xml version = "1.0" encoding = "utf-8"?>
         * <!DOCTYPE hibernate-mapping PUBLIC
         *                 "-//Hibernate/Hibernate Mapping DTD//EN"
         *                 "http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd">
         *
         * <hibernate-mapping>
         *     <class name = "model.Pessoa" table = "pessoa">
         *
         *         <meta attribute = "class-description">
         *             This class contains the employee detail.
         *         </meta>
         *
         *         <id name = "id" type = "long" column = "id">
         *             <generator class="increment"/>
         *         </id>
         *
         *         <property name = "nome" column = "nome" type = "string"/>
         *
         *
         *     </class>
         * </hibernate-mapping>
         *
         */

//        Session session = HibernateUtil.getSession(); //sessionFactory.openSession();
 //       EntityManager entityManager = HibernateUtil.getSessionEntityManager();
        pessoa.setNome("samuel Meloo");
        pessoa.setId(null);

        Transaction transaction = session.beginTransaction();


//        entityManager.getTransaction().begin();
  //      entityManager.persist(pessoa);
    //    entityManager.getTransaction().commit();
      session.save(pessoa);
      transaction.commit();


//        entityManager.getTransaction().begin();
//        entityManager.persist(pessoa);
//        entityManager.getTransaction().commit();
//        session.persist(pessoa);
//    session.flush();
//        session.close();

        //entityManager.close();
    }catch (Exception e){
        e.printStackTrace();
    }




    }



}
