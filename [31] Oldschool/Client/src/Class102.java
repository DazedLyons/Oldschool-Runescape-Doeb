/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.io.File;
import java.io.IOException;

public final class Class102 {
	static int[][][] anIntArrayArrayArray1292 = new int[4][105][105];
	static final int[] anIntArray1293 = { 1, 0, -1, 0 };
	static int anInt1294 = -2110658033;
	static byte[][][] aByteArrayArrayArray1295;
	static byte[][][] aByteArrayArrayArray1296;
	static int anInt1297 = ((int) (Math.random() * 33.0) - 16) * -964328369;
	static int[][] anIntArrayArray1298;
	static byte[][][] aByteArrayArrayArray1299 = new byte[4][104][104];
	static final int anInt1300 = 1170;
	static final int anInt1301 = 2340;
	static final int[] anIntArray1302 = { 1, 2, 4, 8 };
	static final int[] anIntArray1303 = { 16, 32, 64, 128 };
	static int[] anIntArray1304;
	static final int[] anIntArray1305 = { 0, -1, 0, 1 };
	static final int[] anIntArray1306 = { 1, -1, -1, 1 };
	static int[] anIntArray1307;
	static int anInt1308 = ((int) (Math.random() * 17.0) - 8) * 611966437;
	public static Canvas aCanvas1309;
	static byte[][][] aByteArrayArrayArray1310;
	static final int anInt1311 = 10;
	static final int[] anIntArray1312 = { -1, -1, 1, 1 };
	public static final int anInt1313 = 74;
	static Class91_Sub18 aClass91_Sub18_1314;
	public static final int anInt1315 = 43;
	static Class91_Sub20_Sub14_Sub1_Sub1 aClass91_Sub20_Sub14_Sub1_Sub1_1316;
	static Class63_Sub1 aClass63_Sub1_1317;

