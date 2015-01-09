/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.io.File;
import java.io.IOException;

public class Class35 {
	public static Class4 aClass4_411 = null;
	static final int anInt412 = 1048576;
	static final int anInt413 = 1048576000;
	static final String aString414 = "main_file_cache.idx";
	static int anInt415;
	static final int anInt416 = 37;
	public static Class4 aClass4_417 = null;
	public static Class4 aClass4_418 = null;
	static final String aString419 = "main_file_cache.dat2";
	static final int anInt420 = 5;
	public static Js5 aClass63_421;
	static final int anInt422 = 45;
	public static final int anInt423 = 87;
	static File aFile424;

	static void method284(final Class103[] class103s, final int i, final int i_0_, final int[] is, final int[] is_1_, final short i_2_) {
		try {
			if (i < i_0_) {
				int i_3_ = i - 1;
				int i_4_ = 1 + i_0_;
				final int i_5_ = (i + i_0_) / 2;
				final Class103 class103 = class103s[i_5_];
				class103s[i_5_] = class103s[i];
				class103s[i] = class103;
				for (;;) {
					if (i_3_ >= i_4_) {
						method284(class103s, i, i_4_, is, is_1_, (short) 4213);
						method284(class103s, 1 + i_4_, i_0_, is, is_1_, (short) 28998);
						break;
					}
					boolean bool = true;
					do {
						i_4_--;
						for (int i_6_ = 0; i_6_ < 4; i_6_++) {
							int i_7_;
							int i_8_;
							if (2 == is[i_6_]) {
								i_7_ = 1471358871 * class103s[i_4_].anInt1334;
								i_8_ = class103.anInt1334 * 1471358871;
							} else if (1 == is[i_6_]) {
								i_7_ = class103s[i_4_].anInt1319 * -995202549;
								i_8_ = -995202549 * class103.anInt1319;
								if (-1 == i_7_ && 1 == is_1_[i_6_]) {
									i_7_ = 2001;
								}
								if (-1 == i_8_ && 1 == is_1_[i_6_]) {
									i_8_ = 2001;
								}
							} else if (is[i_6_] == 3) {
								int i_9_;
								if (class103s[i_4_].aBoolean1321) {
									i_9_ = 1;
								} else {
									i_9_ = 0;
								}
								i_7_ = i_9_;
								i_8_ = class103.aBoolean1321 ? 1 : 0;
							} else {
								i_7_ = -1659167479 * class103s[i_4_].anInt1335;
								i_8_ = class103.anInt1335 * -1659167479;
							}
							if (i_8_ != i_7_) {
								if ((is_1_[i_6_] != 1 || i_7_ <= i_8_) && (is_1_[i_6_] != 0 || i_7_ >= i_8_)) {
									bool = false;
								}
								break;
							}
							if (i_6_ == 3) {
								bool = false;
							}
						}
					} while (bool);
					bool = true;
					do {
						i_3_++;
						for (int i_10_ = 0; i_10_ < 4; i_10_++) {
							int i_11_;
							int i_12_;
							if (is[i_10_] == 2) {
								i_11_ = class103s[i_3_].anInt1334 * 1471358871;
								i_12_ = class103.anInt1334 * 1471358871;
							} else if (is[i_10_] == 1) {
								i_11_ = -995202549 * class103s[i_3_].anInt1319;
								i_12_ = -995202549 * class103.anInt1319;
								if (i_11_ == -1 && 1 == is_1_[i_10_]) {
									i_11_ = 2001;
								}
								if (i_12_ == -1 && 1 == is_1_[i_10_]) {
									i_12_ = 2001;
								}
							} else if (3 == is[i_10_]) {
								int i_13_;
								if (class103s[i_3_].aBoolean1321) {
									i_13_ = 1;
								} else {
									i_13_ = 0;
								}
								i_11_ = i_13_;
								if (class103.aBoolean1321) {
									i_13_ = 1;
								} else {
									i_13_ = 0;
								}
								i_12_ = i_13_;
							} else {
								i_11_ = -1659167479 * class103s[i_3_].anInt1335;
								i_12_ = -1659167479 * class103.anInt1335;
							}
							if (i_11_ != i_12_) {
								if (is_1_[i_10_] == 1 && i_11_ < i_12_) {
									if (i_2_ <= 159) {
										throw new IllegalStateException();
									}
								} else if (is_1_[i_10_] == 0 && i_11_ > i_12_) {
									if (i_2_ <= 159) {
										throw new IllegalStateException();
									}
								} else {
									bool = false;
								}
								break;
							}
							if (3 == i_10_) {
								bool = false;
							}
						}
					} while (bool);
					if (i_3_ < i_4_) {
						final Class103 class103_14_ = class103s[i_3_];
						class103s[i_3_] = class103s[i_4_];
						class103s[i_4_] = class103_14_;
					}
				}
			}
		} catch (final RuntimeException var14) {
			throw Class102.method1086(var14, "cq.l()");
		}
	}

