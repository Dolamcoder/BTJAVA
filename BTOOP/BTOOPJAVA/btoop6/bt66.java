package btoop6;

public class bt66 {
public static void main(String[] args)
{
	Animal cat=new Cat("kity");
	cat.greets();
	Animal dog=new Dog("Max");
	dog.greets();
	Dog dog2=new Dog("milu");
    Dog dog3=new Dog("Bingo");
    dog2.greets(dog3);
    BigDog dog4=new BigDog("kinza");
    dog4.greets();
    dog4.greets(dog3);
    BigDog dog5=new BigDog("win");
    dog4.greets(dog5);
}
}
