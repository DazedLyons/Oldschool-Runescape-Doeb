/* Class91_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub2_Sub1 extends Class91_Sub2 {
	int anInt2154;
	int anInt2155;
	int anInt2156;
	int anInt2157;
	int anInt2158;
	int anInt2159;
	int anInt2160;
	int anInt2161;
	int anInt2162;
	int anInt2163;
	boolean aBoolean2164;
	int anInt2165;
	int anInt2166;
	int anInt2167;
	int anInt2168;

	static int method516(int i, int i_0_, final byte[] is, final int[] is_1_, int i_2_, int i_3_, int i_4_, int i_5_, final int i_6_, final int i_7_, int i_8_, final int i_9_, final int i_10_, final Class91_Sub2_Sub1 class91_sub2_sub1, final int i_11_, final int i_12_) {
		class91_sub2_sub1.anInt2158 -= class91_sub2_sub1.anInt2155 * i_3_;
		if (i_11_ == 0 || (i_8_ = i_3_ + (i_10_ - i_2_ + i_11_ - 257) / i_11_) > i_9_) {
			i_8_ = i_9_;
		}
		i_3_ <<= 1;
		i_8_ <<= 1;
		while (i_3_ < i_8_) {
			i_0_ = i_2_ >> 8;
			final byte var16 = is[i_0_];
			i = (var16 << 8) + (is[i_0_ + 1] - var16) * (i_2_ & 0xff);
			int i_13_ = i_3_++;
			is_1_[i_13_] += i * i_4_ >> 6;
			i_4_ += i_6_;
			i_13_ = i_3_++;
			is_1_[i_13_] += i * i_5_ >> 6;
			i_5_ += i_7_;
			i_2_ += i_11_;
		}
		if (i_11_ == 0 || (i_8_ = (i_3_ >> 1) + (i_10_ - i_2_ + i_11_ - 1) / i_11_) > i_9_) {
			i_8_ = i_9_;
		}
		i_8_ <<= 1;
		i_0_ = i_12_;
		while (i_3_ < i_8_) {
			final byte var16 = is[i_2_ >> 8];
			i = (var16 << 8) + (i_0_ - var16) * (i_2_ & 0xff);
			int i_14_ = i_3_++;
			is_1_[i_14_] += i * i_4_ >> 6;
			i_4_ += i_6_;
			i_14_ = i_3_++;
			is_1_[i_14_] += i * i_5_ >> 6;
			i_5_ += i_7_;
			i_2_ += i_11_;
		}
		i_3_ >>= 1;
		class91_sub2_sub1.anInt2158 += class91_sub2_sub1.anInt2155 * i_3_;
		class91_sub2_sub1.anInt2168 = i_4_;
		class91_sub2_sub1.anInt2160 = i_5_;
		class91_sub2_sub1.anInt2162 = i_2_;
		return i_3_;
	}

	@Override
	int method513() {
		int i = this.anInt2158 * 3 >> 6;
		i = (i ^ i >> 31) + (i >>> 31);
		if (this.anInt2161 == 0) {
			i -= i * this.anInt2162 / (((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149.length << 8);
		} else if (this.anInt2161 >= 0) {
			i -= i * this.anInt2154 / ((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149.length;
		}
		return i > 255 ? 255 : i;
	}

	Class91_Sub2_Sub1(final Class91_Sub1_Sub1 class91_sub1_sub1, final int i, final int i_15_) {
		this.aClass91_Sub1_1756 = class91_sub1_sub1;
		this.anInt2154 = class91_sub1_sub1.anInt2151;
		this.anInt2163 = class91_sub1_sub1.anInt2150;
		this.aBoolean2164 = class91_sub1_sub1.aBoolean2153;
		this.anInt2159 = i;
		this.anInt2156 = i_15_;
		this.anInt2157 = 8192;
		this.anInt2162 = 0;
		method518();
	}

	Class91_Sub2_Sub1(final Class91_Sub1_Sub1 class91_sub1_sub1, final int i, final int i_16_, final int i_17_) {
		this.aClass91_Sub1_1756 = class91_sub1_sub1;
		this.anInt2154 = class91_sub1_sub1.anInt2151;
		this.anInt2163 = class91_sub1_sub1.anInt2150;
		this.aBoolean2164 = class91_sub1_sub1.aBoolean2153;
		this.anInt2159 = i;
		this.anInt2156 = i_16_;
		this.anInt2157 = i_17_;
		this.anInt2162 = 0;
		method518();
	}

	public static Class91_Sub2_Sub1 method517(final Class91_Sub1_Sub1 class91_sub1_sub1, final int i, final int i_18_, final int i_19_) {
		return class91_sub1_sub1.aByteArray2149 != null && class91_sub1_sub1.aByteArray2149.length != 0 ? new Class91_Sub2_Sub1(class91_sub1_sub1, i, i_18_, i_19_) : null;
	}

	void method518() {
		this.anInt2158 = this.anInt2156;
		this.anInt2168 = method556(this.anInt2156, this.anInt2157);
		this.anInt2160 = method550(this.anInt2156, this.anInt2157);
	}

	public synchronized void method519(final int i) {
		method552(i << 6, method521());
	}

	synchronized void method520(final int i) {
		method552(i, method521());
	}

	@Override
	protected Class91_Sub2 method504() {
		return null;
	}

	public synchronized int method521() {
		return this.anInt2157 < 0 ? -1 : this.anInt2157;
	}

	public synchronized void method522(int i) {
		final int i_20_ = ((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149.length << 8;
		if (i < -1) {
			i = -1;
		}
		if (i > i_20_) {
			i = i_20_;
		}
		this.anInt2162 = i;
	}

	public synchronized void method523(final boolean bool) {
		this.anInt2159 = (this.anInt2159 ^ this.anInt2159 >> 31) + (this.anInt2159 >>> 31);
		if (bool) {
			this.anInt2159 = -this.anInt2159;
		}
	}

	void method524() {
		if (this.anInt2165 != 0) {
			if (this.anInt2156 == -2147483648) {
				this.anInt2156 = 0;
			}
			this.anInt2165 = 0;
			method518();
		}
	}

	public synchronized void method525(final int i, final int i_21_) {
		method551(i, i_21_, method521());
	}

	public synchronized void method526(int i) {
		if (i == 0) {
			method520(0);
			method495();
		} else if (this.anInt2168 == 0 && this.anInt2160 == 0) {
			this.anInt2165 = 0;
			this.anInt2156 = 0;
			this.anInt2158 = 0;
			method495();
		} else {
			int var2 = -this.anInt2158;
			if (this.anInt2158 > var2) {
				var2 = this.anInt2158;
			}
			if (-this.anInt2168 > var2) {
				var2 = -this.anInt2168;
			}
			if (this.anInt2168 > var2) {
				var2 = this.anInt2168;
			}
			if (-this.anInt2160 > var2) {
				var2 = -this.anInt2160;
			}
			if (this.anInt2160 > var2) {
				var2 = this.anInt2160;
			}
			if (i > var2) {
				i = var2;
			}
			this.anInt2165 = i;
			this.anInt2156 = -2147483648;
			this.anInt2155 = -this.anInt2158 / i;
			this.anInt2167 = -this.anInt2168 / i;
			this.anInt2166 = -this.anInt2160 / i;
		}
	}

	public synchronized void method527(final int i) {
		if (this.anInt2159 < 0) {
			this.anInt2159 = -i;
		} else {
			this.anInt2159 = i;
		}
	}

	public synchronized int method528() {
		return this.anInt2159 < 0 ? -this.anInt2159 : this.anInt2159;
	}

	public boolean method529() {
		if (this.anInt2162 >= 0 && this.anInt2162 < ((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149.length << 8) {
			return false;
		}
		return true;
	}

	public boolean method530() {
		if (this.anInt2165 != 0) {
			return true;
		}
		return false;
	}

	@Override
	protected Class91_Sub2 method499() {
		return null;
	}

	@Override
	protected Class91_Sub2 method515() {
		return null;
	}

	@Override
	protected int method501() {
		return this.anInt2156 == 0 && this.anInt2165 == 0 ? 0 : 1;
	}

	int method531(final int[] is, int i, final int i_22_, final int i_23_, final int i_24_) {
		while_13_: do {
			do {
				if (this.anInt2165 <= 0) {
					break while_13_;
				}
				int var6 = i + this.anInt2165;
				if (var6 > i_23_) {
					var6 = i_23_;
				}
				this.anInt2165 += i;
				if (this.anInt2159 == -256 && (this.anInt2162 & 0xff) == 0) {
					if (Class6.aBoolean80) {
						i = method549(0, ((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149, is, this.anInt2162, i, this.anInt2168, this.anInt2160, this.anInt2167, this.anInt2166, 0, var6, i_22_, this);
					} else {
						i = method538(((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149, is, this.anInt2162, i, this.anInt2158, this.anInt2155, 0, var6, i_22_, this);
					}
				} else if (Class6.aBoolean80) {
					i = method541(0, 0, ((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149, is, this.anInt2162, i, this.anInt2168, this.anInt2160, this.anInt2167, this.anInt2166, 0, var6, i_22_, this, this.anInt2159, i_24_);
				} else {
					i = method540(0, 0, ((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149, is, this.anInt2162, i, this.anInt2158, this.anInt2155, 0, var6, i_22_, this, this.anInt2159, i_24_);
				}
				this.anInt2165 -= i;
				if (this.anInt2165 != 0) {
					return i;
				}
			} while (!method537());
			return i_23_;
		} while (false);
		if (this.anInt2159 == -256 && (this.anInt2162 & 0xff) == 0) {
			if (Class6.aBoolean80) {
				return method555(0, ((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149, is, this.anInt2162, i, this.anInt2168, this.anInt2160, 0, i_23_, i_22_, this);
			}
			return method534(((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149, is, this.anInt2162, i, this.anInt2158, 0, i_23_, i_22_, this);
		}
		if (Class6.aBoolean80) {
			return method536(0, 0, ((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149, is, this.anInt2162, i, this.anInt2168, this.anInt2160, 0, i_23_, i_22_, this, this.anInt2159, i_24_);
		}
		return method547(0, 0, ((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149, is, this.anInt2162, i, this.anInt2158, 0, i_23_, i_22_, this, this.anInt2159, i_24_);
	}

	static int method532(final byte[] is, final int[] is_25_, int i, int i_26_, int i_27_, int i_28_, final int i_29_, int i_30_, final Class91_Sub2_Sub1 class91_sub2_sub1) {
		i >>= 8;
		i_30_ >>= 8;
		i_27_ <<= 2;
		if ((i_28_ = i_26_ + i_30_ - i) > i_29_) {
			i_28_ = i_29_;
		}
		i_28_ -= 3;
		while (i_26_ < i_28_) {
			int var10001 = i_26_++;
			is_25_[var10001] += is[i++] * i_27_;
			var10001 = i_26_++;
			is_25_[var10001] += is[i++] * i_27_;
			var10001 = i_26_++;
			is_25_[var10001] += is[i++] * i_27_;
			var10001 = i_26_++;
			is_25_[var10001] += is[i++] * i_27_;
		}
		i_28_ += 3;
		while (i_26_ < i_28_) {
			final int var10001 = i_26_++;
			is_25_[var10001] += is[i++] * i_27_;
		}
		class91_sub2_sub1.anInt2162 = i << 8;
		return i_26_;
	}

	static int method533(final int i, final byte[] is, final int[] is_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, final int i_37_, int i_38_, final Class91_Sub2_Sub1 class91_sub2_sub1) {
		i_32_ >>= 8;
		i_38_ >>= 8;
		i_34_ <<= 2;
		i_35_ <<= 2;
		if ((i_36_ = i_33_ + i_38_ - i_32_) > i_37_) {
			i_36_ = i_37_;
		}
		i_33_ <<= 1;
		i_36_ <<= 1;
		i_36_ -= 6;
		while (i_33_ < i_36_) {
			int i_39_ = is[i_32_++];
			int var10001 = i_33_++;
			is_31_[var10001] += i_39_ * i_34_;
			var10001 = i_33_++;
			is_31_[var10001] += i_39_ * i_35_;
			i_39_ = is[i_32_++];
			var10001 = i_33_++;
			is_31_[var10001] += i_39_ * i_34_;
			var10001 = i_33_++;
			is_31_[var10001] += i_39_ * i_35_;
			i_39_ = is[i_32_++];
			var10001 = i_33_++;
			is_31_[var10001] += i_39_ * i_34_;
			var10001 = i_33_++;
			is_31_[var10001] += i_39_ * i_35_;
			i_39_ = is[i_32_++];
			var10001 = i_33_++;
			is_31_[var10001] += i_39_ * i_34_;
			var10001 = i_33_++;
			is_31_[var10001] += i_39_ * i_35_;
		}
		i_36_ += 6;
		while (i_33_ < i_36_) {
			final int i_40_ = is[i_32_++];
			int var10001 = i_33_++;
			is_31_[var10001] += i_40_ * i_34_;
			var10001 = i_33_++;
			is_31_[var10001] += i_40_ * i_35_;
		}
		class91_sub2_sub1.anInt2162 = i_32_ << 8;
		return i_33_ >> 1;
	}

	static int method534(final byte[] is, final int[] is_41_, int i, int i_42_, int i_43_, int i_44_, final int i_45_, int i_46_, final Class91_Sub2_Sub1 class91_sub2_sub1) {
		i >>= 8;
		i_46_ >>= 8;
		i_43_ <<= 2;
		if ((i_44_ = i_42_ + i - (i_46_ - 1)) > i_45_) {
			i_44_ = i_45_;
		}
		i_44_ -= 3;
		while (i_42_ < i_44_) {
			int var10001 = i_42_++;
			is_41_[var10001] += is[i--] * i_43_;
			var10001 = i_42_++;
			is_41_[var10001] += is[i--] * i_43_;
			var10001 = i_42_++;
			is_41_[var10001] += is[i--] * i_43_;
			var10001 = i_42_++;
			is_41_[var10001] += is[i--] * i_43_;
		}
		i_44_ += 3;
		while (i_42_ < i_44_) {
			final int var10001 = i_42_++;
			is_41_[var10001] += is[i--] * i_43_;
		}
		class91_sub2_sub1.anInt2162 = i << 8;
		return i_42_;
	}

	static int method535(final int i, int i_47_, final byte[] is, final int[] is_48_, int i_49_, int i_50_, final int i_51_, int i_52_, final int i_53_, final int i_54_, final Class91_Sub2_Sub1 class91_sub2_sub1, final int i_55_, final int i_56_) {
		if (i_55_ == 0 || (i_52_ = i_50_ + (i_54_ - i_49_ + i_55_ - 257) / i_55_) > i_53_) {
			i_52_ = i_53_;
		}
		while (i_50_ < i_52_) {
			i_47_ = i_49_ >> 8;
			final byte var13 = is[i_47_];
			final int i_57_ = i_50_++;
			is_48_[i_57_] += ((var13 << 8) + (is[i_47_ + 1] - var13) * (i_49_ & 0xff)) * i_51_ >> 6;
			i_49_ += i_55_;
		}
		if (i_55_ == 0 || (i_52_ = i_50_ + (i_54_ - i_49_ + i_55_ - 1) / i_55_) > i_53_) {
			i_52_ = i_53_;
		}
		i_47_ = i_56_;
		while (i_50_ < i_52_) {
			final byte var13 = is[i_49_ >> 8];
			final int i_58_ = i_50_++;
			is_48_[i_58_] += ((var13 << 8) + (i_47_ - var13) * (i_49_ & 0xff)) * i_51_ >> 6;
			i_49_ += i_55_;
		}
		class91_sub2_sub1.anInt2162 = i_49_;
		return i_50_;
	}

	@Override
	public synchronized void method505(int i) {
		if (this.anInt2165 > 0) {
			if (i >= this.anInt2165) {
				if (this.anInt2156 == -2147483648) {
					this.anInt2156 = 0;
					this.anInt2160 = 0;
					this.anInt2168 = 0;
					this.anInt2158 = 0;
					method495();
					i = this.anInt2165;
				}
				this.anInt2165 = 0;
				method518();
			} else {
				this.anInt2158 += this.anInt2155 * i;
				this.anInt2168 += this.anInt2167 * i;
				this.anInt2160 += this.anInt2166 * i;
				this.anInt2165 -= i;
			}
		}
		final Class91_Sub1_Sub1 class91_sub1_sub1 = (Class91_Sub1_Sub1) this.aClass91_Sub1_1756;
		final int i_59_ = this.anInt2154 << 8;
		final int i_60_ = this.anInt2163 << 8;
		final int i_61_ = class91_sub1_sub1.aByteArray2149.length << 8;
		final int i_62_ = i_60_ - i_59_;
		if (i_62_ <= 0) {
			this.anInt2161 = 0;
		}
		if (this.anInt2162 < 0) {
			if (this.anInt2159 <= 0) {
				method524();
				method495();
				return;
			}
			this.anInt2162 = 0;
		}
		if (this.anInt2162 >= i_61_) {
			if (this.anInt2159 >= 0) {
				method524();
				method495();
				return;
			}
			this.anInt2162 = i_61_ - 1;
		}
		this.anInt2162 += this.anInt2159 * i;
		if (this.anInt2161 < 0) {
			if (!this.aBoolean2164) {
				if (this.anInt2159 < 0) {
					if (this.anInt2162 < i_59_) {
						this.anInt2162 = i_60_ - 1 - (i_60_ - 1 - this.anInt2162) % i_62_;
					}
				} else if (this.anInt2162 >= i_60_) {
					this.anInt2162 = i_59_ + (this.anInt2162 - i_59_) % i_62_;
				}
			} else {
				if (this.anInt2159 < 0) {
					if (this.anInt2162 >= i_59_) {
						return;
					}
					this.anInt2162 = i_59_ + i_59_ - 1 - this.anInt2162;
					this.anInt2159 = -this.anInt2159;
				}
				while (this.anInt2162 >= i_60_) {
					this.anInt2162 = i_60_ + i_60_ - 1 - this.anInt2162;
					this.anInt2159 = -this.anInt2159;
					if (this.anInt2162 >= i_59_) {
						break;
					}
					this.anInt2162 = i_59_ + i_59_ - 1 - this.anInt2162;
					this.anInt2159 = -this.anInt2159;
				}
			}
		} else {
			do {
				if (this.anInt2161 > 0) {
					if (this.aBoolean2164) {
						if (this.anInt2159 < 0) {
							if (this.anInt2162 >= i_59_) {
								return;
							}
							this.anInt2162 = i_59_ + i_59_ - 1 - this.anInt2162;
							this.anInt2159 = -this.anInt2159;
							if (--this.anInt2161 == 0) {
								break;
							}
						}
						do {
							if (this.anInt2162 < i_60_) {
								return;
							}
							this.anInt2162 = i_60_ + i_60_ - 1 - this.anInt2162;
							this.anInt2159 = -this.anInt2159;
							if (--this.anInt2161 == 0) {
								break;
							}
							if (this.anInt2162 >= i_59_) {
								return;
							}
							this.anInt2162 = i_59_ + i_59_ - 1 - this.anInt2162;
							this.anInt2159 = -this.anInt2159;
						} while (--this.anInt2161 != 0);
					} else {
						if (this.anInt2159 < 0) {
							if (this.anInt2162 < i_59_) {
								final int var7 = (i_60_ - 1 - this.anInt2162) / i_62_;
								if (var7 >= this.anInt2161) {
									this.anInt2162 += i_62_ * this.anInt2161;
									this.anInt2161 = 0;
									break;
								}
								this.anInt2162 += i_62_ * var7;
								this.anInt2161 -= var7;
							}
						} else if (this.anInt2162 >= i_60_) {
							final int var7 = (this.anInt2162 - i_59_) / i_62_;
							if (var7 >= this.anInt2161) {
								this.anInt2162 -= i_62_ * this.anInt2161;
								this.anInt2161 = 0;
								break;
							}
							this.anInt2162 -= i_62_ * var7;
							this.anInt2161 -= var7;
						}
						return;
					}
				}
			} while (false);
			if (this.anInt2159 < 0) {
				if (this.anInt2162 < 0) {
					this.anInt2162 = -1;
					method524();
					method495();
				}
			} else if (this.anInt2162 >= i_61_) {
				this.anInt2162 = i_61_;
				method524();
				method495();
			}
		}
	}

	static int method536(int i, int i_63_, final byte[] is, final int[] is_64_, int i_65_, int i_66_, final int i_67_, final int i_68_, int i_69_, final int i_70_, final int i_71_, final Class91_Sub2_Sub1 class91_sub2_sub1, final int i_72_, final int i_73_) {
		if (i_72_ == 0 || (i_69_ = i_66_ + (i_71_ + 256 - i_65_ + i_72_) / i_72_) > i_70_) {
			i_69_ = i_70_;
		}
		i_66_ <<= 1;
		i_69_ <<= 1;
		while (i_66_ < i_69_) {
			i_63_ = i_65_ >> 8;
			final int i_74_ = is[i_63_ - 1];
			i = (i_74_ << 8) + (is[i_63_] - i_74_) * (i_65_ & 0xff);
			int i_75_ = i_66_++;
			is_64_[i_75_] += i * i_67_ >> 6;
			i_75_ = i_66_++;
			is_64_[i_75_] += i * i_68_ >> 6;
			i_65_ += i_72_;
		}
		if (i_72_ == 0 || (i_69_ = (i_66_ >> 1) + (i_71_ - i_65_ + i_72_) / i_72_) > i_70_) {
			i_69_ = i_70_;
		}
		i_69_ <<= 1;
		i_63_ = i_73_;
		while (i_66_ < i_69_) {
			i = (i_63_ << 8) + (is[i_65_ >> 8] - i_63_) * (i_65_ & 0xff);
			int i_76_ = i_66_++;
			is_64_[i_76_] += i * i_67_ >> 6;
			i_76_ = i_66_++;
			is_64_[i_76_] += i * i_68_ >> 6;
			i_65_ += i_72_;
		}
		class91_sub2_sub1.anInt2162 = i_65_;
		return i_66_ >> 1;
	}

	boolean method537() {
		int i = this.anInt2156;
		int i_77_;
		int i_78_;
		if (i == -2147483648) {
			i_78_ = 0;
			i_77_ = 0;
			i = 0;
		} else {
			i_77_ = method556(i, this.anInt2157);
			i_78_ = method550(i, this.anInt2157);
		}
		if (this.anInt2158 == i && this.anInt2168 == i_77_ && this.anInt2160 == i_78_) {
			if (this.anInt2156 == -2147483648) {
				this.anInt2156 = 0;
				this.anInt2160 = 0;
				this.anInt2168 = 0;
				this.anInt2158 = 0;
				method495();
				return true;
			}
			method518();
			return false;
		}
		if (this.anInt2158 < i) {
			this.anInt2155 = 1;
			this.anInt2165 = i - this.anInt2158;
		} else if (this.anInt2158 > i) {
			this.anInt2155 = -1;
			this.anInt2165 = this.anInt2158 - i;
		} else {
			this.anInt2155 = 0;
		}
		if (this.anInt2168 < i_77_) {
			this.anInt2167 = 1;
			if (this.anInt2165 == 0 || this.anInt2165 > i_77_ - this.anInt2168) {
				this.anInt2165 = i_77_ - this.anInt2168;
			}
		} else if (this.anInt2168 > i_77_) {
			this.anInt2167 = -1;
			if (this.anInt2165 == 0 || this.anInt2165 > this.anInt2168 - i_77_) {
				this.anInt2165 = this.anInt2168 - i_77_;
			}
		} else {
			this.anInt2167 = 0;
		}
		if (this.anInt2160 < i_78_) {
			this.anInt2166 = 1;
			if (this.anInt2165 == 0 || this.anInt2165 > i_78_ - this.anInt2160) {
				this.anInt2165 = i_78_ - this.anInt2160;
			}
		} else if (this.anInt2160 > i_78_) {
			this.anInt2166 = -1;
			if (this.anInt2165 == 0 || this.anInt2165 > this.anInt2160 - i_78_) {
				this.anInt2165 = this.anInt2160 - i_78_;
			}
		} else {
			this.anInt2166 = 0;
		}
		return false;
	}

	static int method538(final byte[] is, final int[] is_79_, int i, int i_80_, int i_81_, int i_82_, int i_83_, final int i_84_, int i_85_, final Class91_Sub2_Sub1 class91_sub2_sub1) {
		i >>= 8;
		i_85_ >>= 8;
		i_81_ <<= 2;
		i_82_ <<= 2;
		if ((i_83_ = i_80_ + i - (i_85_ - 1)) > i_84_) {
			i_83_ = i_84_;
		}
		class91_sub2_sub1.anInt2168 += class91_sub2_sub1.anInt2167 * (i_83_ - i_80_);
		class91_sub2_sub1.anInt2160 += class91_sub2_sub1.anInt2166 * (i_83_ - i_80_);
		i_83_ -= 3;
		while (i_80_ < i_83_) {
			int var10001 = i_80_++;
			is_79_[var10001] += is[i--] * i_81_;
			i_81_ += i_82_;
			var10001 = i_80_++;
			is_79_[var10001] += is[i--] * i_81_;
			i_81_ += i_82_;
			var10001 = i_80_++;
			is_79_[var10001] += is[i--] * i_81_;
			i_81_ += i_82_;
			var10001 = i_80_++;
			is_79_[var10001] += is[i--] * i_81_;
			i_81_ += i_82_;
		}
		i_83_ += 3;
		while (i_80_ < i_83_) {
			final int var10001 = i_80_++;
			is_79_[var10001] += is[i--] * i_81_;
			i_81_ += i_82_;
		}
		class91_sub2_sub1.anInt2158 = i_81_ >> 2;
		class91_sub2_sub1.anInt2162 = i << 8;
		return i_80_;
	}

	static int method539(final int i, int i_86_, final byte[] is, final int[] is_87_, int i_88_, int i_89_, int i_90_, final int i_91_, int i_92_, final int i_93_, final int i_94_, final Class91_Sub2_Sub1 class91_sub2_sub1, final int i_95_, final int i_96_) {
		class91_sub2_sub1.anInt2168 -= class91_sub2_sub1.anInt2167 * i_89_;
		class91_sub2_sub1.anInt2160 -= class91_sub2_sub1.anInt2166 * i_89_;
		if (i_95_ == 0 || (i_92_ = i_89_ + (i_94_ - i_88_ + i_95_ - 257) / i_95_) > i_93_) {
			i_92_ = i_93_;
		}
		while (i_89_ < i_92_) {
			i_86_ = i_88_ >> 8;
			final byte var14 = is[i_86_];
			final int i_97_ = i_89_++;
			is_87_[i_97_] += ((var14 << 8) + (is[i_86_ + 1] - var14) * (i_88_ & 0xff)) * i_90_ >> 6;
			i_90_ += i_91_;
			i_88_ += i_95_;
		}
		if (i_95_ == 0 || (i_92_ = i_89_ + (i_94_ - i_88_ + i_95_ - 1) / i_95_) > i_93_) {
			i_92_ = i_93_;
		}
		i_86_ = i_96_;
		while (i_89_ < i_92_) {
			final byte var14 = is[i_88_ >> 8];
			final int i_98_ = i_89_++;
			is_87_[i_98_] += ((var14 << 8) + (i_86_ - var14) * (i_88_ & 0xff)) * i_90_ >> 6;
			i_90_ += i_91_;
			i_88_ += i_95_;
		}
		class91_sub2_sub1.anInt2168 += class91_sub2_sub1.anInt2167 * i_89_;
		class91_sub2_sub1.anInt2160 += class91_sub2_sub1.anInt2166 * i_89_;
		class91_sub2_sub1.anInt2158 = i_90_;
		class91_sub2_sub1.anInt2162 = i_88_;
		return i_89_;
	}

	static int method540(int i, int i_99_, final byte[] is, final int[] is_100_, int i_101_, int i_102_, int i_103_, final int i_104_, int i_105_, final int i_106_, final int i_107_, final Class91_Sub2_Sub1 class91_sub2_sub1, final int i_108_, final int i_109_) {
		class91_sub2_sub1.anInt2168 -= class91_sub2_sub1.anInt2167 * i_102_;
		class91_sub2_sub1.anInt2160 -= class91_sub2_sub1.anInt2166 * i_102_;
		if (i_108_ == 0 || (i_105_ = i_102_ + (i_107_ + 256 - i_101_ + i_108_) / i_108_) > i_106_) {
			i_105_ = i_106_;
		}
		while (i_102_ < i_105_) {
			i_99_ = i_101_ >> 8;
			final byte var14 = is[i_99_ - 1];
			final int i_110_ = i_102_++;
			is_100_[i_110_] += ((var14 << 8) + (is[i_99_] - var14) * (i_101_ & 0xff)) * i_103_ >> 6;
			i_103_ += i_104_;
			i_101_ += i_108_;
		}
		if (i_108_ == 0 || (i_105_ = i_102_ + (i_107_ - i_101_ + i_108_) / i_108_) > i_106_) {
			i_105_ = i_106_;
		}
		i = i_109_;
		i_99_ = i_108_;
		while (i_102_ < i_105_) {
			final int i_111_ = i_102_++;
			is_100_[i_111_] += ((i << 8) + (is[i_101_ >> 8] - i) * (i_101_ & 0xff)) * i_103_ >> 6;
			i_103_ += i_104_;
			i_101_ += i_99_;
		}
		class91_sub2_sub1.anInt2168 += class91_sub2_sub1.anInt2167 * i_102_;
		class91_sub2_sub1.anInt2160 += class91_sub2_sub1.anInt2166 * i_102_;
		class91_sub2_sub1.anInt2158 = i_103_;
		class91_sub2_sub1.anInt2162 = i_101_;
		return i_102_;
	}

	static int method541(int i, int i_112_, final byte[] is, final int[] is_113_, int i_114_, int i_115_, int i_116_, int i_117_, final int i_118_, final int i_119_, int i_120_, final int i_121_, final int i_122_, final Class91_Sub2_Sub1 class91_sub2_sub1, final int i_123_, final int i_124_) {
		class91_sub2_sub1.anInt2158 -= class91_sub2_sub1.anInt2155 * i_115_;
		if (i_123_ == 0 || (i_120_ = i_115_ + (i_122_ + 256 - i_114_ + i_123_) / i_123_) > i_121_) {
			i_120_ = i_121_;
		}
		i_115_ <<= 1;
		i_120_ <<= 1;
		while (i_115_ < i_120_) {
			i_112_ = i_114_ >> 8;
			final int i_125_ = is[i_112_ - 1];
			i = (i_125_ << 8) + (is[i_112_] - i_125_) * (i_114_ & 0xff);
			int i_126_ = i_115_++;
			is_113_[i_126_] += i * i_116_ >> 6;
			i_116_ += i_118_;
			i_126_ = i_115_++;
			is_113_[i_126_] += i * i_117_ >> 6;
			i_117_ += i_119_;
			i_114_ += i_123_;
		}
		if (i_123_ == 0 || (i_120_ = (i_115_ >> 1) + (i_122_ - i_114_ + i_123_) / i_123_) > i_121_) {
			i_120_ = i_121_;
		}
		i_120_ <<= 1;
		i_112_ = i_124_;
		while (i_115_ < i_120_) {
			i = (i_112_ << 8) + (is[i_114_ >> 8] - i_112_) * (i_114_ & 0xff);
			int i_127_ = i_115_++;
			is_113_[i_127_] += i * i_116_ >> 6;
			i_116_ += i_118_;
			i_127_ = i_115_++;
			is_113_[i_127_] += i * i_117_ >> 6;
			i_117_ += i_119_;
			i_114_ += i_123_;
		}
		i_115_ >>= 1;
		class91_sub2_sub1.anInt2158 += class91_sub2_sub1.anInt2155 * i_115_;
		class91_sub2_sub1.anInt2168 = i_116_;
		class91_sub2_sub1.anInt2160 = i_117_;
		class91_sub2_sub1.anInt2162 = i_114_;
		return i_115_;
	}

	static int method542(final byte[] is, final int[] is_128_, int i, int i_129_, int i_130_, int i_131_, int i_132_, final int i_133_, int i_134_, final Class91_Sub2_Sub1 class91_sub2_sub1) {
		i >>= 8;
		i_134_ >>= 8;
		i_130_ <<= 2;
		i_131_ <<= 2;
		if ((i_132_ = i_129_ + i_134_ - i) > i_133_) {
			i_132_ = i_133_;
		}
		class91_sub2_sub1.anInt2168 += class91_sub2_sub1.anInt2167 * (i_132_ - i_129_);
		class91_sub2_sub1.anInt2160 += class91_sub2_sub1.anInt2166 * (i_132_ - i_129_);
		i_132_ -= 3;
		while (i_129_ < i_132_) {
			int var10001 = i_129_++;
			is_128_[var10001] += is[i++] * i_130_;
			i_130_ += i_131_;
			var10001 = i_129_++;
			is_128_[var10001] += is[i++] * i_130_;
			i_130_ += i_131_;
			var10001 = i_129_++;
			is_128_[var10001] += is[i++] * i_130_;
			i_130_ += i_131_;
			var10001 = i_129_++;
			is_128_[var10001] += is[i++] * i_130_;
			i_130_ += i_131_;
		}
		i_132_ += 3;
		while (i_129_ < i_132_) {
			final int var10001 = i_129_++;
			is_128_[var10001] += is[i++] * i_130_;
			i_130_ += i_131_;
		}
		class91_sub2_sub1.anInt2158 = i_130_ >> 2;
		class91_sub2_sub1.anInt2162 = i << 8;
		return i_129_;
	}

	@Override
	protected Class91_Sub2 method508() {
		return null;
	}

	@Override
	public synchronized void method498(final int[] is, final int i, int i_135_) {
		if (this.anInt2156 == 0 && this.anInt2165 == 0) {
			method505(i_135_);
		} else {
			final Class91_Sub1_Sub1 class91_sub1_sub1 = (Class91_Sub1_Sub1) this.aClass91_Sub1_1756;
			final int i_136_ = this.anInt2154 << 8;
			final int i_137_ = this.anInt2163 << 8;
			final int i_138_ = class91_sub1_sub1.aByteArray2149.length << 8;
			final int i_139_ = i_137_ - i_136_;
			if (i_139_ <= 0) {
				this.anInt2161 = 0;
			}
			int i_140_ = i;
			i_135_ += i;
			if (this.anInt2162 < 0) {
				if (this.anInt2159 <= 0) {
					method524();
					method495();
					return;
				}
				this.anInt2162 = 0;
			}
			if (this.anInt2162 >= i_138_) {
				if (this.anInt2159 >= 0) {
					method524();
					method495();
					return;
				}
				this.anInt2162 = i_138_ - 1;
			}
			if (this.anInt2161 < 0) {
				if (this.aBoolean2164) {
					if (this.anInt2159 < 0) {
						i_140_ = method531(is, i, i_136_, i_135_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
						if (this.anInt2162 >= i_136_) {
							return;
						}
						this.anInt2162 = i_136_ + i_136_ - 1 - this.anInt2162;
						this.anInt2159 = -this.anInt2159;
					}
					for (;;) {
						i_140_ = method557(is, i_140_, i_137_, i_135_, class91_sub1_sub1.aByteArray2149[this.anInt2163 - 1]);
						if (this.anInt2162 < i_137_) {
							break;
						}
						this.anInt2162 = i_137_ + i_137_ - 1 - this.anInt2162;
						this.anInt2159 = -this.anInt2159;
						i_140_ = method531(is, i_140_, i_136_, i_135_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
						if (this.anInt2162 >= i_136_) {
							break;
						}
						this.anInt2162 = i_136_ + i_136_ - 1 - this.anInt2162;
						this.anInt2159 = -this.anInt2159;
					}
				} else if (this.anInt2159 < 0) {
					for (;;) {
						i_140_ = method531(is, i_140_, i_136_, i_135_, class91_sub1_sub1.aByteArray2149[this.anInt2163 - 1]);
						if (this.anInt2162 >= i_136_) {
							break;
						}
						this.anInt2162 = i_137_ - 1 - (i_137_ - 1 - this.anInt2162) % i_139_;
					}
				} else {
					for (;;) {
						i_140_ = method557(is, i_140_, i_137_, i_135_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
						if (this.anInt2162 < i_137_) {
							break;
						}
						this.anInt2162 = i_136_ + (this.anInt2162 - i_136_) % i_139_;
					}
				}
			} else {
				do {
					if (this.anInt2161 > 0) {
						if (this.aBoolean2164) {
							if (this.anInt2159 < 0) {
								i_140_ = method531(is, i, i_136_, i_135_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
								if (this.anInt2162 >= i_136_) {
									return;
								}
								this.anInt2162 = i_136_ + i_136_ - 1 - this.anInt2162;
								this.anInt2159 = -this.anInt2159;
								if (--this.anInt2161 == 0) {
									break;
								}
							}
							do {
								i_140_ = method557(is, i_140_, i_137_, i_135_, class91_sub1_sub1.aByteArray2149[this.anInt2163 - 1]);
								if (this.anInt2162 < i_137_) {
									return;
								}
								this.anInt2162 = i_137_ + i_137_ - 1 - this.anInt2162;
								this.anInt2159 = -this.anInt2159;
								if (--this.anInt2161 == 0) {
									break;
								}
								i_140_ = method531(is, i_140_, i_136_, i_135_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
								if (this.anInt2162 >= i_136_) {
									return;
								}
								this.anInt2162 = i_136_ + i_136_ - 1 - this.anInt2162;
								this.anInt2159 = -this.anInt2159;
							} while (--this.anInt2161 != 0);
						} else if (this.anInt2159 < 0) {
							for (;;) {
								i_140_ = method531(is, i_140_, i_136_, i_135_, class91_sub1_sub1.aByteArray2149[this.anInt2163 - 1]);
								if (this.anInt2162 >= i_136_) {
									return;
								}
								final int i_141_ = (i_137_ - 1 - this.anInt2162) / i_139_;
								if (i_141_ >= this.anInt2161) {
									this.anInt2162 += i_139_ * this.anInt2161;
									this.anInt2161 = 0;
									break;
								}
								this.anInt2162 += i_139_ * i_141_;
								this.anInt2161 -= i_141_;
							}
						} else {
							for (;;) {
								i_140_ = method557(is, i_140_, i_137_, i_135_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
								if (this.anInt2162 < i_137_) {
									return;
								}
								final int i_142_ = (this.anInt2162 - i_136_) / i_139_;
								if (i_142_ >= this.anInt2161) {
									this.anInt2162 -= i_139_ * this.anInt2161;
									this.anInt2161 = 0;
									break;
								}
								this.anInt2162 -= i_139_ * i_142_;
								this.anInt2161 -= i_142_;
							}
						}
					}
				} while (false);
				if (this.anInt2159 < 0) {
					method531(is, i_140_, 0, i_135_, 0);
					if (this.anInt2162 < 0) {
						this.anInt2162 = -1;
						method524();
						method495();
					}
				} else {
					method557(is, i_140_, i_138_, i_135_, 0);
					if (this.anInt2162 >= i_138_) {
						this.anInt2162 = i_138_;
						method524();
						method495();
					}
				}
			}
		}
	}

	public synchronized int method546() {
		return this.anInt2156 == -2147483648 ? 0 : this.anInt2156;
	}

	static int method547(int i, int i_143_, final byte[] is, final int[] is_144_, int i_145_, int i_146_, final int i_147_, int i_148_, final int i_149_, final int i_150_, final Class91_Sub2_Sub1 class91_sub2_sub1, final int i_151_, final int i_152_) {
		if (i_151_ == 0 || (i_148_ = i_146_ + (i_150_ + 256 - i_145_ + i_151_) / i_151_) > i_149_) {
			i_148_ = i_149_;
		}
		while (i_146_ < i_148_) {
			i_143_ = i_145_ >> 8;
			final byte var13 = is[i_143_ - 1];
			final int i_153_ = i_146_++;
			is_144_[i_153_] += ((var13 << 8) + (is[i_143_] - var13) * (i_145_ & 0xff)) * i_147_ >> 6;
			i_145_ += i_151_;
		}
		if (i_151_ == 0 || (i_148_ = i_146_ + (i_150_ - i_145_ + i_151_) / i_151_) > i_149_) {
			i_148_ = i_149_;
		}
		i = i_152_;
		i_143_ = i_151_;
		while (i_146_ < i_148_) {
			final int i_154_ = i_146_++;
			is_144_[i_154_] += ((i << 8) + (is[i_145_ >> 8] - i) * (i_145_ & 0xff)) * i_147_ >> 6;
			i_145_ += i_143_;
		}
		class91_sub2_sub1.anInt2162 = i_145_;
		return i_146_;
	}

	public synchronized void method548(final int i) {
		this.anInt2161 = i;
	}

	static int method549(final int i, final byte[] is, final int[] is_155_, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_, int i_162_, final int i_163_, int i_164_, final Class91_Sub2_Sub1 class91_sub2_sub1) {
		i_156_ >>= 8;
		i_164_ >>= 8;
		i_158_ <<= 2;
		i_159_ <<= 2;
		i_160_ <<= 2;
		i_161_ <<= 2;
		if ((i_162_ = i_157_ + i_156_ - (i_164_ - 1)) > i_163_) {
			i_162_ = i_163_;
		}
		class91_sub2_sub1.anInt2158 += class91_sub2_sub1.anInt2155 * (i_162_ - i_157_);
		i_157_ <<= 1;
		i_162_ <<= 1;
		i_162_ -= 6;
		while (i_157_ < i_162_) {
			byte var13 = is[i_156_--];
			int i_165_ = i_157_++;
			is_155_[i_165_] += var13 * i_158_;
			i_158_ += i_160_;
			i_165_ = i_157_++;
			is_155_[i_165_] += var13 * i_159_;
			i_159_ += i_161_;
			var13 = is[i_156_--];
			i_165_ = i_157_++;
			is_155_[i_165_] += var13 * i_158_;
			i_158_ += i_160_;
			i_165_ = i_157_++;
			is_155_[i_165_] += var13 * i_159_;
			i_159_ += i_161_;
			var13 = is[i_156_--];
			i_165_ = i_157_++;
			is_155_[i_165_] += var13 * i_158_;
			i_158_ += i_160_;
			i_165_ = i_157_++;
			is_155_[i_165_] += var13 * i_159_;
			i_159_ += i_161_;
			var13 = is[i_156_--];
			i_165_ = i_157_++;
			is_155_[i_165_] += var13 * i_158_;
			i_158_ += i_160_;
			i_165_ = i_157_++;
			is_155_[i_165_] += var13 * i_159_;
			i_159_ += i_161_;
		}
		i_162_ += 6;
		while (i_157_ < i_162_) {
			final byte var13 = is[i_156_--];
			int i_166_ = i_157_++;
			is_155_[i_166_] += var13 * i_158_;
			i_158_ += i_160_;
			i_166_ = i_157_++;
			is_155_[i_166_] += var13 * i_159_;
			i_159_ += i_161_;
		}
		class91_sub2_sub1.anInt2168 = i_158_ >> 2;
		class91_sub2_sub1.anInt2160 = i_159_ >> 2;
		class91_sub2_sub1.anInt2162 = i_156_ << 8;
		return i_157_ >> 1;
	}

	static int method550(final int i, final int i_167_) {
		return i_167_ < 0 ? -i : (int) (i * Math.sqrt(i_167_ * 1.220703125E-4) + 0.5);
	}

	public synchronized void method551(int i, final int i_168_, final int i_169_) {
		if (i == 0) {
			method552(i_168_, i_169_);
		} else {
			final int i_170_ = method556(i_168_, i_169_);
			final int i_171_ = method550(i_168_, i_169_);
			if (this.anInt2168 == i_170_ && this.anInt2160 == i_171_) {
				this.anInt2165 = 0;
			} else {
				int var6 = i_168_ - this.anInt2158;
				if (this.anInt2158 - i_168_ > var6) {
					var6 = this.anInt2158 - i_168_;
				}
				if (i_170_ - this.anInt2168 > var6) {
					var6 = i_170_ - this.anInt2168;
				}
				if (this.anInt2168 - i_170_ > var6) {
					var6 = this.anInt2168 - i_170_;
				}
				if (i_171_ - this.anInt2160 > var6) {
					var6 = i_171_ - this.anInt2160;
				}
				if (this.anInt2160 - i_171_ > var6) {
					var6 = this.anInt2160 - i_171_;
				}
				if (i > var6) {
					i = var6;
				}
				this.anInt2165 = i;
				this.anInt2156 = i_168_;
				this.anInt2157 = i_169_;
				this.anInt2155 = (i_168_ - this.anInt2158) / i;
				this.anInt2167 = (i_170_ - this.anInt2168) / i;
				this.anInt2166 = (i_171_ - this.anInt2160) / i;
			}
		}
	}

	synchronized void method552(final int i, final int i_172_) {
		this.anInt2156 = i;
		this.anInt2157 = i_172_;
		this.anInt2165 = 0;
		method518();
	}

	@Override
	protected Class91_Sub2 method502() {
		return null;
	}

	@Override
	protected Class91_Sub2 method506() {
		return null;
	}

	@Override
	public synchronized void method514(final int[] is, final int i, int i_173_) {
		if (this.anInt2156 == 0 && this.anInt2165 == 0) {
			method505(i_173_);
		} else {
			final Class91_Sub1_Sub1 class91_sub1_sub1 = (Class91_Sub1_Sub1) this.aClass91_Sub1_1756;
			final int i_174_ = this.anInt2154 << 8;
			final int i_175_ = this.anInt2163 << 8;
			final int i_176_ = class91_sub1_sub1.aByteArray2149.length << 8;
			final int i_177_ = i_175_ - i_174_;
			if (i_177_ <= 0) {
				this.anInt2161 = 0;
			}
			int i_178_ = i;
			i_173_ += i;
			if (this.anInt2162 < 0) {
				if (this.anInt2159 <= 0) {
					method524();
					method495();
					return;
				}
				this.anInt2162 = 0;
			}
			if (this.anInt2162 >= i_176_) {
				if (this.anInt2159 >= 0) {
					method524();
					method495();
					return;
				}
				this.anInt2162 = i_176_ - 1;
			}
			if (this.anInt2161 < 0) {
				if (this.aBoolean2164) {
					if (this.anInt2159 < 0) {
						i_178_ = method531(is, i, i_174_, i_173_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
						if (this.anInt2162 >= i_174_) {
							return;
						}
						this.anInt2162 = i_174_ + i_174_ - 1 - this.anInt2162;
						this.anInt2159 = -this.anInt2159;
					}
					for (;;) {
						i_178_ = method557(is, i_178_, i_175_, i_173_, class91_sub1_sub1.aByteArray2149[this.anInt2163 - 1]);
						if (this.anInt2162 < i_175_) {
							break;
						}
						this.anInt2162 = i_175_ + i_175_ - 1 - this.anInt2162;
						this.anInt2159 = -this.anInt2159;
						i_178_ = method531(is, i_178_, i_174_, i_173_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
						if (this.anInt2162 >= i_174_) {
							break;
						}
						this.anInt2162 = i_174_ + i_174_ - 1 - this.anInt2162;
						this.anInt2159 = -this.anInt2159;
					}
				} else if (this.anInt2159 < 0) {
					for (;;) {
						i_178_ = method531(is, i_178_, i_174_, i_173_, class91_sub1_sub1.aByteArray2149[this.anInt2163 - 1]);
						if (this.anInt2162 >= i_174_) {
							break;
						}
						this.anInt2162 = i_175_ - 1 - (i_175_ - 1 - this.anInt2162) % i_177_;
					}
				} else {
					for (;;) {
						i_178_ = method557(is, i_178_, i_175_, i_173_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
						if (this.anInt2162 < i_175_) {
							break;
						}
						this.anInt2162 = i_174_ + (this.anInt2162 - i_174_) % i_177_;
					}
				}
			} else {
				do {
					if (this.anInt2161 > 0) {
						if (this.aBoolean2164) {
							if (this.anInt2159 < 0) {
								i_178_ = method531(is, i, i_174_, i_173_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
								if (this.anInt2162 >= i_174_) {
									return;
								}
								this.anInt2162 = i_174_ + i_174_ - 1 - this.anInt2162;
								this.anInt2159 = -this.anInt2159;
								if (--this.anInt2161 == 0) {
									break;
								}
							}
							do {
								i_178_ = method557(is, i_178_, i_175_, i_173_, class91_sub1_sub1.aByteArray2149[this.anInt2163 - 1]);
								if (this.anInt2162 < i_175_) {
									return;
								}
								this.anInt2162 = i_175_ + i_175_ - 1 - this.anInt2162;
								this.anInt2159 = -this.anInt2159;
								if (--this.anInt2161 == 0) {
									break;
								}
								i_178_ = method531(is, i_178_, i_174_, i_173_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
								if (this.anInt2162 >= i_174_) {
									return;
								}
								this.anInt2162 = i_174_ + i_174_ - 1 - this.anInt2162;
								this.anInt2159 = -this.anInt2159;
							} while (--this.anInt2161 != 0);
						} else if (this.anInt2159 < 0) {
							for (;;) {
								i_178_ = method531(is, i_178_, i_174_, i_173_, class91_sub1_sub1.aByteArray2149[this.anInt2163 - 1]);
								if (this.anInt2162 >= i_174_) {
									return;
								}
								final int i_179_ = (i_175_ - 1 - this.anInt2162) / i_177_;
								if (i_179_ >= this.anInt2161) {
									this.anInt2162 += i_177_ * this.anInt2161;
									this.anInt2161 = 0;
									break;
								}
								this.anInt2162 += i_177_ * i_179_;
								this.anInt2161 -= i_179_;
							}
						} else {
							for (;;) {
								i_178_ = method557(is, i_178_, i_175_, i_173_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
								if (this.anInt2162 < i_175_) {
									return;
								}
								final int i_180_ = (this.anInt2162 - i_174_) / i_177_;
								if (i_180_ >= this.anInt2161) {
									this.anInt2162 -= i_177_ * this.anInt2161;
									this.anInt2161 = 0;
									break;
								}
								this.anInt2162 -= i_177_ * i_180_;
								this.anInt2161 -= i_180_;
							}
						}
					}
				} while (false);
				if (this.anInt2159 < 0) {
					method531(is, i_178_, 0, i_173_, 0);
					if (this.anInt2162 < 0) {
						this.anInt2162 = -1;
						method524();
						method495();
					}
				} else {
					method557(is, i_178_, i_176_, i_173_, 0);
					if (this.anInt2162 >= i_176_) {
						this.anInt2162 = i_176_;
						method524();
						method495();
					}
				}
			}
		}
	}

	@Override
	protected int method509() {
		return this.anInt2156 == 0 && this.anInt2165 == 0 ? 0 : 1;
	}

	static int method553(int i, int i_181_, final byte[] is, final int[] is_182_, int i_183_, int i_184_, final int i_185_, final int i_186_, int i_187_, final int i_188_, final int i_189_, final Class91_Sub2_Sub1 class91_sub2_sub1, final int i_190_, final int i_191_) {
		if (i_190_ == 0 || (i_187_ = i_184_ + (i_189_ - i_183_ + i_190_ - 257) / i_190_) > i_188_) {
			i_187_ = i_188_;
		}
		i_184_ <<= 1;
		i_187_ <<= 1;
		while (i_184_ < i_187_) {
			i_181_ = i_183_ >> 8;
			final byte var14 = is[i_181_];
			i = (var14 << 8) + (is[i_181_ + 1] - var14) * (i_183_ & 0xff);
			int i_192_ = i_184_++;
			is_182_[i_192_] += i * i_185_ >> 6;
			i_192_ = i_184_++;
			is_182_[i_192_] += i * i_186_ >> 6;
			i_183_ += i_190_;
		}
		if (i_190_ == 0 || (i_187_ = (i_184_ >> 1) + (i_189_ - i_183_ + i_190_ - 1) / i_190_) > i_188_) {
			i_187_ = i_188_;
		}
		i_187_ <<= 1;
		i_181_ = i_191_;
		while (i_184_ < i_187_) {
			final byte var14 = is[i_183_ >> 8];
			i = (var14 << 8) + (i_181_ - var14) * (i_183_ & 0xff);
			int i_193_ = i_184_++;
			is_182_[i_193_] += i * i_185_ >> 6;
			i_193_ = i_184_++;
			is_182_[i_193_] += i * i_186_ >> 6;
			i_183_ += i_190_;
		}
		class91_sub2_sub1.anInt2162 = i_183_;
		return i_184_ >> 1;
	}

	@Override
	protected int method497() {
		return this.anInt2156 == 0 && this.anInt2165 == 0 ? 0 : 1;
	}

	@Override
	public synchronized void method511(int i) {
		if (this.anInt2165 > 0) {
			if (i >= this.anInt2165) {
				if (this.anInt2156 == -2147483648) {
					this.anInt2156 = 0;
					this.anInt2160 = 0;
					this.anInt2168 = 0;
					this.anInt2158 = 0;
					method495();
					i = this.anInt2165;
				}
				this.anInt2165 = 0;
				method518();
			} else {
				this.anInt2158 += this.anInt2155 * i;
				this.anInt2168 += this.anInt2167 * i;
				this.anInt2160 += this.anInt2166 * i;
				this.anInt2165 -= i;
			}
		}
		final Class91_Sub1_Sub1 class91_sub1_sub1 = (Class91_Sub1_Sub1) this.aClass91_Sub1_1756;
		final int i_194_ = this.anInt2154 << 8;
		final int i_195_ = this.anInt2163 << 8;
		final int i_196_ = class91_sub1_sub1.aByteArray2149.length << 8;
		final int i_197_ = i_195_ - i_194_;
		if (i_197_ <= 0) {
			this.anInt2161 = 0;
		}
		if (this.anInt2162 < 0) {
			if (this.anInt2159 <= 0) {
				method524();
				method495();
				return;
			}
			this.anInt2162 = 0;
		}
		if (this.anInt2162 >= i_196_) {
			if (this.anInt2159 >= 0) {
				method524();
				method495();
				return;
			}
			this.anInt2162 = i_196_ - 1;
		}
		this.anInt2162 += this.anInt2159 * i;
		if (this.anInt2161 < 0) {
			if (!this.aBoolean2164) {
				if (this.anInt2159 < 0) {
					if (this.anInt2162 < i_194_) {
						this.anInt2162 = i_195_ - 1 - (i_195_ - 1 - this.anInt2162) % i_197_;
					}
				} else if (this.anInt2162 >= i_195_) {
					this.anInt2162 = i_194_ + (this.anInt2162 - i_194_) % i_197_;
				}
			} else {
				if (this.anInt2159 < 0) {
					if (this.anInt2162 >= i_194_) {
						return;
					}
					this.anInt2162 = i_194_ + i_194_ - 1 - this.anInt2162;
					this.anInt2159 = -this.anInt2159;
				}
				while (this.anInt2162 >= i_195_) {
					this.anInt2162 = i_195_ + i_195_ - 1 - this.anInt2162;
					this.anInt2159 = -this.anInt2159;
					if (this.anInt2162 >= i_194_) {
						break;
					}
					this.anInt2162 = i_194_ + i_194_ - 1 - this.anInt2162;
					this.anInt2159 = -this.anInt2159;
				}
			}
		} else {
			do {
				if (this.anInt2161 > 0) {
					if (this.aBoolean2164) {
						if (this.anInt2159 < 0) {
							if (this.anInt2162 >= i_194_) {
								return;
							}
							this.anInt2162 = i_194_ + i_194_ - 1 - this.anInt2162;
							this.anInt2159 = -this.anInt2159;
							if (--this.anInt2161 == 0) {
								break;
							}
						}
						do {
							if (this.anInt2162 < i_195_) {
								return;
							}
							this.anInt2162 = i_195_ + i_195_ - 1 - this.anInt2162;
							this.anInt2159 = -this.anInt2159;
							if (--this.anInt2161 == 0) {
								break;
							}
							if (this.anInt2162 >= i_194_) {
								return;
							}
							this.anInt2162 = i_194_ + i_194_ - 1 - this.anInt2162;
							this.anInt2159 = -this.anInt2159;
						} while (--this.anInt2161 != 0);
					} else {
						if (this.anInt2159 < 0) {
							if (this.anInt2162 < i_194_) {
								final int var7 = (i_195_ - 1 - this.anInt2162) / i_197_;
								if (var7 >= this.anInt2161) {
									this.anInt2162 += i_197_ * this.anInt2161;
									this.anInt2161 = 0;
									break;
								}
								this.anInt2162 += i_197_ * var7;
								this.anInt2161 -= var7;
							}
						} else if (this.anInt2162 >= i_195_) {
							final int var7 = (this.anInt2162 - i_194_) / i_197_;
							if (var7 >= this.anInt2161) {
								this.anInt2162 -= i_197_ * this.anInt2161;
								this.anInt2161 = 0;
								break;
							}
							this.anInt2162 -= i_197_ * var7;
							this.anInt2161 -= var7;
						}
						return;
					}
				}
			} while (false);
			if (this.anInt2159 < 0) {
				if (this.anInt2162 < 0) {
					this.anInt2162 = -1;
					method524();
					method495();
				}
			} else if (this.anInt2162 >= i_196_) {
				this.anInt2162 = i_196_;
				method524();
				method495();
			}
		}
	}

	@Override
	protected Class91_Sub2 method507() {
		return null;
	}

	public static Class91_Sub2_Sub1 method554(final Class91_Sub1_Sub1 class91_sub1_sub1, final int i, final int i_198_) {
		return class91_sub1_sub1.aByteArray2149 != null && class91_sub1_sub1.aByteArray2149.length != 0 ? new Class91_Sub2_Sub1(class91_sub1_sub1, (int) (class91_sub1_sub1.anInt2152 * 256L * i / (Class6.anInt81 * -288391204)), i_198_ << 6) : null;
	}

	@Override
	protected int method510() {
		return this.anInt2156 == 0 && this.anInt2165 == 0 ? 0 : 1;
	}

	static int method555(final int i, final byte[] is, final int[] is_199_, int i_200_, int i_201_, int i_202_, int i_203_, int i_204_, final int i_205_, int i_206_, final Class91_Sub2_Sub1 class91_sub2_sub1) {
		i_200_ >>= 8;
		i_206_ >>= 8;
		i_202_ <<= 2;
		i_203_ <<= 2;
		if ((i_204_ = i_201_ + i_200_ - (i_206_ - 1)) > i_205_) {
			i_204_ = i_205_;
		}
		i_201_ <<= 1;
		i_204_ <<= 1;
		i_204_ -= 6;
		while (i_201_ < i_204_) {
			int i_207_ = is[i_200_--];
			int var10001 = i_201_++;
			is_199_[var10001] += i_207_ * i_202_;
			var10001 = i_201_++;
			is_199_[var10001] += i_207_ * i_203_;
			i_207_ = is[i_200_--];
			var10001 = i_201_++;
			is_199_[var10001] += i_207_ * i_202_;
			var10001 = i_201_++;
			is_199_[var10001] += i_207_ * i_203_;
			i_207_ = is[i_200_--];
			var10001 = i_201_++;
			is_199_[var10001] += i_207_ * i_202_;
			var10001 = i_201_++;
			is_199_[var10001] += i_207_ * i_203_;
			i_207_ = is[i_200_--];
			var10001 = i_201_++;
			is_199_[var10001] += i_207_ * i_202_;
			var10001 = i_201_++;
			is_199_[var10001] += i_207_ * i_203_;
		}
		i_204_ += 6;
		while (i_201_ < i_204_) {
			final int i_208_ = is[i_200_--];
			int var10001 = i_201_++;
			is_199_[var10001] += i_208_ * i_202_;
			var10001 = i_201_++;
			is_199_[var10001] += i_208_ * i_203_;
		}
		class91_sub2_sub1.anInt2162 = i_200_ << 8;
		return i_201_ >> 1;
	}

	static int method556(final int i, final int i_209_) {
		return i_209_ < 0 ? i : (int) (i * Math.sqrt((16384 - i_209_) * 1.220703125E-4) + 0.5);
	}

	int method557(final int[] is, int i, final int i_210_, final int i_211_, final int i_212_) {
		while_14_: do {
			do {
				if (this.anInt2165 <= 0) {
					break while_14_;
				}
				int var6 = i + this.anInt2165;
				if (var6 > i_211_) {
					var6 = i_211_;
				}
				this.anInt2165 += i;
				if (this.anInt2159 == 256 && (this.anInt2162 & 0xff) == 0) {
					if (Class6.aBoolean80) {
						i = method558(0, ((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149, is, this.anInt2162, i, this.anInt2168, this.anInt2160, this.anInt2167, this.anInt2166, 0, var6, i_210_, this);
					} else {
						i = method542(((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149, is, this.anInt2162, i, this.anInt2158, this.anInt2155, 0, var6, i_210_, this);
					}
				} else if (Class6.aBoolean80) {
					i = method516(0, 0, ((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149, is, this.anInt2162, i, this.anInt2168, this.anInt2160, this.anInt2167, this.anInt2166, 0, var6, i_210_, this, this.anInt2159, i_212_);
				} else {
					i = method539(0, 0, ((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149, is, this.anInt2162, i, this.anInt2158, this.anInt2155, 0, var6, i_210_, this, this.anInt2159, i_212_);
				}
				this.anInt2165 -= i;
				if (this.anInt2165 != 0) {
					return i;
				}
			} while (!method537());
			return i_211_;
		} while (false);
		if (this.anInt2159 == 256 && (this.anInt2162 & 0xff) == 0) {
			if (Class6.aBoolean80) {
				return method533(0, ((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149, is, this.anInt2162, i, this.anInt2168, this.anInt2160, 0, i_211_, i_210_, this);
			}
			return method532(((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149, is, this.anInt2162, i, this.anInt2158, 0, i_211_, i_210_, this);
		}
		if (Class6.aBoolean80) {
			return method553(0, 0, ((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149, is, this.anInt2162, i, this.anInt2168, this.anInt2160, 0, i_211_, i_210_, this, this.anInt2159, i_212_);
		}
		return method535(0, 0, ((Class91_Sub1_Sub1) this.aClass91_Sub1_1756).aByteArray2149, is, this.anInt2162, i, this.anInt2158, 0, i_211_, i_210_, this, this.anInt2159, i_212_);
	}

	@Override
	public synchronized void method512(final int[] is, final int i, int i_213_) {
		if (this.anInt2156 == 0 && this.anInt2165 == 0) {
			method505(i_213_);
		} else {
			final Class91_Sub1_Sub1 class91_sub1_sub1 = (Class91_Sub1_Sub1) this.aClass91_Sub1_1756;
			final int i_214_ = this.anInt2154 << 8;
			final int i_215_ = this.anInt2163 << 8;
			final int i_216_ = class91_sub1_sub1.aByteArray2149.length << 8;
			final int i_217_ = i_215_ - i_214_;
			if (i_217_ <= 0) {
				this.anInt2161 = 0;
			}
			int i_218_ = i;
			i_213_ += i;
			if (this.anInt2162 < 0) {
				if (this.anInt2159 <= 0) {
					method524();
					method495();
					return;
				}
				this.anInt2162 = 0;
			}
			if (this.anInt2162 >= i_216_) {
				if (this.anInt2159 >= 0) {
					method524();
					method495();
					return;
				}
				this.anInt2162 = i_216_ - 1;
			}
			if (this.anInt2161 < 0) {
				if (this.aBoolean2164) {
					if (this.anInt2159 < 0) {
						i_218_ = method531(is, i, i_214_, i_213_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
						if (this.anInt2162 >= i_214_) {
							return;
						}
						this.anInt2162 = i_214_ + i_214_ - 1 - this.anInt2162;
						this.anInt2159 = -this.anInt2159;
					}
					for (;;) {
						i_218_ = method557(is, i_218_, i_215_, i_213_, class91_sub1_sub1.aByteArray2149[this.anInt2163 - 1]);
						if (this.anInt2162 < i_215_) {
							break;
						}
						this.anInt2162 = i_215_ + i_215_ - 1 - this.anInt2162;
						this.anInt2159 = -this.anInt2159;
						i_218_ = method531(is, i_218_, i_214_, i_213_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
						if (this.anInt2162 >= i_214_) {
							break;
						}
						this.anInt2162 = i_214_ + i_214_ - 1 - this.anInt2162;
						this.anInt2159 = -this.anInt2159;
					}
				} else if (this.anInt2159 < 0) {
					for (;;) {
						i_218_ = method531(is, i_218_, i_214_, i_213_, class91_sub1_sub1.aByteArray2149[this.anInt2163 - 1]);
						if (this.anInt2162 >= i_214_) {
							break;
						}
						this.anInt2162 = i_215_ - 1 - (i_215_ - 1 - this.anInt2162) % i_217_;
					}
				} else {
					for (;;) {
						i_218_ = method557(is, i_218_, i_215_, i_213_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
						if (this.anInt2162 < i_215_) {
							break;
						}
						this.anInt2162 = i_214_ + (this.anInt2162 - i_214_) % i_217_;
					}
				}
			} else {
				do {
					if (this.anInt2161 > 0) {
						if (this.aBoolean2164) {
							if (this.anInt2159 < 0) {
								i_218_ = method531(is, i, i_214_, i_213_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
								if (this.anInt2162 >= i_214_) {
									return;
								}
								this.anInt2162 = i_214_ + i_214_ - 1 - this.anInt2162;
								this.anInt2159 = -this.anInt2159;
								if (--this.anInt2161 == 0) {
									break;
								}
							}
							do {
								i_218_ = method557(is, i_218_, i_215_, i_213_, class91_sub1_sub1.aByteArray2149[this.anInt2163 - 1]);
								if (this.anInt2162 < i_215_) {
									return;
								}
								this.anInt2162 = i_215_ + i_215_ - 1 - this.anInt2162;
								this.anInt2159 = -this.anInt2159;
								if (--this.anInt2161 == 0) {
									break;
								}
								i_218_ = method531(is, i_218_, i_214_, i_213_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
								if (this.anInt2162 >= i_214_) {
									return;
								}
								this.anInt2162 = i_214_ + i_214_ - 1 - this.anInt2162;
								this.anInt2159 = -this.anInt2159;
							} while (--this.anInt2161 != 0);
						} else if (this.anInt2159 < 0) {
							for (;;) {
								i_218_ = method531(is, i_218_, i_214_, i_213_, class91_sub1_sub1.aByteArray2149[this.anInt2163 - 1]);
								if (this.anInt2162 >= i_214_) {
									return;
								}
								final int i_219_ = (i_215_ - 1 - this.anInt2162) / i_217_;
								if (i_219_ >= this.anInt2161) {
									this.anInt2162 += i_217_ * this.anInt2161;
									this.anInt2161 = 0;
									break;
								}
								this.anInt2162 += i_217_ * i_219_;
								this.anInt2161 -= i_219_;
							}
						} else {
							for (;;) {
								i_218_ = method557(is, i_218_, i_215_, i_213_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
								if (this.anInt2162 < i_215_) {
									return;
								}
								final int i_220_ = (this.anInt2162 - i_214_) / i_217_;
								if (i_220_ >= this.anInt2161) {
									this.anInt2162 -= i_217_ * this.anInt2161;
									this.anInt2161 = 0;
									break;
								}
								this.anInt2162 -= i_217_ * i_220_;
								this.anInt2161 -= i_220_;
							}
						}
					}
				} while (false);
				if (this.anInt2159 < 0) {
					method531(is, i_218_, 0, i_213_, 0);
					if (this.anInt2162 < 0) {
						this.anInt2162 = -1;
						method524();
						method495();
					}
				} else {
					method557(is, i_218_, i_216_, i_213_, 0);
					if (this.anInt2162 >= i_216_) {
						this.anInt2162 = i_216_;
						method524();
						method495();
					}
				}
			}
		}
	}

	@Override
	public synchronized void method500(final int[] is, final int i, int i_221_) {
		if (this.anInt2156 == 0 && this.anInt2165 == 0) {
			method505(i_221_);
		} else {
			final Class91_Sub1_Sub1 class91_sub1_sub1 = (Class91_Sub1_Sub1) this.aClass91_Sub1_1756;
			final int i_222_ = this.anInt2154 << 8;
			final int i_223_ = this.anInt2163 << 8;
			final int i_224_ = class91_sub1_sub1.aByteArray2149.length << 8;
			final int i_225_ = i_223_ - i_222_;
			if (i_225_ <= 0) {
				this.anInt2161 = 0;
			}
			int i_226_ = i;
			i_221_ += i;
			if (this.anInt2162 < 0) {
				if (this.anInt2159 <= 0) {
					method524();
					method495();
					return;
				}
				this.anInt2162 = 0;
			}
			if (this.anInt2162 >= i_224_) {
				if (this.anInt2159 >= 0) {
					method524();
					method495();
					return;
				}
				this.anInt2162 = i_224_ - 1;
			}
			if (this.anInt2161 < 0) {
				if (this.aBoolean2164) {
					if (this.anInt2159 < 0) {
						i_226_ = method531(is, i, i_222_, i_221_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
						if (this.anInt2162 >= i_222_) {
							return;
						}
						this.anInt2162 = i_222_ + i_222_ - 1 - this.anInt2162;
						this.anInt2159 = -this.anInt2159;
					}
					for (;;) {
						i_226_ = method557(is, i_226_, i_223_, i_221_, class91_sub1_sub1.aByteArray2149[this.anInt2163 - 1]);
						if (this.anInt2162 < i_223_) {
							break;
						}
						this.anInt2162 = i_223_ + i_223_ - 1 - this.anInt2162;
						this.anInt2159 = -this.anInt2159;
						i_226_ = method531(is, i_226_, i_222_, i_221_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
						if (this.anInt2162 >= i_222_) {
							break;
						}
						this.anInt2162 = i_222_ + i_222_ - 1 - this.anInt2162;
						this.anInt2159 = -this.anInt2159;
					}
				} else if (this.anInt2159 < 0) {
					for (;;) {
						i_226_ = method531(is, i_226_, i_222_, i_221_, class91_sub1_sub1.aByteArray2149[this.anInt2163 - 1]);
						if (this.anInt2162 >= i_222_) {
							break;
						}
						this.anInt2162 = i_223_ - 1 - (i_223_ - 1 - this.anInt2162) % i_225_;
					}
				} else {
					for (;;) {
						i_226_ = method557(is, i_226_, i_223_, i_221_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
						if (this.anInt2162 < i_223_) {
							break;
						}
						this.anInt2162 = i_222_ + (this.anInt2162 - i_222_) % i_225_;
					}
				}
			} else {
				do {
					if (this.anInt2161 > 0) {
						if (this.aBoolean2164) {
							if (this.anInt2159 < 0) {
								i_226_ = method531(is, i, i_222_, i_221_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
								if (this.anInt2162 >= i_222_) {
									return;
								}
								this.anInt2162 = i_222_ + i_222_ - 1 - this.anInt2162;
								this.anInt2159 = -this.anInt2159;
								if (--this.anInt2161 == 0) {
									break;
								}
							}
							do {
								i_226_ = method557(is, i_226_, i_223_, i_221_, class91_sub1_sub1.aByteArray2149[this.anInt2163 - 1]);
								if (this.anInt2162 < i_223_) {
									return;
								}
								this.anInt2162 = i_223_ + i_223_ - 1 - this.anInt2162;
								this.anInt2159 = -this.anInt2159;
								if (--this.anInt2161 == 0) {
									break;
								}
								i_226_ = method531(is, i_226_, i_222_, i_221_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
								if (this.anInt2162 >= i_222_) {
									return;
								}
								this.anInt2162 = i_222_ + i_222_ - 1 - this.anInt2162;
								this.anInt2159 = -this.anInt2159;
							} while (--this.anInt2161 != 0);
						} else if (this.anInt2159 < 0) {
							for (;;) {
								i_226_ = method531(is, i_226_, i_222_, i_221_, class91_sub1_sub1.aByteArray2149[this.anInt2163 - 1]);
								if (this.anInt2162 >= i_222_) {
									return;
								}
								final int i_227_ = (i_223_ - 1 - this.anInt2162) / i_225_;
								if (i_227_ >= this.anInt2161) {
									this.anInt2162 += i_225_ * this.anInt2161;
									this.anInt2161 = 0;
									break;
								}
								this.anInt2162 += i_225_ * i_227_;
								this.anInt2161 -= i_227_;
							}
						} else {
							for (;;) {
								i_226_ = method557(is, i_226_, i_223_, i_221_, class91_sub1_sub1.aByteArray2149[this.anInt2154]);
								if (this.anInt2162 < i_223_) {
									return;
								}
								final int i_228_ = (this.anInt2162 - i_222_) / i_225_;
								if (i_228_ >= this.anInt2161) {
									this.anInt2162 -= i_225_ * this.anInt2161;
									this.anInt2161 = 0;
									break;
								}
								this.anInt2162 -= i_225_ * i_228_;
								this.anInt2161 -= i_228_;
							}
						}
					}
				} while (false);
				if (this.anInt2159 < 0) {
					method531(is, i_226_, 0, i_221_, 0);
					if (this.anInt2162 < 0) {
						this.anInt2162 = -1;
						method524();
						method495();
					}
				} else {
					method557(is, i_226_, i_224_, i_221_, 0);
					if (this.anInt2162 >= i_224_) {
						this.anInt2162 = i_224_;
						method524();
						method495();
					}
				}
			}
		}
	}

	static int method558(final int i, final byte[] is, final int[] is_229_, int i_230_, int i_231_, int i_232_, int i_233_, int i_234_, int i_235_, int i_236_, final int i_237_, int i_238_, final Class91_Sub2_Sub1 class91_sub2_sub1) {
		i_230_ >>= 8;
		i_238_ >>= 8;
		i_232_ <<= 2;
		i_233_ <<= 2;
		i_234_ <<= 2;
		i_235_ <<= 2;
		if ((i_236_ = i_231_ + i_238_ - i_230_) > i_237_) {
			i_236_ = i_237_;
		}
		class91_sub2_sub1.anInt2158 += class91_sub2_sub1.anInt2155 * (i_236_ - i_231_);
		i_231_ <<= 1;
		i_236_ <<= 1;
		i_236_ -= 6;
		while (i_231_ < i_236_) {
			byte var13 = is[i_230_++];
			int i_239_ = i_231_++;
			is_229_[i_239_] += var13 * i_232_;
			i_232_ += i_234_;
			i_239_ = i_231_++;
			is_229_[i_239_] += var13 * i_233_;
			i_233_ += i_235_;
			var13 = is[i_230_++];
			i_239_ = i_231_++;
			is_229_[i_239_] += var13 * i_232_;
			i_232_ += i_234_;
			i_239_ = i_231_++;
			is_229_[i_239_] += var13 * i_233_;
			i_233_ += i_235_;
			var13 = is[i_230_++];
			i_239_ = i_231_++;
			is_229_[i_239_] += var13 * i_232_;
			i_232_ += i_234_;
			i_239_ = i_231_++;
			is_229_[i_239_] += var13 * i_233_;
			i_233_ += i_235_;
			var13 = is[i_230_++];
			i_239_ = i_231_++;
			is_229_[i_239_] += var13 * i_232_;
			i_232_ += i_234_;
			i_239_ = i_231_++;
			is_229_[i_239_] += var13 * i_233_;
			i_233_ += i_235_;
		}
		i_236_ += 6;
		while (i_231_ < i_236_) {
			final byte var13 = is[i_230_++];
			int i_240_ = i_231_++;
			is_229_[i_240_] += var13 * i_232_;
			i_232_ += i_234_;
			i_240_ = i_231_++;
			is_229_[i_240_] += var13 * i_233_;
			i_233_ += i_235_;
		}
		class91_sub2_sub1.anInt2168 = i_232_ >> 2;
		class91_sub2_sub1.anInt2160 = i_233_ >> 2;
		class91_sub2_sub1.anInt2162 = i_230_ << 8;
		return i_231_ >> 1;
	}
}
