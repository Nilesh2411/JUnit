package org.com.junit;

public class Math {
	Object ob = new Object();
	public static int square(int i) {
		int j = i * i;
		return j;

	}

	public static int sum(int i, int j){
		return i+j;
	}

	public Object createObject(String s) {
		
		String a = "null";
		if (a.equals(s)) {
			return null;
		} else {
			return ob;
		}

	}

	
	
	
}
