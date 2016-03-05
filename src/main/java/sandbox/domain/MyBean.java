package sandbox.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MyBean {

    @GeneratedValue @Id Long id;
    @Column String string;
    @Column int number;

    private MyBean() {}

    public MyBean(String string, int number) {
        this.string = string;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public String getString() {
        return string;
    }

    public int getNumber() {
        return number;
    }
}
