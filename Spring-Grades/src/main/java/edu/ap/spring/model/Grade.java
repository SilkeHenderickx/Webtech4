package edu.ap.spring.model;


import com.sun.javafx.beans.IDProperty;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
@RedisHash("Grade")
public class Grade implements Serializable {


    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName, grade);
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private Integer grade;

    public Grade() {
    }

    public Grade(String firstName, String lastName, Integer grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String nameToAllcaps(String name){

        return name.toUpperCase();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade1 = (Grade) o;
        return Objects.equals(id, grade1.id) &&
                Objects.equals(firstName, grade1.firstName) &&
                Objects.equals(lastName, grade1.lastName) &&
                Objects.equals(grade, grade1.grade);
    }
}
