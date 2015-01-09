/* Class91_Sub9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class91_Sub9_Sub1 extends ByteBuffer {
	static final int anInt2207 = 262144;
	static final int[] anIntArray2208 = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };
	static final int anInt2209 = 25;
	Class48 aClass48_2210;
	static final int anInt2211 = 86;
	int anInt2212;

	public void method689(final int[] is, final byte i) {
		try {
			this.aClass48_2210 = new Class48(is);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dj.i()");
		}
	}

	public void method690(final int i, final int i_0_) {
		try {
			buffer[(currentOffset += 565881095) * -1128893257 - 1] = (byte) (i + this.aClass48_2210.method367(-2085149861));
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dj.w()");
		}
	}

	public int method691(final int i) {
		int i_1_;
		try {
			i_1_ = buffer[(currentOffset += 565881095) * -1128893257 - 1] - this.aClass48_2210.method367(-416749887) & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dj.f()");
		}
		return i_1_;
	}

	public int method692(final int i, final byte i_2_) {
		int i_3_;
		try {
			i_3_ = 8 * i - this.anInt2212 * -1921012087;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dj.p()");
		}
		return i_3_;
	}

	public int method693(int i, final int i_4_) {
		int i_5_;
		try {
			int i_6_ = this.anInt2212 * -1921012087 >> 3;
			int i_7_ = 8 - (-1921012087 * this.anInt2212 & 0x7);
			int i_8_ = 0;
			this.anInt2212 += i * -922474567;
			for (/**/; i > i_7_; i_7_ = 8) {
				i_8_ += (buffer[i_6_++] & anIntArray2208[i_7_]) << i - i_7_;
				i -= i_7_;
			}
			if (i_7_ == i) {
				i_8_ += buffer[i_6_] & anIntArray2208[i_7_];
			} else {
				i_8_ += buffer[i_6_] >> i_7_ - i & anIntArray2208[i];
			}
			i_5_ = i_8_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dj.t()");
		}
		return i_5_;
	}

	public void method694(final byte i) {
		try {
			currentOffset = (7 + -1921012087 * this.anInt2212) / 8 * 565881095;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "dj.d()");
		}
	}

	public void method695(final byte i) {
		try {
			this.anInt2212 = 1811007992 * currentOffset;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "dj.e()");
		}
	}

	public Class91_Sub9_Sub1(final int i) {
		super(i);
	}

	public static Object method696(final byte[] is, final boolean bool, final int i) {
		byte[] is_9_;
		try {
			if (is == null) {
				return null;
			}
			do {
				if (is.length > 136 && !Class42.aBoolean559) {
					Class42_Sub1 class42_sub1;
					try {
						final Class42_Sub1 class42_sub1_10_ = new Class42_Sub1();
						class42_sub1_10_.method349(is, (byte) 1);
						class42_sub1 = class42_sub1_10_;
					} catch (final Throwable throwable) {
						Class42.aBoolean559 = true;
						break;
					}
					return class42_sub1;
				}
			} while (false);
			is_9_ = bool ? Class91_Sub20_Sub6.method766(is, -523542972) : is;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dj.i()");
		}
		return is_9_;
	}

	
}
