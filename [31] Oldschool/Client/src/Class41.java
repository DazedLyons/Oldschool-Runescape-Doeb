/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class41 {
	static final BigInteger aBigInteger548 = new BigInteger("8ddbafeca265b877e36d97b0162e12de723996ddffeea125ae62289206e4df60a0057bd688e4bde1148f090f541d3e06d14fc8d00b6ddf6d82454859d3ea71ff", 16);
	static int anInt549;
	static final int anInt550 = 11;
	static Class98 aClass98_551;
	static final BigInteger aBigInteger552 = new BigInteger("10001", 16);
	static final int anInt553 = 65;

	public static void method343(final int i) {
		do {
			try {
				try {
					if (Class64.anInt781 * 1548116911 == 1) {
						int i_0_ = Class64.aClass91_Sub2_Sub4_785.method569((short) 4264);
						if (i_0_ > 0 && Class64.aClass91_Sub2_Sub4_785.method574(-446383268)) {
							i_0_ -= Class24.anInt298 * 1817102167;
							if (i_0_ < 0) {
								i_0_ = 0;
							}
							Class64.aClass91_Sub2_Sub4_785.method592(i_0_, (short) 254);
						} else {
							Class64.aClass91_Sub2_Sub4_785.method591(-2145195860);
							Class64.aClass91_Sub2_Sub4_785.method572(2127608502);
							if (Class64.aClass63_786 != null) {
								Class64.anInt781 = -1031428450;
							} else {
								Class64.anInt781 = 0;
							}
							Class44.aClass91_Sub15_579 = null;
							Class7.aClass21_115 = null;
						}
					}
				} catch (final Exception exception) {
					exception.printStackTrace();
					Class64.aClass91_Sub2_Sub4_785.method591(-2123153837);
					Class64.anInt781 = 0;
					Class44.aClass91_Sub15_579 = null;
					Class7.aClass21_115 = null;
					Class64.aClass63_786 = null;
					break;
				}
				break;
			} catch (final RuntimeException var3) {
				throw Class102.method1086(var3, "d.p()");
			}
		} while (false);
	}

	static final int method344(final int i, final int i_1_, final int i_2_, final byte i_3_) {
		int i_4_;
		try {
			final int i_5_ = 256 - i_2_;
			i_4_ = ((i & 0xff00ff) * i_5_ + i_2_ * (i_1_ & 0xff00ff) & ~0xff00ff) + (i_2_ * (i_1_ & 0xff00) + (i & 0xff00) * i_5_ & 0xff0000) >> 8;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "d.t()");
		}
		return i_4_;
	}

	Class41() throws Throwable {
		try {
			throw new Error();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "d.<init>()");
		}
	}

	static final void method345(final String string, final int i) {
		try {
			if (ObjType.aClass91_Sub23Array2395 == null) {
				if (i < 1269784743) {
					/* empty */
				}
			} else {
				client.aClass91_Sub9_Sub1_1478.method690(209, 1160292001);
				final Class91_Sub9_Sub1 class91_sub9_sub1 = client.aClass91_Sub9_Sub1_1478;
				final int i_6_ = string.length() + 1;
				class91_sub9_sub1.writeWordBigEndian(i_6_);
				client.aClass91_Sub9_Sub1_1478.method634(string, (byte) 108);
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "d.dy()");
		}
	}

	public static void setupOverlayStore(final Js5 class63, final byte i) {
		try {
			FloOverlayType.overlayJs5 = class63;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "d.i()");
		}
	}

	static final void method347(final int i, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_) {
		try {
			if (i != 1622419267 * client.anInt1705 || client.anInt1698 * -1872250907 != i_7_ || i_8_ != client.anInt1490 * -1623465885 && client.aBoolean1691) {
				client.anInt1705 = -601154197 * i;
				client.anInt1698 = -795759123 * i_7_;
				client.anInt1490 = -1417830069 * i_8_;
				if (!client.aBoolean1691) {
					client.anInt1490 = 0;
				}
				Class91_Sub20_Sub14_Sub1_Sub2.method939(25, 1946847397);
				Class86_Sub1.method489(Class75.aString856, true, -1257549498);
				int i_12_ = Class40.anInt541 * 1885886277;
				int i_13_ = Class91_Sub20_Sub15.anInt2497 * 1838527067;
				Class40.anInt541 = (i - 6) * -664986520;
				Class91_Sub20_Sub15.anInt2497 = (i_7_ - 6) * -1738445160;
				final int i_14_ = 1885886277 * Class40.anInt541 - i_12_;
				final int i_15_ = Class91_Sub20_Sub15.anInt2497 * 1838527067 - i_13_;
				i_12_ = Class40.anInt541 * 1885886277;
				i_13_ = 1838527067 * Class91_Sub20_Sub15.anInt2497;
				for (int i_16_ = 0; i_16_ < 32768; i_16_++) {
					final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[i_16_];
					if (class91_sub20_sub14_sub1_sub2 != null) {
						for (int i_17_ = 0; i_17_ < 10; i_17_++) {
							class91_sub20_sub14_sub1_sub2.anIntArray2603[i_17_] -= i_14_;
							class91_sub20_sub14_sub1_sub2.anIntArray2609[i_17_] -= i_15_;
						}
						class91_sub20_sub14_sub1_sub2.anInt2589 -= 151429248 * i_14_;
						class91_sub20_sub14_sub1_sub2.anInt2583 -= 1176382080 * i_15_;
					}
				}
				for (int i_18_ = 0; i_18_ < 2048; i_18_++) {
					final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_18_];
					if (class91_sub20_sub14_sub1_sub1 != null) {
						for (int i_19_ = 0; i_19_ < 10; i_19_++) {
							class91_sub20_sub14_sub1_sub1.anIntArray2603[i_19_] -= i_14_;
							class91_sub20_sub14_sub1_sub1.anIntArray2609[i_19_] -= i_15_;
						}
						class91_sub20_sub14_sub1_sub1.anInt2589 -= i_14_ * 151429248;
						class91_sub20_sub14_sub1_sub1.anInt2583 -= i_15_ * 1176382080;
					}
				}
				Class100.anInt1248 = -777643589 * i_8_;
				Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.method924(i_9_, i_10_, false, (byte) 4);
				int i_20_ = 0;
				int i_21_ = 104;
				int i_22_ = 1;
				if (i_14_ < 0) {
					i_20_ = 103;
					i_21_ = -1;
					i_22_ = -1;
				}
				int i_23_ = 0;
				int i_24_ = 104;
				int i_25_ = 1;
				if (i_15_ < 0) {
					i_23_ = 103;
					i_24_ = -1;
					i_25_ = -1;
				}
				for (int i_26_ = i_20_; i_21_ != i_26_; i_26_ += i_22_) {
					for (int i_27_ = i_23_; i_27_ != i_24_; i_27_ += i_25_) {
						final int i_28_ = i_14_ + i_26_;
						final int i_29_ = i_27_ + i_15_;
						for (int i_30_ = 0; i_30_ < 4; i_30_++) {
							if (i_28_ >= 0 && i_29_ >= 0 && i_28_ < 104 && i_29_ < 104) {
								client.aClass95ArrayArrayArray1477[i_30_][i_26_][i_27_] = client.aClass95ArrayArrayArray1477[i_30_][i_28_][i_29_];
							} else {
								client.aClass95ArrayArrayArray1477[i_30_][i_26_][i_27_] = null;
							}
						}
					}
				}
				for (Class91_Sub5 class91_sub5 = (Class91_Sub5) client.aClass95_1577.method1062(); class91_sub5 != null; class91_sub5 = (Class91_Sub5) client.aClass95_1577.method1063()) {
					if (i_11_ >= -66800147) {
						return;
					}
					class91_sub5.anInt1795 -= i_14_ * 132593855;
					class91_sub5.anInt1796 -= i_15_ * -2132477997;
					if (class91_sub5.anInt1795 * -1323813057 < 0 || class91_sub5.anInt1796 * -1641318309 < 0 || class91_sub5.anInt1795 * -1323813057 >= 104 || class91_sub5.anInt1796 * -1641318309 >= 104) {
						class91_sub5.method495();
					}
				}
				if (-1572174271 * client.anInt1674 != 0) {
					client.anInt1674 -= i_14_ * 1979222465;
					client.anInt1675 -= i_15_ * 1832044513;
				}
				client.anInt1506 = 0;
				client.aBoolean1689 = false;
				client.anInt1669 = -1784021645;
				client.aClass95_1579.method1057();
				client.aClass95_1578.method1057();
			}
		} catch (final RuntimeException var21) {
			throw Class102.method1086(var21, "d.az()");
		}
	}
}
