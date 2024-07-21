package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Course;

public class CourseDao {

	public EntityManager getEntityManager()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
		EntityManager em=emf.createEntityManager();
		return em;
		
	}
	
	
	
	
	public void updateCoure(int id,Course course)
	{
		
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		Course dbCourse=em.find(Course.class,id);
		if(dbCourse!=null)
		{
			et.begin();
			course.setId(id);
			em.merge(course);
			et.begin();
			
		}
		else 
		{
			System.out.println("sorry id is not be present");
		}
	
		
	}		
	
	
	   public void deleteCourse(int id)
		{
		EntityManager em=getEntityManager();
		
		Course dbCourse=em.find(Course.class, id);
		
		if(dbCourse!=null)
		{
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.remove(dbCourse);
			et.commit();
		}
		else 
		{
			System.out.println("sorry id is not b present");
		}
		
}
	 
	   public void findCourse(int id)
	  {
		EntityManager em=getEntityManager();
		Course dbCourse=em.find(Course.class, id);
		if(dbCourse!=null)
		{
			System.out.println(dbCourse);
		}
		else 
		{
			System.out.println("sorry id not be present");
		}
	  }
		
		
		}
	

