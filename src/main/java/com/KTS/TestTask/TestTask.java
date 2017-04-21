package com.KTS.TestTask;

import com.KTS.Answer.Answer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
public class TestTask {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String testTaskPicName;

    @OneToMany(mappedBy="testTask")
    private Set<Answer> answers = new HashSet<Answer>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTestTaskPicName() {
        return testTaskPicName;
    }

    public void setTestTaskPicName(String testTaskPicName) {
        this.testTaskPicName = testTaskPicName;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }
}
