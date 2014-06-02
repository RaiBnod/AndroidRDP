package com.binod.rdp.application;

import java.io.DataOutputStream;
import java.io.IOException;

public class SendToServer {

	public static void send(int[] values, DataOutputStream dos) {
		for (int value : values) {
			try {
				dos.write(value);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
