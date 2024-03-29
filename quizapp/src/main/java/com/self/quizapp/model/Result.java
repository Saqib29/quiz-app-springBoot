package com.self.quizapp.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "results")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private int totalCorrect = 0;

    public Result() {
    }

    public Result(int id, String username, int totalCorrect) {
        this.id = id;
        this.username = username;
        this.totalCorrect = totalCorrect;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", totalCorrect=" + totalCorrect +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getTotalCorrect() {
        return totalCorrect;
    }

    public void setTotalCorrect(int totalCorrect) {
        this.totalCorrect = totalCorrect;
    }
}
