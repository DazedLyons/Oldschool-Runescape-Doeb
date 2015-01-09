/* Class91_Sub20_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub20_Sub6 extends Class91_Sub20 {
	static Js5 aClass63_2285;
	public static int anInt2286;
	static int anInt2287;
	public int anInt2288;
	public static final int anInt2289 = 180;
	public static final int anInt2290 = 9;
	static int[] anIntArray2291;
	static byte[][][] aByteArrayArrayArray2292;
	public static final int anInt2293 = 197;
	public static final int anInt2294 = 182;
	public static final int anInt2295 = 131;
	static Class96 aClass96_2296 = new Class96(64);

	void method763(final ByteBuffer class91_sub9, final int i, final int i_0_) {
		try {
			if (5 == i) {
				if (i_0_ != 961133508) {
					anInt2288 = class91_sub9.method686((byte) -45) * -502923237;
				}
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "al.e()");
		}
	}

	Class91_Sub20_Sub6() {
		try {
			anInt2288 = 0;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "al.<init>()");
		}
	}

	void method764(final ByteBuffer class91_sub9, final byte i) {
		try {
			for (;;) {
				final int i_1_ = class91_sub9.readUnsignedByte();
				if (i_1_ == 0) {
					break;
				}
				method763(class91_sub9, i_1_, -910495502);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "al.f()");
		}
	}

	static final void method765(final int i, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final byte i_8_) {
		try {
			if (Class91_Sub20_Sub9.method800(i, 519703378)) {
				Class91_Sub20_Sub2.method735(Class91_Sub18.aClass91_Sub18ArrayArray1962[i], -1, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, (byte) 109);
			}
		} catch (final RuntimeException var8) {
			throw Class102.method1086(var8, "al.ct()");
		}
	}

	static byte[] method766(final byte[] is, final int i) {
		byte[] is_9_;
		try {
			final int i_10_ = is.length;
			final byte[] is_11_ = new byte[i_10_];
			System.arraycopy(is, 0, is_11_, 0, i_10_);
			is_9_ = is_11_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "al.f()");
		}
		return is_9_;
	}

	static final int method767(final int i) {
		int i_12_;
		try {
			if (Class91_Sub20_Sub14_Sub4.aClass108_2769.aBoolean1401) {
				return -1723088013 * Class100.anInt1248;
			}
			int i_13_ = 3;
			if (234823659 * Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 < 310) {
				int i_14_ = -393490213 * Class101.anInt1288 >> 7;
				int i_15_ = 2015226289 * Class105.anInt1365 >> 7;
				final int i_16_ = 107578049 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 >> 7;
				final int i_17_ = Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 * -668540675 >> 7;
				if ((Class102.aByteArrayArrayArray1299[Class100.anInt1248 * -1723088013][i_14_][i_15_] & 0x4) != 0) {
					i_13_ = -1723088013 * Class100.anInt1248;
				}
				int i_18_;
				if (i_16_ > i_14_) {
					i_18_ = i_16_ - i_14_;
				} else {
					i_18_ = i_14_ - i_16_;
				}
				int i_19_;
				if (i_17_ > i_15_) {
					i_19_ = i_17_ - i_15_;
				} else {
					i_19_ = i_15_ - i_17_;
				}
				if (i_18_ > i_19_) {
					final int i_20_ = 65536 * i_19_ / i_18_;
					int i_21_ = 32768;
					while (i_16_ != i_14_) {
						if (i_14_ < i_16_) {
							i_14_++;
						} else if (i_14_ > i_16_) {
							i_14_--;
						}
						if ((Class102.aByteArrayArrayArray1299[Class100.anInt1248 * -1723088013][i_14_][i_15_] & 0x4) != 0) {
							i_13_ = Class100.anInt1248 * -1723088013;
						}
						i_21_ += i_20_;
						if (i_21_ >= 65536) {
							i_21_ -= 65536;
							if (i_15_ < i_17_) {
								i_15_++;
							} else if (i_15_ > i_17_) {
								i_15_--;
							}
							if ((Class102.aByteArrayArrayArray1299[Class100.anInt1248 * -1723088013][i_14_][i_15_] & 0x4) != 0) {
								i_13_ = -1723088013 * Class100.anInt1248;
							}
						}
					}
				} else {
					final int i_22_ = i_18_ * 65536 / i_19_;
					int i_23_ = 32768;
					while (i_15_ != i_17_) {
						if (i_15_ < i_17_) {
							i_15_++;
						} else if (i_15_ > i_17_) {
							i_15_--;
						}
						if ((Class102.aByteArrayArrayArray1299[-1723088013 * Class100.anInt1248][i_14_][i_15_] & 0x4) != 0) {
							i_13_ = -1723088013 * Class100.anInt1248;
						}
						i_23_ += i_22_;
						if (i_23_ >= 65536) {
							i_23_ -= 65536;
							if (i_14_ < i_16_) {
								i_14_++;
							} else if (i_14_ > i_16_) {
								i_14_--;
							}
							if ((Class102.aByteArrayArrayArray1299[-1723088013 * Class100.anInt1248][i_14_][i_15_] & 0x4) != 0) {
								i_13_ = Class100.anInt1248 * -1723088013;
							}
						}
					}
				}
			}
			if ((Class102.aByteArrayArrayArray1299[Class100.anInt1248 * -1723088013][107578049 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 >> 7][-668540675 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 >> 7] & 0x4) != 0) {
				i_13_ = Class100.anInt1248 * -1723088013;
			}
			i_12_ = i_13_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "al.al()");
		}
		return i_12_;
	}
}
