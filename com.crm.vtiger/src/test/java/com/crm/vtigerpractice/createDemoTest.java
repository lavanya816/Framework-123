package com.crm.vtigerpractice;

import org.testng.annotations.Test;

public class createDemoTest {
@Test(groups="Regressiontest")
public void createOrg() {
	System.out.println("org created");
}
@Test(groups="Regressiontest")
public void modifyOrg() {
	System.out.println("Modify org");
}
}
