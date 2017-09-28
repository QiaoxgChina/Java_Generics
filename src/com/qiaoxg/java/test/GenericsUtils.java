package com.qiaoxg.java.test;

/**
 * ����
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
	 * ���÷��ʹ�ӡ������
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
	 * �÷���ȥ������Ԫ���е�����
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
	 * ��ӡ��string���� ���������������ķ��ͷ�������һ���ڷ��������ϻ����ȵ��ô˷���
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
