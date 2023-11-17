package org.example.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.example.model.Training;
import org.example.storage.FileStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TrainingDAO {

    private final FileStorage fileStorage;

    private final Map<Long, Training> trainingMap = new HashMap<>();

    private static long idCounter = 1;

    @Autowired
    public TrainingDAO(FileStorage fileStorage) {
        this.fileStorage = fileStorage;
    }

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

    public List<Training> getAllTrainings() {
        return (List<Training>) fileStorage.getEntityData().get("trainings");
    }
}
