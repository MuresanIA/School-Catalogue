package com.MIA.onlinecatalog.repository;

import com.MIA.onlinecatalog.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, Integer> {
}
