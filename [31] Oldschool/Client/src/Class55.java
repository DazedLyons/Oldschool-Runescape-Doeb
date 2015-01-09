/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class55 {
	static final int anInt646 = 0;
	static final int anInt647 = 50;
	static final int anInt648 = 4096;
	static final int anInt649 = 16;
	static final int anInt650 = 1;
	static final int anInt651 = 6;
	static final int anInt652 = 23;
	static Class56 aClass56_653 = new Class56();

	Class55() throws Throwable {
		throw new Error();
	}

	static void method377(final Class56 class56) {
		byte i = class56.aByte674;
		int i_0_ = class56.anInt668 * -1212426393;
		int i_1_ = class56.anInt672 * -673470027;
		int i_2_ = class56.anInt693 * 1625224557;
		final int[] is = Class105.anIntArray1367;
		int i_3_ = class56.anInt673 * 1551340297;
		final byte[] is_4_ = class56.aByteArray676;
		int i_5_ = class56.anInt659 * -1345314595;
		int i_6_ = class56.anInt655 * 1511185185;
		final int i_7_ = class56.anInt691 * 882943527 + 1;
		while_11_: for (;;) {
			if (i_0_ > 0) {
				for (;;) {
					if (i_6_ == 0) {
						break while_11_;
					}
					if (i_0_ == 1) {
						if (i_6_ == 0) {
							i_0_ = 1;
						} else {
							is_4_[i_5_] = i;
							i_5_++;
							i_6_--;
							break;
						}
						break while_11_;
					}
					is_4_[i_5_] = i;
					i_0_--;
					i_5_++;
					i_6_--;
				}
			}
			boolean bool = true;
			while (bool) {
				bool = false;
				if (i_1_ == i_7_) {
					i_0_ = 0;
					break while_11_;
				}
				i = (byte) i_2_;
				i_3_ = is[i_3_];
				final int i_8_ = (byte) (i_3_ & 0xff);
				i_3_ >>= 8;
				i_1_++;
				if (i_8_ != i_2_) {
					i_2_ = i_8_;
					if (i_6_ == 0) {
						i_0_ = 1;
						break while_11_;
					}
					is_4_[i_5_] = i;
					i_5_++;
					i_6_--;
					bool = true;
				} else if (i_1_ == i_7_) {
					if (i_6_ == 0) {
						i_0_ = 1;
						break while_11_;
					}
					is_4_[i_5_] = i;
					i_5_++;
					i_6_--;
					bool = true;
				}
			}
			i_0_ = 2;
			i_3_ = is[i_3_];
			int i_9_ = (byte) (i_3_ & 0xff);
			i_3_ >>= 8;
			if (++i_1_ != i_7_) {
				if (i_9_ != i_2_) {
					i_2_ = i_9_;
				} else {
					i_0_ = 3;
					i_3_ = is[i_3_];
					i_9_ = (byte) (i_3_ & 0xff);
					i_3_ >>= 8;
					if (++i_1_ != i_7_) {
						if (i_9_ != i_2_) {
							i_2_ = i_9_;
						} else {
							i_3_ = is[i_3_];
							i_9_ = (byte) (i_3_ & 0xff);
							i_3_ >>= 8;
							i_1_++;
							i_0_ = (i_9_ & 0xff) + 4;
							i_3_ = is[i_3_];
							i_2_ = (byte) (i_3_ & 0xff);
							i_3_ >>= 8;
							i_1_++;
						}
					}
				}
			}
		}
		final int i_10_ = class56.anInt678 * 2145114069;
		class56.anInt678 += (i_6_ - i_6_) * -780359299;
		if (class56.anInt678 * 2145114069 >= i_10_) {
			/* empty */
		}
		class56.aByte674 = i;
		class56.anInt668 = i_0_ * 237261911;
		class56.anInt672 = i_1_ * 572573;
		class56.anInt693 = i_2_ * 527326309;
		Class105.anIntArray1367 = is;
		class56.anInt673 = i_3_ * 1626336057;
		class56.aByteArray676 = is_4_;
		class56.anInt659 = i_5_ * 1749006197;
		class56.anInt655 = i_6_ * 1198024929;
	}

	public static int method378(final byte[] is, int i, final byte[] is_11_, final int i_12_, final int i_13_) {
		final Class56 class56 = aClass56_653;
		synchronized (class56) {
			aClass56_653.aByteArray660 = is_11_;
			aClass56_653.anInt654 = i_13_ * -383256623;
			aClass56_653.aByteArray676 = is;
			aClass56_653.anInt659 = 0;
			aClass56_653.anInt655 = i * 1198024929;
			aClass56_653.anInt670 = 0;
			aClass56_653.anInt682 = 0;
			aClass56_653.anInt662 = 0;
			aClass56_653.anInt678 = 0;
			method380(aClass56_653);
			i -= aClass56_653.anInt655 * 1511185185;
			aClass56_653.aByteArray660 = null;
			aClass56_653.aByteArray676 = null;
			final int i_14_ = i;
			return i_14_;
		}
	}

	static byte method379(final Class56 class56) {
		return (byte) method384(1, class56);
	}

	static void method380(final Class56 class56) {
		int i = 0;
		int[] is = null;
		int[] is_15_ = null;
		int[] is_16_ = null;
		class56.anInt671 = 311952715;
		if (Class105.anIntArray1367 == null) {
			Class105.anIntArray1367 = new int[class56.anInt671 * 1394118624];
		}
		boolean bool = true;
		while (bool) {
			byte i_17_ = method383(class56);
			if (i_17_ == 23) {
				break;
			}
			i_17_ = method383(class56);
			i_17_ = method383(class56);
			i_17_ = method383(class56);
			i_17_ = method383(class56);
			i_17_ = method383(class56);
			i_17_ = method383(class56);
			i_17_ = method383(class56);
			i_17_ = method383(class56);
			i_17_ = method383(class56);
			i_17_ = method379(class56);
			if (i_17_ == 0) {
				/* empty */
			}
			class56.anInt689 = 0;
			int i_18_ = method383(class56);
			class56.anInt689 = (class56.anInt689 * -1411425561 << 8 | i_18_ & 0xff) * 307435735;
			i_18_ = method383(class56);
			class56.anInt689 = (class56.anInt689 * -1411425561 << 8 | i_18_ & 0xff) * 307435735;
			i_18_ = method383(class56);
			class56.anInt689 = (class56.anInt689 * -1411425561 << 8 | i_18_ & 0xff) * 307435735;
			for (int i_19_ = 0; i_19_ < 16; i_19_++) {
				i_17_ = method379(class56);
				if (i_17_ == 1) {
					class56.aBooleanArray680[i_19_] = true;
				} else {
					class56.aBooleanArray680[i_19_] = false;
				}
			}
			for (int i_20_ = 0; i_20_ < 256; i_20_++) {
				class56.aBooleanArray679[i_20_] = false;
			}
			for (int i_21_ = 0; i_21_ < 16; i_21_++) {
				if (class56.aBooleanArray680[i_21_]) {
					for (int i_22_ = 0; i_22_ < 16; i_22_++) {
						i_17_ = method379(class56);
						if (i_17_ == 1) {
							class56.aBooleanArray679[i_21_ * 16 + i_22_] = true;
						}
					}
				}
			}
			method381(class56);
			final int i_23_ = class56.anInt666 * -569315443 + 2;
			final int i_24_ = method384(3, class56);
			final int i_25_ = method384(15, class56);
			int i_26_ = 0;
			while (i_26_ < i_25_) {
				int i_27_ = 0;
				for (;;) {
					i_17_ = method379(class56);
					if (i_17_ == 0) {
						class56.aByteArray685[i_26_] = (byte) i_27_;
						i_26_++;
						break;
					}
					i_27_++;
				}
			}
			final byte[] is_28_ = new byte[6];
			byte i_29_ = 0;
			while (i_29_ < i_24_) {
				final byte[] is_30_ = is_28_;
				final int i_31_ = i_29_;
				final byte i_32_ = i_29_;
				i_29_ = (byte) (i_32_ + 1);
				is_30_[i_31_] = i_32_;
			}
			for (i_26_ = 0; i_26_ < i_25_; i_26_++) {
				i_29_ = class56.aByteArray685[i_26_];
				final byte i_33_ = is_28_[i_29_];
				for (/**/; i_29_ > 0; i_29_--) {
					is_28_[i_29_] = is_28_[i_29_ - 1];
				}
				is_28_[0] = i_33_;
				class56.aByteArray684[i_26_] = i_33_;
			}
			for (int i_34_ = 0; i_34_ < i_24_; i_34_++) {
				int i_35_ = method384(5, class56);
				i_26_ = 0;
				while (i_26_ < i_23_) {
					for (;;) {
						i_17_ = method379(class56);
						if (i_17_ == 0) {
							class56.aByteArrayArray686[i_34_][i_26_] = (byte) i_35_;
							i_26_++;
							break;
						}
						i_17_ = method379(class56);
						if (i_17_ == 0) {
							i_35_++;
						} else {
							i_35_--;
						}
					}
				}
			}
			for (int i_36_ = 0; i_36_ < i_24_; i_36_++) {
				int i_37_ = 32;
				byte i_38_ = 0;
				for (i_26_ = 0; i_26_ < i_23_; i_26_++) {
					if (class56.aByteArrayArray686[i_36_][i_26_] > i_38_) {
						i_38_ = class56.aByteArrayArray686[i_36_][i_26_];
					}
					if (class56.aByteArrayArray686[i_36_][i_26_] < i_37_) {
						i_37_ = class56.aByteArrayArray686[i_36_][i_26_];
					}
				}
				method382(class56.anIntArrayArray687[i_36_], class56.anIntArrayArray688[i_36_], class56.anIntArrayArray665[i_36_], class56.aByteArrayArray686[i_36_], i_37_, i_38_, i_23_);
				class56.anIntArray690[i_36_] = i_37_;
			}
			final int i_39_ = class56.anInt666 * -569315443 + 1;
			int i_40_ = -1;
			int i_41_ = 0;
			for (i_26_ = 0; i_26_ <= 255; i_26_++) {
				class56.anIntArray675[i_26_] = 0;
			}
			int i_42_ = 4095;
			for (int i_43_ = 15; i_43_ >= 0; i_43_--) {
				for (int i_44_ = 15; i_44_ >= 0; i_44_--) {
					class56.aByteArray664[i_42_] = (byte) (i_43_ * 16 + i_44_);
					i_42_--;
				}
				class56.anIntArray683[i_43_] = i_42_ + 1;
			}
			int i_45_ = 0;
			if (i_41_ == 0) {
				i_40_++;
				i_41_ = 50;
				final byte i_46_ = class56.aByteArray684[i_40_];
				i = class56.anIntArray690[i_46_];
				is = class56.anIntArrayArray687[i_46_];
				is_16_ = class56.anIntArrayArray665[i_46_];
				is_15_ = class56.anIntArrayArray688[i_46_];
			}
			int i_47_ = i_41_ - 1;
			int i_48_ = i;
			int i_49_;
			int i_50_;
			for (i_50_ = method384(i, class56); i_50_ > is[i_48_]; i_50_ = i_50_ << 1 | i_49_) {
				i_48_++;
				i_49_ = method379(class56);
			}
			int i_51_ = is_16_[i_50_ - is_15_[i_48_]];
			while (i_51_ != i_39_) {
				if (i_51_ != 0 && i_51_ != 1) {
					int i_52_ = i_51_ - 1;
					if (i_52_ < 16) {
						final int i_53_ = class56.anIntArray683[0];
						i_17_ = class56.aByteArray664[i_53_ + i_52_];
						for (/**/; i_52_ > 3; i_52_ -= 4) {
							final int i_54_ = i_53_ + i_52_;
							class56.aByteArray664[i_54_] = class56.aByteArray664[i_54_ - 1];
							class56.aByteArray664[i_54_ - 1] = class56.aByteArray664[i_54_ - 2];
							class56.aByteArray664[i_54_ - 2] = class56.aByteArray664[i_54_ - 3];
							class56.aByteArray664[i_54_ - 3] = class56.aByteArray664[i_54_ - 4];
						}
						for (/**/; i_52_ > 0; i_52_--) {
							class56.aByteArray664[i_53_ + i_52_] = class56.aByteArray664[i_53_ + i_52_ - 1];
						}
						class56.aByteArray664[i_53_] = i_17_;
					} else {
						int i_55_ = i_52_ / 16;
						final int i_56_ = i_52_ % 16;
						int i_57_ = class56.anIntArray683[i_55_] + i_56_;
						i_17_ = class56.aByteArray664[i_57_];
						for (/**/; i_57_ > class56.anIntArray683[i_55_]; i_57_--) {
							class56.aByteArray664[i_57_] = class56.aByteArray664[i_57_ - 1];
						}
						class56.anIntArray683[i_55_]++;
						for (/**/; i_55_ > 0; i_55_--) {
							class56.anIntArray683[i_55_]--;
							class56.aByteArray664[class56.anIntArray683[i_55_]] = class56.aByteArray664[class56.anIntArray683[i_55_ - 1] + 16 - 1];
						}
						class56.anIntArray683[0]--;
						class56.aByteArray664[class56.anIntArray683[0]] = i_17_;
						if (class56.anIntArray683[0] == 0) {
							i_42_ = 4095;
							for (int i_58_ = 15; i_58_ >= 0; i_58_--) {
								for (int i_59_ = 15; i_59_ >= 0; i_59_--) {
									class56.aByteArray664[i_42_] = class56.aByteArray664[class56.anIntArray683[i_58_] + i_59_];
									i_42_--;
								}
								class56.anIntArray683[i_58_] = i_42_ + 1;
							}
						}
					}
					class56.anIntArray675[class56.aByteArray681[i_17_ & 0xff] & 0xff]++;
					Class105.anIntArray1367[i_45_] = class56.aByteArray681[i_17_ & 0xff] & 0xff;
					i_45_++;
					if (i_47_ == 0) {
						i_40_++;
						i_47_ = 50;
						final byte i_60_ = class56.aByteArray684[i_40_];
						i = class56.anIntArray690[i_60_];
						is = class56.anIntArrayArray687[i_60_];
						is_16_ = class56.anIntArrayArray665[i_60_];
						is_15_ = class56.anIntArrayArray688[i_60_];
					}
					i_47_--;
					i_48_ = i;
					for (i_50_ = method384(i, class56); i_50_ > is[i_48_]; i_50_ = i_50_ << 1 | i_49_) {
						i_48_++;
						i_49_ = method379(class56);
					}
					i_51_ = is_16_[i_50_ - is_15_[i_48_]];
				} else {
					int i_61_ = -1;
					int var48 = 1;
					do {
						if (i_51_ == 0) {
							i_61_ += 1 * var48;
						} else if (i_51_ == 1) {
							i_61_ += 2 * var48;
						}
						var48 *= 2;
						if (i_47_ == 0) {
							i_40_++;
							i_47_ = 50;
							final byte i_62_ = class56.aByteArray684[i_40_];
							i = class56.anIntArray690[i_62_];
							is = class56.anIntArrayArray687[i_62_];
							is_16_ = class56.anIntArrayArray665[i_62_];
							is_15_ = class56.anIntArrayArray688[i_62_];
						}
						i_47_--;
						i_48_ = i;
						for (i_50_ = method384(i, class56); i_50_ > is[i_48_]; i_50_ = i_50_ << 1 | i_49_) {
							i_48_++;
							i_49_ = method379(class56);
						}
						i_51_ = is_16_[i_50_ - is_15_[i_48_]];
					} while (i_51_ == 0 || i_51_ == 1);
					i_61_++;
					i_18_ = class56.aByteArray681[class56.aByteArray664[class56.anIntArray683[0]] & 0xff];
					class56.anIntArray675[i_18_ & 0xff] += i_61_;
					for (/**/; i_61_ > 0; i_61_--) {
						Class105.anIntArray1367[i_45_] = i_18_ & 0xff;
						i_45_++;
					}
				}
			}
			class56.anInt668 = 0;
			class56.aByte674 = (byte) 0;
			class56.anIntArray677[0] = 0;
			for (i_26_ = 1; i_26_ <= 256; i_26_++) {
				class56.anIntArray677[i_26_] = class56.anIntArray675[i_26_ - 1];
			}
			for (i_26_ = 1; i_26_ <= 256; i_26_++) {
				class56.anIntArray677[i_26_] += class56.anIntArray677[i_26_ - 1];
			}
			for (i_26_ = 0; i_26_ < i_45_; i_26_++) {
				i_18_ = (byte) (Class105.anIntArray1367[i_26_] & 0xff);
				Class105.anIntArray1367[class56.anIntArray677[i_18_ & 0xff]] |= i_26_ << 8;
				class56.anIntArray677[i_18_ & 0xff]++;
			}
			class56.anInt673 = (Class105.anIntArray1367[class56.anInt689 * -1411425561] >> 8) * 1626336057;
			class56.anInt672 = 0;
			class56.anInt673 = Class105.anIntArray1367[class56.anInt673 * 1551340297] * 1626336057;
			class56.anInt693 = (byte) (class56.anInt673 * 1551340297 & 0xff) * 527326309;
			class56.anInt673 = (class56.anInt673 * 1551340297 >> 8) * 1626336057;
			class56.anInt672 += 572573;
			class56.anInt691 = i_45_ * -316118633;
			method377(class56);
			if (class56.anInt672 * -673470027 == class56.anInt691 * 882943527 + 1 && class56.anInt668 * -1212426393 == 0) {
				bool = true;
			} else {
				bool = false;
			}
		}
	}

	static void method381(final Class56 class56) {
		class56.anInt666 = 0;
		for (int i = 0; i < 256; i++) {
			if (class56.aBooleanArray679[i]) {
				class56.aByteArray681[class56.anInt666 * -569315443] = (byte) i;
				class56.anInt666 += 619572037;
			}
		}
	}

	static void method382(final int[] is, final int[] is_63_, final int[] is_64_, final byte[] is_65_, final int i, final int i_66_, final int i_67_) {
		int i_68_ = 0;
		for (int i_69_ = i; i_69_ <= i_66_; i_69_++) {
			for (int i_70_ = 0; i_70_ < i_67_; i_70_++) {
				if (is_65_[i_70_] == i_69_) {
					is_64_[i_68_] = i_70_;
					i_68_++;
				}
			}
		}
		for (int i_71_ = 0; i_71_ < 23; i_71_++) {
			is_63_[i_71_] = 0;
		}
		for (int i_72_ = 0; i_72_ < i_67_; i_72_++) {
			is_63_[is_65_[i_72_] + 1]++;
		}
		for (int i_73_ = 1; i_73_ < 23; i_73_++) {
			is_63_[i_73_] += is_63_[i_73_ - 1];
		}
		for (int i_74_ = 0; i_74_ < 23; i_74_++) {
			is[i_74_] = 0;
		}
		int i_75_ = 0;
		for (int i_76_ = i; i_76_ <= i_66_; i_76_++) {
			i_75_ += is_63_[i_76_ + 1] - is_63_[i_76_];
			is[i_76_] = i_75_ - 1;
			i_75_ <<= 1;
		}
		for (int i_77_ = i + 1; i_77_ <= i_66_; i_77_++) {
			is_63_[i_77_] = (is[i_77_ - 1] + 1 << 1) - is_63_[i_77_];
		}
	}

	static byte method383(final Class56 class56) {
		return (byte) method384(8, class56);
	}

	static int method384(final int i, final Class56 class56) {
		while (class56.anInt670 * 1244068921 < i) {
			class56.anInt682 = (class56.anInt682 * 186377827 << 8 | class56.aByteArray660[class56.anInt654 * 192266545] & 0xff) * 1614924619;
			class56.anInt670 += -227438520;
			class56.anInt654 += -383256623;
			class56.anInt662 += 1895895469;
			if (class56.anInt662 * 1335654949 != 0) {
				/* empty */
			}
		}
		final int i_78_ = class56.anInt682 * 186377827 >> class56.anInt670 * 1244068921 - i & (1 << i) - 1;
		class56.anInt670 -= i * 1582182921;
		return i_78_;
	}
}
