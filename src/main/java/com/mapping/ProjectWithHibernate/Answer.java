package com.mapping.ProjectWithHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
    private int answerId;
	
    private String answer;
    @ManyToOne
    private Question quetion;
    
	

	public Question getQuetion() {
		return quetion;
	}

	public void setQuetion(Question quetion) {
		this.quetion = quetion;
	}

	public Answer(int answerId, String answer, Question quetion) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.quetion = quetion;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answer=" + answer + "]";
	}

	

}
