/* Class91_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub10 extends Class91 {
	public static final int anInt1864 = 102;
	int anInt1865;
	boolean aBoolean1866;
	public static final int anInt1867 = 43;
	int anInt1868;
	static Class63_Sub1 modelJs5;
	static int[] anIntArray1870;
	static final int anInt1871 = 39;

	public static String method697(final byte[] is, final int i, final int i_0_, final byte i_1_) {
		String string;
		try {
			final char[] cs = new char[i_0_];
			int i_2_ = 0;
			for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
				int i_4_ = is[i_3_ + i] & 0xff;
				if (i_4_ != 0) {
					if (i_4_ >= 128 && i_4_ < 160) {
						int i_5_ = Class62.aCharArray757[i_4_ - 128];
						if (i_5_ == 0) {
							i_5_ = 63;
						}
						i_4_ = i_5_;
					}
					cs[i_2_++] = (char) i_4_;
				}
			}
			string = new String(cs, 0, i_2_);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "e.e()");
		}
		return string;
	}

	public static int method698(final int i) {
		int i_6_;
		try {
			i_6_ = (Class12.anInt168 += -425447383) * 1161194521 - 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "e.e()");
		}
		return i_6_;
	}

	Class91_Sub10() {
		try {
			this.aBoolean1866 = false;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "e.<init>()");
		}
	}

	public static int method699(final char c, final int i, final byte i_7_) {
		int i_8_;
		try {
			int i_9_ = c << 4;
			if (!Character.isUpperCase(c) && !Character.isTitleCase(c)) {
				return i_9_;
			}
			final int i_10_ = Character.toLowerCase(c);
			i_9_ = (i_10_ << 4) + 1;
			i_8_ = i_9_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "e.w()");
		}
		return i_8_;
	}

	static boolean method700(final CharSequence charsequence, final int i, final boolean bool, final byte i_11_) {
		try {
			if (i >= 2 && i <= 36) {
				boolean bool_12_ = false;
				boolean bool_13_ = false;
				int i_14_ = 0;
				final int i_15_ = charsequence.length();
				for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
					final int i_17_ = charsequence.charAt(i_16_);
					if (i_16_ == 0) {
						if (45 == i_17_) {
							bool_12_ = true;
							continue;
						}
						if (i_17_ == 43 && bool) {
							if (i_11_ >= 50) {
								throw new IllegalStateException();
							}
							continue;
						}
					}
					int i_18_;
					if (i_17_ >= 48 && i_17_ <= 57) {
						i_18_ = i_17_ - 48;
					} else if (i_17_ >= 65 && i_17_ <= 90) {
						i_18_ = i_17_ - 55;
					} else {
						if (i_17_ < 97 || i_17_ > 122) {
							return false;
						}
						i_18_ = i_17_ - 87;
					}
					if (i_18_ >= i) {
						return false;
					}
					if (bool_12_) {
						i_18_ = -i_18_;
					}
					final int i_19_ = i * i_14_ + i_18_;
					if (i_19_ / i != i_14_) {
						return false;
					}
					i_14_ = i_19_;
					bool_13_ = true;
				}
				return bool_13_;
			}
			throw new IllegalArgumentException("");
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "e.w()");
		}
	}
}
