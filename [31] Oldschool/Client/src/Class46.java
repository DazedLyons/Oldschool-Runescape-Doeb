/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class46 {
	public static int[] anIntArray586 = new int[99];
	public static final boolean[] aBooleanArray587 = { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
	public static final int anInt588 = 25;
	static int[] anIntArray589;
	static Class91_Sub18 aClass91_Sub18_590;
	public static final int anInt591 = 130;
	public static final int anInt592 = 0;
	public static final int anInt593 = 69;
	static Class103[] aClass103Array594;

	static {
		int i = 0;
		for (int i_0_ = 0; i_0_ < 99; i_0_++) {
			final int i_1_ = 1 + i_0_;
			final int i_2_ = (int) (i_1_ + 300.0 * Math.pow(2.0, i_1_ / 7.0));
			i += i_2_;
			anIntArray586[i_0_] = i / 4;
		}
	}

	Class46() throws Throwable {
		try {
			throw new Error();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dg.<init>()");
		}
	}
}
