package com.scooter.data;

import com.scooter.utils.RentScooter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RentScooters {

    public List<RentScooter> rentScooters = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentScooters that = (RentScooters) o;
        return Objects.equals(rentScooters, that.rentScooters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentScooters);
    }

    @Override
    public String toString() {
        return "RentScooters{" +
                "rentScooters=" + rentScooters +
                '}';
    }
}
