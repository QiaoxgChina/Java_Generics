package com.qiaoxg.java;

import com.qiaoxg.java.bean.Box;
import com.qiaoxg.java.test.GenericsUtils;

/**
 * ע�����Ͳ���ֻ�ܴ������������ͣ�������ԭʼ���ͣ���int,double,char�ĵȣ���
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
		// ���ͷ���
		printArray();
		// ���ͷ���
		compare();
		// ������
		genericsClass();

	}

	private static void genericsClass() {
		Box<String, Integer> boxString = new Box<String, Integer>();
		boxString.add("������1");
		boxString.addE(1248);

		Box<Integer, String> boxInteger = new Box<Integer, String>();
		boxInteger.add(1000);
		boxInteger.addE("������2");
		
		System.out.printf("string�ǣ�%s and integer�ǣ�%d\n\n", boxString.get(),
				boxString.getE());

		System.out.printf("������ֵ�ǣ�%d and String�ǣ� %s\n\n", boxInteger.get(),
				boxInteger.getE());
	}

	/**
	 * System.out.printf���÷��� ��%d�� ��Ӧ����������ֵ ��%s�� ��Ӧ����String ��%.1f�� ��Ӧ���Ǹ������͵�����
	 */
	private static void compare() {
		System.out.printf("%d, %d and %d ��������Ϊ %d\n\n", 3, 8, 5,
				mGenericsUtils.max(3, 8, 5));

		System.out.printf("%.1f, %.1f �� %.1f ��������Ϊ %.1f\n\n", 6.6, 8.8, 7.7,
				mGenericsUtils.max(6.6, 8.8, 7.7));

		System.out.printf("%s, %s �� %s ��������Ϊ %s\n\n", "pear", "apple",
				"orange", mGenericsUtils.max("pear", "apple", "orange"));

	}

	/**
	 * 
	 */
	private static void printArray() {

		String[] stringArray = new String[] { "Qiao", "Xiao", "Gang", "Zai",
				"BeiJing" };

		Character[] characterArray = new Character[] { 'Q', 'X', 'G', 'Z', 'B' };

		Integer[] intArray = new Integer[] { 1001, 1003, 1045, 23456, 2899 };// ע�����ﲻ����int

		Double[] doubleArray = new Double[] { 1.25, 3.47, 9.85, 12.6, 5.89 };// ע�����ﲻ����double

		mGenericsUtils.printArray(stringArray);

		mGenericsUtils.printArray(intArray);

		mGenericsUtils.printArray(doubleArray);

		mGenericsUtils.printArray(characterArray);

	}
}
