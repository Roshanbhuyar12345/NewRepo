package com.mapping.ProjectWithHibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {

	@Id
	private int quetionId;

	private String quetion;
	@OneToMany
	private List<Answer> answer;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
       
	public Question(int quetionId, String quetion, List<Answer> answer) {
		super();
		this.quetionId = quetionId;
		this.quetion = quetion;
		this.answer = answer;
	}

	public int getQuetionId() {
		return quetionId;
	}

	public void setQuetionId(int quetionId) {
		this.quetionId = quetionId;
	}

	public String getQuetion() {
		return quetion;
	}

	public void setQuetion(String quetion) {
		this.quetion = quetion;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> list) {
		this.answer = list;
	}

	@Override
	public String toString() {
		return "Question [quetionId=" + quetionId + ", quetion=" + quetion + ", answer=" + answer + "]";
	}

}
