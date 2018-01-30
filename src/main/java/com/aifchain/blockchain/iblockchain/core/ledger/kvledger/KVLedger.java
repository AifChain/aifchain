/**
 * 
 */
package com.aifchain.blockchain.iblockchain.core.ledger.kvledger;

import com.aifchain.blockchain.iblockchain.core.ledger.Block2;
import com.aifchain.blockchain.iblockchain.core.ledger.BlockChainInfo;
import com.aifchain.blockchain.iblockchain.core.ledger.IResultsIterator;
import com.aifchain.blockchain.iblockchain.core.ledger.Transaction2;
import com.aifchain.blockchain.iblockchain.core.ledger.ValidatedLedger;
import com.aifchain.blockchain.iblockchain.core.ledger.blkstorage.BlockStorage;
import com.aifchain.blockchain.iblockchain.core.ledger.blkstorage.fsblkstorage.Config;
import com.aifchain.blockchain.iblockchain.core.ledger.kvledger.model.ValidBlockInValidTx;
import com.aifchain.blockchain.iblockchain.core.ledger.kvledger.txmanagement.TxManagement;

/**
 * @author think
 *
 */
public class KVLedger implements ValidatedLedger {
	
	/**
	 * 
	 */
	private BlockStorage blockStorage;
	
	/**
	 * 
	 */
	private TxManagement txManagement;
	
	/**
	 * 
	 */
	private Block2 pendingBlockToCommit;
	
	
	/**
	 *
	 * @param config
	 * @return KVLedger
	 */
	public static KVLedger newKVLedger(Config config) {
		return new KVLedger(config);
	}
	
	/**
	 * 
	 * @param config
	 */
	private KVLedger(Config config) {
		System.out.println("Creating KVLedger using config :");
	}
	

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.ledger.ILedger#getBlockChainInfo()
	 */
	public BlockChainInfo getBlockChainInfo() {
		return blockStorage.getBlockChainInfo();
	}

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.ledger.ILedger#getBlockByNumber(java.lang.Long)
	 */
	public Block2 getBlockByNumber(Long blockNumber) {
		return blockStorage.retrieveBlockNumber(blockNumber);
	}

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.ledger.ILedger#getBlocksIterator(java.lang.Long)
	 */
	public IResultsIterator getBlocksIterator(Long startBlockNumber) {
		return blockStorage.retrievBlocks(startBlockNumber);
	}

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.ledger.ValidatedLedger#getTransactionByID(java.lang.String)
	 */
	public Transaction2 getTransactionByID(String txID) {
		return blockStorage.retrieveTxByID(txID);
	}

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.ledger.ValidatedLedger#getBlockByHash(java.lang.Byte[])
	 */
	public Block2 getBlockByHash(Byte[] blockHash) {
		return blockStorage.retrieveBlockByHash(blockHash);
	}

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.ledger.ValidatedLedger#removeInvalidTransactionsAndPrepare(com.aifchain.blockchain.iblockchain.core.ledger.Block2)
	 */
	public ValidBlockInValidTx removeInvalidTransactionsAndPrepare(Block2 block) {
		
		ValidBlockInValidTx validBlockInValidTx = txManagement.validateAndPrepare(block);
		this.pendingBlockToCommit = validBlockInValidTx.getBlock();		
		return validBlockInValidTx;
	}

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.ledger.ValidatedLedger#commit()
	 */
	public void commit() {
		
		if (this.pendingBlockToCommit == null) {
			//TODO: 日志 ：
			System.out.println("Nothing to commit. removeInvalidTransactionsAndPrepare method should have been called and no error");
		}
		
		System.out.println("Commiting block to storage");
		
		// 1. 块存储
		blockStorage.addBlock(this.pendingBlockToCommit);
		System.out.println("Commiting block to state database");
		
		// 2. 交易管理器提交
		//TODO: "Error during commit to txmgr" 注意交易提交错误
		txManagement.commit();
		
		// 3.将pendingBlockToCommit设置为空
		this.pendingBlockToCommit = null;		
		return;
	}

	/* (non-Javadoc)
	 * @see com.aifchain.blockchain.iblockchain.core.ledger.ValidatedLedger#rollback()
	 */
	public void rollback() {
		
		txManagement.rollback();
		this.pendingBlockToCommit = null;
	}



}
