//这是一个测试static关键字的程序

public class Test_static{
	private static int a;
	private int b;

	static{
		Test_static.a = 3;
		System.out.println(a);
		Test_static t = new Test_static();
		t.fu();
		t.b = 1000;
		System.out.println(t.b);
	}

	static{
		Test_static.a = 3;
		System.out.println(a);
	}

	public static void main(String[] args){

	}

	static{
		Test_static.a = 5;
		System.out.println(a);
	}

	public void fu(){
		System.out.println("Hello World!");
	}
}