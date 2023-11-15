package org.example.dao;

import java.util.HashMap;
import java.util.Map;

import org.example.model.Training;

public class TrainingDAO {

    private final Map<Long, Training> trainingMap = new HashMap<>();
    private static long idCounter = 1;

    public void save(Training training) {
        long id = idCounter++;
        training.setId(id);
        trainingMap.put(id, training);
    }

    public Training findById(long id) {
        return trainingMap.get(id);
    }
}
