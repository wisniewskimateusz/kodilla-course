package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVE = "DRIVE";
    public static final String PAINT = "PAINT";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVE:
                return new DrivingTask("Driving Task 1", "Forest", "Bicycle");
            case PAINT:
                return new PaintingTask("Painting Task 1", "White", 3.0);
            case SHOPPING:
                return new ShoppingTask("Shopping Task 1", "T-Shirt", 2.5);
            default:
                return null;
        }
    }
}