	static final void method1080(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final byte i_4_) {
		try {
			int i_5_ = Class107.aClass39_1397.method303(i, i_0_, i_1_);
			if (i_5_ != 0) {
				final int i_6_ = Class107.aClass39_1397.method312(i, i_0_, i_1_, i_5_);
				final int i_7_ = i_6_ >> 6 & 0x3;
				final int i_8_ = i_6_ & 0x1f;
				int i_9_ = i_2_;
				if (i_5_ > 0) {
					i_9_ = i_3_;
				}
				final int[] is = Class97.aClass91_Sub20_Sub13_Sub3_1214.anIntArray2557;
				final int i_10_ = (103 - i_1_) * 2048 + 4 * i_0_ + 24624;
				final int i_11_ = i_5_ >> 14 & 0x7fff;
				final LocType class91_sub20_sub7 = Class60.method392(i_11_, -1625008867);
				if (class91_sub20_sub7.anInt2326 * -1199337683 != -1) {
					final Class91_Sub20_Sub13_Sub1 class91_sub20_sub13_sub1 = Class19.aClass91_Sub20_Sub13_Sub1Array255[-1199337683 * class91_sub20_sub7.anInt2326];
					if (class91_sub20_sub13_sub1 != null) {
						final int i_12_ = (431853868 * class91_sub20_sub7.anInt2312 - class91_sub20_sub13_sub1.anInt2517) / 2;
						final int i_13_ = (-399404108 * class91_sub20_sub7.anInt2313 - class91_sub20_sub13_sub1.anInt2519) / 2;
						class91_sub20_sub13_sub1.method840(i_12_ + 48 + i_0_ * 4, i_13_ + 4 * (104 - i_1_ - -1173592851 * class91_sub20_sub7.anInt2313) + 48);
					}
				} else {
					do {
						if (i_8_ != 0) {
							if (i_8_ != 2) {
								break;
							}
							if (i_4_ != 1) {
								return;
							}
						}
						if (i_7_ == 0) {
							is[i_10_] = i_9_;
							is[512 + i_10_] = i_9_;
							is[i_10_ + 1024] = i_9_;
							is[i_10_ + 1536] = i_9_;
						} else if (1 == i_7_) {
							is[i_10_] = i_9_;
							is[i_10_ + 1] = i_9_;
							is[2 + i_10_] = i_9_;
							is[i_10_ + 3] = i_9_;
						} else if (2 == i_7_) {
							is[i_10_ + 3] = i_9_;
							is[i_10_ + 3 + 512] = i_9_;
							is[1024 + i_10_ + 3] = i_9_;
							is[1539 + i_10_] = i_9_;
						} else if (i_7_ == 3) {
							is[1536 + i_10_] = i_9_;
							is[i_10_ + 1536 + 1] = i_9_;
							is[i_10_ + 1536 + 2] = i_9_;
							is[i_10_ + 1536 + 3] = i_9_;
						}
					} while (false);
					if (3 == i_8_) {
						if (i_7_ == 0) {
							is[i_10_] = i_9_;
						} else if (i_7_ == 1) {
							is[i_10_ + 3] = i_9_;
						} else if (2 == i_7_) {
							is[3 + i_10_ + 1536] = i_9_;
						} else if (3 == i_7_) {
							is[i_10_ + 1536] = i_9_;
						}
					}
					if (i_8_ == 2) {
						if (3 == i_7_) {
							is[i_10_] = i_9_;
							is[512 + i_10_] = i_9_;
							is[1024 + i_10_] = i_9_;
							is[i_10_ + 1536] = i_9_;
						} else if (i_7_ == 0) {
							is[i_10_] = i_9_;
							is[i_10_ + 1] = i_9_;
							is[i_10_ + 2] = i_9_;
							is[i_10_ + 3] = i_9_;
						} else if (1 == i_7_) {
							is[3 + i_10_] = i_9_;
							is[3 + i_10_ + 512] = i_9_;
							is[i_10_ + 3 + 1024] = i_9_;
							is[i_10_ + 3 + 1536] = i_9_;
						} else if (2 == i_7_) {
							is[1536 + i_10_] = i_9_;
							is[i_10_ + 1536 + 1] = i_9_;
							is[i_10_ + 1536 + 2] = i_9_;
							is[i_10_ + 1536 + 3] = i_9_;
						}
					}
				}
			}
			i_5_ = Class107.aClass39_1397.method310(i, i_0_, i_1_);
			if (i_5_ != 0) {
				final int i_14_ = Class107.aClass39_1397.method312(i, i_0_, i_1_, i_5_);
				final int i_15_ = i_14_ >> 6 & 0x3;
				final int i_16_ = i_14_ & 0x1f;
				final int i_17_ = i_5_ >> 14 & 0x7fff;
				final LocType class91_sub20_sub7 = Class60.method392(i_17_, -1047935277);
				if (-1199337683 * class91_sub20_sub7.anInt2326 != -1) {
					final Class91_Sub20_Sub13_Sub1 class91_sub20_sub13_sub1 = Class19.aClass91_Sub20_Sub13_Sub1Array255[-1199337683 * class91_sub20_sub7.anInt2326];
					if (class91_sub20_sub13_sub1 != null) {
						final int i_18_ = (class91_sub20_sub7.anInt2312 * 431853868 - class91_sub20_sub13_sub1.anInt2517) / 2;
						final int i_19_ = (class91_sub20_sub7.anInt2313 * -399404108 - class91_sub20_sub13_sub1.anInt2519) / 2;
						class91_sub20_sub13_sub1.method840(i_18_ + 48 + i_0_ * 4, 48 + (104 - i_1_ - class91_sub20_sub7.anInt2313 * -1173592851) * 4 + i_19_);
					}
				} else if (9 == i_16_) {
					int i_20_ = 15658734;
					if (i_5_ > 0) {
						i_20_ = 15597568;
					}
					final int[] is = Class97.aClass91_Sub20_Sub13_Sub3_1214.anIntArray2557;
					final int i_21_ = (103 - i_1_) * 2048 + 24624 + i_0_ * 4;
					if (i_15_ != 0 && 2 != i_15_) {
						is[i_21_] = i_20_;
						is[i_21_ + 512 + 1] = i_20_;
						is[2 + i_21_ + 1024] = i_20_;
						is[3 + i_21_ + 1536] = i_20_;
					} else {
						is[1536 + i_21_] = i_20_;
						is[i_21_ + 1024 + 1] = i_20_;
						is[512 + i_21_ + 2] = i_20_;
						is[i_21_ + 3] = i_20_;
					}
				}
			}
			i_5_ = Class107.aClass39_1397.method311(i, i_0_, i_1_);
			if (i_5_ != 0) {
				final int i_22_ = i_5_ >> 14 & 0x7fff;
				final LocType class91_sub20_sub7 = Class60.method392(i_22_, 1964532251);
				if (class91_sub20_sub7.anInt2326 * -1199337683 != -1) {
					final Class91_Sub20_Sub13_Sub1 class91_sub20_sub13_sub1 = Class19.aClass91_Sub20_Sub13_Sub1Array255[-1199337683 * class91_sub20_sub7.anInt2326];
					if (class91_sub20_sub13_sub1 != null) {
						final int i_23_ = (class91_sub20_sub7.anInt2312 * 431853868 - class91_sub20_sub13_sub1.anInt2517) / 2;
						final int i_24_ = (-399404108 * class91_sub20_sub7.anInt2313 - class91_sub20_sub13_sub1.anInt2519) / 2;
						class91_sub20_sub13_sub1.method840(4 * i_0_ + 48 + i_23_, (104 - i_1_ - class91_sub20_sub7.anInt2313 * -1173592851) * 4 + 48 + i_24_);
					}
				}
			}
		} catch (final RuntimeException var18) {
			throw method1086(var18, "r.bh()");
		}
	}

