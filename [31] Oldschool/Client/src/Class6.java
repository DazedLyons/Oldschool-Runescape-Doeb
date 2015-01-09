/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class6 {
	int anInt79;
	public static boolean aBoolean80;
	public static int anInt81;
	int anInt82;
	Class91_Sub2 aClass91_Sub2_83;
	int anInt84;
	int[] anIntArray85;
	int anInt86;
	int anInt87;
	long aLong88;
	long aLong89;
	int anInt90;
	static final int anInt91 = 256;
	static final int anInt92 = 4;
	long aLong93;
	boolean aBoolean94;
	int anInt95;
	int anInt96;
	Class91_Sub2[] aClass91_Sub2Array97;
	Class91_Sub2[] aClass91_Sub2Array98;
	static int anInt99;
	public static final int anInt100 = 198;
	public static final int anInt101 = 138;
	public static final int anInt102 = 30;

	public static FloOverlayType method107(final int i, final short i_0_) {
		FloOverlayType class91_sub20_sub3;
		try {
			FloOverlayType class91_sub20_sub3_1_ = (FloOverlayType) FloOverlayType.aClass96_2245.method1068(i);
			if (class91_sub20_sub3_1_ != null) {
				return class91_sub20_sub3_1_;
			}
			final byte[] is = FloOverlayType.overlayJs5.getFile(4, i, -1904885577);
			class91_sub20_sub3_1_ = new FloOverlayType();
			if (is != null) {
				class91_sub20_sub3_1_.decode(new ByteBuffer(is), i, -1938608557);
			}
			class91_sub20_sub3_1_.method743(965432656);
			FloOverlayType.aClass96_2245.method1067(class91_sub20_sub3_1_, i);
			class91_sub20_sub3 = class91_sub20_sub3_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ay.w()");
		}
		return class91_sub20_sub3;
	}

	public final synchronized void method108(final Class91_Sub2 class91_sub2, final int i) {
		try {
			this.aClass91_Sub2_83 = class91_sub2;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "ay.c()");
		}
	}

	public final synchronized void method109(final int i) {
		try {
			if (this.anIntArray85 == null) {
				if (i == 659762760) {
					throw new IllegalStateException();
				}
			} else {
				long l = Class108.method1111(1787821284);
				try {
					if (6478558059772011027L * this.aLong89 != 0L) {
						if (i == 659762760 || l < 6478558059772011027L * this.aLong89) {
							return;
						}
						method116(this.anInt82 * -801065403);
						this.aLong89 = 0L;
						this.aBoolean94 = true;
					}
					int i_2_ = method114();
					if (1812767661 * this.anInt79 - i_2_ > this.anInt90 * 220025231) {
						this.anInt90 = 1326755183 * (1812767661 * this.anInt79 - i_2_);
					}
					int i_3_ = -1599015681 * this.anInt87 + 459508093 * this.anInt95;
					if (i_3_ + 256 > 16384) {
						i_3_ = 16128;
					}
					if (256 + i_3_ > this.anInt82 * -801065403) {
						if (i == 659762760) {
							return;
						}
						this.anInt82 += 330445824;
						if (-801065403 * this.anInt82 > 16384) {
							this.anInt82 = 992165888;
						}
						method118();
						method116(this.anInt82 * -801065403);
						i_2_ = 0;
						this.aBoolean94 = true;
						if (256 + i_3_ > this.anInt82 * -801065403) {
							i_3_ = this.anInt82 * -801065403 - 256;
							this.anInt95 = (i_3_ - -1599015681 * this.anInt87) * 1297348565;
						}
					}
					for (/**/; i_2_ < i_3_; i_2_ += 256) {
						method119(this.anIntArray85, 256);
						method117();
					}
					if (l > this.aLong93 * -8587110573431273991L) {
						if (!this.aBoolean94) {
							if (i == 659762760) {
								return;
							}
							if (220025231 * this.anInt90 == 0 && this.anInt86 * -1799147115 == 0) {
								method118();
								this.aLong89 = (2000L + l) * 7885404415032866843L;
								return;
							}
							this.anInt95 = Math.min(this.anInt86 * -1799147115, 220025231 * this.anInt90) * 1297348565;
							this.anInt86 = this.anInt90 * 800339347;
						} else {
							this.aBoolean94 = false;
						}
						this.anInt90 = 0;
						this.aLong93 = (2000L + l) * 7781394432180808777L;
					}
					this.anInt79 = i_2_ * -811026395;
				} catch (final Exception exception) {
					method118();
					this.aLong89 = (l + 2000L) * 7885404415032866843L;
				}
				try {
					if (l > this.aLong88 * 963452409365137411L + 500000L) {
						l = 963452409365137411L * this.aLong88;
					}
					for (/**/; l > 963452409365137411L * this.aLong88 + 5000L; this.aLong88 += 256000 / (anInt81 * -45833585) * 803381271943504555L) {
						method113(256, -1570918536);
					}
				} catch (final Exception exception) {
					this.aLong88 = 803381271943504555L * l;
				}
			}
		} catch (final RuntimeException var8) {
			throw Class102.method1086(var8, "ay.h()");
		}
	}

	public final void method110(final int i) {
		try {
			this.aBoolean94 = true;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "ay.b()");
		}
	}

	void method111() throws Exception {
		/* empty */
	}

	final void method112(final Class91_Sub2 class91_sub2, final int i, final byte i_4_) {
		try {
			final int i_5_ = i >> 5;
			final Class91_Sub2 class91_sub2_6_ = this.aClass91_Sub2Array98[i_5_];
			if (class91_sub2_6_ == null) {
				this.aClass91_Sub2Array97[i_5_] = class91_sub2;
			} else {
				class91_sub2_6_.aClass91_Sub2_1757 = class91_sub2;
			}
			this.aClass91_Sub2Array98[i_5_] = class91_sub2;
			class91_sub2.anInt1755 = i;
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "ay.ah()");
		}
	}

	final void method113(final int i, final int i_7_) {
		try {
			this.anInt96 -= i * 243798379;
			if (585732931 * this.anInt96 < 0) {
				if (i_7_ >= -876305413) {
					return;
				}
				this.anInt96 = 0;
			}
			if (this.aClass91_Sub2_83 != null) {
				this.aClass91_Sub2_83.method505(i);
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "ay.ao()");
		}
	}

	int method114() throws Exception {
		int i;
		try {
			i = this.anInt82 * -801065403;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ay.f()");
		}
		return i;
	}

	void method116(final int i) throws Exception {
		/* empty */
	}

	void method117() throws Exception {
		/* empty */
	}

	void method118() {
		/* empty */
	}

	final void method119(final int[] is, final int i) {
		int i_8_ = i;
		if (aBoolean80) {
			i_8_ = i << 1;
		}
		Class50.method371(is, 0, i_8_);
		this.anInt96 -= i * 243798379;
		if (this.aClass91_Sub2_83 != null && 585732931 * this.anInt96 <= 0) {
			this.anInt96 += (anInt81 * -45833585 >> 4) * 243798379;
			ObjType.method792(this.aClass91_Sub2_83, -1125638029);
			method112(this.aClass91_Sub2_83, this.aClass91_Sub2_83.method513(), (byte) 51);
			int i_9_ = 0;
			int i_10_ = 255;
			int i_11_ = 7;
			while_30_: while (i_10_ != 0) {
				int i_12_;
				int i_13_;
				if (i_11_ < 0) {
					i_12_ = i_11_ & 0x3;
					i_13_ = -(i_11_ >> 2);
				} else {
					i_12_ = i_11_;
					i_13_ = 0;
				}
				for (int i_14_ = i_10_ >>> i_12_ & 0x11111111; i_14_ != 0; i_14_ >>>= 4) {
					if ((i_14_ & 0x1) != 0) {
						i_10_ &= 1 << i_12_ ^ 0xffffffff;
						Class91_Sub2 class91_sub2 = null;
						Class91_Sub2 class91_sub2_15_ = this.aClass91_Sub2Array97[i_12_];
						while (class91_sub2_15_ != null) {
							final Class91_Sub1 class91_sub1 = class91_sub2_15_.aClass91_Sub1_1756;
							if (class91_sub1 != null && class91_sub1.anInt1753 > i_13_) {
								i_10_ |= 1 << i_12_;
								class91_sub2 = class91_sub2_15_;
								class91_sub2_15_ = class91_sub2_15_.aClass91_Sub2_1757;
							} else {
								class91_sub2_15_.aBoolean1754 = true;
								final int i_16_ = class91_sub2_15_.method501();
								i_9_ += i_16_;
								if (class91_sub1 != null) {
									class91_sub1.anInt1753 += i_16_;
								}
								if (i_9_ >= 1347902549 * this.anInt84) {
									break while_30_;
								}
								Class91_Sub2 class91_sub2_17_ = class91_sub2_15_.method499();
								if (class91_sub2_17_ != null) {
									final int i_18_ = class91_sub2_15_.anInt1755;
									for (/**/; class91_sub2_17_ != null; class91_sub2_17_ = class91_sub2_15_.method515()) {
										method112(class91_sub2_17_, i_18_ * class91_sub2_17_.method513() >> 8, (byte) 72);
									}
								}
								final Class91_Sub2 class91_sub2_19_ = class91_sub2_15_.aClass91_Sub2_1757;
								class91_sub2_15_.aClass91_Sub2_1757 = null;
								if (class91_sub2 == null) {
									this.aClass91_Sub2Array97[i_12_] = class91_sub2_19_;
								} else {
									class91_sub2.aClass91_Sub2_1757 = class91_sub2_19_;
								}
								if (class91_sub2_19_ == null) {
									this.aClass91_Sub2Array98[i_12_] = class91_sub2;
								}
								class91_sub2_15_ = class91_sub2_19_;
							}
						}
					}
					i_12_ += 4;
					i_13_++;
				}
				i_11_--;
			}
			for (i_11_ = 0; i_11_ < 8; i_11_++) {
				Class91_Sub2 class91_sub2 = this.aClass91_Sub2Array97[i_11_];
				final Class91_Sub2[] class91_sub2s = this.aClass91_Sub2Array97;
				this.aClass91_Sub2Array98[i_11_] = null;
				class91_sub2s[i_11_] = null;
				Class91_Sub2 class91_sub2_20_;
				for (/**/; class91_sub2 != null; class91_sub2 = class91_sub2_20_) {
					class91_sub2_20_ = class91_sub2.aClass91_Sub2_1757;
					class91_sub2.aClass91_Sub2_1757 = null;
				}
			}
		}
		if (this.anInt96 * 585732931 < 0) {
			this.anInt96 = 0;
		}
		if (this.aClass91_Sub2_83 != null) {
			this.aClass91_Sub2_83.method498(is, 0, i);
		}
		this.aLong88 = Class108.method1111(234673767) * 803381271943504555L;
	}

	Class6() {
		try {
			this.anInt84 = -1739055200;
			this.aLong88 = Class108.method1111(258691695) * 803381271943504555L;
			this.aLong89 = 0L;
			this.anInt90 = 0;
			this.anInt86 = 0;
			this.anInt79 = 0;
			this.aLong93 = 0L;
			this.aBoolean94 = true;
			this.anInt96 = 0;
			this.aClass91_Sub2Array97 = new Class91_Sub2[8];
			this.aClass91_Sub2Array98 = new Class91_Sub2[8];
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "ay.<init>()");
		}
	}

	public final synchronized void method120(final int i) {
		try {
			if (Class91_Sub20_Sub14_Sub7.aClass17_2834 != null) {
				if (i <= 2026623301) {
					return;
				}
				boolean bool = true;
				for (int i_21_ = 0; i_21_ < 2; i_21_++) {
					if (Class91_Sub20_Sub14_Sub7.aClass17_2834.aClass6Array237[i_21_] == this) {
						Class91_Sub20_Sub14_Sub7.aClass17_2834.aClass6Array237[i_21_] = null;
					}
					if (Class91_Sub20_Sub14_Sub7.aClass17_2834.aClass6Array237[i_21_] != null) {
						bool = false;
					}
				}
				if (bool) {
					Class91_Sub20_Sub14_Sub7.aClass17_2834.aBoolean236 = true;
					while (Class91_Sub20_Sub14_Sub7.aClass17_2834.aBoolean235) {
						Class91_Sub20_Sub5.method761(50L);
					}
					Class91_Sub20_Sub14_Sub7.aClass17_2834 = null;
				}
			}
			method118();
			this.anIntArray85 = null;
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "ay.x()");
		}
	}

	public final synchronized void method121(final int i) {
		do {
			try {
				this.aBoolean94 = true;
				try {
					method111();
				} catch (final Exception exception) {
					method118();
					this.aLong89 = (Class108.method1111(2145572748) + 2000L) * 7885404415032866843L;
					break;
				}
				break;
			} catch (final RuntimeException var4) {
				throw Class102.method1086(var4, "ay.y()");
			}
		} while (false);
	}
}
