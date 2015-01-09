/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class26 {
	static final int anInt320 = 256;
	static final int anInt321 = 88;

	public abstract void method241();

	public abstract void method242(int i);

	abstract int method243(int i, int i_0_, byte i_1_);

	static final void method244(final int i) {
		try {
			if (-974834839 * client.anInt1485 > 0) {
				Canvas_Sub1.method72(-1769937154);
			} else {
				Class91_Sub20_Sub14_Sub1_Sub2.method939(40, 876490833);
				Class91_Sub20_Sub9.aClass20_2410 = Class91_Sub20_Sub14_Sub6.aClass20_2819;
				Class91_Sub20_Sub14_Sub6.aClass20_2819 = null;
			}
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "bz.c()");
		}
	}

	abstract int method245(int i, int i_2_);

	public abstract void method246();

	abstract int method247(int i, int i_3_);

	Class26() {
		/* empty */
	}

	abstract int method248(int i, int i_4_);

	public static Class91_Sub20_Sub13_Sub3[] method249(final Js5 class63, final String string, final String string_5_, final byte i) {
		Class91_Sub20_Sub13_Sub3[] class91_sub20_sub13_sub3s;
		try {
			final int i_6_ = class63.method409(string, -1740325063);
			final int i_7_ = class63.method415(i_6_, string_5_, (byte) 57);
			Class91_Sub20_Sub13_Sub3[] class91_sub20_sub13_sub3s_8_;
			if (!IdkType.method731(class63, i_6_, i_7_, 43762446)) {
				class91_sub20_sub13_sub3s_8_ = null;
			} else {
				final Class91_Sub20_Sub13_Sub3[] class91_sub20_sub13_sub3s_9_ = new Class91_Sub20_Sub13_Sub3[1302560181 * Class37.anInt446];
				for (int i_10_ = 0; i_10_ < 1302560181 * Class37.anInt446; i_10_++) {
					final Class91_Sub20_Sub13_Sub3 class91_sub20_sub13_sub3 = class91_sub20_sub13_sub3s_9_[i_10_] = new Class91_Sub20_Sub13_Sub3();
					class91_sub20_sub13_sub3.anInt2553 = 201426335 * Class37.anInt451;
					class91_sub20_sub13_sub3.anInt2554 = 1455742675 * Class37.anInt447;
					class91_sub20_sub13_sub3.anInt2549 = Class37.anIntArray445[i_10_];
					class91_sub20_sub13_sub3.anInt2552 = Class89.anIntArray1183[i_10_];
					class91_sub20_sub13_sub3.anInt2548 = Class57.anIntArray698[i_10_];
					class91_sub20_sub13_sub3.anInt2550 = Class37.anIntArray449[i_10_];
					final int i_11_ = class91_sub20_sub13_sub3.anInt2550 * class91_sub20_sub13_sub3.anInt2548;
					final byte[] is = Class74.aByteArrayArray844[i_10_];
					class91_sub20_sub13_sub3.anIntArray2557 = new int[i_11_];
					for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
						class91_sub20_sub13_sub3.anIntArray2557[i_12_] = FloUnderlayType.anIntArray2418[is[i_12_] & 0xff];
					}
				}
				Class18.method186(-551170979);
				class91_sub20_sub13_sub3s_8_ = class91_sub20_sub13_sub3s_9_;
			}
			class91_sub20_sub13_sub3s = class91_sub20_sub13_sub3s_8_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bz.e()");
		}
		return class91_sub20_sub13_sub3s;
	}
}
