package org.ellen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import junit.framework.Assert;

public class Test
{

	public static void main (String [] args)
	{
		Test test = new Test ();
		//test.testThirdPartyText();
		//test.testTransmission();
		test.testFileInput();
	
	}
	
	//main runner
		public void testFileInput () 
		{
			//String input = "d4de46d52274dbb029f33b076043f8c40089f906751623de29f33b076043f8c4ac99b90f9396cb04111122223333";
			String filename = "/Users/xzhao/Documents/Programming/SkipJack/Words.txt";
			//replace ... w/ file
			try {
				Scanner input = new Scanner (new File(filename));
				String s = input.nextLine();
				
				//testEncryptAndDecrypt(s);
				
				System.out.println("original text: " + s);
				Transmitter transmitter = new Transmitter ();
				byte [] encrypted = transmitter.send(s.getBytes());
				System.out.println("inputEncrypted:" +  new String (encrypted) );
				
				int [] key = transmitter.getKey();
				Receiver receiver = new Receiver (key);
				byte [] decrypted = receiver.receive (encrypted);
				
				String output = new String (decrypted);
				
				System.out.println("output:" + output);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		}
	
	//test during coding
	public void testTransmission () {
		String input = "d4de46d52274dbb029f33b076043f8c40089f906751623de29f33b076043f8c4ac99b90f9396cb04111122223333";
		System.out.println("input:" + input);
		
		Transmitter transmitter = new Transmitter ();
		byte [] encrypted = transmitter.send(input.getBytes());
		System.out.println("inputEncrypted:" +  new String (encrypted) );
		
		int [] key = transmitter.getKey();
		Receiver receiver = new Receiver (key);
		byte [] decrypted = receiver.receive (encrypted);
		
		String output = new String (decrypted);
		
		System.out.println("output:" + output);	
	}
	
	//test during coding
	public void testEncryptAndDecrypt  (String input) 
	{
		System.out.println ("Original Text: " + input);
		Encoder encoder = new Encoder ();
		String encyptedText = encoder.encrypt(input);
		System.out.println ("Encypted Text: " + encyptedText);
		
		String decyptedText = encoder.decrypt(encyptedText);
		System.out.println ("Decypted Text: " + decyptedText);
		
	}
	
	//test during coding
	public void testThirdPartyText () 
	{
		 String input = "d4de46d52274dbb029f33b076043f8c40089f906751623de29f33b076043f8c4ac99b90f9396cb04111122223333";
		//   String input = "d4de46d52274dbb029f33b076043f8c41089f906751623de29f33b076043f8c4ac99b90f9396cb04111122223333";
		this.testEncryptAndDecrypt (input);
		
	}
	
	
	
}
