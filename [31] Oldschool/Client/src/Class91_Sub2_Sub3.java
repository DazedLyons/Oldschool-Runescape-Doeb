/* Class91_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub2_Sub3 extends Class91_Sub2 {
	static final int anInt2173 = 2;
	Class95 aClass95_2174;
	Class91_Sub2_Sub4 aClass91_Sub2_Sub4_2175;
	static final int anInt2176 = 24624;
	public static Class91_Sub20_Sub16 aClass91_Sub20_Sub16_2177;
	Class91_Sub2_Sub2 aClass91_Sub2_Sub2_2178;

	@Override
	protected void method512(final int[] is, final int i, final int i_0_) {
		this.aClass91_Sub2_Sub2_2178.method498(is, i, i_0_);
		for (Class91_Sub14 class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1062(); class91_sub14 != null; class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1063()) {
			if (!this.aClass91_Sub2_Sub4_2175.method589(class91_sub14, -1107349037)) {
				int i_1_ = i;
				int var5 = i_0_;
				do {
					if (var5 <= class91_sub14.anInt1946 * -1568132749) {
						method566(class91_sub14, is, i_1_, var5, var5 + i_1_, (byte) 9);
						class91_sub14.anInt1946 -= -1286579269 * var5;
						break;
					}
					method566(class91_sub14, is, i_1_, class91_sub14.anInt1946 * -1568132749, var5 + i_1_, (byte) 9);
					i_1_ += class91_sub14.anInt1946 * -1568132749;
					var5 -= class91_sub14.anInt1946 * -1568132749;
				} while (!this.aClass91_Sub2_Sub4_2175.method590(class91_sub14, is, i_1_, var5, -87853318));
			}
		}
	}

	@Override
	protected Class91_Sub2 method502() {
		final Class91_Sub14 class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1062();
		return class91_sub14 == null ? null : class91_sub14.aClass91_Sub2_Sub1_1927 != null ? (Class91_Sub2) class91_sub14.aClass91_Sub2_Sub1_1927 : method515();
	}

	@Override
	protected void method498(final int[] is, final int i, final int i_2_) {
		try {
			this.aClass91_Sub2_Sub2_2178.method498(is, i, i_2_);
			for (Class91_Sub14 class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1062(); class91_sub14 != null; class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1063()) {
				if (!this.aClass91_Sub2_Sub4_2175.method589(class91_sub14, -1107349037)) {
					int i_3_ = i;
					int i_4_ = i_2_;
					do {
						if (i_4_ <= class91_sub14.anInt1946 * -1568132749) {
							method566(class91_sub14, is, i_3_, i_4_, i_4_ + i_3_, (byte) 9);
							class91_sub14.anInt1946 -= -1286579269 * i_4_;
							break;
						}
						method566(class91_sub14, is, i_3_, class91_sub14.anInt1946 * -1568132749, i_4_ + i_3_, (byte) 9);
						i_3_ += class91_sub14.anInt1946 * -1568132749;
						i_4_ -= class91_sub14.anInt1946 * -1568132749;
					} while (!this.aClass91_Sub2_Sub4_2175.method590(class91_sub14, is, i_3_, i_4_, -1455384994));
				}
			}
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "ev.x()");
		}
	}

	@Override
	protected int method501() {
		return 0;
	}

	@Override
	protected void method514(final int[] is, final int i, final int i_5_) {
		this.aClass91_Sub2_Sub2_2178.method498(is, i, i_5_);
		for (Class91_Sub14 class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1062(); class91_sub14 != null; class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1063()) {
			if (!this.aClass91_Sub2_Sub4_2175.method589(class91_sub14, -1107349037)) {
				int i_6_ = i;
				int var5 = i_5_;
				do {
					if (var5 <= class91_sub14.anInt1946 * -427867512) {
						method566(class91_sub14, is, i_6_, var5, var5 + i_6_, (byte) 9);
						class91_sub14.anInt1946 -= -1286579269 * var5;
						break;
					}
					method566(class91_sub14, is, i_6_, class91_sub14.anInt1946 * -861221607, var5 + i_6_, (byte) 9);
					i_6_ += class91_sub14.anInt1946 * 1545019088;
					var5 -= class91_sub14.anInt1946 * 986927207;
				} while (!this.aClass91_Sub2_Sub4_2175.method590(class91_sub14, is, i_6_, var5, -1406477703));
			}
		}
	}

	@Override
	protected void method505(final int i) {
		try {
			this.aClass91_Sub2_Sub2_2178.method505(i);
			for (Class91_Sub14 class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1062(); class91_sub14 != null; class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1063()) {
				if (!this.aClass91_Sub2_Sub4_2175.method589(class91_sub14, -1107349037)) {
					int i_7_ = i;
					do {
						if (i_7_ <= -1568132749 * class91_sub14.anInt1946) {
							method567(class91_sub14, i_7_, (short) 128);
							class91_sub14.anInt1946 -= -1286579269 * i_7_;
							break;
						}
						method567(class91_sub14, -1568132749 * class91_sub14.anInt1946, (short) 128);
						i_7_ -= -1568132749 * class91_sub14.anInt1946;
					} while (!this.aClass91_Sub2_Sub4_2175.method590(class91_sub14, null, 0, i_7_, -595057088));
				}
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "ev.ao()");
		}
	}

	void method566(final Class91_Sub14 class91_sub14, final int[] is, int i, int i_8_, final int i_9_, final byte i_10_) {
		try {
			if ((this.aClass91_Sub2_Sub4_2175.anIntArray2200[-1254929663 * class91_sub14.anInt1931] & 0x4) != 0 && 675837383 * class91_sub14.anInt1948 < 0) {
				final int i_11_ = this.aClass91_Sub2_Sub4_2175.anIntArray2197[-1254929663 * class91_sub14.anInt1931] / (Class6.anInt81 * -45833585);
				for (;;) {
					final int i_12_ = (i_11_ + 1048575 - class91_sub14.anInt1947 * 64910699) / i_11_;
					if (i_12_ > i_8_) {
						class91_sub14.anInt1947 += i_8_ * i_11_ * 1328680771;
						break;
					}
					class91_sub14.aClass91_Sub2_Sub1_1927.method498(is, i, i_12_);
					i += i_12_;
					i_8_ -= i_12_;
					class91_sub14.anInt1947 += (i_11_ * i_12_ - 1048576) * 1328680771;
					int i_13_ = Class6.anInt81 * -45833585 / 100;
					final int i_14_ = 262144 / i_11_;
					if (i_14_ < i_13_) {
						i_13_ = i_14_;
					}
					final Class91_Sub2_Sub1 class91_sub2_sub1 = class91_sub14.aClass91_Sub2_Sub1_1927;
					if (this.aClass91_Sub2_Sub4_2175.anIntArray2195[class91_sub14.anInt1931 * -1254929663] == 0) {
						class91_sub14.aClass91_Sub2_Sub1_1927 = Class91_Sub2_Sub1.method517(class91_sub14.aClass91_Sub1_Sub1_1929, class91_sub2_sub1.method528(), class91_sub2_sub1.method546(), class91_sub2_sub1.method521());
					} else {
						class91_sub14.aClass91_Sub2_Sub1_1927 = Class91_Sub2_Sub1.method517(class91_sub14.aClass91_Sub1_Sub1_1929, class91_sub2_sub1.method528(), 0, class91_sub2_sub1.method521());
						boolean bool;
						if (class91_sub14.aClass91_Sub11_1938.aShortArray1874[-1960884919 * class91_sub14.anInt1932] < 0) {
							bool = true;
						} else {
							bool = false;
						}
						this.aClass91_Sub2_Sub4_2175.method578(class91_sub14, bool, -2019475599);
						class91_sub14.aClass91_Sub2_Sub1_1927.method525(i_13_, class91_sub2_sub1.method546());
					}
					if (class91_sub14.aClass91_Sub11_1938.aShortArray1874[class91_sub14.anInt1932 * -1960884919] < 0) {
						class91_sub14.aClass91_Sub2_Sub1_1927.method548(-1);
					}
					class91_sub2_sub1.method526(i_13_);
					class91_sub2_sub1.method498(is, i, i_9_ - i);
					if (class91_sub2_sub1.method530()) {
						if (i_10_ != 9) {
							return;
						}
						this.aClass91_Sub2_Sub2_2178.method559(class91_sub2_sub1);
					}
				}
			}
			class91_sub14.aClass91_Sub2_Sub1_1927.method498(is, i, i_8_);
		} catch (final RuntimeException var12) {
			throw Class102.method1086(var12, "ev.i()");
		}
	}

	void method567(final Class91_Sub14 class91_sub14, int i, final short i_15_) {
		try {
			if ((this.aClass91_Sub2_Sub4_2175.anIntArray2200[class91_sub14.anInt1931 * -1254929663] & 0x4) != 0 && 675837383 * class91_sub14.anInt1948 < 0) {
				final int i_16_ = this.aClass91_Sub2_Sub4_2175.anIntArray2197[-1254929663 * class91_sub14.anInt1931] / (-45833585 * Class6.anInt81);
				final int i_17_ = (1048575 + i_16_ - 64910699 * class91_sub14.anInt1947) / i_16_;
				class91_sub14.anInt1947 = 1328680771 * (i_16_ * i + 64910699 * class91_sub14.anInt1947 & 0xfffff);
				if (i_17_ <= i) {
					if (this.aClass91_Sub2_Sub4_2175.anIntArray2195[class91_sub14.anInt1931 * -1254929663] == 0) {
						class91_sub14.aClass91_Sub2_Sub1_1927 = Class91_Sub2_Sub1.method517(class91_sub14.aClass91_Sub1_Sub1_1929, class91_sub14.aClass91_Sub2_Sub1_1927.method528(), class91_sub14.aClass91_Sub2_Sub1_1927.method546(), class91_sub14.aClass91_Sub2_Sub1_1927.method521());
					} else {
						class91_sub14.aClass91_Sub2_Sub1_1927 = Class91_Sub2_Sub1.method517(class91_sub14.aClass91_Sub1_Sub1_1929, class91_sub14.aClass91_Sub2_Sub1_1927.method528(), 0, class91_sub14.aClass91_Sub2_Sub1_1927.method521());
						this.aClass91_Sub2_Sub4_2175.method578(class91_sub14, class91_sub14.aClass91_Sub11_1938.aShortArray1874[class91_sub14.anInt1932 * -1960884919] < 0, -310966916);
					}
					if (class91_sub14.aClass91_Sub11_1938.aShortArray1874[-1960884919 * class91_sub14.anInt1932] < 0) {
						class91_sub14.aClass91_Sub2_Sub1_1927.method548(-1);
					}
					i = class91_sub14.anInt1947 * 64910699 / i_16_;
				}
			}
			class91_sub14.aClass91_Sub2_Sub1_1927.method505(i);
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "ev.w()");
		}
	}

	@Override
	protected Class91_Sub2 method507() {
		Class91_Sub14 class91_sub14;
		do {
			class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1063();
			if (class91_sub14 == null) {
				return null;
			}
		} while (class91_sub14.aClass91_Sub2_Sub1_1927 == null);
		return class91_sub14.aClass91_Sub2_Sub1_1927;
	}

	@Override
	protected Class91_Sub2 method515() {
		Class91_Sub2_Sub1 class91_sub2_sub1;
		try {
			Class91_Sub14 class91_sub14;
			do {
				class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1063();
				if (class91_sub14 == null) {
					return null;
				}
			} while (class91_sub14.aClass91_Sub2_Sub1_1927 == null);
			class91_sub2_sub1 = class91_sub14.aClass91_Sub2_Sub1_1927;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ev.b()");
		}
		return class91_sub2_sub1;
	}

	@Override
	protected Class91_Sub2 method506() {
		Class91_Sub14 class91_sub14;
		do {
			class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1063();
			if (class91_sub14 == null) {
				return null;
			}
		} while (class91_sub14.aClass91_Sub2_Sub1_1927 == null);
		return class91_sub14.aClass91_Sub2_Sub1_1927;
	}

	@Override
	protected Class91_Sub2 method504() {
		final Class91_Sub14 class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1062();
		return class91_sub14 == null ? null : class91_sub14.aClass91_Sub2_Sub1_1927 != null ? (Class91_Sub2) class91_sub14.aClass91_Sub2_Sub1_1927 : method515();
	}

	@Override
	protected Class91_Sub2 method508() {
		Class91_Sub14 class91_sub14;
		do {
			class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1063();
			if (class91_sub14 == null) {
				return null;
			}
		} while (class91_sub14.aClass91_Sub2_Sub1_1927 == null);
		return class91_sub14.aClass91_Sub2_Sub1_1927;
	}

	@Override
	protected int method509() {
		return 0;
	}

	@Override
	protected int method510() {
		return 0;
	}

	@Override
	protected int method497() {
		return 0;
	}

	@Override
	protected void method511(final int i) {
		this.aClass91_Sub2_Sub2_2178.method505(i);
		for (Class91_Sub14 class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1062(); class91_sub14 != null; class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1063()) {
			if (!this.aClass91_Sub2_Sub4_2175.method589(class91_sub14, -1107349037)) {
				int var2 = i;
				do {
					if (var2 <= -1289585434 * class91_sub14.anInt1946) {
						method567(class91_sub14, var2, (short) 128);
						class91_sub14.anInt1946 -= -1286579269 * var2;
						break;
					}
					method567(class91_sub14, 1267065752 * class91_sub14.anInt1946, (short) 128);
					var2 -= -597265272 * class91_sub14.anInt1946;
				} while (!this.aClass91_Sub2_Sub4_2175.method590(class91_sub14, null, 0, var2, -1951348922));
			}
		}
	}

	Class91_Sub2_Sub3(final Class91_Sub2_Sub4 class91_sub2_sub4) {
		try {
			this.aClass95_2174 = new Class95();
			this.aClass91_Sub2_Sub2_2178 = new Class91_Sub2_Sub2();
			this.aClass91_Sub2_Sub4_2175 = class91_sub2_sub4;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "ev.<init>()");
		}
	}

	@Override
	protected void method500(final int[] is, final int i, final int i_18_) {
		this.aClass91_Sub2_Sub2_2178.method498(is, i, i_18_);
		for (Class91_Sub14 class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1062(); class91_sub14 != null; class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1063()) {
			if (!this.aClass91_Sub2_Sub4_2175.method589(class91_sub14, -1107349037)) {
				int i_19_ = i;
				int var5 = i_18_;
				do {
					if (var5 <= class91_sub14.anInt1946 * -1568132749) {
						method566(class91_sub14, is, i_19_, var5, var5 + i_19_, (byte) 9);
						class91_sub14.anInt1946 -= -1286579269 * var5;
						break;
					}
					method566(class91_sub14, is, i_19_, class91_sub14.anInt1946 * -1568132749, var5 + i_19_, (byte) 9);
					i_19_ += class91_sub14.anInt1946 * -1568132749;
					var5 -= class91_sub14.anInt1946 * -1568132749;
				} while (!this.aClass91_Sub2_Sub4_2175.method590(class91_sub14, is, i_19_, var5, -242467176));
			}
		}
	}

	@Override
	protected Class91_Sub2 method499() {
		Class91_Sub2 class91_sub2;
		try {
			final Class91_Sub14 class91_sub14 = (Class91_Sub14) this.aClass95_2174.method1062();
			class91_sub2 = class91_sub14 == null ? null : class91_sub14.aClass91_Sub2_Sub1_1927 != null ? (Class91_Sub2) class91_sub14.aClass91_Sub2_Sub1_1927 : method515();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ev.h()");
		}
		return class91_sub2;
	}
}
