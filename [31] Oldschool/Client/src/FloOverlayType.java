/* Class91_Sub20_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class FloOverlayType extends Class91_Sub20 {
	public int anInt2237;
	static final int anInt2238 = 100;
	public int anInt2239;
	public int anInt2240;
	public boolean aBoolean2241;
	public int anInt2242;
	public int anInt2243;
	public int anInt2244;
	static Class96 aClass96_2245 = new Class96(64);
	public static final int anInt2246 = 73;
	public int anInt2247;
	public int anInt2248;
	static final int anInt2249 = 100;
	public static final int anInt2250 = 224;
	static Js5 overlayJs5;
	static final int anInt2252 = 51;
	public int anInt2253;

	void method743(final int i) {
		try {
			if (anInt2242 * -703034801 != -1) {
				method746(-703034801 * anInt2242, 1227819451);
				anInt2237 = -1263028691 * anInt2243;
				anInt2247 = anInt2244 * 1198974073;
				anInt2248 = 1905798891 * anInt2253;
			}
			method746(anInt2239 * 1782679731, 1339450559);
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "af.f()");
		}
	}

	void decode(final ByteBuffer class91_sub9, final int i, final int i_0_) {
		try {
			for (;;) {
				final int i_1_ = class91_sub9.readUnsignedByte();
				if (i_1_ == 0) {
					break;
				}
				decode(class91_sub9, i_1_, i, 1674498007);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "af.e()");
		}
	}
	void decode(final ByteBuffer class91_sub9, final int i, final int i_2_, final int i_3_) {
		try {
			if (1 == i) {
				anInt2239 = class91_sub9.read3Bytes() * -1614518661;
			} else if (2 == i) {
				anInt2240 = class91_sub9.readUnsignedByte() * -753918155;
			} else if (i == 5) {
				aBoolean2241 = false;
			} else if (7 == i) {
				if (i_3_ > -272921537) {
					anInt2242 = class91_sub9.read3Bytes() * 2025213103;
				}
			} else if (8 == i && i_3_ <= -272921537) {
				throw new IllegalStateException();
			}
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "af.t()");
		}
	}

	void method746(final int i, final int i_4_) {
		try {
			final double d = (i >> 16 & 0xff) / 256.0;
			final double d_5_ = (i >> 8 & 0xff) / 256.0;
			final double d_6_ = (i & 0xff) / 256.0;
			double d_7_ = d;
			if (d_5_ < d) {
				d_7_ = d_5_;
			}
			if (d_6_ < d_7_) {
				if (i_4_ == -1435688457) {
					return;
				}
				d_7_ = d_6_;
			}
			double d_8_ = d;
			if (d_5_ > d) {
				d_8_ = d_5_;
			}
			if (d_6_ > d_8_) {
				if (i_4_ == -1435688457) {
					return;
				}
				d_8_ = d_6_;
			}
			double d_9_ = 0.0;
			double d_10_ = 0.0;
			final double d_11_ = (d_8_ + d_7_) / 2.0;
			if (d_7_ != d_8_) {
				if (d_11_ < 0.5) {
					d_10_ = (d_8_ - d_7_) / (d_8_ + d_7_);
				}
				if (d_11_ >= 0.5) {
					d_10_ = (d_8_ - d_7_) / (2.0 - d_8_ - d_7_);
				}
				if (d == d_8_) {
					d_9_ = (d_5_ - d_6_) / (d_8_ - d_7_);
				} else if (d_5_ == d_8_) {
					d_9_ = 2.0 + (d_6_ - d) / (d_8_ - d_7_);
				} else if (d_8_ == d_6_) {
					d_9_ = (d - d_5_) / (d_8_ - d_7_) + 4.0;
				}
			}
			d_9_ /= 6.0;
			anInt2243 = 233313003 * (int) (256.0 * d_9_);
			anInt2244 = -494634339 * (int) (256.0 * d_10_);
			anInt2253 = (int) (d_11_ * 256.0) * 673012507;
			if (anInt2244 * -1712989259 < 0) {
				if (i_4_ == -1435688457) {
					return;
				}
				anInt2244 = 0;
			} else if (anInt2244 * -1712989259 > 255) {
				anInt2244 = -1577704861;
			}
			if (1036355347 * anInt2253 < 0) {
				if (i_4_ != -1435688457) {
					anInt2253 = 0;
				}
			} else if (1036355347 * anInt2253 > 255) {
				if (i_4_ != -1435688457) {
					anInt2253 = -180502555;
				}
			}
		} catch (final RuntimeException var19) {
			throw Class102.method1086(var19, "af.d()");
		}
	}

	FloOverlayType() {
		try {
			anInt2239 = 0;
			anInt2240 = 753918155;
			aBoolean2241 = true;
			anInt2242 = -2025213103;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "af.<init>()");
		}
	}

	static String method747(final int i, final int i_12_) {
		String string;
		try {
			string = new StringBuilder("<img=").append(i).append(">").toString();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "af.i()");
		}
		return string;
	}
}
