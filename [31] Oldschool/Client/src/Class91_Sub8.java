/* Class91_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub8 extends Class91 {
	int anInt1848;
	int[] anIntArray1849;
	int anInt1850;
	int[][] anIntArrayArray1851;
	public static short[][] aShortArrayArray1852;
	static final int anInt1853 = 48;

	static final void method628(final int i) {
		try {
			final int i_0_ = -1620517009 * client.anInt1693 + Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 * 107578049;
			final int i_1_ = Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 * -668540675 + client.anInt1508 * 805635351;
			if (client.anInt1531 * -1173096641 - i_0_ < -500 || client.anInt1531 * -1173096641 - i_0_ > 500 || 370155871 * Class12.anInt185 - i_1_ < -500 || 370155871 * Class12.anInt185 - i_1_ > 500) {
				client.anInt1531 = 1888188607 * i_0_;
				Class12.anInt185 = i_1_ * 2020375199;
			}
			if (client.anInt1531 * -1173096641 != i_0_) {
				client.anInt1531 += 1888188607 * ((i_0_ - -1173096641 * client.anInt1531) / 16);
			}
			if (Class12.anInt185 * 370155871 != i_1_) {
				Class12.anInt185 += 2020375199 * ((i_1_ - Class12.anInt185 * 370155871) / 16);
			}
			if (Class15.aBooleanArray218[96]) {
				client.anInt1529 += (-24 - client.anInt1529 * -935806335) / 2 * -33192575;
			} else if (Class15.aBooleanArray218[97]) {
				client.anInt1529 += -33192575 * ((24 - -935806335 * client.anInt1529) / 2);
			} else {
				client.anInt1529 = -935806335 * client.anInt1529 / 2 * -33192575;
			}
			if (Class15.aBooleanArray218[98]) {
				client.anInt1610 += (12 - client.anInt1610 * 902330567) / 2 * -1861695241;
			} else if (Class15.aBooleanArray218[99]) {
				client.anInt1610 += -1861695241 * ((-12 - 902330567 * client.anInt1610) / 2);
			} else {
				client.anInt1610 = -1861695241 * (client.anInt1610 * 902330567 / 2);
			}
			client.anInt1528 = 170513389 * (-935806335 * client.anInt1529 / 2 + client.anInt1528 * -1533574683 & 0x7ff);
			client.anInt1475 += 1119589431 * (client.anInt1610 * 902330567 / 2);
			if (-2055970425 * client.anInt1475 < 128) {
				client.anInt1475 = 1573526400;
			}
			if (client.anInt1475 * -2055970425 > 383) {
				client.anInt1475 = -693977527;
			}
			final int i_2_ = -1173096641 * client.anInt1531 >> 7;
			final int i_3_ = Class12.anInt185 * 370155871 >> 7;
			final int i_4_ = Class4.method92(client.anInt1531 * -1173096641, 370155871 * Class12.anInt185, -1723088013 * Class100.anInt1248, -1463239314);
			int i_5_ = 0;
			if (i_2_ > 3 && i_3_ > 3 && i_2_ < 100 && i_3_ < 100) {
				for (int i_6_ = i_2_ - 4; i_6_ <= 4 + i_2_; i_6_++) {
					for (int i_7_ = i_3_ - 4; i_7_ <= 4 + i_3_; i_7_++) {
						int i_8_ = -1723088013 * Class100.anInt1248;
						if (i_8_ < 3 && (Class102.aByteArrayArrayArray1299[1][i_6_][i_7_] & 0x2) == 2) {
							i_8_++;
						}
						final int i_9_ = i_4_ - Class102.anIntArrayArrayArray1292[i_8_][i_6_][i_7_];
						if (i_9_ > i_5_) {
							i_5_ = i_9_;
						}
					}
				}
			}
			int i_10_ = i_5_ * 192;
			if (i_10_ > 98048) {
				i_10_ = 98048;
			}
			if (i_10_ < 32768) {
				i_10_ = 32768;
			}
			if (i_10_ > client.anInt1527 * -1825228541) {
				client.anInt1527 += 1398143403 * ((i_10_ - -1825228541 * client.anInt1527) / 24);
			} else if (i_10_ < client.anInt1527 * -1825228541) {
				client.anInt1527 += 1398143403 * ((i_10_ - -1825228541 * client.anInt1527) / 80);
			}
		} catch (final RuntimeException var11) {
			throw Class102.method1086(var11, "df.aw()");
		}
	}

	static void method629(final int i) {
		try {
			if (259548547 * client.anInt1466 == 0) {
				if (i == -2005995539) {
					Class107.aClass39_1397 = new Class39(4, 104, 104, Class102.anIntArrayArrayArray1292);
					for (int i_11_ = 0; i_11_ < 4; i_11_++) {
						client.aClass76Array1530[i_11_] = new Class76(104, 104);
					}
					Class97.aClass91_Sub20_Sub13_Sub3_1214 = new Class91_Sub20_Sub13_Sub3(512, 512);
					Class101.aString1272 = Class75.aString859;
					Class101.anInt1276 = 402139771;
					client.anInt1466 = -2011932836;
				}
			} else if (client.anInt1466 * 259548547 == 20) {
				if (i == -2005995539) {
					final int[] is = new int[9];
					for (int i_12_ = 0; i_12_ < 9; i_12_++) {
						final int i_13_ = 15 + i_12_ * 32 + 128;
						final int i_14_ = 600 + 3 * i_13_;
						final int i_15_ = Class91_Sub20_Sub13_Sub2.anIntArray2546[i_13_];
						is[i_12_] = i_14_ * i_15_ >> 16;
					}
					Class39.method316(is, 500, 800, 512, 334);
					Class101.aString1272 = Class75.aString920;
					Class101.anInt1276 = 804279542;
					client.anInt1466 = 1277068042;
				}
			} else if (client.anInt1466 * 259548547 == 30) {
				Class91_Sub14.aClass63_Sub1_1936 = Class21.method205(0, false, true, true, 1043810661);
				Class91_Sub23.aClass63_Sub1_2118 = Class21.method205(1, false, true, true, 1386636885);
				Class108.index2Js5 = Class21.method205(2, true, false, true, 1452254930);
				Class37.aClass63_Sub1_442 = Class21.method205(3, false, true, true, 791181745);
				Class91_Sub23.aClass63_Sub1_2113 = Class21.method205(4, false, true, true, 2084912738);
				Class67.aClass63_Sub1_800 = Class21.method205(5, true, true, true, 905953518);
				Class91_Sub20_Sub2.aClass63_Sub1_2232 = Class21.method205(6, true, true, false, 1265014578);
				Class91_Sub10.modelJs5 = Class21.method205(7, false, true, true, 1737702060);
				Class97.aClass63_Sub1_1209 = Class21.method205(8, false, true, true, 670788189);
				Class1.aClass63_Sub1_32 = Class21.method205(9, false, true, true, 830674853);
				Class91_Sub20_Sub14_Sub5.aClass63_Sub1_2800 = Class21.method205(10, false, true, true, 639931061);
				Class103.aClass63_Sub1_1318 = Class21.method205(11, false, true, true, 1274165653);
				Class42.aClass63_Sub1_556 = Class21.method205(12, false, true, true, 1420080194);
				Class105.aClass63_Sub1_1360 = Class21.method205(13, true, false, true, 503030757);
				Class15.aClass63_Sub1_212 = Class21.method205(14, false, true, false, 452631074);
				Class102.aClass63_Sub1_1317 = Class21.method205(15, false, true, true, 1866011236);
				Class101.aString1272 = Class75.aString861;
				Class101.anInt1276 = 1608559084;
				client.anInt1466 = 271101624;
			} else if (40 == 259548547 * client.anInt1466) {
				int i_16_ = 0 + Class91_Sub14.aClass63_Sub1_1936.method422((byte) 94) * 4 / 100;
				i_16_ += Class91_Sub23.aClass63_Sub1_2118.method422((byte) 8) * 4 / 100;
				i_16_ += Class108.index2Js5.method422((byte) 91) * 2 / 100;
				i_16_ += Class37.aClass63_Sub1_442.method422((byte) 9) * 2 / 100;
				i_16_ += Class91_Sub23.aClass63_Sub1_2113.method422((byte) 19) * 6 / 100;
				i_16_ += Class67.aClass63_Sub1_800.method422((byte) 60) * 4 / 100;
				i_16_ += Class91_Sub20_Sub2.aClass63_Sub1_2232.method422((byte) 39) * 2 / 100;
				i_16_ += Class91_Sub10.modelJs5.method422((byte) 49) * 60 / 100;
				i_16_ += Class97.aClass63_Sub1_1209.method422((byte) 117) * 2 / 100;
				i_16_ += Class1.aClass63_Sub1_32.method422((byte) 38) * 2 / 100;
				i_16_ += Class91_Sub20_Sub14_Sub5.aClass63_Sub1_2800.method422((byte) 111) * 2 / 100;
				i_16_ += Class103.aClass63_Sub1_1318.method422((byte) 85) * 2 / 100;
				i_16_ += Class42.aClass63_Sub1_556.method422((byte) 91) * 2 / 100;
				i_16_ += Class105.aClass63_Sub1_1360.method422((byte) 27) * 2 / 100;
				i_16_ += Class15.aClass63_Sub1_212.method422((byte) 28) * 2 / 100;
				i_16_ += Class102.aClass63_Sub1_1317.method422((byte) 60) * 2 / 100;
				if (i_16_ != 100) {
					if (i_16_ != 0) {
						Class101.aString1272 = new StringBuilder(Class75.aString862).append(i_16_).append("%").toString();
					}
					Class101.anInt1276 = -1882128670;
				} else {
					Class101.aString1272 = Class75.aString984;
					Class101.anInt1276 = -1882128670;
					client.anInt1466 = 1915602063;
				}
			} else if (45 == client.anInt1466 * 259548547) {
				final boolean bool = !client.aBoolean1691;
				Class6.anInt81 = -49459010;
				Class6.aBoolean80 = bool;
				Class91_Sub20_Sub15.anInt2493 = -209648566;
				final Class91_Sub2_Sub4 class91_sub2_sub4 = new Class91_Sub2_Sub4();
				class91_sub2_sub4.method586(9, 128, (short) 2001);
				client.aClass6_1682 = Class2.method84(Class91_Sub22.aClass25_2110, Class102.aCanvas1309, 0, 22050, 2012759710);
				client.aClass6_1682.method108(class91_sub2_sub4, 2137737708);
				final Class63_Sub1 class63_sub1 = Class102.aClass63_Sub1_1317;
				final Class63_Sub1 class63_sub1_17_ = Class15.aClass63_Sub1_212;
				final Class63_Sub1 class63_sub1_18_ = Class91_Sub23.aClass63_Sub1_2113;
				Class64.aClass63_784 = class63_sub1;
				Class64.aClass63_782 = class63_sub1_17_;
				Class64.aClass63_783 = class63_sub1_18_;
				Class64.aClass91_Sub2_Sub4_785 = class91_sub2_sub4;
				Class86_Sub1.aClass6_1750 = Class2.method84(Class91_Sub22.aClass25_2110, Class102.aCanvas1309, 1, 2048, 2078691036);
				Class91_Sub22.aClass91_Sub2_Sub2_2109 = new Class91_Sub2_Sub2();
				Class86_Sub1.aClass6_1750.method108(Class91_Sub22.aClass91_Sub2_Sub2_2109, 2038807549);
				Class12.aClass19_175 = new Class19(22050, Class6.anInt81 * -45833585);
				Class101.aString1272 = Class75.aString864;
				Class101.anInt1276 = -1479988899;
				client.anInt1466 = -734864794;
			} else if (client.anInt1466 * 259548547 == 50) {
				int i_19_ = 0;
				if (Class2.aClass91_Sub20_Sub13_Sub4_Sub1_42 == null) {
					Class2.aClass91_Sub20_Sub13_Sub4_Sub1_42 = Class91_Sub20_Sub14_Sub4.method1004(Class97.aClass63_Sub1_1209, Class105.aClass63_Sub1_1360, "p11_full", "", (byte) 26);
				} else {
					i_19_++;
				}
				if (Class32.aClass91_Sub20_Sub13_Sub4_Sub1_376 == null) {
					Class32.aClass91_Sub20_Sub13_Sub4_Sub1_376 = Class91_Sub20_Sub14_Sub4.method1004(Class97.aClass63_Sub1_1209, Class105.aClass63_Sub1_1360, "p12_full", "", (byte) 122);
				} else {
					i_19_++;
				}
				if (Class91_Sub20_Sub2.aClass91_Sub20_Sub13_Sub4_Sub1_2235 == null) {
					Class91_Sub20_Sub2.aClass91_Sub20_Sub13_Sub4_Sub1_2235 = Class91_Sub20_Sub14_Sub4.method1004(Class97.aClass63_Sub1_1209, Class105.aClass63_Sub1_1360, "b12_full", "", (byte) 107);
				} else {
					i_19_++;
				}
				if (i_19_ < 3) {
					Class101.aString1272 = new StringBuilder(Class75.aString1060).append(100 * i_19_ / 3).append("%").toString();
					Class101.anInt1276 = -1077849128;
				} else {
					Class23.aClass91_Sub13_289 = new Class91_Sub13(true);
					Class101.aString1272 = Class75.aString875;
					Class101.anInt1276 = -1077849128;
					client.anInt1466 = -1740831212;
				}
			} else if (60 == 259548547 * client.anInt1466) {
				final Class63_Sub1 class63_sub1 = Class91_Sub20_Sub14_Sub5.aClass63_Sub1_2800;
				final Class63_Sub1 class63_sub1_20_ = Class97.aClass63_Sub1_1209;
				int i_21_ = 0;
				if (class63_sub1.method410("title.jpg", "", (byte) 107)) {
					i_21_++;
				}
				if (class63_sub1_20_.method410("logo", "", (byte) 122)) {
					i_21_++;
				}
				if (class63_sub1_20_.method410("titlebox", "", (byte) 106)) {
					i_21_++;
				}
				if (class63_sub1_20_.method410("titlebutton", "", (byte) 112)) {
					i_21_++;
				}
				if (class63_sub1_20_.method410("runes", "", (byte) 122)) {
					i_21_++;
				}
				if (class63_sub1_20_.method410("title_mute", "", (byte) 82)) {
					i_21_++;
				}
				class63_sub1_20_.method410("sl_back", "", (byte) 101);
				class63_sub1_20_.method410("sl_flags", "", (byte) 87);
				class63_sub1_20_.method410("sl_arrows", "", (byte) 98);
				class63_sub1_20_.method410("sl_stars", "", (byte) 116);
				class63_sub1_20_.method410("sl_button", "", (byte) 85);
				if (i_21_ < 6) {
					Class101.aString1272 = new StringBuilder(Class75.aString989).append(100 * i_21_ / 6).append("%").toString();
					Class101.anInt1276 = -273569586;
				} else {
					Class101.aString1272 = Class75.aString1006;
					Class101.anInt1276 = -273569586;
					Class91_Sub20_Sub14_Sub1_Sub2.method939(5, -518687301);
					client.anInt1466 = 1548169666;
				}
			} else if (70 == 259548547 * client.anInt1466) {
				if (!Class108.index2Js5.method401(-1679992265)) {
					Class101.aString1272 = new StringBuilder(Class75.aString869).append(Class108.index2Js5.method425(-1080303386)).append("%").toString();
					Class101.anInt1276 = 530709956;
				} else {
					Class41.setupOverlayStore(Class108.index2Js5, (byte) 60);//ill identify one more for u k
					ObjType.setupUnderlayStore(Class108.index2Js5, -478468628);
					Class100.setupIdkStores(Class108.index2Js5, Class91_Sub10.modelJs5, 1921133968);
					Class58.setupLocStores(Class108.index2Js5, Class91_Sub10.modelJs5, client.aBoolean1691, (byte) 5);
					//u gonna be going blind here when looking through these since they dont have names
					
					//another approach could be to search for getFile(2, if u wanna find archive 2 because most of the time thats gonna be from idnex2 
			
					//u can see that its back to aClass63_Sub1_1408 now
					Class28.setupNpcStores(Class108.index2Js5, Class91_Sub10.modelJs5, (byte) 13);
					
					//so i identified these 5 for u if u wanna get the decoders just go to there
					//then find where the byte array is
					final Class63_Sub1 class63_sub1 = Class108.index2Js5;
					final Class63_Sub1 class63_sub1_23_ = Class91_Sub10.modelJs5;
					final boolean bool = client.aBoolean1612;
					final Class91_Sub20_Sub13_Sub4_Sub1 class91_sub20_sub13_sub4_sub1 = Class2.aClass91_Sub20_Sub13_Sub4_Sub1_42;
					ObjType.aClass63_2381 = class63_sub1;
					ObjType.aClass63_2350 = class63_sub1_23_;
					ObjType.aBoolean2379 = bool; 
					ObjType.aClass63_2381.method405(10, -1491051738);
					Class108.aClass91_Sub20_Sub13_Sub4_Sub1_1403 = class91_sub20_sub13_sub4_sub1;
					Class102.method1085(Class108.index2Js5, Class91_Sub14.aClass63_Sub1_1936, Class91_Sub23.aClass63_Sub1_2118, 1335574821);
					Class2.method83(Class108.index2Js5, Class91_Sub10.modelJs5, 149276879);
					Class32.method277(Class108.index2Js5, (byte) 17);
					Class101.method1077(Class108.index2Js5, -415566332);
					final Class63_Sub1 class63_sub1_24_ = Class37.aClass63_Sub1_442;
					final Class63_Sub1 class63_sub1_25_ = Class91_Sub10.modelJs5;
					final Class63_Sub1 class63_sub1_26_ = Class97.aClass63_Sub1_1209;
					final Class63_Sub1 class63_sub1_27_ = Class105.aClass63_Sub1_1360;
					Class91_Sub18.aClass63_2056 = class63_sub1_24_;
					Class94.aClass63_1201 = class63_sub1_25_;
					Class91_Sub18.aClass63_1963 = class63_sub1_26_;
					Class35.aClass63_421 = class63_sub1_27_;
					Class91_Sub18.aClass91_Sub18ArrayArray1962 = new Class91_Sub18[Class91_Sub18.aClass63_2056.method421((byte) 13)][];
					Class91_Sub18.aBooleanArray1961 = new boolean[Class91_Sub18.aClass63_2056.method421((byte) -64)];
					Class91_Sub20_Sub14_Sub7.method1021(Class108.index2Js5, -1832775212);
					Class75.method452(Class108.index2Js5, (byte) 7);
					Class101.aString1272 = Class75.aString870;
					Class101.anInt1276 = 530709956;
					client.anInt1466 = 542203248;
				}
			} else if (80 != 259548547 * client.anInt1466) {
				if (259548547 * client.anInt1466 == 90) {
					if (!Class1.aClass63_Sub1_32.method401(-903680912)) {
						Class101.aString1272 = new StringBuilder(Class75.aString873).append(Class1.aClass63_Sub1_32.method425(685543578)).append("%").toString();
						Class101.anInt1276 = -1351418714;
					} else {
						int i_28_;
						if (client.aBoolean1691) {
							i_28_ = 64;
						} else {
							i_28_ = 128;
						}
						final Class45 class45 = new Class45(Class1.aClass63_Sub1_32, Class97.aClass63_Sub1_1209, 20, 0.8, i_28_);
						Class91_Sub20_Sub13_Sub2.method853(class45);
						Class91_Sub20_Sub13_Sub2.method843(0.8);
						Class101.aString1272 = Class75.aString852;
						Class101.anInt1276 = -1351418714;
						client.anInt1466 = 1819271290;
					}
				} else if (110 == client.anInt1466 * 259548547) {
					Class36.aClass97_438 = new Class97();
					Class91_Sub22.aClass25_2110.method232(Class36.aClass97_438, 10, 1433701089);
					Class101.aString1272 = Class75.aString916;
					Class101.anInt1276 = -170713438;
					client.anInt1466 = 813304872;
				} else if (120 == 259548547 * client.anInt1466) {
					if (i == -2005995539) {
						if (!Class91_Sub20_Sub14_Sub5.aClass63_Sub1_2800.method410("huffman", "", (byte) 122)) {
							Class101.aString1272 = new StringBuilder(Class75.aString876).append(0).append("%").toString();
							Class101.anInt1276 = -1727844448;
						} else {
							final Class53 class53 = new Class53(Class91_Sub20_Sub14_Sub5.aClass63_Sub1_2800.method420("huffman", "", (byte) 0));
							Class103.method1089(class53, 199053172);
							Class101.aString1272 = Class75.aString929;
							Class101.anInt1276 = -1727844448;
							client.anInt1466 = -192661546;
						}
					}
				} else if (130 == 259548547 * client.anInt1466) {
					if (!Class37.aClass63_Sub1_442.method401(-1051721816)) {
						Class101.aString1272 = new StringBuilder(Class75.aString878).append(Class37.aClass63_Sub1_442.method425(284297166) * 4 / 5).append("%").toString();
						Class101.anInt1276 = -547139172;
					} else if (!Class42.aClass63_Sub1_556.method401(366184701)) {
						Class101.aString1272 = new StringBuilder(Class75.aString878).append(80 + Class42.aClass63_Sub1_556.method425(-1586172432) / 6).append("%").toString();
						Class101.anInt1276 = -547139172;
					} else if (!Class105.aClass63_Sub1_1360.method401(280034019)) {
						if (i == -2005995539) {
							Class101.aString1272 = new StringBuilder(Class75.aString878).append(96 + Class105.aClass63_Sub1_1360.method425(1545203162) / 20).append("%").toString();
							Class101.anInt1276 = -547139172;
						}
					} else {
						Class101.aString1272 = Class75.aString879;
						Class101.anInt1276 = -547139172;
						client.anInt1466 = -1198627964;
					}
				} else if (140 == client.anInt1466 * 259548547) {
					Class91_Sub20_Sub14_Sub1_Sub2.method939(10, -1963838899);
				}
			} else {
				int i_29_ = 0;
				if (Class25.aClass91_Sub20_Sub13_Sub3_305 == null) {
					Class25.aClass91_Sub20_Sub13_Sub3_305 = Class106.method1102(Class97.aClass63_Sub1_1209, "compass", "", 1339763914);
				} else {
					i_29_++;
				}
				if (Class100.aClass91_Sub20_Sub13_Sub3_1245 == null) {
					Class100.aClass91_Sub20_Sub13_Sub3_1245 = Class106.method1102(Class97.aClass63_Sub1_1209, "mapedge", "", -648294735);
				} else {
					i_29_++;
				}
				if (Class19.aClass91_Sub20_Sub13_Sub1Array255 == null) {
					Class19.aClass91_Sub20_Sub13_Sub1Array255 = Class91_Sub24.method1052(Class97.aClass63_Sub1_1209, "mapscene", "", (byte) 21);
				} else {
					i_29_++;
				}
				if (Class70.aClass91_Sub20_Sub13_Sub3Array816 == null) {
					Class70.aClass91_Sub20_Sub13_Sub3Array816 = Class26.method249(Class97.aClass63_Sub1_1209, "mapfunction", "", (byte) -122);
				} else {
					i_29_++;
				}
				if (Class97.aClass91_Sub20_Sub13_Sub3Array1216 == null) {
					Class97.aClass91_Sub20_Sub13_Sub3Array1216 = Class26.method249(Class97.aClass63_Sub1_1209, "hitmarks", "", (byte) -92);
				} else {
					i_29_++;
				}
				if (Class81.aClass91_Sub20_Sub13_Sub3Array1123 == null) {
					Class81.aClass91_Sub20_Sub13_Sub3Array1123 = Class26.method249(Class97.aClass63_Sub1_1209, "headicons_pk", "", (byte) -6);
				} else {
					i_29_++;
				}
				if (Class104.aClass91_Sub20_Sub13_Sub3Array1358 == null) {
					Class104.aClass91_Sub20_Sub13_Sub3Array1358 = Class26.method249(Class97.aClass63_Sub1_1209, "headicons_prayer", "", (byte) -35);
				} else {
					i_29_++;
				}
				if (Class91_Sub24.aClass91_Sub20_Sub13_Sub3Array2141 == null) {
					Class91_Sub24.aClass91_Sub20_Sub13_Sub3Array2141 = Class26.method249(Class97.aClass63_Sub1_1209, "headicons_hint", "", (byte) 72);
				} else {
					i_29_++;
				}
				if (Class27.aClass91_Sub20_Sub13_Sub3Array329 == null) {
					Class27.aClass91_Sub20_Sub13_Sub3Array329 = Class26.method249(Class97.aClass63_Sub1_1209, "mapmarker", "", (byte) -57);
				} else {
					i_29_++;
				}
				if (client.aClass91_Sub20_Sub13_Sub3Array1454 == null) {
					client.aClass91_Sub20_Sub13_Sub3Array1454 = Class26.method249(Class97.aClass63_Sub1_1209, "cross", "", (byte) -5);
				} else {
					i_29_++;
				}
				if (Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub20_Sub13_Sub3Array2862 == null) {
					Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub20_Sub13_Sub3Array2862 = Class26.method249(Class97.aClass63_Sub1_1209, "mapdots", "", (byte) -122);
				} else {
					i_29_++;
				}
				if (Class104.aClass91_Sub20_Sub13_Sub1Array1353 == null) {
					Class104.aClass91_Sub20_Sub13_Sub1Array1353 = Class91_Sub24.method1052(Class97.aClass63_Sub1_1209, "scrollbar", "", (byte) 5);
				} else {
					i_29_++;
				}
				if (Class25.aClass91_Sub20_Sub13_Sub1Array315 == null) {
					Class25.aClass91_Sub20_Sub13_Sub1Array315 = Class91_Sub24.method1052(Class97.aClass63_Sub1_1209, "mod_icons", "", (byte) 108);
				} else {
					i_29_++;
				}
				if (Class45.aClass91_Sub20_Sub13_Sub1_1431 == null) {
					Class45.aClass91_Sub20_Sub13_Sub1_1431 = Class25.method231(Class97.aClass63_Sub1_1209, "mapback", "", 1235719102);
				} else {
					i_29_++;
				}
				if (i_29_ < 14) {
					Class101.aString1272 = new StringBuilder(Class75.aString871).append(100 * i_29_ / 14).append("%").toString();
					Class101.anInt1276 = 1334989498;
				} else {
					Class91_Sub20_Sub13_Sub4.aClass91_Sub20_Sub13_Sub1Array2569 = Class25.aClass91_Sub20_Sub13_Sub1Array315;
					Class100.aClass91_Sub20_Sub13_Sub3_1245.method862();
					final int i_30_ = (int) (Math.random() * 21.0) - 10;
					final int i_31_ = (int) (Math.random() * 21.0) - 10;
					final int i_32_ = (int) (Math.random() * 21.0) - 10;
					final int i_33_ = (int) (Math.random() * 41.0) - 20;
					Class91_Sub20_Sub13_Sub3[] class91_sub20_sub13_sub3s;
					final int i_34_ = (class91_sub20_sub13_sub3s = Class70.aClass91_Sub20_Sub13_Sub3Array816).length;
					for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
						final Class91_Sub20_Sub13_Sub3 class91_sub20_sub13_sub3 = class91_sub20_sub13_sub3s[i_35_];
						class91_sub20_sub13_sub3.method861(i_33_ + i_30_, i_31_ + i_33_, i_33_ + i_32_);
					}
					Class19.aClass91_Sub20_Sub13_Sub1Array255[0].method838(i_33_ + i_30_, i_31_ + i_33_, i_32_ + i_33_);
					Class91_Sub20_Sub14_Sub4.method1005(1844043848);
					Class101.aString1272 = Class75.aString872;
					Class101.anInt1276 = 1334989498;
					client.anInt1466 = -463763170;
				}
			}
		} catch (final RuntimeException var9) {
			throw Class102.method1086(var9, "df.u()");
		}
	}

	Class91_Sub8(final int i, final byte[] is) {
		try {
			this.anInt1848 = -1828042355 * i;
			final ByteBuffer class91_sub9 = new ByteBuffer(is);
			this.anInt1850 = class91_sub9.readUnsignedByte() * -844215559;
			this.anIntArray1849 = new int[-555591863 * this.anInt1850];
			this.anIntArrayArray1851 = new int[this.anInt1850 * -555591863][];
			for (int i_36_ = 0; i_36_ < this.anInt1850 * -555591863; i_36_++) {
				this.anIntArray1849[i_36_] = class91_sub9.readUnsignedByte();
			}
			for (int i_37_ = 0; i_37_ < -555591863 * this.anInt1850; i_37_++) {
				this.anIntArrayArray1851[i_37_] = new int[class91_sub9.readUnsignedByte()];
			}
			for (int i_38_ = 0; i_38_ < this.anInt1850 * -555591863; i_38_++) {
				for (int i_39_ = 0; i_39_ < this.anIntArrayArray1851[i_38_].length; i_39_++) {
					this.anIntArrayArray1851[i_38_][i_39_] = class91_sub9.readUnsignedByte();
				}
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "df.<init>()");
		}
	}
}
