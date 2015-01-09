/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class8 {
	static int[] anIntArray116;
	int anInt117 = 0;
	Class13 aClass13_118;
	Class13 aClass13_119;
	Class13 aClass13_120;
	Class13 aClass13_121;
	static int[] anIntArray122;
	Class13 aClass13_123;
	int[] anIntArray124 = new int[5];
	int[] anIntArray125 = new int[5];
	int[] anIntArray126 = new int[5];
	int anInt127 = 0;
	int anInt128 = 100;
	Class9 aClass9_129;
	Class13 aClass13_130;
	int anInt131 = 500;
	static int[] anIntArray132;
	Class13 aClass13_133;
	static int[] anIntArray134;
	Class13 aClass13_135;
	static final double aDouble136 = 1.0057929410678534;
	static int[] anIntArray137 = new int[32768];
	Class13 aClass13_138;
	static int[] anIntArray139;
	static int[] anIntArray140;
	static int[] anIntArray141;

	static {
		final Random random = new Random(0L);
		for (int i = 0; i < 32768; i++) {
			anIntArray137[i] = (random.nextInt() & 0x2) - 1;
		}
		anIntArray140 = new int[32768];
		for (int i = 0; i < 32768; i++) {
			anIntArray140[i] = (int) (Math.sin(i / 5215.1903) * 16384.0);
		}
		anIntArray134 = new int[220500];
		anIntArray116 = new int[5];
		anIntArray122 = new int[5];
		anIntArray139 = new int[5];
		anIntArray132 = new int[5];
		anIntArray141 = new int[5];
	}

	final int method155(final int i, final int i_0_, final int i_1_) {
		return i_1_ == 1 ? (i & 0x7fff) < 16384 ? i_0_ : -i_0_ : i_1_ == 2 ? anIntArray140[i & 0x7fff] * i_0_ >> 14 : i_1_ == 3 ? ((i & 0x7fff) * i_0_ >> 14) - i_0_ : i_1_ == 4 ? anIntArray137[i / 2607 & 0x7fff] * i_0_ : 0;
	}

	final int[] method156(final int i, final int i_2_) {
		Class50.method371(anIntArray134, 0, i);
		if (i_2_ < 10) {
			return anIntArray134;
		}
		final double d = i / (i_2_ + 0.0);
		this.aClass13_135.method170();
		this.aClass13_138.method170();
		int i_3_ = 0;
		int i_4_ = 0;
		int i_5_ = 0;
		if (this.aClass13_118 != null) {
			this.aClass13_118.method170();
			this.aClass13_119.method170();
			i_3_ = (int) ((this.aClass13_118.anInt190 - this.aClass13_118.anInt196) * 32.768 / d);
			i_4_ = (int) (this.aClass13_118.anInt196 * 32.768 / d);
		}
		int i_6_ = 0;
		int i_7_ = 0;
		int i_8_ = 0;
		if (this.aClass13_120 != null) {
			this.aClass13_120.method170();
			this.aClass13_121.method170();
			i_6_ = (int) ((this.aClass13_120.anInt190 - this.aClass13_120.anInt196) * 32.768 / d);
			i_7_ = (int) (this.aClass13_120.anInt196 * 32.768 / d);
		}
		for (int i_9_ = 0; i_9_ < 5; i_9_++) {
			if (this.anIntArray124[i_9_] != 0) {
				anIntArray116[i_9_] = 0;
				anIntArray122[i_9_] = (int) (this.anIntArray126[i_9_] * d);
				anIntArray139[i_9_] = (this.anIntArray124[i_9_] << 14) / 100;
				anIntArray132[i_9_] = (int) ((this.aClass13_135.anInt190 - this.aClass13_135.anInt196) * 32.768 * Math.pow(1.0057929410678534, this.anIntArray125[i_9_]) / d);
				anIntArray141[i_9_] = (int) (this.aClass13_135.anInt196 * 32.768 / d);
			}
		}
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
			int i_11_ = this.aClass13_135.method168(i);
			int i_12_ = this.aClass13_138.method168(i);
			if (this.aClass13_118 != null) {
				final int i_13_ = this.aClass13_118.method168(i);
				final int i_14_ = this.aClass13_119.method168(i);
				i_11_ += method155(i_5_, i_14_, this.aClass13_118.anInt189) >> 1;
				i_5_ += (i_13_ * i_3_ >> 16) + i_4_;
			}
			if (this.aClass13_120 != null) {
				final int i_15_ = this.aClass13_120.method168(i);
				final int i_16_ = this.aClass13_121.method168(i);
				i_12_ = i_12_ * ((method155(i_8_, i_16_, this.aClass13_120.anInt189) >> 1) + 32768) >> 15;
				i_8_ += (i_15_ * i_6_ >> 16) + i_7_;
			}
			for (int i_17_ = 0; i_17_ < 5; i_17_++) {
				if (this.anIntArray124[i_17_] != 0) {
					final int i_18_ = i_10_ + anIntArray122[i_17_];
					if (i_18_ < i) {
						anIntArray134[i_18_] += method155(anIntArray116[i_17_], i_12_ * anIntArray139[i_17_] >> 15, this.aClass13_135.anInt189);
						anIntArray116[i_17_] += (i_11_ * anIntArray132[i_17_] >> 16) + anIntArray141[i_17_];
					}
				}
			}
		}
		if (this.aClass13_133 != null) {
			this.aClass13_133.method170();
			this.aClass13_123.method170();
			int i_19_ = 0;
			boolean bool = true;
			for (int i_20_ = 0; i_20_ < i; i_20_++) {
				final int i_21_ = this.aClass13_133.method168(i);
				final int i_22_ = this.aClass13_123.method168(i);
				int i_23_;
				if (bool) {
					i_23_ = this.aClass13_133.anInt196 + ((this.aClass13_133.anInt190 - this.aClass13_133.anInt196) * i_21_ >> 8);
				} else {
					i_23_ = this.aClass13_133.anInt196 + ((this.aClass13_133.anInt190 - this.aClass13_133.anInt196) * i_22_ >> 8);
				}
				i_19_ += 256;
				if (i_19_ >= i_23_) {
					i_19_ = 0;
					bool = !bool;
				}
				if (bool) {
					anIntArray134[i_20_] = 0;
				}
			}
		}
		if (this.anInt127 > 0 && this.anInt128 > 0) {
			final int i_24_ = (int) (this.anInt127 * d);
			for (int i_25_ = i_24_; i_25_ < i; i_25_++) {
				anIntArray134[i_25_] += anIntArray134[i_25_ - i_24_] * this.anInt128 / 100;
			}
		}
		if (this.aClass9_129.anIntArray143[0] > 0 || this.aClass9_129.anIntArray143[1] > 0) {
			this.aClass13_130.method170();
			int i_26_ = this.aClass13_130.method168(i + 1);
			int i_27_ = this.aClass9_129.method160(0, i_26_ / 65536.0F);
			int i_28_ = this.aClass9_129.method160(1, i_26_ / 65536.0F);
			if (i >= i_27_ + i_28_) {
				int i_29_ = 0;
				int i_30_ = i_28_;
				if (i_28_ > i - i_27_) {
					i_30_ = i - i_27_;
				}
				for (/**/; i_29_ < i_30_; i_29_++) {
					int i_31_ = (int) ((long) anIntArray134[i_29_ + i_27_] * (long) Class9.anInt150 >> 16);
					for (int i_32_ = 0; i_32_ < i_27_; i_32_++) {
						i_31_ += (int) ((long) anIntArray134[i_29_ + i_27_ - 1 - i_32_] * (long) Class9.anIntArrayArray142[0][i_32_] >> 16);
					}
					for (int i_33_ = 0; i_33_ < i_29_; i_33_++) {
						i_31_ -= (int) ((long) anIntArray134[i_29_ - 1 - i_33_] * (long) Class9.anIntArrayArray142[1][i_33_] >> 16);
					}
					anIntArray134[i_29_] = i_31_;
					i_26_ = this.aClass13_130.method168(i + 1);
				}
				i_30_ = 128;
				for (;;) {
					if (i_30_ > i - i_27_) {
						i_30_ = i - i_27_;
					}
					for (/**/; i_29_ < i_30_; i_29_++) {
						int i_34_ = (int) ((long) anIntArray134[i_29_ + i_27_] * (long) Class9.anInt150 >> 16);
						for (int var18 = 0; var18 < i_27_; var18++) {
							i_34_ += (int) ((long) anIntArray134[i_29_ + i_27_ - 1 - var18] * (long) Class9.anIntArrayArray142[0][var18] >> 16);
						}
						for (int var18 = 0; var18 < i_28_; var18++) {
							i_34_ -= (int) ((long) anIntArray134[i_29_ - 1 - var18] * (long) Class9.anIntArrayArray142[1][var18] >> 16);
						}
						anIntArray134[i_29_] = i_34_;
						i_26_ = this.aClass13_130.method168(i + 1);
					}
					if (i_29_ >= i - i_27_) {
						for (/**/; i_29_ < i; i_29_++) {
							int i_35_ = 0;
							for (int var18 = i_29_ + i_27_ - i; var18 < i_27_; var18++) {
								i_35_ += (int) ((long) anIntArray134[i_29_ + i_27_ - 1 - var18] * (long) Class9.anIntArrayArray142[0][var18] >> 16);
							}
							for (int var18 = 0; var18 < i_28_; var18++) {
								i_35_ -= (int) ((long) anIntArray134[i_29_ - 1 - var18] * (long) Class9.anIntArrayArray142[1][var18] >> 16);
							}
							anIntArray134[i_29_] = i_35_;
							this.aClass13_130.method168(i + 1);
						}
						break;
					}
					i_27_ = this.aClass9_129.method160(0, i_26_ / 65536.0F);
					i_28_ = this.aClass9_129.method160(1, i_26_ / 65536.0F);
					i_30_ += 128;
				}
			}
		}
		for (int i_36_ = 0; i_36_ < i; i_36_++) {
			if (anIntArray134[i_36_] < -32768) {
				anIntArray134[i_36_] = -32768;
			}
			if (anIntArray134[i_36_] > 32767) {
				anIntArray134[i_36_] = 32767;
			}
		}
		return anIntArray134;
	}

	final void method157(final ByteBuffer class91_sub9) {
		this.aClass13_135 = new Class13();
		this.aClass13_135.method169(class91_sub9);
		this.aClass13_138 = new Class13();
		this.aClass13_138.method169(class91_sub9);
		int i = class91_sub9.readUnsignedByte();
		if (i != 0) {
			class91_sub9.currentOffset -= 565881095;
			this.aClass13_118 = new Class13();
			this.aClass13_118.method169(class91_sub9);
			this.aClass13_119 = new Class13();
			this.aClass13_119.method169(class91_sub9);
		}
		i = class91_sub9.readUnsignedByte();
		if (i != 0) {
			class91_sub9.currentOffset -= 565881095;
			this.aClass13_120 = new Class13();
			this.aClass13_120.method169(class91_sub9);
			this.aClass13_121 = new Class13();
			this.aClass13_121.method169(class91_sub9);
		}
		i = class91_sub9.readUnsignedByte();
		if (i != 0) {
			class91_sub9.currentOffset -= 565881095;
			this.aClass13_133 = new Class13();
			this.aClass13_133.method169(class91_sub9);
			this.aClass13_123 = new Class13();
			this.aClass13_123.method169(class91_sub9);
		}
		for (int i_37_ = 0; i_37_ < 10; i_37_++) {
			final int i_38_ = class91_sub9.method649(-2073066475);
			if (i_38_ == 0) {
				break;
			}
			this.anIntArray124[i_37_] = i_38_;
			this.anIntArray125[i_37_] = class91_sub9.method648((byte) -103);
			this.anIntArray126[i_37_] = class91_sub9.method649(-1919360698);
		}
		this.anInt127 = class91_sub9.method649(-1657473976);
		this.anInt128 = class91_sub9.method649(-912471782);
		this.anInt131 = class91_sub9.method686((byte) -35);
		this.anInt117 = class91_sub9.method686((byte) -99);
		this.aClass9_129 = new Class9();
		this.aClass13_130 = new Class13();
		this.aClass9_129.method161(class91_sub9, this.aClass13_130);
	}

	Class8() {
		/* empty */
	}
}
