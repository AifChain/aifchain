/**
 * 
 */
package com.aifchain.blockchain.iblockchain.core.ledger;

/**
 * @author Michael
 *
 */
public interface ILedger {
	
	/**
	 * Get blockchain information
	 * 
	 * @return BlockChainInfo 
	 */
	public BlockChainInfo getBlockChainInfo();
	
	/**
	 * @param blockNumber
	 * @return Block2	     
	 */
	public Block2 getBlockByNumber(Long blockNumber);
	
	
	/**
	 * Get an interator from the number of startBlockNumber
	 * 
	 * 
	 * @param startBlockNumber
	 * @return IResultsIterator
	 */
	public IResultsIterator getBlocksIterator(Long startBlockNumber);

}
