/* Class91_Sub20_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub20_Sub12 extends Class91_Sub20 {
	short[] aShortArray2460;
	protected static final int anInt2461 = 32;
	int anInt2462;
	public static Class96 aClass96_2463 = new Class96(30);
	int anInt2464;
	static Js5 aClass63_2465;
	public int anInt2466;
	short[] aShortArray2467;
	static final int anInt2468 = 128;
	short[] aShortArray2469;
	short[] aShortArray2470;
	int anInt2471;
	int anInt2472;
	static Js5 aClass63_2473;
	int anInt2474;
	int anInt2475;
	static final int anInt2476 = 1536;
	static final int anInt2477 = 103;
	public static Class96 aClass96_2478 = new Class96(64);
	int anInt2479;

	void method815(final ByteBuffer class91_sub9, final byte i) {
		try {
			for (;;) {
				final int i_0_ = class91_sub9.readUnsignedByte();
				if (i_0_ == 0) {
					break;
				}
				method816(class91_sub9, i_0_, -2065968036);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ax.f()");
		}
	}

	void method816(final ByteBuffer class91_sub9, final int i, final int i_1_) {
		try {
			if (i == 1) {
				this.anInt2462 = class91_sub9.method686((byte) -76) * -916034433;
			} else if (2 == i) {
				anInt2466 = class91_sub9.method686((byte) -65) * 775123237;
			} else if (i == 4) {
				this.anInt2471 = class91_sub9.method686((byte) -64) * -1345776649;
			} else if (5 == i) {
				this.anInt2479 = class91_sub9.method686((byte) -2) * 427717075;
			} else if (6 == i) {
				if (i_1_ < -1723839610) {
					this.anInt2472 = class91_sub9.method686((byte) -52) * -1866729465;
				}
			} else if (7 == i) {
				this.anInt2474 = class91_sub9.readUnsignedByte() * -339088187;
			} else if (8 == i) {
				this.anInt2475 = class91_sub9.readUnsignedByte() * 1047986083;
			} else if (i == 40) {
				final int i_2_ = class91_sub9.readUnsignedByte();
				this.aShortArray2467 = new short[i_2_];
				this.aShortArray2460 = new short[i_2_];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
					this.aShortArray2467[i_3_] = (short) class91_sub9.method686((byte) -4);
					this.aShortArray2460[i_3_] = (short) class91_sub9.method686((byte) -126);
				}
			} else if (41 == i) {
				if (i_1_ < -1723839610) {
					final int i_4_ = class91_sub9.readUnsignedByte();
					this.aShortArray2469 = new short[i_4_];
					this.aShortArray2470 = new short[i_4_];
					for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
						this.aShortArray2469[i_5_] = (short) class91_sub9.method686((byte) -42);
						this.aShortArray2470[i_5_] = (short) class91_sub9.method686((byte) -1);
					}
				}
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "ax.e()");
		}
	}

	public final Class91_Sub20_Sub14_Sub3 method817(final int i, final int i_6_) {
		Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3;
		try {
			Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_7_ = (Class91_Sub20_Sub14_Sub3) aClass96_2463.method1068(this.anInt2464 * 2053777677);
			if (class91_sub20_sub14_sub3_7_ == null) {
				final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2 = Class91_Sub20_Sub14_Sub2.method956(aClass63_2473, -1719839873 * this.anInt2462, 0);
				if (class91_sub20_sub14_sub2 == null) {
					return null;
				}
				if (this.aShortArray2467 != null) {
					for (int i_8_ = 0; i_8_ < this.aShortArray2467.length; i_8_++) {
						class91_sub20_sub14_sub2.method963(this.aShortArray2467[i_8_], this.aShortArray2460[i_8_]);
					}
				}
				if (this.aShortArray2469 != null) {
					for (int i_9_ = 0; i_9_ < this.aShortArray2469.length; i_9_++) {
						class91_sub20_sub14_sub2.method964(this.aShortArray2469[i_9_], this.aShortArray2470[i_9_]);
					}
				}
				class91_sub20_sub14_sub3_7_ = class91_sub20_sub14_sub2.method967(64 + this.anInt2474 * -41504243, 850 + 1114713099 * this.anInt2475, -30, -50, -30);
				aClass96_2463.method1067(class91_sub20_sub14_sub3_7_, 2053777677 * this.anInt2464);
			}
			Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_10_;
			if (anInt2466 * -1585626451 != -1 && -1 != i) {
				class91_sub20_sub14_sub3_10_ = Class7.method152(anInt2466 * -1585626451, -762762055).method753(class91_sub20_sub14_sub3_7_, i, (byte) -11);
			} else {
				class91_sub20_sub14_sub3_10_ = class91_sub20_sub14_sub3_7_.method994(true);
			}
			if (-546988601 * this.anInt2471 != 128 || 128 != -1436807589 * this.anInt2479) {
				class91_sub20_sub14_sub3_10_.method981(this.anInt2471 * -546988601, this.anInt2479 * -1436807589, this.anInt2471 * -546988601);
			}
			if (1105589687 * this.anInt2472 != 0) {
				if (1105589687 * this.anInt2472 == 90) {
					class91_sub20_sub14_sub3_10_.method993();
				}
				if (this.anInt2472 * 1105589687 == 180) {
					class91_sub20_sub14_sub3_10_.method993();
					class91_sub20_sub14_sub3_10_.method993();
				}
				if (this.anInt2472 * 1105589687 == 270) {
					class91_sub20_sub14_sub3_10_.method993();
					class91_sub20_sub14_sub3_10_.method993();
					class91_sub20_sub14_sub3_10_.method993();
				}
			}
			class91_sub20_sub14_sub3 = class91_sub20_sub14_sub3_10_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ax.t()");
		}
		return class91_sub20_sub14_sub3;
	}

	static void method818(final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1, final int i, final int i_11_, final int i_12_) {
		try {
			if (class91_sub20_sub14_sub1_sub1.anInt2611 * -815127219 == i && i != -1) {
				final int i_13_ = Class7.method152(i, 2039340255).anInt2281 * -778311109;
				if (1 == i_13_) {
					class91_sub20_sub14_sub1_sub1.anInt2612 = 0;
					class91_sub20_sub14_sub1_sub1.anInt2613 = 0;
					class91_sub20_sub14_sub1_sub1.anInt2614 = i_11_ * -1381698923;
					class91_sub20_sub14_sub1_sub1.anInt2582 = 0;
				}
				if (i_13_ == 2) {
					class91_sub20_sub14_sub1_sub1.anInt2582 = 0;
				}
			} else if (i == -1 || -1 == class91_sub20_sub14_sub1_sub1.anInt2611 * -815127219 || Class7.method152(i, -1892214790).anInt2275 * 1860819239 >= Class7.method152(class91_sub20_sub14_sub1_sub1.anInt2611 * -815127219, 1729235734).anInt2275 * 1860819239 && i_12_ > 65280) {
				class91_sub20_sub14_sub1_sub1.anInt2611 = 1205443461 * i;
				class91_sub20_sub14_sub1_sub1.anInt2612 = 0;
				class91_sub20_sub14_sub1_sub1.anInt2613 = 0;
				class91_sub20_sub14_sub1_sub1.anInt2614 = i_11_ * -1381698923;
				class91_sub20_sub14_sub1_sub1.anInt2582 = 0;
				class91_sub20_sub14_sub1_sub1.anInt2633 = -1888793483 * class91_sub20_sub14_sub1_sub1.anInt2608;
			}
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "ax.ab()");
		}
	}

	Class91_Sub20_Sub12() {
		try {
			anInt2466 = -775123237;
			this.anInt2471 = -460719232;
			this.anInt2479 = -1086789248;
			this.anInt2472 = 0;
			this.anInt2474 = 0;
			this.anInt2475 = 0;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "ax.<init>()");
		}
	}
}
