import java.util.Scanner;
public class Animals {
	Scanner scan = new Scanner (System.in);
	String typeAnimal;
	String name;
	String jantina ;
	String color ;
	int age ;
	double weight;
	
	//setter
	public void setAnimal () {
			System.out.println ("please enter the type of animal");
			this.typeAnimal=scan.nextLine();

	}
	public void setName () {
		System.out.println ("please enter the name of animakl");
		this.name=scan.nextLine();
	}
	public void setJantina( ) {
		System.out.println ("please enter the jantina of animal");
		this.jantina=scan.nextLine();
	}
	public void setColor ( ) {
		System.out.println ("please enter the color of animal");
		this.color=scan.nextLine();
	}
	public void setAge() {
		System.out.println ("please enter the age of animal");
		this.age=scan.nextInt();
	}
	public void setWeight() {
		System.out.println ("please enter the weight of animal");
		this.weight = scan.nextDouble();
	}
	
	//getter
	public Integer getAge () {
		return this.age;
	}
	public Double getWeight() {
		return this.weight;
	}
	public String getColor() {
		return this.color;
	}
	public String getName () {
		return this.name;
	}
	public String getJantina() {
		return this.jantina;
	}
	public String gettypeAnimal() {
		return this.typeAnimal;
	}

	void printAnimal () {
		System.out.println ("Rabbit and Cat are cute animals");
	}
}
