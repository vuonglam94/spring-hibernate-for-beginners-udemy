package com.lamv.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {
			
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON file and map/convert to Java POJO: data/sample-lite.json
			Student theStudent = mapper.readValue(
					new File("data/sample-full.json"), Student.class);
			
			// print first name and last name
			System.out.println("First name = " + theStudent.getFirstName());
			System.out.println("Last name = " + theStudent.getLastName());
			
			// print out address: city and street
			Address theAddress = theStudent.getAddress();
			System.out.println("Street = " + theAddress.getStreet());
			System.out.println("City = " + theAddress.getCity());
			
			// print out languages
			for (String language : theStudent.getLanguages()) {
				System.out.println(language);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
