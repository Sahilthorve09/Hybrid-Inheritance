package com.hybridInheritance;

public class AuntDaughter extends Aunt  {

	public void ad() {
		System.out.println("this is Aunt's-doughter property...");
	
	}
	
	public void AuntDaughterMain() {
		AuntDaughter ad1 = new AuntDaughter();
		ad1.g();
		ad1.a();
		ad1.ad();
	}
}
