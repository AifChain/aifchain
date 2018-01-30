/**
 * 
 */
package com.aifchain.blockchain.iblockchain.core.ledger.blkstorage;

import com.aifchain.blockchain.iblockchain.core.ledger.Block2;
import com.aifchain.blockchain.iblockchain.core.ledger.BlockChainInfo;
import com.aifchain.blockchain.iblockchain.core.ledger.IResultsIterator;
import com.aifchain.blockchain.iblockchain.core.ledger.Transaction2;

/**
 * @author Michael
 *
 * Persist & Retrieve
 *
 */
public interface BlockStorage {
	
	/**
	 * @param block2
	 */
	public void addBlock(Block2 block2);
	
	/**
	 * get blockchain info
	 *
	 * @return BlockChainInfo
	 */
	public BlockChainInfo getBlockChainInfo();
	
	
	/**
	 * 检索块
	 * 
	 * @param startNum
	 * @return IResultsIterator
	 */
	public IResultsIterator retrievBlocks(Long startNum);
	
	/**
	 * retrieve block
	 * 
	 * @param blockHash
	 * @return Block2
	 */
	public Block2 retrieveBlockByHash(Byte[] blockHash);
	
	
	/**
	 * retrieve block
	 * 
	 * @param blockNum
	 * @return Block2
	 */
	public Block2 retrieveBlockNumber(Long blockNum);
	
	/**
	 * retrieve transaction
	 * 
	 * @param txID
	 * @return BlockChainInfo
	 */
	public Transaction2 retrieveTxByID(String txID);

}
