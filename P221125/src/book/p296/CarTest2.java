package book.p296;

class Car {
	String color;
	String gearType;
	int door;

	Car() {
		this("white", "auto", 4);
	}

	Car(String color) {
		this(color, "auto", 4);
		door = 5;
	}

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		System.out.println("c1의 color=" + c1.color + ", geatType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", geatType=" + c2.gearType + ", door=" + c2.door);

	}

}
