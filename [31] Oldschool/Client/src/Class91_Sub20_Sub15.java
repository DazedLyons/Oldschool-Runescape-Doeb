/* Class91_Sub20_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub20_Sub15 extends Class91_Sub20 {
	public static final int anInt2490 = 210;
	static final int anInt2491 = 4;
	Class31[] aClass31Array2492;
	public static int anInt2493;
	static final int anInt2494 = 16384;
	static final int anInt2495 = 256;
	public static final int anInt2496 = 187;
	static int anInt2497;

	public boolean method1025(final int i, final short i_0_) {
		boolean bool;
		try {
			bool = this.aClass31Array2492[i].aBoolean368;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dk.w()");
		}
		return bool;
	}

	Class91_Sub20_Sub15(final Js5 class63, final Js5 class63_1_, final int i, final boolean bool) {
		try {
			final Class95 class95 = new Class95();
			final int i_2_ = class63.method405(i, 2123213637);
			this.aClass31Array2492 = new Class31[i_2_];
			final int[] is = class63.method416(i, -1977249798);
			for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
				final byte[] is_4_ = class63.getFile(i, is[i_3_], -336027236);
				Class91_Sub8 class91_sub8 = null;
				final int i_5_ = (is_4_[0] & 0xff) << 8 | is_4_[1] & 0xff;
				Class91_Sub8 class91_sub8_6_ = (Class91_Sub8) class95.method1062();
				while_18_: do {
					for (;;) {
						if (class91_sub8_6_ == null) {
							break while_18_;
						}
						if (i_5_ == class91_sub8_6_.anInt1848 * -2072305339) {
							break;
						}
						class91_sub8_6_ = (Class91_Sub8) class95.method1063();
					}
					class91_sub8 = class91_sub8_6_;
				} while (false);
				if (class91_sub8 == null) {
					byte[] is_7_;
					if (bool) {
						is_7_ = class63_1_.method403(0, i_5_, (short) -1792);
					} else {
						is_7_ = class63_1_.method403(i_5_, 0, (short) -20051);
					}
					class91_sub8 = new Class91_Sub8(i_5_, is_7_);
					class95.method1058(class91_sub8);
				}
				this.aClass31Array2492[is[i_3_]] = new Class31(is_4_, class91_sub8);
			}
		} catch (final RuntimeException var14) {
			throw Class102.method1086(var14, "dk.<init>()");
		}
	}

	static final void method1026(final int i, final int i_8_) {
		try {
			if (i < 0) {
				if (i_8_ < -696769665) {
					/* empty */
				}
			} else {
				final int i_9_ = client.anIntArray1586[i];
				final int i_10_ = client.anIntArray1587[i];
				int i_11_ = client.anIntArray1588[i];
				final int i_12_ = client.anIntArray1589[i];
				if (i_11_ >= 2000) {
					i_11_ -= 2000;
				}
				if (33 == i_11_) {
					client.aClass91_Sub9_Sub1_1478.method690(74, 1160292001);
					client.aClass91_Sub9_Sub1_1478.method681(i_9_, -372694149);
					client.aClass91_Sub9_Sub1_1478.method668(i_10_, (byte) -57);
					client.aClass91_Sub9_Sub1_1478.method679(i_12_, -1122561687);
					client.anInt1492 = 0;
					Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 = Class61.method394(i_10_, -631047529);
					client.anInt1554 = -1943666551 * i_9_;
				}
				if (i_11_ == 2 && Class91_Sub7.method625(i_9_, i_10_, i_12_, 108082496)) {
					client.aClass91_Sub9_Sub1_1478.method690(164, 1160292001);
					client.aClass91_Sub9_Sub1_1478.method681(anInt2497 * 1838527067 + i_10_, -372694149);
					client.aClass91_Sub9_Sub1_1478.method659(i_9_ + Class40.anInt541 * 1885886277, (byte) -107);
					client.aClass91_Sub9_Sub1_1478.method679(client.anInt1549 * -269280321, -1122561687);
					client.aClass91_Sub9_Sub1_1478.writeDWord(-1881812719 * Class91_Sub20_Sub14_Sub6.anInt2821);
					client.aClass91_Sub9_Sub1_1478.method679(i_12_ >> 14 & 0x7fff, -1122561687);
				}
				if (45 == i_11_) {
					final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_12_];
					if (class91_sub20_sub14_sub1_sub1 != null) {
						Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub1.anIntArray2603[0], class91_sub20_sub14_sub1_sub1.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, -2025815618);
						client.anInt1465 = Class12.anInt180 * 1695367541;
						client.anInt1550 = Class12.anInt167 * -1402467547;
						client.anInt1552 = -1272165154;
						client.anInt1551 = 0;
						client.aClass91_Sub9_Sub1_1478.method690(177, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method660(i_12_, (byte) 2);
					}
				}
				if (i_11_ == 7) {
					final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_12_];
					if (class91_sub20_sub14_sub1_sub2 != null) {
						Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub2.anIntArray2603[0], class91_sub20_sub14_sub1_sub2.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, 612406093);
						client.anInt1465 = 1695367541 * Class12.anInt180;
						client.anInt1550 = Class12.anInt167 * -1402467547;
						client.anInt1552 = -1272165154;
						client.anInt1551 = 0;
						client.aClass91_Sub9_Sub1_1478.method690(130, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method679(i_12_, -1122561687);
						client.aClass91_Sub9_Sub1_1478.method679(Class91_Sub20_Sub14_Sub5.anInt2807 * -2123336635, -1122561687);
						client.aClass91_Sub9_Sub1_1478.method681(1558750851 * Class28_Sub1.anInt1728, -372694149);
						client.aClass91_Sub9_Sub1_1478.method668(-1990355529 * Class6.anInt99, (byte) -36);
					}
				}
				if (i_11_ == 49) {
					final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_12_];
					if (class91_sub20_sub14_sub1_sub1 != null) {
						Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub1.anIntArray2603[0], class91_sub20_sub14_sub1_sub1.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, 422624334);
						client.anInt1465 = 1695367541 * Class12.anInt180;
						client.anInt1550 = Class12.anInt167 * -1402467547;
						client.anInt1552 = -1272165154;
						client.anInt1551 = 0;
						client.aClass91_Sub9_Sub1_1478.method690(198, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method660(i_12_, (byte) 35);
					}
				}
				if (i_11_ == 41) {
					client.aClass91_Sub9_Sub1_1478.method690(94, 1160292001);
					client.aClass91_Sub9_Sub1_1478.method668(i_10_, (byte) -85);
					client.aClass91_Sub9_Sub1_1478.method660(i_9_, (byte) 94);
					client.aClass91_Sub9_Sub1_1478.method681(i_12_, -372694149);
					client.anInt1492 = 0;
					Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 = Class61.method394(i_10_, -631047529);
					client.anInt1554 = i_9_ * -1943666551;
				}
				if (8 == i_11_) {
					final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_12_];
					if (class91_sub20_sub14_sub1_sub2 != null) {
						Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub2.anIntArray2603[0], class91_sub20_sub14_sub1_sub2.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, -1798729757);
						client.anInt1465 = 1695367541 * Class12.anInt180;
						client.anInt1550 = Class12.anInt167 * -1402467547;
						client.anInt1552 = -1272165154;
						client.anInt1551 = 0;
						client.aClass91_Sub9_Sub1_1478.method690(101, 1160292001);
						client.aClass91_Sub9_Sub1_1478.writeDWord(Class91_Sub20_Sub14_Sub6.anInt2821 * -1881812719);
						client.aClass91_Sub9_Sub1_1478.method679(i_12_, -1122561687);
						client.aClass91_Sub9_Sub1_1478.method659(client.anInt1549 * -269280321, (byte) -83);
					}
				}
				if (16 == i_11_) {
					final boolean bool = Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_9_, i_10_, false, 0, 0, 0, 0, 0, 2, -1655930223);
					if (!bool) {
						Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_9_, i_10_, false, 0, 0, 1, 1, 0, 2, 1153643689);
					}
					client.anInt1465 = Class12.anInt180 * 1695367541;
					client.anInt1550 = Class12.anInt167 * -1402467547;
					client.anInt1552 = -1272165154;
					client.anInt1551 = 0;
					client.aClass91_Sub9_Sub1_1478.method690(78, 1160292001);
					client.aClass91_Sub9_Sub1_1478.method679(Class91_Sub20_Sub14_Sub5.anInt2807 * -2123336635, -1122561687);
					client.aClass91_Sub9_Sub1_1478.method679(Class28_Sub1.anInt1728 * 1558750851, -1122561687);
					client.aClass91_Sub9_Sub1_1478.method679(i_10_ + 1838527067 * anInt2497, -1122561687);
					client.aClass91_Sub9_Sub1_1478.method666(Class6.anInt99 * -1990355529, (byte) 51);
					client.aClass91_Sub9_Sub1_1478.method679(i_12_, -1122561687);
					client.aClass91_Sub9_Sub1_1478.method681(i_9_ + Class40.anInt541 * 1885886277, -372694149);
				}
				if (1003 == i_11_) {
					client.anInt1465 = Class12.anInt180 * 1695367541;
					client.anInt1550 = -1402467547 * Class12.anInt167;
					client.anInt1552 = -1272165154;
					client.anInt1551 = 0;
					final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_12_];
					if (class91_sub20_sub14_sub1_sub2 != null) {
						NpcType class91_sub20_sub11 = class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858;
						if (class91_sub20_sub11.anIntArray2453 != null) {
							class91_sub20_sub11 = class91_sub20_sub11.method814((byte) 9);
						}
						if (class91_sub20_sub11 != null) {
							client.aClass91_Sub9_Sub1_1478.method690(75, 1160292001);
							client.aClass91_Sub9_Sub1_1478.method660(1252206939 * class91_sub20_sub11.anInt2427, (byte) 75);
						}
					}
				}
				if (i_11_ == 42) {
					client.aClass91_Sub9_Sub1_1478.method690(131, 1160292001);
					client.aClass91_Sub9_Sub1_1478.method659(i_12_, (byte) -9);
					client.aClass91_Sub9_Sub1_1478.method659(i_9_, (byte) -108);
					client.aClass91_Sub9_Sub1_1478.method666(i_10_, (byte) -84);
					client.anInt1492 = 0;
					Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 = Class61.method394(i_10_, -631047529);
					client.anInt1554 = i_9_ * -1943666551;
				}
				if (i_11_ == 5) {
					Class91_Sub7.method625(i_9_, i_10_, i_12_, 108082496);
					client.aClass91_Sub9_Sub1_1478.method690(53, 1160292001);
					client.aClass91_Sub9_Sub1_1478.method659(i_9_ + Class40.anInt541 * 1885886277, (byte) -115);
					client.aClass91_Sub9_Sub1_1478.method659(i_12_ >> 14 & 0x7fff, (byte) -34);
					client.aClass91_Sub9_Sub1_1478.method681(anInt2497 * 1838527067 + i_10_, -372694149);
				}
				if (i_11_ == 43) {
					client.aClass91_Sub9_Sub1_1478.method690(44, 1160292001);
					client.aClass91_Sub9_Sub1_1478.method668(i_10_, (byte) -49);
					client.aClass91_Sub9_Sub1_1478.method659(i_12_, (byte) -40);
					client.aClass91_Sub9_Sub1_1478.method681(i_9_, -372694149);
					client.anInt1492 = 0;
					Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 = Class61.method394(i_10_, -631047529);
					client.anInt1554 = -1943666551 * i_9_;
				}
				if (36 == i_11_) {
					client.aClass91_Sub9_Sub1_1478.method690(213, 1160292001);
					client.aClass91_Sub9_Sub1_1478.method681(i_12_, -372694149);
					client.aClass91_Sub9_Sub1_1478.method679(i_9_, -1122561687);
					client.aClass91_Sub9_Sub1_1478.method668(i_10_, (byte) -116);
					client.anInt1492 = 0;
					Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 = Class61.method394(i_10_, -631047529);
					client.anInt1554 = i_9_ * -1943666551;
				}
				if (11 == i_11_) {
					final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_12_];
					if (class91_sub20_sub14_sub1_sub2 != null) {
						Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub2.anIntArray2603[0], class91_sub20_sub14_sub1_sub2.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, 5076042);
						client.anInt1465 = 1695367541 * Class12.anInt180;
						client.anInt1550 = Class12.anInt167 * -1402467547;
						client.anInt1552 = -1272165154;
						client.anInt1551 = 0;
						client.aClass91_Sub9_Sub1_1478.method690(169, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method659(i_12_, (byte) -49);
					}
				}
				if (i_11_ == 9) {
					final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_12_];
					if (class91_sub20_sub14_sub1_sub2 != null) {
						Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub2.anIntArray2603[0], class91_sub20_sub14_sub1_sub2.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, -144462733);
						client.anInt1465 = 1695367541 * Class12.anInt180;
						client.anInt1550 = Class12.anInt167 * -1402467547;
						client.anInt1552 = -1272165154;
						client.anInt1551 = 0;
						client.aClass91_Sub9_Sub1_1478.method690(24, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method681(i_12_, -372694149);
					}
				}
				if (i_11_ == 50) {
					final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_12_];
					if (class91_sub20_sub14_sub1_sub1 != null) {
						Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub1.anIntArray2603[0], class91_sub20_sub14_sub1_sub1.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, 1784512487);
						client.anInt1465 = Class12.anInt180 * 1695367541;
						client.anInt1550 = -1402467547 * Class12.anInt167;
						client.anInt1552 = -1272165154;
						client.anInt1551 = 0;
						client.aClass91_Sub9_Sub1_1478.method690(254, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method681(i_12_, -372694149);
					}
				}
				if (58 == i_11_) {
					client.aClass91_Sub9_Sub1_1478.method690(150, 1160292001);
					client.aClass91_Sub9_Sub1_1478.method659(i_9_, (byte) -57);
					client.aClass91_Sub9_Sub1_1478.method660(-269280321 * client.anInt1549, (byte) 110);
					client.aClass91_Sub9_Sub1_1478.method666(-1881812719 * Class91_Sub20_Sub14_Sub6.anInt2821, (byte) 102);
					client.aClass91_Sub9_Sub1_1478.method666(i_10_, (byte) -75);
				}
				if (i_11_ == 31) {
					client.aClass91_Sub9_Sub1_1478.method690(43, 1160292001);
					client.aClass91_Sub9_Sub1_1478.method666(-1990355529 * Class6.anInt99, (byte) -16);
					client.aClass91_Sub9_Sub1_1478.method681(-2123336635 * Class91_Sub20_Sub14_Sub5.anInt2807, -372694149);
					client.aClass91_Sub9_Sub1_1478.method679(1558750851 * Class28_Sub1.anInt1728, -1122561687);
					client.aClass91_Sub9_Sub1_1478.method659(i_9_, (byte) -92);
					client.aClass91_Sub9_Sub1_1478.method666(i_10_, (byte) 109);
					client.aClass91_Sub9_Sub1_1478.method660(i_12_, (byte) 111);
					client.anInt1492 = 0;
					Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 = Class61.method394(i_10_, -631047529);
					client.anInt1554 = i_9_ * -1943666551;
				}
				if (i_11_ == 29) {
					client.aClass91_Sub9_Sub1_1478.method690(172, 1160292001);
					client.aClass91_Sub9_Sub1_1478.writeDWord(i_10_);
					final Class91_Sub18 class91_sub18 = Class61.method394(i_10_, -631047529);
					if (class91_sub18.anIntArrayArray2065 != null && 5 == class91_sub18.anIntArrayArray2065[0][0]) {
						final int i_13_ = class91_sub18.anIntArrayArray2065[0][1];
						if (class91_sub18.anIntArray2067[0] != Class93.anIntArray1199[i_13_]) {
							Class93.anIntArray1199[i_13_] = class91_sub18.anIntArray2067[0];
							Class91_Sub5.method617(i_13_, (byte) 37);
						}
					}
				}
				if (i_11_ == 37) {
					client.aClass91_Sub9_Sub1_1478.method690(184, 1160292001);
					client.aClass91_Sub9_Sub1_1478.method679(i_12_, -1122561687);
					client.aClass91_Sub9_Sub1_1478.method659(i_9_, (byte) -32);
					client.aClass91_Sub9_Sub1_1478.writeDWord(i_10_);
					client.anInt1492 = 0;
					Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 = Class61.method394(i_10_, -631047529);
					client.anInt1554 = -1943666551 * i_9_;
				}
				if (i_11_ == 35) {
					client.aClass91_Sub9_Sub1_1478.method690(175, 1160292001);
					client.aClass91_Sub9_Sub1_1478.method679(i_9_, -1122561687);
					client.aClass91_Sub9_Sub1_1478.method681(i_12_, -372694149);
					client.aClass91_Sub9_Sub1_1478.method668(i_10_, (byte) -33);
					client.anInt1492 = 0;
					Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 = Class61.method394(i_10_, -631047529);
					client.anInt1554 = i_9_ * -1943666551;
				}
				if (i_11_ == 6) {
					Class91_Sub7.method625(i_9_, i_10_, i_12_, 108082496);
					client.aClass91_Sub9_Sub1_1478.method690(47, 1160292001);
					client.aClass91_Sub9_Sub1_1478.method660(i_9_ + Class40.anInt541 * 1885886277, (byte) 15);
					client.aClass91_Sub9_Sub1_1478.method679(1838527067 * anInt2497 + i_10_, -1122561687);
					client.aClass91_Sub9_Sub1_1478.method681(i_12_ >> 14 & 0x7fff, -372694149);
				}
				if (i_11_ == 1002) {
					client.anInt1465 = Class12.anInt180 * 1695367541;
					client.anInt1550 = -1402467547 * Class12.anInt167;
					client.anInt1552 = -1272165154;
					client.anInt1551 = 0;
					client.aClass91_Sub9_Sub1_1478.method690(84, 1160292001);
					client.aClass91_Sub9_Sub1_1478.method679(i_12_ >> 14 & 0x7fff, -1122561687);
				}
				if (i_11_ == 1005) {
					final Class91_Sub18 class91_sub18 = Class61.method394(i_10_, -631047529);
					if (class91_sub18 != null && class91_sub18.anIntArray1984[i_9_] >= 100000) {
						Class101.method1076(0, "", new StringBuilder(String.valueOf(class91_sub18.anIntArray1984[i_9_])).append(" x ").append(Class86_Sub1.method490(i_12_, 234554293).aString2357).toString(), 2001424346);
					} else {
						client.aClass91_Sub9_Sub1_1478.method690(128, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method681(i_12_, -372694149);
					}
					client.anInt1492 = 0;
					Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 = Class61.method394(i_10_, -631047529);
					client.anInt1554 = i_9_ * -1943666551;
				}
				if (24 == i_11_) {
					final Class91_Sub18 class91_sub18 = Class61.method394(i_10_, -631047529);
					boolean bool = true;
					if (-299916553 * class91_sub18.anInt1973 > 0) {
						bool = client.method68(class91_sub18, 436866916);
					}
					if (bool) {
						client.aClass91_Sub9_Sub1_1478.method690(172, 1160292001);
						client.aClass91_Sub9_Sub1_1478.writeDWord(i_10_);
					}
				}
				if (i_11_ == 23) {
					Class107.aClass39_1397.method317(-1723088013 * Class100.anInt1248, i_9_, i_10_);
				}
				if (i_11_ == 17) {
					final boolean bool = Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_9_, i_10_, false, 0, 0, 0, 0, 0, 2, -2027683991);
					if (!bool) {
						Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_9_, i_10_, false, 0, 0, 1, 1, 0, 2, -1218935797);
					}
					client.anInt1465 = Class12.anInt180 * 1695367541;
					client.anInt1550 = Class12.anInt167 * -1402467547;
					client.anInt1552 = -1272165154;
					client.anInt1551 = 0;
					client.aClass91_Sub9_Sub1_1478.method690(189, 1160292001);
					client.aClass91_Sub9_Sub1_1478.writeDWord(-1881812719 * Class91_Sub20_Sub14_Sub6.anInt2821);
					client.aClass91_Sub9_Sub1_1478.method681(i_10_ + anInt2497 * 1838527067, -372694149);
					client.aClass91_Sub9_Sub1_1478.method659(1885886277 * Class40.anInt541 + i_9_, (byte) -60);
					client.aClass91_Sub9_Sub1_1478.method660(i_12_, (byte) 74);
					client.aClass91_Sub9_Sub1_1478.method679(-269280321 * client.anInt1549, -1122561687);
				}
				if (38 == i_11_) {
					if (i_8_ < -696769665) {
						Class91_Sub21.method1034(-1489276944);
						final Class91_Sub18 class91_sub18 = Class61.method394(i_10_, -631047529);
						client.anInt1596 = 1763148113;
						Class28_Sub1.anInt1728 = 1046829099 * i_9_;
						Class6.anInt99 = 1960204295 * i_10_;
						Class91_Sub20_Sub14_Sub5.anInt2807 = i_12_ * -388071795;
						Class28_Sub1.method272(class91_sub18, -1905179897);
						client.aString1597 = new StringBuilder(Class91_Sub21.method1033(16748608, -1384373386)).append(Class86_Sub1.method490(i_12_, 234554293).aString2357).append(Class91_Sub21.method1033(16777215, -126467258)).toString();
						if (client.aString1597 == null) {
							client.aString1597 = "null";
						}
					}
				} else {
					if (12 == i_11_) {
						final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_12_];
						if (class91_sub20_sub14_sub1_sub2 != null) {
							Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub2.anIntArray2603[0], class91_sub20_sub14_sub1_sub2.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, -1623525615);
							client.anInt1465 = Class12.anInt180 * 1695367541;
							client.anInt1550 = -1402467547 * Class12.anInt167;
							client.anInt1552 = -1272165154;
							client.anInt1551 = 0;
							client.aClass91_Sub9_Sub1_1478.method690(106, 1160292001);
							client.aClass91_Sub9_Sub1_1478.method659(i_12_, (byte) -31);
						}
					}
					if (40 == i_11_) {
						client.aClass91_Sub9_Sub1_1478.method690(45, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method660(i_9_, (byte) 16);
						client.aClass91_Sub9_Sub1_1478.method668(i_10_, (byte) -122);
						client.aClass91_Sub9_Sub1_1478.method660(i_12_, (byte) 52);
						client.anInt1492 = 0;
						Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 = Class61.method394(i_10_, -631047529);
						client.anInt1554 = i_9_ * -1943666551;
					}
					if (i_11_ == 14) {
						final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_12_];
						if (class91_sub20_sub14_sub1_sub1 != null) {
							Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub1.anIntArray2603[0], class91_sub20_sub14_sub1_sub1.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, -2099480026);
							client.anInt1465 = Class12.anInt180 * 1695367541;
							client.anInt1550 = Class12.anInt167 * -1402467547;
							client.anInt1552 = -1272165154;
							client.anInt1551 = 0;
							client.aClass91_Sub9_Sub1_1478.method690(251, 1160292001);
							client.aClass91_Sub9_Sub1_1478.method659(Class91_Sub20_Sub14_Sub5.anInt2807 * -2123336635, (byte) -34);
							client.aClass91_Sub9_Sub1_1478.method659(i_12_, (byte) -65);
							client.aClass91_Sub9_Sub1_1478.writeDWord(-1990355529 * Class6.anInt99);
							client.aClass91_Sub9_Sub1_1478.method660(1558750851 * Class28_Sub1.anInt1728, (byte) 126);
						}
					}
					if (4 == i_11_) {
						Class91_Sub7.method625(i_9_, i_10_, i_12_, 108082496);
						client.aClass91_Sub9_Sub1_1478.method690(35, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method679(i_10_ + 1838527067 * anInt2497, -1122561687);
						client.aClass91_Sub9_Sub1_1478.method679(i_9_ + Class40.anInt541 * 1885886277, -1122561687);
						client.aClass91_Sub9_Sub1_1478.method659(i_12_ >> 14 & 0x7fff, (byte) -107);
					}
					if (i_11_ == 48) {
						final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_12_];
						if (class91_sub20_sub14_sub1_sub1 != null) {
							Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub1.anIntArray2603[0], class91_sub20_sub14_sub1_sub1.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, -2048380056);
							client.anInt1465 = Class12.anInt180 * 1695367541;
							client.anInt1550 = Class12.anInt167 * -1402467547;
							client.anInt1552 = -1272165154;
							client.anInt1551 = 0;
							client.aClass91_Sub9_Sub1_1478.method690(0, 1160292001);
							client.aClass91_Sub9_Sub1_1478.method660(i_12_, (byte) 113);
						}
					}
					if (i_11_ == 26) {
						client.aClass91_Sub9_Sub1_1478.method690(255, 1160292001);
						for (Class91_Sub10 class91_sub10 = (Class91_Sub10) client.aClass83_1603.method476(); class91_sub10 != null; class91_sub10 = (Class91_Sub10) client.aClass83_1603.method477()) {
							if (-1304072595 * class91_sub10.anInt1868 == 0 || 3 == -1304072595 * class91_sub10.anInt1868) {
								Class102.method1081(class91_sub10, true, -1363054508);
							}
						}
						if (client.aClass91_Sub18_1606 != null) {
							Class28_Sub1.method272(client.aClass91_Sub18_1606, -1905179897);
							client.aClass91_Sub18_1606 = null;
						}
					}
					if (32 == i_11_) {
						client.aClass91_Sub9_Sub1_1478.method690(112, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method681(i_9_, -372694149);
						client.aClass91_Sub9_Sub1_1478.method679(-269280321 * client.anInt1549, -1122561687);
						client.aClass91_Sub9_Sub1_1478.method660(i_12_, (byte) 86);
						client.aClass91_Sub9_Sub1_1478.method668(-1881812719 * Class91_Sub20_Sub14_Sub6.anInt2821, (byte) -109);
						client.aClass91_Sub9_Sub1_1478.method668(i_10_, (byte) -125);
						client.anInt1492 = 0;
						Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 = Class61.method394(i_10_, -631047529);
						client.anInt1554 = i_9_ * -1943666551;
					}
					if (i_11_ == 20) {
						final boolean bool = Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_9_, i_10_, false, 0, 0, 0, 0, 0, 2, 904378880);
						if (!bool) {
							Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_9_, i_10_, false, 0, 0, 1, 1, 0, 2, 1996587236);
						}
						client.anInt1465 = Class12.anInt180 * 1695367541;
						client.anInt1550 = -1402467547 * Class12.anInt167;
						client.anInt1552 = -1272165154;
						client.anInt1551 = 0;
						client.aClass91_Sub9_Sub1_1478.method690(69, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method681(i_12_, -372694149);
						client.aClass91_Sub9_Sub1_1478.method660(i_9_ + Class40.anInt541 * 1885886277, (byte) 66);
						client.aClass91_Sub9_Sub1_1478.method659(1838527067 * anInt2497 + i_10_, (byte) -14);
					}
					if (28 == i_11_) {
						client.aClass91_Sub9_Sub1_1478.method690(172, 1160292001);
						client.aClass91_Sub9_Sub1_1478.writeDWord(i_10_);
						final Class91_Sub18 class91_sub18 = Class61.method394(i_10_, -631047529);
						if (class91_sub18.anIntArrayArray2065 != null && 5 == class91_sub18.anIntArrayArray2065[0][0]) {
							final int i_14_ = class91_sub18.anIntArrayArray2065[0][1];
							Class93.anIntArray1199[i_14_] = 1 - Class93.anIntArray1199[i_14_];
							Class91_Sub5.method617(i_14_, (byte) 32);
						}
					}
					if (22 == i_11_) {
						final boolean bool = Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_9_, i_10_, false, 0, 0, 0, 0, 0, 2, 908977738);
						if (!bool) {
							Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_9_, i_10_, false, 0, 0, 1, 1, 0, 2, 1426423699);
						}
						client.anInt1465 = Class12.anInt180 * 1695367541;
						client.anInt1550 = Class12.anInt167 * -1402467547;
						client.anInt1552 = -1272165154;
						client.anInt1551 = 0;
						client.aClass91_Sub9_Sub1_1478.method690(223, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method659(Class40.anInt541 * 1885886277 + i_9_, (byte) -1);
						client.aClass91_Sub9_Sub1_1478.method660(i_10_ + 1838527067 * anInt2497, (byte) 51);
						client.aClass91_Sub9_Sub1_1478.method679(i_12_, -1122561687);
					}
					if (i_11_ == 39) {
						client.aClass91_Sub9_Sub1_1478.method690(105, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method660(i_9_, (byte) 27);
						client.aClass91_Sub9_Sub1_1478.method667(i_10_, -1740286727);
						client.aClass91_Sub9_Sub1_1478.method681(i_12_, -372694149);
						client.anInt1492 = 0;
						Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 = Class61.method394(i_10_, -631047529);
						client.anInt1554 = i_9_ * -1943666551;
					}
					if (i_11_ == 46) {
						final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_12_];
						if (class91_sub20_sub14_sub1_sub1 != null) {
							Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub1.anIntArray2603[0], class91_sub20_sub14_sub1_sub1.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, 658838061);
							client.anInt1465 = Class12.anInt180 * 1695367541;
							client.anInt1550 = -1402467547 * Class12.anInt167;
							client.anInt1552 = -1272165154;
							client.anInt1551 = 0;
							client.aClass91_Sub9_Sub1_1478.method690(152, 1160292001);
							client.aClass91_Sub9_Sub1_1478.method679(i_12_, -1122561687);
						}
					}
					if (19 == i_11_) {
						final boolean bool = Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_9_, i_10_, false, 0, 0, 0, 0, 0, 2, 2115480351);
						if (!bool) {
							Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_9_, i_10_, false, 0, 0, 1, 1, 0, 2, 1683337178);
						}
						client.anInt1465 = 1695367541 * Class12.anInt180;
						client.anInt1550 = -1402467547 * Class12.anInt167;
						client.anInt1552 = -1272165154;
						client.anInt1551 = 0;
						client.aClass91_Sub9_Sub1_1478.method690(162, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method659(Class40.anInt541 * 1885886277 + i_9_, (byte) -72);
						client.aClass91_Sub9_Sub1_1478.method679(i_12_, -1122561687);
						client.aClass91_Sub9_Sub1_1478.method660(1838527067 * anInt2497 + i_10_, (byte) 62);
					}
					if (15 == i_11_) {
						final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_12_];
						if (class91_sub20_sub14_sub1_sub1 != null) {
							Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub1.anIntArray2603[0], class91_sub20_sub14_sub1_sub1.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, 1249563622);
							client.anInt1465 = 1695367541 * Class12.anInt180;
							client.anInt1550 = -1402467547 * Class12.anInt167;
							client.anInt1552 = -1272165154;
							client.anInt1551 = 0;
							client.aClass91_Sub9_Sub1_1478.method690(252, 1160292001);
							client.aClass91_Sub9_Sub1_1478.writeDWord(Class91_Sub20_Sub14_Sub6.anInt2821 * -1881812719);
							client.aClass91_Sub9_Sub1_1478.method679(client.anInt1549 * -269280321, -1122561687);
							client.aClass91_Sub9_Sub1_1478.method659(i_12_, (byte) -104);
						}
					}
					if (30 == i_11_ && client.aClass91_Sub18_1606 == null) {
						client.aClass91_Sub9_Sub1_1478.method690(50, 1160292001);
						client.aClass91_Sub9_Sub1_1478.writeDWord(i_10_);
						client.aClass91_Sub9_Sub1_1478.method681(i_9_, -372694149);
						client.aClass91_Sub18_1606 = Js5.method412(i_10_, i_9_, (byte) 1);
						Class28_Sub1.method272(client.aClass91_Sub18_1606, -1905179897);
					}
					if (i_11_ == 1 && Class91_Sub7.method625(i_9_, i_10_, i_12_, 108082496)) {
						client.aClass91_Sub9_Sub1_1478.method690(29, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method659(i_9_ + Class40.anInt541 * 1885886277, (byte) -62);
						client.aClass91_Sub9_Sub1_1478.method659(anInt2497 * 1838527067 + i_10_, (byte) -116);
						client.aClass91_Sub9_Sub1_1478.method681(Class28_Sub1.anInt1728 * 1558750851, -372694149);
						client.aClass91_Sub9_Sub1_1478.method667(-1990355529 * Class6.anInt99, 166893052);
						client.aClass91_Sub9_Sub1_1478.method660(-2123336635 * Class91_Sub20_Sub14_Sub5.anInt2807, (byte) 55);
						client.aClass91_Sub9_Sub1_1478.method679(i_12_ >> 14 & 0x7fff, -1122561687);
					}
					if (21 == i_11_) {
						final boolean bool = Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_9_, i_10_, false, 0, 0, 0, 0, 0, 2, 1326503966);
						if (!bool) {
							Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_9_, i_10_, false, 0, 0, 1, 1, 0, 2, 610277639);
						}
						client.anInt1465 = 1695367541 * Class12.anInt180;
						client.anInt1550 = Class12.anInt167 * -1402467547;
						client.anInt1552 = -1272165154;
						client.anInt1551 = 0;
						client.aClass91_Sub9_Sub1_1478.method690(120, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method659(i_9_ + Class40.anInt541 * 1885886277, (byte) -108);
						client.aClass91_Sub9_Sub1_1478.method681(i_12_, -372694149);
						client.aClass91_Sub9_Sub1_1478.method679(i_10_ + anInt2497 * 1838527067, -1122561687);
					}
					if (1004 == i_11_) {
						client.anInt1465 = Class12.anInt180 * 1695367541;
						client.anInt1550 = Class12.anInt167 * -1402467547;
						client.anInt1552 = -1272165154;
						client.anInt1551 = 0;
						client.aClass91_Sub9_Sub1_1478.method690(128, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method681(i_12_, -372694149);
					}
					if (57 == i_11_ || 1007 == i_11_) {
						final String string = client.aStringArray1591[i];
						final Class91_Sub18 class91_sub18 = Js5.method412(i_10_, i_9_, (byte) 1);
						if (class91_sub18 == null) {
							if (i_8_ >= -696769665) {
								throw new IllegalStateException();
							}
						} else {
							if (class91_sub18.anObjectArray2028 != null) {
								final Class91_Sub21 class91_sub21 = new Class91_Sub21();
								class91_sub21.aClass91_Sub18_2090 = class91_sub18;
								class91_sub21.anInt2092 = -1329823233 * i_12_;
								class91_sub21.aString2097 = string;
								class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2028;
								Class91_Sub20_Sub14.method919(class91_sub21, (short) 20633);
							}
							boolean bool = true;
							if (class91_sub18.anInt1973 * -299916553 > 0) {
								bool = client.method68(class91_sub18, 587995270);
							}
							if (bool) {
								final int i_15_ = Class17.method182(class91_sub18, -172376071);
								final int i_16_ = i_12_ - 1;
								final boolean bool_17_ = (i_15_ >> 1 + i_16_ & 0x1) != 0;
								if (bool_17_) {
									if (i_12_ == 1) {
										client.aClass91_Sub9_Sub1_1478.method690(147, 1160292001);
										client.aClass91_Sub9_Sub1_1478.writeDWord(i_10_);
										client.aClass91_Sub9_Sub1_1478.method681(i_9_, -372694149);
									}
									if (i_12_ == 2) {
										client.aClass91_Sub9_Sub1_1478.method690(231, 1160292001);
										client.aClass91_Sub9_Sub1_1478.writeDWord(i_10_);
										client.aClass91_Sub9_Sub1_1478.method681(i_9_, -372694149);
									}
									if (i_12_ == 3) {
										client.aClass91_Sub9_Sub1_1478.method690(187, 1160292001);
										client.aClass91_Sub9_Sub1_1478.writeDWord(i_10_);
										client.aClass91_Sub9_Sub1_1478.method681(i_9_, -372694149);
									}
									if (4 == i_12_) {
										client.aClass91_Sub9_Sub1_1478.method690(20, 1160292001);
										client.aClass91_Sub9_Sub1_1478.writeDWord(i_10_);
										client.aClass91_Sub9_Sub1_1478.method681(i_9_, -372694149);
									}
									if (i_12_ == 5) {
										client.aClass91_Sub9_Sub1_1478.method690(236, 1160292001);
										client.aClass91_Sub9_Sub1_1478.writeDWord(i_10_);
										client.aClass91_Sub9_Sub1_1478.method681(i_9_, -372694149);
									}
									if (i_12_ == 6) {
										client.aClass91_Sub9_Sub1_1478.method690(242, 1160292001);
										client.aClass91_Sub9_Sub1_1478.writeDWord(i_10_);
										client.aClass91_Sub9_Sub1_1478.method681(i_9_, -372694149);
									}
									if (7 == i_12_) {
										client.aClass91_Sub9_Sub1_1478.method690(6, 1160292001);
										client.aClass91_Sub9_Sub1_1478.writeDWord(i_10_);
										client.aClass91_Sub9_Sub1_1478.method681(i_9_, -372694149);
									}
									if (8 == i_12_) {
										client.aClass91_Sub9_Sub1_1478.method690(192, 1160292001);
										client.aClass91_Sub9_Sub1_1478.writeDWord(i_10_);
										client.aClass91_Sub9_Sub1_1478.method681(i_9_, -372694149);
									}
									if (9 == i_12_) {
										client.aClass91_Sub9_Sub1_1478.method690(171, 1160292001);
										client.aClass91_Sub9_Sub1_1478.writeDWord(i_10_);
										client.aClass91_Sub9_Sub1_1478.method681(i_9_, -372694149);
									}
									if (10 == i_12_) {
										client.aClass91_Sub9_Sub1_1478.method690(188, 1160292001);
										client.aClass91_Sub9_Sub1_1478.writeDWord(i_10_);
										client.aClass91_Sub9_Sub1_1478.method681(i_9_, -372694149);
									}
								}
							}
						}
					}
					if (47 == i_11_) {
						final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_12_];
						if (class91_sub20_sub14_sub1_sub1 != null) {
							Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub1.anIntArray2603[0], class91_sub20_sub14_sub1_sub1.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, 794393326);
							client.anInt1465 = Class12.anInt180 * 1695367541;
							client.anInt1550 = Class12.anInt167 * -1402467547;
							client.anInt1552 = -1272165154;
							client.anInt1551 = 0;
							client.aClass91_Sub9_Sub1_1478.method690(142, 1160292001);
							client.aClass91_Sub9_Sub1_1478.method679(i_12_, -1122561687);
						}
					}
					if (i_11_ == 44) {
						final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_12_];
						if (class91_sub20_sub14_sub1_sub1 != null) {
							Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub1.anIntArray2603[0], class91_sub20_sub14_sub1_sub1.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, 1446081391);
							client.anInt1465 = Class12.anInt180 * 1695367541;
							client.anInt1550 = -1402467547 * Class12.anInt167;
							client.anInt1552 = -1272165154;
							client.anInt1551 = 0;
							client.aClass91_Sub9_Sub1_1478.method690(2, 1160292001);
							client.aClass91_Sub9_Sub1_1478.method679(i_12_, -1122561687);
						}
					}
					if (i_11_ == 3) {
						Class91_Sub7.method625(i_9_, i_10_, i_12_, 108082496);
						client.aClass91_Sub9_Sub1_1478.method690(119, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method660(i_12_ >> 14 & 0x7fff, (byte) 64);
						client.aClass91_Sub9_Sub1_1478.method659(i_10_ + anInt2497 * 1838527067, (byte) -96);
						client.aClass91_Sub9_Sub1_1478.method681(i_9_ + Class40.anInt541 * 1885886277, -372694149);
					}
					if (51 == i_11_) {
						final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_12_];
						if (class91_sub20_sub14_sub1_sub1 != null) {
							Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub1.anIntArray2603[0], class91_sub20_sub14_sub1_sub1.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, 524683511);
							client.anInt1465 = 1695367541 * Class12.anInt180;
							client.anInt1550 = -1402467547 * Class12.anInt167;
							client.anInt1552 = -1272165154;
							client.anInt1551 = 0;
							client.aClass91_Sub9_Sub1_1478.method690(98, 1160292001);
							client.aClass91_Sub9_Sub1_1478.method659(i_12_, (byte) -27);
						}
					}
					if (i_11_ == 1001) {
						Class91_Sub7.method625(i_9_, i_10_, i_12_, 108082496);
						client.aClass91_Sub9_Sub1_1478.method690(38, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method660(i_9_ + Class40.anInt541 * 1885886277, (byte) 72);
						client.aClass91_Sub9_Sub1_1478.method660(i_12_ >> 14 & 0x7fff, (byte) 65);
						client.aClass91_Sub9_Sub1_1478.method660(i_10_ + 1838527067 * anInt2497, (byte) 23);
					}
					if (i_11_ == 18) {
						final boolean bool = Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_9_, i_10_, false, 0, 0, 0, 0, 0, 2, -1109401105);
						if (!bool) {
							Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_9_, i_10_, false, 0, 0, 1, 1, 0, 2, 1776887343);
						}
						client.anInt1465 = 1695367541 * Class12.anInt180;
						client.anInt1550 = Class12.anInt167 * -1402467547;
						client.anInt1552 = -1272165154;
						client.anInt1551 = 0;
						client.aClass91_Sub9_Sub1_1478.method690(174, 1160292001);
						client.aClass91_Sub9_Sub1_1478.method659(i_10_ + anInt2497 * 1838527067, (byte) -13);
						client.aClass91_Sub9_Sub1_1478.method660(i_9_ + Class40.anInt541 * 1885886277, (byte) 95);
						client.aClass91_Sub9_Sub1_1478.method681(i_12_, -372694149);
					}
					if (13 == i_11_) {
						final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_12_];
						if (class91_sub20_sub14_sub1_sub2 != null) {
							Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub2.anIntArray2603[0], class91_sub20_sub14_sub1_sub2.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, -1171372471);
							client.anInt1465 = Class12.anInt180 * 1695367541;
							client.anInt1550 = -1402467547 * Class12.anInt167;
							client.anInt1552 = -1272165154;
							client.anInt1551 = 0;
							client.aClass91_Sub9_Sub1_1478.method690(235, 1160292001);
							client.aClass91_Sub9_Sub1_1478.method681(i_12_, -372694149);
						}
					}
					if (i_11_ == 25) {
						final Class91_Sub18 class91_sub18 = Js5.method412(i_10_, i_9_, (byte) 1);
						if (class91_sub18 != null) {
							Class91_Sub21.method1034(-1415239732);
							final int i_18_ = Class91_Sub20_Sub2.method736(Class17.method182(class91_sub18, 63368460), 2058824801);
							final Class91_Sub18 class91_sub18_19_ = Js5.method412(i_10_, i_9_, (byte) 1);
							if (class91_sub18_19_ != null && class91_sub18_19_.anObjectArray2053 != null) {
								final Class91_Sub21 class91_sub21 = new Class91_Sub21();
								class91_sub21.aClass91_Sub18_2090 = class91_sub18_19_;
								class91_sub21.anObjectArray2100 = class91_sub18_19_.anObjectArray2053;
								Class91_Sub20_Sub14.method919(class91_sub21, (short) 517);
							}
							client.aBoolean1568 = true;
							Class91_Sub20_Sub14_Sub6.anInt2821 = i_10_ * 622018545;
							client.anInt1549 = -733031361 * i_9_;
							Class40.anInt547 = 2030799953 * i_18_;
							Class28_Sub1.method272(class91_sub18_19_, -1905179897);
							client.anInt1596 = 0;
							client.aString1600 = Class48.method369(class91_sub18, (byte) 23);
							if (client.aString1600 == null) {
								client.aString1600 = "Null";
							}
							if (class91_sub18.aBoolean1968) {
								client.aString1553 = new StringBuilder(class91_sub18.aString2029).append(Class91_Sub21.method1033(16777215, -1713184280)).toString();
							} else {
								client.aString1553 = new StringBuilder(Class91_Sub21.method1033(65280, -1538531097)).append(class91_sub18.aString2069).append(Class91_Sub21.method1033(16777215, -1697557605)).toString();
							}
						}
					} else {
						if (34 == i_11_) {
							client.aClass91_Sub9_Sub1_1478.method690(226, 1160292001);
							client.aClass91_Sub9_Sub1_1478.method681(i_9_, -372694149);
							client.aClass91_Sub9_Sub1_1478.method668(i_10_, (byte) -82);
							client.aClass91_Sub9_Sub1_1478.method679(i_12_, -1122561687);
							client.anInt1492 = 0;
							Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 = Class61.method394(i_10_, -631047529);
							client.anInt1554 = -1943666551 * i_9_;
						}
						if (10 == i_11_) {
							final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_12_];
							if (class91_sub20_sub14_sub1_sub2 != null) {
								Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], class91_sub20_sub14_sub1_sub2.anIntArray2603[0], class91_sub20_sub14_sub1_sub2.anIntArray2609[0], false, 0, 0, 1, 1, 0, 2, -240585370);
								client.anInt1465 = 1695367541 * Class12.anInt180;
								client.anInt1550 = Class12.anInt167 * -1402467547;
								client.anInt1552 = -1272165154;
								client.anInt1551 = 0;
								client.aClass91_Sub9_Sub1_1478.method690(31, 1160292001);
								client.aClass91_Sub9_Sub1_1478.method681(i_12_, -372694149);
							}
						}
						if (406349745 * client.anInt1596 != 0) {
							client.anInt1596 = 0;
							Class28_Sub1.method272(Class61.method394(Class6.anInt99 * -1990355529, -631047529), -1905179897);
						}
						if (client.aBoolean1568) {
							Class91_Sub21.method1034(-996165673);
						}
						if (Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775 != null && client.anInt1492 * -923814783 == 0) {
							Class28_Sub1.method272(Class91_Sub20_Sub14_Sub4.aClass91_Sub18_2775, -1905179897);
						}
					}
				}
			}
		} catch (final RuntimeException var12) {
			throw Class102.method1086(var12, "dk.bk()");
		}
	}
}
