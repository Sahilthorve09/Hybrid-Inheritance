package com.hybridInheritance;

public class Uncle extends Grandfathre {

	public void u() {
		System.out.println("this is uncle property...");
	}
	
	public void  UncleMain(){
		Uncle u1 = new Uncle();
		u1.g();
		u1.u();
	}
	
}
