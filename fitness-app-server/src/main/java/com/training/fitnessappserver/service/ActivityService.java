package com.training.fitnessappserver.service;

import com.training.fitnessappserver.entity.Activity;

import java.time.LocalDate;
import java.util.List;

public interface ActivityService {
    List<Activity> getActivitiesByDateAndUserId(String userId, LocalDate date);
}
