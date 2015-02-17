package org.apache;

import com.example.Chen;
 
public class TestMain
{ 
	public static void main(String[] args)
	{
		test();
	}
	public static void test()
	{
		System.out.println("Test method - call to Chen");
	Chen chen = new Chen();
	chen.chen();
	}	
}
