package com.KTS.Answer;

import com.KTS.TestTask.TestTask;

import javax.persistence.*;

@Entity
public class Answer {
    @Id
    @GeneratedValue
    private Integer id;

    private String answerPicName;

    @ManyToOne(fetch= FetchType.LAZY)
    private TestTask testTask;

    private Boolean AnswerCorrect;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnswerPicName() {
        return answerPicName;
    }

    public void setAnswerPicName(String answerPicName) {
        this.answerPicName = answerPicName;
    }

    public TestTask getTestTask() {
        return testTask;
    }

    public void setTestTask(TestTask testTask) {
        this.testTask = testTask;
    }

    public Boolean getAnswerCorrect() {
        return AnswerCorrect;
    }

    public void setAnswerCorrect(Boolean answerCorrect) {
        AnswerCorrect = answerCorrect;
    }
}
