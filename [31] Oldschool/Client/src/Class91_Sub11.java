/* Class91_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class91_Sub11 extends Class91 {
	Class91_Sub1_Sub1[] aClass91_Sub1_Sub1Array1872;
	int anInt1873;
	short[] aShortArray1874;
	byte[] aByteArray1875;
	static byte aByte1876;
	Class69[] aClass69Array1877;
	byte[] aByteArray1878;
	int[] anIntArray1879;
	public static final int anInt1880 = 53;
	public static final int anInt1881 = 32;
	byte[] aByteArray1882;
	public static final int anInt1883 = 8;
	public static final int anInt1884 = 40;

	boolean method701(final Class21 class21, final byte[] is, final int[] is_0_, final short i) {
		boolean bool;
		try {
			boolean bool_1_ = true;
			int i_2_ = 0;
			Class91_Sub1_Sub1 class91_sub1_sub1 = null;
			for (int i_3_ = 0; i_3_ < 128; i_3_++) {
				if (is == null || is[i_3_] != 0) {
					int i_4_ = this.anIntArray1879[i_3_];
					if (i_4_ != 0) {
						if (i_2_ != i_4_) {
							i_2_ = i_4_--;
							if ((i_4_ & 0x1) == 0) {
								class91_sub1_sub1 = class21.method206(i_4_ >> 2, is_0_, 1048172288);
							} else {
								class91_sub1_sub1 = class21.method203(i_4_ >> 2, is_0_, 1873289401);
							}
							if (class91_sub1_sub1 == null) {
								bool_1_ = false;
							}
						}
						if (class91_sub1_sub1 != null) {
							this.aClass91_Sub1_Sub1Array1872[i_3_] = class91_sub1_sub1;
							this.anIntArray1879[i_3_] = 0;
						}
					}
				}
			}
			bool = bool_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ed.w()");
		}
		return bool;
	}

	void method702(final int i) {
		try {
			this.anIntArray1879 = null;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "ed.f()");
		}
	}

	public static void method703(final Component component, final int i) {
		try {
			component.addMouseListener(Class12.aClass12_183);
			component.addMouseMotionListener(Class12.aClass12_183);
			component.addFocusListener(Class12.aClass12_183);
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "ed.i()");
		}
	}

	Class91_Sub11(final byte[] is) {
		try {
			this.aClass91_Sub1_Sub1Array1872 = new Class91_Sub1_Sub1[128];
			this.aShortArray1874 = new short[128];
			this.aByteArray1875 = new byte[128];
			this.aByteArray1882 = new byte[128];
			this.aClass69Array1877 = new Class69[128];
			this.aByteArray1878 = new byte[128];
			this.anIntArray1879 = new int[128];
			final ByteBuffer class91_sub9 = new ByteBuffer(is);
			int i;
			for (i = 0; class91_sub9.buffer[i + class91_sub9.currentOffset * -1128893257] != 0; i++) {
				/* empty */
			}
			final byte[] is_5_ = new byte[i];
			for (int i_6_ = 0; i_6_ < i; i_6_++) {
				is_5_[i_6_] = class91_sub9.method642(2019181018);
			}
			class91_sub9.currentOffset += 565881095;
			i++;
			int i_7_ = class91_sub9.currentOffset * -1128893257;
			class91_sub9.currentOffset += i * 565881095;
			int i_8_;
			for (i_8_ = 0; class91_sub9.buffer[-1128893257 * class91_sub9.currentOffset + i_8_] != 0; i_8_++) {
				/* empty */
			}
			final byte[] is_9_ = new byte[i_8_];
			for (int i_10_ = 0; i_10_ < i_8_; i_10_++) {
				is_9_[i_10_] = class91_sub9.method642(1978500759);
			}
			class91_sub9.currentOffset += 565881095;
			i_8_++;
			int i_11_ = -1128893257 * class91_sub9.currentOffset;
			class91_sub9.currentOffset += 565881095 * i_8_;
			int i_12_;
			for (i_12_ = 0; class91_sub9.buffer[-1128893257 * class91_sub9.currentOffset + i_12_] != 0; i_12_++) {
				/* empty */
			}
			final byte[] is_13_ = new byte[i_12_];
			for (int i_14_ = 0; i_14_ < i_12_; i_14_++) {
				is_13_[i_14_] = class91_sub9.method642(695652943);
			}
			class91_sub9.currentOffset += 565881095;
			final byte[] is_15_ = new byte[++i_12_];
			int i_16_;
			if (i_12_ > 1) {
				is_15_[1] = (byte) 1;
				int i_17_ = 1;
				i_16_ = 2;
				for (int i_18_ = 2; i_18_ < i_12_; i_18_++) {
					int i_19_ = class91_sub9.readUnsignedByte();
					if (i_19_ == 0) {
						i_17_ = i_16_++;
					} else {
						if (i_19_ <= i_17_) {
							i_19_--;
						}
						i_17_ = i_19_;
					}
					is_15_[i_18_] = (byte) i_17_;
				}
			} else {
				i_16_ = i_12_;
			}
			final Class69[] class69s = new Class69[i_16_];
			for (int i_20_ = 0; i_20_ < class69s.length; i_20_++) {
				final Class69 class69 = class69s[i_20_] = new Class69();
				int i_21_ = class91_sub9.readUnsignedByte();
				if (i_21_ > 0) {
					class69.aByteArray813 = new byte[i_21_ * 2];
				}
				i_21_ = class91_sub9.readUnsignedByte();
				if (i_21_ > 0) {
					class69.aByteArray810 = new byte[2 + 2 * i_21_];
					class69.aByteArray810[1] = (byte) 64;
				}
			}
			int i_22_ = class91_sub9.readUnsignedByte();
			final byte[] is_23_ = i_22_ > 0 ? new byte[i_22_ * 2] : null;
			i_22_ = class91_sub9.readUnsignedByte();
			final byte[] is_24_ = i_22_ > 0 ? new byte[i_22_ * 2] : null;
			int i_25_;
			for (i_25_ = 0; class91_sub9.buffer[i_25_ + class91_sub9.currentOffset * -1128893257] != 0; i_25_++) {
				/* empty */
			}
			final byte[] is_26_ = new byte[i_25_];
			for (int i_27_ = 0; i_27_ < i_25_; i_27_++) {
				is_26_[i_27_] = class91_sub9.method642(2050054275);
			}
			class91_sub9.currentOffset += 565881095;
			i_25_++;
			int i_28_ = 0;
			for (int i_29_ = 0; i_29_ < 128; i_29_++) {
				i_28_ += class91_sub9.readUnsignedByte();
				this.aShortArray1874[i_29_] = (short) i_28_;
			}
			i_28_ = 0;
			for (int i_30_ = 0; i_30_ < 128; i_30_++) {
				i_28_ += class91_sub9.readUnsignedByte();
				this.aShortArray1874[i_30_] = (short) (this.aShortArray1874[i_30_] + (i_28_ << 8));
			}
			int i_31_ = 0;
			int i_32_ = 0;
			int i_33_ = 0;
			for (int i_34_ = 0; i_34_ < 128; i_34_++) {
				if (i_31_ == 0) {
					if (i_32_ < is_26_.length) {
						i_31_ = is_26_[i_32_++];
					} else {
						i_31_ = -1;
					}
					i_33_ = class91_sub9.method650(-2038031047);
				}
				this.aShortArray1874[i_34_] = (short) (this.aShortArray1874[i_34_] + ((i_33_ - 1 & 0x2) << 14));
				this.anIntArray1879[i_34_] = i_33_;
				i_31_--;
			}
			i_31_ = 0;
			i_32_ = 0;
			int i_35_ = 0;
			for (int i_36_ = 0; i_36_ < 128; i_36_++) {
				if (this.anIntArray1879[i_36_] != 0) {
					if (i_31_ == 0) {
						if (i_32_ < is_5_.length) {
							i_31_ = is_5_[i_32_++];
						} else {
							i_31_ = -1;
						}
						i_35_ = class91_sub9.buffer[i_7_++] - 1;
					}
					this.aByteArray1878[i_36_] = (byte) i_35_;
					i_31_--;
				}
			}
			i_31_ = 0;
			i_32_ = 0;
			int i_37_ = 0;
			for (int i_38_ = 0; i_38_ < 128; i_38_++) {
				if (this.anIntArray1879[i_38_] != 0) {
					if (i_31_ == 0) {
						if (i_32_ < is_9_.length) {
							i_31_ = is_9_[i_32_++];
						} else {
							i_31_ = -1;
						}
						i_37_ = class91_sub9.buffer[i_11_++] + 16 << 2;
					}
					this.aByteArray1882[i_38_] = (byte) i_37_;
					i_31_--;
				}
			}
			i_31_ = 0;
			i_32_ = 0;
			Class69 class69 = null;
			for (int i_39_ = 0; i_39_ < 128; i_39_++) {
				if (this.anIntArray1879[i_39_] != 0) {
					if (i_31_ == 0) {
						class69 = class69s[is_15_[i_32_]];
						if (i_32_ < is_13_.length) {
							i_31_ = is_13_[i_32_++];
						} else {
							i_31_ = -1;
						}
					}
					this.aClass69Array1877[i_39_] = class69;
					i_31_--;
				}
			}
			i_31_ = 0;
			i_32_ = 0;
			int i_40_ = 0;
			for (int i_41_ = 0; i_41_ < 128; i_41_++) {
				if (i_31_ == 0) {
					if (i_32_ < is_26_.length) {
						i_31_ = is_26_[i_32_++];
					} else {
						i_31_ = -1;
					}
					if (this.anIntArray1879[i_41_] > 0) {
						i_40_ = class91_sub9.readUnsignedByte() + 1;
					}
				}
				this.aByteArray1875[i_41_] = (byte) i_40_;
				i_31_--;
			}
			this.anInt1873 = (class91_sub9.readUnsignedByte() + 1) * -764004795;
			for (int i_42_ = 0; i_42_ < i_16_; i_42_++) {
				final Class69 class69_43_ = class69s[i_42_];
				if (class69_43_.aByteArray813 != null) {
					for (int i_44_ = 1; i_44_ < class69_43_.aByteArray813.length; i_44_ += 2) {
						class69_43_.aByteArray813[i_44_] = class91_sub9.method642(1053481275);
					}
				}
				if (class69_43_.aByteArray810 != null) {
					for (int i_45_ = 3; i_45_ < class69_43_.aByteArray810.length - 2; i_45_ += 2) {
						class69_43_.aByteArray810[i_45_] = class91_sub9.method642(209401340);
					}
				}
			}
			if (is_23_ != null) {
				for (int i_46_ = 1; i_46_ < is_23_.length; i_46_ += 2) {
					is_23_[i_46_] = class91_sub9.method642(1308490926);
				}
			}
			if (is_24_ != null) {
				for (int i_47_ = 1; i_47_ < is_24_.length; i_47_ += 2) {
					is_24_[i_47_] = class91_sub9.method642(2063870767);
				}
			}
			for (int i_48_ = 0; i_48_ < i_16_; i_48_++) {
				final Class69 class69_49_ = class69s[i_48_];
				if (class69_49_.aByteArray810 != null) {
					i_28_ = 0;
					for (int i_50_ = 2; i_50_ < class69_49_.aByteArray810.length; i_50_ += 2) {
						i_28_ = i_28_ + 1 + class91_sub9.readUnsignedByte();
						class69_49_.aByteArray810[i_50_] = (byte) i_28_;
					}
				}
			}
			for (int i_51_ = 0; i_51_ < i_16_; i_51_++) {
				final Class69 class69_52_ = class69s[i_51_];
				if (class69_52_.aByteArray813 != null) {
					i_28_ = 0;
					for (int i_53_ = 2; i_53_ < class69_52_.aByteArray813.length; i_53_ += 2) {
						i_28_ = i_28_ + 1 + class91_sub9.readUnsignedByte();
						class69_52_.aByteArray813[i_53_] = (byte) i_28_;
					}
				}
			}
			if (is_23_ != null) {
				i_28_ = class91_sub9.readUnsignedByte();
				is_23_[0] = (byte) i_28_;
				for (int i_54_ = 2; i_54_ < is_23_.length; i_54_ += 2) {
					i_28_ = i_28_ + 1 + class91_sub9.readUnsignedByte();
					is_23_[i_54_] = (byte) i_28_;
				}
				int i_55_ = is_23_[0];
				int i_56_ = is_23_[1];
				for (int i_57_ = 0; i_57_ < i_55_; i_57_++) {
					this.aByteArray1875[i_57_] = (byte) (32 + this.aByteArray1875[i_57_] * i_56_ >> 6);
				}
				for (int i_58_ = 2; i_58_ < is_23_.length; i_58_ += 2) {
					final int i_59_ = is_23_[i_58_];
					final int i_60_ = is_23_[1 + i_58_];
					int i_61_ = (i_59_ - i_55_) * i_56_ + (i_59_ - i_55_) / 2;
					for (int i_62_ = i_55_; i_62_ < i_59_; i_62_++) {
						final int i_63_ = Class91_Sub13.method708(i_61_, i_59_ - i_55_, (byte) 27);
						this.aByteArray1875[i_62_] = (byte) (32 + this.aByteArray1875[i_62_] * i_63_ >> 6);
						i_61_ += i_60_ - i_56_;
					}
					i_55_ = i_59_;
					i_56_ = i_60_;
				}
				for (int i_64_ = i_55_; i_64_ < 128; i_64_++) {
					this.aByteArray1875[i_64_] = (byte) (i_56_ * this.aByteArray1875[i_64_] + 32 >> 6);
				}
			}
			if (is_24_ != null) {
				i_28_ = class91_sub9.readUnsignedByte();
				is_24_[0] = (byte) i_28_;
				for (int i_65_ = 2; i_65_ < is_24_.length; i_65_ += 2) {
					i_28_ = 1 + i_28_ + class91_sub9.readUnsignedByte();
					is_24_[i_65_] = (byte) i_28_;
				}
				int i_66_ = is_24_[0];
				int i_67_ = is_24_[1] << 1;
				for (int i_68_ = 0; i_68_ < i_66_; i_68_++) {
					int i_69_ = (this.aByteArray1882[i_68_] & 0xff) + i_67_;
					if (i_69_ < 0) {
						i_69_ = 0;
					}
					if (i_69_ > 128) {
						i_69_ = 128;
					}
					this.aByteArray1882[i_68_] = (byte) i_69_;
				}
				for (int i_70_ = 2; i_70_ < is_24_.length; i_70_ += 2) {
					final int i_71_ = is_24_[i_70_];
					final int i_72_ = is_24_[1 + i_70_] << 1;
					int i_73_ = (i_71_ - i_66_) * i_67_ + (i_71_ - i_66_) / 2;
					for (int i_74_ = i_66_; i_74_ < i_71_; i_74_++) {
						final int i_75_ = Class91_Sub13.method708(i_73_, i_71_ - i_66_, (byte) 25);
						int i_76_ = (this.aByteArray1882[i_74_] & 0xff) + i_75_;
						if (i_76_ < 0) {
							i_76_ = 0;
						}
						if (i_76_ > 128) {
							i_76_ = 128;
						}
						this.aByteArray1882[i_74_] = (byte) i_76_;
						i_73_ += i_72_ - i_67_;
					}
					i_66_ = i_71_;
					i_67_ = i_72_;
				}
				for (int i_77_ = i_66_; i_77_ < 128; i_77_++) {
					int i_78_ = i_67_ + (this.aByteArray1882[i_77_] & 0xff);
					if (i_78_ < 0) {
						i_78_ = 0;
					}
					if (i_78_ > 128) {
						i_78_ = 128;
					}
					this.aByteArray1882[i_77_] = (byte) i_78_;
				}
			}
			for (int i_79_ = 0; i_79_ < i_16_; i_79_++) {
				class69s[i_79_].anInt805 = class91_sub9.readUnsignedByte() * 439275651;
			}
			for (int i_80_ = 0; i_80_ < i_16_; i_80_++) {
				final Class69 class69_81_ = class69s[i_80_];
				if (class69_81_.aByteArray813 != null) {
					class69_81_.anInt806 = class91_sub9.readUnsignedByte() * 707843621;
				}
				if (class69_81_.aByteArray810 != null) {
					class69_81_.anInt807 = class91_sub9.readUnsignedByte() * -2046410415;
				}
				if (367787563 * class69_81_.anInt805 > 0) {
					class69_81_.anInt803 = class91_sub9.readUnsignedByte() * 2122200603;
				}
			}
			for (int i_82_ = 0; i_82_ < i_16_; i_82_++) {
				class69s[i_82_].anInt804 = class91_sub9.readUnsignedByte() * 1760545489;
			}
			for (int i_83_ = 0; i_83_ < i_16_; i_83_++) {
				final Class69 class69_84_ = class69s[i_83_];
				if (-200880591 * class69_84_.anInt804 > 0) {
					class69_84_.anInt809 = class91_sub9.readUnsignedByte() * -1778359521;
				}
			}
			for (int i_85_ = 0; i_85_ < i_16_; i_85_++) {
				final Class69 class69_86_ = class69s[i_85_];
				if (-662087457 * class69_86_.anInt809 > 0) {
					class69_86_.anInt811 = class91_sub9.readUnsignedByte() * 833159983;
				}
			}
		} catch (final RuntimeException var36) {
			throw Class102.method1086(var36, "ed.<init>()");
		}
	}
}
