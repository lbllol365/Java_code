public class TestRectangle{
	public static void main(String[] args){
		Rectangle test1 = new Rectangle(4.0,40.0);
		//创建一个矩形对象

		Rectangle test2 = new Rectangle(3.5,35.9);
		//创建另一个矩形对象

		System.out.println(test1.width + test1.heigth + test1.getArea() + test1.getPerimeter());
		System.out.println(test2.width + test2.heigth + test2.getArea() + test2.getPerimeter());
		//打印测试结果
	}
}