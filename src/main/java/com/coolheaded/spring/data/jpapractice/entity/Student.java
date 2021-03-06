package com.coolheaded.spring.data.jpapractice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name ="Student_tbl", uniqueConstraints = @UniqueConstraint(name="email_address", columnNames = "email_address"))
public class Student {
	
	@javax.persistence.Id
	@SequenceGenerator( name="student_sequence",
			sequenceName = "student_sequence",
			allocationSize = 1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE ,
			generator = "student_sequence"
			
			)
	private Long Id;
	
	@Column(name="first_name" )
	private String firstName;
	
	@Column(name="last_name" )
	private String lastName;
	
	@Column(name="email_address", nullable=false )
	private String emailAddress;
	
	@Column(name="guardian_name" )
	private String guardianName; 
	
	@Column(name="guardian_email" )
	private String guardianEmail;
	
	@Column(name="guardian_ph_num" )
	private String guardianPhNum;
	


}
