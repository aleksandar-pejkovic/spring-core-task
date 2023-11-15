package org.example.dao;

import java.util.HashMap;
import java.util.Map;

import org.example.model.Training;
import org.springframework.stereotype.Repository;

@Repository
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

    public void update(Training training) {
        // Implement update logic if needed
        trainingMap.put(training.getId(), training);
    }

    public void delete(long id) {
        // Implement delete logic if needed
        trainingMap.remove(id);
    }

    public Map<Long, Training> getAllTrainings() {
        return new HashMap<>(trainingMap);
    }
}
