package Laptop;

import Laptop.Laptop;

public class LaptopTest {

	public static void main(String[] args) {
	
		Laptop Laptop=new Laptop("Acer", "Windows 8" , 2018 );

		System.out.println(Laptop.name);
		System.out.println(Laptop.os);
		System.out.println(Laptop.year);
		
		Laptop Laptop2=new Laptop("MacBook", "OS X" , 2017 );

		Laptop2.name= "MacBook Pro";
		
		System.out.println(Laptop2.name);
		System.out.println(Laptop2.os);
		System.out.println(Laptop2.year);
}
}