/**
 * 
 */
package com.aifchain.blockchain.iblockchain.core.ledger.blkstorage.fsblkstorage;

import java.awt.image.DataBuffer;

import com.aifchain.blockchain.iblockchain.core.ledger.util.db.DB;

/**
 * @author Michael
 *
 *
 */
public class BlockFileMgr {
	
	/**
	 * Root file directory
	 */
	private String rootDir;
	
	private Config config;
	
	private DB db;
	
	private Index index;
	
	public BlockFileMgr(Config config) {
		db = DB.getInstance(config);
		db.open();
	}

	/**
	 * @return the rootDir
	 */
	public String getRootDir() {
		return rootDir;
	}

	/**
	 * @param rootDir the rootDir to set
	 */
	public void setRootDir(String rootDir) {
		this.rootDir = rootDir;
	}

	/**
	 * @return the config
	 */
	public Config getConfig() {
		return config;
	}

	/**
	 * @param config the config to set
	 */
	public void setConfig(Config config) {
		this.config = config;
	}

	/**
	 * @return the db
	 */
	public DB getDb() {
		return db;
	}

	/**
	 * @param db the db to set
	 */
	public void setDb(DB db) {
		this.db = db;
	}

	/**
	 * @return the index
	 */
	public Index getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(Index index) {
		this.index = index;
	}
	

}
