/**
 * 
 */
package com.aifchain.blockchain.iblockchain.orderer.sbft.simplebft;

import com.aifchain.blockchain.iblockchain.orderer.sbft.simplebft.model.Message;

/**
 * @author Michael
 *
 * Receiver - an open api
 */
public interface Receiver {

	/**
	 * @param message
	 * @param src
	 */
	public void receive(Message message, Long src);
	
	/**
	 * @param req
	 */
	public void request(Byte[] req);
	
	/**
	 * @param replica
	 */
	public void connection(Long replica);
}
