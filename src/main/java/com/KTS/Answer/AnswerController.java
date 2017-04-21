package com.KTS.Answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/answers")
public class AnswerController {
    
    @Autowired
    private AnswerDao answerDao;

    public Iterable<Answer> getAll() {
        return answerDao.findAll();
    }

    @GetMapping("{userId}")
    public Answer getOne(@PathVariable Integer userId) {
        return answerDao.findOne(userId);
    }
    
}
