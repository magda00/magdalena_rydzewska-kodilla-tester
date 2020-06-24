package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTest {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Description No.1";
    private static final String LIST_NAME = "No.1";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LIST_NAME, DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskLists = taskListRepository.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTaskLists.size());
        Assert.assertEquals("No.1", readTaskLists.get(0).getListName());
        Assert.assertEquals("Description No.1", readTaskLists.get(0).getDescription());

        //CleanUp
        int id = readTaskLists.get(0).getId();
        taskListRepository.deleteById(id);
        //or taskListRepository.deleteAll();
    }
}
