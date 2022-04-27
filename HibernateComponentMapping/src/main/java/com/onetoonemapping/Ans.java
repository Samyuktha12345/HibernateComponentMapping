package com.onetoonemapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ans {
@Id
private int A_id;
private String A_sol;
public int getA_id() {
	return A_id;
}
public void setA_id(int a_id) {
	A_id = a_id;
}
public String getA_sol() {
	return A_sol;
}
public void setA_sol(String a_sol) {
	A_sol = a_sol;
}


}
