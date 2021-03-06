package org.redrune.utility.rs;

/**
 * @author Tyluur <itstyluur@gmail.com>
 * @since 7/20/2017
 */
public class NetworkUtils {
	
	/**
	 * The packet sizes.
	 */
	public static final byte[] PACKET_SIZES = new byte[256];
	
	/**
	 * Loads all the packet lengths
	 */
	public static void loadPacketLengths() {
		for (int i = 0; i < PACKET_SIZES.length; i++) {
			PACKET_SIZES[i] = -4;
		}
		PACKET_SIZES[0] = 0;
		PACKET_SIZES[10] = 3;
		PACKET_SIZES[11] = 8;
		PACKET_SIZES[12] = -1;
		PACKET_SIZES[13] = -1;
		PACKET_SIZES[14] = 3;
		PACKET_SIZES[15] = 4;
		PACKET_SIZES[16] = 7;
		PACKET_SIZES[17] = 8;
		PACKET_SIZES[18] = 1;
		PACKET_SIZES[19] = -1;
		PACKET_SIZES[1] = 7;
		PACKET_SIZES[20] = 4;
		PACKET_SIZES[21] = 2;
		PACKET_SIZES[22] = -1;
		PACKET_SIZES[23] = 7;
		PACKET_SIZES[24] = 7;
		PACKET_SIZES[25] = 8;
		PACKET_SIZES[26] = 16;
		PACKET_SIZES[27] = 3;
		PACKET_SIZES[28] = 7;
		PACKET_SIZES[29] = 3;
		PACKET_SIZES[2] = -1;
		PACKET_SIZES[30] = -1;
		PACKET_SIZES[31] = -1;
		PACKET_SIZES[32] = 4;
		PACKET_SIZES[33] = 0;
		PACKET_SIZES[34] = 6;
		PACKET_SIZES[35] = -1;
		PACKET_SIZES[36] = 6;
		PACKET_SIZES[37] = 4;
		PACKET_SIZES[38] = 7;
		PACKET_SIZES[39] = 7;
		PACKET_SIZES[3] = 8;
		PACKET_SIZES[40] = 8;
		PACKET_SIZES[42] = 15;
		PACKET_SIZES[43] = 3;
		PACKET_SIZES[44] = 3;
		PACKET_SIZES[45] = 7;
		PACKET_SIZES[46] = -1;
		PACKET_SIZES[47] = 3;
		PACKET_SIZES[48] = 8;
		PACKET_SIZES[49] = 7;
		PACKET_SIZES[4] = 3;
		PACKET_SIZES[50] = -1;
		PACKET_SIZES[51] = 3;
		PACKET_SIZES[52] = 4;
		PACKET_SIZES[53] = 18;
		PACKET_SIZES[54] = 8;
		PACKET_SIZES[55] = -1;
		PACKET_SIZES[56] = 5;
		PACKET_SIZES[57] = 11;
		PACKET_SIZES[58] = 7;
		PACKET_SIZES[59] = -1;
		PACKET_SIZES[5] = -1;
		PACKET_SIZES[60] = 1;
		PACKET_SIZES[61] = 3;
		PACKET_SIZES[62] = -1;
		PACKET_SIZES[63] = 4;
		PACKET_SIZES[64] = 0;
		PACKET_SIZES[65] = 11;
		PACKET_SIZES[66] = 8;
		PACKET_SIZES[67] = 2;
		PACKET_SIZES[68] = -1;
		PACKET_SIZES[69] = 3;
		PACKET_SIZES[6] = 15;
		PACKET_SIZES[70] = 3;
		PACKET_SIZES[71] = 16;
		PACKET_SIZES[72] = 3;
		PACKET_SIZES[73] = 2;
		PACKET_SIZES[74] = -1;
		PACKET_SIZES[75] = 7;
		PACKET_SIZES[76] = 4;
		PACKET_SIZES[77] = 2;
		PACKET_SIZES[78] = 3;
		PACKET_SIZES[79] = -1;
		PACKET_SIZES[7] = 8;
		PACKET_SIZES[80] = -1;
		PACKET_SIZES[81] = -1;
		PACKET_SIZES[82] = -1;
		PACKET_SIZES[83] = 3;
		PACKET_SIZES[84] = 8;
		PACKET_SIZES[85] = 8;
		PACKET_SIZES[87] = 0;
		PACKET_SIZES[88] = -1;
		PACKET_SIZES[89] = -1;
		PACKET_SIZES[8] = 6;
		PACKET_SIZES[90] = 3;
		PACKET_SIZES[91] = 3;
		PACKET_SIZES[92] = 4;
		PACKET_SIZES[93] = -1;
		PACKET_SIZES[9] = -1;
	}
	
}
