/* Class91_Sub20_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class IdkType extends Class91_Sub20 {
	public int anInt2213;
	static Js5 aClass63_2214;
	static Js5 idkJs5;
	public boolean aBoolean2216;
	public static int anInt2217;
	static Class96 aClass96_2218 = new Class96(64);
	short[] aShortArray2219;
	short[] aShortArray2220;
	int[] anIntArray2221;
	short[] aShortArray2222;
	int[] anIntArray2223;
	short[] aShortArray2224;
	static final int anInt2225 = 43;
	static final int anInt2226 = 2;
	public static final int anInt2227 = 19661112;
	public static final int anInt2228 = 104;

	void method725(final ByteBuffer class91_sub9, final int i) {
		try {
			for (;;) {
				final int i_0_ = class91_sub9.readUnsignedByte();
				if (i_0_ == 0) {
					break;
				}
				method726(class91_sub9, i_0_, -1502825963);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ab.f()");
		}
	}

	void method726(final ByteBuffer class91_sub9, final int i, final int i_1_) {
		try {
			if (1 == i) {
				if (i_1_ < 802208504) {
					anInt2213 = class91_sub9.readUnsignedByte() * -129741297;
				}
			} else if (2 == i) {
				if (i_1_ < 802208504) {
					final int i_2_ = class91_sub9.readUnsignedByte();
					this.anIntArray2221 = new int[i_2_];
					for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
						this.anIntArray2221[i_3_] = class91_sub9.method686((byte) -52);
					}
				}
			} else if (i == 3) {
				aBoolean2216 = true;
			} else if (40 == i) {
				final int i_4_ = class91_sub9.readUnsignedByte();
				this.aShortArray2219 = new short[i_4_];
				this.aShortArray2220 = new short[i_4_];
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					this.aShortArray2219[i_5_] = (short) class91_sub9.method686((byte) -79);
					this.aShortArray2220[i_5_] = (short) class91_sub9.method686((byte) -103);
				}
			} else if (41 == i) {
				final int i_6_ = class91_sub9.readUnsignedByte();
				this.aShortArray2224 = new short[i_6_];
				this.aShortArray2222 = new short[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
					if (i_1_ >= 802208504) {
						break;
					}
					this.aShortArray2224[i_7_] = (short) class91_sub9.method686((byte) -72);
					this.aShortArray2222[i_7_] = (short) class91_sub9.method686((byte) -52);
				}
			} else if (i >= 60 && i < 70) {
				this.anIntArray2223[i - 60] = class91_sub9.method686((byte) -81);
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "ab.e()");
		}
	}

	public boolean method727(final byte i) {
		boolean bool;
		try {
			if (this.anIntArray2221 == null) {
				return true;
			}
			boolean bool_8_ = true;
			for (int i_9_ = 0; i_9_ < this.anIntArray2221.length; i_9_++) {
				if (!aClass63_2214.method399(this.anIntArray2221[i_9_], 0, 1218792745)) {
					bool_8_ = false;
				}
			}
			bool = bool_8_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ab.t()");
		}
		return bool;
	}

	public Class91_Sub20_Sub14_Sub2 method728(final byte i) {
		Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2;
		try {
			final Class91_Sub20_Sub14_Sub2[] class91_sub20_sub14_sub2s = new Class91_Sub20_Sub14_Sub2[5];
			int i_10_ = 0;
			for (int i_11_ = 0; i_11_ < 5; i_11_++) {
				if (this.anIntArray2223[i_11_] != -1) {
					class91_sub20_sub14_sub2s[i_10_++] = Class91_Sub20_Sub14_Sub2.method956(aClass63_2214, this.anIntArray2223[i_11_], 0);
				}
			}
			final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_12_ = new Class91_Sub20_Sub14_Sub2(class91_sub20_sub14_sub2s, i_10_);
			if (this.aShortArray2219 != null) {
				for (int i_13_ = 0; i_13_ < this.aShortArray2219.length; i_13_++) {
					class91_sub20_sub14_sub2_12_.method963(this.aShortArray2219[i_13_], this.aShortArray2220[i_13_]);
				}
			}
			if (this.aShortArray2224 != null) {
				for (int i_14_ = 0; i_14_ < this.aShortArray2224.length; i_14_++) {
					class91_sub20_sub14_sub2_12_.method964(this.aShortArray2224[i_14_], this.aShortArray2222[i_14_]);
				}
			}
			class91_sub20_sub14_sub2 = class91_sub20_sub14_sub2_12_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ab.k()");
		}
		return class91_sub20_sub14_sub2;
	}

	public boolean method729(final int i) {
		boolean bool;
		try {
			boolean bool_15_ = true;
			for (int i_16_ = 0; i_16_ < 5; i_16_++) {
				if (this.anIntArray2223[i_16_] != -1 && !aClass63_2214.method399(this.anIntArray2223[i_16_], 0, 1218792745)) {
					bool_15_ = false;
				}
			}
			bool = bool_15_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ab.p()");
		}
		return bool;
	}

	public Class91_Sub20_Sub14_Sub2 method730(final int i) {
		Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2;
		try {
			if (this.anIntArray2221 == null) {
				return null;
			}
			final Class91_Sub20_Sub14_Sub2[] class91_sub20_sub14_sub2s = new Class91_Sub20_Sub14_Sub2[this.anIntArray2221.length];
			for (int i_17_ = 0; i_17_ < this.anIntArray2221.length; i_17_++) {
				class91_sub20_sub14_sub2s[i_17_] = Class91_Sub20_Sub14_Sub2.method956(aClass63_2214, this.anIntArray2221[i_17_], 0);
			}
			Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_18_;
			if (1 == class91_sub20_sub14_sub2s.length) {
				class91_sub20_sub14_sub2_18_ = class91_sub20_sub14_sub2s[0];
			} else {
				class91_sub20_sub14_sub2_18_ = new Class91_Sub20_Sub14_Sub2(class91_sub20_sub14_sub2s, class91_sub20_sub14_sub2s.length);
			}
			if (this.aShortArray2219 != null) {
				for (int i_19_ = 0; i_19_ < this.aShortArray2219.length; i_19_++) {
					class91_sub20_sub14_sub2_18_.method963(this.aShortArray2219[i_19_], this.aShortArray2220[i_19_]);
				}
			}
			if (this.aShortArray2224 != null) {
				for (int i_20_ = 0; i_20_ < this.aShortArray2224.length; i_20_++) {
					class91_sub20_sub14_sub2_18_.method964(this.aShortArray2224[i_20_], this.aShortArray2222[i_20_]);
				}
			}
			class91_sub20_sub14_sub2 = class91_sub20_sub14_sub2_18_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ab.d()");
		}
		return class91_sub20_sub14_sub2;
	}

	public static boolean method731(final Js5 class63, final int i, final int i_21_, final int i_22_) {
		try {
			final byte[] is = class63.getFile(i, i_21_, -1055053148);
			if (is == null) {
				return false;
			}
			Class91_Sub5.method619(is, (byte) -55);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ab.a()");
		}
		return true;
	}

	IdkType() {
		try {
			anInt2213 = 129741297;
			this.anIntArray2223 = new int[] { -1, -1, -1, -1, -1 };
			aBoolean2216 = false;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "ab.<init>()");
		}
	}

	static final void method732(final Class91_Sub20_Sub14_Sub1 class91_sub20_sub14_sub1, final int i) {
		try {
			class91_sub20_sub14_sub1.anInt2634 = class91_sub20_sub14_sub1.anInt2587 * -688309691;
			if (class91_sub20_sub14_sub1.anInt2608 * 1965918393 == 0) {
				class91_sub20_sub14_sub1.anInt2637 = 0;
			} else {
				if (-1 != class91_sub20_sub14_sub1.anInt2611 * -815127219 && class91_sub20_sub14_sub1.anInt2614 * 1011042493 == 0) {
					final Class91_Sub20_Sub5 class91_sub20_sub5 = Class7.method152(-815127219 * class91_sub20_sub14_sub1.anInt2611, -462163361);
					if (class91_sub20_sub14_sub1.anInt2633 * -1574481227 > 0 && 1217369845 * class91_sub20_sub5.anInt2279 == 0) {
						class91_sub20_sub14_sub1.anInt2637 += 1088608861;
						return;
					}
					if (-1574481227 * class91_sub20_sub14_sub1.anInt2633 <= 0 && -890176567 * class91_sub20_sub5.anInt2280 == 0) {
						class91_sub20_sub14_sub1.anInt2637 += 1088608861;
						return;
					}
				}
				final int i_23_ = class91_sub20_sub14_sub1.anInt2589 * 107578049;
				final int i_24_ = -668540675 * class91_sub20_sub14_sub1.anInt2583;
				final int i_25_ = 128 * class91_sub20_sub14_sub1.anIntArray2603[1965918393 * class91_sub20_sub14_sub1.anInt2608 - 1] + class91_sub20_sub14_sub1.anInt2622 * 1048128320;
				final int i_26_ = 128 * class91_sub20_sub14_sub1.anIntArray2609[class91_sub20_sub14_sub1.anInt2608 * 1965918393 - 1] + class91_sub20_sub14_sub1.anInt2622 * 1048128320;
				if (i_25_ - i_23_ <= 256 && i_25_ - i_23_ >= -256 && i_26_ - i_24_ <= 256) {
					if (i_26_ - i_24_ >= -256) {
						if (i_23_ < i_25_) {
							if (i_24_ < i_26_) {
								class91_sub20_sub14_sub1.anInt2630 = -1637729536;
							} else if (i_24_ > i_26_) {
								class91_sub20_sub14_sub1.anInt2630 = -574834432;
							} else {
								class91_sub20_sub14_sub1.anInt2630 = -1106281984;
							}
						} else if (i_23_ > i_25_) {
							if (i_24_ < i_26_) {
								class91_sub20_sub14_sub1.anInt2630 = 1594342656;
							} else if (i_24_ > i_26_) {
								class91_sub20_sub14_sub1.anInt2630 = 531447552;
							} else {
								class91_sub20_sub14_sub1.anInt2630 = 1062895104;
							}
						} else if (i_24_ < i_26_) {
							class91_sub20_sub14_sub1.anInt2630 = 2125790208;
						} else if (i_24_ > i_26_) {
							class91_sub20_sub14_sub1.anInt2630 = 0;
						}
						int i_27_ = class91_sub20_sub14_sub1.anInt2630 * -1326660929 - 566074253 * class91_sub20_sub14_sub1.anInt2593 & 0x7ff;
						if (i_27_ > 1024) {
							i_27_ -= 2048;
						}
						int i_28_ = class91_sub20_sub14_sub1.anInt2638 * -645401125;
						if (i_27_ >= -256 && i_27_ <= 256) {
							i_28_ = class91_sub20_sub14_sub1.anInt2590 * 1378613961;
						} else if (i_27_ >= 256 && i_27_ < 768) {
							i_28_ = class91_sub20_sub14_sub1.anInt2594 * 2001202711;
						} else if (i_27_ >= -768 && i_27_ <= -256) {
							i_28_ = class91_sub20_sub14_sub1.anInt2584 * -1424486197;
						}
						if (-1 == i_28_) {
							i_28_ = class91_sub20_sub14_sub1.anInt2590 * 1378613961;
						}
						class91_sub20_sub14_sub1.anInt2634 = i_28_ * -1946916461;
						int i_29_ = 4;
						boolean bool = true;
						if (class91_sub20_sub14_sub1 instanceof Class91_Sub20_Sub14_Sub1_Sub2) {
							bool = ((Class91_Sub20_Sub14_Sub1_Sub2) class91_sub20_sub14_sub1).aClass91_Sub20_Sub11_2858.aBoolean2443;
						}
						if (bool) {
							if (566074253 * class91_sub20_sub14_sub1.anInt2593 != class91_sub20_sub14_sub1.anInt2630 * -1326660929 && -452056301 * class91_sub20_sub14_sub1.anInt2605 == -1 && class91_sub20_sub14_sub1.anInt2632 * 1227519091 != 0) {
								i_29_ = 2;
							}
							if (class91_sub20_sub14_sub1.anInt2608 * 1965918393 > 2) {
								i_29_ = 6;
							}
							if (class91_sub20_sub14_sub1.anInt2608 * 1965918393 > 3) {
								i_29_ = 8;
							}
							if (class91_sub20_sub14_sub1.anInt2637 * 1276824053 > 0 && 1965918393 * class91_sub20_sub14_sub1.anInt2608 > 1) {
								i_29_ = 8;
								class91_sub20_sub14_sub1.anInt2637 -= 1088608861;
							}
						} else {
							if (1965918393 * class91_sub20_sub14_sub1.anInt2608 > 1) {
								i_29_ = 6;
							}
							if (class91_sub20_sub14_sub1.anInt2608 * 1965918393 > 2) {
								i_29_ = 8;
							}
							if (1276824053 * class91_sub20_sub14_sub1.anInt2637 > 0 && class91_sub20_sub14_sub1.anInt2608 * 1965918393 > 1) {
								i_29_ = 8;
								class91_sub20_sub14_sub1.anInt2637 -= 1088608861;
							}
						}
						if (class91_sub20_sub14_sub1.aBooleanArray2620[class91_sub20_sub14_sub1.anInt2608 * 1965918393 - 1]) {
							i_29_ <<= 1;
						}
						if (i_29_ >= 8 && 631774363 * class91_sub20_sub14_sub1.anInt2634 == class91_sub20_sub14_sub1.anInt2590 * 1378613961 && class91_sub20_sub14_sub1.anInt2615 * 1859654467 != -1) {
							class91_sub20_sub14_sub1.anInt2634 = class91_sub20_sub14_sub1.anInt2615 * 47549049;
						}
						if (i_23_ < i_25_) {
							class91_sub20_sub14_sub1.anInt2589 += 1376914753 * i_29_;
							if (class91_sub20_sub14_sub1.anInt2589 * 107578049 > i_25_) {
								class91_sub20_sub14_sub1.anInt2589 = 1376914753 * i_25_;
							}
						} else if (i_23_ > i_25_) {
							class91_sub20_sub14_sub1.anInt2589 -= i_29_ * 1376914753;
							if (107578049 * class91_sub20_sub14_sub1.anInt2589 < i_25_) {
								class91_sub20_sub14_sub1.anInt2589 = 1376914753 * i_25_;
							}
						}
						if (i_24_ < i_26_) {
							class91_sub20_sub14_sub1.anInt2583 += i_29_ * -1534313387;
							if (class91_sub20_sub14_sub1.anInt2583 * -668540675 > i_26_) {
								class91_sub20_sub14_sub1.anInt2583 = i_26_ * -1534313387;
							}
						} else if (i_24_ > i_26_) {
							class91_sub20_sub14_sub1.anInt2583 -= -1534313387 * i_29_;
							if (class91_sub20_sub14_sub1.anInt2583 * -668540675 < i_26_) {
								class91_sub20_sub14_sub1.anInt2583 = -1534313387 * i_26_;
							}
						}
						if (i_25_ == class91_sub20_sub14_sub1.anInt2589 * 107578049 && -668540675 * class91_sub20_sub14_sub1.anInt2583 == i_26_) {
							class91_sub20_sub14_sub1.anInt2608 -= 1461452169;
							if (-1574481227 * class91_sub20_sub14_sub1.anInt2633 > 0) {
								class91_sub20_sub14_sub1.anInt2633 -= -1638757475;
							}
						}
						return;
					}
					if (i <= -1647630973) {
						return;
					}
				}
				class91_sub20_sub14_sub1.anInt2589 = 1376914753 * i_25_;
				class91_sub20_sub14_sub1.anInt2583 = -1534313387 * i_26_;
			}
		} catch (final RuntimeException var10) {
			throw Class102.method1086(var10, "ab.ak()");
		}
	}

	public static int method733(int i, int i_30_, final byte i_31_) {
		int i_32_;
		try {
			int i_33_ = 0;
			for (/**/; i_30_ > 0; i_30_--) {
				i_33_ = i_33_ << 1 | i & 0x1;
				i >>>= 1;
			}
			i_32_ = i_33_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ab.e()");
		}
		return i_32_;
	}

	static void method734(final int i, final int i_34_, final int i_35_, final int i_36_, final int i_37_) {
		try {
			Class91_Sub22 class91_sub22 = (Class91_Sub22) Class91_Sub22.aClass83_2108.method474(i);
			if (class91_sub22 == null) {
				class91_sub22 = new Class91_Sub22();
				Class91_Sub22.aClass83_2108.method478(class91_sub22, i);
			}
			if (class91_sub22.anIntArray2105.length <= i_34_) {
				final int[] is = new int[1 + i_34_];
				final int[] is_38_ = new int[i_34_ + 1];
				for (int i_39_ = 0; i_39_ < class91_sub22.anIntArray2105.length; i_39_++) {
					is[i_39_] = class91_sub22.anIntArray2105[i_39_];
					is_38_[i_39_] = class91_sub22.anIntArray2106[i_39_];
				}
				for (int i_40_ = class91_sub22.anIntArray2105.length; i_40_ < i_34_; i_40_++) {
					is[i_40_] = -1;
					is_38_[i_40_] = 0;
				}
				class91_sub22.anIntArray2105 = is;
				class91_sub22.anIntArray2106 = is_38_;
			}
			class91_sub22.anIntArray2105[i_34_] = i_35_;
			class91_sub22.anIntArray2106[i_34_] = i_36_;
		} catch (final RuntimeException var9) {
			throw Class102.method1086(var9, "ab.f()");
		}
	}
}
