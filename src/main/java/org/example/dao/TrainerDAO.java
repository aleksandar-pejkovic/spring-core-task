package org.example.dao;

import java.util.HashMap;
import java.util.Map;

import org.example.model.Trainer;
import org.springframework.stereotype.Repository;

@Repository
public class TrainerDAO {

    private final Map<Long, Trainer> trainerMap = new HashMap<>();
    private static long idCounter = 1;

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

    public Map<Long, Trainer> getAllTrainers() {
        return new HashMap<>(trainerMap);
    }
}
