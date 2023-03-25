package com;

public class PerformanceSbTest {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		StringBuffer sb = new StringBuffer("java");

		for (int i = 0; i < 10000; i++) {

			sb.append("class");
		}

		System.out.println("String Buffer Time is:" + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();

		StringBuilder sb2 = new StringBuilder("java");

		for (int i = 0; i < 10000; i++) {
			sb2.append("class");

		}

		System.out.println("String Builder Time is:" + (System.currentTimeMillis() - startTime) + "ms");
	}

}
