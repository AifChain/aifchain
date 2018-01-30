/**
 * 
 */
package com.aifchain.blockchain.iblockchain.core.committer;

import java.awt.List;

import com.aifchain.blockchain.iblockchain.core.ledger.Block2;

/**
 * @author Michael
 *
 * Committer interface
 *
 */
public interface Committer {

	
	/**
	 * commit block
	 * 
	 * @param block2
	 */
	public void commitBlock(Block2 block2);
	
	
	/**
	 * get last block number/height
	 * 
	 * @return
	 */
	public Long getLedgerHeight();
	
	/**
	 * get a list of block
	 * 
	 * @param blockSeqs
	 * @return
	 */
	public Block2[] getBlocks(Long[] blockSeqs);
}
