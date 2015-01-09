/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.util.Hashtable;

public class Class18 {
	public static final int anInt244 = 2;
	static boolean aBoolean245 = false;
	static Hashtable aHashtable246 = new Hashtable(16);
	static final int anInt247 = 17;
	static Class91_Sub20_Sub13_Sub1[] aClass91_Sub20_Sub13_Sub1Array248;
	public static final int anInt249 = 65;
	public static final int anInt250 = 174;
	static File aFile251;

	static int method185(final int i, final int i_0_, final short i_1_) {
		int i_2_;
		try {
			final Class91_Sub22 class91_sub22 = (Class91_Sub22) Class91_Sub22.aClass83_2108.method474(i);
			if (class91_sub22 == null) {
				return 0;
			}
			if (i_0_ == -1) {
				return 0;
			}
			int i_3_ = 0;
			for (int i_4_ = 0; i_4_ < class91_sub22.anIntArray2106.length; i_4_++) {
				if (class91_sub22.anIntArray2105[i_4_] == i_0_) {
					i_3_ += class91_sub22.anIntArray2106[i_4_];
				}
			}
			i_2_ = i_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bo.w()");
		}
		return i_2_;
	}

	static void method186(final int i) {
		try {
			Class37.anIntArray445 = null;
			Class89.anIntArray1183 = null;
			Class57.anIntArray698 = null;
			Class37.anIntArray449 = null;
			FloUnderlayType.anIntArray2418 = null;
			Class74.aByteArrayArray844 = null;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "bo.m()");
		}
	}

	Class18() throws Throwable {
		try {
			throw new Error();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bo.<init>()");
		}
	}

	public static int method187(final byte[] is, final int i, final byte i_5_) {
		int i_6_;
		try {
			i_6_ = Class91_Sub20_Sub2.method738(is, 0, i, -877435761);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bo.aa()");
		}
		return i_6_;
	}

	static final boolean method188(final int i, final int i_7_, final int i_8_, final int i_9_, final boolean bool, final int i_10_, final int i_11_, final int i_12_, final int i_13_, final int i_14_, final int i_15_, final int i_16_) {
		try {
			for (int i_17_ = 0; i_17_ < 104; i_17_++) {
				for (int i_18_ = 0; i_18_ < 104; i_18_++) {
					client.anIntArrayArray1502[i_17_][i_18_] = 0;
					client.anIntArrayArray1460[i_17_][i_18_] = 99999999;
				}
			}
			int i_19_ = i;
			int i_20_ = i_7_;
			client.anIntArrayArray1502[i][i_7_] = 99;
			client.anIntArrayArray1460[i][i_7_] = 0;
			int i_22_ = 0;
			client.anIntArray1625[0] = i;
			int i_23_ = 1;
			client.anIntArray1505[0] = i_7_;
			boolean bool_24_ = false;
			int i_25_ = client.anIntArray1625.length;
			final int[][] is = client.aClass76Array1530[Class100.anInt1248 * -1723088013].anIntArrayArray1085;
			while (i_23_ != i_22_) {
				i_19_ = client.anIntArray1625[i_22_];
				i_20_ = client.anIntArray1505[i_22_];
				i_22_ = (i_22_ + 1) % i_25_;
				if (i_19_ == i_8_ && i_20_ == i_9_) {
					bool_24_ = true;
					break;
				}
				if (i_10_ != 0) {
					if ((i_10_ < 5 || i_10_ == 10) && client.aClass76Array1530[-1723088013 * Class100.anInt1248].method463(i_19_, i_20_, i_8_, i_9_, i_10_ - 1, i_11_, 1176310385)) {
						bool_24_ = true;
						break;
					}
					if (i_10_ < 10 && client.aClass76Array1530[-1723088013 * Class100.anInt1248].method464(i_19_, i_20_, i_8_, i_9_, i_10_ - 1, i_11_, 1873066496)) {
						bool_24_ = true;
						break;
					}
				}
				if (i_12_ != 0 && i_13_ != 0 && client.aClass76Array1530[Class100.anInt1248 * -1723088013].method466(i_19_, i_20_, i_8_, i_9_, i_12_, i_13_, i_14_, -1522868734)) {
					bool_24_ = true;
					break;
				}
				final int i_26_ = client.anIntArrayArray1460[i_19_][i_20_] + 1;
				if (i_19_ > 0 && client.anIntArrayArray1502[i_19_ - 1][i_20_] == 0 && (is[i_19_ - 1][i_20_] & 0x12c0108) == 0) {
					client.anIntArray1625[i_23_] = i_19_ - 1;
					client.anIntArray1505[i_23_] = i_20_;
					i_23_ = (1 + i_23_) % i_25_;
					client.anIntArrayArray1502[i_19_ - 1][i_20_] = 2;
					client.anIntArrayArray1460[i_19_ - 1][i_20_] = i_26_;
				}
				if (i_19_ < 103 && client.anIntArrayArray1502[i_19_ + 1][i_20_] == 0 && (is[1 + i_19_][i_20_] & 0x12c0180) == 0) {
					client.anIntArray1625[i_23_] = 1 + i_19_;
					client.anIntArray1505[i_23_] = i_20_;
					i_23_ = (i_23_ + 1) % i_25_;
					client.anIntArrayArray1502[1 + i_19_][i_20_] = 8;
					client.anIntArrayArray1460[i_19_ + 1][i_20_] = i_26_;
				}
				if (i_20_ > 0 && client.anIntArrayArray1502[i_19_][i_20_ - 1] == 0 && (is[i_19_][i_20_ - 1] & 0x12c0102) == 0) {
					client.anIntArray1625[i_23_] = i_19_;
					client.anIntArray1505[i_23_] = i_20_ - 1;
					i_23_ = (1 + i_23_) % i_25_;
					client.anIntArrayArray1502[i_19_][i_20_ - 1] = 1;
					client.anIntArrayArray1460[i_19_][i_20_ - 1] = i_26_;
				}
				if (i_20_ < 103 && client.anIntArrayArray1502[i_19_][1 + i_20_] == 0 && (is[i_19_][i_20_ + 1] & 0x12c0120) == 0) {
					client.anIntArray1625[i_23_] = i_19_;
					client.anIntArray1505[i_23_] = 1 + i_20_;
					i_23_ = (1 + i_23_) % i_25_;
					client.anIntArrayArray1502[i_19_][i_20_ + 1] = 4;
					client.anIntArrayArray1460[i_19_][i_20_ + 1] = i_26_;
				}
				if (i_19_ > 0 && i_20_ > 0 && client.anIntArrayArray1502[i_19_ - 1][i_20_ - 1] == 0 && (is[i_19_ - 1][i_20_ - 1] & 0x12c010e) == 0 && (is[i_19_ - 1][i_20_] & 0x12c0108) == 0 && (is[i_19_][i_20_ - 1] & 0x12c0102) == 0) {
					client.anIntArray1625[i_23_] = i_19_ - 1;
					client.anIntArray1505[i_23_] = i_20_ - 1;
					i_23_ = (1 + i_23_) % i_25_;
					client.anIntArrayArray1502[i_19_ - 1][i_20_ - 1] = 3;
					client.anIntArrayArray1460[i_19_ - 1][i_20_ - 1] = i_26_;
				}
				if (i_19_ < 103 && i_20_ > 0 && client.anIntArrayArray1502[1 + i_19_][i_20_ - 1] == 0 && (is[1 + i_19_][i_20_ - 1] & 0x12c0183) == 0 && (is[i_19_ + 1][i_20_] & 0x12c0180) == 0 && (is[i_19_][i_20_ - 1] & 0x12c0102) == 0) {
					client.anIntArray1625[i_23_] = 1 + i_19_;
					client.anIntArray1505[i_23_] = i_20_ - 1;
					i_23_ = (i_23_ + 1) % i_25_;
					client.anIntArrayArray1502[i_19_ + 1][i_20_ - 1] = 9;
					client.anIntArrayArray1460[i_19_ + 1][i_20_ - 1] = i_26_;
				}
				if (i_19_ > 0 && i_20_ < 103 && client.anIntArrayArray1502[i_19_ - 1][1 + i_20_] == 0 && (is[i_19_ - 1][1 + i_20_] & 0x12c0138) == 0 && (is[i_19_ - 1][i_20_] & 0x12c0108) == 0 && (is[i_19_][1 + i_20_] & 0x12c0120) == 0) {
					client.anIntArray1625[i_23_] = i_19_ - 1;
					client.anIntArray1505[i_23_] = 1 + i_20_;
					i_23_ = (i_23_ + 1) % i_25_;
					client.anIntArrayArray1502[i_19_ - 1][1 + i_20_] = 6;
					client.anIntArrayArray1460[i_19_ - 1][i_20_ + 1] = i_26_;
				}
				if (i_19_ < 103 && i_20_ < 103 && client.anIntArrayArray1502[i_19_ + 1][1 + i_20_] == 0 && (is[1 + i_19_][1 + i_20_] & 0x12c01e0) == 0 && (is[i_19_ + 1][i_20_] & 0x12c0180) == 0 && (is[i_19_][1 + i_20_] & 0x12c0120) == 0) {
					client.anIntArray1625[i_23_] = 1 + i_19_;
					client.anIntArray1505[i_23_] = 1 + i_20_;
					i_23_ = (i_23_ + 1) % i_25_;
					client.anIntArrayArray1502[i_19_ + 1][1 + i_20_] = 12;
					client.anIntArrayArray1460[1 + i_19_][1 + i_20_] = i_26_;
				}
			}
			client.anInt1697 = 0;
			if (!bool_24_) {
				if (!bool) {
					return false;
				}
				int i_27_ = 1000;
				int i_28_ = 100;
				for (int i_30_ = i_8_ - 10; i_30_ <= i_8_ + 10; i_30_++) {
					for (int i_31_ = i_9_ - 10; i_31_ <= 10 + i_9_; i_31_++) {
						if (i_30_ >= 0 && i_31_ >= 0 && i_30_ < 104 && i_31_ < 104 && client.anIntArrayArray1460[i_30_][i_31_] < 100) {
							int i_32_ = 0;
							if (i_30_ < i_8_) {
								i_32_ = i_8_ - i_30_;
							} else if (i_30_ > i_12_ + i_8_ - 1) {
								i_32_ = i_30_ - (i_12_ + i_8_ - 1);
							}
							int i_33_ = 0;
							if (i_31_ < i_9_) {
								i_33_ = i_9_ - i_31_;
							} else if (i_31_ > i_9_ + i_13_ - 1) {
								i_33_ = i_31_ - (i_9_ + i_13_ - 1);
							}
							final int i_34_ = i_33_ * i_33_ + i_32_ * i_32_;
							if (i_34_ < i_27_ || i_34_ == i_27_ && client.anIntArrayArray1460[i_30_][i_31_] < i_28_) {
								i_27_ = i_34_;
								i_28_ = client.anIntArrayArray1460[i_30_][i_31_];
								i_19_ = i_30_;
								i_20_ = i_31_;
							}
						}
					}
				}
				if (1000 == i_27_) {
					return false;
				}
				if (i == i_19_ && i_7_ == i_20_) {
					return false;
				}
				client.anInt1697 = 1176047037;
			}
			client.anIntArray1625[0] = i_19_;
			i_22_ = 1;
			client.anIntArray1505[0] = i_20_;
			int i_37_;
			int i_36_ = i_37_ = client.anIntArrayArray1502[i_19_][i_20_];
			for (;;) {
				if (i_19_ == i && i_20_ == i_7_) {
					if (i_22_ <= 0) {
						if (i_15_ == 1) {
							return false;
						}
						return true;
					}
					i_25_ = i_22_;
					if (i_22_ > 25) {
						i_25_ = 25;
					}
					i_22_--;
					final int i_38_ = client.anIntArray1625[i_22_];
					final int i_39_ = client.anIntArray1505[i_22_];
					if (i_15_ == 0) {
						client.aClass91_Sub9_Sub1_1478.method690(166, 1160292001);
						client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(3 + i_25_ + i_25_);
					}
					if (1 == i_15_) {
						client.aClass91_Sub9_Sub1_1478.method690(76, 1160292001);
						client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(14 + i_25_ + i_25_ + 3);
					}
					if (i_15_ == 2) {
						client.aClass91_Sub9_Sub1_1478.method690(117, 1160292001);
						client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(i_25_ + i_25_ + 3);
					}
					client.anInt1674 = 1979222465 * client.anIntArray1625[0];
					client.anInt1675 = client.anIntArray1505[0] * 1832044513;
					for (int i_40_ = 1; i_40_ < i_25_; i_40_++) {
						i_22_--;
						client.aClass91_Sub9_Sub1_1478.method641(client.anIntArray1625[i_22_] - i_38_, 1186854139);
						client.aClass91_Sub9_Sub1_1478.method654(client.anIntArray1505[i_22_] - i_39_, (byte) 59);
					}
					client.aClass91_Sub9_Sub1_1478.method660(Class91_Sub20_Sub15.anInt2497 * 1838527067 + i_39_, (byte) 76);
					int i_41_;
					if (Class15.aBooleanArray218[82]) {
						i_41_ = 1;
					} else {
						i_41_ = 0;
					}
					client.aClass91_Sub9_Sub1_1478.method654(i_41_, (byte) 116);
					client.aClass91_Sub9_Sub1_1478.method681(i_38_ + 1885886277 * Class40.anInt541, -372694149);
					return true;
				}
				if (i_36_ != i_37_) {
					i_37_ = i_36_;
					client.anIntArray1625[i_22_] = i_19_;
					client.anIntArray1505[i_22_++] = i_20_;
				}
				if ((i_36_ & 0x2) != 0) {
					i_19_++;
				} else if ((i_36_ & 0x8) != 0) {
					i_19_--;
				}
				if ((i_36_ & 0x1) != 0) {
					i_20_++;
				} else if ((i_36_ & 0x4) != 0) {
					i_20_--;
				}
				i_36_ = client.anIntArrayArray1502[i_19_][i_20_];
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bo.bn()");
		}
	}
}
