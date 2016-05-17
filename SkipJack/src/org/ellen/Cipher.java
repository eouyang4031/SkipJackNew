package org.ellen;

public interface Cipher 
{
	public byte [] encrypt (byte[] bytes);
	public byte [] decrypt (byte[] bytes);
}
