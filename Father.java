package com.hybridInheritance;

public class Father extends Grandfathre {
	
	public void f() {
		System.out.println("this is father property...");
	}
	
	public void FatherMain() {
		Father e = new Father();
		e.g();
		e.f();
	}
}
