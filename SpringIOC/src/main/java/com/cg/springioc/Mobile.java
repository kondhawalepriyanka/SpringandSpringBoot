package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile 
{

	public static void main(String[] args) 
	{
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("The file is executing..!");
		/*Agenda
		//1.we should not touch the source code
		//2.This Application should be configurable.
		//hard coding
	
		//for Vi class method
		Vi v=new Vi();
		v.calling();
		v.data();
		
		//for Jio class method
		Jio j=new Jio();
		j.calling();
		j.data();*/
		Sim s=a.getBean("sim",Sim.class);
		s.calling();
		s.data();
		
		Sim s1=a.getBean("sim1",Sim.class);
		s1.calling();
		s1.data();
	}

}
