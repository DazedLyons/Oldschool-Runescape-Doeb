/* Class91_Sub20_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub20_Sub13 extends Class91_Sub20 {
	public static int anInt2480 = 0;
	public static int[] anIntArray2481;
	public static int anInt2482;
	public static int anInt2483;
	public static int anInt2484 = 0;
	protected static int anInt2485 = 0;
	protected static int anInt2486 = 0;

	public static void method819(final int[] is, final int i, final int i_0_) {
		anIntArray2481 = is;
		anInt2483 = i;
		anInt2482 = i_0_;
		method821(0, 0, i, i_0_);
	}

	public static void method820() {
		anInt2485 = 0;
		anInt2484 = 0;
		anInt2486 = anInt2483;
		anInt2480 = anInt2482;
	}

	public static void method821(int i, int i_1_, int i_2_, int i_3_) {
		if (i < 0) {
			i = 0;
		}
		if (i_1_ < 0) {
			i_1_ = 0;
		}
		if (i_2_ > anInt2483) {
			i_2_ = anInt2483;
		}
		if (i_3_ > anInt2482) {
			i_3_ = anInt2482;
		}
		anInt2485 = i;
		anInt2484 = i_1_;
		anInt2486 = i_2_;
		anInt2480 = i_3_;
	}

	public static void method822(final int i, final int i_4_, final int i_5_, final int i_6_) {
		if (anInt2485 < i) {
			anInt2485 = i;
		}
		if (anInt2484 < i_4_) {
			anInt2484 = i_4_;
		}
		if (anInt2486 > i_5_) {
			anInt2486 = i_5_;
		}
		if (anInt2480 > i_6_) {
			anInt2480 = i_6_;
		}
	}

	public static void method823(final int[] is) {
		is[0] = anInt2485;
		is[1] = anInt2484;
		is[2] = anInt2486;
		is[3] = anInt2480;
	}

	public static void method824(final int[] is) {
		anInt2485 = is[0];
		anInt2484 = is[1];
		anInt2486 = is[2];
		anInt2480 = is[3];
	}

	public static void method825() {
		int i = 0;
		int i_7_ = anInt2483 * anInt2482 - 7;
		while (i < i_7_) {
			anIntArray2481[i++] = 0;
			anIntArray2481[i++] = 0;
			anIntArray2481[i++] = 0;
			anIntArray2481[i++] = 0;
			anIntArray2481[i++] = 0;
			anIntArray2481[i++] = 0;
			anIntArray2481[i++] = 0;
			anIntArray2481[i++] = 0;
		}
		i_7_ += 7;
		while (i < i_7_) {
			anIntArray2481[i++] = 0;
		}
	}

	public static void method826(int i, int i_8_, int i_9_, int i_10_, int i_11_, final int i_12_) {
		if (i < anInt2485) {
			i_9_ -= anInt2485 - i;
			i = anInt2485;
		}
		if (i_8_ < anInt2484) {
			i_10_ -= anInt2484 - i_8_;
			i_8_ = anInt2484;
		}
		if (i + i_9_ > anInt2486) {
			i_9_ = anInt2486 - i;
		}
		if (i_8_ + i_10_ > anInt2480) {
			i_10_ = anInt2480 - i_8_;
		}
		i_11_ = ((i_11_ & 0xff00ff) * i_12_ >> 8 & 0xff00ff) + ((i_11_ & 0xff00) * i_12_ >> 8 & 0xff00);
		final int i_13_ = 256 - i_12_;
		final int i_14_ = anInt2483 - i_9_;
		int i_15_ = i + i_8_ * anInt2483;
		for (int i_16_ = 0; i_16_ < i_10_; i_16_++) {
			for (int i_17_ = -i_9_; i_17_ < 0; i_17_++) {
				int i_18_ = anIntArray2481[i_15_];
				i_18_ = ((i_18_ & 0xff00ff) * i_13_ >> 8 & 0xff00ff) + ((i_18_ & 0xff00) * i_13_ >> 8 & 0xff00);
				anIntArray2481[i_15_++] = i_11_ + i_18_;
			}
			i_15_ += i_14_;
		}
	}

	public static void method827(int i, int i_19_, int i_20_, int i_21_, final int i_22_, final int i_23_) {
		int i_24_ = 0;
		final int i_25_ = 65536 / i_21_;
		if (i < anInt2485) {
			i_20_ -= anInt2485 - i;
			i = anInt2485;
		}
		if (i_19_ < anInt2484) {
			i_24_ += (anInt2484 - i_19_) * i_25_;
			i_21_ -= anInt2484 - i_19_;
			i_19_ = anInt2484;
		}
		if (i + i_20_ > anInt2486) {
			i_20_ = anInt2486 - i;
		}
		if (i_19_ + i_21_ > anInt2480) {
			i_21_ = anInt2480 - i_19_;
		}
		final int i_26_ = anInt2483 - i_20_;
		int i_27_ = i + i_19_ * anInt2483;
		for (int i_28_ = -i_21_; i_28_ < 0; i_28_++) {
			final int i_29_ = 65536 - i_24_ >> 8;
			final int i_30_ = i_24_ >> 8;
			final int i_31_ = ((i_22_ & 0xff00ff) * i_29_ + (i_23_ & 0xff00ff) * i_30_ & ~0xff00ff) + ((i_22_ & 0xff00) * i_29_ + (i_23_ & 0xff00) * i_30_ & 0xff0000) >>> 8;
			for (int i_32_ = -i_20_; i_32_ < 0; i_32_++) {
				anIntArray2481[i_27_++] = i_31_;
			}
			i_27_ += i_26_;
			i_24_ += i_25_;
		}
	}

	public static void method828(int i, int i_33_, int i_34_, int i_35_, final int i_36_) {
		if (i < anInt2485) {
			i_34_ -= anInt2485 - i;
			i = anInt2485;
		}
		if (i_33_ < anInt2484) {
			i_35_ -= anInt2484 - i_33_;
			i_33_ = anInt2484;
		}
		if (i + i_34_ > anInt2486) {
			i_34_ = anInt2486 - i;
		}
		if (i_33_ + i_35_ > anInt2480) {
			i_35_ = anInt2480 - i_33_;
		}
		final int i_37_ = anInt2483 - i_34_;
		int i_38_ = i + i_33_ * anInt2483;
		for (int i_39_ = -i_35_; i_39_ < 0; i_39_++) {
			for (int i_40_ = -i_34_; i_40_ < 0; i_40_++) {
				anIntArray2481[i_38_++] = i_36_;
			}
			i_38_ += i_37_;
		}
	}

	public static void method829(int i, final int i_41_, int i_42_, final int i_43_) {
		if (i_41_ >= anInt2484 && i_41_ < anInt2480) {
			if (i < anInt2485) {
				i_42_ -= anInt2485 - i;
				i = anInt2485;
			}
			if (i + i_42_ > anInt2486) {
				i_42_ = anInt2486 - i;
			}
			final int i_44_ = i + i_41_ * anInt2483;
			for (int var5 = 0; var5 < i_42_; var5++) {
				anIntArray2481[i_44_ + var5] = i_43_;
			}
		}
	}

	static void method830(final int i, int i_45_, int i_46_, final int i_47_, final int i_48_) {
		if (i >= anInt2485 && i < anInt2486) {
			if (i_45_ < anInt2484) {
				i_46_ -= anInt2484 - i_45_;
				i_45_ = anInt2484;
			}
			if (i_45_ + i_46_ > anInt2480) {
				i_46_ = anInt2480 - i_45_;
			}
			final int i_49_ = 256 - i_48_;
			final int i_50_ = (i_47_ >> 16 & 0xff) * i_48_;
			final int i_51_ = (i_47_ >> 8 & 0xff) * i_48_;
			final int i_52_ = (i_47_ & 0xff) * i_48_;
			int i_53_ = i + i_45_ * anInt2483;
			for (int i_54_ = 0; i_54_ < i_46_; i_54_++) {
				final int i_55_ = (anIntArray2481[i_53_] >> 16 & 0xff) * i_49_;
				final int i_56_ = (anIntArray2481[i_53_] >> 8 & 0xff) * i_49_;
				final int i_57_ = (anIntArray2481[i_53_] & 0xff) * i_49_;
				final int i_58_ = (i_50_ + i_55_ >> 8 << 16) + (i_51_ + i_56_ >> 8 << 8) + (i_52_ + i_57_ >> 8);
				anIntArray2481[i_53_] = i_58_;
				i_53_ += anInt2483;
			}
		}
	}

	public static void method831(final int i, final int i_59_, final int i_60_, final int i_61_, final int i_62_, final int i_63_) {
		method832(i, i_59_, i_60_, i_62_, i_63_);
		method832(i, i_59_ + i_61_ - 1, i_60_, i_62_, i_63_);
		if (i_61_ >= 3) {
			method830(i, i_59_ + 1, i_61_ - 2, i_62_, i_63_);
			method830(i + i_60_ - 1, i_59_ + 1, i_61_ - 2, i_62_, i_63_);
		}
	}

	protected Class91_Sub20_Sub13() {
		/* empty */
	}

	static void method832(int i, final int i_64_, int i_65_, final int i_66_, final int i_67_) {
		if (i_64_ >= anInt2484 && i_64_ < anInt2480) {
			if (i < anInt2485) {
				i_65_ -= anInt2485 - i;
				i = anInt2485;
			}
			if (i + i_65_ > anInt2486) {
				i_65_ = anInt2486 - i;
			}
			final int i_68_ = 256 - i_67_;
			final int i_69_ = (i_66_ >> 16 & 0xff) * i_67_;
			final int i_70_ = (i_66_ >> 8 & 0xff) * i_67_;
			final int i_71_ = (i_66_ & 0xff) * i_67_;
			int i_72_ = i + i_64_ * anInt2483;
			for (int i_73_ = 0; i_73_ < i_65_; i_73_++) {
				final int i_74_ = (anIntArray2481[i_72_] >> 16 & 0xff) * i_68_;
				final int i_75_ = (anIntArray2481[i_72_] >> 8 & 0xff) * i_68_;
				final int i_76_ = (anIntArray2481[i_72_] & 0xff) * i_68_;
				final int i_77_ = (i_69_ + i_74_ >> 8 << 16) + (i_70_ + i_75_ >> 8 << 8) + (i_71_ + i_76_ >> 8);
				anIntArray2481[i_72_++] = i_77_;
			}
		}
	}

	public static void method833(int i, int i_78_, int i_79_, int i_80_, final int i_81_) {
		i_79_ -= i;
		i_80_ -= i_78_;
		if (i_80_ == 0) {
			if (i_79_ >= 0) {
				method829(i, i_78_, i_79_ + 1, i_81_);
			} else {
				method829(i + i_79_, i_78_, -i_79_ + 1, i_81_);
			}
		} else if (i_79_ == 0) {
			if (i_80_ >= 0) {
				method835(i, i_78_, i_80_ + 1, i_81_);
			} else {
				method835(i, i_78_ + i_80_, -i_80_ + 1, i_81_);
			}
		} else {
			if (i_79_ + i_80_ < 0) {
				i += i_79_;
				i_79_ = -i_79_;
				i_78_ += i_80_;
				i_80_ = -i_80_;
			}
			if (i_79_ > i_80_) {
				i_78_ <<= 16;
				i_78_ += 32768;
				i_80_ <<= 16;
				final int i_82_ = (int) Math.floor((double) i_80_ / (double) i_79_ + 0.5);
				i_79_ += i;
				if (i < anInt2485) {
					i_78_ += i_82_ * (anInt2485 - i);
					i = anInt2485;
				}
				if (i_79_ >= anInt2486) {
					i_79_ = anInt2486 - 1;
				}
				for (/**/; i <= i_79_; i++) {
					final int var6 = i_78_ >> 16;
					if (var6 >= anInt2484 && var6 < anInt2480) {
						anIntArray2481[i + var6 * anInt2483] = i_81_;
					}
					i_78_ += i_82_;
				}
			} else {
				i <<= 16;
				i += 32768;
				i_79_ <<= 16;
				final int i_83_ = (int) Math.floor((double) i_79_ / (double) i_80_ + 0.5);
				i_80_ += i_78_;
				if (i_78_ < anInt2484) {
					i += i_83_ * (anInt2484 - i_78_);
					i_78_ = anInt2484;
				}
				if (i_80_ >= anInt2480) {
					i_80_ = anInt2480 - 1;
				}
				for (/**/; i_78_ <= i_80_; i_78_++) {
					final int var6 = i >> 16;
					if (var6 >= anInt2485 && var6 < anInt2486) {
						anIntArray2481[var6 + i_78_ * anInt2483] = i_81_;
					}
					i += i_83_;
				}
			}
		}
	}

	public static void method834(final int i, final int i_84_, final int i_85_, final int i_86_, final int i_87_) {
		method829(i, i_84_, i_85_, i_87_);
		method829(i, i_84_ + i_86_ - 1, i_85_, i_87_);
		method835(i, i_84_, i_86_, i_87_);
		method835(i + i_85_ - 1, i_84_, i_86_, i_87_);
	}

	public static void method835(final int i, int i_88_, int i_89_, final int i_90_) {
		if (i >= anInt2485 && i < anInt2486) {
			if (i_88_ < anInt2484) {
				i_89_ -= anInt2484 - i_88_;
				i_88_ = anInt2484;
			}
			if (i_88_ + i_89_ > anInt2480) {
				i_89_ = anInt2480 - i_88_;
			}
			final int i_91_ = i + i_88_ * anInt2483;
			for (int var5 = 0; var5 < i_89_; var5++) {
				anIntArray2481[i_91_ + var5 * anInt2483] = i_90_;
			}
		}
	}

	public static void method836(int i, int i_92_, final int i_93_, final int[] is, final int[] is_94_) {
		int i_95_ = i + i_92_ * anInt2483;
		for (i_92_ = 0; i_92_ < is.length; i_92_++) {
			int i_96_ = i_95_ + is[i_92_];
			for (i = -is_94_[i_92_]; i < 0; i++) {
				anIntArray2481[i_96_++] = i_93_;
			}
			i_95_ += anInt2483;
		}
	}
}
