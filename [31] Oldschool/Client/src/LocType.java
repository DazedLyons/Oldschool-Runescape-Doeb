/* Class91_Sub20_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class LocType extends Class91_Sub20 {
	static boolean aBoolean2297 = false;
	int anInt2298;
	public static Class96 aClass96_2299 = new Class96(64);
	public static Class96 aClass96_2300 = new Class96(500);
	public static Class96 aClass96_2301 = new Class96(30);
	public boolean aBoolean2302;
	static Class91_Sub20_Sub14_Sub2[] aClass91_Sub20_Sub14_Sub2Array2303 = new Class91_Sub20_Sub14_Sub2[4];
	public int anInt2304;
	public int[] anIntArray2305;
	int[] anIntArray2306;
	static final String aString2307 = "rw";
	static final int anInt2308 = 66;
	short[] aShortArray2309;
	short[] aShortArray2310;
	short[] aShortArray2311;
	public int anInt2312;
	public int anInt2313;
	public int anInt2314;
	public boolean aBoolean2315;
	public int anInt2316;
	int anInt2317;
	public int anInt2318;
	public static Class96 aClass96_2319 = new Class96(30);
	public int anInt2320;
	public int anInt2321;
	int anInt2322;
	int[] anIntArray2323;
	public String[] aStringArray2324;
	public int anInt2325;
	public int anInt2326;
	boolean aBoolean2327;
	public int anInt2328;
	int anInt2329;
	int anInt2330;
	int anInt2331;
	public String aString2332;
	int anInt2333;
	int anInt2334;
	public int anInt2335;
	static Js5 aClass63_2336;
	boolean aBoolean2337;
	short[] aShortArray2338;
	public boolean aBoolean2339;
	int anInt2340;
	public int anInt2341;
	public boolean aBoolean2342;
	int anInt2343;
	public int anInt2344;
	public int[] anIntArray2345;
	boolean aBoolean2346;
	int anInt2347;
	public int anInt2348;

	LocType() {
		try {
			aString2332 = "null";
			anInt2312 = 1076643171;
			anInt2313 = 1750178021;
			anInt2314 = -1314455786;
			aBoolean2315 = true;
			anInt2328 = -840028385;
			this.anInt2317 = -852327677;
			this.aBoolean2346 = false;
			aBoolean2342 = false;
			anInt2320 = -1079588677;
			anInt2321 = 561480496;
			this.anInt2322 = 0;
			this.anInt2347 = 0;
			aStringArray2324 = new String[5];
			anInt2325 = 13549011;
			anInt2326 = -1580898469;
			this.aBoolean2327 = false;
			aBoolean2302 = true;
			this.anInt2329 = 46303872;
			this.anInt2330 = -1990484096;
			this.anInt2331 = 1236541056;
			this.anInt2298 = 0;
			this.anInt2333 = 0;
			this.anInt2334 = 0;
			anInt2335 = 0;
			aBoolean2339 = false;
			this.aBoolean2337 = false;
			anInt2341 = 113625947;
			this.anInt2340 = 517646805;
			this.anInt2343 = -732831659;
			anInt2316 = -1527619475;
			anInt2318 = 0;
			anInt2344 = 0;
			anInt2348 = 0;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "an.<init>()");
		}
	}

	void decode(final ByteBuffer class91_sub9, final int i) {
		try {
			for (;;) {
				final int i_0_ = class91_sub9.readUnsignedByte();
				if (i_0_ == 0) {
					break;
				}
				method779(class91_sub9, i_0_, (byte) 2);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "an.e()");
		}
	}

	void postDecode(final int i) {
		try {
			if (-1 == anInt2328 * 331313953) {
				anInt2328 = 0;
				if (this.anIntArray2323 != null && (this.anIntArray2306 == null || this.anIntArray2306[0] == 10)) {
					anInt2328 = 840028385;
				}
				for (int i_1_ = 0; i_1_ < 5; i_1_++) {
					if (aStringArray2324[i_1_] != null) {
						anInt2328 = 840028385;
					}
				}
			}
			if (-1 == -901606611 * anInt2341) {
				int i_2_;
				if (1727180835 * anInt2314 != 0) {
					i_2_ = 1;
				} else {
					i_2_ = 0;
				}
				anInt2341 = i_2_ * -113625947;
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "an.f()");
		}
	}

	public final boolean method770(final int i, final byte i_3_) {
		try {
			if (this.anIntArray2306 == null) {
				if (this.anIntArray2323 == null) {
					return true;
				}
				if (i != 10) {
					return true;
				}
				boolean bool = true;
				int[] is;
				final int i_4_ = (is = this.anIntArray2323).length;
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					final int i_6_ = is[i_5_];
					bool &= Class30.aClass63_357.method399(i_6_ & 0xffff, 0, 1218792745);
				}
				return bool;
			}
			for (int i_7_ = 0; i_7_ < this.anIntArray2306.length; i_7_++) {
				if (this.anIntArray2306[i_7_] == i) {
					return Class30.aClass63_357.method399(this.anIntArray2323[i_7_] & 0xffff, 0, 1218792745);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "an.d()");
		}
		return true;
	}

	public final boolean method771(final int i) {
		boolean bool;
		try {
			if (this.anIntArray2323 == null) {
				return true;
			}
			boolean bool_8_ = true;
			int[] is;
			final int i_9_ = (is = this.anIntArray2323).length;
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
				final int i_11_ = is[i_10_];
				bool_8_ &= Class30.aClass63_357.method399(i_11_ & 0xffff, 0, 1218792745);
			}
			bool = bool_8_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "an.p()");
		}
		return bool;
	}

	public final Class91_Sub20_Sub14_Sub3 method772(final int i, final int i_12_, final int[][] is, final int i_13_, final int i_14_, final int i_15_, final short i_16_) {
		Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3;
		try {
			long l;
			if (this.anIntArray2306 == null) {
				l = i_12_ + (anInt2304 * 1261936319 << 10);
			} else {
				l = i_12_ + (i << 3) + (anInt2304 * 1261936319 << 10);
			}
			Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_17_ = (Class91_Sub20_Sub14_Sub3) aClass96_2319.method1068(l);
			if (class91_sub20_sub14_sub3_17_ == null) {
				final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2 = method778(i, i_12_, -218329187);
				if (class91_sub20_sub14_sub2 == null) {
					return null;
				}
				class91_sub20_sub14_sub3_17_ = class91_sub20_sub14_sub2.method967(64 + this.anInt2322 * -431810027, this.anInt2347 * 818114583 + 768, -50, -10, -50);
				aClass96_2319.method1067(class91_sub20_sub14_sub3_17_, l);
			}
			if (this.anInt2317 * 1989378133 >= 0) {
				class91_sub20_sub14_sub3_17_ = class91_sub20_sub14_sub3_17_.method970(is, i_13_, i_14_, i_15_, true, 1989378133 * this.anInt2317);
			}
			class91_sub20_sub14_sub3 = class91_sub20_sub14_sub3_17_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "an.r()");
		}
		return class91_sub20_sub14_sub3;
	}

	public final Class91_Sub20_Sub14_Sub3 method773(final int i, final int i_18_, final int[][] is, final int i_19_, final int i_20_, final int i_21_, final Class91_Sub20_Sub5 class91_sub20_sub5, final int i_22_, final int i_23_) {
		Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3;
		try {
			long l;
			if (this.anIntArray2306 == null) {
				l = i_18_ + (anInt2304 * 1261936319 << 10);
			} else {
				l = (i << 3) + (anInt2304 * 1261936319 << 10) + i_18_;
			}
			Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_24_ = (Class91_Sub20_Sub14_Sub3) aClass96_2319.method1068(l);
			if (class91_sub20_sub14_sub3_24_ == null) {
				final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2 = method778(i, i_18_, 1713838193);
				if (class91_sub20_sub14_sub2 == null) {
					return null;
				}
				class91_sub20_sub14_sub3_24_ = class91_sub20_sub14_sub2.method967(-431810027 * this.anInt2322 + 64, this.anInt2347 * 818114583 + 768, -50, -10, -50);
				aClass96_2319.method1067(class91_sub20_sub14_sub3_24_, l);
			}
			if (class91_sub20_sub5 == null && 1989378133 * this.anInt2317 == -1) {
				return class91_sub20_sub14_sub3_24_;
			}
			if (class91_sub20_sub5 != null) {
				class91_sub20_sub14_sub3_24_ = class91_sub20_sub5.method752(class91_sub20_sub14_sub3_24_, i_22_, i_18_, (short) -1609);
			} else {
				class91_sub20_sub14_sub3_24_ = class91_sub20_sub14_sub3_24_.method971(true);
			}
			if (this.anInt2317 * 1989378133 >= 0) {
				class91_sub20_sub14_sub3_24_ = class91_sub20_sub14_sub3_24_.method970(is, i_19_, i_20_, i_21_, false, this.anInt2317 * 1989378133);
			}
			class91_sub20_sub14_sub3 = class91_sub20_sub14_sub3_24_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "an.l()");
		}
		return class91_sub20_sub14_sub3;
	}

	public boolean method774(final int i) {
		try {
			if (anIntArray2305 == null) {
				if (-311994725 * anInt2316 == -1 && anIntArray2345 == null) {
					final boolean bool = false;
					return bool;
				}
				final boolean bool = true;
				return bool;
			}
			int i_25_ = 0;
			for (;;) {
				if (i_25_ >= anIntArray2305.length) {
					return false;
				}
				if (-1 != anIntArray2305[i_25_]) {
					final LocType class91_sub20_sub7_26_ = Class60.method392(anIntArray2305[i_25_], 1182489966);
					if (-1 != class91_sub20_sub7_26_.anInt2316 * -311994725) {
						break;
					}
					if (class91_sub20_sub7_26_.anIntArray2345 != null) {
						if (i >= -666352924) {
							throw new IllegalStateException();
						}
						break;
					}
				}
				i_25_++;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "an.s()");
		}
		return true;
	}

	public final Class91_Sub20_Sub14 method775(final int i, final int i_27_, final int[][] is, final int i_28_, final int i_29_, final int i_30_, final byte i_31_) {
		Class91_Sub20_Sub14 class91_sub20_sub14;
		try {
			long l;
			if (this.anIntArray2306 == null) {
				l = (1261936319 * anInt2304 << 10) + i_27_;
			} else {
				l = (i << 3) + (anInt2304 * 1261936319 << 10) + i_27_;
			}
			Class91_Sub20 class91_sub20 = aClass96_2301.method1068(l);
			if (class91_sub20 == null) {
				final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2 = method778(i, i_27_, 1020861490);
				if (class91_sub20_sub14_sub2 == null) {
					return null;
				}
				if (!this.aBoolean2346) {
					class91_sub20 = class91_sub20_sub14_sub2.method967(this.anInt2322 * -431810027 + 64, 818114583 * this.anInt2347 + 768, -50, -10, -50);
				} else {
					class91_sub20_sub14_sub2.aShort2674 = (short) (64 + -431810027 * this.anInt2322);
					class91_sub20_sub14_sub2.aShort2675 = (short) (768 + this.anInt2347 * 818114583);
					class91_sub20_sub14_sub2.method965();
					class91_sub20 = class91_sub20_sub14_sub2;
				}
				aClass96_2301.method1067(class91_sub20, l);
			}
			if (this.aBoolean2346) {
				class91_sub20 = ((Class91_Sub20_Sub14_Sub2) class91_sub20).method951();
			}
			if (this.anInt2317 * 1989378133 >= 0) {
				if (class91_sub20 instanceof Class91_Sub20_Sub14_Sub3) {
					class91_sub20 = ((Class91_Sub20_Sub14_Sub3) class91_sub20).method970(is, i_28_, i_29_, i_30_, true, this.anInt2317 * 1989378133);
				} else if (class91_sub20 instanceof Class91_Sub20_Sub14_Sub2) {
					class91_sub20 = ((Class91_Sub20_Sub14_Sub2) class91_sub20).method952(is, i_28_, i_29_, i_30_, true, 1989378133 * this.anInt2317);
				}
			}
			class91_sub20_sub14 = (Class91_Sub20_Sub14) class91_sub20;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "an.k()");
		}
		return class91_sub20_sub14;
	}

	public static Class65[] method776(final int i) {
		Class65[] class65s;
		try {
			class65s = new Class65[] { Class65.aClass65_1419, Class65.aClass65_1416, Class65.aClass65_1425, Class65.aClass65_1421, Class65.aClass65_1418, Class65.aClass65_1417 };
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "an.k()");
		}
		return class65s;
	}

	public final LocType method777(final int i) {
		try {
			int i_32_ = -1;
			if (this.anInt2340 * -1495091069 != -1) {
				i_32_ = Class75.method453(this.anInt2340 * -1495091069, 81920);
			} else if (this.anInt2343 * -945560829 != -1) {
				i_32_ = Class93.anIntArray1199[this.anInt2343 * -945560829];
			}
			if (i_32_ >= 0 && i_32_ < anIntArray2305.length && anIntArray2305[i_32_] != -1) {
				return Class60.method392(anIntArray2305[i_32_], 1423458642);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "an.z()");
		}
		return null;
	}

	final Class91_Sub20_Sub14_Sub2 method778(final int i, int i_33_, final int i_34_) {
		Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2;
		try {
			Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_35_ = null;
			if (this.anIntArray2306 == null) {
				if (i != 10) {
					return null;
				}
				if (this.anIntArray2323 == null) {
					return null;
				}
				boolean bool = this.aBoolean2327;
				if (2 == i && i_33_ > 3) {
					bool = !bool;
				}
				final int i_36_ = this.anIntArray2323.length;
				for (int i_37_ = 0; i_37_ < i_36_; i_37_++) {
					int i_38_ = this.anIntArray2323[i_37_];
					if (bool) {
						i_38_ += 65536;
					}
					class91_sub20_sub14_sub2_35_ = (Class91_Sub20_Sub14_Sub2) aClass96_2300.method1068(i_38_);
					if (class91_sub20_sub14_sub2_35_ == null) {
						class91_sub20_sub14_sub2_35_ = Class91_Sub20_Sub14_Sub2.method956(Class30.aClass63_357, i_38_ & 0xffff, 0);
						if (class91_sub20_sub14_sub2_35_ == null) {
							return null;
						}
						if (bool) {
							class91_sub20_sub14_sub2_35_.method966();
						}
						aClass96_2300.method1067(class91_sub20_sub14_sub2_35_, i_38_);
					}
					if (i_36_ > 1) {
						aClass91_Sub20_Sub14_Sub2Array2303[i_37_] = class91_sub20_sub14_sub2_35_;
					}
				}
				if (i_36_ > 1) {
					class91_sub20_sub14_sub2_35_ = new Class91_Sub20_Sub14_Sub2(aClass91_Sub20_Sub14_Sub2Array2303, i_36_);
				}
			} else {
				int i_39_ = -1;
				for (int i_40_ = 0; i_40_ < this.anIntArray2306.length; i_40_++) {
					if (i == this.anIntArray2306[i_40_]) {
						i_39_ = i_40_;
						break;
					}
				}
				if (i_39_ == -1) {
					return null;
				}
				int i_41_ = this.anIntArray2323[i_39_];
				boolean bool;
				if (i_33_ > 3) {
					bool = true;
				} else {
					bool = false;
				}
				final boolean bool_42_ = this.aBoolean2327 ^ bool;
				if (bool_42_) {
					i_41_ += 65536;
				}
				class91_sub20_sub14_sub2_35_ = (Class91_Sub20_Sub14_Sub2) aClass96_2300.method1068(i_41_);
				if (class91_sub20_sub14_sub2_35_ == null) {
					class91_sub20_sub14_sub2_35_ = Class91_Sub20_Sub14_Sub2.method956(Class30.aClass63_357, i_41_ & 0xffff, 0);
					if (class91_sub20_sub14_sub2_35_ == null) {
						return null;
					}
					if (bool_42_) {
						class91_sub20_sub14_sub2_35_.method966();
					}
					aClass96_2300.method1067(class91_sub20_sub14_sub2_35_, i_41_);
				}
			}
			boolean bool;
			if (128 == 211329597 * this.anInt2329 && 1739372735 * this.anInt2330 == 128 && 128 == 468610837 * this.anInt2331) {
				bool = false;
			} else {
				bool = true;
			}
			boolean bool_43_;
			if (-1347056287 * this.anInt2298 == 0 && 814879685 * this.anInt2333 == 0 && this.anInt2334 * -1057114313 == 0) {
				bool_43_ = false;
			} else {
				bool_43_ = true;
			}
			boolean bool_44_;
			if (i_33_ == 0 && !bool && !bool_43_) {
				bool_44_ = true;
			} else {
				bool_44_ = false;
			}
			final boolean bool_45_ = this.aShortArray2338 == null;
			boolean bool_46_;
			if (this.aShortArray2310 == null) {
				bool_46_ = true;
			} else {
				bool_46_ = false;
			}
			final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_47_ = new Class91_Sub20_Sub14_Sub2(class91_sub20_sub14_sub2_35_, bool_44_, bool_45_, bool_46_, true);
			if (i == 4 && i_33_ > 3) {
				class91_sub20_sub14_sub2_47_.method958(256);
				class91_sub20_sub14_sub2_47_.method957(45, 0, -45);
			}
			i_33_ &= 0x3;
			if (1 == i_33_) {
				class91_sub20_sub14_sub2_47_.method953();
			} else if (2 == i_33_) {
				class91_sub20_sub14_sub2_47_.method954();
			} else if (3 == i_33_) {
				class91_sub20_sub14_sub2_47_.method955();
			}
			if (this.aShortArray2338 != null) {
				for (int i_48_ = 0; i_48_ < this.aShortArray2338.length; i_48_++) {
					class91_sub20_sub14_sub2_47_.method963(this.aShortArray2338[i_48_], this.aShortArray2309[i_48_]);
				}
			}
			if (this.aShortArray2310 != null) {
				for (int i_49_ = 0; i_49_ < this.aShortArray2310.length; i_49_++) {
					class91_sub20_sub14_sub2_47_.method964(this.aShortArray2310[i_49_], this.aShortArray2311[i_49_]);
				}
			}
			if (bool) {
				class91_sub20_sub14_sub2_47_.method968(211329597 * this.anInt2329, this.anInt2330 * 1739372735, this.anInt2331 * 468610837);
			}
			if (bool_43_) {
				class91_sub20_sub14_sub2_47_.method957(this.anInt2298 * -1347056287, this.anInt2333 * 814879685, -1057114313 * this.anInt2334);
			}
			class91_sub20_sub14_sub2 = class91_sub20_sub14_sub2_47_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "an.a()");
		}
		return class91_sub20_sub14_sub2;
	}

	void method779(final ByteBuffer class91_sub9, final int i, final byte i_50_) {
		try {
			if (i == 1) {
				if (i_50_ <= 0) {
					throw new IllegalStateException();
				}
				final int i_51_ = class91_sub9.readUnsignedByte();
				if (i_51_ > 0) {
					if (i_50_ <= 0) {
						throw new IllegalStateException();
					}
					if (this.anIntArray2323 != null) {
						if (i_50_ <= 0) {
							return;
						}
						if (!aBoolean2297) {
							class91_sub9.currentOffset += 1697643285 * i_51_;
							return;
						}
						if (i_50_ <= 0) {
							return;
						}
					}
					this.anIntArray2306 = new int[i_51_];
					this.anIntArray2323 = new int[i_51_];
					for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
						if (i_50_ <= 0) {
							throw new IllegalStateException();
						}
						this.anIntArray2323[i_52_] = class91_sub9.method686((byte) -86);
						this.anIntArray2306[i_52_] = class91_sub9.readUnsignedByte();
					}
				}
			} else if (i == 2) {
				if (i_50_ <= 0) {
					throw new IllegalStateException();
				}
				aString2332 = class91_sub9.method645((byte) -98);
			} else if (i == 5) {
				if (i_50_ <= 0) {
					throw new IllegalStateException();
				}
				final int i_53_ = class91_sub9.readUnsignedByte();
				if (i_53_ > 0) {
					if (i_50_ <= 0) {
						throw new IllegalStateException();
					}
					if (this.anIntArray2323 != null) {
						if (i_50_ <= 0) {
							return;
						}
						if (!aBoolean2297) {
							class91_sub9.currentOffset += i_53_ * 1131762190;
							return;
						}
						if (i_50_ <= 0) {
							return;
						}
					}
					this.anIntArray2306 = null;
					this.anIntArray2323 = new int[i_53_];
					for (int i_54_ = 0; i_54_ < i_53_; i_54_++) {
						if (i_50_ <= 0) {
							throw new IllegalStateException();
						}
						this.anIntArray2323[i_54_] = class91_sub9.method686((byte) -105);
					}
				}
			} else if (i == 14) {
				if (i_50_ <= 0) {
					throw new IllegalStateException();
				}
				anInt2312 = class91_sub9.readUnsignedByte() * 1076643171;
			} else if (i == 15) {
				if (i_50_ <= 0) {
					throw new IllegalStateException();
				}
				anInt2313 = class91_sub9.readUnsignedByte() * 1750178021;
			} else if (i == 17) {
				if (i_50_ <= 0) {
					throw new IllegalStateException();
				}
				anInt2314 = 0;
				aBoolean2315 = false;
			} else if (18 == i) {
				if (i_50_ <= 0) {
					throw new IllegalStateException();
				}
				aBoolean2315 = false;
			} else if (19 == i) {
				if (i_50_ <= 0) {
					throw new IllegalStateException();
				}
				anInt2328 = class91_sub9.readUnsignedByte() * 840028385;
			} else if (i == 21) {
				if (i_50_ <= 0) {
					throw new IllegalStateException();
				}
				this.anInt2317 = 0;
			} else if (22 == i) {
				if (i_50_ > 0) {
					this.aBoolean2346 = true;
				}
			} else if (23 == i) {
				if (i_50_ <= 0) {
					throw new IllegalStateException();
				}
				aBoolean2342 = true;
			} else if (24 == i) {
				if (i_50_ <= 0) {
					throw new IllegalStateException();
				}
				anInt2320 = class91_sub9.method686((byte) -1) * 1079588677;
				if (963101581 * anInt2320 == 65535) {
					anInt2320 = -1079588677;
				}
			} else if (i == 27) {
				if (i_50_ <= 0) {
					throw new IllegalStateException();
				}
				anInt2314 = -657227893;
			} else if (28 == i) {
				if (i_50_ > 0) {
					anInt2321 = class91_sub9.readUnsignedByte() * 1645705267;
				}
			} else if (i == 29) {
				if (i_50_ <= 0) {
					throw new IllegalStateException();
				}
				this.anInt2322 = class91_sub9.method642(785234371) * 1047979325;
			} else if (i == 39) {
				if (i_50_ <= 0) {
					throw new IllegalStateException();
				}
				this.anInt2347 = class91_sub9.method642(1251565873) * -1179418801;
			} else {
				if (i >= 30) {
					if (i_50_ <= 0) {
						return;
					}
					if (i < 35) {
						if (i_50_ <= 0) {
							throw new IllegalStateException();
						}
						aStringArray2324[i - 30] = class91_sub9.method645((byte) -51);
						if (aStringArray2324[i - 30].equalsIgnoreCase(Class75.aString881)) {
							if (i_50_ > 0) {
								aStringArray2324[i - 30] = null;
							}
						}
						return;
					}
				}
				if (40 == i) {
					final int i_55_ = class91_sub9.readUnsignedByte();
					this.aShortArray2338 = new short[i_55_];
					this.aShortArray2309 = new short[i_55_];
					for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
						if (i_50_ <= 0) {
							break;
						}
						this.aShortArray2338[i_56_] = (short) class91_sub9.method686((byte) -120);
						this.aShortArray2309[i_56_] = (short) class91_sub9.method686((byte) -9);
					}
				} else if (i == 41) {
					if (i_50_ <= 0) {
						throw new IllegalStateException();
					}
					final int i_57_ = class91_sub9.readUnsignedByte();
					this.aShortArray2310 = new short[i_57_];
					this.aShortArray2311 = new short[i_57_];
					for (int i_58_ = 0; i_58_ < i_57_; i_58_++) {
						if (i_50_ <= 0) {
							throw new IllegalStateException();
						}
						this.aShortArray2310[i_58_] = (short) class91_sub9.method686((byte) -76);
						this.aShortArray2311[i_58_] = (short) class91_sub9.method686((byte) -42);
					}
				} else if (60 == i) {
					if (i_50_ <= 0) {
						throw new IllegalStateException();
					}
					anInt2325 = class91_sub9.method686((byte) -70) * -13549011;
				} else if (i == 62) {
					if (i_50_ > 0) {
						this.aBoolean2327 = true;
					}
				} else if (64 == i) {
					if (i_50_ > 0) {
						aBoolean2302 = false;
					}
				} else if (65 == i) {
					this.anInt2329 = class91_sub9.method686((byte) -23) * -2147121899;
				} else if (66 == i) {
					this.anInt2330 = class91_sub9.method686((byte) -20) * -1189955777;
				} else if (67 == i) {
					if (i_50_ <= 0) {
						throw new IllegalStateException();
					}
					this.anInt2331 = class91_sub9.method686((byte) -34) * 1788045373;
				} else if (68 == i) {
					if (i_50_ <= 0) {
						throw new IllegalStateException();
					}
					anInt2326 = class91_sub9.method686((byte) -80) * 1580898469;
				} else if (i == 69) {
					if (i_50_ <= 0) {
						throw new IllegalStateException();
					}
					anInt2335 = class91_sub9.readUnsignedByte() * 1110736443;
				} else if (70 == i) {
					if (i_50_ <= 0) {
						throw new IllegalStateException();
					}
					this.anInt2298 = class91_sub9.readShort2() * -1568418143;
				} else if (71 == i) {
					if (i_50_ > 0) {
						this.anInt2333 = class91_sub9.readShort2() * -1063390451;
					}
				} else if (72 == i) {
					if (i_50_ <= 0) {
						throw new IllegalStateException();
					}
					this.anInt2334 = class91_sub9.readShort2() * -499405177;
				} else if (73 == i) {
					if (i_50_ <= 0) {
						throw new IllegalStateException();
					}
					aBoolean2339 = true;
				} else if (i == 74) {
					this.aBoolean2337 = true;
				} else if (75 == i) {
					if (i_50_ > 0) {
						anInt2341 = class91_sub9.readUnsignedByte() * -113625947;
					}
				} else if (77 == i) {
					if (i_50_ <= 0) {
						throw new IllegalStateException();
					}
					this.anInt2340 = class91_sub9.method686((byte) -44) * -517646805;
					if (this.anInt2340 * -1495091069 == 65535) {
						this.anInt2340 = 517646805;
					}
					this.anInt2343 = class91_sub9.method686((byte) -25) * 732831659;
					if (65535 == -945560829 * this.anInt2343) {
						if (i_50_ <= 0) {
							throw new IllegalStateException();
						}
						this.anInt2343 = -732831659;
					}
					final int i_59_ = class91_sub9.readUnsignedByte();
					anIntArray2305 = new int[i_59_ + 1];
					for (int i_60_ = 0; i_60_ <= i_59_; i_60_++) {
						if (i_50_ <= 0) {
							break;
						}
						anIntArray2305[i_60_] = class91_sub9.method686((byte) -56);
						if (anIntArray2305[i_60_] == 65535) {
							if (i_50_ <= 0) {
								throw new IllegalStateException();
							}
							anIntArray2305[i_60_] = -1;
						}
					}
				} else if (i == 78) {
					if (i_50_ <= 0) {
						throw new IllegalStateException();
					}
					anInt2316 = class91_sub9.method686((byte) -4) * 1527619475;
					anInt2318 = class91_sub9.readUnsignedByte() * 1575491197;
				} else if (i == 79) {
					if (i_50_ <= 0) {
						throw new IllegalStateException();
					}
					anInt2344 = class91_sub9.method686((byte) -122) * -495951265;
					anInt2348 = class91_sub9.method686((byte) -39) * -1162145849;
					anInt2318 = class91_sub9.readUnsignedByte() * 1575491197;
					final int i_61_ = class91_sub9.readUnsignedByte();
					anIntArray2345 = new int[i_61_];
					for (int i_62_ = 0; i_62_ < i_61_; i_62_++) {
						anIntArray2345[i_62_] = class91_sub9.method686((byte) -31);
					}
				} else if (i == 81) {
					this.anInt2317 = class91_sub9.readUnsignedByte() * -847446784;
				}
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "an.t()");
		}
	}

	static final void method780(final Class91_Sub18[] class91_sub18s, final int i, final byte i_63_) {
		try {
			Class91_Sub18[] class91_sub18s_65_;
			final int i_64_ = (class91_sub18s_65_ = class91_sub18s).length;
			int i_66_ = 0;
			for (/**/; i_66_ < i_64_; i_66_++) {
				final Class91_Sub18 class91_sub18 = class91_sub18s_65_[i_66_];
				if (i_63_ == 0) {
					throw new IllegalStateException();
				}
				final Class91_Sub18 class91_sub18_67_ = class91_sub18;
				if (class91_sub18_67_ != null && i == 777859439 * class91_sub18_67_.anInt1980 && (!class91_sub18_67_.aBoolean1968 || !Class63_Sub1.method432(class91_sub18_67_, (byte) -67))) {
					if (633275603 * class91_sub18_67_.anInt2057 == 0) {
						if (!class91_sub18_67_.aBoolean1968 && Class63_Sub1.method432(class91_sub18_67_, (byte) -20)) {
							if (i_63_ == 0) {
								throw new IllegalStateException();
							}
							if (class91_sub18_67_ != Class102.aClass91_Sub18_1314) {
								continue;
							}
						}
						method780(class91_sub18s, -1026201747 * class91_sub18_67_.anInt2032, (byte) -51);
						if (class91_sub18_67_.aClass91_Sub18Array2077 != null) {
							method780(class91_sub18_67_.aClass91_Sub18Array2077, -1026201747 * class91_sub18_67_.anInt2032, (byte) -4);
						}
						final Class91_Sub10 class91_sub10 = (Class91_Sub10) client.aClass83_1603.method474(-1026201747 * class91_sub18_67_.anInt2032);
						if (class91_sub10 != null) {
							if (i_63_ == 0) {
								throw new IllegalStateException();
							}
							final int i_68_ = 337747539 * class91_sub10.anInt1865;
							if (!Class91_Sub20_Sub9.method800(i_68_, -108975779)) {
								if (i_63_ == 0) {
									throw new IllegalStateException();
								}
							} else {
								method780(Class91_Sub18.aClass91_Sub18ArrayArray1962[i_68_], -1, (byte) -4);
							}
						}
					}
					if (633275603 * class91_sub18_67_.anInt2057 == 6) {
						if (i_63_ == 0) {
							throw new IllegalStateException();
						}
						if (-1 != class91_sub18_67_.anInt2005 * -345440531 || -1 != class91_sub18_67_.anInt2006 * -1328703365) {
							final boolean bool = Class91_Sub20_Sub2.method740(class91_sub18_67_, 1992436073);
							int i_69_;
							if (bool) {
								i_69_ = class91_sub18_67_.anInt2006 * -1328703365;
							} else {
								i_69_ = class91_sub18_67_.anInt2005 * -345440531;
							}
							if (-1 != i_69_) {
								final Class91_Sub20_Sub5 class91_sub20_sub5 = Class7.method152(i_69_, 474295438);
								class91_sub18_67_.anInt2076 += client.anInt1484 * -1873599399;
								for (/**/; -1385240223 * class91_sub18_67_.anInt2076 > class91_sub20_sub5.anIntArray2270[-1541606851 * class91_sub18_67_.anInt2075]; Class28_Sub1.method272(class91_sub18_67_, -1905179897)) {
									if (i_63_ == 0) {
										throw new IllegalStateException();
									}
									class91_sub18_67_.anInt2076 -= class91_sub20_sub5.anIntArray2270[-1541606851 * class91_sub18_67_.anInt2075] * -1402504543;
									class91_sub18_67_.anInt2075 += -663243499;
									if (class91_sub18_67_.anInt2075 * -1541606851 >= class91_sub20_sub5.anIntArray2268.length) {
										if (i_63_ == 0) {
											throw new IllegalStateException();
										}
										class91_sub18_67_.anInt2075 -= 32183543 * class91_sub20_sub5.anInt2277;
										if (-1541606851 * class91_sub18_67_.anInt2075 >= 0) {
											if (i_63_ == 0) {
												throw new IllegalStateException();
											}
											if (class91_sub18_67_.anInt2075 * -1541606851 < class91_sub20_sub5.anIntArray2268.length) {
												continue;
											}
										}
										class91_sub18_67_.anInt2075 = 0;
									}
								}
							}
						}
						if (-1665996711 * class91_sub18_67_.anInt1994 != 0) {
							if (i_63_ == 0) {
								throw new IllegalStateException();
							}
							if (!class91_sub18_67_.aBoolean1968) {
								int i_70_ = class91_sub18_67_.anInt1994 * -1665996711 >> 16;
								int i_71_ = class91_sub18_67_.anInt1994 * -1665996711 << 16 >> 16;
								i_70_ *= client.anInt1484 * 517195449;
								i_71_ *= 517195449 * client.anInt1484;
								class91_sub18_67_.anInt2039 = (class91_sub18_67_.anInt2039 * 231157787 + i_70_ & 0x7ff) * 1210657299;
								class91_sub18_67_.anInt2010 = -203003121 * (i_71_ + 1557210095 * class91_sub18_67_.anInt2010 & 0x7ff);
								Class28_Sub1.method272(class91_sub18_67_, -1905179897);
							}
						}
					}
				}
			}
		} catch (final RuntimeException var8) {
			throw Class102.method1086(var8, "an.cr()");
		}
	}
}
