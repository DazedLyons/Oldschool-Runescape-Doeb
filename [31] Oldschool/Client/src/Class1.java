/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class1 {
	String aString29;
	String aString30;
	static final int anInt31 = 29;
	static Class63_Sub1 aClass63_Sub1_32;
	static final int anInt33 = 32768;
	static final int anInt34 = 39;
	public static Class4[] aClass4Array35;
	static final int anInt36 = 22;

	static void method73(final int i, final int i_0_, final int i_1_) {
		try {
			final long l = (i << 16) + i_0_;
			final Class91_Sub20_Sub16 class91_sub20_sub16 = (Class91_Sub20_Sub16) Class59.aClass83_724.method474(l);
			if (class91_sub20_sub16 == null) {
				if (i_1_ >= 1574132595) {
					throw new IllegalStateException();
				}
			} else {
				Class59.aClass82_726.method470(class91_sub20_sub16);
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "a.t()");
		}
	}

	static final void method74(final int i) {
		try {
			client.anInt1582 = 0;
			client.anInt1565 = 0;
			client.aClass91_Sub9_Sub1_1480.method695((byte) 104);
			int i_2_ = client.aClass91_Sub9_Sub1_1480.method693(1, 1286800452);
			if (i_2_ == 0) {
				if (i >= -92054444) {
					throw new IllegalStateException();
				}
			} else {
				final int i_3_ = client.aClass91_Sub9_Sub1_1480.method693(2, 1286800452);
				if (i_3_ == 0) {
					client.anIntArray1566[(client.anInt1565 += 892078071) * -1087706681 - 1] = 2047;
				} else if (i_3_ == 1) {
					final int i_4_ = client.aClass91_Sub9_Sub1_1480.method693(3, 1286800452);
					Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.method921(i_4_, false, -711489283);
					final int i_5_ = client.aClass91_Sub9_Sub1_1480.method693(1, 1286800452);
					if (i_5_ == 1) {
						client.anIntArray1566[(client.anInt1565 += 892078071) * -1087706681 - 1] = 2047;
					}
				} else if (2 == i_3_) {
					final int i_6_ = client.aClass91_Sub9_Sub1_1480.method693(3, 1286800452);
					Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.method921(i_6_, true, 1392477421);
					final int i_7_ = client.aClass91_Sub9_Sub1_1480.method693(3, 1286800452);
					Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.method921(i_7_, true, -1716039171);
					final int i_8_ = client.aClass91_Sub9_Sub1_1480.method693(1, 1286800452);
					if (i_8_ == 1) {
						client.anIntArray1566[(client.anInt1565 += 892078071) * -1087706681 - 1] = 2047;
					}
				} else if (i_3_ == 3) {
					final int i_9_ = client.aClass91_Sub9_Sub1_1480.method693(1, 1286800452);
					Class100.anInt1248 = client.aClass91_Sub9_Sub1_1480.method693(2, 1286800452) * -777643589;
					final int i_10_ = client.aClass91_Sub9_Sub1_1480.method693(1, 1286800452);
					if (1 == i_10_) {
						client.anIntArray1566[(client.anInt1565 += 892078071) * -1087706681 - 1] = 2047;
					}
					final int i_11_ = client.aClass91_Sub9_Sub1_1480.method693(7, 1286800452);
					final int i_12_ = client.aClass91_Sub9_Sub1_1480.method693(7, 1286800452);
					Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.method924(i_12_, i_11_, 1 == i_9_, (byte) 112);
				}
			}
			i_2_ = client.aClass91_Sub9_Sub1_1480.method693(8, 1286800452);
			if (i_2_ < client.anInt1563 * 735674511) {
				for (int i_13_ = i_2_; i_13_ < client.anInt1563 * 735674511; i_13_++) {
					client.anIntArray1444[(client.anInt1582 += -492085503) * 194355457 - 1] = client.anIntArray1483[i_13_];
				}
			}
			if (i_2_ > 735674511 * client.anInt1563) {
				throw new RuntimeException("");
			}
			client.anInt1563 = 0;
			for (int i_14_ = 0; i_14_ < i_2_; i_14_++) {
				final int i_15_ = client.anIntArray1483[i_14_];
				final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_15_];
				final int i_16_ = client.aClass91_Sub9_Sub1_1480.method693(1, 1286800452);
				if (i_16_ == 0) {
					client.anIntArray1483[(client.anInt1563 += -443048337) * 735674511 - 1] = i_15_;
					class91_sub20_sub14_sub1_sub1.anInt2628 = client.anInt1449 * 783475325;
				} else {
					final int i_17_ = client.aClass91_Sub9_Sub1_1480.method693(2, 1286800452);
					if (i_17_ == 0) {
						client.anIntArray1483[(client.anInt1563 += -443048337) * 735674511 - 1] = i_15_;
						class91_sub20_sub14_sub1_sub1.anInt2628 = 783475325 * client.anInt1449;
						client.anIntArray1566[(client.anInt1565 += 892078071) * -1087706681 - 1] = i_15_;
					} else if (i_17_ == 1) {
						client.anIntArray1483[(client.anInt1563 += -443048337) * 735674511 - 1] = i_15_;
						class91_sub20_sub14_sub1_sub1.anInt2628 = 783475325 * client.anInt1449;
						final int i_18_ = client.aClass91_Sub9_Sub1_1480.method693(3, 1286800452);
						class91_sub20_sub14_sub1_sub1.method921(i_18_, false, 1697236597);
						final int i_19_ = client.aClass91_Sub9_Sub1_1480.method693(1, 1286800452);
						if (1 == i_19_) {
							client.anIntArray1566[(client.anInt1565 += 892078071) * -1087706681 - 1] = i_15_;
						}
					} else if (2 == i_17_) {
						client.anIntArray1483[(client.anInt1563 += -443048337) * 735674511 - 1] = i_15_;
						class91_sub20_sub14_sub1_sub1.anInt2628 = 783475325 * client.anInt1449;
						final int i_20_ = client.aClass91_Sub9_Sub1_1480.method693(3, 1286800452);
						class91_sub20_sub14_sub1_sub1.method921(i_20_, true, 1879395792);
						final int i_21_ = client.aClass91_Sub9_Sub1_1480.method693(3, 1286800452);
						class91_sub20_sub14_sub1_sub1.method921(i_21_, true, 1739088);
						final int i_22_ = client.aClass91_Sub9_Sub1_1480.method693(1, 1286800452);
						if (i_22_ == 1) {
							client.anIntArray1566[(client.anInt1565 += 892078071) * -1087706681 - 1] = i_15_;
						}
					} else if (3 == i_17_) {
						client.anIntArray1444[(client.anInt1582 += -492085503) * 194355457 - 1] = i_15_;
					}
				}
			}
			while (client.aClass91_Sub9_Sub1_1480.method692(client.anInt1570 * 1152500623, (byte) -91) >= 11) {
				i_2_ = client.aClass91_Sub9_Sub1_1480.method693(11, 1286800452);
				if (i_2_ == 2047) {
					if (i >= -92054444) {
						throw new IllegalStateException();
					}
					break;
				}
				boolean bool = false;
				if (client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_2_] == null) {
					client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_2_] = new Class91_Sub20_Sub14_Sub1_Sub1();
					if (client.aClass91_Sub9Array1567[i_2_] != null) {
						client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_2_].method928(client.aClass91_Sub9Array1567[i_2_], (byte) 59);
					}
					bool = true;
				}
				client.anIntArray1483[(client.anInt1563 += -443048337) * 735674511 - 1] = i_2_;
				final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_2_];
				class91_sub20_sub14_sub1_sub1.anInt2628 = client.anInt1449 * 783475325;
				final int i_23_ = client.anIntArray1601[client.aClass91_Sub9_Sub1_1480.method693(3, 1286800452)];
				if (bool) {
					class91_sub20_sub14_sub1_sub1.anInt2630 = (class91_sub20_sub14_sub1_sub1.anInt2593 = 252387141 * i_23_) * -1730506573;
				}
				final int i_24_ = client.aClass91_Sub9_Sub1_1480.method693(1, 1286800452);
				final int i_25_ = client.aClass91_Sub9_Sub1_1480.method693(1, 1286800452);
				if (1 == i_25_) {
					client.anIntArray1566[(client.anInt1565 += 892078071) * -1087706681 - 1] = i_2_;
				}
				int i_26_ = client.aClass91_Sub9_Sub1_1480.method693(5, 1286800452);
				if (i_26_ > 15) {
					i_26_ -= 32;
				}
				int i_27_ = client.aClass91_Sub9_Sub1_1480.method693(5, 1286800452);
				if (i_27_ > 15) {
					i_27_ -= 32;
				}
				class91_sub20_sub14_sub1_sub1.method924(i_27_ + Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], i_26_ + Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_24_ == 1, (byte) 108);
			}
			client.aClass91_Sub9_Sub1_1480.method694((byte) 111);
			Class37.method288((byte) 1);
			for (i_2_ = 0; i_2_ < client.anInt1582 * 194355457; i_2_++) {
				final int i_28_ = client.anIntArray1444[i_2_];
				if (client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_28_].anInt2628 * 736381221 != client.anInt1449 * 2026135825) {
					client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_28_] = null;
				}
			}
			if (client.anInt1570 * 1152500623 != -1128893257 * client.aClass91_Sub9_Sub1_1480.currentOffset) {
				throw new RuntimeException(new StringBuilder(String.valueOf(-1128893257 * client.aClass91_Sub9_Sub1_1480.currentOffset)).append(Class106.aString1369).append(1152500623 * client.anInt1570).toString());
			}
			for (i_2_ = 0; i_2_ < client.anInt1563 * 735674511; i_2_++) {
				if (client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[client.anIntArray1483[i_2_]] == null) {
					throw new RuntimeException(new StringBuilder(String.valueOf(i_2_)).append(Class106.aString1369).append(client.anInt1563 * 735674511).toString());
				}
			}
		} catch (final RuntimeException var10) {
			throw Class102.method1086(var10, "a.bc()");
		}
	}

	static final void method75(final byte[] is, final int i, final int i_29_, final int i_30_, final int i_31_, final int i_32_, final int i_33_, final int i_34_, final Class39 class39, final Class76[] class76s, final int i_35_) {
		try {
			final ByteBuffer class91_sub9 = new ByteBuffer(is);
			int i_36_ = -1;
			for (;;) {
				final int i_37_ = class91_sub9.method649(-1331999946);
				if (i_37_ == 0) {
					break;
				}
				i_36_ += i_37_;
				int i_38_ = 0;
				for (;;) {
					final int i_39_ = class91_sub9.method649(-1060708358);
					if (i_39_ == 0) {
						if (i_35_ >= 234399313) {
							throw new IllegalStateException();
						}
						break;
					}
					i_38_ += i_39_ - 1;
					final int i_40_ = i_38_ & 0x3f;
					final int i_41_ = i_38_ >> 6 & 0x3f;
					final int i_42_ = i_38_ >> 12;
					final int i_43_ = class91_sub9.readUnsignedByte();
					final int i_44_ = i_43_ >> 2;
					final int i_45_ = i_43_ & 0x3;
					if (i_42_ == i_31_ && i_41_ >= i_32_ && i_41_ < 8 + i_32_ && i_40_ >= i_33_ && i_40_ < 8 + i_33_) {
						final LocType class91_sub20_sub7 = Class60.method392(i_36_, -532731303);
						final int i_46_ = i_41_ & 0x7;
						final int i_47_ = i_40_ & 0x7;
						int i_48_ = class91_sub20_sub7.anInt2312 * -2039520181;
						int i_49_ = class91_sub20_sub7.anInt2313 * -1173592851;
						if ((i_45_ & 0x1) == 1) {
							final int i_50_ = i_48_;
							i_48_ = i_49_;
							i_49_ = i_50_;
						}
						final int i_51_ = i_34_ & 0x3;
						int i_52_;
						if (i_51_ == 0) {
							i_52_ = i_46_;
						} else if (1 == i_51_) {
							i_52_ = i_47_;
						} else if (i_51_ == 2) {
							i_52_ = 7 - i_46_ - (i_48_ - 1);
						} else {
							i_52_ = 7 - i_47_ - (i_49_ - 1);
						}
						final int i_53_ = i_52_ + i_29_;
						final int i_54_ = i_41_ & 0x7;
						final int i_55_ = i_40_ & 0x7;
						int i_56_ = -2039520181 * class91_sub20_sub7.anInt2312;
						int i_57_ = class91_sub20_sub7.anInt2313 * -1173592851;
						if ((i_45_ & 0x1) == 1) {
							final int i_58_ = i_56_;
							i_56_ = i_57_;
							i_57_ = i_58_;
						}
						final int i_59_ = i_34_ & 0x3;
						int i_60_;
						if (i_59_ == 0) {
							i_60_ = i_55_;
						} else if (i_59_ == 1) {
							i_60_ = 7 - i_54_ - (i_56_ - 1);
						} else if (i_59_ == 2) {
							i_60_ = 7 - i_55_ - (i_57_ - 1);
						} else {
							i_60_ = i_54_;
						}
						final int i_61_ = i_60_ + i_30_;
						if (i_53_ > 0 && i_61_ > 0 && i_53_ < 103 && i_61_ < 103) {
							int i_62_ = i;
							if ((Class102.aByteArrayArrayArray1299[1][i_53_][i_61_] & 0x2) == 2) {
								i_62_ = i - 1;
							}
							Class76 class76 = null;
							if (i_62_ >= 0) {
								class76 = class76s[i_62_];
							}
							Class91_Sub20_Sub14_Sub1.method925(i, i_53_, i_61_, i_36_, i_45_ + i_34_ & 0x3, i_44_, class39, class76, -1212774040);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "a.k()");
		}
	}

	static void method76(final File file, final File file_63_, final int i) {
		do {
			try {
				try {
					final Class2 class2 = new Class2(Class99.aFile1236, "rw", 10000L);
					final ByteBuffer class91_sub9 = new ByteBuffer(500);
					class91_sub9.writeWordBigEndian(3);
					class91_sub9.writeWordBigEndian(file_63_ != null ? 1 : 0);
					class91_sub9.method636(file.getPath(), 970912814);
					if (file_63_ != null) {
						class91_sub9.method636(file_63_.getPath(), -639144687);
					}
					class2.method81(class91_sub9.buffer, 0, -1128893257 * class91_sub9.currentOffset, -897918943);
					class2.method87((byte) 62);
				} catch (final IOException ioexception) {
					ioexception.printStackTrace();
					break;
				}
				break;
			} catch (final RuntimeException var6) {
				throw Class102.method1086(var6, "a.w()");
			}
		} while (false);
	}

	static boolean method77(final File file, final boolean bool, final int i) {
		do {
			try {
				try {
					final RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
					final int i_64_ = randomaccessfile.read();
					randomaccessfile.seek(0L);
					randomaccessfile.write(i_64_);
					randomaccessfile.seek(0L);
					randomaccessfile.close();
					if (bool) {
						file.delete();
					}
				} catch (final Exception exception) {
					break;
				}
				return true;
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "a.f()");
			}
		} while (false);
		return false;
	}

	Class1() {
		/* empty */
	}

	static final void method78(final Class91_Sub20_Sub14_Sub1 class91_sub20_sub14_sub1, final int i) {
		try {
			if (client.anInt1449 * 2026135825 == class91_sub20_sub14_sub1.anInt2626 * 218747707 || class91_sub20_sub14_sub1.anInt2611 * -815127219 == -1 || class91_sub20_sub14_sub1.anInt2614 * 1011042493 != 0
					|| class91_sub20_sub14_sub1.anInt2613 * 1370989815 + 1 > Class7.method152(-815127219 * class91_sub20_sub14_sub1.anInt2611, 2109544287).anIntArray2270[-866849195 * class91_sub20_sub14_sub1.anInt2612]) {
				final int i_65_ = class91_sub20_sub14_sub1.anInt2626 * 218747707 - class91_sub20_sub14_sub1.anInt2617 * -1062436003;
				final int i_66_ = 2026135825 * client.anInt1449 - class91_sub20_sub14_sub1.anInt2617 * -1062436003;
				final int i_67_ = -1301176704 * class91_sub20_sub14_sub1.anInt2621 + class91_sub20_sub14_sub1.anInt2622 * 1048128320;
				final int i_68_ = class91_sub20_sub14_sub1.anInt2622 * 1048128320 + class91_sub20_sub14_sub1.anInt2623 * -2020885376;
				final int i_69_ = -767003520 * class91_sub20_sub14_sub1.anInt2600 + 1048128320 * class91_sub20_sub14_sub1.anInt2622;
				final int i_70_ = class91_sub20_sub14_sub1.anInt2624 * 1429331840 + class91_sub20_sub14_sub1.anInt2622 * 1048128320;
				class91_sub20_sub14_sub1.anInt2589 = (i_67_ * (i_65_ - i_66_) + i_66_ * i_69_) / i_65_ * 1376914753;
				class91_sub20_sub14_sub1.anInt2583 = ((i_65_ - i_66_) * i_68_ + i_70_ * i_66_) / i_65_ * -1534313387;
			}
			class91_sub20_sub14_sub1.anInt2637 = 0;
			if (class91_sub20_sub14_sub1.anInt2627 * 1158735359 == 0) {
				class91_sub20_sub14_sub1.anInt2630 = 2125790208;
			}
			if (1 == 1158735359 * class91_sub20_sub14_sub1.anInt2627) {
				class91_sub20_sub14_sub1.anInt2630 = -1106281984;
			}
			if (2 == class91_sub20_sub14_sub1.anInt2627 * 1158735359) {
				class91_sub20_sub14_sub1.anInt2630 = 0;
			}
			if (3 == class91_sub20_sub14_sub1.anInt2627 * 1158735359) {
				class91_sub20_sub14_sub1.anInt2630 = 1062895104;
			}
			class91_sub20_sub14_sub1.anInt2593 = class91_sub20_sub14_sub1.anInt2630 * -358965637;
		} catch (final RuntimeException var8) {
			throw Class102.method1086(var8, "a.av()");
		}
	}

	public static void method79(final int i) {
		try {
			Class79.aClass95_1114 = new Class95();
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "a.i()");
		}
	}
}
