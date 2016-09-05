package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Student;
import com.dao.StudentManager;

public class Test {
     public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Student a=(Student)ctx.getBean("stu");
		StudentManager b=(StudentManager)ctx.getBean("stu1");
		//a.setName("gfg3554");
		//a.setPass("gf3543545454");
		b.show();

	}

}
