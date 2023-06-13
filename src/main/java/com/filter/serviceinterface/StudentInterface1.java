package com.filter.serviceinterface;

import java.util.List;

import com.filter.model.Student1;

public interface StudentInterface1 {
	// to save new student
	public Student1 saveStudent(Student1 student1);

	// to update student
	public Student1 updateStudent(Student1 student1);

	// to fetch all students from database
	public List<Student1> findAllStudent();

	// to delete student
	public void deleteStudent(int id);

	// to getbyid student
	public Student1 getStudentById(int id);
	
//	//Api count----------
//	public ApiCount saveApiOrUpdateCount(ApiCount apiCount);
//	
//	public ApiCount getApiCountObj(String apiName);
}
