package com.melikenur.StudentManagementSystem.repository;

import com.melikenur.StudentManagementSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
