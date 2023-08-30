package com.examly.springapp;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import java.io.File;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = SpringappApplication.class)
@AutoConfigureMockMvc

class SpringappApplicationTests {

	@Autowired
	private  MockMvc mockMvc;

	@Test
	public void add() throws Exception {
		String st = "{\"employeeId\": 101,\"employeeName\": \"Aravind\", \"email\": \"Auto\", \"mobile\": 20343, \"address\": \"Ram\", \"roll\": 534343434 , \" salary\" :\"hubbali\" , \"Department\": \"CS\"}";
	 	mockMvc.perform(MockMvcRequestBuilders.post("/")
	 			.contentType(MediaType.APPLICATION_JSON)
	 			.content(st)
	 			.accept(MediaType.APPLICATION_JSON))
	        	.andExpect(status().isOk())
				.andExpect(jsonPath("$").value(true))
	        	.andReturn();
	}

	@Test

    public void controllerfolder() {

        String directoryPath = "src/main/java/com/examly/springapp/controller"; // Replace with the path to your directory

        File directory = new File(directoryPath);

        assertTrue(directory.exists() && directory.isDirectory());

    }

	@Test

    public void controllerfile() {

        String filePath = "src/main/java/com/examly/springapp/controller/ApiController.java";

        File file = new File(filePath);

        assertTrue(file.exists() && file.isFile());

    }


	@Test

    public void testModelFolder() {

        String directoryPath = "src/main/java/com/examly/springapp/model"; // Replace with the path to your directory

        File directory = new File(directoryPath);

        assertTrue(directory.exists() && directory.isDirectory());

    }

	@Test

    public void testModelFile() {

        String filePath = "src/main/java/com/examly/springapp/model/Employee.java";

        File file = new File(filePath);

        assertTrue(file.exists() && file.isFile());

    }

	@Test

    public void testrepositoryfolder() {

        String directoryPath = "src/main/java/com/examly/springapp/repository"; 

        File directory = new File(directoryPath);

        assertTrue(directory.exists() && directory.isDirectory());

    }

   

    @Test

    public void testrepositoryFile() {

        String filePath = "src/main/java/com/examly/springapp/repository/EmployeeRepository.java";
		
        File file = new File(filePath);

        assertTrue(file.exists() && file.isFile());

    }


    @Test

    public void testServiceFolder() {

        String directoryPath = "src/main/java/com/examly/springapp/service"; 

        File directory = new File(directoryPath);

        assertTrue(directory.exists() && directory.isDirectory());

    }

   

    @Test

    public void testServieFile() {

        String filePath = "src/main/java/com/examly/springapp/service/EmployeeService.java";

        File file = new File(filePath);

        assertTrue(file.exists() && file.isFile());

    }

	

}
