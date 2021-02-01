package com.kodilla.spring.portfolio;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void read() {
        System.out.println("TaskList: " + toDoList);
        System.out.println("TaskList: " + inProgressList);
        System.out.println("TaskList: " + doneList);
    }
}