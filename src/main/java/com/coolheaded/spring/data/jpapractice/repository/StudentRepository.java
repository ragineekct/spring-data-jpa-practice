package com.coolheaded.spring.data.jpapractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coolheaded.spring.data.jpapractice.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	

}
