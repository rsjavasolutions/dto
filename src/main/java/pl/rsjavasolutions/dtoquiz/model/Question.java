package pl.rsjavasolutions.dtoquiz.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "questions")
public class Question extends EntityBase {

    private String content;
    private List<Answer> answerList = new ArrayList<>();

    public Question() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
