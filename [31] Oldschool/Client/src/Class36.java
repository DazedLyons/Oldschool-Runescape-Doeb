/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public final class Class36 {
	public int anInt425;
	int anInt426;
	int anInt427;
	int anInt428;
	int anInt429;
	public Class91_Sub20_Sub14 aClass91_Sub20_Sub14_430;
	public Class91_Sub20_Sub14 aClass91_Sub20_Sub14_431;
	public static final int anInt432 = 88;
	static final int anInt433 = 101;
	static final int anInt434 = 14;
	int anInt435;
	int anInt436;
	static final int anInt437 = 28;
	static Class97 aClass97_438;
	public static final int anInt439 = 8;
	public static final int anInt440 = 142;
	public static final int anInt441 = 76;

	Class36() {
		try {
			anInt425 = 0;
			this.anInt428 = 0;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "cs.<init>()");
		}
	}

	public static Class28 method287(final int i, final int i_0_, final Component component, final int i_1_) {
		Class28_Sub1 class28_sub1;
		do {
			try {
				Class28_Sub2 class28_sub2;
				try {
					final Class28_Sub2 class28_sub2_2_ = new Class28_Sub2();
					class28_sub2_2_.method253(i, i_0_, component, (byte) 0);
					class28_sub2 = class28_sub2_2_;
				} catch (final Throwable throwable) {
					final Class28_Sub1 class28_sub1_3_ = new Class28_Sub1();
					class28_sub1_3_.method253(i, i_0_, component, (byte) 0);
					class28_sub1 = class28_sub1_3_;
					break;
				}
				return class28_sub2;
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "cs.an()");
			}
		} while (false);
		return class28_sub1;
	}
}
