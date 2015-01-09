/* Class91_Sub20_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;

public class NpcType extends Class91_Sub20 {
	int anInt2423;
	public int anInt2424;
	public static Class96 aClass96_2425 = new Class96(64);
	short[] aShortArray2426;
	public int anInt2427;
	public String aString2428;
	public int anInt2429;
	int[] anIntArray2430;
	int[] anIntArray2431;
	static Js5 aClass63_2432;
	static Js5 npcJs5;
	public int anInt2434;
	public int anInt2435;
	public int anInt2436;
	public int anInt2437;
	public int anInt2438;
	short[] aShortArray2439;
	public int anInt2440;
	protected static Image anImage2441;
	short[] aShortArray2442;
	public boolean aBoolean2443;
	public boolean aBoolean2444;
	public int anInt2445;
	public static Class96 aClass96_2446 = new Class96(50);
	public int anInt2447;
	public boolean aBoolean2448;
	int anInt2449;
	int anInt2450;
	public int anInt2451;
	int anInt2452;
	public int[] anIntArray2453;
	int anInt2454;
	public String[] aStringArray2455;
	public boolean aBoolean2456;
	short[] aShortArray2457;
	int anInt2458;
	static final int anInt2459 = 48;

	void method806(final byte i) {
		/* empty */
	}

	void method807(final ByteBuffer class91_sub9, final byte i) {
		try {
			for (;;) {
				final int i_0_ = class91_sub9.readUnsignedByte();
				if (i_0_ == 0) {
					if (i <= 0) {
						throw new IllegalStateException();
					}
					break;
				}
				decode(class91_sub9, i_0_, 1090476415);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aw.e()");
		}
	}

	void decode(final ByteBuffer class91_sub9, final int i, final int i_1_) {
		try {
			if (i == 1) {
				final int i_2_ = class91_sub9.readUnsignedByte();
				this.anIntArray2430 = new int[i_2_];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
					this.anIntArray2430[i_3_] = class91_sub9.method686((byte) -74);
				}
			} else if (2 == i) {
				aString2428 = class91_sub9.method645((byte) -61);
			} else if (i == 12) {
				anInt2424 = class91_sub9.readUnsignedByte() * 1241818547;
			} else if (13 == i) {
				anInt2429 = class91_sub9.method686((byte) -78) * -1532325643;
			} else if (i == 14) {
				anInt2435 = class91_sub9.method686((byte) -52) * -759871979;
			} else if (i == 15) {
				anInt2447 = class91_sub9.method686((byte) 2) * 142631415;
			} else if (16 == i) {
				if (i_1_ == 1090476415) {
					anInt2434 = class91_sub9.method686((byte) -5) * -217872851;
				}
			} else if (i == 17) {
				anInt2435 = class91_sub9.method686((byte) -20) * -759871979;
				anInt2436 = class91_sub9.method686((byte) -115) * 1513875749;
				anInt2437 = class91_sub9.method686((byte) -93) * 738005981;
				anInt2438 = class91_sub9.method686((byte) 1) * -1156061195;
			} else if (i >= 30 && i < 35) {
				aStringArray2455[i - 30] = class91_sub9.method645((byte) -4);
				if (aStringArray2455[i - 30].equalsIgnoreCase(Class75.aString881)) {
					aStringArray2455[i - 30] = null;
				}
			} else if (40 == i) {
				final int i_4_ = class91_sub9.readUnsignedByte();
				this.aShortArray2439 = new short[i_4_];
				this.aShortArray2457 = new short[i_4_];
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					this.aShortArray2439[i_5_] = (short) class91_sub9.method686((byte) -53);
					this.aShortArray2457[i_5_] = (short) class91_sub9.method686((byte) -13);
				}
			} else if (41 == i) {
				final int i_6_ = class91_sub9.readUnsignedByte();
				this.aShortArray2426 = new short[i_6_];
				this.aShortArray2442 = new short[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
					this.aShortArray2426[i_7_] = (short) class91_sub9.method686((byte) -126);
					this.aShortArray2442[i_7_] = (short) class91_sub9.method686((byte) -100);
				}
			} else if (60 == i) {
				final int i_8_ = class91_sub9.readUnsignedByte();
				this.anIntArray2431 = new int[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					if (i_1_ != 1090476415) {
						break;
					}
					this.anIntArray2431[i_9_] = class91_sub9.method686((byte) -85);
				}
			} else if (i == 93) {
				aBoolean2444 = false;
			} else if (95 == i) {
				anInt2445 = class91_sub9.method686((byte) -62) * -57075145;
			} else if (i == 97) {
				if (i_1_ == 1090476415) {
					this.anInt2458 = class91_sub9.method686((byte) -65) * -1989191549;
				}
			} else if (i == 98) {
				this.anInt2452 = class91_sub9.method686((byte) -48) * 918587935;
			} else if (i == 99) {
				aBoolean2448 = true;
			} else if (100 == i) {
				if (i_1_ == 1090476415) {
					this.anInt2449 = class91_sub9.method642(647862515) * -1075790041;
				}
			} else if (i == 101) {
				this.anInt2450 = class91_sub9.method642(125831357) * -233637973;
			} else if (102 == i) {
				anInt2451 = class91_sub9.method686((byte) -22) * -564421745;
			} else if (i == 103) {
				if (i_1_ == 1090476415) {
					anInt2440 = class91_sub9.method686((byte) -92) * -1769542427;
				}
			} else if (i == 106) {
				if (i_1_ == 1090476415) {
					this.anInt2454 = class91_sub9.method686((byte) -13) * 1460150241;
					if (65535 == this.anInt2454 * 192963617) {
						if (i_1_ != 1090476415) {
							return;
						}
						this.anInt2454 = -1460150241;
					}
					this.anInt2423 = class91_sub9.method686((byte) -37) * 582167771;
					if (this.anInt2423 * -1248268461 == 65535) {
						this.anInt2423 = -582167771;
					}
					final int i_10_ = class91_sub9.readUnsignedByte();
					anIntArray2453 = new int[1 + i_10_];
					for (int i_11_ = 0; i_11_ <= i_10_; i_11_++) {
						anIntArray2453[i_11_] = class91_sub9.method686((byte) -10);
						if (anIntArray2453[i_11_] == 65535) {
							anIntArray2453[i_11_] = -1;
						}
					}
				}
			} else if (i == 107) {
				aBoolean2456 = false;
			} else if (109 == i) {
				aBoolean2443 = false;
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "aw.t()");
		}
	}

	public final Class91_Sub20_Sub14_Sub2 method809(final int i) {
		Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2;
		try {
			if (anIntArray2453 != null) {
				final NpcType class91_sub20_sub11_12_ = method814((byte) 89);
				return class91_sub20_sub11_12_ == null ? null : class91_sub20_sub11_12_.method809(-42728531);
			}
			if (this.anIntArray2431 == null) {
				return null;
			}
			boolean bool = false;
			for (int i_13_ = 0; i_13_ < this.anIntArray2431.length; i_13_++) {
				if (!aClass63_2432.method399(this.anIntArray2431[i_13_], 0, 1218792745)) {
					bool = true;
				}
			}
			if (bool) {
				return null;
			}
			final Class91_Sub20_Sub14_Sub2[] class91_sub20_sub14_sub2s = new Class91_Sub20_Sub14_Sub2[this.anIntArray2431.length];
			for (int i_14_ = 0; i_14_ < this.anIntArray2431.length; i_14_++) {
				class91_sub20_sub14_sub2s[i_14_] = Class91_Sub20_Sub14_Sub2.method956(aClass63_2432, this.anIntArray2431[i_14_], 0);
			}
			Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_15_;
			if (1 == class91_sub20_sub14_sub2s.length) {
				class91_sub20_sub14_sub2_15_ = class91_sub20_sub14_sub2s[0];
			} else {
				class91_sub20_sub14_sub2_15_ = new Class91_Sub20_Sub14_Sub2(class91_sub20_sub14_sub2s, class91_sub20_sub14_sub2s.length);
			}
			if (this.aShortArray2439 != null) {
				for (int i_16_ = 0; i_16_ < this.aShortArray2439.length; i_16_++) {
					class91_sub20_sub14_sub2_15_.method963(this.aShortArray2439[i_16_], this.aShortArray2457[i_16_]);
				}
			}
			if (this.aShortArray2426 != null) {
				for (int i_17_ = 0; i_17_ < this.aShortArray2426.length; i_17_++) {
					class91_sub20_sub14_sub2_15_.method964(this.aShortArray2426[i_17_], this.aShortArray2442[i_17_]);
				}
			}
			class91_sub20_sub14_sub2 = class91_sub20_sub14_sub2_15_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aw.p()");
		}
		return class91_sub20_sub14_sub2;
	}

	public boolean method810(final int i) {
		do {
			try {
				if (anIntArray2453 == null) {
					return true;
				}
				int i_18_ = -1;
				if (192963617 * this.anInt2454 != -1) {
					i_18_ = Class75.method453(192963617 * this.anInt2454, 81920);
				} else if (-1 != -1248268461 * this.anInt2423) {
					i_18_ = Class93.anIntArray1199[this.anInt2423 * -1248268461];
				}
				if (i_18_ < 0 || i_18_ >= anIntArray2453.length || anIntArray2453[i_18_] == -1) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "aw.r()");
			}
			return true;
		} while (false);
		return false;
	}

	public final Class91_Sub20_Sub14_Sub3 method811(final Class91_Sub20_Sub5 class91_sub20_sub5, final int i, final Class91_Sub20_Sub5 class91_sub20_sub5_19_, final int i_20_, final int i_21_) {
		Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3;
		try {
			if (anIntArray2453 != null) {
				final NpcType class91_sub20_sub11_22_ = method814((byte) 57);
				if (class91_sub20_sub11_22_ == null) {
					return null;
				}
				return class91_sub20_sub11_22_.method811(class91_sub20_sub5, i, class91_sub20_sub5_19_, i_20_, 1741566462);
			}
			Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_23_ = (Class91_Sub20_Sub14_Sub3) aClass96_2446.method1068(anInt2427 * 1252206939);
			if (class91_sub20_sub14_sub3_23_ == null) {
				boolean bool = false;
				for (int i_24_ = 0; i_24_ < this.anIntArray2430.length; i_24_++) {
					if (!aClass63_2432.method399(this.anIntArray2430[i_24_], 0, 1218792745)) {
						bool = true;
					}
				}
				if (bool) {
					return null;
				}
				final Class91_Sub20_Sub14_Sub2[] class91_sub20_sub14_sub2s = new Class91_Sub20_Sub14_Sub2[this.anIntArray2430.length];
				for (int i_25_ = 0; i_25_ < this.anIntArray2430.length; i_25_++) {
					class91_sub20_sub14_sub2s[i_25_] = Class91_Sub20_Sub14_Sub2.method956(aClass63_2432, this.anIntArray2430[i_25_], 0);
				}
				Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2;
				if (1 == class91_sub20_sub14_sub2s.length) {
					class91_sub20_sub14_sub2 = class91_sub20_sub14_sub2s[0];
				} else {
					class91_sub20_sub14_sub2 = new Class91_Sub20_Sub14_Sub2(class91_sub20_sub14_sub2s, class91_sub20_sub14_sub2s.length);
				}
				if (this.aShortArray2439 != null) {
					for (int i_26_ = 0; i_26_ < this.aShortArray2439.length; i_26_++) {
						class91_sub20_sub14_sub2.method963(this.aShortArray2439[i_26_], this.aShortArray2457[i_26_]);
					}
				}
				if (this.aShortArray2426 != null) {
					for (int i_27_ = 0; i_27_ < this.aShortArray2426.length; i_27_++) {
						class91_sub20_sub14_sub2.method964(this.aShortArray2426[i_27_], this.aShortArray2442[i_27_]);
					}
				}
				class91_sub20_sub14_sub3_23_ = class91_sub20_sub14_sub2.method967(64 + 262062231 * this.anInt2449, this.anInt2450 * 541685519 + 850, -30, -50, -30);
				aClass96_2446.method1067(class91_sub20_sub14_sub3_23_, 1252206939 * anInt2427);
			}
			Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_28_;
			if (class91_sub20_sub5 != null && class91_sub20_sub5_19_ != null) {
				class91_sub20_sub14_sub3_28_ = class91_sub20_sub5.method754(class91_sub20_sub14_sub3_23_, i, class91_sub20_sub5_19_, i_20_, -218983247);
			} else if (class91_sub20_sub5 != null) {
				class91_sub20_sub14_sub3_28_ = class91_sub20_sub5.method756(class91_sub20_sub14_sub3_23_, i, 1257314793);
			} else if (class91_sub20_sub5_19_ != null) {
				class91_sub20_sub14_sub3_28_ = class91_sub20_sub5_19_.method756(class91_sub20_sub14_sub3_23_, i_20_, 1901037978);
			} else {
				class91_sub20_sub14_sub3_28_ = class91_sub20_sub14_sub3_23_.method971(true);
			}
			if (128 == 83211819 * this.anInt2458 && 615543263 * this.anInt2452 == 128) {
				return class91_sub20_sub14_sub3_28_;
			}
			class91_sub20_sub14_sub3_28_.method981(83211819 * this.anInt2458, 615543263 * this.anInt2452, 83211819 * this.anInt2458);
			class91_sub20_sub14_sub3 = class91_sub20_sub14_sub3_28_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aw.d()");
		}
		return class91_sub20_sub14_sub3;
	}

	NpcType() {
		try {
			aString2428 = "null";
			anInt2424 = 1241818547;
			anInt2429 = 1532325643;
			anInt2447 = -142631415;
			anInt2434 = 217872851;
			anInt2435 = 759871979;
			anInt2436 = -1513875749;
			anInt2437 = -738005981;
			anInt2438 = 1156061195;
			aStringArray2455 = new String[5];
			aBoolean2444 = true;
			anInt2445 = 57075145;
			this.anInt2458 = -1213447808;
			this.anInt2452 = 1615138688;
			aBoolean2448 = false;
			this.anInt2449 = 0;
			this.anInt2450 = 0;
			anInt2451 = 564421745;
			anInt2440 = -790782816;
			this.anInt2454 = -1460150241;
			this.anInt2423 = -582167771;
			aBoolean2456 = true;
			aBoolean2443 = true;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "aw.<init>()");
		}
	}

	static final String method812(final int i, final short i_29_) {
		String string;
		try {
			String string_30_ = Integer.toString(i);
			for (int i_31_ = string_30_.length() - 3; i_31_ > 0; i_31_ -= 3) {
				string_30_ = new StringBuilder(string_30_.substring(0, i_31_)).append(Class106.aString1369).append(string_30_.substring(i_31_)).toString();
			}
			if (string_30_.length() > 9) {
				return new StringBuilder(" ").append(Class91_Sub21.method1033(65408, -952407331)).append(string_30_.substring(0, string_30_.length() - 8)).append(Class75.aString850).append(" ").append(Class106.aString1368).append(string_30_).append(Class106.aString1377).append(Class106.aString1378).toString();
			}
			if (string_30_.length() > 6) {
				return new StringBuilder(" ").append(Class91_Sub21.method1033(16777215, -665240959)).append(string_30_.substring(0, string_30_.length() - 4)).append(Class75.aString1003).append(" ").append(Class106.aString1368).append(string_30_).append(Class106.aString1377).append(Class106.aString1378).toString();
			}
			string = new StringBuilder(" ").append(Class91_Sub21.method1033(16776960, -32226308)).append(string_30_).append(Class106.aString1378).toString();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aw.cd()");
		}
		return string;
	}

	public static Class91_Sub20_Sub12 method813(final int i, final short i_32_) {
		Class91_Sub20_Sub12 class91_sub20_sub12;
		try {
			Class91_Sub20_Sub12 class91_sub20_sub12_33_ = (Class91_Sub20_Sub12) Class91_Sub20_Sub12.aClass96_2478.method1068(i);
			if (class91_sub20_sub12_33_ != null) {
				return class91_sub20_sub12_33_;
			}
			final byte[] is = Class91_Sub20_Sub12.aClass63_2465.getFile(13, i, 1057363045);
			class91_sub20_sub12_33_ = new Class91_Sub20_Sub12();
			class91_sub20_sub12_33_.anInt2464 = -445919803 * i;
			if (is != null) {
				class91_sub20_sub12_33_.method815(new ByteBuffer(is), (byte) -93);
			}
			Class91_Sub20_Sub12.aClass96_2478.method1067(class91_sub20_sub12_33_, i);
			class91_sub20_sub12 = class91_sub20_sub12_33_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aw.w()");
		}
		return class91_sub20_sub12;
	}

	public final NpcType method814(final byte i) {
		try {
			int i_34_ = -1;
			if (this.anInt2454 * 192963617 != -1) {
				if (i <= 0) {
					throw new IllegalStateException();
				}
				i_34_ = Class75.method453(192963617 * this.anInt2454, 81920);
			} else if (-1 != -1248268461 * this.anInt2423) {
				i_34_ = Class93.anIntArray1199[this.anInt2423 * -1248268461];
			}
			if (i_34_ >= 0) {
				if (i <= 0) {
					throw new IllegalStateException();
				}
				if (i_34_ < anIntArray2453.length) {
					if (i <= 0) {
						throw new IllegalStateException();
					}
					if (anIntArray2453[i_34_] != -1) {
						return Class100.method1075(anIntArray2453[i_34_], 448642938);
					}
					if (i <= 0) {
						throw new IllegalStateException();
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aw.k()");
		}
		return null;
	}
}
