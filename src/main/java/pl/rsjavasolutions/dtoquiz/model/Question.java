package pl.rsjavasolutions.dtoquiz.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "questions")
public class Question extends EntityBase {

    private String content;
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answerList = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "test_id")
    @JsonIgnore
    private Test test;

    public Question() {
    }

    public Question(String content) {
        this.content = content;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public void addAnswer(Answer answer){
        answerList.add(answer);
        answer.setQuestion(this);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
