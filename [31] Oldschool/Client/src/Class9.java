/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class9 {
	static int[][] anIntArrayArray142 = new int[2][8];
	int[] anIntArray143 = new int[2];
	static float aFloat144;
	int[][][] anIntArrayArrayArray145 = new int[2][2][4];
	int[] anIntArray146 = new int[2];
	static float[][] aFloatArrayArray147 = new float[2][8];
	int[][][] anIntArrayArrayArray148 = new int[2][2][4];
	static final float aFloat149 = 8.0F;
	static int anInt150;
	static final float aFloat151 = 100.0F;
	static final int anInt152 = 4;
	static final float aFloat153 = 32.703197F;

	float method158(final int i, final int i_0_, final float f) {
		float f_1_ = this.anIntArrayArrayArray145[i][0][i_0_] + f * (this.anIntArrayArrayArray145[i][1][i_0_] - this.anIntArrayArrayArray145[i][0][i_0_]);
		f_1_ *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, -f_1_ / 20.0F);
	}

	static float method159(final float f) {
		final float f_2_ = 32.703197F * (float) Math.pow(2.0, f);
		return f_2_ * 3.1415927F / 11025.0F;
	}

	Class9() {
		/* empty */
	}

	int method160(final int i, final float f) {
		if (i == 0) {
			float f_3_ = this.anIntArray146[0] + (this.anIntArray146[1] - this.anIntArray146[0]) * f;
			f_3_ *= 0.0030517578F;
			aFloat144 = (float) Math.pow(0.1, f_3_ / 20.0F);
			anInt150 = (int) (aFloat144 * 65536.0F);
		}
		if (this.anIntArray143[i] == 0) {
			return 0;
		}
		float f_4_ = method158(i, 0, f);
		aFloatArrayArray147[i][0] = -2.0F * f_4_ * (float) Math.cos(method162(i, 0, f));
		aFloatArrayArray147[i][1] = f_4_ * f_4_;
		for (int i_5_ = 1; i_5_ < this.anIntArray143[i]; i_5_++) {
			f_4_ = method158(i, i_5_, f);
			final float f_6_ = -2.0F * f_4_ * (float) Math.cos(method162(i, i_5_, f));
			final float f_7_ = f_4_ * f_4_;
			aFloatArrayArray147[i][i_5_ * 2 + 1] = aFloatArrayArray147[i][i_5_ * 2 - 1] * f_7_;
			aFloatArrayArray147[i][i_5_ * 2] = aFloatArrayArray147[i][i_5_ * 2 - 1] * f_6_ + aFloatArrayArray147[i][i_5_ * 2 - 2] * f_7_;
			for (int i_8_ = i_5_ * 2 - 1; i_8_ >= 2; i_8_--) {
				aFloatArrayArray147[i][i_8_] += aFloatArrayArray147[i][i_8_ - 1] * f_6_ + aFloatArrayArray147[i][i_8_ - 2] * f_7_;
			}
			aFloatArrayArray147[i][1] += aFloatArrayArray147[i][0] * f_6_ + f_7_;
			aFloatArrayArray147[i][0] += f_6_;
		}
		if (i == 0) {
			for (int i_9_ = 0; i_9_ < this.anIntArray143[0] * 2; i_9_++) {
				aFloatArrayArray147[0][i_9_] *= aFloat144;
			}
		}
		for (int i_10_ = 0; i_10_ < this.anIntArray143[i] * 2; i_10_++) {
			anIntArrayArray142[i][i_10_] = (int) (aFloatArrayArray147[i][i_10_] * 65536.0F);
		}
		return this.anIntArray143[i] * 2;
	}

	final void method161(final ByteBuffer class91_sub9, final Class13 class13) {
		final int i = class91_sub9.readUnsignedByte();
		this.anIntArray143[0] = i >> 4;
		this.anIntArray143[1] = i & 0xf;
		if (i != 0) {
			this.anIntArray146[0] = class91_sub9.method686((byte) -81);
			this.anIntArray146[1] = class91_sub9.method686((byte) -11);
			final int i_11_ = class91_sub9.readUnsignedByte();
			for (int i_12_ = 0; i_12_ < 2; i_12_++) {
				for (int i_13_ = 0; i_13_ < this.anIntArray143[i_12_]; i_13_++) {
					this.anIntArrayArrayArray148[i_12_][0][i_13_] = class91_sub9.method686((byte) -92);
					this.anIntArrayArrayArray145[i_12_][0][i_13_] = class91_sub9.method686((byte) -5);
				}
			}
			for (int i_14_ = 0; i_14_ < 2; i_14_++) {
				for (int i_15_ = 0; i_15_ < this.anIntArray143[i_14_]; i_15_++) {
					if ((i_11_ & 1 << i_14_ * 4 << i_15_) != 0) {
						this.anIntArrayArrayArray148[i_14_][1][i_15_] = class91_sub9.method686((byte) -77);
						this.anIntArrayArrayArray145[i_14_][1][i_15_] = class91_sub9.method686((byte) -123);
					} else {
						this.anIntArrayArrayArray148[i_14_][1][i_15_] = this.anIntArrayArrayArray148[i_14_][0][i_15_];
						this.anIntArrayArrayArray145[i_14_][1][i_15_] = this.anIntArrayArrayArray145[i_14_][0][i_15_];
					}
				}
			}
			if (i_11_ != 0 || this.anIntArray146[1] != this.anIntArray146[0]) {
				class13.method171(class91_sub9);
			}
		} else {
			final int[] var7 = this.anIntArray146;
			this.anIntArray146[1] = 0;
			var7[0] = 0;
		}
	}

	float method162(final int i, final int i_16_, final float f) {
		float f_17_ = this.anIntArrayArrayArray148[i][0][i_16_] + f * (this.anIntArrayArrayArray148[i][1][i_16_] - this.anIntArrayArrayArray148[i][0][i_16_]);
		f_17_ *= 1.2207031E-4F;
		return method159(f_17_);
	}
}
