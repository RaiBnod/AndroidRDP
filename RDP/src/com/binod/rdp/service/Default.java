package com.binod.rdp.service;

public class Default {
	public final static String ip = "192.168.85.1";
	public final static int port = 3389;
	public final static String username = "RaiBnod";
	public final static String password = "binod";

	public static int[] concatInt(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		int lengthOfFirst = a.length;
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			result[lengthOfFirst + i] = b[i];
		}
		return result;
	}

	public static int[] tpktHeader(int length) {
		int result[] = { 0x03, 0x00, 0x00, length };
		return result;
		// result[0] = 0x03; // TPKT Header: TPKT version = 3
		// result[1] = 0x00; // TPKT Header: Reserved = 0
		// result[2] = 0x00; // TPKT Header: Packet length - high part
		// result[3] = (int) length; // TPKT Header: Packet length - low part
	}

}
