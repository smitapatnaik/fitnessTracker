package com.patnaik.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.patnaik.model.Activity;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {
	
	/* (non-Javadoc)
	 * @see com.patnaik.service.ExerciseService#findAllActivities()
	 */
	@Override
	public List<Activity> findAllActivities() {
		List<Activity> listOfActivities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDescription("Run");
		listOfActivities.add(run);
		
		Activity bike = new Activity();
		bike.setDescription("Bike");
		listOfActivities.add(bike);
		
		Activity swim = new Activity();
		swim.setDescription("Swim");
		listOfActivities.add(swim);
		
		return listOfActivities;
	}
}
