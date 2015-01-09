/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class71 {
	public static final int anInt821 = 19661280;
	public static final Class71 aClass71_822 = new Class71(1);
	public static final int anInt823 = 19661088;
	public final int anInt824;
	public static final Class71 aClass71_825 = new Class71(0);
	public static final Class71 aClass71_826 = new Class71(2);

	public static int method436(final boolean bool, final boolean bool_0_, final byte i) {
		int i_1_;
		try {
			int i_2_ = 0;
			if (bool) {
				i_2_ += Class59.anInt735 * -124209243 + -1676406695 * Class59.anInt720;
			}
			if (bool_0_) {
				i_2_ += Class59.anInt725 * -2019506593 + Class59.anInt723 * 628054321;
			}
			i_1_ = i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ep.p()");
		}
		return i_1_;
	}

	Class71(final int i) {
		try {
			anInt824 = i * 1117289199;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "ep.<init>()");
		}
	}
}
