/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class30 {
	public static final int anInt353 = 254;
	public static final int anInt354 = 87;
	public static final int anInt355 = 173;
	public static final int anInt356 = 74;
	static Js5 aClass63_357;

	static final int method274(final int i, int i_0_, final byte i_1_) {
		int i_2_;
		try {
			if (i == -1) {
				return 12345678;
			}
			i_0_ = (i & 0x7f) * i_0_ / 128;
			if (i_0_ < 2) {
				i_0_ = 2;
			} else if (i_0_ > 126) {
				i_0_ = 126;
			}
			i_2_ = i_0_ + (i & 0xff80);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ce.u()");
		}
		return i_2_;
	}

	Class30() {
		/* empty */
	}
}
