/**
 * 
 */
package com.aifchain.blockchain.iblockchain.orderer.sbft.simplebft;

import com.aifchain.blockchain.iblockchain.orderer.sbft.simplebft.model.Batch;
import com.aifchain.blockchain.iblockchain.orderer.sbft.simplebft.model.Message;

/**
 * @author Michael
 *
 * System API
 */
public interface System {

	/**
	 * @param message
	 * @param dest
	 */
	public void send(Message message, Long dest);
	
	
	/**
	 * @param batch
	 */
	public void deliver(Batch batch);
	
	
	/**
	 * @param receiver
	 */
	public void setReceiver(Receiver receiver);
	
	/**
	 * @param key
	 * @param data
	 */
	public void persist(String key, Message data);
	
	/**
	 * @param key
	 * @param out
	 * @return
	 */
	public boolean restore(String key, Message out);
}
