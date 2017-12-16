//这是一个测试异常处理的小程序
//throws是在函数名和形参列表之后且在函数体之前加入，目的是声明该函数会抛出何种异常
//throw是在用来抛出异常

public class Test_Exception {
	public static void main(String[] args){
		int a = 1;
		int b = 1;
		add(a,b);
	}

	public static void add(int a,int b) throws RuntimeException{
		if (a == b)
			throw new RuntimeException("Error!!");
	}
}