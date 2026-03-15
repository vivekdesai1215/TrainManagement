package com.main;
import java.util.*;

public class Train {
    private List<String> bogies = new ArrayList<>();

    public void addBogie(String bogie) {
        bogies.add(bogie);
    }

    public void removeBogie(String bogie) {
        bogies.remove(bogie);
    }

    public boolean hasBogie(String bogie) {
        return bogies.contains(bogie);
    }

    public List<String> getBogies() {
        return bogies;
    }
}
