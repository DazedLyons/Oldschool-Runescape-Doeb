/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class10 {
	int anInt154 = Class91_Sub4.method608(24) + 1;
	int anInt155 = Class91_Sub4.method608(6) + 1;
	int anInt156 = Class91_Sub4.method608(24);
	int anInt157 = Class91_Sub4.method608(24);
	int anInt158 = Class91_Sub4.method608(16);
	int anInt159 = Class91_Sub4.method608(8);
	int[] anIntArray160;

	Class10() {
		final int[] is = new int[this.anInt155];
		for (int i = 0; i < this.anInt155; i++) {
			int i_0_ = 0;
			final int i_1_ = Class91_Sub4.method608(3);
			final boolean bool = Class91_Sub4.method616() != 0;
			if (bool) {
				i_0_ = Class91_Sub4.method608(5);
			}
			is[i] = i_0_ << 3 | i_1_;
		}
		this.anIntArray160 = new int[this.anInt155 * 8];
		for (int i = 0; i < this.anInt155 * 8; i++) {
			this.anIntArray160[i] = (is[i >> 3] & 1 << (i & 0x7)) != 0 ? Class91_Sub4.method608(8) : -1;
		}
	}

	void method163(final float[] fs, final int i, final boolean bool) {
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			fs[i_2_] = 0.0F;
		}
		if (!bool) {
			final int i_3_ = Class91_Sub4.aClass11Array1770[this.anInt159].anInt163;
			final int i_4_ = this.anInt156 - this.anInt157;
			final int i_5_ = i_4_ / this.anInt154;
			final int[] is = new int[i_5_];
			for (int i_6_ = 0; i_6_ < 8; i_6_++) {
				int i_7_ = 0;
				while (i_7_ < i_5_) {
					if (i_6_ == 0) {
						int i_8_ = Class91_Sub4.aClass11Array1770[this.anInt159].method165();
						for (int i_9_ = i_3_ - 1; i_9_ >= 0; i_9_--) {
							if (i_7_ + i_9_ < i_5_) {
								is[i_7_ + i_9_] = i_8_ % this.anInt155;
							}
							i_8_ /= this.anInt155;
						}
					}
					for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
						final int i_11_ = is[i_7_];
						final int i_12_ = this.anIntArray160[i_11_ * 8 + i_6_];
						if (i_12_ >= 0) {
							final int i_13_ = this.anInt157 + i_7_ * this.anInt154;
							final Class11 class11 = Class91_Sub4.aClass11Array1770[i_12_];
							if (this.anInt158 == 0) {
								final int i_14_ = this.anInt154 / class11.anInt163;
								for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
									final float[] fs_16_ = class11.method166();
									for (int i_17_ = 0; i_17_ < class11.anInt163; i_17_++) {
										fs[i_13_ + i_15_ + i_17_ * i_14_] += fs_16_[i_17_];
									}
								}
							} else {
								int i_18_ = 0;
								while (i_18_ < this.anInt154) {
									final float[] fs_19_ = class11.method166();
									for (int var17 = 0; var17 < class11.anInt163; var17++) {
										fs[i_13_ + i_18_] += fs_19_[var17];
										i_18_++;
									}
								}
							}
						}
						if (++i_7_ >= i_5_) {
							break;
						}
					}
				}
			}
		}
	}
}
