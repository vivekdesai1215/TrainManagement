package com.trainmanagement;
import java.util.*;

public class TrainLinkedList {
    private LinkedList<String> bogies = new LinkedList<>();

    public void addBogie(String bogie) {
        bogies.add(bogie);
    }

    public void insertBogieAt(int index, String bogie) {
        bogies.add(index, bogie);
    }

    public void removeFirstBogie() {
        bogies.removeFirst();
    }

    public void removeLastBogie() {
        bogies.removeLast();
    }

    public List<String> getBogies() {
        return bogies;
    }
}
