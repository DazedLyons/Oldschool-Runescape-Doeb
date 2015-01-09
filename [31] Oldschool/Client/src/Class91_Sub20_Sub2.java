/* Class91_Sub20_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.RandomAccessFile;

public class Class91_Sub20_Sub2 extends Class91_Sub20 {
	static final int anInt2229 = 286331153;
	public static final int anInt2230 = 100;
	public int anInt2231;
	static Class63_Sub1 aClass63_Sub1_2232;
	static final int anInt2233 = 22;
	static Js5 aClass63_2234;
	static Class91_Sub20_Sub13_Sub4_Sub1 aClass91_Sub20_Sub13_Sub4_Sub1_2235;
	static Class96 aClass96_2236 = new Class96(64);

	static final void method735(final Class91_Sub18[] class91_sub18s, final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final byte i_6_) {
		try {
			int i_7_ = 0;
			for (/**/; i_7_ < class91_sub18s.length; i_7_++) {
				final Class91_Sub18 class91_sub18 = class91_sub18s[i_7_];
				if (class91_sub18 == null) {
					if (i_6_ <= 3) {
						throw new IllegalStateException();
					}
				} else if ((!class91_sub18.aBoolean1968 || class91_sub18.anInt2057 * 633275603 == 0 || class91_sub18.aBoolean2036 || Class17.method182(class91_sub18, 1055393230) != 0 || class91_sub18 == client.aClass91_Sub18_1699) && 777859439 * class91_sub18.anInt1980 == i) {
					if (class91_sub18.aBoolean1968 && Class63_Sub1.method432(class91_sub18, (byte) -107)) {
						if (i_6_ <= 3) {
							throw new IllegalStateException();
						}
					} else {
						final int i_8_ = i_4_ + -1211939919 * class91_sub18.anInt1974;
						final int i_9_ = -529547265 * class91_sub18.anInt1972 + i_5_;
						int i_10_;
						int i_11_;
						int i_12_;
						int i_13_;
						if (633275603 * class91_sub18.anInt2057 == 2) {
							i_10_ = i_0_;
							i_11_ = i_1_;
							i_12_ = i_2_;
							i_13_ = i_3_;
						} else if (9 == class91_sub18.anInt2057 * 633275603) {
							int i_14_ = i_8_;
							int i_15_ = i_9_;
							int i_16_ = i_8_ + class91_sub18.anInt1978 * -538789309;
							int i_17_ = i_9_ + class91_sub18.anInt1979 * -1807498407;
							if (i_16_ < i_8_) {
								i_14_ = i_16_;
								i_16_ = i_8_;
							}
							if (i_17_ < i_9_) {
								i_15_ = i_17_;
								i_17_ = i_9_;
							}
							i_16_++;
							i_17_++;
							i_10_ = i_14_ > i_0_ ? i_14_ : i_0_;
							int i_18_;
							if (i_15_ > i_1_) {
								i_18_ = i_15_;
							} else {
								i_18_ = i_1_;
							}
							i_11_ = i_18_;
							i_12_ = i_16_ < i_2_ ? i_16_ : i_2_;
							i_13_ = i_17_ < i_3_ ? i_17_ : i_3_;
						} else {
							final int i_19_ = -538789309 * class91_sub18.anInt1978 + i_8_;
							final int i_20_ = i_9_ + class91_sub18.anInt1979 * -1807498407;
							i_10_ = i_8_ > i_0_ ? i_8_ : i_0_;
							int i_21_;
							if (i_9_ > i_1_) {
								i_21_ = i_9_;
							} else {
								i_21_ = i_1_;
							}
							i_11_ = i_21_;
							i_12_ = i_19_ < i_2_ ? i_19_ : i_2_;
							i_13_ = i_20_ < i_3_ ? i_20_ : i_3_;
						}
						if (class91_sub18 == client.aClass91_Sub18_1461) {
							client.aBoolean1662 = true;
							client.anInt1667 = -1136841785 * i_8_;
							client.anInt1623 = i_9_ * 910329709;
						}
						if (!class91_sub18.aBoolean1968 || i_10_ < i_12_ && i_11_ < i_13_) {
							if (-299916553 * class91_sub18.anInt1973 == 1337) {
								Class28_Sub1.method272(class91_sub18, -1905179897);
							} else if (1338 == -299916553 * class91_sub18.anInt1973) {
								Class91_Sub20_Sub14_Sub5.method1008(i_8_, i_9_, (byte) 84);
							} else {
								if (class91_sub18.anInt2057 * 633275603 == 0) {
									if (!class91_sub18.aBoolean1968 && Class63_Sub1.method432(class91_sub18, (byte) -88) && Class102.aClass91_Sub18_1314 != class91_sub18) {
										if (i_6_ <= 3) {
											throw new IllegalStateException();
										}
										continue;
									}
									method735(class91_sub18s, -1026201747 * class91_sub18.anInt2032, i_10_, i_11_, i_12_, i_13_, i_8_ - class91_sub18.anInt1982 * 1910750647, i_9_ - class91_sub18.anInt2048 * 1916118407, (byte) 57);
									if (class91_sub18.aClass91_Sub18Array2077 != null) {
										method735(class91_sub18.aClass91_Sub18Array2077, -1026201747 * class91_sub18.anInt2032, i_10_, i_11_, i_12_, i_13_, i_8_ - 1910750647 * class91_sub18.anInt1982, i_9_ - 1916118407 * class91_sub18.anInt2048, (byte) 76);
									}
									final Class91_Sub10 class91_sub10 = (Class91_Sub10) client.aClass83_1603.method474(class91_sub18.anInt2032 * -1026201747);
									if (class91_sub10 != null) {
										Class91_Sub20_Sub6.method765(class91_sub10.anInt1865 * 337747539, i_10_, i_11_, i_12_, i_13_, i_8_, i_9_, (byte) -67);
									}
								}
								if (class91_sub18.aBoolean1968) {
									boolean bool;
									if (Class12.anInt173 * -695750341 >= i_10_ && Class12.anInt178 * -855709389 >= i_11_ && -695750341 * Class12.anInt173 < i_12_ && Class12.anInt178 * -855709389 < i_13_) {
										bool = true;
									} else {
										bool = false;
									}
									boolean bool_22_ = false;
									if (443943815 * Class12.anInt171 == 1 && bool) {
										bool_22_ = true;
									}
									boolean bool_23_ = false;
									if (1 == -1261190415 * Class12.anInt172 && -1084967827 * Class12.anInt180 >= i_10_ && Class12.anInt167 * -956533215 >= i_11_ && Class12.anInt180 * -1084967827 < i_12_ && -956533215 * Class12.anInt167 < i_13_) {
										bool_23_ = true;
									}
									if (bool_23_) {
										Class43.method355(class91_sub18, Class12.anInt180 * -1084967827 - i_8_, -956533215 * Class12.anInt167 - i_9_, 1899440456);
									}
									if (client.aClass91_Sub18_1461 != null && client.aClass91_Sub18_1461 != class91_sub18 && bool && Class91_Sub20_Sub9.method796(Class17.method182(class91_sub18, 1010035869), 1056686446)) {
										client.aClass91_Sub18_1617 = class91_sub18;
									}
									if (class91_sub18 == client.aClass91_Sub18_1699) {
										client.aBoolean1618 = true;
										client.anInt1583 = 1445930705 * i_8_;
										client.anInt1620 = 497688269 * i_9_;
									}
									if (class91_sub18.aBoolean2036) {
										if (bool && client.anInt1613 * 197293827 != 0 && class91_sub18.anObjectArray2054 != null) {
											final Class91_Sub21 class91_sub21 = new Class91_Sub21();
											class91_sub21.aClass91_Sub18_2090 = class91_sub18;
											class91_sub21.anInt2096 = 1051511325 * client.anInt1613;
											class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2054;
											client.aClass95_1495.method1058(class91_sub21);
										}
										do {
											if (client.aClass91_Sub18_1461 == null && Class91_Sub20_Sub5.aClass91_Sub18_2267 == null) {
												if (!client.aBoolean1538) {
													break;
												}
												if (i_6_ <= 3) {
													return;
												}
											}
											bool_23_ = false;
											bool_22_ = false;
											bool = false;
										} while (false);
										if (!class91_sub18.aBoolean2079 && bool_23_) {
											class91_sub18.aBoolean2079 = true;
											if (class91_sub18.anObjectArray2038 != null) {
												final Class91_Sub21 class91_sub21 = new Class91_Sub21();
												class91_sub21.aClass91_Sub18_2090 = class91_sub18;
												class91_sub21.anInt2091 = 1047250041 * (-1084967827 * Class12.anInt180 - i_8_);
												class91_sub21.anInt2096 = (-956533215 * Class12.anInt167 - i_9_) * -215949217;
												class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2038;
												client.aClass95_1495.method1058(class91_sub21);
											}
										}
										if (class91_sub18.aBoolean2079 && bool_22_ && class91_sub18.anObjectArray2022 != null) {
											final Class91_Sub21 class91_sub21 = new Class91_Sub21();
											class91_sub21.aClass91_Sub18_2090 = class91_sub18;
											class91_sub21.anInt2091 = (-695750341 * Class12.anInt173 - i_8_) * 1047250041;
											class91_sub21.anInt2096 = (-855709389 * Class12.anInt178 - i_9_) * -215949217;
											class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2022;
											client.aClass95_1495.method1058(class91_sub21);
										}
										if (class91_sub18.aBoolean2079 && !bool_22_) {
											class91_sub18.aBoolean2079 = false;
											if (class91_sub18.anObjectArray2052 != null) {
												final Class91_Sub21 class91_sub21 = new Class91_Sub21();
												class91_sub21.aClass91_Sub18_2090 = class91_sub18;
												class91_sub21.anInt2091 = (-695750341 * Class12.anInt173 - i_8_) * 1047250041;
												class91_sub21.anInt2096 = (Class12.anInt178 * -855709389 - i_9_) * -215949217;
												class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2052;
												client.aClass95_1641.method1058(class91_sub21);
											}
										}
										if (bool_22_ && class91_sub18.anObjectArray2041 != null) {
											final Class91_Sub21 class91_sub21 = new Class91_Sub21();
											class91_sub21.aClass91_Sub18_2090 = class91_sub18;
											class91_sub21.anInt2091 = 1047250041 * (-695750341 * Class12.anInt173 - i_8_);
											class91_sub21.anInt2096 = -215949217 * (-855709389 * Class12.anInt178 - i_9_);
											class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2041;
											client.aClass95_1495.method1058(class91_sub21);
										}
										if (!class91_sub18.aBoolean2078 && bool) {
											class91_sub18.aBoolean2078 = true;
											if (class91_sub18.anObjectArray2042 != null) {
												final Class91_Sub21 class91_sub21 = new Class91_Sub21();
												class91_sub21.aClass91_Sub18_2090 = class91_sub18;
												class91_sub21.anInt2091 = (Class12.anInt173 * -695750341 - i_8_) * 1047250041;
												class91_sub21.anInt2096 = -215949217 * (-855709389 * Class12.anInt178 - i_9_);
												class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2042;
												client.aClass95_1495.method1058(class91_sub21);
											}
										}
										if (class91_sub18.aBoolean2078 && bool && class91_sub18.anObjectArray2043 != null) {
											final Class91_Sub21 class91_sub21 = new Class91_Sub21();
											class91_sub21.aClass91_Sub18_2090 = class91_sub18;
											class91_sub21.anInt2091 = (-695750341 * Class12.anInt173 - i_8_) * 1047250041;
											class91_sub21.anInt2096 = (Class12.anInt178 * -855709389 - i_9_) * -215949217;
											class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2043;
											client.aClass95_1495.method1058(class91_sub21);
										}
										if (class91_sub18.aBoolean2078 && !bool) {
											class91_sub18.aBoolean2078 = false;
											if (class91_sub18.anObjectArray2044 != null) {
												final Class91_Sub21 class91_sub21 = new Class91_Sub21();
												class91_sub21.aClass91_Sub18_2090 = class91_sub18;
												class91_sub21.anInt2091 = 1047250041 * (-695750341 * Class12.anInt173 - i_8_);
												class91_sub21.anInt2096 = -215949217 * (Class12.anInt178 * -855709389 - i_9_);
												class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2044;
												client.aClass95_1641.method1058(class91_sub21);
											}
										}
										if (class91_sub18.anObjectArray2051 != null) {
											final Class91_Sub21 class91_sub21 = new Class91_Sub21();
											class91_sub21.aClass91_Sub18_2090 = class91_sub18;
											class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2051;
											client.aClass95_1704.method1058(class91_sub21);
										}
										if (class91_sub18.anObjectArray2049 != null && 482952695 * client.anInt1627 > class91_sub18.anInt1987 * -194031297) {
											if (class91_sub18.anIntArray2047 != null && client.anInt1627 * 482952695 - -194031297 * class91_sub18.anInt1987 <= 32) {
												while_0_: for (int i_24_ = class91_sub18.anInt1987 * -194031297; i_24_ < client.anInt1627 * 482952695; i_24_++) {
													final int i_25_ = client.anIntArray1626[i_24_ & 0x1f];
													for (int i_26_ = 0; i_26_ < class91_sub18.anIntArray2047.length; i_26_++) {
														if (class91_sub18.anIntArray2047[i_26_] == i_25_) {
															final Class91_Sub21 class91_sub21 = new Class91_Sub21();
															class91_sub21.aClass91_Sub18_2090 = class91_sub18;
															class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2049;
															client.aClass95_1495.method1058(class91_sub21);
															break while_0_;
														}
													}
												}
											} else {
												final Class91_Sub21 class91_sub21 = new Class91_Sub21();
												class91_sub21.aClass91_Sub18_2090 = class91_sub18;
												class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2049;
												client.aClass95_1495.method1058(class91_sub21);
											}
											class91_sub18.anInt1987 = client.anInt1627 * 1836262729;
										}
										if (class91_sub18.anObjectArray2023 != null && client.anInt1629 * -1162219837 > -1641374017 * class91_sub18.anInt2082) {
											if (class91_sub18.anIntArray1998 != null && -1162219837 * client.anInt1629 - -1641374017 * class91_sub18.anInt2082 <= 32) {
												while_1_: for (int i_27_ = class91_sub18.anInt2082 * -1641374017; i_27_ < -1162219837 * client.anInt1629; i_27_++) {
													final int i_28_ = client.anIntArray1537[i_27_ & 0x1f];
													for (int i_29_ = 0; i_29_ < class91_sub18.anIntArray1998.length; i_29_++) {
														if (class91_sub18.anIntArray1998[i_29_] == i_28_) {
															final Class91_Sub21 class91_sub21 = new Class91_Sub21();
															class91_sub21.aClass91_Sub18_2090 = class91_sub18;
															class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2023;
															client.aClass95_1495.method1058(class91_sub21);
															break while_1_;
														}
													}
												}
											} else {
												final Class91_Sub21 class91_sub21 = new Class91_Sub21();
												class91_sub21.aClass91_Sub18_2090 = class91_sub18;
												class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2023;
												client.aClass95_1495.method1058(class91_sub21);
											}
											class91_sub18.anInt2082 = -453774083 * client.anInt1629;
										}
										if (class91_sub18.anObjectArray2013 != null && client.anInt1631 * -1260157993 > 988657655 * class91_sub18.anInt1983) {
											if (class91_sub18.anIntArray2080 != null && client.anInt1631 * -1260157993 - class91_sub18.anInt1983 * 988657655 <= 32) {
												while_2_: for (int i_30_ = 988657655 * class91_sub18.anInt1983; i_30_ < -1260157993 * client.anInt1631; i_30_++) {
													final int i_31_ = client.anIntArray1630[i_30_ & 0x1f];
													for (int i_32_ = 0; i_32_ < class91_sub18.anIntArray2080.length; i_32_++) {
														if (i_31_ == class91_sub18.anIntArray2080[i_32_]) {
															final Class91_Sub21 class91_sub21 = new Class91_Sub21();
															class91_sub21.aClass91_Sub18_2090 = class91_sub18;
															class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2013;
															client.aClass95_1495.method1058(class91_sub21);
															break while_2_;
														}
													}
												}
											} else {
												final Class91_Sub21 class91_sub21 = new Class91_Sub21();
												class91_sub21.aClass91_Sub18_2090 = class91_sub18;
												class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2013;
												client.aClass95_1495.method1058(class91_sub21);
											}
											class91_sub18.anInt1983 = -1334420703 * client.anInt1631;
										}
										if (1611832295 * client.anInt1441 > 1239348353 * class91_sub18.anInt2055 && class91_sub18.anObjectArray2058 != null) {
											final Class91_Sub21 class91_sub21 = new Class91_Sub21();
											class91_sub21.aClass91_Sub18_2090 = class91_sub18;
											class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2058;
											client.aClass95_1495.method1058(class91_sub21);
										}
										if (659711203 * client.anInt1633 > 1239348353 * class91_sub18.anInt2055 && class91_sub18.anObjectArray1964 != null) {
											final Class91_Sub21 class91_sub21 = new Class91_Sub21();
											class91_sub21.aClass91_Sub18_2090 = class91_sub18;
											class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray1964;
											client.aClass95_1495.method1058(class91_sub21);
										}
										if (1147062617 * client.anInt1634 > class91_sub18.anInt2055 * 1239348353 && class91_sub18.anObjectArray2011 != null) {
											final Class91_Sub21 class91_sub21 = new Class91_Sub21();
											class91_sub21.aClass91_Sub18_2090 = class91_sub18;
											class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2011;
											client.aClass95_1495.method1058(class91_sub21);
										}
										if (client.anInt1635 * 21008849 > 1239348353 * class91_sub18.anInt2055 && class91_sub18.anObjectArray2062 != null) {
											final Class91_Sub21 class91_sub21 = new Class91_Sub21();
											class91_sub21.aClass91_Sub18_2090 = class91_sub18;
											class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2062;
											client.aClass95_1495.method1058(class91_sub21);
										}
										class91_sub18.anInt2055 = -165054095 * client.anInt1640;
										if (class91_sub18.anObjectArray2059 != null) {
											for (int i_33_ = 0; i_33_ < 49669195 * client.anInt1663; i_33_++) {
												final Class91_Sub21 class91_sub21 = new Class91_Sub21();
												class91_sub21.aClass91_Sub18_2090 = class91_sub18;
												class91_sub21.anInt2093 = -789835811 * client.anIntArray1571[i_33_];
												class91_sub21.anInt2098 = 254024075 * client.anIntArray1664[i_33_];
												class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2059;
												client.aClass95_1495.method1058(class91_sub21);
											}
										}
									}
								}
								if (!class91_sub18.aBoolean1968) {
									if (client.aClass91_Sub18_1461 != null) {
										break;
									}
									if (i_6_ <= 3) {
										break;
									}
									if (Class91_Sub20_Sub5.aClass91_Sub18_2267 != null || client.aBoolean1538) {
										break;
									}
									if ((-287988637 * class91_sub18.anInt2068 >= 0 || class91_sub18.anInt1988 * -354384617 != 0) && Class12.anInt173 * -695750341 >= i_10_ && Class12.anInt178 * -855709389 >= i_11_ && -695750341 * Class12.anInt173 < i_12_ && -855709389 * Class12.anInt178 < i_13_) {
										if (-287988637 * class91_sub18.anInt2068 >= 0) {
											Class102.aClass91_Sub18_1314 = class91_sub18s[-287988637 * class91_sub18.anInt2068];
										} else {
											Class102.aClass91_Sub18_1314 = class91_sub18;
										}
									}
									if (633275603 * class91_sub18.anInt2057 == 8 && -695750341 * Class12.anInt173 >= i_10_ && -855709389 * Class12.anInt178 >= i_11_ && Class12.anInt173 * -695750341 < i_12_ && -855709389 * Class12.anInt178 < i_13_) {
										Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub18_2861 = class91_sub18;
									}
									if (class91_sub18.anInt1985 * 28734823 > class91_sub18.anInt1979 * -1807498407) {
										Class108.method1114(class91_sub18, -538789309 * class91_sub18.anInt1978 + i_8_, i_9_, class91_sub18.anInt1979 * -1807498407, class91_sub18.anInt1985 * 28734823, Class12.anInt173 * -695750341, Class12.anInt178 * -855709389, -1862718913);
									}
								}
							}
						}
					}
				}
			}
		} catch (final RuntimeException var24) {
			throw Class102.method1086(var24, "ac.cc()");
		}
	}

	public static int method736(final int i, final int i_34_) {
		int i_35_;
		try {
			i_35_ = i >> 11 & 0x3f;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ac.w()");
		}
		return i_35_;
	}

	void method737(final ByteBuffer class91_sub9, final int i, final int i_36_) {
		try {
			if (2 == i) {
				if (i_36_ == 565158034) {
					anInt2231 = class91_sub9.method686((byte) -93) * 1373143343;
				}
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "ac.e()");
		}
	}

	static int method738(final byte[] is, final int i, final int i_37_, final int i_38_) {
		int i_39_;
		try {
			int i_40_ = -1;
			for (int i_41_ = i; i_41_ < i_37_; i_41_++) {
				i_40_ = i_40_ >>> 8 ^ ByteBuffer.anIntArray1856[(i_40_ ^ is[i_41_]) & 0xff];
			}
			i_40_ ^= 0xffffffff;
			i_39_ = i_40_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ac.ae()");
		}
		return i_39_;
	}

	static File method739(final String string, final short i) {
		try {
			if (!Class18.aBoolean245) {
				throw new RuntimeException("");
			}
			final File file = (File) Class18.aHashtable246.get(string);
			if (file != null) {
				return file;
			}
			final File file_42_ = new File(Class18.aFile251, string);
			RandomAccessFile randomaccessfile = null;
			File file_43_;
			try {
				final File file_44_ = new File(file_42_.getParent());
				if (!file_44_.exists()) {
					throw new RuntimeException("");
				}
				randomaccessfile = new RandomAccessFile(file_42_, "rw");
				final int i_45_ = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i_45_);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				Class18.aHashtable246.put(string, file_42_);
				file_43_ = file_42_;
			} catch (final Exception exception) {
				try {
					if (randomaccessfile != null) {
						randomaccessfile.close();
					}
				} catch (final Exception exception_46_) {
					/* empty */
				}
				throw new RuntimeException();
			}
			return file_43_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ac.i()");
		}
	}

	static final boolean method740(final Class91_Sub18 class91_sub18, final int i) {
		try {
			if (class91_sub18.anIntArray2066 == null) {
				return false;
			}
			for (int i_47_ = 0; i_47_ < class91_sub18.anIntArray2066.length; i_47_++) {
				final int i_48_ = Class91_Sub22.method1041(class91_sub18, i_47_, -668540675);
				final int i_49_ = class91_sub18.anIntArray2067[i_47_];
				if (2 == class91_sub18.anIntArray2066[i_47_]) {
					if (i_48_ >= i_49_) {
						return false;
					}
				} else if (class91_sub18.anIntArray2066[i_47_] == 3) {
					if (i_48_ <= i_49_) {
						return false;
					}
				} else if (4 == class91_sub18.anIntArray2066[i_47_]) {
					if (i_49_ == i_48_) {
						return false;
					}
				} else if (i_49_ != i_48_) {
					return false;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ac.cq()");
		}
		return true;
	}

	void method741(final ByteBuffer class91_sub9, final byte i) {
		try {
			for (;;) {
				final int i_50_ = class91_sub9.readUnsignedByte();
				if (i_50_ == 0) {
					break;
				}
				method737(class91_sub9, i_50_, 565158034);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ac.f()");
		}
	}

	public static byte method742(final char c, final byte i) {
		byte i_51_;
		try {
			if ((c <= 0 || c >= '\u0080') && (c < '\u00a0' || c > '\u00ff')) {
				if (c == '\u20ac') {
					final byte i_52_ = -128;
					return i_52_;
				}
				if (c == '\u201a') {
					final byte i_53_ = -126;
					return i_53_;
				}
				if ('\u0192' == c) {
					final byte i_54_ = -125;
					return i_54_;
				}
				if ('\u201e' == c) {
					final byte i_55_ = -124;
					return i_55_;
				}
				if (c == '\u2026') {
					final byte i_56_ = -123;
					return i_56_;
				}
				if (c == '\u2020') {
					final byte i_57_ = -122;
					return i_57_;
				}
				if (c == '\u2021') {
					final byte i_58_ = -121;
					return i_58_;
				}
				if (c == '\u02c6') {
					final byte i_59_ = -120;
					return i_59_;
				}
				if (c == '\u2030') {
					final byte i_60_ = -119;
					return i_60_;
				}
				if ('\u0160' == c) {
					final byte i_61_ = -118;
					return i_61_;
				}
				if ('\u2039' == c) {
					final byte i_62_ = -117;
					return i_62_;
				}
				if (c == '\u0152') {
					final byte i_63_ = -116;
					return i_63_;
				}
				if ('\u017d' == c) {
					final byte i_64_ = -114;
					return i_64_;
				}
				if ('\u2018' == c) {
					final byte i_65_ = -111;
					return i_65_;
				}
				if (c == '\u2019') {
					final byte i_66_ = -110;
					return i_66_;
				}
				if ('\u201c' == c) {
					final byte i_67_ = -109;
					return i_67_;
				}
				if (c == '\u201d') {
					final byte i_68_ = -108;
					return i_68_;
				}
				if (c == '\u2022') {
					final byte i_69_ = -107;
					return i_69_;
				}
				if ('\u2013' == c) {
					final byte i_70_ = -106;
					return i_70_;
				}
				if (c == '\u2014') {
					final byte i_71_ = -105;
					return i_71_;
				}
				if (c == '\u02dc') {
					final byte i_72_ = -104;
					return i_72_;
				}
				if (c == '\u2122') {
					final byte i_73_ = -103;
					return i_73_;
				}
				if ('\u0161' == c) {
					final byte i_74_ = -102;
					return i_74_;
				}
				if (c == '\u203a') {
					final byte i_75_ = -101;
					return i_75_;
				}
				if (c == '\u0153') {
					final byte i_76_ = -100;
					return i_76_;
				}
				if ('\u017e' == c) {
					final byte i_77_ = -98;
					return i_77_;
				}
				byte i_78_;
				if ('\u0178' == c) {
					i_78_ = (byte) -97;
				} else {
					i_78_ = (byte) 63;
				}
				return i_78_;
			}
			final byte i_79_ = (byte) c;
			i_51_ = i_79_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ac.i()");
		}
		return i_51_;
	}

	Class91_Sub20_Sub2() {
		try {
			anInt2231 = 0;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "ac.<init>()");
		}
	}
}
