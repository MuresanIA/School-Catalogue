package com.MIA.onlinecatalog.repository;

import com.MIA.onlinecatalog.model.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplineRepository extends JpaRepository<Discipline, String> {
}
