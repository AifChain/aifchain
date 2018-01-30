/**
 * 
 */
package com.aifchain.blockchain.iblockchain.core.ledger.blkstorage.fsblkstorage;

import com.aifchain.blockchain.iblockchain.core.ledger.Block2;
import com.aifchain.blockchain.iblockchain.core.ledger.BlockChainInfo;
import com.aifchain.blockchain.iblockchain.core.ledger.IResultsIterator;
import com.aifchain.blockchain.iblockchain.core.ledger.Transaction2;
import com.aifchain.blockchain.iblockchain.core.ledger.blkstorage.BlockStorage;

/**
 * @author think
 *
 */
public class FsBlockStore implements BlockStorage {

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.ledger.blkstorage.BlockStorage#addBlock(com.aifchain.blockchain.iblockchain.core.ledger.Block2)
	 */
	public void addBlock(Block2 block2) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.ledger.blkstorage.BlockStorage#getBlockChainInfo()
	 */
	public BlockChainInfo getBlockChainInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.ledger.blkstorage.BlockStorage#retrievBlocks(java.lang.Long)
	 */
	public IResultsIterator retrievBlocks(Long startNum) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.ledger.blkstorage.BlockStorage#retrieveBlockByHash(java.lang.Byte[])
	 */
	public Block2 retrieveBlockByHash(Byte[] blockHash) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.ledger.blkstorage.BlockStorage#retrieveBlockNumber(java.lang.Long)
	 */
	public Block2 retrieveBlockNumber(Long blockNum) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.ledger.blkstorage.BlockStorage#retrieveTxByID(java.lang.String)
	 */
	public Transaction2 retrieveTxByID(String txID) {
		// TODO Auto-generated method stub
		return null;
	}

}
