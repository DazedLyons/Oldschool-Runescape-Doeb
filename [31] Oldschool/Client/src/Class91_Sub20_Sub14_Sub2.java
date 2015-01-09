/* Class91_Sub20_Sub14_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub20_Sub14_Sub2 extends Class91_Sub20_Sub14 {
	int anInt2640;
	int[] anIntArray2641;
	int[] anIntArray2642;
	int[] anIntArray2643;
	short[] aShortArray2644;
	int[] anIntArray2645;
	int[] anIntArray2646;
	Class32[] aClass32Array2647;
	short[] aShortArray2648;
	byte[] aByteArray2649;
	byte[] aByteArray2650;
	byte[] aByteArray2651;
	int[][] anIntArrayArray2652;
	short[] aShortArray2653;
	byte aByte2654 = 0;
	int anInt2655;
	byte[] aByteArray2656;
	short[] aShortArray2657;
	short[] aShortArray2658;
	static int[] anIntArray2659 = Class91_Sub20_Sub13_Sub2.anIntArray2547;
	short[] aShortArray2660;
	short[] aShortArray2661;
	int anInt2662 = 0;
	short[] aShortArray2663;
	int anInt2664 = 0;
	short[] aShortArray2665;
	byte[] aByteArray2666;
	int[] anIntArray2667;
	int[] anIntArray2668;
	int anInt2669;
	int[][] anIntArrayArray2670;
	Class40[] aClass40Array2671;
	int anInt2672;
	Class32[] aClass32Array2673;
	public short aShort2674;
	public short aShort2675;
	boolean aBoolean2676 = false;
	int anInt2677;
	int anInt2678;
	static int[] anIntArray2679 = Class91_Sub20_Sub13_Sub2.anIntArray2546;
	int[] anIntArray2680;
	short[] aShortArray2681;
	static int[] anIntArray2682 = new int[10000];
	static int[] anIntArray2683 = new int[10000];
	static int anInt2684 = 0;
	short[] aShortArray2685;
	byte[] aByteArray2686;

	void method947() {
		if (this.anIntArray2667 != null) {
			final int[] is = new int[256];
			int i = 0;
			for (int i_0_ = 0; i_0_ < this.anInt2664; i_0_++) {
				final int var4 = this.anIntArray2667[i_0_];
				is[var4]++;
				if (var4 > i) {
					i = var4;
				}
			}
			this.anIntArrayArray2652 = new int[i + 1][];
			for (int i_1_ = 0; i_1_ <= i; i_1_++) {
				this.anIntArrayArray2652[i_1_] = new int[is[i_1_]];
				is[i_1_] = 0;
			}
			int i_2_ = 0;
			while (i_2_ < this.anInt2664) {
				final int var4 = this.anIntArray2667[i_2_];
				this.anIntArrayArray2652[var4][is[var4]++] = i_2_++;
			}
			this.anIntArray2667 = null;
		}
		if (this.anIntArray2668 != null) {
			final int[] is = new int[256];
			int i = 0;
			for (int i_3_ = 0; i_3_ < this.anInt2662; i_3_++) {
				final int var4 = this.anIntArray2668[i_3_];
				is[var4]++;
				if (var4 > i) {
					i = var4;
				}
			}
			this.anIntArrayArray2670 = new int[i + 1][];
			for (int i_4_ = 0; i_4_ <= i; i_4_++) {
				this.anIntArrayArray2670[i_4_] = new int[is[i_4_]];
				is[i_4_] = 0;
			}
			int i_5_ = 0;
			while (i_5_ < this.anInt2662) {
				final int var4 = this.anIntArray2668[i_5_];
				this.anIntArrayArray2670[var4][is[var4]++] = i_5_++;
			}
			this.anIntArray2668 = null;
		}
	}

	void method948(final byte[] is) {
		final ByteBuffer class91_sub9 = new ByteBuffer(is);
		final ByteBuffer class91_sub9_6_ = new ByteBuffer(is);
		final ByteBuffer class91_sub9_7_ = new ByteBuffer(is);
		final ByteBuffer class91_sub9_8_ = new ByteBuffer(is);
		final ByteBuffer class91_sub9_9_ = new ByteBuffer(is);
		final ByteBuffer class91_sub9_10_ = new ByteBuffer(is);
		final ByteBuffer class91_sub9_11_ = new ByteBuffer(is);
		class91_sub9.currentOffset = (is.length - 23) * 565881095;
		final int i = class91_sub9.method686((byte) -109);
		final int i_12_ = class91_sub9.method686((byte) -98);
		final int i_13_ = class91_sub9.readUnsignedByte();
		final int i_14_ = class91_sub9.readUnsignedByte();
		final int i_15_ = class91_sub9.readUnsignedByte();
		final int i_16_ = class91_sub9.readUnsignedByte();
		final int i_17_ = class91_sub9.readUnsignedByte();
		final int i_18_ = class91_sub9.readUnsignedByte();
		final int i_19_ = class91_sub9.readUnsignedByte();
		final int i_20_ = class91_sub9.method686((byte) -47);
		final int i_21_ = class91_sub9.method686((byte) -52);
		final int i_22_ = class91_sub9.method686((byte) -126);
		final int i_23_ = class91_sub9.method686((byte) -73);
		final int i_24_ = class91_sub9.method686((byte) -7);
		int i_25_ = 0;
		int i_26_ = 0;
		int i_27_ = 0;
		if (i_13_ > 0) {
			this.aByteArray2656 = new byte[i_13_];
			class91_sub9.currentOffset = 0;
			for (int i_28_ = 0; i_28_ < i_13_; i_28_++) {
				final byte i_29_ = this.aByteArray2656[i_28_] = class91_sub9.method642(1205056825);
				if (i_29_ == 0) {
					i_25_++;
				}
				if (i_29_ >= 1 && i_29_ <= 3) {
					i_26_++;
				}
				if (i_29_ == 2) {
					i_27_++;
				}
			}
		}
		int i_30_ = i_13_ + i;
		final int i_31_ = i_30_;
		if (i_14_ == 1) {
			i_30_ += i_12_;
		}
		final int i_32_ = i_30_;
		i_30_ += i_12_;
		final int i_33_ = i_30_;
		if (i_15_ == 255) {
			i_30_ += i_12_;
		}
		final int i_34_ = i_30_;
		if (i_17_ == 1) {
			i_30_ += i_12_;
		}
		final int i_35_ = i_30_;
		if (i_19_ == 1) {
			i_30_ += i;
		}
		final int i_36_ = i_30_;
		if (i_16_ == 1) {
			i_30_ += i_12_;
		}
		final int i_37_ = i_30_;
		i_30_ += i_23_;
		final int i_38_ = i_30_;
		if (i_18_ == 1) {
			i_30_ += i_12_ * 2;
		}
		final int i_39_ = i_30_;
		i_30_ += i_24_;
		final int i_40_ = i_30_;
		i_30_ += i_12_ * 2;
		final int i_41_ = i_30_;
		i_30_ += i_20_;
		final int i_42_ = i_30_;
		i_30_ += i_21_;
		final int i_43_ = i_30_;
		i_30_ += i_22_;
		final int i_44_ = i_30_;
		i_30_ += i_25_ * 6;
		final int i_45_ = i_30_;
		i_30_ += i_26_ * 6;
		final int i_46_ = i_30_;
		i_30_ += i_26_ * 6;
		final int i_47_ = i_30_;
		i_30_ += i_26_ * 2;
		final int i_48_ = i_30_;
		i_30_ += i_26_;
		final int i_49_ = i_30_;
		i_30_ += i_26_ * 2 + i_27_ * 2;
		this.anInt2664 = i;
		this.anInt2662 = i_12_;
		this.anInt2672 = i_13_;
		this.anIntArray2641 = new int[i];
		this.anIntArray2642 = new int[i];
		this.anIntArray2643 = new int[i];
		this.anIntArray2645 = new int[i_12_];
		this.anIntArray2646 = new int[i_12_];
		this.anIntArray2680 = new int[i_12_];
		if (i_19_ == 1) {
			this.anIntArray2667 = new int[i];
		}
		if (i_14_ == 1) {
			this.aByteArray2686 = new byte[i_12_];
		}
		if (i_15_ == 255) {
			this.aByteArray2649 = new byte[i_12_];
		} else {
			this.aByte2654 = (byte) i_15_;
		}
		if (i_16_ == 1) {
			this.aByteArray2650 = new byte[i_12_];
		}
		if (i_17_ == 1) {
			this.anIntArray2668 = new int[i_12_];
		}
		if (i_18_ == 1) {
			this.aShortArray2653 = new short[i_12_];
		}
		if (i_18_ == 1 && i_13_ > 0) {
			this.aByteArray2651 = new byte[i_12_];
		}
		this.aShortArray2644 = new short[i_12_];
		if (i_13_ > 0) {
			this.aShortArray2657 = new short[i_13_];
			this.aShortArray2658 = new short[i_13_];
			this.aShortArray2681 = new short[i_13_];
			if (i_26_ > 0) {
				this.aShortArray2648 = new short[i_26_];
				this.aShortArray2661 = new short[i_26_];
				this.aShortArray2660 = new short[i_26_];
				this.aShortArray2663 = new short[i_26_];
				this.aByteArray2666 = new byte[i_26_];
				this.aShortArray2685 = new short[i_26_];
			}
			if (i_27_ > 0) {
				this.aShortArray2665 = new short[i_27_];
			}
		}
		class91_sub9.currentOffset = i_13_ * 565881095;
		class91_sub9_6_.currentOffset = i_41_ * 565881095;
		class91_sub9_7_.currentOffset = i_42_ * 565881095;
		class91_sub9_8_.currentOffset = i_43_ * 565881095;
		class91_sub9_9_.currentOffset = i_35_ * 565881095;
		int i_50_ = 0;
		int i_51_ = 0;
		int i_52_ = 0;
		for (int i_53_ = 0; i_53_ < i; i_53_++) {
			final int i_54_ = class91_sub9.readUnsignedByte();
			int i_55_ = 0;
			if ((i_54_ & 0x1) != 0) {
				i_55_ = class91_sub9_6_.method648((byte) -57);
			}
			int i_56_ = 0;
			if ((i_54_ & 0x2) != 0) {
				i_56_ = class91_sub9_7_.method648((byte) -127);
			}
			int i_57_ = 0;
			if ((i_54_ & 0x4) != 0) {
				i_57_ = class91_sub9_8_.method648((byte) -94);
			}
			this.anIntArray2641[i_53_] = i_50_ + i_55_;
			this.anIntArray2642[i_53_] = i_51_ + i_56_;
			this.anIntArray2643[i_53_] = i_52_ + i_57_;
			i_50_ = this.anIntArray2641[i_53_];
			i_51_ = this.anIntArray2642[i_53_];
			i_52_ = this.anIntArray2643[i_53_];
			if (i_19_ == 1) {
				this.anIntArray2667[i_53_] = class91_sub9_9_.readUnsignedByte();
			}
		}
		class91_sub9.currentOffset = i_40_ * 565881095;
		class91_sub9_6_.currentOffset = i_31_ * 565881095;
		class91_sub9_7_.currentOffset = i_33_ * 565881095;
		class91_sub9_8_.currentOffset = i_36_ * 565881095;
		class91_sub9_9_.currentOffset = i_34_ * 565881095;
		class91_sub9_10_.currentOffset = i_38_ * 565881095;
		class91_sub9_11_.currentOffset = i_39_ * 565881095;
		for (int i_58_ = 0; i_58_ < i_12_; i_58_++) {
			this.aShortArray2644[i_58_] = (short) class91_sub9.method686((byte) -98);
			if (i_14_ == 1) {
				this.aByteArray2686[i_58_] = class91_sub9_6_.method642(827822067);
			}
			if (i_15_ == 255) {
				this.aByteArray2649[i_58_] = class91_sub9_7_.method642(997449229);
			}
			if (i_16_ == 1) {
				this.aByteArray2650[i_58_] = class91_sub9_8_.method642(450462891);
			}
			if (i_17_ == 1) {
				this.anIntArray2668[i_58_] = class91_sub9_9_.readUnsignedByte();
			}
			if (i_18_ == 1) {
				this.aShortArray2653[i_58_] = (short) (class91_sub9_10_.method686((byte) -23) - 1);
			}
			if (this.aByteArray2651 != null && this.aShortArray2653[i_58_] != -1) {
				this.aByteArray2651[i_58_] = (byte) (class91_sub9_11_.readUnsignedByte() - 1);
			}
		}
		class91_sub9.currentOffset = i_37_ * 565881095;
		class91_sub9_6_.currentOffset = i_32_ * 565881095;
		int i_59_ = 0;
		int i_60_ = 0;
		int i_61_ = 0;
		int i_62_ = 0;
		for (int i_63_ = 0; i_63_ < i_12_; i_63_++) {
			final int i_64_ = class91_sub9_6_.readUnsignedByte();
			if (i_64_ == 1) {
				i_59_ = class91_sub9.method648((byte) -93) + i_62_;
				i_60_ = class91_sub9.method648((byte) -39) + i_59_;
				i_61_ = class91_sub9.method648((byte) -65) + i_60_;
				i_62_ = i_61_;
				this.anIntArray2645[i_63_] = i_59_;
				this.anIntArray2646[i_63_] = i_60_;
				this.anIntArray2680[i_63_] = i_61_;
			}
			if (i_64_ == 2) {
				i_60_ = i_61_;
				i_61_ = class91_sub9.method648((byte) -43) + i_62_;
				i_62_ = i_61_;
				this.anIntArray2645[i_63_] = i_59_;
				this.anIntArray2646[i_63_] = i_60_;
				this.anIntArray2680[i_63_] = i_61_;
			}
			if (i_64_ == 3) {
				i_59_ = i_61_;
				i_61_ = class91_sub9.method648((byte) -23) + i_62_;
				i_62_ = i_61_;
				this.anIntArray2645[i_63_] = i_59_;
				this.anIntArray2646[i_63_] = i_60_;
				this.anIntArray2680[i_63_] = i_61_;
			}
			if (i_64_ == 4) {
				final int var57 = i_59_;
				i_59_ = i_60_;
				i_60_ = var57;
				i_61_ = class91_sub9.method648((byte) -84) + i_62_;
				i_62_ = i_61_;
				this.anIntArray2645[i_63_] = i_59_;
				this.anIntArray2646[i_63_] = var57;
				this.anIntArray2680[i_63_] = i_61_;
			}
		}
		class91_sub9.currentOffset = i_44_ * 565881095;
		class91_sub9_6_.currentOffset = i_45_ * 565881095;
		class91_sub9_7_.currentOffset = i_46_ * 565881095;
		class91_sub9_8_.currentOffset = i_47_ * 565881095;
		class91_sub9_9_.currentOffset = i_48_ * 565881095;
		class91_sub9_10_.currentOffset = i_49_ * 565881095;
		for (int i_65_ = 0; i_65_ < i_13_; i_65_++) {
			final int i_66_ = this.aByteArray2656[i_65_] & 0xff;
			if (i_66_ == 0) {
				this.aShortArray2657[i_65_] = (short) class91_sub9.method686((byte) -52);
				this.aShortArray2658[i_65_] = (short) class91_sub9.method686((byte) -10);
				this.aShortArray2681[i_65_] = (short) class91_sub9.method686((byte) -52);
			}
			if (i_66_ == 1) {
				this.aShortArray2657[i_65_] = (short) class91_sub9_6_.method686((byte) -73);
				this.aShortArray2658[i_65_] = (short) class91_sub9_6_.method686((byte) -127);
				this.aShortArray2681[i_65_] = (short) class91_sub9_6_.method686((byte) -24);
				this.aShortArray2648[i_65_] = (short) class91_sub9_7_.method686((byte) -67);
				this.aShortArray2661[i_65_] = (short) class91_sub9_7_.method686((byte) -55);
				this.aShortArray2660[i_65_] = (short) class91_sub9_7_.method686((byte) -109);
				this.aShortArray2663[i_65_] = (short) class91_sub9_8_.method686((byte) -7);
				this.aByteArray2666[i_65_] = class91_sub9_9_.method642(331255671);
				this.aShortArray2685[i_65_] = (short) class91_sub9_10_.method686((byte) -115);
			}
			if (i_66_ == 2) {
				this.aShortArray2657[i_65_] = (short) class91_sub9_6_.method686((byte) -36);
				this.aShortArray2658[i_65_] = (short) class91_sub9_6_.method686((byte) -72);
				this.aShortArray2681[i_65_] = (short) class91_sub9_6_.method686((byte) -79);
				this.aShortArray2648[i_65_] = (short) class91_sub9_7_.method686((byte) -45);
				this.aShortArray2661[i_65_] = (short) class91_sub9_7_.method686((byte) -75);
				this.aShortArray2660[i_65_] = (short) class91_sub9_7_.method686((byte) -5);
				this.aShortArray2663[i_65_] = (short) class91_sub9_8_.method686((byte) -49);
				this.aByteArray2666[i_65_] = class91_sub9_9_.method642(1210510625);
				this.aShortArray2685[i_65_] = (short) class91_sub9_10_.method686((byte) -122);
				this.aShortArray2665[i_65_] = (short) class91_sub9_10_.method686((byte) -7);
			}
			if (i_66_ == 3) {
				this.aShortArray2657[i_65_] = (short) class91_sub9_6_.method686((byte) -100);
				this.aShortArray2658[i_65_] = (short) class91_sub9_6_.method686((byte) -20);
				this.aShortArray2681[i_65_] = (short) class91_sub9_6_.method686((byte) -38);
				this.aShortArray2648[i_65_] = (short) class91_sub9_7_.method686((byte) -66);
				this.aShortArray2661[i_65_] = (short) class91_sub9_7_.method686((byte) -8);
				this.aShortArray2660[i_65_] = (short) class91_sub9_7_.method686((byte) -10);
				this.aShortArray2663[i_65_] = (short) class91_sub9_8_.method686((byte) -62);
				this.aByteArray2666[i_65_] = class91_sub9_9_.method642(1766035021);
				this.aShortArray2685[i_65_] = (short) class91_sub9_10_.method686((byte) -39);
			}
		}
		class91_sub9.currentOffset = i_30_ * 565881095;
		final int i_67_ = class91_sub9.readUnsignedByte();
		if (i_67_ != 0) {
			new Class30();
			class91_sub9.method686((byte) -36);
			class91_sub9.method686((byte) -46);
			class91_sub9.method686((byte) -64);
			class91_sub9.readDword();
		}
	}

	void method949(final byte[] is) {
		boolean bool = false;
		boolean bool_68_ = false;
		final ByteBuffer class91_sub9 = new ByteBuffer(is);
		final ByteBuffer class91_sub9_69_ = new ByteBuffer(is);
		final ByteBuffer class91_sub9_70_ = new ByteBuffer(is);
		final ByteBuffer class91_sub9_71_ = new ByteBuffer(is);
		final ByteBuffer class91_sub9_72_ = new ByteBuffer(is);
		class91_sub9.currentOffset = (is.length - 18) * 565881095;
		final int i = class91_sub9.method686((byte) -109);
		final int i_73_ = class91_sub9.method686((byte) -6);
		final int i_74_ = class91_sub9.readUnsignedByte();
		final int i_75_ = class91_sub9.readUnsignedByte();
		final int i_76_ = class91_sub9.readUnsignedByte();
		final int i_77_ = class91_sub9.readUnsignedByte();
		final int i_78_ = class91_sub9.readUnsignedByte();
		final int i_79_ = class91_sub9.readUnsignedByte();
		final int i_80_ = class91_sub9.method686((byte) -14);
		final int i_81_ = class91_sub9.method686((byte) -85);
		class91_sub9.method686((byte) -31);
		final int i_83_ = class91_sub9.method686((byte) -106);
		int i_85_ = 0 + i;
		final int i_86_ = i_85_;
		i_85_ += i_73_;
		final int i_87_ = i_85_;
		if (i_76_ == 255) {
			i_85_ += i_73_;
		}
		final int i_88_ = i_85_;
		if (i_78_ == 1) {
			i_85_ += i_73_;
		}
		final int i_89_ = i_85_;
		if (i_75_ == 1) {
			i_85_ += i_73_;
		}
		final int i_90_ = i_85_;
		if (i_79_ == 1) {
			i_85_ += i;
		}
		final int i_91_ = i_85_;
		if (i_77_ == 1) {
			i_85_ += i_73_;
		}
		final int i_92_ = i_85_;
		i_85_ += i_83_;
		final int i_93_ = i_85_;
		i_85_ += i_73_ * 2;
		final int i_94_ = i_85_;
		i_85_ += i_74_ * 6;
		final int i_95_ = i_85_;
		i_85_ += i_80_;
		final int i_96_ = i_85_;
		i_85_ += i_81_;
		this.anInt2664 = i;
		this.anInt2662 = i_73_;
		this.anInt2672 = i_74_;
		this.anIntArray2641 = new int[i];
		this.anIntArray2642 = new int[i];
		this.anIntArray2643 = new int[i];
		this.anIntArray2645 = new int[i_73_];
		this.anIntArray2646 = new int[i_73_];
		this.anIntArray2680 = new int[i_73_];
		if (i_74_ > 0) {
			this.aByteArray2656 = new byte[i_74_];
			this.aShortArray2657 = new short[i_74_];
			this.aShortArray2658 = new short[i_74_];
			this.aShortArray2681 = new short[i_74_];
		}
		if (i_79_ == 1) {
			this.anIntArray2667 = new int[i];
		}
		if (i_75_ == 1) {
			this.aByteArray2686 = new byte[i_73_];
			this.aByteArray2651 = new byte[i_73_];
			this.aShortArray2653 = new short[i_73_];
		}
		if (i_76_ == 255) {
			this.aByteArray2649 = new byte[i_73_];
		} else {
			this.aByte2654 = (byte) i_76_;
		}
		if (i_77_ == 1) {
			this.aByteArray2650 = new byte[i_73_];
		}
		if (i_78_ == 1) {
			this.anIntArray2668 = new int[i_73_];
		}
		this.aShortArray2644 = new short[i_73_];
		class91_sub9.currentOffset = 0;
		class91_sub9_69_.currentOffset = i_95_ * 565881095;
		class91_sub9_70_.currentOffset = i_96_ * 565881095;
		class91_sub9_71_.currentOffset = i_85_ * 565881095;
		class91_sub9_72_.currentOffset = i_90_ * 565881095;
		int i_97_ = 0;
		int i_98_ = 0;
		int i_99_ = 0;
		for (int i_100_ = 0; i_100_ < i; i_100_++) {
			final int i_101_ = class91_sub9.readUnsignedByte();
			int i_102_ = 0;
			if ((i_101_ & 0x1) != 0) {
				i_102_ = class91_sub9_69_.method648((byte) -16);
			}
			int i_103_ = 0;
			if ((i_101_ & 0x2) != 0) {
				i_103_ = class91_sub9_70_.method648((byte) -56);
			}
			int i_104_ = 0;
			if ((i_101_ & 0x4) != 0) {
				i_104_ = class91_sub9_71_.method648((byte) -96);
			}
			this.anIntArray2641[i_100_] = i_97_ + i_102_;
			this.anIntArray2642[i_100_] = i_98_ + i_103_;
			this.anIntArray2643[i_100_] = i_99_ + i_104_;
			i_97_ = this.anIntArray2641[i_100_];
			i_98_ = this.anIntArray2642[i_100_];
			i_99_ = this.anIntArray2643[i_100_];
			if (i_79_ == 1) {
				this.anIntArray2667[i_100_] = class91_sub9_72_.readUnsignedByte();
			}
		}
		class91_sub9.currentOffset = i_93_ * 565881095;
		class91_sub9_69_.currentOffset = i_89_ * 565881095;
		class91_sub9_70_.currentOffset = i_87_ * 565881095;
		class91_sub9_71_.currentOffset = i_91_ * 565881095;
		class91_sub9_72_.currentOffset = i_88_ * 565881095;
		for (int i_105_ = 0; i_105_ < i_73_; i_105_++) {
			this.aShortArray2644[i_105_] = (short) class91_sub9.method686((byte) -61);
			if (i_75_ == 1) {
				final int i_106_ = class91_sub9_69_.readUnsignedByte();
				if ((i_106_ & 0x1) == 1) {
					this.aByteArray2686[i_105_] = (byte) 1;
					bool = true;
				} else {
					this.aByteArray2686[i_105_] = (byte) 0;
				}
				if ((i_106_ & 0x2) == 2) {
					this.aByteArray2651[i_105_] = (byte) (i_106_ >> 2);
					this.aShortArray2653[i_105_] = this.aShortArray2644[i_105_];
					this.aShortArray2644[i_105_] = (short) 127;
					if (this.aShortArray2653[i_105_] != -1) {
						bool_68_ = true;
					}
				} else {
					this.aByteArray2651[i_105_] = (byte) -1;
					this.aShortArray2653[i_105_] = (short) -1;
				}
			}
			if (i_76_ == 255) {
				this.aByteArray2649[i_105_] = class91_sub9_70_.method642(170667885);
			}
			if (i_77_ == 1) {
				this.aByteArray2650[i_105_] = class91_sub9_71_.method642(1381878788);
			}
			if (i_78_ == 1) {
				this.anIntArray2668[i_105_] = class91_sub9_72_.readUnsignedByte();
			}
		}
		class91_sub9.currentOffset = i_92_ * 565881095;
		class91_sub9_69_.currentOffset = i_86_ * 565881095;
		int i_107_ = 0;
		int i_108_ = 0;
		int i_109_ = 0;
		int i_110_ = 0;
		for (int i_111_ = 0; i_111_ < i_73_; i_111_++) {
			final int i_112_ = class91_sub9_69_.readUnsignedByte();
			if (i_112_ == 1) {
				i_107_ = class91_sub9.method648((byte) -97) + i_110_;
				i_108_ = class91_sub9.method648((byte) -7) + i_107_;
				i_109_ = class91_sub9.method648((byte) -80) + i_108_;
				i_110_ = i_109_;
				this.anIntArray2645[i_111_] = i_107_;
				this.anIntArray2646[i_111_] = i_108_;
				this.anIntArray2680[i_111_] = i_109_;
			}
			if (i_112_ == 2) {
				i_108_ = i_109_;
				i_109_ = class91_sub9.method648((byte) -56) + i_110_;
				i_110_ = i_109_;
				this.anIntArray2645[i_111_] = i_107_;
				this.anIntArray2646[i_111_] = i_108_;
				this.anIntArray2680[i_111_] = i_109_;
			}
			if (i_112_ == 3) {
				i_107_ = i_109_;
				i_109_ = class91_sub9.method648((byte) -38) + i_110_;
				i_110_ = i_109_;
				this.anIntArray2645[i_111_] = i_107_;
				this.anIntArray2646[i_111_] = i_108_;
				this.anIntArray2680[i_111_] = i_109_;
			}
			if (i_112_ == 4) {
				final int i_113_ = i_107_;
				i_107_ = i_108_;
				i_108_ = i_113_;
				i_109_ = class91_sub9.method648((byte) -90) + i_110_;
				i_110_ = i_109_;
				this.anIntArray2645[i_111_] = i_107_;
				this.anIntArray2646[i_111_] = i_113_;
				this.anIntArray2680[i_111_] = i_109_;
			}
		}
		class91_sub9.currentOffset = i_94_ * 565881095;
		for (int i_114_ = 0; i_114_ < i_74_; i_114_++) {
			this.aByteArray2656[i_114_] = (byte) 0;
			this.aShortArray2657[i_114_] = (short) class91_sub9.method686((byte) -44);
			this.aShortArray2658[i_114_] = (short) class91_sub9.method686((byte) -7);
			this.aShortArray2681[i_114_] = (short) class91_sub9.method686((byte) -48);
		}
		if (this.aByteArray2651 != null) {
			boolean var46 = false;
			for (int i_115_ = 0; i_115_ < i_73_; i_115_++) {
				final int i_116_ = this.aByteArray2651[i_115_] & 0xff;
				if (i_116_ != 255) {
					if ((this.aShortArray2657[i_116_] & 0xffff) == this.anIntArray2645[i_115_] && (this.aShortArray2658[i_116_] & 0xffff) == this.anIntArray2646[i_115_] && (this.aShortArray2681[i_116_] & 0xffff) == this.anIntArray2680[i_115_]) {
						this.aByteArray2651[i_115_] = (byte) -1;
					} else {
						var46 = true;
					}
				}
			}
			if (!var46) {
				this.aByteArray2651 = null;
			}
		}
		if (!bool_68_) {
			this.aShortArray2653 = null;
		}
		if (!bool) {
			this.aByteArray2686 = null;
		}
	}

	public Class91_Sub20_Sub14_Sub2(final Class91_Sub20_Sub14_Sub2[] class91_sub20_sub14_sub2s, final int i) {
		boolean bool = false;
		boolean bool_117_ = false;
		boolean bool_118_ = false;
		boolean bool_119_ = false;
		boolean bool_120_ = false;
		boolean bool_121_ = false;
		this.anInt2664 = 0;
		this.anInt2662 = 0;
		this.anInt2672 = 0;
		this.aByte2654 = (byte) -1;
		for (int i_122_ = 0; i_122_ < i; i_122_++) {
			final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_123_ = class91_sub20_sub14_sub2s[i_122_];
			if (class91_sub20_sub14_sub2_123_ != null) {
				this.anInt2664 += class91_sub20_sub14_sub2_123_.anInt2664;
				this.anInt2662 += class91_sub20_sub14_sub2_123_.anInt2662;
				this.anInt2672 += class91_sub20_sub14_sub2_123_.anInt2672;
				if (class91_sub20_sub14_sub2_123_.aByteArray2649 != null) {
					bool_117_ = true;
				} else {
					if (this.aByte2654 == -1) {
						this.aByte2654 = class91_sub20_sub14_sub2_123_.aByte2654;
					}
					if (this.aByte2654 != class91_sub20_sub14_sub2_123_.aByte2654) {
						bool_117_ = true;
					}
				}
				bool = bool | class91_sub20_sub14_sub2_123_.aByteArray2686 != null;
				bool_118_ = bool_118_ | class91_sub20_sub14_sub2_123_.aByteArray2650 != null;
				bool_119_ = bool_119_ | class91_sub20_sub14_sub2_123_.anIntArray2668 != null;
				bool_120_ = bool_120_ | class91_sub20_sub14_sub2_123_.aShortArray2653 != null;
				bool_121_ = bool_121_ | class91_sub20_sub14_sub2_123_.aByteArray2651 != null;
			}
		}
		this.anIntArray2641 = new int[this.anInt2664];
		this.anIntArray2642 = new int[this.anInt2664];
		this.anIntArray2643 = new int[this.anInt2664];
		this.anIntArray2667 = new int[this.anInt2664];
		this.anIntArray2645 = new int[this.anInt2662];
		this.anIntArray2646 = new int[this.anInt2662];
		this.anIntArray2680 = new int[this.anInt2662];
		if (bool) {
			this.aByteArray2686 = new byte[this.anInt2662];
		}
		if (bool_117_) {
			this.aByteArray2649 = new byte[this.anInt2662];
		}
		if (bool_118_) {
			this.aByteArray2650 = new byte[this.anInt2662];
		}
		if (bool_119_) {
			this.anIntArray2668 = new int[this.anInt2662];
		}
		if (bool_120_) {
			this.aShortArray2653 = new short[this.anInt2662];
		}
		if (bool_121_) {
			this.aByteArray2651 = new byte[this.anInt2662];
		}
		this.aShortArray2644 = new short[this.anInt2662];
		if (this.anInt2672 > 0) {
			this.aByteArray2656 = new byte[this.anInt2672];
			this.aShortArray2657 = new short[this.anInt2672];
			this.aShortArray2658 = new short[this.anInt2672];
			this.aShortArray2681 = new short[this.anInt2672];
			this.aShortArray2648 = new short[this.anInt2672];
			this.aShortArray2661 = new short[this.anInt2672];
			this.aShortArray2660 = new short[this.anInt2672];
			this.aShortArray2663 = new short[this.anInt2672];
			this.aByteArray2666 = new byte[this.anInt2672];
			this.aShortArray2685 = new short[this.anInt2672];
			this.aShortArray2665 = new short[this.anInt2672];
		}
		this.anInt2664 = 0;
		this.anInt2662 = 0;
		this.anInt2672 = 0;
		for (int i_124_ = 0; i_124_ < i; i_124_++) {
			final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_125_ = class91_sub20_sub14_sub2s[i_124_];
			if (class91_sub20_sub14_sub2_125_ != null) {
				for (int i_126_ = 0; i_126_ < class91_sub20_sub14_sub2_125_.anInt2662; i_126_++) {
					if (bool && class91_sub20_sub14_sub2_125_.aByteArray2686 != null) {
						this.aByteArray2686[this.anInt2662] = class91_sub20_sub14_sub2_125_.aByteArray2686[i_126_];
					}
					if (bool_117_) {
						if (class91_sub20_sub14_sub2_125_.aByteArray2649 != null) {
							this.aByteArray2649[this.anInt2662] = class91_sub20_sub14_sub2_125_.aByteArray2649[i_126_];
						} else {
							this.aByteArray2649[this.anInt2662] = class91_sub20_sub14_sub2_125_.aByte2654;
						}
					}
					if (bool_118_ && class91_sub20_sub14_sub2_125_.aByteArray2650 != null) {
						this.aByteArray2650[this.anInt2662] = class91_sub20_sub14_sub2_125_.aByteArray2650[i_126_];
					}
					if (bool_119_ && class91_sub20_sub14_sub2_125_.anIntArray2668 != null) {
						this.anIntArray2668[this.anInt2662] = class91_sub20_sub14_sub2_125_.anIntArray2668[i_126_];
					}
					if (bool_120_) {
						if (class91_sub20_sub14_sub2_125_.aShortArray2653 != null) {
							this.aShortArray2653[this.anInt2662] = class91_sub20_sub14_sub2_125_.aShortArray2653[i_126_];
						} else {
							this.aShortArray2653[this.anInt2662] = (short) -1;
						}
					}
					if (bool_121_) {
						if (class91_sub20_sub14_sub2_125_.aByteArray2651 != null && class91_sub20_sub14_sub2_125_.aByteArray2651[i_126_] != -1) {
							this.aByteArray2651[this.anInt2662] = (byte) (class91_sub20_sub14_sub2_125_.aByteArray2651[i_126_] + this.anInt2672);
						} else {
							this.aByteArray2651[this.anInt2662] = (byte) -1;
						}
					}
					this.aShortArray2644[this.anInt2662] = class91_sub20_sub14_sub2_125_.aShortArray2644[i_126_];
					this.anIntArray2645[this.anInt2662] = method950(class91_sub20_sub14_sub2_125_, class91_sub20_sub14_sub2_125_.anIntArray2645[i_126_]);
					this.anIntArray2646[this.anInt2662] = method950(class91_sub20_sub14_sub2_125_, class91_sub20_sub14_sub2_125_.anIntArray2646[i_126_]);
					this.anIntArray2680[this.anInt2662] = method950(class91_sub20_sub14_sub2_125_, class91_sub20_sub14_sub2_125_.anIntArray2680[i_126_]);
					this.anInt2662++;
				}
				for (int i_127_ = 0; i_127_ < class91_sub20_sub14_sub2_125_.anInt2672; i_127_++) {
					final byte i_128_ = this.aByteArray2656[this.anInt2672] = class91_sub20_sub14_sub2_125_.aByteArray2656[i_127_];
					if (i_128_ == 0) {
						this.aShortArray2657[this.anInt2672] = (short) method950(class91_sub20_sub14_sub2_125_, class91_sub20_sub14_sub2_125_.aShortArray2657[i_127_]);
						this.aShortArray2658[this.anInt2672] = (short) method950(class91_sub20_sub14_sub2_125_, class91_sub20_sub14_sub2_125_.aShortArray2658[i_127_]);
						this.aShortArray2681[this.anInt2672] = (short) method950(class91_sub20_sub14_sub2_125_, class91_sub20_sub14_sub2_125_.aShortArray2681[i_127_]);
					}
					if (i_128_ >= 1 && i_128_ <= 3) {
						this.aShortArray2657[this.anInt2672] = class91_sub20_sub14_sub2_125_.aShortArray2657[i_127_];
						this.aShortArray2658[this.anInt2672] = class91_sub20_sub14_sub2_125_.aShortArray2658[i_127_];
						this.aShortArray2681[this.anInt2672] = class91_sub20_sub14_sub2_125_.aShortArray2681[i_127_];
						this.aShortArray2648[this.anInt2672] = class91_sub20_sub14_sub2_125_.aShortArray2648[i_127_];
						this.aShortArray2661[this.anInt2672] = class91_sub20_sub14_sub2_125_.aShortArray2661[i_127_];
						this.aShortArray2660[this.anInt2672] = class91_sub20_sub14_sub2_125_.aShortArray2660[i_127_];
						this.aShortArray2663[this.anInt2672] = class91_sub20_sub14_sub2_125_.aShortArray2663[i_127_];
						this.aByteArray2666[this.anInt2672] = class91_sub20_sub14_sub2_125_.aByteArray2666[i_127_];
						this.aShortArray2685[this.anInt2672] = class91_sub20_sub14_sub2_125_.aShortArray2685[i_127_];
					}
					if (i_128_ == 2) {
						this.aShortArray2665[this.anInt2672] = class91_sub20_sub14_sub2_125_.aShortArray2665[i_127_];
					}
					this.anInt2672++;
				}
			}
		}
	}

	final int method950(final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_129_, final int i) {
		int i_130_ = -1;
		final int i_131_ = class91_sub20_sub14_sub2_129_.anIntArray2641[i];
		final int i_132_ = class91_sub20_sub14_sub2_129_.anIntArray2642[i];
		final int i_133_ = class91_sub20_sub14_sub2_129_.anIntArray2643[i];
		for (int var7 = 0; var7 < this.anInt2664; var7++) {
			if (i_131_ == this.anIntArray2641[var7] && i_132_ == this.anIntArray2642[var7] && i_133_ == this.anIntArray2643[var7]) {
				i_130_ = var7;
				break;
			}
		}
		if (i_130_ == -1) {
			this.anIntArray2641[this.anInt2664] = i_131_;
			this.anIntArray2642[this.anInt2664] = i_132_;
			this.anIntArray2643[this.anInt2664] = i_133_;
			if (class91_sub20_sub14_sub2_129_.anIntArray2667 != null) {
				this.anIntArray2667[this.anInt2664] = class91_sub20_sub14_sub2_129_.anIntArray2667[i];
			}
			i_130_ = this.anInt2664++;
		}
		return i_130_;
	}

	public Class91_Sub20_Sub14_Sub2(final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_134_, final boolean bool, final boolean bool_135_, final boolean bool_136_, final boolean bool_137_) {
		this.anInt2664 = class91_sub20_sub14_sub2_134_.anInt2664;
		this.anInt2662 = class91_sub20_sub14_sub2_134_.anInt2662;
		this.anInt2672 = class91_sub20_sub14_sub2_134_.anInt2672;
		if (bool) {
			this.anIntArray2641 = class91_sub20_sub14_sub2_134_.anIntArray2641;
			this.anIntArray2642 = class91_sub20_sub14_sub2_134_.anIntArray2642;
			this.anIntArray2643 = class91_sub20_sub14_sub2_134_.anIntArray2643;
		} else {
			this.anIntArray2641 = new int[this.anInt2664];
			this.anIntArray2642 = new int[this.anInt2664];
			this.anIntArray2643 = new int[this.anInt2664];
			for (int var6 = 0; var6 < this.anInt2664; var6++) {
				this.anIntArray2641[var6] = class91_sub20_sub14_sub2_134_.anIntArray2641[var6];
				this.anIntArray2642[var6] = class91_sub20_sub14_sub2_134_.anIntArray2642[var6];
				this.anIntArray2643[var6] = class91_sub20_sub14_sub2_134_.anIntArray2643[var6];
			}
		}
		if (bool_135_) {
			this.aShortArray2644 = class91_sub20_sub14_sub2_134_.aShortArray2644;
		} else {
			this.aShortArray2644 = new short[this.anInt2662];
			for (int var6 = 0; var6 < this.anInt2662; var6++) {
				this.aShortArray2644[var6] = class91_sub20_sub14_sub2_134_.aShortArray2644[var6];
			}
		}
		if (!bool_136_ && class91_sub20_sub14_sub2_134_.aShortArray2653 != null) {
			this.aShortArray2653 = new short[this.anInt2662];
			for (int var6 = 0; var6 < this.anInt2662; var6++) {
				this.aShortArray2653[var6] = class91_sub20_sub14_sub2_134_.aShortArray2653[var6];
			}
		} else {
			this.aShortArray2653 = class91_sub20_sub14_sub2_134_.aShortArray2653;
		}
		if (bool_137_) {
			this.aByteArray2650 = class91_sub20_sub14_sub2_134_.aByteArray2650;
		} else {
			this.aByteArray2650 = new byte[this.anInt2662];
			if (class91_sub20_sub14_sub2_134_.aByteArray2650 == null) {
				for (int var6 = 0; var6 < this.anInt2662; var6++) {
					this.aByteArray2650[var6] = (byte) 0;
				}
			} else {
				for (int var6 = 0; var6 < this.anInt2662; var6++) {
					this.aByteArray2650[var6] = class91_sub20_sub14_sub2_134_.aByteArray2650[var6];
				}
			}
		}
		this.anIntArray2645 = class91_sub20_sub14_sub2_134_.anIntArray2645;
		this.anIntArray2646 = class91_sub20_sub14_sub2_134_.anIntArray2646;
		this.anIntArray2680 = class91_sub20_sub14_sub2_134_.anIntArray2680;
		this.aByteArray2686 = class91_sub20_sub14_sub2_134_.aByteArray2686;
		this.aByteArray2649 = class91_sub20_sub14_sub2_134_.aByteArray2649;
		this.aByteArray2651 = class91_sub20_sub14_sub2_134_.aByteArray2651;
		this.aByte2654 = class91_sub20_sub14_sub2_134_.aByte2654;
		this.aByteArray2656 = class91_sub20_sub14_sub2_134_.aByteArray2656;
		this.aShortArray2657 = class91_sub20_sub14_sub2_134_.aShortArray2657;
		this.aShortArray2658 = class91_sub20_sub14_sub2_134_.aShortArray2658;
		this.aShortArray2681 = class91_sub20_sub14_sub2_134_.aShortArray2681;
		this.aShortArray2648 = class91_sub20_sub14_sub2_134_.aShortArray2648;
		this.aShortArray2661 = class91_sub20_sub14_sub2_134_.aShortArray2661;
		this.aShortArray2660 = class91_sub20_sub14_sub2_134_.aShortArray2660;
		this.aShortArray2663 = class91_sub20_sub14_sub2_134_.aShortArray2663;
		this.aByteArray2666 = class91_sub20_sub14_sub2_134_.aByteArray2666;
		this.aShortArray2685 = class91_sub20_sub14_sub2_134_.aShortArray2685;
		this.aShortArray2665 = class91_sub20_sub14_sub2_134_.aShortArray2665;
		this.anIntArray2667 = class91_sub20_sub14_sub2_134_.anIntArray2667;
		this.anIntArray2668 = class91_sub20_sub14_sub2_134_.anIntArray2668;
		this.anIntArrayArray2652 = class91_sub20_sub14_sub2_134_.anIntArrayArray2652;
		this.anIntArrayArray2670 = class91_sub20_sub14_sub2_134_.anIntArrayArray2670;
		this.aClass32Array2647 = class91_sub20_sub14_sub2_134_.aClass32Array2647;
		this.aClass40Array2671 = class91_sub20_sub14_sub2_134_.aClass40Array2671;
		this.aClass32Array2673 = class91_sub20_sub14_sub2_134_.aClass32Array2673;
		aShort2674 = class91_sub20_sub14_sub2_134_.aShort2674;
		aShort2675 = class91_sub20_sub14_sub2_134_.aShort2675;
	}

	public Class91_Sub20_Sub14_Sub2 method951() {
		final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_138_ = new Class91_Sub20_Sub14_Sub2();
		if (this.aByteArray2686 != null) {
			class91_sub20_sub14_sub2_138_.aByteArray2686 = new byte[this.anInt2662];
			for (int var2 = 0; var2 < this.anInt2662; var2++) {
				class91_sub20_sub14_sub2_138_.aByteArray2686[var2] = this.aByteArray2686[var2];
			}
		}
		class91_sub20_sub14_sub2_138_.anInt2664 = this.anInt2664;
		class91_sub20_sub14_sub2_138_.anInt2662 = this.anInt2662;
		class91_sub20_sub14_sub2_138_.anInt2672 = this.anInt2672;
		class91_sub20_sub14_sub2_138_.anIntArray2641 = this.anIntArray2641;
		class91_sub20_sub14_sub2_138_.anIntArray2642 = this.anIntArray2642;
		class91_sub20_sub14_sub2_138_.anIntArray2643 = this.anIntArray2643;
		class91_sub20_sub14_sub2_138_.anIntArray2645 = this.anIntArray2645;
		class91_sub20_sub14_sub2_138_.anIntArray2646 = this.anIntArray2646;
		class91_sub20_sub14_sub2_138_.anIntArray2680 = this.anIntArray2680;
		class91_sub20_sub14_sub2_138_.aByteArray2649 = this.aByteArray2649;
		class91_sub20_sub14_sub2_138_.aByteArray2650 = this.aByteArray2650;
		class91_sub20_sub14_sub2_138_.aByteArray2651 = this.aByteArray2651;
		class91_sub20_sub14_sub2_138_.aShortArray2644 = this.aShortArray2644;
		class91_sub20_sub14_sub2_138_.aShortArray2653 = this.aShortArray2653;
		class91_sub20_sub14_sub2_138_.aByte2654 = this.aByte2654;
		class91_sub20_sub14_sub2_138_.aByteArray2656 = this.aByteArray2656;
		class91_sub20_sub14_sub2_138_.aShortArray2657 = this.aShortArray2657;
		class91_sub20_sub14_sub2_138_.aShortArray2658 = this.aShortArray2658;
		class91_sub20_sub14_sub2_138_.aShortArray2681 = this.aShortArray2681;
		class91_sub20_sub14_sub2_138_.aShortArray2648 = this.aShortArray2648;
		class91_sub20_sub14_sub2_138_.aShortArray2661 = this.aShortArray2661;
		class91_sub20_sub14_sub2_138_.aShortArray2660 = this.aShortArray2660;
		class91_sub20_sub14_sub2_138_.aShortArray2663 = this.aShortArray2663;
		class91_sub20_sub14_sub2_138_.aByteArray2666 = this.aByteArray2666;
		class91_sub20_sub14_sub2_138_.aShortArray2685 = this.aShortArray2685;
		class91_sub20_sub14_sub2_138_.aShortArray2665 = this.aShortArray2665;
		class91_sub20_sub14_sub2_138_.anIntArray2667 = this.anIntArray2667;
		class91_sub20_sub14_sub2_138_.anIntArray2668 = this.anIntArray2668;
		class91_sub20_sub14_sub2_138_.anIntArrayArray2652 = this.anIntArrayArray2652;
		class91_sub20_sub14_sub2_138_.anIntArrayArray2670 = this.anIntArrayArray2670;
		class91_sub20_sub14_sub2_138_.aClass32Array2647 = this.aClass32Array2647;
		class91_sub20_sub14_sub2_138_.aClass40Array2671 = this.aClass40Array2671;
		class91_sub20_sub14_sub2_138_.aShort2674 = aShort2674;
		class91_sub20_sub14_sub2_138_.aShort2675 = aShort2675;
		return class91_sub20_sub14_sub2_138_;
	}

	public Class91_Sub20_Sub14_Sub2 method952(final int[][] is, final int i, final int i_139_, final int i_140_, final boolean bool, final int i_141_) {
		method969();
		int i_142_ = i + this.anInt2678;
		int i_143_ = i + this.anInt2669;
		int i_144_ = i_140_ + this.anInt2655;
		int i_145_ = i_140_ + this.anInt2640;
		if (i_142_ >= 0 && i_143_ + 128 >> 7 < is.length && i_144_ >= 0 && i_145_ + 128 >> 7 < is[0].length) {
			i_142_ >>= 7;
			i_143_ = i_143_ + 127 >> 7;
			i_144_ >>= 7;
			i_145_ = i_145_ + 127 >> 7;
			if (is[i_142_][i_144_] == i_139_ && is[i_143_][i_144_] == i_139_ && is[i_142_][i_145_] == i_139_ && is[i_143_][i_145_] == i_139_) {
				return this;
			}
			Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_146_;
			if (bool) {
				class91_sub20_sub14_sub2_146_ = new Class91_Sub20_Sub14_Sub2();
				class91_sub20_sub14_sub2_146_.anInt2664 = this.anInt2664;
				class91_sub20_sub14_sub2_146_.anInt2662 = this.anInt2662;
				class91_sub20_sub14_sub2_146_.anInt2672 = this.anInt2672;
				class91_sub20_sub14_sub2_146_.anIntArray2641 = this.anIntArray2641;
				class91_sub20_sub14_sub2_146_.anIntArray2643 = this.anIntArray2643;
				class91_sub20_sub14_sub2_146_.anIntArray2645 = this.anIntArray2645;
				class91_sub20_sub14_sub2_146_.anIntArray2646 = this.anIntArray2646;
				class91_sub20_sub14_sub2_146_.anIntArray2680 = this.anIntArray2680;
				class91_sub20_sub14_sub2_146_.aByteArray2686 = this.aByteArray2686;
				class91_sub20_sub14_sub2_146_.aByteArray2649 = this.aByteArray2649;
				class91_sub20_sub14_sub2_146_.aByteArray2650 = this.aByteArray2650;
				class91_sub20_sub14_sub2_146_.aByteArray2651 = this.aByteArray2651;
				class91_sub20_sub14_sub2_146_.aShortArray2644 = this.aShortArray2644;
				class91_sub20_sub14_sub2_146_.aShortArray2653 = this.aShortArray2653;
				class91_sub20_sub14_sub2_146_.aByte2654 = this.aByte2654;
				class91_sub20_sub14_sub2_146_.aByteArray2656 = this.aByteArray2656;
				class91_sub20_sub14_sub2_146_.aShortArray2657 = this.aShortArray2657;
				class91_sub20_sub14_sub2_146_.aShortArray2658 = this.aShortArray2658;
				class91_sub20_sub14_sub2_146_.aShortArray2681 = this.aShortArray2681;
				class91_sub20_sub14_sub2_146_.aShortArray2648 = this.aShortArray2648;
				class91_sub20_sub14_sub2_146_.aShortArray2661 = this.aShortArray2661;
				class91_sub20_sub14_sub2_146_.aShortArray2660 = this.aShortArray2660;
				class91_sub20_sub14_sub2_146_.aShortArray2663 = this.aShortArray2663;
				class91_sub20_sub14_sub2_146_.aByteArray2666 = this.aByteArray2666;
				class91_sub20_sub14_sub2_146_.aShortArray2685 = this.aShortArray2685;
				class91_sub20_sub14_sub2_146_.aShortArray2665 = this.aShortArray2665;
				class91_sub20_sub14_sub2_146_.anIntArray2667 = this.anIntArray2667;
				class91_sub20_sub14_sub2_146_.anIntArray2668 = this.anIntArray2668;
				class91_sub20_sub14_sub2_146_.anIntArrayArray2652 = this.anIntArrayArray2652;
				class91_sub20_sub14_sub2_146_.anIntArrayArray2670 = this.anIntArrayArray2670;
				class91_sub20_sub14_sub2_146_.aShort2674 = aShort2674;
				class91_sub20_sub14_sub2_146_.aShort2675 = aShort2675;
				class91_sub20_sub14_sub2_146_.anIntArray2642 = new int[class91_sub20_sub14_sub2_146_.anInt2664];
			} else {
				class91_sub20_sub14_sub2_146_ = this;
			}
			if (i_141_ == 0) {
				for (int i_147_ = 0; i_147_ < class91_sub20_sub14_sub2_146_.anInt2664; i_147_++) {
					final int i_148_ = this.anIntArray2641[i_147_] + i;
					final int i_149_ = this.anIntArray2643[i_147_] + i_140_;
					final int i_150_ = i_148_ & 0x7f;
					final int i_151_ = i_149_ & 0x7f;
					final int i_152_ = i_148_ >> 7;
					final int i_153_ = i_149_ >> 7;
					final int i_154_ = is[i_152_][i_153_] * (128 - i_150_) + is[i_152_ + 1][i_153_] * i_150_ >> 7;
					final int i_155_ = is[i_152_][i_153_ + 1] * (128 - i_150_) + is[i_152_ + 1][i_153_ + 1] * i_150_ >> 7;
					final int i_156_ = i_154_ * (128 - i_151_) + i_155_ * i_151_ >> 7;
					class91_sub20_sub14_sub2_146_.anIntArray2642[i_147_] = this.anIntArray2642[i_147_] + i_156_ - i_139_;
				}
			} else {
				for (int i_157_ = 0; i_157_ < class91_sub20_sub14_sub2_146_.anInt2664; i_157_++) {
					final int i_158_ = (-this.anIntArray2642[i_157_] << 16) / (anInt2488 * 1142621617);
					if (i_158_ < i_141_) {
						final int i_159_ = this.anIntArray2641[i_157_] + i;
						final int i_160_ = this.anIntArray2643[i_157_] + i_140_;
						final int i_161_ = i_159_ & 0x7f;
						final int i_162_ = i_160_ & 0x7f;
						final int i_163_ = i_159_ >> 7;
						final int i_164_ = i_160_ >> 7;
						final int i_165_ = is[i_163_][i_164_] * (128 - i_161_) + is[i_163_ + 1][i_164_] * i_161_ >> 7;
						final int i_166_ = is[i_163_][i_164_ + 1] * (128 - i_161_) + is[i_163_ + 1][i_164_ + 1] * i_161_ >> 7;
						final int var22 = i_165_ * (128 - i_162_) + i_166_ * i_162_ >> 7;
						class91_sub20_sub14_sub2_146_.anIntArray2642[i_157_] = this.anIntArray2642[i_157_] + (var22 - i_139_) * (i_141_ - i_158_) / i_141_;
					}
				}
			}
			class91_sub20_sub14_sub2_146_.method959();
			return class91_sub20_sub14_sub2_146_;
		}
		return this;
	}

	Class91_Sub20_Sub14_Sub2(final byte[] is) {
		if (is[is.length - 1] == -1 && is[is.length - 2] == -1) {
			method948(is);
		} else {
			method949(is);
		}
	}

	public void method953() {
		for (int i = 0; i < this.anInt2664; i++) {
			final int i_167_ = this.anIntArray2641[i];
			this.anIntArray2641[i] = this.anIntArray2643[i];
			this.anIntArray2643[i] = -i_167_;
		}
		method959();
	}

	public void method954() {
		for (int i = 0; i < this.anInt2664; i++) {
			this.anIntArray2641[i] = -this.anIntArray2641[i];
			this.anIntArray2643[i] = -this.anIntArray2643[i];
		}
		method959();
	}

	public void method955() {
		for (int i = 0; i < this.anInt2664; i++) {
			final int i_168_ = this.anIntArray2643[i];
			this.anIntArray2643[i] = this.anIntArray2641[i];
			this.anIntArray2641[i] = -i_168_;
		}
		method959();
	}

	public static Class91_Sub20_Sub14_Sub2 method956(final Js5 class63, final int i, final int i_169_) {
		final byte[] is = class63.getFile(i, i_169_, -1731197953);
		return is == null ? null : new Class91_Sub20_Sub14_Sub2(is);
	}

	public void method957(final int i, final int i_170_, final int i_171_) {
		for (int i_172_ = 0; i_172_ < this.anInt2664; i_172_++) {
			this.anIntArray2641[i_172_] += i;
			this.anIntArray2642[i_172_] += i_170_;
			this.anIntArray2643[i_172_] += i_171_;
		}
		method959();
	}

	public void method958(final int i) {
		final int i_173_ = anIntArray2679[i];
		final int i_174_ = anIntArray2659[i];
		for (int i_175_ = 0; i_175_ < this.anInt2664; i_175_++) {
			final int i_176_ = this.anIntArray2643[i_175_] * i_173_ + this.anIntArray2641[i_175_] * i_174_ >> 16;
			this.anIntArray2643[i_175_] = this.anIntArray2643[i_175_] * i_174_ - this.anIntArray2641[i_175_] * i_173_ >> 16;
			this.anIntArray2641[i_175_] = i_176_;
		}
		method959();
	}

	void method959() {
		this.aClass32Array2647 = null;
		this.aClass32Array2673 = null;
		this.aClass40Array2671 = null;
		this.aBoolean2676 = false;
	}

	static void method960(final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2, final Class91_Sub20_Sub14_Sub2 class91_sub20_sub14_sub2_177_, final int i, final int i_178_, final int i_179_, final boolean bool) {
		class91_sub20_sub14_sub2.method969();
		class91_sub20_sub14_sub2.method965();
		class91_sub20_sub14_sub2_177_.method969();
		class91_sub20_sub14_sub2_177_.method965();
		anInt2684++;
		int i_180_ = 0;
		final int[] is = class91_sub20_sub14_sub2_177_.anIntArray2641;
		final int i_181_ = class91_sub20_sub14_sub2_177_.anInt2664;
		for (int i_182_ = 0; i_182_ < class91_sub20_sub14_sub2.anInt2664; i_182_++) {
			final Class32 class32 = class91_sub20_sub14_sub2.aClass32Array2647[i_182_];
			if (class32.anInt372 * -2017589611 != 0) {
				final int i_183_ = class91_sub20_sub14_sub2.anIntArray2642[i_182_] - i_178_;
				if (i_183_ <= class91_sub20_sub14_sub2_177_.anInt2677) {
					final int i_184_ = class91_sub20_sub14_sub2.anIntArray2641[i_182_] - i;
					if (i_184_ >= class91_sub20_sub14_sub2_177_.anInt2678 && i_184_ <= class91_sub20_sub14_sub2_177_.anInt2669) {
						final int i_185_ = class91_sub20_sub14_sub2.anIntArray2643[i_182_] - i_179_;
						if (i_185_ >= class91_sub20_sub14_sub2_177_.anInt2655 && i_185_ <= class91_sub20_sub14_sub2_177_.anInt2640) {
							for (int i_186_ = 0; i_186_ < i_181_; i_186_++) {
								final Class32 class32_187_ = class91_sub20_sub14_sub2_177_.aClass32Array2647[i_186_];
								if (i_184_ == is[i_186_] && i_185_ == class91_sub20_sub14_sub2_177_.anIntArray2643[i_186_] && i_183_ == class91_sub20_sub14_sub2_177_.anIntArray2642[i_186_] && class32_187_.anInt372 * -2017589611 != 0) {
									if (class91_sub20_sub14_sub2.aClass32Array2673 == null) {
										class91_sub20_sub14_sub2.aClass32Array2673 = new Class32[class91_sub20_sub14_sub2.anInt2664];
									}
									if (class91_sub20_sub14_sub2_177_.aClass32Array2673 == null) {
										class91_sub20_sub14_sub2_177_.aClass32Array2673 = new Class32[i_181_];
									}
									Class32 class32_188_ = class91_sub20_sub14_sub2.aClass32Array2673[i_182_];
									if (class32_188_ == null) {
										class32_188_ = class91_sub20_sub14_sub2.aClass32Array2673[i_182_] = new Class32(class32);
									}
									Class32 var17 = class91_sub20_sub14_sub2_177_.aClass32Array2673[i_186_];
									if (var17 == null) {
										var17 = class91_sub20_sub14_sub2_177_.aClass32Array2673[i_186_] = new Class32(class32_187_);
									}
									class32_188_.anInt371 += class32_187_.anInt371 * 1;
									class32_188_.anInt370 += class32_187_.anInt370 * 1;
									class32_188_.anInt369 += class32_187_.anInt369 * 1;
									class32_188_.anInt372 += class32_187_.anInt372 * 1;
									var17.anInt371 += class32.anInt371 * 1;
									var17.anInt370 += class32.anInt370 * 1;
									var17.anInt369 += class32.anInt369 * 1;
									var17.anInt372 += class32.anInt372 * 1;
									i_180_++;
									anIntArray2682[i_182_] = anInt2684;
									anIntArray2683[i_186_] = anInt2684;
								}
							}
						}
					}
				}
			}
		}
		if (i_180_ >= 3 && bool) {
			for (int i_189_ = 0; i_189_ < class91_sub20_sub14_sub2.anInt2662; i_189_++) {
				if (anIntArray2682[class91_sub20_sub14_sub2.anIntArray2645[i_189_]] == anInt2684 && anIntArray2682[class91_sub20_sub14_sub2.anIntArray2646[i_189_]] == anInt2684 && anIntArray2682[class91_sub20_sub14_sub2.anIntArray2680[i_189_]] == anInt2684) {
					if (class91_sub20_sub14_sub2.aByteArray2686 == null) {
						class91_sub20_sub14_sub2.aByteArray2686 = new byte[class91_sub20_sub14_sub2.anInt2662];
					}
					class91_sub20_sub14_sub2.aByteArray2686[i_189_] = (byte) 2;
				}
			}
			for (int i_190_ = 0; i_190_ < class91_sub20_sub14_sub2_177_.anInt2662; i_190_++) {
				if (anIntArray2683[class91_sub20_sub14_sub2_177_.anIntArray2645[i_190_]] == anInt2684 && anIntArray2683[class91_sub20_sub14_sub2_177_.anIntArray2646[i_190_]] == anInt2684 && anIntArray2683[class91_sub20_sub14_sub2_177_.anIntArray2680[i_190_]] == anInt2684) {
					if (class91_sub20_sub14_sub2_177_.aByteArray2686 == null) {
						class91_sub20_sub14_sub2_177_.aByteArray2686 = new byte[class91_sub20_sub14_sub2_177_.anInt2662];
					}
					class91_sub20_sub14_sub2_177_.aByteArray2686[i_190_] = (byte) 2;
				}
			}
		}
	}

	static final int method961(final int i, int i_191_) {
		i_191_ = i_191_ * (i & 0x7f) >> 7;
		if (i_191_ < 2) {
			i_191_ = 2;
		} else if (i_191_ > 126) {
			i_191_ = 126;
		}
		return (i & 0xff80) + i_191_;
	}

	static final int method962(int i) {
		if (i < 2) {
			i = 2;
		} else if (i > 126) {
			i = 126;
		}
		return i;
	}

	public void method963(final short i, final short i_192_) {
		for (int i_193_ = 0; i_193_ < this.anInt2662; i_193_++) {
			if (this.aShortArray2644[i_193_] == i) {
				this.aShortArray2644[i_193_] = i_192_;
			}
		}
	}

	public void method964(final short i, final short i_194_) {
		if (this.aShortArray2653 != null) {
			for (int var3 = 0; var3 < this.anInt2662; var3++) {
				if (this.aShortArray2653[var3] == i) {
					this.aShortArray2653[var3] = i_194_;
				}
			}
		}
	}

	public void method965() {
		if (this.aClass32Array2647 == null) {
			this.aClass32Array2647 = new Class32[this.anInt2664];
			for (int i = 0; i < this.anInt2664; i++) {
				this.aClass32Array2647[i] = new Class32();
			}
			for (int i = 0; i < this.anInt2662; i++) {
				final int i_195_ = this.anIntArray2645[i];
				final int i_196_ = this.anIntArray2646[i];
				final int i_197_ = this.anIntArray2680[i];
				final int i_198_ = this.anIntArray2641[i_196_] - this.anIntArray2641[i_195_];
				final int i_199_ = this.anIntArray2642[i_196_] - this.anIntArray2642[i_195_];
				final int i_200_ = this.anIntArray2643[i_196_] - this.anIntArray2643[i_195_];
				final int i_201_ = this.anIntArray2641[i_197_] - this.anIntArray2641[i_195_];
				final int i_202_ = this.anIntArray2642[i_197_] - this.anIntArray2642[i_195_];
				final int i_203_ = this.anIntArray2643[i_197_] - this.anIntArray2643[i_195_];
				int i_204_ = i_199_ * i_203_ - i_202_ * i_200_;
				int i_205_ = i_200_ * i_201_ - i_203_ * i_198_;
				int i_206_;
				for (i_206_ = i_198_ * i_202_ - i_201_ * i_199_; i_204_ > 8192 || i_205_ > 8192 || i_206_ > 8192 || i_204_ < -8192 || i_205_ < -8192 || i_206_ < -8192; i_206_ >>= 1) {
					i_204_ >>= 1;
					i_205_ >>= 1;
				}
				int i_207_ = (int) Math.sqrt(i_204_ * i_204_ + i_205_ * i_205_ + i_206_ * i_206_);
				if (i_207_ <= 0) {
					i_207_ = 1;
				}
				i_204_ = i_204_ * 256 / i_207_;
				i_205_ = i_205_ * 256 / i_207_;
				i_206_ = i_206_ * 256 / i_207_;
				byte i_208_;
				if (this.aByteArray2686 == null) {
					i_208_ = (byte) 0;
				} else {
					i_208_ = this.aByteArray2686[i];
				}
				if (i_208_ == 0) {
					Class32 class32 = this.aClass32Array2647[i_195_];
					class32.anInt371 += i_204_ * 1148087395;
					class32.anInt370 += i_205_ * 2011234571;
					class32.anInt369 += i_206_ * -401734673;
					class32.anInt372 += 1921750205;
					class32 = this.aClass32Array2647[i_196_];
					class32.anInt371 += i_204_ * 1148087395;
					class32.anInt370 += i_205_ * 2011234571;
					class32.anInt369 += i_206_ * -401734673;
					class32.anInt372 += 1921750205;
					class32 = this.aClass32Array2647[i_197_];
					class32.anInt371 += i_204_ * 1148087395;
					class32.anInt370 += i_205_ * 2011234571;
					class32.anInt369 += i_206_ * -401734673;
					class32.anInt372 += 1921750205;
				} else if (i_208_ == 1) {
					if (this.aClass40Array2671 == null) {
						this.aClass40Array2671 = new Class40[this.anInt2662];
					}
					final Class40 var17 = this.aClass40Array2671[i] = new Class40();
					var17.anInt542 = i_204_ * 1032593631;
					var17.anInt540 = i_205_ * 843776333;
					var17.anInt545 = i_206_ * 1711875307;
				}
			}
		}
	}

	public void method966() {
		for (int i = 0; i < this.anInt2664; i++) {
			this.anIntArray2643[i] = -this.anIntArray2643[i];
		}
		for (int i = 0; i < this.anInt2662; i++) {
			final int i_209_ = this.anIntArray2645[i];
			this.anIntArray2645[i] = this.anIntArray2680[i];
			this.anIntArray2680[i] = i_209_;
		}
		method959();
	}

	public final Class91_Sub20_Sub14_Sub3 method967(final int i, final int i_210_, final int i_211_, final int i_212_, final int i_213_) {
		method965();
		final int i_214_ = (int) Math.sqrt(i_211_ * i_211_ + i_212_ * i_212_ + i_213_ * i_213_);
		final int i_215_ = i_210_ * i_214_ >> 8;
		final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3 = new Class91_Sub20_Sub14_Sub3();
		class91_sub20_sub14_sub3.anIntArray2738 = new int[this.anInt2662];
		class91_sub20_sub14_sub3.anIntArray2700 = new int[this.anInt2662];
		class91_sub20_sub14_sub3.anIntArray2701 = new int[this.anInt2662];
		if (this.anInt2672 > 0 && this.aByteArray2651 != null) {
			final int[] is = new int[this.anInt2672];
			for (int i_216_ = 0; i_216_ < this.anInt2662; i_216_++) {
				if (this.aByteArray2651[i_216_] != -1) {
					is[this.aByteArray2651[i_216_] & 0xff]++;
				}
			}
			class91_sub20_sub14_sub3.anInt2739 = 0;
			for (int i_217_ = 0; i_217_ < this.anInt2672; i_217_++) {
				if (is[i_217_] > 0 && this.aByteArray2656[i_217_] == 0) {
					class91_sub20_sub14_sub3.anInt2739++;
				}
			}
			class91_sub20_sub14_sub3.anIntArray2717 = new int[class91_sub20_sub14_sub3.anInt2739];
			class91_sub20_sub14_sub3.anIntArray2709 = new int[class91_sub20_sub14_sub3.anInt2739];
			class91_sub20_sub14_sub3.anIntArray2710 = new int[class91_sub20_sub14_sub3.anInt2739];
			int i_218_ = 0;
			for (int i_219_ = 0; i_219_ < this.anInt2672; i_219_++) {
				if (is[i_219_] > 0 && this.aByteArray2656[i_219_] == 0) {
					class91_sub20_sub14_sub3.anIntArray2717[i_218_] = this.aShortArray2657[i_219_] & 0xffff;
					class91_sub20_sub14_sub3.anIntArray2709[i_218_] = this.aShortArray2658[i_219_] & 0xffff;
					class91_sub20_sub14_sub3.anIntArray2710[i_218_] = this.aShortArray2681[i_219_] & 0xffff;
					is[i_219_] = i_218_++;
				} else {
					is[i_219_] = -1;
				}
			}
			class91_sub20_sub14_sub3.aByteArray2704 = new byte[this.anInt2662];
			for (int i_220_ = 0; i_220_ < this.anInt2662; i_220_++) {
				if (this.aByteArray2651[i_220_] != -1) {
					class91_sub20_sub14_sub3.aByteArray2704[i_220_] = (byte) is[this.aByteArray2651[i_220_] & 0xff];
				} else {
					class91_sub20_sub14_sub3.aByteArray2704[i_220_] = (byte) -1;
				}
			}
		}
		for (int i_221_ = 0; i_221_ < this.anInt2662; i_221_++) {
			byte i_222_;
			if (this.aByteArray2686 == null) {
				i_222_ = (byte) 0;
			} else {
				i_222_ = this.aByteArray2686[i_221_];
			}
			byte i_223_;
			if (this.aByteArray2650 == null) {
				i_223_ = (byte) 0;
			} else {
				i_223_ = this.aByteArray2650[i_221_];
			}
			short i_224_;
			if (this.aShortArray2653 == null) {
				i_224_ = (short) -1;
			} else {
				i_224_ = this.aShortArray2653[i_221_];
			}
			if (i_223_ == -2) {
				i_222_ = (byte) 3;
			}
			if (i_223_ == -1) {
				i_222_ = (byte) 2;
			}
			if (i_224_ == -1) {
				if (i_222_ == 0) {
					final int i_225_ = this.aShortArray2644[i_221_] & 0xffff;
					Class32 class32;
					if (this.aClass32Array2673 != null && this.aClass32Array2673[this.anIntArray2645[i_221_]] != null) {
						class32 = this.aClass32Array2673[this.anIntArray2645[i_221_]];
					} else {
						class32 = this.aClass32Array2647[this.anIntArray2645[i_221_]];
					}
					int i_226_ = i + (i_211_ * class32.anInt371 * -1652591285 + i_212_ * class32.anInt370 * 1981203107 + i_213_ * class32.anInt369 * -559576305) / (i_215_ * class32.anInt372 * -2017589611);
					class91_sub20_sub14_sub3.anIntArray2738[i_221_] = method961(i_225_, i_226_);
					if (this.aClass32Array2673 != null && this.aClass32Array2673[this.anIntArray2646[i_221_]] != null) {
						class32 = this.aClass32Array2673[this.anIntArray2646[i_221_]];
					} else {
						class32 = this.aClass32Array2647[this.anIntArray2646[i_221_]];
					}
					i_226_ = i + (i_211_ * class32.anInt371 * -1652591285 + i_212_ * class32.anInt370 * 1981203107 + i_213_ * class32.anInt369 * -559576305) / (i_215_ * class32.anInt372 * -2017589611);
					class91_sub20_sub14_sub3.anIntArray2700[i_221_] = method961(i_225_, i_226_);
					if (this.aClass32Array2673 != null && this.aClass32Array2673[this.anIntArray2680[i_221_]] != null) {
						class32 = this.aClass32Array2673[this.anIntArray2680[i_221_]];
					} else {
						class32 = this.aClass32Array2647[this.anIntArray2680[i_221_]];
					}
					i_226_ = i + (i_211_ * class32.anInt371 * -1652591285 + i_212_ * class32.anInt370 * 1981203107 + i_213_ * class32.anInt369 * -559576305) / (i_215_ * class32.anInt372 * -2017589611);
					class91_sub20_sub14_sub3.anIntArray2701[i_221_] = method961(i_225_, i_226_);
				} else if (i_222_ == 1) {
					final Class40 class40 = this.aClass40Array2671[i_221_];
					final int i_227_ = i + (i_211_ * class40.anInt542 * -889218273 + i_212_ * class40.anInt540 * 23076741 + i_213_ * class40.anInt545 * -1866046525) / (i_215_ + i_215_ / 2);
					class91_sub20_sub14_sub3.anIntArray2738[i_221_] = method961(this.aShortArray2644[i_221_] & 0xffff, i_227_);
					class91_sub20_sub14_sub3.anIntArray2701[i_221_] = -1;
				} else if (i_222_ == 3) {
					class91_sub20_sub14_sub3.anIntArray2738[i_221_] = 128;
					class91_sub20_sub14_sub3.anIntArray2701[i_221_] = -1;
				} else {
					class91_sub20_sub14_sub3.anIntArray2701[i_221_] = -2;
				}
			} else if (i_222_ == 0) {
				Class32 class32;
				if (this.aClass32Array2673 != null && this.aClass32Array2673[this.anIntArray2645[i_221_]] != null) {
					class32 = this.aClass32Array2673[this.anIntArray2645[i_221_]];
				} else {
					class32 = this.aClass32Array2647[this.anIntArray2645[i_221_]];
				}
				int i_228_ = i + (i_211_ * class32.anInt371 * -1652591285 + i_212_ * class32.anInt370 * 1981203107 + i_213_ * class32.anInt369 * -559576305) / (i_215_ * class32.anInt372 * -2017589611);
				class91_sub20_sub14_sub3.anIntArray2738[i_221_] = method962(i_228_);
				if (this.aClass32Array2673 != null && this.aClass32Array2673[this.anIntArray2646[i_221_]] != null) {
					class32 = this.aClass32Array2673[this.anIntArray2646[i_221_]];
				} else {
					class32 = this.aClass32Array2647[this.anIntArray2646[i_221_]];
				}
				i_228_ = i + (i_211_ * class32.anInt371 * -1652591285 + i_212_ * class32.anInt370 * 1981203107 + i_213_ * class32.anInt369 * -559576305) / (i_215_ * class32.anInt372 * -2017589611);
				class91_sub20_sub14_sub3.anIntArray2700[i_221_] = method962(i_228_);
				if (this.aClass32Array2673 != null && this.aClass32Array2673[this.anIntArray2680[i_221_]] != null) {
					class32 = this.aClass32Array2673[this.anIntArray2680[i_221_]];
				} else {
					class32 = this.aClass32Array2647[this.anIntArray2680[i_221_]];
				}
				i_228_ = i + (i_211_ * class32.anInt371 * -1652591285 + i_212_ * class32.anInt370 * 1981203107 + i_213_ * class32.anInt369 * -559576305) / (i_215_ * class32.anInt372 * -2017589611);
				class91_sub20_sub14_sub3.anIntArray2701[i_221_] = method962(i_228_);
			} else if (i_222_ == 1) {
				final Class40 class40 = this.aClass40Array2671[i_221_];
				final int i_229_ = i + (i_211_ * class40.anInt542 * -889218273 + i_212_ * class40.anInt540 * 23076741 + i_213_ * class40.anInt545 * -1866046525) / (i_215_ + i_215_ / 2);
				class91_sub20_sub14_sub3.anIntArray2738[i_221_] = method962(i_229_);
				class91_sub20_sub14_sub3.anIntArray2701[i_221_] = -1;
			} else {
				class91_sub20_sub14_sub3.anIntArray2701[i_221_] = -2;
			}
		}
		method947();
		class91_sub20_sub14_sub3.anInt2698 = this.anInt2664;
		class91_sub20_sub14_sub3.anIntArray2692 = this.anIntArray2641;
		class91_sub20_sub14_sub3.anIntArray2693 = this.anIntArray2642;
		class91_sub20_sub14_sub3.anIntArray2694 = this.anIntArray2643;
		class91_sub20_sub14_sub3.anInt2695 = this.anInt2662;
		class91_sub20_sub14_sub3.anIntArray2719 = this.anIntArray2645;
		class91_sub20_sub14_sub3.anIntArray2706 = this.anIntArray2646;
		class91_sub20_sub14_sub3.anIntArray2687 = this.anIntArray2680;
		class91_sub20_sub14_sub3.aByteArray2733 = this.aByteArray2649;
		class91_sub20_sub14_sub3.aByteArray2703 = this.aByteArray2650;
		class91_sub20_sub14_sub3.aByte2743 = this.aByte2654;
		class91_sub20_sub14_sub3.anIntArrayArray2711 = this.anIntArrayArray2652;
		class91_sub20_sub14_sub3.anIntArrayArray2696 = this.anIntArrayArray2670;
		class91_sub20_sub14_sub3.aShortArray2705 = this.aShortArray2653;
		return class91_sub20_sub14_sub3;
	}

	public void method968(final int i, final int i_230_, final int i_231_) {
		for (int i_232_ = 0; i_232_ < this.anInt2664; i_232_++) {
			this.anIntArray2641[i_232_] = this.anIntArray2641[i_232_] * i / 128;
			this.anIntArray2642[i_232_] = this.anIntArray2642[i_232_] * i_230_ / 128;
			this.anIntArray2643[i_232_] = this.anIntArray2643[i_232_] * i_231_ / 128;
		}
		method959();
	}

	void method969() {
		if (!this.aBoolean2676) {
			anInt2488 = 0;
			this.anInt2677 = 0;
			this.anInt2678 = 999999;
			this.anInt2669 = -999999;
			this.anInt2640 = -99999;
			this.anInt2655 = 99999;
			for (int i = 0; i < this.anInt2664; i++) {
				final int i_233_ = this.anIntArray2641[i];
				final int i_234_ = this.anIntArray2642[i];
				final int var4 = this.anIntArray2643[i];
				if (i_233_ < this.anInt2678) {
					this.anInt2678 = i_233_;
				}
				if (i_233_ > this.anInt2669) {
					this.anInt2669 = i_233_;
				}
				if (var4 < this.anInt2655) {
					this.anInt2655 = var4;
				}
				if (var4 > this.anInt2640) {
					this.anInt2640 = var4;
				}
				if (-i_234_ > anInt2488 * 1142621617) {
					anInt2488 = -i_234_ * -882105519;
				}
				if (i_234_ > this.anInt2677) {
					this.anInt2677 = i_234_;
				}
			}
			this.aBoolean2676 = true;
		}
	}

	Class91_Sub20_Sub14_Sub2() {
		/* empty */
	}
}
