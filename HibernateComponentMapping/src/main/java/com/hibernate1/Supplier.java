package com.hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {
@Id
public int suppilerID;
public String supplierName;
public String supplierAddress;
public int supplierPhone;
public int getSuppilerID() {
	return suppilerID;
}
public void setSuppilerID(int suppilerID) {
	this.suppilerID = suppilerID;
}
public String getSupplierName() {
	return supplierName;
}
public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
}
public String getSupplierAddress() {
	return supplierAddress;
}
public void setSupplierAddress(String supplierAddress) {
	this.supplierAddress = supplierAddress;
}
public int getSupplierPhone() {
	return supplierPhone;
}
public void setSupplierPhone(int supplierPhone) {
	this.supplierPhone = supplierPhone;
}

}
