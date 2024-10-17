package hu.unideb.inf.sfm;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Zoo {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    public Zoo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
