/* Class91_Sub20_Sub13_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub20_Sub13_Sub2 extends Class91_Sub20_Sub13 {
	static int anInt2523;
	static boolean aBoolean2524 = false;
	static boolean aBoolean2525 = false;
	public static boolean aBoolean2526 = true;
	static int anInt2527 = 0;
	static int anInt2528;
	static final int anInt2529 = 3500;
	static final int anInt2530 = 16;
	public static final int anInt2531 = 9;
	static int anInt2532;
	static int[] anIntArray2533 = new int[512];
	static int anInt2534;
	static int anInt2535;
	static int anInt2536;
	static boolean aBoolean2537 = false;
	static int anInt2538;
	public static Interface3 anInterface3_2539;
	static int anInt2540;
	static final int anInt2541 = 50;
	static int[] anIntArray2542 = new int[1024];
	public static int[] anIntArray2543 = new int[65536];
	static final int anInt2544 = 3;
	static int[] anIntArray2545 = new int[2048];
	public static int[] anIntArray2546 = new int[2048];
	public static int[] anIntArray2547 = new int[2048];

	static {
		for (int i = 1; i < 512; i++) {
			anIntArray2533[i] = 32768 / i;
		}
		for (int i = 1; i < 2048; i++) {
			anIntArray2545[i] = 65536 / i;
		}
		for (int i = 0; i < 2048; i++) {
			anIntArray2546[i] = (int) (65536.0 * Math.sin(i * 0.0030679615));
			anIntArray2547[i] = (int) (65536.0 * Math.cos(i * 0.0030679615));
		}
	}

	public static final void method841(final int i, final int i_0_) {
		final int i_1_ = anIntArray2542[0];
		final int i_2_ = i_1_ / anInt2483;
		final int i_3_ = i_1_ - i_2_ * anInt2483;
		anInt2528 = i - i_3_;
		anInt2534 = i_0_ - i_2_;
		anInt2532 = -anInt2528;
		anInt2538 = anInt2535 - anInt2528;
		anInt2523 = -anInt2534;
		anInt2540 = anInt2536 - anInt2534;
	}

	static final void method842(final int[] is, final int[] is_4_, int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, final int i_14_, final int i_15_, final int i_16_) {
		if (aBoolean2537) {
			if (i_8_ > anInt2535) {
				i_8_ = anInt2535;
			}
			if (i_7_ < 0) {
				i_7_ = 0;
			}
		}
		if (i_7_ < i_8_) {
			i_6_ += i_7_;
			i_9_ += i_10_ * i_7_;
			int i_17_ = i_8_ - i_7_;
			if (aBoolean2525) {
				final int i_18_ = i_7_ - anInt2528;
				i_11_ += i_14_ * i_18_;
				i_12_ += i_15_ * i_18_;
				i_13_ += i_16_ * i_18_;
				int var22 = i_13_ >> 12;
				int i_19_;
				int i_20_;
				if (var22 != 0) {
					i_19_ = i_11_ / var22;
					i_20_ = i_12_ / var22;
				} else {
					i_19_ = 0;
					i_20_ = 0;
				}
				i_11_ += i_14_ * i_17_;
				i_12_ += i_15_ * i_17_;
				i_13_ += i_16_ * i_17_;
				var22 = i_13_ >> 12;
				int i_21_;
				int i_22_;
				if (var22 != 0) {
					i_21_ = i_11_ / var22;
					i_22_ = i_12_ / var22;
				} else {
					i_21_ = 0;
					i_22_ = 0;
				}
				i = (i_19_ << 20) + i_20_;
				final int i_23_ = ((i_21_ - i_19_) / i_17_ << 20) + (i_22_ - i_20_) / i_17_;
				i_17_ >>= 3;
				i_10_ <<= 3;
				int i_24_ = i_9_ >> 8;
				if (aBoolean2524) {
					if (i_17_ > 0) {
						do {
							i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							i += i_23_;
							i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							i += i_23_;
							i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							i += i_23_;
							i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							i += i_23_;
							i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							i += i_23_;
							i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							i += i_23_;
							i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							i += i_23_;
							i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							i += i_23_;
							i_9_ += i_10_;
							i_24_ = i_9_ >> 8;
						} while (--i_17_ > 0);
					}
					i_17_ = i_8_ - i_7_ & 0x7;
					if (i_17_ > 0) {
						do {
							i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							i += i_23_;
						} while (--i_17_ > 0);
					}
				} else {
					if (i_17_ > 0) {
						do {
							if ((i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_23_;
							if ((i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_23_;
							if ((i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_23_;
							if ((i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_23_;
							if ((i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_23_;
							if ((i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_23_;
							if ((i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_23_;
							if ((i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_23_;
							i_9_ += i_10_;
							i_24_ = i_9_ >> 8;
						} while (--i_17_ > 0);
					}
					i_17_ = i_8_ - i_7_ & 0x7;
					if (i_17_ > 0) {
						do {
							if ((i_5_ = is_4_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_24_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_23_;
						} while (--i_17_ > 0);
					}
				}
			} else {
				final int i_25_ = i_7_ - anInt2528;
				i_11_ += i_14_ * i_25_;
				i_12_ += i_15_ * i_25_;
				i_13_ += i_16_ * i_25_;
				int var22 = i_13_ >> 14;
				int i_26_;
				int i_27_;
				if (var22 != 0) {
					i_26_ = i_11_ / var22;
					i_27_ = i_12_ / var22;
				} else {
					i_26_ = 0;
					i_27_ = 0;
				}
				i_11_ += i_14_ * i_17_;
				i_12_ += i_15_ * i_17_;
				i_13_ += i_16_ * i_17_;
				var22 = i_13_ >> 14;
				int i_28_;
				int i_29_;
				if (var22 != 0) {
					i_28_ = i_11_ / var22;
					i_29_ = i_12_ / var22;
				} else {
					i_28_ = 0;
					i_29_ = 0;
				}
				i = (i_26_ << 18) + i_27_;
				final int i_30_ = ((i_28_ - i_26_) / i_17_ << 18) + (i_29_ - i_27_) / i_17_;
				i_17_ >>= 3;
				i_10_ <<= 3;
				int i_31_ = i_9_ >> 8;
				if (aBoolean2524) {
					if (i_17_ > 0) {
						do {
							i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
							i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
							i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
							i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
							i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
							i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
							i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
							i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
							i_9_ += i_10_;
							i_31_ = i_9_ >> 8;
						} while (--i_17_ > 0);
					}
					i_17_ = i_8_ - i_7_ & 0x7;
					if (i_17_ > 0) {
						do {
							i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)];
							is[i_6_++] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
						} while (--i_17_ > 0);
					}
				} else {
					if (i_17_ > 0) {
						do {
							if ((i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_30_;
							if ((i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_30_;
							if ((i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_30_;
							if ((i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_30_;
							if ((i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_30_;
							if ((i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_30_;
							if ((i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_30_;
							if ((i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_30_;
							i_9_ += i_10_;
							i_31_ = i_9_ >> 8;
						} while (--i_17_ > 0);
					}
					i_17_ = i_8_ - i_7_ & 0x7;
					if (i_17_ > 0) {
						do {
							if ((i_5_ = is_4_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_6_] = ((i_5_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							}
							i_6_++;
							i += i_30_;
						} while (--i_17_ > 0);
					}
				}
			}
		}
	}

	public static final void method843(final double d) {
		method848(d, 0, 512);
	}

	static final void method844(final int[] is, final int[] is_32_, int i, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, final int i_42_, final int i_43_, final int i_44_) {
		if (aBoolean2537) {
			if (i_36_ > anInt2535) {
				i_36_ = anInt2535;
			}
			if (i_35_ < 0) {
				i_35_ = 0;
			}
		}
		if (i_35_ < i_36_) {
			i_34_ += i_35_;
			i_37_ += i_38_ * i_35_;
			int i_45_ = i_36_ - i_35_;
			if (aBoolean2525) {
				final int i_46_ = i_35_ - anInt2528;
				i_39_ += (i_42_ >> 3) * i_46_;
				i_40_ += (i_43_ >> 3) * i_46_;
				i_41_ += (i_44_ >> 3) * i_46_;
				int var22 = i_41_ >> 12;
				int i_47_;
				int i_48_;
				if (var22 != 0) {
					i_47_ = i_39_ / var22;
					i_48_ = i_40_ / var22;
					if (i_47_ < 0) {
						i_47_ = 0;
					} else if (i_47_ > 4032) {
						i_47_ = 4032;
					}
				} else {
					i_47_ = 0;
					i_48_ = 0;
				}
				i_39_ += i_42_;
				i_40_ += i_43_;
				i_41_ += i_44_;
				var22 = i_41_ >> 12;
				int i_49_;
				int i_50_;
				if (var22 != 0) {
					i_49_ = i_39_ / var22;
					i_50_ = i_40_ / var22;
					if (i_49_ < 0) {
						i_49_ = 0;
					} else if (i_49_ > 4032) {
						i_49_ = 4032;
					}
				} else {
					i_49_ = 0;
					i_50_ = 0;
				}
				i = (i_47_ << 20) + i_48_;
				int i_51_ = (i_49_ - i_47_ >> 3 << 20) + (i_50_ - i_48_ >> 3);
				i_45_ >>= 3;
				i_38_ <<= 3;
				int i_52_ = i_37_ >> 8;
				if (aBoolean2524) {
					if (i_45_ > 0) {
						do {
							i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							i += i_51_;
							i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							i += i_51_;
							i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							i += i_51_;
							i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							i += i_51_;
							i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							i += i_51_;
							i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							i += i_51_;
							i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							i += i_51_;
							i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							i_47_ = i_49_;
							i_48_ = i_50_;
							i_39_ += i_42_;
							i_40_ += i_43_;
							i_41_ += i_44_;
							var22 = i_41_ >> 12;
							if (var22 != 0) {
								i_49_ = i_39_ / var22;
								i_50_ = i_40_ / var22;
								if (i_49_ < 0) {
									i_49_ = 0;
								} else if (i_49_ > 4032) {
									i_49_ = 4032;
								}
							} else {
								i_49_ = 0;
								i_50_ = 0;
							}
							i = (i_47_ << 20) + i_48_;
							i_51_ = (i_49_ - i_47_ >> 3 << 20) + (i_50_ - i_48_ >> 3);
							i_37_ += i_38_;
							i_52_ = i_37_ >> 8;
						} while (--i_45_ > 0);
					}
					i_45_ = i_36_ - i_35_ & 0x7;
					if (i_45_ > 0) {
						do {
							i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							i += i_51_;
						} while (--i_45_ > 0);
					}
				} else {
					if (i_45_ > 0) {
						do {
							if ((i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							}
							i_34_++;
							i += i_51_;
							if ((i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							}
							i_34_++;
							i += i_51_;
							if ((i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							}
							i_34_++;
							i += i_51_;
							if ((i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							}
							i_34_++;
							i += i_51_;
							if ((i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							}
							i_34_++;
							i += i_51_;
							if ((i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							}
							i_34_++;
							i += i_51_;
							if ((i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							}
							i_34_++;
							i += i_51_;
							if ((i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							}
							i_34_++;
							i_47_ = i_49_;
							i_48_ = i_50_;
							i_39_ += i_42_;
							i_40_ += i_43_;
							i_41_ += i_44_;
							var22 = i_41_ >> 12;
							if (var22 != 0) {
								i_49_ = i_39_ / var22;
								i_50_ = i_40_ / var22;
								if (i_49_ < 0) {
									i_49_ = 0;
								} else if (i_49_ > 4032) {
									i_49_ = 4032;
								}
							} else {
								i_49_ = 0;
								i_50_ = 0;
							}
							i = (i_47_ << 20) + i_48_;
							i_51_ = (i_49_ - i_47_ >> 3 << 20) + (i_50_ - i_48_ >> 3);
							i_37_ += i_38_;
							i_52_ = i_37_ >> 8;
						} while (--i_45_ > 0);
					}
					i_45_ = i_36_ - i_35_ & 0x7;
					if (i_45_ > 0) {
						do {
							if ((i_33_ = is_32_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_52_ & 0xff0000) >> 8;
							}
							i_34_++;
							i += i_51_;
						} while (--i_45_ > 0);
					}
				}
			} else {
				final int i_53_ = i_35_ - anInt2528;
				i_39_ += (i_42_ >> 3) * i_53_;
				i_40_ += (i_43_ >> 3) * i_53_;
				i_41_ += (i_44_ >> 3) * i_53_;
				int var22 = i_41_ >> 14;
				int i_54_;
				int i_55_;
				if (var22 != 0) {
					i_54_ = i_39_ / var22;
					i_55_ = i_40_ / var22;
					if (i_54_ < 0) {
						i_54_ = 0;
					} else if (i_54_ > 16256) {
						i_54_ = 16256;
					}
				} else {
					i_54_ = 0;
					i_55_ = 0;
				}
				i_39_ += i_42_;
				i_40_ += i_43_;
				i_41_ += i_44_;
				var22 = i_41_ >> 14;
				int i_56_;
				int i_57_;
				if (var22 != 0) {
					i_56_ = i_39_ / var22;
					i_57_ = i_40_ / var22;
					if (i_56_ < 0) {
						i_56_ = 0;
					} else if (i_56_ > 16256) {
						i_56_ = 16256;
					}
				} else {
					i_56_ = 0;
					i_57_ = 0;
				}
				i = (i_54_ << 18) + i_55_;
				int i_58_ = (i_56_ - i_54_ >> 3 << 18) + (i_57_ - i_55_ >> 3);
				i_45_ >>= 3;
				i_38_ <<= 3;
				int i_59_ = i_37_ >> 8;
				if (aBoolean2524) {
					if (i_45_ > 0) {
						do {
							i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							i += i_58_;
							i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							i += i_58_;
							i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							i += i_58_;
							i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							i += i_58_;
							i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							i += i_58_;
							i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							i += i_58_;
							i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							i += i_58_;
							i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							i_54_ = i_56_;
							i_55_ = i_57_;
							i_39_ += i_42_;
							i_40_ += i_43_;
							i_41_ += i_44_;
							var22 = i_41_ >> 14;
							if (var22 != 0) {
								i_56_ = i_39_ / var22;
								i_57_ = i_40_ / var22;
								if (i_56_ < 0) {
									i_56_ = 0;
								} else if (i_56_ > 16256) {
									i_56_ = 16256;
								}
							} else {
								i_56_ = 0;
								i_57_ = 0;
							}
							i = (i_54_ << 18) + i_55_;
							i_58_ = (i_56_ - i_54_ >> 3 << 18) + (i_57_ - i_55_ >> 3);
							i_37_ += i_38_;
							i_59_ = i_37_ >> 8;
						} while (--i_45_ > 0);
					}
					i_45_ = i_36_ - i_35_ & 0x7;
					if (i_45_ > 0) {
						do {
							i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)];
							is[i_34_++] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							i += i_58_;
						} while (--i_45_ > 0);
					}
				} else {
					if (i_45_ > 0) {
						do {
							if ((i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							}
							i_34_++;
							i += i_58_;
							if ((i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							}
							i_34_++;
							i += i_58_;
							if ((i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							}
							i_34_++;
							i += i_58_;
							if ((i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							}
							i_34_++;
							i += i_58_;
							if ((i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							}
							i_34_++;
							i += i_58_;
							if ((i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							}
							i_34_++;
							i += i_58_;
							if ((i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							}
							i_34_++;
							i += i_58_;
							if ((i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							}
							i_34_++;
							i_54_ = i_56_;
							i_55_ = i_57_;
							i_39_ += i_42_;
							i_40_ += i_43_;
							i_41_ += i_44_;
							var22 = i_41_ >> 14;
							if (var22 != 0) {
								i_56_ = i_39_ / var22;
								i_57_ = i_40_ / var22;
								if (i_56_ < 0) {
									i_56_ = 0;
								} else if (i_56_ > 16256) {
									i_56_ = 16256;
								}
							} else {
								i_56_ = 0;
								i_57_ = 0;
							}
							i = (i_54_ << 18) + i_55_;
							i_58_ = (i_56_ - i_54_ >> 3 << 18) + (i_57_ - i_55_ >> 3);
							i_37_ += i_38_;
							i_59_ = i_37_ >> 8;
						} while (--i_45_ > 0);
					}
					i_45_ = i_36_ - i_35_ & 0x7;
					if (i_45_ > 0) {
						do {
							if ((i_33_ = is_32_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_34_] = ((i_33_ & 0xff00ff) * i_59_ & ~0xff00ff) + ((i_33_ & 0xff00) * i_59_ & 0xff0000) >> 8;
							}
							i_34_++;
							i += i_58_;
						} while (--i_45_ > 0);
					}
				}
			}
		}
	}

	static final void method845(int i, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_) {
		final int i_68_ = i_63_ - i_62_;
		final int i_69_ = i_60_ - i;
		final int i_70_ = i_64_ - i_62_;
		final int i_71_ = i_61_ - i;
		final int i_72_ = i_66_ - i_65_;
		final int i_73_ = i_67_ - i_65_;
		int i_74_;
		if (i_61_ != i_60_) {
			i_74_ = (i_64_ - i_63_ << 16) / (i_61_ - i_60_);
		} else {
			i_74_ = 0;
		}
		int i_75_;
		if (i_60_ != i) {
			i_75_ = (i_68_ << 16) / i_69_;
		} else {
			i_75_ = 0;
		}
		int i_76_;
		if (i_61_ != i) {
			i_76_ = (i_70_ << 16) / i_71_;
		} else {
			i_76_ = 0;
		}
		final int i_77_ = i_68_ * i_71_ - i_70_ * i_69_;
		if (i_77_ != 0) {
			final int i_78_ = (i_72_ * i_71_ - i_73_ * i_69_ << 8) / i_77_;
			final int var20 = (i_73_ * i_68_ - i_72_ * i_70_ << 8) / i_77_;
			if (i <= i_60_ && i <= i_61_) {
				if (i < anInt2536) {
					if (i_60_ > anInt2536) {
						i_60_ = anInt2536;
					}
					if (i_61_ > anInt2536) {
						i_61_ = anInt2536;
					}
					i_65_ = (i_65_ << 8) - i_78_ * i_62_ + i_78_;
					if (i_60_ < i_61_) {
						i_64_ = i_62_ <<= 16;
						if (i < 0) {
							i_64_ -= i_76_ * i;
							i_62_ -= i_75_ * i;
							i_65_ -= var20 * i;
							i = 0;
						}
						i_63_ <<= 16;
						if (i_60_ < 0) {
							i_63_ -= i_74_ * i_60_;
							i_60_ = 0;
						}
						if ((i == i_60_ || i_76_ >= i_75_) && (i != i_60_ || i_76_ <= i_74_)) {
							i_61_ -= i_60_;
							i_60_ -= i;
							i = anIntArray2542[i];
							for (;;) {
								if (--i_60_ < 0) {
									while (--i_61_ >= 0) {
										method856(anIntArray2481, i, 0, 0, i_63_ >> 16, i_64_ >> 16, i_65_, i_78_);
										i_64_ += i_76_;
										i_63_ += i_74_;
										i_65_ += var20;
										i += anInt2483;
									}
									break;
								}
								method856(anIntArray2481, i, 0, 0, i_62_ >> 16, i_64_ >> 16, i_65_, i_78_);
								i_64_ += i_76_;
								i_62_ += i_75_;
								i_65_ += var20;
								i += anInt2483;
							}
						} else {
							i_61_ -= i_60_;
							i_60_ -= i;
							i = anIntArray2542[i];
							for (;;) {
								if (--i_60_ < 0) {
									while (--i_61_ >= 0) {
										method856(anIntArray2481, i, 0, 0, i_64_ >> 16, i_63_ >> 16, i_65_, i_78_);
										i_64_ += i_76_;
										i_63_ += i_74_;
										i_65_ += var20;
										i += anInt2483;
									}
									break;
								}
								method856(anIntArray2481, i, 0, 0, i_64_ >> 16, i_62_ >> 16, i_65_, i_78_);
								i_64_ += i_76_;
								i_62_ += i_75_;
								i_65_ += var20;
								i += anInt2483;
							}
						}
					} else {
						i_63_ = i_62_ <<= 16;
						if (i < 0) {
							i_63_ -= i_76_ * i;
							i_62_ -= i_75_ * i;
							i_65_ -= var20 * i;
							i = 0;
						}
						i_64_ <<= 16;
						if (i_61_ < 0) {
							i_64_ -= i_74_ * i_61_;
							i_61_ = 0;
						}
						if ((i == i_61_ || i_76_ >= i_75_) && (i != i_61_ || i_74_ <= i_75_)) {
							i_60_ -= i_61_;
							i_61_ -= i;
							i = anIntArray2542[i];
							for (;;) {
								if (--i_61_ < 0) {
									while (--i_60_ >= 0) {
										method856(anIntArray2481, i, 0, 0, i_62_ >> 16, i_64_ >> 16, i_65_, i_78_);
										i_64_ += i_74_;
										i_62_ += i_75_;
										i_65_ += var20;
										i += anInt2483;
									}
									break;
								}
								method856(anIntArray2481, i, 0, 0, i_62_ >> 16, i_63_ >> 16, i_65_, i_78_);
								i_63_ += i_76_;
								i_62_ += i_75_;
								i_65_ += var20;
								i += anInt2483;
							}
						} else {
							i_60_ -= i_61_;
							i_61_ -= i;
							i = anIntArray2542[i];
							for (;;) {
								if (--i_61_ < 0) {
									while (--i_60_ >= 0) {
										method856(anIntArray2481, i, 0, 0, i_64_ >> 16, i_62_ >> 16, i_65_, i_78_);
										i_64_ += i_74_;
										i_62_ += i_75_;
										i_65_ += var20;
										i += anInt2483;
									}
									break;
								}
								method856(anIntArray2481, i, 0, 0, i_63_ >> 16, i_62_ >> 16, i_65_, i_78_);
								i_63_ += i_76_;
								i_62_ += i_75_;
								i_65_ += var20;
								i += anInt2483;
							}
						}
					}
				}
			} else if (i_60_ <= i_61_) {
				if (i_60_ < anInt2536) {
					if (i_61_ > anInt2536) {
						i_61_ = anInt2536;
					}
					if (i > anInt2536) {
						i = anInt2536;
					}
					i_66_ = (i_66_ << 8) - i_78_ * i_63_ + i_78_;
					if (i_61_ < i) {
						i_62_ = i_63_ <<= 16;
						if (i_60_ < 0) {
							i_62_ -= i_75_ * i_60_;
							i_63_ -= i_74_ * i_60_;
							i_66_ -= var20 * i_60_;
							i_60_ = 0;
						}
						i_64_ <<= 16;
						if (i_61_ < 0) {
							i_64_ -= i_76_ * i_61_;
							i_61_ = 0;
						}
						if ((i_60_ == i_61_ || i_75_ >= i_74_) && (i_60_ != i_61_ || i_75_ <= i_76_)) {
							i -= i_61_;
							i_61_ -= i_60_;
							i_60_ = anIntArray2542[i_60_];
							for (;;) {
								if (--i_61_ < 0) {
									while (--i >= 0) {
										method856(anIntArray2481, i_60_, 0, 0, i_64_ >> 16, i_62_ >> 16, i_66_, i_78_);
										i_62_ += i_75_;
										i_64_ += i_76_;
										i_66_ += var20;
										i_60_ += anInt2483;
									}
									break;
								}
								method856(anIntArray2481, i_60_, 0, 0, i_63_ >> 16, i_62_ >> 16, i_66_, i_78_);
								i_62_ += i_75_;
								i_63_ += i_74_;
								i_66_ += var20;
								i_60_ += anInt2483;
							}
						} else {
							i -= i_61_;
							i_61_ -= i_60_;
							i_60_ = anIntArray2542[i_60_];
							for (;;) {
								if (--i_61_ < 0) {
									while (--i >= 0) {
										method856(anIntArray2481, i_60_, 0, 0, i_62_ >> 16, i_64_ >> 16, i_66_, i_78_);
										i_62_ += i_75_;
										i_64_ += i_76_;
										i_66_ += var20;
										i_60_ += anInt2483;
									}
									break;
								}
								method856(anIntArray2481, i_60_, 0, 0, i_62_ >> 16, i_63_ >> 16, i_66_, i_78_);
								i_62_ += i_75_;
								i_63_ += i_74_;
								i_66_ += var20;
								i_60_ += anInt2483;
							}
						}
					} else {
						i_64_ = i_63_ <<= 16;
						if (i_60_ < 0) {
							i_64_ -= i_75_ * i_60_;
							i_63_ -= i_74_ * i_60_;
							i_66_ -= var20 * i_60_;
							i_60_ = 0;
						}
						i_62_ <<= 16;
						if (i < 0) {
							i_62_ -= i_76_ * i;
							i = 0;
						}
						if (i_75_ < i_74_) {
							i_61_ -= i;
							i -= i_60_;
							i_60_ = anIntArray2542[i_60_];
							for (;;) {
								if (--i < 0) {
									while (--i_61_ >= 0) {
										method856(anIntArray2481, i_60_, 0, 0, i_62_ >> 16, i_63_ >> 16, i_66_, i_78_);
										i_62_ += i_76_;
										i_63_ += i_74_;
										i_66_ += var20;
										i_60_ += anInt2483;
									}
									break;
								}
								method856(anIntArray2481, i_60_, 0, 0, i_64_ >> 16, i_63_ >> 16, i_66_, i_78_);
								i_64_ += i_75_;
								i_63_ += i_74_;
								i_66_ += var20;
								i_60_ += anInt2483;
							}
						} else {
							i_61_ -= i;
							i -= i_60_;
							i_60_ = anIntArray2542[i_60_];
							for (;;) {
								if (--i < 0) {
									while (--i_61_ >= 0) {
										method856(anIntArray2481, i_60_, 0, 0, i_63_ >> 16, i_62_ >> 16, i_66_, i_78_);
										i_62_ += i_76_;
										i_63_ += i_74_;
										i_66_ += var20;
										i_60_ += anInt2483;
									}
									break;
								}
								method856(anIntArray2481, i_60_, 0, 0, i_63_ >> 16, i_64_ >> 16, i_66_, i_78_);
								i_64_ += i_75_;
								i_63_ += i_74_;
								i_66_ += var20;
								i_60_ += anInt2483;
							}
						}
					}
				}
			} else if (i_61_ < anInt2536) {
				if (i > anInt2536) {
					i = anInt2536;
				}
				if (i_60_ > anInt2536) {
					i_60_ = anInt2536;
				}
				i_67_ = (i_67_ << 8) - i_78_ * i_64_ + i_78_;
				if (i < i_60_) {
					i_63_ = i_64_ <<= 16;
					if (i_61_ < 0) {
						i_63_ -= i_74_ * i_61_;
						i_64_ -= i_76_ * i_61_;
						i_67_ -= var20 * i_61_;
						i_61_ = 0;
					}
					i_62_ <<= 16;
					if (i < 0) {
						i_62_ -= i_75_ * i;
						i = 0;
					}
					if (i_74_ < i_76_) {
						i_60_ -= i;
						i -= i_61_;
						i_61_ = anIntArray2542[i_61_];
						for (;;) {
							if (--i < 0) {
								while (--i_60_ >= 0) {
									method856(anIntArray2481, i_61_, 0, 0, i_63_ >> 16, i_62_ >> 16, i_67_, i_78_);
									i_63_ += i_74_;
									i_62_ += i_75_;
									i_67_ += var20;
									i_61_ += anInt2483;
								}
								break;
							}
							method856(anIntArray2481, i_61_, 0, 0, i_63_ >> 16, i_64_ >> 16, i_67_, i_78_);
							i_63_ += i_74_;
							i_64_ += i_76_;
							i_67_ += var20;
							i_61_ += anInt2483;
						}
					} else {
						i_60_ -= i;
						i -= i_61_;
						i_61_ = anIntArray2542[i_61_];
						for (;;) {
							if (--i < 0) {
								while (--i_60_ >= 0) {
									method856(anIntArray2481, i_61_, 0, 0, i_62_ >> 16, i_63_ >> 16, i_67_, i_78_);
									i_63_ += i_74_;
									i_62_ += i_75_;
									i_67_ += var20;
									i_61_ += anInt2483;
								}
								break;
							}
							method856(anIntArray2481, i_61_, 0, 0, i_64_ >> 16, i_63_ >> 16, i_67_, i_78_);
							i_63_ += i_74_;
							i_64_ += i_76_;
							i_67_ += var20;
							i_61_ += anInt2483;
						}
					}
				} else {
					i_62_ = i_64_ <<= 16;
					if (i_61_ < 0) {
						i_62_ -= i_74_ * i_61_;
						i_64_ -= i_76_ * i_61_;
						i_67_ -= var20 * i_61_;
						i_61_ = 0;
					}
					i_63_ <<= 16;
					if (i_60_ < 0) {
						i_63_ -= i_75_ * i_60_;
						i_60_ = 0;
					}
					if (i_74_ < i_76_) {
						i -= i_60_;
						i_60_ -= i_61_;
						i_61_ = anIntArray2542[i_61_];
						for (;;) {
							if (--i_60_ < 0) {
								while (--i >= 0) {
									method856(anIntArray2481, i_61_, 0, 0, i_63_ >> 16, i_64_ >> 16, i_67_, i_78_);
									i_63_ += i_75_;
									i_64_ += i_76_;
									i_67_ += var20;
									i_61_ += anInt2483;
								}
								break;
							}
							method856(anIntArray2481, i_61_, 0, 0, i_62_ >> 16, i_64_ >> 16, i_67_, i_78_);
							i_62_ += i_74_;
							i_64_ += i_76_;
							i_67_ += var20;
							i_61_ += anInt2483;
						}
					} else {
						i -= i_60_;
						i_60_ -= i_61_;
						i_61_ = anIntArray2542[i_61_];
						for (;;) {
							if (--i_60_ < 0) {
								while (--i >= 0) {
									method856(anIntArray2481, i_61_, 0, 0, i_64_ >> 16, i_63_ >> 16, i_67_, i_78_);
									i_63_ += i_75_;
									i_64_ += i_76_;
									i_67_ += var20;
									i_61_ += anInt2483;
								}
								break;
							}
							method856(anIntArray2481, i_61_, 0, 0, i_64_ >> 16, i_62_ >> 16, i_67_, i_78_);
							i_62_ += i_74_;
							i_64_ += i_76_;
							i_67_ += var20;
							i_61_ += anInt2483;
						}
					}
				}
			}
		}
	}

	public static final void method846(int i, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, final int i_84_) {
		int i_85_ = 0;
		if (i_79_ != i) {
			i_85_ = (i_82_ - i_81_ << 16) / (i_79_ - i);
		}
		int i_86_ = 0;
		if (i_80_ != i_79_) {
			i_86_ = (i_83_ - i_82_ << 16) / (i_80_ - i_79_);
		}
		int i_87_ = 0;
		if (i_80_ != i) {
			i_87_ = (i_81_ - i_83_ << 16) / (i - i_80_);
		}
		if (i <= i_79_ && i <= i_80_) {
			if (i < anInt2536) {
				if (i_79_ > anInt2536) {
					i_79_ = anInt2536;
				}
				if (i_80_ > anInt2536) {
					i_80_ = anInt2536;
				}
				if (i_79_ < i_80_) {
					i_83_ = i_81_ <<= 16;
					if (i < 0) {
						i_83_ -= i_87_ * i;
						i_81_ -= i_85_ * i;
						i = 0;
					}
					i_82_ <<= 16;
					if (i_79_ < 0) {
						i_82_ -= i_86_ * i_79_;
						i_79_ = 0;
					}
					if ((i == i_79_ || i_87_ >= i_85_) && (i != i_79_ || i_87_ <= i_86_)) {
						i_80_ -= i_79_;
						i_79_ -= i;
						i = anIntArray2542[i];
						for (;;) {
							if (--i_79_ < 0) {
								while (--i_80_ >= 0) {
									method847(anIntArray2481, i, i_84_, 0, i_82_ >> 16, i_83_ >> 16);
									i_83_ += i_87_;
									i_82_ += i_86_;
									i += anInt2483;
								}
								break;
							}
							method847(anIntArray2481, i, i_84_, 0, i_81_ >> 16, i_83_ >> 16);
							i_83_ += i_87_;
							i_81_ += i_85_;
							i += anInt2483;
						}
					} else {
						i_80_ -= i_79_;
						i_79_ -= i;
						i = anIntArray2542[i];
						for (;;) {
							if (--i_79_ < 0) {
								while (--i_80_ >= 0) {
									method847(anIntArray2481, i, i_84_, 0, i_83_ >> 16, i_82_ >> 16);
									i_83_ += i_87_;
									i_82_ += i_86_;
									i += anInt2483;
								}
								break;
							}
							method847(anIntArray2481, i, i_84_, 0, i_83_ >> 16, i_81_ >> 16);
							i_83_ += i_87_;
							i_81_ += i_85_;
							i += anInt2483;
						}
					}
				} else {
					i_82_ = i_81_ <<= 16;
					if (i < 0) {
						i_82_ -= i_87_ * i;
						i_81_ -= i_85_ * i;
						i = 0;
					}
					i_83_ <<= 16;
					if (i_80_ < 0) {
						i_83_ -= i_86_ * i_80_;
						i_80_ = 0;
					}
					if ((i == i_80_ || i_87_ >= i_85_) && (i != i_80_ || i_86_ <= i_85_)) {
						i_79_ -= i_80_;
						i_80_ -= i;
						i = anIntArray2542[i];
						for (;;) {
							if (--i_80_ < 0) {
								while (--i_79_ >= 0) {
									method847(anIntArray2481, i, i_84_, 0, i_81_ >> 16, i_83_ >> 16);
									i_83_ += i_86_;
									i_81_ += i_85_;
									i += anInt2483;
								}
								break;
							}
							method847(anIntArray2481, i, i_84_, 0, i_81_ >> 16, i_82_ >> 16);
							i_82_ += i_87_;
							i_81_ += i_85_;
							i += anInt2483;
						}
					} else {
						i_79_ -= i_80_;
						i_80_ -= i;
						i = anIntArray2542[i];
						for (;;) {
							if (--i_80_ < 0) {
								while (--i_79_ >= 0) {
									method847(anIntArray2481, i, i_84_, 0, i_83_ >> 16, i_81_ >> 16);
									i_83_ += i_86_;
									i_81_ += i_85_;
									i += anInt2483;
								}
								break;
							}
							method847(anIntArray2481, i, i_84_, 0, i_82_ >> 16, i_81_ >> 16);
							i_82_ += i_87_;
							i_81_ += i_85_;
							i += anInt2483;
						}
					}
				}
			}
		} else if (i_79_ <= i_80_) {
			if (i_79_ < anInt2536) {
				if (i_80_ > anInt2536) {
					i_80_ = anInt2536;
				}
				if (i > anInt2536) {
					i = anInt2536;
				}
				if (i_80_ < i) {
					i_81_ = i_82_ <<= 16;
					if (i_79_ < 0) {
						i_81_ -= i_85_ * i_79_;
						i_82_ -= i_86_ * i_79_;
						i_79_ = 0;
					}
					i_83_ <<= 16;
					if (i_80_ < 0) {
						i_83_ -= i_87_ * i_80_;
						i_80_ = 0;
					}
					if ((i_79_ == i_80_ || i_85_ >= i_86_) && (i_79_ != i_80_ || i_85_ <= i_87_)) {
						i -= i_80_;
						i_80_ -= i_79_;
						i_79_ = anIntArray2542[i_79_];
						for (;;) {
							if (--i_80_ < 0) {
								while (--i >= 0) {
									method847(anIntArray2481, i_79_, i_84_, 0, i_83_ >> 16, i_81_ >> 16);
									i_81_ += i_85_;
									i_83_ += i_87_;
									i_79_ += anInt2483;
								}
								break;
							}
							method847(anIntArray2481, i_79_, i_84_, 0, i_82_ >> 16, i_81_ >> 16);
							i_81_ += i_85_;
							i_82_ += i_86_;
							i_79_ += anInt2483;
						}
					} else {
						i -= i_80_;
						i_80_ -= i_79_;
						i_79_ = anIntArray2542[i_79_];
						for (;;) {
							if (--i_80_ < 0) {
								while (--i >= 0) {
									method847(anIntArray2481, i_79_, i_84_, 0, i_81_ >> 16, i_83_ >> 16);
									i_81_ += i_85_;
									i_83_ += i_87_;
									i_79_ += anInt2483;
								}
								break;
							}
							method847(anIntArray2481, i_79_, i_84_, 0, i_81_ >> 16, i_82_ >> 16);
							i_81_ += i_85_;
							i_82_ += i_86_;
							i_79_ += anInt2483;
						}
					}
				} else {
					i_83_ = i_82_ <<= 16;
					if (i_79_ < 0) {
						i_83_ -= i_85_ * i_79_;
						i_82_ -= i_86_ * i_79_;
						i_79_ = 0;
					}
					i_81_ <<= 16;
					if (i < 0) {
						i_81_ -= i_87_ * i;
						i = 0;
					}
					if (i_85_ < i_86_) {
						i_80_ -= i;
						i -= i_79_;
						i_79_ = anIntArray2542[i_79_];
						for (;;) {
							if (--i < 0) {
								while (--i_80_ >= 0) {
									method847(anIntArray2481, i_79_, i_84_, 0, i_81_ >> 16, i_82_ >> 16);
									i_81_ += i_87_;
									i_82_ += i_86_;
									i_79_ += anInt2483;
								}
								break;
							}
							method847(anIntArray2481, i_79_, i_84_, 0, i_83_ >> 16, i_82_ >> 16);
							i_83_ += i_85_;
							i_82_ += i_86_;
							i_79_ += anInt2483;
						}
					} else {
						i_80_ -= i;
						i -= i_79_;
						i_79_ = anIntArray2542[i_79_];
						for (;;) {
							if (--i < 0) {
								while (--i_80_ >= 0) {
									method847(anIntArray2481, i_79_, i_84_, 0, i_82_ >> 16, i_81_ >> 16);
									i_81_ += i_87_;
									i_82_ += i_86_;
									i_79_ += anInt2483;
								}
								break;
							}
							method847(anIntArray2481, i_79_, i_84_, 0, i_82_ >> 16, i_83_ >> 16);
							i_83_ += i_85_;
							i_82_ += i_86_;
							i_79_ += anInt2483;
						}
					}
				}
			}
		} else if (i_80_ < anInt2536) {
			if (i > anInt2536) {
				i = anInt2536;
			}
			if (i_79_ > anInt2536) {
				i_79_ = anInt2536;
			}
			if (i < i_79_) {
				i_82_ = i_83_ <<= 16;
				if (i_80_ < 0) {
					i_82_ -= i_86_ * i_80_;
					i_83_ -= i_87_ * i_80_;
					i_80_ = 0;
				}
				i_81_ <<= 16;
				if (i < 0) {
					i_81_ -= i_85_ * i;
					i = 0;
				}
				if (i_86_ < i_87_) {
					i_79_ -= i;
					i -= i_80_;
					i_80_ = anIntArray2542[i_80_];
					for (;;) {
						if (--i < 0) {
							while (--i_79_ >= 0) {
								method847(anIntArray2481, i_80_, i_84_, 0, i_82_ >> 16, i_81_ >> 16);
								i_82_ += i_86_;
								i_81_ += i_85_;
								i_80_ += anInt2483;
							}
							break;
						}
						method847(anIntArray2481, i_80_, i_84_, 0, i_82_ >> 16, i_83_ >> 16);
						i_82_ += i_86_;
						i_83_ += i_87_;
						i_80_ += anInt2483;
					}
				} else {
					i_79_ -= i;
					i -= i_80_;
					i_80_ = anIntArray2542[i_80_];
					for (;;) {
						if (--i < 0) {
							while (--i_79_ >= 0) {
								method847(anIntArray2481, i_80_, i_84_, 0, i_81_ >> 16, i_82_ >> 16);
								i_82_ += i_86_;
								i_81_ += i_85_;
								i_80_ += anInt2483;
							}
							break;
						}
						method847(anIntArray2481, i_80_, i_84_, 0, i_83_ >> 16, i_82_ >> 16);
						i_82_ += i_86_;
						i_83_ += i_87_;
						i_80_ += anInt2483;
					}
				}
			} else {
				i_81_ = i_83_ <<= 16;
				if (i_80_ < 0) {
					i_81_ -= i_86_ * i_80_;
					i_83_ -= i_87_ * i_80_;
					i_80_ = 0;
				}
				i_82_ <<= 16;
				if (i_79_ < 0) {
					i_82_ -= i_85_ * i_79_;
					i_79_ = 0;
				}
				if (i_86_ < i_87_) {
					i -= i_79_;
					i_79_ -= i_80_;
					i_80_ = anIntArray2542[i_80_];
					for (;;) {
						if (--i_79_ < 0) {
							while (--i >= 0) {
								method847(anIntArray2481, i_80_, i_84_, 0, i_82_ >> 16, i_83_ >> 16);
								i_82_ += i_85_;
								i_83_ += i_87_;
								i_80_ += anInt2483;
							}
							break;
						}
						method847(anIntArray2481, i_80_, i_84_, 0, i_81_ >> 16, i_83_ >> 16);
						i_81_ += i_86_;
						i_83_ += i_87_;
						i_80_ += anInt2483;
					}
				} else {
					i -= i_79_;
					i_79_ -= i_80_;
					i_80_ = anIntArray2542[i_80_];
					for (;;) {
						if (--i_79_ < 0) {
							while (--i >= 0) {
								method847(anIntArray2481, i_80_, i_84_, 0, i_83_ >> 16, i_82_ >> 16);
								i_82_ += i_85_;
								i_83_ += i_87_;
								i_80_ += anInt2483;
							}
							break;
						}
						method847(anIntArray2481, i_80_, i_84_, 0, i_83_ >> 16, i_81_ >> 16);
						i_81_ += i_86_;
						i_83_ += i_87_;
						i_80_ += anInt2483;
					}
				}
			}
		}
	}

	static final void method847(final int[] is, int i, int i_88_, int i_89_, int i_90_, int i_91_) {
		if (aBoolean2537) {
			if (i_91_ > anInt2535) {
				i_91_ = anInt2535;
			}
			if (i_90_ < 0) {
				i_90_ = 0;
			}
		}
		if (i_90_ < i_91_) {
			i += i_90_;
			i_89_ = i_91_ - i_90_ >> 2;
			if (anInt2527 == 0) {
				for (;;) {
					if (--i_89_ < 0) {
						i_89_ = i_91_ - i_90_ & 0x3;
						while (--i_89_ >= 0) {
							is[i++] = i_88_;
						}
						break;
					}
					is[i++] = i_88_;
					is[i++] = i_88_;
					is[i++] = i_88_;
					is[i++] = i_88_;
				}
			} else if (anInt2527 == 254) {
				for (;;) {
					if (--i_89_ < 0) {
						i_89_ = i_91_ - i_90_ & 0x3;
						while (--i_89_ >= 0) {
							is[i++] = is[i];
						}
						break;
					}
					is[i++] = is[i];
					is[i++] = is[i];
					is[i++] = is[i];
					is[i++] = is[i];
				}
			} else {
				final int i_92_ = anInt2527;
				final int i_93_ = 256 - anInt2527;
				i_88_ = ((i_88_ & 0xff00ff) * i_93_ >> 8 & 0xff00ff) + ((i_88_ & 0xff00) * i_93_ >> 8 & 0xff00);
				for (;;) {
					if (--i_89_ < 0) {
						i_89_ = i_91_ - i_90_ & 0x3;
						while (--i_89_ >= 0) {
							final int i_94_ = is[i];
							is[i++] = i_88_ + ((i_94_ & 0xff00ff) * i_92_ >> 8 & 0xff00ff) + ((i_94_ & 0xff00) * i_92_ >> 8 & 0xff00);
						}
						break;
					}
					int i_95_ = is[i];
					is[i++] = i_88_ + ((i_95_ & 0xff00ff) * i_92_ >> 8 & 0xff00ff) + ((i_95_ & 0xff00) * i_92_ >> 8 & 0xff00);
					i_95_ = is[i];
					is[i++] = i_88_ + ((i_95_ & 0xff00ff) * i_92_ >> 8 & 0xff00ff) + ((i_95_ & 0xff00) * i_92_ >> 8 & 0xff00);
					i_95_ = is[i];
					is[i++] = i_88_ + ((i_95_ & 0xff00ff) * i_92_ >> 8 & 0xff00ff) + ((i_95_ & 0xff00) * i_92_ >> 8 & 0xff00);
					i_95_ = is[i];
					is[i++] = i_88_ + ((i_95_ & 0xff00ff) * i_92_ >> 8 & 0xff00ff) + ((i_95_ & 0xff00) * i_92_ >> 8 & 0xff00);
				}
			}
		}
	}

	static final void method848(double d, final int i, final int i_96_) {
		d += Math.random() * 0.03 - 0.015;
		int i_97_ = i * 128;
		for (int i_98_ = i; i_98_ < i_96_; i_98_++) {
			final double d_99_ = (i_98_ >> 3) / 64.0 + 0.0078125;
			final double d_100_ = (i_98_ & 0x7) / 8.0 + 0.0625;
			for (int i_101_ = 0; i_101_ < 128; i_101_++) {
				final double d_102_ = i_101_ / 128.0;
				double d_103_ = d_102_;
				double d_104_ = d_102_;
				double d_105_ = d_102_;
				if (d_100_ != 0.0) {
					double d_106_;
					if (d_102_ < 0.5) {
						d_106_ = d_102_ * (1.0 + d_100_);
					} else {
						d_106_ = d_102_ + d_100_ - d_102_ * d_100_;
					}
					final double d_107_ = 2.0 * d_102_ - d_106_;
					double d_108_ = d_99_ + 0.3333333333333333;
					if (d_108_ > 1.0) {
						d_108_--;
					}
					double d_109_ = d_99_ - 0.3333333333333333;
					if (d_109_ < 0.0) {
						d_109_++;
					}
					if (6.0 * d_108_ < 1.0) {
						d_103_ = d_107_ + (d_106_ - d_107_) * 6.0 * d_108_;
					} else if (2.0 * d_108_ < 1.0) {
						d_103_ = d_106_;
					} else if (3.0 * d_108_ < 2.0) {
						d_103_ = d_107_ + (d_106_ - d_107_) * (0.6666666666666666 - d_108_) * 6.0;
					} else {
						d_103_ = d_107_;
					}
					if (6.0 * d_99_ < 1.0) {
						d_104_ = d_107_ + (d_106_ - d_107_) * 6.0 * d_99_;
					} else if (2.0 * d_99_ < 1.0) {
						d_104_ = d_106_;
					} else if (3.0 * d_99_ < 2.0) {
						d_104_ = d_107_ + (d_106_ - d_107_) * (0.6666666666666666 - d_99_) * 6.0;
					} else {
						d_104_ = d_107_;
					}
					if (6.0 * d_109_ < 1.0) {
						d_105_ = d_107_ + (d_106_ - d_107_) * 6.0 * d_109_;
					} else if (2.0 * d_109_ < 1.0) {
						d_105_ = d_106_;
					} else if (3.0 * d_109_ < 2.0) {
						d_105_ = d_107_ + (d_106_ - d_107_) * (0.6666666666666666 - d_109_) * 6.0;
					} else {
						d_105_ = d_107_;
					}
				}
				final int i_110_ = (int) (d_103_ * 256.0);
				final int i_111_ = (int) (d_104_ * 256.0);
				final int i_112_ = (int) (d_105_ * 256.0);
				int i_113_ = (i_110_ << 16) + (i_111_ << 8) + i_112_;
				i_113_ = method851(i_113_, d);
				if (i_113_ == 0) {
					i_113_ = 1;
				}
				anIntArray2543[i_97_++] = i_113_;
			}
		}
	}

	static final void method849(int i, int i_114_, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, final int i_122_, int i_123_, int i_124_, final int i_125_, int i_126_, int i_127_, final int i_128_, int i_129_, int i_130_, final int i_131_) {
		final int[] is = anInterface3_2539.method29(i_131_, -623999929);
		if (is == null) {
			final int i_132_ = anInterface3_2539.method28(i_131_, 613446362);
			method845(i, i_114_, i_115_, i_116_, i_117_, i_118_, method852(i_132_, i_119_), method852(i_132_, i_120_), method852(i_132_, i_121_));
		} else {
			aBoolean2525 = anInterface3_2539.method35(i_131_, 2079637047);
			aBoolean2524 = anInterface3_2539.method26(i_131_, 873494292);
			final int i_133_ = i_117_ - i_116_;
			final int i_134_ = i_114_ - i;
			final int i_135_ = i_118_ - i_116_;
			final int i_136_ = i_115_ - i;
			final int i_137_ = i_120_ - i_119_;
			final int i_138_ = i_121_ - i_119_;
			int i_139_ = 0;
			if (i_114_ != i) {
				i_139_ = (i_117_ - i_116_ << 16) / (i_114_ - i);
			}
			int i_140_ = 0;
			if (i_115_ != i_114_) {
				i_140_ = (i_118_ - i_117_ << 16) / (i_115_ - i_114_);
			}
			int i_141_ = 0;
			if (i_115_ != i) {
				i_141_ = (i_116_ - i_118_ << 16) / (i - i_115_);
			}
			final int i_142_ = i_133_ * i_136_ - i_135_ * i_134_;
			if (i_142_ != 0) {
				final int i_143_ = (i_137_ * i_136_ - i_138_ * i_134_ << 9) / i_142_;
				final int i_144_ = (i_138_ * i_133_ - i_137_ * i_135_ << 9) / i_142_;
				i_123_ = i_122_ - i_123_;
				i_126_ = i_125_ - i_126_;
				i_129_ = i_128_ - i_129_;
				i_124_ -= i_122_;
				i_127_ -= i_125_;
				i_130_ -= i_128_;
				int i_145_ = i_124_ * i_125_ - i_127_ * i_122_ << 14;
				final int i_146_ = i_127_ * i_128_ - i_130_ * i_125_ << 5;
				final int i_147_ = i_130_ * i_122_ - i_124_ * i_128_ << 5;
				int i_148_ = i_123_ * i_125_ - i_126_ * i_122_ << 14;
				final int i_149_ = i_126_ * i_128_ - i_129_ * i_125_ << 5;
				final int i_150_ = i_129_ * i_122_ - i_123_ * i_128_ << 5;
				int i_151_ = i_126_ * i_124_ - i_123_ * i_127_ << 14;
				final int i_152_ = i_129_ * i_127_ - i_126_ * i_130_ << 5;
				final int i_153_ = i_123_ * i_130_ - i_129_ * i_124_ << 5;
				if (i <= i_114_ && i <= i_115_) {
					if (i < anInt2536) {
						if (i_114_ > anInt2536) {
							i_114_ = anInt2536;
						}
						if (i_115_ > anInt2536) {
							i_115_ = anInt2536;
						}
						i_119_ = (i_119_ << 9) - i_143_ * i_116_ + i_143_;
						if (i_114_ < i_115_) {
							i_118_ = i_116_ <<= 16;
							if (i < 0) {
								i_118_ -= i_141_ * i;
								i_116_ -= i_139_ * i;
								i_119_ -= i_144_ * i;
								i = 0;
							}
							i_117_ <<= 16;
							if (i_114_ < 0) {
								i_117_ -= i_140_ * i_114_;
								i_114_ = 0;
							}
							final int var41 = i - anInt2534;
							i_145_ += i_147_ * var41;
							i_148_ += i_150_ * var41;
							i_151_ += i_153_ * var41;
							if ((i == i_114_ || i_141_ >= i_139_) && (i != i_114_ || i_141_ <= i_140_)) {
								i_115_ -= i_114_;
								i_114_ -= i;
								i = anIntArray2542[i];
								for (;;) {
									if (--i_114_ < 0) {
										while (--i_115_ >= 0) {
											method842(anIntArray2481, is, 0, 0, i, i_117_ >> 16, i_118_ >> 16, i_119_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
											i_118_ += i_141_;
											i_117_ += i_140_;
											i_119_ += i_144_;
											i += anInt2483;
											i_145_ += i_147_;
											i_148_ += i_150_;
											i_151_ += i_153_;
										}
										break;
									}
									method842(anIntArray2481, is, 0, 0, i, i_116_ >> 16, i_118_ >> 16, i_119_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
									i_118_ += i_141_;
									i_116_ += i_139_;
									i_119_ += i_144_;
									i += anInt2483;
									i_145_ += i_147_;
									i_148_ += i_150_;
									i_151_ += i_153_;
								}
							} else {
								i_115_ -= i_114_;
								i_114_ -= i;
								i = anIntArray2542[i];
								for (;;) {
									if (--i_114_ < 0) {
										while (--i_115_ >= 0) {
											method842(anIntArray2481, is, 0, 0, i, i_118_ >> 16, i_117_ >> 16, i_119_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
											i_118_ += i_141_;
											i_117_ += i_140_;
											i_119_ += i_144_;
											i += anInt2483;
											i_145_ += i_147_;
											i_148_ += i_150_;
											i_151_ += i_153_;
										}
										break;
									}
									method842(anIntArray2481, is, 0, 0, i, i_118_ >> 16, i_116_ >> 16, i_119_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
									i_118_ += i_141_;
									i_116_ += i_139_;
									i_119_ += i_144_;
									i += anInt2483;
									i_145_ += i_147_;
									i_148_ += i_150_;
									i_151_ += i_153_;
								}
							}
						} else {
							i_117_ = i_116_ <<= 16;
							if (i < 0) {
								i_117_ -= i_141_ * i;
								i_116_ -= i_139_ * i;
								i_119_ -= i_144_ * i;
								i = 0;
							}
							i_118_ <<= 16;
							if (i_115_ < 0) {
								i_118_ -= i_140_ * i_115_;
								i_115_ = 0;
							}
							final int var41 = i - anInt2534;
							i_145_ += i_147_ * var41;
							i_148_ += i_150_ * var41;
							i_151_ += i_153_ * var41;
							if ((i == i_115_ || i_141_ >= i_139_) && (i != i_115_ || i_140_ <= i_139_)) {
								i_114_ -= i_115_;
								i_115_ -= i;
								i = anIntArray2542[i];
								for (;;) {
									if (--i_115_ < 0) {
										while (--i_114_ >= 0) {
											method842(anIntArray2481, is, 0, 0, i, i_116_ >> 16, i_118_ >> 16, i_119_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
											i_118_ += i_140_;
											i_116_ += i_139_;
											i_119_ += i_144_;
											i += anInt2483;
											i_145_ += i_147_;
											i_148_ += i_150_;
											i_151_ += i_153_;
										}
										break;
									}
									method842(anIntArray2481, is, 0, 0, i, i_116_ >> 16, i_117_ >> 16, i_119_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
									i_117_ += i_141_;
									i_116_ += i_139_;
									i_119_ += i_144_;
									i += anInt2483;
									i_145_ += i_147_;
									i_148_ += i_150_;
									i_151_ += i_153_;
								}
							} else {
								i_114_ -= i_115_;
								i_115_ -= i;
								i = anIntArray2542[i];
								for (;;) {
									if (--i_115_ < 0) {
										while (--i_114_ >= 0) {
											method842(anIntArray2481, is, 0, 0, i, i_118_ >> 16, i_116_ >> 16, i_119_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
											i_118_ += i_140_;
											i_116_ += i_139_;
											i_119_ += i_144_;
											i += anInt2483;
											i_145_ += i_147_;
											i_148_ += i_150_;
											i_151_ += i_153_;
										}
										break;
									}
									method842(anIntArray2481, is, 0, 0, i, i_117_ >> 16, i_116_ >> 16, i_119_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
									i_117_ += i_141_;
									i_116_ += i_139_;
									i_119_ += i_144_;
									i += anInt2483;
									i_145_ += i_147_;
									i_148_ += i_150_;
									i_151_ += i_153_;
								}
							}
						}
					}
				} else if (i_114_ <= i_115_) {
					if (i_114_ < anInt2536) {
						if (i_115_ > anInt2536) {
							i_115_ = anInt2536;
						}
						if (i > anInt2536) {
							i = anInt2536;
						}
						i_120_ = (i_120_ << 9) - i_143_ * i_117_ + i_143_;
						if (i_115_ < i) {
							i_116_ = i_117_ <<= 16;
							if (i_114_ < 0) {
								i_116_ -= i_139_ * i_114_;
								i_117_ -= i_140_ * i_114_;
								i_120_ -= i_144_ * i_114_;
								i_114_ = 0;
							}
							i_118_ <<= 16;
							if (i_115_ < 0) {
								i_118_ -= i_141_ * i_115_;
								i_115_ = 0;
							}
							final int var41 = i_114_ - anInt2534;
							i_145_ += i_147_ * var41;
							i_148_ += i_150_ * var41;
							i_151_ += i_153_ * var41;
							if ((i_114_ == i_115_ || i_139_ >= i_140_) && (i_114_ != i_115_ || i_139_ <= i_141_)) {
								i -= i_115_;
								i_115_ -= i_114_;
								i_114_ = anIntArray2542[i_114_];
								for (;;) {
									if (--i_115_ < 0) {
										while (--i >= 0) {
											method842(anIntArray2481, is, 0, 0, i_114_, i_118_ >> 16, i_116_ >> 16, i_120_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
											i_116_ += i_139_;
											i_118_ += i_141_;
											i_120_ += i_144_;
											i_114_ += anInt2483;
											i_145_ += i_147_;
											i_148_ += i_150_;
											i_151_ += i_153_;
										}
										break;
									}
									method842(anIntArray2481, is, 0, 0, i_114_, i_117_ >> 16, i_116_ >> 16, i_120_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
									i_116_ += i_139_;
									i_117_ += i_140_;
									i_120_ += i_144_;
									i_114_ += anInt2483;
									i_145_ += i_147_;
									i_148_ += i_150_;
									i_151_ += i_153_;
								}
							} else {
								i -= i_115_;
								i_115_ -= i_114_;
								i_114_ = anIntArray2542[i_114_];
								for (;;) {
									if (--i_115_ < 0) {
										while (--i >= 0) {
											method842(anIntArray2481, is, 0, 0, i_114_, i_116_ >> 16, i_118_ >> 16, i_120_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
											i_116_ += i_139_;
											i_118_ += i_141_;
											i_120_ += i_144_;
											i_114_ += anInt2483;
											i_145_ += i_147_;
											i_148_ += i_150_;
											i_151_ += i_153_;
										}
										break;
									}
									method842(anIntArray2481, is, 0, 0, i_114_, i_116_ >> 16, i_117_ >> 16, i_120_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
									i_116_ += i_139_;
									i_117_ += i_140_;
									i_120_ += i_144_;
									i_114_ += anInt2483;
									i_145_ += i_147_;
									i_148_ += i_150_;
									i_151_ += i_153_;
								}
							}
						} else {
							i_118_ = i_117_ <<= 16;
							if (i_114_ < 0) {
								i_118_ -= i_139_ * i_114_;
								i_117_ -= i_140_ * i_114_;
								i_120_ -= i_144_ * i_114_;
								i_114_ = 0;
							}
							i_116_ <<= 16;
							if (i < 0) {
								i_116_ -= i_141_ * i;
								i = 0;
							}
							final int var41 = i_114_ - anInt2534;
							i_145_ += i_147_ * var41;
							i_148_ += i_150_ * var41;
							i_151_ += i_153_ * var41;
							if (i_139_ < i_140_) {
								i_115_ -= i;
								i -= i_114_;
								i_114_ = anIntArray2542[i_114_];
								for (;;) {
									if (--i < 0) {
										while (--i_115_ >= 0) {
											method842(anIntArray2481, is, 0, 0, i_114_, i_116_ >> 16, i_117_ >> 16, i_120_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
											i_116_ += i_141_;
											i_117_ += i_140_;
											i_120_ += i_144_;
											i_114_ += anInt2483;
											i_145_ += i_147_;
											i_148_ += i_150_;
											i_151_ += i_153_;
										}
										break;
									}
									method842(anIntArray2481, is, 0, 0, i_114_, i_118_ >> 16, i_117_ >> 16, i_120_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
									i_118_ += i_139_;
									i_117_ += i_140_;
									i_120_ += i_144_;
									i_114_ += anInt2483;
									i_145_ += i_147_;
									i_148_ += i_150_;
									i_151_ += i_153_;
								}
							} else {
								i_115_ -= i;
								i -= i_114_;
								i_114_ = anIntArray2542[i_114_];
								for (;;) {
									if (--i < 0) {
										while (--i_115_ >= 0) {
											method842(anIntArray2481, is, 0, 0, i_114_, i_117_ >> 16, i_116_ >> 16, i_120_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
											i_116_ += i_141_;
											i_117_ += i_140_;
											i_120_ += i_144_;
											i_114_ += anInt2483;
											i_145_ += i_147_;
											i_148_ += i_150_;
											i_151_ += i_153_;
										}
										break;
									}
									method842(anIntArray2481, is, 0, 0, i_114_, i_117_ >> 16, i_118_ >> 16, i_120_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
									i_118_ += i_139_;
									i_117_ += i_140_;
									i_120_ += i_144_;
									i_114_ += anInt2483;
									i_145_ += i_147_;
									i_148_ += i_150_;
									i_151_ += i_153_;
								}
							}
						}
					}
				} else if (i_115_ < anInt2536) {
					if (i > anInt2536) {
						i = anInt2536;
					}
					if (i_114_ > anInt2536) {
						i_114_ = anInt2536;
					}
					i_121_ = (i_121_ << 9) - i_143_ * i_118_ + i_143_;
					if (i < i_114_) {
						i_117_ = i_118_ <<= 16;
						if (i_115_ < 0) {
							i_117_ -= i_140_ * i_115_;
							i_118_ -= i_141_ * i_115_;
							i_121_ -= i_144_ * i_115_;
							i_115_ = 0;
						}
						i_116_ <<= 16;
						if (i < 0) {
							i_116_ -= i_139_ * i;
							i = 0;
						}
						final int var41 = i_115_ - anInt2534;
						i_145_ += i_147_ * var41;
						i_148_ += i_150_ * var41;
						i_151_ += i_153_ * var41;
						if (i_140_ < i_141_) {
							i_114_ -= i;
							i -= i_115_;
							i_115_ = anIntArray2542[i_115_];
							for (;;) {
								if (--i < 0) {
									while (--i_114_ >= 0) {
										method842(anIntArray2481, is, 0, 0, i_115_, i_117_ >> 16, i_116_ >> 16, i_121_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
										i_117_ += i_140_;
										i_116_ += i_139_;
										i_121_ += i_144_;
										i_115_ += anInt2483;
										i_145_ += i_147_;
										i_148_ += i_150_;
										i_151_ += i_153_;
									}
									break;
								}
								method842(anIntArray2481, is, 0, 0, i_115_, i_117_ >> 16, i_118_ >> 16, i_121_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
								i_117_ += i_140_;
								i_118_ += i_141_;
								i_121_ += i_144_;
								i_115_ += anInt2483;
								i_145_ += i_147_;
								i_148_ += i_150_;
								i_151_ += i_153_;
							}
						} else {
							i_114_ -= i;
							i -= i_115_;
							i_115_ = anIntArray2542[i_115_];
							for (;;) {
								if (--i < 0) {
									while (--i_114_ >= 0) {
										method842(anIntArray2481, is, 0, 0, i_115_, i_116_ >> 16, i_117_ >> 16, i_121_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
										i_117_ += i_140_;
										i_116_ += i_139_;
										i_121_ += i_144_;
										i_115_ += anInt2483;
										i_145_ += i_147_;
										i_148_ += i_150_;
										i_151_ += i_153_;
									}
									break;
								}
								method842(anIntArray2481, is, 0, 0, i_115_, i_118_ >> 16, i_117_ >> 16, i_121_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
								i_117_ += i_140_;
								i_118_ += i_141_;
								i_121_ += i_144_;
								i_115_ += anInt2483;
								i_145_ += i_147_;
								i_148_ += i_150_;
								i_151_ += i_153_;
							}
						}
					} else {
						i_116_ = i_118_ <<= 16;
						if (i_115_ < 0) {
							i_116_ -= i_140_ * i_115_;
							i_118_ -= i_141_ * i_115_;
							i_121_ -= i_144_ * i_115_;
							i_115_ = 0;
						}
						i_117_ <<= 16;
						if (i_114_ < 0) {
							i_117_ -= i_139_ * i_114_;
							i_114_ = 0;
						}
						final int var41 = i_115_ - anInt2534;
						i_145_ += i_147_ * var41;
						i_148_ += i_150_ * var41;
						i_151_ += i_153_ * var41;
						if (i_140_ < i_141_) {
							i -= i_114_;
							i_114_ -= i_115_;
							i_115_ = anIntArray2542[i_115_];
							for (;;) {
								if (--i_114_ < 0) {
									while (--i >= 0) {
										method842(anIntArray2481, is, 0, 0, i_115_, i_117_ >> 16, i_118_ >> 16, i_121_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
										i_117_ += i_139_;
										i_118_ += i_141_;
										i_121_ += i_144_;
										i_115_ += anInt2483;
										i_145_ += i_147_;
										i_148_ += i_150_;
										i_151_ += i_153_;
									}
									break;
								}
								method842(anIntArray2481, is, 0, 0, i_115_, i_116_ >> 16, i_118_ >> 16, i_121_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
								i_116_ += i_140_;
								i_118_ += i_141_;
								i_121_ += i_144_;
								i_115_ += anInt2483;
								i_145_ += i_147_;
								i_148_ += i_150_;
								i_151_ += i_153_;
							}
						} else {
							i -= i_114_;
							i_114_ -= i_115_;
							i_115_ = anIntArray2542[i_115_];
							for (;;) {
								if (--i_114_ < 0) {
									while (--i >= 0) {
										method842(anIntArray2481, is, 0, 0, i_115_, i_118_ >> 16, i_117_ >> 16, i_121_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
										i_117_ += i_139_;
										i_118_ += i_141_;
										i_121_ += i_144_;
										i_115_ += anInt2483;
										i_145_ += i_147_;
										i_148_ += i_150_;
										i_151_ += i_153_;
									}
									break;
								}
								method842(anIntArray2481, is, 0, 0, i_115_, i_118_ >> 16, i_116_ >> 16, i_121_, i_143_, i_145_, i_148_, i_151_, i_146_, i_149_, i_152_);
								i_116_ += i_140_;
								i_118_ += i_141_;
								i_121_ += i_144_;
								i_115_ += anInt2483;
								i_145_ += i_147_;
								i_148_ += i_150_;
								i_151_ += i_153_;
							}
						}
					}
				}
			}
		}
	}

	public static final void method850() {
		anInt2528 = anInt2535 / 2;
		anInt2534 = anInt2536 / 2;
		anInt2532 = -anInt2528;
		anInt2538 = anInt2535 - anInt2528;
		anInt2523 = -anInt2534;
		anInt2540 = anInt2536 - anInt2534;
	}

	Class91_Sub20_Sub13_Sub2() throws Throwable {
		throw new Error();
	}

	static int method851(final int i, final double d) {
		double d_154_ = (i >> 16) / 256.0;
		double d_155_ = (i >> 8 & 0xff) / 256.0;
		double d_156_ = (i & 0xff) / 256.0;
		d_154_ = Math.pow(d_154_, d);
		d_155_ = Math.pow(d_155_, d);
		d_156_ = Math.pow(d_156_, d);
		final int i_157_ = (int) (d_154_ * 256.0);
		final int i_158_ = (int) (d_155_ * 256.0);
		final int i_159_ = (int) (d_156_ * 256.0);
		return (i_157_ << 16) + (i_158_ << 8) + i_159_;
	}

	static final int method852(final int i, int i_160_) {
		i_160_ = i_160_ * (i & 0x7f) >> 7;
		if (i_160_ < 2) {
			i_160_ = 2;
		} else if (i_160_ > 126) {
			i_160_ = 126;
		}
		return (i & 0xff80) + i_160_;
	}

	public static final void method853(final Interface3 interface3) {
		anInterface3_2539 = interface3;
	}

	public static void method854(final int i, final int i_161_, final int i_162_) {
		aBoolean2537 = i < 0 || i > anInt2535 || i_161_ < 0 || i_161_ > anInt2535 || i_162_ < 0 || i_162_ > anInt2535;
	}

	public static final void method855() {
		method858(anInt2485, anInt2484, anInt2486, anInt2480);
	}

	static final void method856(final int[] is, int i, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_) {
		if (aBoolean2537) {
			if (i_166_ > anInt2535) {
				i_166_ = anInt2535;
			}
			if (i_165_ < 0) {
				i_165_ = 0;
			}
		}
		if (i_165_ < i_166_) {
			i += i_165_;
			i_167_ += i_168_ * i_165_;
			if (aBoolean2526) {
				i_164_ = i_166_ - i_165_ >> 2;
				i_168_ <<= 2;
				if (anInt2527 == 0) {
					if (i_164_ > 0) {
						do {
							i_163_ = anIntArray2543[i_167_ >> 8];
							i_167_ += i_168_;
							is[i++] = i_163_;
							is[i++] = i_163_;
							is[i++] = i_163_;
							is[i++] = i_163_;
						} while (--i_164_ > 0);
					}
					i_164_ = i_166_ - i_165_ & 0x3;
					if (i_164_ > 0) {
						i_163_ = anIntArray2543[i_167_ >> 8];
						do {
							is[i++] = i_163_;
						} while (--i_164_ > 0);
					}
				} else {
					final int i_169_ = anInt2527;
					final int i_170_ = 256 - anInt2527;
					if (i_164_ > 0) {
						do {
							i_163_ = anIntArray2543[i_167_ >> 8];
							i_167_ += i_168_;
							i_163_ = ((i_163_ & 0xff00ff) * i_170_ >> 8 & 0xff00ff) + ((i_163_ & 0xff00) * i_170_ >> 8 & 0xff00);
							int var10 = is[i];
							is[i++] = i_163_ + ((var10 & 0xff00ff) * i_169_ >> 8 & 0xff00ff) + ((var10 & 0xff00) * i_169_ >> 8 & 0xff00);
							var10 = is[i];
							is[i++] = i_163_ + ((var10 & 0xff00ff) * i_169_ >> 8 & 0xff00ff) + ((var10 & 0xff00) * i_169_ >> 8 & 0xff00);
							var10 = is[i];
							is[i++] = i_163_ + ((var10 & 0xff00ff) * i_169_ >> 8 & 0xff00ff) + ((var10 & 0xff00) * i_169_ >> 8 & 0xff00);
							var10 = is[i];
							is[i++] = i_163_ + ((var10 & 0xff00ff) * i_169_ >> 8 & 0xff00ff) + ((var10 & 0xff00) * i_169_ >> 8 & 0xff00);
						} while (--i_164_ > 0);
					}
					i_164_ = i_166_ - i_165_ & 0x3;
					if (i_164_ > 0) {
						i_163_ = anIntArray2543[i_167_ >> 8];
						i_163_ = ((i_163_ & 0xff00ff) * i_170_ >> 8 & 0xff00ff) + ((i_163_ & 0xff00) * i_170_ >> 8 & 0xff00);
						do {
							final int var10 = is[i];
							is[i++] = i_163_ + ((var10 & 0xff00ff) * i_169_ >> 8 & 0xff00ff) + ((var10 & 0xff00) * i_169_ >> 8 & 0xff00);
						} while (--i_164_ > 0);
					}
				}
			} else {
				i_164_ = i_166_ - i_165_;
				if (anInt2527 == 0) {
					do {
						is[i++] = anIntArray2543[i_167_ >> 8];
						i_167_ += i_168_;
					} while (--i_164_ > 0);
				} else {
					final int i_171_ = anInt2527;
					final int i_172_ = 256 - anInt2527;
					do {
						i_163_ = anIntArray2543[i_167_ >> 8];
						i_167_ += i_168_;
						i_163_ = ((i_163_ & 0xff00ff) * i_172_ >> 8 & 0xff00ff) + ((i_163_ & 0xff00) * i_172_ >> 8 & 0xff00);
						final int var10 = is[i];
						is[i++] = i_163_ + ((var10 & 0xff00ff) * i_171_ >> 8 & 0xff00ff) + ((var10 & 0xff00) * i_171_ >> 8 & 0xff00);
					} while (--i_164_ > 0);
				}
			}
		}
	}

	static final void method857(int i, int i_173_, int i_174_, int i_175_, int i_176_, int i_177_, int i_178_, int i_179_, int i_180_, final int i_181_, int i_182_, int i_183_, final int i_184_, int i_185_, int i_186_, final int i_187_, int i_188_, int i_189_, final int i_190_) {
		final int[] is = anInterface3_2539.method29(i_190_, 1876640409);
		if (is == null) {
			final int i_191_ = anInterface3_2539.method28(i_190_, 1907776762);
			method845(i, i_173_, i_174_, i_175_, i_176_, i_177_, method852(i_191_, i_178_), method852(i_191_, i_179_), method852(i_191_, i_180_));
		} else {
			aBoolean2525 = anInterface3_2539.method35(i_190_, 1947537485);
			aBoolean2524 = anInterface3_2539.method26(i_190_, 1797068724);
			final int i_192_ = i_176_ - i_175_;
			final int i_193_ = i_173_ - i;
			final int i_194_ = i_177_ - i_175_;
			final int i_195_ = i_174_ - i;
			final int i_196_ = i_179_ - i_178_;
			final int i_197_ = i_180_ - i_178_;
			int i_198_ = 0;
			if (i_173_ != i) {
				i_198_ = (i_176_ - i_175_ << 16) / (i_173_ - i);
			}
			int i_199_ = 0;
			if (i_174_ != i_173_) {
				i_199_ = (i_177_ - i_176_ << 16) / (i_174_ - i_173_);
			}
			int i_200_ = 0;
			if (i_174_ != i) {
				i_200_ = (i_175_ - i_177_ << 16) / (i - i_174_);
			}
			final int i_201_ = i_192_ * i_195_ - i_194_ * i_193_;
			if (i_201_ != 0) {
				final int i_202_ = (i_196_ * i_195_ - i_197_ * i_193_ << 9) / i_201_;
				final int i_203_ = (i_197_ * i_192_ - i_196_ * i_194_ << 9) / i_201_;
				i_182_ = i_181_ - i_182_;
				i_185_ = i_184_ - i_185_;
				i_188_ = i_187_ - i_188_;
				i_183_ -= i_181_;
				i_186_ -= i_184_;
				i_189_ -= i_187_;
				int i_204_ = i_183_ * i_184_ - i_186_ * i_181_ << 14;
				final int i_205_ = i_186_ * i_187_ - i_189_ * i_184_ << 8;
				final int i_206_ = i_189_ * i_181_ - i_183_ * i_187_ << 5;
				int i_207_ = i_182_ * i_184_ - i_185_ * i_181_ << 14;
				final int i_208_ = i_185_ * i_187_ - i_188_ * i_184_ << 8;
				final int i_209_ = i_188_ * i_181_ - i_182_ * i_187_ << 5;
				int i_210_ = i_185_ * i_183_ - i_182_ * i_186_ << 14;
				final int i_211_ = i_188_ * i_186_ - i_185_ * i_189_ << 8;
				final int i_212_ = i_182_ * i_189_ - i_188_ * i_183_ << 5;
				if (i <= i_173_ && i <= i_174_) {
					if (i < anInt2536) {
						if (i_173_ > anInt2536) {
							i_173_ = anInt2536;
						}
						if (i_174_ > anInt2536) {
							i_174_ = anInt2536;
						}
						i_178_ = (i_178_ << 9) - i_202_ * i_175_ + i_202_;
						if (i_173_ < i_174_) {
							i_177_ = i_175_ <<= 16;
							if (i < 0) {
								i_177_ -= i_200_ * i;
								i_175_ -= i_198_ * i;
								i_178_ -= i_203_ * i;
								i = 0;
							}
							i_176_ <<= 16;
							if (i_173_ < 0) {
								i_176_ -= i_199_ * i_173_;
								i_173_ = 0;
							}
							final int var41 = i - anInt2534;
							i_204_ += i_206_ * var41;
							i_207_ += i_209_ * var41;
							i_210_ += i_212_ * var41;
							if ((i == i_173_ || i_200_ >= i_198_) && (i != i_173_ || i_200_ <= i_199_)) {
								i_174_ -= i_173_;
								i_173_ -= i;
								i = anIntArray2542[i];
								for (;;) {
									if (--i_173_ < 0) {
										while (--i_174_ >= 0) {
											method844(anIntArray2481, is, 0, 0, i, i_176_ >> 16, i_177_ >> 16, i_178_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
											i_177_ += i_200_;
											i_176_ += i_199_;
											i_178_ += i_203_;
											i += anInt2483;
											i_204_ += i_206_;
											i_207_ += i_209_;
											i_210_ += i_212_;
										}
										break;
									}
									method844(anIntArray2481, is, 0, 0, i, i_175_ >> 16, i_177_ >> 16, i_178_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
									i_177_ += i_200_;
									i_175_ += i_198_;
									i_178_ += i_203_;
									i += anInt2483;
									i_204_ += i_206_;
									i_207_ += i_209_;
									i_210_ += i_212_;
								}
							} else {
								i_174_ -= i_173_;
								i_173_ -= i;
								i = anIntArray2542[i];
								for (;;) {
									if (--i_173_ < 0) {
										while (--i_174_ >= 0) {
											method844(anIntArray2481, is, 0, 0, i, i_177_ >> 16, i_176_ >> 16, i_178_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
											i_177_ += i_200_;
											i_176_ += i_199_;
											i_178_ += i_203_;
											i += anInt2483;
											i_204_ += i_206_;
											i_207_ += i_209_;
											i_210_ += i_212_;
										}
										break;
									}
									method844(anIntArray2481, is, 0, 0, i, i_177_ >> 16, i_175_ >> 16, i_178_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
									i_177_ += i_200_;
									i_175_ += i_198_;
									i_178_ += i_203_;
									i += anInt2483;
									i_204_ += i_206_;
									i_207_ += i_209_;
									i_210_ += i_212_;
								}
							}
						} else {
							i_176_ = i_175_ <<= 16;
							if (i < 0) {
								i_176_ -= i_200_ * i;
								i_175_ -= i_198_ * i;
								i_178_ -= i_203_ * i;
								i = 0;
							}
							i_177_ <<= 16;
							if (i_174_ < 0) {
								i_177_ -= i_199_ * i_174_;
								i_174_ = 0;
							}
							final int var41 = i - anInt2534;
							i_204_ += i_206_ * var41;
							i_207_ += i_209_ * var41;
							i_210_ += i_212_ * var41;
							if ((i == i_174_ || i_200_ >= i_198_) && (i != i_174_ || i_199_ <= i_198_)) {
								i_173_ -= i_174_;
								i_174_ -= i;
								i = anIntArray2542[i];
								for (;;) {
									if (--i_174_ < 0) {
										while (--i_173_ >= 0) {
											method844(anIntArray2481, is, 0, 0, i, i_175_ >> 16, i_177_ >> 16, i_178_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
											i_177_ += i_199_;
											i_175_ += i_198_;
											i_178_ += i_203_;
											i += anInt2483;
											i_204_ += i_206_;
											i_207_ += i_209_;
											i_210_ += i_212_;
										}
										break;
									}
									method844(anIntArray2481, is, 0, 0, i, i_175_ >> 16, i_176_ >> 16, i_178_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
									i_176_ += i_200_;
									i_175_ += i_198_;
									i_178_ += i_203_;
									i += anInt2483;
									i_204_ += i_206_;
									i_207_ += i_209_;
									i_210_ += i_212_;
								}
							} else {
								i_173_ -= i_174_;
								i_174_ -= i;
								i = anIntArray2542[i];
								for (;;) {
									if (--i_174_ < 0) {
										while (--i_173_ >= 0) {
											method844(anIntArray2481, is, 0, 0, i, i_177_ >> 16, i_175_ >> 16, i_178_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
											i_177_ += i_199_;
											i_175_ += i_198_;
											i_178_ += i_203_;
											i += anInt2483;
											i_204_ += i_206_;
											i_207_ += i_209_;
											i_210_ += i_212_;
										}
										break;
									}
									method844(anIntArray2481, is, 0, 0, i, i_176_ >> 16, i_175_ >> 16, i_178_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
									i_176_ += i_200_;
									i_175_ += i_198_;
									i_178_ += i_203_;
									i += anInt2483;
									i_204_ += i_206_;
									i_207_ += i_209_;
									i_210_ += i_212_;
								}
							}
						}
					}
				} else if (i_173_ <= i_174_) {
					if (i_173_ < anInt2536) {
						if (i_174_ > anInt2536) {
							i_174_ = anInt2536;
						}
						if (i > anInt2536) {
							i = anInt2536;
						}
						i_179_ = (i_179_ << 9) - i_202_ * i_176_ + i_202_;
						if (i_174_ < i) {
							i_175_ = i_176_ <<= 16;
							if (i_173_ < 0) {
								i_175_ -= i_198_ * i_173_;
								i_176_ -= i_199_ * i_173_;
								i_179_ -= i_203_ * i_173_;
								i_173_ = 0;
							}
							i_177_ <<= 16;
							if (i_174_ < 0) {
								i_177_ -= i_200_ * i_174_;
								i_174_ = 0;
							}
							final int var41 = i_173_ - anInt2534;
							i_204_ += i_206_ * var41;
							i_207_ += i_209_ * var41;
							i_210_ += i_212_ * var41;
							if ((i_173_ == i_174_ || i_198_ >= i_199_) && (i_173_ != i_174_ || i_198_ <= i_200_)) {
								i -= i_174_;
								i_174_ -= i_173_;
								i_173_ = anIntArray2542[i_173_];
								for (;;) {
									if (--i_174_ < 0) {
										while (--i >= 0) {
											method844(anIntArray2481, is, 0, 0, i_173_, i_177_ >> 16, i_175_ >> 16, i_179_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
											i_175_ += i_198_;
											i_177_ += i_200_;
											i_179_ += i_203_;
											i_173_ += anInt2483;
											i_204_ += i_206_;
											i_207_ += i_209_;
											i_210_ += i_212_;
										}
										break;
									}
									method844(anIntArray2481, is, 0, 0, i_173_, i_176_ >> 16, i_175_ >> 16, i_179_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
									i_175_ += i_198_;
									i_176_ += i_199_;
									i_179_ += i_203_;
									i_173_ += anInt2483;
									i_204_ += i_206_;
									i_207_ += i_209_;
									i_210_ += i_212_;
								}
							} else {
								i -= i_174_;
								i_174_ -= i_173_;
								i_173_ = anIntArray2542[i_173_];
								for (;;) {
									if (--i_174_ < 0) {
										while (--i >= 0) {
											method844(anIntArray2481, is, 0, 0, i_173_, i_175_ >> 16, i_177_ >> 16, i_179_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
											i_175_ += i_198_;
											i_177_ += i_200_;
											i_179_ += i_203_;
											i_173_ += anInt2483;
											i_204_ += i_206_;
											i_207_ += i_209_;
											i_210_ += i_212_;
										}
										break;
									}
									method844(anIntArray2481, is, 0, 0, i_173_, i_175_ >> 16, i_176_ >> 16, i_179_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
									i_175_ += i_198_;
									i_176_ += i_199_;
									i_179_ += i_203_;
									i_173_ += anInt2483;
									i_204_ += i_206_;
									i_207_ += i_209_;
									i_210_ += i_212_;
								}
							}
						} else {
							i_177_ = i_176_ <<= 16;
							if (i_173_ < 0) {
								i_177_ -= i_198_ * i_173_;
								i_176_ -= i_199_ * i_173_;
								i_179_ -= i_203_ * i_173_;
								i_173_ = 0;
							}
							i_175_ <<= 16;
							if (i < 0) {
								i_175_ -= i_200_ * i;
								i = 0;
							}
							final int var41 = i_173_ - anInt2534;
							i_204_ += i_206_ * var41;
							i_207_ += i_209_ * var41;
							i_210_ += i_212_ * var41;
							if (i_198_ < i_199_) {
								i_174_ -= i;
								i -= i_173_;
								i_173_ = anIntArray2542[i_173_];
								for (;;) {
									if (--i < 0) {
										while (--i_174_ >= 0) {
											method844(anIntArray2481, is, 0, 0, i_173_, i_175_ >> 16, i_176_ >> 16, i_179_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
											i_175_ += i_200_;
											i_176_ += i_199_;
											i_179_ += i_203_;
											i_173_ += anInt2483;
											i_204_ += i_206_;
											i_207_ += i_209_;
											i_210_ += i_212_;
										}
										break;
									}
									method844(anIntArray2481, is, 0, 0, i_173_, i_177_ >> 16, i_176_ >> 16, i_179_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
									i_177_ += i_198_;
									i_176_ += i_199_;
									i_179_ += i_203_;
									i_173_ += anInt2483;
									i_204_ += i_206_;
									i_207_ += i_209_;
									i_210_ += i_212_;
								}
							} else {
								i_174_ -= i;
								i -= i_173_;
								i_173_ = anIntArray2542[i_173_];
								for (;;) {
									if (--i < 0) {
										while (--i_174_ >= 0) {
											method844(anIntArray2481, is, 0, 0, i_173_, i_176_ >> 16, i_175_ >> 16, i_179_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
											i_175_ += i_200_;
											i_176_ += i_199_;
											i_179_ += i_203_;
											i_173_ += anInt2483;
											i_204_ += i_206_;
											i_207_ += i_209_;
											i_210_ += i_212_;
										}
										break;
									}
									method844(anIntArray2481, is, 0, 0, i_173_, i_176_ >> 16, i_177_ >> 16, i_179_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
									i_177_ += i_198_;
									i_176_ += i_199_;
									i_179_ += i_203_;
									i_173_ += anInt2483;
									i_204_ += i_206_;
									i_207_ += i_209_;
									i_210_ += i_212_;
								}
							}
						}
					}
				} else if (i_174_ < anInt2536) {
					if (i > anInt2536) {
						i = anInt2536;
					}
					if (i_173_ > anInt2536) {
						i_173_ = anInt2536;
					}
					i_180_ = (i_180_ << 9) - i_202_ * i_177_ + i_202_;
					if (i < i_173_) {
						i_176_ = i_177_ <<= 16;
						if (i_174_ < 0) {
							i_176_ -= i_199_ * i_174_;
							i_177_ -= i_200_ * i_174_;
							i_180_ -= i_203_ * i_174_;
							i_174_ = 0;
						}
						i_175_ <<= 16;
						if (i < 0) {
							i_175_ -= i_198_ * i;
							i = 0;
						}
						final int var41 = i_174_ - anInt2534;
						i_204_ += i_206_ * var41;
						i_207_ += i_209_ * var41;
						i_210_ += i_212_ * var41;
						if (i_199_ < i_200_) {
							i_173_ -= i;
							i -= i_174_;
							i_174_ = anIntArray2542[i_174_];
							for (;;) {
								if (--i < 0) {
									while (--i_173_ >= 0) {
										method844(anIntArray2481, is, 0, 0, i_174_, i_176_ >> 16, i_175_ >> 16, i_180_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
										i_176_ += i_199_;
										i_175_ += i_198_;
										i_180_ += i_203_;
										i_174_ += anInt2483;
										i_204_ += i_206_;
										i_207_ += i_209_;
										i_210_ += i_212_;
									}
									break;
								}
								method844(anIntArray2481, is, 0, 0, i_174_, i_176_ >> 16, i_177_ >> 16, i_180_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
								i_176_ += i_199_;
								i_177_ += i_200_;
								i_180_ += i_203_;
								i_174_ += anInt2483;
								i_204_ += i_206_;
								i_207_ += i_209_;
								i_210_ += i_212_;
							}
						} else {
							i_173_ -= i;
							i -= i_174_;
							i_174_ = anIntArray2542[i_174_];
							for (;;) {
								if (--i < 0) {
									while (--i_173_ >= 0) {
										method844(anIntArray2481, is, 0, 0, i_174_, i_175_ >> 16, i_176_ >> 16, i_180_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
										i_176_ += i_199_;
										i_175_ += i_198_;
										i_180_ += i_203_;
										i_174_ += anInt2483;
										i_204_ += i_206_;
										i_207_ += i_209_;
										i_210_ += i_212_;
									}
									break;
								}
								method844(anIntArray2481, is, 0, 0, i_174_, i_177_ >> 16, i_176_ >> 16, i_180_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
								i_176_ += i_199_;
								i_177_ += i_200_;
								i_180_ += i_203_;
								i_174_ += anInt2483;
								i_204_ += i_206_;
								i_207_ += i_209_;
								i_210_ += i_212_;
							}
						}
					} else {
						i_175_ = i_177_ <<= 16;
						if (i_174_ < 0) {
							i_175_ -= i_199_ * i_174_;
							i_177_ -= i_200_ * i_174_;
							i_180_ -= i_203_ * i_174_;
							i_174_ = 0;
						}
						i_176_ <<= 16;
						if (i_173_ < 0) {
							i_176_ -= i_198_ * i_173_;
							i_173_ = 0;
						}
						final int var41 = i_174_ - anInt2534;
						i_204_ += i_206_ * var41;
						i_207_ += i_209_ * var41;
						i_210_ += i_212_ * var41;
						if (i_199_ < i_200_) {
							i -= i_173_;
							i_173_ -= i_174_;
							i_174_ = anIntArray2542[i_174_];
							for (;;) {
								if (--i_173_ < 0) {
									while (--i >= 0) {
										method844(anIntArray2481, is, 0, 0, i_174_, i_176_ >> 16, i_177_ >> 16, i_180_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
										i_176_ += i_198_;
										i_177_ += i_200_;
										i_180_ += i_203_;
										i_174_ += anInt2483;
										i_204_ += i_206_;
										i_207_ += i_209_;
										i_210_ += i_212_;
									}
									break;
								}
								method844(anIntArray2481, is, 0, 0, i_174_, i_175_ >> 16, i_177_ >> 16, i_180_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
								i_175_ += i_199_;
								i_177_ += i_200_;
								i_180_ += i_203_;
								i_174_ += anInt2483;
								i_204_ += i_206_;
								i_207_ += i_209_;
								i_210_ += i_212_;
							}
						} else {
							i -= i_173_;
							i_173_ -= i_174_;
							i_174_ = anIntArray2542[i_174_];
							for (;;) {
								if (--i_173_ < 0) {
									while (--i >= 0) {
										method844(anIntArray2481, is, 0, 0, i_174_, i_177_ >> 16, i_176_ >> 16, i_180_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
										i_176_ += i_198_;
										i_177_ += i_200_;
										i_180_ += i_203_;
										i_174_ += anInt2483;
										i_204_ += i_206_;
										i_207_ += i_209_;
										i_210_ += i_212_;
									}
									break;
								}
								method844(anIntArray2481, is, 0, 0, i_174_, i_177_ >> 16, i_175_ >> 16, i_180_, i_202_, i_204_, i_207_, i_210_, i_205_, i_208_, i_211_);
								i_175_ += i_199_;
								i_177_ += i_200_;
								i_180_ += i_203_;
								i_174_ += anInt2483;
								i_204_ += i_206_;
								i_207_ += i_209_;
								i_210_ += i_212_;
							}
						}
					}
				}
			}
		}
	}

	static final void method858(final int i, final int i_213_, final int i_214_, final int i_215_) {
		anInt2535 = i_214_ - i;
		anInt2536 = i_215_ - i_213_;
		method850();
		if (anIntArray2542.length < anInt2536) {
			int i_216_ = anInt2536;
			i_216_ = --i_216_ | i_216_ >>> 1;
			i_216_ |= i_216_ >>> 2;
			i_216_ |= i_216_ >>> 4;
			i_216_ |= i_216_ >>> 8;
			i_216_ |= i_216_ >>> 16;
			final int i_217_ = i_216_ + 1;
			anIntArray2542 = new int[i_217_];
		}
		int i_218_ = i_213_ * anInt2483 + i;
		for (int i_219_ = 0; i_219_ < anInt2536; i_219_++) {
			anIntArray2542[i_219_] = i_218_;
			i_218_ += anInt2483;
		}
	}
}
