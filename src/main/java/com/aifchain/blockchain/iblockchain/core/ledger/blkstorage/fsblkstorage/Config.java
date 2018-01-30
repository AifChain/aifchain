/**
 * 
 */
package com.aifchain.blockchain.iblockchain.core.ledger.blkstorage.fsblkstorage;

/**
 * @author Michael
 *
 *
 */
public class Config {
	
	private static final int defaultMaxBlockfileSize = 64 * 1024 * 1024;
	
	private String blockFileDir;
	
	private String dbPath;
	
	private int maxBlockfileSize;
	
	public Config(String filesystemPath, Integer maxBlockfileSize) {
		//TODO
	}

	/**
	 * @return the blockFileDir
	 */
	public String getBlockFileDir() {
		return blockFileDir;
	}

	/**
	 * @param blockFileDir the blockFileDir to set
	 */
	public void setBlockFileDir(String blockFileDir) {
		this.blockFileDir = blockFileDir;
	}

	/**
	 * @return the dbPath
	 */
	public String getDbPath() {
		return dbPath;
	}

	/**
	 * @param dbPath the dbPath to set
	 */
	public void setDbPath(String dbPath) {
		this.dbPath = dbPath;
	}

	/**
	 * @return the maxBlockfileSize
	 */
	public int getMaxBlockfileSize() {
		return maxBlockfileSize;
	}

	/**
	 * @param maxBlockfileSize the maxBlockfileSize to set
	 */
	public void setMaxBlockfileSize(int maxBlockfileSize) {
		this.maxBlockfileSize = maxBlockfileSize;
	}
	
	
	

}
