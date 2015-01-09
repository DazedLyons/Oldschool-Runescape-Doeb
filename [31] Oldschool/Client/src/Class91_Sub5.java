/* Class91_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class91_Sub5 extends Class91 {
	int anInt1793;
	int anInt1794;
	int anInt1795;
	int anInt1796;
	int anInt1797;
	static String aString1798;
	int anInt1799;
	int anInt1800;
	int anInt1801;
	int anInt1802;
	int anInt1803;
	int anInt1804;
	static byte[][] aByteArrayArray1805;
	public static final int anInt1806 = 135;
	int anInt1807;

	Class91_Sub5() {
		try {
			this.anInt1803 = 0;
			this.anInt1804 = 1030650873;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "c.<init>()");
		}
	}

	static final void method617(final int i, final byte i_0_) {
		try {
			client.method71(-1154636699);
			for (Class91_Sub24 class91_sub24 = (Class91_Sub24) Class91_Sub24.aClass95_2137.method1062(); class91_sub24 != null; class91_sub24 = (Class91_Sub24) Class91_Sub24.aClass95_2137.method1063()) {
				if (i_0_ <= 3) {
					return;
				}
				if (class91_sub24.aClass91_Sub20_Sub7_2147 != null) {
					class91_sub24.method1050((byte) -28);
				}
			}
			final int i_1_ = Class60.method393(i, (byte) -5).anInt2288 * -2049582573;
			if (i_1_ != 0) {
				final int i_2_ = Class93.anIntArray1199[i];
				if (i_1_ == 1) {
					if (i_2_ == 1) {
						Class91_Sub20_Sub13_Sub2.method843(0.9);
						((Class45) Class91_Sub20_Sub13_Sub2.anInterface3_2539).method361(0.9);
					}
					if (i_2_ == 2) {
						Class91_Sub20_Sub13_Sub2.method843(0.8);
						((Class45) Class91_Sub20_Sub13_Sub2.anInterface3_2539).method361(0.8);
					}
					if (3 == i_2_) {
						Class91_Sub20_Sub13_Sub2.method843(0.7);
						((Class45) Class91_Sub20_Sub13_Sub2.anInterface3_2539).method361(0.7);
					}
					if (i_2_ == 4) {
						Class91_Sub20_Sub13_Sub2.method843(0.6);
						((Class45) Class91_Sub20_Sub13_Sub2.anInterface3_2539).method361(0.6);
					}
					ObjType.aClass96_2390.method1070();
				}
				if (3 == i_1_) {
					int i_3_ = 0;
					if (i_2_ == 0) {
						i_3_ = 255;
					}
					if (1 == i_2_) {
						i_3_ = 192;
					}
					if (2 == i_2_) {
						i_3_ = 128;
					}
					if (i_2_ == 3) {
						i_3_ = 64;
					}
					if (4 == i_2_) {
						i_3_ = 0;
					}
					if (1217281259 * client.anInt1677 != i_3_) {
						if (1217281259 * client.anInt1677 == 0 && 31780839 * client.anInt1678 != -1) {
							Class81.method468(Class91_Sub20_Sub2.aClass63_Sub1_2232, 31780839 * client.anInt1678, 0, i_3_, false, (byte) 3);
							client.aBoolean1521 = false;
						} else if (i_3_ == 0) {
							Class64.aClass91_Sub2_Sub4_785.method591(-2078311973);
							Class64.anInt781 = -515714225;
							Class64.aClass63_786 = null;
							client.aBoolean1521 = false;
						} else {
							Class33.method280(i_3_, -702264714);
						}
						client.anInt1677 = i_3_ * 1287424963;
					}
				}
				if (4 == i_1_) {
					if (i_2_ == 0) {
						client.anInt1680 = 385483473;
					}
					if (1 == i_2_) {
						client.anInt1680 = 1914683808;
					}
					if (2 == i_2_) {
						client.anInt1680 = 1276455872;
					}
					if (3 == i_2_) {
						client.anInt1680 = 638227936;
					}
					if (4 == i_2_) {
						client.anInt1680 = 0;
					}
				}
				if (5 == i_1_) {
					client.anInt1514 = i_2_ * -1943911971;
				}
				if (i_1_ == 6) {
					client.anInt1604 = 931835063 * i_2_;
				}
				if (9 == i_1_) {
					client.anInt1605 = i_2_ * -1504274765;
				}
				if (i_1_ == 10) {
					if (i_2_ == 0) {
						client.anInt1497 = 268680491;
					}
					if (i_2_ == 1) {
						client.anInt1497 = -1961295904;
					}
					if (2 == i_2_) {
						client.anInt1497 = 1555780928;
					}
					if (i_2_ == 3) {
						client.anInt1497 = 777890464;
					}
					if (4 == i_2_) {
						client.anInt1497 = 0;
					}
				}
			}
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "c.cy()");
		}
	}

	static String method618(String string, final Class91_Sub18 class91_sub18, final int i) {
		String string_4_;
		try {
			if (string.indexOf("%") != -1) {
				for (int i_5_ = 1; i_5_ <= 5; i_5_++) {
					for (;;) {
						final int i_6_ = string.indexOf(new StringBuilder("%").append(i_5_).toString());
						if (i_6_ == -1) {
							if (i == 1013589382) {
								throw new IllegalStateException();
							}
							break;
						}
						string = new StringBuilder(string.substring(0, i_6_)).append(Class91_Sub20_Sub14_Sub7.method1015(Class91_Sub22.method1041(class91_sub18, i_5_ - 1, -668540675), (byte) 2)).append(string.substring(i_6_ + 2)).toString();
					}
				}
				for (;;) {
					final int i_7_ = string.indexOf("%dns");
					if (i_7_ == -1) {
						if (i == 1013589382) {
							throw new IllegalStateException();
						}
						break;
					}
					String string_8_ = "";
					if (Class91_Sub20_Sub14_Sub6.aClass29_2818 != null) {
						final int i_9_ = Class91_Sub20_Sub14_Sub6.aClass29_2818.anInt352;
						final String string_10_ = new StringBuilder(String.valueOf(i_9_ >> 24 & 0xff)).append(".").append(i_9_ >> 16 & 0xff).append(".").append(i_9_ >> 8 & 0xff).append(".").append(i_9_ & 0xff).toString();
						string_8_ = string_10_;
						if (Class91_Sub20_Sub14_Sub6.aClass29_2818.anObject350 != null) {
							string_8_ = (String) Class91_Sub20_Sub14_Sub6.aClass29_2818.anObject350;
						}
					}
					string = new StringBuilder(string.substring(0, i_7_)).append(string_8_).append(string.substring(i_7_ + 4)).toString();
				}
			}
			string_4_ = string;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "c.bt()");
		}
		return string_4_;
	}

	static void method619(final byte[] is, final byte i) {
		try {
			final ByteBuffer class91_sub9 = new ByteBuffer(is);
			class91_sub9.currentOffset = (is.length - 2) * 565881095;
			Class37.anInt446 = class91_sub9.method686((byte) -94) * -1367521123;
			Class37.anIntArray445 = new int[Class37.anInt446 * 1302560181];
			Class89.anIntArray1183 = new int[Class37.anInt446 * 1302560181];
			Class57.anIntArray698 = new int[Class37.anInt446 * 1302560181];
			Class37.anIntArray449 = new int[Class37.anInt446 * 1302560181];
			Class74.aByteArrayArray844 = new byte[1302560181 * Class37.anInt446][];
			class91_sub9.currentOffset = (is.length - 7 - Class37.anInt446 * 1830546856) * 565881095;
			Class37.anInt451 = class91_sub9.method686((byte) -85) * 871650911;
			Class37.anInt447 = class91_sub9.method686((byte) -107) * -1690883749;
			final int i_11_ = (class91_sub9.readUnsignedByte() & 0xff) + 1;
			for (int i_12_ = 0; i_12_ < Class37.anInt446 * 1302560181; i_12_++) {
				if (i >= 0) {
					throw new IllegalStateException();
				}
				Class37.anIntArray445[i_12_] = class91_sub9.method686((byte) -42);
			}
			for (int i_13_ = 0; i_13_ < 1302560181 * Class37.anInt446; i_13_++) {
				Class89.anIntArray1183[i_13_] = class91_sub9.method686((byte) 1);
			}
			for (int i_14_ = 0; i_14_ < Class37.anInt446 * 1302560181; i_14_++) {
				if (i >= 0) {
					throw new IllegalStateException();
				}
				Class57.anIntArray698[i_14_] = class91_sub9.method686((byte) -76);
			}
			for (int i_15_ = 0; i_15_ < Class37.anInt446 * 1302560181; i_15_++) {
				if (i >= 0) {
					throw new IllegalStateException();
				}
				Class37.anIntArray449[i_15_] = class91_sub9.method686((byte) -17);
			}
			class91_sub9.currentOffset = (is.length - 7 - Class37.anInt446 * 1830546856 - 3 * (i_11_ - 1)) * 565881095;
			FloUnderlayType.anIntArray2418 = new int[i_11_];
			for (int i_16_ = 1; i_16_ < i_11_; i_16_++) {
				FloUnderlayType.anIntArray2418[i_16_] = class91_sub9.read3Bytes();
				if (FloUnderlayType.anIntArray2418[i_16_] == 0) {
					if (i >= 0) {
						throw new IllegalStateException();
					}
					FloUnderlayType.anIntArray2418[i_16_] = 1;
				}
			}
			class91_sub9.currentOffset = 0;
			for (int i_17_ = 0; i_17_ < 1302560181 * Class37.anInt446; i_17_++) {
				if (i >= 0) {
					throw new IllegalStateException();
				}
				final int i_18_ = Class57.anIntArray698[i_17_];
				final int i_19_ = Class37.anIntArray449[i_17_];
				final int i_20_ = i_19_ * i_18_;
				final byte[] is_21_ = new byte[i_20_];
				Class74.aByteArrayArray844[i_17_] = is_21_;
				final int i_22_ = class91_sub9.readUnsignedByte();
				if (i_22_ == 0) {
					if (i >= 0) {
						throw new IllegalStateException();
					}
					for (int i_23_ = 0; i_23_ < i_20_; i_23_++) {
						is_21_[i_23_] = class91_sub9.method642(1042585175);
					}
				} else if (i_22_ == 1) {
					for (int i_24_ = 0; i_24_ < i_18_; i_24_++) {
						if (i >= 0) {
							throw new IllegalStateException();
						}
						for (int i_25_ = 0; i_25_ < i_19_; i_25_++) {
							is_21_[i_24_ + i_18_ * i_25_] = class91_sub9.method642(1282592551);
						}
					}
				}
			}
		} catch (final RuntimeException var12) {
			throw Class102.method1086(var12, "c.s()");
		}
	}
}
