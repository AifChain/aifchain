/**
 * 
 */
package com.aifchain.blockchain.iblockchain.core.ledger;

/**
 * @author Michael
 *
 * blockchain information
 *
 */
public class BlockChainInfo {
	
	/**
	 * height
	 */
	private Long height;
	
	private Byte[] currentBlockHash;
	
	private Byte[] previousBlockHash;

	public Long getHeight() {
		return height;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public Byte[] getCurrentBlockHash() {
		return currentBlockHash;
	}

	public void setCurrentBlockHash(Byte[] currentBlockHash) {
		this.currentBlockHash = currentBlockHash;
	}

	public Byte[] getPreviousBlockHash() {
		return previousBlockHash;
	}

	public void setPreviousBlockHash(Byte[] previousBlockHash) {
		this.previousBlockHash = previousBlockHash;
	}
	
	

}
