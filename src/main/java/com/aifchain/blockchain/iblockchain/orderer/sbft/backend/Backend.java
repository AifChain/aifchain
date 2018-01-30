/**
 * 
 */
package com.aifchain.blockchain.iblockchain.orderer.sbft.backend;

import java.util.Map;

import com.aifchain.blockchain.iblockchain.orderer.sbft.simplebft.Receiver;

/**
 * @author Michael
 * 
 */
public class Backend {

	/**
	 * Receiver 
	 */
	private Receiver receiver;
	
	
	public static Backend getInstance(Map<String, Byte[]> peers,  String dataDir){
		//TODO 
		return null;
	}
	
	private Backend(){
		
	}

	/**
	 * @return the receiver
	 */
	public Receiver getReceiver() {
		return receiver;
	}

	/**
	 * @param receiver the receiver to set
	 */
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	
	
	
}
