/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class32 {
	int anInt369;
	int anInt370;
	int anInt371;
	int anInt372;
	static final int anInt373 = 4;
	static final int anInt374 = 102;
	static int[][][] anIntArrayArrayArray375;
	static Class91_Sub20_Sub13_Sub4_Sub1 aClass91_Sub20_Sub13_Sub4_Sub1_376;
	static int[] anIntArray377;
	static final int anInt378 = 128;
	public static final int anInt379 = 119;

	static void method275(final byte i) {
		try {
			Class102.anInt1294 = -2110658033;
			Class102.aByteArrayArrayArray1295 = new byte[4][104][104];
			Class91_Sub20_Sub6.aByteArrayArrayArray2292 = new byte[4][104][104];
			Class102.aByteArrayArrayArray1296 = new byte[4][104][104];
			Class49.aByteArrayArrayArray610 = new byte[4][104][104];
			anIntArrayArrayArray375 = new int[4][105][105];
			Class102.aByteArrayArrayArray1310 = new byte[4][105][105];
			Class102.anIntArrayArray1298 = new int[105][105];
			Class102.anIntArray1304 = new int[104];
			anIntArray377 = new int[104];
			Class91_Sub20_Sub9.anIntArray2403 = new int[104];
			Class106.anIntArray1376 = new int[104];
			Class46.anIntArray589 = new int[104];
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "ch.i()");
		}
	}

	Class32(final Class32 class32_0_) {
		try {
			this.anInt371 = class32_0_.anInt371 * 1;
			this.anInt370 = class32_0_.anInt370 * 1;
			this.anInt369 = 1 * class32_0_.anInt369;
			this.anInt372 = class32_0_.anInt372 * 1;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "ch.<init>()");
		}
	}

	Class32() {
		/* empty */
	}

	public static Class91_Sub20_Sub2 method276(final int i, final int i_1_) {
		Class91_Sub20_Sub2 class91_sub20_sub2;
		try {
			Class91_Sub20_Sub2 class91_sub20_sub2_2_ = (Class91_Sub20_Sub2) Class91_Sub20_Sub2.aClass96_2236.method1068(i);
			if (class91_sub20_sub2_2_ != null) {
				return class91_sub20_sub2_2_;
			}
			final byte[] is = Class91_Sub20_Sub2.aClass63_2234.getFile(5, i, 1999389372);
			class91_sub20_sub2_2_ = new Class91_Sub20_Sub2();
			if (is != null) {
				class91_sub20_sub2_2_.method741(new ByteBuffer(is), (byte) 1);
			}
			Class91_Sub20_Sub2.aClass96_2236.method1067(class91_sub20_sub2_2_, i);
			class91_sub20_sub2 = class91_sub20_sub2_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ch.w()");
		}
		return class91_sub20_sub2;
	}

	public static void method277(final Js5 class63, final byte i) {
		try {
			Class91_Sub20_Sub4.aClass63_2258 = class63;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "ch.i()");
		}
	}
}
