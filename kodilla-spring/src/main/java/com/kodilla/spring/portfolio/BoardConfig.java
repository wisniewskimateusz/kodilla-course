package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    TaskList toDoList1;

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList1;

    @Autowired
    TaskList doneList;

    @Bean
    public Board board() {
        return new Board(toDoList1, inProgressList1, doneList);
    }

    @Bean(name = "toDoList")
    public TaskList getTaskListOne() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList getTaskListTwo() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    public TaskList getTaskListThree() {
        return new TaskList();
    }
}