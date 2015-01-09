/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class61 {
	public static final int anInt748 = 6;
	public static final int anInt749 = 64;
	public static final int anInt750 = 4;
	public static final int anInt751 = 1;
	public static final int anInt752 = 3;
	public static final int anInt753 = 13;
	public static final int anInt754 = 16;
	public static final int anInt755 = 8;
	public static final int anInt756 = 53;

	public static Class91_Sub18 method394(final int i, final int i_0_) {
		Class91_Sub18 class91_sub18;
		try {
			final int i_1_ = i >> 16;
			final int i_2_ = i & 0xffff;
			if (Class91_Sub18.aClass91_Sub18ArrayArray1962[i_1_] != null && Class91_Sub18.aClass91_Sub18ArrayArray1962[i_1_][i_2_] != null) {
				return Class91_Sub18.aClass91_Sub18ArrayArray1962[i_1_][i_2_];
			}
			final boolean bool = Class91_Sub20_Sub9.method800(i_1_, -1719132326);
			if (!bool) {
				return null;
			}
			class91_sub18 = Class91_Sub18.aClass91_Sub18ArrayArray1962[i_1_][i_2_];
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ec.i()");
		}
		return class91_sub18;
	}

	Class61() throws Throwable {
		try {
			throw new Error();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ec.<init>()");
		}
	}
}
