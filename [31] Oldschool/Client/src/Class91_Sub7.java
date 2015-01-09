/* Class91_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class91_Sub7 extends Class91 {
	int anInt1823;
	int anInt1824;
	int anInt1825;
	int anInt1826;
	Class34 aClass34_1827;
	Class33[] aClass33Array1828;
	Class36 aClass36_1829;
	Class27 aClass27_1830;
	Class44 aClass44_1831;
	Class38 aClass38_1832;
	int anInt1833;
	int anInt1834;
	Class58 aClass58_1835;
	int anInt1836;
	int anInt1837;
	boolean aBoolean1838;
	public static final int anInt1839 = 191;
	boolean aBoolean1840;
	boolean aBoolean1841;
	int anInt1842;
	int anInt1843;
	int anInt1844;
	Class91_Sub7 aClass91_Sub7_1845;
	static final int anInt1846 = 3;
	int[] anIntArray1847;

	static String method623(final char c, final int i, final byte i_0_) {
		String string;
		try {
			final char[] cs = new char[i];
			for (int i_1_ = 0; i_1_ < i; i_1_++) {
				cs[i_1_] = c;
			}
			string = new String(cs);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "cn.p()");
		}
		return string;
	}

	static Class91_Sub20_Sub17 method624(final int i, final int i_2_) {
		Class91_Sub20_Sub17 class91_sub20_sub17;
		try {
			Class91_Sub20_Sub17 class91_sub20_sub17_3_ = (Class91_Sub20_Sub17) Class91_Sub20_Sub17.aClass96_2511.method1068(i);
			if (class91_sub20_sub17_3_ != null) {
				return class91_sub20_sub17_3_;
			}
			final byte[] is = Class42.aClass63_Sub1_556.getFile(i, 0, -1774733130);
			if (is == null) {
				return null;
			}
			class91_sub20_sub17_3_ = new Class91_Sub20_Sub17();
			final ByteBuffer class91_sub9 = new ByteBuffer(is);
			class91_sub9.currentOffset = (class91_sub9.buffer.length - 12) * 565881095;
			final int i_4_ = class91_sub9.readDword();
			class91_sub20_sub17_3_.anInt2507 = class91_sub9.method686((byte) -34) * 1012202895;
			class91_sub20_sub17_3_.anInt2508 = class91_sub9.method686((byte) -41) * -2144343053;
			class91_sub20_sub17_3_.anInt2509 = class91_sub9.method686((byte) -111) * -1240030435;
			class91_sub20_sub17_3_.anInt2513 = class91_sub9.method686((byte) -90) * 166726287;
			class91_sub9.currentOffset = 0;
			class91_sub9.method682(2065510369);
			class91_sub20_sub17_3_.anIntArray2504 = new int[i_4_];
			class91_sub20_sub17_3_.anIntArray2505 = new int[i_4_];
			class91_sub20_sub17_3_.aStringArray2512 = new String[i_4_];
			int i_5_ = 0;
			while (class91_sub9.currentOffset * -1128893257 < class91_sub9.buffer.length - 12) {
				final int i_6_ = class91_sub9.method686((byte) -68);
				if (i_6_ == 3) {
					class91_sub20_sub17_3_.aStringArray2512[i_5_] = class91_sub9.method645((byte) -26);
				} else if (i_6_ < 100 && i_6_ != 21 && 38 != i_6_ && i_6_ != 39) {
					class91_sub20_sub17_3_.anIntArray2505[i_5_] = class91_sub9.readDword();
				} else {
					class91_sub20_sub17_3_.anIntArray2505[i_5_] = class91_sub9.readUnsignedByte();
				}
				class91_sub20_sub17_3_.anIntArray2504[i_5_++] = i_6_;
			}
			Class91_Sub20_Sub17.aClass96_2511.method1067(class91_sub20_sub17_3_, i);
			class91_sub20_sub17 = class91_sub20_sub17_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "cn.i()");
		}
		return class91_sub20_sub17;
	}

	static final boolean method625(final int i, final int i_7_, final int i_8_, final int i_9_) {
		try {
			final int i_10_ = i_8_ >> 14 & 0x7fff;
			final int i_11_ = Class107.aClass39_1397.method312(-1723088013 * Class100.anInt1248, i, i_7_, i_8_);
			if (i_11_ == -1) {
				return false;
			}
			final int i_12_ = i_11_ & 0x1f;
			final int i_13_ = i_11_ >> 6 & 0x3;
			if (i_12_ != 10 && i_12_ != 11 && 22 != i_12_) {
				Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i, i_7_, true, 1 + i_12_, i_13_, 0, 0, 0, 2, -1994838449);
			} else {
				final LocType class91_sub20_sub7 = Class60.method392(i_10_, -1655828642);
				int i_14_;
				int i_15_;
				if (i_13_ != 0 && 2 != i_13_) {
					i_14_ = -1173592851 * class91_sub20_sub7.anInt2313;
					i_15_ = class91_sub20_sub7.anInt2312 * -2039520181;
				} else {
					i_14_ = -2039520181 * class91_sub20_sub7.anInt2312;
					i_15_ = -1173592851 * class91_sub20_sub7.anInt2313;
				}
				int i_16_ = -1837389069 * class91_sub20_sub7.anInt2335;
				if (i_13_ != 0) {
					i_16_ = (i_16_ << i_13_ & 0xf) + (i_16_ >> 4 - i_13_);
				}
				Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i, i_7_, true, 0, 0, i_14_, i_15_, i_16_, 2, 836294966);
			}
			client.anInt1465 = Class12.anInt180 * 1695367541;
			client.anInt1550 = -1402467547 * Class12.anInt167;
			client.anInt1552 = -1272165154;
			client.anInt1551 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "cn.ba()");
		}
		return true;
	}

	Class91_Sub7(final int i, final int i_17_, final int i_18_) {
		try {
			this.aClass33Array1828 = new Class33[5];
			this.anIntArray1847 = new int[5];
			this.anInt1823 = 0;
			this.anInt1826 = (this.anInt1837 = i * -1642613559) * 1561414963;
			this.anInt1824 = 1498713631 * i_17_;
			this.anInt1825 = -424718003 * i_18_;
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "cn.<init>()");
		}
	}

	static final String[] method626(final String[] strings, final byte i) {
		String[] strings_19_;
		try {
			final String[] strings_20_ = new String[5];
			for (int i_21_ = 0; i_21_ < 5; i_21_++) {
				strings_20_[i_21_] = new StringBuilder(String.valueOf(i_21_)).append(": ").toString();
				if (strings != null && strings[i_21_] != null) {
					strings_20_[i_21_] = new StringBuilder(strings_20_[i_21_]).append(strings[i_21_]).toString();
				}
			}
			strings_19_ = strings_20_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "cn.cz()");
		}
		return strings_19_;
	}

	static final void method627(NpcType class91_sub20_sub11, final int i, final int i_22_, final int i_23_, final int i_24_) {
		try {
			if (client.anInt1585 * 1335574821 >= 400) {
				if (i_24_ == -1284296162) {
					throw new IllegalStateException();
				}
			} else {
				if (class91_sub20_sub11.anIntArray2453 != null) {
					class91_sub20_sub11 = class91_sub20_sub11.method814((byte) 86);
				}
				if (class91_sub20_sub11 != null && class91_sub20_sub11.aBoolean2456) {
					String string = class91_sub20_sub11.aString2428;
					if (1900788615 * class91_sub20_sub11.anInt2445 != 0) {
						final int i_25_ = 1900788615 * class91_sub20_sub11.anInt2445;
						final int i_26_ = Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2843 * -2033628249;
						final int i_27_ = i_26_ - i_25_;
						String string_28_;
						if (i_27_ < -9) {
							string_28_ = Class91_Sub21.method1033(16711680, -1115298758);
						} else if (i_27_ < -6) {
							string_28_ = Class91_Sub21.method1033(16723968, 236042812);
						} else if (i_27_ < -3) {
							string_28_ = Class91_Sub21.method1033(16740352, -1861825154);
						} else if (i_27_ < 0) {
							string_28_ = Class91_Sub21.method1033(16756736, -1423725508);
						} else if (i_27_ > 9) {
							string_28_ = Class91_Sub21.method1033(65280, -1779599600);
						} else if (i_27_ > 6) {
							string_28_ = Class91_Sub21.method1033(4259584, -1368375609);
						} else if (i_27_ > 3) {
							string_28_ = Class91_Sub21.method1033(8453888, -880216350);
						} else if (i_27_ > 0) {
							string_28_ = Class91_Sub21.method1033(12648192, -1299667487);
						} else {
							string_28_ = Class91_Sub21.method1033(16776960, -1777259579);
						}
						string = new StringBuilder(string).append(string_28_).append(" ").append(Class106.aString1368).append(Class75.aString996).append(class91_sub20_sub11.anInt2445 * 1900788615).append(Class106.aString1377).toString();
					}
					if (1 == 406349745 * client.anInt1596) {
						Class14.method175(Class75.aString990, new StringBuilder(client.aString1597).append(" ").append(Class106.aString1373).append(" ").append(Class91_Sub21.method1033(16776960, -438398531)).append(string).toString(), 7, i, i_22_, i_23_, -1101298913);
					} else if (client.aBoolean1568) {
						if ((1288780977 * Class40.anInt547 & 0x2) == 2) {
							Class14.method175(client.aString1600, new StringBuilder(client.aString1553).append(" ").append(Class106.aString1373).append(" ").append(Class91_Sub21.method1033(16776960, -484095806)).append(string).toString(), 8, i, i_22_, i_23_, -1101298913);
						}
					} else {
						String[] strings = class91_sub20_sub11.aStringArray2455;
						if (client.aBoolean1470) {
							strings = method626(strings, (byte) -21);
						}
						if (strings != null) {
							for (int i_29_ = 4; i_29_ >= 0; i_29_--) {
								if (strings[i_29_] != null && !strings[i_29_].equalsIgnoreCase(Class75.aString992)) {
									int i_30_ = 0;
									if (i_29_ == 0) {
										i_30_ = 9;
									}
									if (1 == i_29_) {
										i_30_ = 10;
									}
									if (2 == i_29_) {
										i_30_ = 11;
									}
									if (i_29_ == 3) {
										i_30_ = 12;
									}
									if (4 == i_29_) {
										i_30_ = 13;
									}
									Class14.method175(strings[i_29_], new StringBuilder(Class91_Sub21.method1033(16776960, -212853136)).append(string).toString(), i_30_, i, i_22_, i_23_, -1101298913);
								}
							}
						}
						if (strings != null) {
							for (int i_31_ = 4; i_31_ >= 0; i_31_--) {
								if (strings[i_31_] != null && strings[i_31_].equalsIgnoreCase(Class75.aString992)) {
									int i_32_ = 0;
									if (1900788615 * class91_sub20_sub11.anInt2445 > Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2843 * -2033628249) {
										i_32_ = 2000;
									}
									int i_33_ = 0;
									if (i_31_ == 0) {
										i_33_ = 9 + i_32_;
									}
									if (1 == i_31_) {
										i_33_ = i_32_ + 10;
									}
									if (i_31_ == 2) {
										i_33_ = 11 + i_32_;
									}
									if (i_31_ == 3) {
										i_33_ = i_32_ + 12;
									}
									if (4 == i_31_) {
										i_33_ = 13 + i_32_;
									}
									Class14.method175(strings[i_31_], new StringBuilder(Class91_Sub21.method1033(16776960, -1198229435)).append(string).toString(), i_33_, i, i_22_, i_23_, -1101298913);
								}
							}
						}
						Class14.method175(Class75.aString991, new StringBuilder(Class91_Sub21.method1033(16776960, -1333992721)).append(string).toString(), 1003, i, i_22_, i_23_, -1101298913);
					}
				}
			}
		} catch (final RuntimeException var11) {
			throw Class102.method1086(var11, "cn.bl()");
		}
	}
}
