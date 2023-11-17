package org.example.service;

import java.util.List;

import org.example.dao.TrainingDAO;
import org.example.model.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {

    private final TrainingDAO trainingDAO;

    @Autowired
    public TrainingService(TrainingDAO trainingDAO) {
        this.trainingDAO = trainingDAO;
    }

    public void createTraining(Training training) {
        trainingDAO.save(training);
    }

    public Training getTrainingById(long id) {
        return trainingDAO.findById(id);
    }

    public void updateTraining(Training training) {
        trainingDAO.update(training);
    }

    public void deleteTraining(long id) {
        trainingDAO.delete(id);
    }

    public List<Training> getAllTrainings() {
        return trainingDAO.getAllTrainings();
    }
}
