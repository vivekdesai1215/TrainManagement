package com.trainmanagement;
import java.util.*;
import com.trainmanagement.Bogie;

public class BogieSorter {
    public List<Bogie> sortByCapacity(List<Bogie> bogies) {
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));
        return bogies;
    }
}
