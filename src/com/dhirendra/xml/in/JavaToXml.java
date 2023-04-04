package com.dhirendra.xml.in;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JavaToXml
{
	public static void main(String[] args) 
	{
		try {
			Student student = new Student();
			student.setId(1);
			student.setFirstName("Dhirendra");
			student.setLastName("Shubham");
			
			
			
			JAXBContext jaxbContext=JAXBContext.newInstance(Student.class);
			
			Marshaller marshaller = jaxbContext.createMarshaller();
			
			File file = new File("E:\\\\student.xml");
			marshaller.marshal(student,file);
			
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