	public static void method285(final Component component, final int i) {
		try {
			component.removeMouseListener(Class12.aClass12_183);
			component.removeMouseMotionListener(Class12.aClass12_183);
			component.removeFocusListener(Class12.aClass12_183);
			Class12.anInt169 = 0;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "cq.w()");
		}
	}

	Class35() throws Throwable {
		try {
			throw new Error();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "cq.<init>()");
		}
	}

	static final boolean method286(final int i) {
		try {
			if (Class91_Sub20_Sub14_Sub6.aClass20_2819 == null) {
				return false;
			}
			try {
				int i_15_ = Class91_Sub20_Sub14_Sub6.aClass20_2819.method196((byte) 5);
				if (i_15_ == 0) {
					return false;
				}
				if (client.anInt1482 * -2005995539 == -1) {
					Class91_Sub20_Sub14_Sub6.aClass20_2819.method199(client.aClass91_Sub9_Sub1_1480.buffer, 0, 1, (short) -2712);
					client.aClass91_Sub9_Sub1_1480.currentOffset = 0;
					client.anInt1482 = client.aClass91_Sub9_Sub1_1480.method691(-952154771) * 1986708965;
					client.anInt1570 = Class84.anIntArray1156[client.anInt1482 * -2005995539] * 2103573359;
					i_15_--;
				}
				if (client.anInt1570 * 1152500623 == -1) {
					if (i_15_ <= 0) {
						return false;
					}
					Class91_Sub20_Sub14_Sub6.aClass20_2819.method199(client.aClass91_Sub9_Sub1_1480.buffer, 0, 1, (short) -13784);
					client.anInt1570 = 2103573359 * (client.aClass91_Sub9_Sub1_1480.buffer[0] & 0xff);
					i_15_--;
				}
				if (-2 == 1152500623 * client.anInt1570) {
					if (i_15_ <= 1) {
						return false;
					}
					Class91_Sub20_Sub14_Sub6.aClass20_2819.method199(client.aClass91_Sub9_Sub1_1480.buffer, 0, 2, (short) -7909);
					client.aClass91_Sub9_Sub1_1480.currentOffset = 0;
					client.anInt1570 = client.aClass91_Sub9_Sub1_1480.method686((byte) -89) * 2103573359;
					i_15_ -= 2;
				}
				if (i_15_ < client.anInt1570 * 1152500623) {
					return false;
				}
				client.aClass91_Sub9_Sub1_1480.currentOffset = 0;
				Class91_Sub20_Sub14_Sub6.aClass20_2819.method199(client.aClass91_Sub9_Sub1_1480.buffer, 0, 1152500623 * client.anInt1570, (short) -9418);
				client.anInt1524 = 0;
				client.anInt1447 = 1965575235 * client.anInt1687;
				client.anInt1687 = client.anInt1486 * 928796497;
				client.anInt1486 = -1061778387 * client.anInt1482;
				if (197 == -2005995539 * client.anInt1482) {
					client.anInt1582 = 0;
					client.anInt1565 = 0;
					client.aClass91_Sub9_Sub1_1480.method695((byte) 115);
					int i_16_ = client.aClass91_Sub9_Sub1_1480.method693(8, 1286800452);
					if (i_16_ < client.anInt1684 * 1050401801) {
						for (int i_17_ = i_16_; i_17_ < client.anInt1684 * 1050401801; i_17_++) {
							client.anIntArray1444[(client.anInt1582 += -492085503) * 194355457 - 1] = client.anIntArray1445[i_17_];
						}
					}
					if (i_16_ > 1050401801 * client.anInt1684) {
						throw new RuntimeException("");
					}
					client.anInt1684 = 0;
					for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
						final int i_19_ = client.anIntArray1445[i_18_];
						final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_19_];
						final int i_20_ = client.aClass91_Sub9_Sub1_1480.method693(1, 1286800452);
						if (i_20_ == 0) {
							client.anIntArray1445[(client.anInt1684 += -523210183) * 1050401801 - 1] = i_19_;
							class91_sub20_sub14_sub1_sub2.anInt2628 = client.anInt1449 * 783475325;
						} else {
							final int i_21_ = client.aClass91_Sub9_Sub1_1480.method693(2, 1286800452);
							if (i_21_ == 0) {
								client.anIntArray1445[(client.anInt1684 += -523210183) * 1050401801 - 1] = i_19_;
								class91_sub20_sub14_sub1_sub2.anInt2628 = client.anInt1449 * 783475325;
								client.anIntArray1566[(client.anInt1565 += 892078071) * -1087706681 - 1] = i_19_;
							} else if (1 == i_21_) {
								client.anIntArray1445[(client.anInt1684 += -523210183) * 1050401801 - 1] = i_19_;
								class91_sub20_sub14_sub1_sub2.anInt2628 = 783475325 * client.anInt1449;
								final int i_22_ = client.aClass91_Sub9_Sub1_1480.method693(3, 1286800452);
								class91_sub20_sub14_sub1_sub2.method921(i_22_, false, 1328611357);
								final int i_23_ = client.aClass91_Sub9_Sub1_1480.method693(1, 1286800452);
								if (i_23_ == 1) {
									client.anIntArray1566[(client.anInt1565 += 892078071) * -1087706681 - 1] = i_19_;
								}
							} else if (2 == i_21_) {
								client.anIntArray1445[(client.anInt1684 += -523210183) * 1050401801 - 1] = i_19_;
								class91_sub20_sub14_sub1_sub2.anInt2628 = client.anInt1449 * 783475325;
								final int i_24_ = client.aClass91_Sub9_Sub1_1480.method693(3, 1286800452);
								class91_sub20_sub14_sub1_sub2.method921(i_24_, true, -2130029165);
								final int i_25_ = client.aClass91_Sub9_Sub1_1480.method693(3, 1286800452);
								class91_sub20_sub14_sub1_sub2.method921(i_25_, true, 250467436);
								final int i_26_ = client.aClass91_Sub9_Sub1_1480.method693(1, 1286800452);
								if (i_26_ == 1) {
									client.anIntArray1566[(client.anInt1565 += 892078071) * -1087706681 - 1] = i_19_;
								}
							} else if (3 == i_21_) {
								client.anIntArray1444[(client.anInt1582 += -492085503) * 194355457 - 1] = i_19_;
							}
						}
					}
					while (client.aClass91_Sub9_Sub1_1480.method692(1152500623 * client.anInt1570, (byte) -5) >= 27) {
						i_16_ = client.aClass91_Sub9_Sub1_1480.method693(15, 1286800452);
						if (i_16_ == 32767) {
							break;
						}
						boolean bool = false;
						if (client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_16_] == null) {
							client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_16_] = new Class91_Sub20_Sub14_Sub1_Sub2();
							bool = true;
						}
						final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_16_];
						client.anIntArray1445[(client.anInt1684 += -523210183) * 1050401801 - 1] = i_16_;
						class91_sub20_sub14_sub1_sub2.anInt2628 = 783475325 * client.anInt1449;
						int i_27_ = client.aClass91_Sub9_Sub1_1480.method693(5, 1286800452);
						if (i_27_ > 15) {
							i_27_ -= 32;
						}
						int i_28_ = client.aClass91_Sub9_Sub1_1480.method693(5, 1286800452);
						if (i_28_ > 15) {
							i_28_ -= 32;
						}
						class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858 = Class100.method1075(client.aClass91_Sub9_Sub1_1480.method693(14, 1286800452), 1664971139);
						final int i_29_ = client.anIntArray1601[client.aClass91_Sub9_Sub1_1480.method693(3, 1286800452)];
						if (bool) {
							class91_sub20_sub14_sub1_sub2.anInt2630 = (class91_sub20_sub14_sub1_sub2.anInt2593 = 252387141 * i_29_) * -1730506573;
						}
						final int i_30_ = client.aClass91_Sub9_Sub1_1480.method693(1, 1286800452);
						final int i_31_ = client.aClass91_Sub9_Sub1_1480.method693(1, 1286800452);
						if (i_31_ == 1) {
							client.anIntArray1566[(client.anInt1565 += 892078071) * -1087706681 - 1] = i_16_;
						}
						class91_sub20_sub14_sub1_sub2.anInt2622 = -726668345 * class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2424;
						class91_sub20_sub14_sub1_sub2.anInt2632 = -1283388129 * class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2440;
						if (class91_sub20_sub14_sub1_sub2.anInt2632 * 1227519091 == 0) {
							class91_sub20_sub14_sub1_sub2.anInt2593 = 0;
						}
						class91_sub20_sub14_sub1_sub2.anInt2590 = class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2435 * 1422930133;
						class91_sub20_sub14_sub1_sub2.anInt2638 = class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2436 * -627631081;
						class91_sub20_sub14_sub1_sub2.anInt2584 = -770744385 * class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2437;
						class91_sub20_sub14_sub1_sub2.anInt2594 = class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2438 * 1284421035;
						class91_sub20_sub14_sub1_sub2.anInt2587 = 1526124475 * class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2429;
						class91_sub20_sub14_sub1_sub2.anInt2588 = -453558823 * class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2447;
						class91_sub20_sub14_sub1_sub2.anInt2598 = class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2434 * -1247493113;
						class91_sub20_sub14_sub1_sub2.method924(i_28_ + Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0] + i_27_, i_30_ == 1, (byte) 23);
					}
					client.aClass91_Sub9_Sub1_1480.method694((byte) 93);
					for (i_16_ = 0; i_16_ < client.anInt1565 * -1087706681; i_16_++) {
						final int i_32_ = client.anIntArray1566[i_16_];
						final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_32_];
						final int i_33_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
						if ((i_33_ & 0x2) != 0) {
							class91_sub20_sub14_sub1_sub2.anInt2636 = client.aClass91_Sub9_Sub1_1480.method662(1967324783) * 496339617;
							class91_sub20_sub14_sub1_sub2.anInt2607 = client.aClass91_Sub9_Sub1_1480.method663((byte) -108) * -926353243;
						}
						if ((i_33_ & 0x10) != 0) {
							final int i_34_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
							final int i_35_ = client.aClass91_Sub9_Sub1_1480.method655(1469521788);
							class91_sub20_sub14_sub1_sub2.method920(i_34_, i_35_, client.anInt1449 * 2026135825, -1818871814);
							class91_sub20_sub14_sub1_sub2.anInt2602 = -1900623343 * client.anInt1449 + 388123948;
							class91_sub20_sub14_sub1_sub2.anInt2592 = client.aClass91_Sub9_Sub1_1480.method675((byte) 7) * -1332589513;
							class91_sub20_sub14_sub1_sub2.anInt2586 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * -1271586427;
						}
						if ((i_33_ & 0x80) != 0) {
							class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858 = Class100.method1075(client.aClass91_Sub9_Sub1_1480.method683((byte) 42), -348491223);
							class91_sub20_sub14_sub1_sub2.anInt2622 = -726668345 * class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2424;
							class91_sub20_sub14_sub1_sub2.anInt2632 = class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2440 * -1283388129;
							class91_sub20_sub14_sub1_sub2.anInt2590 = 1422930133 * class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2435;
							class91_sub20_sub14_sub1_sub2.anInt2638 = class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2436 * -627631081;
							class91_sub20_sub14_sub1_sub2.anInt2584 = -770744385 * class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2437;
							class91_sub20_sub14_sub1_sub2.anInt2594 = class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2438 * 1284421035;
							class91_sub20_sub14_sub1_sub2.anInt2587 = 1526124475 * class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2429;
							class91_sub20_sub14_sub1_sub2.anInt2588 = -453558823 * class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2447;
							class91_sub20_sub14_sub1_sub2.anInt2598 = -1247493113 * class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.anInt2434;
						}
						if ((i_33_ & 0x40) != 0) {
							class91_sub20_sub14_sub1_sub2.aString2595 = client.aClass91_Sub9_Sub1_1480.method645((byte) -20);
							class91_sub20_sub14_sub1_sub2.anInt2596 = -1614877652;
						}
						if ((i_33_ & 0x1) != 0) {
							final int i_36_ = client.aClass91_Sub9_Sub1_1480.method675((byte) 7);
							final int i_37_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
							class91_sub20_sub14_sub1_sub2.method920(i_36_, i_37_, 2026135825 * client.anInt1449, -1704590504);
							class91_sub20_sub14_sub1_sub2.anInt2602 = client.anInt1449 * -1900623343 + 388123948;
							class91_sub20_sub14_sub1_sub2.anInt2592 = client.aClass91_Sub9_Sub1_1480.method655(1214627360) * -1332589513;
							class91_sub20_sub14_sub1_sub2.anInt2586 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * -1271586427;
						}
						if ((i_33_ & 0x8) != 0) {
							class91_sub20_sub14_sub1_sub2.anInt2616 = client.aClass91_Sub9_Sub1_1480.method662(1249786909) * 721446737;
							final int i_38_ = client.aClass91_Sub9_Sub1_1480.readDword();
							class91_sub20_sub14_sub1_sub2.anInt2591 = (i_38_ >> 16) * -172786615;
							class91_sub20_sub14_sub1_sub2.anInt2619 = -1992234733 * (2026135825 * client.anInt1449 + (i_38_ & 0xffff));
							class91_sub20_sub14_sub1_sub2.anInt2635 = 0;
							class91_sub20_sub14_sub1_sub2.anInt2618 = 0;
							if (-592754405 * class91_sub20_sub14_sub1_sub2.anInt2619 > client.anInt1449 * 2026135825) {
								class91_sub20_sub14_sub1_sub2.anInt2635 = 68657127;
							}
							if (65535 == class91_sub20_sub14_sub1_sub2.anInt2616 * 493699505) {
								class91_sub20_sub14_sub1_sub2.anInt2616 = -721446737;
							}
						}
						if ((i_33_ & 0x4) != 0) {
							int i_39_ = client.aClass91_Sub9_Sub1_1480.method683((byte) 63);
							if (65535 == i_39_) {
								i_39_ = -1;
							}
							final int i_40_ = client.aClass91_Sub9_Sub1_1480.method656(1271526928);
							if (i_39_ == -815127219 * class91_sub20_sub14_sub1_sub2.anInt2611 && i_39_ != -1) {
								final int i_41_ = Class7.method152(i_39_, 124691206).anInt2281 * -778311109;
								if (i_41_ == 1) {
									class91_sub20_sub14_sub1_sub2.anInt2612 = 0;
									class91_sub20_sub14_sub1_sub2.anInt2613 = 0;
									class91_sub20_sub14_sub1_sub2.anInt2614 = i_40_ * -1381698923;
									class91_sub20_sub14_sub1_sub2.anInt2582 = 0;
								}
								if (2 == i_41_) {
									class91_sub20_sub14_sub1_sub2.anInt2582 = 0;
								}
							} else if (-1 == i_39_ || class91_sub20_sub14_sub1_sub2.anInt2611 * -815127219 == -1 || Class7.method152(i_39_, 1234631729).anInt2275 * 1860819239 >= Class7.method152(class91_sub20_sub14_sub1_sub2.anInt2611 * -815127219, 964980664).anInt2275 * 1860819239) {
								class91_sub20_sub14_sub1_sub2.anInt2611 = i_39_ * 1205443461;
								class91_sub20_sub14_sub1_sub2.anInt2612 = 0;
								class91_sub20_sub14_sub1_sub2.anInt2613 = 0;
								class91_sub20_sub14_sub1_sub2.anInt2614 = i_40_ * -1381698923;
								class91_sub20_sub14_sub1_sub2.anInt2582 = 0;
								class91_sub20_sub14_sub1_sub2.anInt2633 = -1888793483 * class91_sub20_sub14_sub1_sub2.anInt2608;
							}
						}
						if ((i_33_ & 0x20) != 0) {
							class91_sub20_sub14_sub1_sub2.anInt2605 = client.aClass91_Sub9_Sub1_1480.method663((byte) -85) * 728389403;
							if (-452056301 * class91_sub20_sub14_sub1_sub2.anInt2605 == 65535) {
								class91_sub20_sub14_sub1_sub2.anInt2605 = -728389403;
							}
						}
					}
					for (i_16_ = 0; i_16_ < client.anInt1582 * 194355457; i_16_++) {
						final int i_42_ = client.anIntArray1444[i_16_];
						if (736381221 * client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_42_].anInt2628 != 2026135825 * client.anInt1449) {
							client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_42_].aClass91_Sub20_Sub11_2858 = null;
							client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_42_] = null;
						}
					}
					if (1152500623 * client.anInt1570 != -1128893257 * client.aClass91_Sub9_Sub1_1480.currentOffset) {
						throw new RuntimeException(new StringBuilder(String.valueOf(-1128893257 * client.aClass91_Sub9_Sub1_1480.currentOffset)).append(Class106.aString1369).append(1152500623 * client.anInt1570).toString());
					}
					for (i_16_ = 0; i_16_ < client.anInt1684 * 1050401801; i_16_++) {
						if (client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[client.anIntArray1445[i_16_]] == null) {
							throw new RuntimeException(new StringBuilder(String.valueOf(i_16_)).append(Class106.aString1369).append(client.anInt1684 * 1050401801).toString());
						}
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (client.anInt1482 * -2005995539 == 212) {
					client.method71(-1469717806);
					client.anInt1517 = client.aClass91_Sub9_Sub1_1480.readShort2() * -1315042575;
					client.anInt1635 = 754711073 * client.anInt1640;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (233 == -2005995539 * client.anInt1482) {
					client.anInt1674 = 0;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (client.anInt1482 * -2005995539 == 214) {
					final int i_43_ = client.aClass91_Sub9_Sub1_1480.method676((byte) 7);
					int i_44_ = client.aClass91_Sub9_Sub1_1480.method683((byte) 127);
					if (65535 == i_44_) {
						i_44_ = -1;
					}
					final int i_45_ = client.aClass91_Sub9_Sub1_1480.method669(1929747568);
					int i_46_ = client.aClass91_Sub9_Sub1_1480.method662(1184059789);
					if (i_46_ == 65535) {
						i_46_ = -1;
					}
					for (int i_47_ = i_44_; i_47_ <= i_46_; i_47_++) {
						final long l = i_47_ + ((long) i_43_ << 32);
						final Class91 class91 = client.aClass83_1642.method474(l);
						if (class91 != null) {
							class91.method495();
						}
						client.aClass83_1642.method478(new Class91_Sub17(i_45_), l);
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 207) {
					final int i_48_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -73);
					final int i_49_ = client.aClass91_Sub9_Sub1_1480.readDword();
					final int i_50_ = client.aClass91_Sub9_Sub1_1480.method683((byte) 107);
					final int i_51_ = client.aClass91_Sub9_Sub1_1480.method663((byte) -72);
					final Class91_Sub18 class91_sub18 = Class61.method394(i_49_, -631047529);
					if (231157787 * class91_sub18.anInt2039 != i_48_ || i_50_ != class91_sub18.anInt2010 * 1557210095 || i_51_ != 283795161 * class91_sub18.anInt2072) {
						class91_sub18.anInt2039 = i_48_ * 1210657299;
						class91_sub18.anInt2010 = i_50_ * -203003121;
						class91_sub18.anInt2072 = 1910129001 * i_51_;
						Class28_Sub1.method272(class91_sub18, -1905179897);
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (37 == -2005995539 * client.anInt1482) {
					client.aBoolean1689 = true;
					Class103.anInt1333 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * -896900741;
					Class107.anInt1395 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * 264486037;
					Class41.anInt549 = client.aClass91_Sub9_Sub1_1480.method686((byte) -62) * 554834129;
					Class91_Sub24.anInt2125 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * -1984837997;
					Class21.anInt276 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * 1513489807;
					if (-614631057 * Class21.anInt276 >= 100) {
						Class101.anInt1288 = 1437402240 * Class103.anInt1333 + -1830103872;
						Class105.anInt1365 = 1672467520 + Class107.anInt1395 * 1902536320;
						Class100.anInt1244 = (Class4.method92(-393490213 * Class101.anInt1288, Class105.anInt1365 * 2015226289, -1723088013 * Class100.anInt1248, -1781280778) - Class41.anInt549 * 1699037233) * -238608779;
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (126 == -2005995539 * client.anInt1482) {
					while (-1128893257 * client.aClass91_Sub9_Sub1_1480.currentOffset < client.anInt1570 * 1152500623) {
						final boolean bool = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() == 1;
						String string = client.aClass91_Sub9_Sub1_1480.method645((byte) -78);
						final String string_52_ = client.aClass91_Sub9_Sub1_1480.method645((byte) -112);
						final int i_53_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -98);
						final int i_54_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
						final int i_55_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
						final boolean bool_56_ = (i_55_ & 0x2) != 0;
						final boolean bool_57_ = (i_55_ & 0x1) != 0;
						if (i_53_ > 0) {
							client.aClass91_Sub9_Sub1_1480.method645((byte) -22);
							client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
							client.aClass91_Sub9_Sub1_1480.readDword();
						}
						client.aClass91_Sub9_Sub1_1480.method645((byte) -128);
						for (int i_58_ = 0; i_58_ < -1596316121 * client.anInt1695; i_58_++) {
							final Class100 class100 = client.aClass100Array1491[i_58_];
							if (!bool) {
								if (string.equals(class100.aString1251)) {
									if (511422265 * class100.anInt1240 != i_53_) {
										boolean bool_59_ = true;
										for (Class86_Sub1 class86_sub1 = (Class86_Sub1) client.aClass92_1639.method1056(); class86_sub1 != null; class86_sub1 = (Class86_Sub1) client.aClass92_1639.method1055()) {
											if (class86_sub1.aString1745.equals(string)) {
												if (i_53_ != 0 && class86_sub1.aShort1747 == 0) {
													class86_sub1.method488();
													bool_59_ = false;
												} else if (i_53_ == 0 && class86_sub1.aShort1747 != 0) {
													class86_sub1.method488();
													bool_59_ = false;
												}
											}
										}
										if (bool_59_) {
											client.aClass92_1639.method1054(new Class86_Sub1(string, i_53_));
										}
										class100.anInt1240 = i_53_ * 653692681;
									}
									class100.aString1239 = string_52_;
									class100.anInt1241 = i_54_ * 1350816315;
									class100.aBoolean1242 = bool_56_;
									class100.aBoolean1238 = bool_57_;
									string = null;
									break;
								}
							} else if (string_52_.equals(class100.aString1251)) {
								class100.aString1251 = string;
								class100.aString1239 = string_52_;
								string = null;
								break;
							}
						}
						if (string != null && -1596316121 * client.anInt1695 < 400) {
							final Class100 class100 = new Class100();
							client.aClass100Array1491[-1596316121 * client.anInt1695] = class100;
							class100.aString1251 = string;
							class100.aString1239 = string_52_;
							class100.anInt1240 = i_53_ * 653692681;
							class100.anInt1241 = i_54_ * 1350816315;
							class100.aBoolean1242 = bool_56_;
							class100.aBoolean1238 = bool_57_;
							client.anInt1695 += -1562973801;
						}
					}
					client.anInt1696 = 2096268214;
					client.anInt1633 = 602232347 * client.anInt1640;
					boolean bool = false;
					int i_60_ = client.anInt1695 * -1596316121;
					while (i_60_ > 0) {
						bool = true;
						i_60_--;
						for (int i_61_ = 0; i_61_ < i_60_; i_61_++) {
							boolean bool_62_ = false;
							final Class100 class100 = client.aClass100Array1491[i_61_];
							final Class100 class100_63_ = client.aClass100Array1491[i_61_ + 1];
							if (121784213 * client.anInt1660 != 511422265 * class100.anInt1240 && class100_63_.anInt1240 * 511422265 == client.anInt1660 * 121784213) {
								bool_62_ = true;
							}
							if (!bool_62_ && class100.anInt1240 * 511422265 == 0 && class100_63_.anInt1240 * 511422265 != 0) {
								bool_62_ = true;
							}
							if (!bool_62_ && !class100.aBoolean1242 && class100_63_.aBoolean1242) {
								bool_62_ = true;
							}
							if (!bool_62_ && !class100.aBoolean1238 && class100_63_.aBoolean1238) {
								bool_62_ = true;
							}
							if (bool_62_) {
								final Class100 class100_64_ = client.aClass100Array1491[i_61_];
								client.aClass100Array1491[i_61_] = client.aClass100Array1491[1 + i_61_];
								client.aClass100Array1491[1 + i_61_] = class100_64_;
								bool = false;
							}
						}
						if (bool) {
							break;
						}
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 102) {
					final int i_65_ = client.aClass91_Sub9_Sub1_1480.readDword();
					int i_66_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -109);
					if (i_65_ < -70000) {
						i_66_ += 32768;
					}
					Class91_Sub18 class91_sub18;
					if (i_65_ >= 0) {
						class91_sub18 = Class61.method394(i_65_, -631047529);
					} else {
						class91_sub18 = null;
					}
					if (class91_sub18 != null) {
						for (int i_67_ = 0; i_67_ < class91_sub18.anIntArray2030.length; i_67_++) {
							class91_sub18.anIntArray2030[i_67_] = 0;
							class91_sub18.anIntArray1984[i_67_] = 0;
						}
					}
					final Class91_Sub22 class91_sub22 = (Class91_Sub22) Class91_Sub22.aClass83_2108.method474(i_66_);
					if (class91_sub22 != null) {
						for (int i_68_ = 0; i_68_ < class91_sub22.anIntArray2105.length; i_68_++) {
							class91_sub22.anIntArray2105[i_68_] = -1;
							class91_sub22.anIntArray2106[i_68_] = 0;
						}
					}
					final int i_69_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -13);
					for (int i_70_ = 0; i_70_ < i_69_; i_70_++) {
						final int i_71_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -32);
						int i_72_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
						if (255 == i_72_) {
							i_72_ = client.aClass91_Sub9_Sub1_1480.readDword();
						}
						if (class91_sub18 != null && i_70_ < class91_sub18.anIntArray2030.length) {
							class91_sub18.anIntArray2030[i_70_] = i_71_;
							class91_sub18.anIntArray1984[i_70_] = i_72_;
						}
						IdkType.method734(i_66_, i_70_, i_71_ - 1, i_72_, 376681655);
					}
					if (class91_sub18 != null) {
						Class28_Sub1.method272(class91_sub18, -1905179897);
					}
					client.method71(-553266499);
					client.anIntArray1537[(client.anInt1629 += -1476414997) * -1162219837 - 1 & 0x1f] = i_66_ & 0x7fff;
					client.anInt1482 = -1986708965;
					return true;
				}
				/*if (-2005995539 * client.anInt1482 == 68) {
					final int i_73_ = client.aClass91_Sub9_Sub1_1480.method403();
					Class91_Sub20_Sub14_Sub6.aClass29_2818 = Class91_Sub22.aClass25_2110.method235(i_73_, (short) 210);
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 53) {
					final int i_74_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -88);
					final int i_75_ = client.aClass91_Sub9_Sub1_1480.method403();
					final Class91_Sub18 class91_sub18 = Class61.method394(i_75_, -631047529);
					if (1 != class91_sub18.anInt2001 * -1360773521 || class91_sub18.anInt2002 * -1971637167 != i_74_) {
						class91_sub18.anInt2001 = -702488433;
						class91_sub18.anInt2002 = -218983247 * i_74_;
						Class28_Sub1.method272(class91_sub18, -1905179897);
					}
					client.anInt1482 = -1986708965;
					return true;
				}*/
				if (-2005995539 * client.anInt1482 == 44) {
					client.anInt1696 = -1099349541;
					client.anInt1633 = 602232347 * client.anInt1640;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (216 == client.anInt1482 * -2005995539) {
					final int i_76_ = client.aClass91_Sub9_Sub1_1480.readDword();
					final Class91_Sub10 class91_sub10 = (Class91_Sub10) client.aClass83_1603.method474(i_76_);
					if (class91_sub10 != null) {
						Class102.method1081(class91_sub10, true, -1363054508);
					}
					if (client.aClass91_Sub18_1606 != null) {
						Class28_Sub1.method272(client.aClass91_Sub18_1606, -1905179897);
						client.aClass91_Sub18_1606 = null;
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				/*if (-2005995539 * client.anInt1482 == 78) {
					final int i_77_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -40);
					final int i_78_ = client.aClass91_Sub9_Sub1_1480.method403();
					final int i_79_ = client.aClass91_Sub9_Sub1_1480.method662(2126574704);
					final Class91_Sub18 class91_sub18 = Class61.method394(i_78_, -631047529);
					class91_sub18.anInt1994 = 374202345 * ((i_79_ << 16) + i_77_);
					client.anInt1482 = -1986708965;
					return true;
				}*/
				if (-2005995539 * client.anInt1482 == 131) {
					client.anInt1544 = client.aClass91_Sub9_Sub1_1480.method686((byte) -67) * 1011944046;
					client.anInt1635 = client.anInt1640 * 754711073;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (86 == -2005995539 * client.anInt1482) {
					final String string = client.aClass91_Sub9_Sub1_1480.method645((byte) -57);
					final int i_80_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -5);
					final byte i_81_ = client.aClass91_Sub9_Sub1_1480.method642(895437913);
					boolean bool = false;
					if (i_81_ == -128) {
						bool = true;
					}
					if (bool) {
						if (Class17.anInt241 * -579770847 == 0) {
							client.anInt1482 = -1986708965;
							return true;
						}
						int i_82_;
						for (i_82_ = 0; i_82_ < -579770847 * Class17.anInt241 && (!ObjType.aClass91_Sub23Array2395[i_82_].aString2123.equals(string) || ObjType.aClass91_Sub23Array2395[i_82_].anInt2120 * 202071895 != i_80_); i_82_++) {
							/* empty */
						}
						if (i_82_ < -579770847 * Class17.anInt241) {
							for (/**/; i_82_ < -579770847 * Class17.anInt241 - 1; i_82_++) {
								ObjType.aClass91_Sub23Array2395[i_82_] = ObjType.aClass91_Sub23Array2395[i_82_ + 1];
							}
							Class17.anInt241 -= -682385951;
							ObjType.aClass91_Sub23Array2395[Class17.anInt241 * -579770847] = null;
						}
					} else {
						client.aClass91_Sub9_Sub1_1480.method645((byte) -38);
						final Class91_Sub23 class91_sub23 = new Class91_Sub23();
						class91_sub23.aString2123 = string;
						class91_sub23.aString2114 = Class91_Sub20_Sub14_Sub4.method1002(class91_sub23.aString2123, Class41.aClass98_551, (byte) 37);
						class91_sub23.anInt2120 = i_80_ * -2111439769;
						class91_sub23.aByte2116 = i_81_;
						int i_83_;
						for (i_83_ = -579770847 * Class17.anInt241 - 1; i_83_ >= 0; i_83_--) {
							final int i_84_ = ObjType.aClass91_Sub23Array2395[i_83_].aString2114.compareTo(class91_sub23.aString2123);
							if (i_84_ == 0) {
								ObjType.aClass91_Sub23Array2395[i_83_].anInt2120 = -2111439769 * i_80_;
								ObjType.aClass91_Sub23Array2395[i_83_].aByte2116 = i_81_;
								if (string.equals(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.aString2841)) {
									Class91_Sub11.aByte1876 = i_81_;
								}
								client.anInt1634 = client.anInt1640 * -907258279;
								client.anInt1482 = -1986708965;
								return true;
							}
							if (i_84_ < 0) {
								break;
							}
						}
						if (-579770847 * Class17.anInt241 >= ObjType.aClass91_Sub23Array2395.length) {
							client.anInt1482 = -1986708965;
							return true;
						}
						for (int i_85_ = -579770847 * Class17.anInt241 - 1; i_85_ > i_83_; i_85_--) {
							ObjType.aClass91_Sub23Array2395[1 + i_85_] = ObjType.aClass91_Sub23Array2395[i_85_];
						}
						if (Class17.anInt241 * -579770847 == 0) {
							ObjType.aClass91_Sub23Array2395 = new Class91_Sub23[100];
						}
						ObjType.aClass91_Sub23Array2395[1 + i_83_] = class91_sub23;
						Class17.anInt241 += -682385951;
						if (string.equals(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.aString2841)) {
							Class91_Sub11.aByte1876 = i_81_;
						}
					}
					client.anInt1634 = client.anInt1640 * -907258279;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (40 == client.anInt1482 * -2005995539) {
					final int i_86_ = client.aClass91_Sub9_Sub1_1480.readDword();
					int i_87_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -47);
					if (i_86_ < -70000) {
						i_87_ += 32768;
					}
					Class91_Sub18 class91_sub18;
					if (i_86_ >= 0) {
						class91_sub18 = Class61.method394(i_86_, -631047529);
					} else {
						class91_sub18 = null;
					}
					while (client.aClass91_Sub9_Sub1_1480.currentOffset * -1128893257 < 1152500623 * client.anInt1570) {
						final int i_88_ = client.aClass91_Sub9_Sub1_1480.method649(-1732421661);
						final int i_89_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -28);
						int i_90_ = 0;
						if (i_89_ != 0) {
							i_90_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
							if (i_90_ == 255) {
								i_90_ = client.aClass91_Sub9_Sub1_1480.readDword();
							}
						}
						if (class91_sub18 != null && i_88_ >= 0 && i_88_ < class91_sub18.anIntArray2030.length) {
							class91_sub18.anIntArray2030[i_88_] = i_89_;
							class91_sub18.anIntArray1984[i_88_] = i_90_;
						}
						IdkType.method734(i_87_, i_88_, i_89_ - 1, i_90_, 878946815);
					}
					if (class91_sub18 != null) {
						Class28_Sub1.method272(class91_sub18, -1905179897);
					}
					client.method71(1457328436);
					client.anIntArray1537[(client.anInt1629 += -1476414997) * -1162219837 - 1 & 0x1f] = i_87_ & 0x7fff;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 188) {
					final int i_91_ = client.aClass91_Sub9_Sub1_1480.method655(1132139367);
					final int i_92_ = client.aClass91_Sub9_Sub1_1480.method656(827556360);
					final int i_93_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					Class100.anInt1248 = (i_91_ >> 1) * -777643589;
					Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.method924(i_93_, i_92_, 1 == (i_91_ & 0x1), (byte) 26);
					client.anInt1482 = -1986708965;
					return true;
				}
				if (232 == client.anInt1482 * -2005995539) {
					final int i_94_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -31);
					Class58.method388(i_94_, 27890084);
					client.anIntArray1537[(client.anInt1629 += -1476414997) * -1162219837 - 1 & 0x1f] = i_94_ & 0x7fff;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (client.anInt1482 * -2005995539 == 38) {
					client.method71(939061162);
					client.anInt1607 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * 265861579;
					client.anInt1635 = 754711073 * client.anInt1640;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (client.anInt1482 * -2005995539 == 23) {
					Class101.method1079(true, 993483427);
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 244) {
					while (client.aClass91_Sub9_Sub1_1480.currentOffset * -1128893257 < 1152500623 * client.anInt1570) {
						final int i_95_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
						final boolean bool = 1 == (i_95_ & 0x1);
						String string = client.aClass91_Sub9_Sub1_1480.method645((byte) -41);
						final String string_96_ = client.aClass91_Sub9_Sub1_1480.method645((byte) -73);
						client.aClass91_Sub9_Sub1_1480.method645((byte) -35);
						for (int i_97_ = 0; i_97_ < 8867313 * client.anInt1493; i_97_++) {
							final Class1 class1 = client.aClass1Array1700[i_97_];
							if (bool) {
								if (string_96_.equals(class1.aString29)) {
									class1.aString29 = string;
									class1.aString30 = string_96_;
									string = null;
									break;
								}
							} else if (string.equals(class1.aString29)) {
								class1.aString29 = string;
								class1.aString30 = string_96_;
								string = null;
								break;
							}
						}
						if (string != null && 8867313 * client.anInt1493 < 400) {
							final Class1 class1 = new Class1();
							client.aClass1Array1700[client.anInt1493 * 8867313] = class1;
							class1.aString29 = string;
							class1.aString30 = string_96_;
							client.anInt1493 += -1061551343;
						}
					}
					client.anInt1633 = 602232347 * client.anInt1640;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (210 == -2005995539 * client.anInt1482) {
					final int i_98_ = client.aClass91_Sub9_Sub1_1480.method662(1708422358);
					final int i_99_ = client.aClass91_Sub9_Sub1_1480.method676((byte) 7);
					final Class91_Sub18 class91_sub18 = Class61.method394(i_99_, -631047529);
					if (-1360773521 * class91_sub18.anInt2001 != 2 || i_98_ != -1971637167 * class91_sub18.anInt2002) {
						class91_sub18.anInt2001 = -1404976866;
						class91_sub18.anInt2002 = -218983247 * i_98_;
						Class28_Sub1.method272(class91_sub18, -1905179897);
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 90) {
					for (int i_100_ = 0; i_100_ < Class93.anIntArray1199.length; i_100_++) {
						if (Class93.anIntArray1197[i_100_] != Class93.anIntArray1199[i_100_]) {
							Class93.anIntArray1199[i_100_] = Class93.anIntArray1197[i_100_];
							Class91_Sub5.method617(i_100_, (byte) 43);
							client.anIntArray1626[(client.anInt1627 += -595653689) * 482952695 - 1 & 0x1f] = i_100_;
						}
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (1 == client.anInt1482 * -2005995539) {
					Class91_Sub20_Sub14_Sub1.anInt2639 = client.aClass91_Sub9_Sub1_1480.method655(1325031895) * -775074047;
					Class91_Sub20_Sub14_Sub6.anInt2820 = client.aClass91_Sub9_Sub1_1480.method675((byte) 7) * -802117285;
					for (int i_101_ = -577523455 * Class91_Sub20_Sub14_Sub1.anInt2639; i_101_ < 8 + -577523455 * Class91_Sub20_Sub14_Sub1.anInt2639; i_101_++) {
						for (int i_102_ = -164667693 * Class91_Sub20_Sub14_Sub6.anInt2820; i_102_ < 8 + Class91_Sub20_Sub14_Sub6.anInt2820 * -164667693; i_102_++) {
							if (client.aClass95ArrayArrayArray1477[-1723088013 * Class100.anInt1248][i_101_][i_102_] != null) {
								client.aClass95ArrayArrayArray1477[-1723088013 * Class100.anInt1248][i_101_][i_102_] = null;
								Class33.method278(i_101_, i_102_, (byte) 105);
							}
						}
					}
					for (Class91_Sub5 class91_sub5 = (Class91_Sub5) client.aClass95_1577.method1062(); class91_sub5 != null; class91_sub5 = (Class91_Sub5) client.aClass95_1577.method1063()) {
						if (class91_sub5.anInt1795 * -1323813057 >= Class91_Sub20_Sub14_Sub1.anInt2639 * -577523455 && class91_sub5.anInt1795 * -1323813057 < Class91_Sub20_Sub14_Sub1.anInt2639 * -577523455 + 8 && -1641318309 * class91_sub5.anInt1796 >= Class91_Sub20_Sub14_Sub6.anInt2820 * -164667693 && class91_sub5.anInt1796 * -1641318309 < -164667693 * Class91_Sub20_Sub14_Sub6.anInt2820 + 8
								&& Class100.anInt1248 * -1723088013 == -1012182999 * class91_sub5.anInt1807) {
							class91_sub5.anInt1804 = 0;
						}
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 69) {
					final int i_103_ = client.aClass91_Sub9_Sub1_1480.method663((byte) -101);
					client.anInt1602 = -1301836881 * i_103_;
					Class102.method1084(i_103_, -2080537870);
					Class97.method1072(-1918719153 * client.anInt1602, (byte) -20);
					for (int i_104_ = 0; i_104_ < 100; i_104_++) {
						client.aBooleanArray1645[i_104_] = true;
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 56) {
					int i_105_ = client.aClass91_Sub9_Sub1_1480.method683((byte) 50);
					final int i_106_ = client.aClass91_Sub9_Sub1_1480.method676((byte) 7);
					final Class91_Sub18 class91_sub18 = Class61.method394(i_106_, -631047529);
					if (class91_sub18 != null && 633275603 * class91_sub18.anInt2057 == 0) {
						if (i_105_ > class91_sub18.anInt1985 * 28734823 - class91_sub18.anInt1979 * -1807498407) {
							i_105_ = class91_sub18.anInt1985 * 28734823 - class91_sub18.anInt1979 * -1807498407;
						}
						if (i_105_ < 0) {
							i_105_ = 0;
						}
						if (class91_sub18.anInt2048 * 1916118407 != i_105_) {
							class91_sub18.anInt2048 = 454496311 * i_105_;
							Class28_Sub1.method272(class91_sub18, -1905179897);
						}
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (client.anInt1482 * -2005995539 == 63) {
					final String string = client.aClass91_Sub9_Sub1_1480.method645((byte) -62);
					final long l = client.aClass91_Sub9_Sub1_1480.method677(1142221582);
					final long l_107_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -54);
					final long l_108_ = client.aClass91_Sub9_Sub1_1480.read3Bytes();
					final int i_109_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					final long l_110_ = l_108_ + (l_107_ << 32);
					boolean bool = false;
					for (int i_111_ = 0; i_111_ < 100; i_111_++) {
						if (client.aLongArray1661[i_111_] == l_110_) {
							bool = true;
							break;
						}
					}
					if (i_109_ <= 1 && Class91_Sub24.method1051(string, 2105620384)) {
						bool = true;
					}
					if (!bool && -749782133 * client.anInt1561 == 0) {
						client.aLongArray1661[client.anInt1643 * 2009747679] = l_110_;
						client.anInt1643 = (client.anInt1643 * 2009747679 + 1) % 100 * -1196594401;
						final Class91_Sub9_Sub1 class91_sub9_sub1 = client.aClass91_Sub9_Sub1_1480;
						String string_112_;
						try {
							int i_113_ = class91_sub9_sub1.method649(-1491916023);
							if (i_113_ > 32767) {
								i_113_ = 32767;
							}
							final byte[] is = new byte[i_113_];
							class91_sub9_sub1.currentOffset += Class99.aClass53_1235.method376(class91_sub9_sub1.buffer, -1128893257 * class91_sub9_sub1.currentOffset, is, 0, i_113_, 1728070811) * 565881095;
							final String string_114_ = Class91_Sub10.method697(is, 0, i_113_, (byte) 16);
							string_112_ = string_114_;
						} catch (final Exception exception) {
							string_112_ = "Cabbage";
						}
						string_112_ = Class91_Sub20_Sub13_Sub4.method892(Class25.method230(string_112_, 347538662));
						if (2 != i_109_ && i_109_ != 3) {
							if (i_109_ == 1) {
								Class91_Sub20_Sub14_Sub1_Sub2.method935(9, new StringBuilder(FloOverlayType.method747(0, 1508869600)).append(string).toString(), string_112_, Class107.method1108(l), (byte) -12);
							} else {
								Class91_Sub20_Sub14_Sub1_Sub2.method935(9, string, string_112_, Class107.method1108(l), (byte) -121);
							}
						} else {
							Class91_Sub20_Sub14_Sub1_Sub2.method935(9, new StringBuilder(FloOverlayType.method747(1, 1779174908)).append(string).toString(), string_112_, Class107.method1108(l), (byte) -102);
						}
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (client.anInt1482 * -2005995539 == 88) {
					String string = client.aClass91_Sub9_Sub1_1480.method645((byte) -122);
					final int i_115_ = client.aClass91_Sub9_Sub1_1480.method656(1769837473);
					final int i_116_ = client.aClass91_Sub9_Sub1_1480.method675((byte) 7);
					if (i_115_ >= 1 && i_115_ <= 8) {
						if (string.equalsIgnoreCase("null")) {
							string = null;
						}
						client.aStringArray1573[i_115_ - 1] = string;
						client.aBooleanArray1574[i_115_ - 1] = i_116_ == 0;
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 237) {
					final int i_117_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					final Class71[] class71s = { Class71.aClass71_826, Class71.aClass71_822, Class71.aClass71_825 };
					final Class71[] class71s_118_ = class71s;
					int i_119_ = 0;
					Class71 class71;
					for (;;) {
						if (i_119_ >= class71s_118_.length) {
							class71 = null;
							break;
						}
						final Class71 class71_120_ = class71s_118_[i_119_];
						if (i_117_ == -1100221425 * class71_120_.anInt824) {
							class71 = class71_120_;
							break;
						}
						i_119_++;
					}
					Class43.aClass71_571 = class71;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (client.anInt1482 * -2005995539 == 153) {
					final String string = client.aClass91_Sub9_Sub1_1480.method645((byte) -3);
					final long l = client.aClass91_Sub9_Sub1_1480.method686((byte) -65);
					final long l_121_ = client.aClass91_Sub9_Sub1_1480.read3Bytes();
					final int i_122_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					final long l_123_ = l_121_ + (l << 32);
					boolean bool = false;
					for (int i_124_ = 0; i_124_ < 100; i_124_++) {
						if (client.aLongArray1661[i_124_] == l_123_) {
							bool = true;
							break;
						}
					}
					if (Class91_Sub24.method1051(string, 1819804240)) {
						bool = true;
					}
					if (!bool && -749782133 * client.anInt1561 == 0) {
						client.aLongArray1661[client.anInt1643 * 2009747679] = l_123_;
						client.anInt1643 = -1196594401 * ((1 + client.anInt1643 * 2009747679) % 100);
						final Class91_Sub9_Sub1 class91_sub9_sub1 = client.aClass91_Sub9_Sub1_1480;
						String string_125_;
						try {
							int i_126_ = class91_sub9_sub1.method649(-1140247392);
							if (i_126_ > 32767) {
								i_126_ = 32767;
							}
							final byte[] is = new byte[i_126_];
							class91_sub9_sub1.currentOffset += Class99.aClass53_1235.method376(class91_sub9_sub1.buffer, class91_sub9_sub1.currentOffset * -1128893257, is, 0, i_126_, 295414197) * 565881095;
							final String string_127_ = Class91_Sub10.method697(is, 0, i_126_, (byte) 16);
							string_125_ = string_127_;
						} catch (final Exception exception) {
							string_125_ = "Cabbage";
						}
						string_125_ = Class91_Sub20_Sub13_Sub4.method892(Class25.method230(string_125_, 1144099271));
						if (i_122_ != 2 && 3 != i_122_) {
							if (1 == i_122_) {
								Class101.method1076(7, new StringBuilder(FloOverlayType.method747(0, -660064025)).append(string).toString(), string_125_, 1212374921);
							} else {
								Class101.method1076(3, string, string_125_, 1465940825);
							}
						} else {
							Class101.method1076(7, new StringBuilder(FloOverlayType.method747(1, 1446666481)).append(string).toString(), string_125_, 1824571420);
						}
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (51 == client.anInt1482 * -2005995539) {
					client.anInt1457 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * 940871081;
					if (1 == -522819943 * client.anInt1457) {
						client.anInt1458 = client.aClass91_Sub9_Sub1_1480.method686((byte) -37) * 515625039;
					}
					if (client.anInt1457 * -522819943 >= 2 && client.anInt1457 * -522819943 <= 6) {
						if (-522819943 * client.anInt1457 == 2) {
							client.anInt1463 = 2071621952;
							client.anInt1464 = -1545593536;
						}
						if (3 == client.anInt1457 * -522819943) {
							client.anInt1463 = 0;
							client.anInt1464 = -1545593536;
						}
						if (4 == client.anInt1457 * -522819943) {
							client.anInt1463 = -151723392;
							client.anInt1464 = -1545593536;
						}
						if (-522819943 * client.anInt1457 == 5) {
							client.anInt1463 = 2071621952;
							client.anInt1464 = 0;
						}
						if (client.anInt1457 * -522819943 == 6) {
							client.anInt1463 = 2071621952;
							client.anInt1464 = 1203780224;
						}
						client.anInt1457 = 1881742162;
						client.anInt1518 = client.aClass91_Sub9_Sub1_1480.method686((byte) -35) * -516517805;
						client.anInt1560 = client.aClass91_Sub9_Sub1_1480.method686((byte) -48) * -1774106507;
						client.anInt1438 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * 1216745597;
					}
					if (10 == -522819943 * client.anInt1457) {
						client.anInt1459 = client.aClass91_Sub9_Sub1_1480.method686((byte) -40) * -1845673919;
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 177) {
					final String string = client.aClass91_Sub9_Sub1_1480.method645((byte) -19);
					final Object[] objects = new Object[string.length() + 1];
					for (int i_128_ = string.length() - 1; i_128_ >= 0; i_128_--) {
						if (string.charAt(i_128_) == 's') {
							objects[1 + i_128_] = client.aClass91_Sub9_Sub1_1480.method645((byte) -33);
						} else {
							objects[1 + i_128_] = new Integer(client.aClass91_Sub9_Sub1_1480.readDword());
						}
					}
					objects[0] = new Integer(client.aClass91_Sub9_Sub1_1480.readDword());
					final Class91_Sub21 class91_sub21 = new Class91_Sub21();
					class91_sub21.anObjectArray2100 = objects;
					Class91_Sub20_Sub14.method919(class91_sub21, (short) 3840);
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 111 || 103 == -2005995539 * client.anInt1482 || 220 == client.anInt1482 * -2005995539 || client.anInt1482 * -2005995539 == 64 || -2005995539 * client.anInt1482 == 41 || 238 == -2005995539 * client.anInt1482 || client.anInt1482 * -2005995539 == 89 || 70 == client.anInt1482 * -2005995539 || 182 == -2005995539 * client.anInt1482
						|| 13 == client.anInt1482 * -2005995539 || client.anInt1482 * -2005995539 == 65) {
					Class20.method200(-1745589375);
					client.anInt1482 = -1986708965;
					return true;
				}
				if (107 == -2005995539 * client.anInt1482) {
					Class91_Sub20_Sub14_Sub6.anInt2820 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * -802117285;
					Class91_Sub20_Sub14_Sub1.anInt2639 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * -775074047;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 138) {
					client.anInt1676 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * -241957835;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (141 == client.anInt1482 * -2005995539) {
					Class1.method74(-772123891);
					client.anInt1482 = -1986708965;
					return true;
				}
				if (208 == client.anInt1482 * -2005995539) {
					final String string = client.aClass91_Sub9_Sub1_1480.method645((byte) -72);
					final Class91_Sub9_Sub1 class91_sub9_sub1 = client.aClass91_Sub9_Sub1_1480;
					String string_129_;
					try {
						int i_130_ = class91_sub9_sub1.method649(-2128952450);
						if (i_130_ > 32767) {
							i_130_ = 32767;
						}
						final byte[] is = new byte[i_130_];
						class91_sub9_sub1.currentOffset += Class99.aClass53_1235.method376(class91_sub9_sub1.buffer, class91_sub9_sub1.currentOffset * -1128893257, is, 0, i_130_, 1372263899) * 565881095;
						final String string_131_ = Class91_Sub10.method697(is, 0, i_130_, (byte) 16);
						string_129_ = string_131_;
					} catch (final Exception exception) {
						string_129_ = "Cabbage";
					}
					string_129_ = Class91_Sub20_Sub13_Sub4.method892(Class25.method230(string_129_, 2089548115));
					Class101.method1076(6, string, string_129_, 1152928868);
					client.anInt1482 = -1986708965;
					return true;
				}
				if (173 == -2005995539 * client.anInt1482) {
					Class91_Sub20_Sub5.method762(client.aClass91_Sub9_Sub1_1480, client.anInt1570 * 1152500623, (byte) -106);
					client.anInt1482 = -1986708965;
					return true;
				}
				if (149 == -2005995539 * client.anInt1482) {
					final int i_132_ = client.aClass91_Sub9_Sub1_1480.method658((short) 16256);
					final int i_133_ = client.aClass91_Sub9_Sub1_1480.method662(1384274635);
					Class93.anIntArray1197[i_133_] = i_132_;
					if (Class93.anIntArray1199[i_133_] != i_132_) {
						Class93.anIntArray1199[i_133_] = i_132_;
						Class91_Sub5.method617(i_133_, (byte) 49);
					}
					client.anIntArray1626[(client.anInt1627 += -595653689) * 482952695 - 1 & 0x1f] = i_133_;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 66) {
					final int i_134_ = client.aClass91_Sub9_Sub1_1480.method669(1755663973);
					final int i_135_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -74);
					final int i_136_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					final Class91_Sub10 class91_sub10 = (Class91_Sub10) client.aClass83_1603.method474(i_134_);
					if (class91_sub10 != null) {
						Class102.method1081(class91_sub10, i_135_ != 337747539 * class91_sub10.anInt1865, -1363054508);
					}
					final Class91_Sub10 class91_sub10_137_ = new Class91_Sub10();
					class91_sub10_137_.anInt1865 = i_135_ * -31173157;
					class91_sub10_137_.anInt1868 = 1230490469 * i_136_;
					client.aClass83_1603.method478(class91_sub10_137_, i_134_);
					Class102.method1084(i_135_, -1897673410);
					Class97.method1072(i_135_, (byte) 17);
					final Class91_Sub18 class91_sub18 = Class61.method394(i_134_, -631047529);
					if (class91_sub18 != null) {
						Class28_Sub1.method272(class91_sub18, -1905179897);
					}
					if (client.aClass91_Sub18_1606 != null) {
						Class28_Sub1.method272(client.aClass91_Sub18_1606, -1905179897);
						client.aClass91_Sub18_1606 = null;
					}
					for (int i_138_ = 0; i_138_ < 1335574821 * client.anInt1585; i_138_++) {
						if (Class102.method1082(client.anIntArray1588[i_138_], 835681397)) {
							if (i_138_ < 1335574821 * client.anInt1585 - 1) {
								for (int i_139_ = i_138_; i_139_ < client.anInt1585 * 1335574821 - 1; i_139_++) {
									client.aStringArray1638[i_139_] = client.aStringArray1638[i_139_ + 1];
									client.aStringArray1591[i_139_] = client.aStringArray1591[i_139_ + 1];
									client.anIntArray1588[i_139_] = client.anIntArray1588[1 + i_139_];
									client.anIntArray1589[i_139_] = client.anIntArray1589[1 + i_139_];
									client.anIntArray1586[i_139_] = client.anIntArray1586[i_139_ + 1];
									client.anIntArray1587[i_139_] = client.anIntArray1587[1 + i_139_];
								}
							}
							client.anInt1585 -= 109114029;
						}
					}
					if (-1 != client.anInt1602 * -1918719153) {
						Class34.method281(client.anInt1602 * -1918719153, 1, 2111241929);
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 135) {
					client.aBoolean1689 = true;
					Class2.anInt37 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * 571541607;
					Class54.anInt642 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * -646099025;
					Class34.anInt406 = client.aClass91_Sub9_Sub1_1480.method686((byte) -58) * 1864256589;
					Class40.anInt543 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * -101269667;
					Class24.anInt300 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * 1884347897;
					if (-743222199 * Class24.anInt300 >= 100) {
						final int i_140_ = 1388948352 * Class2.anInt37 + 64;
						final int i_141_ = 64 + Class54.anInt642 * -1514952832;
						final int i_142_ = Class4.method92(i_140_, i_141_, -1723088013 * Class100.anInt1248, -1620796655) - Class34.anInt406 * 415878277;
						final int i_143_ = i_140_ - Class101.anInt1288 * -393490213;
						final int i_144_ = i_142_ - 1224950237 * Class100.anInt1244;
						final int i_145_ = i_141_ - Class105.anInt1365 * 2015226289;
						final int i_146_ = (int) Math.sqrt(i_143_ * i_143_ + i_145_ * i_145_);
						Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 = ((int) (Math.atan2(i_144_, i_146_) * 325.949) & 0x7ff) * 1862537411;
						Class97.anInt1219 = ((int) (Math.atan2(i_143_, i_145_) * -325.949) & 0x7ff) * -110944069;
						if (Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 * 234823659 < 128) {
							Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 = -2113379968;
						}
						if (234823659 * Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 > 383) {
							Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 = 387257277;
						}
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				/*if (-2005995539 * client.anInt1482 == 42) {
					client.method71(-1194970325);
					final int i_147_ = client.aClass91_Sub9_Sub1_1480.method675((byte) 7);
					final int i_148_ = client.aClass91_Sub9_Sub1_1480.method655(-550436471);
					final int i_149_ = client.aClass91_Sub9_Sub1_1480.method403();
					client.anIntArray1488[i_148_] = i_149_;
					client.anIntArray1580[i_148_] = i_147_;
					client.anIntArray1581[i_148_] = 1;
					for (int i_150_ = 0; i_150_ < 98; i_150_++) {
						if (i_149_ >= Class46.anIntArray586[i_150_]) {
							client.anIntArray1581[i_148_] = 2 + i_150_;
						}
					}
					client.anIntArray1630[(client.anInt1631 += -57991193) * -1260157993 - 1 & 0x1f] = i_148_;
					client.anInt1482 = -1986708965;
					return true;
				}*/
				if (8 == client.anInt1482 * -2005995539) {
					final int i_151_ = client.aClass91_Sub9_Sub1_1480.method676((byte) 7);
					final Class91_Sub18 class91_sub18 = Class61.method394(i_151_, -631047529);
					for (int i_152_ = 0; i_152_ < class91_sub18.anIntArray2030.length; i_152_++) {
						class91_sub18.anIntArray2030[i_152_] = -1;
						class91_sub18.anIntArray2030[i_152_] = 0;
					}
					Class28_Sub1.method272(class91_sub18, -1905179897);
					client.anInt1482 = -1986708965;
					return true;
				}
				if (client.anInt1482 * -2005995539 == 163) {
					Class91_Sub20_Sub14_Sub1.anInt2639 = client.aClass91_Sub9_Sub1_1480.method655(-1934216446) * -775074047;
					Class91_Sub20_Sub14_Sub6.anInt2820 = client.aClass91_Sub9_Sub1_1480.method655(974782908) * -802117285;
					while (-1128893257 * client.aClass91_Sub9_Sub1_1480.currentOffset < 1152500623 * client.anInt1570) {
						client.anInt1482 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * 1986708965;
						Class20.method200(837014283);
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				/*if (-2005995539 * client.anInt1482 == 31) {
					final int i_153_ = client.aClass91_Sub9_Sub1_1480.method403();
					final int i_154_ = client.aClass91_Sub9_Sub1_1480.method678((byte) -99);
					final Class91_Sub18 class91_sub18 = Class61.method394(i_153_, -631047529);
					if (class91_sub18.anInt2005 * -345440531 != i_154_ || -1 == i_154_) {
						class91_sub18.anInt2005 = i_154_ * -900788507;
						class91_sub18.anInt2075 = 0;
						class91_sub18.anInt2076 = 0;
						Class28_Sub1.method272(class91_sub18, -1905179897);
					}
					client.anInt1482 = -1986708965;
					return true;
				}*/
				if (217 == -2005995539 * client.anInt1482) {
					final int i_155_ = client.aClass91_Sub9_Sub1_1480.method676((byte) 7);
					final Class91_Sub18 class91_sub18 = Class61.method394(i_155_, -631047529);
					class91_sub18.anInt2001 = -2107465299;
					class91_sub18.anInt2002 = Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.aClass85_2838.method479(-1528857977) * -218983247;
					Class28_Sub1.method272(class91_sub18, -1905179897);
					client.anInt1482 = -1986708965;
					return true;
				}
				if (client.anInt1482 * -2005995539 == 87) {
					Class101.method1079(false, -866073146);
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 191) {
					final String string = client.aClass91_Sub9_Sub1_1480.method645((byte) -123);
					if (string.endsWith(":tradereq:")) {
						final String string_156_ = string.substring(0, string.indexOf(":"));
						boolean bool = false;
						if (Class91_Sub24.method1051(string_156_, 1901686402)) {
							bool = true;
						}
						if (!bool && client.anInt1561 * -749782133 == 0) {
							Class101.method1076(4, string_156_, Class75.aString985, 1452269959);
						}
					} else if (string.endsWith(":duelreq:")) {
						final String string_157_ = string.substring(0, string.indexOf(":"));
						boolean bool = false;
						if (Class91_Sub24.method1051(string_157_, 2116837026)) {
							bool = true;
						}
						if (!bool && client.anInt1561 * -749782133 == 0) {
							Class101.method1076(8, string_157_, Class75.aString965, 1374246428);
						}
					} else if (string.endsWith(":chalreq:")) {
						final String string_158_ = string.substring(0, string.indexOf(":"));
						boolean bool = false;
						if (Class91_Sub24.method1051(string_158_, 1882442060)) {
							bool = true;
						}
						if (!bool && -749782133 * client.anInt1561 == 0) {
							final String string_159_ = string.substring(string.indexOf(":") + 1, string.length() - 9);
							Class101.method1076(8, string_158_, string_159_, 2091597618);
						}
					} else if (string.endsWith(":assistreq:")) {
						final String string_160_ = string.substring(0, string.indexOf(":"));
						boolean bool = false;
						if (Class91_Sub24.method1051(string_160_, 1863332239)) {
							bool = true;
						}
						if (!bool && -749782133 * client.anInt1561 == 0) {
							Class101.method1076(10, string_160_, "", 1405185630);
						}
					} else if (string.endsWith(":clan:")) {
						final String string_161_ = string.substring(0, string.indexOf(":clan:"));
						Class101.method1076(11, "", string_161_, 1205571435);
					} else if (string.endsWith(":trade:")) {
						final String string_162_ = string.substring(0, string.indexOf(":trade:"));
						if (client.anInt1561 * -749782133 == 0) {
							Class101.method1076(12, "", string_162_, 1933153440);
						}
					} else if (string.endsWith(":assist:")) {
						final String string_163_ = string.substring(0, string.indexOf(":assist:"));
						if (client.anInt1561 * -749782133 == 0) {
							Class101.method1076(13, "", string_163_, 1875916140);
						}
					} else {
						Class101.method1076(0, "", string, 1974685410);
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 94) {
					for (int i_164_ = 0; i_164_ < client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562.length; i_164_++) {
						if (client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_164_] != null) {
							client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_164_].anInt2611 = -1205443461;
						}
					}
					for (int i_165_ = 0; i_165_ < client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590.length; i_165_++) {
						if (client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_165_] != null) {
							client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_165_].anInt2611 = -1205443461;
						}
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (73 == -2005995539 * client.anInt1482) {
					client.aClass91_Sub9_Sub1_1480.currentOffset += -1335198524;
					if (client.aClass91_Sub9_Sub1_1480.method664(247556821)) {
						client.method70(client.aClass91_Sub9_Sub1_1480, client.aClass91_Sub9_Sub1_1480.currentOffset * -1128893257 - 28, 1000012634);
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (client.anInt1482 * -2005995539 == 137) {
					final int i_166_ = client.aClass91_Sub9_Sub1_1480.method669(2113279449);
					final int i_167_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -50);
					Class93.anIntArray1197[i_167_] = i_166_;
					if (i_166_ != Class93.anIntArray1199[i_167_]) {
						Class93.anIntArray1199[i_167_] = i_166_;
						Class91_Sub5.method617(i_167_, (byte) 8);
					}
					client.anIntArray1626[(client.anInt1627 += -595653689) * 482952695 - 1 & 0x1f] = i_167_;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (99 == -2005995539 * client.anInt1482) {
					final int i_168_ = -1128893257 * client.aClass91_Sub9_Sub1_1480.currentOffset + client.anInt1570 * 1152500623;
					final int i_169_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -50);
					int i_170_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -89);
					if (client.anInt1602 * -1918719153 != i_169_) {
						client.anInt1602 = i_169_ * -1301836881;
						Class102.method1084(-1918719153 * client.anInt1602, -2114184657);
						Class97.method1072(client.anInt1602 * -1918719153, (byte) -109);
						for (int i_171_ = 0; i_171_ < 100; i_171_++) {
							client.aBooleanArray1645[i_171_] = true;
						}
					}
					while (i_170_-- > 0) {
						final int i_172_ = client.aClass91_Sub9_Sub1_1480.readDword();
						final int i_173_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -103);
						final int i_174_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
						Class91_Sub10 class91_sub10 = (Class91_Sub10) client.aClass83_1603.method474(i_172_);
						if (class91_sub10 != null && i_173_ != class91_sub10.anInt1865 * 337747539) {
							Class102.method1081(class91_sub10, true, -1363054508);
							class91_sub10 = null;
						}
						if (class91_sub10 == null) {
							final Class91_Sub10 class91_sub10_175_ = new Class91_Sub10();
							class91_sub10_175_.anInt1865 = i_173_ * -31173157;
							class91_sub10_175_.anInt1868 = i_174_ * 1230490469;
							client.aClass83_1603.method478(class91_sub10_175_, i_172_);
							Class102.method1084(i_173_, -1960920142);
							Class97.method1072(i_173_, (byte) -31);
							final Class91_Sub18 class91_sub18 = Class61.method394(i_172_, -631047529);
							if (class91_sub18 != null) {
								Class28_Sub1.method272(class91_sub18, -1905179897);
							}
							if (client.aClass91_Sub18_1606 != null) {
								Class28_Sub1.method272(client.aClass91_Sub18_1606, -1905179897);
								client.aClass91_Sub18_1606 = null;
							}
							for (int i_176_ = 0; i_176_ < client.anInt1585 * 1335574821; i_176_++) {
								if (Class102.method1082(client.anIntArray1588[i_176_], 602704430)) {
									if (i_176_ < 1335574821 * client.anInt1585 - 1) {
										for (int i_177_ = i_176_; i_177_ < client.anInt1585 * 1335574821 - 1; i_177_++) {
											client.aStringArray1638[i_177_] = client.aStringArray1638[i_177_ + 1];
											client.aStringArray1591[i_177_] = client.aStringArray1591[1 + i_177_];
											client.anIntArray1588[i_177_] = client.anIntArray1588[1 + i_177_];
											client.anIntArray1589[i_177_] = client.anIntArray1589[i_177_ + 1];
											client.anIntArray1586[i_177_] = client.anIntArray1586[i_177_ + 1];
											client.anIntArray1587[i_177_] = client.anIntArray1587[1 + i_177_];
										}
									}
									client.anInt1585 -= 109114029;
								}
							}
							if (-1918719153 * client.anInt1602 != -1) {
								Class34.method281(client.anInt1602 * -1918719153, 1, 2009184348);
							}
							class91_sub10 = class91_sub10_175_;
						}
						class91_sub10.aBoolean1866 = true;
					}
					for (Class91_Sub10 class91_sub10 = (Class91_Sub10) client.aClass83_1603.method476(); class91_sub10 != null; class91_sub10 = (Class91_Sub10) client.aClass83_1603.method477()) {
						if (class91_sub10.aBoolean1866) {
							class91_sub10.aBoolean1866 = false;
						} else {
							Class102.method1081(class91_sub10, true, -1363054508);
						}
					}
					client.aClass83_1642 = new Class83(512);
					while (client.aClass91_Sub9_Sub1_1480.currentOffset * -1128893257 < i_168_) {
						final int i_178_ = client.aClass91_Sub9_Sub1_1480.readDword();
						final int i_179_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -113);
						final int i_180_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -112);
						final int i_181_ = client.aClass91_Sub9_Sub1_1480.readDword();
						for (int i_182_ = i_179_; i_182_ <= i_180_; i_182_++) {
							final long l = ((long) i_178_ << 32) + i_182_;
							client.aClass83_1642.method478(new Class91_Sub17(i_181_), l);
						}
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (client.anInt1482 * -2005995539 == 123) {
					client.aBoolean1689 = false;
					for (int i_183_ = 0; i_183_ < 5; i_183_++) {
						client.aBooleanArray1690[i_183_] = false;
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (198 == client.anInt1482 * -2005995539) {
					final int i_184_ = client.aClass91_Sub9_Sub1_1480.method670((byte) -55);
					final int i_185_ = client.aClass91_Sub9_Sub1_1480.method678((byte) 21);
					final int i_186_ = client.aClass91_Sub9_Sub1_1480.readDword();
					final Class91_Sub18 class91_sub18 = Class61.method394(i_186_, -631047529);
					final int i_187_ = i_184_ + class91_sub18.anInt2016 * 895806681;
					final int i_188_ = i_185_ + -213911763 * class91_sub18.anInt1977;
					if (i_187_ != class91_sub18.anInt1974 * -1211939919 || class91_sub18.anInt1972 * -529547265 != i_188_) {
						class91_sub18.anInt1974 = 1881089361 * i_187_;
						class91_sub18.anInt1972 = 261111807 * i_188_;
						Class28_Sub1.method272(class91_sub18, -1905179897);
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (35 == -2005995539 * client.anInt1482) {
					final int i_189_ = client.aClass91_Sub9_Sub1_1480.method669(2027725234);
					final String string = client.aClass91_Sub9_Sub1_1480.method645((byte) -81);
					final Class91_Sub18 class91_sub18 = Class61.method394(i_189_, -631047529);
					if (!string.equals(class91_sub18.aString2026)) {
						class91_sub18.aString2026 = string;
						Class28_Sub1.method272(class91_sub18, -1905179897);
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (client.anInt1482 * -2005995539 == 61) {
					for (int i_190_ = 0; i_190_ < Class91_Sub20_Sub6.anInt2286 * -2132399107; i_190_++) {
						final Class91_Sub20_Sub6 class91_sub20_sub6 = Class60.method393(i_190_, (byte) -94);
						if (class91_sub20_sub6 != null && -2049582573 * class91_sub20_sub6.anInt2288 == 0) {
							Class93.anIntArray1197[i_190_] = 0;
							Class93.anIntArray1199[i_190_] = 0;
						}
					}
					client.method71(-1315918111);
					client.anInt1627 += -1881048864;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (52 == client.anInt1482 * -2005995539) {
					if (-1918719153 * client.anInt1602 != -1) {
						Class34.method281(client.anInt1602 * -1918719153, 0, 2006844537);
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (client.anInt1482 * -2005995539 == 190) {
					final int i_191_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					final int i_192_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					final int i_193_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					final int i_194_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					client.aBooleanArray1690[i_191_] = true;
					client.anIntArray1534[i_191_] = i_192_;
					client.anIntArray1692[i_191_] = i_193_;
					client.anIntArray1546[i_191_] = i_194_;
					client.anIntArray1694[i_191_] = 0;
					client.anInt1482 = -1986708965;
					return true;
				}
				/*if (71 == client.anInt1482 * -2005995539) {
					final int i_195_ = client.aClass91_Sub9_Sub1_1480.method663((byte) -31);
					final int i_196_ = client.aClass91_Sub9_Sub1_1480.method403();
					final int i_197_ = i_195_ >> 10 & 0x1f;
					final int i_198_ = i_195_ >> 5 & 0x1f;
					final int i_199_ = i_195_ & 0x1f;
					final int i_200_ = (i_197_ << 19) + (i_198_ << 11) + (i_199_ << 3);
					final Class91_Sub18 class91_sub18 = Class61.method394(i_196_, -631047529);
					if (class91_sub18.anInt1986 * -2100558363 != i_200_) {
						class91_sub18.anInt1986 = i_200_ * 1800122349;
						Class28_Sub1.method272(class91_sub18, -1905179897);
					}
					client.anInt1482 = -1986708965;
					return true;
				}*/
				if (24 == -2005995539 * client.anInt1482) {
					client.anInt1659 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * 1094340515;
					client.anInt1707 = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * 1666380389;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 22) {
					final int i_201_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -125);
					final int i_202_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					final int i_203_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -66);
					Class108.method1112(i_201_, i_202_, i_203_, -60092589);
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 101) {
					Canvas_Sub1.method72(-488534728);
					client.anInt1482 = -1986708965;
					return false;
				}
				if (-2005995539 * client.anInt1482 == 253) {
					final boolean bool = client.aClass91_Sub9_Sub1_1480.method675((byte) 7) == 1;
					final int i_204_ = client.aClass91_Sub9_Sub1_1480.method669(1806591630);
					final Class91_Sub18 class91_sub18 = Class61.method394(i_204_, -631047529);
					if (class91_sub18.aBoolean1981 != bool) {
						class91_sub18.aBoolean1981 = bool;
						Class28_Sub1.method272(class91_sub18, -1905179897);
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				if (-2005995539 * client.anInt1482 == 30) {
					int i_205_ = client.aClass91_Sub9_Sub1_1480.method663((byte) -113);
					if (i_205_ == 65535) {
						i_205_ = -1;
					}
					Class91_Sub20_Sub14_Sub4.method1003(i_205_, (byte) 91);
					client.anInt1482 = -1986708965;
					return true;
				}
				if (136 == client.anInt1482 * -2005995539) {
					final int i_206_ = client.aClass91_Sub9_Sub1_1480.read3Bytes();
					int i_207_ = client.aClass91_Sub9_Sub1_1480.method683((byte) 110);
					if (65535 == i_207_) {
						i_207_ = -1;
					}
					Class97.method1073(i_207_, i_206_, (byte) -31);
					client.anInt1482 = -1986708965;
					return true;
				}
				if (127 == -2005995539 * client.anInt1482) {
					client.anInt1634 = -907258279 * client.anInt1640;
					if (client.anInt1570 * 1152500623 == 0) {
						client.aString1619 = null;
						client.aString1679 = null;
						Class17.anInt241 = 0;
						ObjType.aClass91_Sub23Array2395 = null;
						client.anInt1482 = -1986708965;
						return true;
					}
					client.aString1679 = client.aClass91_Sub9_Sub1_1480.method645((byte) -41);
					final long l = client.aClass91_Sub9_Sub1_1480.method677(1142221582);
					long l_208_ = l;
					String string;
					if (l > 0L && l < 6582952005840035281L) {
						if (0L == l % 37L) {
							string = null;
						} else {
							int i_209_ = 0;
							for (long l_210_ = l; l_210_ != 0L; l_210_ /= 37L) {
								i_209_++;
							}
							final StringBuilder stringbuilder = new StringBuilder(i_209_);
							while (l_208_ != 0L) {
								final long l_211_ = l_208_;
								l_208_ /= 37L;
								stringbuilder.append(Class74.aCharArray848[(int) (l_211_ - l_208_ * 37L)]);
							}
							string = stringbuilder.reverse().toString();
						}
					} else {
						string = null;
					}
					client.aString1619 = string;
					FloUnderlayType.aByte2422 = client.aClass91_Sub9_Sub1_1480.method642(226411226);
					final int i_212_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					if (i_212_ == 255) {
						client.anInt1482 = -1986708965;
						return true;
					}
					Class17.anInt241 = i_212_ * -682385951;
					final Class91_Sub23[] class91_sub23s = new Class91_Sub23[100];
					for (int i_213_ = 0; i_213_ < Class17.anInt241 * -579770847; i_213_++) {
						class91_sub23s[i_213_] = new Class91_Sub23();
						class91_sub23s[i_213_].aString2123 = client.aClass91_Sub9_Sub1_1480.method645((byte) -28);
						class91_sub23s[i_213_].aString2114 = Class91_Sub20_Sub14_Sub4.method1002(class91_sub23s[i_213_].aString2123, Class41.aClass98_551, (byte) -3);
						class91_sub23s[i_213_].anInt2120 = client.aClass91_Sub9_Sub1_1480.method686((byte) -65) * -2111439769;
						class91_sub23s[i_213_].aByte2116 = client.aClass91_Sub9_Sub1_1480.method642(1047456973);
						client.aClass91_Sub9_Sub1_1480.method645((byte) -66);
						if (class91_sub23s[i_213_].aString2123.equals(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.aString2841)) {
							Class91_Sub11.aByte1876 = class91_sub23s[i_213_].aByte2116;
						}
					}
					boolean bool = false;
					int i_214_ = -579770847 * Class17.anInt241;
					while (i_214_ > 0) {
						bool = true;
						i_214_--;
						for (int i_215_ = 0; i_215_ < i_214_; i_215_++) {
							if (class91_sub23s[i_215_].aString2114.compareTo(class91_sub23s[i_215_ + 1].aString2114) > 0) {
								final Class91_Sub23 class91_sub23 = class91_sub23s[i_215_];
								class91_sub23s[i_215_] = class91_sub23s[1 + i_215_];
								class91_sub23s[i_215_ + 1] = class91_sub23;
								bool = false;
							}
						}
						if (bool) {
							break;
						}
					}
					ObjType.aClass91_Sub23Array2395 = class91_sub23s;
					client.anInt1482 = -1986708965;
					return true;
				}
				if (client.anInt1482 * -2005995539 == 150) {
					final int i_216_ = client.aClass91_Sub9_Sub1_1480.method676((byte) 7);
					int i_217_ = client.aClass91_Sub9_Sub1_1480.method683((byte) 100);
					if (i_217_ == 65535) {
						i_217_ = -1;
					}
					final int i_218_ = client.aClass91_Sub9_Sub1_1480.method669(1945547874);
					final Class91_Sub18 class91_sub18 = Class61.method394(i_218_, -631047529);
					if (!class91_sub18.aBoolean1968) {
						if (i_217_ == -1) {
							class91_sub18.anInt2001 = 0;
							client.anInt1482 = -1986708965;
							return true;
						}
						final ObjType class91_sub20_sub8 = Class86_Sub1.method490(i_217_, 234554293);
						class91_sub18.anInt2001 = 1485013564;
						class91_sub18.anInt2002 = -218983247 * i_217_;
						class91_sub18.anInt2039 = -1972545755 * class91_sub20_sub8.anInt2363;
						class91_sub18.anInt2010 = class91_sub20_sub8.anInt2354 * 463184129;
						class91_sub18.anInt2072 = class91_sub20_sub8.anInt2362 * -1099501420 / i_216_ * 1910129001;
						Class28_Sub1.method272(class91_sub18, -1905179897);
					} else {
						class91_sub18.anInt2073 = -2075207965 * i_217_;
						class91_sub18.anInt2074 = 191778519 * i_216_;
						final ObjType class91_sub20_sub8 = Class86_Sub1.method490(i_217_, 234554293);
						class91_sub18.anInt2039 = -1972545755 * class91_sub20_sub8.anInt2363;
						class91_sub18.anInt2010 = class91_sub20_sub8.anInt2354 * 463184129;
						class91_sub18.anInt2007 = class91_sub20_sub8.anInt2365 * 1175794669;
						class91_sub18.anInt1970 = class91_sub20_sub8.anInt2366 * 916773411;
						class91_sub18.anInt2061 = class91_sub20_sub8.anInt2367 * -503642457;
						class91_sub18.anInt2072 = -622116043 * class91_sub20_sub8.anInt2362;
						if (class91_sub18.anInt1978 * -538789309 > 0) {
							class91_sub18.anInt2072 = 491510560 * class91_sub18.anInt2072 / (-538789309 * class91_sub18.anInt1978) * 1910129001;
						}
						Class28_Sub1.method272(class91_sub18, -1905179897);
					}
					client.anInt1482 = -1986708965;
					return true;
				}
				Class91_Sub21.method1036(new StringBuilder().append(-2005995539 * client.anInt1482).append(Class106.aString1369).append(-71169935 * client.anInt1687).append(Class106.aString1369).append(1345906491 * client.anInt1447).append(Class106.aString1369).append(client.anInt1570 * 1152500623).toString(), null, (byte) 4);
				Canvas_Sub1.method72(3032895);
			} catch (final IOException ioexception) {
				Class26.method244(-514761408);
			} catch (final Exception exception) {
				String string = new StringBuilder().append(-2005995539 * client.anInt1482).append(Class106.aString1369).append(client.anInt1687 * -71169935).append(Class106.aString1369).append(client.anInt1447 * 1345906491).append(Class106.aString1369).append(client.anInt1570 * 1152500623).append(Class106.aString1369)
						.append(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0] + Class40.anInt541 * 1885886277).append(Class106.aString1369).append(1838527067 * Class91_Sub20_Sub15.anInt2497 + Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0]).append(Class106.aString1369).toString();
				for (int i_219_ = 0; i_219_ < client.anInt1570 * 1152500623 && i_219_ < 50; i_219_++) {
					string = new StringBuilder(string).append(client.aClass91_Sub9_Sub1_1480.buffer[i_219_]).append(Class106.aString1369).toString();
				}
				Class91_Sub21.method1036(string, exception, (byte) -7);
				Canvas_Sub1.method72(-1213796677);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "cq.bj()");
		}
		return true;
	}
}
