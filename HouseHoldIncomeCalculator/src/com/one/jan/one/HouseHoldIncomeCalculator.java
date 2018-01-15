/**
 * 
 */
package com.one.jan.one;

import java.util.ArrayList;

import com.one.jan.one.dto.Bill;
import com.one.jan.one.dto.Items;

/**
 * @author dilip.duraiswamy
 *
 */
public class HouseHoldIncomeCalculator {

	/**
	 * @param items
	 *            i.e ArrayList<Items> class objects
	 * @param monthlyIncome
	 * @return bill object with message and total cost
	 * @throws Exception
	 * @Description - this function is used to calculate total amount spent with
	 *              montly exceeding message
	 * @Example - output Thank you for purchasing : 4526 / output You have exceded
	 *          your montly budjet : 4526
	 */
	public static Bill generateBill(ArrayList<Items> items, long monthlyIncome) throws Exception {
		Bill bill = new Bill();

		long totalAmountSpent = 0;
		String message = "Thank you for purchasing";

		monthlyIncome = 20_000;
		for (Items item : items) {
			totalAmountSpent = totalAmountSpent + (long) (item.getItemCost() * item.getQuantity());
		}
		if (totalAmountSpent > monthlyIncome) {
			message = "You have exceded your montly budjet";
		}
		bill.setMessage(message);
		bill.setTotalCost(String.valueOf(totalAmountSpent));
		return bill;
	}

}
