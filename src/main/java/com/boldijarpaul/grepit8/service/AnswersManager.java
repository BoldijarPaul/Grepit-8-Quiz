package com.boldijarpaul.grepit8.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.boldijarpaul.grepit8.entities.QuestionResponse;

public class AnswersManager {
	/* clasa asta va contine o instanta cu toate raspunsurile */
	private static List<QuestionResponse> answers = new ArrayList<QuestionResponse>();

	/* this method will add a new answer to our list */
	public void addAnswer(int questionId, int answerId, String answer,
			String fullName) {
		QuestionResponse questionResponse = new QuestionResponse();
		questionResponse.setAnswer(answer);
		questionResponse.setCreatedDate(new Timestamp(Calendar.getInstance()
				.getTimeInMillis()));
		questionResponse.setAnswerId(answerId);
		questionResponse.setFullName(fullName);
		questionResponse.setQuestionId(questionId);
		answers.add(questionResponse);
	}

	/**
	 * 
	 * @param questionId the id of the question we want to get the answers
	 * @return a list of answers
	 */
	public List<QuestionResponse> getQuestionAnswers(int questionId) {
		List<QuestionResponse> questionAnswers = new ArrayList<QuestionResponse>();
		for (QuestionResponse questionResponse : answers) {
			if (questionResponse.getQuestionId() == questionId) {
				/* this answer belong to te question we want */
				questionAnswers.add(questionResponse);
			}
		}
		return questionAnswers;
	}
}
