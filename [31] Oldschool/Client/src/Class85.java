/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class85 {
	long aLong1157;
	int[] anIntArray1158;
	public boolean aBoolean1159;
	public static Class96 aClass96_1160 = new Class96(260);
	public static short[] aShortArray1161;
	long aLong1162;
	public static short[] aShortArray1163;
	int anInt1164;
	static final int[] anIntArray1165 = { 8, 11, 4, 6, 9, 7, 10 };
	int[] anIntArray1166;
	public static final int anInt1167 = 85;
	public static final int anInt1168 = 217;
	static final int anInt1169 = 500;

	public int method479(final int i) {
		int i_0_;
		try {
			if (-1 == 1836915151 * this.anInt1164) {
				return this.anIntArray1166[1] + (this.anIntArray1166[8] << 10) + (this.anIntArray1166[0] << 15) + (this.anIntArray1158[4] << 20) + (this.anIntArray1158[0] << 25) + (this.anIntArray1166[11] << 5);
			}
			i_0_ = 305419896 + Class100.method1075(1836915151 * this.anInt1164, -159958486).anInt2427 * 1252206939;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "fk.r()");
		}
		return i_0_;
	}

	public void method480(final int i, final boolean bool, final int i_1_) {
		try {
			int i_2_ = this.anIntArray1158[i];
			if (!bool) {
				if (--i_2_ < 0) {
					i_2_ = Class91_Sub8.aShortArrayArray1852[i].length - 1;
				}
			} else if (++i_2_ >= Class91_Sub8.aShortArrayArray1852[i].length) {
				i_2_ = 0;
			}
			this.anIntArray1158[i] = i_2_;
			method483(-1566573605);
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "fk.f()");
		}
	}

	public void method481(final boolean bool, final int i) {
		try {
			if (aBoolean1159 == bool) {
				if (i == 206549519) {
					/* empty */
				}
			} else {
				method487(null, this.anIntArray1158, bool, -1, 450655242);
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "fk.e()");
		}
	}

	public void method482(final ByteBuffer class91_sub9, final int i) {
		try {
			int i_3_;
			if (aBoolean1159) {
				i_3_ = 1;
			} else {
				i_3_ = 0;
			}
			class91_sub9.writeWordBigEndian(i_3_);
			for (int i_4_ = 0; i_4_ < 7; i_4_++) {
				if (i <= -1271586427) {
					return;
				}
				final int i_5_ = this.anIntArray1166[anIntArray1165[i_4_]];
				if (i_5_ == 0) {
					class91_sub9.writeWordBigEndian(-1);
				} else {
					class91_sub9.writeWordBigEndian(i_5_ - 256);
				}
			}
			for (int i_6_ = 0; i_6_ < 5; i_6_++) {
				class91_sub9.writeWordBigEndian(this.anIntArray1158[i_6_]);
			}
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "fk.t()");
		}
	}

	void method483(final int i) {
		try {
			final long l = -7357894683816303391L * this.aLong1162;
			final int i_7_ = this.anIntArray1166[5];
			final int i_8_ = this.anIntArray1166[9];
			this.anIntArray1166[5] = i_8_;
			this.anIntArray1166[9] = i_7_;
			this.aLong1162 = 0L;
			for (int i_9_ = 0; i_9_ < 12; i_9_++) {
				this.aLong1162 = (-7357894683816303391L * this.aLong1162 << 4) * 2978276616090640161L;
				if (this.anIntArray1166[i_9_] >= 256) {
					this.aLong1162 += 2978276616090640161L * (this.anIntArray1166[i_9_] - 256);
				}
			}
			if (this.anIntArray1166[0] >= 256) {
				this.aLong1162 += (this.anIntArray1166[0] - 256 >> 4) * 2978276616090640161L;
			}
			if (this.anIntArray1166[1] >= 256) {
				this.aLong1162 += (this.anIntArray1166[1] - 256 >> 8) * 2978276616090640161L;
			}
			for (int i_10_ = 0; i_10_ < 5; i_10_++) {
				this.aLong1162 = (this.aLong1162 * -7357894683816303391L << 3) * 2978276616090640161L;
				this.aLong1162 += 2978276616090640161L * this.anIntArray1158[i_10_];
			}
			this.aLong1162 = 2978276616090640161L * (-7357894683816303391L * this.aLong1162 << 1);
			final Class85 class85_11_ = this;
			class85_11_.aLong1162 = class85_11_.aLong1162 + 2978276616090640161L * (aBoolean1159 ? 1 : 0);
			this.anIntArray1166[5] = i_7_;
			this.anIntArray1166[9] = i_8_;
			if (0L != l) {
				if (i < 800210046) {
					if (l != this.aLong1162 * -7357894683816303391L) {
						if (i < 800210046) {
							aClass96_1160.method1069(l);
						}
					}
				}
			}
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "fk.d()");
		}
	}

	public Class91_Sub20_Sub14_Sub3 method484(final Class91_Sub20_Sub5 class91_sub20_sub5, final int i, final Class91_Sub20_Sub5 class91_sub20_sub5_12_, final int i_13_, final byte i_14_) {
		Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3;
		try {
			if (-1 != this.anInt1164 * 1836915151) {
				return Class100.method1075(this.anInt1164 * 1836915151, 1375164654).method811(class91_sub20_sub5, i, class91_sub20_sub5_12_, i_13_, 1094067608);
			}
			long l = this.aLong1162 * -7357894683816303391L;
			int[] is = this.anIntArray1166;
			do {
				if (class91_sub20_sub5 != null) {
					if (i_14_ <= 0) {
						throw new IllegalStateException();
					}
					if (1078965673 * class91_sub20_sub5.anInt2276 < 0) {
						if (i_14_ <= 0) {
							throw new IllegalStateException();
						}
						if (class91_sub20_sub5.anInt2271 * -1719734079 < 0) {
							break;
						}
						if (i_14_ <= 0) {
							throw new IllegalStateException();
						}
					}
					is = new int[12];
					for (int i_15_ = 0; i_15_ < 12; i_15_++) {
						if (i_14_ <= 0) {
							throw new IllegalStateException();
						}
						is[i_15_] = this.anIntArray1166[i_15_];
					}
					if (class91_sub20_sub5.anInt2276 * 1078965673 >= 0) {
						l += class91_sub20_sub5.anInt2276 * 1078965673 - this.anIntArray1166[5] << 40;
						is[5] = 1078965673 * class91_sub20_sub5.anInt2276;
					}
					if (-1719734079 * class91_sub20_sub5.anInt2271 >= 0) {
						if (i_14_ <= 0) {
							throw new IllegalStateException();
						}
						l += class91_sub20_sub5.anInt2271 * -1719734079 - this.anIntArray1166[3] << 48;
						is[3] = -1719734079 * class91_sub20_sub5.anInt2271;
					}
				}
			} while (false);
			Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_16_ = (Class91_Sub20_Sub14_Sub3) aClass96_1160.method1068(l);
			if (class91_sub20_sub14_sub3_16_ == null) {
				if (i_14_ <= 0) {
					throw new IllegalStateException();
				}
				boolean bool = false;
				for (int i_17_ = 0; i_17_ < 12; i_17_++) {
					if (i_14_ <= 0) {
						throw new IllegalStateException();
					}
					final int i_18_ = is[i_17_];
					if (i_18_ >= 256) {
						if (i_14_ <= 0) {
							throw new IllegalStateException();
						}
						if (i_18_ < 512) {
							if (i_14_ <= 0) {
								throw new IllegalStateException();
							}
							if (!Class24.method227(i_18_ - 256, 1578896278).method727((byte) 89)) {
								bool = true;
							}
						}
					}
					if (i_18_ >= 512) {
						if (i_14_ <= 0) {
							throw new IllegalStateException();
						}
						if (!Class86_Sub1.method490(i_18_ - 512, 234554293).method786(aBoolean1159, (byte) -43)) {
							if (i_14_ <= 0) {
								throw new IllegalStateException();
							}
							bool = true;
						}
					}
				}
				if (bool) {
					if (i_14_ <= 0) {
						throw new IllegalStateException();
					}
					if (this.aLong1157 * 4409221329602950613L != -1L) {
						if (i_14_ <= 0) {
							throw new IllegalStateException();
						}
						class91_sub20_sub14_sub3_16_ = (Class91_Sub20_Sub14_Sub3) aClass96_1160.method1068(this.aLong1157 * 4409221329602950613L);
					}
					if (class91_sub20_sub14_sub3_16_ == null) {
						if (i_14_ <= 0) {
							throw new IllegalStateException();
						}
						return null;
					}
				}
				if (class91_sub20_sub14_sub3_16_ == null) {
					final Class91_Sub20_Sub14_Sub2[] class91_sub20_sub14_sub2s = new Class91_Sub20_Sub14_Sub2[12];
					int i_19_ = 0;
					for (int i_20_ = 0; i_20_ < 12; i_20_++) {
						if (i_14_ <= 0) {
							throw new IllegalStateException();
						}
						final int i_21_ = is[i_20_];
						if (i_21_ >= 256) {
							if (i_14_ <= 0) {
								throw new IllegalStateException();
							}
							if (i_21_ < 512) {
								if (i_14_ <= 0) {
									throw new IllegalStateException();
								}
								final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2 = Class24.method227(i_21_ - 256, -519366772).method730(2132491278);
								if (class91_sub20_sub14_sub2 != null) {
									if (i_14_ <= 0) {
										throw new IllegalStateException();
									}
									class91_sub20_sub14_sub2s[i_19_++] = class91_sub20_sub14_sub2;
								}
							}
						}
						if (i_21_ >= 512) {
							if (i_14_ <= 0) {
								throw new IllegalStateException();
							}
							final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2 = Class86_Sub1.method490(i_21_ - 512, 234554293).method784(aBoolean1159, -715740483);
							if (class91_sub20_sub14_sub2 != null) {
								if (i_14_ <= 0) {
									throw new IllegalStateException();
								}
								class91_sub20_sub14_sub2s[i_19_++] = class91_sub20_sub14_sub2;
							}
						}
					}
					final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2 = new Class91_Sub20_Sub14_Sub2(class91_sub20_sub14_sub2s, i_19_);
					for (int i_22_ = 0; i_22_ < 5; i_22_++) {
						if (i_14_ <= 0) {
							throw new IllegalStateException();
						}
						if (this.anIntArray1158[i_22_] < Class91_Sub8.aShortArrayArray1852[i_22_].length) {
							if (i_14_ <= 0) {
								throw new IllegalStateException();
							}
							class91_sub20_sub14_sub2.method963(aShortArray1163[i_22_], Class91_Sub8.aShortArrayArray1852[i_22_][this.anIntArray1158[i_22_]]);
						}
						if (this.anIntArray1158[i_22_] < Class91_Sub20_Sub17.aShortArrayArray2503[i_22_].length) {
							if (i_14_ <= 0) {
								throw new IllegalStateException();
							}
							class91_sub20_sub14_sub2.method963(aShortArray1161[i_22_], Class91_Sub20_Sub17.aShortArrayArray2503[i_22_][this.anIntArray1158[i_22_]]);
						}
					}
					class91_sub20_sub14_sub3_16_ = class91_sub20_sub14_sub2.method967(64, 850, -30, -50, -30);
					aClass96_1160.method1067(class91_sub20_sub14_sub3_16_, l);
					this.aLong1157 = 1015009527859272573L * l;
				}
			}
			if (class91_sub20_sub5 == null) {
				if (i_14_ <= 0) {
					throw new IllegalStateException();
				}
				if (class91_sub20_sub5_12_ == null) {
					if (i_14_ <= 0) {
						throw new IllegalStateException();
					}
					return class91_sub20_sub14_sub3_16_;
				}
			}
			if (class91_sub20_sub5 != null) {
				if (i_14_ <= 0) {
					throw new IllegalStateException();
				}
				if (class91_sub20_sub5_12_ != null) {
					if (i_14_ <= 0) {
						throw new IllegalStateException();
					}
					final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_23_ = class91_sub20_sub5.method754(class91_sub20_sub14_sub3_16_, i, class91_sub20_sub5_12_, i_13_, -218983247);
					return class91_sub20_sub14_sub3_23_;
				}
			}
			Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_24_;
			if (class91_sub20_sub5 != null) {
				if (i_14_ <= 0) {
					throw new IllegalStateException();
				}
				class91_sub20_sub14_sub3_24_ = class91_sub20_sub5.method756(class91_sub20_sub14_sub3_16_, i, -1667263535);
			} else {
				class91_sub20_sub14_sub3_24_ = class91_sub20_sub5_12_.method756(class91_sub20_sub14_sub3_16_, i_13_, -1984540999);
			}
			class91_sub20_sub14_sub3 = class91_sub20_sub14_sub3_24_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "fk.p()");
		}
		return class91_sub20_sub14_sub3;
	}

	Class91_Sub20_Sub14_Sub2 method485(final byte i) {
		Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2;
		try {
			if (1836915151 * this.anInt1164 != -1) {
				return Class100.method1075(this.anInt1164 * 1836915151, 2059861003).method809(-42728531);
			}
			boolean bool = false;
			for (int i_25_ = 0; i_25_ < 12; i_25_++) {
				final int i_26_ = this.anIntArray1166[i_25_];
				if (i_26_ >= 256 && i_26_ < 512 && !Class24.method227(i_26_ - 256, 502278550).method729(-454694087)) {
					bool = true;
				}
				if (i_26_ >= 512 && !Class86_Sub1.method490(i_26_ - 512, 234554293).method787(aBoolean1159, 1629599055)) {
					bool = true;
				}
			}
			if (bool) {
				return null;
			}
			final Class91_Sub20_Sub14_Sub2[] class91_sub20_sub14_sub2s = new Class91_Sub20_Sub14_Sub2[12];
			int i_27_ = 0;
			for (int i_28_ = 0; i_28_ < 12; i_28_++) {
				final int i_29_ = this.anIntArray1166[i_28_];
				if (i_29_ >= 256 && i_29_ < 512) {
					final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_30_ = Class24.method227(i_29_ - 256, 902213167).method728((byte) 0);
					if (class91_sub20_sub14_sub2_30_ != null) {
						class91_sub20_sub14_sub2s[i_27_++] = class91_sub20_sub14_sub2_30_;
					}
				}
				if (i_29_ >= 512) {
					final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_31_ = Class86_Sub1.method490(i_29_ - 512, 234554293).method788(aBoolean1159, 1002987854);
					if (class91_sub20_sub14_sub2_31_ != null) {
						class91_sub20_sub14_sub2s[i_27_++] = class91_sub20_sub14_sub2_31_;
					}
				}
			}
			final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_32_ = new Class91_Sub20_Sub14_Sub2(class91_sub20_sub14_sub2s, i_27_);
			for (int i_33_ = 0; i_33_ < 5; i_33_++) {
				if (this.anIntArray1158[i_33_] < Class91_Sub8.aShortArrayArray1852[i_33_].length) {
					class91_sub20_sub14_sub2_32_.method963(aShortArray1163[i_33_], Class91_Sub8.aShortArrayArray1852[i_33_][this.anIntArray1158[i_33_]]);
				}
				if (this.anIntArray1158[i_33_] < Class91_Sub20_Sub17.aShortArrayArray2503[i_33_].length) {
					class91_sub20_sub14_sub2_32_.method963(aShortArray1161[i_33_], Class91_Sub20_Sub17.aShortArrayArray2503[i_33_][this.anIntArray1158[i_33_]]);
				}
			}
			class91_sub20_sub14_sub2 = class91_sub20_sub14_sub2_32_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "fk.k()");
		}
		return class91_sub20_sub14_sub2;
	}

	public void method486(final int i, final boolean bool, final int i_34_) {
		do {
			try {
				if (1 != i || i_34_ < -1026346865 && !aBoolean1159) {
					int i_35_ = this.anIntArray1166[anIntArray1165[i]];
					if (i_35_ == 0) {
						if (i_34_ >= -1026346865) {
							throw new IllegalStateException();
						}
						break;
					}
					i_35_ -= 256;
					for (;;) {
						if (!bool) {
							if (--i_35_ < 0) {
								i_35_ = 400027459 * IdkType.anInt2217 - 1;
							}
						} else if (++i_35_ >= 400027459 * IdkType.anInt2217) {
							i_35_ = 0;
						}
						final IdkType class91_sub20_sub1 = Class24.method227(i_35_, -1475380977);
						if (class91_sub20_sub1 != null) {
							if (i_34_ >= -1026346865) {
								return;
							}
							if (!class91_sub20_sub1.aBoolean2216) {
								int i_36_;
								if (aBoolean1159) {
									i_36_ = 7;
								} else {
									i_36_ = 0;
								}
								if (i_36_ + i == class91_sub20_sub1.anInt2213 * 2066931951) {
									break;
								}
							}
						}
					}
					this.anIntArray1166[anIntArray1165[i]] = i_35_ + 256;
					method483(-2030243384);
				}
			} catch (final RuntimeException var6) {
				throw Class102.method1086(var6, "fk.w()");
			}
			break;
		} while (false);
	}

	public void method487(int[] is, final int[] is_37_, final boolean bool, final int i, final int i_38_) {
		try {
			if (is == null) {
				is = new int[12];
				for (int i_39_ = 0; i_39_ < 7; i_39_++) {
					for (int i_40_ = 0; i_40_ < 400027459 * IdkType.anInt2217; i_40_++) {
						final IdkType class91_sub20_sub1 = Class24.method227(i_40_, 140428786);
						if (class91_sub20_sub1 != null) {
							if (i_38_ == 1302560181) {
								return;
							}
							if (!class91_sub20_sub1.aBoolean2216) {
								final int i_41_ = 2066931951 * class91_sub20_sub1.anInt2213;
								int i_42_;
								if (bool) {
									i_42_ = 7;
								} else {
									i_42_ = 0;
								}
								if (i_41_ == i_39_ + i_42_) {
									is[anIntArray1165[i_39_]] = 256 + i_40_;
									break;
								}
							}
						}
					}
				}
			}
			this.anIntArray1166 = is;
			this.anIntArray1158 = is_37_;
			aBoolean1159 = bool;
			this.anInt1164 = i * 2024492335;
			method483(-1646281848);
		} catch (final RuntimeException var9) {
			throw Class102.method1086(var9, "fk.i()");
		}
	}
}
