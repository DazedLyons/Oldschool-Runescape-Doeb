/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class104 {
	static final int anInt1337 = 0;
	static final int anInt1338 = 8;
	static final int anInt1339 = 3;
	static final int anInt1340 = 4;
	static final int anInt1341 = 5;
	static final int anInt1342 = 6;
	static final int anInt1343 = 15;
	static final int anInt1344 = 1;
	static final int anInt1345 = 26;
	static final int anInt1346 = 10;
	public static final int anInt1347 = 69;
	static final int anInt1348 = 20;
	static final int anInt1349 = 23;
	static final int anInt1350 = 9;
	static final int anInt1351 = 31;
	static final int anInt1352 = 38;
	static Class91_Sub20_Sub13_Sub1[] aClass91_Sub20_Sub13_Sub1Array1353;
	static final int anInt1354 = 3;
	static final int anInt1355 = 2;
	public static final int anInt1356 = 106;
	public static final int anInt1357 = 177;
	static Class91_Sub20_Sub13_Sub3[] aClass91_Sub20_Sub13_Sub3Array1358;
	static final int anInt1359 = 17;

	static long method1091(final CharSequence charsequence, final byte i) {
		long l;
		try {
			long l_0_ = 0L;
			final int i_1_ = charsequence.length();
			for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
				l_0_ *= 37L;
				final char c = charsequence.charAt(i_2_);
				if (c >= 'A' && c <= 'Z') {
					l_0_ += c + '\001' - 'A';
				} else if (c >= 'a' && c <= 'z') {
					l_0_ += c + '\001' - 'a';
				} else if (c >= '0' && c <= '9') {
					l_0_ += c + '\033' - '0';
				}
				if (l_0_ >= 177917621779460413L) {
					break;
				}
			}
			for (/**/; l_0_ % 37L == 0L; l_0_ /= 37L) {
				if (0L == l_0_) {
					break;
				}
			}
			l = l_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "u.i()");
		}
		return l;
	}

	static final boolean method1092(final byte[] is, final int i, final int i_3_, final int i_4_) {
		try {
			boolean bool = true;
			final ByteBuffer class91_sub9 = new ByteBuffer(is);
			int i_5_ = -1;
			for (;;) {
				final int i_6_ = class91_sub9.method649(-1202766905);
				if (i_6_ == 0) {
					return bool;
				}
				i_5_ += i_6_;
				int i_7_ = 0;
				boolean bool_8_ = false;
				for (;;) {
					if (bool_8_) {
						final int i_9_ = class91_sub9.method649(-1944664734);
						if (i_9_ == 0) {
							break;
						}
						class91_sub9.readUnsignedByte();
					} else {
						final int i_10_ = class91_sub9.method649(-1869401132);
						if (i_10_ == 0) {
							if (i_4_ == 243798379) {
								throw new IllegalStateException();
							}
							break;
						}
						i_7_ += i_10_ - 1;
						final int i_11_ = i_7_ & 0x3f;
						final int i_12_ = i_7_ >> 6 & 0x3f;
						final int i_13_ = class91_sub9.readUnsignedByte() >> 2;
						final int i_14_ = i + i_12_;
						final int i_15_ = i_3_ + i_11_;
						if (i_14_ > 0 && i_15_ > 0 && i_14_ < 103 && i_15_ < 103) {
							final LocType class91_sub20_sub7 = Class60.method392(i_5_, 598503697);
							if (22 == i_13_ && client.aBoolean1691 && 331313953 * class91_sub20_sub7.anInt2328 == 0 && class91_sub20_sub7.anInt2314 * 1727180835 != 1 && !class91_sub20_sub7.aBoolean2339) {
								if (i_4_ == 243798379) {
									throw new IllegalStateException();
								}
							} else {
								if (!class91_sub20_sub7.method771(-382305475)) {
									client.anInt1469 += -1144182261;
									bool = false;
								}
								bool_8_ = true;
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "u.p()");
		}
	}

	static void method1093(final Class91_Sub20_Sub5 class91_sub20_sub5, final int i, final int i_16_, final int i_17_, final int i_18_) {
		try {
			if (700768557 * client.anInt1506 < 50) {
				if (client.anInt1497 * -1237997571 != 0) {
					if (class91_sub20_sub5.anIntArray2274 != null && i < class91_sub20_sub5.anIntArray2274.length) {
						final int i_19_ = class91_sub20_sub5.anIntArray2274[i];
						if (i_19_ != 0) {
							final int i_20_ = i_19_ >> 8;
							final int i_21_ = i_19_ >> 4 & 0x7;
							final int i_22_ = i_19_ & 0xf;
							client.anIntArray1701[700768557 * client.anInt1506] = i_20_;
							client.anIntArray1685[client.anInt1506 * 700768557] = i_21_;
							client.anIntArray1686[700768557 * client.anInt1506] = 0;
							client.aClass22Array1688[700768557 * client.anInt1506] = null;
							final int i_23_ = (i_16_ - 64) / 128;
							final int i_24_ = (i_17_ - 64) / 128;
							client.anIntArray1548[700768557 * client.anInt1506] = (i_23_ << 16) + (i_24_ << 8) + i_22_;
							client.anInt1506 += -630909275;
						}
					}
				} else if (i_18_ != -1949545153) {
					throw new IllegalStateException();
				}
			}
		} catch (final RuntimeException var11) {
			throw Class102.method1086(var11, "u.y()");
		}
	}

	Class104() throws Throwable {
		try {
			throw new Error();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "u.<init>()");
		}
	}

	public static Class91_Sub20_Sub13_Sub1 method1094(final Js5 class63, final int i, final int i_25_) {
		Class91_Sub20_Sub13_Sub1 class91_sub20_sub13_sub1;
		try {
			if (!Class14.method176(class63, i, (byte) -17)) {
				return null;
			}
			final Class91_Sub20_Sub13_Sub1 class91_sub20_sub13_sub1_26_ = new Class91_Sub20_Sub13_Sub1();
			class91_sub20_sub13_sub1_26_.anInt2521 = 201426335 * Class37.anInt451;
			class91_sub20_sub13_sub1_26_.anInt2522 = Class37.anInt447 * 1455742675;
			class91_sub20_sub13_sub1_26_.anInt2518 = Class37.anIntArray445[0];
			class91_sub20_sub13_sub1_26_.anInt2516 = Class89.anIntArray1183[0];
			class91_sub20_sub13_sub1_26_.anInt2517 = Class57.anIntArray698[0];
			class91_sub20_sub13_sub1_26_.anInt2519 = Class37.anIntArray449[0];
			class91_sub20_sub13_sub1_26_.anIntArray2515 = FloUnderlayType.anIntArray2418;
			class91_sub20_sub13_sub1_26_.aByteArray2520 = Class74.aByteArrayArray844[0];
			Class18.method186(1053296570);
			class91_sub20_sub13_sub1 = class91_sub20_sub13_sub1_26_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "u.p()");
		}
		return class91_sub20_sub13_sub1;
	}
}
