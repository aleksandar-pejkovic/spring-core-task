package org.example.dao;

import java.util.HashMap;
import java.util.Map;

import org.example.model.Trainee;
import org.springframework.stereotype.Repository;

@Repository
public class TraineeDAO {

    private final Map<Long, Trainee> traineeMap = new HashMap<>();
    private static long idCounter = 1;

    public void save(Trainee trainee) {
        long id = idCounter++;
        trainee.setId(id);
        traineeMap.put(id, trainee);
    }

    public Trainee findById(long id) {
        return traineeMap.get(id);
    }

    public void update(Trainee trainee) {
        // Implement update logic if needed
        traineeMap.put(trainee.getId(), trainee);
    }

    public void delete(long id) {
        // Implement delete logic if needed
        traineeMap.remove(id);
    }

    public Map<Long, Trainee> getAllTrainees() {
        return new HashMap<>(traineeMap);
    }
}
