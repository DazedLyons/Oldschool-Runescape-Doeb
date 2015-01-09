/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class53 {
	int[] anIntArray636;
	byte[] aByteArray637;
	int[] anIntArray638;

	public int method375(final byte[] is, int i, int i_0_, final byte[] is_1_, final int i_2_, final int i_3_) {
		int i_4_;
		try {
			int i_5_ = 0;
			int i_6_ = i_2_ << 3;
			for (i_0_ += i; i < i_0_; i++) {
				final int i_7_ = is[i] & 0xff;
				final int i_8_ = this.anIntArray638[i_7_];
				final int i_9_ = this.aByteArray637[i_7_];
				if (i_9_ == 0) {
					throw new RuntimeException("");
				}
				int i_10_ = i_6_ >> 3;
				int i_11_ = i_6_ & 0x7;
				i_5_ &= -i_11_ >> 31;
				final int i_12_ = (i_9_ + i_11_ - 1 >> 3) + i_10_;
				i_11_ += 24;
				is_1_[i_10_] = (byte) (i_5_ |= i_8_ >>> i_11_);
				if (i_10_ >= i_12_) {
					if (i_3_ != 1493884543) {
						throw new IllegalStateException();
					}
				} else {
					i_10_++;
					i_11_ -= 8;
					is_1_[i_10_] = (byte) (i_5_ = i_8_ >>> i_11_);
					if (i_10_ < i_12_) {
						i_10_++;
						i_11_ -= 8;
						is_1_[i_10_] = (byte) (i_5_ = i_8_ >>> i_11_);
						if (i_10_ >= i_12_) {
							if (i_3_ != 1493884543) {
								throw new IllegalStateException();
							}
						} else {
							i_10_++;
							i_11_ -= 8;
							is_1_[i_10_] = (byte) (i_5_ = i_8_ >>> i_11_);
							if (i_10_ >= i_12_) {
								if (i_3_ != 1493884543) {
									throw new IllegalStateException();
								}
							} else {
								i_10_++;
								i_11_ -= 8;
								is_1_[i_10_] = (byte) (i_5_ = i_8_ << -i_11_);
							}
						}
					}
				}
				i_6_ += i_9_;
			}
			i_4_ = (i_6_ + 7 >> 3) - i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dq.i()");
		}
		return i_4_;
	}

	public int method376(final byte[] is, final int i, final byte[] is_13_, int i_14_, int i_15_, final int i_16_) {
		int i_17_;
		try {
			if (i_15_ == 0) {
				return 0;
			}
			int i_18_ = 0;
			i_15_ += i_14_;
			int i_19_ = i;
			for (;;) {
				final byte i_20_ = is[i_19_];
				if (i_20_ < 0) {
					i_18_ = this.anIntArray636[i_18_];
				} else {
					i_18_++;
				}
				int i_21_;
				if ((i_21_ = this.anIntArray636[i_18_]) < 0) {
					is_13_[i_14_++] = (byte) (i_21_ ^ 0xffffffff);
					if (i_14_ >= i_15_) {
						if (i_16_ <= 58637222) {
							throw new IllegalStateException();
						}
						break;
					}
					i_18_ = 0;
				}
				if ((i_20_ & 0x40) != 0) {
					i_18_ = this.anIntArray636[i_18_];
				} else {
					i_18_++;
				}
				if ((i_21_ = this.anIntArray636[i_18_]) < 0) {
					is_13_[i_14_++] = (byte) (i_21_ ^ 0xffffffff);
					if (i_14_ >= i_15_) {
						if (i_16_ <= 58637222) {
							throw new IllegalStateException();
						}
						break;
					}
					i_18_ = 0;
				}
				if ((i_20_ & 0x20) != 0) {
					i_18_ = this.anIntArray636[i_18_];
				} else {
					i_18_++;
				}
				if ((i_21_ = this.anIntArray636[i_18_]) < 0) {
					is_13_[i_14_++] = (byte) (i_21_ ^ 0xffffffff);
					if (i_14_ >= i_15_) {
						if (i_16_ <= 58637222) {
							throw new IllegalStateException();
						}
						break;
					}
					i_18_ = 0;
				}
				if ((i_20_ & 0x10) != 0) {
					i_18_ = this.anIntArray636[i_18_];
				} else {
					i_18_++;
				}
				if ((i_21_ = this.anIntArray636[i_18_]) < 0) {
					is_13_[i_14_++] = (byte) (i_21_ ^ 0xffffffff);
					if (i_14_ >= i_15_) {
						if (i_16_ <= 58637222) {
							throw new IllegalStateException();
						}
						break;
					}
					i_18_ = 0;
				}
				if ((i_20_ & 0x8) != 0) {
					i_18_ = this.anIntArray636[i_18_];
				} else {
					i_18_++;
				}
				if ((i_21_ = this.anIntArray636[i_18_]) < 0) {
					is_13_[i_14_++] = (byte) (i_21_ ^ 0xffffffff);
					if (i_14_ >= i_15_) {
						if (i_16_ <= 58637222) {
							throw new IllegalStateException();
						}
						break;
					}
					i_18_ = 0;
				}
				if ((i_20_ & 0x4) != 0) {
					i_18_ = this.anIntArray636[i_18_];
				} else {
					i_18_++;
				}
				if ((i_21_ = this.anIntArray636[i_18_]) < 0) {
					is_13_[i_14_++] = (byte) (i_21_ ^ 0xffffffff);
					if (i_14_ >= i_15_) {
						if (i_16_ <= 58637222) {
							throw new IllegalStateException();
						}
						break;
					}
					i_18_ = 0;
				}
				if ((i_20_ & 0x2) != 0) {
					i_18_ = this.anIntArray636[i_18_];
				} else {
					i_18_++;
				}
				if ((i_21_ = this.anIntArray636[i_18_]) < 0) {
					is_13_[i_14_++] = (byte) (i_21_ ^ 0xffffffff);
					if (i_14_ >= i_15_) {
						if (i_16_ <= 58637222) {
							throw new IllegalStateException();
						}
						break;
					}
					i_18_ = 0;
				}
				if ((i_20_ & 0x1) != 0) {
					i_18_ = this.anIntArray636[i_18_];
				} else {
					i_18_++;
				}
				if ((i_21_ = this.anIntArray636[i_18_]) < 0) {
					is_13_[i_14_++] = (byte) (i_21_ ^ 0xffffffff);
					if (i_14_ >= i_15_) {
						if (i_16_ <= 58637222) {
							throw new IllegalStateException();
						}
						break;
					}
					i_18_ = 0;
				}
				i_19_++;
			}
			i_17_ = i_19_ + 1 - i;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dq.w()");
		}
		return i_17_;
	}

	public Class53(final byte[] is) {
		try {
			final int i = is.length;
			this.anIntArray638 = new int[i];
			this.aByteArray637 = is;
			final int[] is_22_ = new int[33];
			this.anIntArray636 = new int[8];
			int i_23_ = 0;
			for (int i_24_ = 0; i_24_ < i; i_24_++) {
				final int i_25_ = is[i_24_];
				if (i_25_ != 0) {
					final int i_26_ = 1 << 32 - i_25_;
					final int i_27_ = is_22_[i_25_];
					this.anIntArray638[i_24_] = i_27_;
					int i_28_;
					if ((i_27_ & i_26_) != 0) {
						i_28_ = is_22_[i_25_ - 1];
					} else {
						i_28_ = i_27_ | i_26_;
						for (int i_29_ = i_25_ - 1; i_29_ >= 1; i_29_--) {
							final int i_30_ = is_22_[i_29_];
							if (i_27_ != i_30_) {
								break;
							}
							final int i_31_ = 1 << 32 - i_29_;
							if ((i_30_ & i_31_) != 0) {
								is_22_[i_29_] = is_22_[i_29_ - 1];
								break;
							}
							is_22_[i_29_] = i_30_ | i_31_;
						}
					}
					is_22_[i_25_] = i_28_;
					for (int i_32_ = i_25_ + 1; i_32_ <= 32; i_32_++) {
						if (i_27_ == is_22_[i_32_]) {
							is_22_[i_32_] = i_28_;
						}
					}
					int i_33_ = 0;
					for (int i_34_ = 0; i_34_ < i_25_; i_34_++) {
						int i_35_ = -2147483648 >>> i_34_;
						if ((i_27_ & i_35_) != 0) {
							if (this.anIntArray636[i_33_] == 0) {
								this.anIntArray636[i_33_] = i_23_;
							}
							i_33_ = this.anIntArray636[i_33_];
						} else {
							i_33_++;
						}
						if (i_33_ >= this.anIntArray636.length) {
							final int[] is_36_ = new int[this.anIntArray636.length * 2];
							for (int i_37_ = 0; i_37_ < this.anIntArray636.length; i_37_++) {
								is_36_[i_37_] = this.anIntArray636[i_37_];
							}
							this.anIntArray636 = is_36_;
						}
						i_35_ >>>= 1;
					}
					this.anIntArray636[i_33_] = i_24_ ^ 0xffffffff;
					if (i_33_ >= i_23_) {
						i_23_ = i_33_ + 1;
					}
				}
			}
		} catch (final RuntimeException var15) {
			throw Class102.method1086(var15, "dq.<init>()");
		}
	}
}
