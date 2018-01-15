/**
 * 
 */
package com.one.jan.one.dto;

/**
 * @author dilip.duraiswamy
 *
 */
public class Items {

	private String itemName;
	private float itemCost;
	private int quantity;

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName
	 *            the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return the itemCost
	 */
	public float getItemCost() {
		return itemCost;
	}

	/**
	 * @param itemCost
	 *            the itemCost to set
	 */
	public void setItemCost(float itemCost) {
		this.itemCost = itemCost;
	}

	/**
	 * @param itemName
	 * @param itemCost
	 * @param quantity
	 */
	public Items(String itemName, float itemCost, int quantity) {
		super();
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.quantity = quantity;
	}

	/**
	 * 
	 */
	public Items() {
		super();
	}

}
