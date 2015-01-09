/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

public abstract class Class28 {
	static final int anInt337 = 7;
	int anInt338;
	public int[] anIntArray339;
	static final int anInt340 = 35;
	Image anImage341;
	int anInt342;
	public static final int anInt343 = 1024;

	public static void setupNpcStores(final Js5 class63, final Js5 class63_0_, final byte i) {
		try {
			NpcType.npcJs5 = class63;
			NpcType.aClass63_2432 = class63_0_;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "cc.i()");
		}
	}

	abstract void method253(int i, int i_1_, Component component, byte i_2_);

	public abstract void method254(Graphics graphics, int i, int i_3_, int i_4_);

	public abstract void method255(Graphics graphics, int i, int i_5_, int i_6_, int i_7_, byte i_8_);

	abstract void method256(int i, int i_9_, Component component);

	abstract void method257(int i, int i_10_, Component component);

	abstract void method258(int i, int i_11_, Component component);

	public abstract void method259(Graphics graphics, int i, int i_12_, int i_13_, int i_14_);

	public abstract void method260(Graphics graphics, int i, int i_15_);

	public abstract void method261(Graphics graphics, int i, int i_16_, int i_17_, int i_18_);

	public abstract void method262(Graphics graphics, int i, int i_19_);

	static final void method263(final Class91_Sub18[] class91_sub18s, final int i, final int i_20_, final int i_21_, final int i_22_, final int i_23_, final int i_24_, final int i_25_, final int i_26_, final int i_27_) {
		try {
			Class91_Sub20_Sub13.method821(i_20_, i_21_, i_22_, i_23_);
			Class91_Sub20_Sub13_Sub2.method855();
			int i_28_ = 0;
			for (/**/; i_28_ < class91_sub18s.length; i_28_++) {
				final Class91_Sub18 class91_sub18 = class91_sub18s[i_28_];
				if (class91_sub18 != null && (i == class91_sub18.anInt1980 * 777859439 || i == -1412584499 && client.aClass91_Sub18_1461 == class91_sub18)) {
					int i_29_;
					if (i_26_ == -1) {
						client.anIntArray1648[-437440627 * client.anInt1456] = i_24_ + class91_sub18.anInt1974 * -1211939919;
						client.anIntArray1649[-437440627 * client.anInt1456] = -529547265 * class91_sub18.anInt1972 + i_25_;
						client.anIntArray1608[-437440627 * client.anInt1456] = -538789309 * class91_sub18.anInt1978;
						client.anIntArray1651[client.anInt1456 * -437440627] = -1807498407 * class91_sub18.anInt1979;
						i_29_ = (client.anInt1456 += -766792891) * -437440627 - 1;
					} else {
						i_29_ = i_26_;
					}
					class91_sub18.anInt2084 = i_29_ * 1293232467;
					class91_sub18.anInt2085 = client.anInt1449 * -895799991;
					if (!class91_sub18.aBoolean1968 || !Class63_Sub1.method432(class91_sub18, (byte) -40)) {
						if (-299916553 * class91_sub18.anInt1973 > 0) {
							final int i_30_ = -299916553 * class91_sub18.anInt1973;
							if (324 == i_30_) {
								if (client.anInt1702 * 1302391597 == -1) {
									client.anInt1702 = 544637167 * class91_sub18.anInt1993;
									client.anInt1703 = class91_sub18.anInt2034 * -1826319963;
								}
								if (client.aClass85_1622.aBoolean1159) {
									class91_sub18.anInt1993 = client.anInt1702 * -1319850481;
								} else {
									class91_sub18.anInt1993 = -2001656669 * client.anInt1703;
								}
							} else if (325 == i_30_) {
								if (1302391597 * client.anInt1702 == -1) {
									client.anInt1702 = class91_sub18.anInt1993 * 544637167;
									client.anInt1703 = -1826319963 * class91_sub18.anInt2034;
								}
								if (client.aClass85_1622.aBoolean1159) {
									class91_sub18.anInt1993 = -2001656669 * client.anInt1703;
								} else {
									class91_sub18.anInt1993 = client.anInt1702 * -1319850481;
								}
							} else if (i_30_ == 327) {
								class91_sub18.anInt2039 = 1209968418;
								class91_sub18.anInt2010 = ((int) (Math.sin(client.anInt1449 * 2026135825 / 40.0) * 256.0) & 0x7ff) * -203003121;
								class91_sub18.anInt2001 = 782525131;
								class91_sub18.anInt2002 = 0;
							} else if (328 == i_30_) {
								class91_sub18.anInt2039 = 1209968418;
								class91_sub18.anInt2010 = ((int) (Math.sin(2026135825 * client.anInt1449 / 40.0) * 256.0) & 0x7ff) * -203003121;
								class91_sub18.anInt2001 = 782525131;
								class91_sub18.anInt2002 = -218983247;
							}
						}
						int i_31_ = class91_sub18.anInt1974 * -1211939919 + i_24_;
						int i_32_ = class91_sub18.anInt1972 * -529547265 + i_25_;
						int i_33_ = 1625026849 * class91_sub18.anInt1975;
						if (class91_sub18 == client.aClass91_Sub18_1461) {
							if (i != -1412584499 && !class91_sub18.aBoolean1966) {
								ByteBuffer.aClass91_Sub18Array1863 = class91_sub18s;
								Class42.anInt560 = 1435934835 * i_24_;
								Class91_Sub20_Sub14.anInt2487 = i_25_ * 308698183;
								continue;
							}
							if (client.aBoolean1624 && client.aBoolean1618) {
								int i_34_ = Class12.anInt173 * -695750341;
								int i_35_ = Class12.anInt178 * -855709389;
								i_34_ -= client.anInt1615 * 758470529;
								i_35_ -= -750348957 * client.anInt1616;
								if (i_34_ < -1412894159 * client.anInt1583) {
									i_34_ = client.anInt1583 * -1412894159;
								}
								if (i_34_ + -538789309 * class91_sub18.anInt1978 > -538789309 * client.aClass91_Sub18_1699.anInt1978 + -1412894159 * client.anInt1583) {
									i_34_ = -1412894159 * client.anInt1583 + -538789309 * client.aClass91_Sub18_1699.anInt1978 - -538789309 * class91_sub18.anInt1978;
								}
								if (i_35_ < client.anInt1620 * -375980539) {
									i_35_ = client.anInt1620 * -375980539;
								}
								if (-1807498407 * class91_sub18.anInt1979 + i_35_ > client.anInt1620 * -375980539 + -1807498407 * client.aClass91_Sub18_1699.anInt1979) {
									i_35_ = client.anInt1620 * -375980539 + -1807498407 * client.aClass91_Sub18_1699.anInt1979 - class91_sub18.anInt1979 * -1807498407;
								}
								i_31_ = i_34_;
								i_32_ = i_35_;
							}
							if (!class91_sub18.aBoolean1966) {
								i_33_ = 128;
							}
						}
						int i_36_;
						int i_37_;
						int i_38_;
						int i_39_;
						if (2 == class91_sub18.anInt2057 * 633275603) {
							i_36_ = i_20_;
							i_37_ = i_21_;
							i_38_ = i_22_;
							i_39_ = i_23_;
						} else if (class91_sub18.anInt2057 * 633275603 == 9) {
							int i_40_ = i_31_;
							int i_41_ = i_32_;
							int i_42_ = -538789309 * class91_sub18.anInt1978 + i_31_;
							int i_43_ = i_32_ + -1807498407 * class91_sub18.anInt1979;
							if (i_42_ < i_31_) {
								i_40_ = i_42_;
								i_42_ = i_31_;
							}
							if (i_43_ < i_32_) {
								i_41_ = i_43_;
								i_43_ = i_32_;
							}
							i_42_++;
							i_43_++;
							int i_44_;
							if (i_40_ > i_20_) {
								i_44_ = i_40_;
							} else {
								i_44_ = i_20_;
							}
							i_36_ = i_44_;
							i_37_ = i_41_ > i_21_ ? i_41_ : i_21_;
							i_38_ = i_42_ < i_22_ ? i_42_ : i_22_;
							if (i_43_ < i_23_) {
								i_44_ = i_43_;
							} else {
								i_44_ = i_23_;
							}
							i_39_ = i_44_;
						} else {
							final int i_45_ = class91_sub18.anInt1978 * -538789309 + i_31_;
							final int i_46_ = -1807498407 * class91_sub18.anInt1979 + i_32_;
							int i_47_;
							if (i_31_ > i_20_) {
								i_47_ = i_31_;
							} else {
								i_47_ = i_20_;
							}
							i_36_ = i_47_;
							if (i_32_ > i_21_) {
								i_47_ = i_32_;
							} else {
								i_47_ = i_21_;
							}
							i_37_ = i_47_;
							if (i_45_ < i_22_) {
								i_47_ = i_45_;
							} else {
								i_47_ = i_22_;
							}
							i_38_ = i_47_;
							i_39_ = i_46_ < i_23_ ? i_46_ : i_23_;
						}
						if (!class91_sub18.aBoolean1968 || i_36_ < i_38_ && i_37_ < i_39_) {
							if (class91_sub18.anInt1973 * -299916553 != 0) {
								if (1337 == -299916553 * class91_sub18.anInt1973) {
									client.anInt1592 = -1715677899 * i_31_;
									client.anInt1593 = i_32_ * 1223688735;
									Class107.method1107(i_31_, i_32_, -538789309 * class91_sub18.anInt1978, -1807498407 * class91_sub18.anInt1979, -1419130537);
									Class91_Sub20_Sub13.method821(i_20_, i_21_, i_22_, i_23_);
									continue;
								}
								if (class91_sub18.anInt1973 * -299916553 == 1338) {
									Class28_Sub1.method269(i_31_, i_32_, i_29_, 1464008475);
									Class91_Sub20_Sub13.method821(i_20_, i_21_, i_22_, i_23_);
									continue;
								}
							}
							final int i_48_ = Class12.anInt173 * -695750341;
							final int i_49_ = Class12.anInt178 * -855709389;
							if (!client.aBoolean1538 && i_48_ >= i_36_ && i_49_ >= i_37_ && i_48_ < i_38_ && i_49_ < i_39_) {
								final int i_50_ = i_48_ - i_31_;
								final int i_51_ = i_49_ - i_32_;
								if (class91_sub18.anInt2008 * 203408399 == 1) {
									Class14.method175(class91_sub18.aString2070, "", 24, 0, 0, class91_sub18.anInt2032 * -1026201747, -1101298913);
								}
								if (2 == class91_sub18.anInt2008 * 203408399 && !client.aBoolean1568) {
									final String string = Class48.method369(class91_sub18, (byte) 64);
									if (string != null) {
										Class14.method175(string, new StringBuilder(Class91_Sub21.method1033(65280, -72339409)).append(class91_sub18.aString2069).toString(), 25, 0, -1, -1026201747 * class91_sub18.anInt2032, -1101298913);
									}
								}
								if (203408399 * class91_sub18.anInt2008 == 3) {
									Class14.method175(Class75.aString999, "", 26, 0, 0, class91_sub18.anInt2032 * -1026201747, -1101298913);
								}
								if (class91_sub18.anInt2008 * 203408399 == 4) {
									Class14.method175(class91_sub18.aString2070, "", 28, 0, 0, -1026201747 * class91_sub18.anInt2032, -1101298913);
								}
								if (203408399 * class91_sub18.anInt2008 == 5) {
									Class14.method175(class91_sub18.aString2070, "", 29, 0, 0, -1026201747 * class91_sub18.anInt2032, -1101298913);
								}
								if (6 == 203408399 * class91_sub18.anInt2008 && client.aClass91_Sub18_1606 == null) {
									Class14.method175(class91_sub18.aString2070, "", 30, 0, -1, -1026201747 * class91_sub18.anInt2032, -1101298913);
								}
								if (2 == 633275603 * class91_sub18.anInt2057) {
									int i_52_ = 0;
									for (int i_53_ = 0; i_53_ < -1807498407 * class91_sub18.anInt1979; i_53_++) {
										for (int i_54_ = 0; i_54_ < class91_sub18.anInt1978 * -538789309; i_54_++) {
											int i_55_ = (32 + 756012337 * class91_sub18.anInt2004) * i_54_;
											int i_56_ = (class91_sub18.anInt2045 * -1621612417 + 32) * i_53_;
											if (i_52_ < 20) {
												i_55_ += class91_sub18.anIntArray2024[i_52_];
												i_56_ += class91_sub18.anIntArray2025[i_52_];
											}
											do {
												if (i_50_ >= i_55_ && i_51_ >= i_56_ && i_50_ < 32 + i_55_ && i_51_ < 32 + i_56_) {
													client.anInt1614 = i_52_ * -1201548797;
													Class91_Sub23.aClass91_Sub18_2124 = class91_sub18;
													if (class91_sub18.anIntArray2030[i_52_] > 0) {
														final ObjType class91_sub20_sub8 = Class86_Sub1.method490(class91_sub18.anIntArray2030[i_52_] - 1, 234554293);
														if (1 == 406349745 * client.anInt1596) {
															final int i_57_ = Class17.method182(class91_sub18, 1521204453);
															boolean bool;
															if ((i_57_ >> 30 & 0x1) != 0) {
																bool = true;
															} else {
																bool = false;
															}
															final boolean bool_58_ = bool;
															if (bool_58_) {
																if (-1026201747 * class91_sub18.anInt2032 != -1990355529 * Class6.anInt99 || 1558750851 * Class28_Sub1.anInt1728 != i_52_) {
																	Class14.method175(Class75.aString990, new StringBuilder(client.aString1597).append(" ").append(Class106.aString1373).append(" ").append(Class91_Sub21.method1033(16748608, -590115332)).append(class91_sub20_sub8.aString2357).toString(), 31, class91_sub20_sub8.anInt2355 * 1878947245, i_52_, -1026201747 * class91_sub18.anInt2032,
																			-1101298913);
																}
																break;
															}
														}
														if (client.aBoolean1568) {
															final int i_59_ = Class17.method182(class91_sub18, -874003892);
															final boolean bool = (i_59_ >> 30 & 0x1) != 0;
															if (bool) {
																if ((Class40.anInt547 * 1288780977 & 0x10) == 16) {
																	Class14.method175(client.aString1600, new StringBuilder(client.aString1553).append(" ").append(Class106.aString1373).append(" ").append(Class91_Sub21.method1033(16748608, -140149124)).append(class91_sub20_sub8.aString2357).toString(), 32, 1878947245 * class91_sub20_sub8.anInt2355, i_52_, -1026201747 * class91_sub18.anInt2032,
																			-1101298913);
																}
																break;
															}
														}
														String[] strings = class91_sub20_sub8.aStringArray2372;
														if (client.aBoolean1470) {
															strings = Class91_Sub7.method626(strings, (byte) -110);
														}
														final int i_60_ = Class17.method182(class91_sub18, 564969655);
														final boolean bool = (i_60_ >> 30 & 0x1) != 0;
														if (bool) {
															for (int i_61_ = 4; i_61_ >= 3; i_61_--) {
																if (strings != null && strings[i_61_] != null) {
																	int i_62_;
																	if (3 == i_61_) {
																		i_62_ = 36;
																	} else {
																		i_62_ = 37;
																	}
																	Class14.method175(strings[i_61_], new StringBuilder(Class91_Sub21.method1033(16748608, -1816471418)).append(class91_sub20_sub8.aString2357).toString(), i_62_, 1878947245 * class91_sub20_sub8.anInt2355, i_52_, -1026201747 * class91_sub18.anInt2032, -1101298913);
																} else if (i_61_ == 4) {
																	Class14.method175(Class75.aString974, new StringBuilder(Class91_Sub21.method1033(16748608, -1771854547)).append(class91_sub20_sub8.aString2357).toString(), 37, class91_sub20_sub8.anInt2355 * 1878947245, i_52_, class91_sub18.anInt2032 * -1026201747, -1101298913);
																}
															}
														}
														if (Class21.method202(Class17.method182(class91_sub18, -288931269), (byte) 73)) {
															Class14.method175(Class75.aString990, new StringBuilder(Class91_Sub21.method1033(16748608, -320126656)).append(class91_sub20_sub8.aString2357).toString(), 38, class91_sub20_sub8.anInt2355 * 1878947245, i_52_, -1026201747 * class91_sub18.anInt2032, -1101298913);
														}
														final int i_63_ = Class17.method182(class91_sub18, 1057979441);
														boolean bool_64_;
														if ((i_63_ >> 30 & 0x1) != 0) {
															bool_64_ = true;
														} else {
															bool_64_ = false;
														}
														final boolean bool_65_ = bool_64_;
														if (bool_65_ && strings != null) {
															for (int i_66_ = 2; i_66_ >= 0; i_66_--) {
																if (i_27_ != 1122891315) {
																	return;
																}
																if (strings[i_66_] != null) {
																	int i_67_ = 0;
																	if (i_66_ == 0) {
																		i_67_ = 33;
																	}
																	if (1 == i_66_) {
																		i_67_ = 34;
																	}
																	if (i_66_ == 2) {
																		i_67_ = 35;
																	}
																	Class14.method175(strings[i_66_], new StringBuilder(Class91_Sub21.method1033(16748608, -637290180)).append(class91_sub20_sub8.aString2357).toString(), i_67_, class91_sub20_sub8.anInt2355 * 1878947245, i_52_, -1026201747 * class91_sub18.anInt2032, -1101298913);
																}
															}
														}
														strings = class91_sub18.aStringArray1995;
														if (client.aBoolean1470) {
															strings = Class91_Sub7.method626(strings, (byte) -74);
														}
														if (strings != null) {
															for (int i_68_ = 4; i_68_ >= 0; i_68_--) {
																if (strings[i_68_] != null) {
																	int i_69_ = 0;
																	if (i_68_ == 0) {
																		i_69_ = 39;
																	}
																	if (1 == i_68_) {
																		i_69_ = 40;
																	}
																	if (2 == i_68_) {
																		i_69_ = 41;
																	}
																	if (3 == i_68_) {
																		i_69_ = 42;
																	}
																	if (i_68_ == 4) {
																		i_69_ = 43;
																	}
																	Class14.method175(strings[i_68_], new StringBuilder(Class91_Sub21.method1033(16748608, -1770033073)).append(class91_sub20_sub8.aString2357).toString(), i_69_, 1878947245 * class91_sub20_sub8.anInt2355, i_52_, -1026201747 * class91_sub18.anInt2032, -1101298913);
																}
															}
														}
														Class14.method175(Class75.aString991, new StringBuilder(Class91_Sub21.method1033(16748608, 279023242)).append(class91_sub20_sub8.aString2357).toString(), 1005, class91_sub20_sub8.anInt2355 * 1878947245, i_52_, -1026201747 * class91_sub18.anInt2032, -1101298913);
													}
												}
											} while (false);
											i_52_++;
										}
									}
								}
								if (class91_sub18.aBoolean1968) {
									if (client.aBoolean1568) {
										if (Class51.method373(Class17.method182(class91_sub18, -967474260), (byte) 27) && (Class40.anInt547 * 1288780977 & 0x20) == 32) {
											Class14.method175(client.aString1600, new StringBuilder(client.aString1553).append(" ").append(Class106.aString1373).append(" ").append(class91_sub18.aString2029).toString(), 58, 0, -819014149 * class91_sub18.anInt2012, class91_sub18.anInt2032 * -1026201747, -1101298913);
										}
									} else {
										for (int i_70_ = 9; i_70_ >= 5; i_70_--) {
											final String string = Class91_Sub23.method1048(class91_sub18, i_70_, (byte) 34);
											if (string != null) {
												Class14.method175(string, class91_sub18.aString2029, 1007, 1 + i_70_, -819014149 * class91_sub18.anInt2012, class91_sub18.anInt2032 * -1026201747, -1101298913);
											}
										}
										final String string = Class48.method369(class91_sub18, (byte) 35);
										if (string != null) {
											Class14.method175(string, class91_sub18.aString2029, 25, 0, -819014149 * class91_sub18.anInt2012, -1026201747 * class91_sub18.anInt2032, -1101298913);
										}
										for (int i_71_ = 4; i_71_ >= 0; i_71_--) {
											final String string_72_ = Class91_Sub23.method1048(class91_sub18, i_71_, (byte) 41);
											if (string_72_ != null) {
												Class14.method175(string_72_, class91_sub18.aString2029, 57, i_71_ + 1, class91_sub18.anInt2012 * -819014149, -1026201747 * class91_sub18.anInt2032, -1101298913);
											}
										}
										if (Class40.method342(Class17.method182(class91_sub18, -1065383959), -259809860)) {
											Class14.method175(Class75.aString855, "", 30, 0, -819014149 * class91_sub18.anInt2012, class91_sub18.anInt2032 * -1026201747, -1101298913);
										}
									}
								}
							}
							if (class91_sub18.anInt2057 * 633275603 == 0) {
								if (!class91_sub18.aBoolean1968 && Class63_Sub1.method432(class91_sub18, (byte) -96) && class91_sub18 != Class102.aClass91_Sub18_1314) {
									if (i_27_ != 1122891315) {
										throw new IllegalStateException();
									}
									continue;
								}
								if (!class91_sub18.aBoolean1968) {
									if (1916118407 * class91_sub18.anInt2048 > 28734823 * class91_sub18.anInt1985 - -1807498407 * class91_sub18.anInt1979) {
										class91_sub18.anInt2048 = 785033505 * class91_sub18.anInt1985 - class91_sub18.anInt1979 * 113477663;
									}
									if (1916118407 * class91_sub18.anInt2048 < 0) {
										class91_sub18.anInt2048 = 0;
									}
								}
								method263(class91_sub18s, -1026201747 * class91_sub18.anInt2032, i_36_, i_37_, i_38_, i_39_, i_31_ - 1910750647 * class91_sub18.anInt1982, i_32_ - class91_sub18.anInt2048 * 1916118407, i_29_, 1122891315);
								if (class91_sub18.aClass91_Sub18Array2077 != null) {
									method263(class91_sub18.aClass91_Sub18Array2077, class91_sub18.anInt2032 * -1026201747, i_36_, i_37_, i_38_, i_39_, i_31_ - class91_sub18.anInt1982 * 1910750647, i_32_ - 1916118407 * class91_sub18.anInt2048, i_29_, 1122891315);
								}
								final Class91_Sub10 class91_sub10 = (Class91_Sub10) client.aClass83_1603.method474(-1026201747 * class91_sub18.anInt2032);
								if (class91_sub10 != null) {
									if (-1304072595 * class91_sub10.anInt1868 == 0 && -695750341 * Class12.anInt173 >= i_36_ && -855709389 * Class12.anInt178 >= i_37_ && Class12.anInt173 * -695750341 < i_38_ && Class12.anInt178 * -855709389 < i_39_ && !client.aBoolean1538 && !client.aBoolean1611) {
										client.aStringArray1638[0] = Class75.aString953;
										client.aStringArray1591[0] = "";
										client.anIntArray1588[0] = 1006;
										client.anInt1585 = 109114029;
									}
									final int i_73_ = class91_sub10.anInt1865 * 337747539;
									if (!Class91_Sub20_Sub9.method800(i_73_, -280926934)) {
										if (-1 != i_29_) {
											client.aBooleanArray1645[i_29_] = true;
										} else {
											for (int i_74_ = 0; i_74_ < 100; i_74_++) {
												if (i_27_ != 1122891315) {
													return;
												}
												client.aBooleanArray1645[i_74_] = true;
											}
										}
									} else {
										ByteBuffer.aClass91_Sub18Array1863 = null;
										method263(Class91_Sub18.aClass91_Sub18ArrayArray1962[i_73_], -1, i_36_, i_37_, i_38_, i_39_, i_31_, i_32_, i_29_, 1122891315);
										if (ByteBuffer.aClass91_Sub18Array1863 != null) {
											method263(ByteBuffer.aClass91_Sub18Array1863, -1412584499, i_36_, i_37_, i_38_, i_39_, -1829960517 * Class42.anInt560, -441938569 * Class91_Sub20_Sub14.anInt2487, i_29_, 1122891315);
											ByteBuffer.aClass91_Sub18Array1863 = null;
										}
									}
								}
								Class91_Sub20_Sub13.method821(i_20_, i_21_, i_22_, i_23_);
								Class91_Sub20_Sub13_Sub2.method855();
							}
							if (!client.aBooleanArray1647[i_29_] && client.anInt1652 * -368459173 <= 1) {
								if (i_27_ != 1122891315) {
									throw new IllegalStateException();
								}
							} else {
								if (class91_sub18.anInt2057 * 633275603 == 0 && !class91_sub18.aBoolean1968 && class91_sub18.anInt1985 * 28734823 > class91_sub18.anInt1979 * -1807498407) {
									final int i_75_ = i_31_ + class91_sub18.anInt1978 * -538789309;
									final int i_76_ = 1916118407 * class91_sub18.anInt2048;
									final int i_77_ = -1807498407 * class91_sub18.anInt1979;
									final int i_78_ = class91_sub18.anInt1985 * 28734823;
									Class104.aClass91_Sub20_Sub13_Sub1Array1353[0].method840(i_75_, i_32_);
									Class104.aClass91_Sub20_Sub13_Sub1Array1353[1].method840(i_75_, i_77_ + i_32_ - 16);
									Class91_Sub20_Sub13.method828(i_75_, 16 + i_32_, 16, i_77_ - 32, client.anInt1621 * -969459499);
									int i_79_ = i_77_ * (i_77_ - 32) / i_78_;
									if (i_79_ < 8) {
										i_79_ = 8;
									}
									final int i_80_ = i_76_ * (i_77_ - 32 - i_79_) / (i_78_ - i_77_);
									Class91_Sub20_Sub13.method828(i_75_, i_32_ + 16 + i_80_, 16, i_79_, client.anInt1657 * 307716051);
									Class91_Sub20_Sub13.method835(i_75_, i_80_ + 16 + i_32_, i_79_, 563439207 * client.anInt1564);
									Class91_Sub20_Sub13.method835(1 + i_75_, i_80_ + i_32_ + 16, i_79_, 563439207 * client.anInt1564);
									Class91_Sub20_Sub13.method829(i_75_, i_32_ + 16 + i_80_, 16, 563439207 * client.anInt1564);
									Class91_Sub20_Sub13.method829(i_75_, i_32_ + 17 + i_80_, 16, 563439207 * client.anInt1564);
									Class91_Sub20_Sub13.method835(i_75_ + 15, i_80_ + i_32_ + 16, i_79_, 277768561 * client.anInt1523);
									Class91_Sub20_Sub13.method835(14 + i_75_, i_80_ + i_32_ + 17, i_79_ - 1, 277768561 * client.anInt1523);
									Class91_Sub20_Sub13.method829(i_75_, i_79_ + i_80_ + 15 + i_32_, 16, client.anInt1523 * 277768561);
									Class91_Sub20_Sub13.method829(i_75_ + 1, 14 + i_32_ + i_80_ + i_79_, 15, client.anInt1523 * 277768561);
								}
								if (633275603 * class91_sub18.anInt2057 != 1) {
									if (class91_sub18.anInt2057 * 633275603 == 2) {
										int i_81_ = 0;
										for (int i_82_ = 0; i_82_ < -1807498407 * class91_sub18.anInt1979; i_82_++) {
											for (int i_83_ = 0; i_83_ < class91_sub18.anInt1978 * -538789309; i_83_++) {
												int i_84_ = i_31_ + i_83_ * (32 + class91_sub18.anInt2004 * 756012337);
												int i_85_ = (32 + -1621612417 * class91_sub18.anInt2045) * i_82_ + i_32_;
												if (i_81_ < 20) {
													i_84_ += class91_sub18.anIntArray2024[i_81_];
													i_85_ += class91_sub18.anIntArray2025[i_81_];
												}
												if (class91_sub18.anIntArray2030[i_81_] > 0) {
													final int i_86_ = class91_sub18.anIntArray2030[i_81_] - 1;
													if (32 + i_84_ > i_20_ && i_84_ < i_22_ && i_85_ + 32 > i_21_ && i_85_ < i_23_ || class91_sub18 == Class91_Sub20_Sub5.aClass91_Sub18_2267 && i_81_ == client.anInt1555 * 602933089) {
														Class91_Sub20_Sub13_Sub3 class91_sub20_sub13_sub3;
														if (1 == 406349745 * client.anInt1596 && i_81_ == Class28_Sub1.anInt1728 * 1558750851 && -1026201747 * class91_sub18.anInt2032 == Class6.anInt99 * -1990355529) {
															class91_sub20_sub13_sub3 = Class15.method178(i_86_, class91_sub18.anIntArray1984[i_81_], 2, 0, false, (byte) 0);
														} else {
															class91_sub20_sub13_sub3 = Class15.method178(i_86_, class91_sub18.anIntArray1984[i_81_], 1, 3153952, false, (byte) 0);
														}
														if (class91_sub20_sub13_sub3 != null) {
															if (class91_sub18 == Class91_Sub20_Sub5.aClass91_Sub18_2267 && i_81_ == 602933089 * client.anInt1555) {
																int i_87_ = -695750341 * Class12.anInt173 - -132927813 * client.anInt1556;
																int i_88_ = Class12.anInt178 * -855709389 - client.anInt1557 * 1404971459;
																if (i_87_ < 5 && i_87_ > -5) {
																	i_87_ = 0;
																}
																if (i_88_ < 5 && i_88_ > -5) {
																	i_88_ = 0;
																}
																if (581627803 * client.anInt1598 < 5) {
																	i_87_ = 0;
																	i_88_ = 0;
																}
																class91_sub20_sub13_sub3.method873(i_87_ + i_84_, i_88_ + i_85_, 128);
																if (i != -1) {
																	final Class91_Sub18 class91_sub18_89_ = class91_sub18s[i & 0xffff];
																	if (i_85_ + i_88_ < Class91_Sub20_Sub13.anInt2484 && 1916118407 * class91_sub18_89_.anInt2048 > 0) {
																		int i_90_ = 517195449 * client.anInt1484 * (Class91_Sub20_Sub13.anInt2484 - i_85_ - i_88_) / 3;
																		if (i_90_ > 876987194 * client.anInt1484) {
																			i_90_ = client.anInt1484 * 876987194;
																		}
																		if (i_90_ > class91_sub18_89_.anInt2048 * 1916118407) {
																			i_90_ = 1916118407 * class91_sub18_89_.anInt2048;
																		}
																		class91_sub18_89_.anInt2048 -= i_90_ * 454496311;
																		client.anInt1557 += 63770347 * i_90_;
																		Class28_Sub1.method272(class91_sub18_89_, -1905179897);
																	}
																	if (i_88_ + i_85_ + 32 > Class91_Sub20_Sub13.anInt2480 && 1916118407 * class91_sub18_89_.anInt2048 < class91_sub18_89_.anInt1985 * 28734823 - class91_sub18_89_.anInt1979 * -1807498407) {
																		int i_91_ = 517195449 * client.anInt1484 * (32 + i_88_ + i_85_ - Class91_Sub20_Sub13.anInt2480) / 3;
																		if (i_91_ > 876987194 * client.anInt1484) {
																			i_91_ = client.anInt1484 * 876987194;
																		}
																		if (i_91_ > class91_sub18_89_.anInt1985 * 28734823 - -1807498407 * class91_sub18_89_.anInt1979 - 1916118407 * class91_sub18_89_.anInt2048) {
																			i_91_ = 28734823 * class91_sub18_89_.anInt1985 - -1807498407 * class91_sub18_89_.anInt1979 - class91_sub18_89_.anInt2048 * 1916118407;
																		}
																		class91_sub18_89_.anInt2048 += i_91_ * 454496311;
																		client.anInt1557 -= i_91_ * 63770347;
																		Class28_Sub1.method272(class91_sub18_89_, -1905179897);
																	}
																}
															} else if (Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 == class91_sub18 && i_81_ == client.anInt1554 * -2026670663) {
																class91_sub20_sub13_sub3.method873(i_84_, i_85_, 128);
															} else {
																class91_sub20_sub13_sub3.method880(i_84_, i_85_);
															}
														} else {
															Class28_Sub1.method272(class91_sub18, -1905179897);
														}
													}
												} else if (class91_sub18.anIntArray1971 != null && i_81_ < 20) {
													final Class91_Sub20_Sub13_Sub3 class91_sub20_sub13_sub3 = class91_sub18.method722(i_81_, -1553968326);
													if (class91_sub20_sub13_sub3 != null) {
														class91_sub20_sub13_sub3.method880(i_84_, i_85_);
													} else if (Class91_Sub18.aBoolean1967) {
														Class28_Sub1.method272(class91_sub18, -1905179897);
													}
												}
												i_81_++;
											}
										}
									} else if (class91_sub18.anInt2057 * 633275603 == 3) {
										int i_92_;
										if (Class91_Sub20_Sub2.method740(class91_sub18, 1201086584)) {
											i_92_ = -1047133711 * class91_sub18.anInt2071;
											if (Class102.aClass91_Sub18_1314 == class91_sub18 && -922790305 * class91_sub18.anInt1989 != 0) {
												i_92_ = class91_sub18.anInt1989 * -922790305;
											}
										} else {
											i_92_ = class91_sub18.anInt1986 * -2100558363;
											if (class91_sub18 == Class102.aClass91_Sub18_1314 && -354384617 * class91_sub18.anInt1988 != 0) {
												i_92_ = -354384617 * class91_sub18.anInt1988;
											}
										}
										if (i_33_ == 0) {
											if (class91_sub18.aBoolean2040) {
												Class91_Sub20_Sub13.method828(i_31_, i_32_, class91_sub18.anInt1978 * -538789309, class91_sub18.anInt1979 * -1807498407, i_92_);
											} else {
												Class91_Sub20_Sub13.method834(i_31_, i_32_, -538789309 * class91_sub18.anInt1978, -1807498407 * class91_sub18.anInt1979, i_92_);
											}
										} else if (class91_sub18.aBoolean2040) {
											Class91_Sub20_Sub13.method826(i_31_, i_32_, -538789309 * class91_sub18.anInt1978, class91_sub18.anInt1979 * -1807498407, i_92_, 256 - (i_33_ & 0xff));
										} else {
											Class91_Sub20_Sub13.method831(i_31_, i_32_, -538789309 * class91_sub18.anInt1978, -1807498407 * class91_sub18.anInt1979, i_92_, 256 - (i_33_ & 0xff));
										}
									} else if (class91_sub18.anInt2057 * 633275603 == 4) {
										final Class91_Sub20_Sub13_Sub4_Sub1 class91_sub20_sub13_sub4_sub1 = class91_sub18.method719(-428278386);
										if (class91_sub20_sub13_sub4_sub1 == null) {
											if (Class91_Sub18.aBoolean1967) {
												Class28_Sub1.method272(class91_sub18, -1905179897);
											}
										} else {
											String string = class91_sub18.aString2026;
											int i_93_;
											if (Class91_Sub20_Sub2.method740(class91_sub18, 1399318954)) {
												i_93_ = class91_sub18.anInt2071 * -1047133711;
												if (class91_sub18 == Class102.aClass91_Sub18_1314 && -922790305 * class91_sub18.anInt1989 != 0) {
													i_93_ = class91_sub18.anInt1989 * -922790305;
												}
												if (class91_sub18.aString2017.length() > 0) {
													string = class91_sub18.aString2017;
												}
											} else {
												i_93_ = class91_sub18.anInt1986 * -2100558363;
												if (class91_sub18 == Class102.aClass91_Sub18_1314 && -354384617 * class91_sub18.anInt1988 != 0) {
													i_93_ = class91_sub18.anInt1988 * -354384617;
												}
											}
											if (class91_sub18.aBoolean1968 && -1961943349 * class91_sub18.anInt2073 != -1) {
												final ObjType class91_sub20_sub8 = Class86_Sub1.method490(-1961943349 * class91_sub18.anInt2073, 234554293);
												string = class91_sub20_sub8.aString2357;
												if (string == null) {
													string = "null";
												}
												if ((1 == class91_sub20_sub8.anInt2368 * 1277482383 || -575634201 * class91_sub18.anInt2074 != 1) && -1 != -575634201 * class91_sub18.anInt2074) {
													string = new StringBuilder(Class91_Sub21.method1033(16748608, -258503359)).append(string).append(Class106.aString1378).append(" ").append('x').append(NpcType.method812(class91_sub18.anInt2074 * -575634201, (short) -1310)).toString();
												}
											}
											if (class91_sub18 == client.aClass91_Sub18_1606) {
												string = Class75.aString998;
												i_93_ = -2100558363 * class91_sub18.anInt1986;
											}
											if (!class91_sub18.aBoolean1968) {
												string = Class91_Sub5.method618(string, class91_sub18, -1161933420);
											}
											final int i_94_ = class91_sub18.anInt1978 * -538789309;
											final int i_95_ = -1807498407 * class91_sub18.anInt1979;
											int i_96_;
											if (class91_sub18.aBoolean2021) {
												i_96_ = 0;
											} else {
												i_96_ = -1;
											}
											class91_sub20_sub13_sub4_sub1.method894(string, i_31_, i_32_, i_94_, i_95_, i_93_, i_96_, -362695439 * class91_sub18.anInt2019, 118685203 * class91_sub18.anInt2020, 1619450721 * class91_sub18.anInt2018);
										}
									} else if (5 == 633275603 * class91_sub18.anInt2057) {
										if (!class91_sub18.aBoolean1968) {
											final Class91_Sub20_Sub13_Sub3 class91_sub20_sub13_sub3 = class91_sub18.method718(Class91_Sub20_Sub2.method740(class91_sub18, 1336688541), (short) 13002);
											if (class91_sub20_sub13_sub3 != null) {
												class91_sub20_sub13_sub3.method880(i_31_, i_32_);
											} else if (Class91_Sub18.aBoolean1967) {
												Class28_Sub1.method272(class91_sub18, -1905179897);
											}
										} else {
											Class91_Sub20_Sub13_Sub3 class91_sub20_sub13_sub3;
											if (-1 != -1961943349 * class91_sub18.anInt2073) {
												class91_sub20_sub13_sub3 = Class15.method178(-1961943349 * class91_sub18.anInt2073, -575634201 * class91_sub18.anInt2074, class91_sub18.anInt1997 * -1574238899, -567735853 * class91_sub18.anInt2060, false, (byte) 0);
											} else {
												class91_sub20_sub13_sub3 = class91_sub18.method718(false, (short) 28348);
											}
											if (class91_sub20_sub13_sub3 == null) {
												if (Class91_Sub18.aBoolean1967) {
													Class28_Sub1.method272(class91_sub18, -1905179897);
												}
											} else {
												final int i_97_ = class91_sub20_sub13_sub3.anInt2553;
												final int i_98_ = class91_sub20_sub13_sub3.anInt2554;
												if (!class91_sub18.aBoolean1996) {
													final int i_99_ = class91_sub18.anInt1978 * 732180480 / i_97_;
													if (646276539 * class91_sub18.anInt2081 != 0) {
														class91_sub20_sub13_sub3.method878(i_31_ + class91_sub18.anInt1978 * -538789309 / 2, -1807498407 * class91_sub18.anInt1979 / 2 + i_32_, class91_sub18.anInt2081 * 646276539, i_99_);
													} else if (i_33_ != 0) {
														class91_sub20_sub13_sub3.method874(i_31_, i_32_, -538789309 * class91_sub18.anInt1978, -1807498407 * class91_sub18.anInt1979, 256 - (i_33_ & 0xff));
													} else if (i_97_ == class91_sub18.anInt1978 * -538789309 && i_98_ == -1807498407 * class91_sub18.anInt1979) {
														class91_sub20_sub13_sub3.method880(i_31_, i_32_);
													} else {
														class91_sub20_sub13_sub3.method870(i_31_, i_32_, class91_sub18.anInt1978 * -538789309, class91_sub18.anInt1979 * -1807498407);
													}
												} else {
													Class91_Sub20_Sub13.method822(i_31_, i_32_, class91_sub18.anInt1978 * -538789309 + i_31_, -1807498407 * class91_sub18.anInt1979 + i_32_);
													final int i_100_ = (-538789309 * class91_sub18.anInt1978 + i_97_ - 1) / i_97_;
													final int i_101_ = (-1807498407 * class91_sub18.anInt1979 + i_98_ - 1) / i_98_;
													for (int i_102_ = 0; i_102_ < i_100_; i_102_++) {
														for (int i_103_ = 0; i_103_ < i_101_; i_103_++) {
															if (class91_sub18.anInt2081 * 646276539 != 0) {
																class91_sub20_sub13_sub3.method878(i_31_ + i_97_ * i_102_ + i_97_ / 2, i_103_ * i_98_ + i_32_ + i_98_ / 2, class91_sub18.anInt2081 * 646276539, 4096);
															} else if (i_33_ != 0) {
																class91_sub20_sub13_sub3.method873(i_102_ * i_97_ + i_31_, i_32_ + i_103_ * i_98_, 256 - (i_33_ & 0xff));
															} else {
																class91_sub20_sub13_sub3.method880(i_102_ * i_97_ + i_31_, i_32_ + i_98_ * i_103_);
															}
														}
													}
													Class91_Sub20_Sub13.method821(i_20_, i_21_, i_22_, i_23_);
												}
											}
										}
									} else if (633275603 * class91_sub18.anInt2057 == 6) {
										final boolean bool = Class91_Sub20_Sub2.method740(class91_sub18, 1863008090);
										int i_104_;
										if (bool) {
											i_104_ = -1328703365 * class91_sub18.anInt2006;
										} else {
											i_104_ = class91_sub18.anInt2005 * -345440531;
										}
										Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3 = null;
										int i_105_ = 0;
										if (-1 != class91_sub18.anInt2073 * -1961943349) {
											ObjType class91_sub20_sub8 = Class86_Sub1.method490(-1961943349 * class91_sub18.anInt2073, 234554293);
											if (class91_sub20_sub8 != null) {
												class91_sub20_sub8 = class91_sub20_sub8.method785(-575634201 * class91_sub18.anInt2074, (byte) -110);
												class91_sub20_sub14_sub3 = class91_sub20_sub8.method790(1, -1914332238);
												if (class91_sub20_sub14_sub3 != null) {
													class91_sub20_sub14_sub3.method974();
													i_105_ = 1142621617 * class91_sub20_sub14_sub3.anInt2488 / 2;
												} else {
													Class28_Sub1.method272(class91_sub18, -1905179897);
												}
											}
										} else if (class91_sub18.anInt2001 * -1360773521 == 5) {
											if (class91_sub18.anInt2002 * -1971637167 == 0) {
												class91_sub20_sub14_sub3 = client.aClass85_1622.method484(null, -1, null, -1, (byte) 123);
											} else {
												class91_sub20_sub14_sub3 = Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.method915(1442012879);
											}
										} else if (i_104_ == -1) {
											class91_sub20_sub14_sub3 = class91_sub18.method720(null, -1, bool, Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.aClass85_2838, 65280);
											if (class91_sub20_sub14_sub3 == null && Class91_Sub18.aBoolean1967) {
												Class28_Sub1.method272(class91_sub18, -1905179897);
											}
										} else {
											final Class91_Sub20_Sub5 class91_sub20_sub5 = Class7.method152(i_104_, 999662312);
											class91_sub20_sub14_sub3 = class91_sub18.method720(class91_sub20_sub5, -1541606851 * class91_sub18.anInt2075, bool, Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.aClass85_2838, 65280);
											if (class91_sub20_sub14_sub3 == null && Class91_Sub18.aBoolean1967) {
												Class28_Sub1.method272(class91_sub18, -1905179897);
											}
										}
										Class91_Sub20_Sub13_Sub2.method841(i_31_ + -538789309 * class91_sub18.anInt1978 / 2, i_32_ + -1807498407 * class91_sub18.anInt1979 / 2);
										final int i_106_ = Class91_Sub20_Sub13_Sub2.anIntArray2546[231157787 * class91_sub18.anInt2039] * 283795161 * class91_sub18.anInt2072 >> 16;
										final int i_107_ = 283795161 * class91_sub18.anInt2072 * Class91_Sub20_Sub13_Sub2.anIntArray2547[231157787 * class91_sub18.anInt2039] >> 16;
										if (class91_sub20_sub14_sub3 != null) {
											if (!class91_sub18.aBoolean1968) {
												class91_sub20_sub14_sub3.method982(0, 1557210095 * class91_sub18.anInt2010, 0, class91_sub18.anInt2039 * 231157787, 0, i_106_, i_107_);
											} else {
												class91_sub20_sub14_sub3.method974();
												if (class91_sub18.aBoolean2014) {
													class91_sub20_sub14_sub3.method983(0, class91_sub18.anInt2010 * 1557210095, 56462471 * class91_sub18.anInt2007, 231157787 * class91_sub18.anInt2039, class91_sub18.anInt1970 * -113257917, i_105_ + i_106_ + class91_sub18.anInt2061 * -270892303, i_107_ + -270892303 * class91_sub18.anInt2061, 283795161 * class91_sub18.anInt2072);
												} else {
													class91_sub20_sub14_sub3.method982(0, 1557210095 * class91_sub18.anInt2010, class91_sub18.anInt2007 * 56462471, 231157787 * class91_sub18.anInt2039, class91_sub18.anInt1970 * -113257917, i_105_ + i_106_ + class91_sub18.anInt2061 * -270892303, -270892303 * class91_sub18.anInt2061 + i_107_);
												}
											}
										}
										Class91_Sub20_Sub13_Sub2.method850();
									} else {
										if (7 == class91_sub18.anInt2057 * 633275603) {
											final Class91_Sub20_Sub13_Sub4_Sub1 class91_sub20_sub13_sub4_sub1 = class91_sub18.method719(-428278386);
											if (class91_sub20_sub13_sub4_sub1 == null) {
												if (Class91_Sub18.aBoolean1967) {
													Class28_Sub1.method272(class91_sub18, -1905179897);
												}
												continue;
											}
											int i_108_ = 0;
											for (int i_109_ = 0; i_109_ < -1807498407 * class91_sub18.anInt1979; i_109_++) {
												if (i_27_ != 1122891315) {
													return;
												}
												for (int i_110_ = 0; i_110_ < -538789309 * class91_sub18.anInt1978; i_110_++) {
													if (class91_sub18.anIntArray2030[i_108_] > 0) {
														final ObjType class91_sub20_sub8 = Class86_Sub1.method490(class91_sub18.anIntArray2030[i_108_] - 1, 234554293);
														String string;
														do {
															if (1277482383 * class91_sub20_sub8.anInt2368 != 1) {
																if (class91_sub18.anIntArray1984[i_108_] == 1) {
																	string = new StringBuilder(Class91_Sub21.method1033(16748608, -22096259)).append(class91_sub20_sub8.aString2357).append(Class106.aString1378).toString();
																	break;
																}
																if (i_27_ != 1122891315) {
																	return;
																}
															}
															string = new StringBuilder(Class91_Sub21.method1033(16748608, -1481378572)).append(class91_sub20_sub8.aString2357).append(Class106.aString1378).append(" ").append('x').append(NpcType.method812(class91_sub18.anIntArray1984[i_108_], (short) 23468)).toString();
														} while (false);
														final int i_111_ = (115 + 756012337 * class91_sub18.anInt2004) * i_110_ + i_31_;
														final int i_112_ = i_32_ + (12 + class91_sub18.anInt2045 * -1621612417) * i_109_;
														if (-362695439 * class91_sub18.anInt2019 == 0) {
															class91_sub20_sub13_sub4_sub1.method906(string, i_111_, i_112_, -2100558363 * class91_sub18.anInt1986, class91_sub18.aBoolean2021 ? 0 : -1);
														} else if (-362695439 * class91_sub18.anInt2019 == 1) {
															final int i_113_ = i_111_ + class91_sub18.anInt1978 * -538789309 / 2;
															final int i_114_ = class91_sub18.anInt1986 * -2100558363;
															int i_115_;
															if (class91_sub18.aBoolean2021) {
																i_115_ = 0;
															} else {
																i_115_ = -1;
															}
															class91_sub20_sub13_sub4_sub1.method913(string, i_113_, i_112_, i_114_, i_115_);
														} else {
															final int i_116_ = class91_sub18.anInt1978 * -538789309 + i_111_ - 1;
															final int i_117_ = class91_sub18.anInt1986 * -2100558363;
															int i_118_;
															if (class91_sub18.aBoolean2021) {
																i_118_ = 0;
															} else {
																i_118_ = -1;
															}
															class91_sub20_sub13_sub4_sub1.method893(string, i_116_, i_112_, i_117_, i_118_);
														}
													}
													i_108_++;
												}
											}
										}
										if (class91_sub18.anInt2057 * 633275603 == 8 && class91_sub18 == Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub18_2861 && -1938839237 * client.anInt1595 == client.anInt1594 * 187061203) {
											int i_119_ = 0;
											int i_120_ = 0;
											final Class91_Sub20_Sub13_Sub4_Sub1 class91_sub20_sub13_sub4_sub1 = Class32.aClass91_Sub20_Sub13_Sub4_Sub1_376;
											String string = class91_sub18.aString2026;
											string = Class91_Sub5.method618(string, class91_sub18, 88772112);
											while (string.length() > 0) {
												final int i_121_ = string.indexOf(Class106.aString1374);
												String string_122_;
												if (i_121_ != -1) {
													string_122_ = string.substring(0, i_121_);
													string = string.substring(4 + i_121_);
												} else {
													string_122_ = string;
													string = "";
												}
												final int i_123_ = class91_sub20_sub13_sub4_sub1.method889(string_122_);
												if (i_123_ > i_119_) {
													i_119_ = i_123_;
												}
												i_120_ += 1 + class91_sub20_sub13_sub4_sub1.anInt2581;
											}
											i_119_ += 6;
											i_120_ += 7;
											int i_124_ = i_31_ + class91_sub18.anInt1978 * -538789309 - 5 - i_119_;
											int i_125_ = 5 + class91_sub18.anInt1979 * -1807498407 + i_32_;
											if (i_124_ < 5 + i_31_) {
												i_124_ = 5 + i_31_;
											}
											if (i_124_ + i_119_ > i_22_) {
												i_124_ = i_22_ - i_119_;
											}
											if (i_120_ + i_125_ > i_23_) {
												i_125_ = i_23_ - i_120_;
											}
											Class91_Sub20_Sub13.method828(i_124_, i_125_, i_119_, i_120_, 16777120);
											Class91_Sub20_Sub13.method834(i_124_, i_125_, i_119_, i_120_, 0);
											string = class91_sub18.aString2026;
											int i_126_ = i_125_ + class91_sub20_sub13_sub4_sub1.anInt2581 + 2;
											string = Class91_Sub5.method618(string, class91_sub18, -1639260444);
											while (string.length() > 0) {
												final int i_127_ = string.indexOf(Class106.aString1374);
												String string_128_;
												if (-1 != i_127_) {
													string_128_ = string.substring(0, i_127_);
													string = string.substring(i_127_ + 4);
												} else {
													string_128_ = string;
													string = "";
												}
												class91_sub20_sub13_sub4_sub1.method906(string_128_, i_124_ + 3, i_126_, 0, -1);
												i_126_ += 1 + class91_sub20_sub13_sub4_sub1.anInt2581;
											}
										}
										if (9 == class91_sub18.anInt2057 * 633275603) {
											if (1 == -336081955 * class91_sub18.anInt1992) {
												Class91_Sub20_Sub13.method833(i_31_, i_32_, i_31_ + class91_sub18.anInt1978 * -538789309, -1807498407 * class91_sub18.anInt1979 + i_32_, -2100558363 * class91_sub18.anInt1986);
											} else {
												final int i_129_ = -538789309 * class91_sub18.anInt1978 >= 0 ? class91_sub18.anInt1978 * -538789309 : -(class91_sub18.anInt1978 * -538789309);
												int i_130_;
												if (-1807498407 * class91_sub18.anInt1979 >= 0) {
													i_130_ = -1807498407 * class91_sub18.anInt1979;
												} else {
													i_130_ = -(class91_sub18.anInt1979 * -1807498407);
												}
												final int i_131_ = i_130_;
												int i_132_ = i_129_;
												if (i_129_ < i_131_) {
													i_132_ = i_131_;
												}
												if (i_132_ != 0) {
													int i_133_ = (-538789309 * class91_sub18.anInt1978 << 16) / i_132_;
													int i_134_ = (class91_sub18.anInt1979 * -1807498407 << 16) / i_132_;
													if (i_134_ <= i_133_) {
														i_133_ = -i_133_;
													} else {
														i_134_ = -i_134_;
													}
													final int i_135_ = i_134_ * class91_sub18.anInt1992 * -336081955 >> 17;
													final int i_136_ = 1 + i_134_ * -336081955 * class91_sub18.anInt1992 >> 17;
													final int i_137_ = class91_sub18.anInt1992 * -336081955 * i_133_ >> 17;
													final int i_138_ = 1 + i_133_ * -336081955 * class91_sub18.anInt1992 >> 17;
													final int i_139_ = i_31_ + i_135_;
													final int i_140_ = i_31_ - i_136_;
													final int i_141_ = class91_sub18.anInt1978 * -538789309 + i_31_ - i_136_;
													final int i_142_ = i_135_ + -538789309 * class91_sub18.anInt1978 + i_31_;
													final int i_143_ = i_137_ + i_32_;
													final int i_144_ = i_32_ - i_138_;
													final int i_145_ = class91_sub18.anInt1979 * -1807498407 + i_32_ - i_138_;
													final int i_146_ = i_32_ + -1807498407 * class91_sub18.anInt1979 + i_137_;
													Class91_Sub20_Sub13_Sub2.method854(i_139_, i_140_, i_141_);
													Class91_Sub20_Sub13_Sub2.method846(i_143_, i_144_, i_145_, i_139_, i_140_, i_141_, class91_sub18.anInt1986 * -2100558363);
													Class91_Sub20_Sub13_Sub2.method854(i_139_, i_141_, i_142_);
													Class91_Sub20_Sub13_Sub2.method846(i_143_, i_145_, i_146_, i_139_, i_141_, i_142_, -2100558363 * class91_sub18.anInt1986);
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
		} catch (final RuntimeException var39) {
			throw Class102.method1086(var39, "cc.bi()");
		}
	}

	Class28() {
		/* empty */
	}

	static final void method264(final int i, final int i_147_, final int i_148_, final int i_149_, final int i_150_, final int i_151_, final int i_152_, final Class39 class39, final Class76 class76, final int i_153_) {
		try {
			final LocType class91_sub20_sub7 = Class60.method392(i_150_, 1771148796);
			int i_154_;
			int i_155_;
			if (1 != i_151_ && i_151_ != 3) {
				i_154_ = -2039520181 * class91_sub20_sub7.anInt2312;
				i_155_ = -1173592851 * class91_sub20_sub7.anInt2313;
			} else {
				i_154_ = class91_sub20_sub7.anInt2313 * -1173592851;
				i_155_ = -2039520181 * class91_sub20_sub7.anInt2312;
			}
			int i_156_;
			int i_157_;
			if (i_154_ + i_148_ <= 104) {
				i_156_ = (i_154_ >> 1) + i_148_;
				i_157_ = (i_154_ + 1 >> 1) + i_148_;
			} else {
				i_156_ = i_148_;
				i_157_ = 1 + i_148_;
			}
			int i_158_;
			int i_159_;
			if (i_149_ + i_155_ <= 104) {
				i_158_ = (i_155_ >> 1) + i_149_;
				i_159_ = i_149_ + (i_155_ + 1 >> 1);
			} else {
				i_158_ = i_149_;
				i_159_ = i_149_ + 1;
			}
			final int[][] is = Class102.anIntArrayArrayArray1292[i_147_];
			final int i_160_ = is[i_156_][i_159_] + is[i_157_][i_158_] + is[i_156_][i_158_] + is[i_157_][i_159_] >> 2;
			final int i_161_ = (i_154_ << 6) + (i_148_ << 7);
			final int i_162_ = (i_155_ << 6) + (i_149_ << 7);
			int i_163_ = 1073741824 + i_148_ + (i_149_ << 7) + (i_150_ << 14);
			if (class91_sub20_sub7.anInt2328 * 331313953 == 0) {
				i_163_ -= -2147483648;
			}
			int i_164_ = i_152_ + (i_151_ << 6);
			if (1 == -901606611 * class91_sub20_sub7.anInt2341) {
				i_164_ += 256;
			}
			if (22 == i_152_) {
				if (i_153_ == 16777216) {
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (-1 == 963101581 * class91_sub20_sub7.anInt2320 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method772(22, i_151_, is, i_161_, i_160_, i_162_, (short) 2516);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_150_, 22, i_151_, i_147_, i_148_, i_149_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
					}
					class39.method297(i, i_148_, i_149_, i_160_, class91_sub20_sub14, i_163_, i_164_);
					if (1 == 1727180835 * class91_sub20_sub7.anInt2314) {
						class76.method458(i_148_, i_149_, (byte) 0);
					}
				}
			} else if (i_152_ != 10 && i_152_ != 11) {
				if (i_152_ >= 12) {
					if (i_153_ == 16777216) {
						Class91_Sub20_Sub14 class91_sub20_sub14;
						if (-1 == class91_sub20_sub7.anInt2320 * 963101581 && class91_sub20_sub7.anIntArray2305 == null) {
							class91_sub20_sub14 = class91_sub20_sub7.method772(i_152_, i_151_, is, i_161_, i_160_, i_162_, (short) -7967);
						} else {
							class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_150_, i_152_, i_151_, i_147_, i_148_, i_149_, 963101581 * class91_sub20_sub7.anInt2320, true, null);
						}
						class39.method291(i, i_148_, i_149_, i_160_, 1, 1, class91_sub20_sub14, 0, i_163_, i_164_);
						if (1727180835 * class91_sub20_sub7.anInt2314 != 0) {
							class76.method456(i_148_, i_149_, i_154_, i_155_, class91_sub20_sub7.aBoolean2315, 1708957647);
						}
					}
				} else if (i_152_ == 0) {
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (-1 == class91_sub20_sub7.anInt2320 * 963101581 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method772(0, i_151_, is, i_161_, i_160_, i_162_, (short) 9049);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_150_, 0, i_151_, i_147_, i_148_, i_149_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
					}
					class39.method298(i, i_148_, i_149_, i_160_, class91_sub20_sub14, null, Class102.anIntArray1302[i_151_], 0, i_163_, i_164_);
					if (class91_sub20_sub7.anInt2314 * 1727180835 != 0) {
						class76.method455(i_148_, i_149_, i_152_, i_151_, class91_sub20_sub7.aBoolean2315, (short) 143);
					}
				} else if (1 == i_152_) {
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (-1 == 963101581 * class91_sub20_sub7.anInt2320 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method772(1, i_151_, is, i_161_, i_160_, i_162_, (short) 6110);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_150_, 1, i_151_, i_147_, i_148_, i_149_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
					}
					class39.method298(i, i_148_, i_149_, i_160_, class91_sub20_sub14, null, Class102.anIntArray1303[i_151_], 0, i_163_, i_164_);
					if (class91_sub20_sub7.anInt2314 * 1727180835 != 0) {
						class76.method455(i_148_, i_149_, i_152_, i_151_, class91_sub20_sub7.aBoolean2315, (short) 143);
					}
				} else if (2 == i_152_) {
					final int i_165_ = 1 + i_151_ & 0x3;
					Class91_Sub20_Sub14 class91_sub20_sub14;
					Class91_Sub20_Sub14 class91_sub20_sub14_166_;
					if (class91_sub20_sub7.anInt2320 * 963101581 == -1 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method772(2, i_151_ + 4, is, i_161_, i_160_, i_162_, (short) 20770);
						class91_sub20_sub14_166_ = class91_sub20_sub7.method772(2, i_165_, is, i_161_, i_160_, i_162_, (short) -22086);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_150_, 2, i_151_ + 4, i_147_, i_148_, i_149_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
						class91_sub20_sub14_166_ = new Class91_Sub20_Sub14_Sub5(i_150_, 2, i_165_, i_147_, i_148_, i_149_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
					}
					class39.method298(i, i_148_, i_149_, i_160_, class91_sub20_sub14, class91_sub20_sub14_166_, Class102.anIntArray1302[i_151_], Class102.anIntArray1302[i_165_], i_163_, i_164_);
					if (1727180835 * class91_sub20_sub7.anInt2314 != 0) {
						class76.method455(i_148_, i_149_, i_152_, i_151_, class91_sub20_sub7.aBoolean2315, (short) 143);
					}
				} else if (i_152_ == 3) {
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (-1 == class91_sub20_sub7.anInt2320 * 963101581 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method772(3, i_151_, is, i_161_, i_160_, i_162_, (short) 19136);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_150_, 3, i_151_, i_147_, i_148_, i_149_, 963101581 * class91_sub20_sub7.anInt2320, true, null);
					}
					class39.method298(i, i_148_, i_149_, i_160_, class91_sub20_sub14, null, Class102.anIntArray1303[i_151_], 0, i_163_, i_164_);
					if (1727180835 * class91_sub20_sub7.anInt2314 != 0) {
						class76.method455(i_148_, i_149_, i_152_, i_151_, class91_sub20_sub7.aBoolean2315, (short) 143);
					}
				} else if (9 == i_152_) {
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (-1 == 963101581 * class91_sub20_sub7.anInt2320 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method772(i_152_, i_151_, is, i_161_, i_160_, i_162_, (short) -14599);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_150_, i_152_, i_151_, i_147_, i_148_, i_149_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
					}
					class39.method291(i, i_148_, i_149_, i_160_, 1, 1, class91_sub20_sub14, 0, i_163_, i_164_);
					if (class91_sub20_sub7.anInt2314 * 1727180835 != 0) {
						class76.method456(i_148_, i_149_, i_154_, i_155_, class91_sub20_sub7.aBoolean2315, 1244572394);
					}
				} else if (4 == i_152_) {
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (class91_sub20_sub7.anInt2320 * 963101581 == -1 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method772(4, i_151_, is, i_161_, i_160_, i_162_, (short) 22153);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_150_, 4, i_151_, i_147_, i_148_, i_149_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
					}
					class39.method290(i, i_148_, i_149_, i_160_, class91_sub20_sub14, null, Class102.anIntArray1302[i_151_], 0, 0, 0, i_163_, i_164_);
				} else if (5 == i_152_) {
					int i_167_ = 16;
					final int i_168_ = class39.method303(i, i_148_, i_149_);
					if (i_168_ != 0) {
						i_167_ = Class60.method392(i_168_ >> 14 & 0x7fff, 394127409).anInt2321 * 570442491;
					}
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (-1 == 963101581 * class91_sub20_sub7.anInt2320 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method772(4, i_151_, is, i_161_, i_160_, i_162_, (short) 20139);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_150_, 4, i_151_, i_147_, i_148_, i_149_, 963101581 * class91_sub20_sub7.anInt2320, true, null);
					}
					class39.method290(i, i_148_, i_149_, i_160_, class91_sub20_sub14, null, Class102.anIntArray1302[i_151_], 0, i_167_ * Class102.anIntArray1293[i_151_], Class102.anIntArray1305[i_151_] * i_167_, i_163_, i_164_);
				} else if (6 == i_152_) {
					int i_169_ = 8;
					final int i_170_ = class39.method303(i, i_148_, i_149_);
					if (i_170_ != 0) {
						i_169_ = Class60.method392(i_170_ >> 14 & 0x7fff, -277135603).anInt2321 * 570442491 / 2;
					}
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (-1 == 963101581 * class91_sub20_sub7.anInt2320 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method772(4, 4 + i_151_, is, i_161_, i_160_, i_162_, (short) 7998);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_150_, 4, 4 + i_151_, i_147_, i_148_, i_149_, 963101581 * class91_sub20_sub7.anInt2320, true, null);
					}
					class39.method290(i, i_148_, i_149_, i_160_, class91_sub20_sub14, null, 256, i_151_, i_169_ * Class102.anIntArray1306[i_151_], Class102.anIntArray1312[i_151_] * i_169_, i_163_, i_164_);
				} else if (i_152_ == 7) {
					final int i_171_ = 2 + i_151_ & 0x3;
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (-1 == 963101581 * class91_sub20_sub7.anInt2320 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method772(4, 4 + i_171_, is, i_161_, i_160_, i_162_, (short) 16486);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_150_, 4, 4 + i_171_, i_147_, i_148_, i_149_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
					}
					class39.method290(i, i_148_, i_149_, i_160_, class91_sub20_sub14, null, 256, i_171_, 0, 0, i_163_, i_164_);
				} else if (i_152_ == 8) {
					int i_172_ = 8;
					final int i_173_ = class39.method303(i, i_148_, i_149_);
					if (i_173_ != 0) {
						i_172_ = Class60.method392(i_173_ >> 14 & 0x7fff, -1706636980).anInt2321 * 570442491 / 2;
					}
					final int i_174_ = 2 + i_151_ & 0x3;
					Class91_Sub20_Sub14 class91_sub20_sub14;
					Class91_Sub20_Sub14 class91_sub20_sub14_175_;
					if (class91_sub20_sub7.anInt2320 * 963101581 == -1 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method772(4, i_151_ + 4, is, i_161_, i_160_, i_162_, (short) -18394);
						class91_sub20_sub14_175_ = class91_sub20_sub7.method772(4, 4 + i_174_, is, i_161_, i_160_, i_162_, (short) 24111);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_150_, 4, 4 + i_151_, i_147_, i_148_, i_149_, 963101581 * class91_sub20_sub7.anInt2320, true, null);
						class91_sub20_sub14_175_ = new Class91_Sub20_Sub14_Sub5(i_150_, 4, 4 + i_174_, i_147_, i_148_, i_149_, 963101581 * class91_sub20_sub7.anInt2320, true, null);
					}
					class39.method290(i, i_148_, i_149_, i_160_, class91_sub20_sub14, class91_sub20_sub14_175_, 256, i_151_, i_172_ * Class102.anIntArray1306[i_151_], Class102.anIntArray1312[i_151_] * i_172_, i_163_, i_164_);
				}
			} else {
				Class91_Sub20_Sub14 class91_sub20_sub14;
				if (-1 == 963101581 * class91_sub20_sub7.anInt2320 && class91_sub20_sub7.anIntArray2305 == null) {
					class91_sub20_sub14 = class91_sub20_sub7.method772(10, i_151_, is, i_161_, i_160_, i_162_, (short) -24601);
				} else {
					class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_150_, 10, i_151_, i_147_, i_148_, i_149_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
				}
				if (class91_sub20_sub14 != null) {
					class39.method291(i, i_148_, i_149_, i_160_, i_154_, i_155_, class91_sub20_sub14, i_152_ == 11 ? 256 : 0, i_163_, i_164_);
				}
				if (1727180835 * class91_sub20_sub7.anInt2314 != 0) {
					class76.method456(i_148_, i_149_, i_154_, i_155_, class91_sub20_sub7.aBoolean2315, -1327320392);
				}
			}
		} catch (final RuntimeException var28) {
			throw Class102.method1086(var28, "cc.v()");
		}
	}

	public static int method265(int i, final int i_176_) {
		int i_177_;
		try {
			int i_178_ = 0;
			if (i < 0) {
				/* empty */
			}
			i >>>= 16;
			i_178_ += 16;
			if (i >= 256) {
				i >>>= 8;
				i_178_ += 8;
			}
			if (i >= 16) {
				i >>>= 4;
				i_178_ += 4;
			}
			if (i >= 4) {
				i >>>= 2;
				i_178_ += 2;
			}
			if (i >= 1) {
				i >>>= 1;
				i_178_++;
			}
			i_177_ = i_178_ + i;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "cc.f()");
		}
		return i_177_;
	}

	public abstract void method266(Graphics graphics, int i, int i_179_, int i_180_, int i_181_);

	public final void method267(final byte i) {
		try {
			Class91_Sub20_Sub13.method819(anIntArray339, this.anInt338 * -1155065081, this.anInt342 * 166931293);
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "cc.av()");
		}
	}
}
