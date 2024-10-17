package hu.unideb.inf.sfm;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
public class Animal {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private GenderType gender;
    @ManyToOne
    @JoinColumn(name = "owner_zooxx")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Zoo ownerZoo;

    public Zoo getOwnerZoo() {
        return ownerZoo;
    }

    public void setOwnerZoo(Zoo ownerZoo) {
        this.ownerZoo = ownerZoo;
    }

    public enum GenderType{
        MALE,FEMALE,UNKNOWN;
    }

    public Animal(String name, int age, GenderType gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }
}
