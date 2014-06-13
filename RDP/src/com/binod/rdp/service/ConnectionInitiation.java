package com.binod.rdp.service;


public class ConnectionInitiation {

	public static int[] execute() {
		String cookie = "Cookie: mstshash=" + Default.username;
		int length = 4 + 7 + cookie.length() + 2 + 8;
		int[] result = new int[length];
		result[0] = 0x03; // TPKT Header: TPKT version = 3
		result[1] = 0x00; // TPKT Header: Reserved = 0
		result[2] = 0x00; // TPKT Header: Packet length - high part
		result[3] = (int) length; // TPKT Header: Packet length - low part
									// (total = 19 bytes)

		result[4] = (int) (length - 5); // X.224: Length indicator (39 bytes)
		result[5] = 0xe0; // X.224: Type (high nibble) = 0xe = CR TPDU; credit
							// (low nibble) = 0
		result[6] = 0x00;
		result[7] = 0x00; // X.224: Destination reference = 0
		result[8] = 0x00;
		result[9] = 0x00; // X.224: Source reference = 0
		result[10] = 0x00; // X.224: Class and options = 0

		char[] cooki = cookie.toCharArray();
		for (int i = 0; i < cookie.length(); i++) {
			result[11 + i] = (int) cooki[i];
		}

		result[length - 10] = 0x0d;
		result[length - 9] = 0x0a; // Cookie terminator sequence
		result[length - 8] = 0x01; // RDP_NEG_REQ::type (TYPE_RDP_NEG_REQ)
		result[length - 7] = 0x00; // RDP_NEG_REQ::flags (0)
		result[length - 6] = 0x08;
		result[length - 5] = 0x00; // RDP_NEG_REQ::length (8 bytes)
		result[length - 4] = 0x03;
		result[length - 3] = 0x00;
		result[length - 2] = 0x00;
		result[length - 1] = 0x00; // RDP_NEG_REQ: Requested protocols
									// (PROTOCOL_HYBRID_EX)
		
//		int[] result = {0x03, 0x00, 0x00, 0x2c, 0x27, 0xe0, 0x00, 0x00, 0x00, 0x00, 0x00, 0x43, 0x6f, 0x6f, 0x6b, 0x69,
//				0x65, 0x3a, 0x20, 0x6d, 0x73, 0x74, 0x73, 0x68, 0x61, 0x73, 0x68, 0x3d, 0x65, 0x6c, 0x74, 0x6f,
//				0x6e, 0x73, 0x0d, 0x0a, 0x01, 0x00, 0x08, 0x00, 0x01, 0x00, 0x00, 0x00};

		return result;
	}
}