	static final void method1081(final Class91_Sub10 class91_sub10, final boolean bool, final int i) {
		try {
			final int i_25_ = 337747539 * class91_sub10.anInt1865;
			final int i_26_ = (int) class91_sub10.aLong1192;
			class91_sub10.method495();
			if (bool) {
				if (i_25_ == -1) {
					if (i != -1363054508) {
						throw new IllegalStateException();
					}
				} else if (!Class91_Sub18.aBooleanArray1961[i_25_]) {
					if (i != -1363054508) {
						throw new IllegalStateException();
					}
				} else {
					Class91_Sub18.aClass63_2056.method406(i_25_, 142378614);
					if (Class91_Sub18.aClass91_Sub18ArrayArray1962[i_25_] != null) {
						boolean bool_27_ = true;
						for (int i_28_ = 0; i_28_ < Class91_Sub18.aClass91_Sub18ArrayArray1962[i_25_].length; i_28_++) {
							if (Class91_Sub18.aClass91_Sub18ArrayArray1962[i_25_][i_28_] != null) {
								if (2 != 633275603 * Class91_Sub18.aClass91_Sub18ArrayArray1962[i_25_][i_28_].anInt2057) {
									Class91_Sub18.aClass91_Sub18ArrayArray1962[i_25_][i_28_] = null;
								} else {
									bool_27_ = false;
								}
							}
						}
						if (bool_27_) {
							Class91_Sub18.aClass91_Sub18ArrayArray1962[i_25_] = null;
						}
						Class91_Sub18.aBooleanArray1961[i_25_] = false;
					}
				}
			}
			for (Class91_Sub17 class91_sub17 = (Class91_Sub17) client.aClass83_1642.method476(); class91_sub17 != null; class91_sub17 = (Class91_Sub17) client.aClass83_1642.method477()) {
				if (i_25_ == (class91_sub17.aLong1192 >> 48 & 0xffffL)) {
					class91_sub17.method495();
				}
			}
			final Class91_Sub18 class91_sub18 = Class61.method394(i_26_, -631047529);
			if (class91_sub18 != null) {
				Class28_Sub1.method272(class91_sub18, -1905179897);
			}
			for (int i_29_ = 0; i_29_ < client.anInt1585 * 1335574821; i_29_++) {
				if (method1082(client.anIntArray1588[i_29_], -1761471391)) {
					if (i_29_ < 1335574821 * client.anInt1585 - 1) {
						for (int i_30_ = i_29_; i_30_ < client.anInt1585 * 1335574821 - 1; i_30_++) {
							client.aStringArray1638[i_30_] = client.aStringArray1638[i_30_ + 1];
							client.aStringArray1591[i_30_] = client.aStringArray1591[i_30_ + 1];
							client.anIntArray1588[i_30_] = client.anIntArray1588[1 + i_30_];
							client.anIntArray1589[i_30_] = client.anIntArray1589[1 + i_30_];
							client.anIntArray1586[i_30_] = client.anIntArray1586[1 + i_30_];
							client.anIntArray1587[i_30_] = client.anIntArray1587[i_30_ + 1];
						}
					}
					client.anInt1585 -= 109114029;
				}
			}
			if (-1 != -1918719153 * client.anInt1602) {
				Class34.method281(client.anInt1602 * -1918719153, 1, 2021309500);
			}
		} catch (final RuntimeException var8) {
			throw method1086(var8, "r.cs()");
		}
	}

	Class102() throws Throwable {
		try {
			throw new Error();
		} catch (final RuntimeException runtimeexception) {
			throw method1086(runtimeexception, "r.<init>()");
		}
	}

	static boolean method1082(final int i, final int i_31_) {
		boolean bool;
		try {
			if (i != 57 && 58 != i && i != 1007 && i != 25 && 30 != i) {
				final boolean bool_32_ = false;
				return bool_32_;
			}
			final boolean bool_33_ = true;
			bool = bool_33_;
		} catch (final RuntimeException runtimeexception) {
			throw method1086(runtimeexception, "r.bx()");
		}
		return bool;
	}

