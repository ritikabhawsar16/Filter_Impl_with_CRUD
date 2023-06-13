package com.filter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.filter.model.Student1;
import com.filter.serviceimpl.StudentServiceImpl1;

@RestController
//we are using postman to do operations for that we need to add cross origin annotations

@RequestMapping("/stud")
public class ControllerClass {
//	Logger logger = LoggerFactory.getLogger(ControllerClass.class);

	// to create bean of implementation class
		@Autowired
		private StudentServiceImpl1 studentServiceImpl1;


		// to call save method or to save new student
		@PostMapping(value = "/saveStudent")
		public Student1 saveStudent(@RequestBody Student1 student) {
			// lets try if it works (run)
			System.out.println("Student Save Works Properly !!!");
			Student1 savedStudent = studentServiceImpl1.saveStudent(student);
			
		//	String apiName = "/stud/saveStudent";
			
			return savedStudent;
			// now open postman to hit API(INSERT AND SAVE DATA IN DATABASE)
			// in this way new student registration is done
		}
		
	

		//-------------------------------------------------------------------------
		// now lets try to find all students from db
		@GetMapping(value = "/getAllStudent")
		public List<Student1> findAllStudent() {
			return studentServiceImpl1.findAllStudent();
			// save it
			// open postman & now read the data
		}

		// now try to update student
		@PutMapping("/updateStudent")
		public Student1 updateStudent(@RequestBody Student1 student) {
			return studentServiceImpl1.updateStudent(student);
			// open postman & now update the data
		}

		// now try to delete
		@DeleteMapping("/deleteStudent")
		public String deleteStudent(@RequestParam int id) {
			studentServiceImpl1.deleteStudent(id);
			return "Student Deleted !!!";
			// open postman & now delete existing the data
		}

		//get(update) data by update fields(address & id) 
		@GetMapping(value = "/getStudentById")
		public Student1 getById(@RequestParam int id) {
			Student1 studentById = studentServiceImpl1.getStudentById(id);
			return studentById;
			// get by id it
			// open postman & now read the data
		}

}
