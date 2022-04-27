package com.onetomanymapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
@Id
private int id;
private String solution;
@ManyToOne
private Question que;
public Answer(int id, String solution, Question que) {
	super();
	this.id = id;
	this.solution = solution;
	this.que = que;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSolution() {
	return solution;
}
public void setSolution(String solution) {
	this.solution = solution;
}
public Question getQue() {
	return que;
}
public void setQue(Question que) {
	this.que = que;
}
public Answer() {
	super();
	// TODO Auto-generated constructor stub
}


}
