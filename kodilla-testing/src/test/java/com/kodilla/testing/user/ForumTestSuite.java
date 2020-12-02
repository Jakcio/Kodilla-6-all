package com.kodilla.testing.user;


import org.junit.jupiter.api.*;
import user.SimpleUser;


public class ForumTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public  static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("When created SimpleUser with name")
    @Test
    public void testCaseUsername() {

        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        String expectedResult = "theForumUser";
        //When
        String result = simpleUser.getUsername();

        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName("when create SimpleUser with realName")
    @Test
    void testCaseRealName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals("John Smith", result);
    }


}
