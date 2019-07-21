package com.scooter.utils;

import com.scooter.objects.Scooter;
import com.scooter.objects.User;


import java.time.LocalDateTime;
import java.time.Period;
import java.util.Objects;

public class RentScooter {

    private User user;
    private Scooter scooter;
    private LocalDateTime startDateTime, stopDateTime;
    private Period period;
    private Rates rates;

    public RentScooter() {
    }

    public RentScooter(User user, Scooter scooter, LocalDateTime startDateTime) {
        this.user = user;
        this.scooter = scooter;
        this.startDateTime = startDateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Scooter getScooter() {
        return scooter;
    }

    public void setScooter(Scooter scooter) {
        this.scooter = scooter;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getStopDateTime() {
        return stopDateTime;
    }

    public void setStopDateTime(LocalDateTime stopDateTime) {
        this.stopDateTime = stopDateTime;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentScooter that = (RentScooter) o;
        return Objects.equals(user, that.user) &&
                Objects.equals(scooter, that.scooter) &&
                Objects.equals(startDateTime, that.startDateTime) &&
                Objects.equals(stopDateTime, that.stopDateTime) &&
                Objects.equals(period, that.period) &&
                rates == that.rates;
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, scooter, startDateTime, stopDateTime, period, rates);
    }

    @Override
    public String toString() {
        return "RentScooter{" +
                "user=" + user +
                ", scooter=" + scooter +
                ", startDateTime=" + startDateTime +
                ", stopDateTime=" + stopDateTime +
                ", period=" + period +
                ", rates=" + rates +
                '}';
    }
}
