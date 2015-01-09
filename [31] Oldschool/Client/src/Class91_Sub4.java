/* Class91_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub4 extends Class91 {
	boolean aBoolean1759;
	static int anInt1760;
	int anInt1761;
	int anInt1762;
	int anInt1763;
	static float[] aFloatArray1764;
	static byte[] aByteArray1765;
	int anInt1766;
	static int anInt1767;
	static int anInt1768;
	static int anInt1769;
	static Class11[] aClass11Array1770;
	byte[] aByteArray1771;
	static Class10[] aClass10Array1772;
	static Class3[] aClass3Array1773;
	static boolean[] aBooleanArray1774;
	static int[] anIntArray1775;
	static int[] anIntArray1776;
	float[] aFloatArray1777;
	int anInt1778;
	int anInt1779;
	static boolean aBoolean1780 = false;
	static float[] aFloatArray1781;
	int anInt1782;
	static float[] aFloatArray1783;
	static float[] aFloatArray1784;
	static float[] aFloatArray1785;
	static float[] aFloatArray1786;
	static float[] aFloatArray1787;
	static int[] anIntArray1788;
	boolean aBoolean1789;
	byte[][] aByteArrayArray1790;
	int anInt1791;
	static Class5[] aClass5Array1792;

	static void method607(final byte[] is, final int i) {
		aByteArray1765 = is;
		anInt1760 = i;
		anInt1767 = 0;
	}

	static int method608(int i) {
		int i_0_ = 0;
		int i_1_ = 0;
		int i_2_;
		for (/**/; i >= 8 - anInt1767; i -= i_2_) {
			i_2_ = 8 - anInt1767;
			final int i_3_ = (1 << i_2_) - 1;
			i_0_ += (aByteArray1765[anInt1760] >> anInt1767 & i_3_) << i_1_;
			anInt1767 = 0;
			anInt1760++;
			i_1_ += i_2_;
		}
		if (i > 0) {
			i_2_ = (1 << i) - 1;
			i_0_ += (aByteArray1765[anInt1760] >> anInt1767 & i_2_) << i_1_;
			anInt1767 += i;
		}
		return i_0_;
	}

	static boolean method609(final Js5 class63) {
		if (!aBoolean1780) {
			final byte[] var1 = class63.getFile(0, 0, -1916611817);
			if (var1 == null) {
				return false;
			}
			method610(var1);
			aBoolean1780 = true;
		}
		return true;
	}

	static void method610(final byte[] is) {
		method607(is, 0);
		anInt1768 = 1 << method608(4);
		anInt1769 = 1 << method608(4);
		aFloatArray1781 = new float[anInt1769];
		for (int i = 0; i < 2; i++) {
			final int i_4_ = i != 0 ? anInt1769 : anInt1768;
			final int i_5_ = i_4_ >> 1;
			final int i_6_ = i_4_ >> 2;
			final int i_7_ = i_4_ >> 3;
			final float[] fs = new float[i_5_];
			for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
				fs[2 * i_8_] = (float) Math.cos(4 * i_8_ * 3.141592653589793 / i_4_);
				fs[2 * i_8_ + 1] = -(float) Math.sin(4 * i_8_ * 3.141592653589793 / i_4_);
			}
			final float[] fs_9_ = new float[i_5_];
			for (int i_10_ = 0; i_10_ < i_6_; i_10_++) {
				fs_9_[2 * i_10_] = (float) Math.cos((2 * i_10_ + 1) * 3.141592653589793 / (2 * i_4_));
				fs_9_[2 * i_10_ + 1] = (float) Math.sin((2 * i_10_ + 1) * 3.141592653589793 / (2 * i_4_));
			}
			final float[] fs_11_ = new float[i_6_];
			for (int i_12_ = 0; i_12_ < i_7_; i_12_++) {
				fs_11_[2 * i_12_] = (float) Math.cos((4 * i_12_ + 2) * 3.141592653589793 / i_4_);
				fs_11_[2 * i_12_ + 1] = -(float) Math.sin((4 * i_12_ + 2) * 3.141592653589793 / i_4_);
			}
			final int[] is_13_ = new int[i_7_];
			final int i_14_ = Class28.method265(i_7_ - 1, -964762565);
			for (int i_15_ = 0; i_15_ < i_7_; i_15_++) {
				is_13_[i_15_] = IdkType.method733(i_15_, i_14_, (byte) 42);
			}
			if (i != 0) {
				aFloatArray1785 = fs;
				aFloatArray1786 = fs_9_;
				aFloatArray1787 = fs_11_;
				anIntArray1776 = is_13_;
			} else {
				aFloatArray1764 = fs;
				aFloatArray1783 = fs_9_;
				aFloatArray1784 = fs_11_;
				anIntArray1788 = is_13_;
			}
		}
		final int i = method608(8) + 1;
		aClass11Array1770 = new Class11[i];
		for (int i_16_ = 0; i_16_ < i; i_16_++) {
			aClass11Array1770[i_16_] = new Class11();
		}
		int i_17_ = method608(6) + 1;
		for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
			method608(16);
		}
		i_17_ = method608(6) + 1;
		aClass5Array1792 = new Class5[i_17_];
		for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
			aClass5Array1792[i_19_] = new Class5();
		}
		final int i_20_ = method608(6) + 1;
		aClass10Array1772 = new Class10[i_20_];
		for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
			aClass10Array1772[i_21_] = new Class10();
		}
		final int i_22_ = method608(6) + 1;
		aClass3Array1773 = new Class3[i_22_];
		for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
			aClass3Array1773[i_23_] = new Class3();
		}
		final int i_24_ = method608(6) + 1;
		aBooleanArray1774 = new boolean[i_24_];
		anIntArray1775 = new int[i_24_];
		for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
			aBooleanArray1774[i_25_] = method616() != 0;
			method608(16);
			method608(16);
			anIntArray1775[i_25_] = method608(8);
		}
	}

	float[] method611(final int i) {
		method607(this.aByteArrayArray1790[i], 0);
		method616();
		final int i_26_ = method608(Class28.method265(anIntArray1775.length - 1, -1506013643));
		final boolean bool = aBooleanArray1774[i_26_];
		final int i_27_ = bool ? anInt1769 : anInt1768;
		boolean bool_28_ = false;
		boolean bool_29_ = false;
		if (bool) {
			bool_28_ = method616() != 0;
			bool_29_ = method616() != 0;
		}
		final int i_30_ = i_27_ >> 1;
		int i_31_;
		int i_32_;
		int i_33_;
		if (bool && !bool_28_) {
			i_31_ = (i_27_ >> 2) - (anInt1768 >> 2);
			i_32_ = (i_27_ >> 2) + (anInt1768 >> 2);
			i_33_ = anInt1768 >> 1;
		} else {
			i_31_ = 0;
			i_32_ = i_30_;
			i_33_ = i_27_ >> 1;
		}
		int i_34_;
		int i_35_;
		int i_36_;
		if (bool && !bool_29_) {
			i_34_ = i_27_ - (i_27_ >> 2) - (anInt1768 >> 2);
			i_35_ = i_27_ - (i_27_ >> 2) + (anInt1768 >> 2);
			i_36_ = anInt1768 >> 1;
		} else {
			i_34_ = i_30_;
			i_35_ = i_27_;
			i_36_ = i_27_ >> 1;
		}
		final Class3 class3 = aClass3Array1773[anIntArray1775[i_26_]];
		final int i_37_ = class3.anInt49;
		int i_38_ = class3.anIntArray50[i_37_];
		final boolean bool_39_ = !aClass5Array1792[i_38_].method106();
		final boolean bool_40_ = bool_39_;
		for (i_38_ = 0; i_38_ < class3.anInt48; i_38_++) {
			final Class10 class10 = aClass10Array1772[class3.anIntArray47[i_38_]];
			final float[] fs = aFloatArray1781;
			class10.method163(fs, i_27_ >> 1, bool_40_);
		}
		if (!bool_39_) {
			i_38_ = class3.anInt49;
			final int i_41_ = class3.anIntArray50[i_38_];
			aClass5Array1792[i_41_].method105(aFloatArray1781, i_27_ >> 1);
		}
		if (bool_39_) {
			for (i_38_ = i_27_ >> 1; i_38_ < i_27_; i_38_++) {
				aFloatArray1781[i_38_] = 0.0F;
			}
		} else {
			i_38_ = i_27_ >> 1;
			final int i_42_ = i_27_ >> 2;
			final int i_43_ = i_27_ >> 3;
			final float[] fs = aFloatArray1781;
			for (int i_44_ = 0; i_44_ < i_38_; i_44_++) {
				fs[i_44_] *= 0.5F;
			}
			for (int i_45_ = i_38_; i_45_ < i_27_; i_45_++) {
				fs[i_45_] = -fs[i_27_ - i_45_ - 1];
			}
			final float[] fs_46_ = bool ? aFloatArray1785 : aFloatArray1764;
			final float[] fs_47_ = bool ? aFloatArray1786 : aFloatArray1783;
			final float[] fs_48_ = bool ? aFloatArray1787 : aFloatArray1784;
			final int[] is = bool ? anIntArray1776 : anIntArray1788;
			for (int i_49_ = 0; i_49_ < i_42_; i_49_++) {
				final float f = fs[4 * i_49_] - fs[i_27_ - 4 * i_49_ - 1];
				final float f_50_ = fs[4 * i_49_ + 2] - fs[i_27_ - 4 * i_49_ - 3];
				final float f_51_ = fs_46_[2 * i_49_];
				final float f_52_ = fs_46_[2 * i_49_ + 1];
				fs[i_27_ - 4 * i_49_ - 1] = f * f_51_ - f_50_ * f_52_;
				fs[i_27_ - 4 * i_49_ - 3] = f * f_52_ + f_50_ * f_51_;
			}
			for (int i_53_ = 0; i_53_ < i_43_; i_53_++) {
				final float f = fs[i_38_ + 3 + 4 * i_53_];
				final float f_54_ = fs[i_38_ + 1 + 4 * i_53_];
				final float f_55_ = fs[4 * i_53_ + 3];
				final float f_56_ = fs[4 * i_53_ + 1];
				fs[i_38_ + 3 + 4 * i_53_] = f + f_55_;
				fs[i_38_ + 1 + 4 * i_53_] = f_54_ + f_56_;
				final float f_57_ = fs_46_[i_38_ - 4 - 4 * i_53_];
				final float f_58_ = fs_46_[i_38_ - 3 - 4 * i_53_];
				fs[4 * i_53_ + 3] = (f - f_55_) * f_57_ - (f_54_ - f_56_) * f_58_;
				fs[4 * i_53_ + 1] = (f_54_ - f_56_) * f_57_ + (f - f_55_) * f_58_;
			}
			final int i_59_ = Class28.method265(i_27_ - 1, -325324276);
			for (int i_60_ = 0; i_60_ < i_59_ - 3; i_60_++) {
				final int i_61_ = i_27_ >> i_60_ + 2;
				final int i_62_ = 8 << i_60_;
				for (int i_63_ = 0; i_63_ < 2 << i_60_; i_63_++) {
					final int i_64_ = i_27_ - i_61_ * 2 * i_63_;
					final int i_65_ = i_27_ - i_61_ * (2 * i_63_ + 1);
					for (int i_66_ = 0; i_66_ < i_27_ >> i_60_ + 4; i_66_++) {
						final int i_67_ = 4 * i_66_;
						final float f = fs[i_64_ - 1 - i_67_];
						final float f_68_ = fs[i_64_ - 3 - i_67_];
						final float f_69_ = fs[i_65_ - 1 - i_67_];
						final float f_70_ = fs[i_65_ - 3 - i_67_];
						fs[i_64_ - 1 - i_67_] = f + f_69_;
						fs[i_64_ - 3 - i_67_] = f_68_ + f_70_;
						final float f_71_ = fs_46_[i_66_ * i_62_];
						final float f_72_ = fs_46_[i_66_ * i_62_ + 1];
						fs[i_65_ - 1 - i_67_] = (f - f_69_) * f_71_ - (f_68_ - f_70_) * f_72_;
						fs[i_65_ - 3 - i_67_] = (f_68_ - f_70_) * f_71_ + (f - f_69_) * f_72_;
					}
				}
			}
			for (int i_73_ = 1; i_73_ < i_43_ - 1; i_73_++) {
				final int i_74_ = is[i_73_];
				if (i_73_ < i_74_) {
					final int i_75_ = 8 * i_73_;
					final int i_76_ = 8 * i_74_;
					float f = fs[i_75_ + 1];
					fs[i_75_ + 1] = fs[i_76_ + 1];
					fs[i_76_ + 1] = f;
					f = fs[i_75_ + 3];
					fs[i_75_ + 3] = fs[i_76_ + 3];
					fs[i_76_ + 3] = f;
					f = fs[i_75_ + 5];
					fs[i_75_ + 5] = fs[i_76_ + 5];
					fs[i_76_ + 5] = f;
					f = fs[i_75_ + 7];
					fs[i_75_ + 7] = fs[i_76_ + 7];
					fs[i_76_ + 7] = f;
				}
			}
			for (int i_77_ = 0; i_77_ < i_38_; i_77_++) {
				fs[i_77_] = fs[2 * i_77_ + 1];
			}
			for (int i_78_ = 0; i_78_ < i_43_; i_78_++) {
				fs[i_27_ - 1 - 2 * i_78_] = fs[4 * i_78_];
				fs[i_27_ - 2 - 2 * i_78_] = fs[4 * i_78_ + 1];
				fs[i_27_ - i_42_ - 1 - 2 * i_78_] = fs[4 * i_78_ + 2];
				fs[i_27_ - i_42_ - 2 - 2 * i_78_] = fs[4 * i_78_ + 3];
			}
			for (int i_79_ = 0; i_79_ < i_43_; i_79_++) {
				final float f = fs_48_[2 * i_79_];
				final float f_80_ = fs_48_[2 * i_79_ + 1];
				final float f_81_ = fs[i_38_ + 2 * i_79_];
				final float f_82_ = fs[i_38_ + 2 * i_79_ + 1];
				final float f_83_ = fs[i_27_ - 2 - 2 * i_79_];
				final float f_84_ = fs[i_27_ - 1 - 2 * i_79_];
				float f_85_ = f_80_ * (f_81_ - f_83_) + f * (f_82_ + f_84_);
				fs[i_38_ + 2 * i_79_] = (f_81_ + f_83_ + f_85_) * 0.5F;
				fs[i_27_ - 2 - 2 * i_79_] = (f_81_ + f_83_ - f_85_) * 0.5F;
				f_85_ = f_80_ * (f_82_ + f_84_) - f * (f_81_ - f_83_);
				fs[i_38_ + 2 * i_79_ + 1] = (f_82_ - f_84_ + f_85_) * 0.5F;
				fs[i_27_ - 1 - 2 * i_79_] = (-f_82_ + f_84_ + f_85_) * 0.5F;
			}
			for (int i_86_ = 0; i_86_ < i_42_; i_86_++) {
				fs[i_86_] = fs[2 * i_86_ + i_38_] * fs_47_[2 * i_86_] + fs[2 * i_86_ + 1 + i_38_] * fs_47_[2 * i_86_ + 1];
				fs[i_38_ - 1 - i_86_] = fs[2 * i_86_ + i_38_] * fs_47_[2 * i_86_ + 1] - fs[2 * i_86_ + 1 + i_38_] * fs_47_[2 * i_86_];
			}
			for (int i_87_ = 0; i_87_ < i_42_; i_87_++) {
				fs[i_27_ - i_42_ + i_87_] = -fs[i_87_];
			}
			for (int i_88_ = 0; i_88_ < i_42_; i_88_++) {
				fs[i_88_] = fs[i_42_ + i_88_];
			}
			for (int i_89_ = 0; i_89_ < i_42_; i_89_++) {
				fs[i_42_ + i_89_] = -fs[i_42_ - i_89_ - 1];
			}
			for (int i_90_ = 0; i_90_ < i_42_; i_90_++) {
				fs[i_38_ + i_90_] = fs[i_27_ - i_90_ - 1];
			}
			for (int i_91_ = i_31_; i_91_ < i_32_; i_91_++) {
				final float f = (float) Math.sin((i_91_ - i_31_ + 0.5) / i_33_ * 0.5 * 3.141592653589793);
				aFloatArray1781[i_91_] *= (float) Math.sin(1.5707963267948966 * f * f);
			}
			for (int i_92_ = i_34_; i_92_ < i_35_; i_92_++) {
				final float f = (float) Math.sin((i_92_ - i_34_ + 0.5) / i_36_ * 0.5 * 3.141592653589793 + 1.5707963267948966);
				aFloatArray1781[i_92_] *= (float) Math.sin(1.5707963267948966 * f * f);
			}
		}
		float[] fs = null;
		if (this.anInt1766 > 0) {
			final int i_93_ = this.anInt1766 + i_27_ >> 2;
			fs = new float[i_93_];
			if (!this.aBoolean1759) {
				for (int i_94_ = 0; i_94_ < this.anInt1779; i_94_++) {
					final int i_95_ = (this.anInt1766 >> 1) + i_94_;
					fs[i_94_] += this.aFloatArray1777[i_95_];
				}
			}
			if (!bool_39_) {
				for (int i_96_ = i_31_; i_96_ < i_27_ >> 1; i_96_++) {
					final int i_97_ = fs.length - (i_27_ >> 1) + i_96_;
					fs[i_97_] += aFloatArray1781[i_96_];
				}
			}
		}
		final float[] fs_98_ = this.aFloatArray1777;
		this.aFloatArray1777 = aFloatArray1781;
		aFloatArray1781 = fs_98_;
		this.anInt1766 = i_27_;
		this.anInt1779 = i_35_ - (i_27_ >> 1);
		this.aBoolean1759 = bool_39_;
		return fs;
	}

	Class91_Sub4(final byte[] is) {
		method613(is);
	}

	Class91_Sub1_Sub1 method612(final int[] is) {
		if (is != null && is[0] <= 0) {
			return null;
		}
		if (this.aByteArray1771 == null) {
			this.anInt1766 = 0;
			this.aFloatArray1777 = new float[anInt1769];
			this.aByteArray1771 = new byte[this.anInt1761];
			this.anInt1782 = 0;
			this.anInt1778 = 0;
		}
		for (/**/; this.anInt1778 < this.aByteArrayArray1790.length; this.anInt1778++) {
			if (is != null && is[0] <= 0) {
				return null;
			}
			final float[] fs = method611(this.anInt1778);
			if (fs != null) {
				int i = this.anInt1782;
				int i_99_ = fs.length;
				if (i_99_ > this.anInt1761 - i) {
					i_99_ = this.anInt1761 - i;
				}
				for (int i_100_ = 0; i_100_ < i_99_; i_100_++) {
					int i_101_ = (int) (128.0F + fs[i_100_] * 128.0F);
					if ((i_101_ & ~0xff) != 0) {
						i_101_ = (i_101_ ^ 0xffffffff) >> 31;
					}
					this.aByteArray1771[i++] = (byte) (i_101_ - 128);
				}
				if (is != null) {
					is[0] -= i - this.anInt1782;
				}
				this.anInt1782 = i;
			}
		}
		this.aFloatArray1777 = null;
		final byte[] is_102_ = this.aByteArray1771;
		this.aByteArray1771 = null;
		return new Class91_Sub1_Sub1(this.anInt1791, is_102_, this.anInt1762, this.anInt1763, this.aBoolean1789);
	}

	void method613(final byte[] is) {
		final ByteBuffer class91_sub9 = new ByteBuffer(is);
		this.anInt1791 = class91_sub9.readDword();
		this.anInt1761 = class91_sub9.readDword();
		this.anInt1762 = class91_sub9.readDword();
		this.anInt1763 = class91_sub9.readDword();
		if (this.anInt1763 < 0) {
			this.anInt1763 = this.anInt1763 ^ 0xffffffff;
			this.aBoolean1789 = true;
		}
		final int i = class91_sub9.readDword();
		this.aByteArrayArray1790 = new byte[i][];
		for (int i_103_ = 0; i_103_ < i; i_103_++) {
			int i_104_ = 0;
			int i_105_;
			do {
				i_105_ = class91_sub9.readUnsignedByte();
				i_104_ += i_105_;
			} while (i_105_ >= 255);
			final byte[] is_106_ = new byte[i_104_];
			class91_sub9.method647(is_106_, 0, i_104_, 1897209964);
			this.aByteArrayArray1790[i_103_] = is_106_;
		}
	}

	static Class91_Sub4 method614(final Js5 class63, final int i, final int i_107_) {
		if (!method609(class63)) {
			class63.method399(i, i_107_, 1218792745);
			return null;
		}
		final byte[] is = class63.getFile(i, i_107_, -1922511016);
		return is == null ? null : new Class91_Sub4(is);
	}

	static float method615(final int i) {
		int i_108_ = i & 0x1fffff;
		final int i_109_ = i & ~0x7fffffff;
		final int i_110_ = (i & 0x7fe00000) >> 21;
		if (i_109_ != 0) {
			i_108_ = -i_108_;
		}
		return (float) (i_108_ * Math.pow(2.0, i_110_ - 788));
	}

	static int method616() {
		final int i = aByteArray1765[anInt1760] >> anInt1767 & 0x1;
		anInt1767++;
		anInt1760 += anInt1767 >> 3;
		anInt1767 &= 0x7;
		return i;
	}
}
