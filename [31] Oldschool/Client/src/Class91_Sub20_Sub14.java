/* Class91_Sub20_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

public abstract class Class91_Sub20_Sub14 extends Class91_Sub20 {
	static int anInt2487;
	public int anInt2488;
	public static final int anInt2489 = 63;

	protected Class91_Sub20_Sub14_Sub3 method915(final int i) {
		return null;
	}

	protected Class91_Sub20_Sub14() {
		try {
			anInt2488 = -1637223320;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "cr.<init>()");
		}
	}

	void method916(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final int i_7_) {
		try {
			final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3 = method915(716778512);
			if (class91_sub20_sub14_sub3 != null) {
				anInt2488 = class91_sub20_sub14_sub3.anInt2488 * 1;
				class91_sub20_sub14_sub3.method916(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_);
			}
		} catch (final RuntimeException var11) {
			throw Class102.method1086(var11, "cr.ae()");
		}
	}

	static final int method917(final int i) {
		do {
			int i_8_;
			try {
				if (Class91_Sub20_Sub14_Sub4.aClass108_2769.aBoolean1401) {
					return -1723088013 * Class100.anInt1248;
				}
				final int i_9_ = Class4.method92(Class101.anInt1288 * -393490213, 2015226289 * Class105.anInt1365, -1723088013 * Class100.anInt1248, -1544410667);
				if (i_9_ - Class100.anInt1244 * 1224950237 >= 800 || (Class102.aByteArrayArrayArray1299[Class100.anInt1248 * -1723088013][-393490213 * Class101.anInt1288 >> 7][2015226289 * Class105.anInt1365 >> 7] & 0x4) == 0) {
					break;
				}
				i_8_ = -1723088013 * Class100.anInt1248;
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "cr.ag()");
			}
			return i_8_;
		} while (false);
		return 3;
	}

	static final void method918(final byte[] is, final int i, final int i_10_, final int i_11_, final int i_12_, final Class76[] class76s, final int i_13_) {
		try {
			for (int i_14_ = 0; i_14_ < 4; i_14_++) {
				for (int i_15_ = 0; i_15_ < 64; i_15_++) {
					for (int i_16_ = 0; i_16_ < 64; i_16_++) {
						if (i + i_15_ > 0 && i + i_15_ < 103 && i_10_ + i_16_ > 0 && i_16_ + i_10_ < 103) {
							class76s[i_14_].anIntArrayArray1085[i + i_15_][i_10_ + i_16_] &= ~0x1000000;
						}
					}
				}
			}
			final ByteBuffer class91_sub9 = new ByteBuffer(is);
			for (int i_17_ = 0; i_17_ < 4; i_17_++) {
				for (int i_18_ = 0; i_18_ < 64; i_18_++) {
					for (int i_19_ = 0; i_19_ < 64; i_19_++) {
						Class91_Sub20_Sub14_Sub1_Sub1.method933(class91_sub9, i_17_, i + i_18_, i_19_ + i_10_, i_11_, i_12_, 0, (byte) -121);
					}
				}
			}
		} catch (final RuntimeException var11) {
			throw Class102.method1086(var11, "cr.f()");
		}
	}

	static void method919(final Class91_Sub21 class91_sub21, final short i) {
		try {
			final Object[] objects = class91_sub21.anObjectArray2100;
			final int i_20_ = ((Integer) objects[0]).intValue();
			Class91_Sub20_Sub17 class91_sub20_sub17 = Class91_Sub7.method624(i_20_, 1445043960);
			if (class91_sub20_sub17 != null) {
				int i_21_ = 0;
				int i_22_ = 0;
				int i_23_ = -1;
				int[] is = class91_sub20_sub17.anIntArray2504;
				int[] is_24_ = class91_sub20_sub17.anIntArray2505;
				Class107.anInt1391 = 0;
				try {
					Class107.anIntArray1385 = new int[1477411183 * class91_sub20_sub17.anInt2507];
					int i_26_ = 0;
					Class107.aStringArray1386 = new String[-1545886405 * class91_sub20_sub17.anInt2508];
					int i_27_ = 0;
					for (int i_28_ = 1; i_28_ < objects.length; i_28_++) {
						if (objects[i_28_] instanceof Integer) {
							int i_29_ = ((Integer) objects[i_28_]).intValue();
							if (-2147483647 == i_29_) {
								i_29_ = class91_sub21.anInt2091 * -501783095;
							}
							if (i_29_ == -2147483646) {
								i_29_ = class91_sub21.anInt2096 * 647592863;
							}
							if (-2147483645 == i_29_) {
								i_29_ = class91_sub21.aClass91_Sub18_2090 != null ? -1026201747 * class91_sub21.aClass91_Sub18_2090.anInt2032 : -1;
							}
							if (-2147483644 == i_29_) {
								i_29_ = class91_sub21.anInt2092 * 356482559;
							}
							if (-2147483643 == i_29_) {
								i_29_ = class91_sub21.aClass91_Sub18_2090 != null ? class91_sub21.aClass91_Sub18_2090.anInt2012 * -819014149 : -1;
							}
							if (-2147483642 == i_29_) {
								i_29_ = class91_sub21.aClass91_Sub18_2094 != null ? -1026201747 * class91_sub21.aClass91_Sub18_2094.anInt2032 : -1;
							}
							if (-2147483641 == i_29_) {
								i_29_ = class91_sub21.aClass91_Sub18_2094 != null ? class91_sub21.aClass91_Sub18_2094.anInt2012 * -819014149 : -1;
							}
							if (-2147483640 == i_29_) {
								i_29_ = 824426613 * class91_sub21.anInt2093;
							}
							if (-2147483639 == i_29_) {
								i_29_ = 1791870499 * class91_sub21.anInt2098;
							}
							Class107.anIntArray1385[i_26_++] = i_29_;
						} else if (objects[i_28_] instanceof String) {
							String string = (String) objects[i_28_];
							if (string.equals("event_opbase")) {
								string = class91_sub21.aString2097;
							}
							Class107.aStringArray1386[i_27_++] = string;
						}
					}
					int i_30_ = 0;
					while_17_: for (;;) {
						if (++i_30_ > 200000) {
							throw new RuntimeException();
						}
						i_23_++;
						int i_31_ = is[i_23_];
						if (i_31_ < 100) {
							if (i_31_ == 0) {
								Class107.anIntArray1387[i_21_++] = is_24_[i_23_];
								continue;
							}
							if (i_31_ == 1) {
								final int i_32_ = is_24_[i_23_];
								Class107.anIntArray1387[i_21_++] = Class93.anIntArray1199[i_32_];
								continue;
							}
							if (i_31_ == 2) {
								final int i_33_ = is_24_[i_23_];
								i_21_--;
								Class93.anIntArray1199[i_33_] = Class107.anIntArray1387[i_21_];
								Class91_Sub5.method617(i_33_, (byte) 96);
								continue;
							}
							if (i_31_ == 3) {
								Class107.aStringArray1388[i_22_++] = class91_sub20_sub17.aStringArray2512[i_23_];
								continue;
							}
							if (i_31_ == 6) {
								i_23_ += is_24_[i_23_];
								continue;
							}
							if (7 == i_31_) {
								i_21_ -= 2;
								if (Class107.anIntArray1387[1 + i_21_] != Class107.anIntArray1387[i_21_]) {
									i_23_ += is_24_[i_23_];
								}
								continue;
							}
							if (i_31_ == 8) {
								i_21_ -= 2;
								if (Class107.anIntArray1387[i_21_ + 1] == Class107.anIntArray1387[i_21_]) {
									i_23_ += is_24_[i_23_];
								}
								continue;
							}
							if (i_31_ == 9) {
								i_21_ -= 2;
								if (Class107.anIntArray1387[i_21_] < Class107.anIntArray1387[i_21_ + 1]) {
									i_23_ += is_24_[i_23_];
								}
								continue;
							}
							if (10 == i_31_) {
								i_21_ -= 2;
								if (Class107.anIntArray1387[i_21_] > Class107.anIntArray1387[i_21_ + 1]) {
									i_23_ += is_24_[i_23_];
								}
								continue;
							}
							if (i_31_ == 21) {
								if (Class107.anInt1391 * -788349887 != 0) {
									final Class105 class105 = Class107.aClass105Array1392[(Class107.anInt1391 -= -601402431) * -788349887];
									class91_sub20_sub17 = class105.aClass91_Sub20_Sub17_1361;
									is = class91_sub20_sub17.anIntArray2504;
									is_24_ = class91_sub20_sub17.anIntArray2505;
									i_23_ = class105.anInt1364 * -1107097959;
									Class107.anIntArray1385 = class105.anIntArray1362;
									Class107.aStringArray1386 = class105.aStringArray1363;
									continue;
								}
								return;
							}
							if (i_31_ == 25) {
								final int i_34_ = is_24_[i_23_];
								Class107.anIntArray1387[i_21_++] = Class75.method453(i_34_, 81920);
								continue;
							}
							if (i_31_ == 27) {
								final int i_35_ = is_24_[i_23_];
								i_21_--;
								int i_36_ = Class107.anIntArray1387[i_21_];
								Class91_Sub20_Sub4 class91_sub20_sub4 = (Class91_Sub20_Sub4) Class91_Sub20_Sub4.aClass96_2254.method1068(i_35_);
								Class91_Sub20_Sub4 class91_sub20_sub4_37_;
								if (class91_sub20_sub4 != null) {
									class91_sub20_sub4_37_ = class91_sub20_sub4;
								} else {
									final byte[] is_38_ = Class91_Sub20_Sub4.aClass63_2258.getFile(14, i_35_, -1111170184);
									class91_sub20_sub4 = new Class91_Sub20_Sub4();
									if (is_38_ != null) {
										class91_sub20_sub4.method748(new ByteBuffer(is_38_), (byte) 2);
									}
									Class91_Sub20_Sub4.aClass96_2254.method1067(class91_sub20_sub4, i_35_);
									class91_sub20_sub4_37_ = class91_sub20_sub4;
								}
								final int i_39_ = class91_sub20_sub4_37_.anInt2256 * 151898745;
								final int i_40_ = -798010987 * class91_sub20_sub4_37_.anInt2257;
								final int i_41_ = -161107005 * class91_sub20_sub4_37_.anInt2255;
								int i_42_ = Class93.anIntArray1198[i_41_ - i_40_];
								if (i_36_ < 0 || i_36_ > i_42_) {
									i_36_ = 0;
								}
								i_42_ <<= i_40_;
								Class93.anIntArray1199[i_39_] = Class93.anIntArray1199[i_39_] & (i_42_ ^ 0xffffffff) | i_36_ << i_40_ & i_42_;
								continue;
							}
							if (i_31_ == 31) {
								i_21_ -= 2;
								if (Class107.anIntArray1387[i_21_] <= Class107.anIntArray1387[i_21_ + 1]) {
									i_23_ += is_24_[i_23_];
								}
								continue;
							}
							if (32 == i_31_) {
								i_21_ -= 2;
								if (Class107.anIntArray1387[i_21_] >= Class107.anIntArray1387[i_21_ + 1]) {
									i_23_ += is_24_[i_23_];
								}
								continue;
							}
							if (33 == i_31_) {
								Class107.anIntArray1387[i_21_++] = Class107.anIntArray1385[is_24_[i_23_]];
								continue;
							}
							if (34 == i_31_) {
								final int i_43_ = is_24_[i_23_];
								i_21_--;
								Class107.anIntArray1385[i_43_] = Class107.anIntArray1387[i_21_];
								continue;
							}
							if (35 == i_31_) {
								Class107.aStringArray1388[i_22_++] = Class107.aStringArray1386[is_24_[i_23_]];
								continue;
							}
							if (i_31_ == 36) {
								final int i_44_ = is_24_[i_23_];
								i_22_--;
								Class107.aStringArray1386[i_44_] = Class107.aStringArray1388[i_22_];
								continue;
							}
							if (37 == i_31_) {
								final int i_45_ = is_24_[i_23_];
								i_22_ -= i_45_;
								final String[] strings = Class107.aStringArray1388;
								String string;
								if (i_45_ == 0) {
									string = "";
								} else if (1 == i_45_) {
									final String string_46_ = strings[i_22_];
									if (string_46_ == null) {
										string = "null";
									} else {
										string = string_46_.toString();
									}
								} else {
									final int i_47_ = i_22_ + i_45_;
									int i_48_ = 0;
									for (int i_49_ = i_22_; i_49_ < i_47_; i_49_++) {
										final String string_50_ = strings[i_49_];
										if (string_50_ == null) {
											i_48_ += 4;
										} else {
											i_48_ += string_50_.length();
										}
									}
									final StringBuilder stringbuilder = new StringBuilder(i_48_);
									for (int i_51_ = i_22_; i_51_ < i_47_; i_51_++) {
										final String string_52_ = strings[i_51_];
										if (string_52_ == null) {
											stringbuilder.append("null");
										} else {
											stringbuilder.append(string_52_);
										}
									}
									string = stringbuilder.toString();
								}
								Class107.aStringArray1388[i_22_++] = string;
								continue;
							}
							if (i_31_ == 38) {
								i_21_--;
								continue;
							}
							if (39 == i_31_) {
								i_22_--;
								continue;
							}
							if (i_31_ == 40) {
								final int i_53_ = is_24_[i_23_];
								final Class91_Sub20_Sub17 class91_sub20_sub17_54_ = Class91_Sub7.method624(i_53_, 1445043960);
								final int[] is_55_ = new int[1477411183 * class91_sub20_sub17_54_.anInt2507];
								final String[] strings = new String[class91_sub20_sub17_54_.anInt2508 * -1545886405];
								for (int i_56_ = 0; i_56_ < class91_sub20_sub17_54_.anInt2509 * 290010933; i_56_++) {
									is_55_[i_56_] = Class107.anIntArray1387[i_56_ + i_21_ - 290010933 * class91_sub20_sub17_54_.anInt2509];
								}
								for (int i_57_ = 0; i_57_ < class91_sub20_sub17_54_.anInt2513 * -276573073; i_57_++) {
									strings[i_57_] = Class107.aStringArray1388[i_22_ - class91_sub20_sub17_54_.anInt2513 * -276573073 + i_57_];
								}
								i_21_ -= 290010933 * class91_sub20_sub17_54_.anInt2509;
								i_22_ -= class91_sub20_sub17_54_.anInt2513 * -276573073;
								final Class105 class105 = new Class105();
								class105.aClass91_Sub20_Sub17_1361 = class91_sub20_sub17;
								class105.anInt1364 = -1439830615 * i_23_;
								class105.anIntArray1362 = Class107.anIntArray1385;
								class105.aStringArray1363 = Class107.aStringArray1386;
								Class107.aClass105Array1392[(Class107.anInt1391 += -601402431) * -788349887 - 1] = class105;
								class91_sub20_sub17 = class91_sub20_sub17_54_;
								is = class91_sub20_sub17_54_.anIntArray2504;
								is_24_ = class91_sub20_sub17_54_.anIntArray2505;
								i_23_ = -1;
								Class107.anIntArray1385 = is_55_;
								Class107.aStringArray1386 = strings;
								continue;
							}
							if (i_31_ == 42) {
								Class107.anIntArray1387[i_21_++] = client.anIntArray1636[is_24_[i_23_]];
								continue;
							}
							if (i_31_ == 43) {
								final int i_58_ = is_24_[i_23_];
								i_21_--;
								client.anIntArray1636[i_58_] = Class107.anIntArray1387[i_21_];
								continue;
							}
							if (44 == i_31_) {
								final int i_59_ = is_24_[i_23_] >> 16;
								final int i_60_ = is_24_[i_23_] & 0xffff;
								i_21_--;
								final int i_61_ = Class107.anIntArray1387[i_21_];
								if (i_61_ >= 0 && i_61_ <= 5000) {
									Class107.anIntArray1390[i_59_] = i_61_;
									int i_62_ = -1;
									if (105 == i_60_) {
										i_62_ = 0;
									}
									for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
										Class107.anIntArrayArray1399[i_59_][i_63_] = i_62_;
									}
								} else {
									throw new RuntimeException();
								}
								continue;
							}
							if (i_31_ == 45) {
								final int i_64_ = is_24_[i_23_];
								i_21_--;
								final int i_65_ = Class107.anIntArray1387[i_21_];
								if (i_65_ >= 0 && i_65_ < Class107.anIntArray1390[i_64_]) {
									Class107.anIntArray1387[i_21_++] = Class107.anIntArrayArray1399[i_64_][i_65_];
								} else {
									throw new RuntimeException();
								}
								continue;
							}
							if (46 == i_31_) {
								final int i_66_ = is_24_[i_23_];
								i_21_ -= 2;
								final int i_67_ = Class107.anIntArray1387[i_21_];
								if (i_67_ >= 0 && i_67_ < Class107.anIntArray1390[i_66_]) {
									Class107.anIntArrayArray1399[i_66_][i_67_] = Class107.anIntArray1387[1 + i_21_];
								} else {
									throw new RuntimeException();
								}
								continue;
							}
							if (47 == i_31_) {
								String string = client.aStringArray1637[is_24_[i_23_]];
								if (string == null) {
									string = "null";
								}
								Class107.aStringArray1388[i_22_++] = string;
								continue;
							}
							if (48 == i_31_) {
								final int i_68_ = is_24_[i_23_];
								i_22_--;
								client.aStringArray1637[i_68_] = Class107.aStringArray1388[i_22_];
								continue;
							}
						}
						boolean bool;
						if (is_24_[i_23_] == 1) {
							bool = true;
						} else {
							bool = false;
						}
						if (i_31_ < 1000) {
							if (100 == i_31_) {
								i_21_ -= 3;
								final int i_69_ = Class107.anIntArray1387[i_21_];
								final int i_70_ = Class107.anIntArray1387[i_21_ + 1];
								final int i_71_ = Class107.anIntArray1387[i_21_ + 2];
								if (i_70_ == 0) {
									throw new RuntimeException();
								}
								final Class91_Sub18 class91_sub18 = Class61.method394(i_69_, -631047529);
								if (class91_sub18.aClass91_Sub18Array2077 == null) {
									class91_sub18.aClass91_Sub18Array2077 = new Class91_Sub18[1 + i_71_];
								}
								if (class91_sub18.aClass91_Sub18Array2077.length <= i_71_) {
									final Class91_Sub18[] class91_sub18s = new Class91_Sub18[i_71_ + 1];
									for (int i_72_ = 0; i_72_ < class91_sub18.aClass91_Sub18Array2077.length; i_72_++) {
										class91_sub18s[i_72_] = class91_sub18.aClass91_Sub18Array2077[i_72_];
									}
									class91_sub18.aClass91_Sub18Array2077 = class91_sub18s;
								}
								if (i_71_ > 0 && class91_sub18.aClass91_Sub18Array2077[i_71_ - 1] == null) {
									throw new RuntimeException(new StringBuilder().append(i_71_ - 1).toString());
								}
								final Class91_Sub18 class91_sub18_73_ = new Class91_Sub18();
								class91_sub18_73_.anInt2057 = i_70_ * 1061679963;
								class91_sub18_73_.anInt1980 = (class91_sub18_73_.anInt2032 = class91_sub18.anInt2032 * 1) * -1775661341;
								class91_sub18_73_.anInt2012 = i_71_ * -837358285;
								class91_sub18_73_.aBoolean1968 = true;
								class91_sub18.aClass91_Sub18Array2077[i_71_] = class91_sub18_73_;
								if (bool) {
									Class46.aClass91_Sub18_590 = class91_sub18_73_;
								} else {
									Class91_Sub22.aClass91_Sub18_2104 = class91_sub18_73_;
								}
								Class28_Sub1.method272(class91_sub18, -1905179897);
							} else if (i_31_ == 101) {
								final Class91_Sub18 class91_sub18 = bool ? Class46.aClass91_Sub18_590 : Class91_Sub22.aClass91_Sub18_2104;
								final Class91_Sub18 class91_sub18_74_ = Class61.method394(-1026201747 * class91_sub18.anInt2032, -631047529);
								class91_sub18_74_.aClass91_Sub18Array2077[class91_sub18.anInt2012 * -819014149] = null;
								Class28_Sub1.method272(class91_sub18_74_, -1905179897);
							} else if (i_31_ == 102) {
								i_21_--;
								final Class91_Sub18 class91_sub18 = Class61.method394(Class107.anIntArray1387[i_21_], -631047529);
								class91_sub18.aClass91_Sub18Array2077 = null;
								Class28_Sub1.method272(class91_sub18, -1905179897);
							} else {
								if (i_31_ != 200) {
									break;
								}
								i_21_ -= 2;
								final int i_75_ = Class107.anIntArray1387[i_21_];
								final int i_76_ = Class107.anIntArray1387[1 + i_21_];
								final Class91_Sub18 class91_sub18 = Js5.method412(i_75_, i_76_, (byte) 1);
								if (class91_sub18 != null && -1 != i_76_) {
									Class107.anIntArray1387[i_21_++] = 1;
									if (bool) {
										Class46.aClass91_Sub18_590 = class91_sub18;
									} else {
										Class91_Sub22.aClass91_Sub18_2104 = class91_sub18;
									}
								} else {
									Class107.anIntArray1387[i_21_++] = 0;
								}
							}
						} else if ((i_31_ < 1000 || i_31_ >= 1100) && (i_31_ < 2000 || i_31_ >= 2100)) {
							if ((i_31_ < 1100 || i_31_ >= 1200) && (i_31_ < 2100 || i_31_ >= 2200)) {
								if ((i_31_ < 1200 || i_31_ >= 1300) && (i_31_ < 2200 || i_31_ >= 2300)) {
									if ((i_31_ < 1300 || i_31_ >= 1400) && (i_31_ < 2300 || i_31_ >= 2400)) {
										if (i_31_ >= 1400 && i_31_ < 1500 || i_31_ >= 2400 && i_31_ < 2500) {
											Class91_Sub18 class91_sub18;
											if (i_31_ >= 2000) {
												i_31_ -= 1000;
												i_21_--;
												class91_sub18 = Class61.method394(Class107.anIntArray1387[i_21_], -631047529);
											} else {
												class91_sub18 = bool ? Class46.aClass91_Sub18_590 : Class91_Sub22.aClass91_Sub18_2104;
											}
											i_22_--;
											String string = Class107.aStringArray1388[i_22_];
											int[] is_77_ = null;
											if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
												i_21_--;
												int i_78_ = Class107.anIntArray1387[i_21_];
												if (i_78_ > 0) {
													is_77_ = new int[i_78_];
													while (i_78_-- > 0) {
														i_21_--;
														is_77_[i_78_] = Class107.anIntArray1387[i_21_];
													}
												}
												string = string.substring(0, string.length() - 1);
											}
											Object[] objects_79_ = new Object[string.length() + 1];
											for (int i_80_ = objects_79_.length - 1; i_80_ >= 1; i_80_--) {
												if (string.charAt(i_80_ - 1) == 's') {
													i_22_--;
													objects_79_[i_80_] = Class107.aStringArray1388[i_22_];
												} else {
													i_21_--;
													objects_79_[i_80_] = new Integer(Class107.anIntArray1387[i_21_]);
												}
											}
											i_21_--;
											final int i_81_ = Class107.anIntArray1387[i_21_];
											if (-1 != i_81_) {
												objects_79_[0] = new Integer(i_81_);
											} else {
												objects_79_ = null;
											}
											if (i_31_ == 1400) {
												class91_sub18.anObjectArray2038 = objects_79_;
											}
											if (1401 == i_31_) {
												class91_sub18.anObjectArray2041 = objects_79_;
											}
											if (i_31_ == 1402) {
												class91_sub18.anObjectArray2052 = objects_79_;
											}
											if (1403 == i_31_) {
												class91_sub18.anObjectArray2042 = objects_79_;
											}
											if (1404 == i_31_) {
												class91_sub18.anObjectArray2044 = objects_79_;
											}
											if (i_31_ == 1405) {
												class91_sub18.anObjectArray2050 = objects_79_;
											}
											if (i_31_ == 1406) {
												class91_sub18.anObjectArray1990 = objects_79_;
											}
											if (1407 == i_31_) {
												class91_sub18.anObjectArray2049 = objects_79_;
												class91_sub18.anIntArray2047 = is_77_;
											}
											if (1408 == i_31_) {
												class91_sub18.anObjectArray2051 = objects_79_;
											}
											if (1409 == i_31_) {
												class91_sub18.anObjectArray2028 = objects_79_;
											}
											if (i_31_ == 1410) {
												class91_sub18.anObjectArray2046 = objects_79_;
											}
											if (1411 == i_31_) {
												class91_sub18.anObjectArray2022 = objects_79_;
											}
											if (i_31_ == 1412) {
												class91_sub18.anObjectArray2043 = objects_79_;
											}
											if (1414 == i_31_) {
												class91_sub18.anObjectArray2023 = objects_79_;
												class91_sub18.anIntArray1998 = is_77_;
											}
											if (1415 == i_31_) {
												class91_sub18.anObjectArray2013 = objects_79_;
												class91_sub18.anIntArray2080 = is_77_;
											}
											if (1416 == i_31_) {
												class91_sub18.anObjectArray2053 = objects_79_;
											}
											if (1417 == i_31_) {
												class91_sub18.anObjectArray2054 = objects_79_;
											}
											if (1418 == i_31_) {
												class91_sub18.anObjectArray2058 = objects_79_;
											}
											if (1419 == i_31_) {
												class91_sub18.anObjectArray2059 = objects_79_;
											}
											if (1420 == i_31_) {
												class91_sub18.anObjectArray1964 = objects_79_;
											}
											if (i_31_ == 1421) {
												class91_sub18.anObjectArray2011 = objects_79_;
											}
											if (1422 == i_31_) {
												class91_sub18.anObjectArray2062 = objects_79_;
											}
											if (1423 == i_31_) {
												class91_sub18.anObjectArray2063 = objects_79_;
											}
											if (i_31_ == 1424) {
												class91_sub18.anObjectArray2064 = objects_79_;
											}
											class91_sub18.aBoolean2036 = true;
										} else if (i_31_ < 1600) {
											final Class91_Sub18 class91_sub18 = bool ? Class46.aClass91_Sub18_590 : Class91_Sub22.aClass91_Sub18_2104;
											if (i_31_ == 1500) {
												Class107.anIntArray1387[i_21_++] = -1211939919 * class91_sub18.anInt1974;
											} else if (i_31_ == 1501) {
												Class107.anIntArray1387[i_21_++] = class91_sub18.anInt1972 * -529547265;
											} else if (i_31_ == 1502) {
												Class107.anIntArray1387[i_21_++] = -538789309 * class91_sub18.anInt1978;
											} else if (1503 == i_31_) {
												Class107.anIntArray1387[i_21_++] = -1807498407 * class91_sub18.anInt1979;
											} else if (i_31_ == 1504) {
												Class107.anIntArray1387[i_21_++] = class91_sub18.aBoolean1981 ? 1 : 0;
											} else {
												if (1505 != i_31_) {
													break;
												}
												Class107.anIntArray1387[i_21_++] = class91_sub18.anInt1980 * 777859439;
											}
										} else if (i_31_ < 1700) {
											final Class91_Sub18 class91_sub18 = bool ? Class46.aClass91_Sub18_590 : Class91_Sub22.aClass91_Sub18_2104;
											if (i_31_ == 1600) {
												Class107.anIntArray1387[i_21_++] = 1910750647 * class91_sub18.anInt1982;
											} else if (i_31_ == 1601) {
												Class107.anIntArray1387[i_21_++] = 1916118407 * class91_sub18.anInt2048;
											} else if (1602 == i_31_) {
												Class107.aStringArray1388[i_22_++] = class91_sub18.aString2026;
											} else if (i_31_ == 1603) {
												Class107.anIntArray1387[i_21_++] = -1653452305 * class91_sub18.anInt1969;
											} else if (1604 == i_31_) {
												Class107.anIntArray1387[i_21_++] = class91_sub18.anInt1985 * 28734823;
											} else if (i_31_ == 1605) {
												Class107.anIntArray1387[i_21_++] = 283795161 * class91_sub18.anInt2072;
											} else if (1606 == i_31_) {
												Class107.anIntArray1387[i_21_++] = 231157787 * class91_sub18.anInt2039;
											} else if (1607 == i_31_) {
												Class107.anIntArray1387[i_21_++] = 56462471 * class91_sub18.anInt2007;
											} else {
												if (1608 != i_31_) {
													break;
												}
												Class107.anIntArray1387[i_21_++] = class91_sub18.anInt2010 * 1557210095;
											}
										} else if (i_31_ < 1800) {
											final Class91_Sub18 class91_sub18 = bool ? Class46.aClass91_Sub18_590 : Class91_Sub22.aClass91_Sub18_2104;
											if (1700 == i_31_) {
												Class107.anIntArray1387[i_21_++] = -1961943349 * class91_sub18.anInt2073;
											} else if (i_31_ == 1701) {
												if (-1 != class91_sub18.anInt2073 * -1961943349) {
													Class107.anIntArray1387[i_21_++] = class91_sub18.anInt2074 * -575634201;
												} else {
													Class107.anIntArray1387[i_21_++] = 0;
												}
											} else {
												if (i_31_ != 1702) {
													break;
												}
												Class107.anIntArray1387[i_21_++] = -819014149 * class91_sub18.anInt2012;
											}
										} else if (i_31_ < 1900) {
											final Class91_Sub18 class91_sub18 = bool ? Class46.aClass91_Sub18_590 : Class91_Sub22.aClass91_Sub18_2104;
											if (1800 == i_31_) {
												Class107.anIntArray1387[i_21_++] = Class91_Sub20_Sub2.method736(Class17.method182(class91_sub18, 1821988257), 1624502670);
											} else if (i_31_ == 1801) {
												i_21_--;
												int i_82_ = Class107.anIntArray1387[i_21_];
												i_82_--;
												if (class91_sub18.aStringArray1991 != null && i_82_ < class91_sub18.aStringArray1991.length && class91_sub18.aStringArray1991[i_82_] != null) {
													Class107.aStringArray1388[i_22_++] = class91_sub18.aStringArray1991[i_82_];
												} else {
													Class107.aStringArray1388[i_22_++] = "";
												}
											} else {
												if (1802 != i_31_) {
													break;
												}
												if (class91_sub18.aString2029 == null) {
													Class107.aStringArray1388[i_22_++] = "";
												} else {
													Class107.aStringArray1388[i_22_++] = class91_sub18.aString2029;
												}
											}
										} else if (i_31_ < 2600) {
											i_21_--;
											final Class91_Sub18 class91_sub18 = Class61.method394(Class107.anIntArray1387[i_21_], -631047529);
											if (2500 == i_31_) {
												Class107.anIntArray1387[i_21_++] = class91_sub18.anInt1974 * -1211939919;
											} else if (i_31_ == 2501) {
												Class107.anIntArray1387[i_21_++] = class91_sub18.anInt1972 * -529547265;
											} else if (2502 == i_31_) {
												Class107.anIntArray1387[i_21_++] = -538789309 * class91_sub18.anInt1978;
											} else if (i_31_ == 2503) {
												Class107.anIntArray1387[i_21_++] = class91_sub18.anInt1979 * -1807498407;
											} else if (i_31_ == 2504) {
												Class107.anIntArray1387[i_21_++] = class91_sub18.aBoolean1981 ? 1 : 0;
											} else {
												if (2505 != i_31_) {
													break;
												}
												Class107.anIntArray1387[i_21_++] = class91_sub18.anInt1980 * 777859439;
											}
										} else if (i_31_ < 2700) {
											i_21_--;
											final Class91_Sub18 class91_sub18 = Class61.method394(Class107.anIntArray1387[i_21_], -631047529);
											if (i_31_ == 2600) {
												Class107.anIntArray1387[i_21_++] = class91_sub18.anInt1982 * 1910750647;
											} else if (2601 == i_31_) {
												Class107.anIntArray1387[i_21_++] = class91_sub18.anInt2048 * 1916118407;
											} else if (i_31_ == 2602) {
												Class107.aStringArray1388[i_22_++] = class91_sub18.aString2026;
											} else if (i_31_ == 2603) {
												Class107.anIntArray1387[i_21_++] = -1653452305 * class91_sub18.anInt1969;
											} else if (i_31_ == 2604) {
												Class107.anIntArray1387[i_21_++] = 28734823 * class91_sub18.anInt1985;
											} else if (i_31_ == 2605) {
												Class107.anIntArray1387[i_21_++] = class91_sub18.anInt2072 * 283795161;
											} else if (i_31_ == 2606) {
												Class107.anIntArray1387[i_21_++] = 231157787 * class91_sub18.anInt2039;
											} else if (i_31_ == 2607) {
												Class107.anIntArray1387[i_21_++] = 56462471 * class91_sub18.anInt2007;
											} else {
												if (2608 != i_31_) {
													break;
												}
												Class107.anIntArray1387[i_21_++] = class91_sub18.anInt2010 * 1557210095;
											}
										} else if (i_31_ < 2800) {
											if (2700 == i_31_) {
												i_21_--;
												final Class91_Sub18 class91_sub18 = Class61.method394(Class107.anIntArray1387[i_21_], -631047529);
												Class107.anIntArray1387[i_21_++] = class91_sub18.anInt2073 * -1961943349;
											} else if (2701 == i_31_) {
												i_21_--;
												final Class91_Sub18 class91_sub18 = Class61.method394(Class107.anIntArray1387[i_21_], -631047529);
												if (-1 != class91_sub18.anInt2073 * -1961943349) {
													Class107.anIntArray1387[i_21_++] = class91_sub18.anInt2074 * -575634201;
												} else {
													Class107.anIntArray1387[i_21_++] = 0;
												}
											} else {
												if (2702 != i_31_) {
													break;
												}
												i_21_--;
												final int i_83_ = Class107.anIntArray1387[i_21_];
												final Class91_Sub10 class91_sub10 = (Class91_Sub10) client.aClass83_1603.method474(i_83_);
												if (class91_sub10 != null) {
													Class107.anIntArray1387[i_21_++] = 1;
												} else {
													Class107.anIntArray1387[i_21_++] = 0;
												}
											}
										} else if (i_31_ < 2900) {
											i_21_--;
											final Class91_Sub18 class91_sub18 = Class61.method394(Class107.anIntArray1387[i_21_], -631047529);
											if (i_31_ == 2800) {
												Class107.anIntArray1387[i_21_++] = Class91_Sub20_Sub2.method736(Class17.method182(class91_sub18, -975241752), 1483625658);
											} else if (i_31_ == 2801) {
												i_21_--;
												int i_84_ = Class107.anIntArray1387[i_21_];
												i_84_--;
												if (class91_sub18.aStringArray1991 != null && i_84_ < class91_sub18.aStringArray1991.length && class91_sub18.aStringArray1991[i_84_] != null) {
													Class107.aStringArray1388[i_22_++] = class91_sub18.aStringArray1991[i_84_];
												} else {
													Class107.aStringArray1388[i_22_++] = "";
												}
											} else {
												if (i_31_ != 2802) {
													break;
												}
												if (class91_sub18.aString2029 == null) {
													Class107.aStringArray1388[i_22_++] = "";
												} else {
													Class107.aStringArray1388[i_22_++] = class91_sub18.aString2029;
												}
											}
										} else if (i_31_ < 3200) {
											if (3100 == i_31_) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												Class101.method1076(0, "", string, 1273430195);
											} else if (3101 == i_31_) {
												i_21_ -= 2;
												Class91_Sub20_Sub12.method818(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316, Class107.anIntArray1387[i_21_], Class107.anIntArray1387[i_21_ + 1], 1293462691);
											} else if (i_31_ == 3103) {
												client.aClass91_Sub9_Sub1_1478.method690(255, 1160292001);
												for (Class91_Sub10 class91_sub10 = (Class91_Sub10) client.aClass83_1603.method476(); class91_sub10 != null; class91_sub10 = (Class91_Sub10) client.aClass83_1603.method477()) {
													if (-1304072595 * class91_sub10.anInt1868 == 0 || -1304072595 * class91_sub10.anInt1868 == 3) {
														Class102.method1081(class91_sub10, true, -1363054508);
													}
												}
												if (client.aClass91_Sub18_1606 != null) {
													Class28_Sub1.method272(client.aClass91_Sub18_1606, -1905179897);
													client.aClass91_Sub18_1606 = null;
												}
											} else if (3104 == i_31_) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												int i_85_ = 0;
												if (Class102.method1088(string, 1245248647)) {
													final int i_86_ = Class40.method340(string, 10, true, -2005995539);
													i_85_ = i_86_;
												}
												client.aClass91_Sub9_Sub1_1478.method690(163, 1160292001);
												client.aClass91_Sub9_Sub1_1478.writeDWord(i_85_);
											} else if (3105 == i_31_) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												client.aClass91_Sub9_Sub1_1478.method690(104, 1160292001);
												client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(string.length() + 1);
												client.aClass91_Sub9_Sub1_1478.method634(string, (byte) 21);
											} else if (i_31_ == 3106) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												client.aClass91_Sub9_Sub1_1478.method690(180, 1160292001);
												client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(string.length() + 1);
												client.aClass91_Sub9_Sub1_1478.method634(string, (byte) 25);
											} else if (i_31_ == 3107) {
												i_21_--;
												final int i_87_ = Class107.anIntArray1387[i_21_];
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												boolean bool_88_ = false;
												for (int i_89_ = 0; i_89_ < client.anInt1563 * 735674511; i_89_++) {
													final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[client.anIntArray1483[i_89_]];
													if (class91_sub20_sub14_sub1_sub1 != null && class91_sub20_sub14_sub1_sub1.aString2841 != null && class91_sub20_sub14_sub1_sub1.aString2841.equalsIgnoreCase(string)) {
														Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub1.anIntArray2603[0], class91_sub20_sub14_sub1_sub1.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, -1919749710);
														if (i_87_ == 1) {
															client.aClass91_Sub9_Sub1_1478.method690(2, 1160292001);
															client.aClass91_Sub9_Sub1_1478.method679(client.anIntArray1483[i_89_], -1122561687);
														} else if (4 == i_87_) {
															client.aClass91_Sub9_Sub1_1478.method690(142, 1160292001);
															client.aClass91_Sub9_Sub1_1478.method679(client.anIntArray1483[i_89_], -1122561687);
														} else if (i_87_ == 6) {
															client.aClass91_Sub9_Sub1_1478.method690(198, 1160292001);
															client.aClass91_Sub9_Sub1_1478.method660(client.anIntArray1483[i_89_], (byte) 32);
														} else if (i_87_ == 7) {
															client.aClass91_Sub9_Sub1_1478.method690(254, 1160292001);
															client.aClass91_Sub9_Sub1_1478.method681(client.anIntArray1483[i_89_], -372694149);
														}
														bool_88_ = true;
														break;
													}
												}
												if (!bool_88_) {
													Class101.method1076(0, "", new StringBuilder(Class75.aString932).append(string).toString(), 1448283627);
												}
											} else if (i_31_ == 3108) {
												i_21_ -= 3;
												final int i_90_ = Class107.anIntArray1387[i_21_];
												final int i_91_ = Class107.anIntArray1387[i_21_ + 1];
												final int i_92_ = Class107.anIntArray1387[2 + i_21_];
												final Class91_Sub18 class91_sub18 = Class61.method394(i_92_, -631047529);
												Class43.method355(class91_sub18, i_90_, i_91_, 1750071663);
											} else {
												if (3109 != i_31_) {
													break;
												}
												i_21_ -= 2;
												final int i_93_ = Class107.anIntArray1387[i_21_];
												final int i_94_ = Class107.anIntArray1387[1 + i_21_];
												final Class91_Sub18 class91_sub18 = bool ? Class46.aClass91_Sub18_590 : Class91_Sub22.aClass91_Sub18_2104;
												Class43.method355(class91_sub18, i_93_, i_94_, 1970585379);
											}
										} else if (i_31_ < 3300) {
											if (i_31_ == 3200) {
												i_21_ -= 3;
												Class108.method1112(Class107.anIntArray1387[i_21_], Class107.anIntArray1387[1 + i_21_], Class107.anIntArray1387[2 + i_21_], -60092589);
											} else if (i_31_ == 3201) {
												i_21_--;
												final int i_95_ = Class107.anIntArray1387[i_21_];
												if (-1 == i_95_ && !client.aBoolean1521) {
													Class64.aClass91_Sub2_Sub4_785.method591(-2022256197);
													Class64.anInt781 = -515714225;
													Class64.aClass63_786 = null;
												} else if (i_95_ != -1 && i_95_ != 31780839 * client.anInt1678 && 1217281259 * client.anInt1677 != 0 && !client.aBoolean1521) {
													Class91_Sub24.method1049(2, Class91_Sub20_Sub2.aClass63_Sub1_2232, i_95_, 0, 1217281259 * client.anInt1677, false, (byte) -12);
												}
												client.anInt1678 = -1817922601 * i_95_;
											} else {
												if (3202 != i_31_) {
													break;
												}
												i_21_ -= 2;
												Class97.method1073(Class107.anIntArray1387[i_21_], Class107.anIntArray1387[i_21_ + 1], (byte) -78);
											}
										} else if (i_31_ < 3400) {
											if (3300 == i_31_) {
												Class107.anIntArray1387[i_21_++] = client.anInt1449 * 2026135825;
											} else if (i_31_ == 3301) {
												i_21_ -= 2;
												final int i_96_ = Class107.anIntArray1387[i_21_];
												final int i_97_ = Class107.anIntArray1387[1 + i_21_];
												final int[] is_98_ = Class107.anIntArray1387;
												final int i_99_ = i_21_++;
												final Class91_Sub22 class91_sub22 = (Class91_Sub22) Class91_Sub22.aClass83_2108.method474(i_96_);
												int i_100_;
												if (class91_sub22 == null) {
													i_100_ = -1;
												} else if (i_97_ >= 0 && i_97_ < class91_sub22.anIntArray2105.length) {
													i_100_ = class91_sub22.anIntArray2105[i_97_];
												} else {
													i_100_ = -1;
												}
												is_98_[i_99_] = i_100_;
											} else if (3302 == i_31_) {
												i_21_ -= 2;
												final int i_101_ = Class107.anIntArray1387[i_21_];
												final int i_102_ = Class107.anIntArray1387[1 + i_21_];
												Class107.anIntArray1387[i_21_++] = Class102.method1083(i_101_, i_102_, -1556574448);
											} else if (3303 == i_31_) {
												i_21_ -= 2;
												final int i_103_ = Class107.anIntArray1387[i_21_];
												final int i_104_ = Class107.anIntArray1387[i_21_ + 1];
												Class107.anIntArray1387[i_21_++] = Class18.method185(i_103_, i_104_, (short) 12957);
											} else if (i_31_ == 3304) {
												i_21_--;
												final int i_105_ = Class107.anIntArray1387[i_21_];
												Class107.anIntArray1387[i_21_++] = Class32.method276(i_105_, -1233787638).anInt2231 * 445146575;
											} else if (i_31_ == 3305) {
												i_21_--;
												final int i_106_ = Class107.anIntArray1387[i_21_];
												Class107.anIntArray1387[i_21_++] = client.anIntArray1580[i_106_];
											} else if (i_31_ == 3306) {
												i_21_--;
												final int i_107_ = Class107.anIntArray1387[i_21_];
												Class107.anIntArray1387[i_21_++] = client.anIntArray1581[i_107_];
											} else if (i_31_ == 3307) {
												i_21_--;
												final int i_108_ = Class107.anIntArray1387[i_21_];
												Class107.anIntArray1387[i_21_++] = client.anIntArray1488[i_108_];
											} else if (3308 == i_31_) {
												final int i_109_ = -1723088013 * Class100.anInt1248;
												final int i_110_ = (Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 * 107578049 >> 7) + Class40.anInt541 * 1885886277;
												final int i_111_ = (Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 * -668540675 >> 7) + 1838527067 * Class91_Sub20_Sub15.anInt2497;
												Class107.anIntArray1387[i_21_++] = (i_110_ << 14) + (i_109_ << 28) + i_111_;
											} else if (i_31_ == 3309) {
												i_21_--;
												final int i_112_ = Class107.anIntArray1387[i_21_];
												Class107.anIntArray1387[i_21_++] = i_112_ >> 14 & 0x3fff;
											} else if (3310 == i_31_) {
												i_21_--;
												final int i_113_ = Class107.anIntArray1387[i_21_];
												Class107.anIntArray1387[i_21_++] = i_113_ >> 28;
											} else if (3311 == i_31_) {
												i_21_--;
												final int i_114_ = Class107.anIntArray1387[i_21_];
												Class107.anIntArray1387[i_21_++] = i_114_ & 0x3fff;
											} else if (i_31_ == 3312) {
												Class107.anIntArray1387[i_21_++] = client.aBoolean1612 ? 1 : 0;
											} else if (3313 == i_31_) {
												i_21_ -= 2;
												final int i_115_ = Class107.anIntArray1387[i_21_] + 32768;
												final int i_116_ = Class107.anIntArray1387[1 + i_21_];
												final int[] is_117_ = Class107.anIntArray1387;
												final int i_118_ = i_21_++;
												final Class91_Sub22 class91_sub22 = (Class91_Sub22) Class91_Sub22.aClass83_2108.method474(i_115_);
												int i_119_;
												if (class91_sub22 == null) {
													i_119_ = -1;
												} else if (i_116_ >= 0 && i_116_ < class91_sub22.anIntArray2105.length) {
													i_119_ = class91_sub22.anIntArray2105[i_116_];
												} else {
													i_119_ = -1;
												}
												is_117_[i_118_] = i_119_;
											} else if (3314 == i_31_) {
												i_21_ -= 2;
												final int i_120_ = Class107.anIntArray1387[i_21_] + 32768;
												final int i_121_ = Class107.anIntArray1387[1 + i_21_];
												Class107.anIntArray1387[i_21_++] = Class102.method1083(i_120_, i_121_, -2061405398);
											} else if (3315 == i_31_) {
												i_21_ -= 2;
												final int i_122_ = 32768 + Class107.anIntArray1387[i_21_];
												final int i_123_ = Class107.anIntArray1387[i_21_ + 1];
												Class107.anIntArray1387[i_21_++] = Class18.method185(i_122_, i_123_, (short) 9290);
											} else if (3316 == i_31_) {
												if (client.anInt1522 * 361234295 >= 2) {
													Class107.anIntArray1387[i_21_++] = 361234295 * client.anInt1522;
												} else {
													Class107.anIntArray1387[i_21_++] = 0;
												}
											} else if (i_31_ == 3317) {
												Class107.anIntArray1387[i_21_++] = -411580439 * client.anInt1544;
											} else if (i_31_ == 3318) {
												Class107.anIntArray1387[i_21_++] = 121784213 * client.anInt1660;
											} else if (3321 == i_31_) {
												Class107.anIntArray1387[i_21_++] = -927620125 * client.anInt1607;
											} else if (3322 == i_31_) {
												Class107.anIntArray1387[i_21_++] = client.anInt1517 * 1710859793;
											} else {
												if (3323 != i_31_) {
													break;
												}
												if (client.aBoolean1525) {
													Class107.anIntArray1387[i_21_++] = 1;
												} else {
													Class107.anIntArray1387[i_21_++] = 0;
												}
											}
										} else if (i_31_ < 3500) {
											if (i_31_ == 3400) {
												i_21_ -= 2;
												final int i_124_ = Class107.anIntArray1387[i_21_];
												final int i_125_ = Class107.anIntArray1387[1 + i_21_];
												Class91_Sub20_Sub9 class91_sub20_sub9 = Class91_Sub20_Sub14_Sub5.method1010(i_124_, (byte) 35);
												if ('s' == class91_sub20_sub9.aChar2404) {
													/* empty */
												}
												for (int i_126_ = 0; i_126_ < class91_sub20_sub9.anInt2405 * 821336233; i_126_++) {
													if (i_125_ == class91_sub20_sub9.anIntArray2406[i_126_]) {
														Class107.aStringArray1388[i_22_++] = class91_sub20_sub9.aStringArray2408[i_126_];
														class91_sub20_sub9 = null;
														break;
													}
												}
												if (class91_sub20_sub9 != null) {
													Class107.aStringArray1388[i_22_++] = class91_sub20_sub9.aString2401;
												}
											} else {
												if (3408 != i_31_) {
													break;
												}
												i_21_ -= 4;
												final int i_127_ = Class107.anIntArray1387[i_21_];
												final int i_128_ = Class107.anIntArray1387[1 + i_21_];
												final int i_129_ = Class107.anIntArray1387[i_21_ + 2];
												final int i_130_ = Class107.anIntArray1387[i_21_ + 3];
												Class91_Sub20_Sub9 class91_sub20_sub9 = Class91_Sub20_Sub14_Sub5.method1010(i_129_, (byte) 25);
												if (i_127_ == 1503518871 * class91_sub20_sub9.anInt2411 && class91_sub20_sub9.aChar2404 == i_128_) {
													for (int i_131_ = 0; i_131_ < 821336233 * class91_sub20_sub9.anInt2405; i_131_++) {
														if (class91_sub20_sub9.anIntArray2406[i_131_] == i_130_) {
															if (i_128_ == 115) {
																Class107.aStringArray1388[i_22_++] = class91_sub20_sub9.aStringArray2408[i_131_];
															} else {
																Class107.anIntArray1387[i_21_++] = class91_sub20_sub9.anIntArray2407[i_131_];
															}
															class91_sub20_sub9 = null;
															break;
														}
													}
													if (class91_sub20_sub9 != null) {
														if (i_128_ == 115) {
															Class107.aStringArray1388[i_22_++] = class91_sub20_sub9.aString2401;
														} else {
															Class107.anIntArray1387[i_21_++] = -1778538671 * class91_sub20_sub9.anInt2402;
														}
													}
												} else if (115 == i_128_) {
													Class107.aStringArray1388[i_22_++] = "null";
												} else {
													Class107.anIntArray1387[i_21_++] = 0;
												}
											}
										} else if (i_31_ < 3700) {
											if (i_31_ == 3600) {
												if (-585182637 * client.anInt1696 == 0) {
													Class107.anIntArray1387[i_21_++] = -2;
												} else if (-585182637 * client.anInt1696 == 1) {
													Class107.anIntArray1387[i_21_++] = -1;
												} else {
													Class107.anIntArray1387[i_21_++] = client.anInt1695 * -1596316121;
												}
											} else if (i_31_ == 3601) {
												i_21_--;
												final int i_132_ = Class107.anIntArray1387[i_21_];
												if (2 == -585182637 * client.anInt1696 && i_132_ < client.anInt1695 * -1596316121) {
													Class107.aStringArray1388[i_22_++] = client.aClass100Array1491[i_132_].aString1251;
												} else {
													Class107.aStringArray1388[i_22_++] = "";
												}
											} else if (3602 == i_31_) {
												i_21_--;
												final int i_133_ = Class107.anIntArray1387[i_21_];
												if (2 == -585182637 * client.anInt1696 && i_133_ < -1596316121 * client.anInt1695) {
													Class107.anIntArray1387[i_21_++] = 511422265 * client.aClass100Array1491[i_133_].anInt1240;
												} else {
													Class107.anIntArray1387[i_21_++] = 0;
												}
											} else if (3603 == i_31_) {
												i_21_--;
												final int i_134_ = Class107.anIntArray1387[i_21_];
												if (client.anInt1696 * -585182637 == 2 && i_134_ < client.anInt1695 * -1596316121) {
													Class107.anIntArray1387[i_21_++] = 103102195 * client.aClass100Array1491[i_134_].anInt1241;
												} else {
													Class107.anIntArray1387[i_21_++] = 0;
												}
											} else if (3604 == i_31_) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												i_21_--;
												final int i_135_ = Class107.anIntArray1387[i_21_];
												Class106.method1097(string, i_135_, -731984948);
											} else if (i_31_ == 3605) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												Class91_Sub20_Sub14_Sub1_Sub2.method942(string, 1872124109);
											} else if (i_31_ == 3606) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												Class91_Sub20_Sub14_Sub1_Sub2.method943(string, 1885886277);
											} else if (3607 == i_31_) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												if (string != null) {
													if ((client.anInt1493 * 8867313 < 100 || 1 == client.anInt1569 * -157033453) && client.anInt1493 * 8867313 < 400) {
														final String string_136_ = Class91_Sub20_Sub14_Sub4.method1002(string, Class41.aClass98_551, (byte) -106);
														if (string_136_ != null) {
															for (int i_137_ = 0; i_137_ < client.anInt1493 * 8867313; i_137_++) {
																final Class1 class1 = client.aClass1Array1700[i_137_];
																final String string_138_ = Class91_Sub20_Sub14_Sub4.method1002(class1.aString29, Class41.aClass98_551, (byte) -57);
																if (string_138_ != null && string_138_.equals(string_136_)) {
																	Class101.method1076(0, "", new StringBuilder(string).append(Class75.aString1009).toString(), 1811623809);
																	continue while_17_;
																}
																if (class1.aString30 != null) {
																	final String string_139_ = Class91_Sub20_Sub14_Sub4.method1002(class1.aString30, Class41.aClass98_551, (byte) 46);
																	if (string_139_ != null && string_139_.equals(string_136_)) {
																		Class101.method1076(0, "", new StringBuilder(string).append(Class75.aString1009).toString(), 2043271325);
																		continue while_17_;
																	}
																}
															}
															for (int i_140_ = 0; i_140_ < -1596316121 * client.anInt1695; i_140_++) {
																final Class100 class100 = client.aClass100Array1491[i_140_];
																final String string_141_ = Class91_Sub20_Sub14_Sub4.method1002(class100.aString1251, Class41.aClass98_551, (byte) 34);
																if (string_141_ != null && string_141_.equals(string_136_)) {
																	Class101.method1076(0, "", new StringBuilder(Class75.aString851).append(string).append(Class75.aString874).toString(), 1103026053);
																	continue while_17_;
																}
																if (class100.aString1239 != null) {
																	final String string_142_ = Class91_Sub20_Sub14_Sub4.method1002(class100.aString1239, Class41.aClass98_551, (byte) -41);
																	if (string_142_ != null && string_142_.equals(string_136_)) {
																		Class101.method1076(0, "", new StringBuilder(Class75.aString851).append(string).append(Class75.aString874).toString(), 1147831773);
																		continue while_17_;
																	}
																}
															}
															if (Class91_Sub20_Sub14_Sub4.method1002(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.aString2841, Class41.aClass98_551, (byte) -29).equals(string_136_)) {
																Class101.method1076(0, "", Class75.aString1011, 1106582320);
															} else {
																client.aClass91_Sub9_Sub1_1478.method690(63, 1160292001);
																final Class91_Sub9_Sub1 class91_sub9_sub1 = client.aClass91_Sub9_Sub1_1478;
																final int i_143_ = string.length() + 1;
																class91_sub9_sub1.writeWordBigEndian(i_143_);
																client.aClass91_Sub9_Sub1_1478.method634(string, (byte) 74);
															}
														}
													} else {
														Class101.method1076(0, "", Class75.aString1008, 1846157586);
													}
												}
											} else if (i_31_ == 3608) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												if (string != null) {
													final String string_144_ = Class91_Sub20_Sub14_Sub4.method1002(string, Class41.aClass98_551, (byte) 16);
													if (string_144_ != null) {
														for (int i_145_ = 0; i_145_ < 8867313 * client.anInt1493; i_145_++) {
															final Class1 class1 = client.aClass1Array1700[i_145_];
															final String string_146_ = class1.aString29;
															final String string_147_ = Class91_Sub20_Sub14_Sub4.method1002(string_146_, Class41.aClass98_551, (byte) 64);
															if (Class4.method88(string, string_144_, string_146_, string_147_, (byte) -87)) {
																client.anInt1493 -= -1061551343;
																for (int i_148_ = i_145_; i_148_ < 8867313 * client.anInt1493; i_148_++) {
																	client.aClass1Array1700[i_148_] = client.aClass1Array1700[1 + i_148_];
																}
																client.anInt1633 = client.anInt1640 * 602232347;
																client.aClass91_Sub9_Sub1_1478.method690(250, 1160292001);
																final Class91_Sub9_Sub1 class91_sub9_sub1 = client.aClass91_Sub9_Sub1_1478;
																final int i_149_ = string.length() + 1;
																class91_sub9_sub1.writeWordBigEndian(i_149_);
																client.aClass91_Sub9_Sub1_1478.method634(string, (byte) 83);
																break;
															}
														}
													}
												}
											} else if (3609 == i_31_) {
												i_22_--;
												String string = Class107.aStringArray1388[i_22_];
												if (string.startsWith(FloOverlayType.method747(0, 879884408)) || string.startsWith(FloOverlayType.method747(1, 1123218397))) {
													string = string.substring(7);
												}
												Class107.anIntArray1387[i_21_++] = Class91_Sub22.method1042(string, 914357821) ? 1 : 0;
											} else if (3611 == i_31_) {
												if (client.aString1619 != null) {
													Class107.aStringArray1388[i_22_++] = Class21.method207(client.aString1619, 433754411);
												} else {
													Class107.aStringArray1388[i_22_++] = "";
												}
											} else if (3612 == i_31_) {
												if (client.aString1619 != null) {
													Class107.anIntArray1387[i_21_++] = Class17.anInt241 * -579770847;
												} else {
													Class107.anIntArray1387[i_21_++] = 0;
												}
											} else if (3613 == i_31_) {
												i_21_--;
												final int i_150_ = Class107.anIntArray1387[i_21_];
												if (client.aString1619 != null && i_150_ < -579770847 * Class17.anInt241) {
													Class107.aStringArray1388[i_22_++] = ObjType.aClass91_Sub23Array2395[i_150_].aString2123;
												} else {
													Class107.aStringArray1388[i_22_++] = "";
												}
											} else if (3614 == i_31_) {
												i_21_--;
												final int i_151_ = Class107.anIntArray1387[i_21_];
												if (client.aString1619 != null && i_151_ < -579770847 * Class17.anInt241) {
													Class107.anIntArray1387[i_21_++] = 202071895 * ObjType.aClass91_Sub23Array2395[i_151_].anInt2120;
												} else {
													Class107.anIntArray1387[i_21_++] = 0;
												}
											} else if (3615 == i_31_) {
												i_21_--;
												final int i_152_ = Class107.anIntArray1387[i_21_];
												if (client.aString1619 != null && i_152_ < Class17.anInt241 * -579770847) {
													Class107.anIntArray1387[i_21_++] = ObjType.aClass91_Sub23Array2395[i_152_].aByte2116;
												} else {
													Class107.anIntArray1387[i_21_++] = 0;
												}
											} else if (i_31_ == 3616) {
												Class107.anIntArray1387[i_21_++] = FloUnderlayType.aByte2422;
											} else if (i_31_ == 3617) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												Class41.method345(string, 632527711);
											} else if (i_31_ == 3618) {
												Class107.anIntArray1387[i_21_++] = Class91_Sub11.aByte1876;
											} else if (i_31_ == 3619) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												if (!string.equals("")) {
													client.aClass91_Sub9_Sub1_1478.method690(8, 1160292001);
													final Class91_Sub9_Sub1 class91_sub9_sub1 = client.aClass91_Sub9_Sub1_1478;
													final int i_153_ = string.length() + 1;
													class91_sub9_sub1.writeWordBigEndian(i_153_);
													client.aClass91_Sub9_Sub1_1478.method634(string, (byte) 11);
												}
											} else if (i_31_ == 3620) {
												Class7.method153(969422544);
											} else if (i_31_ == 3621) {
												if (client.anInt1696 * -585182637 == 0) {
													Class107.anIntArray1387[i_21_++] = -1;
												} else {
													Class107.anIntArray1387[i_21_++] = 8867313 * client.anInt1493;
												}
											} else if (i_31_ == 3622) {
												i_21_--;
												final int i_154_ = Class107.anIntArray1387[i_21_];
												if (-585182637 * client.anInt1696 != 0 && i_154_ < client.anInt1493 * 8867313) {
													Class107.aStringArray1388[i_22_++] = client.aClass1Array1700[i_154_].aString29;
												} else {
													Class107.aStringArray1388[i_22_++] = "";
												}
											} else if (3623 == i_31_) {
												i_22_--;
												String string = Class107.aStringArray1388[i_22_];
												if (string.startsWith(FloOverlayType.method747(0, -1870788996)) || string.startsWith(FloOverlayType.method747(1, -950375560))) {
													string = string.substring(7);
												}
												Class107.anIntArray1387[i_21_++] = Class91_Sub24.method1051(string, 1879570852) ? 1 : 0;
											} else if (i_31_ == 3624) {
												i_21_--;
												final int i_155_ = Class107.anIntArray1387[i_21_];
												if (ObjType.aClass91_Sub23Array2395 != null && i_155_ < Class17.anInt241 * -579770847 && ObjType.aClass91_Sub23Array2395[i_155_].aString2123.equalsIgnoreCase(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.aString2841)) {
													Class107.anIntArray1387[i_21_++] = 1;
												} else {
													Class107.anIntArray1387[i_21_++] = 0;
												}
											} else {
												if (i_31_ != 3625) {
													break;
												}
												if (client.aString1679 != null) {
													Class107.aStringArray1388[i_22_++] = Class21.method207(client.aString1679, 433754411);
												} else {
													Class107.aStringArray1388[i_22_++] = "";
												}
											}
										} else if (i_31_ < 4100) {
											if (i_31_ == 4000) {
												i_21_ -= 2;
												final int i_156_ = Class107.anIntArray1387[i_21_];
												final int i_157_ = Class107.anIntArray1387[i_21_ + 1];
												Class107.anIntArray1387[i_21_++] = i_157_ + i_156_;
											} else if (4001 == i_31_) {
												i_21_ -= 2;
												final int i_158_ = Class107.anIntArray1387[i_21_];
												final int i_159_ = Class107.anIntArray1387[1 + i_21_];
												Class107.anIntArray1387[i_21_++] = i_158_ - i_159_;
											} else if (i_31_ == 4002) {
												i_21_ -= 2;
												final int i_160_ = Class107.anIntArray1387[i_21_];
												final int i_161_ = Class107.anIntArray1387[i_21_ + 1];
												Class107.anIntArray1387[i_21_++] = i_161_ * i_160_;
											} else if (i_31_ == 4003) {
												i_21_ -= 2;
												final int i_162_ = Class107.anIntArray1387[i_21_];
												final int i_163_ = Class107.anIntArray1387[i_21_ + 1];
												Class107.anIntArray1387[i_21_++] = i_162_ / i_163_;
											} else if (4004 == i_31_) {
												i_21_--;
												final int i_164_ = Class107.anIntArray1387[i_21_];
												Class107.anIntArray1387[i_21_++] = (int) (Math.random() * i_164_);
											} else if (4005 == i_31_) {
												i_21_--;
												final int i_165_ = Class107.anIntArray1387[i_21_];
												Class107.anIntArray1387[i_21_++] = (int) (Math.random() * (1 + i_165_));
											} else if (i_31_ == 4006) {
												i_21_ -= 5;
												final int i_166_ = Class107.anIntArray1387[i_21_];
												final int i_167_ = Class107.anIntArray1387[1 + i_21_];
												final int i_168_ = Class107.anIntArray1387[i_21_ + 2];
												final int i_169_ = Class107.anIntArray1387[i_21_ + 3];
												final int i_170_ = Class107.anIntArray1387[4 + i_21_];
												Class107.anIntArray1387[i_21_++] = i_166_ + (i_167_ - i_166_) * (i_170_ - i_168_) / (i_169_ - i_168_);
											} else if (4007 == i_31_) {
												i_21_ -= 2;
												final int i_171_ = Class107.anIntArray1387[i_21_];
												final int i_172_ = Class107.anIntArray1387[i_21_ + 1];
												Class107.anIntArray1387[i_21_++] = i_171_ * i_172_ / 100 + i_171_;
											} else if (i_31_ == 4008) {
												i_21_ -= 2;
												final int i_173_ = Class107.anIntArray1387[i_21_];
												final int i_174_ = Class107.anIntArray1387[i_21_ + 1];
												Class107.anIntArray1387[i_21_++] = i_173_ | 1 << i_174_;
											} else if (4009 == i_31_) {
												i_21_ -= 2;
												final int i_175_ = Class107.anIntArray1387[i_21_];
												final int i_176_ = Class107.anIntArray1387[1 + i_21_];
												Class107.anIntArray1387[i_21_++] = i_175_ & -1 - (1 << i_176_);
											} else if (i_31_ == 4010) {
												i_21_ -= 2;
												final int i_177_ = Class107.anIntArray1387[i_21_];
												final int i_178_ = Class107.anIntArray1387[i_21_ + 1];
												Class107.anIntArray1387[i_21_++] = (i_177_ & 1 << i_178_) != 0 ? 1 : 0;
											} else if (i_31_ == 4011) {
												i_21_ -= 2;
												final int i_179_ = Class107.anIntArray1387[i_21_];
												final int i_180_ = Class107.anIntArray1387[i_21_ + 1];
												Class107.anIntArray1387[i_21_++] = i_179_ % i_180_;
											} else if (i_31_ == 4012) {
												i_21_ -= 2;
												final int i_181_ = Class107.anIntArray1387[i_21_];
												final int i_182_ = Class107.anIntArray1387[1 + i_21_];
												if (i_181_ == 0) {
													Class107.anIntArray1387[i_21_++] = 0;
												} else {
													Class107.anIntArray1387[i_21_++] = (int) Math.pow(i_181_, i_182_);
												}
											} else if (i_31_ == 4013) {
												i_21_ -= 2;
												final int i_183_ = Class107.anIntArray1387[i_21_];
												final int i_184_ = Class107.anIntArray1387[1 + i_21_];
												if (i_183_ == 0) {
													Class107.anIntArray1387[i_21_++] = 0;
												} else if (i_184_ == 0) {
													Class107.anIntArray1387[i_21_++] = 2147483647;
												} else {
													Class107.anIntArray1387[i_21_++] = (int) Math.pow(i_183_, 1.0 / i_184_);
												}
											} else if (i_31_ == 4014) {
												i_21_ -= 2;
												final int i_185_ = Class107.anIntArray1387[i_21_];
												final int i_186_ = Class107.anIntArray1387[1 + i_21_];
												Class107.anIntArray1387[i_21_++] = i_185_ & i_186_;
											} else {
												if (i_31_ != 4015) {
													break;
												}
												i_21_ -= 2;
												final int i_187_ = Class107.anIntArray1387[i_21_];
												final int i_188_ = Class107.anIntArray1387[i_21_ + 1];
												Class107.anIntArray1387[i_21_++] = i_187_ | i_188_;
											}
										} else if (i_31_ < 4200) {
											if (4100 == i_31_) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												i_21_--;
												final int i_189_ = Class107.anIntArray1387[i_21_];
												Class107.aStringArray1388[i_22_++] = new StringBuilder(string).append(i_189_).toString();
											} else if (i_31_ == 4101) {
												i_22_ -= 2;
												final String string = Class107.aStringArray1388[i_22_];
												final String string_190_ = Class107.aStringArray1388[1 + i_22_];
												Class107.aStringArray1388[i_22_++] = new StringBuilder(string).append(string_190_).toString();
											} else if (i_31_ == 4102) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												i_21_--;
												final int i_191_ = Class107.anIntArray1387[i_21_];
												final String[] strings = Class107.aStringArray1388;
												final int i_192_ = i_22_++;
												String string_193_;
												if (i_191_ < 0) {
													string_193_ = Integer.toString(i_191_);
												} else {
													int i_194_ = i_191_;
													String string_195_;
													if (i_191_ < 0) {
														string_195_ = Integer.toString(i_191_, 10);
													} else {
														int i_196_ = 2;
														int i_197_ = i_191_ / 10;
														while (i_197_ != 0) {
															i_197_ /= 10;
															i_196_++;
														}
														final char[] cs = new char[i_196_];
														cs[0] = '+';
														for (int i_198_ = i_196_ - 1; i_198_ > 0; i_198_--) {
															final int i_199_ = i_194_;
															i_194_ /= 10;
															final int i_200_ = i_199_ - i_194_ * 10;
															if (i_200_ >= 10) {
																cs[i_198_] = (char) (87 + i_200_);
															} else {
																cs[i_198_] = (char) (48 + i_200_);
															}
														}
														string_195_ = new String(cs);
													}
													string_193_ = string_195_;
												}
												strings[i_192_] = new StringBuilder(string).append(string_193_).toString();
											} else if (4103 == i_31_) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												Class107.aStringArray1388[i_22_++] = string.toLowerCase();
											} else if (i_31_ == 4104) {
												i_21_--;
												final int i_201_ = Class107.anIntArray1387[i_21_];
												final long l = 86400000L * (i_201_ + 11745L);
												Class107.aCalendar1393.setTime(new Date(l));
												final int i_202_ = Class107.aCalendar1393.get(5);
												final int i_203_ = Class107.aCalendar1393.get(2);
												final int i_204_ = Class107.aCalendar1393.get(1);
												Class107.aStringArray1388[i_22_++] = new StringBuilder(String.valueOf(i_202_)).append("-").append(Class107.aStringArray1384[i_203_]).append("-").append(i_204_).toString();
											} else if (i_31_ == 4105) {
												i_22_ -= 2;
												final String string = Class107.aStringArray1388[i_22_];
												final String string_205_ = Class107.aStringArray1388[1 + i_22_];
												if (Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.aClass85_2838 != null && Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.aClass85_2838.aBoolean1159) {
													Class107.aStringArray1388[i_22_++] = string_205_;
												} else {
													Class107.aStringArray1388[i_22_++] = string;
												}
											} else if (i_31_ == 4106) {
												i_21_--;
												final int i_206_ = Class107.anIntArray1387[i_21_];
												Class107.aStringArray1388[i_22_++] = Integer.toString(i_206_);
											} else if (i_31_ == 4107) {
												i_22_ -= 2;
												final int[] is_207_ = Class107.anIntArray1387;
												final int i_208_ = i_21_++;
												final String string = Class107.aStringArray1388[i_22_];
												final String string_209_ = Class107.aStringArray1388[i_22_ + 1];
												final int i_210_ = client.anInt1446 * -718429373;
												final int i_211_ = string.length();
												final int i_212_ = string_209_.length();
												int i_213_ = 0;
												int i_214_ = 0;
												int i_215_ = 0;
												int i_216_ = 0;
												int i_217_;
												while_16_: do {
													char c;
													char c_218_;
													for (;;) {
														if (i_213_ - i_215_ >= i_211_ && i_214_ - i_216_ >= i_212_) {
															final int i_219_ = Math.min(i_211_, i_212_);
															for (int i_220_ = 0; i_220_ < i_219_; i_220_++) {
																char c_221_ = string.charAt(i_220_);
																c_218_ = string_209_.charAt(i_220_);
																if (c_221_ != c_218_ && Character.toUpperCase(c_221_) != Character.toUpperCase(c_218_)) {
																	c_221_ = Character.toLowerCase(c_221_);
																	c_218_ = Character.toLowerCase(c_218_);
																	if (c_218_ != c_221_) {
																		i_217_ = Class91_Sub10.method699(c_221_, i_210_, (byte) 55) - Class91_Sub10.method699(c_218_, i_210_, (byte) 55);
																		break while_16_;
																	}
																}
															}
															final int i_222_ = i_211_ - i_212_;
															if (i_222_ != 0) {
																i_217_ = i_222_;
															} else {
																for (int i_223_ = 0; i_223_ < i_219_; i_223_++) {
																	c_218_ = string.charAt(i_223_);
																	final char c_224_ = string_209_.charAt(i_223_);
																	if (c_224_ != c_218_) {
																		i_217_ = Class91_Sub10.method699(c_218_, i_210_, (byte) 55) - Class91_Sub10.method699(c_224_, i_210_, (byte) 55);
																		break while_16_;
																	}
																}
																i_217_ = 0;
															}
															break while_16_;
														}
														if (i_213_ - i_215_ >= i_211_) {
															i_217_ = -1;
															break while_16_;
														}
														if (i_214_ - i_216_ >= i_212_) {
															i_217_ = 1;
															break while_16_;
														}
														if (i_215_ != 0) {
															c = (char) i_215_;
														} else {
															c = string.charAt(i_213_++);
														}
														if (i_216_ != 0) {
															c_218_ = (char) i_216_;
														} else {
															c_218_ = string_209_.charAt(i_214_++);
														}
														int i_225_;
														if ('\u00c6' == c) {
															i_225_ = 69;
														} else if ('\u00e6' == c) {
															i_225_ = 101;
														} else if ('\u00df' == c) {
															i_225_ = 115;
														} else if (c == '\u0152') {
															i_225_ = 69;
														} else if ('\u0153' == c) {
															i_225_ = 101;
														} else {
															i_225_ = 0;
														}
														i_215_ = i_225_;
														int i_226_;
														if (c_218_ == '\u00c6') {
															i_226_ = 69;
														} else if ('\u00e6' == c_218_) {
															i_226_ = 101;
														} else if ('\u00df' == c_218_) {
															i_226_ = 115;
														} else if ('\u0152' == c_218_) {
															i_226_ = 69;
														} else if (c_218_ == '\u0153') {
															i_226_ = 101;
														} else {
															i_226_ = 0;
														}
														i_216_ = i_226_;
														c = ByteBuffer.method687(c, i_210_, -1608088151);
														c_218_ = ByteBuffer.method687(c_218_, i_210_, -1317159714);
														if (c != c_218_ && Character.toUpperCase(c) != Character.toUpperCase(c_218_)) {
															c = Character.toLowerCase(c);
															c_218_ = Character.toLowerCase(c_218_);
															if (c_218_ != c) {
																break;
															}
														}
													}
													i_217_ = Class91_Sub10.method699(c, i_210_, (byte) 55) - Class91_Sub10.method699(c_218_, i_210_, (byte) 55);
												} while (false);
												int i_227_;
												if (i_217_ > 0) {
													i_227_ = 1;
												} else if (i_217_ < 0) {
													i_227_ = -1;
												} else {
													i_227_ = 0;
												}
												is_207_[i_208_] = i_227_;
											} else if (i_31_ == 4108) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												i_21_ -= 2;
												final int i_228_ = Class107.anIntArray1387[i_21_];
												final int i_229_ = Class107.anIntArray1387[i_21_ + 1];
												final byte[] is_230_ = Class105.aClass63_Sub1_1360.getFile(i_229_, 0, 921071258);
												final Class91_Sub20_Sub13_Sub4_Sub1 class91_sub20_sub13_sub4_sub1 = new Class91_Sub20_Sub13_Sub4_Sub1(is_230_);
												Class107.anIntArray1387[i_21_++] = class91_sub20_sub13_sub4_sub1.method912(string, i_228_);
											} else if (i_31_ == 4109) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												i_21_ -= 2;
												final int i_231_ = Class107.anIntArray1387[i_21_];
												final int i_232_ = Class107.anIntArray1387[i_21_ + 1];
												final byte[] is_233_ = Class105.aClass63_Sub1_1360.getFile(i_232_, 0, -1070395672);
												final Class91_Sub20_Sub13_Sub4_Sub1 class91_sub20_sub13_sub4_sub1 = new Class91_Sub20_Sub13_Sub4_Sub1(is_233_);
												Class107.anIntArray1387[i_21_++] = class91_sub20_sub13_sub4_sub1.method891(string, i_231_);
											} else if (i_31_ == 4110) {
												i_22_ -= 2;
												final String string = Class107.aStringArray1388[i_22_];
												final String string_234_ = Class107.aStringArray1388[i_22_ + 1];
												i_21_--;
												if (Class107.anIntArray1387[i_21_] == 1) {
													Class107.aStringArray1388[i_22_++] = string;
												} else {
													Class107.aStringArray1388[i_22_++] = string_234_;
												}
											} else if (4111 == i_31_) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												Class107.aStringArray1388[i_22_++] = Class91_Sub20_Sub13_Sub4.method892(string);
											} else if (4112 == i_31_) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												i_21_--;
												final int i_235_ = Class107.anIntArray1387[i_21_];
												Class107.aStringArray1388[i_22_++] = new StringBuilder(string).append((char) i_235_).toString();
											} else if (4113 == i_31_) {
												i_21_--;
												final int i_236_ = Class107.anIntArray1387[i_21_];
												Class107.anIntArray1387[i_21_++] = Class47.method364((char) i_236_, -1069327113) ? 1 : 0;
											} else if (4114 == i_31_) {
												i_21_--;
												final int i_237_ = Class107.anIntArray1387[i_21_];
												final int[] is_238_ = Class107.anIntArray1387;
												final int i_239_ = i_21_++;
												final char c = (char) i_237_;
												final boolean bool_240_ = c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
												is_238_[i_239_] = bool_240_ ? 1 : 0;
											} else if (4115 == i_31_) {
												i_21_--;
												final int i_241_ = Class107.anIntArray1387[i_21_];
												final int[] is_242_ = Class107.anIntArray1387;
												final int i_243_ = i_21_++;
												final char c = (char) i_241_;
												final boolean bool_244_ = c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
												is_242_[i_243_] = bool_244_ ? 1 : 0;
											} else if (i_31_ == 4116) {
												i_21_--;
												final int i_245_ = Class107.anIntArray1387[i_21_];
												final int[] is_246_ = Class107.anIntArray1387;
												final int i_247_ = i_21_++;
												final char c = (char) i_245_;
												final boolean bool_248_ = c >= '0' && c <= '9';
												is_246_[i_247_] = bool_248_ ? 1 : 0;
											} else if (4117 == i_31_) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												if (string != null) {
													Class107.anIntArray1387[i_21_++] = string.length();
												} else {
													Class107.anIntArray1387[i_21_++] = 0;
												}
											} else if (4118 == i_31_) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												i_21_ -= 2;
												final int i_249_ = Class107.anIntArray1387[i_21_];
												final int i_250_ = Class107.anIntArray1387[1 + i_21_];
												Class107.aStringArray1388[i_22_++] = string.substring(i_249_, i_250_);
											} else if (4119 == i_31_) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												final StringBuilder stringbuilder = new StringBuilder(string.length());
												boolean bool_251_ = false;
												for (int i_252_ = 0; i_252_ < string.length(); i_252_++) {
													final char c = string.charAt(i_252_);
													if ('<' == c) {
														bool_251_ = true;
													} else if ('>' == c) {
														bool_251_ = false;
													} else if (!bool_251_) {
														stringbuilder.append(c);
													}
												}
												Class107.aStringArray1388[i_22_++] = stringbuilder.toString();
											} else {
												if (4120 != i_31_) {
													break;
												}
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												i_21_--;
												final int i_253_ = Class107.anIntArray1387[i_21_];
												Class107.anIntArray1387[i_21_++] = string.indexOf(i_253_);
											}
										} else if (i_31_ < 4300) {
											if (4200 == i_31_) {
												i_21_--;
												final int i_254_ = Class107.anIntArray1387[i_21_];
												Class107.aStringArray1388[i_22_++] = Class86_Sub1.method490(i_254_, 234554293).aString2357;
											} else if (4201 == i_31_) {
												i_21_ -= 2;
												final int i_255_ = Class107.anIntArray1387[i_21_];
												final int i_256_ = Class107.anIntArray1387[1 + i_21_];
												final ObjType class91_sub20_sub8 = Class86_Sub1.method490(i_255_, 234554293);
												if (i_256_ >= 1 && i_256_ <= 5 && class91_sub20_sub8.aStringArray2369[i_256_ - 1] != null) {
													Class107.aStringArray1388[i_22_++] = class91_sub20_sub8.aStringArray2369[i_256_ - 1];
												} else {
													Class107.aStringArray1388[i_22_++] = "";
												}
											} else if (4202 == i_31_) {
												i_21_ -= 2;
												final int i_257_ = Class107.anIntArray1387[i_21_];
												final int i_258_ = Class107.anIntArray1387[i_21_ + 1];
												final ObjType class91_sub20_sub8 = Class86_Sub1.method490(i_257_, 234554293);
												if (i_258_ >= 1 && i_258_ <= 5 && class91_sub20_sub8.aStringArray2372[i_258_ - 1] != null) {
													Class107.aStringArray1388[i_22_++] = class91_sub20_sub8.aStringArray2372[i_258_ - 1];
												} else {
													Class107.aStringArray1388[i_22_++] = "";
												}
											} else if (4203 == i_31_) {
												i_21_--;
												final int i_259_ = Class107.anIntArray1387[i_21_];
												Class107.anIntArray1387[i_21_++] = Class86_Sub1.method490(i_259_, 234554293).anInt2364 * -1522132341;
											} else if (4204 == i_31_) {
												i_21_--;
												final int i_260_ = Class107.anIntArray1387[i_21_];
												Class107.anIntArray1387[i_21_++] = Class86_Sub1.method490(i_260_, 234554293).anInt2368 * 1277482383 == 1 ? 1 : 0;
											} else if (i_31_ == 4205) {
												i_21_--;
												final int i_261_ = Class107.anIntArray1387[i_21_];
												final ObjType class91_sub20_sub8 = Class86_Sub1.method490(i_261_, 234554293);
												if (-1826659211 * class91_sub20_sub8.anInt2384 == -1 && class91_sub20_sub8.anInt2387 * -490096559 >= 0) {
													Class107.anIntArray1387[i_21_++] = class91_sub20_sub8.anInt2387 * -490096559;
												} else {
													Class107.anIntArray1387[i_21_++] = i_261_;
												}
											} else if (4206 == i_31_) {
												i_21_--;
												final int i_262_ = Class107.anIntArray1387[i_21_];
												final ObjType class91_sub20_sub8 = Class86_Sub1.method490(i_262_, 234554293);
												if (class91_sub20_sub8.anInt2384 * -1826659211 >= 0 && -490096559 * class91_sub20_sub8.anInt2387 >= 0) {
													Class107.anIntArray1387[i_21_++] = class91_sub20_sub8.anInt2387 * -490096559;
												} else {
													Class107.anIntArray1387[i_21_++] = i_262_;
												}
											} else {
												if (4207 != i_31_) {
													break;
												}
												i_21_--;
												final int i_263_ = Class107.anIntArray1387[i_21_];
												Class107.anIntArray1387[i_21_++] = Class86_Sub1.method490(i_263_, 234554293).aBoolean2388 ? 1 : 0;
											}
										} else {
											if (i_31_ >= 5100) {
												break;
											}
											if (5000 == i_31_) {
												Class107.anIntArray1387[i_21_++] = 681597963 * client.anInt1659;
											} else if (5001 == i_31_) {
												i_21_ -= 3;
												client.anInt1659 = Class107.anIntArray1387[i_21_] * 1094340515;
												final int i_264_ = Class107.anIntArray1387[1 + i_21_];
												final Class71[] class71s = { Class71.aClass71_826, Class71.aClass71_822, Class71.aClass71_825 };
												final Class71[] class71s_265_ = class71s;
												int i_266_ = 0;
												Class71 class71;
												for (;;) {
													if (i_266_ >= class71s_265_.length) {
														class71 = null;
														break;
													}
													final Class71 class71_267_ = class71s_265_[i_266_];
													if (class71_267_.anInt824 * -1100221425 == i_264_) {
														class71 = class71_267_;
														break;
													}
													i_266_++;
												}
												Class43.aClass71_571 = class71;
												if (Class43.aClass71_571 == null) {
													Class43.aClass71_571 = Class71.aClass71_822;
												}
												client.anInt1707 = 1666380389 * Class107.anIntArray1387[i_21_ + 2];
												client.aClass91_Sub9_Sub1_1478.method690(91, 1160292001);
												client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(681597963 * client.anInt1659);
												client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(Class43.aClass71_571.anInt824 * -1100221425);
												client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(client.anInt1707 * -1066307731);
											} else if (i_31_ == 5002) {
												i_22_--;
												final String string = Class107.aStringArray1388[i_22_];
												i_21_ -= 2;
												final int i_268_ = Class107.anIntArray1387[i_21_];
												final int i_269_ = Class107.anIntArray1387[1 + i_21_];
												client.aClass91_Sub9_Sub1_1478.method690(193, 1160292001);
												final Class91_Sub9_Sub1 class91_sub9_sub1 = client.aClass91_Sub9_Sub1_1478;
												final int i_270_ = string.length() + 1;
												class91_sub9_sub1.writeWordBigEndian(i_270_ + 2);
												client.aClass91_Sub9_Sub1_1478.method634(string, (byte) 68);
												client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(i_268_ - 1);
												client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(i_269_);
											} else if (5003 == i_31_) {
												i_21_--;
												final int i_271_ = Class107.anIntArray1387[i_21_];
												String string = null;
												if (i_271_ < 100) {
													string = client.aStringArray1656[i_271_];
												}
												if (string == null) {
													string = "";
												}
												Class107.aStringArray1388[i_22_++] = string;
											} else if (5004 == i_31_) {
												i_21_--;
												final int i_272_ = Class107.anIntArray1387[i_21_];
												int i_273_ = -1;
												if (i_272_ < 100 && client.aStringArray1656[i_272_] != null) {
													i_273_ = client.anIntArray1653[i_272_];
												}
												Class107.anIntArray1387[i_21_++] = i_273_;
											} else if (5005 == i_31_) {
												if (Class43.aClass71_571 == null) {
													Class107.anIntArray1387[i_21_++] = -1;
												} else {
													Class107.anIntArray1387[i_21_++] = -1100221425 * Class43.aClass71_571.anInt824;
												}
											} else if (5008 == i_31_) {
												i_22_--;
												String string = Class107.aStringArray1388[i_22_];
												if (string.startsWith("::")) {
													if (string.equalsIgnoreCase("::toggleroof")) {
														Class91_Sub20_Sub14_Sub4.aClass108_2769.aBoolean1401 = !Class91_Sub20_Sub14_Sub4.aClass108_2769.aBoolean1401;
														Class105.method1096(150493980);
														if (Class91_Sub20_Sub14_Sub4.aClass108_2769.aBoolean1401) {
															Class101.method1076(0, "", "Roofs are now all hidden", 1141843399);
														} else {
															Class101.method1076(0, "", "Roofs will only be removed selectively", 1419204092);
														}
													}
													if (client.anInt1522 * 361234295 >= 2) {
														if (string.equalsIgnoreCase("::gc")) {
															System.gc();
														}
														if (string.equalsIgnoreCase("::clientdrop")) {
															Class26.method244(-2108417932);
														}
														if (string.equalsIgnoreCase("::fpson")) {
															client.aBoolean1455 = true;
														}
														if (string.equalsIgnoreCase("::fpsoff")) {
															client.aBoolean1455 = false;
														}
														if (string.equalsIgnoreCase("::noclip")) {
															for (int i_274_ = 0; i_274_ < 4; i_274_++) {
																for (int i_275_ = 1; i_275_ < 103; i_275_++) {
																	for (int i_276_ = 1; i_276_ < 103; i_276_++) {
																		client.aClass76Array1530[i_274_].anIntArrayArray1085[i_275_][i_276_] = 0;
																	}
																}
															}
														}
														if (string.equalsIgnoreCase("::errortest") && client.anInt1442 * 986135985 == 2) {
															throw new RuntimeException();
														}
													}
													client.aClass91_Sub9_Sub1_1478.method690(210, 1160292001);
													client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(string.length() - 1);
													client.aClass91_Sub9_Sub1_1478.method634(string.substring(2), (byte) 24);
												} else {
													String string_277_ = string.toLowerCase();
													int i_278_ = 0;
													if (string_277_.startsWith(Class75.aString950)) {
														i_278_ = 0;
														string = string.substring(Class75.aString950.length());
													} else if (string_277_.startsWith(Class75.aString1018)) {
														i_278_ = 1;
														string = string.substring(Class75.aString1018.length());
													} else if (string_277_.startsWith(Class75.aString928)) {
														i_278_ = 2;
														string = string.substring(Class75.aString928.length());
													} else if (string_277_.startsWith(Class75.aString1022)) {
														i_278_ = 3;
														string = string.substring(Class75.aString1022.length());
													} else if (string_277_.startsWith(Class75.aString1024)) {
														i_278_ = 4;
														string = string.substring(Class75.aString1024.length());
													} else if (string_277_.startsWith(Class75.aString1026)) {
														i_278_ = 5;
														string = string.substring(Class75.aString1026.length());
													} else if (string_277_.startsWith(Class75.aString948)) {
														i_278_ = 6;
														string = string.substring(Class75.aString948.length());
													} else if (string_277_.startsWith(Class75.aString1023)) {
														i_278_ = 7;
														string = string.substring(Class75.aString1023.length());
													} else if (string_277_.startsWith(Class75.aString903)) {
														i_278_ = 8;
														string = string.substring(Class75.aString903.length());
													} else if (string_277_.startsWith(Class75.aString1034)) {
														i_278_ = 9;
														string = string.substring(Class75.aString1034.length());
													} else if (string_277_.startsWith(Class75.aString1012)) {
														i_278_ = 10;
														string = string.substring(Class75.aString1012.length());
													} else if (string_277_.startsWith(Class75.aString1038)) {
														i_278_ = 11;
														string = string.substring(Class75.aString1038.length());
													} else if (client.anInt1446 * -718429373 != 0) {
														if (string_277_.startsWith(Class75.aString1017)) {
															i_278_ = 0;
															string = string.substring(Class75.aString1017.length());
														} else if (string_277_.startsWith(Class75.aString1019)) {
															i_278_ = 1;
															string = string.substring(Class75.aString1019.length());
														} else if (string_277_.startsWith(Class75.aString960)) {
															i_278_ = 2;
															string = string.substring(Class75.aString960.length());
														} else if (string_277_.startsWith(Class75.aString1031)) {
															i_278_ = 3;
															string = string.substring(Class75.aString1031.length());
														} else if (string_277_.startsWith(Class75.aString866)) {
															i_278_ = 4;
															string = string.substring(Class75.aString866.length());
														} else if (string_277_.startsWith(Class75.aString1027)) {
															i_278_ = 5;
															string = string.substring(Class75.aString1027.length());
														} else if (string_277_.startsWith(Class75.aString1029)) {
															i_278_ = 6;
															string = string.substring(Class75.aString1029.length());
														} else if (string_277_.startsWith(Class75.aString1041)) {
															i_278_ = 7;
															string = string.substring(Class75.aString1041.length());
														} else if (string_277_.startsWith(Class75.aString978)) {
															i_278_ = 8;
															string = string.substring(Class75.aString978.length());
														} else if (string_277_.startsWith(Class75.aString1035)) {
															i_278_ = 9;
															string = string.substring(Class75.aString1035.length());
														} else if (string_277_.startsWith(Class75.aString1037)) {
															i_278_ = 10;
															string = string.substring(Class75.aString1037.length());
														} else if (string_277_.startsWith(Class75.aString957)) {
															i_278_ = 11;
															string = string.substring(Class75.aString957.length());
														}
													}
													string_277_ = string.toLowerCase();
													int i_279_ = 0;
													if (string_277_.startsWith(Class75.aString1016)) {
														i_279_ = 1;
														string = string.substring(Class75.aString1016.length());
													} else if (string_277_.startsWith(Class75.aString913)) {
														i_279_ = 2;
														string = string.substring(Class75.aString913.length());
													} else if (string_277_.startsWith(Class75.aString982)) {
														i_279_ = 3;
														string = string.substring(Class75.aString982.length());
													} else if (string_277_.startsWith(Class75.aString964)) {
														i_279_ = 4;
														string = string.substring(Class75.aString964.length());
													} else if (string_277_.startsWith(Class75.aString1048)) {
														i_279_ = 5;
														string = string.substring(Class75.aString1048.length());
													} else if (client.anInt1446 * -718429373 != 0) {
														if (string_277_.startsWith(Class75.aString1063)) {
															i_279_ = 1;
															string = string.substring(Class75.aString1063.length());
														} else if (string_277_.startsWith(Class75.aString888)) {
															i_279_ = 2;
															string = string.substring(Class75.aString888.length());
														} else if (string_277_.startsWith(Class75.aString1045)) {
															i_279_ = 3;
															string = string.substring(Class75.aString1045.length());
														} else if (string_277_.startsWith(Class75.aString1050)) {
															i_279_ = 4;
															string = string.substring(Class75.aString1050.length());
														} else if (string_277_.startsWith(Class75.aString1049)) {
															i_279_ = 5;
															string = string.substring(Class75.aString1049.length());
														}
													}
													client.aClass91_Sub9_Sub1_1478.method690(46, 1160292001);
													client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(0);
													final int i_280_ = -1128893257 * client.aClass91_Sub9_Sub1_1478.currentOffset;
													client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(i_278_);
													client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(i_279_);
													Class97.method1071(client.aClass91_Sub9_Sub1_1478, string, 175064749);
													client.aClass91_Sub9_Sub1_1478.method638(client.aClass91_Sub9_Sub1_1478.currentOffset * -1128893257 - i_280_, (byte) -64);
												}
											} else if (i_31_ == 5009) {
												i_22_ -= 2;
												final String string = Class107.aStringArray1388[i_22_];
												final String string_281_ = Class107.aStringArray1388[i_22_ + 1];
												client.aClass91_Sub9_Sub1_1478.method690(215, 1160292001);
												client.aClass91_Sub9_Sub1_1478.method681(0, -372694149);
												final int i_282_ = -1128893257 * client.aClass91_Sub9_Sub1_1478.currentOffset;
												client.aClass91_Sub9_Sub1_1478.method634(string, (byte) 39);
												Class97.method1071(client.aClass91_Sub9_Sub1_1478, string_281_, 1035084072);
												client.aClass91_Sub9_Sub1_1478.writeWord(client.aClass91_Sub9_Sub1_1478.currentOffset * -1128893257 - i_282_);
											} else if (5010 == i_31_) {
												i_21_--;
												final int i_283_ = Class107.anIntArray1387[i_21_];
												String string = null;
												if (i_283_ < 100) {
													string = client.aStringArray1654[i_283_];
												}
												if (string == null) {
													string = "";
												}
												Class107.aStringArray1388[i_22_++] = string;
											} else if (i_31_ == 5011) {
												i_21_--;
												final int i_284_ = Class107.anIntArray1387[i_21_];
												String string = null;
												if (i_284_ < 100) {
													string = client.aStringArray1655[i_284_];
												}
												if (string == null) {
													string = "";
												}
												Class107.aStringArray1388[i_22_++] = string;
											} else if (i_31_ == 5015) {
												String string;
												if (Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316 != null && Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.aString2841 != null) {
													string = Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.aString2841;
												} else {
													string = "";
												}
												Class107.aStringArray1388[i_22_++] = string;
											} else if (5016 == i_31_) {
												Class107.anIntArray1387[i_21_++] = client.anInt1707 * -1066307731;
											} else {
												if (i_31_ != 5017) {
													break;
												}
												Class107.anIntArray1387[i_21_++] = -1277733859 * client.anInt1539;
											}
										}
									} else {
										Class91_Sub18 class91_sub18;
										if (i_31_ >= 2000) {
											i_31_ -= 1000;
											i_21_--;
											class91_sub18 = Class61.method394(Class107.anIntArray1387[i_21_], -631047529);
										} else {
											class91_sub18 = bool ? Class46.aClass91_Sub18_590 : Class91_Sub22.aClass91_Sub18_2104;
										}
										if (1300 == i_31_) {
											i_21_--;
											final int i_285_ = Class107.anIntArray1387[i_21_] - 1;
											if (i_285_ >= 0 && i_285_ <= 9) {
												i_22_--;
												class91_sub18.method716(i_285_, Class107.aStringArray1388[i_22_], (byte) 0);
											} else {
												i_22_--;
											}
										} else if (1301 == i_31_) {
											i_21_ -= 2;
											final int i_286_ = Class107.anIntArray1387[i_21_];
											final int i_287_ = Class107.anIntArray1387[1 + i_21_];
											class91_sub18.aClass91_Sub18_2031 = Js5.method412(i_286_, i_287_, (byte) 1);
										} else if (1302 == i_31_) {
											i_21_--;
											class91_sub18.aBoolean1966 = Class107.anIntArray1387[i_21_] == 1;
										} else if (1303 == i_31_) {
											i_21_--;
											class91_sub18.anInt1960 = Class107.anIntArray1387[i_21_] * -8175423;
										} else if (1304 == i_31_) {
											i_21_--;
											class91_sub18.anInt2033 = Class107.anIntArray1387[i_21_] * 2140511103;
										} else if (i_31_ == 1305) {
											i_22_--;
											class91_sub18.aString2029 = Class107.aStringArray1388[i_22_];
										} else if (1306 == i_31_) {
											i_22_--;
											class91_sub18.aString2035 = Class107.aStringArray1388[i_22_];
										} else {
											if (i_31_ != 1307) {
												break;
											}
											class91_sub18.aStringArray1991 = null;
										}
									}
								} else {
									Class91_Sub18 class91_sub18;
									if (i_31_ >= 2000) {
										i_31_ -= 1000;
										i_21_--;
										class91_sub18 = Class61.method394(Class107.anIntArray1387[i_21_], -631047529);
									} else {
										class91_sub18 = bool ? Class46.aClass91_Sub18_590 : Class91_Sub22.aClass91_Sub18_2104;
									}
									Class28_Sub1.method272(class91_sub18, -1905179897);
									if (i_31_ == 1200) {
										i_21_ -= 2;
										final int i_288_ = Class107.anIntArray1387[i_21_];
										final int i_289_ = Class107.anIntArray1387[i_21_ + 1];
										class91_sub18.anInt2073 = i_288_ * -2075207965;
										class91_sub18.anInt2074 = 191778519 * i_289_;
										final ObjType class91_sub20_sub8 = Class86_Sub1.method490(i_288_, 234554293);
										class91_sub18.anInt2039 = -1972545755 * class91_sub20_sub8.anInt2363;
										class91_sub18.anInt2010 = 463184129 * class91_sub20_sub8.anInt2354;
										class91_sub18.anInt2007 = 1175794669 * class91_sub20_sub8.anInt2365;
										class91_sub18.anInt1970 = 916773411 * class91_sub20_sub8.anInt2366;
										class91_sub18.anInt2061 = -503642457 * class91_sub20_sub8.anInt2367;
										class91_sub18.anInt2072 = -622116043 * class91_sub20_sub8.anInt2362;
										if (-538789309 * class91_sub18.anInt1978 > 0) {
											class91_sub18.anInt2072 = 1910129001 * (491510560 * class91_sub18.anInt2072 / (class91_sub18.anInt1978 * -538789309));
										}
									} else if (1201 == i_31_) {
										class91_sub18.anInt2001 = -1404976866;
										i_21_--;
										class91_sub18.anInt2002 = Class107.anIntArray1387[i_21_] * -218983247;
									} else {
										if (i_31_ != 1202) {
											break;
										}
										class91_sub18.anInt2001 = -2107465299;
										class91_sub18.anInt2002 = Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.aClass85_2838.method479(-1528857977) * -218983247;
									}
								}
							} else {
								Class91_Sub18 class91_sub18;
								if (i_31_ >= 2000) {
									i_31_ -= 1000;
									i_21_--;
									class91_sub18 = Class61.method394(Class107.anIntArray1387[i_21_], -631047529);
								} else {
									class91_sub18 = bool ? Class46.aClass91_Sub18_590 : Class91_Sub22.aClass91_Sub18_2104;
								}
								if (1100 == i_31_) {
									i_21_ -= 2;
									class91_sub18.anInt1982 = Class107.anIntArray1387[i_21_] * -1301762041;
									if (class91_sub18.anInt1982 * 1910750647 > -1653452305 * class91_sub18.anInt1969 - -538789309 * class91_sub18.anInt1978) {
										class91_sub18.anInt1982 = class91_sub18.anInt1969 * 1569492361 - class91_sub18.anInt1978 * 1081681877;
									}
									if (1910750647 * class91_sub18.anInt1982 < 0) {
										class91_sub18.anInt1982 = 0;
									}
									class91_sub18.anInt2048 = 454496311 * Class107.anIntArray1387[i_21_ + 1];
									if (1916118407 * class91_sub18.anInt2048 > 28734823 * class91_sub18.anInt1985 - -1807498407 * class91_sub18.anInt1979) {
										class91_sub18.anInt2048 = class91_sub18.anInt1985 * 785033505 - class91_sub18.anInt1979 * 113477663;
									}
									if (class91_sub18.anInt2048 * 1916118407 < 0) {
										class91_sub18.anInt2048 = 0;
									}
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (i_31_ == 1101) {
									i_21_--;
									class91_sub18.anInt1986 = Class107.anIntArray1387[i_21_] * 1800122349;
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (1102 == i_31_) {
									i_21_--;
									class91_sub18.aBoolean2040 = Class107.anIntArray1387[i_21_] == 1;
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (i_31_ == 1103) {
									i_21_--;
									class91_sub18.anInt1975 = Class107.anIntArray1387[i_21_] * 40162017;
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (i_31_ == 1104) {
									i_21_--;
									class91_sub18.anInt1992 = Class107.anIntArray1387[i_21_] * -545528715;
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (i_31_ == 1105) {
									i_21_--;
									class91_sub18.anInt1993 = Class107.anIntArray1387[i_21_] * -1812442197;
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (1106 == i_31_) {
									i_21_--;
									class91_sub18.anInt2081 = Class107.anIntArray1387[i_21_] * -15296653;
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (i_31_ == 1107) {
									i_21_--;
									class91_sub18.aBoolean1996 = Class107.anIntArray1387[i_21_] == 1;
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (i_31_ == 1108) {
									class91_sub18.anInt2001 = -702488433;
									i_21_--;
									class91_sub18.anInt2002 = Class107.anIntArray1387[i_21_] * -218983247;
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (i_31_ == 1109) {
									i_21_ -= 6;
									class91_sub18.anInt1970 = 82414187 * Class107.anIntArray1387[i_21_];
									class91_sub18.anInt2061 = Class107.anIntArray1387[1 + i_21_] * -229233135;
									class91_sub18.anInt2039 = Class107.anIntArray1387[2 + i_21_] * 1210657299;
									class91_sub18.anInt2010 = -203003121 * Class107.anIntArray1387[3 + i_21_];
									class91_sub18.anInt2007 = Class107.anIntArray1387[i_21_ + 4] * 1986885943;
									class91_sub18.anInt2072 = 1910129001 * Class107.anIntArray1387[i_21_ + 5];
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (i_31_ == 1110) {
									i_21_--;
									final int i_290_ = Class107.anIntArray1387[i_21_];
									if (i_290_ != -345440531 * class91_sub18.anInt2005) {
										class91_sub18.anInt2005 = i_290_ * -900788507;
										class91_sub18.anInt2075 = 0;
										class91_sub18.anInt2076 = 0;
										Class28_Sub1.method272(class91_sub18, -1905179897);
									}
								} else if (i_31_ == 1111) {
									i_21_--;
									class91_sub18.aBoolean2014 = Class107.anIntArray1387[i_21_] == 1;
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (i_31_ == 1112) {
									i_22_--;
									final String string = Class107.aStringArray1388[i_22_];
									if (!string.equals(class91_sub18.aString2026)) {
										class91_sub18.aString2026 = string;
										Class28_Sub1.method272(class91_sub18, -1905179897);
									}
								} else if (1113 == i_31_) {
									i_21_--;
									class91_sub18.anInt2015 = Class107.anIntArray1387[i_21_] * 1750183267;
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (i_31_ == 1114) {
									i_21_ -= 3;
									class91_sub18.anInt2019 = -1866286063 * Class107.anIntArray1387[i_21_];
									class91_sub18.anInt2020 = Class107.anIntArray1387[1 + i_21_] * -1072006117;
									class91_sub18.anInt2018 = 1903495329 * Class107.anIntArray1387[i_21_ + 2];
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (1115 == i_31_) {
									i_21_--;
									class91_sub18.aBoolean2021 = Class107.anIntArray1387[i_21_] == 1;
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (i_31_ == 1116) {
									i_21_--;
									class91_sub18.anInt1997 = Class107.anIntArray1387[i_21_] * 1583594373;
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (1117 == i_31_) {
									i_21_--;
									class91_sub18.anInt2060 = Class107.anIntArray1387[i_21_] * 1038956123;
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (i_31_ == 1118) {
									i_21_--;
									class91_sub18.aBoolean1999 = Class107.anIntArray1387[i_21_] == 1;
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else if (1119 == i_31_) {
									i_21_--;
									class91_sub18.aBoolean2000 = Class107.anIntArray1387[i_21_] == 1;
									Class28_Sub1.method272(class91_sub18, -1905179897);
								} else {
									if (1120 != i_31_) {
										break;
									}
									i_21_ -= 2;
									class91_sub18.anInt1969 = -303235825 * Class107.anIntArray1387[i_21_];
									class91_sub18.anInt1985 = 35051095 * Class107.anIntArray1387[i_21_ + 1];
									Class28_Sub1.method272(class91_sub18, -1905179897);
								}
							}
						} else {
							Class91_Sub18 class91_sub18;
							if (i_31_ >= 2000) {
								i_31_ -= 1000;
								i_21_--;
								class91_sub18 = Class61.method394(Class107.anIntArray1387[i_21_], -631047529);
							} else {
								class91_sub18 = bool ? Class46.aClass91_Sub18_590 : Class91_Sub22.aClass91_Sub18_2104;
							}
							if (i_31_ == 1000) {
								i_21_ -= 2;
								class91_sub18.anInt1974 = 1881089361 * Class107.anIntArray1387[i_21_];
								class91_sub18.anInt1972 = 261111807 * Class107.anIntArray1387[i_21_ + 1];
								Class28_Sub1.method272(class91_sub18, -1905179897);
							} else if (i_31_ == 1001) {
								i_21_ -= 2;
								class91_sub18.anInt1978 = Class107.anIntArray1387[i_21_] * 1353704043;
								class91_sub18.anInt1979 = Class107.anIntArray1387[i_21_ + 1] * 1590318313;
								Class28_Sub1.method272(class91_sub18, -1905179897);
							} else {
								if (1003 != i_31_) {
									break;
								}
								i_21_--;
								final boolean bool_291_ = Class107.anIntArray1387[i_21_] == 1;
								if (bool_291_ != class91_sub18.aBoolean1981) {
									class91_sub18.aBoolean1981 = bool_291_;
									Class28_Sub1.method272(class91_sub18, -1905179897);
								}
							}
						}
					}
					throw new IllegalStateException();
				} catch (final Exception exception) {
					final StringBuilder stringbuilder = new StringBuilder(30);
					stringbuilder.append("").append(class91_sub20_sub17.aLong1192).append(" ");
					for (int i_292_ = Class107.anInt1391 * -788349887 - 1; i_292_ >= 0; i_292_--) {
						stringbuilder.append("").append(Class107.aClass105Array1392[i_292_].aClass91_Sub20_Sub17_1361.aLong1192).append(" ");
					}
					stringbuilder.append("").append(-1);
					Class91_Sub21.method1036(stringbuilder.toString(), exception, (byte) 34);
				}
			}
		} catch (final RuntimeException var34) {
			throw Class102.method1086(var34, "cr.i()");
		}
	}
}
