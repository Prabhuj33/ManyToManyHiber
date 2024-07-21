package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Student;

public class StudentDao
{

  
	EntityManager getEntityManager()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
		EntityManager em=emf.createEntityManager();
		return em;
	}
	
	
	public void updateStudent(int id,Student student)
	{
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student dbStudent=em.find(Student.class,id);
		
		if(dbStudent!=null)
		{
			et.begin();
			student.setId(id);
			student.setCourse(dbStudent.getCourse());
			em.merge(student);
			et.commit();
		}
		else 
		{
			System.out.println("sorry id is not be present");
		}
		
	}
	
       public void findStudent(int id)
       {
    	   EntityManager em=getEntityManager();
    	   Student dbStudent=em.find(Student.class, id);
    	   if(dbStudent!=null)
    	   {
    		   System.out.println(dbStudent);
    	   }
    	   else
    	   {
    		   System.out.println("sorry id is not be present");
    	   }
       }
	
	
       public void deleteStudent(int id)
       {
    	   EntityManager em=getEntityManager();
    	   EntityTransaction et=em.getTransaction();
    	   Student dbStudent=em.find(Student.class,id);
    	   if(dbStudent!=null)
    	   {
    		   et.begin();
    		   em.remove(dbStudent);
    		   et.commit();
    	   }
    	   else
    	   {
    		  System.out.println("sorry id is not be present"); 
    	   }
       }
       
}

