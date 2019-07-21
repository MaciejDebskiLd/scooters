package com.scooter.objects;

import java.util.Objects;

public class User {

    //To jest nick uzytkownika
    private String nick;

    public User() {
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nick, user.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick);
    }

    @Override
    public String toString() {
        return "User{" +
                "nick='" + nick + '\'' +
                '}';
    }
}
