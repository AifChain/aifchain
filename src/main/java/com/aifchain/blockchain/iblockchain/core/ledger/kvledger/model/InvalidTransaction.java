/**
 * 
 */
package com.aifchain.blockchain.iblockchain.core.ledger.kvledger.model;

import com.aifchain.blockchain.iblockchain.core.ledger.Transaction2;

/**
 * @author think
 *
 */
public class InvalidTransaction {

	private Transaction2 transaction2;
	
	private String cause;

	/**
	 * @return the transaction2
	 */
	public Transaction2 getTransaction2() {
		return transaction2;
	}

	/**
	 * @param transaction2 the transaction2 to set
	 */
	public void setTransaction2(Transaction2 transaction2) {
		this.transaction2 = transaction2;
	}

	/**
	 * @return the cause
	 */
	public String getCause() {
		return cause;
	}

	/**
	 * @param cause the cause to set
	 */
	public void setCause(String cause) {
		this.cause = cause;
	}
	
	
}
