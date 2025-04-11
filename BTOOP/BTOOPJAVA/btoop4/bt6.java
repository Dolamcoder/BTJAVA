package btoop4;
public class bt6 {
	 public static void main(String[] args) {
		 Animal animal = new Animal("Elephant");
		 System.out.println(animal);
		 Mammal mammal = new Mammal("Tiger");
		 System.out.println(mammal);
		 Cat kitty = new Cat("Kitty");
	        System.out.println(kitty);
	        kitty.greets(); 
	     Dog buddy = new Dog("Buddy");
	     Dog max = new Dog("Max");
	        System.out.println(buddy);
	        buddy.greets();
	        buddy.greest(max);
	}
}
