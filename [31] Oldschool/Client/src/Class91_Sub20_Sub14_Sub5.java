/* Class91_Sub20_Sub14_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub20_Sub14_Sub5 extends Class91_Sub20_Sub14 {
	static final int anInt2791 = 4;
	int anInt2792;
	public static final int anInt2793 = 98;
	int anInt2794;
	int anInt2795;
	int anInt2796;
	Class91_Sub20_Sub5 aClass91_Sub20_Sub5_2797;
	int anInt2798;
	int anInt2799;
	static Class63_Sub1 aClass63_Sub1_2800;
	static final int anInt2801 = 83;
	int anInt2802;
	static final int anInt2803 = 3;
	static final int anInt2804 = 81;
	static final int anInt2805 = 1001;
	int anInt2806;
	static int anInt2807;

	@Override
	protected final Class91_Sub20_Sub14_Sub3 method915(final int i) {
		Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3;
		try {
			if (this.aClass91_Sub20_Sub5_2797 != null) {
				int i_0_ = 2026135825 * client.anInt1449 - 1436685567 * this.anInt2799;
				if (i_0_ > 100 && 903445723 * this.aClass91_Sub20_Sub5_2797.anInt2277 > 0) {
					i_0_ = 100;
				}
				while (i_0_ > this.aClass91_Sub20_Sub5_2797.anIntArray2270[345359033 * this.anInt2798]) {
					i_0_ -= this.aClass91_Sub20_Sub5_2797.anIntArray2270[this.anInt2798 * 345359033];
					this.anInt2798 += 341287817;
					if (this.anInt2798 * 345359033 >= this.aClass91_Sub20_Sub5_2797.anIntArray2268.length) {
						this.anInt2798 -= this.aClass91_Sub20_Sub5_2797.anInt2277 * -699383245;
						if (345359033 * this.anInt2798 < 0 || 345359033 * this.anInt2798 >= this.aClass91_Sub20_Sub5_2797.anIntArray2268.length) {
							this.aClass91_Sub20_Sub5_2797 = null;
							break;
						}
					}
				}
				this.anInt2799 = (client.anInt1449 * 2026135825 - i_0_) * -408622337;
			}
			LocType class91_sub20_sub7 = Class60.method392(this.anInt2802 * 237348223, -471080268);
			if (class91_sub20_sub7.anIntArray2305 != null) {
				class91_sub20_sub7 = class91_sub20_sub7.method777(-1829310250);
			}
			if (class91_sub20_sub7 == null) {
				return null;
			}
			int i_1_;
			int i_2_;
			if (-908049755 * this.anInt2806 != 1 && 3 != this.anInt2806 * -908049755) {
				i_1_ = -2039520181 * class91_sub20_sub7.anInt2312;
				i_2_ = -1173592851 * class91_sub20_sub7.anInt2313;
			} else {
				i_1_ = class91_sub20_sub7.anInt2313 * -1173592851;
				i_2_ = -2039520181 * class91_sub20_sub7.anInt2312;
			}
			final int i_3_ = (i_1_ >> 1) + 1329849461 * this.anInt2795;
			final int i_4_ = this.anInt2795 * 1329849461 + (1 + i_1_ >> 1);
			final int i_5_ = (i_2_ >> 1) + this.anInt2796 * 295429799;
			final int i_6_ = 295429799 * this.anInt2796 + (1 + i_2_ >> 1);
			final int[][] is = Class102.anIntArrayArrayArray1292[840770647 * this.anInt2794];
			final int i_7_ = is[i_4_][i_6_] + is[i_3_][i_6_] + is[i_4_][i_5_] + is[i_3_][i_5_] >> 2;
			final int i_8_ = (this.anInt2795 * 1329849461 << 7) + (i_1_ << 6);
			final int i_9_ = (i_2_ << 6) + (this.anInt2796 * 295429799 << 7);
			class91_sub20_sub14_sub3 = class91_sub20_sub7.method773(this.anInt2792 * -59321113, this.anInt2806 * -908049755, is, i_8_, i_7_, i_9_, this.aClass91_Sub20_Sub5_2797, 345359033 * this.anInt2798, 2145985284);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "m.w()");
		}
		return class91_sub20_sub14_sub3;
	}

	static final void method1008(final int i, final int i_10_, final byte i_11_) {
		try {
			if (-19780067 * client.anInt1676 == 0 || 3 == client.anInt1676 * -19780067) {
				if (-1261190415 * Class12.anInt172 == 1) {
					int i_12_ = Class12.anInt180 * -1084967827 - 25 - i;
					int i_13_ = Class12.anInt167 * -956533215 - 5 - i_10_;
					if (i_12_ >= 0 && i_13_ >= 0 && i_12_ < 146 && i_13_ < 151) {
						i_12_ -= 73;
						i_13_ -= 75;
						final int i_14_ = client.anInt1513 * -1562784247 + -1533574683 * client.anInt1528 & 0x7ff;
						int i_15_ = Class91_Sub20_Sub13_Sub2.anIntArray2546[i_14_];
						int i_16_ = Class91_Sub20_Sub13_Sub2.anIntArray2547[i_14_];
						i_15_ = (client.anInt1515 * -907024925 + 256) * i_15_ >> 8;
						i_16_ = i_16_ * (256 + client.anInt1515 * -907024925) >> 8;
						final int i_17_ = i_13_ * i_15_ + i_12_ * i_16_ >> 11;
						final int i_18_ = i_16_ * i_13_ - i_12_ * i_15_ >> 11;
						final int i_19_ = i_17_ + Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 * 107578049 >> 7;
						final int i_20_ = -668540675 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 - i_18_ >> 7;
						final boolean bool = Class18.method188(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0], Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0], i_19_, i_20_, true, 0, 0, 0, 0, 0, 1, 758036615);
						if (bool) {
							client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(i_12_);
							client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(i_13_);
							client.aClass91_Sub9_Sub1_1478.method681(client.anInt1528 * -1533574683, -372694149);
							client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(57);
							client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(client.anInt1513 * -1562784247);
							client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(client.anInt1515 * -907024925);
							client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(89);
							client.aClass91_Sub9_Sub1_1478.method681(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 * 107578049, -372694149);
							client.aClass91_Sub9_Sub1_1478.method681(Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 * -668540675, -372694149);
							client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(282891669 * client.anInt1697);
							client.aClass91_Sub9_Sub1_1478.writeWordBigEndian(63);
						}
					}
				}
			}
		} catch (final RuntimeException var13) {
			throw Class102.method1086(var13, "m.aa()");
		}
	}

	Class91_Sub20_Sub14_Sub5(final int i, final int i_21_, final int i_22_, final int i_23_, final int i_24_, final int i_25_, final int i_26_, final boolean bool, final Class91_Sub20_Sub14 class91_sub20_sub14) {
		try {
			this.anInt2802 = i * -2122573185;
			this.anInt2792 = 1385889495 * i_21_;
			this.anInt2806 = -154282707 * i_22_;
			this.anInt2794 = i_23_ * 452462439;
			this.anInt2795 = 1206897629 * i_24_;
			this.anInt2796 = i_25_ * -289447657;
			if (i_26_ != -1) {
				this.aClass91_Sub20_Sub5_2797 = Class7.method152(i_26_, 584123636);
				this.anInt2798 = 0;
				this.anInt2799 = 1379547631 * client.anInt1449 - -408622337;
				if (this.aClass91_Sub20_Sub5_2797.anInt2281 * -778311109 == 0 && class91_sub20_sub14 != null && class91_sub20_sub14 instanceof Class91_Sub20_Sub14_Sub5) {
					final Class91_Sub20_Sub14_Sub5 class91_sub20_sub14_sub5_27_ = (Class91_Sub20_Sub14_Sub5) class91_sub20_sub14;
					if (this.aClass91_Sub20_Sub5_2797 == class91_sub20_sub14_sub5_27_.aClass91_Sub20_Sub5_2797) {
						this.anInt2798 = class91_sub20_sub14_sub5_27_.anInt2798 * 1;
						this.anInt2799 = 1 * class91_sub20_sub14_sub5_27_.anInt2799;
						return;
					}
				}
				if (bool && 903445723 * this.aClass91_Sub20_Sub5_2797.anInt2277 != -1) {
					this.anInt2798 = (int) (Math.random() * this.aClass91_Sub20_Sub5_2797.anIntArray2268.length) * 341287817;
					this.anInt2799 -= (int) (Math.random() * this.aClass91_Sub20_Sub5_2797.anIntArray2270[this.anInt2798 * 345359033]) * -408622337;
				}
			}
		} catch (final RuntimeException var11) {
			throw Class102.method1086(var11, "m.<init>()");
		}
	}

	public static Class91_Sub20_Sub9 method1010(final int i, final byte i_28_) {
		Class91_Sub20_Sub9 class91_sub20_sub9;
		try {
			Class91_Sub20_Sub9 class91_sub20_sub9_29_ = (Class91_Sub20_Sub9) Class91_Sub20_Sub9.aClass96_2400.method1068(i);
			if (class91_sub20_sub9_29_ != null) {
				return class91_sub20_sub9_29_;
			}
			final byte[] is = Class91_Sub20_Sub9.aClass63_2409.getFile(8, i, 2010941680);
			class91_sub20_sub9_29_ = new Class91_Sub20_Sub9();
			if (is != null) {
				class91_sub20_sub9_29_.method794(new ByteBuffer(is), (byte) -60);
			}
			Class91_Sub20_Sub9.aClass96_2400.method1067(class91_sub20_sub9_29_, i);
			class91_sub20_sub9 = class91_sub20_sub9_29_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "m.w()");
		}
		return class91_sub20_sub9;
	}
}
