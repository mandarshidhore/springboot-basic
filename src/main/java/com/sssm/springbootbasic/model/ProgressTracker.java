package com.sssm.springbootbasic.model;

import org.springframework.stereotype.Component;

@Component
public class ProgressTracker {
	private String exercise;
	private String onerepmax;
	
	public ProgressTracker() {
		System.out.println("==== ProgressTracker instantiated ====");
	}

	public String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
	}

	public String getOnerepmax() {
		return onerepmax;
	}

	public void setOnerepmax(String onerepmax) {
		this.onerepmax = onerepmax;
	}
	
	public void showProgress() {
		System.out.println(">> show progress");
	}

}
