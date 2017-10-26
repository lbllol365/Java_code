//此程序是练习对象数组

public class TotalArea{
	public static void main(String args[]){
		Circle3[] CircleArray;

		CircleArray = creatCircleArray();

		printCircleArray(CircleArray);
	}
	//主程序

	public static Circle3[] creatCircleArray(){
		Circle3[] circleArray = new Circle3[5];

		for(int i = 0;i < circleArray.length;i++){
			circleArray[i] = new Circle3(Math.random() * 100);
		}

		return circleArray;
	}
	//创建对象数组的函数

	public static void printCircleArray(Circle3[] cArray){

		double sumArea = 0;
		for(int i = 0;i < cArray.length;i++){
			sumArea += cArray[i].getArea();
			System.out.println(cArray[i].getRadius());
		}

		System.out.println(sumArea);
	}
	//打印对象数组内所有元素的面积和的函数
}