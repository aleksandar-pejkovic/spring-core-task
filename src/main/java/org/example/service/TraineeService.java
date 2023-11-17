package org.example.service;

import java.util.Map;

import org.example.dao.TraineeDAO;
import org.example.model.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraineeService {

    private final TraineeDAO traineeDAO;

    @Autowired
    public TraineeService(TraineeDAO traineeDAO) {
        this.traineeDAO = traineeDAO;
    }

    public void createTrainee(Trainee trainee) {
        traineeDAO.save(trainee);
    }

    public Trainee getTraineeById(long id) {
        return traineeDAO.findById(id);
    }

    public void updateTrainee(Trainee trainee) {
        traineeDAO.update(trainee);
    }

    public void deleteTrainee(long id) {
        traineeDAO.delete(id);
    }

    public Map<Long, Trainee> getAllTrainees() {
        return traineeDAO.getAllTrainees();
    }
}
