package com.binod.rdp.service;


public class BasicSettingExchange {
	public static int[] execute() {

		char[] username = new char[16];
		char[] temp = Default.username.toCharArray();
		for(int i=0; i<16; i++){
			if(i < temp.length)
				username[i] = temp[i];
			else
				username[i] = 0x00;
		}

		int[] result = { 0x03, 0x00, 0x01, 0xa0, 0x02, 0xf0, 0x80, 0x7f, 0x65,
				0x82, 0x01, 0x94, 0x04, 0x01, 0x01, 0x04, 0x01, 0x01, 0x01,
				0x01, 0xff, 0x30, 0x19, 0x02, 0x01, 0x22, 0x02, 0x01, 0x02,
				0x02, 0x01, 0x00, 0x02, 0x01, 0x01, 0x02, 0x01, 0x00, 0x02,
				0x01, 0x01, 0x02, 0x02, 0xff, 0xff, 0x02, 0x01, 0x02, 0x30,
				0x19, 0x02, 0x01, 0x01, 0x02, 0x01, 0x01, 0x02, 0x01, 0x01,
				0x02, 0x01, 0x01, 0x02, 0x01, 0x00, 0x02, 0x01, 0x01, 0x02,
				0x02, 0x04, 0x20, 0x02, 0x01, 0x02, 0x30, 0x1c, 0x02, 0x02,
				0xff, 0xff, 0x02, 0x02, 0xfc, 0x17, 0x02, 0x02, 0xff, 0xff,
				0x02, 0x01, 0x01, 0x02, 0x01, 0x00, 0x02, 0x01, 0x01, 0x02,
				0x02, 0xff, 0xff, 0x02, 0x01, 0x02, 0x04, 0x82, 0x01, 0x33,
				0x00, 0x05, 0x00, 0x14, 0x7c, 0x00, 0x01, 0x81, 0x2a, 0x00,
				0x08, 0x00, 0x10, 0x00, 0x01, 0xc0, 0x00, 0x44, 0x75, 0x63,
				0x61, 0x81, 0x1c, 0x01, 0xc0, 0xd8, 0x00, 0x04, 0x00, 0x08,
				0x00, 0x00, 0x05, 0x00, 0x04, 0x01, 0xca, 0x03, 0xaa, 0x09,
				0x04, 0x00, 0x00, 0xce, 0x0e, 0x00, 0x00, (int) username[0],
				0x00, (int) username[1], 0x00, (int) username[2], 0x00,
				(int) username[3], 0x00, (int) username[4], 0x00,
				(int) username[5], 0x00, (int) username[6], 0x00,
				(int) username[7], 0x00, (int) username[8], 0x00,
				(int) username[9], 0x00, (int) username[10], 0x00,
				(int) username[11], 0x00, (int) username[12], 0x00,
				(int) username[13], 0x00, (int) username[14], 0x00,
				(int) username[15], 0x00, 0x04, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, 0x0c, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x01, 0xca, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x18, 0x00,
				0x07, 0x00, 0x01, 0x00, 0x36, 0x00, 0x39, 0x00, 0x37, 0x00,
				0x31, 0x00, 0x32, 0x00, 0x2d, 0x00, 0x37, 0x00, 0x38, 0x00,
				0x33, 0x00, 0x2d, 0x00, 0x30, 0x00, 0x33, 0x00, 0x35, 0x00,
				0x37, 0x00, 0x39, 0x00, 0x37, 0x00, 0x34, 0x00, 0x2d, 0x00,
				0x34, 0x00, 0x32, 0x00, 0x37, 0x00, 0x31, 0x00, 0x34, 0x00,
				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x01, 0x00, 0x00, 0x00, 0x04, 0xc0, 0x0c, 0x00, 0x0d, 0x00,
				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xc0, 0x0c, 0x00,
				0x1b, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x03, 0xc0,
				0x2c, 0x00, 0x03, 0x00, 0x00, 0x00, 0x72, 0x64, 0x70, 0x64,
				0x72, 0x00, 0x00, 0x00, 0x00, 0x00, 0x80, 0x80, 0x63, 0x6c,
				0x69, 0x70, 0x72, 0x64, 0x72, 0x00, 0x00, 0x00, 0xa0, 0xc0,
				0x72, 0x64, 0x70, 0x73, 0x6e, 0x64, 0x00, 0x00, 0x00, 0x00,
				0x00, 0xc0 };
		
//		int[] result = {0x03, 0x00, 0x01, 0xa0, 0x02, 0xf0, 0x80, 0x7f, 0x65, 0x82, 0x01, 0x94, 0x04, 0x01, 0x01, 0x04,
//				0x01, 0x01, 0x01, 0x01, 0xff, 0x30, 0x19, 0x02, 0x01, 0x22, 0x02, 0x01, 0x02, 0x02, 0x01, 0x00,
//				0x02, 0x01, 0x01, 0x02, 0x01, 0x00, 0x02, 0x01, 0x01, 0x02, 0x02, 0xff, 0xff, 0x02, 0x01, 0x02,
//				0x30, 0x19, 0x02, 0x01, 0x01, 0x02, 0x01, 0x01, 0x02, 0x01, 0x01, 0x02, 0x01, 0x01, 0x02, 0x01,
//				0x00, 0x02, 0x01, 0x01, 0x02, 0x02, 0x04, 0x20, 0x02, 0x01, 0x02, 0x30, 0x1c, 0x02, 0x02, 0xff,
//				0xff, 0x02, 0x02, 0xfc, 0x17, 0x02, 0x02, 0xff, 0xff, 0x02, 0x01, 0x01, 0x02, 0x01, 0x00, 0x02,
//				0x01, 0x01, 0x02, 0x02, 0xff, 0xff, 0x02, 0x01, 0x02, 0x04, 0x82, 0x01, 0x33, 0x00, 0x05, 0x00,
//				0x14, 0x7c, 0x00, 0x01, 0x81, 0x2a, 0x00, 0x08, 0x00, 0x10, 0x00, 0x01, 0xc0, 0x00, 0x44, 0x75,
//				0x63, 0x61, 0x81, 0x1c, 0x01, 0xc0, 0xd8, 0x00, 0x04, 0x00, 0x08, 0x00, 0x00, 0x05, 0x00, 0x04,
//				0x01, 0xca, 0x03, 0xaa, 0x09, 0x04, 0x00, 0x00, 0xce, 0x0e, 0x00, 0x00, 0x45, 0x00, 0x4c, 0x00,
//				0x54, 0x00, 0x4f, 0x00, 0x4e, 0x00, 0x53, 0x00, 0x2d, 0x00, 0x44, 0x00, 0x45, 0x00, 0x56, 0x00,
//				0x32, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x04, 0x00, 0x00, 0x00,
//				0x00, 0x00, 0x00, 0x00, 0x0c, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
//				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
//				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
//				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
//				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01, 0xca, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00,
//				0x18, 0x00, 0x07, 0x00, 0x01, 0x00, 0x36, 0x00, 0x39, 0x00, 0x37, 0x00, 0x31, 0x00, 0x32, 0x00,
//				0x2d, 0x00, 0x37, 0x00, 0x38, 0x00, 0x33, 0x00, 0x2d, 0x00, 0x30, 0x00, 0x33, 0x00, 0x35, 0x00,
//				0x37, 0x00, 0x39, 0x00, 0x37, 0x00, 0x34, 0x00, 0x2d, 0x00, 0x34, 0x00, 0x32, 0x00, 0x37, 0x00,
//				0x31, 0x00, 0x34, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
//				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x04, 0xc0, 0x0c, 0x00,
//				0x0d, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xc0, 0x0c, 0x00, 0x1b, 0x00, 0x00, 0x00,
//				0x00, 0x00, 0x00, 0x00, 0x03, 0xc0, 0x2c, 0x00, 0x03, 0x00, 0x00, 0x00, 0x72, 0x64, 0x70, 0x64,
//				0x72, 0x00, 0x00, 0x00, 0x00, 0x00, 0x80, 0x80, 0x63, 0x6c, 0x69, 0x70, 0x72, 0x64, 0x72, 0x00,
//				0x00, 0x00, 0xa0, 0xc0, 0x72, 0x64, 0x70, 0x73, 0x6e, 0x64, 0x00, 0x00, 0x00, 0x00, 0x00, 0xc0};

		return result;
	}
}
