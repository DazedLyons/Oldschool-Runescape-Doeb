/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class106 {
	static String aString1368 = " (";
	static String aString1369 = ",";
	static String aString1370 = "|";
	public static final int anInt1371 = 26;
	static String aString1372 = "true";
	static String aString1373 = "->";
	static String aString1374 = "<br>";
	static int[] anIntArray1375;
	static int[] anIntArray1376;
	static String aString1377 = ")";
	static String aString1378 = "</col>";
	static final int anInt1379 = 100;
	static final int anInt1380 = 2047;
	static final int anInt1381 = 0;
	public static final int anInt1382 = 73;
	static Class91_Sub20_Sub13_Sub3[] aClass91_Sub20_Sub13_Sub3Array1383;

	static final void method1097(final String string, final int i, final int i_0_) {
		try {
			client.aClass91_Sub9_Sub1_1478.method690(173, 1160292001);
			final Class91_Sub9_Sub1 class91_sub9_sub1 = client.aClass91_Sub9_Sub1_1478;
			final int i_1_ = string.length() + 1;
			class91_sub9_sub1.writeWordBigEndian(1 + i_1_);
			client.aClass91_Sub9_Sub1_1478.method634(string, (byte) 17);
			client.aClass91_Sub9_Sub1_1478.method654(i, (byte) 58);
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "w.dd()");
		}
	}

	Class106() throws Throwable {
		try {
			throw new Error();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "w.<init>()");
		}
	}

	static final void method1098(int i, int i_2_, final int i_3_, final int i_4_) {
		try {
			if (i >= 128 && i_2_ >= 128 && i <= 13056 && i_2_ <= 13056) {
				int i_5_ = Class4.method92(i, i_2_, -1723088013 * Class100.anInt1248, -1624856483) - i_3_;
				i -= -393490213 * Class101.anInt1288;
				i_5_ -= 1224950237 * Class100.anInt1244;
				i_2_ -= Class105.anInt1365 * 2015226289;
				final int i_6_ = Class91_Sub20_Sub13_Sub2.anIntArray2546[234823659 * Class91_Sub20_Sub14_Sub1_Sub2.anInt2860];
				final int i_7_ = Class91_Sub20_Sub13_Sub2.anIntArray2547[234823659 * Class91_Sub20_Sub14_Sub1_Sub2.anInt2860];
				final int i_8_ = Class91_Sub20_Sub13_Sub2.anIntArray2546[-1061542797 * Class97.anInt1219];
				final int i_9_ = Class91_Sub20_Sub13_Sub2.anIntArray2547[-1061542797 * Class97.anInt1219];
				int i_10_ = i * i_9_ + i_8_ * i_2_ >> 16;
				i_2_ = i_2_ * i_9_ - i_8_ * i >> 16;
				i = i_10_;
				i_10_ = i_5_ * i_7_ - i_6_ * i_2_ >> 16;
				i_2_ = i_5_ * i_6_ + i_2_ * i_7_ >> 16;
				if (i_2_ >= 50) {
					client.anInt1547 = 130624067 * ((i << 9) / i_2_ + 256);
					client.anInt1665 = -1179864391 * (167 + (i_10_ << 9) / i_2_);
				} else {
					client.anInt1547 = -130624067;
					client.anInt1665 = 1179864391;
				}
			} else {
				client.anInt1547 = -130624067;
				client.anInt1665 = 1179864391;
			}
		} catch (final RuntimeException var10) {
			throw Class102.method1086(var10, "w.aj()");
		}
	}

	static final void method1099(final int i) {
		try {
			int i_11_ = Class91_Sub20_Sub2.aClass91_Sub20_Sub13_Sub4_Sub1_2235.method889(Class75.aString975);
			for (int i_12_ = 0; i_12_ < 1335574821 * client.anInt1585; i_12_++) {
				final Class91_Sub20_Sub13_Sub4_Sub1 class91_sub20_sub13_sub4_sub1 = Class91_Sub20_Sub2.aClass91_Sub20_Sub13_Sub4_Sub1_2235;
				String string;
				if (client.aStringArray1591[i_12_].length() > 0) {
					string = new StringBuilder(client.aStringArray1638[i_12_]).append(Class75.aString1000).append(client.aStringArray1591[i_12_]).toString();
				} else {
					string = client.aStringArray1638[i_12_];
				}
				final int i_13_ = class91_sub20_sub13_sub4_sub1.method889(string);
				if (i_13_ > i_11_) {
					i_11_ = i_13_;
				}
			}
			i_11_ += 8;
			final int i_14_ = client.anInt1585 * -1441214165 + 21;
			int i_15_ = Class12.anInt180 * -1084967827 - i_11_ / 2;
			if (i_11_ + i_15_ > 765) {
				i_15_ = 765 - i_11_;
			}
			if (i_15_ < 0) {
				i_15_ = 0;
			}
			int i_16_ = Class12.anInt167 * -956533215;
			if (i_14_ + i_16_ > 503) {
				i_16_ = 503 - i_14_;
			}
			if (i_16_ < 0) {
				i_16_ = 0;
			}
			client.aBoolean1538 = true;
			Class91_Sub22.anInt2111 = i_15_ * -879569047;
			Class4.anInt63 = 1973910145 * i_16_;
			Class20.anInt273 = i_11_ * -1437238803;
			Class19.anInt260 = client.anInt1585 * -1801741143 + -1424325486;
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "w.bv()");
		}
	}

	static final void method1100(final int i, final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1, final int i_17_, final int i_18_) {
		try {
			if ((i_17_ & 0x4) != 0) {
				class91_sub20_sub14_sub1_sub1.anInt2636 = client.aClass91_Sub9_Sub1_1480.method662(1437284711) * 496339617;
				class91_sub20_sub14_sub1_sub1.anInt2607 = client.aClass91_Sub9_Sub1_1480.method662(1846120565) * -926353243;
			}
			if ((i_17_ & 0x200) != 0) {
				class91_sub20_sub14_sub1_sub1.anInt2621 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * -410743787;
				class91_sub20_sub14_sub1_sub1.anInt2623 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * -743660855;
				class91_sub20_sub14_sub1_sub1.anInt2600 = client.aClass91_Sub9_Sub1_1480.method656(1331737878) * 1865500505;
				class91_sub20_sub14_sub1_sub1.anInt2624 = client.aClass91_Sub9_Sub1_1480.method656(331771257) * -272921537;
				class91_sub20_sub14_sub1_sub1.anInt2617 = (client.aClass91_Sub9_Sub1_1480.method686((byte) -33) + client.anInt1449 * 2026135825) * 2141382901;
				class91_sub20_sub14_sub1_sub1.anInt2626 = (client.aClass91_Sub9_Sub1_1480.method683((byte) 88) + 2026135825 * client.anInt1449) * 1672449523;
				class91_sub20_sub14_sub1_sub1.anInt2627 = client.aClass91_Sub9_Sub1_1480.method655(256613678) * -733275649;
				class91_sub20_sub14_sub1_sub1.anInt2608 = 1461452169;
				class91_sub20_sub14_sub1_sub1.anInt2633 = 0;
			}
			if ((i_17_ & 0x1) != 0) {
				final int i_19_ = client.aClass91_Sub9_Sub1_1480.method656(1324219220);
				final byte[] is = new byte[i_19_];
				final ByteBuffer class91_sub9 = new ByteBuffer(is);
				client.aClass91_Sub9_Sub1_1480.method647(is, 0, i_19_, 1147502955);
				client.aClass91_Sub9Array1567[i] = class91_sub9;
				class91_sub20_sub14_sub1_sub1.method928(class91_sub9, (byte) 100);
			}
			if ((i_17_ & 0x2) != 0) {
				final int i_20_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -11);
				final int i_21_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
				final int i_22_ = client.aClass91_Sub9_Sub1_1480.method656(884209192);
				final int i_23_ = client.aClass91_Sub9_Sub1_1480.currentOffset * -1128893257;
				if (class91_sub20_sub14_sub1_sub1.aString2841 != null && class91_sub20_sub14_sub1_sub1.aClass85_2838 != null) {
					boolean bool = false;
					if (i_21_ <= 1 && Class91_Sub24.method1051(class91_sub20_sub14_sub1_sub1.aString2841, 1998616151)) {
						bool = true;
					}
					if (!bool && client.anInt1561 * -749782133 == 0) {
						client.aClass91_Sub9_1494.currentOffset = 0;
						client.aClass91_Sub9_Sub1_1480.method647(client.aClass91_Sub9_1494.buffer, 0, i_22_, 826257593);
						client.aClass91_Sub9_1494.currentOffset = 0;
						final ByteBuffer class91_sub9 = client.aClass91_Sub9_1494;
						String string;
						try {
							int i_24_ = class91_sub9.method649(-1590424512);
							if (i_24_ > 32767) {
								i_24_ = 32767;
							}
							final byte[] is = new byte[i_24_];
							class91_sub9.currentOffset += Class99.aClass53_1235.method376(class91_sub9.buffer, -1128893257 * class91_sub9.currentOffset, is, 0, i_24_, 1407034379) * 565881095;
							final String string_25_ = Class91_Sub10.method697(is, 0, i_24_, (byte) 16);
							string = string_25_;
						} catch (final Exception exception) {
							string = "Cabbage";
						}
						string = Class91_Sub20_Sub13_Sub4.method892(Class25.method230(string, 1711799152));
						class91_sub20_sub14_sub1_sub1.aString2595 = string.trim();
						class91_sub20_sub14_sub1_sub1.anInt2597 = (i_20_ >> 8) * -592059165;
						class91_sub20_sub14_sub1_sub1.anInt2606 = (i_20_ & 0xff) * -571294043;
						class91_sub20_sub14_sub1_sub1.anInt2596 = 1872650818;
						if (i_21_ != 2 && i_21_ != 3) {
							if (i_21_ == 1) {
								Class101.method1076(1, new StringBuilder(FloOverlayType.method747(0, -1363557001)).append(class91_sub20_sub14_sub1_sub1.aString2841).toString(), string, 1669188545);
							} else {
								Class101.method1076(2, class91_sub20_sub14_sub1_sub1.aString2841, string, 1299836387);
							}
						} else {
							Class101.method1076(1, new StringBuilder(FloOverlayType.method747(1, 408032356)).append(class91_sub20_sub14_sub1_sub1.aString2841).toString(), string, 1548487095);
						}
					}
				}
				client.aClass91_Sub9_Sub1_1480.currentOffset = (i_23_ + i_22_) * 565881095;
			}
			if ((i_17_ & 0x10) != 0) {
				int i_26_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -68);
				if (i_26_ == 65535) {
					i_26_ = -1;
				}
				final int i_27_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
				Class91_Sub20_Sub12.method818(class91_sub20_sub14_sub1_sub1, i_26_, i_27_, 612373383);
			}
			if ((i_17_ & 0x40) != 0) {
				class91_sub20_sub14_sub1_sub1.aString2595 = client.aClass91_Sub9_Sub1_1480.method645((byte) -9);
				if (class91_sub20_sub14_sub1_sub1.aString2595.charAt(0) == '~') {
					class91_sub20_sub14_sub1_sub1.aString2595 = class91_sub20_sub14_sub1_sub1.aString2595.substring(1);
					Class101.method1076(2, class91_sub20_sub14_sub1_sub1.aString2841, class91_sub20_sub14_sub1_sub1.aString2595, 2125732375);
				} else if (class91_sub20_sub14_sub1_sub1 == Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316) {
					Class101.method1076(2, class91_sub20_sub14_sub1_sub1.aString2841, class91_sub20_sub14_sub1_sub1.aString2595, 1351838750);
				}
				class91_sub20_sub14_sub1_sub1.anInt2597 = 0;
				class91_sub20_sub14_sub1_sub1.anInt2606 = 0;
				class91_sub20_sub14_sub1_sub1.anInt2596 = 1872650818;
			}
			if ((i_17_ & 0x8) != 0) {
				final int i_28_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
				final int i_29_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
				class91_sub20_sub14_sub1_sub1.method920(i_28_, i_29_, client.anInt1449 * 2026135825, -2023983760);
				class91_sub20_sub14_sub1_sub1.anInt2602 = client.anInt1449 * -1900623343 + 388123948;
				class91_sub20_sub14_sub1_sub1.anInt2592 = client.aClass91_Sub9_Sub1_1480.method675((byte) 7) * -1332589513;
				class91_sub20_sub14_sub1_sub1.anInt2586 = client.aClass91_Sub9_Sub1_1480.method656(784908341) * -1271586427;
			}
			if ((i_17_ & 0x400) != 0) {
				class91_sub20_sub14_sub1_sub1.anInt2616 = client.aClass91_Sub9_Sub1_1480.method662(2126909949) * 721446737;
				final int i_30_ = client.aClass91_Sub9_Sub1_1480.readDword();
				class91_sub20_sub14_sub1_sub1.anInt2591 = (i_30_ >> 16) * -172786615;
				class91_sub20_sub14_sub1_sub1.anInt2619 = ((i_30_ & 0xffff) + client.anInt1449 * 2026135825) * -1992234733;
				class91_sub20_sub14_sub1_sub1.anInt2635 = 0;
				class91_sub20_sub14_sub1_sub1.anInt2618 = 0;
				if (class91_sub20_sub14_sub1_sub1.anInt2619 * -592754405 > client.anInt1449 * 2026135825) {
					class91_sub20_sub14_sub1_sub1.anInt2635 = 68657127;
				}
				if (65535 == 493699505 * class91_sub20_sub14_sub1_sub1.anInt2616) {
					class91_sub20_sub14_sub1_sub1.anInt2616 = -721446737;
				}
			}
			if ((i_17_ & 0x100) != 0) {
				final int i_31_ = client.aClass91_Sub9_Sub1_1480.method675((byte) 7);
				final int i_32_ = client.aClass91_Sub9_Sub1_1480.method655(-2056439007);
				class91_sub20_sub14_sub1_sub1.method920(i_31_, i_32_, 2026135825 * client.anInt1449, -1912255173);
				class91_sub20_sub14_sub1_sub1.anInt2602 = -1900623343 * client.anInt1449 + 388123948;
				class91_sub20_sub14_sub1_sub1.anInt2592 = client.aClass91_Sub9_Sub1_1480.method675((byte) 7) * -1332589513;
				class91_sub20_sub14_sub1_sub1.anInt2586 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * -1271586427;
			}
			if ((i_17_ & 0x80) != 0) {
				class91_sub20_sub14_sub1_sub1.anInt2605 = client.aClass91_Sub9_Sub1_1480.method663((byte) -101) * 728389403;
				if (65535 == -452056301 * class91_sub20_sub14_sub1_sub1.anInt2605) {
					class91_sub20_sub14_sub1_sub1.anInt2605 = -728389403;
				}
			}
		} catch (final RuntimeException var16) {
			throw Class102.method1086(var16, "w.bw()");
		}
	}

	static final int method1101(final int i, final int i_33_, final int i_34_) {
		int i_35_;
		try {
			int i_36_ = Class7.method154(45365 + i, 91923 + i_33_, 4, -266212293) - 128 + (Class7.method154(10294 + i, i_33_ + 37821, 2, -266212293) - 128 >> 1) + (Class7.method154(i, i_33_, 1, -266212293) - 128 >> 2);
			i_36_ = (int) (i_36_ * 0.3) + 35;
			if (i_36_ < 10) {
				i_36_ = 10;
			} else if (i_36_ > 60) {
				i_36_ = 60;
			}
			i_35_ = i_36_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "w.a()");
		}
		return i_35_;
	}

	public static Class91_Sub20_Sub13_Sub3 method1102(final Js5 class63, final String string, final String string_37_, final int i) {
		Class91_Sub20_Sub13_Sub3 class91_sub20_sub13_sub3;
		try {
			final int i_38_ = class63.method409(string, -1963610808);
			final int i_39_ = class63.method415(i_38_, string_37_, (byte) 126);
			Class91_Sub20_Sub13_Sub3 class91_sub20_sub13_sub3_40_;
			if (!IdkType.method731(class63, i_38_, i_39_, 1770241419)) {
				class91_sub20_sub13_sub3_40_ = null;
			} else {
				class91_sub20_sub13_sub3_40_ = Class108.method1113((byte) -69);
			}
			class91_sub20_sub13_sub3 = class91_sub20_sub13_sub3_40_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "w.t()");
		}
		return class91_sub20_sub13_sub3;
	}

	static final void method1103(final int i, final int i_41_, final int i_42_, final int i_43_, final int i_44_, final int i_45_, final int i_46_, final int i_47_, final int i_48_, final int i_49_) {
		try {
			Class91_Sub5 class91_sub5 = null;
			for (Class91_Sub5 class91_sub5_50_ = (Class91_Sub5) client.aClass95_1577.method1062(); class91_sub5_50_ != null; class91_sub5_50_ = (Class91_Sub5) client.aClass95_1577.method1063()) {
				if (class91_sub5_50_.anInt1807 * -1012182999 == i && -1323813057 * class91_sub5_50_.anInt1795 == i_41_ && -1641318309 * class91_sub5_50_.anInt1796 == i_42_ && -1081232747 * class91_sub5_50_.anInt1794 == i_43_) {
					class91_sub5 = class91_sub5_50_;
					break;
				}
			}
			if (class91_sub5 == null) {
				class91_sub5 = new Class91_Sub5();
				class91_sub5.anInt1807 = -1076802535 * i;
				class91_sub5.anInt1794 = i_43_ * 1517586621;
				class91_sub5.anInt1795 = 132593855 * i_41_;
				class91_sub5.anInt1796 = -2132477997 * i_42_;
				client.method65(class91_sub5, 1012599485);
				client.aClass95_1577.method1058(class91_sub5);
			}
			class91_sub5.anInt1800 = -1630825703 * i_44_;
			class91_sub5.anInt1802 = -731030129 * i_45_;
			class91_sub5.anInt1793 = -58102573 * i_46_;
			class91_sub5.anInt1803 = i_47_ * -1669010335;
			class91_sub5.anInt1804 = -1030650873 * i_48_;
		} catch (final RuntimeException var12) {
			throw Class102.method1086(var12, "w.br()");
		}
	}
}
