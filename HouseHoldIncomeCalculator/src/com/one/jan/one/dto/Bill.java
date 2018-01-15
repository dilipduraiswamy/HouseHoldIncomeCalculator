/**
 * 
 */
package com.one.jan.one.dto;

/**
 * @author dilip.duraiswamy
 *
 */
public class Bill {

	private String totalCost;
	private String message;
	/**
	 * @return the totalCost
	 */
	public String getTotalCost() {
		return totalCost;
	}
	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @param totalCost
	 * @param message
	 */
	public Bill(String totalCost, String message) {
		super();
		this.totalCost = totalCost;
		this.message = message;
	}
	/**
	 * 
	 */
	public Bill() {
		super();
	}
	
}
