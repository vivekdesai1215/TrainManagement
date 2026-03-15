package com.trainmanagement;
import java.util.*;

public class TrainCapacityMap {
    private Map<String, Integer> bogieCapacity = new HashMap<>();

    public void addBogie(String bogie, int capacity) {
        bogieCapacity.put(bogie, capacity);
    }

    public Integer getCapacity(String bogie) {
        return bogieCapacity.get(bogie);
    }

    public boolean hasBogie(String bogie) {
        return bogieCapacity.containsKey(bogie);
    }

    public Map<String, Integer> getAllBogies() {
        return bogieCapacity;
    }
}
