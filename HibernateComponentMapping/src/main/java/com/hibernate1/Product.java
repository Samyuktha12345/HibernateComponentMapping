package com.hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Product {
@Id
private int prodid;
private String prodname;
private float price;
@OneToOne
@JoinColumn(name="supplierid")
private Supplier supplierid;
public int getProdid() {
	return prodid;
}
public void setProdid(int prodid) {
	this.prodid = prodid;
}
public String getProdname() {
	return prodname;
}
public void setProdname(String prodname) {
	this.prodname = prodname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Supplier getSupplierid() {
	return supplierid;
}
public void setSupplierid(Supplier supplierid) {
	this.supplierid = supplierid;
}

}
