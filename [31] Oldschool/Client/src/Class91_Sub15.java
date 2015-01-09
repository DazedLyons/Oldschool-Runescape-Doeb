/* Class91_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub15 extends Class91 {
	Class83 aClass83_1949;
	byte[] aByteArray1950;

	void method711() {
		this.aClass83_1949 = null;
	}

	void method712() {
		if (this.aClass83_1949 == null) {
			this.aClass83_1949 = new Class83(16);
			final int[] is = new int[16];
			final int[] is_0_ = new int[16];
			is_0_[9] = 128;
			is[9] = 128;
			final Class72 class72 = new Class72(this.aByteArray1950);
			final int i = class72.method439();
			for (int i_1_ = 0; i_1_ < i; i_1_++) {
				class72.method440(i_1_);
				class72.method442(i_1_);
				class72.method441(i_1_);
			}
			for (;;) {
				final int i_2_ = class72.method450();
				final int i_3_ = class72.anIntArray832[i_2_];
				while (class72.anIntArray832[i_2_] == i_3_) {
					class72.method440(i_2_);
					final int i_4_ = class72.method443(i_2_);
					if (i_4_ == 1) {
						class72.method449();
						class72.method441(i_2_);
						if (!class72.method447()) {
							break;
						}
						return;
					}
					final int i_5_ = i_4_ & 0xf0;
					if (i_5_ == 176) {
						final int i_6_ = i_4_ & 0xf;
						final int i_7_ = i_4_ >> 8 & 0x7f;
						final int i_8_ = i_4_ >> 16 & 0x7f;
						if (i_7_ == 0) {
							is[i_6_] = (is[i_6_] & ~0x1fc000) + (i_8_ << 14);
						}
						if (i_7_ == 32) {
							is[i_6_] = (is[i_6_] & ~0x3f80) + (i_8_ << 7);
						}
					}
					if (i_5_ == 192) {
						final int i_9_ = i_4_ & 0xf;
						final int i_10_ = i_4_ >> 8 & 0x7f;
						is_0_[i_9_] = is[i_9_] + i_10_;
					}
					if (i_5_ == 144) {
						final int i_11_ = i_4_ & 0xf;
						final int i_12_ = i_4_ >> 8 & 0x7f;
						final int i_13_ = i_4_ >> 16 & 0x7f;
						if (i_13_ > 0) {
							final int i_14_ = is_0_[i_11_];
							Class91_Sub19 var14 = (Class91_Sub19) this.aClass83_1949.method474(i_14_);
							if (var14 == null) {
								var14 = new Class91_Sub19(new byte[128]);
								this.aClass83_1949.method478(var14, i_14_);
							}
							var14.aByteArray2086[i_12_] = (byte) 1;
						}
					}
					class72.method442(i_2_);
					class72.method441(i_2_);
				}
			}
		}
	}

	Class91_Sub15(final ByteBuffer class91_sub9) {
		class91_sub9.currentOffset = (class91_sub9.buffer.length - 3) * 565881095;
		final int i = class91_sub9.readUnsignedByte();
		final int i_15_ = class91_sub9.method686((byte) -10);
		int i_16_ = 14 + i * 10;
		class91_sub9.currentOffset = 0;
		int i_17_ = 0;
		int i_18_ = 0;
		int i_19_ = 0;
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = 0;
		int i_23_ = 0;
		int i_24_ = 0;
		int i_25_ = 0;
		while (i_25_ < i) {
			int i_26_ = -1;
			for (;;) {
				final int i_27_ = class91_sub9.readUnsignedByte();
				if (i_27_ != i_26_) {
					i_16_++;
				}
				i_26_ = i_27_ & 0xf;
				if (i_27_ == 7) {
					i_25_++;
					break;
				}
				if (i_27_ == 23) {
					i_17_++;
				} else if (i_26_ == 0) {
					i_19_++;
				} else if (i_26_ == 1) {
					i_20_++;
				} else if (i_26_ == 2) {
					i_18_++;
				} else if (i_26_ == 3) {
					i_21_++;
				} else if (i_26_ == 4) {
					i_22_++;
				} else if (i_26_ == 5) {
					i_23_++;
				} else {
					if (i_26_ != 6) {
						throw new RuntimeException();
					}
					i_24_++;
				}
			}
		}
		i_16_ += 5 * i_17_;
		i_16_ += 2 * (i_19_ + i_20_ + i_18_ + i_21_ + i_23_);
		i_16_ += i_22_ + i_24_;
		i_25_ = class91_sub9.currentOffset * -1128893257;
		final int i_28_ = i + i_17_ + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_ + i_24_;
		for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
			class91_sub9.method650(-2061211968);
		}
		i_16_ += class91_sub9.currentOffset * -1128893257 - i_25_;
		int i_30_ = class91_sub9.currentOffset * -1128893257;
		int i_31_ = 0;
		int i_32_ = 0;
		int i_33_ = 0;
		int i_34_ = 0;
		int i_35_ = 0;
		int i_36_ = 0;
		int i_37_ = 0;
		int i_38_ = 0;
		int i_39_ = 0;
		int i_40_ = 0;
		int i_41_ = 0;
		int i_42_ = 0;
		int i_43_ = 0;
		for (int i_44_ = 0; i_44_ < i_18_; i_44_++) {
			i_43_ = i_43_ + class91_sub9.readUnsignedByte() & 0x7f;
			if (i_43_ != 0 && i_43_ != 32) {
				if (i_43_ == 1) {
					i_31_++;
				} else if (i_43_ == 33) {
					i_32_++;
				} else if (i_43_ == 7) {
					i_33_++;
				} else if (i_43_ == 39) {
					i_34_++;
				} else if (i_43_ == 10) {
					i_35_++;
				} else if (i_43_ == 42) {
					i_36_++;
				} else if (i_43_ == 99) {
					i_37_++;
				} else if (i_43_ == 98) {
					i_38_++;
				} else if (i_43_ == 101) {
					i_39_++;
				} else if (i_43_ == 100) {
					i_40_++;
				} else if (i_43_ != 64 && i_43_ != 65 && i_43_ != 120 && i_43_ != 121 && i_43_ != 123) {
					i_42_++;
				} else {
					i_41_++;
				}
			} else {
				i_24_++;
			}
		}
		int i_45_ = 0;
		int i_46_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_41_ * 565881095;
		int i_47_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_23_ * 565881095;
		int i_48_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_22_ * 565881095;
		int i_49_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_21_ * 565881095;
		int i_50_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_31_ * 565881095;
		int i_51_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_33_ * 565881095;
		int i_52_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_35_ * 565881095;
		int i_53_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += (i_19_ + i_20_ + i_23_) * 565881095;
		int i_54_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_19_ * 565881095;
		int i_55_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_42_ * 565881095;
		int i_56_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_20_ * 565881095;
		int i_57_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_32_ * 565881095;
		int i_58_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_34_ * 565881095;
		int i_59_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_36_ * 565881095;
		int i_60_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_24_ * 565881095;
		int i_61_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_21_ * 565881095;
		int i_62_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_37_ * 565881095;
		int i_63_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_38_ * 565881095;
		int i_64_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_39_ * 565881095;
		int i_65_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_40_ * 565881095;
		int i_66_ = class91_sub9.currentOffset * -1128893257;
		class91_sub9.currentOffset += i_17_ * 1697643285;
		this.aByteArray1950 = new byte[i_16_];
		final ByteBuffer class91_sub9_67_ = new ByteBuffer(this.aByteArray1950);
		class91_sub9_67_.writeDWord(1297377380);
		class91_sub9_67_.writeDWord(6);
		class91_sub9_67_.method681(i > 1 ? 1 : 0, -372694149);
		class91_sub9_67_.method681(i, -372694149);
		class91_sub9_67_.method681(i_15_, -372694149);
		class91_sub9.currentOffset = i_25_ * 565881095;
		int i_68_ = 0;
		int i_69_ = 0;
		int i_70_ = 0;
		int i_71_ = 0;
		int i_72_ = 0;
		int i_73_ = 0;
		int i_74_ = 0;
		final int[] is = new int[128];
		i_43_ = 0;
		int i_75_ = 0;
		while (i_75_ < i) {
			class91_sub9_67_.writeDWord(1297379947);
			class91_sub9_67_.currentOffset += -2031442916;
			final int i_76_ = class91_sub9_67_.currentOffset * -1128893257;
			int i_77_ = -1;
			for (;;) {
				final int i_78_ = class91_sub9.method650(-1317471964);
				class91_sub9_67_.method640(i_78_, (byte) -64);
				final int i_79_ = class91_sub9.buffer[i_45_++] & 0xff;
				final boolean bool = i_79_ != i_77_;
				i_77_ = i_79_ & 0xf;
				if (i_79_ == 7) {
					if (bool) {
						class91_sub9_67_.writeWordBigEndian(255);
					}
					class91_sub9_67_.writeWordBigEndian(47);
					class91_sub9_67_.writeWordBigEndian(0);
					class91_sub9_67_.method674(class91_sub9_67_.currentOffset * -1128893257 - i_76_, (byte) -36);
					i_75_++;
					break;
				}
				if (i_79_ == 23) {
					if (bool) {
						class91_sub9_67_.writeWordBigEndian(255);
					}
					class91_sub9_67_.writeWordBigEndian(81);
					class91_sub9_67_.writeWordBigEndian(3);
					class91_sub9_67_.writeWordBigEndian(class91_sub9.buffer[i_66_++]);
					class91_sub9_67_.writeWordBigEndian(class91_sub9.buffer[i_66_++]);
					class91_sub9_67_.writeWordBigEndian(class91_sub9.buffer[i_66_++]);
				} else {
					i_68_ ^= i_79_ >> 4;
					if (i_77_ == 0) {
						if (bool) {
							class91_sub9_67_.writeWordBigEndian(144 + i_68_);
						}
						i_69_ += class91_sub9.buffer[i_53_++];
						i_70_ += class91_sub9.buffer[i_54_++];
						class91_sub9_67_.writeWordBigEndian(i_69_ & 0x7f);
						class91_sub9_67_.writeWordBigEndian(i_70_ & 0x7f);
					} else if (i_77_ == 1) {
						if (bool) {
							class91_sub9_67_.writeWordBigEndian(128 + i_68_);
						}
						i_69_ += class91_sub9.buffer[i_53_++];
						i_71_ += class91_sub9.buffer[i_56_++];
						class91_sub9_67_.writeWordBigEndian(i_69_ & 0x7f);
						class91_sub9_67_.writeWordBigEndian(i_71_ & 0x7f);
					} else if (i_77_ == 2) {
						if (bool) {
							class91_sub9_67_.writeWordBigEndian(176 + i_68_);
						}
						i_43_ = i_43_ + class91_sub9.buffer[i_30_++] & 0x7f;
						class91_sub9_67_.writeWordBigEndian(i_43_);
						int i_80_;
						if (i_43_ != 0 && i_43_ != 32) {
							if (i_43_ == 1) {
								i_80_ = class91_sub9.buffer[i_50_++];
							} else if (i_43_ == 33) {
								i_80_ = class91_sub9.buffer[i_57_++];
							} else if (i_43_ == 7) {
								i_80_ = class91_sub9.buffer[i_51_++];
							} else if (i_43_ == 39) {
								i_80_ = class91_sub9.buffer[i_58_++];
							} else if (i_43_ == 10) {
								i_80_ = class91_sub9.buffer[i_52_++];
							} else if (i_43_ == 42) {
								i_80_ = class91_sub9.buffer[i_59_++];
							} else if (i_43_ == 99) {
								i_80_ = class91_sub9.buffer[i_62_++];
							} else if (i_43_ == 98) {
								i_80_ = class91_sub9.buffer[i_63_++];
							} else if (i_43_ == 101) {
								i_80_ = class91_sub9.buffer[i_64_++];
							} else if (i_43_ == 100) {
								i_80_ = class91_sub9.buffer[i_65_++];
							} else if (i_43_ != 64 && i_43_ != 65 && i_43_ != 120 && i_43_ != 121 && i_43_ != 123) {
								i_80_ = class91_sub9.buffer[i_55_++];
							} else {
								i_80_ = class91_sub9.buffer[i_46_++];
							}
						} else {
							i_80_ = class91_sub9.buffer[i_60_++];
						}
						final int i_81_ = i_80_ + is[i_43_];
						is[i_43_] = i_81_;
						class91_sub9_67_.writeWordBigEndian(i_81_ & 0x7f);
					} else if (i_77_ == 3) {
						if (bool) {
							class91_sub9_67_.writeWordBigEndian(224 + i_68_);
						}
						i_72_ += class91_sub9.buffer[i_61_++];
						i_72_ += class91_sub9.buffer[i_49_++] << 7;
						class91_sub9_67_.writeWordBigEndian(i_72_ & 0x7f);
						class91_sub9_67_.writeWordBigEndian(i_72_ >> 7 & 0x7f);
					} else if (i_77_ == 4) {
						if (bool) {
							class91_sub9_67_.writeWordBigEndian(208 + i_68_);
						}
						i_73_ += class91_sub9.buffer[i_48_++];
						class91_sub9_67_.writeWordBigEndian(i_73_ & 0x7f);
					} else if (i_77_ == 5) {
						if (bool) {
							class91_sub9_67_.writeWordBigEndian(160 + i_68_);
						}
						i_69_ += class91_sub9.buffer[i_53_++];
						i_74_ += class91_sub9.buffer[i_47_++];
						class91_sub9_67_.writeWordBigEndian(i_69_ & 0x7f);
						class91_sub9_67_.writeWordBigEndian(i_74_ & 0x7f);
					} else {
						if (i_77_ != 6) {
							throw new RuntimeException();
						}
						if (bool) {
							class91_sub9_67_.writeWordBigEndian(192 + i_68_);
						}
						class91_sub9_67_.writeWordBigEndian(class91_sub9.buffer[i_60_++]);
					}
				}
			}
		}
	}

	static Class91_Sub15 method713(final Js5 class63, final int i, final int i_82_) {
		final byte[] is = class63.getFile(i, i_82_, -839944993);
		return is == null ? null : new Class91_Sub15(new ByteBuffer(is));
	}
}
