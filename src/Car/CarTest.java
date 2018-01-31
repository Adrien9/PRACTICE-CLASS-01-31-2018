package Car;

import Car.Car;

public class CarTest {

	public static void main(String[] args) {

		Car Car=new Car("BMW", 55000, 2018 );

		System.out.println(Car.carBrand);
		System.out.println(Car.price);
		System.out.println(Car.year);

		Car Car2=new Car("Ford", 12000, 2005 );
		
		Car2.carBrand="Nissan";
				
		System.out.println(Car2.carBrand);
		System.out.println(Car2.price);
		System.out.println(Car2.year);

	}
}
