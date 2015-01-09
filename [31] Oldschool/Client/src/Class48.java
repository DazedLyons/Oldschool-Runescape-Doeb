/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class48 {
	static final int anInt600 = 1020;
	int anInt601;
	int anInt602;
	static final int anInt603 = 8;
	int[] anIntArray604;
	int anInt605;
	int anInt606;
	public static char aChar607;
	int[] anIntArray608;

	final void method366(final byte i) {
		try {
			int i_0_ = -1640531527;
			int i_1_ = -1640531527;
			int i_2_ = -1640531527;
			int i_3_ = -1640531527;
			int i_4_ = -1640531527;
			int i_5_ = -1640531527;
			int i_6_ = -1640531527;
			int i_7_ = -1640531527;
			for (int i_8_ = 0; i_8_ < 4; i_8_++) {
				if (i == 0) {
					throw new IllegalStateException();
				}
				i_7_ ^= i_6_ << 11;
				i_4_ += i_7_;
				i_6_ += i_5_;
				i_6_ ^= i_5_ >>> 2;
				i_3_ += i_6_;
				i_5_ += i_4_;
				i_5_ ^= i_4_ << 8;
				i_2_ += i_5_;
				i_4_ += i_3_;
				i_4_ ^= i_3_ >>> 16;
				i_1_ += i_4_;
				i_3_ += i_2_;
				i_3_ ^= i_2_ << 10;
				i_0_ += i_3_;
				i_2_ += i_1_;
				i_2_ ^= i_1_ >>> 4;
				i_7_ += i_2_;
				i_1_ += i_0_;
				i_1_ ^= i_0_ << 8;
				i_6_ += i_1_;
				i_0_ += i_7_;
				i_0_ ^= i_7_ >>> 9;
				i_5_ += i_0_;
				i_7_ += i_6_;
			}
			for (int i_9_ = 0; i_9_ < 256; i_9_ += 8) {
				i_7_ += this.anIntArray608[i_9_];
				i_6_ += this.anIntArray608[1 + i_9_];
				i_5_ += this.anIntArray608[i_9_ + 2];
				i_4_ += this.anIntArray608[3 + i_9_];
				i_3_ += this.anIntArray608[4 + i_9_];
				i_2_ += this.anIntArray608[i_9_ + 5];
				i_1_ += this.anIntArray608[i_9_ + 6];
				i_0_ += this.anIntArray608[7 + i_9_];
				i_7_ ^= i_6_ << 11;
				i_4_ += i_7_;
				i_6_ += i_5_;
				i_6_ ^= i_5_ >>> 2;
				i_3_ += i_6_;
				i_5_ += i_4_;
				i_5_ ^= i_4_ << 8;
				i_2_ += i_5_;
				i_4_ += i_3_;
				i_4_ ^= i_3_ >>> 16;
				i_1_ += i_4_;
				i_3_ += i_2_;
				i_3_ ^= i_2_ << 10;
				i_0_ += i_3_;
				i_2_ += i_1_;
				i_2_ ^= i_1_ >>> 4;
				i_7_ += i_2_;
				i_1_ += i_0_;
				i_1_ ^= i_0_ << 8;
				i_6_ += i_1_;
				i_0_ += i_7_;
				i_0_ ^= i_7_ >>> 9;
				i_5_ += i_0_;
				i_7_ += i_6_;
				this.anIntArray604[i_9_] = i_7_;
				this.anIntArray604[i_9_ + 1] = i_6_;
				this.anIntArray604[i_9_ + 2] = i_5_;
				this.anIntArray604[i_9_ + 3] = i_4_;
				this.anIntArray604[4 + i_9_] = i_3_;
				this.anIntArray604[5 + i_9_] = i_2_;
				this.anIntArray604[6 + i_9_] = i_1_;
				this.anIntArray604[i_9_ + 7] = i_0_;
			}
			for (int i_10_ = 0; i_10_ < 256; i_10_ += 8) {
				if (i == 0) {
					throw new IllegalStateException();
				}
				i_7_ += this.anIntArray604[i_10_];
				i_6_ += this.anIntArray604[i_10_ + 1];
				i_5_ += this.anIntArray604[2 + i_10_];
				i_4_ += this.anIntArray604[3 + i_10_];
				i_3_ += this.anIntArray604[4 + i_10_];
				i_2_ += this.anIntArray604[5 + i_10_];
				i_1_ += this.anIntArray604[6 + i_10_];
				i_0_ += this.anIntArray604[i_10_ + 7];
				i_7_ ^= i_6_ << 11;
				i_4_ += i_7_;
				i_6_ += i_5_;
				i_6_ ^= i_5_ >>> 2;
				i_3_ += i_6_;
				i_5_ += i_4_;
				i_5_ ^= i_4_ << 8;
				i_2_ += i_5_;
				i_4_ += i_3_;
				i_4_ ^= i_3_ >>> 16;
				i_1_ += i_4_;
				i_3_ += i_2_;
				i_3_ ^= i_2_ << 10;
				i_0_ += i_3_;
				i_2_ += i_1_;
				i_2_ ^= i_1_ >>> 4;
				i_7_ += i_2_;
				i_1_ += i_0_;
				i_1_ ^= i_0_ << 8;
				i_6_ += i_1_;
				i_0_ += i_7_;
				i_0_ ^= i_7_ >>> 9;
				i_5_ += i_0_;
				i_7_ += i_6_;
				this.anIntArray604[i_10_] = i_7_;
				this.anIntArray604[1 + i_10_] = i_6_;
				this.anIntArray604[i_10_ + 2] = i_5_;
				this.anIntArray604[i_10_ + 3] = i_4_;
				this.anIntArray604[4 + i_10_] = i_3_;
				this.anIntArray604[5 + i_10_] = i_2_;
				this.anIntArray604[6 + i_10_] = i_1_;
				this.anIntArray604[i_10_ + 7] = i_0_;
			}
			method368(684999943);
			this.anInt602 = -605335296;
		} catch (final RuntimeException var11) {
			throw Class102.method1086(var11, "dl.f()");
		}
	}

	final int method367(final int i) {
		int i_11_;
		try {
			if ((this.anInt602 -= 953936721) * -1025491535 + 1 == 0) {
				method368(-1068164233);
				this.anInt602 = -1559272017;
			}
			i_11_ = this.anIntArray608[-1025491535 * this.anInt602];
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dl.i()");
		}
		return i_11_;
	}

	final void method368(final int i) {
		try {
			this.anInt606 += (this.anInt601 += 2140742647) * -1109332547;
			for (int i_12_ = 0; i_12_ < 256; i_12_++) {
				final int i_13_ = this.anIntArray604[i_12_];
				if ((i_12_ & 0x2) == 0) {
					if (i >= 1142621617) {
						break;
					}
					if ((i_12_ & 0x1) == 0) {
						this.anInt605 = -179789863 * (-598478743 * this.anInt605 ^ -598478743 * this.anInt605 << 13);
					} else {
						this.anInt605 = -179789863 * (-598478743 * this.anInt605 ^ this.anInt605 * -598478743 >>> 6);
					}
				} else if ((i_12_ & 0x1) == 0) {
					this.anInt605 = (this.anInt605 * -598478743 ^ this.anInt605 * -598478743 << 2) * -179789863;
				} else {
					this.anInt605 = -179789863 * (-598478743 * this.anInt605 ^ -598478743 * this.anInt605 >>> 16);
				}
				this.anInt605 += -179789863 * this.anIntArray604[128 + i_12_ & 0xff];
				int i_14_;
				this.anIntArray604[i_12_] = i_14_ = 655308755 * this.anInt606 + this.anIntArray604[(i_13_ & 0x3fc) >> 2] + -598478743 * this.anInt605;
				this.anIntArray608[i_12_] = (this.anInt606 = (i_13_ + this.anIntArray604[(i_14_ >> 8 & 0x3fc) >> 2]) * -847562661) * 655308755;
			}
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "dl.w()");
		}
	}

	static String method369(final Class91_Sub18 class91_sub18, final byte i) {
		try {
			if (Class91_Sub20_Sub2.method736(Class17.method182(class91_sub18, -382233421), 1130129625) == 0) {
				if (i <= 0) {
					throw new IllegalStateException();
				}
				return null;
			}
			if (class91_sub18.aString2035 != null) {
				if (i <= 0) {
					throw new IllegalStateException();
				}
				if (class91_sub18.aString2035.trim().length() != 0) {
					return class91_sub18.aString2035;
				}
				if (i <= 0) {
					throw new IllegalStateException();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dl.dx()");
		}
		return null;
	}

	Class48(final int[] is) {
		try {
			this.anIntArray604 = new int[256];
			this.anIntArray608 = new int[256];
			for (int i = 0; i < is.length; i++) {
				this.anIntArray608[i] = is[i];
			}
			method366((byte) 52);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dl.<init>()");
		}
	}

	public static int method370(int i, int i_15_, final int i_16_) {
		int i_17_;
		try {
			int i_18_ = 1;
			for (/**/; i_15_ > 1; i_15_ >>= 1) {
				if ((i_15_ & 0x1) != 0) {
					i_18_ *= i;
				}
				i *= i;
			}
			if (1 == i_15_) {
				return i_18_ * i;
			}
			i_17_ = i_18_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dl.i()");
		}
		return i_17_;
	}
}
