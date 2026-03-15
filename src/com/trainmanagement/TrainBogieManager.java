package com.trainmanagement;
import java.util.*;

public class TrainBogieManager {
    private Set<String> bogieIds = new HashSet<>();

    public void addBogie(String bogieId) {
        bogieIds.add(bogieId);
    }

    public Set<String> getBogies() {
        return bogieIds;
    }

    public boolean hasBogie(String bogieId) {
        return bogieIds.contains(bogieId);
    }
}
