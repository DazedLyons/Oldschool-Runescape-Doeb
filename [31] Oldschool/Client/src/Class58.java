/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class58 {
	public Class91_Sub20_Sub14 aClass91_Sub20_Sub14_702;
	int anInt703;
	int anInt704;
	int anInt705;
	int anInt706;
	int anInt707;
	int anInt708;
	public Class91_Sub20_Sub14 aClass91_Sub20_Sub14_709;
	int anInt710;
	public int anInt711;
	int anInt712;
	static final int anInt713 = 104;
	public static ByteBuffer aClass91_Sub9_714;
	public static final int anInt715 = 96;

	public static void setupLocStores(final Js5 class63, final Js5 class63_0_, final boolean bool, final byte i) {
		try {
			LocType.aClass63_2336 = class63;
			Class30.aClass63_357 = class63_0_;
			LocType.aBoolean2297 = bool;
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "dy.i()");
		}
	}

	static void method388(final int i, final int i_1_) {
		try {
			final Class91_Sub22 class91_sub22 = (Class91_Sub22) Class91_Sub22.aClass83_2108.method474(i);
			if (class91_sub22 == null) {
				if (i_1_ != 27890084) {
					throw new IllegalStateException();
				}
			} else {
				class91_sub22.method495();
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dy.e()");
		}
	}

	Class58() {
		try {
			anInt711 = 0;
			this.anInt703 = 0;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "dy.<init>()");
		}
	}

	public static byte[] method389(final CharSequence charsequence, final int i) {
		byte[] is;
		try {
			final int i_2_ = charsequence.length();
			final byte[] is_3_ = new byte[i_2_];
			for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
				final char c = charsequence.charAt(i_4_);
				if ((c <= 0 || c >= '\u0080') && (c < '\u00a0' || c > '\u00ff')) {
					if (c == '\u20ac') {
						is_3_[i_4_] = (byte) -128;
					} else if (c == '\u201a') {
						is_3_[i_4_] = (byte) -126;
					} else if (c == '\u0192') {
						is_3_[i_4_] = (byte) -125;
					} else if ('\u201e' == c) {
						is_3_[i_4_] = (byte) -124;
					} else if ('\u2026' == c) {
						is_3_[i_4_] = (byte) -123;
					} else if (c == '\u2020') {
						is_3_[i_4_] = (byte) -122;
					} else if ('\u2021' == c) {
						is_3_[i_4_] = (byte) -121;
					} else if ('\u02c6' == c) {
						is_3_[i_4_] = (byte) -120;
					} else if ('\u2030' == c) {
						is_3_[i_4_] = (byte) -119;
					} else if (c == '\u0160') {
						is_3_[i_4_] = (byte) -118;
					} else if (c == '\u2039') {
						is_3_[i_4_] = (byte) -117;
					} else if (c == '\u0152') {
						is_3_[i_4_] = (byte) -116;
					} else if (c == '\u017d') {
						is_3_[i_4_] = (byte) -114;
					} else if (c == '\u2018') {
						is_3_[i_4_] = (byte) -111;
					} else if ('\u2019' == c) {
						is_3_[i_4_] = (byte) -110;
					} else if (c == '\u201c') {
						is_3_[i_4_] = (byte) -109;
					} else if (c == '\u201d') {
						is_3_[i_4_] = (byte) -108;
					} else if (c == '\u2022') {
						is_3_[i_4_] = (byte) -107;
					} else if (c == '\u2013') {
						is_3_[i_4_] = (byte) -106;
					} else if ('\u2014' == c) {
						is_3_[i_4_] = (byte) -105;
					} else if (c == '\u02dc') {
						is_3_[i_4_] = (byte) -104;
					} else if (c == '\u2122') {
						is_3_[i_4_] = (byte) -103;
					} else if ('\u0161' == c) {
						is_3_[i_4_] = (byte) -102;
					} else if ('\u203a' == c) {
						is_3_[i_4_] = (byte) -101;
					} else if (c == '\u0153') {
						is_3_[i_4_] = (byte) -100;
					} else if ('\u017e' == c) {
						is_3_[i_4_] = (byte) -98;
					} else if (c == '\u0178') {
						is_3_[i_4_] = (byte) -97;
					} else {
						is_3_[i_4_] = (byte) 63;
					}
				} else {
					is_3_[i_4_] = (byte) c;
				}
			}
			is = is_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dy.w()");
		}
		return is;
	}
}
