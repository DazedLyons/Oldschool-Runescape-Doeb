/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class88 {
	public static final Class88 aClass88_1173 = new Class88("9", "9");
	public static final Class88 aClass88_1174 = new Class88("3", "3");
	public static final Class88 aClass88_1175 = new Class88("1", "1");
	public static final Class88 aClass88_1176 = new Class88("2", "2");
	public static final Class88 aClass88_1177 = new Class88("5", "5");
	public static final Class88 aClass88_1178 = new Class88("6", "6");
	public static final Class88 aClass88_1179 = new Class88("4", "4");
	public static final Class88 aClass88_1180 = new Class88("8", "8");
	public static final Class88 aClass88_1181 = new Class88("7", "7");
	public final String aString1182;

	Class88(final String string, final String string_0_) {
		try {
			aString1182 = string_0_;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "fn.<init>()");
		}
	}

	static final void method492(final int i) {
		try {
			if (client.anInt1544 * -411580439 > 1) {
				client.anInt1544 -= 1322221657;
			}
			if (client.anInt1485 * -974834839 > 0) {
				client.anInt1485 -= 1653247193;
			}
			if (client.aBoolean1489) {
				client.aBoolean1489 = false;
				Class26.method244(126072811);
			} else {
				for (int i_1_ = 0; i_1_ < 100 && Class35.method286(-1553105392); i_1_++) {
					/* empty */
				}
				if (30 == -1935794829 * client.anInt1599) {
					Class26_Sub1.method250(client.aClass91_Sub9_Sub1_1478, 87, (short) -23100);
					final Object object = Class36.aClass97_438.anObject1210;
					synchronized (object) {
						if (client.aBoolean1440) {
							if (Class12.anInt172 * -1261190415 != 0 || -1265624073 * Class36.aClass97_438.anInt1211 >= 40) {
								client.aClass91_Sub9_Sub1_1478.method690(220, 1160292001);
								client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(0);
								final int i_2_ = -1128893257 * client.aClass91_Sub9_Sub1_1478.currentOffset;
								int i_3_ = 0;
								for (int i_4_ = 0; i_4_ < Class36.aClass97_438.anInt1211 * -1265624073 && -1128893257 * client.aClass91_Sub9_Sub1_1478.currentOffset - i_2_ < 240; i_4_++) {
									i_3_++;
									int i_5_ = Class36.aClass97_438.anIntArray1213[i_4_];
									if (i_5_ < 0) {
										i_5_ = 0;
									} else if (i_5_ > 502) {
										i_5_ = 502;
									}
									int i_6_ = Class36.aClass97_438.anIntArray1212[i_4_];
									if (i_6_ < 0) {
										i_6_ = 0;
									} else if (i_6_ > 764) {
										i_6_ = 764;
									}
									int i_7_ = 765 * i_5_ + i_6_;
									if (Class36.aClass97_438.anIntArray1213[i_4_] == -1 && -1 == Class36.aClass97_438.anIntArray1212[i_4_]) {
										i_6_ = -1;
										i_5_ = -1;
										i_7_ = 524287;
									}
									if (-1472006957 * client.anInt1451 == i_6_ && i_5_ == client.anInt1452 * -578018697) {
										if (-1475410357 * client.anInt1453 < 2047) {
											client.anInt1453 += 780866403;
										}
									} else {
										int i_8_ = i_6_ - client.anInt1451 * -1472006957;
										client.anInt1451 = 2022277979 * i_6_;
										int i_9_ = i_5_ - -578018697 * client.anInt1452;
										client.anInt1452 = i_5_ * -738961593;
										if (client.anInt1453 * -1475410357 < 8 && i_8_ >= -32 && i_8_ <= 31 && i_9_ >= -32 && i_9_ <= 31) {
											i_8_ += 32;
											i_9_ += 32;
											client.aClass91_Sub9_Sub1_1478.method681((client.anInt1453 * -1475410357 << 12) + (i_8_ << 6) + i_9_, -372694149);
											client.anInt1453 = 0;
										} else if (-1475410357 * client.anInt1453 < 8) {
											client.aClass91_Sub9_Sub1_1478.method672(8388608 + (client.anInt1453 * -1475410357 << 19) + i_7_, (byte) 79);
											client.anInt1453 = 0;
										} else {
											client.aClass91_Sub9_Sub1_1478.writeDWord((client.anInt1453 * -1475410357 << 19) + -1073741824 + i_7_);
											client.anInt1453 = 0;
										}
									}
								}
								client.aClass91_Sub9_Sub1_1478.method638(client.aClass91_Sub9_Sub1_1478.currentOffset * -1128893257 - i_2_, (byte) -39);
								if (i_3_ >= Class36.aClass97_438.anInt1211 * -1265624073) {
									Class36.aClass97_438.anInt1211 = 0;
								} else {
									Class36.aClass97_438.anInt1211 -= 1510544839 * i_3_;
									for (int i_10_ = 0; i_10_ < Class36.aClass97_438.anInt1211 * -1265624073; i_10_++) {
										Class36.aClass97_438.anIntArray1212[i_10_] = Class36.aClass97_438.anIntArray1212[i_3_ + i_10_];
										Class36.aClass97_438.anIntArray1213[i_10_] = Class36.aClass97_438.anIntArray1213[i_10_ + i_3_];
									}
								}
							}
						} else {
							Class36.aClass97_438.anInt1211 = 0;
						}
					}
					if (-1261190415 * Class12.anInt172 != 0) {
						long l = (-3068936409336762163L * Class12.aLong182 - -6203282771730644301L * client.aLong1504) / 50L;
						if (l > 4095L) {
							l = 4095L;
						}
						client.aLong1504 = 4052554804134280831L * Class12.aLong182;
						int i_11_ = -956533215 * Class12.anInt167;
						if (i_11_ < 0) {
							i_11_ = 0;
						} else if (i_11_ > 502) {
							i_11_ = 502;
						}
						int i_12_ = Class12.anInt180 * -1084967827;
						if (i_12_ < 0) {
							i_12_ = 0;
						} else if (i_12_ > 764) {
							i_12_ = 764;
						}
						final int i_13_ = 765 * i_11_ + i_12_;
						int i_14_ = 0;
						if (-1261190415 * Class12.anInt172 == 2) {
							i_14_ = 1;
						}
						final int i_15_ = (int) l;
						client.aClass91_Sub9_Sub1_1478.method690(205, 1160292001);
						client.aClass91_Sub9_Sub1_1478.writeDWord(i_13_ + (i_14_ << 19) + (i_15_ << 20));
					}
					if (-1188242827 * Class15.anInt225 > 0) {
						client.aClass91_Sub9_Sub1_1478.method690(111, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method681(0, -372694149);
						final int i_16_ = -1128893257 * client.aClass91_Sub9_Sub1_1478.currentOffset;
						final long l = Class108.method1111(1924721712);
						for (int i_17_ = 0; i_17_ < Class15.anInt225 * -1188242827; i_17_++) {
							long l_18_ = l - client.aLong1666 * -2408186766305023479L;
							if (l_18_ > 16777215L) {
								l_18_ = 16777215L;
							}
							client.aLong1666 = l * 8758961876110083129L;
							client.aClass91_Sub9_Sub1_1478.method661((int) l_18_, -684080730);
							client.aClass91_Sub9_Sub1_1478.method654(Class15.anIntArray209[i_17_], (byte) 66);
						}
						client.aClass91_Sub9_Sub1_1478.writeWord(client.aClass91_Sub9_Sub1_1478.currentOffset * -1128893257 - i_16_);
					}
					if (client.anInt1532 * -352095827 > 0) {
						client.anInt1532 -= 728308261;
					}
					if (Class15.aBooleanArray218[96] || Class15.aBooleanArray218[97] || Class15.aBooleanArray218[98] || Class15.aBooleanArray218[99]) {
						client.aBoolean1558 = true;
					}
					if (client.aBoolean1558 && client.anInt1532 * -352095827 <= 0) {
						client.anInt1532 = 1681263332;
						client.aBoolean1558 = false;
						client.aClass91_Sub9_Sub1_1478.method690(97, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method681(client.anInt1475 * -2055970425, -372694149);
						client.aClass91_Sub9_Sub1_1478.method659(-1533574683 * client.anInt1528, (byte) -120);
					}
					if (Class7.aBoolean110 && !client.aBoolean1572) {
						client.aBoolean1572 = true;
						client.aClass91_Sub9_Sub1_1478.method690(116, 1160292001);
						client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(1);
					}
					if (!Class7.aBoolean110 && client.aBoolean1572) {
						client.aBoolean1572 = false;
						client.aClass91_Sub9_Sub1_1478.method690(116, 1160292001);
						client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(0);
					}
					if (client.aBoolean1691 && client.anInt1490 * -1623465885 != Class100.anInt1248 * -1723088013) {
						Class41.method347(1622419267 * client.anInt1705, client.anInt1698 * -1872250907, Class100.anInt1248 * -1723088013, Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], -497856132);
					} else if (client.anInt1669 * 1131057221 != -1723088013 * Class100.anInt1248) {
						client.anInt1669 = 1289981015 * Class100.anInt1248;
						final int i_19_ = -1723088013 * Class100.anInt1248;
						final int[] is = Class97.aClass91_Sub20_Sub13_Sub3_1214.anIntArray2557;
						final int i_20_ = is.length;
						for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
							is[i_21_] = 0;
						}
						for (int i_22_ = 1; i_22_ < 103; i_22_++) {
							int i_23_ = 24628 + (103 - i_22_) * 2048;
							for (int i_24_ = 1; i_24_ < 103; i_24_++) {
								if ((Class102.aByteArrayArrayArray1299[i_19_][i_24_][i_22_] & 0x18) == 0) {
									Class107.aClass39_1397.method315(is, i_23_, 512, i_19_, i_24_, i_22_);
								}
								if (i_19_ < 3 && (Class102.aByteArrayArrayArray1299[i_19_ + 1][i_24_][i_22_] & 0x8) != 0) {
									Class107.aClass39_1397.method315(is, i_23_, 512, i_19_ + 1, i_24_, i_22_);
								}
								i_23_ += 4;
							}
						}
						final int i_25_ = (238 + (int) (Math.random() * 20.0) - 10 << 16) + (238 + (int) (Math.random() * 20.0) - 10 << 8) + 238 + (int) (Math.random() * 20.0) - 10;
						final int i_26_ = 238 + (int) (Math.random() * 20.0) - 10 << 16;
						Class97.aClass91_Sub20_Sub13_Sub3_1214.method881();
						for (int i_27_ = 1; i_27_ < 103; i_27_++) {
							for (int i_28_ = 1; i_28_ < 103; i_28_++) {
								if ((Class102.aByteArrayArrayArray1299[i_19_][i_28_][i_27_] & 0x18) == 0) {
									Class102.method1080(i_19_, i_28_, i_27_, i_25_, i_26_, (byte) 1);
								}
								if (i_19_ < 3 && (Class102.aByteArrayArrayArray1299[i_19_ + 1][i_28_][i_27_] & 0x8) != 0) {
									Class102.method1080(i_19_ + 1, i_28_, i_27_, i_25_, i_26_, (byte) 1);
								}
							}
						}
						client.anInt1670 = 0;
						for (int i_29_ = 0; i_29_ < 104; i_29_++) {
							for (int i_30_ = 0; i_30_ < 104; i_30_++) {
								int i_31_ = Class107.aClass39_1397.method311(Class100.anInt1248 * -1723088013, i_29_, i_30_);
								if (i_31_ != 0) {
									i_31_ = i_31_ >> 14 & 0x7fff;
									final int i_32_ = Class60.method392(i_31_, -1802622489).anInt2325 * -523346523;
									if (i_32_ >= 0) {
										int i_33_ = i_29_;
										int i_34_ = i_30_;
										if (22 != i_32_ && i_32_ != 29 && i_32_ != 34 && 36 != i_32_ && i_32_ != 46 && 47 != i_32_ && i_32_ != 48) {
											final int[][] is_35_ = client.aClass76Array1530[Class100.anInt1248 * -1723088013].anIntArrayArray1085;
											for (int i_36_ = 0; i_36_ < 10; i_36_++) {
												final int i_37_ = (int) (Math.random() * 4.0);
												if (i_37_ == 0 && i_33_ > 0 && i_33_ > i_29_ - 3 && (is_35_[i_33_ - 1][i_34_] & 0x12c0108) == 0) {
													i_33_--;
												}
												if (1 == i_37_ && i_33_ < 103 && i_33_ < 3 + i_29_ && (is_35_[i_33_ + 1][i_34_] & 0x12c0180) == 0) {
													i_33_++;
												}
												if (2 == i_37_ && i_34_ > 0 && i_34_ > i_30_ - 3 && (is_35_[i_33_][i_34_ - 1] & 0x12c0102) == 0) {
													i_34_--;
												}
												if (i_37_ == 3 && i_34_ < 103 && i_34_ < 3 + i_30_ && (is_35_[i_33_][i_34_ + 1] & 0x12c0120) == 0) {
													i_34_++;
												}
											}
										}
										client.aClass91_Sub20_Sub13_Sub3Array1673[client.anInt1670 * 1945097923] = Class70.aClass91_Sub20_Sub13_Sub3Array816[i_32_];
										client.anIntArray1671[1945097923 * client.anInt1670] = i_33_;
										client.anIntArray1672[1945097923 * client.anInt1670] = i_34_;
										client.anInt1670 += -536671765;
									}
								}
							}
						}
						Class97.aClass28_1218.method267((byte) 2);
					}
					if (30 == -1935794829 * client.anInt1599) {
						Class17.method184(-306434258);
						for (int i_38_ = 0; i_38_ < client.anInt1506 * 700768557; i_38_++) {
							client.anIntArray1686[i_38_]--;
							if (client.anIntArray1686[i_38_] < -10) {
								client.anInt1506 -= -630909275;
								for (int i_39_ = i_38_; i_39_ < client.anInt1506 * 700768557; i_39_++) {
									client.anIntArray1701[i_39_] = client.anIntArray1701[1 + i_39_];
									client.aClass22Array1688[i_39_] = client.aClass22Array1688[i_39_ + 1];
									client.anIntArray1685[i_39_] = client.anIntArray1685[i_39_ + 1];
									client.anIntArray1686[i_39_] = client.anIntArray1686[i_39_ + 1];
									client.anIntArray1548[i_39_] = client.anIntArray1548[1 + i_39_];
								}
								i_38_--;
							} else {
								Class22 class22 = client.aClass22Array1688[i_38_];
								if (class22 == null) {
									class22 = Class22.method210(Class91_Sub23.aClass63_Sub1_2113, client.anIntArray1701[i_38_], 0);
									if (class22 == null) {
										continue;
									}
									client.anIntArray1686[i_38_] += class22.method209();
									client.aClass22Array1688[i_38_] = class22;
								}
								if (client.anIntArray1686[i_38_] < 0) {
									int i_40_;
									if (client.anIntArray1548[i_38_] != 0) {
										final int i_41_ = (client.anIntArray1548[i_38_] & 0xff) * 128;
										final int i_42_ = client.anIntArray1548[i_38_] >> 16 & 0xff;
										int i_43_ = 64 + i_42_ * 128 - 107578049 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589;
										if (i_43_ < 0) {
											i_43_ = -i_43_;
										}
										final int i_44_ = client.anIntArray1548[i_38_] >> 8 & 0xff;
										int i_45_ = 128 * i_44_ + 64 - -668540675 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583;
										if (i_45_ < 0) {
											i_45_ = -i_45_;
										}
										int i_46_ = i_45_ + i_43_ - 128;
										if (i_46_ > i_41_) {
											client.anIntArray1686[i_38_] = -100;
											continue;
										}
										if (i_46_ < 0) {
											i_46_ = 0;
										}
										i_40_ = client.anInt1497 * -1237997571 * (i_41_ - i_46_) / i_41_;
									} else {
										i_40_ = 1232831055 * client.anInt1680;
									}
									if (i_40_ > 0) {
										final Class91_Sub1_Sub1 class91_sub1_sub1 = class22.method208().method496(Class12.aClass19_175);
										final Class91_Sub2_Sub1 class91_sub2_sub1 = Class91_Sub2_Sub1.method554(class91_sub1_sub1, 100, i_40_);
										class91_sub2_sub1.method548(client.anIntArray1685[i_38_] - 1);
										Class91_Sub22.aClass91_Sub2_Sub2_2109.method559(class91_sub2_sub1);
									}
									client.anIntArray1686[i_38_] = -100;
								}
							}
						}
						if (client.aBoolean1521) {
							boolean bool;
							if (Class64.anInt781 * 1548116911 != 0) {
								bool = true;
							} else {
								bool = Class64.aClass91_Sub2_Sub4_785.method574(1011604727);
							}
							if (!bool) {
								if (client.anInt1677 * 1217281259 != 0 && -1 != client.anInt1678 * 31780839) {
									Class81.method468(Class91_Sub20_Sub2.aClass63_Sub1_2232, 31780839 * client.anInt1678, 0, client.anInt1677 * 1217281259, false, (byte) 3);
								}
								client.aBoolean1521 = false;
							}
						}
						client.anInt1524 += 1297609645;
						if (1240066085 * client.anInt1524 > 750) {
							Class26.method244(-1534914980);
						} else {
							for (int i_47_ = -1; i_47_ < 735674511 * client.anInt1563; i_47_++) {
								int i_48_;
								if (-1 == i_47_) {
									i_48_ = 2047;
								} else {
									i_48_ = client.anIntArray1483[i_47_];
								}
								final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_48_];
								if (class91_sub20_sub14_sub1_sub1 != null) {
									Class42.method354(class91_sub20_sub14_sub1_sub1, 1, (byte) 20);
								}
							}
							for (int i_49_ = 0; i_49_ < client.anInt1684 * 1050401801; i_49_++) {
								final int i_50_ = client.anIntArray1445[i_49_];
								final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_50_];
								if (class91_sub20_sub14_sub1_sub2 != null) {
									Class42.method354(class91_sub20_sub14_sub1_sub2, class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2424 * 2037289339, (byte) 20);
								}
							}
							for (int i_51_ = -1; i_51_ < 735674511 * client.anInt1563; i_51_++) {
								int i_52_;
								if (i_51_ == -1) {
									i_52_ = 2047;
								} else {
									i_52_ = client.anIntArray1483[i_51_];
								}
								final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_52_];
								if (class91_sub20_sub14_sub1_sub1 != null && -1917450261 * class91_sub20_sub14_sub1_sub1.anInt2596 > 0) {
									class91_sub20_sub14_sub1_sub1.anInt2596 -= -1648236349;
									if (-1917450261 * class91_sub20_sub14_sub1_sub1.anInt2596 == 0) {
										class91_sub20_sub14_sub1_sub1.aString2595 = null;
									}
								}
							}
							for (int i_53_ = 0; i_53_ < 1050401801 * client.anInt1684; i_53_++) {
								final int i_54_ = client.anIntArray1445[i_53_];
								final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_54_];
								if (class91_sub20_sub14_sub1_sub2 != null && class91_sub20_sub14_sub1_sub2.anInt2596 * -1917450261 > 0) {
									class91_sub20_sub14_sub1_sub2.anInt2596 -= -1648236349;
									if (class91_sub20_sub14_sub1_sub2.anInt2596 * -1917450261 == 0) {
										class91_sub20_sub14_sub1_sub2.aString2595 = null;
									}
								}
							}
							client.anInt1484 += -1018404983;
							if (client.anInt1552 * 1483470991 != 0) {
								client.anInt1551 += -934664020;
								if (576681615 * client.anInt1551 >= 400) {
									client.anInt1552 = 0;
								}
							}
							if (Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 != null) {
								client.anInt1492 += -298546303;
								if (client.anInt1492 * -923814783 >= 15) {
									Class28_Sub1.method272(Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775, -1905179897);
									Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 = null;
								}
							}
							if (Class91_Sub20_Sub5.aClass91_Sub18_2267 != null) {
								Class28_Sub1.method272(Class91_Sub20_Sub5.aClass91_Sub18_2267, -1905179897);
								client.anInt1598 += 1026612883;
								if (Class12.anInt173 * -695750341 > client.anInt1556 * -132927813 + 5 || Class12.anInt173 * -695750341 < client.anInt1556 * -132927813 - 5 || -855709389 * Class12.anInt178 > 5 + 1404971459 * client.anInt1557 || Class12.anInt178 * -855709389 < 1404971459 * client.anInt1557 - 5) {
									client.aBoolean1559 = true;
								}
								if (443943815 * Class12.anInt171 == 0) {
									if (client.aBoolean1559 && 581627803 * client.anInt1598 >= 5) {
										if (Class91_Sub20_Sub5.aClass91_Sub18_2267 == Class91_Sub23.aClass91_Sub18_2124 && client.anInt1555 * 602933089 != client.anInt1614 * 963831979) {
											final Class91_Sub18 class91_sub18 = Class91_Sub20_Sub5.aClass91_Sub18_2267;
											int i_55_ = 0;
											if (1 == 2039482491 * client.anInt1605 && -299916553 * class91_sub18.anInt1973 == 206) {
												i_55_ = 1;
											}
											if (class91_sub18.anIntArray2030[963831979 * client.anInt1614] <= 0) {
												i_55_ = 0;
											}
											final int i_56_ = Class17.method182(class91_sub18, -864786625);
											final boolean bool = (i_56_ >> 29 & 0x1) != 0;
											if (bool) {
												final int i_57_ = client.anInt1555 * 602933089;
												final int i_58_ = 963831979 * client.anInt1614;
												class91_sub18.anIntArray2030[i_58_] = class91_sub18.anIntArray2030[i_57_];
												class91_sub18.anIntArray1984[i_58_] = class91_sub18.anIntArray1984[i_57_];
												class91_sub18.anIntArray2030[i_57_] = -1;
												class91_sub18.anIntArray1984[i_57_] = 0;
											} else if (1 == i_55_) {
												int i_59_ = 602933089 * client.anInt1555;
												final int i_60_ = 963831979 * client.anInt1614;
												while (i_60_ != i_59_) {
													if (i_59_ > i_60_) {
														class91_sub18.method717(i_59_ - 1, i_59_, (byte) -117);
														i_59_--;
													} else if (i_59_ < i_60_) {
														class91_sub18.method717(i_59_ + 1, i_59_, (byte) -39);
														i_59_++;
													}
												}
											} else {
												class91_sub18.method717(963831979 * client.anInt1614, 602933089 * client.anInt1555, (byte) -112);
											}
											client.aClass91_Sub9_Sub1_1478.method690(42, 1160292001);
											client.aClass91_Sub9_Sub1_1478.method666(Class91_Sub20_Sub5.aClass91_Sub18_2267.anInt2032 * -1026201747, (byte) -80);
											client.aClass91_Sub9_Sub1_1478.method660(602933089 * client.anInt1555, (byte) 106);
											client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(i_55_);
											client.aClass91_Sub9_Sub1_1478.method679(963831979 * client.anInt1614, -1122561687);
										}
									} else if ((1 == client.anInt1514 * -1189077387 || Class91_Sub13.method707(1335574821 * client.anInt1585 - 1, (byte) -13)) && 1335574821 * client.anInt1585 > 2) {
										Class106.method1099(1849174778);
									} else if (1335574821 * client.anInt1585 > 0) {
										Class91_Sub20_Sub15.method1026(client.anInt1585 * 1335574821 - 1, -968007954);
									}
									client.anInt1492 = 1309504266;
									Class12.anInt172 = 0;
									Class91_Sub20_Sub5.aClass91_Sub18_2267 = null;
								}
							}
							final Class91_Sub18 class91_sub18 = Class102.aClass91_Sub18_1314;
							final Class91_Sub18 class91_sub18_61_ = Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub18_2861;
							Class102.aClass91_Sub18_1314 = null;
							Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub18_2861 = null;
							client.aClass91_Sub18_1617 = null;
							client.aBoolean1662 = false;
							client.aBoolean1618 = false;
							for (client.anInt1663 = 0; client.method67(689878010) && client.anInt1663 * 49669195 < 128; client.anInt1663 += 600950115) {
								client.anIntArray1571[49669195 * client.anInt1663] = 1121073135 * Class91_Sub20_Sub4.anInt2262;
								client.anIntArray1664[49669195 * client.anInt1663] = Class48.aChar607;
							}
							Class91_Sub20_Sub6.method765(-1918719153 * client.anInt1602, 0, 0, 765, 503, 0, 0, (byte) -90);
							client.anInt1640 += 253913873;
							for (;;) {
								Class91_Sub21 class91_sub21 = (Class91_Sub21) client.aClass95_1704.method1064();
								if (class91_sub21 == null) {
									for (;;) {
										class91_sub21 = (Class91_Sub21) client.aClass95_1641.method1064();
										if (class91_sub21 == null) {
											for (;;) {
												class91_sub21 = (Class91_Sub21) client.aClass95_1495.method1064();
												if (class91_sub21 == null) {
													if (client.aClass91_Sub18_1461 != null) {
														Class91_Sub20_Sub14_Sub4.method1000(956905480);
													}
													if (Class39.anInt512 != -1) {
														final int i_62_ = Class39.anInt512;
														final int i_63_ = Class39.anInt508;
														final boolean bool = Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_62_, i_63_, true, 0, 0, 0, 0, 0, 0, -60936299);
														Class39.anInt512 = -1;
														if (bool) {
															client.anInt1465 = 1695367541 * Class12.anInt180;
															client.anInt1550 = Class12.anInt167 * -1402467547;
															client.anInt1552 = 1511401071;
															client.anInt1551 = 0;
														}
													}
													while_28_: do {
														if (Class91_Sub20_Sub5.aClass91_Sub18_2267 == null && client.aClass91_Sub18_1461 == null) {
															int i_64_ = Class12.anInt172 * -1261190415;
															if (client.aBoolean1538) {
																if (1 != i_64_) {
																	final int i_65_ = -695750341 * Class12.anInt173;
																	final int i_66_ = Class12.anInt178 * -855709389;
																	if (i_65_ < 1661413593 * Class91_Sub22.anInt2111 - 10 || i_65_ > 1661413593 * Class91_Sub22.anInt2111 + -1981297691 * Class20.anInt273 + 10 || i_66_ < -1370045055 * Class4.anInt63 - 10 || i_66_ > -1370045055 * Class4.anInt63 + -1969918029 * Class19.anInt260 + 10) {
																		client.aBoolean1538 = false;
																		Class91_Sub20_Sub14_Sub1_Sub2.method944(1661413593 * Class91_Sub22.anInt2111, Class4.anInt63 * -1370045055, -1981297691 * Class20.anInt273, Class19.anInt260 * -1969918029, -2115295950);
																	}
																}
																if (1 == i_64_) {
																	final int i_67_ = 1661413593 * Class91_Sub22.anInt2111;
																	final int i_68_ = Class4.anInt63 * -1370045055;
																	final int i_69_ = Class20.anInt273 * -1981297691;
																	final int i_70_ = -1084967827 * Class12.anInt180;
																	final int i_71_ = -956533215 * Class12.anInt167;
																	int i_72_ = -1;
																	for (int i_73_ = 0; i_73_ < client.anInt1585 * 1335574821; i_73_++) {
																		final int i_74_ = i_68_ + 31 + (client.anInt1585 * 1335574821 - 1 - i_73_) * 15;
																		if (i_70_ > i_67_ && i_70_ < i_67_ + i_69_ && i_71_ > i_74_ - 13 && i_71_ < i_74_ + 3) {
																			i_72_ = i_73_;
																		}
																	}
																	if (-1 != i_72_) {
																		Class91_Sub20_Sub15.method1026(i_72_, -807904156);
																	}
																	client.aBoolean1538 = false;
																	Class91_Sub20_Sub14_Sub1_Sub2.method944(Class91_Sub22.anInt2111 * 1661413593, -1370045055 * Class4.anInt63, -1981297691 * Class20.anInt273, -1969918029 * Class19.anInt260, -2058984383);
																}
															} else {
																do {
																	if (i_64_ == 1 && client.anInt1585 * 1335574821 > 0) {
																		final int i_75_ = client.anIntArray1588[1335574821 * client.anInt1585 - 1];
																		if (39 == i_75_ || i_75_ == 40 || 41 == i_75_ || 42 == i_75_ || 43 == i_75_ || i_75_ == 33 || 34 == i_75_ || 35 == i_75_ || i_75_ == 36 || 37 == i_75_ || i_75_ == 38 || 1005 == i_75_) {
																			final int i_76_ = client.anIntArray1586[client.anInt1585 * 1335574821 - 1];
																			final int i_77_ = client.anIntArray1587[1335574821 * client.anInt1585 - 1];
																			final Class91_Sub18 class91_sub18_78_ = Class61.method394(i_77_, -631047529);
																			if (!ByteBuffer.method688(Class17.method182(class91_sub18_78_, -371237451), 1955080503)) {
																				final int i_79_ = Class17.method182(class91_sub18_78_, -1955530698);
																				final boolean bool = (i_79_ >> 29 & 0x1) != 0;
																				if (!bool) {
																					break;
																				}
																			}
																			client.aBoolean1559 = false;
																			client.anInt1598 = 0;
																			if (Class91_Sub20_Sub5.aClass91_Sub18_2267 != null) {
																				Class28_Sub1.method272(Class91_Sub20_Sub5.aClass91_Sub18_2267, -1905179897);
																			}
																			Class91_Sub20_Sub5.aClass91_Sub18_2267 = Class61.method394(i_77_, -631047529);
																			client.anInt1555 = i_76_ * -1607148383;
																			client.anInt1556 = Class12.anInt180 * -1927906569;
																			client.anInt1557 = 1940078155 * Class12.anInt167;
																			Class28_Sub1.method272(Class91_Sub20_Sub5.aClass91_Sub18_2267, -1905179897);
																			break while_28_;
																		}
																	}
																} while (false);
																if (i_64_ == 1 && (1 == client.anInt1514 * -1189077387 && 1335574821 * client.anInt1585 > 2 || Class91_Sub13.method707(client.anInt1585 * 1335574821 - 1, (byte) -61))) {
																	i_64_ = 2;
																}
																if (1 == i_64_ && 1335574821 * client.anInt1585 > 0) {
																	Class91_Sub20_Sub15.method1026(client.anInt1585 * 1335574821 - 1, -1394130101);
																}
																if (2 == i_64_ && 1335574821 * client.anInt1585 > 0) {
																	Class106.method1099(1804667640);
																}
															}
														}
													} while (false);
													if (Class102.aClass91_Sub18_1314 != class91_sub18) {
														if (class91_sub18 != null) {
															Class28_Sub1.method272(class91_sub18, -1905179897);
														}
														if (Class102.aClass91_Sub18_1314 != null) {
															Class28_Sub1.method272(Class102.aClass91_Sub18_1314, -1905179897);
														}
													}
													if (class91_sub18_61_ != Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub18_2861 && client.anInt1594 * 187061203 == -1938839237 * client.anInt1595) {
														if (class91_sub18_61_ != null) {
															Class28_Sub1.method272(class91_sub18_61_, -1905179897);
														}
														if (Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub18_2861 != null) {
															Class28_Sub1.method272(Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub18_2861, -1905179897);
														}
													}
													if (Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub18_2861 != null) {
														if (client.anInt1594 * 187061203 < -1938839237 * client.anInt1595) {
															client.anInt1594 += -698188709;
															if (client.anInt1595 * -1938839237 == client.anInt1594 * 187061203) {
																Class28_Sub1.method272(Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub18_2861, -1905179897);
															}
														}
													} else if (client.anInt1594 * 187061203 > 0) {
														client.anInt1594 -= -698188709;
													}
													Class91_Sub8.method628(246786023);
													if (client.aBoolean1689) {
														Class15.method180(-1387298463);
													}
													for (int i_80_ = 0; i_80_ < 5; i_80_++) {
														client.anIntArray1694[i_80_]++;
													}
													final int i_81_ = Class91_Sub10.method698(487432383);
													final int i_82_ = 1172131065 * Class15.anInt228;
													if (i_81_ > 15000 && i_82_ > 15000) {
														client.anInt1485 = 994937834;
														Class12.anInt168 = -1414016444;
														client.aClass91_Sub9_Sub1_1478.method690(224, 1160292001);
													}
													client.anInt1512 += 890752893;
													if (1551524309 * client.anInt1512 > 500) {
														client.anInt1512 = 0;
														final int i_83_ = (int) (Math.random() * 8.0);
														if (1 == (i_83_ & 0x1)) {
															client.anInt1693 += client.anInt1507 * 767430825;
														}
														if (2 == (i_83_ & 0x2)) {
															client.anInt1508 += client.anInt1509 * -586324977;
														}
														if ((i_83_ & 0x4) == 4) {
															client.anInt1510 += -1839842945 * client.anInt1511;
														}
													}
													if (-1620517009 * client.anInt1693 < -50) {
														client.anInt1507 = -503287058;
													}
													if (-1620517009 * client.anInt1693 > 50) {
														client.anInt1507 = 503287058;
													}
													if (client.anInt1508 * 805635351 < -55) {
														client.anInt1509 = 2106523602;
													}
													if (client.anInt1508 * 805635351 > 55) {
														client.anInt1509 = -2106523602;
													}
													if (client.anInt1510 * -1724302331 < -40) {
														client.anInt1511 = 391414707;
													}
													if (-1724302331 * client.anInt1510 > 40) {
														client.anInt1511 = -391414707;
													}
													client.anInt1501 += 973643783;
													if (986762679 * client.anInt1501 > 500) {
														client.anInt1501 = 0;
														final int i_84_ = (int) (Math.random() * 8.0);
														if ((i_84_ & 0x1) == 1) {
															client.anInt1513 += -1213434937 * client.anInt1632;
														}
														if ((i_84_ & 0x2) == 2) {
															client.anInt1515 += client.anInt1516 * -1674869573;
														}
													}
													if (-1562784247 * client.anInt1513 < -60) {
														client.anInt1632 = -2096261122;
													}
													if (client.anInt1513 * -1562784247 > 60) {
														client.anInt1632 = 2096261122;
													}
													if (-907024925 * client.anInt1515 < -20) {
														client.anInt1516 = -390307791;
													}
													if (-907024925 * client.anInt1515 > 10) {
														client.anInt1516 = 390307791;
													}
													for (Class86_Sub1 class86_sub1 = (Class86_Sub1) client.aClass92_1639.method1056(); class86_sub1 != null; class86_sub1 = (Class86_Sub1) client.aClass92_1639.method1055()) {
														if (2089641975 * class86_sub1.anInt1752 < Class108.method1111(548987691) / 1000L - 5L) {
															if (class86_sub1.aShort1747 > 0) {
																Class101.method1076(5, "", new StringBuilder(class86_sub1.aString1745).append(Class75.aString987).toString(), 2099867309);
															}
															if (class86_sub1.aShort1747 == 0) {
																Class101.method1076(5, "", new StringBuilder(class86_sub1.aString1745).append(Class75.aString988).toString(), 1260848278);
															}
															class86_sub1.method488();
														}
													}
													client.anInt1628 += 1423314787;
													if (client.anInt1628 * 867428939 > 50) {
														client.aClass91_Sub9_Sub1_1478.method690(217, 1160292001);
													}
													try {
														if (Class91_Sub20_Sub14_Sub6.aClass20_2819 != null && client.aClass91_Sub9_Sub1_1478.currentOffset * -1128893257 > 0) {
															Class91_Sub20_Sub14_Sub6.aClass20_2819.method197(client.aClass91_Sub9_Sub1_1478.buffer, 0, -1128893257 * client.aClass91_Sub9_Sub1_1478.currentOffset, (byte) 0);
															client.aClass91_Sub9_Sub1_1478.currentOffset = 0;
															client.anInt1628 = 0;
														}
													} catch (final IOException ioexception) {
														Class26.method244(476219332);
													}
													break;
												}
												final Class91_Sub18 class91_sub18_85_ = class91_sub21.aClass91_Sub18_2090;
												if (class91_sub18_85_.anInt2012 * -819014149 >= 0) {
													final Class91_Sub18 class91_sub18_86_ = Class61.method394(class91_sub18_85_.anInt1980 * 777859439, -631047529);
													if (class91_sub18_86_ == null || class91_sub18_86_.aClass91_Sub18Array2077 == null || class91_sub18_85_.anInt2012 * -819014149 >= class91_sub18_86_.aClass91_Sub18Array2077.length || class91_sub18_85_ != class91_sub18_86_.aClass91_Sub18Array2077[-819014149 * class91_sub18_85_.anInt2012]) {
														continue;
													}
												}
												Class91_Sub20_Sub14.method919(class91_sub21, (short) 13269);
											}
											break;
										}
										final Class91_Sub18 class91_sub18_87_ = class91_sub21.aClass91_Sub18_2090;
										if (-819014149 * class91_sub18_87_.anInt2012 >= 0) {
											final Class91_Sub18 class91_sub18_88_ = Class61.method394(class91_sub18_87_.anInt1980 * 777859439, -631047529);
											if (class91_sub18_88_ == null || class91_sub18_88_.aClass91_Sub18Array2077 == null || -819014149 * class91_sub18_87_.anInt2012 >= class91_sub18_88_.aClass91_Sub18Array2077.length || class91_sub18_88_.aClass91_Sub18Array2077[-819014149 * class91_sub18_87_.anInt2012] != class91_sub18_87_) {
												continue;
											}
										}
										Class91_Sub20_Sub14.method919(class91_sub21, (short) 23337);
									}
									break;
								}
								final Class91_Sub18 class91_sub18_89_ = class91_sub21.aClass91_Sub18_2090;
								if (-819014149 * class91_sub18_89_.anInt2012 >= 0) {
									final Class91_Sub18 class91_sub18_90_ = Class61.method394(class91_sub18_89_.anInt1980 * 777859439, -631047529);
									if (class91_sub18_90_ == null || class91_sub18_90_.aClass91_Sub18Array2077 == null || -819014149 * class91_sub18_89_.anInt2012 >= class91_sub18_90_.aClass91_Sub18Array2077.length || class91_sub18_90_.aClass91_Sub18Array2077[-819014149 * class91_sub18_89_.anInt2012] != class91_sub18_89_) {
										continue;
									}
								}
								Class91_Sub20_Sub14.method919(class91_sub21, (short) 15299);
							}
						}
					}
				}
			}
		} catch (final RuntimeException var19) {
			throw Class102.method1086(var19, "fn.h()");
		}
	}
}
