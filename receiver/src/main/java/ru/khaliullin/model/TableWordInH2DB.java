package ru.khaliullin.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tableWords")
public class TableWordInH2DB {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "word", length = 64, nullable = false)
    private String word;


    public TableWordInH2DB(String word) {
        this.word = word;
    }

    public TableWordInH2DB() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
