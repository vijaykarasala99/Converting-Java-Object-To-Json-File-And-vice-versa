package com.ait.entity;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Empl {

	public static void main(String[] args) throws Exception {
	
		/*
		Emp e=new Emp();
		e.setEmpid(120);
		e.setEmpname("raghu");
		e.setSalary(2100.00);
		
		ObjectMapper mapper = new ObjectMapper();

        // Convert the Java object to a JSON string
        String jsonString = mapper.writeValueAsString(e);

        // Write the JSON string to a file
        File jsonFile = new File("D:\\file2.json");
        mapper.writeValue(jsonFile, e);
      */
		
		//String json = "{ \"name\": \"John Smith\", \"age\": 42 }";

        // Create an instance of the ObjectMapper class
        ObjectMapper mapper = new ObjectMapper();

        
        File json = new File("D:\\file2.json");
        // Convert the JSON data to a Java object
        Emp e = mapper.readValue(json, Emp.class);

        // Use the Java object
        System.out.println(e.getEmpid());
        System.out.println(e.getEmpname());
        System.out.println(e.getSalary());
	}

}

