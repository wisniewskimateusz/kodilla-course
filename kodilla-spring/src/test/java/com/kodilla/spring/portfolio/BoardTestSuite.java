package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        BoardConfig boardConfig = context.getBean(BoardConfig.class);

        //When
        boardConfig.getTaskListOne().getTasks().add("List One: Task 1");
        boardConfig.getTaskListTwo().getTasks().add("List Two: Task 1");
        boardConfig.getTaskListThree().getTasks().add("List Three: Task 1");

        //Then
        System.out.println(boardConfig.getTaskListOne().getTasks());
        System.out.println(boardConfig.getTaskListTwo().getTasks());
        System.out.println(boardConfig.getTaskListThree().getTasks());

        assertEquals(1, boardConfig.getTaskListOne().getTasks().size());
        assertEquals(1, boardConfig.getTaskListTwo().getTasks().size());
        assertEquals(1, boardConfig.getTaskListThree().getTasks().size());
    }
}