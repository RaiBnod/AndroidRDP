package com.binod.rdp.application;

import java.io.DataInputStream;
import java.io.IOException;

import com.binod.rdp.presentation.MainActivity;

import android.os.AsyncTask;
import android.widget.EditText;

public class AsyncReceiveMessage extends AsyncTask<Byte, Byte, Byte> {

	DataInputStream dis = null;
	EditText etResult = null;
	MainActivity m = null;

	public AsyncReceiveMessage(DataInputStream dis, EditText etResult,
			MainActivity m) {
		this.dis = dis;
		this.etResult = etResult;
		this.m = m;
	}

	@Override
	protected Byte doInBackground(Byte... arg0) {
		while (true) {
			try {
				publishProgress(dis.readByte());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	protected void onProgressUpdate(Byte... values) {
		etResult.append(values[0] + ", ");
	}
}
