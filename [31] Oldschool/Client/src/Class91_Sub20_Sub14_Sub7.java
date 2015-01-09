/* Class91_Sub20_Sub14_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

import netscape.javascript.JSObject;

public final class Class91_Sub20_Sub14_Sub7 extends Class91_Sub20_Sub14 {
	static final int anInt2826 = 400;
	int anInt2827;
	static final int anInt2828 = 512;
	static final int anInt2829 = 8;
	static final int anInt2830 = 104;
	int anInt2831;
	static final int anInt2832 = 64;
	static final String aString2833 = "random.dat";
	static Class17 aClass17_2834;
	public static final int anInt2835 = 14;
	public static final int anInt2836 = 233;

	static final String method1015(final int i, final byte i_0_) {
		String string;
		try {
			string = i < 999999999 ? Integer.toString(i) : "*";
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "o.ck()");
		}
		return string;
	}

	@Override
	protected final Class91_Sub20_Sub14_Sub3 method915(final int i) {
		Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3;
		try {
			class91_sub20_sub14_sub3 = Class86_Sub1.method490(this.anInt2831 * -643853787, 234554293).method790(this.anInt2827 * 627729, -1914332238);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "o.w()");
		}
		return class91_sub20_sub14_sub3;
	}

	static final void method1016(final int i) {
		do {
			try {
				try {
					if (client.anInt1533 * -803654039 == 0) {
						if (Class91_Sub20_Sub14_Sub6.aClass20_2819 != null) {
							Class91_Sub20_Sub14_Sub6.aClass20_2819.method194((byte) 1);
							Class91_Sub20_Sub14_Sub6.aClass20_2819 = null;
						}
						Class65.aClass29_1424 = null;
						client.aBoolean1489 = false;
						client.anInt1471 = 0;
						client.anInt1533 = 1811397081;
					}
					if (-803654039 * client.anInt1533 == 1) {
						if (Class65.aClass29_1424 == null) {
							Class65.aClass29_1424 = Class91_Sub22.aClass25_2110.method237(Class17.aString238, Class28_Sub1.anInt1729 * -660438251, 890553208);
						}
						if (2 == Class65.aClass29_1424.anInt348) {
							throw new IOException();
						}
						if (1 == Class65.aClass29_1424.anInt348) {
							Class91_Sub20_Sub14_Sub6.aClass20_2819 = new Class20((Socket) Class65.aClass29_1424.anObject350, Class91_Sub22.aClass25_2110);
							Class65.aClass29_1424 = null;
							client.anInt1533 = -672173134;
						}
					}
					if (-803654039 * client.anInt1533 == 2) {
						client.aClass91_Sub9_Sub1_1478.currentOffset = 0;
						client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(14);
						Class91_Sub20_Sub14_Sub6.aClass20_2819.method197(client.aClass91_Sub9_Sub1_1478.buffer, 0, 1, (byte) 0);
						client.aClass91_Sub9_Sub1_1480.currentOffset = 0;
						client.anInt1533 = 1139223947;
					}
					if (-803654039 * client.anInt1533 == 3) {
						if (client.aClass6_1682 != null) {
							client.aClass6_1682.method110(-1507980225);
						}
						if (Class86_Sub1.aClass6_1750 != null) {
							Class86_Sub1.aClass6_1750.method110(-396402350);
						}
						final int i_1_ = Class91_Sub20_Sub14_Sub6.aClass20_2819.method195(610358158);
						if (client.aClass6_1682 != null) {
							client.aClass6_1682.method110(-446248999);
						}
						if (Class86_Sub1.aClass6_1750 != null) {
							Class86_Sub1.aClass6_1750.method110(-1410777375);
						}
						if (i_1_ != 0) {
							method1024(i_1_, 1446195533);
							break;
						}
						client.aClass91_Sub9_Sub1_1480.currentOffset = 0;
						client.anInt1533 = 467050813;
					}
					if (client.anInt1533 * -803654039 == 5) {
						final int[] is = { (int) (Math.random() * 9.9999999E7), (int) (Math.random() * 9.9999999E7), (int) (Math.random() * 9.9999999E7), (int) (Math.random() * 9.9999999E7) };
						client.aClass91_Sub9_Sub1_1478.currentOffset = 0;
						client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(10);
						client.aClass91_Sub9_Sub1_1478.writeDWord(is[0]);
						client.aClass91_Sub9_Sub1_1478.writeDWord(is[1]);
						client.aClass91_Sub9_Sub1_1478.writeDWord(is[2]);
						client.aClass91_Sub9_Sub1_1478.writeDWord(is[3]);
						client.aClass91_Sub9_Sub1_1478.writeQWord(0L);
						client.aClass91_Sub9_Sub1_1478.method634(Class101.aString1278, (byte) 7);
						client.aClass91_Sub9_Sub1_1478.method671(Class41.aBigInteger552, Class41.aBigInteger548, (byte) 81);
						client.aClass91_Sub9_Sub1_1479.currentOffset = 0;
						if (client.anInt1599 * -1935794829 == 40) {
							client.aClass91_Sub9_Sub1_1479.writeWordBigEndian(18);
						} else {
							client.aClass91_Sub9_Sub1_1479.writeWordBigEndian(16);
						}
						client.aClass91_Sub9_Sub1_1479.method681(0, -372694149);
						final int i_2_ = -1128893257 * client.aClass91_Sub9_Sub1_1479.currentOffset;
						client.aClass91_Sub9_Sub1_1479.writeDWord(31);
						client.aClass91_Sub9_Sub1_1479.method685(client.aClass91_Sub9_Sub1_1478.buffer, 0, -1128893257 * client.aClass91_Sub9_Sub1_1478.currentOffset, 1298414944);
						final int i_3_ = client.aClass91_Sub9_Sub1_1479.currentOffset * -1128893257;
						client.aClass91_Sub9_Sub1_1479.method634(Class101.aString1277, (byte) 12);
						client.aClass91_Sub9_Sub1_1479.writeWordBigEndian(client.aBoolean1691 ? 1 : 0);
						final Class91_Sub9_Sub1 class91_sub9_sub1 = client.aClass91_Sub9_Sub1_1479;
						final byte[] is_4_ = new byte[24];
						try {
							Class35.aClass4_411.method90(0L);
							Class35.aClass4_411.method96(is_4_, (byte) -17);
							int i_5_;
							for (i_5_ = 0; i_5_ < 24 && is_4_[i_5_] == 0; i_5_++) {
								/* empty */
							}
							if (i_5_ >= 24) {
								throw new IOException();
							}
						} catch (final Exception exception) {
							for (int i_6_ = 0; i_6_ < 24; i_6_++) {
								is_4_[i_6_] = (byte) -1;
							}
						}
						class91_sub9_sub1.method685(is_4_, 0, 24, 1499855706);
						final ByteBuffer class91_sub9 = new ByteBuffer(Class23.aClass91_Sub13_289.method706(-563685748));
						Class23.aClass91_Sub13_289.method705(class91_sub9, -1895318616);
						client.aClass91_Sub9_Sub1_1479.method685(class91_sub9.buffer, 0, class91_sub9.buffer.length, 1426559657);
						client.aClass91_Sub9_Sub1_1479.writeDWord(-1103292969 * Class91_Sub14.aClass63_Sub1_1936.anInt766);
						client.aClass91_Sub9_Sub1_1479.writeDWord(Class91_Sub23.aClass63_Sub1_2118.anInt766 * -1103292969);
						client.aClass91_Sub9_Sub1_1479.writeDWord(-1103292969 * Class108.index2Js5.anInt766);
						client.aClass91_Sub9_Sub1_1479.writeDWord(Class37.aClass63_Sub1_442.anInt766 * -1103292969);
						client.aClass91_Sub9_Sub1_1479.writeDWord(-1103292969 * Class91_Sub23.aClass63_Sub1_2113.anInt766);
						client.aClass91_Sub9_Sub1_1479.writeDWord(Class67.aClass63_Sub1_800.anInt766 * -1103292969);
						client.aClass91_Sub9_Sub1_1479.writeDWord(Class91_Sub20_Sub2.aClass63_Sub1_2232.anInt766 * -1103292969);
						client.aClass91_Sub9_Sub1_1479.writeDWord(-1103292969 * Class91_Sub10.modelJs5.anInt766);
						client.aClass91_Sub9_Sub1_1479.writeDWord(Class97.aClass63_Sub1_1209.anInt766 * -1103292969);
						client.aClass91_Sub9_Sub1_1479.writeDWord(-1103292969 * Class1.aClass63_Sub1_32.anInt766);
						client.aClass91_Sub9_Sub1_1479.writeDWord(Class91_Sub20_Sub14_Sub5.aClass63_Sub1_2800.anInt766 * -1103292969);
						client.aClass91_Sub9_Sub1_1479.writeDWord(Class103.aClass63_Sub1_1318.anInt766 * -1103292969);
						client.aClass91_Sub9_Sub1_1479.writeDWord(Class42.aClass63_Sub1_556.anInt766 * -1103292969);
						client.aClass91_Sub9_Sub1_1479.writeDWord(Class105.aClass63_Sub1_1360.anInt766 * -1103292969);
						client.aClass91_Sub9_Sub1_1479.writeDWord(-1103292969 * Class15.aClass63_Sub1_212.anInt766);
						client.aClass91_Sub9_Sub1_1479.writeDWord(-1103292969 * Class102.aClass63_Sub1_1317.anInt766);
						client.aClass91_Sub9_Sub1_1479.method680(is, i_3_, client.aClass91_Sub9_Sub1_1479.currentOffset * -1128893257, -1353214896);
						client.aClass91_Sub9_Sub1_1479.writeWord(client.aClass91_Sub9_Sub1_1479.currentOffset * -1128893257 - i_2_);
						Class91_Sub20_Sub14_Sub6.aClass20_2819.method197(client.aClass91_Sub9_Sub1_1479.buffer, 0, -1128893257 * client.aClass91_Sub9_Sub1_1479.currentOffset, (byte) 0);
						client.aClass91_Sub9_Sub1_1478.method689(is, (byte) 56);
						for (int i_7_ = 0; i_7_ < 4; i_7_++) {
							is[i_7_] += 50;
						}
						client.aClass91_Sub9_Sub1_1480.method689(is, (byte) 14);
						client.anInt1533 = -2016519402;
					}
					if (client.anInt1533 * -803654039 == 6 && Class91_Sub20_Sub14_Sub6.aClass20_2819.method196((byte) 5) > 0) {
						final int i_8_ = Class91_Sub20_Sub14_Sub6.aClass20_2819.method195(-129262540);
						if (21 == i_8_ && 20 == -1935794829 * client.anInt1599) {
							client.anInt1533 = -205122321;
						} else if (i_8_ == 2) {
							client.anInt1533 = -877295455;
						} else {
							if (15 == i_8_ && -1935794829 * client.anInt1599 == 40) {
								client.aClass91_Sub9_Sub1_1478.currentOffset = 0;
								client.aClass91_Sub9_Sub1_1480.currentOffset = 0;
								client.anInt1482 = -1986708965;
								client.anInt1486 = 1513355967;
								client.anInt1687 = -1166588049;
								client.anInt1447 = 449095181;
								client.anInt1570 = 0;
								client.anInt1524 = 0;
								client.anInt1544 = 0;
								client.anInt1585 = 0;
								client.aBoolean1538 = false;
								client.anInt1676 = 0;
								client.anInt1674 = 0;
								for (int i_9_ = 0; i_9_ < client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562.length; i_9_++) {
									if (client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_9_] != null) {
										client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_9_].anInt2605 = -728389403;
									}
								}
								for (int i_10_ = 0; i_10_ < client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590.length; i_10_++) {
									if (client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_10_] != null) {
										client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_10_].anInt2605 = -728389403;
									}
								}
								Class91_Sub22.aClass83_2108 = new Class83(32);
								Class91_Sub20_Sub14_Sub1_Sub2.method939(30, -164648312);
								for (int i_11_ = 0; i_11_ < 100; i_11_++) {
									client.aBooleanArray1645[i_11_] = true;
								}
								break;
							}
							if (23 != i_8_ || 1337485133 * client.anInt1472 >= 1) {
								method1024(i_8_, 1838455856);
								break;
							}
							client.anInt1472 += 1371744645;
							client.anInt1533 = 0;
						}
					}
					if (7 == -803654039 * client.anInt1533 && Class91_Sub20_Sub14_Sub6.aClass20_2819.method196((byte) 5) > 0) {
						client.anInt1473 = (Class91_Sub20_Sub14_Sub6.aClass20_2819.method195(1106350721) + 3) * 772010452;
						client.anInt1533 = 1606274760;
					}
					if (8 == -803654039 * client.anInt1533) {
						client.anInt1471 = 0;
						Class4.method99(Class75.aString880, Class75.aString877, new StringBuilder(String.valueOf(client.anInt1473 * 602360307 / 60)).append(Class75.aString882).toString(), 670678790);
						if ((client.anInt1473 -= -1561954501) * 602360307 <= 0) {
							client.anInt1533 = 0;
						}
					} else {
						if (9 == -803654039 * client.anInt1533 && Class91_Sub20_Sub14_Sub6.aClass20_2819.method196((byte) 5) >= 8) {
							client.anInt1522 = Class91_Sub20_Sub14_Sub6.aClass20_2819.method195(-1204782657) * -1652651449;
							client.aBoolean1525 = Class91_Sub20_Sub14_Sub6.aClass20_2819.method195(-1163084146) == 1;
							client.anInt1576 = Class91_Sub20_Sub14_Sub6.aClass20_2819.method195(-1949140823) * 2116211775;
							client.anInt1576 = 2116211775 * (client.anInt1576 * 2082413503 << 8);
							client.anInt1576 += Class91_Sub20_Sub14_Sub6.aClass20_2819.method195(-945288894) * 2116211775;
							client.anInt1569 = Class91_Sub20_Sub14_Sub6.aClass20_2819.method195(1079448554) * 1928220187;
							Class91_Sub20_Sub14_Sub6.aClass20_2819.method199(client.aClass91_Sub9_Sub1_1480.buffer, 0, 1, (short) -5698);
							client.aClass91_Sub9_Sub1_1480.currentOffset = 0;
							client.anInt1482 = client.aClass91_Sub9_Sub1_1480.method691(-952154771) * 1986708965;
							Class91_Sub20_Sub14_Sub6.aClass20_2819.method199(client.aClass91_Sub9_Sub1_1480.buffer, 0, 2, (short) -13079);
							client.aClass91_Sub9_Sub1_1480.currentOffset = 0;
							client.anInt1570 = client.aClass91_Sub9_Sub1_1480.method686((byte) -118) * 2103573359;
							if (-157033453 * client.anInt1569 == 1) {
								try {
									final client var_client = client.aClient1439;
									JSObject.getWindow(var_client).call("zap", null);
								} catch (final Throwable throwable) {
									/* empty */
								}
							} else {
								try {
									final client var_client = client.aClient1439;
									JSObject.getWindow(var_client).call("unzap", null);
								} catch (final Throwable throwable) {
									/* empty */
								}
							}
							client.anInt1533 = 934101626;
						}
						if (client.anInt1533 * -803654039 != 10) {
							client.anInt1471 += -1702279267;
							if (356939445 * client.anInt1471 > 2000) {
								if (1337485133 * client.anInt1472 < 1) {
									if (-660438251 * Class28_Sub1.anInt1729 == -2055567355 * Class97.anInt1215) {
										Class28_Sub1.anInt1729 = -734870259 * client.anInt1474;
									} else {
										Class28_Sub1.anInt1729 = Class97.anInt1215 * 1949429041;
									}
									client.anInt1472 += 1371744645;
									client.anInt1533 = 0;
								} else {
									method1024(-3, 1023746338);
								}
							}
						} else if (Class91_Sub20_Sub14_Sub6.aClass20_2819.method196((byte) 5) >= client.anInt1570 * 1152500623) {
							client.aClass91_Sub9_Sub1_1480.currentOffset = 0;
							Class91_Sub20_Sub14_Sub6.aClass20_2819.method199(client.aClass91_Sub9_Sub1_1480.buffer, 0, client.anInt1570 * 1152500623, (short) -11542);
							client.aLong1504 = 6242849406103274373L;
							client.anInt1453 = -780866403;
							Class36.aClass97_438.anInt1211 = 0;
							Class7.aBoolean110 = true;
							client.aBoolean1572 = true;
							client.aLong1666 = -8758961876110083129L;
							Class1.method79(-2004826648);
							client.aClass91_Sub9_Sub1_1478.currentOffset = 0;
							client.aClass91_Sub9_Sub1_1480.currentOffset = 0;
							client.anInt1482 = -1986708965;
							client.anInt1486 = 1513355967;
							client.anInt1687 = -1166588049;
							client.anInt1447 = 449095181;
							client.anInt1524 = 0;
							client.anInt1544 = 0;
							client.anInt1485 = 0;
							client.anInt1457 = 0;
							client.anInt1585 = 0;
							client.aBoolean1538 = false;
							Class12.anInt168 = 0;
							for (int i_12_ = 0; i_12_ < 100; i_12_++) {
								client.aStringArray1656[i_12_] = null;
							}
							client.anInt1539 = 0;
							client.anInt1596 = 0;
							client.aBoolean1568 = false;
							client.anInt1506 = 0;
							client.anInt1693 = ((int) (Math.random() * 100.0) - 50) * 772759439;
							client.anInt1508 = ((int) (Math.random() * 110.0) - 55) * 1065124519;
							client.anInt1510 = ((int) (Math.random() * 80.0) - 40) * -1201524531;
							client.anInt1513 = ((int) (Math.random() * 120.0) - 60) * 1438654521;
							client.anInt1515 = ((int) (Math.random() * 30.0) - 20) * 661555147;
							client.anInt1528 = ((int) (Math.random() * 20.0) - 10 & 0x7ff) * 170513389;
							client.anInt1676 = 0;
							client.anInt1669 = -1784021645;
							client.anInt1674 = 0;
							client.anInt1675 = 0;
							client.anInt1563 = 0;
							client.anInt1684 = 0;
							for (int i_13_ = 0; i_13_ < 2048; i_13_++) {
								client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_13_] = null;
								client.aClass91_Sub9Array1567[i_13_] = null;
							}
							for (int i_14_ = 0; i_14_ < 32768; i_14_++) {
								client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_14_] = null;
							}
							Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[2047] = new Class91_Sub20_Sub14_Sub1_Sub1();
							client.aClass95_1578.method1057();
							client.aClass95_1579.method1057();
							for (int i_15_ = 0; i_15_ < 4; i_15_++) {
								for (int i_16_ = 0; i_16_ < 104; i_16_++) {
									for (int i_17_ = 0; i_17_ < 104; i_17_++) {
										client.aClass95ArrayArrayArray1477[i_15_][i_16_][i_17_] = null;
									}
								}
							}
							client.aClass95_1577 = new Class95();
							client.anInt1696 = 0;
							client.anInt1695 = 0;
							client.anInt1493 = 0;
							for (int i_18_ = 0; i_18_ < Class91_Sub20_Sub6.anInt2286 * -2132399107; i_18_++) {
								final Class91_Sub20_Sub6 class91_sub20_sub6 = Class60.method393(i_18_, (byte) -70);
								if (class91_sub20_sub6 != null && -2049582573 * class91_sub20_sub6.anInt2288 == 0) {
									Class93.anIntArray1197[i_18_] = 0;
									Class93.anIntArray1199[i_18_] = 0;
								}
							}
							for (int i_19_ = 0; i_19_ < client.anIntArray1636.length; i_19_++) {
								client.anIntArray1636[i_19_] = -1;
							}
							if (-1918719153 * client.anInt1602 != -1) {
								final int i_20_ = client.anInt1602 * -1918719153;
								if (i_20_ != -1 && Class91_Sub18.aBooleanArray1961[i_20_]) {
									Class91_Sub18.aClass63_2056.method406(i_20_, -1254646641);
									if (Class91_Sub18.aClass91_Sub18ArrayArray1962[i_20_] != null) {
										boolean bool = true;
										for (int i_21_ = 0; i_21_ < Class91_Sub18.aClass91_Sub18ArrayArray1962[i_20_].length; i_21_++) {
											if (Class91_Sub18.aClass91_Sub18ArrayArray1962[i_20_][i_21_] != null) {
												if (2 != 633275603 * Class91_Sub18.aClass91_Sub18ArrayArray1962[i_20_][i_21_].anInt2057) {
													Class91_Sub18.aClass91_Sub18ArrayArray1962[i_20_][i_21_] = null;
												} else {
													bool = false;
												}
											}
										}
										if (bool) {
											Class91_Sub18.aClass91_Sub18ArrayArray1962[i_20_] = null;
										}
										Class91_Sub18.aBooleanArray1961[i_20_] = false;
									}
								}
							}
							for (Class91_Sub10 class91_sub10 = (Class91_Sub10) client.aClass83_1603.method476(); class91_sub10 != null; class91_sub10 = (Class91_Sub10) client.aClass83_1603.method477()) {
								Class102.method1081(class91_sub10, true, -1363054508);
							}
							client.anInt1602 = 1301836881;
							client.aClass83_1603 = new Class83(8);
							client.aClass91_Sub18_1606 = null;
							client.aBoolean1538 = false;
							client.anInt1585 = 0;
							client.aClass85_1622.method487(null, new int[5], false, -1, 1382308169);
							for (int i_22_ = 0; i_22_ < 8; i_22_++) {
								client.aStringArray1573[i_22_] = null;
								client.aBooleanArray1574[i_22_] = false;
							}
							Class91_Sub22.aClass83_2108 = new Class83(32);
							client.aBoolean1448 = true;
							for (int i_23_ = 0; i_23_ < 100; i_23_++) {
								client.aBooleanArray1645[i_23_] = true;
							}
							client.aString1619 = null;
							Class17.anInt241 = 0;
							ObjType.aClass91_Sub23Array2395 = null;
							client.anInt1705 = 601154197;
							Class101.method1079(false, -1479847959);
							client.anInt1482 = -1986708965;
						}
					}
				} catch (final IOException ioexception) {
					if (1337485133 * client.anInt1472 < 1) {
						if (-660438251 * Class28_Sub1.anInt1729 == Class97.anInt1215 * -2055567355) {
							Class28_Sub1.anInt1729 = client.anInt1474 * -734870259;
						} else {
							Class28_Sub1.anInt1729 = Class97.anInt1215 * 1949429041;
						}
						client.anInt1472 += 1371744645;
						client.anInt1533 = 0;
					} else {
						method1024(-2, 2020086629);
						break;
					}
				}
				break;
			} catch (final RuntimeException var12) {
				throw Class102.method1086(var12, "o.v()");
			}
		} while (false);
	}

	public static void method1020(final boolean bool, final int i) {
		try {
			if (ObjType.aBoolean2379 != bool) {
				ObjType.aClass96_2352.method1070();
				ObjType.aClass96_2393.method1070();
				ObjType.aClass96_2390.method1070();
				ObjType.aBoolean2379 = bool;
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "o.m()");
		}
	}

	public static void method1021(final Js5 class63, final int i) {
		try {
			Class91_Sub20_Sub2.aClass63_2234 = class63;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "o.i()");
		}
	}

	static final void method1022(final Class91_Sub20_Sub13_Sub1 class91_sub20_sub13_sub1, final byte i) {
		try {
			for (int i_25_ = 0; i_25_ < Class91_Sub10.anIntArray1870.length; i_25_++) {
				Class91_Sub10.anIntArray1870[i_25_] = 0;
			}
			for (int i_26_ = 0; i_26_ < 5000; i_26_++) {
				final int i_27_ = (int) (Math.random() * 128.0 * 256.0);
				Class91_Sub10.anIntArray1870[i_27_] = (int) (Math.random() * 256.0);
			}
			for (int i_28_ = 0; i_28_ < 20; i_28_++) {
				for (int i_29_ = 1; i_29_ < 255; i_29_++) {
					if (i <= 2) {
						return;
					}
					for (int i_30_ = 1; i_30_ < 127; i_30_++) {
						final int i_31_ = (i_29_ << 7) + i_30_;
						Class54.anIntArray640[i_31_] = (Class91_Sub10.anIntArray1870[i_31_ - 128] + Class91_Sub10.anIntArray1870[i_31_ + 1] + Class91_Sub10.anIntArray1870[i_31_ - 1] + Class91_Sub10.anIntArray1870[i_31_ + 128]) / 4;
					}
				}
				final int[] is = Class91_Sub10.anIntArray1870;
				Class91_Sub10.anIntArray1870 = Class54.anIntArray640;
				Class54.anIntArray640 = is;
			}
			if (class91_sub20_sub13_sub1 != null) {
				int i_32_ = 0;
				for (int i_33_ = 0; i_33_ < class91_sub20_sub13_sub1.anInt2519; i_33_++) {
					for (int i_34_ = 0; i_34_ < class91_sub20_sub13_sub1.anInt2517; i_34_++) {
						if (class91_sub20_sub13_sub1.aByteArray2520[i_32_++] != 0) {
							final int i_35_ = class91_sub20_sub13_sub1.anInt2518 + 16 + i_34_;
							final int i_36_ = 16 + i_33_ + class91_sub20_sub13_sub1.anInt2516;
							final int i_37_ = (i_36_ << 7) + i_35_;
							Class91_Sub10.anIntArray1870[i_37_] = 0;
						}
					}
				}
			}
		} catch (final RuntimeException var9) {
			throw Class102.method1086(var9, "o.e()");
		}
	}

	static final void method1023(final Class39 class39, final Class76[] class76s, final int i) {
		try {
			for (int i_38_ = 0; i_38_ < 4; i_38_++) {
				for (int i_39_ = 0; i_39_ < 104; i_39_++) {
					if (i <= -378241568) {
						return;
					}
					for (int i_40_ = 0; i_40_ < 104; i_40_++) {
						if ((Class102.aByteArrayArrayArray1299[i_38_][i_39_][i_40_] & 0x1) == 1) {
							int i_41_ = i_38_;
							if (2 == (Class102.aByteArrayArrayArray1299[1][i_39_][i_40_] & 0x2)) {
								i_41_ = i_38_ - 1;
							}
							if (i_41_ >= 0) {
								class76s[i_41_].method457(i_39_, i_40_, 737136227);
							}
						}
					}
				}
			}
			Class102.anInt1308 += ((int) (Math.random() * 5.0) - 2) * 611966437;
			if (1936070637 * Class102.anInt1308 < -8) {
				Class102.anInt1308 = -600764200;
			}
			if (Class102.anInt1308 * 1936070637 > 8) {
				Class102.anInt1308 = 600764200;
			}
			Class102.anInt1297 += ((int) (Math.random() * 5.0) - 2) * -964328369;
			if (Class102.anInt1297 * -578612561 < -16) {
				Class102.anInt1297 = -1750615280;
			}
			if (-578612561 * Class102.anInt1297 > 16) {
				Class102.anInt1297 = 1750615280;
			}
			for (int i_42_ = 0; i_42_ < 4; i_42_++) {
				if (i <= -378241568) {
					return;
				}
				final byte[][] is = Class102.aByteArrayArrayArray1310[i_42_];
				final int i_43_ = (int) Math.sqrt(5100.0);
				final int i_44_ = i_43_ * 768 >> 8;
				for (int i_45_ = 1; i_45_ < 103; i_45_++) {
					for (int i_46_ = 1; i_46_ < 103; i_46_++) {
						final int i_47_ = Class102.anIntArrayArrayArray1292[i_42_][1 + i_46_][i_45_] - Class102.anIntArrayArrayArray1292[i_42_][i_46_ - 1][i_45_];
						final int i_48_ = Class102.anIntArrayArrayArray1292[i_42_][i_46_][i_45_ + 1] - Class102.anIntArrayArrayArray1292[i_42_][i_46_][i_45_ - 1];
						final int i_49_ = (int) Math.sqrt(65536 + i_47_ * i_47_ + i_48_ * i_48_);
						final int i_50_ = (i_47_ << 8) / i_49_;
						final int i_51_ = 65536 / i_49_;
						final int i_52_ = (i_48_ << 8) / i_49_;
						final int i_53_ = 96 + (i_50_ * -50 + i_51_ * -10 + i_52_ * -50) / i_44_;
						final int i_54_ = (is[i_46_][i_45_] >> 1) + (is[i_46_ + 1][i_45_] >> 3) + (is[i_46_ - 1][i_45_] >> 2) + (is[i_46_][i_45_ - 1] >> 2) + (is[i_46_][1 + i_45_] >> 3);
						Class102.anIntArrayArray1298[i_46_][i_45_] = i_53_ - i_54_;
					}
				}
				for (int i_55_ = 0; i_55_ < 104; i_55_++) {
					Class102.anIntArray1304[i_55_] = 0;
					Class32.anIntArray377[i_55_] = 0;
					Class91_Sub20_Sub9.anIntArray2403[i_55_] = 0;
					Class106.anIntArray1376[i_55_] = 0;
					Class46.anIntArray589[i_55_] = 0;
				}
				for (int i_56_ = -5; i_56_ < 109; i_56_++) {
					if (i <= -378241568) {
						return;
					}
					for (int i_57_ = 0; i_57_ < 104; i_57_++) {
						final int i_58_ = 5 + i_56_;
						if (i_58_ >= 0 && i_58_ < 104) {
							final int i_59_ = Class102.aByteArrayArrayArray1295[i_42_][i_58_][i_57_] & 0xff;
							if (i_59_ > 0) {
								final FloUnderlayType class91_sub20_sub10 = Class37.method289(i_59_ - 1, (byte) 18);
								Class102.anIntArray1304[i_57_] += 903511151 * class91_sub20_sub10.anInt2415;
								Class32.anIntArray377[i_57_] += -1760716051 * class91_sub20_sub10.anInt2416;
								Class91_Sub20_Sub9.anIntArray2403[i_57_] += class91_sub20_sub10.anInt2417 * -131321533;
								Class106.anIntArray1376[i_57_] += class91_sub20_sub10.anInt2413 * 205355605;
								Class46.anIntArray589[i_57_]++;
							}
						}
						final int i_60_ = i_56_ - 5;
						if (i_60_ >= 0 && i_60_ < 104) {
							final int i_61_ = Class102.aByteArrayArrayArray1295[i_42_][i_60_][i_57_] & 0xff;
							if (i_61_ > 0) {
								final FloUnderlayType class91_sub20_sub10 = Class37.method289(i_61_ - 1, (byte) -80);
								Class102.anIntArray1304[i_57_] -= 903511151 * class91_sub20_sub10.anInt2415;
								Class32.anIntArray377[i_57_] -= class91_sub20_sub10.anInt2416 * -1760716051;
								Class91_Sub20_Sub9.anIntArray2403[i_57_] -= class91_sub20_sub10.anInt2417 * -131321533;
								Class106.anIntArray1376[i_57_] -= 205355605 * class91_sub20_sub10.anInt2413;
								Class46.anIntArray589[i_57_]--;
							}
						}
					}
					if (i_56_ >= 1 && i_56_ < 103) {
						int i_62_ = 0;
						int i_63_ = 0;
						int i_64_ = 0;
						int i_65_ = 0;
						int i_66_ = 0;
						int i_67_ = -5;
						for (/**/; i_67_ < 109; i_67_++) {
							final int i_68_ = i_67_ + 5;
							if (i_68_ >= 0 && i_68_ < 104) {
								i_62_ += Class102.anIntArray1304[i_68_];
								i_63_ += Class32.anIntArray377[i_68_];
								i_64_ += Class91_Sub20_Sub9.anIntArray2403[i_68_];
								i_65_ += Class106.anIntArray1376[i_68_];
								i_66_ += Class46.anIntArray589[i_68_];
							}
							final int i_69_ = i_67_ - 5;
							if (i_69_ >= 0 && i_69_ < 104) {
								i_62_ -= Class102.anIntArray1304[i_69_];
								i_63_ -= Class32.anIntArray377[i_69_];
								i_64_ -= Class91_Sub20_Sub9.anIntArray2403[i_69_];
								i_65_ -= Class106.anIntArray1376[i_69_];
								i_66_ -= Class46.anIntArray589[i_69_];
							}
							if (i_67_ >= 1 && i_67_ < 103) {
								if (client.aBoolean1691 && (Class102.aByteArrayArrayArray1299[0][i_56_][i_67_] & 0x2) == 0) {
									if ((Class102.aByteArrayArrayArray1299[i_42_][i_56_][i_67_] & 0x10) != 0) {
										if (i <= -378241568) {
											throw new IllegalStateException();
										}
										continue;
									}
									int i_70_;
									if ((Class102.aByteArrayArrayArray1299[i_42_][i_56_][i_67_] & 0x8) != 0) {
										i_70_ = 0;
									} else if (i_42_ > 0 && (Class102.aByteArrayArrayArray1299[1][i_56_][i_67_] & 0x2) != 0) {
										i_70_ = i_42_ - 1;
									} else {
										i_70_ = i_42_;
									}
									if (client.anInt1490 * -1623465885 != i_70_) {
										continue;
									}
								}
								if (i_42_ < -1711069075 * Class102.anInt1294) {
									Class102.anInt1294 = -975756955 * i_42_;
								}
								final int i_71_ = Class102.aByteArrayArrayArray1295[i_42_][i_56_][i_67_] & 0xff;
								final int i_72_ = Class91_Sub20_Sub6.aByteArrayArrayArray2292[i_42_][i_56_][i_67_] & 0xff;
								if (i_71_ > 0 || i_72_ > 0) {
									final int i_73_ = Class102.anIntArrayArrayArray1292[i_42_][i_56_][i_67_];
									final int i_74_ = Class102.anIntArrayArrayArray1292[i_42_][i_56_ + 1][i_67_];
									final int i_75_ = Class102.anIntArrayArrayArray1292[i_42_][1 + i_56_][1 + i_67_];
									final int i_76_ = Class102.anIntArrayArrayArray1292[i_42_][i_56_][i_67_ + 1];
									final int i_77_ = Class102.anIntArrayArray1298[i_56_][i_67_];
									final int i_78_ = Class102.anIntArrayArray1298[1 + i_56_][i_67_];
									final int i_79_ = Class102.anIntArrayArray1298[i_56_ + 1][1 + i_67_];
									final int i_80_ = Class102.anIntArrayArray1298[i_56_][i_67_ + 1];
									int i_81_ = -1;
									int i_82_ = -1;
									if (i_71_ > 0) {
										int i_83_ = 256 * i_62_ / i_65_;
										final int i_84_ = i_63_ / i_66_;
										int i_85_ = i_64_ / i_66_;
										i_81_ = Class40.method341(i_83_, i_84_, i_85_, (byte) 29);
										i_83_ = i_83_ + Class102.anInt1308 * 1936070637 & 0xff;
										i_85_ += Class102.anInt1297 * -578612561;
										if (i_85_ < 0) {
											i_85_ = 0;
										} else if (i_85_ > 255) {
											i_85_ = 255;
										}
										i_82_ = Class40.method341(i_83_, i_84_, i_85_, (byte) 37);
									}
									if (i_42_ > 0) {
										boolean bool = true;
										if (i_71_ == 0 && Class102.aByteArrayArrayArray1296[i_42_][i_56_][i_67_] != 0) {
											bool = false;
										}
										if (i_72_ > 0 && !Class6.method107(i_72_ - 1, (short) 16256).aBoolean2241) {
											bool = false;
										}
										if (bool && i_74_ == i_73_ && i_73_ == i_75_ && i_76_ == i_73_) {
											Class32.anIntArrayArrayArray375[i_42_][i_56_][i_67_] |= 0x924;
										}
									}
									int i_86_ = 0;
									if (i_82_ != -1) {
										i_86_ = Class91_Sub20_Sub13_Sub2.anIntArray2543[Class30.method274(i_82_, 96, (byte) -14)];
									}
									if (i_72_ == 0) {
										class39.method296(i_42_, i_56_, i_67_, 0, 0, -1, i_73_, i_74_, i_75_, i_76_, Class30.method274(i_81_, i_77_, (byte) -49), Class30.method274(i_81_, i_78_, (byte) -49), Class30.method274(i_81_, i_79_, (byte) -6), Class30.method274(i_81_, i_80_, (byte) -24), 0, 0, 0, 0, i_86_, 0);
									} else {
										final int i_87_ = 1 + Class102.aByteArrayArrayArray1296[i_42_][i_56_][i_67_];
										final byte i_88_ = Class49.aByteArrayArrayArray610[i_42_][i_56_][i_67_];
										final FloOverlayType class91_sub20_sub3 = Class6.method107(i_72_ - 1, (short) 16256);
										int i_89_ = 389446429 * class91_sub20_sub3.anInt2240;
										int i_90_;
										int i_91_;
										if (i_89_ >= 0) {
											i_91_ = Class91_Sub20_Sub13_Sub2.anInterface3_2539.method28(i_89_, -1109892825);
											i_90_ = -1;
										} else if (class91_sub20_sub3.anInt2239 * 1782679731 == 16711935) {
											i_90_ = -2;
											i_89_ = -1;
											i_91_ = -2;
										} else {
											i_90_ = Class40.method341(class91_sub20_sub3.anInt2243 * -892271165, -1712989259 * class91_sub20_sub3.anInt2244, class91_sub20_sub3.anInt2253 * 1036355347, (byte) 43);
											final int i_92_ = -892271165 * class91_sub20_sub3.anInt2243 + Class102.anInt1308 * 1936070637 & 0xff;
											int i_93_ = -578612561 * Class102.anInt1297 + 1036355347 * class91_sub20_sub3.anInt2253;
											if (i_93_ < 0) {
												i_93_ = 0;
											} else if (i_93_ > 255) {
												i_93_ = 255;
											}
											i_91_ = Class40.method341(i_92_, class91_sub20_sub3.anInt2244 * -1712989259, i_93_, (byte) 115);
										}
										int i_94_ = 0;
										if (-2 != i_91_) {
											i_94_ = Class91_Sub20_Sub13_Sub2.anIntArray2543[Class103.method1090(i_91_, 96, -265372724)];
										}
										if (-1 != class91_sub20_sub3.anInt2242 * -703034801) {
											final int i_95_ = class91_sub20_sub3.anInt2237 * 1388089775 + Class102.anInt1308 * 1936070637 & 0xff;
											int i_96_ = class91_sub20_sub3.anInt2248 * -567046535 + Class102.anInt1297 * -578612561;
											if (i_96_ < 0) {
												i_96_ = 0;
											} else if (i_96_ > 255) {
												i_96_ = 255;
											}
											i_91_ = Class40.method341(i_95_, 2008762909 * class91_sub20_sub3.anInt2247, i_96_, (byte) 52);
											i_94_ = Class91_Sub20_Sub13_Sub2.anIntArray2543[Class103.method1090(i_91_, 96, -265372724)];
										}
										class39.method296(i_42_, i_56_, i_67_, i_87_, i_88_, i_89_, i_73_, i_74_, i_75_, i_76_, Class30.method274(i_81_, i_77_, (byte) -62), Class30.method274(i_81_, i_78_, (byte) 0), Class30.method274(i_81_, i_79_, (byte) -9), Class30.method274(i_81_, i_80_, (byte) 37), Class103.method1090(i_90_, i_77_, -265372724), Class103.method1090(i_90_, i_78_, -265372724),
												Class103.method1090(i_90_, i_79_, -265372724), Class103.method1090(i_90_, i_80_, -265372724), i_86_, i_94_);
									}
								}
							}
						}
					}
				}
				for (int i_97_ = 1; i_97_ < 103; i_97_++) {
					for (int i_98_ = 1; i_98_ < 103; i_98_++) {
						int i_99_;
						if ((Class102.aByteArrayArrayArray1299[i_42_][i_98_][i_97_] & 0x8) != 0) {
							i_99_ = 0;
						} else if (i_42_ > 0 && (Class102.aByteArrayArrayArray1299[1][i_98_][i_97_] & 0x2) != 0) {
							i_99_ = i_42_ - 1;
						} else {
							i_99_ = i_42_;
						}
						class39.method295(i_42_, i_98_, i_97_, i_99_);
					}
				}
				Class102.aByteArrayArrayArray1295[i_42_] = null;
				Class91_Sub20_Sub6.aByteArrayArrayArray2292[i_42_] = null;
				Class102.aByteArrayArrayArray1296[i_42_] = null;
				Class49.aByteArrayArrayArray610[i_42_] = null;
				Class102.aByteArrayArrayArray1310[i_42_] = null;
			}
			class39.method313(-50, -10, -50);
			for (int i_100_ = 0; i_100_ < 104; i_100_++) {
				for (int i_101_ = 0; i_101_ < 104; i_101_++) {
					if (2 == (Class102.aByteArrayArrayArray1299[1][i_100_][i_101_] & 0x2)) {
						class39.method293(i_100_, i_101_);
					}
				}
			}
			int i_102_ = 1;
			int i_103_ = 2;
			int i_104_ = 4;
			for (int i_105_ = 0; i_105_ < 4; i_105_++) {
				if (i_105_ > 0) {
					i_102_ <<= 3;
					i_103_ <<= 3;
					i_104_ <<= 3;
				}
				for (int i_106_ = 0; i_106_ <= i_105_; i_106_++) {
					for (int i_107_ = 0; i_107_ <= 104; i_107_++) {
						for (int i_108_ = 0; i_108_ <= 104; i_108_++) {
							if ((Class32.anIntArrayArrayArray375[i_106_][i_108_][i_107_] & i_102_) != 0) {
								int i_109_ = i_107_;
								int i_110_ = i_107_;
								int i_111_ = i_106_;
								int i_112_ = i_106_;
								for (/**/; i_109_ > 0; i_109_--) {
									if ((Class32.anIntArrayArrayArray375[i_106_][i_108_][i_109_ - 1] & i_102_) == 0) {
										break;
									}
								}
								for (/**/; i_110_ < 104; i_110_++) {
									if ((Class32.anIntArrayArrayArray375[i_106_][i_108_][i_110_ + 1] & i_102_) == 0) {
										break;
									}
								}
								while_19_: for (/**/; i_111_ > 0; i_111_--) {
									for (int i_113_ = i_109_; i_113_ <= i_110_; i_113_++) {
										if ((Class32.anIntArrayArrayArray375[i_111_ - 1][i_108_][i_113_] & i_102_) == 0) {
											if (i <= -378241568) {
												throw new IllegalStateException();
											}
											break while_19_;
										}
									}
								}
								while_20_: for (/**/; i_112_ < i_105_; i_112_++) {
									for (int i_114_ = i_109_; i_114_ <= i_110_; i_114_++) {
										if ((Class32.anIntArrayArrayArray375[1 + i_112_][i_108_][i_114_] & i_102_) == 0) {
											if (i <= -378241568) {
												throw new IllegalStateException();
											}
											break while_20_;
										}
									}
								}
								final int i_115_ = (i_112_ + 1 - i_111_) * (1 + i_110_ - i_109_);
								if (i_115_ >= 8) {
									final int i_116_ = 240;
									final int i_117_ = Class102.anIntArrayArrayArray1292[i_112_][i_108_][i_109_] - i_116_;
									final int i_118_ = Class102.anIntArrayArrayArray1292[i_111_][i_108_][i_109_];
									Class39.method294(i_105_, 1, 128 * i_108_, 128 * i_108_, i_109_ * 128, 128 + 128 * i_110_, i_117_, i_118_);
									for (int i_119_ = i_111_; i_119_ <= i_112_; i_119_++) {
										for (int i_120_ = i_109_; i_120_ <= i_110_; i_120_++) {
											Class32.anIntArrayArrayArray375[i_119_][i_108_][i_120_] &= i_102_ ^ 0xffffffff;
										}
									}
								}
							}
							if ((Class32.anIntArrayArrayArray375[i_106_][i_108_][i_107_] & i_103_) != 0) {
								int i_121_ = i_108_;
								int i_122_ = i_108_;
								int i_123_ = i_106_;
								int i_124_ = i_106_;
								for (/**/; i_121_ > 0; i_121_--) {
									if ((Class32.anIntArrayArrayArray375[i_106_][i_121_ - 1][i_107_] & i_103_) == 0) {
										break;
									}
									if (i <= -378241568) {
										return;
									}
								}
								for (/**/; i_122_ < 104; i_122_++) {
									if (i <= -378241568) {
										return;
									}
									if ((Class32.anIntArrayArrayArray375[i_106_][i_122_ + 1][i_107_] & i_103_) == 0) {
										break;
									}
									if (i <= -378241568) {
										return;
									}
								}
								while_21_: for (/**/; i_123_ > 0; i_123_--) {
									for (int i_125_ = i_121_; i_125_ <= i_122_; i_125_++) {
										if ((Class32.anIntArrayArrayArray375[i_123_ - 1][i_125_][i_107_] & i_103_) == 0) {
											break while_21_;
										}
									}
								}
								while_22_: for (/**/; i_124_ < i_105_; i_124_++) {
									if (i <= -378241568) {
										return;
									}
									for (int i_126_ = i_121_; i_126_ <= i_122_; i_126_++) {
										if ((Class32.anIntArrayArrayArray375[1 + i_124_][i_126_][i_107_] & i_103_) == 0) {
											if (i <= -378241568) {
												throw new IllegalStateException();
											}
											break while_22_;
										}
									}
								}
								final int i_127_ = (1 + i_124_ - i_123_) * (1 + i_122_ - i_121_);
								if (i_127_ >= 8) {
									final int i_128_ = 240;
									final int i_129_ = Class102.anIntArrayArrayArray1292[i_124_][i_121_][i_107_] - i_128_;
									final int i_130_ = Class102.anIntArrayArrayArray1292[i_123_][i_121_][i_107_];
									Class39.method294(i_105_, 2, 128 * i_121_, 128 + 128 * i_122_, 128 * i_107_, 128 * i_107_, i_129_, i_130_);
									for (int i_131_ = i_123_; i_131_ <= i_124_; i_131_++) {
										for (int i_132_ = i_121_; i_132_ <= i_122_; i_132_++) {
											if (i <= -378241568) {
												return;
											}
											Class32.anIntArrayArrayArray375[i_131_][i_132_][i_107_] &= i_103_ ^ 0xffffffff;
										}
									}
								}
							}
							if ((Class32.anIntArrayArrayArray375[i_106_][i_108_][i_107_] & i_104_) != 0) {
								int i_133_ = i_108_;
								int i_134_ = i_108_;
								int i_135_ = i_107_;
								int i_136_ = i_107_;
								for (/**/; i_135_ > 0; i_135_--) {
									if ((Class32.anIntArrayArrayArray375[i_106_][i_108_][i_135_ - 1] & i_104_) == 0) {
										break;
									}
								}
								for (/**/; i_136_ < 104; i_136_++) {
									if ((Class32.anIntArrayArrayArray375[i_106_][i_108_][i_136_ + 1] & i_104_) == 0) {
										break;
									}
									if (i <= -378241568) {
										return;
									}
								}
								while_23_: for (/**/; i_133_ > 0; i_133_--) {
									for (int i_137_ = i_135_; i_137_ <= i_136_; i_137_++) {
										if ((Class32.anIntArrayArrayArray375[i_106_][i_133_ - 1][i_137_] & i_104_) == 0) {
											break while_23_;
										}
									}
								}
								while_24_: for (/**/; i_134_ < 104; i_134_++) {
									for (int i_138_ = i_135_; i_138_ <= i_136_; i_138_++) {
										if (i <= -378241568) {
											return;
										}
										if ((Class32.anIntArrayArrayArray375[i_106_][1 + i_134_][i_138_] & i_104_) == 0) {
											break while_24_;
										}
									}
								}
								if ((i_134_ - i_133_ + 1) * (1 + i_136_ - i_135_) >= 4) {
									final int i_139_ = Class102.anIntArrayArrayArray1292[i_106_][i_133_][i_135_];
									Class39.method294(i_105_, 4, 128 * i_133_, i_134_ * 128 + 128, 128 * i_135_, i_136_ * 128 + 128, i_139_, i_139_);
									for (int i_140_ = i_133_; i_140_ <= i_134_; i_140_++) {
										for (int i_141_ = i_135_; i_141_ <= i_136_; i_141_++) {
											Class32.anIntArrayArrayArray375[i_106_][i_140_][i_141_] &= i_104_ ^ 0xffffffff;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (final RuntimeException var43) {
			throw Class102.method1086(var43, "o.l()");
		}
	}

	static void method1024(final int i, final int i_142_) {
		try {
			if (-3 == i) {
				Class4.method99(Class75.aString883, Class75.aString884, Class75.aString1072, -1320456830);
			} else if (-2 == i) {
				Class4.method99(Class75.aString886, Class75.aString887, Class75.aString1039, -1297272126);
			} else if (-1 == i) {
				Class4.method99(Class75.aString889, Class75.aString986, Class75.aString891, -366355986);
			} else if (3 == i) {
				Class4.method99(Class75.aString892, Class75.aString921, Class75.aString894, 1468580556);
			} else if (4 == i) {
				Class4.method99(Class75.aString993, Class75.aString896, Class75.aString897, -1101814726);
			} else if (5 == i) {
				Class4.method99(Class75.aString863, Class75.aString943, Class75.aString900, 563520556);
			} else if (i == 6) {
				Class4.method99(Class75.aString901, Class75.aString902, Class75.aString1010, 1295621166);
			} else if (7 == i) {
				Class4.method99(Class75.aString904, Class75.aString905, Class75.aString906, -1372797638);
			} else if (8 == i) {
				Class4.method99(Class75.aString945, Class75.aString908, Class75.aString909, -50357942);
			} else if (i == 9) {
				Class4.method99(Class75.aString910, Class75.aString1044, Class75.aString912, -867163370);
			} else if (10 == i) {
				Class4.method99(Class75.aString970, Class75.aString1036, Class75.aString915, -1278792081);
			} else if (11 == i) {
				Class4.method99(Class75.aString1040, Class75.aString917, Class75.aString1047, 2075369252);
			} else if (i == 12) {
				Class4.method99(Class75.aString1002, Class75.aString1042, Class75.aString1021, 579300397);
			} else if (i == 13) {
				Class4.method99(Class75.aString922, Class75.aString923, Class75.aString924, -155505491);
			} else if (14 == i) {
				Class4.method99(Class75.aString925, Class75.aString926, Class75.aString927, 1360303806);
			} else if (i == 16) {
				Class4.method99(Class75.aString898, Class75.aString1030, Class75.aString930, 1946086430);
			} else if (17 == i) {
				Class4.method99(Class75.aString931, Class75.aString858, Class75.aString933, 1208038461);
			} else if (18 == i) {
				Class4.method99(Class75.aString934, Class75.aString935, Class75.aString936, 1010293669);
			} else if (19 == i) {
				Class4.method99(Class75.aString937, Class75.aString1056, Class75.aString939, 932991823);
			} else if (20 == i) {
				Class4.method99(Class75.aString940, Class75.aString941, Class75.aString942, -691851267);
			} else if (i == 22) {
				Class4.method99(Class75.aString911, Class75.aString1028, Class75.aString849, 162353192);
			} else if (23 == i) {
				Class4.method99(Class75.aString946, Class75.aString947, Class75.aString868, -1349809574);
			} else if (24 == i) {
				Class4.method99(Class75.aString949, Class75.aString1043, Class75.aString951, 458938197);
			} else if (i == 25) {
				Class4.method99(Class75.aString952, Class75.aString938, Class75.aString980, 1990747669);
			} else if (26 == i) {
				Class4.method99(Class75.aString955, Class75.aString956, Class75.aString1046, -1489824990);
			} else if (27 == i) {
				Class4.method99(Class75.aString958, Class75.aString919, Class75.aString954, -1511337639);
			} else if (i == 31) {
				Class4.method99(Class75.aString967, Class75.aString968, Class75.aString969, 1403488236);
			} else if (i == 32) {
				Class4.method99(Class75.aString1014, Class75.aString971, Class75.aString972, -187560012);
			} else if (i == 37) {
				Class4.method99(Class75.aString853, Class75.aString1051, Class75.aString1001, 1980736113);
			} else if (38 == i) {
				Class4.method99(Class75.aString1032, Class75.aString977, Class75.aString973, 1129546678);
			} else if (55 == i) {
				Class4.method99(Class75.aString979, Class75.aString944, Class75.aString981, 824831789);
			} else {
				Class4.method99(Class75.aString899, Class75.aString983, Class75.aString890, -841343811);
			}
			Class91_Sub20_Sub14_Sub1_Sub2.method939(10, -1668383515);
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "o.j()");
		}
	}

	Class91_Sub20_Sub14_Sub7() {
		/* empty */
	}
}
