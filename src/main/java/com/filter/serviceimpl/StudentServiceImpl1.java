package com.filter.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filter.model.Student1;
import com.filter.repository.StudentRepository1;
import com.filter.serviceinterface.StudentInterface1;

@Service
public class StudentServiceImpl1 implements StudentInterface1 {
	@Autowired
	private StudentRepository1 studentRepo;

	@Override
	public Student1 saveStudent(Student1 student1) {
		// TODO Auto-generated method stub

		return studentRepo.save(student1);
	}

	//	@Override
	//	public ApiCount saveStudent(

	@Override
	public Student1 updateStudent(Student1 student1) {
		// TODO Auto-generated method stub
		return studentRepo.save(student1);
	}

	@Override
	public List<Student1> findAllStudent() {
		// TODO Auto-generated method stub
		return (List<Student1>) studentRepo.getAllStudent();
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
	}

	@Override
	public Student1 getStudentById(int id) {
		return studentRepo.getStudentById(id);
	}






}
