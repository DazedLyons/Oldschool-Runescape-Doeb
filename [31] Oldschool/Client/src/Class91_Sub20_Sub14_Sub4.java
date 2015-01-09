/* Class91_Sub20_Sub14_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class91_Sub20_Sub14_Sub4 extends Class91_Sub20_Sub14 {
	public static final int anInt2754 = 193;
	static final int anInt2755 = 67;
	int anInt2756;
	static final int anInt2757 = 37;
	static final int anInt2758 = 15;
	int anInt2759;
	int anInt2760;
	int anInt2761;
	int anInt2762;
	int anInt2763;
	int anInt2764;
	boolean aBoolean2765;
	int anInt2766;
	double aDouble2767;
	double aDouble2768;
	static Class108 aClass108_2769;
	double aDouble2770;
	int anInt2771;
	double aDouble2772;
	double aDouble2773;
	int anInt2774;
	static Class91_Sub18 aClass91_Sub18_2775;
	double aDouble2776;
	int anInt2777;
	Class91_Sub20_Sub5 aClass91_Sub20_Sub5_2778;
	int anInt2779;
	public static final int anInt2780 = 35;
	int anInt2781;
	double aDouble2782;
	public static final int anInt2783 = 82;
	double aDouble2784;
	static Class7 aClass7_2785;
	int anInt2786;
	public static final int anInt2787 = 164;
	public static final int anInt2788 = 209;
	int anInt2789;
	public static final int anInt2790 = 214;

	final void method996(final int i, final int i_0_, final int i_1_, final int i_2_, final byte i_3_) {
		try {
			if (!this.aBoolean2765) {
				if (i_3_ <= 1) {
					return;
				}
				final double d = i - 1009543603 * this.anInt2756;
				final double d_4_ = i_0_ - this.anInt2781 * 1971883979;
				final double d_5_ = Math.sqrt(d_4_ * d_4_ + d * d);
				this.aDouble2784 = d * (this.anInt2763 * -1128987215) / d_5_ + this.anInt2756 * 1009543603;
				this.aDouble2767 = d_4_ * (-1128987215 * this.anInt2763) / d_5_ + 1971883979 * this.anInt2781;
				this.aDouble2768 = this.anInt2771 * -210034969;
			}
			final double d = this.anInt2761 * 850524095 + 1 - i_2_;
			this.aDouble2776 = (i - this.aDouble2784) / d;
			this.aDouble2770 = (i_0_ - this.aDouble2767) / d;
			this.aDouble2782 = Math.sqrt(this.aDouble2776 * this.aDouble2776 + this.aDouble2770 * this.aDouble2770);
			if (!this.aBoolean2765) {
				this.aDouble2772 = -this.aDouble2782 * Math.tan(this.anInt2762 * -1011699919 * 0.02454369);
			}
			this.aDouble2773 = 2.0 * (i_1_ - this.aDouble2768 - this.aDouble2772 * d) / (d * d);
		} catch (final RuntimeException var12) {
			throw Class102.method1086(var12, "l.i()");
		}
	}

	final void method997(final int i, final byte i_6_) {
		try {
			this.aBoolean2765 = true;
			this.aDouble2784 += i * this.aDouble2776;
			this.aDouble2767 += this.aDouble2770 * i;
			this.aDouble2768 += i * 0.5 * this.aDouble2773 * i + i * this.aDouble2772;
			this.aDouble2772 += i * this.aDouble2773;
			this.anInt2774 = ((int) (Math.atan2(this.aDouble2776, this.aDouble2770) * 325.949) + 1024 & 0x7ff) * -1626050605;
			this.anInt2766 = ((int) (Math.atan2(this.aDouble2772, this.aDouble2782) * 325.949) & 0x7ff) * 1838093041;
			if (this.aClass91_Sub20_Sub5_2778 != null) {
				if (i_6_ == 0) {
					this.anInt2786 += -1783683077 * i;
					while (1283836723 * this.anInt2786 > this.aClass91_Sub20_Sub5_2778.anIntArray2270[-1192603041 * this.anInt2777]) {
						this.anInt2786 -= -1783683077 * this.aClass91_Sub20_Sub5_2778.anIntArray2270[-1192603041 * this.anInt2777];
						this.anInt2777 += -287405665;
						if (this.anInt2777 * -1192603041 >= this.aClass91_Sub20_Sub5_2778.anIntArray2268.length) {
							if (i_6_ != 0) {
								throw new IllegalStateException();
							}
							this.anInt2777 -= -1244676347 * this.aClass91_Sub20_Sub5_2778.anInt2277;
							if (this.anInt2777 * -1192603041 >= 0) {
								if (i_6_ != 0) {
									throw new IllegalStateException();
								}
								if (this.anInt2777 * -1192603041 < this.aClass91_Sub20_Sub5_2778.anIntArray2268.length) {
									continue;
								}
								if (i_6_ != 0) {
									throw new IllegalStateException();
								}
							}
							this.anInt2777 = 0;
						}
					}
				}
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "l.f()");
		}
	}

	@Override
	protected final Class91_Sub20_Sub14_Sub3 method915(final int i) {
		Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3;
		try {
			final Class91_Sub20_Sub12 class91_sub20_sub12 = NpcType.method813(-588333193 * this.anInt2779, (short) 3526);
			final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_7_ = class91_sub20_sub12.method817(-1192603041 * this.anInt2777, 2029749624);
			if (class91_sub20_sub14_sub3_7_ == null) {
				return null;
			}
			class91_sub20_sub14_sub3_7_.method980(this.anInt2766 * -356540911);
			class91_sub20_sub14_sub3 = class91_sub20_sub14_sub3_7_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "l.w()");
		}
		return class91_sub20_sub14_sub3;
	}

	Class91_Sub20_Sub14_Sub4(final int i, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_, final int i_14_, final int i_15_, final int i_16_, final int i_17_) {
		try {
			this.aBoolean2765 = false;
			this.anInt2777 = 0;
			this.anInt2786 = 0;
			this.anInt2779 = -567031225 * i;
			this.anInt2789 = 609627289 * i_8_;
			this.anInt2756 = 2008575355 * i_9_;
			this.anInt2781 = i_10_ * 1309384163;
			this.anInt2771 = i_11_ * 645469399;
			this.anInt2760 = 670664893 * i_12_;
			this.anInt2761 = -695338945 * i_13_;
			this.anInt2762 = i_14_ * 323635665;
			this.anInt2763 = 210903889 * i_15_;
			this.anInt2764 = 966521903 * i_16_;
			this.anInt2759 = i_17_ * -543863715;
			this.aBoolean2765 = false;
			final int i_18_ = NpcType.method813(this.anInt2779 * -588333193, (short) -982).anInt2466 * -1585626451;
			if (-1 != i_18_) {
				this.aClass91_Sub20_Sub5_2778 = Class7.method152(i_18_, 127292973);
			} else {
				this.aClass91_Sub20_Sub5_2778 = null;
			}
		} catch (final RuntimeException var13) {
			throw Class102.method1086(var13, "l.<init>()");
		}
	}

	static final void method1000(final int i) {
		try {
			Class28_Sub1.method272(client.aClass91_Sub18_1461, -1905179897);
			Class108.anInt1406 += -828305109;
			if (client.aBoolean1662 && client.aBoolean1618) {
				int i_19_ = -695750341 * Class12.anInt173;
				int i_20_ = -855709389 * Class12.anInt178;
				i_19_ -= 758470529 * client.anInt1615;
				i_20_ -= client.anInt1616 * -750348957;
				if (i_19_ < -1412894159 * client.anInt1583) {
					i_19_ = -1412894159 * client.anInt1583;
				}
				if (client.aClass91_Sub18_1461.anInt1978 * -538789309 + i_19_ > -1412894159 * client.anInt1583 + -538789309 * client.aClass91_Sub18_1699.anInt1978) {
					i_19_ = -1412894159 * client.anInt1583 + client.aClass91_Sub18_1699.anInt1978 * -538789309 - -538789309 * client.aClass91_Sub18_1461.anInt1978;
				}
				if (i_20_ < -375980539 * client.anInt1620) {
					i_20_ = -375980539 * client.anInt1620;
				}
				if (i_20_ + -1807498407 * client.aClass91_Sub18_1461.anInt1979 > client.anInt1620 * -375980539 + client.aClass91_Sub18_1699.anInt1979 * -1807498407) {
					i_20_ = client.anInt1620 * -375980539 + client.aClass91_Sub18_1699.anInt1979 * -1807498407 - -1807498407 * client.aClass91_Sub18_1461.anInt1979;
				}
				final int i_21_ = i_19_ - client.anInt1667 * -215931401;
				final int i_22_ = i_20_ - client.anInt1623 * -1597138331;
				final int i_23_ = client.aClass91_Sub18_1461.anInt1960 * -370061503;
				if (-1647630973 * Class108.anInt1406 > client.aClass91_Sub18_1461.anInt2033 * -1307171713 && (i_21_ > i_23_ || i_21_ < -i_23_ || i_22_ > i_23_ || i_22_ < -i_23_)) {
					client.aBoolean1624 = true;
				}
				final int i_24_ = i_19_ - -1412894159 * client.anInt1583 + client.aClass91_Sub18_1699.anInt1982 * 1910750647;
				final int i_25_ = i_20_ - -375980539 * client.anInt1620 + client.aClass91_Sub18_1699.anInt2048 * 1916118407;
				if (client.aClass91_Sub18_1461.anObjectArray2050 != null && client.aBoolean1624) {
					final Class91_Sub21 class91_sub21 = new Class91_Sub21();
					class91_sub21.aClass91_Sub18_2090 = client.aClass91_Sub18_1461;
					class91_sub21.anInt2091 = 1047250041 * i_24_;
					class91_sub21.anInt2096 = i_25_ * -215949217;
					class91_sub21.anObjectArray2100 = client.aClass91_Sub18_1461.anObjectArray2050;
					Class91_Sub20_Sub14.method919(class91_sub21, (short) 3047);
				}
				if (443943815 * Class12.anInt171 == 0) {
					if (client.aBoolean1624) {
						if (client.aClass91_Sub18_1461.anObjectArray2046 != null) {
							final Class91_Sub21 class91_sub21 = new Class91_Sub21();
							class91_sub21.aClass91_Sub18_2090 = client.aClass91_Sub18_1461;
							class91_sub21.anInt2091 = i_24_ * 1047250041;
							class91_sub21.anInt2096 = -215949217 * i_25_;
							class91_sub21.aClass91_Sub18_2094 = client.aClass91_Sub18_1617;
							class91_sub21.anObjectArray2100 = client.aClass91_Sub18_1461.anObjectArray2046;
							Class91_Sub20_Sub14.method919(class91_sub21, (short) 21178);
						}
						if (client.aClass91_Sub18_1617 != null) {
							Class91_Sub18 class91_sub18 = client.aClass91_Sub18_1461;
							final int i_26_ = Class64.method433(Class17.method182(class91_sub18, -1920023400), (byte) 24);
							Class91_Sub18 class91_sub18_27_;
							if (i_26_ == 0) {
								class91_sub18_27_ = null;
							} else {
								int i_28_ = 0;
								for (;;) {
									if (i_28_ >= i_26_) {
										class91_sub18_27_ = class91_sub18;
										break;
									}
									class91_sub18 = Class61.method394(class91_sub18.anInt1980 * 777859439, -631047529);
									if (class91_sub18 == null) {
										class91_sub18_27_ = null;
										break;
									}
									i_28_++;
								}
							}
							if (class91_sub18_27_ != null) {
								client.aClass91_Sub9_Sub1_1478.method690(79, 1160292001);
								client.aClass91_Sub9_Sub1_1478.method660(client.aClass91_Sub18_1617.anInt2012 * -819014149, (byte) 88);
								client.aClass91_Sub9_Sub1_1478.method659(client.aClass91_Sub18_1461.anInt2012 * -819014149, (byte) -41);
								client.aClass91_Sub9_Sub1_1478.method667(-1026201747 * client.aClass91_Sub18_1461.anInt2032, -801515057);
								client.aClass91_Sub9_Sub1_1478.method666(client.aClass91_Sub18_1617.anInt2032 * -1026201747, (byte) -5);
							}
						}
					} else if ((1 == -1189077387 * client.anInt1514 || Class91_Sub13.method707(1335574821 * client.anInt1585 - 1, (byte) -33)) && 1335574821 * client.anInt1585 > 2) {
						Class106.method1099(1722842228);
					} else if (client.anInt1585 * 1335574821 > 0) {
						Class91_Sub20_Sub15.method1026(1335574821 * client.anInt1585 - 1, -1299869863);
					}
					client.aClass91_Sub18_1461 = null;
				}
			} else if (Class108.anInt1406 * -1647630973 > 1) {
				client.aClass91_Sub18_1461 = null;
			}
		} catch (final RuntimeException var12) {
			throw Class102.method1086(var12, "l.cp()");
		}
	}

	static final void method1001(final int i, final int i_29_, final int i_30_, final int i_31_, final Class91_Sub20_Sub13_Sub3 class91_sub20_sub13_sub3, final byte i_32_) {
		try {
			final int i_33_ = i_31_ * i_31_ + i_30_ * i_30_;
			if (i_33_ > 4225 && i_33_ < 90000) {
				final int i_34_ = client.anInt1513 * -1562784247 + client.anInt1528 * -1533574683 & 0x7ff;
				int i_35_ = Class91_Sub20_Sub13_Sub2.anIntArray2546[i_34_];
				int i_36_ = Class91_Sub20_Sub13_Sub2.anIntArray2547[i_34_];
				i_35_ = 256 * i_35_ / (256 + client.anInt1515 * -907024925);
				i_36_ = i_36_ * 256 / (client.anInt1515 * -907024925 + 256);
				final int i_37_ = i_36_ * i_30_ + i_35_ * i_31_ >> 16;
				final int i_38_ = i_36_ * i_31_ - i_35_ * i_30_ >> 16;
				final double d = Math.atan2(i_37_, i_38_);
				final int i_39_ = (int) (Math.sin(d) * 63.0);
				final int i_40_ = (int) (Math.cos(d) * 57.0);
				Class100.aClass91_Sub20_Sub13_Sub3_1245.method877(94 + i + i_39_ + 4 - 10, i_29_ + 83 - i_40_ - 20, 20, 20, 15, 15, d, 256);
			} else {
				Class91_Sub20_Sub17.method1030(i, i_29_, i_30_, i_31_, class91_sub20_sub13_sub3, (byte) -21);
			}
		} catch (final RuntimeException var16) {
			throw Class102.method1086(var16, "l.cb()");
		}
	}

	public static String method1002(final CharSequence charsequence, final Class98 class98, final byte i) {
		try {
			if (charsequence == null) {
				return null;
			}
			int i_41_ = 0;
			int i_42_;
			for (i_42_ = charsequence.length(); i_41_ < i_42_; i_41_++) {
				final char c = charsequence.charAt(i_41_);
				final boolean bool = '\u00a0' == c || ' ' == c || '_' == c || '-' == c;
				if (!bool) {
					break;
				}
			}
			for (/**/; i_42_ > i_41_; i_42_--) {
				final char c = charsequence.charAt(i_42_ - 1);
				boolean bool;
				if ('\u00a0' != c && ' ' != c && c != '_' && '-' != c) {
					bool = false;
				} else {
					bool = true;
				}
				final boolean bool_43_ = bool;
				if (!bool_43_) {
					break;
				}
			}
			final int i_44_ = i_42_ - i_41_;
			if (i_44_ >= 1 && i_44_ <= Class23.method213(class98, 16711935)) {
				final StringBuilder stringbuilder = new StringBuilder(i_44_);
				for (int i_45_ = i_41_; i_45_ < i_42_; i_45_++) {
					final char c = charsequence.charAt(i_45_);
					boolean bool;
					if (Character.isISOControl(c)) {
						bool = false;
					} else {
						boolean bool_46_;
						do {
							if ((c < '0' || c > '9') && (c < 'A' || c > 'Z')) {
								if (c >= 'a' && c <= 'z') {
									if (i == 1) {
										throw new IllegalStateException();
									}
								} else {
									bool_46_ = false;
									break;
								}
							}
							bool_46_ = true;
						} while (false);
						final boolean bool_47_ = bool_46_;
						if (bool_47_) {
							bool = true;
						} else {
							char[] cs = Class66.aCharArray794;
							int i_48_ = 0;
							while_25_: for (;;) {
								if (i_48_ >= cs.length) {
									cs = Class66.aCharArray798;
									for (i_48_ = 0; i_48_ < cs.length; i_48_++) {
										final char c_49_ = cs[i_48_];
										if (c_49_ == c) {
											bool = true;
											break while_25_;
										}
									}
									bool = false;
									break;
								}
								final char c_50_ = cs[i_48_];
								if (c_50_ == c) {
									bool = true;
									break;
								}
								i_48_++;
							}
						}
					}
					if (bool) {
						char c_51_;
						switch (c) {
						case ' ':
						case '-':
						case '_':
						case '\u00a0':
							c_51_ = '_';
							break;
						case '#':
						case '[':
						case ']':
							c_51_ = c;
							break;
						case '\u00c0':
						case '\u00c1':
						case '\u00c2':
						case '\u00c3':
						case '\u00c4':
						case '\u00e0':
						case '\u00e1':
						case '\u00e2':
						case '\u00e3':
						case '\u00e4':
							c_51_ = 'a';
							break;
						case '\u00c7':
						case '\u00e7':
							c_51_ = 'c';
							break;
						case '\u00c8':
						case '\u00c9':
						case '\u00ca':
						case '\u00cb':
						case '\u00e8':
						case '\u00e9':
						case '\u00ea':
						case '\u00eb':
							c_51_ = 'e';
							break;
						case '\u00cd':
						case '\u00ce':
						case '\u00cf':
						case '\u00ed':
						case '\u00ee':
						case '\u00ef':
							c_51_ = 'i';
							break;
						case '\u00d1':
						case '\u00f1':
							c_51_ = 'n';
							break;
						case '\u00d2':
						case '\u00d3':
						case '\u00d4':
						case '\u00d5':
						case '\u00d6':
						case '\u00f2':
						case '\u00f3':
						case '\u00f4':
						case '\u00f5':
						case '\u00f6':
							c_51_ = 'o';
							break;
						case '\u00d9':
						case '\u00da':
						case '\u00db':
						case '\u00dc':
						case '\u00f9':
						case '\u00fa':
						case '\u00fb':
						case '\u00fc':
							c_51_ = 'u';
							break;
						case '\u00df':
							c_51_ = 'b';
							break;
						case '\u00ff':
						case '\u0178':
							c_51_ = 'y';
							break;
						default:
							c_51_ = Character.toLowerCase(c);
						}
						if (c_51_ == 0) {
							if (i == 1) {
								throw new IllegalStateException();
							}
						} else {
							stringbuilder.append(c_51_);
						}
					}
				}
				if (stringbuilder.length() == 0) {
					return null;
				}
				return stringbuilder.toString();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "l.w()");
		}
		return null;
	}

	static void method1003(final int i, final byte i_52_) {
		try {
			if (i == -1 && !client.aBoolean1521) {
				if (i_52_ <= 0) {
					throw new IllegalStateException();
				}
				Class64.aClass91_Sub2_Sub4_785.method591(-2002790943);
				Class64.anInt781 = -515714225;
				Class64.aClass63_786 = null;
			} else if (-1 != i && i != 31780839 * client.anInt1678) {
				if (i_52_ <= 0) {
					throw new IllegalStateException();
				}
				if (1217281259 * client.anInt1677 != 0) {
					if (i_52_ <= 0) {
						throw new IllegalStateException();
					}
					if (!client.aBoolean1521) {
						Class91_Sub24.method1049(2, Class91_Sub20_Sub2.aClass63_Sub1_2232, i, 0, 1217281259 * client.anInt1677, false, (byte) -32);
					}
				}
			}
			client.anInt1678 = -1817922601 * i;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "l.ao()");
		}
	}

	public static Class91_Sub20_Sub13_Sub4_Sub1 method1004(final Js5 class63, final Js5 class63_53_, final String string, final String string_54_, final byte i) {
		Class91_Sub20_Sub13_Sub4_Sub1 class91_sub20_sub13_sub4_sub1;
		try {
			final int i_55_ = class63.method409(string, -556780333);
			final int i_56_ = class63.method415(i_55_, string_54_, (byte) 82);
			class91_sub20_sub13_sub4_sub1 = Class28_Sub1.method273(class63, class63_53_, i_55_, i_56_, -212383817);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "l.d()");
		}
		return class91_sub20_sub13_sub4_sub1;
	}

	static void method1005(final int i) {
		try {
			Class62.anIntArray758 = new int[33];
			client.anIntArray1520 = new int[33];
			Class57.anIntArray697 = new int[151];
			Class91_Sub20_Sub6.anIntArray2291 = new int[151];
			for (int i_57_ = 0; i_57_ < 33; i_57_++) {
				int i_58_ = 999;
				int i_59_ = 0;
				for (int i_60_ = 0; i_60_ < 34; i_60_++) {
					if (Class45.aClass91_Sub20_Sub13_Sub1_1431.aByteArray2520[Class45.aClass91_Sub20_Sub13_Sub1_1431.anInt2517 * i_57_ + i_60_] == 0) {
						if (999 == i_58_) {
							i_58_ = i_60_;
						}
					} else if (i_58_ != 999) {
						i_59_ = i_60_;
						break;
					}
				}
				Class62.anIntArray758[i_57_] = i_58_;
				client.anIntArray1520[i_57_] = i_59_ - i_58_;
			}
			for (int i_61_ = 5; i_61_ < 156; i_61_++) {
				int i_62_ = 999;
				int i_63_ = 0;
				for (int i_64_ = 25; i_64_ < 172; i_64_++) {
					if (Class45.aClass91_Sub20_Sub13_Sub1_1431.aByteArray2520[i_64_ + Class45.aClass91_Sub20_Sub13_Sub1_1431.anInt2517 * i_61_] == 0 && (i_64_ > 34 || i_61_ > 34)) {
						if (i_62_ == 999) {
							i_62_ = i_64_;
						}
					} else if (999 != i_62_) {
						i_63_ = i_64_;
						break;
					}
				}
				Class57.anIntArray697[i_61_ - 5] = i_62_ - 25;
				Class91_Sub20_Sub6.anIntArray2291[i_61_ - 5] = i_63_ - i_62_;
			}
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "l.o()");
		}
	}
}
