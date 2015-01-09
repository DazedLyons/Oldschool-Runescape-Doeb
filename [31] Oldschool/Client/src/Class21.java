/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class21 {
	static int anInt276;
	Js5 aClass63_277;
	Class83 aClass83_278;
	Class83 aClass83_279;
	Js5 aClass63_280;
	public static final int anInt281 = 207;

	Class91_Sub1_Sub1 method201(final int i, final int i_0_, final int[] is, final byte i_1_) {
		Class91_Sub1_Sub1 class91_sub1_sub1;
		try {
			int i_2_ = i_0_ ^ (i << 4 & 0xffff | i >>> 12);
			i_2_ |= i << 16;
			final long l = i_2_ ^ 0x100000000L;
			Class91_Sub1_Sub1 class91_sub1_sub1_3_ = (Class91_Sub1_Sub1) this.aClass83_279.method474(l);
			if (class91_sub1_sub1_3_ != null) {
				return class91_sub1_sub1_3_;
			}
			if (is != null && is[0] <= 0) {
				return null;
			}
			Class91_Sub4 class91_sub4 = (Class91_Sub4) this.aClass83_278.method474(l);
			if (class91_sub4 == null) {
				class91_sub4 = Class91_Sub4.method614(this.aClass63_277, i, i_0_);
				if (class91_sub4 == null) {
					return null;
				}
				this.aClass83_278.method478(class91_sub4, l);
			}
			class91_sub1_sub1_3_ = class91_sub4.method612(is);
			if (class91_sub1_sub1_3_ == null) {
				return null;
			}
			class91_sub4.method495();
			this.aClass83_279.method478(class91_sub1_sub1_3_, l);
			class91_sub1_sub1 = class91_sub1_sub1_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "br.w()");
		}
		return class91_sub1_sub1;
	}

	public static boolean method202(final int i, final byte i_4_) {
		boolean bool;
		try {
			if ((i >> 31 & 0x1) != 0) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "br.p()");
		}
		return bool;
	}

	public Class21(final Js5 class63, final Js5 class63_5_) {
		try {
			this.aClass83_278 = new Class83(256);
			this.aClass83_279 = new Class83(256);
			this.aClass63_280 = class63;
			this.aClass63_277 = class63_5_;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "br.<init>()");
		}
	}

	public Class91_Sub1_Sub1 method203(final int i, final int[] is, final int i_6_) {
		try {
			if (this.aClass63_277.method421((byte) -62) == 1) {
				return method201(0, i, is, (byte) 64);
			}
			if (this.aClass63_277.method405(i, 102737679) == 1) {
				return method201(i, 0, is, (byte) 2);
			}
			throw new RuntimeException();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "br.e()");
		}
	}

	Class91_Sub1_Sub1 method204(final int i, final int i_7_, final int[] is, final int i_8_) {
		Class91_Sub1_Sub1 class91_sub1_sub1;
		try {
			int i_9_ = i_7_ ^ (i << 4 & 0xffff | i >>> 12);
			i_9_ |= i << 16;
			final long l = i_9_;
			Class91_Sub1_Sub1 class91_sub1_sub1_10_ = (Class91_Sub1_Sub1) this.aClass83_279.method474(l);
			if (class91_sub1_sub1_10_ != null) {
				return class91_sub1_sub1_10_;
			}
			if (is != null && is[0] <= 0) {
				return null;
			}
			final Class22 class22 = Class22.method210(this.aClass63_280, i, i_7_);
			if (class22 == null) {
				return null;
			}
			class91_sub1_sub1_10_ = class22.method208();
			this.aClass83_279.method478(class91_sub1_sub1_10_, l);
			if (is != null) {
				is[0] -= class91_sub1_sub1_10_.aByteArray2149.length;
			}
			class91_sub1_sub1 = class91_sub1_sub1_10_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "br.i()");
		}
		return class91_sub1_sub1;
	}

	static Class63_Sub1 method205(final int i, final boolean bool, final boolean bool_11_, final boolean bool_12_, final int i_13_) {
		Class63_Sub1 class63_sub1;
		try {
			Class14 class14 = null;
			if (Class35.aClass4_417 != null) {
				class14 = new Class14(i, Class35.aClass4_417, Class1.aClass4Array35[i], 1000000);
			}
			class63_sub1 = new Class63_Sub1(class14, Class91_Sub24.aClass14_2136, i, bool, bool_11_, bool_12_);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "br.g()");
		}
		return class63_sub1;
	}

	public Class91_Sub1_Sub1 method206(final int i, final int[] is, final int i_14_) {
		try {
			if (this.aClass63_280.method421((byte) 18) == 1) {
				return method204(0, i, is, 926898316);
			}
			if (this.aClass63_280.method405(i, -1677301631) == 1) {
				return method204(i, 0, is, 1977702401);
			}
			throw new RuntimeException();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "br.f()");
		}
	}

	public static String method207(final CharSequence charsequence, final int i) {
		String string;
		try {
			String string_15_ = Class107.method1108(Class104.method1091(charsequence, (byte) 61));
			if (string_15_ == null) {
				string_15_ = "";
			}
			string = string_15_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "br.f()");
		}
		return string;
	}
}
