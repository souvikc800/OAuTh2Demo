package com.souvik.OAuth2Demo.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;
import org.springframework.stereotype.Component;

import com.souvik.OAuth2Demo.model.*;

@Component
public class StudentService {
	static List<Student> s=new ArrayList<Student>();
	static {
		Course c1=new Course(1,"java",Arrays.asList("spring","hibernate","maven"));
		Course c2=new Course(2,".NET",Arrays.asList("ADO","ListBox","TextBox"));
		Course c3=new Course(3,"AWS",Arrays.asList("EC2","CI/CD","Server"));
		
		List<Course> l1=new ArrayList<Course>();
		l1.add(c1);
		l1.add(c3);
		
		List<Course> l2=new ArrayList<Course>();
		l2.add(c1);
		l2.add(c2);
		
		Student s1=new Student(1,"souvik",l1);
		Student s2=new Student(2,"baban",l2);
		s.add(s1);
		s.add(s2);
		
}
	
	public Course courseOfStudent(int sid,int cid)
	{
		Course c=null;
		for(Student sc : s)
		{
			if(sc.id==sid)
			{
				List<Course> l=sc.l;
				for(Course d:l)
				{
					if(d.id==cid)
					{
						c=d;
					}
					
				}
			}
		}
		if(c==null)
			return null;
		else
			return c;
	}
	
}