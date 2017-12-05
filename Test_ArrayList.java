//这是一个list测试和list遍历测试程序

import java.util.*;

public class Test_ArrayList{
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();

		list.add("Helllo");
		list.add("World");

		/*
		方法一 迭代器
		Iterator it1 = list.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		*/
		/*
		方法二 自带遍历
		for(String x : list){
			System.out.println(x);
		}\
		*/


		//方法三 for循环 自带size()函数做条件遍历
		for(int i = 0;i < list.size();i++){
			System.out.println(list.get(i));
		}
	}


}