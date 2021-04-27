package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testUpdate() {
        // Given
        TaskQueue taskQueue1 = new TaskQueue("Java Tasks");
        TaskQueue taskQueue2 = new TaskQueue("Spring Tasks");
        TaskQueue taskQueue3 = new TaskQueue("Hibernate Tasks");

        Mentor pablo = new Mentor("Pablo");
        Mentor michael = new Mentor("Michael");

        taskQueue1.registerObserver(pablo);
        taskQueue2.registerObserver(pablo);
        taskQueue3.registerObserver(michael);

        // When
        taskQueue1.addTask("Arrays");
        taskQueue1.addTask("Wrappers");
        taskQueue2.addTask("Spring Data");
        taskQueue3.addTask("ORM");
        taskQueue3.addTask("MySql");

        // Then
        assertEquals(3, pablo.getUpdateCount());
        assertEquals(2, michael.getUpdateCount());
    }
}