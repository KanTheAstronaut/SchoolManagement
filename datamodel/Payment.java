package datamodel;

import java.util.Date;

public class Payment {
	
	private String payId;
	private float payAmount;
	private Date date;
	
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public float getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(float payAmount) {
		this.payAmount = payAmount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
