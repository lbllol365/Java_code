public class TestRegularPolygon{
	public static void  main(String[] args){
		RegularPolygon test1 = new RegularPolygon(6,4);

		RegularPolygon test2 = new RegularPolygon(10,4,5.6,7.8);

		//创建两个多边形对象

		System.out.println(test1.getPerimeter());
		System.out.println(test1.getArea());

		System.out.println(test2.getPerimeter());
		System.out.println(test2.getArea());
		//打印测试结果
	}
}