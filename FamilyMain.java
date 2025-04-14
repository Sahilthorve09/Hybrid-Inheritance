package com.hybridInheritance;

public class FamilyMain {

	public static void main(String[] args) {
		Father data1 = new Father();
		System.out.println("-----Father Details-----");
		data1.FatherMain();
		System.out.println();
		
		Aunt data2 = new Aunt();
		System.out.println("-----Aunt Details-----");
		data2.AuntMain();
		System.out.println();		
		
		Uncle data3 = new Uncle();
		System.out.println("-----Uncle Details-----");
		data3.UncleMain();
		System.out.println();
		
		FatherSon data4 = new FatherSon();
		System.out.println("-----Father's Son Details-----");
		data4.FatherSonMain();
		System.out.println();
		
		AuntSon data5 = new AuntSon();
		System.out.println("-----Aunt's Son Details-----");
		data5.AuntSonMain();
		System.out.println();
		
		AuntDaughter data6 = new AuntDaughter();
		System.out.println("-----Aunt's Daughter Details-----");
		data6.AuntDaughterMain();
		System.out.println();
	}
	
}
