package com.kodilla.testing.collections.shape;

import com.kodilla.testing.shape.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: Shape Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for ShapeCollector")
    class TestShapeCollector {
        @Test
        void testAddFigure() {
            //Given
            Square square = new Square(2, 3);
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(square);
            //Then
            assertEquals(square, shapeCollector.getFigure(0));
        }

        @Test
        void testGetFigure() {
            //Given
            Square square = new Square(2, 2);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(square);
            //When
            Shape retrievedFigure;
            retrievedFigure = shapeCollector.getFigure(0);
            //Then
            assertEquals(square, retrievedFigure);
        }

        @Test
        void testRemoveFigure() {
            //Given
            Square square = new Square(2, 2);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(square);
            //When
            boolean result = shapeCollector.removeFigure(square);
            //Then
            assertTrue(result);
        }
    }
}
