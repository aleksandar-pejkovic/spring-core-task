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
}
