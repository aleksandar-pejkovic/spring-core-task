package org.example.service;

import java.util.List;
import java.util.Map;

import org.example.dao.TrainerDAO;
import org.example.model.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {

    private final TrainerDAO trainerDAO;

    @Autowired
    public TrainerService(TrainerDAO trainerDAO) {
        this.trainerDAO = trainerDAO;
    }

    public void createTrainer(Trainer trainer) {
        trainerDAO.save(trainer);
    }

    public Trainer getTrainerById(long id) {
        return trainerDAO.findById(id);
    }

    public void updateTrainer(Trainer trainer) {
        trainerDAO.update(trainer);
    }

    public void deleteTrainer(long id) {
        trainerDAO.delete(id);
    }

    public List<Trainer> getAllTrainers() {
        return trainerDAO.getAllTrainers();
    }
}
