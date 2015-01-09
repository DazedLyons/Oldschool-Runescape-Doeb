/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class108 {
	static int anInt1400 = -475889510;
	boolean aBoolean1401;
	static String[] aStringArray1402;
	public static Class91_Sub20_Sub13_Sub4_Sub1 aClass91_Sub20_Sub13_Sub4_Sub1_1403;
	boolean aBoolean1404;
	static final int anInt1405 = 40;
	static int anInt1406;
	public static final int anInt1407 = 188;
	static Class63_Sub1 index2Js5;

	void method1109(final boolean bool, final byte i) {
		/* empty */
	}

	ByteBuffer method1110(final byte i) {
		ByteBuffer class91_sub9;
		try {
			final ByteBuffer class91_sub9_0_ = new ByteBuffer(100);
			class91_sub9_0_.writeWordBigEndian(anInt1400 * 1333524613);
			int i_1_;
			if (this.aBoolean1401) {
				i_1_ = 1;
			} else {
				i_1_ = 0;
			}
			class91_sub9_0_.writeWordBigEndian(i_1_);
			if (this.aBoolean1404) {
				i_1_ = 1;
			} else {
				i_1_ = 0;
			}
			class91_sub9_0_.writeWordBigEndian(i_1_);
			class91_sub9 = class91_sub9_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "z.w()");
		}
		return class91_sub9;
	}

	Class108() {
		try {
			method1109(true, (byte) 59);
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "z.<init>()");
		}
	}

	public static synchronized long method1111(final int i) {
		long l;
		try {
			final long l_2_ = System.currentTimeMillis();
			if (l_2_ < Class47.aLong598 * -5490234050721598739L) {
				Class47.aLong595 += 2757229822707842551L * (-5490234050721598739L * Class47.aLong598 - l_2_);
			}
			Class47.aLong598 = l_2_ * 200254569554901733L;
			l = Class47.aLong595 * -3462402922882493497L + l_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "z.i()");
		}
		return l;
	}

	Class108(final ByteBuffer class91_sub9) {
		try {
			if (class91_sub9 != null && class91_sub9.buffer != null) {
				final int i = class91_sub9.readUnsignedByte();
				if (i >= 0 && i <= 1333524613 * anInt1400) {
					if (class91_sub9.readUnsignedByte() == 1) {
						this.aBoolean1401 = true;
					}
					if (i > 1) {
						this.aBoolean1404 = class91_sub9.readUnsignedByte() == 1;
					}
				} else {
					method1109(true, (byte) 84);
				}
			} else {
				method1109(true, (byte) 40);
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "z.<init>()");
		}
	}

	static void method1112(final int i, final int i_3_, final int i_4_, final int i_5_) {
		try {
			if (1232831055 * client.anInt1680 != 0 && i_3_ != 0 && 700768557 * client.anInt1506 < 50) {
				client.anIntArray1701[700768557 * client.anInt1506] = i;
				client.anIntArray1685[client.anInt1506 * 700768557] = i_3_;
				client.anIntArray1686[client.anInt1506 * 700768557] = i_4_;
				client.aClass22Array1688[700768557 * client.anInt1506] = null;
				client.anIntArray1548[700768557 * client.anInt1506] = 0;
				client.anInt1506 += -630909275;
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "z.x()");
		}
	}

	public static Class91_Sub20_Sub13_Sub3 method1113(final byte i) {
		Class91_Sub20_Sub13_Sub3 class91_sub20_sub13_sub3;
		try {
			final Class91_Sub20_Sub13_Sub3 class91_sub20_sub13_sub3_6_ = new Class91_Sub20_Sub13_Sub3();
			class91_sub20_sub13_sub3_6_.anInt2553 = 201426335 * Class37.anInt451;
			class91_sub20_sub13_sub3_6_.anInt2554 = 1455742675 * Class37.anInt447;
			class91_sub20_sub13_sub3_6_.anInt2549 = Class37.anIntArray445[0];
			class91_sub20_sub13_sub3_6_.anInt2552 = Class89.anIntArray1183[0];
			class91_sub20_sub13_sub3_6_.anInt2548 = Class57.anIntArray698[0];
			class91_sub20_sub13_sub3_6_.anInt2550 = Class37.anIntArray449[0];
			final int i_7_ = class91_sub20_sub13_sub3_6_.anInt2548 * class91_sub20_sub13_sub3_6_.anInt2550;
			final byte[] is = Class74.aByteArrayArray844[0];
			class91_sub20_sub13_sub3_6_.anIntArray2557 = new int[i_7_];
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
				class91_sub20_sub13_sub3_6_.anIntArray2557[i_8_] = FloUnderlayType.anIntArray2418[is[i_8_] & 0xff];
			}
			Class18.method186(-1264890266);
			class91_sub20_sub13_sub3 = class91_sub20_sub13_sub3_6_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "z.r()");
		}
		return class91_sub20_sub13_sub3;
	}

	static final void method1114(final Class91_Sub18 class91_sub18, final int i, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_, final int i_14_) {
		try {
			if (client.aBoolean1650) {
				client.anInt1526 = 1097282720;
			} else {
				client.anInt1526 = 0;
			}
			client.aBoolean1650 = false;
			if (443943815 * Class12.anInt171 != 0) {
				if (i_12_ >= i && i_12_ < i + 16 && i_13_ >= i_9_ && i_13_ < 16 + i_9_) {
					class91_sub18.anInt2048 -= 1817985244;
					Class28_Sub1.method272(class91_sub18, -1905179897);
				} else if (i_12_ >= i && i_12_ < i + 16 && i_13_ >= i_10_ + i_9_ - 16 && i_13_ < i_9_ + i_10_) {
					class91_sub18.anInt2048 += 1817985244;
					Class28_Sub1.method272(class91_sub18, -1905179897);
				} else if (i_12_ >= i - client.anInt1526 * 745080365 && i_12_ < i + 16 + 745080365 * client.anInt1526 && i_13_ >= i_9_ + 16 && i_13_ < i_9_ + i_10_ - 16) {
					int i_15_ = (i_10_ - 32) * i_10_ / i_11_;
					if (i_15_ < 8) {
						i_15_ = 8;
					}
					final int i_16_ = i_13_ - i_9_ - 16 - i_15_ / 2;
					final int i_17_ = i_10_ - 32 - i_15_;
					class91_sub18.anInt2048 = 454496311 * (i_16_ * (i_11_ - i_10_) / i_17_);
					Class28_Sub1.method272(class91_sub18, -1905179897);
					client.aBoolean1650 = true;
				}
			}
			if (client.anInt1613 * 197293827 != 0) {
				final int i_18_ = class91_sub18.anInt1978 * -538789309;
				if (i_12_ >= i - i_18_ && i_13_ >= i_9_ && i_12_ < 16 + i && i_13_ <= i_9_ + i_10_) {
					class91_sub18.anInt2048 += client.anInt1613 * 99486209;
					Class28_Sub1.method272(class91_sub18, -1905179897);
				}
			}
		} catch (final RuntimeException var11) {
			throw Class102.method1086(var11, "z.ca()");
		}
	}
}
