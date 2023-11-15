package org.example.dao;

import java.util.HashMap;
import java.util.Map;

import org.example.model.Trainer;

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
}
