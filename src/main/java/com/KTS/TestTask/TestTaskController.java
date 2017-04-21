package com.KTS.TestTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/testTasks")
public class TestTaskController {

    @Autowired
    private TestTaskDao testTaskDao;

    @GetMapping
    public Iterable<TestTask> getAll() {
        return testTaskDao.findAll();
    }

    @GetMapping("{userId}")
    public TestTask getOne(@PathVariable Integer userId) {
        return testTaskDao.findOne(userId);
    }

    @PostMapping
    public void getOne(@RequestBody
                       @Valid
                               TestTask user
    )

    {
        testTaskDao.save(user);
    }
}
