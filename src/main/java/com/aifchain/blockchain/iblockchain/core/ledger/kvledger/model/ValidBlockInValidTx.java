/**
 * 
 */
package com.aifchain.blockchain.iblockchain.core.ledger.kvledger.model;

import com.aifchain.blockchain.iblockchain.core.ledger.Block2;

/**
 * @author think
 *
 */
public class ValidBlockInValidTx {
	
	/**
	 * 
	 */
	private Block2 block;
	
	/**
	 * 
	 */
	private InvalidTransaction invalidTransaction;

	/**
	 * @return the block
	 */
	public Block2 getBlock() {
		return block;
	}

	/**
	 * @param block the block to set
	 */
	public void setBlock(Block2 block) {
		this.block = block;
	}

	/**
	 * @return the invalidTransaction
	 */
	public InvalidTransaction getInvalidTransaction() {
		return invalidTransaction;
	}

	/**
	 * @param invalidTransaction the invalidTransaction to set
	 */
	public void setInvalidTransaction(InvalidTransaction invalidTransaction) {
		this.invalidTransaction = invalidTransaction;
	}
	

}
