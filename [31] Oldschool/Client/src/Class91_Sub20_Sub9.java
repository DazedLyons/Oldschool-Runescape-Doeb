/* Class91_Sub20_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

public class Class91_Sub20_Sub9 extends Class91_Sub20 {
	public static final int anInt2399 = 213;
	static Class96 aClass96_2400 = new Class96(64);
	public String aString2401;
	public int anInt2402;
	static int[] anIntArray2403;
	public char aChar2404;
	public int anInt2405;
	public int[] anIntArray2406;
	public int[] anIntArray2407;
	public String[] aStringArray2408;
	static Js5 aClass63_2409;
	static Class20 aClass20_2410;
	public int anInt2411;

	void method794(final ByteBuffer class91_sub9, final byte i) {
		try {
			for (;;) {
				final int i_0_ = class91_sub9.readUnsignedByte();
				if (i_0_ == 0) {
					break;
				}
				method795(class91_sub9, i_0_, 1432897189);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "at.f()");
		}
	}

	Class91_Sub20_Sub9() {
		try {
			aString2401 = "null";
			anInt2405 = 0;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "at.<init>()");
		}
	}

	void method795(final ByteBuffer class91_sub9, final int i, final int i_1_) {
		try {
			if (i == 1) {
				anInt2411 = class91_sub9.readUnsignedByte() * 47423271;
			} else if (2 == i) {
				aChar2404 = (char) class91_sub9.readUnsignedByte();
			} else if (3 == i) {
				aString2401 = class91_sub9.method645((byte) -20);
			} else if (i == 4) {
				anInt2402 = class91_sub9.readDword() * -529006159;
			} else if (i == 5) {
				if (i_1_ != 1115063449) {
					anInt2405 = class91_sub9.method686((byte) -77) * 2057669529;
					anIntArray2406 = new int[821336233 * anInt2405];
					aStringArray2408 = new String[821336233 * anInt2405];
					for (int i_2_ = 0; i_2_ < 821336233 * anInt2405; i_2_++) {
						anIntArray2406[i_2_] = class91_sub9.readDword();
						aStringArray2408[i_2_] = class91_sub9.method645((byte) -34);
					}
				}
			} else if (6 == i) {
				anInt2405 = class91_sub9.method686((byte) -121) * 2057669529;
				anIntArray2406 = new int[821336233 * anInt2405];
				anIntArray2407 = new int[anInt2405 * 821336233];
				for (int i_3_ = 0; i_3_ < 821336233 * anInt2405; i_3_++) {
					anIntArray2406[i_3_] = class91_sub9.readDword();
					anIntArray2407[i_3_] = class91_sub9.readDword();
				}
			}
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "at.e()");
		}
	}

	public static boolean method796(final int i, final int i_4_) {
		boolean bool;
		try {
			boolean bool_5_;
			if ((i >> 20 & 0x1) != 0) {
				bool_5_ = true;
			} else {
				bool_5_ = false;
			}
			bool = bool_5_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "at.e()");
		}
		return bool;
	}

	static final void method797(final boolean bool, final int i) {
		try {
			int i_6_ = 0;
			for (/**/; i_6_ < client.anInt1684 * 1050401801; i_6_++) {
				final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[client.anIntArray1445[i_6_]];
				int i_7_ = 536870912 + (client.anIntArray1445[i_6_] << 14);
				if (class91_sub20_sub14_sub1_sub2 != null && class91_sub20_sub14_sub1_sub2.method923((byte) -126) && class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.aBoolean2448 == bool && class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.method810(-1445075816)) {
					final int i_8_ = class91_sub20_sub14_sub1_sub2.anInt2589 * 107578049 >> 7;
					final int i_9_ = -668540675 * class91_sub20_sub14_sub1_sub2.anInt2583 >> 7;
					if (i_8_ >= 0 && i_8_ < 104 && i_9_ >= 0 && i_9_ < 104) {
						if (1 == class91_sub20_sub14_sub1_sub2.anInt2622 * 1694098605 && 64 == (class91_sub20_sub14_sub1_sub2.anInt2589 * 107578049 & 0x7f) && (-668540675 * class91_sub20_sub14_sub1_sub2.anInt2583 & 0x7f) == 64) {
							if (client.anIntArrayArray1545[i_8_][i_9_] == 1552236513 * client.anInt1683) {
								continue;
							}
							client.anIntArrayArray1545[i_8_][i_9_] = 1552236513 * client.anInt1683;
						}
						if (!class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858.aBoolean2456) {
							i_7_ -= -2147483648;
						}
						Class107.aClass39_1397.method326(Class100.anInt1248 * -1723088013, 107578049 * class91_sub20_sub14_sub1_sub2.anInt2589, class91_sub20_sub14_sub1_sub2.anInt2583 * -668540675,
								Class4.method92(1048128320 * class91_sub20_sub14_sub1_sub2.anInt2622 - 64 + 107578049 * class91_sub20_sub14_sub1_sub2.anInt2589, class91_sub20_sub14_sub1_sub2.anInt2583 * -668540675 + class91_sub20_sub14_sub1_sub2.anInt2622 * 1048128320 - 64, -1723088013 * Class100.anInt1248, -1793803245), 60 + 1048128320 * class91_sub20_sub14_sub1_sub2.anInt2622 - 64,
								class91_sub20_sub14_sub1_sub2, 566074253 * class91_sub20_sub14_sub1_sub2.anInt2593, i_7_, class91_sub20_sub14_sub1_sub2.aBoolean2585);
					}
				}
			}
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "at.ac()");
		}
	}

	static void method798(final int i) {
		do {
			try {
				try {
					if (Class91_Sub20_Sub14_Sub4.aClass7_2785 == null) {
						Class91_Sub20_Sub14_Sub4.aClass7_2785 = new Class7(Class91_Sub22.aClass25_2110, new URL(Class40.aString546));
					} else {
						final byte[] is = Class91_Sub20_Sub14_Sub4.aClass7_2785.method151(209016784);
						if (is != null) {
							final ByteBuffer class91_sub9 = new ByteBuffer(is);
							Class101.anInt1273 = class91_sub9.method686((byte) -100) * 2051978599;
							Class46.aClass103Array594 = new Class103[Class101.anInt1273 * -1483041193];
							for (int i_10_ = 0; i_10_ < Class101.anInt1273 * -1483041193; i_10_++) {
								final Class103 class103 = Class46.aClass103Array594[i_10_] = new Class103();
								final int i_11_ = class91_sub9.method686((byte) -16);
								class103.anInt1335 = 720208185 * (i_11_ & 0x3fff);
								class103.aBoolean1321 = (i_11_ & 0x8000) != 0;
								class103.aBoolean1325 = (i_11_ & 0x4000) != 0;
								class103.aString1320 = class91_sub9.method645((byte) -92);
								class103.aString1329 = class91_sub9.method645((byte) -82);
								class103.anInt1322 = class91_sub9.readUnsignedByte() * -280400863;
								class103.anInt1319 = class91_sub9.readShort2() * 340742563;
								class103.anInt1334 = i_10_ * -900610009;
							}
							Class35.method284(Class46.aClass103Array594, 0, Class46.aClass103Array594.length - 1, Class101.anIntArray1285, Class101.anIntArray1274, (short) 18991);
							Class101.aBoolean1283 = true;
							Class91_Sub20_Sub14_Sub4.aClass7_2785 = null;
						}
					}
				} catch (final Exception exception) {
					exception.printStackTrace();
					Class91_Sub20_Sub14_Sub4.aClass7_2785 = null;
					break;
				}
				break;
			} catch (final RuntimeException var7) {
				throw Class102.method1086(var7, "at.k()");
			}
		} while (false);
	}

	static void method799(final Class63_Sub1 class63_sub1, final int i, final int i_12_) {
		try {
			if (Class58.aClass91_Sub9_714 != null) {
				Class58.aClass91_Sub9_714.currentOffset = i * 232081464 + -1465561821;
				final int i_13_ = Class58.aClass91_Sub9_714.readDword();
				final int i_14_ = Class58.aClass91_Sub9_714.readDword();
				class63_sub1.method423(i_13_, i_14_, -2097166598);
			} else {
				Class62.method395(null, 255, 255, 0, (byte) 0, true, -1110696742);
				Class59.aClass63_Sub1Array732[i] = class63_sub1;
			}
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "at.f()");
		}
	}

	public static boolean method800(final int i, final int i_15_) {
		try {
			if (Class91_Sub18.aBooleanArray1961[i]) {
				return true;
			}
			if (!Class91_Sub18.aClass63_2056.method400(i, 440764142)) {
				return false;
			}
			final int i_16_ = Class91_Sub18.aClass63_2056.method405(i, -386342782);
			if (i_16_ == 0) {
				Class91_Sub18.aBooleanArray1961[i] = true;
				return true;
			}
			if (Class91_Sub18.aClass91_Sub18ArrayArray1962[i] == null) {
				Class91_Sub18.aClass91_Sub18ArrayArray1962[i] = new Class91_Sub18[i_16_];
			}
			for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
				if (Class91_Sub18.aClass91_Sub18ArrayArray1962[i][i_17_] == null) {
					final byte[] is = Class91_Sub18.aClass63_2056.getFile(i, i_17_, 314814643);
					if (is != null) {
						Class91_Sub18.aClass91_Sub18ArrayArray1962[i][i_17_] = new Class91_Sub18();
						Class91_Sub18.aClass91_Sub18ArrayArray1962[i][i_17_].anInt2032 = (i_17_ + (i << 16)) * -257050011;
						if (is[0] == -1) {
							Class91_Sub18.aClass91_Sub18ArrayArray1962[i][i_17_].method715(new ByteBuffer(is), 2143816833);
						} else {
							Class91_Sub18.aClass91_Sub18ArrayArray1962[i][i_17_].method714(new ByteBuffer(is), 1308211315);
						}
					}
				}
			}
			Class91_Sub18.aBooleanArray1961[i] = true;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "at.f()");
		}
		return true;
	}
}
