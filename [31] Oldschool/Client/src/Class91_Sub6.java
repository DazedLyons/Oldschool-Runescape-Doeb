/* Class91_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub6 extends Class91 {
	static final int anInt1808 = 1;
	boolean aBoolean1809 = false;
	static final int anInt1810 = 0;
	int anInt1811;
	int anInt1812;
	boolean aBoolean1813;
	int[] anIntArray1814;
	int[] anIntArray1815;
	int[] anIntArray1816;
	int[] anIntArray1817;
	int anInt1818;
	static final int anInt1819 = 3;
	int[] anIntArray1820;
	static final int anInt1821 = 2;
	static int[] anIntArray1822;

	Class91_Sub6(final ByteBuffer class91_sub9) {
		this.anInt1812 = class91_sub9.method686((byte) -85);
		this.aBoolean1813 = class91_sub9.readUnsignedByte() == 1;
		final int i = class91_sub9.readUnsignedByte();
		if (i >= 1 && i <= 4) {
			this.anIntArray1814 = new int[i];
			for (int i_0_ = 0; i_0_ < i; i_0_++) {
				this.anIntArray1814[i_0_] = class91_sub9.method686((byte) -100);
			}
			if (i > 1) {
				this.anIntArray1815 = new int[i - 1];
				for (int i_1_ = 0; i_1_ < i - 1; i_1_++) {
					this.anIntArray1815[i_1_] = class91_sub9.readUnsignedByte();
				}
			}
			if (i > 1) {
				this.anIntArray1816 = new int[i - 1];
				for (int i_2_ = 0; i_2_ < i - 1; i_2_++) {
					this.anIntArray1816[i_2_] = class91_sub9.readUnsignedByte();
				}
			}
			this.anIntArray1817 = new int[i];
			for (int i_3_ = 0; i_3_ < i; i_3_++) {
				this.anIntArray1817[i_3_] = class91_sub9.readDword();
			}
			this.anInt1818 = class91_sub9.readUnsignedByte();
			this.anInt1811 = class91_sub9.readUnsignedByte();
			this.anIntArray1820 = null;
		} else {
			throw new RuntimeException();
		}
	}

	void method620(final int i) {
		if (this.anIntArray1820 != null) {
			if (this.anInt1818 == 1 || this.anInt1818 == 3) {
				if (anIntArray1822 == null || anIntArray1822.length < this.anIntArray1820.length) {
					anIntArray1822 = new int[this.anIntArray1820.length];
				}
				int i_4_;
				if (this.anIntArray1820.length == 4096) {
					i_4_ = 64;
				} else {
					i_4_ = 128;
				}
				final int i_5_ = this.anIntArray1820.length;
				int i_6_ = i_4_ * i * this.anInt1811;
				final int i_7_ = i_5_ - 1;
				if (this.anInt1818 == 1) {
					i_6_ = -i_6_;
				}
				for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
					final int i_9_ = i_8_ + i_6_ & i_7_;
					anIntArray1822[i_8_] = this.anIntArray1820[i_9_];
				}
				final int[] is = this.anIntArray1820;
				this.anIntArray1820 = anIntArray1822;
				anIntArray1822 = is;
			}
			if (this.anInt1818 == 2 || this.anInt1818 == 4) {
				if (anIntArray1822 == null || anIntArray1822.length < this.anIntArray1820.length) {
					anIntArray1822 = new int[this.anIntArray1820.length];
				}
				int i_10_;
				if (this.anIntArray1820.length == 4096) {
					i_10_ = 64;
				} else {
					i_10_ = 128;
				}
				final int i_11_ = this.anIntArray1820.length;
				int i_12_ = i * this.anInt1811;
				final int i_13_ = i_10_ - 1;
				if (this.anInt1818 == 2) {
					i_12_ = -i_12_;
				}
				for (int i_14_ = 0; i_14_ < i_11_; i_14_ += i_10_) {
					for (int i_15_ = 0; i_15_ < i_10_; i_15_++) {
						final int i_16_ = i_14_ + i_15_;
						final int i_17_ = i_14_ + (i_15_ + i_12_ & i_13_);
						anIntArray1822[i_16_] = this.anIntArray1820[i_17_];
					}
				}
				final int[] is = this.anIntArray1820;
				this.anIntArray1820 = anIntArray1822;
				anIntArray1822 = is;
			}
		}
	}

	boolean method621(final double d, final int i, final Js5 class63) {
		for (final int element : this.anIntArray1814) {
			if (class63.method414(element, 1830488475) == null) {
				return false;
			}
		}
		final int i_19_ = i * i;
		this.anIntArray1820 = new int[i_19_];
		for (int i_20_ = 0; i_20_ < this.anIntArray1814.length; i_20_++) {
			final Class91_Sub20_Sub13_Sub1 class91_sub20_sub13_sub1 = Class104.method1094(class63, this.anIntArray1814[i_20_], 230277735);
			class91_sub20_sub13_sub1.method837();
			final byte[] is = class91_sub20_sub13_sub1.aByteArray2520;
			final int[] is_21_ = class91_sub20_sub13_sub1.anIntArray2515;
			final int i_22_ = this.anIntArray1817[i_20_];
			if ((i_22_ & ~0xffffff) != 16777216) {
				/* empty */
			}
			if ((i_22_ & ~0xffffff) != 33554432) {
				/* empty */
			}
			if ((i_22_ & ~0xffffff) == 50331648) {
				final int i_23_ = i_22_ & 0xff00ff;
				final int i_24_ = i_22_ >> 8 & 0xff;
				for (int i_25_ = 0; i_25_ < is_21_.length; i_25_++) {
					int var14 = is_21_[i_25_];
					if ((var14 & 0xffff) == var14 >> 8) {
						var14 &= 0xff;
						is_21_[i_25_] = i_23_ * var14 >> 8 & 0xff00ff | i_24_ * var14 & 0xff00;
					}
				}
			}
			for (int i_26_ = 0; i_26_ < is_21_.length; i_26_++) {
				is_21_[i_26_] = Class91_Sub20_Sub13_Sub2.method851(is_21_[i_26_], d);
			}
			int i_27_;
			if (i_20_ == 0) {
				i_27_ = 0;
			} else {
				i_27_ = this.anIntArray1815[i_20_ - 1];
			}
			if (i_20_ != 0) {
				/* empty */
			}
			if (i_27_ == 0) {
				if (class91_sub20_sub13_sub1.anInt2517 == i) {
					for (int i_28_ = 0; i_28_ < i_19_; i_28_++) {
						this.anIntArray1820[i_28_] = is_21_[is[i_28_] & 0xff];
					}
				} else if (class91_sub20_sub13_sub1.anInt2517 == 64 && i == 128) {
					int i_29_ = 0;
					for (int i_30_ = 0; i_30_ < i; i_30_++) {
						for (int var14 = 0; var14 < i; var14++) {
							this.anIntArray1820[i_29_++] = is_21_[is[(var14 >> 1) + (i_30_ >> 1 << 6)] & 0xff];
						}
					}
				} else {
					if (class91_sub20_sub13_sub1.anInt2517 != 128 || i != 64) {
						throw new RuntimeException();
					}
					int i_31_ = 0;
					for (int i_32_ = 0; i_32_ < i; i_32_++) {
						for (int var14 = 0; var14 < i; var14++) {
							this.anIntArray1820[i_31_++] = is_21_[is[(var14 << 1) + (i_32_ << 1 << 7)] & 0xff];
						}
					}
				}
			}
			if (i_27_ != 1) {
				/* empty */
			}
			if (i_27_ != 2) {
				/* empty */
			}
			if (i_27_ != 3) {
				/* empty */
			}
		}
		return true;
	}

	void method622() {
		this.anIntArray1820 = null;
	}
}
