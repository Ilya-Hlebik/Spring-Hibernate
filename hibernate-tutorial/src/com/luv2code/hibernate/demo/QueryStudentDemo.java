package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		try {

			session.beginTransaction();
			
			List<Student> theStudents = session.createQuery("from Student").list();
			
			displayStudent(theStudents);
			
			theStudents = session.createQuery("from Student s where s.lastName='Doe'").list();
			
			System.out.println("\nStudents who have last name of Doe");
			displayStudent(theStudents);
			
			theStudents = 
					session.createQuery("from Student s where"
							+ " s.lastName='Doe' OR s.firstName='Daffy'").list();
			
			System.out.println("\nStudents who have last name of Doe or first name Daffy");
			displayStudent(theStudents);
			
			
			theStudents = 
					session.createQuery("from Student s where"
							+ " s.email Like '%gmail.com'").list();
			
			System.out.println("\nStudents who have email like luv2code");
			displayStudent(theStudents);
			
			
				
			session.getTransaction().commit();

			System.out.println("Done");

		} finally {
			factory.close();
		}

	}

	private static void displayStudent(List<Student> theStudents) {
		theStudents.forEach(System.out::println);
	}

}
