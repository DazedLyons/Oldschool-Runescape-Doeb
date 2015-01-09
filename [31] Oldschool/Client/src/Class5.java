/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class5 {
	int[][] anIntArrayArray67;
	static final float[] aFloatArray68 = { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F,
			4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F,
			2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F,
			1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F,
			6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F,
			3.3677815E-4F, 3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F,
			0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F,
			0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F,
			0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F,
			0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };
	int[] anIntArray69;
	int anInt70;
	int[] anIntArray71;
	static final int[] anIntArray72 = { 256, 128, 86, 64 };
	static int[] anIntArray73;
	int[] anIntArray74;
	int[] anIntArray75;
	static int[] anIntArray76;
	int[] anIntArray77;
	static boolean[] aBooleanArray78;

	static int method100(final int[] is, final int i) {
		final int i_0_ = is[i];
		int i_1_ = -1;
		int i_2_ = 2147483647;
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			final int var6 = is[i_3_];
			if (var6 > i_0_ && var6 < i_2_) {
				i_1_ = i_3_;
				i_2_ = var6;
			}
		}
		return i_1_;
	}

	int method101(final int i, final int i_4_, final int i_5_, final int i_6_, final int i_7_) {
		final int i_8_ = i_6_ - i_4_;
		final int i_9_ = i_5_ - i;
		final int i_10_ = i_8_ < 0 ? -i_8_ : i_8_;
		final int i_11_ = i_10_ * (i_7_ - i);
		final int i_12_ = i_11_ / i_9_;
		return i_8_ < 0 ? i_4_ - i_12_ : i_4_ + i_12_;
	}

	void method102(final int i, final int i_13_, int i_14_, final int i_15_, final float[] fs, final int i_16_) {
		final int i_17_ = i_15_ - i_13_;
		final int i_18_ = i_14_ - i;
		int i_19_ = i_17_ < 0 ? -i_17_ : i_17_;
		final int i_20_ = i_17_ / i_18_;
		int i_21_ = i_13_;
		int i_22_ = 0;
		final int i_23_ = i_17_ < 0 ? i_20_ - 1 : i_20_ + 1;
		i_19_ = i_19_ - (i_20_ < 0 ? -i_20_ : i_20_) * i_18_;
		fs[i] *= aFloatArray68[i_13_];
		if (i_14_ > i_16_) {
			i_14_ = i_16_;
		}
		for (int i_24_ = i + 1; i_24_ < i_14_; i_24_++) {
			i_22_ += i_19_;
			if (i_22_ >= i_18_) {
				i_22_ -= i_18_;
				i_21_ += i_23_;
			} else {
				i_21_ += i_20_;
			}
			fs[i_24_] *= aFloatArray68[i_21_];
		}
	}

	static int method103(final int[] is, final int i) {
		final int i_25_ = is[i];
		int i_26_ = -1;
		int i_27_ = -2147483648;
		for (int i_28_ = 0; i_28_ < i; i_28_++) {
			final int var6 = is[i_28_];
			if (var6 < i_25_ && var6 > i_27_) {
				i_26_ = i_28_;
				i_27_ = var6;
			}
		}
		return i_26_;
	}

	Class5() {
		final int i = Class91_Sub4.method608(16);
		if (i != 1) {
			throw new RuntimeException();
		}
		final int i_29_ = Class91_Sub4.method608(5);
		int i_30_ = 0;
		this.anIntArray71 = new int[i_29_];
		for (int i_31_ = 0; i_31_ < i_29_; i_31_++) {
			final int i_32_ = Class91_Sub4.method608(4);
			this.anIntArray71[i_31_] = i_32_;
			if (i_32_ >= i_30_) {
				i_30_ = i_32_ + 1;
			}
		}
		this.anIntArray69 = new int[i_30_];
		this.anIntArray75 = new int[i_30_];
		this.anIntArray74 = new int[i_30_];
		this.anIntArrayArray67 = new int[i_30_][];
		for (int i_33_ = 0; i_33_ < i_30_; i_33_++) {
			this.anIntArray69[i_33_] = Class91_Sub4.method608(3) + 1;
			int i_34_ = this.anIntArray75[i_33_] = Class91_Sub4.method608(2);
			if (i_34_ != 0) {
				this.anIntArray74[i_33_] = Class91_Sub4.method608(8);
			}
			i_34_ = 1 << i_34_;
			final int[] is = new int[i_34_];
			this.anIntArrayArray67[i_33_] = is;
			for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
				is[i_35_] = Class91_Sub4.method608(8) - 1;
			}
		}
		this.anInt70 = Class91_Sub4.method608(2) + 1;
		final int i_36_ = Class91_Sub4.method608(4);
		int i_37_ = 2;
		for (int i_38_ = 0; i_38_ < i_29_; i_38_++) {
			i_37_ += this.anIntArray69[this.anIntArray71[i_38_]];
		}
		this.anIntArray77 = new int[i_37_];
		this.anIntArray77[0] = 0;
		this.anIntArray77[1] = 1 << i_36_;
		i_37_ = 2;
		for (int i_39_ = 0; i_39_ < i_29_; i_39_++) {
			final int i_40_ = this.anIntArray71[i_39_];
			for (int i_41_ = 0; i_41_ < this.anIntArray69[i_40_]; i_41_++) {
				this.anIntArray77[i_37_++] = Class91_Sub4.method608(i_36_);
			}
		}
		if (anIntArray76 == null || anIntArray76.length < i_37_) {
			anIntArray76 = new int[i_37_];
			anIntArray73 = new int[i_37_];
			aBooleanArray78 = new boolean[i_37_];
		}
	}

	void method104(final int i, final int i_42_) {
		if (i < i_42_) {
			int i_43_ = i;
			final int i_44_ = anIntArray76[i];
			final int i_45_ = anIntArray73[i];
			final boolean bool = aBooleanArray78[i];
			for (int i_46_ = i + 1; i_46_ <= i_42_; i_46_++) {
				final int var8 = anIntArray76[i_46_];
				if (var8 < i_44_) {
					anIntArray76[i_43_] = var8;
					anIntArray73[i_43_] = anIntArray73[i_46_];
					aBooleanArray78[i_43_] = aBooleanArray78[i_46_];
					i_43_++;
					anIntArray76[i_46_] = anIntArray76[i_43_];
					anIntArray73[i_46_] = anIntArray73[i_43_];
					aBooleanArray78[i_46_] = aBooleanArray78[i_43_];
				}
			}
			anIntArray76[i_43_] = i_44_;
			anIntArray73[i_43_] = i_45_;
			aBooleanArray78[i_43_] = bool;
			method104(i, i_43_ - 1);
			method104(i_43_ + 1, i_42_);
		}
	}

	void method105(final float[] fs, final int i) {
		final int i_47_ = this.anIntArray77.length;
		final int i_48_ = anIntArray72[this.anInt70 - 1];
		final boolean[] bools = aBooleanArray78;
		aBooleanArray78[1] = true;
		bools[0] = true;
		for (int i_49_ = 2; i_49_ < i_47_; i_49_++) {
			final int i_50_ = method103(anIntArray76, i_49_);
			final int i_51_ = method100(anIntArray76, i_49_);
			final int i_52_ = method101(anIntArray76[i_50_], anIntArray73[i_50_], anIntArray76[i_51_], anIntArray73[i_51_], anIntArray76[i_49_]);
			final int i_53_ = anIntArray73[i_49_];
			final int i_54_ = i_48_ - i_52_;
			final int i_55_ = (i_54_ < i_52_ ? i_54_ : i_52_) << 1;
			if (i_53_ != 0) {
				final boolean[] bools_56_ = aBooleanArray78;
				aBooleanArray78[i_51_] = true;
				bools_56_[i_50_] = true;
				aBooleanArray78[i_49_] = true;
				if (i_53_ >= i_55_) {
					anIntArray73[i_49_] = i_54_ > i_52_ ? i_53_ - i_52_ + i_52_ : i_52_ - i_53_ + i_54_ - 1;
				} else {
					anIntArray73[i_49_] = (i_53_ & 0x1) != 0 ? i_52_ - (i_53_ + 1) / 2 : i_52_ + i_53_ / 2;
				}
			} else {
				aBooleanArray78[i_49_] = false;
				anIntArray73[i_49_] = i_52_;
			}
		}
		method104(0, i_47_ - 1);
		int i_57_ = 0;
		int i_58_ = anIntArray73[0] * this.anInt70;
		for (int i_59_ = 1; i_59_ < i_47_; i_59_++) {
			if (aBooleanArray78[i_59_]) {
				final int i_60_ = anIntArray76[i_59_];
				final int i_61_ = anIntArray73[i_59_] * this.anInt70;
				method102(i_57_, i_58_, i_60_, i_61_, fs, i);
				if (i_60_ >= i) {
					return;
				}
				i_57_ = i_60_;
				i_58_ = i_61_;
			}
		}
		final float f = aFloatArray68[i_58_];
		for (int i_62_ = i_57_; i_62_ < i; i_62_++) {
			fs[i_62_] *= f;
		}
	}

	boolean method106() {
		final boolean bool = Class91_Sub4.method616() != 0;
		if (!bool) {
			return false;
		}
		final int i = this.anIntArray77.length;
		for (int i_63_ = 0; i_63_ < i; i_63_++) {
			anIntArray76[i_63_] = this.anIntArray77[i_63_];
		}
		final int i_64_ = anIntArray72[this.anInt70 - 1];
		final int i_65_ = Class28.method265(i_64_ - 1, -1484138070);
		anIntArray73[0] = Class91_Sub4.method608(i_65_);
		anIntArray73[1] = Class91_Sub4.method608(i_65_);
		int i_66_ = 2;
		int[] is;
		final int i_67_ = (is = this.anIntArray71).length;
		for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
			final int i_69_ = is[i_68_];
			final int i_70_ = this.anIntArray69[i_69_];
			final int i_71_ = this.anIntArray75[i_69_];
			final int i_72_ = (1 << i_71_) - 1;
			int i_73_ = 0;
			if (i_71_ > 0) {
				i_73_ = Class91_Sub4.aClass11Array1770[this.anIntArray74[i_69_]].method165();
			}
			for (int i_74_ = 0; i_74_ < i_70_; i_74_++) {
				final int i_75_ = this.anIntArrayArray67[i_69_][i_73_ & i_72_];
				i_73_ >>>= i_71_;
				anIntArray73[i_66_++] = i_75_ >= 0 ? Class91_Sub4.aClass11Array1770[i_75_].method165() : 0;
			}
		}
		return true;
	}
}
