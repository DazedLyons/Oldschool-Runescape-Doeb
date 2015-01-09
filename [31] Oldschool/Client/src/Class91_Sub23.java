/* Class91_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub23 extends Class91 {
	static Class63_Sub1 aClass63_Sub1_2113;
	String aString2114;
	static final int anInt2115 = 131072;
	byte aByte2116;
	static final int anInt2117 = 21;
	static Class63_Sub1 aClass63_Sub1_2118;
	public static final int anInt2119 = 28;
	int anInt2120;
	public static final int anInt2121 = 59;
	public static final int anInt2122 = 80;
	String aString2123;
	static Class91_Sub18 aClass91_Sub18_2124;

	static final void method1044(final int i) {
		try {
			for (Class91_Sub5 class91_sub5 = (Class91_Sub5) client.aClass95_1577.method1062(); class91_sub5 != null; class91_sub5 = (Class91_Sub5) client.aClass95_1577.method1063()) {
				if (i != 16711680) {
					break;
				}
				if (class91_sub5.anInt1804 * 1461627319 == -1) {
					class91_sub5.anInt1803 = 0;
					client.method65(class91_sub5, -148110760);
				} else {
					class91_sub5.method495();
				}
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "k.bd()");
		}
	}

	static final void method1045(final int i) {
		try {
			Class39.aBoolean483 = false;
			client.aBoolean1691 = false;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "k.d()");
		}
	}

	Class91_Sub23() {
		/* empty */
	}

	public static byte[] method1046(final Object object, final boolean bool, final int i) {
		try {
			if (object == null) {
				return null;
			}
			if (object instanceof byte[]) {
				final byte[] is = (byte[]) object;
				if (bool) {
					return Class91_Sub20_Sub6.method766(is, -523542972);
				}
				return is;
			}
			if (object instanceof Class42) {
				final Class42 class42 = (Class42) object;
				return class42.method350((byte) 2);
			}
			throw new IllegalArgumentException();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "k.w()");
		}
	}

	public static int method1047(final int i, final int i_0_, int i_1_, final byte i_2_) {
		int i_3_;
		try {
			i_1_ &= 0x3;
			i_3_ = i_1_ == 0 ? i_0_ : i_1_ == 1 ? 7 - i : 2 == i_1_ ? 7 - i_0_ : i;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "k.i()");
		}
		return i_3_;
	}

	static String method1048(final Class91_Sub18 class91_sub18, final int i, final byte i_4_) {
		try {
			final int i_5_ = Class17.method182(class91_sub18, 1147787712);
			final boolean bool = (i_5_ >> 1 + i & 0x1) != 0;
			if (!bool && class91_sub18.anObjectArray2028 == null) {
				return null;
			}
			if (class91_sub18.aStringArray1991 != null && class91_sub18.aStringArray1991.length > i && class91_sub18.aStringArray1991[i] != null && class91_sub18.aStringArray1991[i].trim().length() != 0) {
				return class91_sub18.aStringArray1991[i];
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "k.db()");
		}
		return null;
	}
}
