/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

public class Class103 {
	static Class63_Sub1 aClass63_Sub1_1318;
	int anInt1319;
	String aString1320;
	boolean aBoolean1321;
	int anInt1322;
	public static String aString1323;
	public static final int anInt1324 = 231;
	boolean aBoolean1325;
	public static final int anInt1326 = 79;
	static int anInt1327;
	static final int anInt1328 = 50;
	String aString1329;
	protected static Font aFont1330;
	static final int anInt1331 = 1048576;
	static final int anInt1332 = 8;
	static int anInt1333;
	int anInt1334;
	int anInt1335;
	public static final int anInt1336 = 120;

	public static void method1089(final Class53 class53, final int i) {
		try {
			Class99.aClass53_1235 = class53;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "s.i()");
		}
	}

	static final int method1090(final int i, int i_0_, final int i_1_) {
		int i_2_;
		try {
			if (-2 == i) {
				return 12345678;
			}
			if (-1 == i) {
				if (i_0_ < 2) {
					i_0_ = 2;
				} else if (i_0_ > 126) {
					i_0_ = 126;
				}
				return i_0_;
			}
			i_0_ = (i & 0x7f) * i_0_ / 128;
			if (i_0_ < 2) {
				i_0_ = 2;
			} else if (i_0_ > 126) {
				i_0_ = 126;
			}
			i_2_ = (i & 0xff80) + i_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "s.g()");
		}
		return i_2_;
	}

	Class103() {
		/* empty */
	}
}
