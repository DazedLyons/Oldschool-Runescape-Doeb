/* Class91_Sub20_Sub14_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class91_Sub20_Sub14_Sub1_Sub2 extends Class91_Sub20_Sub14_Sub1 {
	NpcType aClass91_Sub20_Sub11_2858;
	public static final int anInt2859 = 128;
	static int anInt2860;
	static Class91_Sub18 aClass91_Sub18_2861;
	static Class91_Sub20_Sub13_Sub3[] aClass91_Sub20_Sub13_Sub3Array2862;
	static Class60 aClass60_2863;
	static final int anInt2864 = 585;
	static final int anInt2865 = 1024;
	public static final int anInt2866 = 197;
	static final int anInt2867 = 3;

	static final void method934(final Class91_Sub18[] class91_sub18s, final int i, final int i_0_) {
		try {
			Class91_Sub18[] class91_sub18s_2_;
			final int i_1_ = (class91_sub18s_2_ = class91_sub18s).length;
			int i_3_ = 0;
			for (/**/; i_3_ < i_1_; i_3_++) {
				final Class91_Sub18 class91_sub18 = class91_sub18s_2_[i_3_];
				if (class91_sub18 == null) {
					if (i_0_ != -1762485807) {
						throw new IllegalStateException();
					}
				} else {
					if (class91_sub18.anInt2057 * 633275603 == 0) {
						if (class91_sub18.aClass91_Sub18Array2077 != null) {
							method934(class91_sub18.aClass91_Sub18Array2077, i, -1762485807);
						}
						final Class91_Sub10 class91_sub10 = (Class91_Sub10) client.aClass83_1603.method474(class91_sub18.anInt2032 * -1026201747);
						if (class91_sub10 != null) {
							Class34.method281(class91_sub10.anInt1865 * 337747539, i, 2033142227);
						}
					}
					if (i == 0 && class91_sub18.anObjectArray2063 != null) {
						final Class91_Sub21 class91_sub21 = new Class91_Sub21();
						class91_sub21.aClass91_Sub18_2090 = class91_sub18;
						class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2063;
						Class91_Sub20_Sub14.method919(class91_sub21, (short) 18636);
					}
					if (i == 1 && class91_sub18.anObjectArray2064 != null) {
						if (class91_sub18.anInt2012 * -819014149 >= 0) {
							final Class91_Sub18 class91_sub18_4_ = Class61.method394(class91_sub18.anInt2032 * -1026201747, -631047529);
							if (class91_sub18_4_ == null || class91_sub18_4_.aClass91_Sub18Array2077 == null || -819014149 * class91_sub18.anInt2012 >= class91_sub18_4_.aClass91_Sub18Array2077.length) {
								continue;
							}
							if (class91_sub18_4_.aClass91_Sub18Array2077[class91_sub18.anInt2012 * -819014149] != class91_sub18) {
								if (i_0_ != -1762485807) {
									throw new IllegalStateException();
								}
								continue;
							}
						}
						final Class91_Sub21 class91_sub21 = new Class91_Sub21();
						class91_sub21.aClass91_Sub18_2090 = class91_sub18;
						class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2064;
						Class91_Sub20_Sub14.method919(class91_sub21, (short) 9044);
					}
				}
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "y.cu()");
		}
	}

	@Override
	protected final Class91_Sub20_Sub14_Sub3 method915(final int i) {
		Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3;
		try {
			if (this.aClass91_Sub20_Sub11_2858 == null) {
				return null;
			}
			Class91_Sub20_Sub5 class91_sub20_sub5;
			if (this.anInt2611 * -815127219 != -1 && this.anInt2614 * 1011042493 == 0) {
				class91_sub20_sub5 = Class7.method152(-815127219 * this.anInt2611, 1308102959);
			} else {
				class91_sub20_sub5 = null;
			}
			final Class91_Sub20_Sub5 class91_sub20_sub5_5_ = class91_sub20_sub5;
			if (-1 != 631774363 * this.anInt2634 && (this.anInt2587 * -1584540729 != 631774363 * this.anInt2634 || class91_sub20_sub5_5_ == null)) {
				class91_sub20_sub5 = Class7.method152(this.anInt2634 * 631774363, 1538831712);
			} else {
				class91_sub20_sub5 = null;
			}
			final Class91_Sub20_Sub5 class91_sub20_sub5_6_ = class91_sub20_sub5;
			Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_7_ = this.aClass91_Sub20_Sub11_2858.method811(class91_sub20_sub5_5_, this.anInt2612 * -866849195, class91_sub20_sub5_6_, this.anInt2625 * 536968869, 1520254367);
			if (class91_sub20_sub14_sub3_7_ == null) {
				return null;
			}
			class91_sub20_sub14_sub3_7_.method974();
			this.anInt2629 = -1475956383 * class91_sub20_sub14_sub3_7_.anInt2488;
			if (this.anInt2616 * 493699505 != -1 && this.anInt2635 * -1733231575 != -1) {
				final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_8_ = NpcType.method813(this.anInt2616 * 493699505, (short) 11720).method817(this.anInt2635 * -1733231575, 2009357849);
				if (class91_sub20_sub14_sub3_8_ != null) {
					class91_sub20_sub14_sub3_8_.method988(0, -(1411986937 * this.anInt2591), 0);
					final Class91_Sub20_Sub14_Sub3[] class91_sub20_sub14_sub3s = { class91_sub20_sub14_sub3_7_, class91_sub20_sub14_sub3_8_ };
					class91_sub20_sub14_sub3_7_ = new Class91_Sub20_Sub14_Sub3(class91_sub20_sub14_sub3s, 2);
				}
			}
			if (this.aClass91_Sub20_Sub11_2858.anInt2424 * 2037289339 == 1) {
				class91_sub20_sub14_sub3_7_.aBoolean2713 = true;
			}
			class91_sub20_sub14_sub3 = class91_sub20_sub14_sub3_7_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "y.w()");
		}
		return class91_sub20_sub14_sub3;
	}

	static final void method935(final int i, final String string, final String string_9_, final String string_10_, final byte i_11_) {
		try {
			for (int i_12_ = 99; i_12_ > 0; i_12_--) {
				client.anIntArray1653[i_12_] = client.anIntArray1653[i_12_ - 1];
				client.aStringArray1654[i_12_] = client.aStringArray1654[i_12_ - 1];
				client.aStringArray1656[i_12_] = client.aStringArray1656[i_12_ - 1];
				client.aStringArray1655[i_12_] = client.aStringArray1655[i_12_ - 1];
			}
			client.anIntArray1653[0] = i;
			client.aStringArray1654[0] = string;
			client.aStringArray1656[0] = string_9_;
			client.aStringArray1655[0] = string_10_;
			client.anInt1539 += 142216757;
			client.anInt1441 = client.anInt1640 * -770050969;
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "y.cn()");
		}
	}

	Class91_Sub20_Sub14_Sub1_Sub2() {
		/* empty */
	}

	static void method939(final int i, final int i_13_) {
		try {
			if (i == client.anInt1599 * -1935794829) {
				if (i_13_ == 679950941) {
					throw new IllegalStateException();
				}
			} else {
				if (-1935794829 * client.anInt1599 == 0) {
					NpcType.anImage2441 = null;
					Class103.aFont1330 = null;
					Class27.aFontMetrics323 = null;
				}
				if (i == 20) {
					/* empty */
				}
				client.anInt1533 = 0;
				client.anInt1471 = 0;
				client.anInt1472 = 0;
				if (i != 20 && 40 != i && Class91_Sub20_Sub9.aClass20_2410 != null) {
					Class91_Sub20_Sub9.aClass20_2410.method194((byte) 1);
					Class91_Sub20_Sub9.aClass20_2410 = null;
				}
				if (client.anInt1599 * -1935794829 == 25) {
					client.anInt1496 = 0;
					client.anInt1468 = 0;
					client.anInt1519 = -994661789;
					client.anInt1469 = 0;
					client.anInt1450 = 1598011077;
				}
				if (i != 5 && 10 != i && i != 20) {
					if (!Class101.aBoolean1257) {
						if (i_13_ == 679950941) {
							return;
						}
					} else {
						Class101.aClass91_Sub20_Sub13_Sub1_1253 = null;
						Class101.aClass91_Sub20_Sub13_Sub1_1254 = null;
						Class101.aClass91_Sub20_Sub13_Sub1Array1280 = null;
						Class101.aClass91_Sub20_Sub13_Sub3_1256 = null;
						Class101.aClass91_Sub20_Sub13_Sub3_1271 = null;
						Class101.aClass91_Sub20_Sub13_Sub1_1258 = null;
						Class23.aClass91_Sub20_Sub13_Sub1Array288 = null;
						Class106.aClass91_Sub20_Sub13_Sub3Array1383 = null;
						Class101.aClass91_Sub20_Sub13_Sub1Array1282 = null;
						Class18.aClass91_Sub20_Sub13_Sub1Array248 = null;
						Class90.aClass91_Sub20_Sub13_Sub1Array1189 = null;
						Class47.aClass91_Sub20_Sub13_Sub1_597 = null;
						Class102.anIntArray1307 = null;
						Class101.anIntArray1263 = null;
						Class106.anIntArray1375 = null;
						ByteBuffer.anIntArray1854 = null;
						Class91_Sub10.anIntArray1870 = null;
						Class54.anIntArray640 = null;
						Class42.anIntArray557 = null;
						Class101.anIntArray1266 = null;
						Class107.method1104(2, 997279770);
						Class68.method434(true, -912729720);
						Class101.aBoolean1257 = false;
					}
				} else {
					final java.awt.Canvas canvas = Class102.aCanvas1309;
					final Class63_Sub1 class63_sub1 = Class91_Sub20_Sub14_Sub5.aClass63_Sub1_2800;
					final Class63_Sub1 class63_sub1_14_ = Class97.aClass63_Sub1_1209;
					if (Class101.aBoolean1257) {
						if (i_13_ == 679950941) {
							throw new IllegalStateException();
						}
					} else {
						Class91_Sub20_Sub13.method825();
						final byte[] is = class63_sub1.method420("title.jpg", "", (byte) 0);
						Class101.aClass91_Sub20_Sub13_Sub3_1256 = new Class91_Sub20_Sub13_Sub3(is, canvas);
						Class101.aClass91_Sub20_Sub13_Sub3_1271 = Class101.aClass91_Sub20_Sub13_Sub3_1256.method860();
						Class101.aClass91_Sub20_Sub13_Sub1_1258 = Class25.method231(class63_sub1_14_, "logo", "", 44451852);
						Class101.aClass91_Sub20_Sub13_Sub1_1253 = Class25.method231(class63_sub1_14_, "titlebox", "", 872382299);
						Class101.aClass91_Sub20_Sub13_Sub1_1254 = Class25.method231(class63_sub1_14_, "titlebutton", "", 1510921980);
						Class101.aClass91_Sub20_Sub13_Sub1Array1280 = Class91_Sub24.method1052(class63_sub1_14_, "runes", "", (byte) 53);
						Class23.aClass91_Sub20_Sub13_Sub1Array288 = Class91_Sub24.method1052(class63_sub1_14_, "title_mute", "", (byte) 102);
						Class102.anIntArray1307 = new int[256];
						for (int i_15_ = 0; i_15_ < 64; i_15_++) {
							Class102.anIntArray1307[i_15_] = 262144 * i_15_;
						}
						for (int i_16_ = 0; i_16_ < 64; i_16_++) {
							Class102.anIntArray1307[64 + i_16_] = 16711680 + i_16_ * 1024;
						}
						for (int i_17_ = 0; i_17_ < 64; i_17_++) {
							Class102.anIntArray1307[i_17_ + 128] = 16776960 + 4 * i_17_;
						}
						for (int i_18_ = 0; i_18_ < 64; i_18_++) {
							Class102.anIntArray1307[192 + i_18_] = 16777215;
						}
						Class101.anIntArray1263 = new int[256];
						for (int i_19_ = 0; i_19_ < 64; i_19_++) {
							Class101.anIntArray1263[i_19_] = 1024 * i_19_;
						}
						for (int i_20_ = 0; i_20_ < 64; i_20_++) {
							Class101.anIntArray1263[64 + i_20_] = 4 * i_20_ + 65280;
						}
						for (int i_21_ = 0; i_21_ < 64; i_21_++) {
							Class101.anIntArray1263[i_21_ + 128] = 65535 + 262144 * i_21_;
						}
						for (int i_22_ = 0; i_22_ < 64; i_22_++) {
							Class101.anIntArray1263[192 + i_22_] = 16777215;
						}
						Class106.anIntArray1375 = new int[256];
						for (int i_23_ = 0; i_23_ < 64; i_23_++) {
							Class106.anIntArray1375[i_23_] = i_23_ * 4;
						}
						for (int i_24_ = 0; i_24_ < 64; i_24_++) {
							if (i_13_ == 679950941) {
								return;
							}
							Class106.anIntArray1375[i_24_ + 64] = 255 + 262144 * i_24_;
						}
						for (int i_25_ = 0; i_25_ < 64; i_25_++) {
							Class106.anIntArray1375[128 + i_25_] = 16711935 + i_25_ * 1024;
						}
						for (int i_26_ = 0; i_26_ < 64; i_26_++) {
							Class106.anIntArray1375[i_26_ + 192] = 16777215;
						}
						ByteBuffer.anIntArray1854 = new int[256];
						Class91_Sub10.anIntArray1870 = new int[32768];
						Class54.anIntArray640 = new int[32768];
						Class91_Sub20_Sub14_Sub7.method1022(null, (byte) 12);
						Class42.anIntArray557 = new int[32768];
						Class101.anIntArray1266 = new int[32768];
						Class101.anInt1290 = 0;
						Class101.aString1277 = "";
						Class101.aString1278 = "";
						Class101.aBoolean1283 = false;
						if (!Class91_Sub20_Sub14_Sub4.aClass108_2769.aBoolean1404) {
							Class91_Sub20_Sub17.method1029(2, Class91_Sub20_Sub2.aClass63_Sub1_2232, "scape main", "", 255, false, -342038932);
						} else {
							Class107.method1104(2, -27353402);
						}
						Class68.method434(false, 1699671421);
						Class101.aBoolean1257 = true;
						Class101.aClass91_Sub20_Sub13_Sub3_1256.method868(0, 0);
						Class101.aClass91_Sub20_Sub13_Sub3_1271.method868(382, 0);
						Class101.aClass91_Sub20_Sub13_Sub1_1258.method840(382 - Class101.aClass91_Sub20_Sub13_Sub1_1258.anInt2517 / 2, 18);
					}
				}
				client.anInt1599 = i * 1382961083;
			}
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "y.a()");
		}
	}

	static final void method941(final int i, final int i_27_, final int i_28_) {
		try {
			if (-522819943 * client.anInt1457 != 2) {
				if (i_28_ == -877360120) {
					throw new IllegalStateException();
				}
			} else {
				Class106.method1098(4041997 * client.anInt1463 + (1608922075 * client.anInt1518 - 1885886277 * Class40.anInt541 << 7), client.anInt1464 * 1012027357 + (client.anInt1560 * 47990749 - Class91_Sub20_Sub15.anInt2497 * 1838527067 << 7), client.anInt1438 * -2080386646, -451167291);
				if (client.anInt1547 * -1280773525 > -1 && 2026135825 * client.anInt1449 % 20 < 10) {
					Class91_Sub24.aClass91_Sub20_Sub13_Sub3Array2141[0].method880(-1280773525 * client.anInt1547 + i - 12, i_27_ + client.anInt1665 * -2080001143 - 28);
				}
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "y.ap()");
		}
	}

	@Override
	final boolean method923(final byte i) {
		do {
			try {
				if (this.aClass91_Sub20_Sub11_2858 != null) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "y.f()");
			}
			return false;
		} while (false);
		return true;
	}

	static final void method942(final String string, final int i) {
		try {
			if (string == null) {
				if (i != 1872124109) {
					throw new IllegalStateException();
				}
			} else if ((-1596316121 * client.anInt1695 < 200 || -157033453 * client.anInt1569 == 1) && -1596316121 * client.anInt1695 < 400) {
				final String string_29_ = Class91_Sub20_Sub14_Sub4.method1002(string, Class41.aClass98_551, (byte) 91);
				if (string_29_ != null) {
					for (int i_30_ = 0; i_30_ < client.anInt1695 * -1596316121; i_30_++) {
						final Class100 class100 = client.aClass100Array1491[i_30_];
						final String string_31_ = Class91_Sub20_Sub14_Sub4.method1002(class100.aString1251, Class41.aClass98_551, (byte) -7);
						if (string_31_ != null && string_31_.equals(string_29_)) {
							Class101.method1076(0, "", new StringBuilder(string).append(Class75.aString1052).toString(), 1764983879);
							return;
						}
						if (class100.aString1239 != null) {
							final String string_32_ = Class91_Sub20_Sub14_Sub4.method1002(class100.aString1239, Class41.aClass98_551, (byte) 15);
							if (string_32_ != null && string_32_.equals(string_29_)) {
								Class101.method1076(0, "", new StringBuilder(string).append(Class75.aString1052).toString(), 1852699095);
								return;
							}
						}
					}
					for (int i_33_ = 0; i_33_ < client.anInt1493 * 8867313; i_33_++) {
						if (i != 1872124109) {
							return;
						}
						final Class1 class1 = client.aClass1Array1700[i_33_];
						final String string_34_ = Class91_Sub20_Sub14_Sub4.method1002(class1.aString29, Class41.aClass98_551, (byte) -22);
						if (string_34_ != null && string_34_.equals(string_29_)) {
							Class101.method1076(0, "", new StringBuilder(Class75.aString895).append(string).append(Class75.aString1013).toString(), 1184423562);
							return;
						}
						if (class1.aString30 != null) {
							final String string_35_ = Class91_Sub20_Sub14_Sub4.method1002(class1.aString30, Class41.aClass98_551, (byte) 50);
							if (string_35_ != null && string_35_.equals(string_29_)) {
								Class101.method1076(0, "", new StringBuilder(Class75.aString895).append(string).append(Class75.aString1013).toString(), 1783441235);
								return;
							}
						}
					}
					if (Class91_Sub20_Sub14_Sub4.method1002(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.aString2841, Class41.aClass98_551, (byte) 37).equals(string_29_)) {
						Class101.method1076(0, "", Class75.aString1053, 1926116776);
					} else {
						client.aClass91_Sub9_Sub1_1478.method690(10, 1160292001);
						final Class91_Sub9_Sub1 class91_sub9_sub1 = client.aClass91_Sub9_Sub1_1478;
						final int i_36_ = string.length() + 1;
						class91_sub9_sub1.writeWordBigEndian(i_36_);
						client.aClass91_Sub9_Sub1_1478.method634(string, (byte) 119);
					}
				}
			} else {
				Class101.method1076(0, "", Class75.aString865, 1790166415);
			}
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "y.df()");
		}
	}

	static final void method943(final String string, final int i) {
		try {
			if (string == null) {
				if (i != 1885886277) {
					throw new IllegalStateException();
				}
			} else {
				final String string_37_ = Class91_Sub20_Sub14_Sub4.method1002(string, Class41.aClass98_551, (byte) -16);
				if (string_37_ != null) {
					for (int i_38_ = 0; i_38_ < -1596316121 * client.anInt1695; i_38_++) {
						final Class100 class100 = client.aClass100Array1491[i_38_];
						final String string_39_ = class100.aString1251;
						final String string_40_ = Class91_Sub20_Sub14_Sub4.method1002(string_39_, Class41.aClass98_551, (byte) -46);
						if (Class4.method88(string, string_37_, string_39_, string_40_, (byte) -103)) {
							client.anInt1695 -= -1562973801;
							for (int i_41_ = i_38_; i_41_ < client.anInt1695 * -1596316121; i_41_++) {
								client.aClass100Array1491[i_41_] = client.aClass100Array1491[1 + i_41_];
							}
							client.anInt1633 = 602232347 * client.anInt1640;
							client.aClass91_Sub9_Sub1_1478.method690(197, 1160292001);
							final Class91_Sub9_Sub1 class91_sub9_sub1 = client.aClass91_Sub9_Sub1_1478;
							final int i_42_ = string.length() + 1;
							class91_sub9_sub1.writeWordBigEndian(i_42_);
							client.aClass91_Sub9_Sub1_1478.method634(string, (byte) 9);
							break;
						}
					}
				}
			}
		} catch (final RuntimeException var9) {
			throw Class102.method1086(var9, "y.dt()");
		}
	}

	static final void method944(final int i, final int i_43_, final int i_44_, final int i_45_, final int i_46_) {
		try {
			for (int i_47_ = 0; i_47_ < -437440627 * client.anInt1456; i_47_++) {
				if (client.anIntArray1648[i_47_] + client.anIntArray1608[i_47_] > i && client.anIntArray1648[i_47_] < i_44_ + i && client.anIntArray1651[i_47_] + client.anIntArray1649[i_47_] > i_43_ && client.anIntArray1649[i_47_] < i_43_ + i_45_) {
					client.aBooleanArray1645[i_47_] = true;
				}
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "y.bz()");
		}
	}

	static final void method945(final boolean bool, final int i) {
		try {
			if (107578049 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 >> 7 == -1572174271 * client.anInt1674 && -668540675 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 >> 7 == 1795931169 * client.anInt1675) {
				client.anInt1674 = 0;
			}
			int i_48_ = 735674511 * client.anInt1563;
			if (bool) {
				i_48_ = 1;
			}
			int i_49_ = 0;
			for (/**/; i_49_ < i_48_; i_49_++) {
				if (i <= -1771386039) {
					break;
				}
				Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1;
				int i_50_;
				if (bool) {
					class91_sub20_sub14_sub1_sub1 = Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316;
					i_50_ = 33538048;
				} else {
					class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[client.anIntArray1483[i_49_]];
					i_50_ = client.anIntArray1483[i_49_] << 14;
				}
				if (class91_sub20_sub14_sub1_sub1 != null && class91_sub20_sub14_sub1_sub1.method923((byte) -79)) {
					class91_sub20_sub14_sub1_sub1.aBoolean2854 = false;
					if ((client.aBoolean1691 && client.anInt1563 * 735674511 > 50 || client.anInt1563 * 735674511 > 200) && !bool && class91_sub20_sub14_sub1_sub1.anInt2587 * -1584540729 == 631774363 * class91_sub20_sub14_sub1_sub1.anInt2634) {
						class91_sub20_sub14_sub1_sub1.aBoolean2854 = true;
					}
					final int i_51_ = class91_sub20_sub14_sub1_sub1.anInt2589 * 107578049 >> 7;
					final int i_52_ = class91_sub20_sub14_sub1_sub1.anInt2583 * -668540675 >> 7;
					if (i_51_ >= 0 && i_51_ < 104 && i_52_ >= 0 && i_52_ < 104) {
						if (class91_sub20_sub14_sub1_sub1.aClass91_Sub20_Sub14_Sub3_2849 != null && client.anInt1449 * 2026135825 >= class91_sub20_sub14_sub1_sub1.anInt2839 * 1768651103 && client.anInt1449 * 2026135825 < class91_sub20_sub14_sub1_sub1.anInt2845 * -1365844641) {
							class91_sub20_sub14_sub1_sub1.aBoolean2854 = false;
							class91_sub20_sub14_sub1_sub1.anInt2851 = Class4.method92(107578049 * class91_sub20_sub14_sub1_sub1.anInt2589, class91_sub20_sub14_sub1_sub1.anInt2583 * -668540675, Class100.anInt1248 * -1723088013, -1699770588) * 253246125;
							Class107.aClass39_1397.method299(-1723088013 * Class100.anInt1248, class91_sub20_sub14_sub1_sub1.anInt2589 * 107578049, -668540675 * class91_sub20_sub14_sub1_sub1.anInt2583, class91_sub20_sub14_sub1_sub1.anInt2851 * 1661679909, 60, class91_sub20_sub14_sub1_sub1, class91_sub20_sub14_sub1_sub1.anInt2593 * 566074253, i_50_,
									587776697 * class91_sub20_sub14_sub1_sub1.anInt2850, -1767096347 * class91_sub20_sub14_sub1_sub1.anInt2844, 1583164103 * class91_sub20_sub14_sub1_sub1.anInt2852, class91_sub20_sub14_sub1_sub1.anInt2853 * -830724437);
						} else {
							if (64 == (class91_sub20_sub14_sub1_sub1.anInt2589 * 107578049 & 0x7f) && 64 == (class91_sub20_sub14_sub1_sub1.anInt2583 * -668540675 & 0x7f)) {
								if (client.anInt1683 * 1552236513 == client.anIntArrayArray1545[i_51_][i_52_]) {
									continue;
								}
								client.anIntArrayArray1545[i_51_][i_52_] = client.anInt1683 * 1552236513;
							}
							class91_sub20_sub14_sub1_sub1.anInt2851 = Class4.method92(class91_sub20_sub14_sub1_sub1.anInt2589 * 107578049, class91_sub20_sub14_sub1_sub1.anInt2583 * -668540675, Class100.anInt1248 * -1723088013, -1690226128) * 253246125;
							Class107.aClass39_1397.method326(-1723088013 * Class100.anInt1248, class91_sub20_sub14_sub1_sub1.anInt2589 * 107578049, -668540675 * class91_sub20_sub14_sub1_sub1.anInt2583, 1661679909 * class91_sub20_sub14_sub1_sub1.anInt2851, 60, class91_sub20_sub14_sub1_sub1, 566074253 * class91_sub20_sub14_sub1_sub1.anInt2593, i_50_, class91_sub20_sub14_sub1_sub1.aBoolean2585);
						}
					}
				}
			}
		} catch (final RuntimeException var8) {
			throw Class102.method1086(var8, "y.aq()");
		}
	}

	static final void method946(final byte[] is, final int i, final int i_53_, final int i_54_, final int i_55_, final int i_56_, final int i_57_, final int i_58_, final Class76[] class76s, final byte i_59_) {
		try {
			for (int i_60_ = 0; i_60_ < 8; i_60_++) {
				for (int i_61_ = 0; i_61_ < 8; i_61_++) {
					if (i_60_ + i_53_ > 0 && i_53_ + i_60_ < 103 && i_61_ + i_54_ > 0 && i_54_ + i_61_ < 103) {
						class76s[i].anIntArrayArray1085[i_60_ + i_53_][i_54_ + i_61_] &= ~0x1000000;
					}
				}
			}
			final ByteBuffer class91_sub9 = new ByteBuffer(is);
			for (int i_62_ = 0; i_62_ < 4; i_62_++) {
				for (int i_63_ = 0; i_63_ < 64; i_63_++) {
					for (int i_64_ = 0; i_64_ < 64; i_64_++) {
						if (i_62_ == i_55_ && i_63_ >= i_56_ && i_63_ < i_56_ + 8 && i_64_ >= i_57_ && i_64_ < 8 + i_57_) {
							final int i_65_ = i_63_ & 0x7;
							final int i_66_ = i_64_ & 0x7;
							final int i_67_ = i_58_ & 0x3;
							int i_68_;
							if (i_67_ == 0) {
								i_68_ = i_65_;
							} else if (1 == i_67_) {
								i_68_ = i_66_;
							} else if (i_67_ == 2) {
								i_68_ = 7 - i_65_;
							} else {
								i_68_ = 7 - i_66_;
							}
							Class91_Sub20_Sub14_Sub1_Sub1.method933(class91_sub9, i, i_68_ + i_53_, i_54_ + Class91_Sub23.method1047(i_63_ & 0x7, i_64_ & 0x7, i_58_, (byte) 92), 0, 0, i_58_, (byte) -1);
						} else {
							Class91_Sub20_Sub14_Sub1_Sub1.method933(class91_sub9, 0, -1, -1, 0, 0, 0, (byte) -41);
						}
					}
				}
			}
		} catch (final RuntimeException var21) {
			throw Class102.method1086(var21, "y.e()");
		}
	}
}
