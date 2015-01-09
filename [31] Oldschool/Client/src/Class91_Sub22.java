/* Class91_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class91_Sub22 extends Class91 {
	static Class91_Sub18 aClass91_Sub18_2104;
	int[] anIntArray2105;
	int[] anIntArray2106;
	static long aLong2107;
	static Class83 aClass83_2108 = new Class83(32);
	static Class91_Sub2_Sub2 aClass91_Sub2_Sub2_2109;
	public static Class25 aClass25_2110;
	static int anInt2111;
	static final int anInt2112 = 16;

	static void method1038(final int i) {
		do {
			try {
				try {
					final File file = new File(Class45.aString1436, "random.dat");
					if (file.exists()) {
						Class35.aClass4_411 = new Class4(new Class2(file, "rw", 25L), 24, 0);
					} else {
						while_10_: for (int i_0_ = 0; i_0_ < Class7.aStringArray103.length; i_0_++) {
							for (int i_1_ = 0; i_1_ < Class108.aStringArray1402.length; i_1_++) {
								final File file_2_ = new File(new StringBuilder(Class108.aStringArray1402[i_1_]).append(Class7.aStringArray103[i_0_]).append(File.separatorChar).append("random.dat").toString());
								if (file_2_.exists()) {
									Class35.aClass4_411 = new Class4(new Class2(file_2_, "rw", 25L), 24, 0);
									break while_10_;
								}
							}
						}
					}
					if (Class35.aClass4_411 == null) {
						final RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
						final int i_3_ = randomaccessfile.read();
						randomaccessfile.seek(0L);
						randomaccessfile.write(i_3_);
						randomaccessfile.seek(0L);
						randomaccessfile.close();
						Class35.aClass4_411 = new Class4(new Class2(file, "rw", 25L), 24, 0);
					}
				} catch (final IOException ioexception) {
					break;
				}
				break;
			} catch (final RuntimeException var6) {
				throw Class102.method1086(var6, "j.t()");
			}
		} while (false);
	}

	static void method1039(final Applet_Sub1 applet_sub1, final byte i) {
		try {
			if (Class101.aBoolean1283) {
				Class7.method150(applet_sub1, -1735133112);
			} else {
				if (1 == Class12.anInt172 * -1261190415) {
					if (i != 0) {
						return;
					}
					if (-1084967827 * Class12.anInt180 >= 715 && -956533215 * Class12.anInt167 >= 453) {
						Class91_Sub20_Sub14_Sub4.aClass108_2769.aBoolean1404 = !Class91_Sub20_Sub14_Sub4.aClass108_2769.aBoolean1404;
						Class105.method1096(-556284484);
						if (!Class91_Sub20_Sub14_Sub4.aClass108_2769.aBoolean1404) {
							if (i != 0) {
								throw new IllegalStateException();
							}
							Class91_Sub20_Sub14_Sub1_Sub1.method931(Class91_Sub20_Sub2.aClass63_Sub1_2232, "scape main", "", 255, false, (byte) 10);
						} else {
							Class64.aClass91_Sub2_Sub4_785.method591(-2040698710);
							Class64.anInt781 = -515714225;
							Class64.aClass63_786 = null;
						}
					}
				}
				if (-1935794829 * client.anInt1599 != 5) {
					Class101.anInt1269 += -1318074475;
					if (-1935794829 * client.anInt1599 == 10) {
						if (client.anInt1446 * -718429373 == 0) {
							if (Class12.anInt172 * -1261190415 == 1) {
								if (Class12.anInt180 * -1084967827 >= 5) {
									if (i != 0) {
										throw new IllegalStateException();
									}
									if (Class12.anInt180 * -1084967827 <= 105) {
										if (i != 0) {
											throw new IllegalStateException();
										}
										if (Class12.anInt167 * -956533215 >= 463 && -956533215 * Class12.anInt167 <= 498) {
											if (i != 0) {
												throw new IllegalStateException();
											}
											Class91_Sub20_Sub9.method798(-1341232614);
											return;
										}
									}
								}
							}
							if (Class91_Sub20_Sub14_Sub4.aClass7_2785 != null) {
								Class91_Sub20_Sub9.method798(-319256038);
							}
						}
						final int i_8_ = -1261190415 * Class12.anInt172;
						final int i_9_ = Class12.anInt180 * -1084967827;
						final int i_10_ = -956533215 * Class12.anInt167;
						if (Class101.anInt1290 * -960240051 == 0) {
							int i_11_ = 302;
							final int i_12_ = 291;
							if (1 == i_8_ && i_9_ >= i_11_ - 75) {
								if (i != 0) {
									return;
								}
								if (i_9_ <= 75 + i_11_) {
									if (i != 0) {
										throw new IllegalStateException();
									}
									if (i_10_ >= i_12_ - 20 && i_10_ <= 20 + i_12_) {
										if (i != 0) {
											throw new IllegalStateException();
										}
										Class101.anInt1290 = -1308670065;
										Class101.anInt1279 = 0;
									}
								}
							}
							i_11_ = 462;
							if (i_8_ == 1) {
								if (i != 0) {
									throw new IllegalStateException();
								}
								if (i_9_ >= i_11_ - 75) {
									if (i != 0) {
										throw new IllegalStateException();
									}
									if (i_9_ <= i_11_ + 75 && i_10_ >= i_12_ - 20 && i_10_ <= i_12_ + 20) {
										Class101.aString1255 = Class75.aString867;
										Class101.aString1275 = Class75.aString1025;
										Class101.aString1286 = Class75.aString914;
										Class101.anInt1290 = -872446710;
										Class101.anInt1279 = 0;
									}
								}
							}
						} else if (2 == Class101.anInt1290 * -960240051) {
							final int i_13_ = 231;
							int i_14_ = i_13_ + 30;
							if (i_8_ == 1 && i_10_ >= i_14_ - 15 && i_10_ < i_14_) {
								Class101.anInt1279 = 0;
							}
							i_14_ += 15;
							if (i_8_ == 1 && i_10_ >= i_14_ - 15 && i_10_ < i_14_) {
								Class101.anInt1279 = 1746106105;
							}
							i_14_ += 15;
							int i_15_ = 302;
							if (1 == i_8_) {
								if (i != 0) {
									throw new IllegalStateException();
								}
								if (i_9_ >= i_15_ - 75 && i_9_ <= i_15_ + 75) {
									if (i != 0) {
										throw new IllegalStateException();
									}
									if (i_10_ >= 301 && i_10_ <= 341) {
										Class101.aString1277 = Class101.aString1277.trim();
										if (Class101.aString1277.length() == 0) {
											if (i == 0) {
												Class4.method99(Class75.aString961, Class75.aString962, Class75.aString963, 1131934306);
											}
										} else {
											if (Class101.aString1278.length() == 0) {
												if (i != 0) {
													throw new IllegalStateException();
												}
												Class4.method99(Class75.aString1020, Class75.aString893, Class75.aString966, -1006941404);
											} else {
												Class4.method99(Class75.aString1054, Class75.aString1055, Class75.aString1015, 1446486119);
												Class91_Sub20_Sub14_Sub1_Sub2.method939(20, -1902098397);
												return;
											}
											return;
										}
										return;
									}
								}
							}
							i_15_ = 462;
							if (i_8_ == 1) {
								if (i != 0) {
									throw new IllegalStateException();
								}
								if (i_9_ >= i_15_ - 75) {
									if (i != 0) {
										throw new IllegalStateException();
									}
									if (i_9_ <= i_15_ + 75) {
										if (i != 0) {
											return;
										}
										if (i_10_ >= 301) {
											if (i != 0) {
												throw new IllegalStateException();
											}
											if (i_10_ <= 341) {
												Class101.anInt1290 = 0;
												Class101.aString1277 = "";
												Class101.aString1278 = "";
											}
										}
									}
								}
							}
							while (client.method67(-1772010180)) {
								boolean bool = false;
								for (int i_17_ = 0; i_17_ < Class101.aString1265.length(); i_17_++) {
									if (i != 0) {
										throw new IllegalStateException();
									}
									if (Class48.aChar607 == Class101.aString1265.charAt(i_17_)) {
										bool = true;
										break;
									}
								}
								if (Class101.anInt1279 * -289313975 == 0) {
									if (i != 0) {
										break;
									}
									if (85 == Class91_Sub20_Sub4.anInt2262 * 1121073135 && Class101.aString1277.length() > 0) {
										if (i != 0) {
											throw new IllegalStateException();
										}
										Class101.aString1277 = Class101.aString1277.substring(0, Class101.aString1277.length() - 1);
									}
									do {
										if (84 != 1121073135 * Class91_Sub20_Sub4.anInt2262) {
											if (1121073135 * Class91_Sub20_Sub4.anInt2262 != 80) {
												break;
											}
											if (i != 0) {
												throw new IllegalStateException();
											}
										}
										Class101.anInt1279 = 1746106105;
									} while (false);
									if (bool && Class101.aString1277.length() < 320) {
										Class101.aString1277 = new StringBuilder(Class101.aString1277).append(Class48.aChar607).toString();
									}
								} else if (Class101.anInt1279 * -289313975 == 1) {
									if (1121073135 * Class91_Sub20_Sub4.anInt2262 == 85) {
										if (i != 0) {
											throw new IllegalStateException();
										}
										if (Class101.aString1278.length() > 0) {
											if (i != 0) {
												throw new IllegalStateException();
											}
											Class101.aString1278 = Class101.aString1278.substring(0, Class101.aString1278.length() - 1);
										}
									}
									do {
										if (Class91_Sub20_Sub4.anInt2262 * 1121073135 != 84) {
											if (Class91_Sub20_Sub4.anInt2262 * 1121073135 != 80) {
												break;
											}
											if (i != 0) {
												return;
											}
										}
										Class101.anInt1279 = 0;
									} while (false);
									if (84 == 1121073135 * Class91_Sub20_Sub4.anInt2262) {
										Class101.aString1277 = Class101.aString1277.trim();
										if (Class101.aString1277.length() == 0) {
											if (i == 0) {
												Class4.method99(Class75.aString961, Class75.aString962, Class75.aString963, -38718317);
											}
										} else {
											if (Class101.aString1278.length() == 0) {
												if (i != 0) {
													throw new IllegalStateException();
												}
												Class4.method99(Class75.aString1020, Class75.aString893, Class75.aString966, 653582372);
											} else {
												Class4.method99(Class75.aString1054, Class75.aString1055, Class75.aString1015, -641777047);
												Class91_Sub20_Sub14_Sub1_Sub2.method939(20, -711120692);
												break;
											}
											break;
										}
										break;
									}
									if (bool && Class101.aString1278.length() < 20) {
										if (i != 0) {
											break;
										}
										Class101.aString1278 = new StringBuilder(Class101.aString1278).append(Class48.aChar607).toString();
									}
								}
							}
						} else if (Class101.anInt1290 * -960240051 == 3) {
							final int i_18_ = 382;
							final int i_19_ = 321;
							if (1 == i_8_) {
								if (i == 0) {
									if (i_9_ >= i_18_ - 75) {
										if (i == 0) {
											if (i_9_ <= i_18_ + 75 && i_10_ >= i_19_ - 20) {
												if (i != 0) {
													throw new IllegalStateException();
												}
												if (i_10_ <= 20 + i_19_) {
													if (i != 0) {
														throw new IllegalStateException();
													}
													Class101.anInt1290 = 0;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (final RuntimeException var10) {
			throw Class102.method1086(var10, "j.i()");
		}
	}

	static final void method1040(final long l) {
		do {
			try {
				try {
					Thread.sleep(l);
				} catch (final InterruptedException interruptedexception) {
					break;
				}
				break;
			} catch (final RuntimeException var4) {
				throw Class102.method1086(var4, "j.w()");
			}
		} while (false);
	}

	Class91_Sub22() {
		try {
			this.anIntArray2105 = new int[] { -1 };
			this.anIntArray2106 = new int[1];
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "j.<init>()");
		}
	}

	static final int method1041(final Class91_Sub18 class91_sub18, final int i, final int i_20_) {
		do {
			try {
				if (class91_sub18.anIntArrayArray2065 == null || i >= class91_sub18.anIntArrayArray2065.length) {
					break;
				}
				try {
					final int[] is = class91_sub18.anIntArrayArray2065[i];
					int i_21_ = 0;
					int i_22_ = 0;
					int i_23_ = 0;
					for (;;) {
						final int i_24_ = is[i_22_++];
						int i_25_ = 0;
						int i_26_ = 0;
						if (i_24_ == 0) {
							return i_21_;
						}
						if (1 == i_24_) {
							i_25_ = client.anIntArray1580[is[i_22_++]];
						}
						if (i_24_ == 2) {
							i_25_ = client.anIntArray1581[is[i_22_++]];
						}
						if (3 == i_24_) {
							i_25_ = client.anIntArray1488[is[i_22_++]];
						}
						if (i_24_ == 4) {
							int i_27_ = is[i_22_++] << 16;
							i_27_ += is[i_22_++];
							final Class91_Sub18 class91_sub18_28_ = Class61.method394(i_27_, -631047529);
							final int i_29_ = is[i_22_++];
							if (-1 != i_29_ && (!Class86_Sub1.method490(i_29_, 234554293).aBoolean2388 || client.aBoolean1612)) {
								for (int i_30_ = 0; i_30_ < class91_sub18_28_.anIntArray2030.length; i_30_++) {
									if (i_29_ + 1 == class91_sub18_28_.anIntArray2030[i_30_]) {
										i_25_ += class91_sub18_28_.anIntArray1984[i_30_];
									}
								}
							}
						}
						if (i_24_ == 5) {
							i_25_ = Class93.anIntArray1199[is[i_22_++]];
						}
						if (6 == i_24_) {
							i_25_ = Class46.anIntArray586[client.anIntArray1581[is[i_22_++]] - 1];
						}
						if (i_24_ == 7) {
							i_25_ = Class93.anIntArray1199[is[i_22_++]] * 100 / 46875;
						}
						if (8 == i_24_) {
							i_25_ = Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2843 * -2033628249;
						}
						if (9 == i_24_) {
							for (int i_31_ = 0; i_31_ < 25; i_31_++) {
								if (Class46.aBooleanArray587[i_31_]) {
									i_25_ += client.anIntArray1581[i_31_];
								}
							}
						}
						if (i_24_ == 10) {
							int i_32_ = is[i_22_++] << 16;
							i_32_ += is[i_22_++];
							final Class91_Sub18 class91_sub18_33_ = Class61.method394(i_32_, -631047529);
							final int i_34_ = is[i_22_++];
							if (i_34_ != -1 && (!Class86_Sub1.method490(i_34_, 234554293).aBoolean2388 || client.aBoolean1612)) {
								for (int i_35_ = 0; i_35_ < class91_sub18_33_.anIntArray2030.length; i_35_++) {
									if (1 + i_34_ == class91_sub18_33_.anIntArray2030[i_35_]) {
										i_25_ = 999999999;
										break;
									}
								}
							}
						}
						if (i_24_ == 11) {
							i_25_ = client.anInt1607 * -927620125;
						}
						if (12 == i_24_) {
							i_25_ = 1710859793 * client.anInt1517;
						}
						if (13 == i_24_) {
							final int i_36_ = Class93.anIntArray1199[is[i_22_++]];
							final int i_37_ = is[i_22_++];
							i_25_ = (i_36_ & 1 << i_37_) != 0 ? 1 : 0;
						}
						if (i_24_ == 14) {
							final int i_38_ = is[i_22_++];
							i_25_ = Class75.method453(i_38_, 81920);
						}
						if (15 == i_24_) {
							i_26_ = 1;
						}
						if (i_24_ == 16) {
							i_26_ = 2;
						}
						if (i_24_ == 17) {
							i_26_ = 3;
						}
						if (18 == i_24_) {
							i_25_ = (107578049 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 >> 7) + Class40.anInt541 * 1885886277;
						}
						if (i_24_ == 19) {
							i_25_ = (-668540675 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 >> 7) + Class91_Sub20_Sub15.anInt2497 * 1838527067;
						}
						if (i_24_ == 20) {
							i_25_ = is[i_22_++];
						}
						if (i_26_ == 0) {
							if (i_23_ == 0) {
								i_21_ += i_25_;
							}
							if (1 == i_23_) {
								i_21_ -= i_25_;
							}
							if (2 == i_23_ && i_25_ != 0) {
								i_21_ /= i_25_;
							}
							if (3 == i_23_) {
								i_21_ *= i_25_;
							}
							i_23_ = 0;
						} else {
							i_23_ = i_26_;
						}
					}
				} catch (final Exception exception) {
					/* empty */
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "j.cg()");
			}
			return -1;
		} while (false);
		return -2;
	}

	static boolean method1042(final String string, final int i) {
		do {
			try {
				if (string == null) {
					return false;
				}
				final String string_39_ = Class91_Sub20_Sub14_Sub4.method1002(string, Class41.aClass98_551, (byte) -24);
				for (int i_40_ = 0; i_40_ < -1596316121 * client.anInt1695; i_40_++) {
					if (string_39_.equalsIgnoreCase(Class91_Sub20_Sub14_Sub4.method1002(client.aClass100Array1491[i_40_].aString1251, Class41.aClass98_551, (byte) -29))) {
						return true;
					}
				}
				if (!string.equalsIgnoreCase(Class91_Sub20_Sub14_Sub4.method1002(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.aString2841, Class41.aClass98_551, (byte) 26))) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "j.ce()");
			}
			return true;
		} while (false);
		return false;
	}

	static final void method1043(final Class91_Sub20_Sub14_Sub1 class91_sub20_sub14_sub1, final int i) {
		try {
			class91_sub20_sub14_sub1.aBoolean2585 = false;
			if (-1 != 631774363 * class91_sub20_sub14_sub1.anInt2634) {
				final Class91_Sub20_Sub5 class91_sub20_sub5 = Class7.method152(631774363 * class91_sub20_sub14_sub1.anInt2634, -666195932);
				if (class91_sub20_sub5 != null && class91_sub20_sub5.anIntArray2268 != null) {
					class91_sub20_sub14_sub1.anInt2610 += 1724248983;
					if (class91_sub20_sub14_sub1.anInt2625 * 536968869 < class91_sub20_sub5.anIntArray2268.length && class91_sub20_sub14_sub1.anInt2610 * -648823769 > class91_sub20_sub5.anIntArray2270[class91_sub20_sub14_sub1.anInt2625 * 536968869]) {
						class91_sub20_sub14_sub1.anInt2610 = 1724248983;
						class91_sub20_sub14_sub1.anInt2625 += -1807599315;
						Class104.method1093(class91_sub20_sub5, 536968869 * class91_sub20_sub14_sub1.anInt2625, 107578049 * class91_sub20_sub14_sub1.anInt2589, -668540675 * class91_sub20_sub14_sub1.anInt2583, -1949545153);
					}
					if (class91_sub20_sub14_sub1.anInt2625 * 536968869 >= class91_sub20_sub5.anIntArray2268.length) {
						class91_sub20_sub14_sub1.anInt2610 = 0;
						class91_sub20_sub14_sub1.anInt2625 = 0;
						Class104.method1093(class91_sub20_sub5, class91_sub20_sub14_sub1.anInt2625 * 536968869, class91_sub20_sub14_sub1.anInt2589 * 107578049, -668540675 * class91_sub20_sub14_sub1.anInt2583, -1949545153);
					}
				} else {
					class91_sub20_sub14_sub1.anInt2634 = 1946916461;
				}
			}
			if (493699505 * class91_sub20_sub14_sub1.anInt2616 != -1 && client.anInt1449 * 2026135825 >= class91_sub20_sub14_sub1.anInt2619 * -592754405) {
				if (-1733231575 * class91_sub20_sub14_sub1.anInt2635 < 0) {
					class91_sub20_sub14_sub1.anInt2635 = 0;
				}
				final int i_41_ = NpcType.method813(class91_sub20_sub14_sub1.anInt2616 * 493699505, (short) -9969).anInt2466 * -1585626451;
				if (-1 != i_41_) {
					final Class91_Sub20_Sub5 class91_sub20_sub5 = Class7.method152(i_41_, 856578668);
					if (class91_sub20_sub5 != null && class91_sub20_sub5.anIntArray2268 != null) {
						class91_sub20_sub14_sub1.anInt2618 += -1729478611;
						if (class91_sub20_sub14_sub1.anInt2635 * -1733231575 < class91_sub20_sub5.anIntArray2268.length && class91_sub20_sub14_sub1.anInt2618 * -74838107 > class91_sub20_sub5.anIntArray2270[-1733231575 * class91_sub20_sub14_sub1.anInt2635]) {
							class91_sub20_sub14_sub1.anInt2618 = -1729478611;
							class91_sub20_sub14_sub1.anInt2635 += -68657127;
							Class104.method1093(class91_sub20_sub5, class91_sub20_sub14_sub1.anInt2635 * -1733231575, class91_sub20_sub14_sub1.anInt2589 * 107578049, class91_sub20_sub14_sub1.anInt2583 * -668540675, -1949545153);
						}
						if (-1733231575 * class91_sub20_sub14_sub1.anInt2635 >= class91_sub20_sub5.anIntArray2268.length && (class91_sub20_sub14_sub1.anInt2635 * -1733231575 < 0 || -1733231575 * class91_sub20_sub14_sub1.anInt2635 >= class91_sub20_sub5.anIntArray2268.length)) {
							class91_sub20_sub14_sub1.anInt2616 = -721446737;
						}
					} else {
						class91_sub20_sub14_sub1.anInt2616 = -721446737;
					}
				} else {
					class91_sub20_sub14_sub1.anInt2616 = -721446737;
				}
			}
			if (-815127219 * class91_sub20_sub14_sub1.anInt2611 != -1 && class91_sub20_sub14_sub1.anInt2614 * 1011042493 <= 1) {
				final Class91_Sub20_Sub5 class91_sub20_sub5 = Class7.method152(-815127219 * class91_sub20_sub14_sub1.anInt2611, 65084960);
				if (class91_sub20_sub5.anInt2279 * 1217369845 == 1 && -1574481227 * class91_sub20_sub14_sub1.anInt2633 > 0 && class91_sub20_sub14_sub1.anInt2617 * -1062436003 <= client.anInt1449 * 2026135825 && class91_sub20_sub14_sub1.anInt2626 * 218747707 < client.anInt1449 * 2026135825) {
					class91_sub20_sub14_sub1.anInt2614 = -1381698923;
					return;
				}
			}
			if (class91_sub20_sub14_sub1.anInt2611 * -815127219 != -1 && 1011042493 * class91_sub20_sub14_sub1.anInt2614 == 0) {
				final Class91_Sub20_Sub5 class91_sub20_sub5 = Class7.method152(class91_sub20_sub14_sub1.anInt2611 * -815127219, -1957540096);
				if (class91_sub20_sub5 != null && class91_sub20_sub5.anIntArray2268 != null) {
					class91_sub20_sub14_sub1.anInt2613 += -46506809;
					if (-866849195 * class91_sub20_sub14_sub1.anInt2612 < class91_sub20_sub5.anIntArray2268.length && 1370989815 * class91_sub20_sub14_sub1.anInt2613 > class91_sub20_sub5.anIntArray2270[-866849195 * class91_sub20_sub14_sub1.anInt2612]) {
						class91_sub20_sub14_sub1.anInt2613 = -46506809;
						class91_sub20_sub14_sub1.anInt2612 += 421043965;
						Class104.method1093(class91_sub20_sub5, -866849195 * class91_sub20_sub14_sub1.anInt2612, class91_sub20_sub14_sub1.anInt2589 * 107578049, class91_sub20_sub14_sub1.anInt2583 * -668540675, -1949545153);
					}
					do {
						if (class91_sub20_sub14_sub1.anInt2612 * -866849195 >= class91_sub20_sub5.anIntArray2268.length) {
							class91_sub20_sub14_sub1.anInt2612 -= -1970827665 * class91_sub20_sub5.anInt2277;
							class91_sub20_sub14_sub1.anInt2582 += -473076653;
							if (class91_sub20_sub14_sub1.anInt2582 * -617105445 >= class91_sub20_sub5.anInt2278 * -1246454147) {
								class91_sub20_sub14_sub1.anInt2611 = -1205443461;
							} else {
								if (-866849195 * class91_sub20_sub14_sub1.anInt2612 >= 0) {
									if (class91_sub20_sub14_sub1.anInt2612 * -866849195 < class91_sub20_sub5.anIntArray2268.length) {
										Class104.method1093(class91_sub20_sub5, -866849195 * class91_sub20_sub14_sub1.anInt2612, class91_sub20_sub14_sub1.anInt2589 * 107578049, -668540675 * class91_sub20_sub14_sub1.anInt2583, -1949545153);
										break;
									}
									if (i <= -2033571943) {
										return;
									}
								}
								class91_sub20_sub14_sub1.anInt2611 = -1205443461;
							}
						}
					} while (false);
					class91_sub20_sub14_sub1.aBoolean2585 = class91_sub20_sub5.aBoolean2282;
				} else {
					class91_sub20_sub14_sub1.anInt2611 = -1205443461;
				}
			}
			if (class91_sub20_sub14_sub1.anInt2614 * 1011042493 > 0) {
				class91_sub20_sub14_sub1.anInt2614 -= -1381698923;
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "j.ax()");
		}
	}
}
