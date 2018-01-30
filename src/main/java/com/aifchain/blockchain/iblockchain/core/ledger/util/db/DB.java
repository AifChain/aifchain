/**
 * 
 */
package com.aifchain.blockchain.iblockchain.core.ledger.util.db;

import com.aifchain.blockchain.iblockchain.core.ledger.blkstorage.fsblkstorage.Config;

/**
 * @author think
 *
 */
public class DB {
	
	public static DB  getInstance(Config config) {
		
		return new DB();
	}
	
	
	/**
	 * open a database instance
	 */
	public void open() {
		//TODO
	}

}
