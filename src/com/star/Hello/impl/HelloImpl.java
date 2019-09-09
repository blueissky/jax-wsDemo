package com.star.Hello.impl;

import javax.jws.WebService;

import com.star.Hello.Hello;

@WebService
public class HelloImpl implements Hello{
	
	public HelloImpl() {
		// TODO Auto-generated constructor stub
		System.out.println(this+"init...");
	}
	
	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		 System.out.println("666"+name);
	     return "hello" + name;
	}

}
