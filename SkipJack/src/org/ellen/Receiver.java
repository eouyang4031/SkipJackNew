package org.ellen;

public class Receiver 
{
	private Encoder encoder;
	
	public Receiver (int [] key) {
		encoder = new Encoder (key);
	}
	
	public String receive (String text) {
		return encoder.decrypt (text);
	}
	
	public byte [] receive (byte [] bytes) {
		return encoder.decrypt (bytes);
	}

}