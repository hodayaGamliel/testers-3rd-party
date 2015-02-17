package org.apache;

public class Niv 
{
	public 	static void main(String[] args)
	{
		niv();
	}
	public static void niv()
	{
	System.out.println("Niv throw Exception");
	throw new NullPointerException();
	}
}
