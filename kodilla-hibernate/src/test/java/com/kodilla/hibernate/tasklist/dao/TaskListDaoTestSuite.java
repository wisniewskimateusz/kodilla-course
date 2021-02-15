package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Test2: ListName";
    private static final String DESCRIPTION = "Test2: Learn Hibernate";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);

        //Then
        int id = taskList.getId();
        assertEquals(LISTNAME, readTaskList.get(0).getListName());

        //CleanUp
        taskListDao.deleteById(id);
    }
}