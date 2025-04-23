package com.saint;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAutomationTest {

    @BeforeMethod
    public void setup() {
        System.out.println("BeforeMethod: Setup method");
    }

    @Test
    public void runTest() {
        System.out.println("Test: Running the actual test");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("AfterMethod: Cleanup method");
    }
}
