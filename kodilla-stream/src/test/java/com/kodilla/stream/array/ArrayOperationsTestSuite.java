package com.kodilla.stream.array;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {


    @Test
    void testGetAverage() {
        //Given

        int numbers[] = {2,3,4,6,7,8,99,0,0,8,6,54,14,55,33,23,25,66,44,23};

        double expectedAverage = 24;

        //When


        double average = ArrayOperations.getAverage(numbers);

        //Then

        assertEquals(average, expectedAverage, 0);


    }



}
