/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class98 {
	static final int anInt1223 = 21;
	static final Class98 aClass98_1224 = new Class98(1, 1, "", "");
	public final int anInt1225;
	static final Class98 aClass98_1226 = new Class98(2, 3, "", "");
	static final Class98 aClass98_1227 = new Class98(0, 4, "", "");
	static final int anInt1228 = 23;
	static final Class98 aClass98_1229 = new Class98(3, 6, "", "");
	static final Class98 aClass98_1233 = new Class98(5, 2, "", "");
	public static final Class98 aClass98_1234 = new Class98(6, 0, "", "");
	public static final Class98 aClass98_1230 = new Class98(4, -1, "", "", true, new Class98[] { aClass98_1234, aClass98_1224, aClass98_1233, aClass98_1227, aClass98_1226 });
	static final Class98 aClass98_1231 = new Class98(7, 5, "", "");
	final String aString1232;

	Class98(final int i, final int i_0_, final String string, final String string_1_, final boolean bool, final Class98[] class98s) {
		try {
			anInt1225 = i * 1022343667;
			aString1232 = string_1_;
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "gq.<init>()");
		}
	}

	@Override
	public String toString() {
		String string;
		try {
			string = this.aString1232;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "gq.toString()");
		}
		return string;
	}

	Class98(final int i, final int i_2_, final String string, final String string_3_) {
		try {
			anInt1225 = i * 1022343667;
			aString1232 = string_3_;
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "gq.<init>()");
		}
	}
}
