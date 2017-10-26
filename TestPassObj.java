public class TestPassObj{
	public static void main(String args[]){

		Circle3 c9 = new Circle3(7.8);
		//创建新Circle对象

		int n = 5;
		//设定重复次数

		printArea(c9,n);
		//调用函数
	}

	public static void printArea(Circle3 c,int number){

		int temp = 0;
		while (temp < number) {
			System.out.println(c.getArea());
			System.out.println(c.getRadius());
			c.setRadius(c.getRadius() + 1);
			temp ++;
		}
	}
}