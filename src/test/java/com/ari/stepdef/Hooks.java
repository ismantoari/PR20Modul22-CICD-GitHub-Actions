package com.ari.stepdef;

import io.cucumber.java.*;

public class Hooks {

    @BeforeAll
    public static void setUp(){
        System.out.println("Before All - API TEST - ");
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("AfterAll - API TEST - ");
    }

    @Before
    public void beforeTest(){
        System.out.println("BeforeTest - API TEST - ");
    }

    @After
    public void afterTest(){
        System.out.println("AfterTest - API TEST - ");
    }
}
