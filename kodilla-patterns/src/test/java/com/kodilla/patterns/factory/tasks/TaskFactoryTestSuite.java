package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVE);
        //Then
        assertEquals("Driving car.", driving.executeTask());
        assertEquals("Driving Task 1", driving.getTaskName());
        assertEquals(false, driving.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINT);
        //Then
        assertEquals("Painting wall.", painting.executeTask());
        assertEquals("Painting Task 1", painting.getTaskName());
        assertEquals(false, painting.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("Shopping.", shopping.executeTask());
        assertEquals("Shopping Task 1", shopping.getTaskName());
        assertEquals(false, shopping.isTaskExecuted());
    }
}