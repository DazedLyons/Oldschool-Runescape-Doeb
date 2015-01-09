/* Class91_Sub20_Sub13_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class91_Sub20_Sub13_Sub1 extends Class91_Sub20_Sub13 {
	public int[] anIntArray2515;
	public int anInt2516;
	public int anInt2517;
	public int anInt2518;
	public int anInt2519;
	public byte[] aByteArray2520;
	public int anInt2521;
	public int anInt2522;

	public void method837() {
		if (anInt2517 != anInt2521 || anInt2519 != anInt2522) {
			final byte[] is = new byte[anInt2521 * anInt2522];
			int i = 0;
			for (int i_0_ = 0; i_0_ < anInt2519; i_0_++) {
				for (int i_1_ = 0; i_1_ < anInt2517; i_1_++) {
					is[i_1_ + anInt2518 + (i_0_ + anInt2516) * anInt2521] = aByteArray2520[i++];
				}
			}
			aByteArray2520 = is;
			anInt2517 = anInt2521;
			anInt2519 = anInt2522;
			anInt2518 = 0;
			anInt2516 = 0;
		}
	}

	public void method838(final int i, final int i_2_, final int i_3_) {
		for (int i_4_ = 0; i_4_ < anIntArray2515.length; i_4_++) {
			int i_5_ = anIntArray2515[i_4_] >> 16 & 0xff;
			i_5_ += i;
			if (i_5_ < 0) {
				i_5_ = 0;
			} else if (i_5_ > 255) {
				i_5_ = 255;
			}
			int i_6_ = anIntArray2515[i_4_] >> 8 & 0xff;
			i_6_ += i_2_;
			if (i_6_ < 0) {
				i_6_ = 0;
			} else if (i_6_ > 255) {
				i_6_ = 255;
			}
			int i_7_ = anIntArray2515[i_4_] & 0xff;
			i_7_ += i_3_;
			if (i_7_ < 0) {
				i_7_ = 0;
			} else if (i_7_ > 255) {
				i_7_ = 255;
			}
			anIntArray2515[i_4_] = (i_5_ << 16) + (i_6_ << 8) + i_7_;
		}
	}

	static void method839(final int[] is, final byte[] is_8_, final int[] is_9_, int i, int i_10_, int i_11_, final int i_12_, final int i_13_, final int i_14_) {
		final int i_15_ = -(i_11_ >> 2);
		i_11_ = -(i_11_ & 0x3);
		for (int i_16_ = -i_12_; i_16_ < 0; i_16_++) {
			for (int i_17_ = i_15_; i_17_ < 0; i_17_++) {
				byte var12 = is_8_[i++];
				if (var12 != 0) {
					is[i_10_++] = is_9_[var12 & 0xff];
				} else {
					i_10_++;
				}
				var12 = is_8_[i++];
				if (var12 != 0) {
					is[i_10_++] = is_9_[var12 & 0xff];
				} else {
					i_10_++;
				}
				var12 = is_8_[i++];
				if (var12 != 0) {
					is[i_10_++] = is_9_[var12 & 0xff];
				} else {
					i_10_++;
				}
				var12 = is_8_[i++];
				if (var12 != 0) {
					is[i_10_++] = is_9_[var12 & 0xff];
				} else {
					i_10_++;
				}
			}
			for (int i_18_ = i_11_; i_18_ < 0; i_18_++) {
				final byte var12 = is_8_[i++];
				if (var12 != 0) {
					is[i_10_++] = is_9_[var12 & 0xff];
				} else {
					i_10_++;
				}
			}
			i_10_ += i_13_;
			i += i_14_;
		}
	}

	Class91_Sub20_Sub13_Sub1() {
		/* empty */
	}

	public void method840(int i, int i_19_) {
		i += anInt2518;
		i_19_ += anInt2516;
		int i_20_ = i + i_19_ * anInt2483;
		int i_21_ = 0;
		int i_22_ = anInt2519;
		int i_23_ = anInt2517;
		int i_24_ = anInt2483 - i_23_;
		int i_25_ = 0;
		if (i_19_ < anInt2484) {
			final int var9 = anInt2484 - i_19_;
			i_22_ -= var9;
			i_19_ = anInt2484;
			i_21_ += var9 * i_23_;
			i_20_ += var9 * anInt2483;
		}
		if (i_19_ + i_22_ > anInt2480) {
			i_22_ -= i_19_ + i_22_ - anInt2480;
		}
		if (i < anInt2485) {
			final int var9 = anInt2485 - i;
			i_23_ -= var9;
			i = anInt2485;
			i_21_ += var9;
			i_20_ += var9;
			i_25_ += var9;
			i_24_ += var9;
		}
		if (i + i_23_ > anInt2486) {
			final int var9 = i + i_23_ - anInt2486;
			i_23_ -= var9;
			i_25_ += var9;
			i_24_ += var9;
		}
		if (i_23_ > 0 && i_22_ > 0) {
			method839(anIntArray2481, aByteArray2520, anIntArray2515, i_21_, i_20_, i_23_, i_22_, i_24_, i_25_);
		}
	}
}
