/* Class91_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;
import java.awt.Graphics;

public final class Class91_Sub24 extends Class91 {
	static int anInt2125;
	int anInt2126;
	int anInt2127;
	int anInt2128;
	int anInt2129;
	int[] anIntArray2130;
	int anInt2131;
	int anInt2132;
	Class91_Sub2_Sub1 aClass91_Sub2_Sub1_2133;
	protected static Frame aFrame2134;
	int anInt2135;
	static Class14 aClass14_2136;
	static Class95 aClass95_2137 = new Class95();
	Class91_Sub2_Sub1 aClass91_Sub2_Sub1_2138;
	public static final int anInt2139 = 188;
	static int[] anIntArray2140;
	static Class91_Sub20_Sub13_Sub3[] aClass91_Sub20_Sub13_Sub3Array2141;
	int anInt2142;
	int anInt2143;
	int anInt2144;
	static final int anInt2145 = 30;
	public static final int anInt2146 = 72;
	LocType aClass91_Sub20_Sub7_2147;
	public static final int anInt2148 = 252;

	public static void method1049(final int i, final Js5 class63, final int i_0_, final int i_1_, final int i_2_, final boolean bool, final byte i_3_) {
		try {
			Class64.anInt781 = -515714225;
			Class64.aClass63_786 = class63;
			Class54.anInt639 = -2112699691 * i_0_;
			Class44.anInt578 = i_1_ * -933079703;
			Class66.anInt792 = i_2_ * -1338844029;
			Class91_Sub20_Sub4.aBoolean2261 = bool;
			Class24.anInt298 = 1128076391 * i;
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "p.t()");
		}
	}

	void method1050(final byte i) {
		try {
			final int i_4_ = this.anInt2132 * -871067453;
			final LocType class91_sub20_sub7 = this.aClass91_Sub20_Sub7_2147.method777(162302215);
			if (class91_sub20_sub7 != null) {
				this.anInt2132 = 1963771209 * class91_sub20_sub7.anInt2316;
				this.anInt2131 = class91_sub20_sub7.anInt2318 * -2131153280;
				this.anInt2143 = -428370871 * class91_sub20_sub7.anInt2344;
				this.anInt2135 = class91_sub20_sub7.anInt2348 * -2064810117;
				this.anIntArray2130 = class91_sub20_sub7.anIntArray2345;
			} else {
				this.anInt2132 = -479371243;
				this.anInt2131 = 0;
				this.anInt2143 = 0;
				this.anInt2135 = 0;
				this.anIntArray2130 = null;
			}
			if (i_4_ != this.anInt2132 * -871067453) {
				if (i < 1) {
					if (this.aClass91_Sub2_Sub1_2133 != null) {
						Class91_Sub22.aClass91_Sub2_Sub2_2109.method560(this.aClass91_Sub2_Sub1_2133);
						this.aClass91_Sub2_Sub1_2133 = null;
					}
				}
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "p.i()");
		}
	}

	static boolean method1051(final String string, final int i) {
		try {
			if (string == null) {
				return false;
			}
			final String string_5_ = Class91_Sub20_Sub14_Sub4.method1002(string, Class41.aClass98_551, (byte) 8);
			for (int i_6_ = 0; i_6_ < 8867313 * client.anInt1493; i_6_++) {
				final Class1 class1 = client.aClass1Array1700[i_6_];
				if (string_5_.equalsIgnoreCase(Class91_Sub20_Sub14_Sub4.method1002(class1.aString29, Class41.aClass98_551, (byte) 40))) {
					return true;
				}
				if (string_5_.equalsIgnoreCase(Class91_Sub20_Sub14_Sub4.method1002(class1.aString30, Class41.aClass98_551, (byte) 121))) {
					return true;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "p.cv()");
		}
		return false;
	}

	Class91_Sub24() {
		/* empty */
	}

	public static Class91_Sub20_Sub13_Sub1[] method1052(final Js5 class63, final String string, final String string_7_, final byte i) {
		Class91_Sub20_Sub13_Sub1[] class91_sub20_sub13_sub1s;
		try {
			final int i_8_ = class63.method409(string, -1468941848);
			final int i_9_ = class63.method415(i_8_, string_7_, (byte) 118);
			Class91_Sub20_Sub13_Sub1[] class91_sub20_sub13_sub1s_10_;
			if (!IdkType.method731(class63, i_8_, i_9_, 463038107)) {
				if (i <= 0) {
					throw new IllegalStateException();
				}
				class91_sub20_sub13_sub1s_10_ = null;
			} else {
				class91_sub20_sub13_sub1s_10_ = Class14.method177((byte) 2);
			}
			class91_sub20_sub13_sub1s = class91_sub20_sub13_sub1s_10_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "p.w()");
		}
		return class91_sub20_sub13_sub1s;
	}

	static void method1053(final Class91_Sub20_Sub13_Sub4_Sub1 class91_sub20_sub13_sub4_sub1, final Class91_Sub20_Sub13_Sub4_Sub1 class91_sub20_sub13_sub4_sub1_11_, final int i) {
		do {
			try {
				if (Class106.aClass91_Sub20_Sub13_Sub3Array1383 == null) {
					Class106.aClass91_Sub20_Sub13_Sub3Array1383 = Class26.method249(Class97.aClass63_Sub1_1209, "sl_back", "", (byte) -85);
				}
				if (Class101.aClass91_Sub20_Sub13_Sub1Array1282 == null) {
					Class101.aClass91_Sub20_Sub13_Sub1Array1282 = method1052(Class97.aClass63_Sub1_1209, "sl_flags", "", (byte) 67);
				}
				if (Class18.aClass91_Sub20_Sub13_Sub1Array248 == null) {
					Class18.aClass91_Sub20_Sub13_Sub1Array248 = method1052(Class97.aClass63_Sub1_1209, "sl_arrows", "", (byte) 30);
				}
				if (Class90.aClass91_Sub20_Sub13_Sub1Array1189 == null) {
					Class90.aClass91_Sub20_Sub13_Sub1Array1189 = method1052(Class97.aClass63_Sub1_1209, "sl_stars", "", (byte) 101);
				}
				Class91_Sub20_Sub13.method828(0, 23, 765, 480, 0);
				Class91_Sub20_Sub13.method827(0, 0, 125, 23, 12425273, 9135624);
				Class91_Sub20_Sub13.method827(125, 0, 640, 23, 5197647, 2697513);
				class91_sub20_sub13_sub4_sub1.method913(Class75.aString1069, 62, 15, 0, -1);
				if (Class90.aClass91_Sub20_Sub13_Sub1Array1189 != null) {
					Class90.aClass91_Sub20_Sub13_Sub1Array1189[1].method840(140, 1);
					class91_sub20_sub13_sub4_sub1_11_.method906(Class75.aString1070, 152, 10, 16777215, -1);
					Class90.aClass91_Sub20_Sub13_Sub1Array1189[0].method840(140, 12);
					class91_sub20_sub13_sub4_sub1_11_.method906(Class75.aString976, 152, 21, 16777215, -1);
				}
				if (Class18.aClass91_Sub20_Sub13_Sub1Array248 != null) {
					if (Class101.anIntArray1285[0] == 0 && Class101.anIntArray1274[0] == 0) {
						Class18.aClass91_Sub20_Sub13_Sub1Array248[2].method840(280, 4);
					} else {
						Class18.aClass91_Sub20_Sub13_Sub1Array248[0].method840(280, 4);
					}
					if (Class101.anIntArray1285[0] == 0 && 1 == Class101.anIntArray1274[0]) {
						Class18.aClass91_Sub20_Sub13_Sub1Array248[3].method840(295, 4);
					} else {
						Class18.aClass91_Sub20_Sub13_Sub1Array248[1].method840(295, 4);
					}
					class91_sub20_sub13_sub4_sub1.method906(Class75.aString959, 312, 17, 16777215, -1);
					if (Class101.anIntArray1285[0] == 1 && Class101.anIntArray1274[0] == 0) {
						Class18.aClass91_Sub20_Sub13_Sub1Array248[2].method840(390, 4);
					} else {
						Class18.aClass91_Sub20_Sub13_Sub1Array248[0].method840(390, 4);
					}
					if (1 == Class101.anIntArray1285[0] && 1 == Class101.anIntArray1274[0]) {
						Class18.aClass91_Sub20_Sub13_Sub1Array248[3].method840(405, 4);
					} else {
						Class18.aClass91_Sub20_Sub13_Sub1Array248[1].method840(405, 4);
					}
					class91_sub20_sub13_sub4_sub1.method906(Class75.aString1073, 422, 17, 16777215, -1);
					if (Class101.anIntArray1285[0] == 2 && Class101.anIntArray1274[0] == 0) {
						Class18.aClass91_Sub20_Sub13_Sub1Array248[2].method840(500, 4);
					} else {
						Class18.aClass91_Sub20_Sub13_Sub1Array248[0].method840(500, 4);
					}
					if (2 == Class101.anIntArray1285[0] && 1 == Class101.anIntArray1274[0]) {
						Class18.aClass91_Sub20_Sub13_Sub1Array248[3].method840(515, 4);
					} else {
						Class18.aClass91_Sub20_Sub13_Sub1Array248[1].method840(515, 4);
					}
					class91_sub20_sub13_sub4_sub1.method906(Class75.aString1074, 532, 17, 16777215, -1);
					if (3 == Class101.anIntArray1285[0] && Class101.anIntArray1274[0] == 0) {
						Class18.aClass91_Sub20_Sub13_Sub1Array248[2].method840(610, 4);
					} else {
						Class18.aClass91_Sub20_Sub13_Sub1Array248[0].method840(610, 4);
					}
					if (3 == Class101.anIntArray1285[0] && 1 == Class101.anIntArray1274[0]) {
						Class18.aClass91_Sub20_Sub13_Sub1Array248[3].method840(625, 4);
					} else {
						Class18.aClass91_Sub20_Sub13_Sub1Array248[1].method840(625, 4);
					}
					class91_sub20_sub13_sub4_sub1.method906(Class75.aString1075, 642, 17, 16777215, -1);
				}
				Class91_Sub20_Sub13.method828(708, 4, 50, 16, 0);
				class91_sub20_sub13_sub4_sub1_11_.method913(Class75.aString953, 733, 16, 16777215, -1);
				Class101.anInt1287 = -1671154067;
				if (Class106.aClass91_Sub20_Sub13_Sub3Array1383 != null) {
					int i_18_ = 8;
					int i_19_ = 24;
					int i_20_;
					int i_21_;
					do {
						i_20_ = i_19_;
						i_21_ = i_18_;
						if (i_19_ * (i_18_ - 1) >= -1483041193 * Class101.anInt1273) {
							i_18_--;
						}
						if (i_18_ * (i_19_ - 1) >= -1483041193 * Class101.anInt1273) {
							i_19_--;
						}
						if (i_18_ * (i_19_ - 1) >= Class101.anInt1273 * -1483041193) {
							i_19_--;
						}
					} while (i_20_ != i_19_ || i_21_ != i_18_);
					i_20_ = (765 - 88 * i_18_) / (1 + i_18_);
					if (i_20_ > 5) {
						i_20_ = 5;
					}
					i_21_ = (480 - 19 * i_19_) / (1 + i_19_);
					if (i_21_ > 5) {
						i_21_ = 5;
					}
					final int i_22_ = (765 - i_18_ * 88 - (i_18_ - 1) * i_20_) / 2;
					final int i_23_ = (480 - i_19_ * 19 - (i_19_ - 1) * i_21_) / 2;
					int i_24_ = i_23_ + 23;
					int i_25_ = i_22_;
					int i_26_ = 0;
					boolean bool = false;
					for (int i_27_ = 0; i_27_ < Class101.anInt1273 * -1483041193; i_27_++) {
						final Class103 class103 = Class46.aClass103Array594[i_27_];
						boolean bool_28_ = true;
						String string = Integer.toString(class103.anInt1319 * -995202549);
						if (-1 == -995202549 * class103.anInt1319) {
							string = Class75.aString1076;
							bool_28_ = false;
						} else if (class103.anInt1319 * -995202549 > 1980) {
							string = Class75.aString1077;
							bool_28_ = false;
						}
						int i_29_;
						if (class103.aBoolean1325) {
							if (class103.aBoolean1321) {
								i_29_ = 3;
							} else {
								i_29_ = 2;
							}
						} else if (class103.aBoolean1321) {
							i_29_ = 1;
						} else {
							i_29_ = 0;
						}
						if (Class12.anInt173 * -695750341 >= i_25_ && -855709389 * Class12.anInt178 >= i_24_ && -695750341 * Class12.anInt173 < i_25_ + 88 && -855709389 * Class12.anInt178 < i_24_ + 19 && bool_28_) {
							Class101.anInt1287 = i_27_ * 1671154067;
							Class106.aClass91_Sub20_Sub13_Sub3Array1383[i_29_].method869(i_25_, i_24_, 128, 16777215);
							bool = true;
						} else {
							Class106.aClass91_Sub20_Sub13_Sub3Array1383[i_29_].method868(i_25_, i_24_);
						}
						if (Class101.aClass91_Sub20_Sub13_Sub1Array1282 != null) {
							Class101.aClass91_Sub20_Sub13_Sub1Array1282[(class103.aBoolean1321 ? 8 : 0) + 933304289 * class103.anInt1322].method840(i_25_ + 29, i_24_);
						}
						class91_sub20_sub13_sub4_sub1.method913(Integer.toString(-1659167479 * class103.anInt1335), i_25_ + 15, 14 + i_24_, 0, -1);
						class91_sub20_sub13_sub4_sub1_11_.method913(string, i_25_ + 60, 5 + i_24_ + 9, 268435455, -1);
						i_24_ += i_21_ + 19;
						if (++i_26_ >= i_19_) {
							i_24_ = i_23_ + 23;
							i_25_ += i_20_ + 88;
							i_26_ = 0;
						}
					}
					if (bool) {
						final int i_30_ = class91_sub20_sub13_sub4_sub1_11_.method889(Class46.aClass103Array594[Class101.anInt1287 * 669498523].aString1329) + 6;
						final int i_31_ = class91_sub20_sub13_sub4_sub1_11_.anInt2581 + 8;
						Class91_Sub20_Sub13.method828(-695750341 * Class12.anInt173 - i_30_ / 2, 5 + -855709389 * Class12.anInt178 + 20, i_30_, i_31_, 16777120);
						Class91_Sub20_Sub13.method834(Class12.anInt173 * -695750341 - i_30_ / 2, 5 + -855709389 * Class12.anInt178 + 20, i_30_, i_31_, 0);
						class91_sub20_sub13_sub4_sub1_11_.method913(Class46.aClass103Array594[669498523 * Class101.anInt1287].aString1329, -695750341 * Class12.anInt173, 29 + Class12.anInt178 * -855709389 + class91_sub20_sub13_sub4_sub1_11_.anInt2581, 0, -1);
					}
				}
				try {
					final Graphics graphics = Class102.aCanvas1309.getGraphics();
					Class97.aClass28_1218.method254(graphics, 0, 0, -1341624812);
				} catch (final Exception exception) {
					Class102.aCanvas1309.repaint();
					break;
				}
				break;
			} catch (final RuntimeException var21) {
				throw Class102.method1086(var21, "p.d()");
			}
		} while (false);
	}
}