	static int method1083(final int i, final int i_34_, final int i_35_) {
		try {
			final Class91_Sub22 class91_sub22 = (Class91_Sub22) Class91_Sub22.aClass83_2108.method474(i);
			if (class91_sub22 == null) {
				return 0;
			}
			if (i_34_ >= 0 && i_34_ < class91_sub22.anIntArray2106.length) {
				return class91_sub22.anIntArray2106[i_34_];
			}
		} catch (final RuntimeException runtimeexception) {
			throw method1086(runtimeexception, "r.i()");
		}
		return 0;
	}

	static final void method1084(final int i, final int i_36_) {
		try {
			if (!Class91_Sub20_Sub9.method800(i, -373179796)) {
				if (i_36_ >= -1572721369) {
					throw new IllegalStateException();
				}
			} else {
				final Class91_Sub18[] class91_sub18s = Class91_Sub18.aClass91_Sub18ArrayArray1962[i];
				Class91_Sub18[] class91_sub18s_38_;
				final int i_37_ = (class91_sub18s_38_ = class91_sub18s).length;
				for (int i_39_ = 0; i_39_ < i_37_; i_39_++) {
					final Class91_Sub18 class91_sub18 = class91_sub18s_38_[i_39_];
					final Class91_Sub18 class91_sub18_40_ = class91_sub18;
					if (class91_sub18_40_ != null) {
						class91_sub18_40_.anInt2075 = 0;
						class91_sub18_40_.anInt2076 = 0;
					}
				}
			}
		} catch (final RuntimeException var5) {
			throw method1086(var5, "r.cw()");
		}
	}

	public static void method1085(final Js5 class63, final Js5 class63_41_, final Js5 class63_42_, final int i) {
		try {
			Class91_Sub20_Sub5.aClass63_2272 = class63;
			Class91_Sub20_Sub5.aClass63_2264 = class63_41_;
			Class91_Sub20_Sub5.aClass63_2273 = class63_42_;
		} catch (final RuntimeException var4) {
			throw method1086(var4, "r.i()");
		}
	}

	public static RuntimeException_Sub1 method1086(final Throwable throwable, final String string) {
		RuntimeException_Sub1 runtimeexception_sub1;
		try {
			RuntimeException_Sub1 runtimeexception_sub1_43_;
			if (throwable instanceof RuntimeException_Sub1) {
				runtimeexception_sub1_43_ = (RuntimeException_Sub1) throwable;
				runtimeexception_sub1_43_.aString1411 = new StringBuilder(runtimeexception_sub1_43_.aString1411).append(' ').append(string).toString();
			} else {
				runtimeexception_sub1_43_ = new RuntimeException_Sub1(throwable, string);
			}
			runtimeexception_sub1 = runtimeexception_sub1_43_;
		} catch (final RuntimeException runtimeexception) {
			throw method1086(runtimeexception, "r.w()");
		}
		return runtimeexception_sub1;
	}

	public static Class2 method1087(final String string, final String string_44_, final boolean bool, final short i) {
		try {
			final File file = new File(Class35.aFile424, new StringBuilder("preferences").append(string).append(".dat").toString());
			do {
				if (file.exists()) {
					Class2 class2;
					try {
						final Class2 class2_45_ = new Class2(file, "rw", 10000L);
						class2 = class2_45_;
					} catch (final IOException ioexception) {
						break;
					}
					return class2;
				}
			} while (false);
			String string_46_ = "";
			if (Class35.anInt415 * 374804495 == 33) {
				string_46_ = "_rc";
			} else if (374804495 * Class35.anInt415 == 34) {
				string_46_ = "_wip";
			}
			final File file_47_ = new File(Class45.aString1436, new StringBuilder("jagex_").append(string_44_).append("_preferences").append(string).append(string_46_).append(".dat").toString());
			do {
				if (!bool && file_47_.exists()) {
					Class2 class2;
					try {
						final Class2 class2_48_ = new Class2(file_47_, "rw", 10000L);
						class2 = class2_48_;
					} catch (final IOException ioexception) {
						break;
					}
					return class2;
				}
			} while (false);
			Class2 class2;
			try {
				final Class2 class2_49_ = new Class2(file, "rw", 10000L);
				class2 = class2_49_;
			} catch (final IOException ioexception) {
				throw new RuntimeException();
			}
			return class2;
		} catch (final RuntimeException runtimeexception) {
			throw method1086(runtimeexception, "r.e()");
		}
	}

	public static boolean method1088(final CharSequence charsequence, final int i) {
		boolean bool;
		try {
			bool = Class91_Sub10.method700(charsequence, 10, true, (byte) -113);
		} catch (final RuntimeException runtimeexception) {
			throw method1086(runtimeexception, "r.i()");
		}
		return bool;
	}
}
