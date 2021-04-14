
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals a = new Animals ();
		a.setAnimal("Rabbit");
		a.setName("Rabbita");
		a.setJantina("Male");
		a.setColor("Mix black and white");
		a.setAge(2);
		a.setWeight(2.3);
		System.out.println ("Animal 1");
		System.out.println ("Animal \t\t:"+a.gettypeAnimal());
		System.out.println ("Name of animal\t:"+a.getName());
		System.out.println ("Jantina \t:"+a.getJantina());
		System.out.println ("Color \t\t:"+a.getColor());
		System.out.println ("Age \t\t:"+a.getAge()+" years old");
		System.out.println ("Weight \t\t:"+a.getWeight()+"Kg\n");
		
		Animals b = new Animals ();
		b.setAnimal("Cat");
		b.setName("Catty");
		b.setJantina("Male");
		b.setColor("Black");
		b.setAge(1);
		b.setWeight(1.5);
		
		System.out.println ("Animal 2");
		System.out.println ("Animal \t\t:"+b.gettypeAnimal());
		System.out.println ("Name of animal\t:"+b.getName());
		System.out.println ("Jantina \t:"+b.getJantina());
		System.out.println ("Color \t\t:"+b.getColor());
		System.out.println ("Age \t\t:"+b.getAge()+" years old");
		System.out.println ("Weight \t\t:"+b.getWeight()+"Kg\n");
		
		b.printAnimal ();
		
	}

}
