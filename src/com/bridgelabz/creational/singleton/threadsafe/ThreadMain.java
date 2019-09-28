package com.bridgelabz.creational.singleton.threadsafe;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadSafeSingleton e1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton e2 = ThreadSafeSingleton.getInstance();
		//double locking
		ThreadSafeSingleton e3 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		ThreadSafeSingleton e4 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e3);
		System.out.println(e4);

	}

}
