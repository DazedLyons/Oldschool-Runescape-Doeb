/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class44 {
	int anInt572;
	int anInt573;
	int anInt574;
	public Class91_Sub20_Sub14 aClass91_Sub20_Sub14_575;
	public static final int anInt576 = 31;
	public static final int anInt577 = 51;
	static int anInt578;
	static Class91_Sub15 aClass91_Sub15_579;
	static final int anInt580 = 64;
	public static final int anInt581 = 512;
	static final int anInt582 = 49;
	int anInt583;
	static final int anInt584 = 18;
	public int anInt585;

	static final void method359(final int i, final int i_0_, final int i_1_, final int i_2_) {
		try {
			for (int i_3_ = 0; i_3_ < 8; i_3_++) {
				if (i_2_ <= 1022179615) {
					return;
				}
				for (int i_4_ = 0; i_4_ < 8; i_4_++) {
					Class102.anIntArrayArrayArray1292[i][i_0_ + i_3_][i_1_ + i_4_] = 0;
				}
			}
			if (i_0_ > 0) {
				for (int i_5_ = 1; i_5_ < 8; i_5_++) {
					Class102.anIntArrayArrayArray1292[i][i_0_][i_1_ + i_5_] = Class102.anIntArrayArrayArray1292[i][i_0_ - 1][i_5_ + i_1_];
				}
			}
			if (i_1_ > 0) {
				for (int i_6_ = 1; i_6_ < 8; i_6_++) {
					if (i_2_ <= 1022179615) {
						return;
					}
					Class102.anIntArrayArrayArray1292[i][i_6_ + i_0_][i_1_] = Class102.anIntArrayArrayArray1292[i][i_6_ + i_0_][i_1_ - 1];
				}
			}
			if (i_0_ > 0 && Class102.anIntArrayArrayArray1292[i][i_0_ - 1][i_1_] != 0) {
				Class102.anIntArrayArrayArray1292[i][i_0_][i_1_] = Class102.anIntArrayArrayArray1292[i][i_0_ - 1][i_1_];
			} else if (i_1_ > 0 && Class102.anIntArrayArrayArray1292[i][i_0_][i_1_ - 1] != 0) {
				Class102.anIntArrayArrayArray1292[i][i_0_][i_1_] = Class102.anIntArrayArrayArray1292[i][i_0_][i_1_ - 1];
			} else if (i_0_ > 0 && i_1_ > 0 && Class102.anIntArrayArrayArray1292[i][i_0_ - 1][i_1_ - 1] != 0) {
				Class102.anIntArrayArrayArray1292[i][i_0_][i_1_] = Class102.anIntArrayArrayArray1292[i][i_0_ - 1][i_1_ - 1];
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "dd.t()");
		}
	}

	public static Class91_Sub20_Sub15 method360(final Js5 class63, final Js5 class63_7_, final int i, final boolean bool, final byte i_8_) {
		do {
			try {
				boolean bool_9_ = true;
				final int[] is = class63.method416(i, -1591724525);
				int[] is_11_;
				final int i_10_ = (is_11_ = is).length;
				for (int i_12_ = 0; i_12_ < i_10_; i_12_++) {
					final int i_13_ = is_11_[i_12_];
					final byte[] is_14_ = class63.method403(i, i_13_, (short) -24557);
					if (is_14_ == null) {
						bool_9_ = false;
					} else {
						final int i_15_ = (is_14_[0] & 0xff) << 8 | is_14_[1] & 0xff;
						byte[] is_16_;
						if (bool) {
							is_16_ = class63_7_.method403(0, i_15_, (short) -23609);
						} else {
							is_16_ = class63_7_.method403(i_15_, 0, (short) -2020);
						}
						if (is_16_ == null) {
							bool_9_ = false;
						}
					}
				}
				if (!bool_9_) {
					return null;
				}
				Class91_Sub20_Sub15 class91_sub20_sub15;
				try {
					class91_sub20_sub15 = new Class91_Sub20_Sub15(class63, class63_7_, i, bool);
				} catch (final Exception exception) {
					break;
				}
				return class91_sub20_sub15;
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "dd.i()");
			}
		} while (false);
		return null;
	}

	Class44() {
		/* empty */
	}
}
