/* Class91_Sub20_Sub13_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class91_Sub20_Sub13_Sub4 extends Class91_Sub20_Sub13 {
	byte[] aByteArray2560;
	static int anInt2561 = 0;
	int[] anIntArray2562;
	int[] anIntArray2563;
	int[] anIntArray2564;
	static int anInt2565 = -1;
	byte[][] aByteArrayArray2566;
	int anInt2567;
	int anInt2568;
	public static Class91_Sub20_Sub13_Sub1[] aClass91_Sub20_Sub13_Sub1Array2569;
	static int anInt2570 = 256;
	static int anInt2571 = -1;
	static int anInt2572 = -1;
	static int anInt2573 = -1;
	int[] anIntArray2574;
	static int anInt2575 = 0;
	static int anInt2576 = 0;
	static String[] aStringArray2577 = new String[100];
	static int anInt2578 = 0;
	int[] anIntArray2579;
	static Random aRandom2580 = new Random();
	public int anInt2581;

	Class91_Sub20_Sub13_Sub4(final byte[] is) {
		this.aByteArrayArray2566 = new byte[256][];
		anInt2581 = 0;
		method914(is);
	}

	abstract void method886(byte[] is, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_);

	static int method887(final byte[][] is, final byte[][] is_5_, final int[] is_6_, final int[] is_7_, final int[] is_8_, final int i, final int i_9_) {
		final int i_10_ = is_6_[i];
		final int i_11_ = i_10_ + is_8_[i];
		final int i_12_ = is_6_[i_9_];
		final int i_13_ = i_12_ + is_8_[i_9_];
		int i_14_ = i_10_;
		if (i_12_ > i_10_) {
			i_14_ = i_12_;
		}
		int i_15_ = i_11_;
		if (i_13_ < i_11_) {
			i_15_ = i_13_;
		}
		int i_16_ = is_7_[i];
		if (is_7_[i_9_] < i_16_) {
			i_16_ = is_7_[i_9_];
		}
		final byte[] is_17_ = is_5_[i];
		final byte[] is_18_ = is[i_9_];
		int i_19_ = i_14_ - i_10_;
		int i_20_ = i_14_ - i_12_;
		for (int i_21_ = i_14_; i_21_ < i_15_; i_21_++) {
			final int var19 = is_17_[i_19_++] + is_18_[i_20_++];
			if (var19 < i_16_) {
				i_16_ = var19;
			}
		}
		return -i_16_;
	}

	int method888(char c) {
		if (c == '\u00a0') {
			c = ' ';
		}
		return this.anIntArray2574[Class91_Sub20_Sub2.method742(c, (byte) -113) & 0xff];
	}

	public int method889(final String string) {
		if (string == null) {
			return 0;
		}
		int i = -1;
		int i_22_ = -1;
		int i_23_ = 0;
		for (int i_24_ = 0; i_24_ < string.length(); i_24_++) {
			char c = string.charAt(i_24_);
			if (c == 60) {
				i = i_24_;
			} else {
				if (c == 62 && i != -1) {
					final String string_25_ = string.substring(i + 1, i_24_);
					i = -1;
					if (string_25_.equals("lt")) {
						c = '<';
					} else {
						if (!string_25_.equals("gt")) {
							if (string_25_.startsWith("img=")) {
								try {
									final String string_26_ = string_25_.substring(4);
									final int var8 = Class40.method340(string_26_, 10, true, -2005995539);
									i_23_ += aClass91_Sub20_Sub13_Sub1Array2569[var8].anInt2521;
									i_22_ = -1;
								} catch (final Exception exception) {
									/* empty */
								}
							}
							continue;
						}
						c = '>';
					}
				}
				if (c == 160) {
					c = ' ';
				}
				if (i == -1) {
					i_23_ += this.anIntArray2574[(char) (Class91_Sub20_Sub2.method742(c, (byte) -22) & 0xff)];
					if (this.aByteArray2560 != null && i_22_ != -1) {
						i_23_ += this.aByteArray2560[(i_22_ << 8) + c];
					}
					i_22_ = c;
				}
			}
		}
		return i_23_;
	}

	int method890(final String string, final int[] is, final String[] strings) {
		if (string == null) {
			return 0;
		}
		int i = 0;
		int i_27_ = 0;
		final StringBuilder stringbuilder = new StringBuilder(100);
		int i_28_ = -1;
		int i_29_ = 0;
		int i_30_ = 0;
		int i_31_ = -1;
		int i_32_ = 0;
		int i_33_ = 0;
		final int i_34_ = string.length();
		for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
			char c = string.charAt(i_35_);
			if (c == 60) {
				i_31_ = i_35_;
			} else {
				if (c == 62 && i_31_ != -1) {
					final String string_36_ = string.substring(i_31_ + 1, i_35_);
					i_31_ = -1;
					stringbuilder.append('<');
					stringbuilder.append(string_36_);
					stringbuilder.append('>');
					if (string_36_.equals("br")) {
						strings[i_33_] = stringbuilder.toString().substring(i_27_, stringbuilder.length());
						i_33_++;
						i_27_ = stringbuilder.length();
						i = 0;
						i_28_ = -1;
						i_32_ = 0;
					} else if (string_36_.equals("lt")) {
						i += method888('<');
						if (this.aByteArray2560 != null && i_32_ != -1) {
							i += this.aByteArray2560[(i_32_ << 8) + 60];
						}
						i_32_ = 60;
					} else if (string_36_.equals("gt")) {
						i += method888('>');
						if (this.aByteArray2560 != null && i_32_ != -1) {
							i += this.aByteArray2560[(i_32_ << 8) + 62];
						}
						i_32_ = 62;
					} else if (string_36_.startsWith("img=")) {
						try {
							final String string_37_ = string_36_.substring(4);
							final int i_38_ = Class40.method340(string_37_, 10, true, -2005995539);
							i += aClass91_Sub20_Sub13_Sub1Array2569[i_38_].anInt2521;
							i_32_ = 0;
						} catch (final Exception exception) {
							/* empty */
						}
					}
					c = '\0';
				}
				if (i_31_ == -1) {
					if (c != -1) {
						stringbuilder.append(c);
						i += method888(c);
						if (this.aByteArray2560 != null && i_32_ != -1) {
							i += this.aByteArray2560[(i_32_ << 8) + c];
						}
						i_32_ = c;
					}
					if (c == 32) {
						i_28_ = stringbuilder.length();
						i_29_ = i;
						i_30_ = 1;
					}
					if (is != null && i > is[i_33_ < is.length ? i_33_ : is.length - 1] && i_28_ >= 0) {
						strings[i_33_] = stringbuilder.toString().substring(i_27_, i_28_ - i_30_);
						i_33_++;
						i_27_ = i_28_;
						i_28_ = -1;
						i -= i_29_;
						i_32_ = 0;
					}
					if (c == 45) {
						i_28_ = stringbuilder.length();
						i_29_ = i;
						i_30_ = 0;
					}
				}
			}
		}
		final String string_39_ = stringbuilder.toString();
		if (string_39_.length() > i_27_) {
			strings[i_33_++] = string_39_.substring(i_27_, string_39_.length());
		}
		return i_33_;
	}

	public int method891(final String string, final int i) {
		final int i_40_ = method890(string, new int[] { i }, aStringArray2577);
		int i_41_ = 0;
		for (int i_42_ = 0; i_42_ < i_40_; i_42_++) {
			final int var6 = method889(aStringArray2577[i_42_]);
			if (var6 > i_41_) {
				i_41_ = var6;
			}
		}
		return i_41_;
	}

	public static String method892(final String string) {
		final int i = string.length();
		int i_43_ = 0;
		for (int i_44_ = 0; i_44_ < i; i_44_++) {
			final char c = string.charAt(i_44_);
			if (c == '<' || c == '>') {
				i_43_ += 3;
			}
		}
		final StringBuilder stringbuilder = new StringBuilder(i + i_43_);
		for (int i_45_ = 0; i_45_ < i; i_45_++) {
			final char var5 = string.charAt(i_45_);
			if (var5 == '<') {
				stringbuilder.append("<lt>");
			} else if (var5 == '>') {
				stringbuilder.append("<gt>");
			} else {
				stringbuilder.append(var5);
			}
		}
		return stringbuilder.toString();
	}

	public void method893(final String string, final int i, final int i_46_, final int i_47_, final int i_48_) {
		if (string != null) {
			method898(i_47_, i_48_);
			method900(string, i - method889(string), i_46_);
		}
	}

	public int method894(final String string, final int i, final int i_49_, final int i_50_, final int i_51_, final int i_52_, final int i_53_, final int i_54_, int i_55_, int i_56_) {
		if (string == null) {
			return 0;
		}
		method898(i_52_, i_53_);
		if (i_56_ == 0) {
			i_56_ = anInt2581;
		}
		int[] is = { i_50_ };
		if (i_51_ < this.anInt2567 + this.anInt2568 + i_56_ && i_51_ < i_56_ + i_56_) {
			is = null;
		}
		final int i_57_ = method890(string, is, aStringArray2577);
		if (i_55_ == 3 && i_57_ == 1) {
			i_55_ = 1;
		}
		int i_58_;
		if (i_55_ == 0) {
			i_58_ = i_49_ + this.anInt2567;
		} else if (i_55_ == 1) {
			i_58_ = i_49_ + this.anInt2567 + (i_51_ - this.anInt2567 - this.anInt2568 - (i_57_ - 1) * i_56_) / 2;
		} else if (i_55_ == 2) {
			i_58_ = i_49_ + i_51_ - this.anInt2568 - (i_57_ - 1) * i_56_;
		} else {
			int i_59_ = (i_51_ - this.anInt2567 - this.anInt2568 - (i_57_ - 1) * i_56_) / (i_57_ + 1);
			if (i_59_ < 0) {
				i_59_ = 0;
			}
			i_58_ = i_49_ + this.anInt2567 + i_59_;
			i_56_ += i_59_;
		}
		for (int i_60_ = 0; i_60_ < i_57_; i_60_++) {
			if (i_54_ == 0) {
				method900(aStringArray2577[i_60_], i, i_58_);
			} else if (i_54_ == 1) {
				method900(aStringArray2577[i_60_], i + (i_50_ - method889(aStringArray2577[i_60_])) / 2, i_58_);
			} else if (i_54_ == 2) {
				method900(aStringArray2577[i_60_], i + i_50_ - method889(aStringArray2577[i_60_]), i_58_);
			} else if (i_60_ == i_57_ - 1) {
				method900(aStringArray2577[i_60_], i, i_58_);
			} else {
				method910(aStringArray2577[i_60_], i_50_);
				method900(aStringArray2577[i_60_], i, i_58_);
				anInt2578 = 0;
			}
			i_58_ += i_56_;
		}
		return i_57_;
	}

	public void method895(final String string, final int i, final int i_61_, final int i_62_, final int i_63_, final int i_64_) {
		if (string != null) {
			method898(i_62_, i_63_);
			final int[] is = new int[string.length()];
			final int[] is_65_ = new int[string.length()];
			for (int i_66_ = 0; i_66_ < string.length(); i_66_++) {
				is[i_66_] = (int) (Math.sin(i_66_ / 5.0 + i_64_ / 5.0) * 5.0);
				is_65_[i_66_] = (int) (Math.sin(i_66_ / 3.0 + i_64_ / 5.0) * 5.0);
			}
			method907(string, i - method889(string) / 2, i_61_, is, is_65_);
		}
	}

	public void method896(final String string, final int i, final int i_67_, final int i_68_, final int i_69_, final int i_70_, final int i_71_) {
		if (string != null) {
			method898(i_68_, i_69_);
			double d = 7.0 - i_71_ / 8.0;
			if (d < 0.0) {
				d = 0.0;
			}
			final int[] is = new int[string.length()];
			for (int i_72_ = 0; i_72_ < string.length(); i_72_++) {
				is[i_72_] = (int) (Math.sin(i_72_ / 1.5 + i_70_ / 1.0) * d);
			}
			method907(string, i - method889(string) / 2, i_67_, null, is);
		}
	}

	public void method897(final String string, final int i, final int i_73_, final int i_74_, final int i_75_, final int i_76_) {
		if (string != null) {
			method898(i_74_, i_75_);
			aRandom2580.setSeed(i_76_);
			anInt2570 = 192 + (aRandom2580.nextInt() & 0x1f);
			final int[] is = new int[string.length()];
			int i_77_ = 0;
			for (int i_78_ = 0; i_78_ < string.length(); i_78_++) {
				is[i_78_] = i_77_;
				if ((aRandom2580.nextInt() & 0x3) == 0) {
					i_77_++;
				}
			}
			method907(string, i, i_73_, is, null);
		}
	}

	void method898(final int i, final int i_79_) {
		anInt2571 = -1;
		anInt2572 = -1;
		anInt2573 = i_79_;
		anInt2565 = i_79_;
		anInt2575 = i;
		anInt2576 = i;
		anInt2570 = 256;
		anInt2578 = 0;
		anInt2561 = 0;
	}

	void method899(final String string) {
		try {
			if (string.startsWith("col=")) {
				anInt2576 = Class23.method212(string.substring(4), 16, -1320780519);
			} else if (string.equals("/col")) {
				anInt2576 = anInt2575;
			} else if (string.startsWith("str=")) {
				anInt2571 = Class23.method212(string.substring(4), 16, -1274261075);
			} else if (string.equals("str")) {
				anInt2571 = 8388608;
			} else if (string.equals("/str")) {
				anInt2571 = -1;
			} else if (string.startsWith("u=")) {
				anInt2572 = Class23.method212(string.substring(2), 16, -716465194);
			} else if (string.equals("u")) {
				anInt2572 = 0;
			} else if (string.equals("/u")) {
				anInt2572 = -1;
			} else if (string.startsWith("shad=")) {
				anInt2565 = Class23.method212(string.substring(5), 16, -316463283);
			} else if (string.equals("shad")) {
				anInt2565 = 0;
			} else if (string.equals("/shad")) {
				anInt2565 = anInt2573;
			} else if (string.equals("br")) {
				method898(anInt2575, anInt2573);
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	Class91_Sub20_Sub13_Sub4(final byte[] is, final int[] is_80_, final int[] is_81_, final int[] is_82_, final int[] is_83_, final int[] is_84_, final byte[][] is_85_) {
		this.aByteArrayArray2566 = new byte[256][];
		anInt2581 = 0;
		this.anIntArray2564 = is_80_;
		this.anIntArray2579 = is_81_;
		this.anIntArray2562 = is_82_;
		this.anIntArray2563 = is_83_;
		method914(is);
		this.aByteArrayArray2566 = is_85_;
		int i = 2147483647;
		int i_86_ = -2147483648;
		for (int i_87_ = 0; i_87_ < 256; i_87_++) {
			if (this.anIntArray2579[i_87_] < i && this.anIntArray2563[i_87_] != 0) {
				i = this.anIntArray2579[i_87_];
			}
			if (this.anIntArray2579[i_87_] + this.anIntArray2563[i_87_] > i_86_) {
				i_86_ = this.anIntArray2579[i_87_] + this.anIntArray2563[i_87_];
			}
		}
		this.anInt2567 = anInt2581 - i;
		this.anInt2568 = i_86_ - anInt2581;
	}

	void method900(final String string, int i, int i_88_) {
		i_88_ -= anInt2581;
		int i_89_ = -1;
		int i_90_ = -1;
		for (int i_91_ = 0; i_91_ < string.length(); i_91_++) {
			if (string.charAt(i_91_) != 0) {
				int i_92_ = (char) (Class91_Sub20_Sub2.method742(string.charAt(i_91_), (byte) 26) & 0xff);
				if (i_92_ == 60) {
					i_89_ = i_91_;
				} else {
					if (i_92_ == 62 && i_89_ != -1) {
						final String string_93_ = string.substring(i_89_ + 1, i_91_);
						i_89_ = -1;
						if (string_93_.equals("lt")) {
							i_92_ = 60;
						} else {
							if (!string_93_.equals("gt")) {
								if (string_93_.startsWith("img=")) {
									try {
										final String string_94_ = string_93_.substring(4);
										final int i_95_ = Class40.method340(string_94_, 10, true, -2005995539);
										final Class91_Sub20_Sub13_Sub1 class91_sub20_sub13_sub1 = aClass91_Sub20_Sub13_Sub1Array2569[i_95_];
										class91_sub20_sub13_sub1.method840(i, i_88_ + anInt2581 - class91_sub20_sub13_sub1.anInt2522);
										i += class91_sub20_sub13_sub1.anInt2521;
										i_90_ = -1;
									} catch (final Exception exception) {
										/* empty */
									}
								} else {
									method899(string_93_);
								}
								continue;
							}
							i_92_ = 62;
						}
					}
					if (i_92_ == 160) {
						i_92_ = 32;
					}
					if (i_89_ == -1) {
						if (this.aByteArray2560 != null && i_90_ != -1) {
							i += this.aByteArray2560[(i_90_ << 8) + i_92_];
						}
						final int i_96_ = this.anIntArray2562[i_92_];
						final int i_97_ = this.anIntArray2563[i_92_];
						if (i_92_ != 32) {
							if (anInt2570 == 256) {
								if (anInt2565 != -1) {
									method902(this.aByteArrayArray2566[i_92_], i + this.anIntArray2564[i_92_] + 1, i_88_ + this.anIntArray2579[i_92_] + 1, i_96_, i_97_, anInt2565);
								}
								method911(this.aByteArrayArray2566[i_92_], i + this.anIntArray2564[i_92_], i_88_ + this.anIntArray2579[i_92_], i_96_, i_97_, anInt2576);
							} else {
								if (anInt2565 != -1) {
									method904(this.aByteArrayArray2566[i_92_], i + this.anIntArray2564[i_92_] + 1, i_88_ + this.anIntArray2579[i_92_] + 1, i_96_, i_97_, anInt2565, anInt2570);
								}
								method901(this.aByteArrayArray2566[i_92_], i + this.anIntArray2564[i_92_], i_88_ + this.anIntArray2579[i_92_], i_96_, i_97_, anInt2576, anInt2570);
							}
						} else if (anInt2578 > 0) {
							anInt2561 += anInt2578;
							i += anInt2561 >> 8;
							anInt2561 &= 0xff;
						}
						final int var10 = this.anIntArray2574[i_92_];
						if (anInt2571 != -1) {
							method829(i, i_88_ + (int) (anInt2581 * 0.7), var10, anInt2571);
						}
						if (anInt2572 != -1) {
							method829(i, i_88_ + anInt2581 + 1, var10, anInt2572);
						}
						i += var10;
						i_90_ = i_92_;
					}
				}
			}
		}
	}

	abstract void method901(byte[] is, int i, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_);

	static void method902(final byte[] is, int i, int i_103_, int i_104_, int i_105_, final int i_106_) {
		int i_107_ = i + i_103_ * anInt2483;
		int i_108_ = anInt2483 - i_104_;
		int i_109_ = 0;
		int i_110_ = 0;
		if (i_103_ < anInt2484) {
			final int var10 = anInt2484 - i_103_;
			i_105_ -= var10;
			i_103_ = anInt2484;
			i_110_ += var10 * i_104_;
			i_107_ += var10 * anInt2483;
		}
		if (i_103_ + i_105_ > anInt2480) {
			i_105_ -= i_103_ + i_105_ - anInt2480;
		}
		if (i < anInt2485) {
			final int var10 = anInt2485 - i;
			i_104_ -= var10;
			i = anInt2485;
			i_110_ += var10;
			i_107_ += var10;
			i_109_ += var10;
			i_108_ += var10;
		}
		if (i + i_104_ > anInt2486) {
			final int var10 = i + i_104_ - anInt2486;
			i_104_ -= var10;
			i_109_ += var10;
			i_108_ += var10;
		}
		if (i_104_ > 0 && i_105_ > 0) {
			method903(anIntArray2481, is, i_106_, i_110_, i_107_, i_104_, i_105_, i_108_, i_109_);
		}
	}

	static void method903(final int[] is, final byte[] is_111_, final int i, int i_112_, int i_113_, int i_114_, final int i_115_, final int i_116_, final int i_117_) {
		final int i_118_ = -(i_114_ >> 2);
		i_114_ = -(i_114_ & 0x3);
		for (int i_119_ = -i_115_; i_119_ < 0; i_119_++) {
			for (int i_120_ = i_118_; i_120_ < 0; i_120_++) {
				if (is_111_[i_112_++] != 0) {
					is[i_113_++] = i;
				} else {
					i_113_++;
				}
				if (is_111_[i_112_++] != 0) {
					is[i_113_++] = i;
				} else {
					i_113_++;
				}
				if (is_111_[i_112_++] != 0) {
					is[i_113_++] = i;
				} else {
					i_113_++;
				}
				if (is_111_[i_112_++] != 0) {
					is[i_113_++] = i;
				} else {
					i_113_++;
				}
			}
			for (int i_121_ = i_114_; i_121_ < 0; i_121_++) {
				if (is_111_[i_112_++] != 0) {
					is[i_113_++] = i;
				} else {
					i_113_++;
				}
			}
			i_113_ += i_116_;
			i_112_ += i_117_;
		}
	}

	static void method904(final byte[] is, int i, int i_122_, int i_123_, int i_124_, final int i_125_, final int i_126_) {
		int i_127_ = i + i_122_ * anInt2483;
		int i_128_ = anInt2483 - i_123_;
		int i_129_ = 0;
		int i_130_ = 0;
		if (i_122_ < anInt2484) {
			final int var11 = anInt2484 - i_122_;
			i_124_ -= var11;
			i_122_ = anInt2484;
			i_130_ += var11 * i_123_;
			i_127_ += var11 * anInt2483;
		}
		if (i_122_ + i_124_ > anInt2480) {
			i_124_ -= i_122_ + i_124_ - anInt2480;
		}
		if (i < anInt2485) {
			final int var11 = anInt2485 - i;
			i_123_ -= var11;
			i = anInt2485;
			i_130_ += var11;
			i_127_ += var11;
			i_129_ += var11;
			i_128_ += var11;
		}
		if (i + i_123_ > anInt2486) {
			final int var11 = i + i_123_ - anInt2486;
			i_123_ -= var11;
			i_129_ += var11;
			i_128_ += var11;
		}
		if (i_123_ > 0 && i_124_ > 0) {
			method905(anIntArray2481, is, i_125_, i_130_, i_127_, i_123_, i_124_, i_128_, i_129_, i_126_);
		}
	}

	static void method905(final int[] is, final byte[] is_131_, int i, int i_132_, int i_133_, final int i_134_, final int i_135_, final int i_136_, final int i_137_, int i_138_) {
		i = ((i & 0xff00ff) * i_138_ & ~0xff00ff) + ((i & 0xff00) * i_138_ & 0xff0000) >> 8;
		i_138_ = 256 - i_138_;
		for (int i_139_ = -i_135_; i_139_ < 0; i_139_++) {
			for (int i_140_ = -i_134_; i_140_ < 0; i_140_++) {
				if (is_131_[i_132_++] != 0) {
					final int i_141_ = is[i_133_];
					is[i_133_++] = (((i_141_ & 0xff00ff) * i_138_ & ~0xff00ff) + ((i_141_ & 0xff00) * i_138_ & 0xff0000) >> 8) + i;
				} else {
					i_133_++;
				}
			}
			i_133_ += i_136_;
			i_132_ += i_137_;
		}
	}

	public void method906(final String string, final int i, final int i_142_, final int i_143_, final int i_144_) {
		if (string != null) {
			method898(i_143_, i_144_);
			method900(string, i, i_142_);
		}
	}

	void method907(final String string, int i, int i_145_, final int[] is, final int[] is_146_) {
		i_145_ -= anInt2581;
		int i_147_ = -1;
		int i_148_ = -1;
		int i_149_ = 0;
		for (int i_150_ = 0; i_150_ < string.length(); i_150_++) {
			if (string.charAt(i_150_) != 0) {
				int i_151_ = (char) (Class91_Sub20_Sub2.method742(string.charAt(i_150_), (byte) 3) & 0xff);
				if (i_151_ == 60) {
					i_147_ = i_150_;
				} else {
					if (i_151_ == 62 && i_147_ != -1) {
						final String string_152_ = string.substring(i_147_ + 1, i_150_);
						i_147_ = -1;
						if (string_152_.equals("lt")) {
							i_151_ = 60;
						} else {
							if (!string_152_.equals("gt")) {
								if (string_152_.startsWith("img=")) {
									try {
										int i_153_;
										if (is != null) {
											i_153_ = is[i_149_];
										} else {
											i_153_ = 0;
										}
										int i_154_;
										if (is_146_ != null) {
											i_154_ = is_146_[i_149_];
										} else {
											i_154_ = 0;
										}
										i_149_++;
										final String string_155_ = string_152_.substring(4);
										final int i_156_ = Class40.method340(string_155_, 10, true, -2005995539);
										final Class91_Sub20_Sub13_Sub1 class91_sub20_sub13_sub1 = aClass91_Sub20_Sub13_Sub1Array2569[i_156_];
										class91_sub20_sub13_sub1.method840(i + i_153_, i_145_ + anInt2581 - class91_sub20_sub13_sub1.anInt2522 + i_154_);
										i += class91_sub20_sub13_sub1.anInt2521;
										i_148_ = -1;
									} catch (final Exception exception) {
										/* empty */
									}
								} else {
									method899(string_152_);
								}
								continue;
							}
							i_151_ = 62;
						}
					}
					if (i_151_ == 160) {
						i_151_ = 32;
					}
					if (i_147_ == -1) {
						if (this.aByteArray2560 != null && i_148_ != -1) {
							i += this.aByteArray2560[(i_148_ << 8) + i_151_];
						}
						final int i_157_ = this.anIntArray2562[i_151_];
						final int i_158_ = this.anIntArray2563[i_151_];
						int i_159_;
						if (is != null) {
							i_159_ = is[i_149_];
						} else {
							i_159_ = 0;
						}
						int i_160_;
						if (is_146_ != null) {
							i_160_ = is_146_[i_149_];
						} else {
							i_160_ = 0;
						}
						i_149_++;
						if (i_151_ != 32) {
							if (anInt2570 == 256) {
								if (anInt2565 != -1) {
									method902(this.aByteArrayArray2566[i_151_], i + this.anIntArray2564[i_151_] + 1 + i_159_, i_145_ + this.anIntArray2579[i_151_] + 1 + i_160_, i_157_, i_158_, anInt2565);
								}
								method911(this.aByteArrayArray2566[i_151_], i + this.anIntArray2564[i_151_] + i_159_, i_145_ + this.anIntArray2579[i_151_] + i_160_, i_157_, i_158_, anInt2576);
							} else {
								if (anInt2565 != -1) {
									method904(this.aByteArrayArray2566[i_151_], i + this.anIntArray2564[i_151_] + 1 + i_159_, i_145_ + this.anIntArray2579[i_151_] + 1 + i_160_, i_157_, i_158_, anInt2565, anInt2570);
								}
								method901(this.aByteArrayArray2566[i_151_], i + this.anIntArray2564[i_151_] + i_159_, i_145_ + this.anIntArray2579[i_151_] + i_160_, i_157_, i_158_, anInt2576, anInt2570);
							}
						} else if (anInt2578 > 0) {
							anInt2561 += anInt2578;
							i += anInt2561 >> 8;
							anInt2561 &= 0xff;
						}
						final int var15 = this.anIntArray2574[i_151_];
						if (anInt2571 != -1) {
							method829(i, i_145_ + (int) (anInt2581 * 0.7), var15, anInt2571);
						}
						if (anInt2572 != -1) {
							method829(i, i_145_ + anInt2581, var15, anInt2572);
						}
						i += var15;
						i_148_ = i_151_;
					}
				}
			}
		}
	}

	public void method908(final String string, final int i, final int i_161_, final int i_162_, final int i_163_, final int i_164_) {
		if (string != null) {
			method898(i_162_, i_163_);
			final int[] is = new int[string.length()];
			for (int i_165_ = 0; i_165_ < string.length(); i_165_++) {
				is[i_165_] = (int) (Math.sin(i_165_ / 2.0 + i_164_ / 5.0) * 5.0);
			}
			method907(string, i - method889(string) / 2, i_161_, null, is);
		}
	}

	abstract void method909(byte[] is, int i, int i_166_, int i_167_, int i_168_, int i_169_);

	void method910(final String string, final int i) {
		int i_170_ = 0;
		boolean bool = false;
		for (int i_171_ = 0; i_171_ < string.length(); i_171_++) {
			final char var6 = string.charAt(i_171_);
			if (var6 == '<') {
				bool = true;
			} else if (var6 == '>') {
				bool = false;
			} else if (!bool && var6 == ' ') {
				i_170_++;
			}
		}
		if (i_170_ > 0) {
			anInt2578 = (i - method889(string) << 8) / i_170_;
		}
	}

	abstract void method911(byte[] is, int i, int i_172_, int i_173_, int i_174_, int i_175_);

	public int method912(final String string, final int i) {
		return method890(string, new int[] { i }, aStringArray2577);
	}

	public void method913(final String string, final int i, final int i_176_, final int i_177_, final int i_178_) {
		if (string != null) {
			method898(i_177_, i_178_);
			method900(string, i - method889(string) / 2, i_176_);
		}
	}

	void method914(final byte[] is) {
		this.anIntArray2574 = new int[256];
		if (is.length == 257) {
			for (int i = 0; i < this.anIntArray2574.length; i++) {
				this.anIntArray2574[i] = is[i] & 0xff;
			}
			anInt2581 = is[256] & 0xff;
		} else {
			int i = 0;
			for (int i_179_ = 0; i_179_ < 256; i_179_++) {
				this.anIntArray2574[i_179_] = is[i++] & 0xff;
			}
			final int[] is_180_ = new int[256];
			final int[] is_181_ = new int[256];
			for (int i_182_ = 0; i_182_ < 256; i_182_++) {
				is_180_[i_182_] = is[i++] & 0xff;
			}
			for (int i_183_ = 0; i_183_ < 256; i_183_++) {
				is_181_[i_183_] = is[i++] & 0xff;
			}
			final byte[][] is_184_ = new byte[256][];
			for (int i_185_ = 0; i_185_ < 256; i_185_++) {
				is_184_[i_185_] = new byte[is_180_[i_185_]];
				byte i_186_ = 0;
				for (int i_187_ = 0; i_187_ < is_184_[i_185_].length; i_187_++) {
					i_186_ += is[i++];
					is_184_[i_185_][i_187_] = i_186_;
				}
			}
			final byte[][] is_188_ = new byte[256][];
			for (int i_189_ = 0; i_189_ < 256; i_189_++) {
				is_188_[i_189_] = new byte[is_180_[i_189_]];
				byte i_190_ = 0;
				for (int i_191_ = 0; i_191_ < is_188_[i_189_].length; i_191_++) {
					i_190_ += is[i++];
					is_188_[i_189_][i_191_] = i_190_;
				}
			}
			this.aByteArray2560 = new byte[65536];
			for (int i_192_ = 0; i_192_ < 256; i_192_++) {
				if (i_192_ != 32 && i_192_ != 160) {
					for (int i_193_ = 0; i_193_ < 256; i_193_++) {
						if (i_193_ != 32 && i_193_ != 160) {
							this.aByteArray2560[(i_192_ << 8) + i_193_] = (byte) method887(is_184_, is_188_, is_181_, this.anIntArray2574, is_180_, i_192_, i_193_);
						}
					}
				}
			}
			anInt2581 = is_181_[32] + is_180_[32];
		}
	}
}
