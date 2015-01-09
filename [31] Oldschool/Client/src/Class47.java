/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class47 {
	static long aLong595;
	static final int anInt596 = 4;
	static Class91_Sub20_Sub13_Sub1 aClass91_Sub20_Sub13_Sub1_597;
	static long aLong598;
	static final int anInt599 = 6;

	Class47() throws Throwable {
		try {
			throw new Error();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dh.<init>()");
		}
	}

	public static boolean method364(final char c, final int i) {
		do {
			try {
				if (c >= ' ' && c <= '~') {
					return true;
				}
				if (c >= '\u00a0' && c <= '\u00ff') {
					return true;
				}
				if (c == '\u20ac' || '\u0152' == c || '\u2014' == c || c == '\u0153' || c == '\u0178') {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "dh.r()");
			}
			return false;
		} while (false);
		return true;
	}

	static final byte[] method365(final byte[] is, final int i) {
		try {
			final ByteBuffer class91_sub9 = new ByteBuffer(is);
			final int i_0_ = class91_sub9.readUnsignedByte();
			final int i_1_ = class91_sub9.readDword();
			if (i_1_ >= 0) {
				if (Js5.anInt769 * -1107520903 != 0 && i_1_ > -1107520903 * Js5.anInt769) {
					throw new RuntimeException();
				}
				if (i_0_ == 0) {
					final byte[] is_2_ = new byte[i_1_];
					class91_sub9.method647(is_2_, 0, i_1_, 159145390);
					return is_2_;
				}
				final int i_3_ = class91_sub9.readDword();
				if (i_3_ >= 0 && (Js5.anInt769 * -1107520903 == 0 || i_3_ <= Js5.anInt769 * -1107520903)) {
					final byte[] is_4_ = new byte[i_3_];
					if (i_0_ == 1) {
						Class55.method378(is_4_, i_3_, is, i_1_, 9);
					} else {
						Js5.aClass52_773.method374(class91_sub9, is_4_, 1644432020);
					}
					return is_4_;
				}
				throw new RuntimeException();
			}
			throw new RuntimeException();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dh.h()");
		}
	}
}
