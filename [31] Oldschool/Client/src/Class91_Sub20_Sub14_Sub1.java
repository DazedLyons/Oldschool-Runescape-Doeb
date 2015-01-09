/* Class91_Sub20_Sub14_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class91_Sub20_Sub14_Sub1 extends Class91_Sub20_Sub14 {
	int anInt2582;
	int anInt2583;
	int anInt2584;
	boolean aBoolean2585;
	int anInt2586;
	int anInt2587;
	int anInt2588;
	int anInt2589;
	int anInt2590;
	int anInt2591;
	int anInt2592;
	int anInt2593;
	int anInt2594;
	String aString2595;
	int anInt2596;
	int anInt2597;
	int anInt2598;
	int[] anIntArray2599;
	int anInt2600;
	int[] anIntArray2601;
	int anInt2602;
	int[] anIntArray2603;
	int[] anIntArray2604;
	int anInt2605;
	int anInt2606;
	int anInt2607;
	int anInt2608;
	int[] anIntArray2609;
	int anInt2610;
	int anInt2611;
	int anInt2612;
	int anInt2613;
	int anInt2614;
	int anInt2615;
	int anInt2616;
	int anInt2617;
	int anInt2618;
	int anInt2619;
	boolean[] aBooleanArray2620;
	int anInt2621;
	int anInt2622;
	int anInt2623;
	int anInt2624;
	int anInt2625;
	int anInt2626;
	int anInt2627;
	int anInt2628;
	int anInt2629;
	int anInt2630;
	int anInt2631;
	int anInt2632;
	int anInt2633;
	int anInt2634;
	int anInt2635;
	int anInt2636;
	int anInt2637;
	int anInt2638;
	static int anInt2639;

	final void method920(final int i, final int i_0_, final int i_1_, final int i_2_) {
		try {
			for (int i_3_ = 0; i_3_ < 4; i_3_++) {
				if (this.anIntArray2601[i_3_] <= i_1_) {
					this.anIntArray2599[i_3_] = i;
					this.anIntArray2604[i_3_] = i_0_;
					this.anIntArray2601[i_3_] = i_1_ + 70;
					break;
				}
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "ao.m()");
		}
	}

	final void method921(final int i, final boolean bool, final int i_4_) {
		try {
			int i_5_ = this.anIntArray2603[0];
			int i_6_ = this.anIntArray2609[0];
			if (i == 0) {
				i_5_--;
				i_6_++;
			}
			if (1 == i) {
				i_6_++;
			}
			if (i == 2) {
				i_5_++;
				i_6_++;
			}
			if (3 == i) {
				i_5_--;
			}
			if (i == 4) {
				i_5_++;
			}
			if (i == 5) {
				if (i_4_ == 1264876261) {
					return;
				}
				i_5_--;
				i_6_--;
			}
			if (6 == i) {
				i_6_--;
			}
			if (i == 7) {
				i_5_++;
				i_6_--;
			}
			if (-1 != -815127219 * this.anInt2611 && Class7.method152(this.anInt2611 * -815127219, -177718474).anInt2280 * -890176567 == 1) {
				this.anInt2611 = -1205443461;
			}
			if (this.anInt2608 * 1965918393 < 9) {
				this.anInt2608 += 1461452169;
			}
			for (int i_7_ = 1965918393 * this.anInt2608; i_7_ > 0; i_7_--) {
				if (i_4_ == 1264876261) {
					return;
				}
				this.anIntArray2603[i_7_] = this.anIntArray2603[i_7_ - 1];
				this.anIntArray2609[i_7_] = this.anIntArray2609[i_7_ - 1];
				this.aBooleanArray2620[i_7_] = this.aBooleanArray2620[i_7_ - 1];
			}
			this.anIntArray2603[0] = i_5_;
			this.anIntArray2609[0] = i_6_;
			this.aBooleanArray2620[0] = bool;
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "ao.z()");
		}
	}

	final void method922(final byte i) {
		try {
			this.anInt2608 = 0;
			this.anInt2633 = 0;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "ao.s()");
		}
	}

	boolean method923(final byte i) {
		return false;
	}

	Class91_Sub20_Sub14_Sub1() {
		try {
			this.aBoolean2585 = false;
			this.anInt2622 = 1326784293;
			this.anInt2587 = 1589903881;
			this.anInt2588 = -1299965279;
			this.anInt2598 = -497491771;
			this.anInt2590 = -587677561;
			this.anInt2638 = 1347092909;
			this.anInt2584 = -807654627;
			this.anInt2594 = -1172187559;
			this.anInt2615 = -573411691;
			this.aString2595 = null;
			this.anInt2596 = -1614877652;
			this.anInt2597 = 0;
			this.anInt2606 = 0;
			this.anIntArray2599 = new int[4];
			this.anIntArray2604 = new int[4];
			this.anIntArray2601 = new int[4];
			this.anInt2602 = 137909272;
			this.anInt2605 = -728389403;
			this.anInt2636 = 0;
			this.anInt2607 = 0;
			this.anInt2634 = 1946916461;
			this.anInt2625 = 0;
			this.anInt2610 = 0;
			this.anInt2611 = -1205443461;
			this.anInt2612 = 0;
			this.anInt2613 = 0;
			this.anInt2614 = 0;
			this.anInt2582 = 0;
			this.anInt2616 = -721446737;
			this.anInt2635 = 0;
			this.anInt2618 = 0;
			this.anInt2628 = 0;
			this.anInt2629 = -635626936;
			this.anInt2631 = 0;
			this.anInt2632 = 1483347808;
			this.anInt2608 = 0;
			this.anIntArray2603 = new int[10];
			this.anIntArray2609 = new int[10];
			this.aBooleanArray2620 = new boolean[10];
			this.anInt2637 = 0;
			this.anInt2633 = 0;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "ao.<init>()");
		}
	}

	final void method924(final int i, final int i_8_, final boolean bool, final byte i_9_) {
		try {
			if (this.anInt2611 * -815127219 != -1 && Class7.method152(this.anInt2611 * -815127219, 32805240).anInt2280 * -890176567 == 1) {
				this.anInt2611 = -1205443461;
			}
			if (!bool) {
				final int i_10_ = i - this.anIntArray2603[0];
				final int i_11_ = i_8_ - this.anIntArray2609[0];
				if (i_10_ >= -8 && i_10_ <= 8 && i_11_ >= -8 && i_11_ <= 8) {
					if (1965918393 * this.anInt2608 < 9) {
						this.anInt2608 += 1461452169;
					}
					for (int i_12_ = this.anInt2608 * 1965918393; i_12_ > 0; i_12_--) {
						if (i_9_ <= 1) {
							return;
						}
						this.anIntArray2603[i_12_] = this.anIntArray2603[i_12_ - 1];
						this.anIntArray2609[i_12_] = this.anIntArray2609[i_12_ - 1];
						this.aBooleanArray2620[i_12_] = this.aBooleanArray2620[i_12_ - 1];
					}
					this.anIntArray2603[0] = i;
					this.anIntArray2609[0] = i_8_;
					this.aBooleanArray2620[0] = false;
					return;
				}
			}
			this.anInt2608 = 0;
			this.anInt2633 = 0;
			this.anInt2637 = 0;
			this.anIntArray2603[0] = i;
			this.anIntArray2609[0] = i_8_;
			this.anInt2589 = -1904854208 * this.anInt2622 + this.anIntArray2603[0] * 151429248;
			this.anInt2583 = this.anIntArray2609[0] * 1176382080 + -883008448 * this.anInt2622;
		} catch (final RuntimeException var8) {
			throw Class102.method1086(var8, "ao.a()");
		}
	}

	static final void method925(final int i, final int i_13_, final int i_14_, final int i_15_, final int i_16_, final int i_17_, final Class39 class39, final Class76 class76, final int i_18_) {
		try {
			if (client.aBoolean1691 && (Class102.aByteArrayArrayArray1299[0][i_13_][i_14_] & 0x2) == 0) {
				if ((Class102.aByteArrayArrayArray1299[i][i_13_][i_14_] & 0x10) != 0) {
					return;
				}
				int i_19_;
				if ((Class102.aByteArrayArrayArray1299[i][i_13_][i_14_] & 0x8) != 0) {
					i_19_ = 0;
				} else if (i > 0 && (Class102.aByteArrayArrayArray1299[1][i_13_][i_14_] & 0x2) != 0) {
					i_19_ = i - 1;
				} else {
					i_19_ = i;
				}
				if (-1623465885 * client.anInt1490 != i_19_) {
					return;
				}
			}
			if (i < -1711069075 * Class102.anInt1294) {
				Class102.anInt1294 = i * -975756955;
			}
			final LocType class91_sub20_sub7 = Class60.method392(i_15_, 922297833);
			int i_20_;
			int i_21_;
			if (1 != i_16_ && i_16_ != 3) {
				i_20_ = -2039520181 * class91_sub20_sub7.anInt2312;
				i_21_ = -1173592851 * class91_sub20_sub7.anInt2313;
			} else {
				i_20_ = class91_sub20_sub7.anInt2313 * -1173592851;
				i_21_ = -2039520181 * class91_sub20_sub7.anInt2312;
			}
			int i_22_;
			int i_23_;
			if (i_13_ + i_20_ <= 104) {
				i_22_ = (i_20_ >> 1) + i_13_;
				i_23_ = (1 + i_20_ >> 1) + i_13_;
			} else {
				i_22_ = i_13_;
				i_23_ = 1 + i_13_;
			}
			int i_24_;
			int i_25_;
			if (i_21_ + i_14_ <= 104) {
				i_24_ = (i_21_ >> 1) + i_14_;
				i_25_ = i_14_ + (i_21_ + 1 >> 1);
			} else {
				i_24_ = i_14_;
				i_25_ = 1 + i_14_;
			}
			final int[][] is = Class102.anIntArrayArrayArray1292[i];
			final int i_26_ = is[i_22_][i_24_] + is[i_23_][i_24_] + is[i_22_][i_25_] + is[i_23_][i_25_] >> 2;
			final int i_27_ = (i_13_ << 7) + (i_20_ << 6);
			final int i_28_ = (i_14_ << 7) + (i_21_ << 6);
			int i_29_ = i_13_ + (i_14_ << 7) + (i_15_ << 14) + 1073741824;
			if (331313953 * class91_sub20_sub7.anInt2328 == 0) {
				i_29_ -= -2147483648;
			}
			int i_30_ = (i_16_ << 6) + i_17_;
			if (1 == -901606611 * class91_sub20_sub7.anInt2341) {
				i_30_ += 256;
			}
			if (class91_sub20_sub7.method774(-1036488414)) {
				Class17.method181(i, i_13_, i_14_, class91_sub20_sub7, i_16_, -339851618);
			}
			if (22 == i_17_) {
				if (!client.aBoolean1691 || class91_sub20_sub7.anInt2328 * 331313953 != 0 || 1727180835 * class91_sub20_sub7.anInt2314 == 1 || class91_sub20_sub7.aBoolean2339) {
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (class91_sub20_sub7.anInt2320 * 963101581 == -1 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method775(22, i_16_, is, i_27_, i_26_, i_28_, (byte) -60);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_15_, 22, i_16_, i, i_13_, i_14_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
					}
					class39.method297(i, i_13_, i_14_, i_26_, class91_sub20_sub14, i_29_, i_30_);
					if (1727180835 * class91_sub20_sub7.anInt2314 == 1 && class76 != null) {
						class76.method458(i_13_, i_14_, (byte) 0);
					}
				}
			} else if (10 != i_17_ && i_17_ != 11) {
				if (i_17_ >= 12) {
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (class91_sub20_sub7.anInt2320 * 963101581 == -1 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method775(i_17_, i_16_, is, i_27_, i_26_, i_28_, (byte) -12);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_15_, i_17_, i_16_, i, i_13_, i_14_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
					}
					class39.method291(i, i_13_, i_14_, i_26_, 1, 1, class91_sub20_sub14, 0, i_29_, i_30_);
					if (i_17_ >= 12 && i_17_ <= 17 && i_17_ != 13 && i > 0) {
						Class32.anIntArrayArrayArray375[i][i_13_][i_14_] |= 0x924;
					}
					if (class91_sub20_sub7.anInt2314 * 1727180835 != 0 && class76 != null) {
						class76.method456(i_13_, i_14_, i_20_, i_21_, class91_sub20_sub7.aBoolean2315, 1358341669);
					}
				} else if (i_17_ == 0) {
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (-1 == class91_sub20_sub7.anInt2320 * 963101581 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method775(0, i_16_, is, i_27_, i_26_, i_28_, (byte) -77);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_15_, 0, i_16_, i, i_13_, i_14_, 963101581 * class91_sub20_sub7.anInt2320, true, null);
					}
					class39.method298(i, i_13_, i_14_, i_26_, class91_sub20_sub14, null, Class102.anIntArray1302[i_16_], 0, i_29_, i_30_);
					if (i_16_ == 0) {
						if (class91_sub20_sub7.aBoolean2302) {
							Class102.aByteArrayArrayArray1310[i][i_13_][i_14_] = (byte) 50;
							Class102.aByteArrayArrayArray1310[i][i_13_][i_14_ + 1] = (byte) 50;
						}
						if (class91_sub20_sub7.aBoolean2342) {
							Class32.anIntArrayArrayArray375[i][i_13_][i_14_] |= 0x249;
						}
					} else if (i_16_ == 1) {
						if (class91_sub20_sub7.aBoolean2302) {
							Class102.aByteArrayArrayArray1310[i][i_13_][1 + i_14_] = (byte) 50;
							Class102.aByteArrayArrayArray1310[i][1 + i_13_][1 + i_14_] = (byte) 50;
						}
						if (class91_sub20_sub7.aBoolean2342) {
							Class32.anIntArrayArrayArray375[i][i_13_][1 + i_14_] |= 0x492;
						}
					} else if (2 == i_16_) {
						if (class91_sub20_sub7.aBoolean2302) {
							Class102.aByteArrayArrayArray1310[i][i_13_ + 1][i_14_] = (byte) 50;
							Class102.aByteArrayArrayArray1310[i][1 + i_13_][1 + i_14_] = (byte) 50;
						}
						if (class91_sub20_sub7.aBoolean2342) {
							Class32.anIntArrayArrayArray375[i][i_13_ + 1][i_14_] |= 0x249;
						}
					} else if (i_16_ == 3) {
						if (class91_sub20_sub7.aBoolean2302) {
							Class102.aByteArrayArrayArray1310[i][i_13_][i_14_] = (byte) 50;
							Class102.aByteArrayArrayArray1310[i][1 + i_13_][i_14_] = (byte) 50;
						}
						if (class91_sub20_sub7.aBoolean2342) {
							Class32.anIntArrayArrayArray375[i][i_13_][i_14_] |= 0x492;
						}
					}
					if (class91_sub20_sub7.anInt2314 * 1727180835 != 0 && class76 != null) {
						class76.method455(i_13_, i_14_, i_17_, i_16_, class91_sub20_sub7.aBoolean2315, (short) 143);
					}
					if (16 != class91_sub20_sub7.anInt2321 * 570442491) {
						class39.method333(i, i_13_, i_14_, 570442491 * class91_sub20_sub7.anInt2321);
					}
				} else if (1 == i_17_) {
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (-1 == class91_sub20_sub7.anInt2320 * 963101581 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method775(1, i_16_, is, i_27_, i_26_, i_28_, (byte) 12);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_15_, 1, i_16_, i, i_13_, i_14_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
					}
					class39.method298(i, i_13_, i_14_, i_26_, class91_sub20_sub14, null, Class102.anIntArray1303[i_16_], 0, i_29_, i_30_);
					if (class91_sub20_sub7.aBoolean2302) {
						if (i_16_ == 0) {
							Class102.aByteArrayArrayArray1310[i][i_13_][1 + i_14_] = (byte) 50;
						} else if (i_16_ == 1) {
							Class102.aByteArrayArrayArray1310[i][i_13_ + 1][1 + i_14_] = (byte) 50;
						} else if (2 == i_16_) {
							Class102.aByteArrayArrayArray1310[i][i_13_ + 1][i_14_] = (byte) 50;
						} else if (i_16_ == 3) {
							Class102.aByteArrayArrayArray1310[i][i_13_][i_14_] = (byte) 50;
						}
					}
					if (class91_sub20_sub7.anInt2314 * 1727180835 != 0 && class76 != null) {
						class76.method455(i_13_, i_14_, i_17_, i_16_, class91_sub20_sub7.aBoolean2315, (short) 143);
					}
				} else if (2 == i_17_) {
					final int i_31_ = i_16_ + 1 & 0x3;
					Class91_Sub20_Sub14 class91_sub20_sub14;
					Class91_Sub20_Sub14 class91_sub20_sub14_32_;
					if (-1 == 963101581 * class91_sub20_sub7.anInt2320 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method775(2, i_16_ + 4, is, i_27_, i_26_, i_28_, (byte) 97);
						class91_sub20_sub14_32_ = class91_sub20_sub7.method775(2, i_31_, is, i_27_, i_26_, i_28_, (byte) -74);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_15_, 2, 4 + i_16_, i, i_13_, i_14_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
						class91_sub20_sub14_32_ = new Class91_Sub20_Sub14_Sub5(i_15_, 2, i_31_, i, i_13_, i_14_, 963101581 * class91_sub20_sub7.anInt2320, true, null);
					}
					class39.method298(i, i_13_, i_14_, i_26_, class91_sub20_sub14, class91_sub20_sub14_32_, Class102.anIntArray1302[i_16_], Class102.anIntArray1302[i_31_], i_29_, i_30_);
					if (class91_sub20_sub7.aBoolean2342) {
						if (i_16_ == 0) {
							Class32.anIntArrayArrayArray375[i][i_13_][i_14_] |= 0x249;
							Class32.anIntArrayArrayArray375[i][i_13_][i_14_ + 1] |= 0x492;
						} else if (i_16_ == 1) {
							Class32.anIntArrayArrayArray375[i][i_13_][1 + i_14_] |= 0x492;
							Class32.anIntArrayArrayArray375[i][i_13_ + 1][i_14_] |= 0x249;
						} else if (i_16_ == 2) {
							Class32.anIntArrayArrayArray375[i][i_13_ + 1][i_14_] |= 0x249;
							Class32.anIntArrayArrayArray375[i][i_13_][i_14_] |= 0x492;
						} else if (i_16_ == 3) {
							Class32.anIntArrayArrayArray375[i][i_13_][i_14_] |= 0x492;
							Class32.anIntArrayArrayArray375[i][i_13_][i_14_] |= 0x249;
						}
					}
					if (class91_sub20_sub7.anInt2314 * 1727180835 != 0 && class76 != null) {
						class76.method455(i_13_, i_14_, i_17_, i_16_, class91_sub20_sub7.aBoolean2315, (short) 143);
					}
					if (16 != 570442491 * class91_sub20_sub7.anInt2321) {
						class39.method333(i, i_13_, i_14_, class91_sub20_sub7.anInt2321 * 570442491);
					}
				} else if (3 == i_17_) {
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (-1 == 963101581 * class91_sub20_sub7.anInt2320 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method775(3, i_16_, is, i_27_, i_26_, i_28_, (byte) -2);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_15_, 3, i_16_, i, i_13_, i_14_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
					}
					class39.method298(i, i_13_, i_14_, i_26_, class91_sub20_sub14, null, Class102.anIntArray1303[i_16_], 0, i_29_, i_30_);
					if (class91_sub20_sub7.aBoolean2302) {
						if (i_16_ == 0) {
							Class102.aByteArrayArrayArray1310[i][i_13_][i_14_ + 1] = (byte) 50;
						} else if (i_16_ == 1) {
							Class102.aByteArrayArrayArray1310[i][i_13_ + 1][1 + i_14_] = (byte) 50;
						} else if (2 == i_16_) {
							Class102.aByteArrayArrayArray1310[i][1 + i_13_][i_14_] = (byte) 50;
						} else if (3 == i_16_) {
							Class102.aByteArrayArrayArray1310[i][i_13_][i_14_] = (byte) 50;
						}
					}
					if (1727180835 * class91_sub20_sub7.anInt2314 != 0 && class76 != null) {
						class76.method455(i_13_, i_14_, i_17_, i_16_, class91_sub20_sub7.aBoolean2315, (short) 143);
					}
				} else if (9 == i_17_) {
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (class91_sub20_sub7.anInt2320 * 963101581 == -1 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method775(i_17_, i_16_, is, i_27_, i_26_, i_28_, (byte) 19);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_15_, i_17_, i_16_, i, i_13_, i_14_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
					}
					class39.method291(i, i_13_, i_14_, i_26_, 1, 1, class91_sub20_sub14, 0, i_29_, i_30_);
					if (class91_sub20_sub7.anInt2314 * 1727180835 != 0 && class76 != null) {
						class76.method456(i_13_, i_14_, i_20_, i_21_, class91_sub20_sub7.aBoolean2315, -1126379931);
					}
					if (16 != class91_sub20_sub7.anInt2321 * 570442491) {
						class39.method333(i, i_13_, i_14_, class91_sub20_sub7.anInt2321 * 570442491);
					}
				} else if (i_17_ == 4) {
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (class91_sub20_sub7.anInt2320 * 963101581 == -1 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method775(4, i_16_, is, i_27_, i_26_, i_28_, (byte) 15);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_15_, 4, i_16_, i, i_13_, i_14_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
					}
					class39.method290(i, i_13_, i_14_, i_26_, class91_sub20_sub14, null, Class102.anIntArray1302[i_16_], 0, 0, 0, i_29_, i_30_);
				} else if (i_17_ == 5) {
					int i_33_ = 16;
					final int i_34_ = class39.method303(i, i_13_, i_14_);
					if (i_34_ != 0) {
						i_33_ = Class60.method392(i_34_ >> 14 & 0x7fff, 1622706317).anInt2321 * 570442491;
					}
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (963101581 * class91_sub20_sub7.anInt2320 == -1 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method775(4, i_16_, is, i_27_, i_26_, i_28_, (byte) -18);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_15_, 4, i_16_, i, i_13_, i_14_, 963101581 * class91_sub20_sub7.anInt2320, true, null);
					}
					class39.method290(i, i_13_, i_14_, i_26_, class91_sub20_sub14, null, Class102.anIntArray1302[i_16_], 0, i_33_ * Class102.anIntArray1293[i_16_], Class102.anIntArray1305[i_16_] * i_33_, i_29_, i_30_);
				} else if (i_17_ == 6) {
					int i_35_ = 8;
					final int i_36_ = class39.method303(i, i_13_, i_14_);
					if (i_36_ != 0) {
						i_35_ = Class60.method392(i_36_ >> 14 & 0x7fff, 1270745836).anInt2321 * 570442491 / 2;
					}
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (-1 == class91_sub20_sub7.anInt2320 * 963101581 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method775(4, i_16_ + 4, is, i_27_, i_26_, i_28_, (byte) 16);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_15_, 4, i_16_ + 4, i, i_13_, i_14_, class91_sub20_sub7.anInt2320 * 963101581, true, null);
					}
					class39.method290(i, i_13_, i_14_, i_26_, class91_sub20_sub14, null, 256, i_16_, Class102.anIntArray1306[i_16_] * i_35_, Class102.anIntArray1312[i_16_] * i_35_, i_29_, i_30_);
				} else if (i_17_ == 7) {
					final int i_37_ = i_16_ + 2 & 0x3;
					Class91_Sub20_Sub14 class91_sub20_sub14;
					if (963101581 * class91_sub20_sub7.anInt2320 == -1 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method775(4, i_37_ + 4, is, i_27_, i_26_, i_28_, (byte) -88);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_15_, 4, i_37_ + 4, i, i_13_, i_14_, 963101581 * class91_sub20_sub7.anInt2320, true, null);
					}
					class39.method290(i, i_13_, i_14_, i_26_, class91_sub20_sub14, null, 256, i_37_, 0, 0, i_29_, i_30_);
				} else if (i_17_ == 8) {
					int i_38_ = 8;
					final int i_39_ = class39.method303(i, i_13_, i_14_);
					if (i_39_ != 0) {
						i_38_ = Class60.method392(i_39_ >> 14 & 0x7fff, -1140475806).anInt2321 * 570442491 / 2;
					}
					final int i_40_ = 2 + i_16_ & 0x3;
					Class91_Sub20_Sub14 class91_sub20_sub14;
					Class91_Sub20_Sub14 class91_sub20_sub14_41_;
					if (-1 == class91_sub20_sub7.anInt2320 * 963101581 && class91_sub20_sub7.anIntArray2305 == null) {
						class91_sub20_sub14 = class91_sub20_sub7.method775(4, i_16_ + 4, is, i_27_, i_26_, i_28_, (byte) 84);
						class91_sub20_sub14_41_ = class91_sub20_sub7.method775(4, 4 + i_40_, is, i_27_, i_26_, i_28_, (byte) -62);
					} else {
						class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_15_, 4, i_16_ + 4, i, i_13_, i_14_, 963101581 * class91_sub20_sub7.anInt2320, true, null);
						class91_sub20_sub14_41_ = new Class91_Sub20_Sub14_Sub5(i_15_, 4, i_40_ + 4, i, i_13_, i_14_, 963101581 * class91_sub20_sub7.anInt2320, true, null);
					}
					class39.method290(i, i_13_, i_14_, i_26_, class91_sub20_sub14, class91_sub20_sub14_41_, 256, i_16_, i_38_ * Class102.anIntArray1306[i_16_], i_38_ * Class102.anIntArray1312[i_16_], i_29_, i_30_);
				}
			} else {
				Class91_Sub20_Sub14 class91_sub20_sub14;
				if (-1 == 963101581 * class91_sub20_sub7.anInt2320 && class91_sub20_sub7.anIntArray2305 == null) {
					class91_sub20_sub14 = class91_sub20_sub7.method775(10, i_16_, is, i_27_, i_26_, i_28_, (byte) -14);
				} else {
					class91_sub20_sub14 = new Class91_Sub20_Sub14_Sub5(i_15_, 10, i_16_, i, i_13_, i_14_, 963101581 * class91_sub20_sub7.anInt2320, true, null);
				}
				if (class91_sub20_sub14 != null) {
					int i_42_;
					if (i_17_ == 11) {
						i_42_ = 256;
					} else {
						i_42_ = 0;
					}
					if (class39.method291(i, i_13_, i_14_, i_26_, i_20_, i_21_, class91_sub20_sub14, i_42_, i_29_, i_30_) && class91_sub20_sub7.aBoolean2302) {
						int i_43_ = 15;
						if (class91_sub20_sub14 instanceof Class91_Sub20_Sub14_Sub3) {
							i_43_ = ((Class91_Sub20_Sub14_Sub3) class91_sub20_sub14).method990() / 4;
							if (i_43_ > 30) {
								i_43_ = 30;
							}
						}
						for (int i_44_ = 0; i_44_ <= i_20_; i_44_++) {
							for (int i_45_ = 0; i_45_ <= i_21_; i_45_++) {
								if (i_43_ > Class102.aByteArrayArrayArray1310[i][i_44_ + i_13_][i_14_ + i_45_]) {
									Class102.aByteArrayArrayArray1310[i][i_13_ + i_44_][i_45_ + i_14_] = (byte) i_43_;
								}
							}
						}
					}
				}
				if (class91_sub20_sub7.anInt2314 * 1727180835 != 0 && class76 != null) {
					class76.method456(i_13_, i_14_, i_20_, i_21_, class91_sub20_sub7.aBoolean2315, -1086658317);
				}
			}
		} catch (final RuntimeException var27) {
			throw Class102.method1086(var27, "ao.r()");
		}
	}

	static final void method926(final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1, final int i, final int i_46_, final int i_47_, final int i_48_) {
		try {
			if (Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316 == class91_sub20_sub14_sub1_sub1) {
				if (i_48_ == 2046376529) {
					throw new IllegalStateException();
				}
			} else if (1335574821 * client.anInt1585 >= 400) {
				if (i_48_ == 2046376529) {
					throw new IllegalStateException();
				}
			} else {
				String string;
				if (class91_sub20_sub14_sub1_sub1.anInt2842 * -1889866093 == 0) {
					final String string_49_ = class91_sub20_sub14_sub1_sub1.aString2841;
					final int i_50_ = class91_sub20_sub14_sub1_sub1.anInt2843 * -2033628249;
					final int i_51_ = Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2843 * -2033628249;
					final int i_52_ = i_51_ - i_50_;
					String string_53_;
					if (i_52_ < -9) {
						string_53_ = Class91_Sub21.method1033(16711680, -1380686378);
					} else if (i_52_ < -6) {
						string_53_ = Class91_Sub21.method1033(16723968, -937225946);
					} else if (i_52_ < -3) {
						string_53_ = Class91_Sub21.method1033(16740352, -1881145781);
					} else if (i_52_ < 0) {
						string_53_ = Class91_Sub21.method1033(16756736, -1429115396);
					} else if (i_52_ > 9) {
						string_53_ = Class91_Sub21.method1033(65280, -730858262);
					} else if (i_52_ > 6) {
						string_53_ = Class91_Sub21.method1033(4259584, -399153635);
					} else if (i_52_ > 3) {
						string_53_ = Class91_Sub21.method1033(8453888, -1552456701);
					} else if (i_52_ > 0) {
						string_53_ = Class91_Sub21.method1033(12648192, 185826436);
					} else {
						string_53_ = Class91_Sub21.method1033(16776960, -895944695);
					}
					string = new StringBuilder(string_49_).append(string_53_).append(" ").append(Class106.aString1368).append(Class75.aString996).append(class91_sub20_sub14_sub1_sub1.anInt2843 * -2033628249).append(Class106.aString1377).toString();
				} else {
					string = new StringBuilder(class91_sub20_sub14_sub1_sub1.aString2841).append(" ").append(Class106.aString1368).append(Class75.aString997).append(class91_sub20_sub14_sub1_sub1.anInt2842 * -1889866093).append(Class106.aString1377).toString();
				}
				if (406349745 * client.anInt1596 == 1) {
					Class14.method175(Class75.aString990, new StringBuilder(client.aString1597).append(" ").append(Class106.aString1373).append(" ").append(Class91_Sub21.method1033(16777215, 173827603)).append(string).toString(), 14, i, i_46_, i_47_, -1101298913);
				} else if (client.aBoolean1568) {
					if (8 == (Class40.anInt547 * 1288780977 & 0x8)) {
						Class14.method175(client.aString1600, new StringBuilder(client.aString1553).append(" ").append(Class106.aString1373).append(" ").append(Class91_Sub21.method1033(16777215, -1005862030)).append(string).toString(), 15, i, i_46_, i_47_, -1101298913);
					}
				} else {
					for (int i_54_ = 7; i_54_ >= 0; i_54_--) {
						if (client.aStringArray1573[i_54_] != null) {
							int i_55_ = 0;
							if (client.aStringArray1573[i_54_].equalsIgnoreCase(Class75.aString992)) {
								if (-2033628249 * class91_sub20_sub14_sub1_sub1.anInt2843 > -2033628249 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2843) {
									i_55_ = 2000;
								}
								if (1483016477 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2855 != 0 && class91_sub20_sub14_sub1_sub1.anInt2855 * 1483016477 != 0) {
									if (Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2855 * 1483016477 == 1483016477 * class91_sub20_sub14_sub1_sub1.anInt2855) {
										i_55_ = 2000;
									} else {
										i_55_ = 0;
									}
								}
							} else if (client.aBooleanArray1574[i_54_]) {
								i_55_ = 2000;
							}
							final int i_56_ = client.anIntArray1462[i_54_] + i_55_;
							Class14.method175(client.aStringArray1573[i_54_], new StringBuilder(Class91_Sub21.method1033(16777215, -1075443310)).append(string).toString(), i_56_, i, i_46_, i_47_, -1101298913);
						}
					}
				}
				for (int i_57_ = 0; i_57_ < 1335574821 * client.anInt1585; i_57_++) {
					if (client.anIntArray1588[i_57_] == 23) {
						client.aStringArray1591[i_57_] = new StringBuilder(Class91_Sub21.method1033(16777215, -535074617)).append(string).toString();
						break;
					}
				}
			}
		} catch (final RuntimeException var11) {
			throw Class102.method1086(var11, "ao.be()");
		}
	}
}
