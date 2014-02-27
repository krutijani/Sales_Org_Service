package com.sales.wb.common;
/**
 * enum for payment types to be implemented for the
 * system
 * @author Kruti Jani
 */
public enum PaymentMode {
	CASH(1), CHEQUE(2), DEBITS(3);

	public int paymentTypeID;
    public String paymentTypeName;
    
    private PaymentMode(String paymentTypeName) {
		this.paymentTypeName = paymentTypeName;
	}
	private PaymentMode(int paymentTypeID) {
		this.paymentTypeID = paymentTypeID;
	}

	public int getPaymentModeID() {
		return paymentTypeID;
	}
	public String getPaymentModeName() {
		return paymentTypeName;
	}
}
