package org.ellen;

public class Transmitter 
{
	private Encoder encoder;
	private int [] key = {1, 2, 3, 4, 3, 6, 7, 5, 9, 12, 2, 1};
	
	public Transmitter () {
		encoder = new Encoder (key);
	}
	public int[] getKey() {
		return key;
	}
	public void setKey(int[] key) {
		this.key = key;
	}
	
	public String send (String text) {
		return encoder.encrypt(text);
	}
	
	public byte [] send (byte [] bytes) {
		return encoder.encrypt(bytes);
	}

}