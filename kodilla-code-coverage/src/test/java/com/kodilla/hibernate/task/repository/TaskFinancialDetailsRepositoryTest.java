package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskFinancialDetailsRepositoryTest {
    @Autowired
    TaskFinancialDetailsRepository taskFinancialDetailsRepository;

    @Autowired
    TaskRepository taskRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate";


    @Test
    public void testFindByPaid() {
        //Given
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(115), false;
        taskFinancialDetailsRepository.save(taskFinancialDetails);
        int id = taskFinancialDetails.getId();

        //When
        List<TaskFinancialDetails> resultList = taskFinancialDetailsRepository.findByPaid(false);

        //Then
        Assert.assertEquals(1, resultList.size());

        //CleanUp
        taskFinancialDetailsRepository.deleteById(id);
    }

    @Test
    public void testTaskRepositorySaveWithFinancialDetails() {
        //Given
        Task task = new Task(DESCRIPTION, 30);
        TaskFinancialDetails financialDetails = new TaskFinancialDetails(new BigDecimal(120), false);
        task.setTaskFinancialDetails(financialDetails);

        //When
        taskRepository.save(task);
        int id = task.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        taskRepository.deleteById(id);
    }
}
