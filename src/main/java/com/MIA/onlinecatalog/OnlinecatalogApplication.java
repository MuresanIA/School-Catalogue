package com.MIA.onlinecatalog;

import com.MIA.onlinecatalog.repository.StudentRepository;
import com.MIA.onlinecatalog.repository.UserRepository;
import com.MIA.onlinecatalog.service.SendGridEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlinecatalogApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SendGridEmailService sendGridEmailService;

    public static void main(String[] args) {
        SpringApplication.run(OnlinecatalogApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        try {
            userRepository.deleteById(1);
        } catch (Exception ex) {

        }
        //sendGridEmailService.sendHTML("buhaidebalta.15@gmail.com", "buhaidebalta.15@gmail.com", "Hello from the other side!", "Hello!");
//		Student student = new Student();
//		student.setFirstName("John");
//		student.setLastName("Doe");
//
//		Student student2 = new Student();
//		student2.setFirstName("John");
//		student2.setLastName("Doe");
//
//		studentRepository.save(student);
//		studentRepository.save(student2);
//
//		System.out.println("*************before delete*****************");
//		for (Student s: studentRepository.findAll()) {
//			System.out.println(s.getStudentId() + ". " + s.getFirstName() + " " + s.getLastName());
//		}
//
//		System.out.println("*************after delete*****************");
//		studentRepository.deleteById(2);
//		for (Student s: studentRepository.findAll()) {
//			System.out.println(s.getStudentId() + ". " + s.getFirstName() + " " + s.getLastName());
//		}

    }
}
