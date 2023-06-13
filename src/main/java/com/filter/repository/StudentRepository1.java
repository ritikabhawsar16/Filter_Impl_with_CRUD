package com.filter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.filter.model.Student1;

@Repository
public interface StudentRepository1 extends JpaRepository<Student1, Integer> {
	@Query(value = "FROM Student1 ")
	List<Student1> getAllStudent();

	@Query(value = "select * from student_table1 where id=:id", nativeQuery = true)
	Student1 getStudentById(int id);


}
