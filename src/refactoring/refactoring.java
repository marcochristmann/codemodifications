package refactoring;

import java.util.LinkedList;

import animal.Animal;
import animal.Cat;
import animal.Parrot;
import vehicle.Car;
import vehicle.Tires;

public class refactoring {
	public static Cat cat2;
	public static Car car1;
	public static LinkedList<Animal> animals = new LinkedList<>();

	public static void main(String[] args) {
		Cat cat1 = new Cat("Sylvester", "meow", 4, true);
		cat2 = new Cat("Scratchy", "meow", 4, true);
		Parrot parrot1 = new Parrot();
		car1 = new Car(5, 190);
		Car car2 = new Car(2, 260);		
		Animal a = new Cat("Pikachu", "pika", 4, true);		
		Animal b = (Cat) a;
		animals.add(cat1);
		Cat cat3 = (Cat)animals.getFirst();
		
		cat1.makeNoise();
		cat2.makeNoise();
		cat3.kill();
		parrot1.babble("Hello");
		b.makeNoise();
		
		car1.changeTires(new Tires(100000, "Marco's"));
		car1.setMileage(50000);
		car1.tires.setCurrentRange(10000);
		
		car2.changeTires(new Tires(20000, "Racings"));
		car1.setMileage(5000);
		car2.tires.setCurrentRange(10000);
		
		System.out.println(car1.tires.remainingRange());
		System.out.println(car2.tires.manufacturer);
	}

}
