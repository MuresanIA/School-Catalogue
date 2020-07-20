package com.MIA.onlinecatalog.repository;

import com.MIA.onlinecatalog.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
