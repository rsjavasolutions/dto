package pl.rsjavasolutions.dtoquiz.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "answers")
public class Answer extends EntityBase {

    private String name;
    private Boolean correct;

    public Answer() {
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
