package com.example.domain;

public class Car {

    private Integer id;

    private String name;

    private Integer number_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber_id() {
        return number_id;
    }

    public void setNumber_id(Integer number_id) {
        this.number_id = number_id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number_id=" + number_id +
                '}';
    }
}
