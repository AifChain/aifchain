/**
 * 
 */
package com.aifchain.blockchain.iblockchain.core.ledger.kvledger.txmanagement;

import com.aifchain.blockchain.iblockchain.core.ledger.Block2;
import com.aifchain.blockchain.iblockchain.core.ledger.kvledger.model.ValidBlockInValidTx;

/**
 * @author think
 *
 */
public interface TxManagement {
	
	
	/**
	 * @param block2
	 * @return ValidBlockInValidTx
	 */
	public ValidBlockInValidTx validateAndPrepare(Block2 block2);
	
	public void commit();
	
	public void rollback();
	
	public void shutDow();

}
