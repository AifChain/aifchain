/**
 * 
 */
package com.aifchain.blockchain.iblockchain.core.ledger;

import com.aifchain.blockchain.iblockchain.core.ledger.kvledger.model.ValidBlockInValidTx;

/**
 * @author Michael
 *
 * ValidatedLedger （final Ledger）
 *
 */
public interface ValidatedLedger extends ILedger {
	
	
	/**
	 * retrieve transaction by ID
	 * 
	 * @param txID
	 * @return Transaction2
	 */
	public Transaction2 getTransactionByID(String txID);
	
	/**
	 * retrieve block by hash
	 * 
	 * @param blockHash
	 * @return Block2
	 */
	public Block2 getBlockByHash(Byte[] blockHash);
	
	
	/**
	 * validate all transactions in block
	 * 
	 * @param block
	 * @return ValidBlockInValidTx
	 */
	public ValidBlockInValidTx removeInvalidTransactionsAndPrepare(Block2 block);
	
	
	/**
	 * commit
	 * 
	 */
	public void commit();
	
	/**
	 * roll back
	 * 
	 */
	public void rollback();

}
