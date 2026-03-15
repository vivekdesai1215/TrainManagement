package com.trainmanagement;
import java.util.*;
import java.util.stream.Collectors;
import com.trainmanagement.Bogie;

public class BogieFilter {
    public List<Bogie> filterByCapacity(List<Bogie> bogies, int minCapacity) {
        return bogies.stream()
                     .filter(b -> b.getCapacity() > minCapacity)
                     .collect(Collectors.toList());
    }
}
