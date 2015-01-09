/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class105 {
	static Class63_Sub1 aClass63_Sub1_1360;
	Class91_Sub20_Sub17 aClass91_Sub20_Sub17_1361;
	int[] anIntArray1362;
	String[] aStringArray1363;
	int anInt1364;
	static int anInt1365;
	static Class24 aClass24_1366;
	static int[] anIntArray1367;

	Class105() {
		try {
			this.anInt1364 = 1439830615;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "v.<init>()");
		}
	}

	public static void method1095(final short i) {
		try {
			if (Class15.aClass15_216 != null) {
				final Class15 class15 = Class15.aClass15_216;
				synchronized (class15) {
					Class15.aClass15_216 = null;
				}
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "v.w()");
		}
	}

	static void method1096(final int i) {
		try {
			Class2 class2 = null;
			try {
				class2 = Class102.method1087("", client.aClass65_1443.aString1420, true, (short) 9605);
				final ByteBuffer class91_sub9 = Class91_Sub20_Sub14_Sub4.aClass108_2769.method1110((byte) 6);
				class2.method81(class91_sub9.buffer, 0, -1128893257 * class91_sub9.currentOffset, -346325236);
			} catch (final Exception exception) {
				/* empty */
			}
			try {
				if (class2 != null) {
					class2.method87((byte) -25);
				}
			} catch (final Exception exception) {
				/* empty */
			}
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "v.e()");
		}
	}
}
