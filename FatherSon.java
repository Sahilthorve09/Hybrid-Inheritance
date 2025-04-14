package com.hybridInheritance;

public class FatherSon extends Father {

	public void fs() {
		System.out.println("this is father's-son property...");
	}
	
	public void FatherSonMain() {
		FatherSon fs1 = new FatherSon();
		fs1.g();
		fs1.f();
		fs1.fs();
	}
	
}
