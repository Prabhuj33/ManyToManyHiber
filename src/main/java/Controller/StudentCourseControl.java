package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dao.CourseDao;
import dao.StudentDao;
import dto.Course;
import dto.Student;

public class StudentCourseControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Course c1=new Course();
//		c1.setId(1);
//		c1.setName("HTML");
//		c1.setFees(2000.89);
//		
//		Course c2=new Course();
//		c2.setId(2);
//		c2.setName("SQL");
//		c2.setFees(9856.56);
//		
//		Course c3=new Course();
//		c3.setId(3);
//		c3.setName("JAVA");
//		c3.setFees(20000.78);
//		
//		
//		
//		Student s1=new Student();
//		s1.setId(101);
//		s1.setName("prabhu");
//		s1.setAddress("Thanaji");
//		
//		List<Course> co1=new ArrayList<Course>();
//		co1.add(c1);
//		co1.add(c2);
//		co1.add(c3);
//		
//		s1.setCourse(co1);
//		
//	
//	
//		Student s2=new Student();
//		s2.setId(102);
//		s2.setName("Ramya");
//		s2.setAddress("Trichy");
//		
//		List<Course>co2=new ArrayList<Course>();
//		co2.add(c1);
//		co2.add(c2);
//		co2.add(c3);
//		
//		s2.setCourse(co2);
//		
//		
//		
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//		et.begin();
//		em.persist(c1);
//		em.persist(c2);
//		em.persist(c3);
//		
//		em.persist(s1);
//		em.persist(s2);
//		
//		et.commit();
		
		
		
		
		
		
		//update
	
		
		
//		Student s =new Student();
//		s.setId(101);
//		s.setName("Pallavi");
//		s.setAddress("Singapore");
//		
//		StudentDao dao=new StudentDao();
//		dao.updateStudent(101, s);
//		
		
//		Course c= new Course();
//		c.setId(1);
//		c.setName("Css");
//		c.setFees(1000);
//
//		
//		CourseDao dao=new CourseDao();
//		dao.updateCoure(1, c);

//		CourseDao dao=new CourseDao();
//		dao.findCourse(1);
////		
//		StudentDao da=new StudentDao();
//		da.findStudent(101);
////		
		
		CourseDao c=new CourseDao();
		c.deleteCourse(2);
		
//		StudentDao da=new StudentDao();
//		da.deleteStudent(102);
	}

}
