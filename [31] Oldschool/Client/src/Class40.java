/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class40 {
	static final int anInt539 = 35;
	int anInt540;
	static int anInt541;
	int anInt542;
	static int anInt543;
	public static final int anInt544 = 97;
	int anInt545;
	static String aString546;
	static int anInt547;

	public static int method340(final CharSequence charsequence, final int i, final boolean bool, final int i_0_) {
		try {
			if (i >= 2 && i <= 36) {
				boolean bool_1_ = false;
				boolean bool_2_ = false;
				int i_3_ = 0;
				final int i_4_ = charsequence.length();
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					final int i_6_ = charsequence.charAt(i_5_);
					if (i_5_ == 0) {
						if (45 == i_6_) {
							bool_1_ = true;
							continue;
						}
						if (i_6_ == 43 && bool) {
							if (i_0_ != -2005995539) {
								throw new IllegalStateException();
							}
							continue;
						}
					}
					int i_7_;
					if (i_6_ >= 48 && i_6_ <= 57) {
						i_7_ = i_6_ - 48;
					} else if (i_6_ >= 65 && i_6_ <= 90) {
						i_7_ = i_6_ - 55;
					} else {
						if (i_6_ < 97 || i_6_ > 122) {
							throw new NumberFormatException();
						}
						i_7_ = i_6_ - 87;
					}
					if (i_7_ >= i) {
						throw new NumberFormatException();
					}
					if (bool_1_) {
						i_7_ = -i_7_;
					}
					final int i_8_ = i_7_ + i * i_3_;
					if (i_8_ / i != i_3_) {
						throw new NumberFormatException();
					}
					i_3_ = i_8_;
					bool_2_ = true;
				}
				if (!bool_2_) {
					throw new NumberFormatException();
				}
				return i_3_;
			}
			throw new IllegalArgumentException("");
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "cz.e()");
		}
	}

	Class40() {
		/* empty */
	}

	static final int method341(final int i, int i_9_, final int i_10_, final byte i_11_) {
		int i_12_;
		try {
			if (i_10_ > 179) {
				if (i_11_ <= 0) {
					throw new IllegalStateException();
				}
				i_9_ /= 2;
			}
			if (i_10_ > 192) {
				i_9_ /= 2;
			}
			if (i_10_ > 217) {
				i_9_ /= 2;
			}
			if (i_10_ > 243) {
				if (i_11_ <= 0) {
					throw new IllegalStateException();
				}
				i_9_ /= 2;
			}
			final int i_13_ = i_10_ / 2 + (i / 4 << 10) + (i_9_ / 32 << 7);
			i_12_ = i_13_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "cz.o()");
		}
		return i_12_;
	}

	public static boolean method342(final int i, final int i_14_) {
		boolean bool;
		try {
			boolean bool_15_;
			if ((i & 0x1) != 0) {
				bool_15_ = true;
			} else {
				bool_15_ = false;
			}
			bool = bool_15_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "cz.i()");
		}
		return bool;
	}
}
