//这是《Java语言程序设计 基础篇》第六章课后题
//每写完一个题，运行成功后，将其注释掉，继续写下一个题

import java.util.Scanner;

public class Liu_1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//创建新的Scanner对象

		int student_number = 0;
		//声明学生编号的数组长度（学生数）

		System.out.println("请输入学生的总数");

		student_number = input.nextInt();

		int[] student = new int[student_number];
		//创建学生成绩储存数组

		System.out.println("请输入这几个学生的成绩");

		for(int i = 0;i < student.length;i++){
			student[i] = input.nextInt();
		}//获取这几个学生的成绩

		int max_grade = student[0];
		for(int i = 0;i < student.length;i++){
			if(max_grade < student[i])
				max_grade = student[i];
		}//获取学生成绩的最大值



		char[] student_char = new char[student_number];
		//创建学生的成绩表现数组

		for(int i = 0;i < student.length;i++){
			if(student[i] >= (max_grade - 10))
				student_char[i] = 'A';
			else if(student[i] >= (max_grade - 20))
				student_char[i] = 'B';
			else if(student[i] >= (max_grade - 30))
				student_char[i] = 'C';
			else if(student[i] >= (max_grade - 40))
				student_char[i] = 'D';
		}//根据情况判断该名学生的成绩所属等级

		for(int i = 0;i < student.length;i++){
			System.out.println("第 " + i + "名学生的成绩是" + student[i] + "他所属的等级是 " + student_char[i]);
		}//打印结果


	}
}