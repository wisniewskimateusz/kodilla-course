package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private String name;
    private TaskQueue taskQueue;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
        //this.taskQueue = taskQueue;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(name + ": New tasks in queue " + taskQueue.getName() + "\n" +
                " (total: " + taskQueue.getMessages().size() + " tasks)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public TaskQueue getTaskQueue() {
        return taskQueue;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}