package com.kodilla.testing.shape;

import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.Assert;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@DisplayName("Testing")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Add and Remove Tests")
    class AddAndRemoveTests {
        @DisplayName("Add Figure Test")
        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(1, 2);
            //Then
            shapeCollector.addFigure(triangle);
            //When
            assertEquals(1, shapeCollector.getShapeList().size());
        }

        @DisplayName("Remove Figure Test")
        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(2);
            shapeCollector.addFigure(circle);
            //When
            boolean result = shapeCollector.removeFigure(circle);
            //Then
            Assert.assertTrue(result);
            Assert.assertEquals(0, shapeCollector.getShapeList().size());
        }
    }

    @Nested
    @DisplayName("Get and Show Testes")
    class GetAndShowTests {
        @DisplayName("Get Figure Test")
        @Test
        public void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(2);
            shapeCollector.addFigure(square);
            //When
            Shape retrieveSquare = shapeCollector.getFigure(0);
            //Then
            Assert.assertEquals(square, retrieveSquare);
        }

        @DisplayName("Show Figure Test")
        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(2);
            shapeCollector.addFigure(square);
            Triangle triangle = new Triangle(2, 4);
            shapeCollector.addFigure(triangle);
            Circle circle = new Circle(1);
            shapeCollector.addFigure(circle);
            ArrayList<Shape> figureList = shapeCollector.getShapeList();
            //When
            ArrayList<Shape> showFigureList = shapeCollector.showFigures();
            //Then
            Assert.assertEquals(figureList, showFigureList);
        }
    }
}





