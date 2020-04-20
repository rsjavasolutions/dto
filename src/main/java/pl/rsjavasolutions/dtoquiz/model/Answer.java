package pl.rsjavasolutions.dtoquiz.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answers")
public class Answer extends EntityBase {

    private String name;
    private Boolean correct;
    @ManyToOne
    @JoinColumn(name = "question_id")
    @JsonIgnore
    private Question question;

    public Answer() {
    }

    public Answer(String name, Boolean correct) {
        this.name = name;
        this.correct = correct;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }
}
