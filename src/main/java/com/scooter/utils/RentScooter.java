package com.scooter.utils;

import com.scooter.objects.Scooter;
import com.scooter.objects.User;


import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class RentScooter {

    private User user;
    private Scooter scooter;
    private LocalDateTime startDateTime, stopDateTime;
    private long duration;
    private Rates rates;
    private double cost;

    public RentScooter() {
    }

    public RentScooter(User user, Scooter scooter, LocalDateTime startDateTime) {
        this.user = user;
        this.scooter = scooter;
        this.startDateTime = startDateTime;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration() {
        this.duration = Duration.between(startDateTime, stopDateTime).toMinutes();
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



    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }

    public double getCost() {
        return cost;
    }

    public void setCost() {

        //stawka jest naliczana wg czasu rozpoczęcia wyporzyczenia, wg dnia tygodnia i godziny wypozyczenia.
        DayOfWeek dayOfWeek = startDateTime.getDayOfWeek();
        int startHour = startDateTime.getHour();
        if(duration > 120) duration = 120;

        if(dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY)) {rates = Rates.WEEKEND;}
        else if(startHour == 8 || startHour == 16 ) {rates = Rates.RUSH_HOUR;}
        else { rates = Rates.WORKDAY;}
        this.cost = rates.getPricePerMinute() * duration;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentScooter that = (RentScooter) o;
        return duration == that.duration &&
                Double.compare(that.cost, cost) == 0 &&
                Objects.equals(user, that.user) &&
                Objects.equals(scooter, that.scooter) &&
                Objects.equals(startDateTime, that.startDateTime) &&
                Objects.equals(stopDateTime, that.stopDateTime) &&
                rates == that.rates;
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, scooter, startDateTime, stopDateTime, duration, rates, cost);
    }

    @Override
    public String toString() {
        return "RentScooter{" +
                "user=" + user +
                ", scooter=" + scooter +
                ", startDateTime=" + startDateTime +
                ", stopDateTime=" + stopDateTime +
                ", duration=" + duration +
                ", cost=" + cost +
                '}';
    }
}
