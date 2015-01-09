/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class93 {
	public static final int anInt1196 = 126;
	public static int[] anIntArray1197;
	public static int[] anIntArray1198 = new int[32];
	public static int[] anIntArray1199;
	public static final int anInt1200 = 0;

	static {
		int i = 2;
		for (int i_0_ = 0; i_0_ < 32; i_0_++) {
			anIntArray1198[i_0_] = i - 1;
			i += i;
		}
		anIntArray1197 = new int[2000];
		anIntArray1199 = new int[2000];
	}

	Class93() throws Throwable {
		try {
			throw new Error();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "fv.<init>()");
		}
	}
}
