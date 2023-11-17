package org.example.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.example.model.Trainer;
import org.example.storage.FileStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TrainerDAO {

    private final FileStorage fileStorage;

    private final Map<Long, Trainer> trainerMap = new HashMap<>();

    private static long idCounter = 1;

    @Autowired
    public TrainerDAO(FileStorage fileStorage) {
        this.fileStorage = fileStorage;
    }

    public void save(Trainer trainer) {
        long id = idCounter++;
        trainer.setId(id);
        trainerMap.put(id, trainer);
    }

    public Trainer findById(long id) {
        return trainerMap.get(id);
    }

    public void update(Trainer trainer) {
        // Implement update logic if needed
        trainerMap.put(trainer.getId(), trainer);
    }

    public void delete(long id) {
        // Implement delete logic if needed
        trainerMap.remove(id);
    }

    public List<Trainer> getAllTrainers() {
        return (List<Trainer>) fileStorage.getEntityData().get("trainers");
    }
}
