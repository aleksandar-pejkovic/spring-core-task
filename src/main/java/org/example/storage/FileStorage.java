package org.example.storage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileStorage implements Storage {

    private final Map<String, List<?>> entityData = new HashMap<>();

    @Autowired
    private Data data;

    @Override
    public Map<String, List<?>> getAllData() {
        return new HashMap<>(entityData);
    }

    public FileStorage() {
        initData();
    }

    private void initData() {
        addEntities("trainees", data.getTrainees());
        addEntities("trainers", data.getTrainers());
        addEntities("trainings", data.getTrainings());
        addEntities("trainingTypes", data.getTrainingTypes());
        addEntities("users", data.getUsers());
    }

    private void addEntities(String entityType, List<?> entities) {
        entityData.put(entityType, entities);
    }
}
