/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class31 {
	int[] anIntArray358;
	int[] anIntArray359;
	static int[] anIntArray360 = new int[500];
	static int[] anIntArray361 = new int[500];
	Class91_Sub8 aClass91_Sub8_362 = null;
	int anInt363 = -1;
	static int[] anIntArray364 = new int[500];
	int[] anIntArray365;
	int[] anIntArray366;
	static int[] anIntArray367 = new int[500];
	boolean aBoolean368 = false;

	Class31(final byte[] is, final Class91_Sub8 class91_sub8) {
		this.aClass91_Sub8_362 = class91_sub8;
		final ByteBuffer class91_sub9 = new ByteBuffer(is);
		final ByteBuffer class91_sub9_0_ = new ByteBuffer(is);
		class91_sub9.currentOffset = 1131762190;
		final int i = class91_sub9.readUnsignedByte();
		int i_1_ = -1;
		int i_2_ = 0;
		class91_sub9_0_.currentOffset = (class91_sub9.currentOffset * -1128893257 + i) * 565881095;
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			final int i_4_ = class91_sub9.readUnsignedByte();
			if (i_4_ > 0) {
				if (this.aClass91_Sub8_362.anIntArray1849[i_3_] != 0) {
					for (int i_5_ = i_3_ - 1; i_5_ > i_1_; i_5_--) {
						if (this.aClass91_Sub8_362.anIntArray1849[i_5_] == 0) {
							anIntArray360[i_2_] = i_5_;
							anIntArray367[i_2_] = 0;
							anIntArray364[i_2_] = 0;
							anIntArray361[i_2_] = 0;
							i_2_++;
							break;
						}
					}
				}
				anIntArray360[i_2_] = i_3_;
				short var11 = 0;
				if (this.aClass91_Sub8_362.anIntArray1849[i_3_] == 3) {
					var11 = (short) 128;
				}
				if ((i_4_ & 0x1) != 0) {
					anIntArray367[i_2_] = class91_sub9_0_.method648((byte) -116);
				} else {
					anIntArray367[i_2_] = var11;
				}
				if ((i_4_ & 0x2) != 0) {
					anIntArray364[i_2_] = class91_sub9_0_.method648((byte) -26);
				} else {
					anIntArray364[i_2_] = var11;
				}
				if ((i_4_ & 0x4) != 0) {
					anIntArray361[i_2_] = class91_sub9_0_.method648((byte) -30);
				} else {
					anIntArray361[i_2_] = var11;
				}
				i_1_ = i_3_;
				i_2_++;
				if (this.aClass91_Sub8_362.anIntArray1849[i_3_] == 5) {
					this.aBoolean368 = true;
				}
			}
		}
		if (class91_sub9_0_.currentOffset * -1128893257 != is.length) {
			throw new RuntimeException();
		}
		this.anInt363 = i_2_;
		this.anIntArray358 = new int[i_2_];
		this.anIntArray365 = new int[i_2_];
		this.anIntArray366 = new int[i_2_];
		this.anIntArray359 = new int[i_2_];
		for (int i_6_ = 0; i_6_ < i_2_; i_6_++) {
			this.anIntArray358[i_6_] = anIntArray360[i_6_];
			this.anIntArray365[i_6_] = anIntArray367[i_6_];
			this.anIntArray366[i_6_] = anIntArray364[i_6_];
			this.anIntArray359[i_6_] = anIntArray361[i_6_];
		}
	}
}
