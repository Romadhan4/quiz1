
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals a = new Animals ();
		a.setAnimal();
		a.setName();
		a.setJantina();
		a.setAge();
		a.setColor();
		a.setWeight();
		System.out.println ("Animal 1");
		System.out.println ("Animal \t\t:"+a.gettypeAnimal());
		System.out.println ("Name of animal\t:"+a.getName());
		System.out.println ("Jantina \t:"+a.getJantina());
		System.out.println ("Color \t\t:"+a.getColor());
		System.out.println ("Age \t\t:"+a.getAge()+" years old");
		System.out.println ("Weight \t\t:"+a.getWeight()+"Kg\n");
		
		Animals b = new Animals ();
		
		b.setAnimal();
		b.setName();
		b.setJantina();
		b.setAge();
		b.setColor();
		b.setWeight();
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
