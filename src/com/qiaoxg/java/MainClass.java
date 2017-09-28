package com.qiaoxg.java;

import com.qiaoxg.java.bean.Box;
import com.qiaoxg.java.test.GenericsUtils;

/**
 * 注意类型参数只能代表引用型类型，不能是原始类型（像int,double,char的等）。
 * 
 * @author admin
 * 
 */
public class MainClass {

	private static GenericsUtils mGenericsUtils;

	public static void main(String[] agrs) {

		/**
		 *
		 */
		mGenericsUtils = GenericsUtils.getInstanse();
		// 泛型方法
		printArray();
		// 泛型方法
		compare();
		// 泛型类
		genericsClass();

	}

	private static void genericsClass() {
		Box<String, Integer> boxString = new Box<String, Integer>();
		boxString.add("泛型类1");
		boxString.addE(1248);

		Box<Integer, String> boxInteger = new Box<Integer, String>();
		boxInteger.add(1000);
		boxInteger.addE("泛型类2");
		
		System.out.printf("string是：%s and integer是：%d\n\n", boxString.get(),
				boxString.getE());

		System.out.printf("整形数值是：%d and String是： %s\n\n", boxInteger.get(),
				boxInteger.getE());
	}

	/**
	 * System.out.printf的用法： ‘%d’ 对应的是整形数值 ‘%s’ 对应的是String ‘%.1f’ 对应的是浮点类型的数据
	 */
	private static void compare() {
		System.out.printf("%d, %d and %d 中最大的数为 %d\n\n", 3, 8, 5,
				mGenericsUtils.max(3, 8, 5));

		System.out.printf("%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n", 6.6, 8.8, 7.7,
				mGenericsUtils.max(6.6, 8.8, 7.7));

		System.out.printf("%s, %s 和 %s 中最大的数为 %s\n\n", "pear", "apple",
				"orange", mGenericsUtils.max("pear", "apple", "orange"));

	}

	/**
	 * 
	 */
	private static void printArray() {

		String[] stringArray = new String[] { "Qiao", "Xiao", "Gang", "Zai",
				"BeiJing" };

		Character[] characterArray = new Character[] { 'Q', 'X', 'G', 'Z', 'B' };

		Integer[] intArray = new Integer[] { 1001, 1003, 1045, 23456, 2899 };// 注意这里不能是int

		Double[] doubleArray = new Double[] { 1.25, 3.47, 9.85, 12.6, 5.89 };// 注意这里不能是double

		mGenericsUtils.printArray(stringArray);

		mGenericsUtils.printArray(intArray);

		mGenericsUtils.printArray(doubleArray);

		mGenericsUtils.printArray(characterArray);

	}
}
