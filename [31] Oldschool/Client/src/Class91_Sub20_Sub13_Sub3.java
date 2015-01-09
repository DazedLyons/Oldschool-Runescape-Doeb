/* Class91_Sub20_Sub13_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public final class Class91_Sub20_Sub13_Sub3 extends Class91_Sub20_Sub13 {
	int anInt2548;
	int anInt2549;
	int anInt2550;
	static final int anInt2551 = 4095;
	int anInt2552;
	public int anInt2553;
	public int anInt2554;
	static final int anInt2555 = 4;
	static final int anInt2556 = 15;
	public int[] anIntArray2557;
	static final int anInt2558 = 12;
	static final int anInt2559 = 8;

	void method859(int i, int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_) {
		if (i_4_ != 0) {
			i -= this.anInt2549 << 4;
			i_0_ -= this.anInt2552 << 4;
			final double d = (i_3_ & 0xffff) * 9.587379924285257E-5;
			final int i_5_ = (int) Math.floor(Math.sin(d) * i_4_ + 0.5);
			final int i_6_ = (int) Math.floor(Math.cos(d) * i_4_ + 0.5);
			final int i_7_ = -i * i_6_ + -i_0_ * i_5_;
			final int i_8_ = --i * i_5_ + -i_0_ * i_6_;
			final int i_9_ = ((this.anInt2548 << 4) - i) * i_6_ + -i_0_ * i_5_;
			final int i_10_ = -((this.anInt2548 << 4) - i) * i_5_ + -i_0_ * i_6_;
			final int i_11_ = -i * i_6_ + ((this.anInt2550 << 4) - i_0_) * i_5_;
			final int i_12_ = --i * i_5_ + ((this.anInt2550 << 4) - i_0_) * i_6_;
			final int i_13_ = ((this.anInt2548 << 4) - i) * i_6_ + ((this.anInt2550 << 4) - i_0_) * i_5_;
			final int i_14_ = -((this.anInt2548 << 4) - i) * i_5_ + ((this.anInt2550 << 4) - i_0_) * i_6_;
			int i_15_;
			int i_16_;
			if (i_7_ < i_9_) {
				i_15_ = i_7_;
				i_16_ = i_9_;
			} else {
				i_15_ = i_9_;
				i_16_ = i_7_;
			}
			if (i_11_ < i_15_) {
				i_15_ = i_11_;
			}
			if (i_13_ < i_15_) {
				i_15_ = i_13_;
			}
			if (i_11_ > i_16_) {
				i_16_ = i_11_;
			}
			if (i_13_ > i_16_) {
				i_16_ = i_13_;
			}
			int i_17_;
			int i_18_;
			if (i_8_ < i_10_) {
				i_17_ = i_8_;
				i_18_ = i_10_;
			} else {
				i_17_ = i_10_;
				i_18_ = i_8_;
			}
			if (i_12_ < i_17_) {
				i_17_ = i_12_;
			}
			if (i_14_ < i_17_) {
				i_17_ = i_14_;
			}
			if (i_12_ > i_18_) {
				i_18_ = i_12_;
			}
			if (i_14_ > i_18_) {
				i_18_ = i_14_;
			}
			i_15_ >>= 12;
			i_16_ = i_16_ + 4095 >> 12;
			i_17_ >>= 12;
			i_18_ = i_18_ + 4095 >> 12;
			i_15_ += i_1_;
			i_16_ += i_1_;
			i_17_ += i_2_;
			i_18_ += i_2_;
			i_15_ >>= 4;
			i_16_ = i_16_ + 15 >> 4;
			i_17_ >>= 4;
			i_18_ = i_18_ + 15 >> 4;
			if (i_15_ < anInt2485) {
				i_15_ = anInt2485;
			}
			if (i_16_ > anInt2486) {
				i_16_ = anInt2486;
			}
			if (i_17_ < anInt2484) {
				i_17_ = anInt2484;
			}
			if (i_18_ > anInt2480) {
				i_18_ = anInt2480;
			}
			i_16_ = i_15_ - i_16_;
			if (i_16_ < 0) {
				i_18_ = i_17_ - i_18_;
				if (i_18_ < 0) {
					int i_19_ = i_17_ * anInt2483 + i_15_;
					final double d_20_ = 1.6777216E7 / i_4_;
					final int i_21_ = (int) Math.floor(Math.sin(d) * d_20_ + 0.5);
					final int i_22_ = (int) Math.floor(Math.cos(d) * d_20_ + 0.5);
					final int i_23_ = (i_15_ << 4) + 8 - i_1_;
					final int i_24_ = (i_17_ << 4) + 8 - i_2_;
					int i_25_ = (i << 8) - (i_24_ * i_21_ >> 4);
					int i_26_ = (i_0_ << 8) + (i_24_ * i_22_ >> 4);
					if (i_22_ == 0) {
						if (i_21_ == 0) {
							int i_27_ = i_18_;
							while (i_27_ < 0) {
								int i_28_ = i_19_;
								final int i_29_ = i_25_;
								final int i_30_ = i_26_;
								int var37 = i_16_;
								if (i_25_ >= 0 && i_26_ >= 0 && i_25_ - (this.anInt2548 << 12) < 0 && i_26_ - (this.anInt2550 << 12) < 0) {
									for (/**/; var37 < 0; var37++) {
										final int i_31_ = anIntArray2557[(i_30_ >> 12) * this.anInt2548 + (i_29_ >> 12)];
										if (i_31_ != 0) {
											anIntArray2481[i_28_++] = i_31_;
										} else {
											i_28_++;
										}
									}
								}
								i_27_++;
								i_19_ += anInt2483;
							}
						} else if (i_21_ < 0) {
							int i_32_ = i_18_;
							while (i_32_ < 0) {
								int i_33_ = i_19_;
								final int i_34_ = i_25_;
								int i_35_ = i_26_ + (i_23_ * i_21_ >> 4);
								int var37 = i_16_;
								if (i_25_ >= 0 && i_25_ - (this.anInt2548 << 12) < 0) {
									int i_36_;
									if ((i_36_ = i_35_ - (this.anInt2550 << 12)) >= 0) {
										i_36_ = (i_21_ - i_36_) / i_21_;
										var37 = i_16_ + i_36_;
										i_35_ += i_21_ * i_36_;
										i_33_ = i_19_ + i_36_;
									}
									if ((i_36_ = (i_35_ - i_21_) / i_21_) > var37) {
										var37 = i_36_;
									}
									for (/**/; var37 < 0; var37++) {
										final int i_37_ = anIntArray2557[(i_35_ >> 12) * this.anInt2548 + (i_34_ >> 12)];
										if (i_37_ != 0) {
											anIntArray2481[i_33_++] = i_37_;
										} else {
											i_33_++;
										}
										i_35_ += i_21_;
									}
								}
								i_32_++;
								i_25_ -= i_21_;
								i_19_ += anInt2483;
							}
						} else {
							int i_38_ = i_18_;
							while (i_38_ < 0) {
								int i_39_ = i_19_;
								final int i_40_ = i_25_;
								int i_41_ = i_26_ + (i_23_ * i_21_ >> 4);
								int var37 = i_16_;
								if (i_25_ >= 0 && i_25_ - (this.anInt2548 << 12) < 0) {
									if (i_41_ < 0) {
										final int i_42_ = (i_21_ - 1 - i_41_) / i_21_;
										var37 = i_16_ + i_42_;
										i_41_ += i_21_ * i_42_;
										i_39_ = i_19_ + i_42_;
									}
									int i_43_;
									if ((i_43_ = (1 + i_41_ - (this.anInt2550 << 12) - i_21_) / i_21_) > var37) {
										var37 = i_43_;
									}
									for (/**/; var37 < 0; var37++) {
										final int i_44_ = anIntArray2557[(i_41_ >> 12) * this.anInt2548 + (i_40_ >> 12)];
										if (i_44_ != 0) {
											anIntArray2481[i_39_++] = i_44_;
										} else {
											i_39_++;
										}
										i_41_ += i_21_;
									}
								}
								i_38_++;
								i_25_ -= i_21_;
								i_19_ += anInt2483;
							}
						}
					} else if (i_22_ < 0) {
						if (i_21_ == 0) {
							int i_45_ = i_18_;
							while (i_45_ < 0) {
								int i_46_ = i_19_;
								int i_47_ = i_25_ + (i_23_ * i_22_ >> 4);
								final int i_48_ = i_26_;
								int var37 = i_16_;
								if (i_26_ >= 0 && i_26_ - (this.anInt2550 << 12) < 0) {
									int i_49_;
									if ((i_49_ = i_47_ - (this.anInt2548 << 12)) >= 0) {
										i_49_ = (i_22_ - i_49_) / i_22_;
										var37 = i_16_ + i_49_;
										i_47_ += i_22_ * i_49_;
										i_46_ = i_19_ + i_49_;
									}
									if ((i_49_ = (i_47_ - i_22_) / i_22_) > var37) {
										var37 = i_49_;
									}
									for (/**/; var37 < 0; var37++) {
										final int i_50_ = anIntArray2557[(i_48_ >> 12) * this.anInt2548 + (i_47_ >> 12)];
										if (i_50_ != 0) {
											anIntArray2481[i_46_++] = i_50_;
										} else {
											i_46_++;
										}
										i_47_ += i_22_;
									}
								}
								i_45_++;
								i_26_ += i_22_;
								i_19_ += anInt2483;
							}
						} else if (i_21_ < 0) {
							int i_51_ = i_18_;
							while (i_51_ < 0) {
								int i_52_ = i_19_;
								int i_53_ = i_25_ + (i_23_ * i_22_ >> 4);
								int i_54_ = i_26_ + (i_23_ * i_21_ >> 4);
								int var37 = i_16_;
								int i_55_;
								if ((i_55_ = i_53_ - (this.anInt2548 << 12)) >= 0) {
									i_55_ = (i_22_ - i_55_) / i_22_;
									var37 = i_16_ + i_55_;
									i_53_ += i_22_ * i_55_;
									i_54_ += i_21_ * i_55_;
									i_52_ = i_19_ + i_55_;
								}
								if ((i_55_ = (i_53_ - i_22_) / i_22_) > var37) {
									var37 = i_55_;
								}
								if ((i_55_ = i_54_ - (this.anInt2550 << 12)) >= 0) {
									i_55_ = (i_21_ - i_55_) / i_21_;
									var37 += i_55_;
									i_53_ += i_22_ * i_55_;
									i_54_ += i_21_ * i_55_;
									i_52_ += i_55_;
								}
								if ((i_55_ = (i_54_ - i_21_) / i_21_) > var37) {
									var37 = i_55_;
								}
								for (/**/; var37 < 0; var37++) {
									final int i_56_ = anIntArray2557[(i_54_ >> 12) * this.anInt2548 + (i_53_ >> 12)];
									if (i_56_ != 0) {
										anIntArray2481[i_52_++] = i_56_;
									} else {
										i_52_++;
									}
									i_53_ += i_22_;
									i_54_ += i_21_;
								}
								i_51_++;
								i_25_ -= i_21_;
								i_26_ += i_22_;
								i_19_ += anInt2483;
							}
						} else {
							int i_57_ = i_18_;
							while (i_57_ < 0) {
								int i_58_ = i_19_;
								int i_59_ = i_25_ + (i_23_ * i_22_ >> 4);
								int i_60_ = i_26_ + (i_23_ * i_21_ >> 4);
								int var37 = i_16_;
								int i_61_;
								if ((i_61_ = i_59_ - (this.anInt2548 << 12)) >= 0) {
									i_61_ = (i_22_ - i_61_) / i_22_;
									var37 = i_16_ + i_61_;
									i_59_ += i_22_ * i_61_;
									i_60_ += i_21_ * i_61_;
									i_58_ = i_19_ + i_61_;
								}
								if ((i_61_ = (i_59_ - i_22_) / i_22_) > var37) {
									var37 = i_61_;
								}
								if (i_60_ < 0) {
									i_61_ = (i_21_ - 1 - i_60_) / i_21_;
									var37 += i_61_;
									i_59_ += i_22_ * i_61_;
									i_60_ += i_21_ * i_61_;
									i_58_ += i_61_;
								}
								if ((i_61_ = (1 + i_60_ - (this.anInt2550 << 12) - i_21_) / i_21_) > var37) {
									var37 = i_61_;
								}
								for (/**/; var37 < 0; var37++) {
									final int i_62_ = anIntArray2557[(i_60_ >> 12) * this.anInt2548 + (i_59_ >> 12)];
									if (i_62_ != 0) {
										anIntArray2481[i_58_++] = i_62_;
									} else {
										i_58_++;
									}
									i_59_ += i_22_;
									i_60_ += i_21_;
								}
								i_57_++;
								i_25_ -= i_21_;
								i_26_ += i_22_;
								i_19_ += anInt2483;
							}
						}
					} else if (i_21_ == 0) {
						int i_63_ = i_18_;
						while (i_63_ < 0) {
							int i_64_ = i_19_;
							int i_65_ = i_25_ + (i_23_ * i_22_ >> 4);
							final int i_66_ = i_26_;
							int var37 = i_16_;
							if (i_26_ >= 0 && i_26_ - (this.anInt2550 << 12) < 0) {
								if (i_65_ < 0) {
									final int i_67_ = (i_22_ - 1 - i_65_) / i_22_;
									var37 = i_16_ + i_67_;
									i_65_ += i_22_ * i_67_;
									i_64_ = i_19_ + i_67_;
								}
								int i_68_;
								if ((i_68_ = (1 + i_65_ - (this.anInt2548 << 12) - i_22_) / i_22_) > var37) {
									var37 = i_68_;
								}
								for (/**/; var37 < 0; var37++) {
									final int i_69_ = anIntArray2557[(i_66_ >> 12) * this.anInt2548 + (i_65_ >> 12)];
									if (i_69_ != 0) {
										anIntArray2481[i_64_++] = i_69_;
									} else {
										i_64_++;
									}
									i_65_ += i_22_;
								}
							}
							i_63_++;
							i_26_ += i_22_;
							i_19_ += anInt2483;
						}
					} else if (i_21_ < 0) {
						int i_70_ = i_18_;
						while (i_70_ < 0) {
							int i_71_ = i_19_;
							int i_72_ = i_25_ + (i_23_ * i_22_ >> 4);
							int i_73_ = i_26_ + (i_23_ * i_21_ >> 4);
							int var37 = i_16_;
							if (i_72_ < 0) {
								final int i_74_ = (i_22_ - 1 - i_72_) / i_22_;
								var37 = i_16_ + i_74_;
								i_72_ += i_22_ * i_74_;
								i_73_ += i_21_ * i_74_;
								i_71_ = i_19_ + i_74_;
							}
							int i_75_;
							if ((i_75_ = (1 + i_72_ - (this.anInt2548 << 12) - i_22_) / i_22_) > var37) {
								var37 = i_75_;
							}
							if ((i_75_ = i_73_ - (this.anInt2550 << 12)) >= 0) {
								i_75_ = (i_21_ - i_75_) / i_21_;
								var37 += i_75_;
								i_72_ += i_22_ * i_75_;
								i_73_ += i_21_ * i_75_;
								i_71_ += i_75_;
							}
							if ((i_75_ = (i_73_ - i_21_) / i_21_) > var37) {
								var37 = i_75_;
							}
							for (/**/; var37 < 0; var37++) {
								final int i_76_ = anIntArray2557[(i_73_ >> 12) * this.anInt2548 + (i_72_ >> 12)];
								if (i_76_ != 0) {
									anIntArray2481[i_71_++] = i_76_;
								} else {
									i_71_++;
								}
								i_72_ += i_22_;
								i_73_ += i_21_;
							}
							i_70_++;
							i_25_ -= i_21_;
							i_26_ += i_22_;
							i_19_ += anInt2483;
						}
					} else {
						int i_77_ = i_18_;
						while (i_77_ < 0) {
							int i_78_ = i_19_;
							int i_79_ = i_25_ + (i_23_ * i_22_ >> 4);
							int i_80_ = i_26_ + (i_23_ * i_21_ >> 4);
							int var37 = i_16_;
							if (i_79_ < 0) {
								final int i_81_ = (i_22_ - 1 - i_79_) / i_22_;
								var37 = i_16_ + i_81_;
								i_79_ += i_22_ * i_81_;
								i_80_ += i_21_ * i_81_;
								i_78_ = i_19_ + i_81_;
							}
							int i_82_;
							if ((i_82_ = (1 + i_79_ - (this.anInt2548 << 12) - i_22_) / i_22_) > var37) {
								var37 = i_82_;
							}
							if (i_80_ < 0) {
								i_82_ = (i_21_ - 1 - i_80_) / i_21_;
								var37 += i_82_;
								i_79_ += i_22_ * i_82_;
								i_80_ += i_21_ * i_82_;
								i_78_ += i_82_;
							}
							if ((i_82_ = (1 + i_80_ - (this.anInt2550 << 12) - i_21_) / i_21_) > var37) {
								var37 = i_82_;
							}
							for (/**/; var37 < 0; var37++) {
								final int i_83_ = anIntArray2557[(i_80_ >> 12) * this.anInt2548 + (i_79_ >> 12)];
								if (i_83_ != 0) {
									anIntArray2481[i_78_++] = i_83_;
								} else {
									i_78_++;
								}
								i_79_ += i_22_;
								i_80_ += i_21_;
							}
							i_77_++;
							i_25_ -= i_21_;
							i_26_ += i_22_;
							i_19_ += anInt2483;
						}
					}
				}
			}
		}
	}

	public Class91_Sub20_Sub13_Sub3 method860() {
		final Class91_Sub20_Sub13_Sub3 class91_sub20_sub13_sub3_84_ = new Class91_Sub20_Sub13_Sub3(this.anInt2548, this.anInt2550);
		class91_sub20_sub13_sub3_84_.anInt2553 = anInt2553;
		class91_sub20_sub13_sub3_84_.anInt2554 = anInt2554;
		class91_sub20_sub13_sub3_84_.anInt2549 = anInt2553 - this.anInt2548 - this.anInt2549;
		class91_sub20_sub13_sub3_84_.anInt2552 = this.anInt2552;
		for (int i = 0; i < this.anInt2550; i++) {
			for (int i_85_ = 0; i_85_ < this.anInt2548; i_85_++) {
				class91_sub20_sub13_sub3_84_.anIntArray2557[i * this.anInt2548 + i_85_] = anIntArray2557[i * this.anInt2548 + this.anInt2548 - 1 - i_85_];
			}
		}
		return class91_sub20_sub13_sub3_84_;
	}

	public void method861(final int i, final int i_86_, final int i_87_) {
		for (int i_88_ = 0; i_88_ < anIntArray2557.length; i_88_++) {
			final int i_89_ = anIntArray2557[i_88_];
			if (i_89_ != 0) {
				int i_90_ = i_89_ >> 16 & 0xff;
				i_90_ += i;
				if (i_90_ < 1) {
					i_90_ = 1;
				} else if (i_90_ > 255) {
					i_90_ = 255;
				}
				int i_91_ = i_89_ >> 8 & 0xff;
				i_91_ += i_86_;
				if (i_91_ < 1) {
					i_91_ = 1;
				} else if (i_91_ > 255) {
					i_91_ = 255;
				}
				int var8 = i_89_ & 0xff;
				var8 += i_87_;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}
				anIntArray2557[i_88_] = (i_90_ << 16) + (i_91_ << 8) + var8;
			}
		}
	}

	public void method862() {
		if (this.anInt2548 != anInt2553 || this.anInt2550 != anInt2554) {
			final int[] is = new int[anInt2553 * anInt2554];
			for (int i = 0; i < this.anInt2550; i++) {
				for (int i_92_ = 0; i_92_ < this.anInt2548; i_92_++) {
					is[(i + this.anInt2552) * anInt2553 + i_92_ + this.anInt2549] = anIntArray2557[i * this.anInt2548 + i_92_];
				}
			}
			anIntArray2557 = is;
			this.anInt2548 = anInt2553;
			this.anInt2550 = anInt2554;
			this.anInt2549 = 0;
			this.anInt2552 = 0;
		}
	}

	public void method863(final int i) {
		if (this.anInt2548 != anInt2553 || this.anInt2550 != anInt2554) {
			int i_93_ = i;
			if (i > this.anInt2549) {
				i_93_ = this.anInt2549;
			}
			int i_94_ = i;
			if (i + this.anInt2549 + this.anInt2548 > anInt2553) {
				i_94_ = anInt2553 - this.anInt2549 - this.anInt2548;
			}
			int i_95_ = i;
			if (i > this.anInt2552) {
				i_95_ = this.anInt2552;
			}
			int i_96_ = i;
			if (i + this.anInt2552 + this.anInt2550 > anInt2554) {
				i_96_ = anInt2554 - this.anInt2552 - this.anInt2550;
			}
			final int i_97_ = this.anInt2548 + i_93_ + i_94_;
			final int i_98_ = this.anInt2550 + i_95_ + i_96_;
			final int[] is = new int[i_97_ * i_98_];
			for (int i_99_ = 0; i_99_ < this.anInt2550; i_99_++) {
				for (int i_100_ = 0; i_100_ < this.anInt2548; i_100_++) {
					is[(i_99_ + i_95_) * i_97_ + i_100_ + i_93_] = anIntArray2557[i_99_ * this.anInt2548 + i_100_];
				}
			}
			anIntArray2557 = is;
			this.anInt2548 = i_97_;
			this.anInt2550 = i_98_;
			this.anInt2549 -= i_93_;
			this.anInt2552 -= i_95_;
		}
	}

	public void method864() {
		final int[] is = new int[this.anInt2548 * this.anInt2550];
		int i = 0;
		for (int i_101_ = 0; i_101_ < this.anInt2550; i_101_++) {
			for (int i_102_ = this.anInt2548 - 1; i_102_ >= 0; i_102_--) {
				is[i++] = anIntArray2557[i_102_ + i_101_ * this.anInt2548];
			}
		}
		anIntArray2557 = is;
		this.anInt2549 = anInt2553 - this.anInt2548 - this.anInt2549;
	}

	public void method865() {
		final int[] is = new int[this.anInt2548 * this.anInt2550];
		int i = 0;
		for (int i_103_ = this.anInt2550 - 1; i_103_ >= 0; i_103_--) {
			for (int i_104_ = 0; i_104_ < this.anInt2548; i_104_++) {
				is[i++] = anIntArray2557[i_104_ + i_103_ * this.anInt2548];
			}
		}
		anIntArray2557 = is;
		this.anInt2552 = anInt2554 - this.anInt2550 - this.anInt2552;
	}

	public void method866(final int i) {
		final int[] is = new int[this.anInt2548 * this.anInt2550];
		int i_105_ = 0;
		for (int i_106_ = 0; i_106_ < this.anInt2550; i_106_++) {
			for (int i_107_ = 0; i_107_ < this.anInt2548; i_107_++) {
				int i_108_ = anIntArray2557[i_105_];
				if (i_108_ == 0) {
					if (i_107_ > 0 && anIntArray2557[i_105_ - 1] != 0) {
						i_108_ = i;
					} else if (i_106_ > 0 && anIntArray2557[i_105_ - this.anInt2548] != 0) {
						i_108_ = i;
					} else if (i_107_ < this.anInt2548 - 1 && anIntArray2557[i_105_ + 1] != 0) {
						i_108_ = i;
					} else if (i_106_ < this.anInt2550 - 1 && anIntArray2557[i_105_ + this.anInt2548] != 0) {
						i_108_ = i;
					}
				}
				is[i_105_++] = i_108_;
			}
		}
		anIntArray2557 = is;
	}

	public void method867(final int i) {
		for (int i_109_ = this.anInt2550 - 1; i_109_ > 0; i_109_--) {
			final int i_110_ = i_109_ * this.anInt2548;
			for (int i_111_ = this.anInt2548 - 1; i_111_ > 0; i_111_--) {
				if (anIntArray2557[i_111_ + i_110_] == 0 && anIntArray2557[i_111_ + i_110_ - 1 - this.anInt2548] != 0) {
					anIntArray2557[i_111_ + i_110_] = i;
				}
			}
		}
	}

	public void method868(int i, int i_112_) {
		i += this.anInt2549;
		i_112_ += this.anInt2552;
		int i_113_ = i + i_112_ * anInt2483;
		int i_114_ = 0;
		int i_115_ = this.anInt2550;
		int i_116_ = this.anInt2548;
		int i_117_ = anInt2483 - i_116_;
		int i_118_ = 0;
		if (i_112_ < anInt2484) {
			final int var9 = anInt2484 - i_112_;
			i_115_ -= var9;
			i_112_ = anInt2484;
			i_114_ += var9 * i_116_;
			i_113_ += var9 * anInt2483;
		}
		if (i_112_ + i_115_ > anInt2480) {
			i_115_ -= i_112_ + i_115_ - anInt2480;
		}
		if (i < anInt2485) {
			final int var9 = anInt2485 - i;
			i_116_ -= var9;
			i = anInt2485;
			i_114_ += var9;
			i_113_ += var9;
			i_118_ += var9;
			i_117_ += var9;
		}
		if (i + i_116_ > anInt2486) {
			final int var9 = i + i_116_ - anInt2486;
			i_116_ -= var9;
			i_118_ += var9;
			i_117_ += var9;
		}
		if (i_116_ > 0 && i_115_ > 0) {
			method882(anIntArray2481, anIntArray2557, i_114_, i_113_, i_116_, i_115_, i_117_, i_118_);
		}
	}

	public void method869(int i, int i_119_, final int i_120_, final int i_121_) {
		if (i_120_ == 256) {
			method880(i, i_119_);
		} else {
			i += this.anInt2549;
			i_119_ += this.anInt2552;
			int i_122_ = i + i_119_ * anInt2483;
			int i_123_ = 0;
			int i_124_ = this.anInt2550;
			int i_125_ = this.anInt2548;
			int i_126_ = anInt2483 - i_125_;
			int i_127_ = 0;
			if (i_119_ < anInt2484) {
				final int var11 = anInt2484 - i_119_;
				i_124_ -= var11;
				i_119_ = anInt2484;
				i_123_ += var11 * i_125_;
				i_122_ += var11 * anInt2483;
			}
			if (i_119_ + i_124_ > anInt2480) {
				i_124_ -= i_119_ + i_124_ - anInt2480;
			}
			if (i < anInt2485) {
				final int var11 = anInt2485 - i;
				i_125_ -= var11;
				i = anInt2485;
				i_123_ += var11;
				i_122_ += var11;
				i_127_ += var11;
				i_126_ += var11;
			}
			if (i + i_125_ > anInt2486) {
				final int var11 = i + i_125_ - anInt2486;
				i_125_ -= var11;
				i_127_ += var11;
				i_126_ += var11;
			}
			if (i_125_ > 0 && i_124_ > 0) {
				method872(anIntArray2481, anIntArray2557, 0, i_123_, i_122_, i_125_, i_124_, i_126_, i_127_, i_120_, i_121_);
			}
		}
	}

	public void method870(int i, int i_128_, int i_129_, int i_130_) {
		if (i_129_ > 0 && i_130_ > 0) {
			final int i_131_ = this.anInt2548;
			final int i_132_ = this.anInt2550;
			int i_133_ = 0;
			int i_134_ = 0;
			final int i_135_ = anInt2553;
			final int i_136_ = anInt2554;
			final int i_137_ = (i_135_ << 16) / i_129_;
			final int i_138_ = (i_136_ << 16) / i_130_;
			if (this.anInt2549 > 0) {
				final int i_139_ = ((this.anInt2549 << 16) + i_137_ - 1) / i_137_;
				i += i_139_;
				i_133_ += i_139_ * i_137_ - (this.anInt2549 << 16);
			}
			if (this.anInt2552 > 0) {
				final int i_140_ = ((this.anInt2552 << 16) + i_138_ - 1) / i_138_;
				i_128_ += i_140_;
				i_134_ += i_140_ * i_138_ - (this.anInt2552 << 16);
			}
			if (i_131_ < i_135_) {
				i_129_ = ((i_131_ << 16) - i_133_ + i_137_ - 1) / i_137_;
			}
			if (i_132_ < i_136_) {
				i_130_ = ((i_132_ << 16) - i_134_ + i_138_ - 1) / i_138_;
			}
			int i_141_ = i + i_128_ * anInt2483;
			int i_142_ = anInt2483 - i_129_;
			if (i_128_ + i_130_ > anInt2480) {
				i_130_ -= i_128_ + i_130_ - anInt2480;
			}
			if (i_128_ < anInt2484) {
				final int var15 = anInt2484 - i_128_;
				i_130_ -= var15;
				i_141_ += var15 * anInt2483;
				i_134_ += i_138_ * var15;
			}
			if (i + i_129_ > anInt2486) {
				final int var15 = i + i_129_ - anInt2486;
				i_129_ -= var15;
				i_142_ += var15;
			}
			if (i < anInt2485) {
				final int var15 = anInt2485 - i;
				i_129_ -= var15;
				i_141_ += var15;
				i_133_ += i_137_ * var15;
				i_142_ += var15;
			}
			method871(anIntArray2481, anIntArray2557, 0, i_133_, i_134_, i_141_, i_142_, i_129_, i_130_, i_137_, i_138_, i_131_);
		}
	}

	static void method871(final int[] is, final int[] is_143_, int i, int i_144_, int i_145_, int i_146_, final int i_147_, final int i_148_, final int i_149_, final int i_150_, final int i_151_, final int i_152_) {
		final int i_153_ = i_144_;
		for (int i_154_ = -i_149_; i_154_ < 0; i_154_++) {
			final int i_155_ = (i_145_ >> 16) * i_152_;
			for (int i_156_ = -i_148_; i_156_ < 0; i_156_++) {
				i = is_143_[(i_144_ >> 16) + i_155_];
				if (i != 0) {
					is[i_146_++] = i;
				} else {
					i_146_++;
				}
				i_144_ += i_150_;
			}
			i_145_ += i_151_;
			i_144_ = i_153_;
			i_146_ += i_147_;
		}
	}

	static void method872(final int[] is, final int[] is_157_, int i, int i_158_, int i_159_, final int i_160_, final int i_161_, final int i_162_, final int i_163_, final int i_164_, int i_165_) {
		final int i_166_ = 256 - i_164_;
		int i_167_ = (i_165_ & 0xff00ff) * i_166_ & ~0xff00ff;
		int i_168_ = (i_165_ & 0xff00) * i_166_ & 0xff0000;
		i_165_ = (i_167_ | i_168_) >>> 8;
		for (int i_169_ = -i_161_; i_169_ < 0; i_169_++) {
			for (int i_170_ = -i_160_; i_170_ < 0; i_170_++) {
				i = is_157_[i_158_++];
				if (i != 0) {
					i_167_ = (i & 0xff00ff) * i_164_ & ~0xff00ff;
					i_168_ = (i & 0xff00) * i_164_ & 0xff0000;
					is[i_159_++] = ((i_167_ | i_168_) >>> 8) + i_165_;
				} else {
					i_159_++;
				}
			}
			i_159_ += i_162_;
			i_158_ += i_163_;
		}
	}

	public void method873(int i, int i_171_, final int i_172_) {
		i += this.anInt2549;
		i_171_ += this.anInt2552;
		int i_173_ = i + i_171_ * anInt2483;
		int i_174_ = 0;
		int i_175_ = this.anInt2550;
		int i_176_ = this.anInt2548;
		int i_177_ = anInt2483 - i_176_;
		int i_178_ = 0;
		if (i_171_ < anInt2484) {
			final int var10 = anInt2484 - i_171_;
			i_175_ -= var10;
			i_171_ = anInt2484;
			i_174_ += var10 * i_176_;
			i_173_ += var10 * anInt2483;
		}
		if (i_171_ + i_175_ > anInt2480) {
			i_175_ -= i_171_ + i_175_ - anInt2480;
		}
		if (i < anInt2485) {
			final int var10 = anInt2485 - i;
			i_176_ -= var10;
			i = anInt2485;
			i_174_ += var10;
			i_173_ += var10;
			i_178_ += var10;
			i_177_ += var10;
		}
		if (i + i_176_ > anInt2486) {
			final int var10 = i + i_176_ - anInt2486;
			i_176_ -= var10;
			i_178_ += var10;
			i_177_ += var10;
		}
		if (i_176_ > 0 && i_175_ > 0) {
			method884(anIntArray2481, anIntArray2557, 0, i_174_, i_173_, i_176_, i_175_, i_177_, i_178_, i_172_);
		}
	}

	public void method874(int i, int i_179_, int i_180_, int i_181_, final int i_182_) {
		if (i_180_ > 0 && i_181_ > 0) {
			final int i_183_ = this.anInt2548;
			final int i_184_ = this.anInt2550;
			int i_185_ = 0;
			int i_186_ = 0;
			final int i_187_ = anInt2553;
			final int i_188_ = anInt2554;
			final int i_189_ = (i_187_ << 16) / i_180_;
			final int i_190_ = (i_188_ << 16) / i_181_;
			if (this.anInt2549 > 0) {
				final int i_191_ = ((this.anInt2549 << 16) + i_189_ - 1) / i_189_;
				i += i_191_;
				i_185_ += i_191_ * i_189_ - (this.anInt2549 << 16);
			}
			if (this.anInt2552 > 0) {
				final int i_192_ = ((this.anInt2552 << 16) + i_190_ - 1) / i_190_;
				i_179_ += i_192_;
				i_186_ += i_192_ * i_190_ - (this.anInt2552 << 16);
			}
			if (i_183_ < i_187_) {
				i_180_ = ((i_183_ << 16) - i_185_ + i_189_ - 1) / i_189_;
			}
			if (i_184_ < i_188_) {
				i_181_ = ((i_184_ << 16) - i_186_ + i_190_ - 1) / i_190_;
			}
			int i_193_ = i + i_179_ * anInt2483;
			int i_194_ = anInt2483 - i_180_;
			if (i_179_ + i_181_ > anInt2480) {
				i_181_ -= i_179_ + i_181_ - anInt2480;
			}
			if (i_179_ < anInt2484) {
				final int var16 = anInt2484 - i_179_;
				i_181_ -= var16;
				i_193_ += var16 * anInt2483;
				i_186_ += i_190_ * var16;
			}
			if (i + i_180_ > anInt2486) {
				final int var16 = i + i_180_ - anInt2486;
				i_180_ -= var16;
				i_194_ += var16;
			}
			if (i < anInt2485) {
				final int var16 = anInt2485 - i;
				i_180_ -= var16;
				i_193_ += var16;
				i_185_ += i_189_ * var16;
				i_194_ += var16;
			}
			method875(anIntArray2481, anIntArray2557, 0, i_185_, i_186_, i_193_, i_194_, i_180_, i_181_, i_189_, i_190_, i_183_, i_182_);
		}
	}

	static void method875(final int[] is, final int[] is_195_, int i, int i_196_, int i_197_, int i_198_, final int i_199_, final int i_200_, final int i_201_, final int i_202_, final int i_203_, final int i_204_, final int i_205_) {
		final int i_206_ = 256 - i_205_;
		final int i_207_ = i_196_;
		for (int i_208_ = -i_201_; i_208_ < 0; i_208_++) {
			final int i_209_ = (i_197_ >> 16) * i_204_;
			for (int i_210_ = -i_200_; i_210_ < 0; i_210_++) {
				i = is_195_[(i_196_ >> 16) + i_209_];
				if (i != 0) {
					final int i_211_ = is[i_198_];
					is[i_198_++] = ((i & 0xff00ff) * i_205_ + (i_211_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i & 0xff00) * i_205_ + (i_211_ & 0xff00) * i_206_ & 0xff0000) >> 8;
				} else {
					i_198_++;
				}
				i_196_ += i_202_;
			}
			i_197_ += i_203_;
			i_196_ = i_207_;
			i_198_ += i_199_;
		}
	}

	public void method876(int i, int i_212_, final int i_213_, final int i_214_, final int i_215_, final int i_216_, final int i_217_, final int i_218_, final int[] is, final int[] is_219_) {
		try {
			final int i_220_ = -i_213_ / 2;
			final int i_221_ = -i_214_ / 2;
			int i_222_ = (int) (Math.sin(i_217_ / 326.11) * 65536.0);
			int i_223_ = (int) (Math.cos(i_217_ / 326.11) * 65536.0);
			i_222_ = i_222_ * i_218_ >> 8;
			i_223_ = i_223_ * i_218_ >> 8;
			int i_224_ = (i_215_ << 16) + i_221_ * i_222_ + i_220_ * i_223_;
			int i_225_ = (i_216_ << 16) + i_221_ * i_223_ - i_220_ * i_222_;
			int i_226_ = i + i_212_ * anInt2483;
			for (i_212_ = 0; i_212_ < i_214_; i_212_++) {
				final int i_227_ = is[i_212_];
				int i_228_ = i_226_ + i_227_;
				int i_229_ = i_224_ + i_223_ * i_227_;
				int i_230_ = i_225_ - i_222_ * i_227_;
				for (i = -is_219_[i_212_]; i < 0; i++) {
					anIntArray2481[i_228_++] = anIntArray2557[(i_229_ >> 16) + (i_230_ >> 16) * this.anInt2548];
					i_229_ += i_223_;
					i_230_ -= i_222_;
				}
				i_224_ += i_222_;
				i_225_ += i_223_;
				i_226_ += anInt2483;
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	public void method877(int i, int i_231_, final int i_232_, final int i_233_, final int i_234_, final int i_235_, final double d, final int i_236_) {
		try {
			final int i_237_ = -i_232_ / 2;
			final int i_238_ = -i_233_ / 2;
			int i_239_ = (int) (Math.sin(d) * 65536.0);
			int i_240_ = (int) (Math.cos(d) * 65536.0);
			i_239_ = i_239_ * i_236_ >> 8;
			i_240_ = i_240_ * i_236_ >> 8;
			int i_241_ = (i_234_ << 16) + i_238_ * i_239_ + i_237_ * i_240_;
			int i_242_ = (i_235_ << 16) + i_238_ * i_240_ - i_237_ * i_239_;
			int i_243_ = i + i_231_ * anInt2483;
			for (i_231_ = 0; i_231_ < i_233_; i_231_++) {
				int i_244_ = i_243_;
				int i_245_ = i_241_;
				int i_246_ = i_242_;
				for (i = -i_232_; i < 0; i++) {
					final int i_247_ = anIntArray2557[(i_245_ >> 16) + (i_246_ >> 16) * this.anInt2548];
					if (i_247_ != 0) {
						anIntArray2481[i_244_++] = i_247_;
					} else {
						i_244_++;
					}
					i_245_ += i_240_;
					i_246_ -= i_239_;
				}
				i_241_ += i_239_;
				i_242_ += i_240_;
				i_243_ += anInt2483;
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	public void method878(final int i, final int i_248_, final int i_249_, final int i_250_) {
		method859(anInt2553 << 3, anInt2554 << 3, i << 4, i_248_ << 4, i_249_, i_250_);
	}

	public void method879(final Class91_Sub20_Sub13_Sub1 class91_sub20_sub13_sub1, int i, int i_251_) {
		if (anInt2486 - anInt2485 == class91_sub20_sub13_sub1.anInt2517 && anInt2480 - anInt2484 == class91_sub20_sub13_sub1.anInt2519) {
			i += this.anInt2549;
			i_251_ += this.anInt2552;
			int i_252_ = i + i_251_ * anInt2483;
			int i_253_ = 0;
			int i_254_ = this.anInt2550;
			int i_255_ = this.anInt2548;
			int i_256_ = anInt2483 - i_255_;
			int i_257_ = 0;
			if (i_251_ < anInt2484) {
				final int i_258_ = anInt2484 - i_251_;
				i_254_ -= i_258_;
				i_251_ = anInt2484;
				i_253_ += i_258_ * i_255_;
				i_252_ += i_258_ * anInt2483;
			}
			if (i_251_ + i_254_ > anInt2480) {
				i_254_ -= i_251_ + i_254_ - anInt2480;
			}
			if (i < anInt2485) {
				final int i_259_ = anInt2485 - i;
				i_255_ -= i_259_;
				i = anInt2485;
				i_253_ += i_259_;
				i_252_ += i_259_;
				i_257_ += i_259_;
				i_256_ += i_259_;
			}
			if (i + i_255_ > anInt2486) {
				final int i_260_ = i + i_255_ - anInt2486;
				i_255_ -= i_260_;
				i_257_ += i_260_;
				i_256_ += i_260_;
			}
			if (i_255_ > 0 && i_254_ > 0) {
				final int i_261_ = i - anInt2485 + (i_251_ - anInt2484) * class91_sub20_sub13_sub1.anInt2517;
				final int i_262_ = class91_sub20_sub13_sub1.anInt2517 - i_255_;
				method885(anIntArray2481, anIntArray2557, 0, i_253_, i_252_, i_261_, i_255_, i_254_, i_256_, i_257_, i_262_, class91_sub20_sub13_sub1.aByteArray2520);
			}
		} else {
			throw new IllegalStateException();
		}
	}

	public void method880(int i, int i_263_) {
		i += this.anInt2549;
		i_263_ += this.anInt2552;
		int i_264_ = i + i_263_ * anInt2483;
		int i_265_ = 0;
		int i_266_ = this.anInt2550;
		int i_267_ = this.anInt2548;
		int i_268_ = anInt2483 - i_267_;
		int i_269_ = 0;
		if (i_263_ < anInt2484) {
			final int var9 = anInt2484 - i_263_;
			i_266_ -= var9;
			i_263_ = anInt2484;
			i_265_ += var9 * i_267_;
			i_264_ += var9 * anInt2483;
		}
		if (i_263_ + i_266_ > anInt2480) {
			i_266_ -= i_263_ + i_266_ - anInt2480;
		}
		if (i < anInt2485) {
			final int var9 = anInt2485 - i;
			i_267_ -= var9;
			i = anInt2485;
			i_265_ += var9;
			i_264_ += var9;
			i_269_ += var9;
			i_268_ += var9;
		}
		if (i + i_267_ > anInt2486) {
			final int var9 = i + i_267_ - anInt2486;
			i_267_ -= var9;
			i_269_ += var9;
			i_268_ += var9;
		}
		if (i_267_ > 0 && i_266_ > 0) {
			method883(anIntArray2481, anIntArray2557, 0, i_265_, i_264_, i_267_, i_266_, i_268_, i_269_);
		}
	}

	public void method881() {
		method819(anIntArray2557, this.anInt2548, this.anInt2550);
	}

	static void method882(final int[] is, final int[] is_270_, int i, int i_271_, final int i_272_, final int i_273_, final int i_274_, final int i_275_) {
		for (int i_276_ = -i_273_; i_276_ < 0; i_276_++) {
			int i_277_ = i_271_ + i_272_ - 3;
			while (i_271_ < i_277_) {
				is[i_271_++] = is_270_[i++];
				is[i_271_++] = is_270_[i++];
				is[i_271_++] = is_270_[i++];
				is[i_271_++] = is_270_[i++];
			}
			i_277_ += 3;
			while (i_271_ < i_277_) {
				is[i_271_++] = is_270_[i++];
			}
			i_271_ += i_274_;
			i += i_275_;
		}
	}

	Class91_Sub20_Sub13_Sub3() {
		/* empty */
	}

	static void method883(final int[] is, final int[] is_278_, int i, int i_279_, int i_280_, int i_281_, final int i_282_, final int i_283_, final int i_284_) {
		final int i_285_ = -(i_281_ >> 2);
		i_281_ = -(i_281_ & 0x3);
		for (int i_286_ = -i_282_; i_286_ < 0; i_286_++) {
			for (int i_287_ = i_285_; i_287_ < 0; i_287_++) {
				i = is_278_[i_279_++];
				if (i != 0) {
					is[i_280_++] = i;
				} else {
					i_280_++;
				}
				i = is_278_[i_279_++];
				if (i != 0) {
					is[i_280_++] = i;
				} else {
					i_280_++;
				}
				i = is_278_[i_279_++];
				if (i != 0) {
					is[i_280_++] = i;
				} else {
					i_280_++;
				}
				i = is_278_[i_279_++];
				if (i != 0) {
					is[i_280_++] = i;
				} else {
					i_280_++;
				}
			}
			for (int i_288_ = i_281_; i_288_ < 0; i_288_++) {
				i = is_278_[i_279_++];
				if (i != 0) {
					is[i_280_++] = i;
				} else {
					i_280_++;
				}
			}
			i_280_ += i_283_;
			i_279_ += i_284_;
		}
	}

	public Class91_Sub20_Sub13_Sub3(final byte[] is, final Component component) {
		try {
			final Image image = Toolkit.getDefaultToolkit().createImage(is);
			final MediaTracker mediatracker = new MediaTracker(component);
			mediatracker.addImage(image, 0);
			mediatracker.waitForAll();
			this.anInt2548 = image.getWidth(component);
			this.anInt2550 = image.getHeight(component);
			anInt2553 = this.anInt2548;
			anInt2554 = this.anInt2550;
			this.anInt2549 = 0;
			this.anInt2552 = 0;
			anIntArray2557 = new int[this.anInt2548 * this.anInt2550];
			final PixelGrabber var5 = new PixelGrabber(image, 0, 0, this.anInt2548, this.anInt2550, anIntArray2557, 0, this.anInt2548);
			var5.grabPixels();
		} catch (final InterruptedException interruptedexception) {
			/* empty */
		}
	}

	static void method884(final int[] is, final int[] is_289_, int i, int i_290_, int i_291_, final int i_292_, final int i_293_, final int i_294_, final int i_295_, final int i_296_) {
		final int i_297_ = 256 - i_296_;
		for (int i_298_ = -i_293_; i_298_ < 0; i_298_++) {
			for (int i_299_ = -i_292_; i_299_ < 0; i_299_++) {
				i = is_289_[i_290_++];
				if (i != 0) {
					final int i_300_ = is[i_291_];
					is[i_291_++] = ((i & 0xff00ff) * i_296_ + (i_300_ & 0xff00ff) * i_297_ & ~0xff00ff) + ((i & 0xff00) * i_296_ + (i_300_ & 0xff00) * i_297_ & 0xff0000) >> 8;
				} else {
					i_291_++;
				}
			}
			i_291_ += i_294_;
			i_290_ += i_295_;
		}
	}

	public Class91_Sub20_Sub13_Sub3(final int i, final int i_301_) {
		anIntArray2557 = new int[i * i_301_];
		this.anInt2548 = anInt2553 = i;
		this.anInt2550 = anInt2554 = i_301_;
		this.anInt2552 = 0;
		this.anInt2549 = 0;
	}

	static void method885(final int[] is, final int[] is_302_, int i, int i_303_, int i_304_, int i_305_, int i_306_, final int i_307_, final int i_308_, final int i_309_, final int i_310_, final byte[] is_311_) {
		final int i_312_ = -(i_306_ >> 2);
		i_306_ = -(i_306_ & 0x3);
		for (int i_313_ = -i_307_; i_313_ < 0; i_313_++) {
			for (int i_314_ = i_312_; i_314_ < 0; i_314_++) {
				i = is_302_[i_303_++];
				if (i != 0 && is_311_[i_305_] == 0) {
					is[i_304_++] = i;
				} else {
					i_304_++;
				}
				i_305_++;
				i = is_302_[i_303_++];
				if (i != 0 && is_311_[i_305_] == 0) {
					is[i_304_++] = i;
				} else {
					i_304_++;
				}
				i_305_++;
				i = is_302_[i_303_++];
				if (i != 0 && is_311_[i_305_] == 0) {
					is[i_304_++] = i;
				} else {
					i_304_++;
				}
				i_305_++;
				i = is_302_[i_303_++];
				if (i != 0 && is_311_[i_305_] == 0) {
					is[i_304_++] = i;
				} else {
					i_304_++;
				}
				i_305_++;
			}
			for (int i_315_ = i_306_; i_315_ < 0; i_315_++) {
				i = is_302_[i_303_++];
				if (i != 0 && is_311_[i_305_] == 0) {
					is[i_304_++] = i;
				} else {
					i_304_++;
				}
				i_305_++;
			}
			i_304_ += i_308_;
			i_303_ += i_309_;
			i_305_ += i_310_;
		}
	}
}
