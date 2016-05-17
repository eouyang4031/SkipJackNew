package org.ellen;

public class Encoder {
	
	private Cipher cipher;
	public Encoder () {
		cipher = new SkipJackImpl();
	}
	
	public Encoder (int [] key) {
		cipher = new SkipJackImpl(key);
	}
	
	public String encrypt (String text) 
	{
		byte [] bytes = this.encrypt(text.getBytes());
		return new String (bytes);
		//convert text to byte
	}
	
	public String decrypt (String text) 
	{
		byte [] bytes = this.decrypt (text.getBytes());
		return new String (bytes);
	}
	
	//public byte [] encrypt (int value, byte [] bytes) 
	//{
		//return cipher.encrypt(bytes);
	//}
	
	public byte [] encrypt (byte [] bytes) 
	{
		return cipher.encrypt(bytes);
	}
	
	public byte [] decrypt (byte [] bytes)
	{
		return cipher.decrypt(bytes);
	}

}

