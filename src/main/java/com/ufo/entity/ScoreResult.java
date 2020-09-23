package com.ufo.entity;

public class ScoreResult {
    public int value;
    public String name;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScoreResult(int value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ScoreResult{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
