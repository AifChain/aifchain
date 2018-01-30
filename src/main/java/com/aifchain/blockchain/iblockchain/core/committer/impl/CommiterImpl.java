/**
 * 
 */
package com.aifchain.blockchain.iblockchain.core.committer.impl;

import com.aifchain.blockchain.iblockchain.core.committer.Committer;
import com.aifchain.blockchain.iblockchain.core.ledger.Block2;
import com.aifchain.blockchain.iblockchain.core.ledger.BlockChainInfo;
import com.aifchain.blockchain.iblockchain.core.ledger.ValidatedLedger;

/**
 * @author Michael
 *
 */
public class CommiterImpl implements Committer {
	
	/**
	 * validated ledger interface
	 */
	private ValidatedLedger validatedLedger;

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.committer.Committer#commitBlock(com.aifchain.blockchain.iblockchain.core.ledger.Block2)
	 */
	public void commitBlock(Block2 block2) {
		
		// validate
		validatedLedger.removeInvalidTransactionsAndPrepare(block2);
		
		// commit
		validatedLedger.commit();
	}

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.committer.Committer#getLedgerHeight()
	 */
	public Long getLedgerHeight() {
		
		BlockChainInfo chainInfo = validatedLedger.getBlockChainInfo();	
		return chainInfo.getHeight();
	}

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.committer.Committer#getBlocks(java.lang.Long[])
	 */
	public Block2[] getBlocks(Long[] blockSeqs) {
		// TODO Auto-generated method stub
		return null;
	}

}
