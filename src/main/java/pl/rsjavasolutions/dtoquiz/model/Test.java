package pl.rsjavasolutions.dtoquiz.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tests")
public class Test extends EntityBase {

    private String name;

    public Test() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
