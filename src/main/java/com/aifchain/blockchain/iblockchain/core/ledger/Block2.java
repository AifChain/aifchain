/**
 * 
 */
package com.aifchain.blockchain.iblockchain.core.ledger;

/**
 * @author Michael
 *
 *
 */
public class Block2 {

	private Byte[] previousBlockHash;
	

	private Byte[][] transactions;

	public Byte[] getPreviousBlockHash() {
		return previousBlockHash;
	}

	public void setPreviousBlockHash(Byte[] previousBlockHash) {
		this.previousBlockHash = previousBlockHash;
	}

	public Byte[][] getTransactions() {
		return transactions;
	}

	public void setTransactions(Byte[][] transactions) {
		this.transactions = transactions;
	}
	
	
}
