import model.Carro;
import org.hibernate.*;

import org.hibernate.cfg.Configuration;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;


public class Main {

    public static void main (String...aacj){

        SessionFactory sessionFactory = null;
        Session session = (Session) sessionFactory.createEntityManager();
        session.beginTransaction();
        session.save( new Carro(1,"chevete", 500));
        session.getTransaction().commit();
        session.close();





//        try {
//            factory = new Configuration().configure().buildSessionFactory();
//        } catch (Throwable ex) {
//            System.err.println("Failed to create sessionFactory object." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//
//        Session session = factory.openSession();
//        Transaction tx = null;
//        Integer employeeID = null;
//
//        try {
//            tx = session.beginTransaction();
//            Carro c1 = new Carro(1,"chevete", 500);
//            employeeID = (Integer) session.save(c1);
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx!=null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }



//        logger.info("\n=======UPDATE RECORDS=======\n");
//        int updateId = 1;
//        DbOperations.updateRecord(updateId);
//        logger.info("\n=======READ RECORDS AFTER UPDATION=======\n");
//        List updateStudent = DbOperations.displayRecords();
//        if(updateStudent != null & updateStudent.size() > 0) {
//            for(Student studentObj : updateStudent) {
//                logger.info(studentObj.toString());
//            }
//        }

//        logger.info("\n=======DELETE RECORD=======\n");
//        int deleteId = 5;
//        DbOperations.deleteRecord(deleteId);
//        logger.info("\n=======READ RECORDS AFTER DELETION=======\n");
//        List deleteStudentRecord = DbOperations.displayRecords();
//        for(Student studentObj : deleteStudentRecord) {
//            logger.info(studentObj.toString());
//        }

//        logger.info("\n=======DELETE ALL RECORDS=======\n");
//        DbOperations.deleteAllRecords();
//        logger.info("\n=======READ RECORDS AFTER ALL RECORDS DELETION=======");
//        List deleteAll = DbOperations.displayRecords();
//        if(deleteAll.size() == 0) {
//            logger.info("\nNo Records Are Present In The Database Table!\n");
//        }
//        System.exit(0);
    }

    /* Method to CREATE an employee in the database */
//    public Integer addEmployee(int id, String modelo, float valor){
//        Session session = factory.openSession();
//        Transaction tx = null;
//        Integer employeeID = null;
//
//        try {
//            tx = session.beginTransaction();
//            Carro c1 = new Carro(id, modelo, valor);
//            employeeID = (Integer) session.save(c1);
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx!=null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//        return employeeID;
//    }

//    /* Method to  READ all the employees */
//    public void listEmployees( ){
//        Session session = factory.openSession();
//        Transaction tx = null;
//
//        try {
//            tx = session.beginTransaction();
//            List employees = session.createQuery("FROM Employee").list();
//            for (Iterator iterator = employees.iterator(); iterator.hasNext();){
//                Employee employee = (Employee) iterator.next();
//                System.out.print("First Name: " + employee.getFirstName());
//                System.out.print("  Last Name: " + employee.getLastName());
//                System.out.println("  Salary: " + employee.getSalary());
//            }
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx!=null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//    }

//    /* Method to UPDATE salary for an employee */
//    public void updateEmployee(Integer EmployeeID, int salary ){
//        Session session = factory.openSession();
//        Transaction tx = null;
//
//        try {
//            tx = session.beginTransaction();
//            Employee employee = (Employee)session.get(Employee.class, EmployeeID);
//            employee.setSalary( salary );
//            session.update(employee);
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx!=null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//    }

//    /* Method to DELETE an employee from the records */
//    public void deleteEmployee(Integer EmployeeID){
//        Session session = factory.openSession();
//        Transaction tx = null;
//
//        try {
//            tx = session.beginTransaction();
//            Employee employee = (Employee)session.get(Employee.class, EmployeeID);
//            session.delete(employee);
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx!=null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//    }
}
