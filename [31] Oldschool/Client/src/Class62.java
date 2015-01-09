/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class62 {
	public static final char[] aCharArray757 = { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178' };
	static int[] anIntArray758;
	public static final int anInt759 = 175;
	public static final int anInt760 = 52;

	Class62() throws Throwable {
		try {
			throw new Error();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ef.<init>()");
		}
	}

	static void method395(final Class63_Sub1 class63_sub1, final int i, final int i_0_, final int i_1_, final byte i_2_, final boolean bool, final int i_3_) {
		try {
			final long l = i_0_ + (i << 16);
			Class91_Sub20_Sub16 class91_sub20_sub16 = (Class91_Sub20_Sub16) Class59.aClass83_719.method474(l);
			if (class91_sub20_sub16 == null) {
				class91_sub20_sub16 = (Class91_Sub20_Sub16) Class59.aClass83_721.method474(l);
				if (class91_sub20_sub16 == null) {
					class91_sub20_sub16 = (Class91_Sub20_Sub16) Class59.aClass83_724.method474(l);
					if (class91_sub20_sub16 != null) {
						if (bool) {
							class91_sub20_sub16.method724();
							Class59.aClass83_719.method478(class91_sub20_sub16, l);
							Class59.anInt725 -= -2088692321;
							Class59.anInt720 += 483014633;
						}
					} else {
						if (!bool) {
							class91_sub20_sub16 = (Class91_Sub20_Sub16) Class59.aClass83_729.method474(l);
							if (class91_sub20_sub16 != null) {
								return;
							}
						}
						class91_sub20_sub16 = new Class91_Sub20_Sub16();
						class91_sub20_sub16.aClass63_Sub1_2502 = class63_sub1;
						class91_sub20_sub16.anInt2499 = i_1_ * -1570322911;
						class91_sub20_sub16.aByte2500 = i_2_;
						if (bool) {
							Class59.aClass83_719.method478(class91_sub20_sub16, l);
							Class59.anInt720 += 483014633;
						} else {
							Class59.aClass82_726.method469(class91_sub20_sub16);
							Class59.aClass83_724.method478(class91_sub20_sub16, l);
							Class59.anInt725 += -2088692321;
						}
					}
				}
			}
		} catch (final RuntimeException var10) {
			throw Class102.method1086(var10, "ef.e()");
		}
	}
}
