//这是一个测试abstract关键字的程序
//配套类为Dog.java Cat.java Animal.java

public class Test_abstract{
	public static void main(String[] args){
		Cat cat = new Cat();
		Dog dog = new Dog();

		cat.cry();
		dog.cry();
	}
}