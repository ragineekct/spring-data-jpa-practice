package com.coolheaded.spring.data.jpapractice.repository;




import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import com.coolheaded.spring.data.jpapractice.entity.Student;
import com.coolheaded.spring.data.jpapractice.repository.StudentRepository;







@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class StudentRepositoryTest {
	
	@Autowired
	private StudentRepository studendRepository;

	@Test
	public void saveStudent()
	{
		Student student=Student.builder().firstName("gracy").lastName("lincoln").emailAddress("gracy123@gmail.com")
				.guardianName("Alex").guardianPhNum("2104563987").guardianEmail("alex45@gmail.com").build();
		
		studendRepository.save(student);
	}
	

	

}
