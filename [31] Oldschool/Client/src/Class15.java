/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class15 implements KeyListener, FocusListener {
	static int anInt204 = 0;
	static final int anInt205 = 13;
	static final int anInt206 = 1;
	static final int anInt207 = 2;
	static final int anInt208 = 3;
	public static int[] anIntArray209 = new int[128];
	static final int anInt210 = 6;
	static final int anInt211 = 8;
	static Class63_Sub1 aClass63_Sub1_212;
	static final int anInt213 = 41;
	static final int anInt214 = 51;
	static final int anInt215 = 52;
	public static Class15 aClass15_216 = new Class15();
	static int anInt217 = 0;
	public static boolean[] aBooleanArray218 = new boolean[112];
	static final int anInt219 = 100;
	public static int[] anIntArray220 = { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33,
			65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	public static int anInt221 = 0;
	static char[] aCharArray222 = new char[128];
	static int[] anIntArray223 = new int[128];
	static int anInt224 = 0;
	public static int anInt225 = 0;
	static int anInt226 = 0;
	static final int anInt227 = 105;
	public static volatile int anInt228 = 0;
	static final int anInt229 = 5;
	static final int anInt230 = 48;
	static int[] anIntArray231 = new int[128];
	static final int anInt232 = 9;
	public static final int anInt233 = 44;

	Class15() {
		/* empty */
	}

	@Override
	public final void keyTyped(final KeyEvent keyevent) {
		try {
			if (aClass15_216 != null) {
				final char c = keyevent.getKeyChar();
				if (c != 0 && c != '\uffff') {
					boolean bool;
					while_29_: do {
						if ((c <= 0 || c >= '\u0080') && (c < '\u00a0' || c > '\u00ff')) {
							if (c != 0) {
								final char[] cs = Class62.aCharArray757;
								for (int i = 0; i < cs.length; i++) {
									final char c_0_ = cs[i];
									if (c_0_ == c) {
										bool = true;
										break while_29_;
									}
								}
							}
							bool = false;
						} else {
							bool = true;
						}
					} while (false);
					if (bool) {
						final int i = 1405855449 * anInt217 + 1 & 0x7f;
						if (249871571 * anInt226 != i) {
							anIntArray223[anInt217 * 1405855449] = -1;
							aCharArray222[1405855449 * anInt217] = c;
							anInt217 = i * -218334871;
						}
					}
				}
			}
			keyevent.consume();
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "bl.keyTyped()");
		}
	}

	@Override
	public final synchronized void keyPressed(final KeyEvent keyevent) {
		try {
			if (aClass15_216 != null) {
				anInt228 = 0;
				int i = keyevent.getKeyCode();
				if (i >= 0 && i < anIntArray220.length) {
					i = anIntArray220[i];
					if ((i & 0x80) != 0) {
						i = -1;
					}
				} else {
					i = -1;
				}
				if (anInt221 * 1976398693 >= 0 && i >= 0) {
					anIntArray231[anInt221 * 1976398693] = i;
					anInt221 = (1976398693 * anInt221 + 1 & 0x7f) * 271812205;
					if (-961793973 * anInt224 == 1976398693 * anInt221) {
						anInt221 = -271812205;
					}
				}
				if (i >= 0) {
					final int i_1_ = 1405855449 * anInt217 + 1 & 0x7f;
					if (249871571 * anInt226 != i_1_) {
						anIntArray223[anInt217 * 1405855449] = i;
						aCharArray222[1405855449 * anInt217] = '\0';
						anInt217 = i_1_ * -218334871;
					}
				}
				final int i_2_ = keyevent.getModifiers();
				if ((i_2_ & 0xa) != 0 || i == 85 || 10 == i) {
					keyevent.consume();
				}
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "bl.keyPressed()");
		}
	}

	@Override
	public final synchronized void focusLost(final FocusEvent focusevent) {
		try {
			if (aClass15_216 != null) {
				anInt221 = -271812205;
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "bl.focusLost()");
		}
	}

	@Override
	public final synchronized void keyReleased(final KeyEvent keyevent) {
		try {
			if (aClass15_216 != null) {
				anInt228 = 0;
				int i = keyevent.getKeyCode();
				if (i >= 0 && i < anIntArray220.length) {
					i = anIntArray220[i] & ~0x80;
				} else {
					i = -1;
				}
				if (anInt221 * 1976398693 >= 0 && i >= 0) {
					anIntArray231[1976398693 * anInt221] = i ^ 0xffffffff;
					anInt221 = (1 + anInt221 * 1976398693 & 0x7f) * 271812205;
					if (-961793973 * anInt224 == anInt221 * 1976398693) {
						anInt221 = -271812205;
					}
				}
			}
			keyevent.consume();
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "bl.keyReleased()");
		}
	}

	@Override
	public final void focusGained(final FocusEvent focusevent) {
		/* empty */
	}

	public static final Class91_Sub20_Sub13_Sub3 method178(final int i, final int i_3_, final int i_4_, final int i_5_, final boolean bool, final byte i_6_) {
		Class91_Sub20_Sub13_Sub3 class91_sub20_sub13_sub3;
		try {
			final long l = ((long) i_4_ << 38) + i + ((long) i_3_ << 16) + ((long) i_5_ << 40);
			if (!bool) {
				final Class91_Sub20_Sub13_Sub3 class91_sub20_sub13_sub3_7_ = (Class91_Sub20_Sub13_Sub3) ObjType.aClass96_2390.method1068(l);
				if (class91_sub20_sub13_sub3_7_ != null) {
					return class91_sub20_sub13_sub3_7_;
				}
			}
			ObjType class91_sub20_sub8 = Class86_Sub1.method490(i, 234554293);
			if (i_3_ > 1) {
				if (i_6_ != 0) {
					throw new IllegalStateException();
				}
				if (class91_sub20_sub8.anIntArray2385 != null) {
					int i_8_ = -1;
					for (int i_9_ = 0; i_9_ < 10; i_9_++) {
						if (i_6_ != 0) {
							throw new IllegalStateException();
						}
						if (i_3_ >= class91_sub20_sub8.anIntArray2386[i_9_] && class91_sub20_sub8.anIntArray2386[i_9_] != 0) {
							i_8_ = class91_sub20_sub8.anIntArray2385[i_9_];
						}
					}
					if (-1 != i_8_) {
						class91_sub20_sub8 = Class86_Sub1.method490(i_8_, 234554293);
					}
				}
			}
			final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3 = class91_sub20_sub8.method790(1, -1914332238);
			if (class91_sub20_sub14_sub3 == null) {
				return null;
			}
			Class91_Sub20_Sub13_Sub3 class91_sub20_sub13_sub3_10_ = null;
			if (-1 != class91_sub20_sub8.anInt2384 * -1826659211) {
				if (i_6_ != 0) {
					throw new IllegalStateException();
				}
				class91_sub20_sub13_sub3_10_ = method178(-490096559 * class91_sub20_sub8.anInt2387, 10, 1, 0, true, (byte) 0);
				if (class91_sub20_sub13_sub3_10_ == null) {
					return null;
				}
			}
			final int[] is = Class91_Sub20_Sub13.anIntArray2481;
			final int i_11_ = Class91_Sub20_Sub13.anInt2483;
			final int i_12_ = Class91_Sub20_Sub13.anInt2482;
			final int[] is_13_ = new int[4];
			Class91_Sub20_Sub13.method823(is_13_);
			final Class91_Sub20_Sub13_Sub3 class91_sub20_sub13_sub3_14_ = new Class91_Sub20_Sub13_Sub3(36, 32);
			Class91_Sub20_Sub13.method819(class91_sub20_sub13_sub3_14_.anIntArray2557, 36, 32);
			Class91_Sub20_Sub13.method825();
			Class91_Sub20_Sub13_Sub2.method855();
			Class91_Sub20_Sub13_Sub2.method841(16, 16);
			Class91_Sub20_Sub13_Sub2.aBoolean2526 = false;
			int i_15_ = -1299485203 * class91_sub20_sub8.anInt2362;
			if (bool) {
				if (i_6_ != 0) {
					throw new IllegalStateException();
				}
				i_15_ *= 1.5;
			} else if (i_4_ == 2) {
				if (i_6_ != 0) {
					throw new IllegalStateException();
				}
				i_15_ = (int) (1.04 * i_15_);
			}
			final int i_16_ = i_15_ * Class91_Sub20_Sub13_Sub2.anIntArray2546[-1197334297 * class91_sub20_sub8.anInt2363] >> 16;
			final int i_17_ = Class91_Sub20_Sub13_Sub2.anIntArray2547[class91_sub20_sub8.anInt2363 * -1197334297] * i_15_ >> 16;
			class91_sub20_sub14_sub3.method974();
			class91_sub20_sub14_sub3.method982(0, -618695953 * class91_sub20_sub8.anInt2354, 833420795 * class91_sub20_sub8.anInt2365, class91_sub20_sub8.anInt2363 * -1197334297, class91_sub20_sub8.anInt2366 * 1102236969, i_16_ + 1142621617 * class91_sub20_sub14_sub3.anInt2488 / 2 + class91_sub20_sub8.anInt2367 * -907538121, i_17_ + -907538121 * class91_sub20_sub8.anInt2367);
			if (i_4_ >= 1) {
				if (i_6_ != 0) {
					throw new IllegalStateException();
				}
				class91_sub20_sub13_sub3_14_.method866(1);
			}
			if (i_4_ >= 2) {
				class91_sub20_sub13_sub3_14_.method866(16777215);
			}
			if (i_5_ != 0) {
				if (i_6_ != 0) {
					throw new IllegalStateException();
				}
				class91_sub20_sub13_sub3_14_.method867(i_5_);
			}
			Class91_Sub20_Sub13.method819(class91_sub20_sub13_sub3_14_.anIntArray2557, 36, 32);
			if (-1 != -1826659211 * class91_sub20_sub8.anInt2384) {
				if (i_6_ != 0) {
					throw new IllegalStateException();
				}
				class91_sub20_sub13_sub3_10_.method880(0, 0);
			}
			if (!bool && (1277482383 * class91_sub20_sub8.anInt2368 == 1 || 1 != i_3_) && -1 != i_3_) {
				if (i_6_ != 0) {
					throw new IllegalStateException();
				}
				final Class91_Sub20_Sub13_Sub4_Sub1 class91_sub20_sub13_sub4_sub1 = Class108.aClass91_Sub20_Sub13_Sub4_Sub1_1403;
				String string;
				if (i_3_ < 100000) {
					if (i_6_ != 0) {
						throw new IllegalStateException();
					}
					string = new StringBuilder("<col=ffff00>").append(i_3_).append("</col>").toString();
				} else if (i_3_ < 10000000) {
					if (i_6_ != 0) {
						throw new IllegalStateException();
					}
					string = new StringBuilder("<col=ffffff>").append(i_3_ / 1000).append(Class75.aString1004).append("</col>").toString();
				} else {
					string = new StringBuilder("<col=00ff80>").append(i_3_ / 1000000).append(Class75.aString918).append("</col>").toString();
				}
				class91_sub20_sub13_sub4_sub1.method906(string, 0, 9, 16776960, 1);
			}
			if (!bool) {
				if (i_6_ != 0) {
					throw new IllegalStateException();
				}
				ObjType.aClass96_2390.method1067(class91_sub20_sub13_sub3_14_, l);
			}
			Class91_Sub20_Sub13.method819(is, i_11_, i_12_);
			Class91_Sub20_Sub13.method824(is_13_);
			Class91_Sub20_Sub13_Sub2.method855();
			Class91_Sub20_Sub13_Sub2.aBoolean2526 = true;
			class91_sub20_sub13_sub3 = class91_sub20_sub13_sub3_14_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bl.r()");
		}
		return class91_sub20_sub13_sub3;
	}

	static final void method179(final int i, final int i_18_, final int i_19_, final int i_20_, final int i_21_, final int i_22_, final int i_23_, final int i_24_) {
		try {
			if (i_19_ >= 1 && i_20_ >= 1 && i_19_ <= 102 && i_20_ <= 102) {
				if (!client.aBoolean1691 || i == Class100.anInt1248 * -1723088013) {
					int i_25_ = 0;
					if (i_18_ == 0) {
						i_25_ = Class107.aClass39_1397.method303(i, i_19_, i_20_);
					}
					if (i_18_ == 1) {
						i_25_ = Class107.aClass39_1397.method306(i, i_19_, i_20_);
					}
					if (i_18_ == 2) {
						i_25_ = Class107.aClass39_1397.method310(i, i_19_, i_20_);
					}
					if (i_18_ == 3) {
						i_25_ = Class107.aClass39_1397.method311(i, i_19_, i_20_);
					}
					if (i_25_ != 0) {
						final int i_26_ = Class107.aClass39_1397.method312(i, i_19_, i_20_, i_25_);
						final int i_27_ = i_25_ >> 14 & 0x7fff;
						final int i_28_ = i_26_ & 0x1f;
						final int i_29_ = i_26_ >> 6 & 0x3;
						if (i_18_ == 0) {
							Class107.aClass39_1397.method304(i, i_19_, i_20_);
							final LocType class91_sub20_sub7 = Class60.method392(i_27_, -2141744218);
							if (1727180835 * class91_sub20_sub7.anInt2314 != 0) {
								client.aClass76Array1530[i].method460(i_19_, i_20_, i_28_, i_29_, class91_sub20_sub7.aBoolean2315, (byte) 0);
							}
						}
						if (1 == i_18_) {
							Class107.aClass39_1397.method305(i, i_19_, i_20_);
						}
						do {
							if (i_18_ == 2) {
								Class107.aClass39_1397.method292(i, i_19_, i_20_);
								final LocType class91_sub20_sub7 = Class60.method392(i_27_, 1219110852);
								if (class91_sub20_sub7.anInt2312 * -2039520181 + i_19_ <= 103 && class91_sub20_sub7.anInt2312 * -2039520181 + i_20_ <= 103 && -1173592851 * class91_sub20_sub7.anInt2313 + i_19_ <= 103) {
									if (i_20_ + class91_sub20_sub7.anInt2313 * -1173592851 <= 103) {
										if (1727180835 * class91_sub20_sub7.anInt2314 != 0) {
											client.aClass76Array1530[i].method465(i_19_, i_20_, -2039520181 * class91_sub20_sub7.anInt2312, class91_sub20_sub7.anInt2313 * -1173592851, i_29_, class91_sub20_sub7.aBoolean2315, 1769240085);
										}
										break;
									}
									if (i_24_ >= 1000895950) {
										return;
									}
								}
								return;
							}
						} while (false);
						if (3 == i_18_) {
							Class107.aClass39_1397.method338(i, i_19_, i_20_);
							final LocType class91_sub20_sub7 = Class60.method392(i_27_, -629010149);
							if (1 == 1727180835 * class91_sub20_sub7.anInt2314) {
								client.aClass76Array1530[i].method454(i_19_, i_20_, -102739640);
							}
						}
					}
					if (i_21_ >= 0) {
						int i_30_ = i;
						if (i < 3 && (Class102.aByteArrayArrayArray1299[1][i_19_][i_20_] & 0x2) == 2) {
							i_30_ = i + 1;
						}
						Class28.method264(i, i_30_, i_19_, i_20_, i_21_, i_22_, i_23_, Class107.aClass39_1397, client.aClass76Array1530[i], 16777216);
					}
				}
			}
		} catch (final RuntimeException var14) {
			throw Class102.method1086(var14, "bl.bp()");
		}
	}

	static final void method180(final int i) {
		try {
			int i_31_ = 64 + 1344985472 * Class103.anInt1333;
			int i_32_ = Class107.anInt1395 * 932667008 + 64;
			int i_33_ = Class4.method92(i_31_, i_32_, -1723088013 * Class100.anInt1248, -1444420209) - Class41.anInt549 * 1699037233;
			if (-393490213 * Class101.anInt1288 < i_31_) {
				Class101.anInt1288 += ((i_31_ - Class101.anInt1288 * -393490213) * -614631057 * Class21.anInt276 / 1000 + -204585061 * Class91_Sub24.anInt2125) * -229921965;
				if (-393490213 * Class101.anInt1288 > i_31_) {
					Class101.anInt1288 = -229921965 * i_31_;
				}
			}
			if (-393490213 * Class101.anInt1288 > i_31_) {
				Class101.anInt1288 -= ((-393490213 * Class101.anInt1288 - i_31_) * Class21.anInt276 * -614631057 / 1000 + -204585061 * Class91_Sub24.anInt2125) * -229921965;
				if (Class101.anInt1288 * -393490213 < i_31_) {
					Class101.anInt1288 = -229921965 * i_31_;
				}
			}
			if (Class100.anInt1244 * 1224950237 < i_33_) {
				Class100.anInt1244 += -238608779 * (-204585061 * Class91_Sub24.anInt2125 + Class21.anInt276 * -614631057 * (i_33_ - Class100.anInt1244 * 1224950237) / 1000);
				if (Class100.anInt1244 * 1224950237 > i_33_) {
					Class100.anInt1244 = i_33_ * -238608779;
				}
			}
			if (Class100.anInt1244 * 1224950237 > i_33_) {
				Class100.anInt1244 -= -238608779 * (-204585061 * Class91_Sub24.anInt2125 + (1224950237 * Class100.anInt1244 - i_33_) * -614631057 * Class21.anInt276 / 1000);
				if (1224950237 * Class100.anInt1244 < i_33_) {
					Class100.anInt1244 = -238608779 * i_33_;
				}
			}
			if (Class105.anInt1365 * 2015226289 < i_32_) {
				Class105.anInt1365 += ((i_32_ - Class105.anInt1365 * 2015226289) * -614631057 * Class21.anInt276 / 1000 + -204585061 * Class91_Sub24.anInt2125) * 495894353;
				if (Class105.anInt1365 * 2015226289 > i_32_) {
					Class105.anInt1365 = 495894353 * i_32_;
				}
			}
			if (2015226289 * Class105.anInt1365 > i_32_) {
				Class105.anInt1365 -= 495894353 * ((Class105.anInt1365 * 2015226289 - i_32_) * Class21.anInt276 * -614631057 / 1000 + Class91_Sub24.anInt2125 * -204585061);
				if (Class105.anInt1365 * 2015226289 < i_32_) {
					Class105.anInt1365 = 495894353 * i_32_;
				}
			}
			i_31_ = 1388948352 * Class2.anInt37 + 64;
			i_32_ = -1514952832 * Class54.anInt642 + 64;
			i_33_ = Class4.method92(i_31_, i_32_, Class100.anInt1248 * -1723088013, -1975810074) - Class34.anInt406 * 415878277;
			final int i_34_ = i_31_ - Class101.anInt1288 * -393490213;
			final int i_35_ = i_33_ - 1224950237 * Class100.anInt1244;
			final int i_36_ = i_32_ - Class105.anInt1365 * 2015226289;
			final int i_37_ = (int) Math.sqrt(i_34_ * i_34_ + i_36_ * i_36_);
			int i_38_ = (int) (Math.atan2(i_35_, i_37_) * 325.949) & 0x7ff;
			final int i_39_ = (int) (Math.atan2(i_34_, i_36_) * -325.949) & 0x7ff;
			if (i_38_ < 128) {
				i_38_ = 128;
			}
			if (i_38_ > 383) {
				i_38_ = 383;
			}
			if (234823659 * Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 < i_38_) {
				Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 += 1862537411 * (Class40.anInt543 * 1875152117 + (i_38_ - Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 * 234823659) * -743222199 * Class24.anInt300 / 1000);
				if (Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 * 234823659 > i_38_) {
					Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 = i_38_ * 1862537411;
				}
			}
			if (234823659 * Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 > i_38_) {
				Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 -= 1862537411 * (Class40.anInt543 * 1875152117 + (Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 * 234823659 - i_38_) * Class24.anInt300 * -743222199 / 1000);
				if (234823659 * Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 < i_38_) {
					Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 = 1862537411 * i_38_;
				}
			}
			int i_40_ = i_39_ - Class97.anInt1219 * -1061542797;
			if (i_40_ > 1024) {
				i_40_ -= 2048;
			}
			if (i_40_ < -1024) {
				i_40_ += 2048;
			}
			if (i_40_ > 0) {
				Class97.anInt1219 += (i_40_ * Class24.anInt300 * -743222199 / 1000 + 1875152117 * Class40.anInt543) * -110944069;
				Class97.anInt1219 = (Class97.anInt1219 * -1061542797 & 0x7ff) * -110944069;
			}
			if (i_40_ < 0) {
				Class97.anInt1219 -= (Class40.anInt543 * 1875152117 + Class24.anInt300 * -743222199 * -i_40_ / 1000) * -110944069;
				Class97.anInt1219 = (Class97.anInt1219 * -1061542797 & 0x7ff) * -110944069;
			}
			int i_41_ = i_39_ - -1061542797 * Class97.anInt1219;
			if (i_41_ > 1024) {
				i_41_ -= 2048;
			}
			if (i_41_ < -1024) {
				i_41_ += 2048;
			}
			if (i_41_ < 0 && i_40_ > 0 || i_41_ > 0 && i_40_ < 0) {
				Class97.anInt1219 = -110944069 * i_39_;
			}
		} catch (final RuntimeException var12) {
			throw Class102.method1086(var12, "bl.ah()");
		}
	}
}
