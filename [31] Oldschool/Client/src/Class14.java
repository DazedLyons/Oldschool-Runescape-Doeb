/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

public final class Class14 {
	public static final int anInt197 = 56;
	Class4 aClass4_198;
	Class4 aClass4_199;
	int anInt200;
	int anInt201;
	public static final int anInt202 = 220;
	static byte[] aByteArray203 = new byte[520];

	public byte[] method172(final int i, final int i_0_) {
		try {
			final Class4 class4 = this.aClass4_198;
			synchronized (class4) {
				try {
					if (this.aClass4_199.method91(-1104484208) < i * 6 + 6) {
						return null;
					}
					this.aClass4_199.method90(6 * i);
					this.aClass4_199.method93(aByteArray203, 0, 6, 1938046383);
					final int i_1_ = (aByteArray203[2] & 0xff) + ((aByteArray203[0] & 0xff) << 16) + ((aByteArray203[1] & 0xff) << 8);
					int i_2_ = (aByteArray203[5] & 0xff) + ((aByteArray203[4] & 0xff) << 8) + ((aByteArray203[3] & 0xff) << 16);
					if (i_1_ >= 0 && i_1_ <= this.anInt201 * -522730451) {
						if (i_2_ > 0 && i_2_ <= this.aClass4_198.method91(-954909083) / 520L) {
							final byte[] is = new byte[i_1_];
							int i_3_ = 0;
							int i_4_ = 0;
							while (i_3_ < i_1_) {
								if (i_2_ == 0) {
									return null;
								}
								this.aClass4_198.method90(520 * i_2_);
								int i_5_ = i_1_ - i_3_;
								if (i_5_ > 512) {
									i_5_ = 512;
								}
								this.aClass4_198.method93(aByteArray203, 0, i_5_ + 8, 1465729297);
								final int i_6_ = ((aByteArray203[0] & 0xff) << 8) + (aByteArray203[1] & 0xff);
								final int i_7_ = ((aByteArray203[2] & 0xff) << 8) + (aByteArray203[3] & 0xff);
								final int i_8_ = (aByteArray203[6] & 0xff) + ((aByteArray203[4] & 0xff) << 16) + ((aByteArray203[5] & 0xff) << 8);
								final int i_9_ = aByteArray203[7] & 0xff;
								if (i_6_ == i && i_4_ == i_7_ && i_9_ == 1568743745 * this.anInt200) {
									if (i_8_ >= 0 && i_8_ <= this.aClass4_198.method91(2125588161) / 520L) {
										for (int i_10_ = 0; i_10_ < i_5_; i_10_++) {
											is[i_3_++] = aByteArray203[8 + i_10_];
										}
										i_2_ = i_8_;
										i_4_++;
									} else {
										return null;
									}
								} else {
									return null;
								}
							}
							final byte[] is_11_ = is;
							final byte[] is_12_ = is_11_;
							return is_12_;
						}
						return null;
					}
				} catch (final IOException ioexception) {
					return null;
				}
				return null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bk.i()");
		}
	}

	public boolean method173(final int i, final byte[] is, final int i_13_, final byte i_14_) {
		try {
			final Class4 class4 = this.aClass4_198;
			synchronized (class4) {
				if (i_13_ >= 0 && i_13_ <= this.anInt201 * -522730451) {
					boolean bool = method174(i, is, i_13_, true, -1382097241);
					if (!bool) {
						bool = method174(i, is, i_13_, false, 1327526071);
					}
					final boolean bool_15_ = bool;
					return bool_15_;
				}
				throw new IllegalArgumentException();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bk.w()");
		}
	}

	boolean method174(final int i, final byte[] is, final int i_16_, boolean bool, final int i_17_) {
		try {
			final Class4 class4 = this.aClass4_198;
			synchronized (class4) {
				boolean bool_18_;
				try {
					int i_19_;
					if (bool) {
						if (this.aClass4_199.method91(-1412293427) < 6 * i + 6) {
							return false;
						}
						this.aClass4_199.method90(6 * i);
						this.aClass4_199.method93(aByteArray203, 0, 6, -562697320);
						i_19_ = (aByteArray203[5] & 0xff) + ((aByteArray203[3] & 0xff) << 16) + ((aByteArray203[4] & 0xff) << 8);
						if (i_19_ <= 0 || i_19_ > this.aClass4_198.method91(-517481537) / 520L) {
							return false;
						}
					} else {
						i_19_ = (int) ((this.aClass4_198.method91(1380880713) + 519L) / 520L);
						if (i_19_ == 0) {
							i_19_ = 1;
						}
					}
					aByteArray203[0] = (byte) (i_16_ >> 16);
					aByteArray203[1] = (byte) (i_16_ >> 8);
					aByteArray203[2] = (byte) i_16_;
					aByteArray203[3] = (byte) (i_19_ >> 16);
					aByteArray203[4] = (byte) (i_19_ >> 8);
					aByteArray203[5] = (byte) i_19_;
					this.aClass4_199.method90(i * 6);
					this.aClass4_199.method95(aByteArray203, 0, 6, 1023597744);
					int i_20_ = 0;
					int i_21_ = 0;
					while (i_20_ < i_16_) {
						int i_22_ = 0;
						if (bool) {
							this.aClass4_198.method90(i_19_ * 520);
							try {
								this.aClass4_198.method93(aByteArray203, 0, 8, -1627321941);
							} catch (final EOFException eofexception) {
								break;
							}
							final int i_23_ = (aByteArray203[1] & 0xff) + ((aByteArray203[0] & 0xff) << 8);
							final int i_24_ = (aByteArray203[3] & 0xff) + ((aByteArray203[2] & 0xff) << 8);
							i_22_ = ((aByteArray203[4] & 0xff) << 16) + ((aByteArray203[5] & 0xff) << 8) + (aByteArray203[6] & 0xff);
							final int i_25_ = aByteArray203[7] & 0xff;
							if (i_23_ == i && i_24_ == i_21_ && this.anInt200 * 1568743745 == i_25_) {
								if (i_22_ < 0 || i_22_ > this.aClass4_198.method91(777030493) / 520L) {
									return false;
								}
							} else {
								return false;
							}
						}
						if (i_22_ == 0) {
							bool = false;
							i_22_ = (int) ((this.aClass4_198.method91(478436594) + 519L) / 520L);
							if (i_22_ == 0) {
								i_22_++;
							}
							if (i_22_ == i_19_) {
								i_22_++;
							}
						}
						if (i_16_ - i_20_ <= 512) {
							i_22_ = 0;
						}
						aByteArray203[0] = (byte) (i >> 8);
						aByteArray203[1] = (byte) i;
						aByteArray203[2] = (byte) (i_21_ >> 8);
						aByteArray203[3] = (byte) i_21_;
						aByteArray203[4] = (byte) (i_22_ >> 16);
						aByteArray203[5] = (byte) (i_22_ >> 8);
						aByteArray203[6] = (byte) i_22_;
						aByteArray203[7] = (byte) (this.anInt200 * 1568743745);
						this.aClass4_198.method90(520 * i_19_);
						this.aClass4_198.method95(aByteArray203, 0, 8, -370348681);
						int i_26_ = i_16_ - i_20_;
						if (i_26_ > 512) {
							i_26_ = 512;
						}
						this.aClass4_198.method95(is, i_20_, i_26_, 1326147597);
						i_20_ += i_26_;
						i_19_ = i_22_;
						i_21_++;
					}
					bool_18_ = true;
				} catch (final IOException ioexception) {
					return false;
				}
				final boolean bool_27_ = bool_18_;
				return bool_27_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bk.f()");
		}
	}

	static final void method175(final String string, final String string_28_, final int i, final int i_29_, final int i_30_, final int i_31_, final int i_32_) {
		try {
			if (client.aBoolean1538) {
				if (i_32_ != -1101298913) {
					throw new IllegalStateException();
				}
			} else if (client.anInt1585 * 1335574821 < 500) {
				client.aStringArray1638[client.anInt1585 * 1335574821] = string;
				client.aStringArray1591[1335574821 * client.anInt1585] = string_28_;
				client.anIntArray1588[1335574821 * client.anInt1585] = i;
				client.anIntArray1589[client.anInt1585 * 1335574821] = i_29_;
				client.anIntArray1586[1335574821 * client.anInt1585] = i_30_;
				client.anIntArray1587[1335574821 * client.anInt1585] = i_31_;
				client.anInt1585 += 109114029;
			}
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "bk.bs()");
		}
	}

	static boolean method176(final Js5 class63, final int i, final byte i_33_) {
		try {
			final byte[] is = class63.method402(i, -19293751);
			if (is == null) {
				return false;
			}
			Class91_Sub5.method619(is, (byte) -80);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bk.z()");
		}
		return true;
	}

	public Class14(final int i, final Class4 class4, final Class4 class4_34_, final int i_35_) {
		try {
			this.aClass4_198 = null;
			this.aClass4_199 = null;
			this.anInt201 = 1252105864;
			this.anInt200 = -1839436095 * i;
			this.aClass4_198 = class4;
			this.aClass4_199 = class4_34_;
			this.anInt201 = -1194906715 * i_35_;
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "bk.<init>()");
		}
	}

	static Class91_Sub20_Sub13_Sub1[] method177(final byte i) {
		Class91_Sub20_Sub13_Sub1[] class91_sub20_sub13_sub1s;
		try {
			final Class91_Sub20_Sub13_Sub1[] class91_sub20_sub13_sub1s_36_ = new Class91_Sub20_Sub13_Sub1[1302560181 * Class37.anInt446];
			for (int i_37_ = 0; i_37_ < 1302560181 * Class37.anInt446; i_37_++) {
				final Class91_Sub20_Sub13_Sub1 class91_sub20_sub13_sub1 = class91_sub20_sub13_sub1s_36_[i_37_] = new Class91_Sub20_Sub13_Sub1();
				class91_sub20_sub13_sub1.anInt2521 = Class37.anInt451 * 201426335;
				class91_sub20_sub13_sub1.anInt2522 = Class37.anInt447 * 1455742675;
				class91_sub20_sub13_sub1.anInt2518 = Class37.anIntArray445[i_37_];
				class91_sub20_sub13_sub1.anInt2516 = Class89.anIntArray1183[i_37_];
				class91_sub20_sub13_sub1.anInt2517 = Class57.anIntArray698[i_37_];
				class91_sub20_sub13_sub1.anInt2519 = Class37.anIntArray449[i_37_];
				class91_sub20_sub13_sub1.anIntArray2515 = FloUnderlayType.anIntArray2418;
				class91_sub20_sub13_sub1.aByteArray2520 = Class74.aByteArrayArray844[i_37_];
			}
			Class18.method186(1636454116);
			class91_sub20_sub13_sub1s = class91_sub20_sub13_sub1s_36_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bk.k()");
		}
		return class91_sub20_sub13_sub1s;
	}
}
