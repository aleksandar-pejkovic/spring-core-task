package org.example.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.example.model.Trainee;
import org.example.storage.FileStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TraineeDAO {

    private final FileStorage fileStorage;

    private final Map<Long, Trainee> traineeMap = new HashMap<>();

    private static long idCounter = 1;

    @Autowired
    public TraineeDAO(FileStorage fileStorage) {
        this.fileStorage = fileStorage;
    }

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

    public List<Trainee> getAllTrainees() {
        return (List<Trainee>) fileStorage.getEntityData().get("trainees");
    }
}
