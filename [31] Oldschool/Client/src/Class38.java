/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class38 {
	int[] anIntArray454;
	int[] anIntArray455;
	int[] anIntArray456;
	boolean aBoolean457 = true;
	int[] anIntArray458;
	int[] anIntArray459;
	int anInt460;
	int[] anIntArray461;
	int[] anIntArray462;
	int[] anIntArray463;
	int[] anIntArray464;
	static int[] anIntArray465 = new int[6];
	static int[] anIntArray466 = new int[6];
	int anInt467;
	int anInt468;
	int[] anIntArray469;
	static int[] anIntArray470 = new int[6];
	static int[] anIntArray471 = new int[6];
	int anInt472;
	static int[] anIntArray473 = new int[6];
	static final int[][] anIntArrayArray474 = { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };
	static final int[][] anIntArrayArray475 = { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 },
			{ 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	Class38(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_, final int i_14_, final int i_15_, final int i_16_, final int i_17_) {
		if (i_4_ != i_5_ || i_4_ != i_6_ || i_4_ != i_7_) {
			this.aBoolean457 = false;
		}
		this.anInt472 = i;
		this.anInt460 = i_0_;
		this.anInt467 = i_16_;
		this.anInt468 = i_17_;
		final int[] is = anIntArrayArray474[i];
		final int i_22_ = is.length;
		this.anIntArray459 = new int[i_22_];
		this.anIntArray455 = new int[i_22_];
		this.anIntArray469 = new int[i_22_];
		final int[] is_23_ = new int[i_22_];
		final int[] is_24_ = new int[i_22_];
		final int i_25_ = i_2_ * 128;
		final int i_26_ = i_3_ * 128;
		for (int i_27_ = 0; i_27_ < i_22_; i_27_++) {
			int i_28_ = is[i_27_];
			if ((i_28_ & 0x1) == 0 && i_28_ <= 8) {
				i_28_ = (i_28_ - i_0_ - i_0_ - 1 & 0x7) + 1;
			}
			if (i_28_ > 8 && i_28_ <= 12) {
				i_28_ = (i_28_ - 9 - i_0_ & 0x3) + 9;
			}
			if (i_28_ > 12 && i_28_ <= 16) {
				i_28_ = (i_28_ - 13 - i_0_ & 0x3) + 13;
			}
			int i_29_;
			int i_30_;
			int i_31_;
			int i_32_;
			int i_33_;
			if (i_28_ == 1) {
				i_29_ = i_25_;
				i_30_ = i_26_;
				i_31_ = i_4_;
				i_32_ = i_8_;
				i_33_ = i_12_;
			} else if (i_28_ == 2) {
				i_29_ = i_25_ + 64;
				i_30_ = i_26_;
				i_31_ = i_4_ + i_5_ >> 1;
				i_32_ = i_8_ + i_9_ >> 1;
				i_33_ = i_12_ + i_13_ >> 1;
			} else if (i_28_ == 3) {
				i_29_ = i_25_ + 128;
				i_30_ = i_26_;
				i_31_ = i_5_;
				i_32_ = i_9_;
				i_33_ = i_13_;
			} else if (i_28_ == 4) {
				i_29_ = i_25_ + 128;
				i_30_ = i_26_ + 64;
				i_31_ = i_5_ + i_6_ >> 1;
				i_32_ = i_9_ + i_10_ >> 1;
				i_33_ = i_13_ + i_14_ >> 1;
			} else if (i_28_ == 5) {
				i_29_ = i_25_ + 128;
				i_30_ = i_26_ + 128;
				i_31_ = i_6_;
				i_32_ = i_10_;
				i_33_ = i_14_;
			} else if (i_28_ == 6) {
				i_29_ = i_25_ + 64;
				i_30_ = i_26_ + 128;
				i_31_ = i_6_ + i_7_ >> 1;
				i_32_ = i_10_ + i_11_ >> 1;
				i_33_ = i_14_ + i_15_ >> 1;
			} else if (i_28_ == 7) {
				i_29_ = i_25_;
				i_30_ = i_26_ + 128;
				i_31_ = i_7_;
				i_32_ = i_11_;
				i_33_ = i_15_;
			} else if (i_28_ == 8) {
				i_29_ = i_25_;
				i_30_ = i_26_ + 64;
				i_31_ = i_7_ + i_4_ >> 1;
				i_32_ = i_11_ + i_8_ >> 1;
				i_33_ = i_15_ + i_12_ >> 1;
			} else if (i_28_ == 9) {
				i_29_ = i_25_ + 64;
				i_30_ = i_26_ + 32;
				i_31_ = i_4_ + i_5_ >> 1;
				i_32_ = i_8_ + i_9_ >> 1;
				i_33_ = i_12_ + i_13_ >> 1;
			} else if (i_28_ == 10) {
				i_29_ = i_25_ + 96;
				i_30_ = i_26_ + 64;
				i_31_ = i_5_ + i_6_ >> 1;
				i_32_ = i_9_ + i_10_ >> 1;
				i_33_ = i_13_ + i_14_ >> 1;
			} else if (i_28_ == 11) {
				i_29_ = i_25_ + 64;
				i_30_ = i_26_ + 96;
				i_31_ = i_6_ + i_7_ >> 1;
				i_32_ = i_10_ + i_11_ >> 1;
				i_33_ = i_14_ + i_15_ >> 1;
			} else if (i_28_ == 12) {
				i_29_ = i_25_ + 32;
				i_30_ = i_26_ + 64;
				i_31_ = i_7_ + i_4_ >> 1;
				i_32_ = i_11_ + i_8_ >> 1;
				i_33_ = i_15_ + i_12_ >> 1;
			} else if (i_28_ == 13) {
				i_29_ = i_25_ + 32;
				i_30_ = i_26_ + 32;
				i_31_ = i_4_;
				i_32_ = i_8_;
				i_33_ = i_12_;
			} else if (i_28_ == 14) {
				i_29_ = i_25_ + 96;
				i_30_ = i_26_ + 32;
				i_31_ = i_5_;
				i_32_ = i_9_;
				i_33_ = i_13_;
			} else if (i_28_ == 15) {
				i_29_ = i_25_ + 96;
				i_30_ = i_26_ + 96;
				i_31_ = i_6_;
				i_32_ = i_10_;
				i_33_ = i_14_;
			} else {
				i_29_ = i_25_ + 32;
				i_30_ = i_26_ + 96;
				i_31_ = i_7_;
				i_32_ = i_11_;
				i_33_ = i_15_;
			}
			this.anIntArray459[i_27_] = i_29_;
			this.anIntArray455[i_27_] = i_31_;
			this.anIntArray469[i_27_] = i_30_;
			is_23_[i_27_] = i_32_;
			is_24_[i_27_] = i_33_;
		}
		final int[] is_34_ = anIntArrayArray475[i];
		final int i_35_ = is_34_.length / 4;
		this.anIntArray464 = new int[i_35_];
		this.anIntArray454 = new int[i_35_];
		this.anIntArray462 = new int[i_35_];
		this.anIntArray456 = new int[i_35_];
		this.anIntArray458 = new int[i_35_];
		this.anIntArray461 = new int[i_35_];
		if (i_1_ != -1) {
			this.anIntArray463 = new int[i_35_];
		}
		int i_36_ = 0;
		for (int i_37_ = 0; i_37_ < i_35_; i_37_++) {
			final int i_38_ = is_34_[i_36_];
			int i_39_ = is_34_[i_36_ + 1];
			int i_40_ = is_34_[i_36_ + 2];
			int var37 = is_34_[i_36_ + 3];
			i_36_ += 4;
			if (i_39_ < 4) {
				i_39_ = i_39_ - i_0_ & 0x3;
			}
			if (i_40_ < 4) {
				i_40_ = i_40_ - i_0_ & 0x3;
			}
			if (var37 < 4) {
				var37 = var37 - i_0_ & 0x3;
			}
			this.anIntArray464[i_37_] = i_39_;
			this.anIntArray454[i_37_] = i_40_;
			this.anIntArray462[i_37_] = var37;
			if (i_38_ == 0) {
				this.anIntArray456[i_37_] = is_23_[i_39_];
				this.anIntArray458[i_37_] = is_23_[i_40_];
				this.anIntArray461[i_37_] = is_23_[var37];
				if (this.anIntArray463 != null) {
					this.anIntArray463[i_37_] = -1;
				}
			} else {
				this.anIntArray456[i_37_] = is_24_[i_39_];
				this.anIntArray458[i_37_] = is_24_[i_40_];
				this.anIntArray461[i_37_] = is_24_[var37];
				if (this.anIntArray463 != null) {
					this.anIntArray463[i_37_] = i_1_;
				}
			}
		}
		int i_41_ = i_4_;
		int i_42_ = i_5_;
		if (i_5_ < i_4_) {
			i_41_ = i_5_;
		}
		if (i_5_ > i_5_) {
			i_42_ = i_5_;
		}
		if (i_6_ < i_41_) {
			i_41_ = i_6_;
		}
		if (i_6_ > i_42_) {
			i_42_ = i_6_;
		}
		if (i_7_ < i_41_) {
			i_41_ = i_7_;
		}
		if (i_7_ > i_42_) {
			i_42_ = i_7_;
		}
		i_41_ /= 14;
		i_42_ /= 14;
	}
}
