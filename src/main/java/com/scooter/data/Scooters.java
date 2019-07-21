package com.scooter.data;

import com.scooter.objects.Scooter;

import java.util.List;
import java.util.Objects;

public class Scooters {

    public List<Scooter> scooters;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scooters scooters1 = (Scooters) o;
        return Objects.equals(scooters, scooters1.scooters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scooters);
    }

    @Override
    public String toString() {
        return "Scooters{" +
                "scooters=" + scooters +
                '}';
    }
}
