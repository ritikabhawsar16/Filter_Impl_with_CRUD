package com.filter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student_table1",catalog="student_database1")
public class Student1 {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "pid_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)

	private int id;

	private int roll;

	private String name;
	
	@Column(name="address")
	private String address;  //Address

}
