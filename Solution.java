
package com.canessa.rabbit;


public class Solution {

	public static void main(String[] args) throws Exception {

		// **** ****
		System.out.println("args.length: " + args.length);
		
		// **** ****
		for (String s : args) {
			
			// **** ****
			System.out.println("s ==>" + s + "<==");
			
			// **** ****
			if (s.equals("send")) {
				Send send = new Send();
				send.send();
			} else if (s.equals("recv")) {
				Recv recv = new Recv();
				recv.recv();
			} else {
				System.out.println("unexpected s ==>" + s + "<==");
			}
		}
	}

}
