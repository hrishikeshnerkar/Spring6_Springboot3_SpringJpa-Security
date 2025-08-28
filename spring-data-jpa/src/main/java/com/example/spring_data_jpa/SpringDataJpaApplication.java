package com.example.spring_data_jpa;

import com.example.spring_data_jpa.Repository.StudentRepo;
import com.example.spring_data_jpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		/**
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		s1.setRollNo(101);
		s1.setName("Aarav Mehta");
		s1.setMarks(87);

		s2.setRollNo(102);
		s2.setName("Ishita Roy");
		s2.setMarks(92);

		s3.setRollNo(103);
		s3.setName("Rohan Das");
		s3.setMarks(76);

		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
		 **/
		System.out.println(repo.findAll()); // Give all student data

		System.out.println();
		System.out.println(repo.findById(103));// Give data of specific user
		System.out.println();

		Optional<Student> s = repo.findById(106); // This id is not present so we use optional to handle the exception
		System.out.println(s.orElse(new Student())); // if its not there it will give us null

	}

}
