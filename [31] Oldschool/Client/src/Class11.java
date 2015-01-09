/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11 {
	int[] anIntArray161;
	int anInt162;
	int anInt163;
	int[] anIntArray164;
	float[][] aFloatArrayArray165;
	int[] anIntArray166;

	Class11() {
		Class91_Sub4.method608(24);
		this.anInt163 = Class91_Sub4.method608(16);
		this.anInt162 = Class91_Sub4.method608(24);
		this.anIntArray166 = new int[this.anInt162];
		final boolean bool = Class91_Sub4.method616() != 0;
		if (bool) {
			int i = 0;
			int i_0_ = Class91_Sub4.method608(5) + 1;
			while (i < this.anInt162) {
				final int i_1_ = Class91_Sub4.method608(Class28.method265(this.anInt162 - i, -1018070115));
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
					this.anIntArray166[i++] = i_0_;
				}
				i_0_++;
			}
		} else {
			final boolean bool_3_ = Class91_Sub4.method616() != 0;
			for (int i = 0; i < this.anInt162; i++) {
				if (bool_3_ && Class91_Sub4.method616() == 0) {
					this.anIntArray166[i] = 0;
				} else {
					this.anIntArray166[i] = Class91_Sub4.method608(5) + 1;
				}
			}
		}
		method167();
		final int i = Class91_Sub4.method608(4);
		if (i > 0) {
			final float f = Class91_Sub4.method615(Class91_Sub4.method608(32));
			final float f_4_ = Class91_Sub4.method615(Class91_Sub4.method608(32));
			final int i_5_ = Class91_Sub4.method608(4) + 1;
			final boolean bool_6_ = Class91_Sub4.method616() != 0;
			int i_7_;
			if (i == 1) {
				i_7_ = method164(this.anInt162, this.anInt163);
			} else {
				i_7_ = this.anInt162 * this.anInt163;
			}
			this.anIntArray164 = new int[i_7_];
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
				this.anIntArray164[i_8_] = Class91_Sub4.method608(i_5_);
			}
			this.aFloatArrayArray165 = new float[this.anInt162][this.anInt163];
			if (i == 1) {
				for (int i_9_ = 0; i_9_ < this.anInt162; i_9_++) {
					float f_10_ = 0.0F;
					int i_11_ = 1;
					for (int i_12_ = 0; i_12_ < this.anInt163; i_12_++) {
						final int i_13_ = i_9_ / i_11_ % i_7_;
						final float f_14_ = this.anIntArray164[i_13_] * f_4_ + f + f_10_;
						this.aFloatArrayArray165[i_9_][i_12_] = f_14_;
						if (bool_6_) {
							f_10_ = f_14_;
						}
						i_11_ *= i_7_;
					}
				}
			} else {
				for (int i_15_ = 0; i_15_ < this.anInt162; i_15_++) {
					float f_16_ = 0.0F;
					int i_17_ = i_15_ * this.anInt163;
					for (int i_18_ = 0; i_18_ < this.anInt163; i_18_++) {
						final float f_19_ = this.anIntArray164[i_17_] * f_4_ + f + f_16_;
						this.aFloatArrayArray165[i_15_][i_18_] = f_19_;
						if (bool_6_) {
							f_16_ = f_19_;
						}
						i_17_++;
					}
				}
			}
		}
	}

	static int method164(final int i, final int i_20_) {
		int i_21_;
		for (i_21_ = (int) Math.pow(i, 1.0 / i_20_) + 1; Class48.method370(i_21_, i_20_, -851415850) > i; i_21_--) {
			/* empty */
		}
		return i_21_;
	}

	int method165() {
		int i;
		for (i = 0; this.anIntArray161[i] >= 0; i = Class91_Sub4.method616() != 0 ? this.anIntArray161[i] : i + 1) {
			/* empty */
		}
		return this.anIntArray161[i] ^ 0xffffffff;
	}

	float[] method166() {
		return this.aFloatArrayArray165[method165()];
	}

	void method167() {
		final int[] is = new int[this.anInt162];
		final int[] is_22_ = new int[33];
		for (int i = 0; i < this.anInt162; i++) {
			final int i_23_ = this.anIntArray166[i];
			if (i_23_ != 0) {
				final int i_24_ = 1 << 32 - i_23_;
				final int i_25_ = is_22_[i_23_];
				is[i] = i_25_;
				int i_26_;
				if ((i_25_ & i_24_) != 0) {
					i_26_ = is_22_[i_23_ - 1];
				} else {
					i_26_ = i_25_ | i_24_;
					for (int i_27_ = i_23_ - 1; i_27_ >= 1; i_27_--) {
						final int i_28_ = is_22_[i_27_];
						if (i_28_ != i_25_) {
							break;
						}
						final int i_29_ = 1 << 32 - i_27_;
						if ((i_28_ & i_29_) != 0) {
							is_22_[i_27_] = is_22_[i_27_ - 1];
							break;
						}
						is_22_[i_27_] = i_28_ | i_29_;
					}
				}
				is_22_[i_23_] = i_26_;
				for (int i_30_ = i_23_ + 1; i_30_ <= 32; i_30_++) {
					final int i_31_ = is_22_[i_30_];
					if (i_31_ == i_25_) {
						is_22_[i_30_] = i_26_;
					}
				}
			}
		}
		this.anIntArray161 = new int[8];
		int i = 0;
		for (int i_32_ = 0; i_32_ < this.anInt162; i_32_++) {
			final int i_33_ = this.anIntArray166[i_32_];
			if (i_33_ != 0) {
				final int i_34_ = is[i_32_];
				int i_35_ = 0;
				for (int i_36_ = 0; i_36_ < i_33_; i_36_++) {
					int i_37_ = -2147483648 >>> i_36_;
					if ((i_34_ & i_37_) != 0) {
						if (this.anIntArray161[i_35_] == 0) {
							this.anIntArray161[i_35_] = i;
						}
						i_35_ = this.anIntArray161[i_35_];
					} else {
						i_35_++;
					}
					if (i_35_ >= this.anIntArray161.length) {
						final int[] var12 = new int[this.anIntArray161.length * 2];
						for (int i_38_ = 0; i_38_ < this.anIntArray161.length; i_38_++) {
							var12[i_38_] = this.anIntArray161[i_38_];
						}
						this.anIntArray161 = var12;
					}
					i_37_ >>>= 1;
				}
				this.anIntArray161[i_35_] = i_32_ ^ 0xffffffff;
				if (i_35_ >= i) {
					i = i_35_ + 1;
				}
			}
		}
	}
}
