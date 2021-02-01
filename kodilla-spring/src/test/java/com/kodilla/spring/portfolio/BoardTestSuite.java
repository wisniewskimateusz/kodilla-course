package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        BoardConfig boardConfig = context.getBean(BoardConfig.class);

        //When & Then
        boardConfig.getTaskListOne();
        boardConfig.getTaskListTwo();
        boardConfig.getTaskListThree();
    }
}