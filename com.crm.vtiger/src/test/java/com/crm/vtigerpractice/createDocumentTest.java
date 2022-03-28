package com.crm.vtigerpractice;

import org.testng.annotations.Test;

public class createDocumentTest {
	@Test(groups="Regressiontest")
	public void createDocument() {
		System.out.println("Document created");
		System.out.println("Demo");
		System.out.println("Document modified");
		System.out.println("document verifeid");
	}
	@Test
	public void modifyDocument() {
		System.out.println("Modify Document");
	}
}
