package com.trainmanagement;
import java.util.*;

public class TrainLinkedHashSet {
    private Set<String> bogies = new LinkedHashSet<>();

    public void addBogie(String bogie) {
        bogies.add(bogie);
    }

    public Set<String> getBogies() {
        return bogies;
    }

    public boolean hasBogie(String bogie) {
        return bogies.contains(bogie);
    }
}
