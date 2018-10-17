package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class DeleteCoursesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			
			int theId = 1;
			Course tempCouse = session.get(Course.class, theId);
			
			System.out.println("Deleting couse: " +tempCouse);
			
			session.delete(tempCouse);
			
			session.getTransaction().commit();

			System.out.println("Done");

		} finally {
			session.close();
			factory.close();
		}

	}

}
 