/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class33 {
	int anInt380;
	static final int anInt381 = 14;
	int anInt382;
	int anInt383;
	public Class91_Sub20_Sub14 aClass91_Sub20_Sub14_384;
	int anInt385;
	int anInt386;
	static final int anInt387 = 16;
	int anInt388;
	int anInt389;
	int anInt390;
	int anInt391;
	int anInt392;
	int anInt393;
	int anInt394;
	public static final int anInt395 = 242;
	public int anInt396;
	public static final int anInt397 = 46;

	Class33() {
		try {
			anInt396 = 0;
			this.anInt393 = 0;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "ci.<init>()");
		}
	}

	static final void method278(final int i, final int i_0_, final byte i_1_) {
		try {
			final Class95 class95 = client.aClass95ArrayArrayArray1477[Class100.anInt1248 * -1723088013][i][i_0_];
			if (class95 == null) {
				Class107.aClass39_1397.method307(Class100.anInt1248 * -1723088013, i, i_0_);
			} else {
				long l = -99999999L;
				Class91_Sub20_Sub14_Sub7 class91_sub20_sub14_sub7 = null;
				for (Class91_Sub20_Sub14_Sub7 class91_sub20_sub14_sub7_2_ = (Class91_Sub20_Sub14_Sub7) class95.method1062(); class91_sub20_sub14_sub7_2_ != null; class91_sub20_sub14_sub7_2_ = (Class91_Sub20_Sub14_Sub7) class95.method1063()) {
					final ObjType class91_sub20_sub8 = Class86_Sub1.method490(class91_sub20_sub14_sub7_2_.anInt2831 * -643853787, 234554293);
					long l_3_ = -1522132341 * class91_sub20_sub8.anInt2364;
					if (1 == class91_sub20_sub8.anInt2368 * 1277482383) {
						l_3_ *= 627729 * class91_sub20_sub14_sub7_2_.anInt2827 + 1;
					}
					if (l_3_ > l) {
						l = l_3_;
						class91_sub20_sub14_sub7 = class91_sub20_sub14_sub7_2_;
					}
				}
				if (class91_sub20_sub14_sub7 == null) {
					Class107.aClass39_1397.method307(-1723088013 * Class100.anInt1248, i, i_0_);
				} else {
					class95.method1059(class91_sub20_sub14_sub7);
					Class91_Sub20_Sub14_Sub7 class91_sub20_sub14_sub7_4_ = null;
					Class91_Sub20_Sub14_Sub7 class91_sub20_sub14_sub7_5_ = null;
					for (Class91_Sub20_Sub14_Sub7 class91_sub20_sub14_sub7_6_ = (Class91_Sub20_Sub14_Sub7) class95.method1062(); class91_sub20_sub14_sub7_6_ != null; class91_sub20_sub14_sub7_6_ = (Class91_Sub20_Sub14_Sub7) class95.method1063()) {
						if (class91_sub20_sub14_sub7.anInt2831 * -643853787 != class91_sub20_sub14_sub7_6_.anInt2831 * -643853787) {
							if (class91_sub20_sub14_sub7_4_ == null) {
								class91_sub20_sub14_sub7_4_ = class91_sub20_sub14_sub7_6_;
							}
							if (-643853787 * class91_sub20_sub14_sub7_6_.anInt2831 != -643853787 * class91_sub20_sub14_sub7_4_.anInt2831 && class91_sub20_sub14_sub7_5_ == null) {
								class91_sub20_sub14_sub7_5_ = class91_sub20_sub14_sub7_6_;
							}
						}
					}
					final int i_7_ = 1610612736 + i + (i_0_ << 7);
					Class107.aClass39_1397.method334(Class100.anInt1248 * -1723088013, i, i_0_, Class4.method92(64 + 128 * i, i_0_ * 128 + 64, Class100.anInt1248 * -1723088013, -1884286549), class91_sub20_sub14_sub7, i_7_, class91_sub20_sub14_sub7_4_, class91_sub20_sub14_sub7_5_);
				}
			}
		} catch (final RuntimeException var11) {
			throw Class102.method1086(var11, "ci.bb()");
		}
	}

	static void method279(final int i, final int i_8_, final int i_9_, final int i_10_, final int i_11_) {
		try {
			for (Class91_Sub24 class91_sub24 = (Class91_Sub24) Class91_Sub24.aClass95_2137.method1062(); class91_sub24 != null; class91_sub24 = (Class91_Sub24) Class91_Sub24.aClass95_2137.method1063()) {
				if (-1 != -871067453 * class91_sub24.anInt2132 || class91_sub24.anIntArray2130 != null) {
					int i_12_ = 0;
					if (i_8_ > class91_sub24.anInt2129 * -653885975) {
						i_12_ += i_8_ - -653885975 * class91_sub24.anInt2129;
					} else if (i_8_ < 1474385623 * class91_sub24.anInt2127) {
						i_12_ += class91_sub24.anInt2127 * 1474385623 - i_8_;
					}
					if (i_9_ > class91_sub24.anInt2142 * 1298481727) {
						i_12_ += i_9_ - class91_sub24.anInt2142 * 1298481727;
					} else if (i_9_ < -2132810619 * class91_sub24.anInt2128) {
						i_12_ += -2132810619 * class91_sub24.anInt2128 - i_9_;
					}
					if (i_12_ - 64 <= class91_sub24.anInt2131 * 310807257 && -1237997571 * client.anInt1497 != 0 && class91_sub24.anInt2126 * -1558470157 == i) {
						i_12_ -= 64;
						if (i_12_ < 0) {
							i_12_ = 0;
						}
						final int i_13_ = -1237997571 * client.anInt1497 * (class91_sub24.anInt2131 * 310807257 - i_12_) / (310807257 * class91_sub24.anInt2131);
						if (class91_sub24.aClass91_Sub2_Sub1_2133 == null) {
							if (class91_sub24.anInt2132 * -871067453 >= 0) {
								final Class22 class22 = Class22.method210(Class91_Sub23.aClass63_Sub1_2113, -871067453 * class91_sub24.anInt2132, 0);
								if (class22 != null) {
									final Class91_Sub1_Sub1 class91_sub1_sub1 = class22.method208().method496(Class12.aClass19_175);
									final Class91_Sub2_Sub1 class91_sub2_sub1 = Class91_Sub2_Sub1.method554(class91_sub1_sub1, 100, i_13_);
									class91_sub2_sub1.method548(-1);
									Class91_Sub22.aClass91_Sub2_Sub2_2109.method559(class91_sub2_sub1);
									class91_sub24.aClass91_Sub2_Sub1_2133 = class91_sub2_sub1;
								}
							}
						} else {
							class91_sub24.aClass91_Sub2_Sub1_2133.method519(i_13_);
						}
						if (class91_sub24.aClass91_Sub2_Sub1_2138 == null) {
							if (class91_sub24.anIntArray2130 != null && (class91_sub24.anInt2144 -= i_10_ * -1454473095) * 1814555081 <= 0) {
								final int i_14_ = (int) (Math.random() * class91_sub24.anIntArray2130.length);
								final Class22 class22 = Class22.method210(Class91_Sub23.aClass63_Sub1_2113, class91_sub24.anIntArray2130[i_14_], 0);
								if (class22 != null) {
									final Class91_Sub1_Sub1 class91_sub1_sub1 = class22.method208().method496(Class12.aClass19_175);
									final Class91_Sub2_Sub1 class91_sub2_sub1 = Class91_Sub2_Sub1.method554(class91_sub1_sub1, 100, i_13_);
									class91_sub2_sub1.method548(0);
									Class91_Sub22.aClass91_Sub2_Sub2_2109.method559(class91_sub2_sub1);
									class91_sub24.aClass91_Sub2_Sub1_2138 = class91_sub2_sub1;
									class91_sub24.anInt2144 = (class91_sub24.anInt2143 * 968412839 + (int) (Math.random() * (class91_sub24.anInt2135 * -792944459 - 968412839 * class91_sub24.anInt2143))) * -1454473095;
								}
							}
						} else {
							class91_sub24.aClass91_Sub2_Sub1_2138.method519(i_13_);
							if (!class91_sub24.aClass91_Sub2_Sub1_2138.method494()) {
								class91_sub24.aClass91_Sub2_Sub1_2138 = null;
							}
						}
					} else {
						if (class91_sub24.aClass91_Sub2_Sub1_2133 != null) {
							Class91_Sub22.aClass91_Sub2_Sub2_2109.method560(class91_sub24.aClass91_Sub2_Sub1_2133);
							class91_sub24.aClass91_Sub2_Sub1_2133 = null;
						}
						if (class91_sub24.aClass91_Sub2_Sub1_2138 != null) {
							Class91_Sub22.aClass91_Sub2_Sub2_2109.method560(class91_sub24.aClass91_Sub2_Sub1_2138);
							class91_sub24.aClass91_Sub2_Sub1_2138 = null;
						}
					}
				}
			}
		} catch (final RuntimeException var12) {
			throw Class102.method1086(var12, "ci.f()");
		}
	}

	public static void method280(final int i, final int i_15_) {
		try {
			if (1548116911 * Class64.anInt781 != 0) {
				Class66.anInt792 = -1338844029 * i;
			} else {
				Class64.aClass91_Sub2_Sub4_785.method592(i, (short) 254);
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "ci.f()");
		}
	}
}
