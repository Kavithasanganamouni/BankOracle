package com.cg.bank.beans;

public class TransactionDetails {
	private int Transaction_id,fromAccountNo,toAccountNo,amountTransfer;

	public int getTransaction_id() {
		return Transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		Transaction_id = transaction_id;
	}

	public int getFromAccountNo() {
		return fromAccountNo;
	}

	public void setFromAccountNo(int fromAccountNo) {
		this.fromAccountNo = fromAccountNo;
	}

	public int getToAccountNo() {
		return toAccountNo;
	}

	public void setToAccountNo(int toAccountNo) {
		this.toAccountNo = toAccountNo;
	}

	public int getAmountTransfer() {
		return amountTransfer;
	}

	public void setAmountTransfer(int amountTransfer) {
		this.amountTransfer = amountTransfer;
	}
	

}
