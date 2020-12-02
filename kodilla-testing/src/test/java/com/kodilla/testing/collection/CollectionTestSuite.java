package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @DisplayName("When create empty list")
    void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> numberList = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing " + numberList);
        //Then
        Assert.assertEquals(emptyList,numberList);

    }

    @DisplayName("When create normal list")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> odd = Arrays.asList(2,6,8,16,28,312,888);

        //When
        List<Integer> numberList = OddNumbersExterminator.exterminate(odd);
        System.out.println("Testing " + numberList);
        //Then
        Assert.assertEquals(odd,numberList);

    }

}