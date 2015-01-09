/* Class91_Sub2_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub2_Sub4 extends Class91_Sub2 {
	Class83 aClass83_2179;
	int[] anIntArray2180;
	int anInt2181;
	int[] anIntArray2182;
	int[] anIntArray2183;
	int[] anIntArray2184;
	int[] anIntArray2185;
	int[] anIntArray2186;
	int[] anIntArray2187;
	Class72 aClass72_2188;
	int[] anIntArray2189;
	int[] anIntArray2190;
	Class91_Sub2_Sub3 aClass91_Sub2_Sub3_2191;
	static final int anInt2192 = 2;
	int[] anIntArray2193;
	int[] anIntArray2194;
	int[] anIntArray2195;
	int[] anIntArray2196;
	int[] anIntArray2197;
	Class91_Sub14[][] aClass91_Sub14ArrayArray2198;
	Class91_Sub14[][] aClass91_Sub14ArrayArray2199;
	int[] anIntArray2200;
	boolean aBoolean2201;
	int anInt2202;
	int anInt2203;
	long aLong2204;
	long aLong2205;
	int anInt2206;

	void method568(final int i, final int i_0_) {
		try {
			int i_1_ = i & 0xf0;
			if (128 == i_1_) {
				final int i_2_ = i & 0xf;
				final int i_3_ = i >> 8 & 0x7f;
				final int i_4_ = i >> 16 & 0x7f;
				method597(i_2_, i_3_, i_4_, (byte) 50);
			} else if (144 == i_1_) {
				final int i_5_ = i & 0xf;
				final int i_6_ = i >> 8 & 0x7f;
				final int i_7_ = i >> 16 & 0x7f;
				if (i_7_ > 0) {
					if (i_0_ == 480956272) {
						method577(i_5_, i_6_, i_7_, -1006550613);
					}
				} else {
					method597(i_5_, i_6_, 64, (byte) -28);
				}
			} else if (160 == i_1_) {
				final int i_8_ = i & 0xf;
				final int i_9_ = i >> 8 & 0x7f;
				final int i_10_ = i >> 16 & 0x7f;
				method579(i_8_, i_9_, i_10_, -274562617);
			} else if (176 == i_1_) {
				if (i_0_ == 480956272) {
					final int i_11_ = i & 0xf;
					final int i_12_ = i >> 8 & 0x7f;
					final int i_13_ = i >> 16 & 0x7f;
					if (i_12_ == 0) {
						this.anIntArray2187[i_11_] = (i_13_ << 14) + (this.anIntArray2187[i_11_] & ~0x1fc000);
					}
					if (i_12_ == 32) {
						if (i_0_ != 480956272) {
							return;
						}
						this.anIntArray2187[i_11_] = (i_13_ << 7) + (this.anIntArray2187[i_11_] & ~0x3f80);
					}
					if (1 == i_12_) {
						if (i_0_ != 480956272) {
							return;
						}
						this.anIntArray2183[i_11_] = (this.anIntArray2183[i_11_] & ~0x3f80) + (i_13_ << 7);
					}
					if (33 == i_12_) {
						this.anIntArray2183[i_11_] = (this.anIntArray2183[i_11_] & ~0x7f) + i_13_;
					}
					if (5 == i_12_) {
						this.anIntArray2190[i_11_] = (this.anIntArray2190[i_11_] & ~0x3f80) + (i_13_ << 7);
					}
					if (37 == i_12_) {
						this.anIntArray2190[i_11_] = i_13_ + (this.anIntArray2190[i_11_] & ~0x7f);
					}
					if (7 == i_12_) {
						this.anIntArray2193[i_11_] = (i_13_ << 7) + (this.anIntArray2193[i_11_] & ~0x3f80);
					}
					if (39 == i_12_) {
						this.anIntArray2193[i_11_] = i_13_ + (this.anIntArray2193[i_11_] & ~0x7f);
					}
					if (10 == i_12_) {
						this.anIntArray2189[i_11_] = (i_13_ << 7) + (this.anIntArray2189[i_11_] & ~0x3f80);
					}
					if (42 == i_12_) {
						this.anIntArray2189[i_11_] = (this.anIntArray2189[i_11_] & ~0x7f) + i_13_;
					}
					if (11 == i_12_) {
						this.anIntArray2184[i_11_] = (i_13_ << 7) + (this.anIntArray2184[i_11_] & ~0x3f80);
					}
					if (43 == i_12_) {
						this.anIntArray2184[i_11_] = (this.anIntArray2184[i_11_] & ~0x7f) + i_13_;
					}
					if (64 == i_12_) {
						if (i_13_ >= 64) {
							if (i_0_ != 480956272) {
								return;
							}
							this.anIntArray2200[i_11_] |= 0x1;
						} else {
							this.anIntArray2200[i_11_] &= ~0x1;
						}
					}
					if (i_12_ == 65) {
						if (i_13_ >= 64) {
							this.anIntArray2200[i_11_] |= 0x2;
						} else {
							method584(i_11_, -431912773);
							this.anIntArray2200[i_11_] &= ~0x2;
						}
					}
					if (99 == i_12_) {
						this.anIntArray2180[i_11_] = (i_13_ << 7) + (this.anIntArray2180[i_11_] & 0x7f);
					}
					if (98 == i_12_) {
						if (i_0_ != 480956272) {
							return;
						}
						this.anIntArray2180[i_11_] = (this.anIntArray2180[i_11_] & 0x3f80) + i_13_;
					}
					if (101 == i_12_) {
						if (i_0_ != 480956272) {
							return;
						}
						this.anIntArray2180[i_11_] = 16384 + (this.anIntArray2180[i_11_] & 0x7f) + (i_13_ << 7);
					}
					if (i_12_ == 100) {
						this.anIntArray2180[i_11_] = (this.anIntArray2180[i_11_] & 0x3f80) + 16384 + i_13_;
					}
					if (120 == i_12_) {
						method582(i_11_, (byte) -11);
					}
					if (i_12_ == 121) {
						method598(i_11_, -1657141147);
					}
					if (123 == i_12_) {
						if (i_0_ != 480956272) {
							return;
						}
						method593(i_11_, 65280);
					}
					if (6 == i_12_) {
						if (i_0_ != 480956272) {
							return;
						}
						final int i_14_ = this.anIntArray2180[i_11_];
						if (i_14_ == 16384) {
							this.anIntArray2194[i_11_] = (this.anIntArray2194[i_11_] & ~0x3f80) + (i_13_ << 7);
						}
					}
					if (i_12_ == 38) {
						final int i_15_ = this.anIntArray2180[i_11_];
						if (16384 == i_15_) {
							this.anIntArray2194[i_11_] = (this.anIntArray2194[i_11_] & ~0x7f) + i_13_;
						}
					}
					if (i_12_ == 16) {
						this.anIntArray2195[i_11_] = (this.anIntArray2195[i_11_] & ~0x3f80) + (i_13_ << 7);
					}
					if (i_12_ == 48) {
						this.anIntArray2195[i_11_] = i_13_ + (this.anIntArray2195[i_11_] & ~0x7f);
					}
					if (i_12_ == 81) {
						if (i_13_ >= 64) {
							this.anIntArray2200[i_11_] |= 0x4;
						} else {
							method596(i_11_, 1826812393);
							this.anIntArray2200[i_11_] &= ~0x4;
						}
					}
					if (17 == i_12_) {
						method595(i_11_, (i_13_ << 7) + (this.anIntArray2196[i_11_] & ~0x3f80), -546640788);
					}
					if (i_12_ == 49) {
						method595(i_11_, (this.anIntArray2196[i_11_] & ~0x7f) + i_13_, -240392061);
					}
				}
			} else if (i_1_ == 192) {
				final int i_16_ = i & 0xf;
				final int i_17_ = i >> 8 & 0x7f;
				method576(i_16_, i_17_ + this.anIntArray2187[i_16_], 502668748);
			} else if (i_1_ == 208) {
				final int i_18_ = i & 0xf;
				final int i_19_ = i >> 8 & 0x7f;
				method580(i_18_, i_19_, -16711936);
			} else if (i_1_ == 224) {
				if (i_0_ == 480956272) {
					final int i_20_ = i & 0xf;
					final int i_21_ = (i >> 8 & 0x7f) + (i >> 9 & 0x3f80);
					method581(i_20_, i_21_, 206479788);
				}
			} else {
				i_1_ = i & 0xff;
				if (255 == i_1_) {
					method583(-1724535029);
				}
			}
		} catch (final RuntimeException var8) {
			throw Class102.method1086(var8, "ey.ah()");
		}
	}

	int method569(final short i) {
		int i_22_;
		try {
			i_22_ = 70145107 * this.anInt2206;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ey.w()");
		}
		return i_22_;
	}

	synchronized boolean method570(final Class91_Sub15 class91_sub15, final Js5 class63, final Class21 class21, final int i, final int i_23_) {
		boolean bool;
		try {
			class91_sub15.method712();
			boolean bool_24_ = true;
			int[] is = null;
			if (i > 0) {
				is = new int[] { i };
			}
			for (Class91_Sub19 class91_sub19 = (Class91_Sub19) class91_sub15.aClass83_1949.method476(); class91_sub19 != null; class91_sub19 = (Class91_Sub19) class91_sub15.aClass83_1949.method477()) {
				final int i_25_ = (int) class91_sub19.aLong1192;
				Class91_Sub11 class91_sub11 = (Class91_Sub11) this.aClass83_2179.method474(i_25_);
				if (class91_sub11 == null) {
					class91_sub11 = Class17.method183(class63, i_25_, 1455955758);
					if (class91_sub11 == null) {
						bool_24_ = false;
						continue;
					}
					this.aClass83_2179.method478(class91_sub11, i_25_);
				}
				if (!class91_sub11.method701(class21, class91_sub19.aByteArray2086, is, (short) -23389)) {
					bool_24_ = false;
				}
			}
			if (bool_24_) {
				class91_sub15.method711();
			}
			bool = bool_24_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ey.e()");
		}
		return bool;
	}

	synchronized void method571(final int i) {
		try {
			for (Class91_Sub11 class91_sub11 = (Class91_Sub11) this.aClass83_2179.method476(); class91_sub11 != null; class91_sub11 = (Class91_Sub11) this.aClass83_2179.method477()) {
				class91_sub11.method702(494555687);
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "ey.t()");
		}
	}

	synchronized void method572(final int i) {
		try {
			for (Class91_Sub11 class91_sub11 = (Class91_Sub11) this.aClass83_2179.method476(); class91_sub11 != null; class91_sub11 = (Class91_Sub11) this.aClass83_2179.method477()) {
				class91_sub11.method495();
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "ey.d()");
		}
	}

	synchronized void method573(final Class91_Sub15 class91_sub15, final boolean bool, final byte i) {
		try {
			method591(-2121969033);
			this.aClass72_2188.method451(class91_sub15.aByteArray1950);
			this.aBoolean2201 = bool;
			this.aLong2204 = 0L;
			final int i_26_ = this.aClass72_2188.method439();
			for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
				this.aClass72_2188.method440(i_27_);
				this.aClass72_2188.method442(i_27_);
				this.aClass72_2188.method441(i_27_);
			}
			this.anInt2202 = this.aClass72_2188.method450() * 1264876261;
			this.anInt2203 = this.aClass72_2188.anIntArray832[-117722387 * this.anInt2202] * -834626797;
			this.aLong2205 = this.aClass72_2188.method446(-2107021541 * this.anInt2203) * -7177856859730474153L;
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "ey.p()");
		}
	}

	public synchronized boolean method574(final int i) {
		boolean bool;
		try {
			bool = this.aClass72_2188.method437();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ey.r()");
		}
		return bool;
	}

	void method575(final int i, final int i_28_, final byte i_29_) {
		try {
			this.anIntArray2185[i] = i_28_;
			this.anIntArray2187[i] = i_28_ & ~0x7f;
			method576(i, i_28_, 191337661);
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "ey.a()");
		}
	}

	void method576(final int i, final int i_30_, final int i_31_) {
		try {
			if (i_30_ != this.anIntArray2186[i]) {
				this.anIntArray2186[i] = i_30_;
				for (int i_32_ = 0; i_32_ < 128; i_32_++) {
					this.aClass91_Sub14ArrayArray2199[i][i_32_] = null;
				}
			}
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "ey.z()");
		}
	}

	void method577(final int i, final int i_33_, final int i_34_, final int i_35_) {
		try {
			method597(i, i_33_, 64, (byte) -22);
			if ((this.anIntArray2200[i] & 0x2) != 0) {
				for (Class91_Sub14 class91_sub14 = (Class91_Sub14) this.aClass91_Sub2_Sub3_2191.aClass95_2174.method1065(); class91_sub14 != null; class91_sub14 = (Class91_Sub14) this.aClass91_Sub2_Sub3_2191.aClass95_2174.method1066()) {
					if (i == class91_sub14.anInt1931 * -1254929663 && class91_sub14.anInt1948 * 675837383 < 0) {
						if (i_35_ < 1569899647) {
							this.aClass91_Sub14ArrayArray2198[i][-1960884919 * class91_sub14.anInt1932] = null;
							this.aClass91_Sub14ArrayArray2198[i][i_33_] = class91_sub14;
							final int i_36_ = (-340818701 * class91_sub14.anInt1941 * class91_sub14.anInt1937 * -217804457 >> 12) + class91_sub14.anInt1935 * 667526481;
							class91_sub14.anInt1935 += (i_33_ - class91_sub14.anInt1932 * -1960884919 << 8) * 271106993;
							class91_sub14.anInt1941 = (i_36_ - class91_sub14.anInt1935 * 667526481) * -116837317;
							class91_sub14.anInt1937 = 245788672;
							class91_sub14.anInt1932 = i_33_ * -569066247;
							return;
						}
						return;
					}
				}
			}
			final Class91_Sub11 class91_sub11 = (Class91_Sub11) this.aClass83_2179.method474(this.anIntArray2186[i]);
			if (class91_sub11 == null) {
				if (i_35_ < 1569899647) {
					/* empty */
				}
			} else {
				final Class91_Sub1_Sub1 class91_sub1_sub1 = class91_sub11.aClass91_Sub1_Sub1Array1872[i_33_];
				if (class91_sub1_sub1 == null) {
					if (i_35_ < 1569899647) {
						/* empty */
					}
				} else {
					final Class91_Sub14 class91_sub14 = new Class91_Sub14();
					class91_sub14.anInt1931 = 1338356993 * i;
					class91_sub14.aClass91_Sub11_1938 = class91_sub11;
					class91_sub14.aClass91_Sub1_Sub1_1929 = class91_sub1_sub1;
					class91_sub14.aClass69_1930 = class91_sub11.aClass69Array1877[i_33_];
					class91_sub14.anInt1944 = -911094295 * class91_sub11.aByteArray1878[i_33_];
					class91_sub14.anInt1932 = i_33_ * -569066247;
					class91_sub14.anInt1933 = (i_34_ * i_34_ * class91_sub11.anInt1873 * 1366518925 * class91_sub11.aByteArray1875[i_33_] + 1024 >> 11) * 1107812613;
					class91_sub14.anInt1934 = -1166383431 * (class91_sub11.aByteArray1882[i_33_] & 0xff);
					class91_sub14.anInt1935 = 271106993 * ((i_33_ << 8) - (class91_sub11.aShortArray1874[i_33_] & 0x7fff));
					class91_sub14.anInt1939 = 0;
					class91_sub14.anInt1928 = 0;
					class91_sub14.anInt1945 = 0;
					class91_sub14.anInt1948 = -1937947639;
					class91_sub14.anInt1942 = 0;
					if (this.anIntArray2195[i] == 0) {
						class91_sub14.aClass91_Sub2_Sub1_1927 = Class91_Sub2_Sub1.method517(class91_sub1_sub1, method585(class91_sub14, (byte) 46), method594(class91_sub14, -38918775), method599(class91_sub14, 1427561331));
					} else {
						class91_sub14.aClass91_Sub2_Sub1_1927 = Class91_Sub2_Sub1.method517(class91_sub1_sub1, method585(class91_sub14, (byte) -15), 0, method599(class91_sub14, 1114026013));
						boolean bool;
						if (class91_sub11.aShortArray1874[i_33_] < 0) {
							bool = true;
						} else {
							bool = false;
						}
						method578(class91_sub14, bool, 220092886);
					}
					if (class91_sub11.aShortArray1874[i_33_] < 0) {
						class91_sub14.aClass91_Sub2_Sub1_1927.method548(-1);
					}
					if (-1077945767 * class91_sub14.anInt1944 >= 0) {
						if (i_35_ >= 1569899647) {
							return;
						}
						final Class91_Sub14 class91_sub14_37_ = this.aClass91_Sub14ArrayArray2199[i][class91_sub14.anInt1944 * -1077945767];
						if (class91_sub14_37_ != null && 675837383 * class91_sub14_37_.anInt1948 < 0) {
							this.aClass91_Sub14ArrayArray2198[i][-1960884919 * class91_sub14_37_.anInt1932] = null;
							class91_sub14_37_.anInt1948 = 0;
						}
						this.aClass91_Sub14ArrayArray2199[i][-1077945767 * class91_sub14.anInt1944] = class91_sub14;
					}
					this.aClass91_Sub2_Sub3_2191.aClass95_2174.method1058(class91_sub14);
					this.aClass91_Sub14ArrayArray2198[i][i_33_] = class91_sub14;
				}
			}
		} catch (final RuntimeException var9) {
			throw Class102.method1086(var9, "ey.s()");
		}
	}

	void method578(final Class91_Sub14 class91_sub14, final boolean bool, final int i) {
		try {
			int i_38_ = class91_sub14.aClass91_Sub1_Sub1_1929.aByteArray2149.length;
			int i_39_;
			do {
				if (bool) {
					if (i == -1101587550) {
						return;
					}
					if (class91_sub14.aClass91_Sub1_Sub1_1929.aBoolean2153) {
						if (i != -1101587550) {
							final int i_40_ = i_38_ + i_38_ - class91_sub14.aClass91_Sub1_Sub1_1929.anInt2151;
							i_39_ = (int) ((long) this.anIntArray2195[class91_sub14.anInt1931 * -1254929663] * (long) i_40_ >> 6);
							i_38_ <<= 8;
							if (i_39_ >= i_38_) {
								if (i == -1101587550) {
									return;
								}
								i_39_ = i_38_ + i_38_ - 1 - i_39_;
								class91_sub14.aClass91_Sub2_Sub1_1927.method523(true);
							}
							break;
						}
						return;
					}
				}
				i_39_ = (int) ((long) i_38_ * (long) this.anIntArray2195[class91_sub14.anInt1931 * -1254929663] >> 6);
			} while (false);
			class91_sub14.aClass91_Sub2_Sub1_1927.method522(i_39_);
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "ey.m()");
		}
	}

	void method579(final int i, final int i_41_, final int i_42_, final int i_43_) {
		/* empty */
	}

	void method580(final int i, final int i_44_, final int i_45_) {
		/* empty */
	}

	void method581(final int i, final int i_46_, final int i_47_) {
		try {
			this.anIntArray2182[i] = i_46_;
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "ey.v()");
		}
	}

	void method582(final int i, final byte i_48_) {
		try {
			for (Class91_Sub14 class91_sub14 = (Class91_Sub14) this.aClass91_Sub2_Sub3_2191.aClass95_2174.method1062(); class91_sub14 != null; class91_sub14 = (Class91_Sub14) this.aClass91_Sub2_Sub3_2191.aClass95_2174.method1063()) {
				if (i < 0 || -1254929663 * class91_sub14.anInt1931 == i) {
					if (class91_sub14.aClass91_Sub2_Sub1_1927 != null) {
						if (i_48_ >= 25) {
							break;
						}
						class91_sub14.aClass91_Sub2_Sub1_1927.method526(Class6.anInt81 * -45833585 / 100);
						if (class91_sub14.aClass91_Sub2_Sub1_1927.method530()) {
							this.aClass91_Sub2_Sub3_2191.aClass91_Sub2_Sub2_2178.method559(class91_sub14.aClass91_Sub2_Sub1_1927);
						}
						class91_sub14.method709(-2007539252);
					}
					if (class91_sub14.anInt1948 * 675837383 < 0) {
						this.aClass91_Sub14ArrayArray2198[class91_sub14.anInt1931 * -1254929663][class91_sub14.anInt1932 * -1960884919] = null;
					}
					class91_sub14.method495();
				}
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "ey.j()");
		}
	}

	void method583(final int i) {
		try {
			method582(-1, (byte) 3);
			method598(-1, 1189249528);
			for (int i_49_ = 0; i_49_ < 16; i_49_++) {
				this.anIntArray2186[i_49_] = this.anIntArray2185[i_49_];
			}
			for (int i_50_ = 0; i_50_ < 16; i_50_++) {
				this.anIntArray2187[i_50_] = this.anIntArray2185[i_50_] & ~0x7f;
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "ey.c()");
		}
	}

	void method584(final int i, final int i_51_) {
		try {
			if ((this.anIntArray2200[i] & 0x2) != 0) {
				for (Class91_Sub14 class91_sub14 = (Class91_Sub14) this.aClass91_Sub2_Sub3_2191.aClass95_2174.method1062(); class91_sub14 != null; class91_sub14 = (Class91_Sub14) this.aClass91_Sub2_Sub3_2191.aClass95_2174.method1063()) {
					if (i_51_ != -431912773) {
						break;
					}
					if (-1254929663 * class91_sub14.anInt1931 == i && this.aClass91_Sub14ArrayArray2198[i][class91_sub14.anInt1932 * -1960884919] == null && 675837383 * class91_sub14.anInt1948 < 0) {
						class91_sub14.anInt1948 = 0;
					}
				}
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "ey.ae()");
		}
	}

	public Class91_Sub2_Sub4() {
		try {
			this.anInt2206 = 1058003712;
			this.anInt2181 = 1689448896;
			this.anIntArray2193 = new int[16];
			this.anIntArray2189 = new int[16];
			this.anIntArray2184 = new int[16];
			this.anIntArray2185 = new int[16];
			this.anIntArray2186 = new int[16];
			this.anIntArray2187 = new int[16];
			this.anIntArray2182 = new int[16];
			this.anIntArray2183 = new int[16];
			this.anIntArray2190 = new int[16];
			this.anIntArray2200 = new int[16];
			this.anIntArray2180 = new int[16];
			this.anIntArray2194 = new int[16];
			this.anIntArray2195 = new int[16];
			this.anIntArray2196 = new int[16];
			this.anIntArray2197 = new int[16];
			this.aClass91_Sub14ArrayArray2198 = new Class91_Sub14[16][128];
			this.aClass91_Sub14ArrayArray2199 = new Class91_Sub14[16][128];
			this.aClass72_2188 = new Class72();
			this.aClass91_Sub2_Sub3_2191 = new Class91_Sub2_Sub3(this);
			this.aClass83_2179 = new Class83(128);
			method583(-1699232011);
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "ey.<init>()");
		}
	}

	int method585(final Class91_Sub14 class91_sub14, final byte i) {
		int i_52_;
		try {
			int i_53_ = class91_sub14.anInt1935 * 667526481 + (class91_sub14.anInt1941 * -340818701 * class91_sub14.anInt1937 * -217804457 >> 12);
			i_53_ += (this.anIntArray2182[class91_sub14.anInt1931 * -1254929663] - 8192) * this.anIntArray2194[class91_sub14.anInt1931 * -1254929663] >> 12;
			final Class69 class69 = class91_sub14.aClass69_1930;
			do {
				if (-200880591 * class69.anInt804 > 0) {
					if (i == 0) {
						throw new IllegalStateException();
					}
					if (class69.anInt809 * -662087457 <= 0) {
						if (i == 0) {
							throw new IllegalStateException();
						}
						if (this.anIntArray2183[-1254929663 * class91_sub14.anInt1931] <= 0) {
							break;
						}
						if (i == 0) {
							throw new IllegalStateException();
						}
					}
					int i_54_ = -662087457 * class69.anInt809 << 2;
					final int i_55_ = 1405690831 * class69.anInt811 << 1;
					if (-1163435409 * class91_sub14.anInt1943 < i_55_) {
						i_54_ = class91_sub14.anInt1943 * -1163435409 * i_54_ / i_55_;
					}
					i_54_ += this.anIntArray2183[class91_sub14.anInt1931 * -1254929663] >> 7;
					final double d = Math.sin((class91_sub14.anInt1940 * -1789071857 & 0x1ff) * 0.01227184630308513);
					i_53_ += (int) (i_54_ * d);
				}
			} while (false);
			final int i_56_ = (int) (class91_sub14.aClass91_Sub1_Sub1_1929.anInt2152 * 256 * Math.pow(2.0, i_53_ * 3.255208333333333E-4) / (-45833585 * Class6.anInt81) + 0.5);
			int i_57_;
			if (i_56_ < 1) {
				if (i == 0) {
					throw new IllegalStateException();
				}
				i_57_ = 1;
			} else {
				i_57_ = i_56_;
			}
			i_52_ = i_57_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ey.an()");
		}
		return i_52_;
	}

	public synchronized void method586(final int i, final int i_58_, final short i_59_) {
		try {
			method575(i, i_58_, (byte) -106);
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "ey.l()");
		}
	}

	static void method587(final int i, final Class14 class14, final Class63_Sub1 class63_sub1, final byte i_60_) {
		try {
			final Class91_Sub12 class91_sub12 = new Class91_Sub12();
			class91_sub12.anInt1891 = 2123633189;
			class91_sub12.aLong1192 = i;
			class91_sub12.aClass14_1887 = class14;
			class91_sub12.aClass63_Sub1_1888 = class63_sub1;
			final Class95 class95 = Class78.aClass95_1111;
			synchronized (class95) {
				Class78.aClass95_1111.method1058(class91_sub12);
			}
			final Object object = Class78.anObject1108;
			synchronized (object) {
				if (-1535148391 * Class78.anInt1110 == 0) {
					Class91_Sub22.aClass25_2110.method232(new Class78(), 5, -2061598633);
				}
				Class78.anInt1110 = -831011816;
			}
		} catch (final RuntimeException var10) {
			throw Class102.method1086(var10, "ey.e()");
		}
	}

	@Override
	protected synchronized Class91_Sub2 method499() {
		Class91_Sub2_Sub3 class91_sub2_sub3;
		try {
			class91_sub2_sub3 = this.aClass91_Sub2_Sub3_2191;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ey.h()");
		}
		return class91_sub2_sub3;
	}

	@Override
	protected synchronized int method501() {
		return 0;
	}

	@Override
	protected synchronized void method505(int i) {
		try {
			if (this.aClass72_2188.method437()) {
				final int i_61_ = this.aClass72_2188.anInt828 * -138309457 * this.anInt2181 / (-45833585 * Class6.anInt81);
				do {
					final long l = this.aLong2204 * 7452120320473780093L + (long) i * (long) i_61_;
					if (-1088703680038825881L * this.aLong2205 - l >= 0L) {
						this.aLong2204 = 2684299968241394133L * l;
						break;
					}
					final int i_62_ = (int) ((i_61_ + -1088703680038825881L * this.aLong2205 - this.aLong2204 * 7452120320473780093L - 1L) / i_61_);
					this.aLong2204 += (long) i_62_ * (long) i_61_ * 2684299968241394133L;
					this.aClass91_Sub2_Sub3_2191.method505(i_62_);
					i -= i_62_;
					method588((short) 9619);
				} while (this.aClass72_2188.method437());
			}
			this.aClass91_Sub2_Sub3_2191.method505(i);
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "ey.ao()");
		}
	}

	void method588(final short i) {
		try {
			int i_63_ = this.anInt2202 * -117722387;
			int i_64_ = -2107021541 * this.anInt2203;
			long l = this.aLong2205 * -1088703680038825881L;
			while_12_: for (;;) {
				if (this.anInt2203 * -2107021541 != i_64_) {
					this.anInt2202 = 1264876261 * i_63_;
					this.anInt2203 = -834626797 * i_64_;
					this.aLong2205 = -7177856859730474153L * l;
					return;
				}
				if (i == 1536) {
					throw new IllegalStateException();
				}
				while (this.aClass72_2188.anIntArray832[i_63_] == i_64_) {
					this.aClass72_2188.method440(i_63_);
					final int i_65_ = this.aClass72_2188.method443(i_63_);
					if (i_65_ == 1) {
						this.aClass72_2188.method449();
						this.aClass72_2188.method441(i_63_);
						if (!this.aClass72_2188.method447()) {
							if (i == 1536) {
								throw new IllegalStateException();
							}
						} else {
							if (!this.aBoolean2201 || i_64_ == 0) {
								break while_12_;
							}
							this.aClass72_2188.method448(l);
						}
						break;
					}
					if ((i_65_ & 0x80) != 0) {
						method568(i_65_, 480956272);
					}
					this.aClass72_2188.method442(i_63_);
					this.aClass72_2188.method441(i_63_);
				}
				i_63_ = this.aClass72_2188.method450();
				i_64_ = this.aClass72_2188.anIntArray832[i_63_];
				l = this.aClass72_2188.method446(i_64_);
			}
			method583(-2052179566);
			this.aClass72_2188.method438();
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "ey.ax()");
		}
	}

	boolean method589(final Class91_Sub14 class91_sub14, final int i) {
		do {
			try {
				if (class91_sub14.aClass91_Sub2_Sub1_1927 != null) {
					break;
				}
				if (class91_sub14.anInt1948 * 675837383 >= 0) {
					class91_sub14.method495();
					if (-1077945767 * class91_sub14.anInt1944 > 0 && class91_sub14 == this.aClass91_Sub14ArrayArray2199[-1254929663 * class91_sub14.anInt1931][-1077945767 * class91_sub14.anInt1944]) {
						this.aClass91_Sub14ArrayArray2199[class91_sub14.anInt1931 * -1254929663][class91_sub14.anInt1944 * -1077945767] = null;
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "ey.ab()");
			}
			return true;
		} while (false);
		return false;
	}

	boolean method590(final Class91_Sub14 class91_sub14, final int[] is, final int i, final int i_66_, final int i_67_) {
		try {
			class91_sub14.anInt1946 = Class6.anInt81 * -45833585 / 100 * -1286579269;
			if (675837383 * class91_sub14.anInt1948 >= 0 && (class91_sub14.aClass91_Sub2_Sub1_1927 == null || class91_sub14.aClass91_Sub2_Sub1_1927.method529())) {
				class91_sub14.method709(-1677893146);
				class91_sub14.method495();
				if (-1077945767 * class91_sub14.anInt1944 > 0 && this.aClass91_Sub14ArrayArray2199[-1254929663 * class91_sub14.anInt1931][class91_sub14.anInt1944 * -1077945767] == class91_sub14) {
					this.aClass91_Sub14ArrayArray2199[class91_sub14.anInt1931 * -1254929663][-1077945767 * class91_sub14.anInt1944] = null;
				}
				return true;
			}
			int i_68_ = class91_sub14.anInt1937 * -217804457;
			if (i_68_ > 0) {
				i_68_ -= (int) (16.0 * Math.pow(2.0, this.anIntArray2190[-1254929663 * class91_sub14.anInt1931] * 4.921259842519685E-4) + 0.5);
				if (i_68_ < 0) {
					i_68_ = 0;
				}
				class91_sub14.anInt1937 = i_68_ * 338750055;
			}
			class91_sub14.aClass91_Sub2_Sub1_1927.method527(method585(class91_sub14, (byte) 94));
			final Class69 class69 = class91_sub14.aClass69_1930;
			boolean bool = false;
			class91_sub14.anInt1943 += 343030927;
			class91_sub14.anInt1940 += class69.anInt804 * 78430143;
			final double d = 5.086263020833333E-6 * ((-1960884919 * class91_sub14.anInt1932 - 60 << 8) + (-340818701 * class91_sub14.anInt1941 * -217804457 * class91_sub14.anInt1937 >> 12));
			if (367787563 * class69.anInt805 > 0) {
				if (-1321880557 * class69.anInt803 > 0) {
					class91_sub14.anInt1939 += (int) (128.0 * Math.pow(2.0, d * (class69.anInt803 * -1321880557)) + 0.5) * -1568202401;
				} else {
					class91_sub14.anInt1939 += 1133555584;
				}
			}
			if (class69.aByteArray813 != null) {
				if (1153521069 * class69.anInt806 > 0) {
					class91_sub14.anInt1928 += (int) (128.0 * Math.pow(2.0, d * (class69.anInt806 * 1153521069)) + 0.5) * 1681196551;
				} else {
					class91_sub14.anInt1928 += 444793728;
				}
				for (/**/; -881213261 * class91_sub14.anInt1945 < class69.aByteArray813.length - 2; class91_sub14.anInt1945 += 1081990390) {
					if (905807799 * class91_sub14.anInt1928 <= (class69.aByteArray813[2 + -881213261 * class91_sub14.anInt1945] & 0xff) << 8) {
						break;
					}
				}
				if (class91_sub14.anInt1945 * -881213261 == class69.aByteArray813.length - 2 && class69.aByteArray813[1 + class91_sub14.anInt1945 * -881213261] == 0) {
					bool = true;
				}
			}
			if (675837383 * class91_sub14.anInt1948 >= 0 && class69.aByteArray810 != null && (this.anIntArray2200[class91_sub14.anInt1931 * -1254929663] & 0x1) == 0 && (class91_sub14.anInt1944 * -1077945767 < 0 || this.aClass91_Sub14ArrayArray2199[-1254929663 * class91_sub14.anInt1931][class91_sub14.anInt1944 * -1077945767] != class91_sub14)) {
				if (331458481 * class69.anInt807 > 0) {
					class91_sub14.anInt1948 += (int) (128.0 * Math.pow(2.0, 331458481 * class69.anInt807 * d) + 0.5) * 1937947639;
				} else {
					class91_sub14.anInt1948 += -1050805376;
				}
				for (/**/; 1069533245 * class91_sub14.anInt1942 < class69.aByteArray810.length - 2; class91_sub14.anInt1942 += 1954160170) {
					if (class91_sub14.anInt1948 * 675837383 <= (class69.aByteArray810[class91_sub14.anInt1942 * 1069533245 + 2] & 0xff) << 8) {
						break;
					}
				}
				if (1069533245 * class91_sub14.anInt1942 == class69.aByteArray810.length - 2) {
					bool = true;
				}
			}
			if (bool) {
				class91_sub14.aClass91_Sub2_Sub1_1927.method526(-1568132749 * class91_sub14.anInt1946);
				if (is != null) {
					class91_sub14.aClass91_Sub2_Sub1_1927.method498(is, i, i_66_);
				} else {
					class91_sub14.aClass91_Sub2_Sub1_1927.method505(i_66_);
				}
				if (class91_sub14.aClass91_Sub2_Sub1_1927.method530()) {
					this.aClass91_Sub2_Sub3_2191.aClass91_Sub2_Sub2_2178.method559(class91_sub14.aClass91_Sub2_Sub1_1927);
				}
				class91_sub14.method709(-1550853207);
				if (class91_sub14.anInt1948 * 675837383 >= 0) {
					class91_sub14.method495();
					if (-1077945767 * class91_sub14.anInt1944 > 0 && this.aClass91_Sub14ArrayArray2199[class91_sub14.anInt1931 * -1254929663][-1077945767 * class91_sub14.anInt1944] == class91_sub14) {
						this.aClass91_Sub14ArrayArray2199[class91_sub14.anInt1931 * -1254929663][class91_sub14.anInt1944 * -1077945767] = null;
					}
				}
				return true;
			}
			class91_sub14.aClass91_Sub2_Sub1_1927.method551(-1568132749 * class91_sub14.anInt1946, method594(class91_sub14, -1370934830), method599(class91_sub14, 720978565));
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ey.af()");
		}
		return false;
	}

	@Override
	protected synchronized Class91_Sub2 method504() {
		return this.aClass91_Sub2_Sub3_2191;
	}

	public synchronized void method591(final int i) {
		try {
			this.aClass72_2188.method438();
			method583(-1754422024);
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "ey.k()");
		}
	}

	@Override
	protected synchronized Class91_Sub2 method507() {
		return null;
	}

	@Override
	protected synchronized Class91_Sub2 method508() {
		return null;
	}

	@Override
	protected synchronized int method509() {
		return 0;
	}

	@Override
	protected synchronized int method497() {
		return 0;
	}

	@Override
	protected synchronized void method511(int i) {
		if (this.aClass72_2188.method437()) {
			final int i_69_ = this.aClass72_2188.anInt828 * -138309457 * this.anInt2181 / (-45833585 * Class6.anInt81);
			do {
				final long l = this.aLong2204 * 7452120320473780093L + (long) i * (long) i_69_;
				if (-1088703680038825881L * this.aLong2205 - l >= 0L) {
					this.aLong2204 = 2684299968241394133L * l;
					break;
				}
				final int i_70_ = (int) ((i_69_ + -1088703680038825881L * this.aLong2205 - this.aLong2204 * 7452120320473780093L - 1L) / i_69_);
				this.aLong2204 += (long) i_70_ * (long) i_69_ * 2684299968241394133L;
				this.aClass91_Sub2_Sub3_2191.method505(i_70_);
				i -= i_70_;
				method588((short) 15707);
			} while (this.aClass72_2188.method437());
		}
		this.aClass91_Sub2_Sub3_2191.method505(i);
	}

	@Override
	protected synchronized void method514(final int[] is, int i, int i_71_) {
		if (this.aClass72_2188.method437()) {
			final int i_72_ = -138309457 * this.anInt2181 * this.aClass72_2188.anInt828 / (-45833585 * Class6.anInt81);
			do {
				final long l = 7452120320473780093L * this.aLong2204 + (long) i_72_ * (long) i_71_;
				if (-1088703680038825881L * this.aLong2205 - l >= 0L) {
					this.aLong2204 = l * 2684299968241394133L;
					break;
				}
				final int i_73_ = (int) ((i_72_ + -1088703680038825881L * this.aLong2205 - this.aLong2204 * 7452120320473780093L - 1L) / i_72_);
				this.aLong2204 += 2684299968241394133L * i_72_ * i_73_;
				this.aClass91_Sub2_Sub3_2191.method498(is, i, i_73_);
				i += i_73_;
				i_71_ -= i_73_;
				method588((short) 29359);
			} while (this.aClass72_2188.method437());
		}
		this.aClass91_Sub2_Sub3_2191.method498(is, i, i_71_);
	}

	@Override
	protected synchronized Class91_Sub2 method502() {
		return this.aClass91_Sub2_Sub3_2191;
	}

	@Override
	protected synchronized int method510() {
		return 0;
	}

	synchronized void method592(final int i, final short i_74_) {
		try {
			this.anInt2206 = i * -1757474853;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "ey.i()");
		}
	}

	void method593(final int i, final int i_75_) {
		try {
			for (Class91_Sub14 class91_sub14 = (Class91_Sub14) this.aClass91_Sub2_Sub3_2191.aClass95_2174.method1062(); class91_sub14 != null; class91_sub14 = (Class91_Sub14) this.aClass91_Sub2_Sub3_2191.aClass95_2174.method1063()) {
				if ((i < 0 || -1254929663 * class91_sub14.anInt1931 == i) && class91_sub14.anInt1948 * 675837383 < 0) {
					if (i_75_ != 65280) {
						break;
					}
					this.aClass91_Sub14ArrayArray2198[-1254929663 * class91_sub14.anInt1931][class91_sub14.anInt1932 * -1960884919] = null;
					class91_sub14.anInt1948 = 0;
				}
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "ey.q()");
		}
	}

	int method594(final Class91_Sub14 class91_sub14, final int i) {
		int i_76_;
		try {
			final Class69 class69 = class91_sub14.aClass69_1930;
			int i_77_ = 4096 + this.anIntArray2184[class91_sub14.anInt1931 * -1254929663] * this.anIntArray2193[class91_sub14.anInt1931 * -1254929663] >> 13;
			i_77_ = i_77_ * i_77_ + 16384 >> 15;
			i_77_ = class91_sub14.anInt1933 * 1816314829 * i_77_ + 16384 >> 15;
			i_77_ = 128 + this.anInt2206 * 70145107 * i_77_ >> 8;
			if (367787563 * class69.anInt805 > 0) {
				i_77_ = (int) (i_77_ * Math.pow(0.5, (double) (367787563 * class69.anInt805) * (double) (-256542049 * class91_sub14.anInt1939) * 1.953125E-5) + 0.5);
			}
			if (class69.aByteArray813 != null) {
				final int i_78_ = class91_sub14.anInt1928 * 905807799;
				int i_79_ = class69.aByteArray813[class91_sub14.anInt1945 * -881213261 + 1];
				if (-881213261 * class91_sub14.anInt1945 < class69.aByteArray813.length - 2) {
					final int i_80_ = (class69.aByteArray813[-881213261 * class91_sub14.anInt1945] & 0xff) << 8;
					final int i_81_ = (class69.aByteArray813[2 + -881213261 * class91_sub14.anInt1945] & 0xff) << 8;
					i_79_ += (i_78_ - i_80_) * (class69.aByteArray813[3 + class91_sub14.anInt1945 * -881213261] - i_79_) / (i_81_ - i_80_);
				}
				i_77_ = 32 + i_77_ * i_79_ >> 6;
			}
			if (675837383 * class91_sub14.anInt1948 > 0 && class69.aByteArray810 != null) {
				final int i_82_ = 675837383 * class91_sub14.anInt1948;
				int i_83_ = class69.aByteArray810[1 + class91_sub14.anInt1942 * 1069533245];
				if (class91_sub14.anInt1942 * 1069533245 < class69.aByteArray810.length - 2) {
					final int i_84_ = (class69.aByteArray810[class91_sub14.anInt1942 * 1069533245] & 0xff) << 8;
					final int i_85_ = (class69.aByteArray810[class91_sub14.anInt1942 * 1069533245 + 2] & 0xff) << 8;
					i_83_ += (class69.aByteArray810[3 + 1069533245 * class91_sub14.anInt1942] - i_83_) * (i_82_ - i_84_) / (i_85_ - i_84_);
				}
				i_77_ = i_77_ * i_83_ + 32 >> 6;
			}
			i_76_ = i_77_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ey.av()");
		}
		return i_76_;
	}

	void method595(final int i, final int i_86_, final int i_87_) {
		try {
			this.anIntArray2196[i] = i_86_;
			this.anIntArray2197[i] = (int) (2097152.0 * Math.pow(2.0, i_86_ * 5.4931640625E-4) + 0.5);
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "ey.aw()");
		}
	}

	void method596(final int i, final int i_88_) {
		try {
			if ((this.anIntArray2200[i] & 0x4) != 0) {
				for (Class91_Sub14 class91_sub14 = (Class91_Sub14) this.aClass91_Sub2_Sub3_2191.aClass95_2174.method1062(); class91_sub14 != null; class91_sub14 = (Class91_Sub14) this.aClass91_Sub2_Sub3_2191.aClass95_2174.method1063()) {
					if (i == -1254929663 * class91_sub14.anInt1931) {
						class91_sub14.anInt1947 = 0;
					}
				}
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "ey.aa()");
		}
	}

	@Override
	protected synchronized void method512(final int[] is, int i, int i_89_) {
		if (this.aClass72_2188.method437()) {
			final int i_90_ = 1332238801 * this.anInt2181 * this.aClass72_2188.anInt828 / (-45833585 * Class6.anInt81);
			do {
				final long l = 7452120320473780093L * this.aLong2204 + (long) i_90_ * (long) i_89_;
				if (-1088703680038825881L * this.aLong2205 - l >= 0L) {
					this.aLong2204 = l * 2684299968241394133L;
					break;
				}
				final int i_91_ = (int) ((i_90_ + -1088703680038825881L * this.aLong2205 - this.aLong2204 * 7452120320473780093L - 1L) / i_90_);
				this.aLong2204 += 2684299968241394133L * i_90_ * i_91_;
				this.aClass91_Sub2_Sub3_2191.method498(is, i, i_91_);
				i += i_91_;
				i_89_ -= i_91_;
				method588((short) -9185);
			} while (this.aClass72_2188.method437());
		}
		this.aClass91_Sub2_Sub3_2191.method498(is, i, i_89_);
	}

	@Override
	protected synchronized void method498(final int[] is, int i, int i_92_) {
		try {
			if (this.aClass72_2188.method437()) {
				final int i_93_ = -138309457 * this.anInt2181 * this.aClass72_2188.anInt828 / (-45833585 * Class6.anInt81);
				do {
					final long l = 7452120320473780093L * this.aLong2204 + (long) i_93_ * (long) i_92_;
					if (-1088703680038825881L * this.aLong2205 - l >= 0L) {
						this.aLong2204 = l * 2684299968241394133L;
						break;
					}
					final int i_94_ = (int) ((i_93_ + -1088703680038825881L * this.aLong2205 - this.aLong2204 * 7452120320473780093L - 1L) / i_93_);
					this.aLong2204 += 2684299968241394133L * i_93_ * i_94_;
					this.aClass91_Sub2_Sub3_2191.method498(is, i, i_94_);
					i += i_94_;
					i_92_ -= i_94_;
					method588((short) -2674);
				} while (this.aClass72_2188.method437());
			}
			this.aClass91_Sub2_Sub3_2191.method498(is, i, i_92_);
		} catch (final RuntimeException var8) {
			throw Class102.method1086(var8, "ey.x()");
		}
	}

	void method597(final int i, final int i_95_, final int i_96_, final byte i_97_) {
		try {
			final Class91_Sub14 class91_sub14 = this.aClass91_Sub14ArrayArray2198[i][i_95_];
			if (class91_sub14 == null) {
				if (i_97_ == 4) {
					throw new IllegalStateException();
				}
			} else {
				this.aClass91_Sub14ArrayArray2198[i][i_95_] = null;
				if ((this.anIntArray2200[i] & 0x2) != 0) {
					for (Class91_Sub14 class91_sub14_98_ = (Class91_Sub14) this.aClass91_Sub2_Sub3_2191.aClass95_2174.method1062(); class91_sub14_98_ != null; class91_sub14_98_ = (Class91_Sub14) this.aClass91_Sub2_Sub3_2191.aClass95_2174.method1063()) {
						if (class91_sub14.anInt1931 * -1254929663 == class91_sub14_98_.anInt1931 * -1254929663 && class91_sub14_98_.anInt1948 * 675837383 < 0 && class91_sub14 != class91_sub14_98_) {
							class91_sub14.anInt1948 = 0;
							break;
						}
					}
				} else {
					class91_sub14.anInt1948 = 0;
				}
			}
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "ey.u()");
		}
	}

	@Override
	protected synchronized void method500(final int[] is, int i, int i_99_) {
		if (this.aClass72_2188.method437()) {
			final int i_100_ = 148484274 * this.anInt2181 * this.aClass72_2188.anInt828 / (-1538998704 * Class6.anInt81);
			do {
				final long l = 7452120320473780093L * this.aLong2204 + (long) i_100_ * (long) i_99_;
				if (-1088703680038825881L * this.aLong2205 - l >= 0L) {
					this.aLong2204 = l * 2684299968241394133L;
					break;
				}
				final int i_101_ = (int) ((i_100_ + -1088703680038825881L * this.aLong2205 - this.aLong2204 * 7452120320473780093L - 1L) / i_100_);
				this.aLong2204 += 2684299968241394133L * i_100_ * i_101_;
				this.aClass91_Sub2_Sub3_2191.method498(is, i, i_101_);
				i += i_101_;
				i_99_ -= i_101_;
				method588((short) 20411);
			} while (this.aClass72_2188.method437());
		}
		this.aClass91_Sub2_Sub3_2191.method498(is, i, i_99_);
	}

	void method598(int i, final int i_102_) {
		try {
			if (i < 0) {
				for (i = 0; i < 16; i++) {
					if (i_102_ >= 1825142466) {
						break;
					}
					method598(i, 612394351);
				}
			} else {
				this.anIntArray2193[i] = 12800;
				this.anIntArray2189[i] = 8192;
				this.anIntArray2184[i] = 16383;
				this.anIntArray2182[i] = 8192;
				this.anIntArray2183[i] = 0;
				this.anIntArray2190[i] = 8192;
				method584(i, -431912773);
				method596(i, 1531787458);
				this.anIntArray2200[i] = 0;
				this.anIntArray2180[i] = 32767;
				this.anIntArray2194[i] = 256;
				this.anIntArray2195[i] = 0;
				method595(i, 8192, 1943324856);
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "ey.n()");
		}
	}

	@Override
	protected synchronized Class91_Sub2 method515() {
		return null;
	}

	@Override
	protected synchronized Class91_Sub2 method506() {
		return null;
	}

	int method599(final Class91_Sub14 class91_sub14, final int i) {
		int i_103_;
		try {
			final int i_104_ = this.anIntArray2189[class91_sub14.anInt1931 * -1254929663];
			if (i_104_ < 8192) {
				return i_104_ * 1127464841 * class91_sub14.anInt1934 + 32 >> 6;
			}
			i_103_ = 16384 - ((16384 - i_104_) * (128 - 1127464841 * class91_sub14.anInt1934) + 32 >> 6);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ey.ak()");
		}
		return i_103_;
	}
}
