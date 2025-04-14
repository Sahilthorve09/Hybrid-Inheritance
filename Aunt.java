package com.hybridInheritance;

public class Aunt extends Grandfathre {
	
	public void a() {
		System.out.println("this is Aunt property...");
	}
	
	public void AuntMain() {
		Aunt a1 = new Aunt();
		a1.g();
		a1.a();
	}
	
}
