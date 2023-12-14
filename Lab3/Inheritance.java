class Animal
{
	void makeSound()
	{
		System.out.println("The animal makes a sound.");
	}
}
class Dog extends Animal
{
	@Override
	void makeSound()
	{
		System.out.println("The dog barks.");
	}
}
class Cat extends Animal
{
	@Override
	void makeSound()
	{
		System.out.println("The cat meow.");
	}
}


class Inheritence
{
	public static void main(String[] args) 
	{
		Animal animal = new Animal();
		animal.makeSound();
		System.out.println();
		Cat cat = new Cat();
		cat.makeSound();
		System.out.println();
		Dog dog = new Dog();
		dog.makeSound();
		System.out.println();
	}
}
