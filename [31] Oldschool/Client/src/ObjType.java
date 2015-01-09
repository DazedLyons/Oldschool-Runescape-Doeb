/* Class91_Sub20_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ObjType extends Class91_Sub20 {
	int anInt2349;
	public static Js5 aClass63_2350;
	int anInt2351;
	public static Class96 aClass96_2352 = new Class96(64);
	int anInt2353;
	public int anInt2354;
	public int anInt2355;
	int anInt2356;
	public String aString2357;
	short[] aShortArray2358;
	int anInt2359;
	int anInt2360;
	short[] aShortArray2361;
	public int anInt2362;
	public int anInt2363;
	public int anInt2364;
	public int anInt2365;
	public int anInt2366;
	public int anInt2367;
	public int anInt2368;
	public String[] aStringArray2369;
	public int anInt2370;
	int anInt2371;
	public String[] aStringArray2372;
	short[] aShortArray2373;
	int anInt2374;
	public int anInt2375;
	int anInt2376;
	int anInt2377;
	int anInt2378;
	public static boolean aBoolean2379;
	int anInt2380;
	public static Js5 aClass63_2381;
	int anInt2382;
	int anInt2383;
	public int anInt2384;
	int[] anIntArray2385;
	int[] anIntArray2386;
	public int anInt2387;
	public boolean aBoolean2388;
	int anInt2389;
	public static Class96 aClass96_2390 = new Class96(100);
	int anInt2391;
	public int anInt2392;
	public static Class96 aClass96_2393 = new Class96(50);
	short[] aShortArray2394;
	static Class91_Sub23[] aClass91_Sub23Array2395;
	static final int anInt2396 = 1003;
	static final int anInt2397 = 91;
	public static final int anInt2398 = 24;

	void method781(final int i) {
		/* empty */
	}

	void decode(final ByteBuffer class91_sub9, final int i) {
		try {
			for (;;) {
				final int i_0_ = class91_sub9.readUnsignedByte();
				if (i_0_ == 0) {
					if (i <= -703100627) {
						/* empty */
					}
					break;
				}
				method783(class91_sub9, i_0_, (byte) 8);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aq.f()");
		}
	}

	void method783(final ByteBuffer class91_sub9, final int i, final byte i_1_) {
		try {
			if (i == 1) {
				this.anInt2356 = class91_sub9.method686((byte) -25) * -1504406437;
			} else if (2 == i) {
				aString2357 = class91_sub9.method645((byte) -119);
			} else if (i == 4) {
				anInt2362 = class91_sub9.method686((byte) -76) * -869009435;
			} else if (5 == i) {
				anInt2363 = class91_sub9.method686((byte) -114) * -907742505;
			} else if (6 == i) {
				anInt2354 = class91_sub9.method686((byte) -80) * -129238001;
			} else if (i == 7) {
				anInt2366 = class91_sub9.method686((byte) -64) * -580772071;
				if (anInt2366 * 1102236969 > 32767) {
					anInt2366 -= 521732096;
				}
			} else if (i == 8) {
				anInt2367 = class91_sub9.method686((byte) -88) * 683570311;
				if (-907538121 * anInt2367 > 32767) {
					anInt2367 -= 1955004416;
				}
			} else if (i == 11) {
				anInt2368 = 372549999;
			} else if (12 == i) {
				anInt2364 = class91_sub9.readDword() * -1234305757;
			} else if (i == 16) {
				aBoolean2388 = true;
			} else if (i == 23) {
				if (i_1_ < 10) {
					this.anInt2351 = class91_sub9.method686((byte) -88) * -746194937;
					this.anInt2349 = class91_sub9.readUnsignedByte() * 81988437;
				}
			} else if (24 == i) {
				this.anInt2360 = class91_sub9.method686((byte) -127) * -1086815789;
			} else if (25 == i) {
				this.anInt2376 = class91_sub9.method686((byte) -35) * 1547505507;
				this.anInt2378 = class91_sub9.readUnsignedByte() * 785257573;
			} else if (26 == i) {
				this.anInt2377 = class91_sub9.method686((byte) -115) * 1208590431;
			} else if (i >= 30 && i < 35) {
				aStringArray2369[i - 30] = class91_sub9.method645((byte) -109);
				if (aStringArray2369[i - 30].equalsIgnoreCase(Class75.aString881)) {
					aStringArray2369[i - 30] = null;
				}
			} else if (i >= 35 && i < 40) {
				aStringArray2372[i - 35] = class91_sub9.method645((byte) -40);
			} else if (i == 40) {
				if (i_1_ < 10) {
					final int i_2_ = class91_sub9.readUnsignedByte();
					this.aShortArray2358 = new short[i_2_];
					this.aShortArray2373 = new short[i_2_];
					for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
						this.aShortArray2358[i_3_] = (short) class91_sub9.method686((byte) -59);
						this.aShortArray2373[i_3_] = (short) class91_sub9.method686((byte) -12);
					}
				}
			} else if (41 == i) {
				final int i_4_ = class91_sub9.readUnsignedByte();
				this.aShortArray2394 = new short[i_4_];
				this.aShortArray2361 = new short[i_4_];
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					this.aShortArray2394[i_5_] = (short) class91_sub9.method686((byte) -99);
					this.aShortArray2361[i_5_] = (short) class91_sub9.method686((byte) -59);
				}
			} else if (i == 78) {
				this.anInt2353 = class91_sub9.method686((byte) -68) * -1070319569;
			} else if (79 == i) {
				if (i_1_ < 10) {
					this.anInt2380 = class91_sub9.method686((byte) -71) * -1133883087;
				}
			} else if (90 == i) {
				this.anInt2359 = class91_sub9.method686((byte) -127) * 1511305583;
			} else if (i == 91) {
				this.anInt2383 = class91_sub9.method686((byte) -92) * -223586221;
			} else if (92 == i) {
				this.anInt2382 = class91_sub9.method686((byte) -124) * 134628395;
			} else if (i == 93) {
				this.anInt2371 = class91_sub9.method686((byte) -69) * 919180877;
			} else if (95 == i) {
				if (i_1_ < 10) {
					anInt2365 = class91_sub9.method686((byte) -120) * -1713208013;
				}
			} else if (i == 97) {
				anInt2387 = class91_sub9.method686((byte) -118) * -793079631;
			} else if (98 == i) {
				anInt2384 = class91_sub9.method686((byte) -20) * -828879907;
			} else if (i >= 100 && i < 110) {
				if (this.anIntArray2385 == null) {
					this.anIntArray2385 = new int[10];
					this.anIntArray2386 = new int[10];
				}
				this.anIntArray2385[i - 100] = class91_sub9.method686((byte) -92);
				this.anIntArray2386[i - 100] = class91_sub9.method686((byte) -125);
			} else if (110 == i) {
				if (i_1_ < 10) {
					this.anInt2389 = class91_sub9.method686((byte) -23) * -1066828169;
				}
			} else if (111 == i) {
				this.anInt2374 = class91_sub9.method686((byte) -92) * 1140309373;
			} else if (i == 112) {
				this.anInt2391 = class91_sub9.method686((byte) -73) * 1769099327;
			} else if (113 == i) {
				anInt2392 = class91_sub9.method642(1411992326) * 123444589;
			} else if (114 == i) {
				anInt2370 = class91_sub9.method642(1605057865) * -854765283;
			} else if (115 == i) {
				anInt2375 = class91_sub9.readUnsignedByte() * 2145881353;
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "aq.e()");
		}
	}

	public final Class91_Sub20_Sub14_Sub2 method784(final boolean bool, final int i) {
		Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2;
		try {
			int i_6_ = this.anInt2351 * -352586313;
			int i_7_ = this.anInt2360 * -2039710117;
			int i_8_ = -812904753 * this.anInt2353;
			if (bool) {
				i_6_ = this.anInt2376 * 1233447499;
				i_7_ = this.anInt2377 * -1843348577;
				i_8_ = -723949615 * this.anInt2380;
			}
			if (-1 == i_6_) {
				return null;
			}
			Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_9_ = Class91_Sub20_Sub14_Sub2.method956(aClass63_2350, i_6_, 0);
			if (-1 != i_7_) {
				final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_10_ = Class91_Sub20_Sub14_Sub2.method956(aClass63_2350, i_7_, 0);
				if (-1 != i_8_) {
					final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_11_ = Class91_Sub20_Sub14_Sub2.method956(aClass63_2350, i_8_, 0);
					final Class91_Sub20_Sub14_Sub2[] class91_sub20_sub14_sub2s = { class91_sub20_sub14_sub2_9_, class91_sub20_sub14_sub2_10_, class91_sub20_sub14_sub2_11_ };
					class91_sub20_sub14_sub2_9_ = new Class91_Sub20_Sub14_Sub2(class91_sub20_sub14_sub2s, 3);
				} else {
					final Class91_Sub20_Sub14_Sub2[] class91_sub20_sub14_sub2s = { class91_sub20_sub14_sub2_9_, class91_sub20_sub14_sub2_10_ };
					class91_sub20_sub14_sub2_9_ = new Class91_Sub20_Sub14_Sub2(class91_sub20_sub14_sub2s, 2);
				}
			}
			if (!bool && -2106025475 * this.anInt2349 != 0) {
				class91_sub20_sub14_sub2_9_.method957(0, -2106025475 * this.anInt2349, 0);
			}
			if (bool && this.anInt2378 * -967017107 != 0) {
				class91_sub20_sub14_sub2_9_.method957(0, -967017107 * this.anInt2378, 0);
			}
			if (this.aShortArray2358 != null) {
				for (int i_12_ = 0; i_12_ < this.aShortArray2358.length; i_12_++) {
					class91_sub20_sub14_sub2_9_.method963(this.aShortArray2358[i_12_], this.aShortArray2373[i_12_]);
				}
			}
			if (this.aShortArray2394 != null) {
				for (int i_13_ = 0; i_13_ < this.aShortArray2394.length; i_13_++) {
					class91_sub20_sub14_sub2_9_.method964(this.aShortArray2394[i_13_], this.aShortArray2361[i_13_]);
				}
			}
			class91_sub20_sub14_sub2 = class91_sub20_sub14_sub2_9_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aq.a()");
		}
		return class91_sub20_sub14_sub2;
	}

	public ObjType method785(final int i, final byte i_14_) {
		ObjType class91_sub20_sub8_15_;
		try {
			if (this.anIntArray2385 != null && i > 1) {
				int i_16_ = -1;
				for (int i_17_ = 0; i_17_ < 10; i_17_++) {
					if (i >= this.anIntArray2386[i_17_] && this.anIntArray2386[i_17_] != 0) {
						i_16_ = this.anIntArray2385[i_17_];
					}
				}
				if (-1 != i_16_) {
					return Class86_Sub1.method490(i_16_, 234554293);
				}
			}
			class91_sub20_sub8_15_ = this;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aq.k()");
		}
		return class91_sub20_sub8_15_;
	}

	public final boolean method786(final boolean bool, final byte i) {
		boolean bool_18_;
		try {
			int i_19_ = this.anInt2351 * -352586313;
			int i_20_ = -2039710117 * this.anInt2360;
			int i_21_ = -812904753 * this.anInt2353;
			if (bool) {
				i_19_ = this.anInt2376 * 1233447499;
				i_20_ = -1843348577 * this.anInt2377;
				i_21_ = this.anInt2380 * -723949615;
			}
			if (-1 == i_19_) {
				return true;
			}
			boolean bool_22_ = true;
			if (!aClass63_2350.method399(i_19_, 0, 1218792745)) {
				bool_22_ = false;
			}
			if (-1 != i_20_ && !aClass63_2350.method399(i_20_, 0, 1218792745)) {
				bool_22_ = false;
			}
			if (-1 != i_21_ && !aClass63_2350.method399(i_21_, 0, 1218792745)) {
				bool_22_ = false;
			}
			bool_18_ = bool_22_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aq.l()");
		}
		return bool_18_;
	}

	public final boolean method787(final boolean bool, final int i) {
		boolean bool_23_;
		try {
			int i_24_ = -1244279409 * this.anInt2359;
			int i_25_ = this.anInt2382 * 75258499;
			if (bool) {
				i_24_ = this.anInt2383 * 336309211;
				i_25_ = this.anInt2371 * 138515077;
			}
			if (i_24_ == -1) {
				return true;
			}
			boolean bool_26_ = true;
			if (!aClass63_2350.method399(i_24_, 0, 1218792745)) {
				bool_26_ = false;
			}
			if (-1 != i_25_ && !aClass63_2350.method399(i_25_, 0, 1218792745)) {
				bool_26_ = false;
			}
			bool_23_ = bool_26_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aq.z()");
		}
		return bool_23_;
	}

	public final Class91_Sub20_Sub14_Sub2 method788(final boolean bool, final int i) {
		Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2;
		try {
			int i_27_ = this.anInt2359 * -1244279409;
			int i_28_ = 75258499 * this.anInt2382;
			if (bool) {
				i_27_ = 336309211 * this.anInt2383;
				i_28_ = 138515077 * this.anInt2371;
			}
			if (-1 == i_27_) {
				return null;
			}
			Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_29_ = Class91_Sub20_Sub14_Sub2.method956(aClass63_2350, i_27_, 0);
			if (-1 != i_28_) {
				final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_30_ = Class91_Sub20_Sub14_Sub2.method956(aClass63_2350, i_28_, 0);
				final Class91_Sub20_Sub14_Sub2[] class91_sub20_sub14_sub2s = { class91_sub20_sub14_sub2_29_, class91_sub20_sub14_sub2_30_ };
				class91_sub20_sub14_sub2_29_ = new Class91_Sub20_Sub14_Sub2(class91_sub20_sub14_sub2s, 2);
			}
			if (this.aShortArray2358 != null) {
				for (int i_31_ = 0; i_31_ < this.aShortArray2358.length; i_31_++) {
					class91_sub20_sub14_sub2_29_.method963(this.aShortArray2358[i_31_], this.aShortArray2373[i_31_]);
				}
			}
			if (this.aShortArray2394 != null) {
				for (int i_32_ = 0; i_32_ < this.aShortArray2394.length; i_32_++) {
					class91_sub20_sub14_sub2_29_.method964(this.aShortArray2394[i_32_], this.aShortArray2361[i_32_]);
				}
			}
			class91_sub20_sub14_sub2 = class91_sub20_sub14_sub2_29_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aq.s()");
		}
		return class91_sub20_sub14_sub2;
	}

	public final Class91_Sub20_Sub14_Sub2 method789(final int i, final int i_33_) {
		Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2;
		try {
			if (this.anIntArray2385 != null && i > 1) {
				int i_34_ = -1;
				for (int i_35_ = 0; i_35_ < 10; i_35_++) {
					if (i >= this.anIntArray2386[i_35_] && this.anIntArray2386[i_35_] != 0) {
						i_34_ = this.anIntArray2385[i_35_];
					}
				}
				if (-1 != i_34_) {
					return Class86_Sub1.method490(i_34_, 234554293).method789(1, -11400747);
				}
			}
			final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_36_ = Class91_Sub20_Sub14_Sub2.method956(aClass63_2350, -693732397 * this.anInt2356, 0);
			if (class91_sub20_sub14_sub2_36_ == null) {
				return null;
			}
			if (128 != this.anInt2389 * -842286265 || 128 != -1166515243 * this.anInt2374 || 341942207 * this.anInt2391 != 128) {
				class91_sub20_sub14_sub2_36_.method968(this.anInt2389 * -842286265, this.anInt2374 * -1166515243, this.anInt2391 * 341942207);
			}
			if (this.aShortArray2358 != null) {
				for (int i_37_ = 0; i_37_ < this.aShortArray2358.length; i_37_++) {
					class91_sub20_sub14_sub2_36_.method963(this.aShortArray2358[i_37_], this.aShortArray2373[i_37_]);
				}
			}
			if (this.aShortArray2394 != null) {
				for (int i_38_ = 0; i_38_ < this.aShortArray2394.length; i_38_++) {
					class91_sub20_sub14_sub2_36_.method964(this.aShortArray2394[i_38_], this.aShortArray2361[i_38_]);
				}
			}
			class91_sub20_sub14_sub2 = class91_sub20_sub14_sub2_36_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aq.d()");
		}
		return class91_sub20_sub14_sub2;
	}

	public final Class91_Sub20_Sub14_Sub3 method790(final int i, final int i_39_) {
		Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3;
		try {
			if (this.anIntArray2385 != null && i > 1) {
				int i_40_ = -1;
				for (int i_41_ = 0; i_41_ < 10; i_41_++) {
					if (i >= this.anIntArray2386[i_41_] && this.anIntArray2386[i_41_] != 0) {
						i_40_ = this.anIntArray2385[i_41_];
					}
				}
				if (-1 != i_40_) {
					return Class86_Sub1.method490(i_40_, 234554293).method790(1, -1914332238);
				}
			}
			Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_42_ = (Class91_Sub20_Sub14_Sub3) aClass96_2393.method1068(anInt2355 * 1878947245);
			if (class91_sub20_sub14_sub3_42_ != null) {
				return class91_sub20_sub14_sub3_42_;
			}
			final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2 = Class91_Sub20_Sub14_Sub2.method956(aClass63_2350, this.anInt2356 * -693732397, 0);
			if (class91_sub20_sub14_sub2 == null) {
				return null;
			}
			if (this.anInt2389 * -842286265 != 128 || this.anInt2374 * -1166515243 != 128 || 128 != 341942207 * this.anInt2391) {
				class91_sub20_sub14_sub2.method968(this.anInt2389 * -842286265, -1166515243 * this.anInt2374, this.anInt2391 * 341942207);
			}
			if (this.aShortArray2358 != null) {
				for (int i_43_ = 0; i_43_ < this.aShortArray2358.length; i_43_++) {
					class91_sub20_sub14_sub2.method963(this.aShortArray2358[i_43_], this.aShortArray2373[i_43_]);
				}
			}
			if (this.aShortArray2394 != null) {
				for (int i_44_ = 0; i_44_ < this.aShortArray2394.length; i_44_++) {
					class91_sub20_sub14_sub2.method964(this.aShortArray2394[i_44_], this.aShortArray2361[i_44_]);
				}
			}
			class91_sub20_sub14_sub3_42_ = class91_sub20_sub14_sub2.method967(64 + anInt2392 * -1146358683, 768 + -1994007031 * anInt2370, -50, -10, -50);
			class91_sub20_sub14_sub3_42_.aBoolean2713 = true;
			aClass96_2393.method1067(class91_sub20_sub14_sub3_42_, 1878947245 * anInt2355);
			class91_sub20_sub14_sub3 = class91_sub20_sub14_sub3_42_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aq.p()");
		}
		return class91_sub20_sub14_sub3;
	}

	void method791(final ObjType class91_sub20_sub8_45_, final ObjType class91_sub20_sub8_46_, final int i) {
		try {
			this.anInt2356 = class91_sub20_sub8_45_.anInt2356 * 1;
			anInt2362 = class91_sub20_sub8_45_.anInt2362 * 1;
			anInt2363 = class91_sub20_sub8_45_.anInt2363 * 1;
			anInt2354 = 1 * class91_sub20_sub8_45_.anInt2354;
			anInt2365 = class91_sub20_sub8_45_.anInt2365 * 1;
			anInt2366 = class91_sub20_sub8_45_.anInt2366 * 1;
			anInt2367 = 1 * class91_sub20_sub8_45_.anInt2367;
			this.aShortArray2358 = class91_sub20_sub8_45_.aShortArray2358;
			this.aShortArray2373 = class91_sub20_sub8_45_.aShortArray2373;
			this.aShortArray2394 = class91_sub20_sub8_45_.aShortArray2394;
			this.aShortArray2361 = class91_sub20_sub8_45_.aShortArray2361;
			aString2357 = class91_sub20_sub8_46_.aString2357;
			aBoolean2388 = class91_sub20_sub8_46_.aBoolean2388;
			anInt2364 = class91_sub20_sub8_46_.anInt2364 * 1;
			anInt2368 = 372549999;
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "aq.t()");
		}
	}

	ObjType() {
		try {
			aString2357 = "null";
			anInt2362 = 1442884880;
			anInt2363 = 0;
			anInt2354 = 0;
			anInt2365 = 0;
			anInt2366 = 0;
			anInt2367 = 0;
			anInt2368 = 0;
			anInt2364 = -1234305757;
			aBoolean2388 = false;
			aStringArray2369 = new String[] { null, null, Class75.aString860, null, null };
			aStringArray2372 = new String[] { null, null, null, null, Class75.aString974 };
			this.anInt2351 = 746194937;
			this.anInt2360 = 1086815789;
			this.anInt2349 = 0;
			this.anInt2376 = -1547505507;
			this.anInt2377 = -1208590431;
			this.anInt2378 = 0;
			this.anInt2353 = 1070319569;
			this.anInt2380 = 1133883087;
			this.anInt2359 = -1511305583;
			this.anInt2382 = -134628395;
			this.anInt2383 = 223586221;
			this.anInt2371 = -919180877;
			anInt2387 = 793079631;
			anInt2384 = 828879907;
			this.anInt2389 = 884947840;
			this.anInt2374 = -69288320;
			this.anInt2391 = -1188552832;
			anInt2392 = 0;
			anInt2370 = 0;
			anInt2375 = 0;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "aq.<init>()");
		}
	}

	static final void method792(final Class91_Sub2 class91_sub2, final int i) {
		try {
			class91_sub2.aBoolean1754 = false;
			if (class91_sub2.aClass91_Sub1_1756 != null) {
				class91_sub2.aClass91_Sub1_1756.anInt1753 = 0;
			}
			for (Class91_Sub2 class91_sub2_47_ = class91_sub2.method499(); class91_sub2_47_ != null; class91_sub2_47_ = class91_sub2.method515()) {
				method792(class91_sub2_47_, -1859882416);
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "aq.aa()");
		}
	}

	public static void setupUnderlayStore(final Js5 class63, final int i) {
		try {
			FloUnderlayType.underlayJs5 = class63;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "aq.i()");
		}
	}
}
