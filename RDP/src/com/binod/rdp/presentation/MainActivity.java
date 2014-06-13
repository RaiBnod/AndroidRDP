package com.binod.rdp.presentation;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.binod.androidchat.R;
import com.binod.rdp.application.AsyncReceiveMessage;
import com.binod.rdp.application.SendToServer;
import com.binod.rdp.service.BasicSettingExchange;
import com.binod.rdp.service.ChannelConnection;
import com.binod.rdp.service.ConnectionInitiation;
import com.binod.rdp.service.Default;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	EditText etIpAddress;
	EditText etPort;
	EditText etMessage;
	EditText etResult;

	Socket server = null;
	DataOutputStream dos = null;
	DataInputStream dis = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		etIpAddress = (EditText) findViewById(R.id.etIpAddress);
		etPort = (EditText) findViewById(R.id.etPort);
		etMessage = (EditText) findViewById(R.id.etMessage);
		etResult = (EditText) findViewById(R.id.etResult);

		findViewById(R.id.btnConnect).setOnClickListener(this);
		findViewById(R.id.btnClear).setOnClickListener(this);
		findViewById(R.id.btnSend).setOnClickListener(this);
	}

	public static void L(String msg) {
		Log.d("Binod", msg);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.btnConnect:
			OnConnect onConnect = new OnConnect();
			onConnect.execute();

			break;
		case R.id.btnClear:
			etIpAddress.setText("");
			etPort.setText("");

			L("Clear Button");
			Toast.makeText(this, "Clear Button is clicked!", Toast.LENGTH_SHORT)
					.show();

			break;
		case R.id.btnSend:
			try {
				SendToServer.send(ConnectionInitiation.execute(), dos);
				Thread.sleep(1000);
				SendToServer.send(BasicSettingExchange.execute(), dos);
				Thread.sleep(1000);
				SendToServer.send(ChannelConnection._MCSErectDomainRequest(), dos);
				Thread.sleep(1000);
				SendToServer.send(ChannelConnection._MCSAttachUserConfirm(), dos);
				Thread.sleep(1000);
				SendToServer.send(ChannelConnection.channelJoinRequest(), dos);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}

	}

	public class OnConnect extends AsyncTask<Long, String, Long> {

		@Override
		protected Long doInBackground(Long... arg0) {

			try {
				// server = new Socket(etIpAddress.getText().toString(),
				// Integer.parseInt(etPort.getText().toString()));
				server = new Socket(Default.ip, Default.port);
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (UnknownHostException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				dos = new DataOutputStream(server.getOutputStream());
				dis = new DataInputStream(server.getInputStream());
				publishProgress("Client is connected!");
			} catch (IOException e) {
				publishProgress("Please try again!");
			}

			AsyncReceiveMessage asyncReceiveMessage = new AsyncReceiveMessage(
					dis, etResult, MainActivity.this);
			asyncReceiveMessage.execute();

			return null;
		}

		@Override
		protected void onProgressUpdate(String... values) {
			Toast.makeText(MainActivity.this, values[0], Toast.LENGTH_LONG)
					.show();

		}
	}

	public static Long[] LongFromString(String str) {
		char[] values = str.toCharArray();
		Long[] value = new Long[values.length];
		for (int i = 0; i < values.length; i++) {
			value[i] = (long) values[i];
		}
		return value;
	}
}
