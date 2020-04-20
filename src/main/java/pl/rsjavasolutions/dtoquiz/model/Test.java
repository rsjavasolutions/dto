package pl.rsjavasolutions.dtoquiz.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tests")
public class Test extends EntityBase {

    private String name;
    @OneToMany(mappedBy = "test")
    private List<Question> questionList = new ArrayList<>();

    public Test() {
    }

    public void addQuestion(Question question){
        questionList.add(question);
        question.setTest(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
