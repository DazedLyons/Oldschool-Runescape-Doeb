/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class45 implements Interface3 {
	int anInt1427;
	Class91_Sub6[] aClass91_Sub6Array1428;
	int anInt1429;
	double aDouble1430;
	static Class91_Sub20_Sub13_Sub1 aClass91_Sub20_Sub13_Sub1_1431;
	int anInt1432;
	Js5 aClass63_1433;
	Class95 aClass95_1434;
	public static final int anInt1435 = 136;
	static String aString1436;
	public static final int anInt1437 = 38;

	@Override
	public boolean method35(final int i, final int i_0_) {
		boolean bool;
		try {
			if (64 == this.anInt1432 * -1961490649) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "de.e()");
		}
		return bool;
	}

	public void method361(final double d) {
		try {
			this.aDouble1430 = d;
			method363(1643228888);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "de.m()");
		}
	}

	@Override
	public int[] method29(final int i, final int i_1_) {
		do {
			int[] is;
			try {
				final Class91_Sub6 class91_sub6 = this.aClass91_Sub6Array1428[i];
				if (class91_sub6 == null) {
					break;
				}
				if (class91_sub6.anIntArray1820 != null) {
					this.aClass95_1434.method1059(class91_sub6);
					class91_sub6.aBoolean1809 = true;
					return class91_sub6.anIntArray1820;
				}
				final boolean bool = class91_sub6.method621(this.aDouble1430, this.anInt1432 * -1961490649, this.aClass63_1433);
				if (!bool) {
					break;
				}
				if (352629119 * this.anInt1427 == 0) {
					final Class91_Sub6 class91_sub6_2_ = (Class91_Sub6) this.aClass95_1434.method1061();
					class91_sub6_2_.method622();
				} else {
					this.anInt1427 -= -1400304001;
				}
				this.aClass95_1434.method1059(class91_sub6);
				class91_sub6.aBoolean1809 = true;
				is = class91_sub6.anIntArray1820;
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "de.i()");
			}
			return is;
		} while (false);
		return null;
	}

	@Override
	public boolean method38(final int i) {
		if (64 == this.anInt1432 * -1961490649) {
			return true;
		}
		return false;
	}

	public void method362(final int i, final int i_3_) {
		try {
			Class91_Sub6[] class91_sub6s;
			final int i_4_ = (class91_sub6s = this.aClass91_Sub6Array1428).length;
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				final Class91_Sub6 class91_sub6 = class91_sub6s[i_5_];
				final Class91_Sub6 class91_sub6_6_ = class91_sub6;
				if (class91_sub6_6_ != null) {
					if (i_3_ == 1049632057) {
						break;
					}
					if (class91_sub6_6_.anInt1818 != 0 && class91_sub6_6_.aBoolean1809) {
						class91_sub6_6_.method620(i);
						class91_sub6_6_.aBoolean1809 = false;
					}
				}
			}
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "de.g()");
		}
	}

	@Override
	public int method33(final int i) {
		return this.aClass91_Sub6Array1428[i] != null ? this.aClass91_Sub6Array1428[i].anInt1812 : 0;
	}

	@Override
	public boolean method34(final int i) {
		return this.aClass91_Sub6Array1428[i].aBoolean1813;
	}

	@Override
	public int[] method27(final int i) {
		final Class91_Sub6 class91_sub6 = this.aClass91_Sub6Array1428[i];
		if (class91_sub6 != null) {
			if (class91_sub6.anIntArray1820 != null) {
				this.aClass95_1434.method1059(class91_sub6);
				class91_sub6.aBoolean1809 = true;
				return class91_sub6.anIntArray1820;
			}
			final boolean bool = class91_sub6.method621(this.aDouble1430, this.anInt1432 * 812772678, this.aClass63_1433);
			if (bool) {
				if (-156875442 * this.anInt1427 == 0) {
					final Class91_Sub6 class91_sub6_7_ = (Class91_Sub6) this.aClass95_1434.method1061();
					class91_sub6_7_.method622();
				} else {
					this.anInt1427 -= -1334748098;
				}
				this.aClass95_1434.method1059(class91_sub6);
				class91_sub6.aBoolean1809 = true;
				return class91_sub6.anIntArray1820;
			}
		}
		return null;
	}

	@Override
	public int[] method31(final int i) {
		final Class91_Sub6 class91_sub6 = this.aClass91_Sub6Array1428[i];
		if (class91_sub6 != null) {
			if (class91_sub6.anIntArray1820 != null) {
				this.aClass95_1434.method1059(class91_sub6);
				class91_sub6.aBoolean1809 = true;
				return class91_sub6.anIntArray1820;
			}
			final boolean bool = class91_sub6.method621(this.aDouble1430, this.anInt1432 * -1961490649, this.aClass63_1433);
			if (bool) {
				if (352629119 * this.anInt1427 == 0) {
					final Class91_Sub6 class91_sub6_8_ = (Class91_Sub6) this.aClass95_1434.method1061();
					class91_sub6_8_.method622();
				} else {
					this.anInt1427 -= -1400304001;
				}
				this.aClass95_1434.method1059(class91_sub6);
				class91_sub6.aBoolean1809 = true;
				return class91_sub6.anIntArray1820;
			}
		}
		return null;
	}

	@Override
	public int method32(final int i) {
		return this.aClass91_Sub6Array1428[i] != null ? this.aClass91_Sub6Array1428[i].anInt1812 : 0;
	}

	public Class45(final Js5 class63, final Js5 class63_9_, final int i, final double d, final int i_10_) {
		try {
			this.aClass95_1434 = new Class95();
			this.anInt1427 = 0;
			this.aDouble1430 = 1.0;
			this.anInt1432 = 1719421824;
			this.aClass63_1433 = class63_9_;
			this.anInt1429 = 1219547525 * i;
			this.anInt1427 = this.anInt1429 * -1911923405;
			this.aDouble1430 = d;
			this.anInt1432 = i_10_ * 885848215;
			final int[] is = class63.method416(0, -1634705025);
			final int i_11_ = is.length;
			this.aClass91_Sub6Array1428 = new Class91_Sub6[class63.method405(0, -1002665316)];
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
				final ByteBuffer class91_sub9 = new ByteBuffer(class63.getFile(0, is[i_12_], 801387943));
				this.aClass91_Sub6Array1428[is[i_12_]] = new Class91_Sub6(class91_sub9);
			}
		} catch (final RuntimeException var11) {
			throw Class102.method1086(var11, "de.<init>()");
		}
	}

	@Override
	public int method28(final int i, final int i_13_) {
		do {
			int i_14_;
			try {
				if (this.aClass91_Sub6Array1428[i] == null) {
					break;
				}
				i_14_ = this.aClass91_Sub6Array1428[i].anInt1812;
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "de.w()");
			}
			return i_14_;
		} while (false);
		return 0;
	}

	@Override
	public boolean method30(final int i) {
		return this.aClass91_Sub6Array1428[i].aBoolean1813;
	}

	@Override
	public boolean method36(final int i) {
		return this.aClass91_Sub6Array1428[i].aBoolean1813;
	}

	@Override
	public boolean method37(final int i) {
		if (640599957 == this.anInt1432 * -1848680031) {
			return true;
		}
		return false;
	}

	public void method363(final int i) {
		try {
			Class91_Sub6[] class91_sub6s;
			final int i_15_ = (class91_sub6s = this.aClass91_Sub6Array1428).length;
			for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
				final Class91_Sub6 class91_sub6 = class91_sub6s[i_16_];
				if (class91_sub6 != null) {
					class91_sub6.method622();
				}
			}
			this.aClass95_1434 = new Class95();
			this.anInt1427 = -1911923405 * this.anInt1429;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "de.u()");
		}
	}

	@Override
	public boolean method26(final int i, final int i_17_) {
		boolean bool;
		try {
			bool = this.aClass91_Sub6Array1428[i].aBoolean1813;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "de.f()");
		}
		return bool;
	}
}
