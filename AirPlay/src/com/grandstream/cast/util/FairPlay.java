
package com.grandstream.cast.util;

public class FairPlay {
	public static final byte[] PACKET2 = {
	        (byte) (0x46 & 0xFF), (byte) (0x50 & 0xFF), (byte) (0x4C & 0xFF), (byte) (0x59 & 0xFF),
	        (byte) (0x03 & 0xFF), (byte) (0x01 & 0xFF), (byte) (0x02 & 0xFF), (byte) (0x00 & 0xFF),
	        (byte) (0x00 & 0xFF), (byte) (0x00 & 0xFF), (byte) (0x00 & 0xFF), (byte) (0x82 & 0xFF),
	        (byte) (0x02 & 0xFF), (byte) (0x01 & 0xFF), (byte) (0xCF & 0xFF), (byte) (0x32 & 0xFF),
	        (byte) (0xA2 & 0xFF), (byte) (0x57 & 0xFF), (byte) (0x14 & 0xFF), (byte) (0xB2 & 0xFF),
	        (byte) (0x52 & 0xFF), (byte) (0x4F & 0xFF), (byte) (0x8A & 0xFF), (byte) (0xA0 & 0xFF),
	        (byte) (0xAD & 0xFF), (byte) (0x7A & 0xFF), (byte) (0xF1 & 0xFF), (byte) (0x64 & 0xFF),
	        (byte) (0xE3 & 0xFF), (byte) (0x7B & 0xFF), (byte) (0xCF & 0xFF), (byte) (0x44 & 0xFF),
	        (byte) (0x24 & 0xFF), (byte) (0xE2 & 0xFF), (byte) (0x00 & 0xFF), (byte) (0x04 & 0xFF),
	        (byte) (0x7E & 0xFF), (byte) (0xFC & 0xFF), (byte) (0x0A & 0xFF), (byte) (0xD6 & 0xFF),
	        (byte) (0x7A & 0xFF), (byte) (0xFC & 0xFF), (byte) (0xD9 & 0xFF), (byte) (0x5D & 0xFF),
	        (byte) (0xED & 0xFF), (byte) (0x1C & 0xFF), (byte) (0x27 & 0xFF), (byte) (0x30 & 0xFF),
	        (byte) (0xBB & 0xFF), (byte) (0x59 & 0xFF), (byte) (0x1B & 0xFF), (byte) (0x96 & 0xFF),
	        (byte) (0x2E & 0xFF), (byte) (0xD6 & 0xFF), (byte) (0x3A & 0xFF), (byte) (0x9C & 0xFF),
	        (byte) (0x4D & 0xFF), (byte) (0xED & 0xFF), (byte) (0x88 & 0xFF), (byte) (0xBA & 0xFF),
	        (byte) (0x8F & 0xFF), (byte) (0xC7 & 0xFF), (byte) (0x8D & 0xFF), (byte) (0xE6 & 0xFF),
	        (byte) (0x4D & 0xFF), (byte) (0x91 & 0xFF), (byte) (0xCC & 0xFF), (byte) (0xFD & 0xFF),
	        (byte) (0x5C & 0xFF), (byte) (0x7B & 0xFF), (byte) (0x56 & 0xFF), (byte) (0xDA & 0xFF),
	        (byte) (0x88 & 0xFF), (byte) (0xE3 & 0xFF), (byte) (0x1F & 0xFF), (byte) (0x5C & 0xFF),
	        (byte) (0xCE & 0xFF), (byte) (0xAF & 0xFF), (byte) (0xC7 & 0xFF), (byte) (0x43 & 0xFF),
	        (byte) (0x19 & 0xFF), (byte) (0x95 & 0xFF), (byte) (0xA0 & 0xFF), (byte) (0x16 & 0xFF),
	        (byte) (0x65 & 0xFF), (byte) (0xA5 & 0xFF), (byte) (0x4E & 0xFF), (byte) (0x19 & 0xFF),
	        (byte) (0x39 & 0xFF), (byte) (0xD2 & 0xFF), (byte) (0x5B & 0xFF), (byte) (0x94 & 0xFF),
	        (byte) (0xDB & 0xFF), (byte) (0x64 & 0xFF), (byte) (0xB9 & 0xFF), (byte) (0xE4 & 0xFF),
	        (byte) (0x5D & 0xFF), (byte) (0x8D & 0xFF), (byte) (0x06 & 0xFF), (byte) (0x3E & 0xFF),
	        (byte) (0x1E & 0xFF), (byte) (0x6A & 0xFF), (byte) (0xF0 & 0xFF), (byte) (0x7E & 0xFF),
	        (byte) (0x96 & 0xFF), (byte) (0x56 & 0xFF), (byte) (0x16 & 0xFF), (byte) (0x2B & 0xFF),
	        (byte) (0x0E & 0xFF), (byte) (0xFA & 0xFF), (byte) (0x40 & 0xFF), (byte) (0x42 & 0xFF),
	        (byte) (0x75 & 0xFF), (byte) (0xEA & 0xFF), (byte) (0x5A & 0xFF), (byte) (0x44 & 0xFF),
	        (byte) (0xD9 & 0xFF), (byte) (0x59 & 0xFF), (byte) (0x1C & 0xFF), (byte) (0x72 & 0xFF),
	        (byte) (0x56 & 0xFF), (byte) (0xB9 & 0xFF), (byte) (0xFB & 0xFF), (byte) (0xE6 & 0xFF),
	        (byte) (0x51 & 0xFF), (byte) (0x38 & 0xFF), (byte) (0x98 & 0xFF), (byte) (0xB8 & 0xFF),
	        (byte) (0x02 & 0xFF), (byte) (0x27 & 0xFF), (byte) (0x72 & 0xFF), (byte) (0x19 & 0xFF),
	        (byte) (0x88 & 0xFF), (byte) (0x57 & 0xFF), (byte) (0x16 & 0xFF), (byte) (0x50 & 0xFF),
	        (byte) (0x94 & 0xFF), (byte) (0x2A & 0xFF), (byte) (0xD9 & 0xFF), (byte) (0x46 & 0xFF),
	        (byte) (0x68 & 0xFF), (byte) (0x8A & 0xFF),
	};

	public static final byte[] PACKET4 = {
	        (byte) (0x46 & 0xFF), (byte) (0x50 & 0xFF), (byte) (0x4C & 0xFF), (byte) (0x59 & 0xFF),
	        (byte) (0x03 & 0xFF), (byte) (0x01 & 0xFF), (byte) (0x04 & 0xFF), (byte) (0x00 & 0xFF),
	        (byte) (0x00 & 0xFF), (byte) (0x00 & 0xFF), (byte) (0x00 & 0xFF), (byte) (0x14 & 0xFF),
	        (byte) (0xEC & 0xFF), (byte) (0xF2 & 0xFF), (byte) (0xFF & 0xFF), (byte) (0xA2 & 0xFF),
	        (byte) (0x7E & 0xFF), (byte) (0x66 & 0xFF), (byte) (0x82 & 0xFF), (byte) (0xEA & 0xFF),
	        (byte) (0x1D & 0xFF), (byte) (0x22 & 0xFF), (byte) (0x1E & 0xFF), (byte) (0x17 & 0xFF),
	        (byte) (0xEC & 0xFF), (byte) (0x27 & 0xFF), (byte) (0x6A & 0xFF), (byte) (0x55 & 0xFF),
	        (byte) (0x13 & 0xFF), (byte) (0x0C & 0xFF), (byte) (0x56 & 0xFF), (byte) (0x66 & 0xFF),
	};

}
