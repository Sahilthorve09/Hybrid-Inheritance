package com.hybridInheritance;

public class AuntSon extends Aunt {

	public void as() {
		System.out.println("this is Aunt's-Son property...");
	}
	
	public void AuntSonMain() {
		AuntSon as1 = new AuntSon();
		as1.g();
		as1.a();
		as1.as();
	}
	
}
