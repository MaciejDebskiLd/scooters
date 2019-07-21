package com.scooter.objects;

import java.util.Objects;

public class Scooter {

    private int id;

    public Scooter(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) this.id = id;
        else {
            System.out.println("Id musi być większe od 0");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scooter scooter = (Scooter) o;
        return id == scooter.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "id=" + id +
                '}';
    }
}

