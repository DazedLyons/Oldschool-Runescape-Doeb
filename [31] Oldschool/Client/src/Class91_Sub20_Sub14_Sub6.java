/* Class91_Sub20_Sub14_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class91_Sub20_Sub14_Sub6 extends Class91_Sub20_Sub14 {
	int anInt2808;
	int anInt2809;
	int anInt2810;
	int anInt2811;
	int anInt2812;
	static final int anInt2813 = 8;
	boolean aBoolean2814;
	int anInt2815;
	int anInt2816;
	int anInt2817;
	static Class29 aClass29_2818;
	static Class20 aClass20_2819;
	static int anInt2820;
	static int anInt2821;
	Class91_Sub20_Sub5 aClass91_Sub20_Sub5_2822;
	public static final int anInt2823 = 111;
	public static final int anInt2824 = 192;
	public static final int anInt2825 = 157;

	final void method1012(final int i, final byte i_0_) {
		try {
			if (this.aBoolean2814) {
				if (i_0_ == 6) {
					throw new IllegalStateException();
				}
			} else {
				this.anInt2808 += -1081367289 * i;
				while (this.anInt2808 * -1829717833 > this.aClass91_Sub20_Sub5_2822.anIntArray2270[224941275 * this.anInt2815]) {
					this.anInt2808 -= this.aClass91_Sub20_Sub5_2822.anIntArray2270[224941275 * this.anInt2815] * -1081367289;
					this.anInt2815 += 609716051;
					if (224941275 * this.anInt2815 >= this.aClass91_Sub20_Sub5_2822.anIntArray2268.length) {
						this.aBoolean2814 = true;
						break;
					}
				}
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "n.i()");
		}
	}

	@Override
	protected final Class91_Sub20_Sub14_Sub3 method915(final int i) {
		Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3;
		try {
			final Class91_Sub20_Sub12 class91_sub20_sub12 = NpcType.method813(this.anInt2816 * -1744827051, (short) -18051);
			Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_1_;
			if (!this.aBoolean2814) {
				class91_sub20_sub14_sub3_1_ = class91_sub20_sub12.method817(this.anInt2815 * 224941275, 2111999225);
			} else {
				class91_sub20_sub14_sub3_1_ = class91_sub20_sub12.method817(-1, 2086505440);
			}
			if (class91_sub20_sub14_sub3_1_ == null) {
				return null;
			}
			class91_sub20_sub14_sub3 = class91_sub20_sub14_sub3_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "n.w()");
		}
		return class91_sub20_sub14_sub3;
	}

	Class91_Sub20_Sub14_Sub6(final int i, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final int i_7_) {
		try {
			this.anInt2815 = 0;
			this.anInt2808 = 0;
			this.aBoolean2814 = false;
			this.anInt2816 = i * -1790998531;
			this.anInt2810 = 895117809 * i_2_;
			this.anInt2811 = i_3_ * -1145634639;
			this.anInt2812 = -1423534715 * i_4_;
			this.anInt2817 = i_5_ * 320846205;
			this.anInt2809 = (i_6_ + i_7_) * -91495649;
			final int i_8_ = NpcType.method813(this.anInt2816 * -1744827051, (short) -19000).anInt2466 * -1585626451;
			if (i_8_ != -1) {
				this.aBoolean2814 = false;
				this.aClass91_Sub20_Sub5_2822 = Class7.method152(i_8_, -1584253668);
			} else {
				this.aBoolean2814 = true;
			}
		} catch (final RuntimeException var9) {
			throw Class102.method1086(var9, "n.<init>()");
		}
	}
}
