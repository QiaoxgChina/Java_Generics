package com.qiaoxg.java.test;

/**
 * 泛型
 * 
 * @author admin
 * 
 */
public class GenericsUtils {

	private static GenericsUtils mGenericsUtils;

	public static GenericsUtils getInstanse() {
		if (mGenericsUtils == null) {
			mGenericsUtils = new GenericsUtils();
		}
		return mGenericsUtils;
	}

	/**
	 * 利用泛型打印出数组
	 * 
	 * @param array
	 */
	public <E> void printArray(E[] array) {
		for (E element : array) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}

	/**
	 * 用泛型去除三个元素中的最大的
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public <E extends Comparable<E>> E max(E x, E y, E z) {
		E max = x;
		if (y.compareTo(x) > 0) {
			max = y;
		}
		if (z.compareTo(y) > 0) {
			max = z;
		}
		return max;

	}

	/**
	 * 打印出string数组 如果这个方法跟他的泛型方法放在一起，在方法调用上会优先调用此方法
	 * 
	 * @param array
	 */
	// public void printArray(String[] array) {
	// for (String element : array) {
	// System.out.print(element + " ");
	// }
	// System.out.println(" ");
	// }
}
