package com.example.demo.repo;

import com.example.demo.modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
//entity and primary key ka type