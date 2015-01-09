/* Class91_Sub20_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class FloUnderlayType extends Class91_Sub20 {
	public static final int anInt2412 = 57;
	public int anInt2413;
	static Js5 underlayJs5;
	public int anInt2415;
	public int anInt2416;
	public int anInt2417;
	static int[] anIntArray2418;
	static final int anInt2419 = 68;
	int anInt2420;
	static Class96 aClass96_2421 = new Class96(64);
	static byte aByte2422;

	void method801(final ByteBuffer class91_sub9, final int i, final int i_0_, final int i_1_) {
		try {
			if (1 == i) {
				this.anInt2420 = class91_sub9.read3Bytes() * 1102744995;
			}
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "av.t()");
		}
	}

	void method802(final byte i) {
		try {
			method804(194973195 * this.anInt2420, (byte) -19);
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "av.f()");
		}
	}

	void method803(final ByteBuffer class91_sub9, final int i, final int i_2_) {
		try {
			for (;;) {
				final int i_3_ = class91_sub9.readUnsignedByte();
				if (i_3_ == 0) {
					if (i_2_ >= -390429273) {
						/* empty */
					}
					break;
				}
				method801(class91_sub9, i_3_, i, -1932555659);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "av.e()");
		}
	}

	void method804(final int i, final byte i_4_) {
		try {
			final double d = (i >> 16 & 0xff) / 256.0;
			final double d_5_ = (i >> 8 & 0xff) / 256.0;
			final double d_6_ = (i & 0xff) / 256.0;
			double d_7_ = d;
			if (d_5_ < d) {
				d_7_ = d_5_;
			}
			if (d_6_ < d_7_) {
				d_7_ = d_6_;
			}
			double d_8_ = d;
			if (d_5_ > d) {
				d_8_ = d_5_;
			}
			if (d_6_ > d_8_) {
				if (i_4_ >= 64) {
					return;
				}
				d_8_ = d_6_;
			}
			double d_9_ = 0.0;
			double d_10_ = 0.0;
			final double d_11_ = (d_7_ + d_8_) / 2.0;
			if (d_7_ != d_8_) {
				if (d_11_ < 0.5) {
					d_10_ = (d_8_ - d_7_) / (d_8_ + d_7_);
				}
				if (d_11_ >= 0.5) {
					d_10_ = (d_8_ - d_7_) / (2.0 - d_8_ - d_7_);
				}
				if (d_8_ == d) {
					if (i_4_ >= 64) {
						return;
					}
					d_9_ = (d_5_ - d_6_) / (d_8_ - d_7_);
				} else if (d_5_ == d_8_) {
					d_9_ = (d_6_ - d) / (d_8_ - d_7_) + 2.0;
				} else if (d_6_ == d_8_) {
					d_9_ = (d - d_5_) / (d_8_ - d_7_) + 4.0;
				}
			}
			d_9_ /= 6.0;
			anInt2416 = (int) (256.0 * d_10_) * 955699941;
			anInt2417 = (int) (256.0 * d_11_) * -1934367893;
			if (-1760716051 * anInt2416 < 0) {
				if (i_4_ >= 64) {
					return;
				}
				anInt2416 = 0;
			} else if (anInt2416 * -1760716051 > 255) {
				anInt2416 = -1109650917;
			}
			if (-131321533 * anInt2417 < 0) {
				anInt2417 = 0;
			} else if (anInt2417 * -131321533 > 255) {
				anInt2417 = 657426325;
			}
			if (d_11_ > 0.5) {
				anInt2413 = 1685304061 * (int) (512.0 * (1.0 - d_11_) * d_10_);
			} else {
				anInt2413 = 1685304061 * (int) (512.0 * d_10_ * d_11_);
			}
			if (205355605 * anInt2413 < 1) {
				if (i_4_ >= 64) {
					return;
				}
				anInt2413 = 1685304061;
			}
			anInt2415 = 986604175 * (int) (d_9_ * (anInt2413 * 205355605));
		} catch (final RuntimeException var19) {
			throw Class102.method1086(var19, "av.d()");
		}
	}

	FloUnderlayType() {
		try {
			this.anInt2420 = 0;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "av.<init>()");
		}
	}

	public static void method805(final int i) {
		try {
			Class91_Sub20_Sub6.aClass96_2296.method1070();
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "av.t()");
		}
	}
}
