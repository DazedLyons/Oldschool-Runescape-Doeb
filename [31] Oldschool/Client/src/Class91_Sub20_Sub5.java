/* Class91_Sub20_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class91_Sub20_Sub5 extends Class91_Sub20 {
	int[] anIntArray2263;
	static Js5 aClass63_2264;
	static final int anInt2265 = 1;
	static Class96 aClass96_2266 = new Class96(64);
	static Class91_Sub18 aClass91_Sub18_2267;
	public int[] anIntArray2268;
	int[] anIntArray2269;
	public int[] anIntArray2270;
	public int anInt2271;
	static Js5 aClass63_2272;
	static Js5 aClass63_2273;
	public int[] anIntArray2274;
	public int anInt2275;
	public int anInt2276;
	public int anInt2277;
	public int anInt2278;
	public int anInt2279;
	public int anInt2280;
	public int anInt2281;
	public boolean aBoolean2282;
	static final int anInt2283 = 21;
	static Class96 aClass96_2284 = new Class96(100);

	void method751(final ByteBuffer class91_sub9, final int i, final int i_0_) {
		try {
			if (i == 1) {
				if (i_0_ > 959790524) {
					final int i_1_ = class91_sub9.method686((byte) 0);
					anIntArray2270 = new int[i_1_];
					for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
						if (i_0_ <= 959790524) {
							return;
						}
						anIntArray2270[i_2_] = class91_sub9.method686((byte) -83);
					}
					anIntArray2268 = new int[i_1_];
					for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
						anIntArray2268[i_3_] = class91_sub9.method686((byte) -109);
					}
					for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
						anIntArray2268[i_4_] += class91_sub9.method686((byte) -90) << 16;
					}
				}
			} else if (i == 2) {
				anInt2277 = class91_sub9.method686((byte) -13) * 1551507283;
			} else if (3 == i) {
				final int i_5_ = class91_sub9.readUnsignedByte();
				this.anIntArray2263 = new int[i_5_ + 1];
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					this.anIntArray2263[i_6_] = class91_sub9.readUnsignedByte();
				}
				this.anIntArray2263[i_5_] = 9999999;
			} else if (i == 4) {
				aBoolean2282 = true;
			} else if (i == 5) {
				anInt2275 = class91_sub9.readUnsignedByte() * -1753872745;
			} else if (6 == i) {
				anInt2276 = class91_sub9.method686((byte) -79) * -1897808231;
			} else if (7 == i) {
				anInt2271 = class91_sub9.method686((byte) -91) * -511860927;
			} else if (8 == i) {
				anInt2278 = class91_sub9.readUnsignedByte() * -217560363;
			} else if (9 == i) {
				anInt2279 = class91_sub9.readUnsignedByte() * 2021254493;
			} else if (10 == i) {
				anInt2280 = class91_sub9.readUnsignedByte() * 1974734457;
			} else if (i == 11) {
				anInt2281 = class91_sub9.readUnsignedByte() * 1812815603;
			} else if (i == 12) {
				if (i_0_ > 959790524) {
					final int i_7_ = class91_sub9.readUnsignedByte();
					this.anIntArray2269 = new int[i_7_];
					for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
						this.anIntArray2269[i_8_] = class91_sub9.method686((byte) -48);
					}
					for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
						this.anIntArray2269[i_9_] += class91_sub9.method686((byte) -96) << 16;
					}
				}
			} else if (13 == i) {
				final int i_10_ = class91_sub9.readUnsignedByte();
				anIntArray2274 = new int[i_10_];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
					anIntArray2274[i_11_] = class91_sub9.read3Bytes();
				}
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "ak.e()");
		}
	}

	Class91_Sub20_Sub5() {
		try {
			anInt2277 = -1551507283;
			aBoolean2282 = false;
			anInt2275 = -179429133;
			anInt2276 = 1897808231;
			anInt2271 = 511860927;
			anInt2278 = -63639457;
			anInt2279 = -2021254493;
			anInt2280 = -1974734457;
			anInt2281 = -669336090;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "ak.<init>()");
		}
	}

	Class91_Sub20_Sub14_Sub3 method752(final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3, int i, int i_12_, final short i_13_) {
		Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_14_;
		try {
			i = anIntArray2268[i];
			final Class91_Sub20_Sub15 class91_sub20_sub15 = Class26_Sub1.method251(i >> 16, (byte) 1);
			i &= 0xffff;
			if (class91_sub20_sub15 == null) {
				return class91_sub20_sub14_sub3.method971(true);
			}
			boolean bool;
			if (!class91_sub20_sub15.method1025(i, (short) -25826)) {
				bool = true;
			} else {
				bool = false;
			}
			final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_15_ = class91_sub20_sub14_sub3.method971(bool);
			i_12_ &= 0x3;
			if (i_12_ == 1) {
				class91_sub20_sub14_sub3_15_.method979();
			} else if (i_12_ == 2) {
				class91_sub20_sub14_sub3_15_.method984();
			} else if (i_12_ == 3) {
				class91_sub20_sub14_sub3_15_.method993();
			}
			class91_sub20_sub14_sub3_15_.method976(class91_sub20_sub15, i);
			if (1 == i_12_) {
				class91_sub20_sub14_sub3_15_.method993();
			} else if (2 == i_12_) {
				class91_sub20_sub14_sub3_15_.method984();
			} else if (i_12_ == 3) {
				class91_sub20_sub14_sub3_15_.method979();
			}
			class91_sub20_sub14_sub3_14_ = class91_sub20_sub14_sub3_15_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ak.p()");
		}
		return class91_sub20_sub14_sub3_14_;
	}

	Class91_Sub20_Sub14_Sub3 method753(final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3, int i, final byte i_16_) {
		Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_17_;
		try {
			i = anIntArray2268[i];
			final Class91_Sub20_Sub15 class91_sub20_sub15 = Class26_Sub1.method251(i >> 16, (byte) 1);
			i &= 0xffff;
			if (class91_sub20_sub15 == null) {
				return class91_sub20_sub14_sub3.method994(true);
			}
			boolean bool;
			if (!class91_sub20_sub15.method1025(i, (short) -8830)) {
				bool = true;
			} else {
				bool = false;
			}
			final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_18_ = class91_sub20_sub14_sub3.method994(bool);
			class91_sub20_sub14_sub3_18_.method976(class91_sub20_sub15, i);
			class91_sub20_sub14_sub3_17_ = class91_sub20_sub14_sub3_18_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ak.k()");
		}
		return class91_sub20_sub14_sub3_17_;
	}

	public Class91_Sub20_Sub14_Sub3 method754(final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3, int i, final Class91_Sub20_Sub5 class91_sub20_sub5_19_, int i_20_, final int i_21_) {
		Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_22_;
		try {
			i = anIntArray2268[i];
			final Class91_Sub20_Sub15 class91_sub20_sub15 = Class26_Sub1.method251(i >> 16, (byte) 1);
			i &= 0xffff;
			if (class91_sub20_sub15 == null) {
				return class91_sub20_sub5_19_.method756(class91_sub20_sub14_sub3, i_20_, -258643535);
			}
			i_20_ = class91_sub20_sub5_19_.anIntArray2268[i_20_];
			final Class91_Sub20_Sub15 class91_sub20_sub15_23_ = Class26_Sub1.method251(i_20_ >> 16, (byte) 1);
			i_20_ &= 0xffff;
			if (class91_sub20_sub15_23_ == null) {
				boolean bool;
				if (!class91_sub20_sub15.method1025(i, (short) -29593)) {
					bool = true;
				} else {
					bool = false;
				}
				final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_24_ = class91_sub20_sub14_sub3.method971(bool);
				class91_sub20_sub14_sub3_24_.method976(class91_sub20_sub15, i);
				return class91_sub20_sub14_sub3_24_;
			}
			final boolean bool = !class91_sub20_sub15.method1025(i, (short) -10937);
			boolean bool_25_;
			if (!class91_sub20_sub15_23_.method1025(i_20_, (short) -18337)) {
				bool_25_ = true;
			} else {
				bool_25_ = false;
			}
			final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_26_ = class91_sub20_sub14_sub3.method971(bool & bool_25_);
			class91_sub20_sub14_sub3_26_.method977(class91_sub20_sub15, i, class91_sub20_sub15_23_, i_20_, this.anIntArray2263);
			class91_sub20_sub14_sub3_22_ = class91_sub20_sub14_sub3_26_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ak.r()");
		}
		return class91_sub20_sub14_sub3_22_;
	}

	public Class91_Sub20_Sub14_Sub3 method755(final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3, final int i, final byte i_27_) {
		Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_28_;
		try {
			int i_29_ = anIntArray2268[i];
			final Class91_Sub20_Sub15 class91_sub20_sub15 = Class26_Sub1.method251(i_29_ >> 16, (byte) 1);
			i_29_ &= 0xffff;
			if (class91_sub20_sub15 == null) {
				if (i_27_ >= 0) {
					throw new IllegalStateException();
				}
				return class91_sub20_sub14_sub3.method971(true);
			}
			Class91_Sub20_Sub15 class91_sub20_sub15_30_ = null;
			int i_31_ = 0;
			if (this.anIntArray2269 != null) {
				if (i_27_ >= 0) {
					throw new IllegalStateException();
				}
				if (i < this.anIntArray2269.length) {
					if (i_27_ >= 0) {
						throw new IllegalStateException();
					}
					i_31_ = this.anIntArray2269[i];
					class91_sub20_sub15_30_ = Class26_Sub1.method251(i_31_ >> 16, (byte) 1);
					i_31_ &= 0xffff;
				}
			}
			if (class91_sub20_sub15_30_ != null) {
				if (i_31_ != 65535) {
					boolean bool;
					if (!class91_sub20_sub15.method1025(i_29_, (short) -31881)) {
						if (i_27_ >= 0) {
							throw new IllegalStateException();
						}
						bool = true;
					} else {
						bool = false;
					}
					final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_32_ = class91_sub20_sub14_sub3.method971(bool & !class91_sub20_sub15_30_.method1025(i_31_, (short) -4932));
					class91_sub20_sub14_sub3_32_.method976(class91_sub20_sub15, i_29_);
					class91_sub20_sub14_sub3_32_.method976(class91_sub20_sub15_30_, i_31_);
					return class91_sub20_sub14_sub3_32_;
				}
				if (i_27_ >= 0) {
					throw new IllegalStateException();
				}
			}
			boolean bool;
			if (!class91_sub20_sub15.method1025(i_29_, (short) -26529)) {
				if (i_27_ >= 0) {
					throw new IllegalStateException();
				}
				bool = true;
			} else {
				bool = false;
			}
			final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_33_ = class91_sub20_sub14_sub3.method971(bool);
			class91_sub20_sub14_sub3_33_.method976(class91_sub20_sub15, i_29_);
			class91_sub20_sub14_sub3_28_ = class91_sub20_sub14_sub3_33_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ak.l()");
		}
		return class91_sub20_sub14_sub3_28_;
	}

	public Class91_Sub20_Sub14_Sub3 method756(final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3, int i, final int i_34_) {
		Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_35_;
		try {
			i = anIntArray2268[i];
			final Class91_Sub20_Sub15 class91_sub20_sub15 = Class26_Sub1.method251(i >> 16, (byte) 1);
			i &= 0xffff;
			if (class91_sub20_sub15 == null) {
				return class91_sub20_sub14_sub3.method971(true);
			}
			boolean bool;
			if (!class91_sub20_sub15.method1025(i, (short) -28805)) {
				bool = true;
			} else {
				bool = false;
			}
			final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3_36_ = class91_sub20_sub14_sub3.method971(bool);
			class91_sub20_sub14_sub3_36_.method976(class91_sub20_sub15, i);
			class91_sub20_sub14_sub3_35_ = class91_sub20_sub14_sub3_36_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ak.d()");
		}
		return class91_sub20_sub14_sub3_35_;
	}

	void method757(final int i) {
		try {
			if (anInt2279 * 1217369845 == -1) {
				if (i <= -359848196) {
					return;
				}
				if (this.anIntArray2263 != null) {
					if (i <= -359848196) {
						return;
					}
					anInt2279 = -252458310;
				} else {
					anInt2279 = 0;
				}
			}
			if (-1 == anInt2280 * -890176567) {
				if (this.anIntArray2263 != null) {
					anInt2280 = -345498382;
				} else {
					anInt2280 = 0;
				}
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "ak.t()");
		}
	}

	void method758(final ByteBuffer class91_sub9, final byte i) {
		try {
			for (;;) {
				final int i_37_ = class91_sub9.readUnsignedByte();
				if (i_37_ == 0) {
					break;
				}
				method751(class91_sub9, i_37_, 1051989435);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ak.f()");
		}
	}

	static final void method759(final byte i) {
		try {
			if (Class86_Sub1.aClass6_1750 != null) {
				Class86_Sub1.aClass6_1750.method109(1851998673);
			}
			if (client.aClass6_1682 != null) {
				if (i == 0) {
					throw new IllegalStateException();
				}
				client.aClass6_1682.method109(1691470305);
			}
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "ak.b()");
		}
	}

	public static int method760(int i, final int i_38_) {
		int i_39_;
		try {
			i = (i >>> 1 & 0x55555555) + (i & 0x55555555);
			i = (i & 0x33333333) + (i >>> 2 & 0x33333333);
			i = (i >>> 4) + i & 0xf0f0f0f;
			i += i >>> 8;
			i += i >>> 16;
			i_39_ = i & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ak.w()");
		}
		return i_39_;
	}

	public static final void method761(final long l) {
		try {
			if (l > 0L) {
				if (0L == l % 10L) {
					Class91_Sub22.method1040(l - 1L);
					Class91_Sub22.method1040(1L);
				} else {
					Class91_Sub22.method1040(l);
				}
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "ak.i()");
		}
	}

	public static void method762(final ByteBuffer class91_sub9, final int i, final byte i_40_) {
		try {
			final Class91_Sub16 class91_sub16 = new Class91_Sub16();
			class91_sub16.anInt1952 = class91_sub9.readUnsignedByte() * -1799599285;
			class91_sub16.anInt1958 = class91_sub9.readDword() * 1584010839;
			class91_sub16.anIntArray1953 = new int[class91_sub16.anInt1952 * 187524707];
			class91_sub16.anIntArray1954 = new int[187524707 * class91_sub16.anInt1952];
			class91_sub16.aFieldArray1955 = new Field[187524707 * class91_sub16.anInt1952];
			class91_sub16.anIntArray1951 = new int[187524707 * class91_sub16.anInt1952];
			class91_sub16.aMethodArray1957 = new Method[187524707 * class91_sub16.anInt1952];
			class91_sub16.aByteArrayArrayArray1956 = new byte[class91_sub16.anInt1952 * 187524707][][];
			for (int i_41_ = 0; i_41_ < 187524707 * class91_sub16.anInt1952; i_41_++) {
				try {
					final int i_42_ = class91_sub9.readUnsignedByte();
					if (i_42_ != 0 && 1 != i_42_ && 2 != i_42_) {
						if (3 == i_42_ || i_42_ == 4) {
							final String string = new String(class91_sub9.method645((byte) -92));
							final String string_43_ = new String(class91_sub9.method645((byte) -53));
							final int i_44_ = class91_sub9.readUnsignedByte();
							final String[] strings = new String[i_44_];
							for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
								strings[i_45_] = new String(class91_sub9.method645((byte) -45));
							}
							final byte[][] is = new byte[i_44_][];
							if (i_42_ == 3) {
								for (int i_46_ = 0; i_46_ < i_44_; i_46_++) {
									final int i_47_ = class91_sub9.readDword();
									is[i_46_] = new byte[i_47_];
									class91_sub9.method647(is[i_46_], 0, i_47_, -1163188532);
								}
							}
							class91_sub16.anIntArray1953[i_41_] = i_42_;
							final Class[] var_classes = new Class[i_44_];
							for (int i_48_ = 0; i_48_ < i_44_; i_48_++) {
								var_classes[i_48_] = Class28_Sub1.method271(strings[i_48_], 16723968);
							}
							class91_sub16.aMethodArray1957[i_41_] = Class28_Sub1.method271(string, 16723968).getDeclaredMethod(string_43_, var_classes);
							class91_sub16.aByteArrayArrayArray1956[i_41_] = is;
						}
					} else {
						final String string = new String(class91_sub9.method645((byte) -84));
						final String string_49_ = new String(class91_sub9.method645((byte) -40));
						int i_50_ = 0;
						if (1 == i_42_) {
							i_50_ = class91_sub9.readDword();
						}
						class91_sub16.anIntArray1953[i_41_] = i_42_;
						class91_sub16.anIntArray1951[i_41_] = i_50_;
						class91_sub16.aFieldArray1955[i_41_] = Class28_Sub1.method271(string, 16723968).getDeclaredField(string_49_);
					}
				} catch (final ClassNotFoundException classnotfoundexception) {
					class91_sub16.anIntArray1954[i_41_] = -1;
				} catch (final SecurityException securityexception) {
					class91_sub16.anIntArray1954[i_41_] = -2;
				} catch (final NullPointerException nullpointerexception) {
					class91_sub16.anIntArray1954[i_41_] = -3;
				} catch (final Exception exception) {
					class91_sub16.anIntArray1954[i_41_] = -4;
				} catch (final Throwable throwable) {
					class91_sub16.anIntArray1954[i_41_] = -5;
				}
			}
			Class79.aClass95_1114.method1058(class91_sub16);
		} catch (final RuntimeException var18) {
			throw Class102.method1086(var18, "ak.f()");
		}
	}
}
