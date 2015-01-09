/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class19 {
	static final int anInt252 = 7;
	static final int anInt253 = 6;
	int anInt254;
	static Class91_Sub20_Sub13_Sub1[] aClass91_Sub20_Sub13_Sub1Array255;
	public static final int anInt256 = 1;
	int[][] anIntArrayArray257;
	static final int anInt258 = 14;
	static Class20 aClass20_259;
	static int anInt260;
	int anInt261;
	public static final int anInt262 = 101;

	static final void method189(final byte i) {
		try {
			final int i_0_ = 1661413593 * Class91_Sub22.anInt2111;
			final int i_1_ = Class4.anInt63 * -1370045055;
			final int i_2_ = Class20.anInt273 * -1981297691;
			final int i_3_ = -1969918029 * anInt260;
			Class91_Sub20_Sub13.method828(i_0_, i_1_, i_2_, i_3_, 6116423);
			Class91_Sub20_Sub13.method828(i_0_ + 1, i_1_ + 1, i_2_ - 2, 16, 0);
			Class91_Sub20_Sub13.method834(i_0_ + 1, i_1_ + 18, i_2_ - 2, i_3_ - 19, 0);
			Class91_Sub20_Sub2.aClass91_Sub20_Sub13_Sub4_Sub1_2235.method906(Class75.aString975, 3 + i_0_, 14 + i_1_, 6116423, -1);
			final int i_5_ = Class12.anInt173 * -695750341;
			final int i_6_ = -855709389 * Class12.anInt178;
			for (int i_7_ = 0; i_7_ < 1335574821 * client.anInt1585; i_7_++) {
				if (i <= 1) {
					return;
				}
				final int i_8_ = (1335574821 * client.anInt1585 - 1 - i_7_) * 15 + 31 + i_1_;
				int i_9_ = 16777215;
				if (i_5_ > i_0_ && i_5_ < i_2_ + i_0_ && i_6_ > i_8_ - 13 && i_6_ < i_8_ + 3) {
					i_9_ = 16776960;
				}
				final Class91_Sub20_Sub13_Sub4_Sub1 class91_sub20_sub13_sub4_sub1 = Class91_Sub20_Sub2.aClass91_Sub20_Sub13_Sub4_Sub1_2235;
				String string;
				if (client.aStringArray1591[i_7_].length() > 0) {
					string = new StringBuilder(client.aStringArray1638[i_7_]).append(Class75.aString1000).append(client.aStringArray1591[i_7_]).toString();
				} else {
					string = client.aStringArray1638[i_7_];
				}
				class91_sub20_sub13_sub4_sub1.method906(string, i_0_ + 3, i_8_, i_9_, 0);
			}
			final int i_10_ = Class91_Sub22.anInt2111 * 1661413593;
			final int i_11_ = -1370045055 * Class4.anInt63;
			final int i_12_ = Class20.anInt273 * -1981297691;
			final int i_13_ = anInt260 * -1969918029;
			for (int i_14_ = 0; i_14_ < client.anInt1456 * -437440627; i_14_++) {
				if (client.anIntArray1608[i_14_] + client.anIntArray1648[i_14_] > i_10_ && client.anIntArray1648[i_14_] < i_10_ + i_12_ && client.anIntArray1649[i_14_] + client.anIntArray1651[i_14_] > i_11_ && client.anIntArray1649[i_14_] < i_13_ + i_11_) {
					client.aBooleanArray1646[i_14_] = true;
				}
			}
		} catch (final RuntimeException var13) {
			throw Class102.method1086(var13, "bp.bm()");
		}
	}

	public Class19(int i, int i_15_) {
		try {
			if (i != i_15_) {
				int i_16_ = i;
				int i_17_ = i_15_;
				if (i_15_ > i) {
					i_16_ = i_15_;
					i_17_ = i;
				}
				int i_18_;
				for (/**/; i_17_ != 0; i_17_ = i_18_) {
					i_18_ = i_16_ % i_17_;
					i_16_ = i_17_;
				}
				i /= i_16_;
				i_15_ /= i_16_;
				this.anInt261 = 491087571 * i;
				this.anInt254 = -952826343 * i_15_;
				this.anIntArrayArray257 = new int[i][14];
				for (i_18_ = 0; i_18_ < i; i_18_++) {
					final int[] is = this.anIntArrayArray257[i_18_];
					final double d = 6.0 + (double) i_18_ / (double) i;
					int i_19_ = (int) Math.floor(1.0 + (d - 7.0));
					if (i_19_ < 0) {
						i_19_ = 0;
					}
					int i_20_ = (int) Math.ceil(7.0 + d);
					if (i_20_ > 14) {
						i_20_ = 14;
					}
					final double d_21_ = (double) i_15_ / (double) i;
					for (/**/; i_19_ < i_20_; i_19_++) {
						final double d_22_ = (i_19_ - d) * 3.141592653589793;
						double d_23_ = d_21_;
						if (d_22_ < -1.0E-4 || d_22_ > 1.0E-4) {
							d_23_ = d_21_ * (Math.sin(d_22_) / d_22_);
						}
						d_23_ *= 0.54 + 0.46 * Math.cos(0.2243994752564138 * (i_19_ - d));
						is[i_19_] = (int) Math.floor(0.5 + 65536.0 * d_23_);
					}
				}
			}
		} catch (final RuntimeException var19) {
			throw Class102.method1086(var19, "bp.<init>()");
		}
	}

	byte[] method190(byte[] is, final int i) {
		byte[] is_24_;
		try {
			if (this.anIntArrayArray257 != null) {
				final int i_25_ = 14 + (int) ((long) (1654060585 * this.anInt254) * (long) is.length / (this.anInt261 * -1273503397));
				final int[] is_26_ = new int[i_25_];
				int i_27_ = 0;
				int i_28_ = 0;
				for (final byte i_30_ : is) {
					final int[] is_31_ = this.anIntArrayArray257[i_28_];
					for (int i_32_ = 0; i_32_ < 14; i_32_++) {
						is_26_[i_27_ + i_32_] += is_31_[i_32_] * i_30_;
					}
					i_28_ += 1654060585 * this.anInt254;
					final int i_33_ = i_28_ / (-1273503397 * this.anInt261);
					i_27_ += i_33_;
					i_28_ -= -1273503397 * this.anInt261 * i_33_;
				}
				is = new byte[i_25_];
				for (int i_34_ = 0; i_34_ < i_25_; i_34_++) {
					final int i_35_ = 32768 + is_26_[i_34_] >> 16;
					if (i_35_ < -128) {
						is[i_34_] = (byte) -128;
					} else if (i_35_ > 127) {
						is[i_34_] = (byte) 127;
					} else {
						is[i_34_] = (byte) i_35_;
					}
				}
			}
			is_24_ = is;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bp.i()");
		}
		return is_24_;
	}

	int method191(int i, final int i_36_) {
		int i_37_;
		try {
			if (this.anIntArrayArray257 != null) {
				i = (int) ((long) i * (long) (1654060585 * this.anInt254) / (-1273503397 * this.anInt261)) + 6;
			}
			i_37_ = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bp.f()");
		}
		return i_37_;
	}

	int method192(int i, final byte i_38_) {
		int i_39_;
		try {
			if (this.anIntArrayArray257 != null) {
				i = (int) ((long) i * (long) (this.anInt254 * 1654060585) / (-1273503397 * this.anInt261));
			}
			i_39_ = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bp.w()");
		}
		return i_39_;
	}

	static int method193(final int i, final int i_40_, final byte i_41_) {
		try {
			final long l = (i << 16) + i_40_;
			if (Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177 != null && l == Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177.aLong1192) {
				return Class23.aClass91_Sub9_290.currentOffset * -91282747 / (Class23.aClass91_Sub9_290.buffer.length - Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177.aByte2500) + 1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bp.d()");
		}
		return 0;
	}
}
