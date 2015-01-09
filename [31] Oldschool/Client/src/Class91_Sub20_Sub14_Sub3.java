/* Class91_Sub20_Sub14_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub20_Sub14_Sub3 extends Class91_Sub20_Sub14 {
	int[] anIntArray2687;
	static byte[] aByteArray2688 = new byte[1];
	static Class91_Sub20_Sub14_Sub3 aClass91_Sub20_Sub14_Sub3_2689 = new Class91_Sub20_Sub14_Sub3();
	int anInt2690;
	static int[] anIntArray2691 = Class91_Sub20_Sub13_Sub2.anIntArray2546;
	int[] anIntArray2692;
	int[] anIntArray2693;
	int[] anIntArray2694;
	int anInt2695 = 0;
	int[][] anIntArrayArray2696;
	static int anInt2697;
	int anInt2698 = 0;
	static final int anInt2699 = 4096;
	int[] anIntArray2700;
	int[] anIntArray2701;
	public static int anInt2702 = 0;
	byte[] aByteArray2703;
	byte[] aByteArray2704;
	short[] aShortArray2705;
	int[] anIntArray2706;
	static boolean[] aBooleanArray2707 = new boolean[4096];
	static byte[] aByteArray2708 = new byte[1];
	int[] anIntArray2709;
	int[] anIntArray2710;
	int[][] anIntArrayArray2711;
	static int[] anIntArray2712 = new int[4096];
	public boolean aBoolean2713 = false;
	int anInt2714;
	int anInt2715;
	int anInt2716;
	int[] anIntArray2717;
	int anInt2718;
	int[] anIntArray2719;
	static int[] anIntArray2720 = new int[10];
	static boolean[] aBooleanArray2721 = new boolean[4096];
	static int[] anIntArray2722 = Class91_Sub20_Sub13_Sub2.anIntArray2547;
	static int[] anIntArray2723 = new int[4096];
	static Class91_Sub20_Sub14_Sub3 aClass91_Sub20_Sub14_Sub3_2724 = new Class91_Sub20_Sub14_Sub3();
	static int[] anIntArray2725 = new int[4096];
	static int[] anIntArray2726 = new int[4096];
	static int[] anIntArray2727 = new int[4096];
	static final int anInt2728 = 1600;
	static int[] anIntArray2729 = new int[1600];
	static int[][] anIntArrayArray2730 = new int[1600][512];
	static int[] anIntArray2731 = new int[12];
	static int[][] anIntArrayArray2732 = new int[12][2000];
	byte[] aByteArray2733;
	static int[] anIntArray2734 = new int[2000];
	static int[] anIntArray2735 = new int[12];
	static int[] anIntArray2736 = new int[10];
	static int[] anIntArray2737 = new int[10];
	int[] anIntArray2738;
	int anInt2739 = 0;
	static int anInt2740;
	static int[] anIntArray2741 = new int[2000];
	public static boolean aBoolean2742 = false;
	byte aByte2743 = 0;
	public static int anInt2744 = 0;
	public static int anInt2745 = 0;
	public static int[] anIntArray2746 = new int[1000];
	static int anInt2747;
	static int[] anIntArray2748 = new int[4096];
	static int[] anIntArray2749 = Class91_Sub20_Sub13_Sub2.anIntArray2543;
	static int[] anIntArray2750 = Class91_Sub20_Sub13_Sub2.anIntArray2545;
	static final int anInt2751 = 9;
	static final int anInt2752 = 50;
	static final int anInt2753 = 3500;

	public Class91_Sub20_Sub14_Sub3 method970(final int[][] is, final int i, final int i_0_, final int i_1_, final boolean bool, final int i_2_) {
		method974();
		int i_3_ = i - this.anInt2716;
		int i_4_ = i + this.anInt2716;
		int i_5_ = i_1_ - this.anInt2716;
		int i_6_ = i_1_ + this.anInt2716;
		if (i_3_ >= 0 && i_4_ + 128 >> 7 < is.length && i_5_ >= 0 && i_6_ + 128 >> 7 < is[0].length) {
			i_3_ >>= 7;
			i_4_ = i_4_ + 127 >> 7;
			i_5_ >>= 7;
			i_6_ = i_6_ + 127 >> 7;
			if (is[i_3_][i_5_] == i_0_ && is[i_4_][i_5_] == i_0_ && is[i_3_][i_6_] == i_0_ && is[i_4_][i_6_] == i_0_) {
				return this;
			}
			Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_7_;
			if (bool) {
				class91_sub20_sub14_sub3_7_ = new Class91_Sub20_Sub14_Sub3();
				class91_sub20_sub14_sub3_7_.anInt2698 = this.anInt2698;
				class91_sub20_sub14_sub3_7_.anInt2695 = this.anInt2695;
				class91_sub20_sub14_sub3_7_.anInt2739 = this.anInt2739;
				class91_sub20_sub14_sub3_7_.anIntArray2692 = this.anIntArray2692;
				class91_sub20_sub14_sub3_7_.anIntArray2694 = this.anIntArray2694;
				class91_sub20_sub14_sub3_7_.anIntArray2719 = this.anIntArray2719;
				class91_sub20_sub14_sub3_7_.anIntArray2706 = this.anIntArray2706;
				class91_sub20_sub14_sub3_7_.anIntArray2687 = this.anIntArray2687;
				class91_sub20_sub14_sub3_7_.anIntArray2738 = this.anIntArray2738;
				class91_sub20_sub14_sub3_7_.anIntArray2700 = this.anIntArray2700;
				class91_sub20_sub14_sub3_7_.anIntArray2701 = this.anIntArray2701;
				class91_sub20_sub14_sub3_7_.aByteArray2733 = this.aByteArray2733;
				class91_sub20_sub14_sub3_7_.aByteArray2703 = this.aByteArray2703;
				class91_sub20_sub14_sub3_7_.aByteArray2704 = this.aByteArray2704;
				class91_sub20_sub14_sub3_7_.aShortArray2705 = this.aShortArray2705;
				class91_sub20_sub14_sub3_7_.aByte2743 = this.aByte2743;
				class91_sub20_sub14_sub3_7_.anIntArray2717 = this.anIntArray2717;
				class91_sub20_sub14_sub3_7_.anIntArray2709 = this.anIntArray2709;
				class91_sub20_sub14_sub3_7_.anIntArray2710 = this.anIntArray2710;
				class91_sub20_sub14_sub3_7_.anIntArrayArray2711 = this.anIntArrayArray2711;
				class91_sub20_sub14_sub3_7_.anIntArrayArray2696 = this.anIntArrayArray2696;
				class91_sub20_sub14_sub3_7_.aBoolean2713 = aBoolean2713;
				class91_sub20_sub14_sub3_7_.anIntArray2693 = new int[class91_sub20_sub14_sub3_7_.anInt2698];
			} else {
				class91_sub20_sub14_sub3_7_ = this;
			}
			if (i_2_ == 0) {
				for (int i_8_ = 0; i_8_ < class91_sub20_sub14_sub3_7_.anInt2698; i_8_++) {
					final int i_9_ = this.anIntArray2692[i_8_] + i;
					final int i_10_ = this.anIntArray2694[i_8_] + i_1_;
					final int i_11_ = i_9_ & 0x7f;
					final int i_12_ = i_10_ & 0x7f;
					final int i_13_ = i_9_ >> 7;
					final int i_14_ = i_10_ >> 7;
					final int i_15_ = is[i_13_][i_14_] * (128 - i_11_) + is[i_13_ + 1][i_14_] * i_11_ >> 7;
					final int i_16_ = is[i_13_][i_14_ + 1] * (128 - i_11_) + is[i_13_ + 1][i_14_ + 1] * i_11_ >> 7;
					final int i_17_ = i_15_ * (128 - i_12_) + i_16_ * i_12_ >> 7;
					class91_sub20_sub14_sub3_7_.anIntArray2693[i_8_] = this.anIntArray2693[i_8_] + i_17_ - i_0_;
				}
			} else {
				for (int i_18_ = 0; i_18_ < class91_sub20_sub14_sub3_7_.anInt2698; i_18_++) {
					final int i_19_ = (-this.anIntArray2693[i_18_] << 16) / (anInt2488 * 1142621617);
					if (i_19_ < i_2_) {
						final int i_20_ = this.anIntArray2692[i_18_] + i;
						final int i_21_ = this.anIntArray2694[i_18_] + i_1_;
						final int i_22_ = i_20_ & 0x7f;
						final int i_23_ = i_21_ & 0x7f;
						final int i_24_ = i_20_ >> 7;
						final int i_25_ = i_21_ >> 7;
						final int i_26_ = is[i_24_][i_25_] * (128 - i_22_) + is[i_24_ + 1][i_25_] * i_22_ >> 7;
						final int i_27_ = is[i_24_][i_25_ + 1] * (128 - i_22_) + is[i_24_ + 1][i_25_ + 1] * i_22_ >> 7;
						final int var22 = i_26_ * (128 - i_23_) + i_27_ * i_23_ >> 7;
						class91_sub20_sub14_sub3_7_.anIntArray2693[i_18_] = this.anIntArray2693[i_18_] + (var22 - i_0_) * (i_2_ - i_19_) / i_2_;
					}
				}
			}
			class91_sub20_sub14_sub3_7_.anInt2714 = 0;
			return class91_sub20_sub14_sub3_7_;
		}
		return this;
	}

	public Class91_Sub20_Sub14_Sub3 method971(final boolean bool) {
		if (!bool && aByteArray2688.length < this.anInt2695) {
			aByteArray2688 = new byte[this.anInt2695 + 100];
		}
		return method973(bool, aClass91_Sub20_Sub14_Sub3_2724, aByteArray2688);
	}

	void method972(final int i, final int[] is, final int i_28_, final int i_29_, final int i_30_) {
		final int i_31_ = is.length;
		if (i == 0) {
			int i_32_ = 0;
			anInt2747 = 0;
			anInt2740 = 0;
			anInt2697 = 0;
			for (int i_33_ = 0; i_33_ < i_31_; i_33_++) {
				final int i_34_ = is[i_33_];
				if (i_34_ < this.anIntArrayArray2711.length) {
					final int[] is_35_ = this.anIntArrayArray2711[i_34_];
					for (final int i_37_ : is_35_) {
						anInt2747 += this.anIntArray2692[i_37_];
						anInt2740 += this.anIntArray2693[i_37_];
						anInt2697 += this.anIntArray2694[i_37_];
						i_32_++;
					}
				}
			}
			if (i_32_ > 0) {
				anInt2747 = anInt2747 / i_32_ + i_28_;
				anInt2740 = anInt2740 / i_32_ + i_29_;
				anInt2697 = anInt2697 / i_32_ + i_30_;
			} else {
				anInt2747 = i_28_;
				anInt2740 = i_29_;
				anInt2697 = i_30_;
			}
		} else if (i == 1) {
			for (int i_38_ = 0; i_38_ < i_31_; i_38_++) {
				final int i_39_ = is[i_38_];
				if (i_39_ < this.anIntArrayArray2711.length) {
					final int[] is_40_ = this.anIntArrayArray2711[i_39_];
					for (final int element : is_40_) {
						final int i_42_ = element;
						this.anIntArray2692[i_42_] += i_28_;
						this.anIntArray2693[i_42_] += i_29_;
						this.anIntArray2694[i_42_] += i_30_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_43_ = 0; i_43_ < i_31_; i_43_++) {
				final int i_44_ = is[i_43_];
				if (i_44_ < this.anIntArrayArray2711.length) {
					final int[] is_45_ = this.anIntArrayArray2711[i_44_];
					for (final int element : is_45_) {
						final int i_47_ = element;
						this.anIntArray2692[i_47_] -= anInt2747;
						this.anIntArray2693[i_47_] -= anInt2740;
						this.anIntArray2694[i_47_] -= anInt2697;
						final int i_48_ = (i_28_ & 0xff) * 8;
						final int i_49_ = (i_29_ & 0xff) * 8;
						final int i_50_ = (i_30_ & 0xff) * 8;
						if (i_50_ != 0) {
							final int i_51_ = anIntArray2691[i_50_];
							final int var16 = anIntArray2722[i_50_];
							final int i_52_ = this.anIntArray2693[i_47_] * i_51_ + this.anIntArray2692[i_47_] * var16 >> 16;
							this.anIntArray2693[i_47_] = this.anIntArray2693[i_47_] * var16 - this.anIntArray2692[i_47_] * i_51_ >> 16;
							this.anIntArray2692[i_47_] = i_52_;
						}
						if (i_48_ != 0) {
							final int i_53_ = anIntArray2691[i_48_];
							final int var16 = anIntArray2722[i_48_];
							final int i_54_ = this.anIntArray2693[i_47_] * var16 - this.anIntArray2694[i_47_] * i_53_ >> 16;
							this.anIntArray2694[i_47_] = this.anIntArray2693[i_47_] * i_53_ + this.anIntArray2694[i_47_] * var16 >> 16;
							this.anIntArray2693[i_47_] = i_54_;
						}
						if (i_49_ != 0) {
							final int i_55_ = anIntArray2691[i_49_];
							final int var16 = anIntArray2722[i_49_];
							final int i_56_ = this.anIntArray2694[i_47_] * i_55_ + this.anIntArray2692[i_47_] * var16 >> 16;
							this.anIntArray2694[i_47_] = this.anIntArray2694[i_47_] * var16 - this.anIntArray2692[i_47_] * i_55_ >> 16;
							this.anIntArray2692[i_47_] = i_56_;
						}
						this.anIntArray2692[i_47_] += anInt2747;
						this.anIntArray2693[i_47_] += anInt2740;
						this.anIntArray2694[i_47_] += anInt2697;
					}
				}
			}
		} else if (i == 3) {
			for (int i_57_ = 0; i_57_ < i_31_; i_57_++) {
				final int i_58_ = is[i_57_];
				if (i_58_ < this.anIntArrayArray2711.length) {
					final int[] is_59_ = this.anIntArrayArray2711[i_58_];
					for (final int element : is_59_) {
						final int i_61_ = element;
						this.anIntArray2692[i_61_] -= anInt2747;
						this.anIntArray2693[i_61_] -= anInt2740;
						this.anIntArray2694[i_61_] -= anInt2697;
						this.anIntArray2692[i_61_] = this.anIntArray2692[i_61_] * i_28_ / 128;
						this.anIntArray2693[i_61_] = this.anIntArray2693[i_61_] * i_29_ / 128;
						this.anIntArray2694[i_61_] = this.anIntArray2694[i_61_] * i_30_ / 128;
						this.anIntArray2692[i_61_] += anInt2747;
						this.anIntArray2693[i_61_] += anInt2740;
						this.anIntArray2694[i_61_] += anInt2697;
					}
				}
			}
		} else if (i == 5 && this.anIntArrayArray2696 != null && this.aByteArray2703 != null) {
			for (int i_62_ = 0; i_62_ < i_31_; i_62_++) {
				final int i_63_ = is[i_62_];
				if (i_63_ < this.anIntArrayArray2696.length) {
					final int[] is_64_ = this.anIntArrayArray2696[i_63_];
					for (final int element : is_64_) {
						final int i_66_ = element;
						int i_67_ = (this.aByteArray2703[i_66_] & 0xff) + i_28_ * 8;
						if (i_67_ < 0) {
							i_67_ = 0;
						} else if (i_67_ > 255) {
							i_67_ = 255;
						}
						this.aByteArray2703[i_66_] = (byte) i_67_;
					}
				}
			}
		}
	}

	Class91_Sub20_Sub14_Sub3 method973(final boolean bool, final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_68_, final byte[] is) {
		class91_sub20_sub14_sub3_68_.anInt2698 = this.anInt2698;
		class91_sub20_sub14_sub3_68_.anInt2695 = this.anInt2695;
		class91_sub20_sub14_sub3_68_.anInt2739 = this.anInt2739;
		if (class91_sub20_sub14_sub3_68_.anIntArray2692 == null || class91_sub20_sub14_sub3_68_.anIntArray2692.length < this.anInt2698) {
			class91_sub20_sub14_sub3_68_.anIntArray2692 = new int[this.anInt2698 + 100];
			class91_sub20_sub14_sub3_68_.anIntArray2693 = new int[this.anInt2698 + 100];
			class91_sub20_sub14_sub3_68_.anIntArray2694 = new int[this.anInt2698 + 100];
		}
		for (int i = 0; i < this.anInt2698; i++) {
			class91_sub20_sub14_sub3_68_.anIntArray2692[i] = this.anIntArray2692[i];
			class91_sub20_sub14_sub3_68_.anIntArray2693[i] = this.anIntArray2693[i];
			class91_sub20_sub14_sub3_68_.anIntArray2694[i] = this.anIntArray2694[i];
		}
		if (bool) {
			class91_sub20_sub14_sub3_68_.aByteArray2703 = this.aByteArray2703;
		} else {
			class91_sub20_sub14_sub3_68_.aByteArray2703 = is;
			if (this.aByteArray2703 == null) {
				for (int i = 0; i < this.anInt2695; i++) {
					class91_sub20_sub14_sub3_68_.aByteArray2703[i] = (byte) 0;
				}
			} else {
				for (int i = 0; i < this.anInt2695; i++) {
					class91_sub20_sub14_sub3_68_.aByteArray2703[i] = this.aByteArray2703[i];
				}
			}
		}
		class91_sub20_sub14_sub3_68_.anIntArray2719 = this.anIntArray2719;
		class91_sub20_sub14_sub3_68_.anIntArray2706 = this.anIntArray2706;
		class91_sub20_sub14_sub3_68_.anIntArray2687 = this.anIntArray2687;
		class91_sub20_sub14_sub3_68_.anIntArray2738 = this.anIntArray2738;
		class91_sub20_sub14_sub3_68_.anIntArray2700 = this.anIntArray2700;
		class91_sub20_sub14_sub3_68_.anIntArray2701 = this.anIntArray2701;
		class91_sub20_sub14_sub3_68_.aByteArray2733 = this.aByteArray2733;
		class91_sub20_sub14_sub3_68_.aByteArray2704 = this.aByteArray2704;
		class91_sub20_sub14_sub3_68_.aShortArray2705 = this.aShortArray2705;
		class91_sub20_sub14_sub3_68_.aByte2743 = this.aByte2743;
		class91_sub20_sub14_sub3_68_.anIntArray2717 = this.anIntArray2717;
		class91_sub20_sub14_sub3_68_.anIntArray2709 = this.anIntArray2709;
		class91_sub20_sub14_sub3_68_.anIntArray2710 = this.anIntArray2710;
		class91_sub20_sub14_sub3_68_.anIntArrayArray2711 = this.anIntArrayArray2711;
		class91_sub20_sub14_sub3_68_.anIntArrayArray2696 = this.anIntArrayArray2696;
		class91_sub20_sub14_sub3_68_.aBoolean2713 = aBoolean2713;
		class91_sub20_sub14_sub3_68_.anInt2714 = 0;
		return class91_sub20_sub14_sub3_68_;
	}

	public void method974() {
		if (this.anInt2714 != 1) {
			this.anInt2714 = 1;
			anInt2488 = 0;
			this.anInt2715 = 0;
			this.anInt2716 = 0;
			for (int i = 0; i < this.anInt2698; i++) {
				final int i_69_ = this.anIntArray2692[i];
				final int i_70_ = this.anIntArray2693[i];
				final int i_71_ = this.anIntArray2694[i];
				if (-i_70_ > anInt2488 * 1142621617) {
					anInt2488 = -i_70_ * -882105519;
				}
				if (i_70_ > this.anInt2715) {
					this.anInt2715 = i_70_;
				}
				final int var5 = i_69_ * i_69_ + i_71_ * i_71_;
				if (var5 > this.anInt2716) {
					this.anInt2716 = var5;
				}
			}
			this.anInt2716 = (int) (Math.sqrt(this.anInt2716) + 0.99);
			this.anInt2718 = (int) (Math.sqrt(this.anInt2716 * this.anInt2716 + anInt2488 * 1142621617 * anInt2488 * 1142621617) + 0.99);
			this.anInt2690 = this.anInt2718 + (int) (Math.sqrt(this.anInt2716 * this.anInt2716 + this.anInt2715 * this.anInt2715) + 0.99);
		}
	}

	void method975() {
		if (this.anInt2714 != 2) {
			this.anInt2714 = 2;
			this.anInt2716 = 0;
			for (int i = 0; i < this.anInt2698; i++) {
				final int i_72_ = this.anIntArray2692[i];
				final int i_73_ = this.anIntArray2693[i];
				final int i_74_ = this.anIntArray2694[i];
				final int var5 = i_72_ * i_72_ + i_74_ * i_74_ + i_73_ * i_73_;
				if (var5 > this.anInt2716) {
					this.anInt2716 = var5;
				}
			}
			this.anInt2716 = (int) (Math.sqrt(this.anInt2716) + 0.99);
			this.anInt2718 = this.anInt2716;
			this.anInt2690 = this.anInt2716 + this.anInt2716;
		}
	}

	public void method976(final Class91_Sub20_Sub15 class91_sub20_sub15, final int i) {
		if (this.anIntArrayArray2711 != null && i != -1) {
			final Class31 class31 = class91_sub20_sub15.aClass31Array2492[i];
			final Class91_Sub8 class91_sub8 = class31.aClass91_Sub8_362;
			anInt2747 = 0;
			anInt2740 = 0;
			anInt2697 = 0;
			for (int i_75_ = 0; i_75_ < class31.anInt363; i_75_++) {
				final int i_76_ = class31.anIntArray358[i_75_];
				method972(class91_sub8.anIntArray1849[i_76_], class91_sub8.anIntArrayArray1851[i_76_], class31.anIntArray365[i_75_], class31.anIntArray366[i_75_], class31.anIntArray359[i_75_]);
			}
			this.anInt2714 = 0;
		}
	}

	public void method977(final Class91_Sub20_Sub15 class91_sub20_sub15, final int i, final Class91_Sub20_Sub15 class91_sub20_sub15_77_, final int i_78_, final int[] is) {
		if (i != -1) {
			if (is != null && i_78_ != -1) {
				final Class31 class31 = class91_sub20_sub15.aClass31Array2492[i];
				final Class31 class31_79_ = class91_sub20_sub15_77_.aClass31Array2492[i_78_];
				final Class91_Sub8 class91_sub8 = class31.aClass91_Sub8_362;
				anInt2747 = 0;
				anInt2740 = 0;
				anInt2697 = 0;
				int i_80_ = 0;
				int i_81_ = i_80_ + 1;
				int i_82_ = is[i_80_];
				for (int i_83_ = 0; i_83_ < class31.anInt363; i_83_++) {
					int var12;
					for (var12 = class31.anIntArray358[i_83_]; var12 > i_82_; i_82_ = is[i_81_++]) {
						/* empty */
					}
					if (var12 != i_82_ || class91_sub8.anIntArray1849[var12] == 0) {
						method972(class91_sub8.anIntArray1849[var12], class91_sub8.anIntArrayArray1851[var12], class31.anIntArray365[i_83_], class31.anIntArray366[i_83_], class31.anIntArray359[i_83_]);
					}
				}
				anInt2747 = 0;
				anInt2740 = 0;
				anInt2697 = 0;
				i_80_ = 0;
				i_81_ = i_80_ + 1;
				i_82_ = is[i_80_];
				for (int i_84_ = 0; i_84_ < class31_79_.anInt363; i_84_++) {
					int var12;
					for (var12 = class31_79_.anIntArray358[i_84_]; var12 > i_82_; i_82_ = is[i_81_++]) {
						/* empty */
					}
					if (var12 == i_82_ || class91_sub8.anIntArray1849[var12] == 0) {
						method972(class91_sub8.anIntArray1849[var12], class91_sub8.anIntArrayArray1851[var12], class31_79_.anIntArray365[i_84_], class31_79_.anIntArray366[i_84_], class31_79_.anIntArray359[i_84_]);
					}
				}
				this.anInt2714 = 0;
			} else {
				method976(class91_sub20_sub15, i);
			}
		}
	}

	final void method978(final int i) {
		final int i_85_ = Class91_Sub20_Sub13_Sub2.anInt2528;
		final int i_86_ = Class91_Sub20_Sub13_Sub2.anInt2534;
		int i_87_ = 0;
		final int i_88_ = this.anIntArray2719[i];
		final int i_89_ = this.anIntArray2706[i];
		final int i_90_ = this.anIntArray2687[i];
		final int i_91_ = anIntArray2727[i_88_];
		final int i_92_ = anIntArray2727[i_89_];
		final int i_93_ = anIntArray2727[i_90_];
		if (this.aByteArray2703 == null) {
			Class91_Sub20_Sub13_Sub2.anInt2527 = 0;
		} else {
			Class91_Sub20_Sub13_Sub2.anInt2527 = this.aByteArray2703[i] & 0xff;
		}
		if (i_91_ >= 50) {
			anIntArray2736[i_87_] = anIntArray2712[i_88_];
			anIntArray2737[i_87_] = anIntArray2723[i_88_];
			anIntArray2720[i_87_++] = this.anIntArray2738[i];
		} else {
			final int i_94_ = anIntArray2725[i_88_];
			final int i_95_ = anIntArray2726[i_88_];
			final int i_96_ = this.anIntArray2738[i];
			if (i_93_ >= 50) {
				final int i_97_ = (50 - i_91_) * anIntArray2750[i_93_ - i_91_];
				anIntArray2736[i_87_] = i_85_ + (i_94_ + ((anIntArray2725[i_90_] - i_94_) * i_97_ >> 16) << 9) / 50;
				anIntArray2737[i_87_] = i_86_ + (i_95_ + ((anIntArray2726[i_90_] - i_95_) * i_97_ >> 16) << 9) / 50;
				anIntArray2720[i_87_++] = i_96_ + ((this.anIntArray2701[i] - i_96_) * i_97_ >> 16);
			}
			if (i_92_ >= 50) {
				final int i_98_ = (50 - i_91_) * anIntArray2750[i_92_ - i_91_];
				anIntArray2736[i_87_] = i_85_ + (i_94_ + ((anIntArray2725[i_89_] - i_94_) * i_98_ >> 16) << 9) / 50;
				anIntArray2737[i_87_] = i_86_ + (i_95_ + ((anIntArray2726[i_89_] - i_95_) * i_98_ >> 16) << 9) / 50;
				anIntArray2720[i_87_++] = i_96_ + ((this.anIntArray2700[i] - i_96_) * i_98_ >> 16);
			}
		}
		if (i_92_ >= 50) {
			anIntArray2736[i_87_] = anIntArray2712[i_89_];
			anIntArray2737[i_87_] = anIntArray2723[i_89_];
			anIntArray2720[i_87_++] = this.anIntArray2700[i];
		} else {
			final int i_99_ = anIntArray2725[i_89_];
			final int i_100_ = anIntArray2726[i_89_];
			final int i_101_ = this.anIntArray2700[i];
			if (i_91_ >= 50) {
				final int i_102_ = (50 - i_92_) * anIntArray2750[i_91_ - i_92_];
				anIntArray2736[i_87_] = i_85_ + (i_99_ + ((anIntArray2725[i_88_] - i_99_) * i_102_ >> 16) << 9) / 50;
				anIntArray2737[i_87_] = i_86_ + (i_100_ + ((anIntArray2726[i_88_] - i_100_) * i_102_ >> 16) << 9) / 50;
				anIntArray2720[i_87_++] = i_101_ + ((this.anIntArray2738[i] - i_101_) * i_102_ >> 16);
			}
			if (i_93_ >= 50) {
				final int i_103_ = (50 - i_92_) * anIntArray2750[i_93_ - i_92_];
				anIntArray2736[i_87_] = i_85_ + (i_99_ + ((anIntArray2725[i_90_] - i_99_) * i_103_ >> 16) << 9) / 50;
				anIntArray2737[i_87_] = i_86_ + (i_100_ + ((anIntArray2726[i_90_] - i_100_) * i_103_ >> 16) << 9) / 50;
				anIntArray2720[i_87_++] = i_101_ + ((this.anIntArray2701[i] - i_101_) * i_103_ >> 16);
			}
		}
		if (i_93_ >= 50) {
			anIntArray2736[i_87_] = anIntArray2712[i_90_];
			anIntArray2737[i_87_] = anIntArray2723[i_90_];
			anIntArray2720[i_87_++] = this.anIntArray2701[i];
		} else {
			final int i_104_ = anIntArray2725[i_90_];
			final int i_105_ = anIntArray2726[i_90_];
			final int i_106_ = this.anIntArray2701[i];
			if (i_92_ >= 50) {
				final int i_107_ = (50 - i_93_) * anIntArray2750[i_92_ - i_93_];
				anIntArray2736[i_87_] = i_85_ + (i_104_ + ((anIntArray2725[i_89_] - i_104_) * i_107_ >> 16) << 9) / 50;
				anIntArray2737[i_87_] = i_86_ + (i_105_ + ((anIntArray2726[i_89_] - i_105_) * i_107_ >> 16) << 9) / 50;
				anIntArray2720[i_87_++] = i_106_ + ((this.anIntArray2700[i] - i_106_) * i_107_ >> 16);
			}
			if (i_91_ >= 50) {
				final int i_108_ = (50 - i_93_) * anIntArray2750[i_91_ - i_93_];
				anIntArray2736[i_87_] = i_85_ + (i_104_ + ((anIntArray2725[i_88_] - i_104_) * i_108_ >> 16) << 9) / 50;
				anIntArray2737[i_87_] = i_86_ + (i_105_ + ((anIntArray2726[i_88_] - i_105_) * i_108_ >> 16) << 9) / 50;
				anIntArray2720[i_87_++] = i_106_ + ((this.anIntArray2738[i] - i_106_) * i_108_ >> 16);
			}
		}
		final int i_109_ = anIntArray2736[0];
		final int i_110_ = anIntArray2736[1];
		final int i_111_ = anIntArray2736[2];
		final int i_112_ = anIntArray2737[0];
		final int i_113_ = anIntArray2737[1];
		final int i_114_ = anIntArray2737[2];
		Class91_Sub20_Sub13_Sub2.aBoolean2537 = false;
		if (i_87_ == 3) {
			if (i_109_ < 0 || i_110_ < 0 || i_111_ < 0 || i_109_ > Class91_Sub20_Sub13_Sub2.anInt2535 || i_110_ > Class91_Sub20_Sub13_Sub2.anInt2535 || i_111_ > Class91_Sub20_Sub13_Sub2.anInt2535) {
				Class91_Sub20_Sub13_Sub2.aBoolean2537 = true;
			}
			if (this.aShortArray2705 != null && this.aShortArray2705[i] != -1) {
				int i_115_;
				int i_116_;
				int i_117_;
				if (this.aByteArray2704 != null && this.aByteArray2704[i] != -1) {
					final int i_118_ = this.aByteArray2704[i] & 0xff;
					i_115_ = this.anIntArray2717[i_118_];
					i_116_ = this.anIntArray2709[i_118_];
					i_117_ = this.anIntArray2710[i_118_];
				} else {
					i_115_ = i_88_;
					i_116_ = i_89_;
					i_117_ = i_90_;
				}
				if (this.anIntArray2701[i] == -1) {
					Class91_Sub20_Sub13_Sub2.method857(i_112_, i_113_, i_114_, i_109_, i_110_, i_111_, this.anIntArray2738[i], this.anIntArray2738[i], this.anIntArray2738[i], anIntArray2725[i_115_], anIntArray2725[i_116_], anIntArray2725[i_117_], anIntArray2726[i_115_], anIntArray2726[i_116_], anIntArray2726[i_117_], anIntArray2727[i_115_], anIntArray2727[i_116_], anIntArray2727[i_117_],
							this.aShortArray2705[i]);
				} else {
					Class91_Sub20_Sub13_Sub2
							.method857(i_112_, i_113_, i_114_, i_109_, i_110_, i_111_, anIntArray2720[0], anIntArray2720[1], anIntArray2720[2], anIntArray2725[i_115_], anIntArray2725[i_116_], anIntArray2725[i_117_], anIntArray2726[i_115_], anIntArray2726[i_116_], anIntArray2726[i_117_], anIntArray2727[i_115_], anIntArray2727[i_116_], anIntArray2727[i_117_], this.aShortArray2705[i]);
				}
			} else if (this.anIntArray2701[i] == -1) {
				Class91_Sub20_Sub13_Sub2.method846(i_112_, i_113_, i_114_, i_109_, i_110_, i_111_, anIntArray2749[this.anIntArray2738[i]]);
			} else {
				Class91_Sub20_Sub13_Sub2.method845(i_112_, i_113_, i_114_, i_109_, i_110_, i_111_, anIntArray2720[0], anIntArray2720[1], anIntArray2720[2]);
			}
		}
		if (i_87_ == 4) {
			if (i_109_ < 0 || i_110_ < 0 || i_111_ < 0 || i_109_ > Class91_Sub20_Sub13_Sub2.anInt2535 || i_110_ > Class91_Sub20_Sub13_Sub2.anInt2535 || i_111_ > Class91_Sub20_Sub13_Sub2.anInt2535 || anIntArray2736[3] < 0 || anIntArray2736[3] > Class91_Sub20_Sub13_Sub2.anInt2535) {
				Class91_Sub20_Sub13_Sub2.aBoolean2537 = true;
			}
			if (this.aShortArray2705 != null && this.aShortArray2705[i] != -1) {
				int i_119_;
				int i_120_;
				int i_121_;
				if (this.aByteArray2704 != null && this.aByteArray2704[i] != -1) {
					final int i_122_ = this.aByteArray2704[i] & 0xff;
					i_119_ = this.anIntArray2717[i_122_];
					i_120_ = this.anIntArray2709[i_122_];
					i_121_ = this.anIntArray2710[i_122_];
				} else {
					i_119_ = i_88_;
					i_120_ = i_89_;
					i_121_ = i_90_;
				}
				final short i_123_ = this.aShortArray2705[i];
				if (this.anIntArray2701[i] == -1) {
					Class91_Sub20_Sub13_Sub2.method857(i_112_, i_113_, i_114_, i_109_, i_110_, i_111_, this.anIntArray2738[i], this.anIntArray2738[i], this.anIntArray2738[i], anIntArray2725[i_119_], anIntArray2725[i_120_], anIntArray2725[i_121_], anIntArray2726[i_119_], anIntArray2726[i_120_], anIntArray2726[i_121_], anIntArray2727[i_119_], anIntArray2727[i_120_], anIntArray2727[i_121_], i_123_);
					Class91_Sub20_Sub13_Sub2.method857(i_112_, i_114_, anIntArray2737[3], i_109_, i_111_, anIntArray2736[3], this.anIntArray2738[i], this.anIntArray2738[i], this.anIntArray2738[i], anIntArray2725[i_119_], anIntArray2725[i_120_], anIntArray2725[i_121_], anIntArray2726[i_119_], anIntArray2726[i_120_], anIntArray2726[i_121_], anIntArray2727[i_119_], anIntArray2727[i_120_],
							anIntArray2727[i_121_], i_123_);
				} else {
					Class91_Sub20_Sub13_Sub2.method857(i_112_, i_113_, i_114_, i_109_, i_110_, i_111_, anIntArray2720[0], anIntArray2720[1], anIntArray2720[2], anIntArray2725[i_119_], anIntArray2725[i_120_], anIntArray2725[i_121_], anIntArray2726[i_119_], anIntArray2726[i_120_], anIntArray2726[i_121_], anIntArray2727[i_119_], anIntArray2727[i_120_], anIntArray2727[i_121_], i_123_);
					Class91_Sub20_Sub13_Sub2.method857(i_112_, i_114_, anIntArray2737[3], i_109_, i_111_, anIntArray2736[3], anIntArray2720[0], anIntArray2720[2], anIntArray2720[3], anIntArray2725[i_119_], anIntArray2725[i_120_], anIntArray2725[i_121_], anIntArray2726[i_119_], anIntArray2726[i_120_], anIntArray2726[i_121_], anIntArray2727[i_119_], anIntArray2727[i_120_], anIntArray2727[i_121_],
							i_123_);
				}
			} else if (this.anIntArray2701[i] == -1) {
				final int i_124_ = anIntArray2749[this.anIntArray2738[i]];
				Class91_Sub20_Sub13_Sub2.method846(i_112_, i_113_, i_114_, i_109_, i_110_, i_111_, i_124_);
				Class91_Sub20_Sub13_Sub2.method846(i_112_, i_114_, anIntArray2737[3], i_109_, i_111_, anIntArray2736[3], i_124_);
			} else {
				Class91_Sub20_Sub13_Sub2.method845(i_112_, i_113_, i_114_, i_109_, i_110_, i_111_, anIntArray2720[0], anIntArray2720[1], anIntArray2720[2]);
				Class91_Sub20_Sub13_Sub2.method845(i_112_, i_114_, anIntArray2737[3], i_109_, i_111_, anIntArray2736[3], anIntArray2720[0], anIntArray2720[2], anIntArray2720[3]);
			}
		}
	}

	public void method979() {
		for (int i = 0; i < this.anInt2698; i++) {
			final int i_125_ = this.anIntArray2694[i];
			this.anIntArray2694[i] = this.anIntArray2692[i];
			this.anIntArray2692[i] = -i_125_;
		}
		this.anInt2714 = 0;
	}

	public void method980(final int i) {
		final int i_126_ = anIntArray2691[i];
		final int i_127_ = anIntArray2722[i];
		for (int i_128_ = 0; i_128_ < this.anInt2698; i_128_++) {
			final int i_129_ = this.anIntArray2693[i_128_] * i_127_ - this.anIntArray2694[i_128_] * i_126_ >> 16;
			this.anIntArray2694[i_128_] = this.anIntArray2693[i_128_] * i_126_ + this.anIntArray2694[i_128_] * i_127_ >> 16;
			this.anIntArray2693[i_128_] = i_129_;
		}
		this.anInt2714 = 0;
	}

	public void method981(final int i, final int i_130_, final int i_131_) {
		for (int i_132_ = 0; i_132_ < this.anInt2698; i_132_++) {
			this.anIntArray2692[i_132_] = this.anIntArray2692[i_132_] * i / 128;
			this.anIntArray2693[i_132_] = this.anIntArray2693[i_132_] * i_130_ / 128;
			this.anIntArray2694[i_132_] = this.anIntArray2694[i_132_] * i_131_ / 128;
		}
		this.anInt2714 = 0;
	}

	public final void method982(final int i, final int i_133_, final int i_134_, final int i_135_, final int i_136_, final int i_137_, final int i_138_) {
		anIntArray2729[0] = -1;
		if (this.anInt2714 != 2 && this.anInt2714 != 1) {
			method975();
		}
		final int i_139_ = Class91_Sub20_Sub13_Sub2.anInt2528;
		final int i_140_ = Class91_Sub20_Sub13_Sub2.anInt2534;
		final int i_141_ = anIntArray2691[i];
		final int i_142_ = anIntArray2722[i];
		final int i_143_ = anIntArray2691[i_133_];
		final int i_144_ = anIntArray2722[i_133_];
		final int i_145_ = anIntArray2691[i_134_];
		final int i_146_ = anIntArray2722[i_134_];
		final int i_147_ = anIntArray2691[i_135_];
		final int i_148_ = anIntArray2722[i_135_];
		final int i_149_ = i_137_ * i_147_ + i_138_ * i_148_ >> 16;
		for (int i_150_ = 0; i_150_ < this.anInt2698; i_150_++) {
			int i_151_ = this.anIntArray2692[i_150_];
			int i_152_ = this.anIntArray2693[i_150_];
			int i_153_ = this.anIntArray2694[i_150_];
			if (i_134_ != 0) {
				final int var23 = i_152_ * i_145_ + i_151_ * i_146_ >> 16;
				i_152_ = i_152_ * i_146_ - i_151_ * i_145_ >> 16;
				i_151_ = var23;
			}
			if (i != 0) {
				final int var23 = i_152_ * i_142_ - i_153_ * i_141_ >> 16;
				i_153_ = i_152_ * i_141_ + i_153_ * i_142_ >> 16;
				i_152_ = var23;
			}
			if (i_133_ != 0) {
				final int var23 = i_153_ * i_143_ + i_151_ * i_144_ >> 16;
				i_153_ = i_153_ * i_144_ - i_151_ * i_143_ >> 16;
				i_151_ = var23;
			}
			i_151_ += i_136_;
			i_152_ += i_137_;
			i_153_ += i_138_;
			final int var23 = i_152_ * i_148_ - i_153_ * i_147_ >> 16;
			i_153_ = i_152_ * i_147_ + i_153_ * i_148_ >> 16;
			anIntArray2748[i_150_] = i_153_ - i_149_;
			anIntArray2712[i_150_] = i_139_ + (i_151_ << 9) / i_153_;
			anIntArray2723[i_150_] = i_140_ + (var23 << 9) / i_153_;
			if (this.anInt2739 > 0) {
				anIntArray2725[i_150_] = i_151_;
				anIntArray2726[i_150_] = var23;
				anIntArray2727[i_150_] = i_153_;
			}
		}
		try {
			method991(false, false, 0);
		} catch (final Exception exception) {
			/* empty */
		}
	}

	public final void method983(final int i, final int i_154_, final int i_155_, final int i_156_, final int i_157_, final int i_158_, final int i_159_, final int i_160_) {
		anIntArray2729[0] = -1;
		if (this.anInt2714 != 2 && this.anInt2714 != 1) {
			method975();
		}
		final int i_161_ = Class91_Sub20_Sub13_Sub2.anInt2528;
		final int i_162_ = Class91_Sub20_Sub13_Sub2.anInt2534;
		final int i_163_ = anIntArray2691[i];
		final int i_164_ = anIntArray2722[i];
		final int i_165_ = anIntArray2691[i_154_];
		final int i_166_ = anIntArray2722[i_154_];
		final int i_167_ = anIntArray2691[i_155_];
		final int i_168_ = anIntArray2722[i_155_];
		final int i_169_ = anIntArray2691[i_156_];
		final int i_170_ = anIntArray2722[i_156_];
		final int i_171_ = i_158_ * i_169_ + i_159_ * i_170_ >> 16;
		for (int i_172_ = 0; i_172_ < this.anInt2698; i_172_++) {
			int i_173_ = this.anIntArray2692[i_172_];
			int i_174_ = this.anIntArray2693[i_172_];
			int i_175_ = this.anIntArray2694[i_172_];
			if (i_155_ != 0) {
				final int var24 = i_174_ * i_167_ + i_173_ * i_168_ >> 16;
				i_174_ = i_174_ * i_168_ - i_173_ * i_167_ >> 16;
				i_173_ = var24;
			}
			if (i != 0) {
				final int var24 = i_174_ * i_164_ - i_175_ * i_163_ >> 16;
				i_175_ = i_174_ * i_163_ + i_175_ * i_164_ >> 16;
				i_174_ = var24;
			}
			if (i_154_ != 0) {
				final int var24 = i_175_ * i_165_ + i_173_ * i_166_ >> 16;
				i_175_ = i_175_ * i_166_ - i_173_ * i_165_ >> 16;
				i_173_ = var24;
			}
			i_173_ += i_157_;
			i_174_ += i_158_;
			i_175_ += i_159_;
			final int var24 = i_174_ * i_170_ - i_175_ * i_169_ >> 16;
			i_175_ = i_174_ * i_169_ + i_175_ * i_170_ >> 16;
			anIntArray2748[i_172_] = i_175_ - i_171_;
			anIntArray2712[i_172_] = i_161_ + (i_173_ << 9) / i_160_;
			anIntArray2723[i_172_] = i_162_ + (var24 << 9) / i_160_;
			if (this.anInt2739 > 0) {
				anIntArray2725[i_172_] = i_173_;
				anIntArray2726[i_172_] = var24;
				anIntArray2727[i_172_] = i_175_;
			}
		}
		try {
			method991(false, false, 0);
		} catch (final Exception exception) {
			/* empty */
		}
	}

	@Override
	void method916(final int i, final int i_176_, final int i_177_, final int i_178_, final int i_179_, final int i_180_, final int i_181_, final int i_182_, final int i_183_) {
		anIntArray2729[0] = -1;
		if (this.anInt2714 != 1) {
			method974();
		}
		final int i_184_ = i_182_ * i_179_ - i_180_ * i_178_ >> 16;
		final int i_185_ = i_181_ * i_176_ + i_184_ * i_177_ >> 16;
		final int i_186_ = this.anInt2716 * i_177_ >> 16;
		final int i_187_ = i_185_ + i_186_;
		if (i_187_ > 50 && i_185_ < 3500) {
			final int i_188_ = i_182_ * i_178_ + i_180_ * i_179_ >> 16;
			int i_189_ = i_188_ - this.anInt2716 << 9;
			if (i_189_ / i_187_ < Class91_Sub20_Sub13_Sub2.anInt2538) {
				int i_190_ = i_188_ + this.anInt2716 << 9;
				if (i_190_ / i_187_ > Class91_Sub20_Sub13_Sub2.anInt2532) {
					final int i_191_ = i_181_ * i_177_ - i_184_ * i_176_ >> 16;
					final int i_192_ = this.anInt2716 * i_176_ >> 16;
					int i_193_ = i_191_ + i_192_ << 9;
					if (i_193_ / i_187_ > Class91_Sub20_Sub13_Sub2.anInt2523) {
						final int i_194_ = i_192_ + (anInt2488 * 1142621617 * i_177_ >> 16);
						int i_195_ = i_191_ - i_194_ << 9;
						if (i_195_ / i_187_ < Class91_Sub20_Sub13_Sub2.anInt2540) {
							final int i_196_ = i_186_ + (anInt2488 * 1142621617 * i_176_ >> 16);
							boolean bool = false;
							boolean bool_197_ = false;
							if (i_185_ - i_196_ <= 50) {
								bool_197_ = true;
							}
							final boolean bool_198_ = bool_197_ || this.anInt2739 > 0;
							boolean bool_199_ = false;
							if (i_183_ > 0 && aBoolean2742) {
								int i_200_ = i_185_ - i_186_;
								if (i_200_ <= 50) {
									i_200_ = 50;
								}
								if (i_188_ > 0) {
									i_189_ /= i_187_;
									i_190_ /= i_200_;
								} else {
									i_190_ /= i_187_;
									i_189_ /= i_200_;
								}
								if (i_191_ > 0) {
									i_195_ /= i_187_;
									i_193_ /= i_200_;
								} else {
									i_193_ /= i_187_;
									i_195_ /= i_200_;
								}
								final int i_201_ = anInt2702 - Class91_Sub20_Sub13_Sub2.anInt2528;
								final int i_202_ = anInt2744 - Class91_Sub20_Sub13_Sub2.anInt2534;
								if (i_201_ > i_189_ && i_201_ < i_190_ && i_202_ > i_195_ && i_202_ < i_193_) {
									if (aBoolean2713) {
										anIntArray2746[anInt2745++] = i_183_;
									} else {
										bool_199_ = true;
									}
								}
							}
							final int i_203_ = Class91_Sub20_Sub13_Sub2.anInt2528;
							final int i_204_ = Class91_Sub20_Sub13_Sub2.anInt2534;
							int i_205_ = 0;
							int i_206_ = 0;
							if (i != 0) {
								i_205_ = anIntArray2691[i];
								i_206_ = anIntArray2722[i];
							}
							for (int i_207_ = 0; i_207_ < this.anInt2698; i_207_++) {
								int i_208_ = this.anIntArray2692[i_207_];
								int i_209_ = this.anIntArray2693[i_207_];
								int i_210_ = this.anIntArray2694[i_207_];
								if (i != 0) {
									final int var35 = i_210_ * i_205_ + i_208_ * i_206_ >> 16;
									i_210_ = i_210_ * i_206_ - i_208_ * i_205_ >> 16;
									i_208_ = var35;
								}
								i_208_ += i_180_;
								i_209_ += i_181_;
								i_210_ += i_182_;
								int var35 = i_210_ * i_178_ + i_208_ * i_179_ >> 16;
								i_210_ = i_210_ * i_179_ - i_208_ * i_178_ >> 16;
								i_208_ = var35;
								var35 = i_209_ * i_177_ - i_210_ * i_176_ >> 16;
								i_210_ = i_209_ * i_176_ + i_210_ * i_177_ >> 16;
								anIntArray2748[i_207_] = i_210_ - i_185_;
								if (i_210_ >= 50) {
									anIntArray2712[i_207_] = i_203_ + (i_208_ << 9) / i_210_;
									anIntArray2723[i_207_] = i_204_ + (var35 << 9) / i_210_;
								} else {
									anIntArray2712[i_207_] = -5000;
									bool = true;
								}
								if (bool_198_) {
									anIntArray2725[i_207_] = i_208_;
									anIntArray2726[i_207_] = var35;
									anIntArray2727[i_207_] = i_210_;
								}
							}
							try {
								method991(bool, bool_199_, i_183_);
							} catch (final Exception exception) {
								/* empty */
							}
						}
					}
				}
			}
		}
	}

	public void method984() {
		for (int i = 0; i < this.anInt2698; i++) {
			this.anIntArray2692[i] = -this.anIntArray2692[i];
			this.anIntArray2694[i] = -this.anIntArray2694[i];
		}
		this.anInt2714 = 0;
	}

	public void method988(final int i, final int i_211_, final int i_212_) {
		for (int i_213_ = 0; i_213_ < this.anInt2698; i_213_++) {
			this.anIntArray2692[i_213_] += i;
			this.anIntArray2693[i_213_] += i_211_;
			this.anIntArray2694[i_213_] += i_212_;
		}
		this.anInt2714 = 0;
	}

	final void method989(final int i) {
		if (aBooleanArray2707[i]) {
			method978(i);
		} else {
			final int i_214_ = this.anIntArray2719[i];
			final int i_215_ = this.anIntArray2706[i];
			final int i_216_ = this.anIntArray2687[i];
			Class91_Sub20_Sub13_Sub2.aBoolean2537 = aBooleanArray2721[i];
			if (this.aByteArray2703 == null) {
				Class91_Sub20_Sub13_Sub2.anInt2527 = 0;
			} else {
				Class91_Sub20_Sub13_Sub2.anInt2527 = this.aByteArray2703[i] & 0xff;
			}
			if (this.aShortArray2705 != null && this.aShortArray2705[i] != -1) {
				int i_217_;
				int i_218_;
				int i_219_;
				if (this.aByteArray2704 != null && this.aByteArray2704[i] != -1) {
					final int i_220_ = this.aByteArray2704[i] & 0xff;
					i_217_ = this.anIntArray2717[i_220_];
					i_218_ = this.anIntArray2709[i_220_];
					i_219_ = this.anIntArray2710[i_220_];
				} else {
					i_217_ = i_214_;
					i_218_ = i_215_;
					i_219_ = i_216_;
				}
				if (this.anIntArray2701[i] == -1) {
					Class91_Sub20_Sub13_Sub2.method857(anIntArray2723[i_214_], anIntArray2723[i_215_], anIntArray2723[i_216_], anIntArray2712[i_214_], anIntArray2712[i_215_], anIntArray2712[i_216_], this.anIntArray2738[i], this.anIntArray2738[i], this.anIntArray2738[i], anIntArray2725[i_217_], anIntArray2725[i_218_], anIntArray2725[i_219_], anIntArray2726[i_217_], anIntArray2726[i_218_],
							anIntArray2726[i_219_], anIntArray2727[i_217_], anIntArray2727[i_218_], anIntArray2727[i_219_], this.aShortArray2705[i]);
				} else {
					Class91_Sub20_Sub13_Sub2.method857(anIntArray2723[i_214_], anIntArray2723[i_215_], anIntArray2723[i_216_], anIntArray2712[i_214_], anIntArray2712[i_215_], anIntArray2712[i_216_], this.anIntArray2738[i], this.anIntArray2700[i], this.anIntArray2701[i], anIntArray2725[i_217_], anIntArray2725[i_218_], anIntArray2725[i_219_], anIntArray2726[i_217_], anIntArray2726[i_218_],
							anIntArray2726[i_219_], anIntArray2727[i_217_], anIntArray2727[i_218_], anIntArray2727[i_219_], this.aShortArray2705[i]);
				}
			} else if (this.anIntArray2701[i] == -1) {
				Class91_Sub20_Sub13_Sub2.method846(anIntArray2723[i_214_], anIntArray2723[i_215_], anIntArray2723[i_216_], anIntArray2712[i_214_], anIntArray2712[i_215_], anIntArray2712[i_216_], anIntArray2749[this.anIntArray2738[i]]);
			} else {
				Class91_Sub20_Sub13_Sub2.method845(anIntArray2723[i_214_], anIntArray2723[i_215_], anIntArray2723[i_216_], anIntArray2712[i_214_], anIntArray2712[i_215_], anIntArray2712[i_216_], this.anIntArray2738[i], this.anIntArray2700[i], this.anIntArray2701[i]);
			}
		}
	}

	public int method990() {
		method974();
		return this.anInt2716;
	}

	final void method991(final boolean bool, boolean bool_221_, final int i) {
		if (this.anInt2690 < 1600) {
			for (int i_222_ = 0; i_222_ < this.anInt2690; i_222_++) {
				anIntArray2729[i_222_] = 0;
			}
			for (int i_223_ = 0; i_223_ < this.anInt2695; i_223_++) {
				if (this.anIntArray2701[i_223_] != -2) {
					final int i_224_ = this.anIntArray2719[i_223_];
					final int i_225_ = this.anIntArray2706[i_223_];
					final int i_226_ = this.anIntArray2687[i_223_];
					final int i_227_ = anIntArray2712[i_224_];
					final int i_228_ = anIntArray2712[i_225_];
					final int i_229_ = anIntArray2712[i_226_];
					if (bool && (i_227_ == -5000 || i_228_ == -5000 || i_229_ == -5000)) {
						int i_230_ = anIntArray2725[i_224_];
						final int i_231_ = anIntArray2725[i_225_];
						int i_232_ = anIntArray2725[i_226_];
						int i_233_ = anIntArray2726[i_224_];
						final int i_234_ = anIntArray2726[i_225_];
						int i_235_ = anIntArray2726[i_226_];
						int i_236_ = anIntArray2727[i_224_];
						final int i_237_ = anIntArray2727[i_225_];
						int i_238_ = anIntArray2727[i_226_];
						i_230_ -= i_231_;
						i_232_ -= i_231_;
						i_233_ -= i_234_;
						i_235_ -= i_234_;
						i_236_ -= i_237_;
						i_238_ -= i_237_;
						final int i_239_ = i_233_ * i_238_ - i_236_ * i_235_;
						final int i_240_ = i_236_ * i_232_ - i_230_ * i_238_;
						final int i_241_ = i_230_ * i_235_ - i_233_ * i_232_;
						if (i_231_ * i_239_ + i_234_ * i_240_ + i_237_ * i_241_ > 0) {
							aBooleanArray2707[i_223_] = true;
							final int i_242_ = (anIntArray2748[i_224_] + anIntArray2748[i_225_] + anIntArray2748[i_226_]) / 3 + this.anInt2718;
							anIntArrayArray2730[i_242_][anIntArray2729[i_242_]++] = i_223_;
						}
					} else {
						if (bool_221_ && method992(anInt2702, anInt2744, anIntArray2723[i_224_], anIntArray2723[i_225_], anIntArray2723[i_226_], i_227_, i_228_, i_229_)) {
							anIntArray2746[anInt2745++] = i;
							bool_221_ = false;
						}
						if ((i_227_ - i_228_) * (anIntArray2723[i_226_] - anIntArray2723[i_225_]) - (anIntArray2723[i_224_] - anIntArray2723[i_225_]) * (i_229_ - i_228_) > 0) {
							aBooleanArray2707[i_223_] = false;
							if (i_227_ >= 0 && i_228_ >= 0 && i_229_ >= 0 && i_227_ <= Class91_Sub20_Sub13_Sub2.anInt2535 && i_228_ <= Class91_Sub20_Sub13_Sub2.anInt2535 && i_229_ <= Class91_Sub20_Sub13_Sub2.anInt2535) {
								aBooleanArray2721[i_223_] = false;
							} else {
								aBooleanArray2721[i_223_] = true;
							}
							final int i_243_ = (anIntArray2748[i_224_] + anIntArray2748[i_225_] + anIntArray2748[i_226_]) / 3 + this.anInt2718;
							anIntArrayArray2730[i_243_][anIntArray2729[i_243_]++] = i_223_;
						}
					}
				}
			}
			if (this.aByteArray2733 == null) {
				for (int i_244_ = this.anInt2690 - 1; i_244_ >= 0; i_244_--) {
					final int i_245_ = anIntArray2729[i_244_];
					if (i_245_ > 0) {
						final int[] is = anIntArrayArray2730[i_244_];
						for (int i_246_ = 0; i_246_ < i_245_; i_246_++) {
							method989(is[i_246_]);
						}
					}
				}
			} else {
				for (int i_247_ = 0; i_247_ < 12; i_247_++) {
					anIntArray2731[i_247_] = 0;
					anIntArray2735[i_247_] = 0;
				}
				for (int i_248_ = this.anInt2690 - 1; i_248_ >= 0; i_248_--) {
					final int i_249_ = anIntArray2729[i_248_];
					if (i_249_ > 0) {
						final int[] is = anIntArrayArray2730[i_248_];
						for (int i_250_ = 0; i_250_ < i_249_; i_250_++) {
							final int i_251_ = is[i_250_];
							final byte i_252_ = this.aByteArray2733[i_251_];
							final int i_253_ = anIntArray2731[i_252_]++;
							anIntArrayArray2732[i_252_][i_253_] = i_251_;
							if (i_252_ < 10) {
								anIntArray2735[i_252_] += i_248_;
							} else if (i_252_ == 10) {
								anIntArray2741[i_253_] = i_248_;
							} else {
								anIntArray2734[i_253_] = i_248_;
							}
						}
					}
				}
				int i_254_ = 0;
				if (anIntArray2731[1] > 0 || anIntArray2731[2] > 0) {
					i_254_ = (anIntArray2735[1] + anIntArray2735[2]) / (anIntArray2731[1] + anIntArray2731[2]);
				}
				int i_255_ = 0;
				if (anIntArray2731[3] > 0 || anIntArray2731[4] > 0) {
					i_255_ = (anIntArray2735[3] + anIntArray2735[4]) / (anIntArray2731[3] + anIntArray2731[4]);
				}
				int i_256_ = 0;
				if (anIntArray2731[6] > 0 || anIntArray2731[8] > 0) {
					i_256_ = (anIntArray2735[6] + anIntArray2735[8]) / (anIntArray2731[6] + anIntArray2731[8]);
				}
				int i_257_ = 0;
				int i_258_ = anIntArray2731[10];
				int[] is = anIntArrayArray2732[10];
				int[] is_259_ = anIntArray2741;
				if (i_257_ == i_258_) {
					i_257_ = 0;
					i_258_ = anIntArray2731[11];
					is = anIntArrayArray2732[11];
					is_259_ = anIntArray2734;
				}
				int i_260_;
				if (i_257_ < i_258_) {
					i_260_ = is_259_[i_257_];
				} else {
					i_260_ = -1000;
				}
				for (int i_261_ = 0; i_261_ < 10; i_261_++) {
					while (i_261_ == 0) {
						if (i_260_ <= i_254_) {
							break;
						}
						method989(is[i_257_++]);
						if (i_257_ == i_258_ && is != anIntArrayArray2732[11]) {
							i_257_ = 0;
							i_258_ = anIntArray2731[11];
							is = anIntArrayArray2732[11];
							is_259_ = anIntArray2734;
						}
						if (i_257_ < i_258_) {
							i_260_ = is_259_[i_257_];
						} else {
							i_260_ = -1000;
						}
					}
					while (i_261_ == 3) {
						if (i_260_ <= i_255_) {
							break;
						}
						method989(is[i_257_++]);
						if (i_257_ == i_258_ && is != anIntArrayArray2732[11]) {
							i_257_ = 0;
							i_258_ = anIntArray2731[11];
							is = anIntArrayArray2732[11];
							is_259_ = anIntArray2734;
						}
						if (i_257_ < i_258_) {
							i_260_ = is_259_[i_257_];
						} else {
							i_260_ = -1000;
						}
					}
					while (i_261_ == 5 && i_260_ > i_256_) {
						method989(is[i_257_++]);
						if (i_257_ == i_258_ && is != anIntArrayArray2732[11]) {
							i_257_ = 0;
							i_258_ = anIntArray2731[11];
							is = anIntArrayArray2732[11];
							is_259_ = anIntArray2734;
						}
						if (i_257_ < i_258_) {
							i_260_ = is_259_[i_257_];
						} else {
							i_260_ = -1000;
						}
					}
					final int i_262_ = anIntArray2731[i_261_];
					final int[] is_263_ = anIntArrayArray2732[i_261_];
					for (int i_264_ = 0; i_264_ < i_262_; i_264_++) {
						method989(is_263_[i_264_]);
					}
				}
				while (i_260_ != -1000) {
					method989(is[i_257_++]);
					if (i_257_ == i_258_ && is != anIntArrayArray2732[11]) {
						i_257_ = 0;
						is = anIntArrayArray2732[11];
						i_258_ = anIntArray2731[11];
						is_259_ = anIntArray2734;
					}
					if (i_257_ < i_258_) {
						i_260_ = is_259_[i_257_];
					} else {
						i_260_ = -1000;
					}
				}
			}
		}
	}

	public Class91_Sub20_Sub14_Sub3(final Class91_Sub20_Sub14_Sub3[] class91_sub20_sub14_sub3s, final int i) {
		boolean bool = false;
		boolean bool_265_ = false;
		boolean bool_266_ = false;
		boolean bool_267_ = false;
		this.anInt2698 = 0;
		this.anInt2695 = 0;
		this.anInt2739 = 0;
		this.aByte2743 = (byte) -1;
		for (int i_268_ = 0; i_268_ < i; i_268_++) {
			final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_269_ = class91_sub20_sub14_sub3s[i_268_];
			if (class91_sub20_sub14_sub3_269_ != null) {
				this.anInt2698 += class91_sub20_sub14_sub3_269_.anInt2698;
				this.anInt2695 += class91_sub20_sub14_sub3_269_.anInt2695;
				this.anInt2739 += class91_sub20_sub14_sub3_269_.anInt2739;
				if (class91_sub20_sub14_sub3_269_.aByteArray2733 != null) {
					bool = true;
				} else {
					if (this.aByte2743 == -1) {
						this.aByte2743 = class91_sub20_sub14_sub3_269_.aByte2743;
					}
					if (this.aByte2743 != class91_sub20_sub14_sub3_269_.aByte2743) {
						bool = true;
					}
				}
				bool_265_ = bool_265_ | class91_sub20_sub14_sub3_269_.aByteArray2703 != null;
				bool_266_ = bool_266_ | class91_sub20_sub14_sub3_269_.aShortArray2705 != null;
				bool_267_ = bool_267_ | class91_sub20_sub14_sub3_269_.aByteArray2704 != null;
			}
		}
		this.anIntArray2692 = new int[this.anInt2698];
		this.anIntArray2693 = new int[this.anInt2698];
		this.anIntArray2694 = new int[this.anInt2698];
		this.anIntArray2719 = new int[this.anInt2695];
		this.anIntArray2706 = new int[this.anInt2695];
		this.anIntArray2687 = new int[this.anInt2695];
		this.anIntArray2738 = new int[this.anInt2695];
		this.anIntArray2700 = new int[this.anInt2695];
		this.anIntArray2701 = new int[this.anInt2695];
		if (bool) {
			this.aByteArray2733 = new byte[this.anInt2695];
		}
		if (bool_265_) {
			this.aByteArray2703 = new byte[this.anInt2695];
		}
		if (bool_266_) {
			this.aShortArray2705 = new short[this.anInt2695];
		}
		if (bool_267_) {
			this.aByteArray2704 = new byte[this.anInt2695];
		}
		if (this.anInt2739 > 0) {
			this.anIntArray2717 = new int[this.anInt2739];
			this.anIntArray2709 = new int[this.anInt2739];
			this.anIntArray2710 = new int[this.anInt2739];
		}
		this.anInt2698 = 0;
		this.anInt2695 = 0;
		this.anInt2739 = 0;
		for (int i_270_ = 0; i_270_ < i; i_270_++) {
			final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_271_ = class91_sub20_sub14_sub3s[i_270_];
			if (class91_sub20_sub14_sub3_271_ != null) {
				for (int var9 = 0; var9 < class91_sub20_sub14_sub3_271_.anInt2695; var9++) {
					this.anIntArray2719[this.anInt2695] = class91_sub20_sub14_sub3_271_.anIntArray2719[var9] + this.anInt2698;
					this.anIntArray2706[this.anInt2695] = class91_sub20_sub14_sub3_271_.anIntArray2706[var9] + this.anInt2698;
					this.anIntArray2687[this.anInt2695] = class91_sub20_sub14_sub3_271_.anIntArray2687[var9] + this.anInt2698;
					this.anIntArray2738[this.anInt2695] = class91_sub20_sub14_sub3_271_.anIntArray2738[var9];
					this.anIntArray2700[this.anInt2695] = class91_sub20_sub14_sub3_271_.anIntArray2700[var9];
					this.anIntArray2701[this.anInt2695] = class91_sub20_sub14_sub3_271_.anIntArray2701[var9];
					if (bool) {
						if (class91_sub20_sub14_sub3_271_.aByteArray2733 != null) {
							this.aByteArray2733[this.anInt2695] = class91_sub20_sub14_sub3_271_.aByteArray2733[var9];
						} else {
							this.aByteArray2733[this.anInt2695] = class91_sub20_sub14_sub3_271_.aByte2743;
						}
					}
					if (bool_265_ && class91_sub20_sub14_sub3_271_.aByteArray2703 != null) {
						this.aByteArray2703[this.anInt2695] = class91_sub20_sub14_sub3_271_.aByteArray2703[var9];
					}
					if (bool_266_) {
						if (class91_sub20_sub14_sub3_271_.aShortArray2705 != null) {
							this.aShortArray2705[this.anInt2695] = class91_sub20_sub14_sub3_271_.aShortArray2705[var9];
						} else {
							this.aShortArray2705[this.anInt2695] = (short) -1;
						}
					}
					if (bool_267_) {
						if (class91_sub20_sub14_sub3_271_.aByteArray2704 != null && class91_sub20_sub14_sub3_271_.aByteArray2704[var9] != -1) {
							this.aByteArray2704[this.anInt2695] = (byte) (class91_sub20_sub14_sub3_271_.aByteArray2704[var9] + this.anInt2739);
						} else {
							this.aByteArray2704[this.anInt2695] = (byte) -1;
						}
					}
					this.anInt2695++;
				}
				for (int var9 = 0; var9 < class91_sub20_sub14_sub3_271_.anInt2739; var9++) {
					this.anIntArray2717[this.anInt2739] = class91_sub20_sub14_sub3_271_.anIntArray2717[var9] + this.anInt2698;
					this.anIntArray2709[this.anInt2739] = class91_sub20_sub14_sub3_271_.anIntArray2709[var9] + this.anInt2698;
					this.anIntArray2710[this.anInt2739] = class91_sub20_sub14_sub3_271_.anIntArray2710[var9] + this.anInt2698;
					this.anInt2739++;
				}
				for (int var9 = 0; var9 < class91_sub20_sub14_sub3_271_.anInt2698; var9++) {
					this.anIntArray2692[this.anInt2698] = class91_sub20_sub14_sub3_271_.anIntArray2692[var9];
					this.anIntArray2693[this.anInt2698] = class91_sub20_sub14_sub3_271_.anIntArray2693[var9];
					this.anIntArray2694[this.anInt2698] = class91_sub20_sub14_sub3_271_.anIntArray2694[var9];
					this.anInt2698++;
				}
			}
		}
	}

	final boolean method992(final int i, final int i_272_, final int i_273_, final int i_274_, final int i_275_, final int i_276_, final int i_277_, final int i_278_) {
		return i_272_ < i_273_ && i_272_ < i_274_ && i_272_ < i_275_ ? false : i_272_ > i_273_ && i_272_ > i_274_ && i_272_ > i_275_ ? false : i < i_276_ && i < i_277_ && i < i_278_ ? false : i <= i_276_ || i <= i_277_ || i <= i_278_;
	}

	public void method993() {
		for (int i = 0; i < this.anInt2698; i++) {
			final int i_279_ = this.anIntArray2692[i];
			this.anIntArray2692[i] = this.anIntArray2694[i];
			this.anIntArray2694[i] = -i_279_;
		}
		this.anInt2714 = 0;
	}

	Class91_Sub20_Sub14_Sub3() {
		/* empty */
	}

	public Class91_Sub20_Sub14_Sub3 method994(final boolean bool) {
		if (!bool && aByteArray2708.length < this.anInt2695) {
			aByteArray2708 = new byte[this.anInt2695 + 100];
		}
		return method973(bool, aClass91_Sub20_Sub14_Sub3_2689, aByteArray2708);
	}
}
