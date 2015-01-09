/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class34 {
	int anInt398;
	static final int anInt399 = 65536;
	int anInt400;
	int anInt401;
	boolean aBoolean402;
	int anInt403;
	public static final int anInt404 = 212;
	static final int anInt405 = 90;
	static int anInt406;
	int anInt407;
	public static final int anInt408 = 1;
	int anInt409;
	public static final int anInt410 = 84;

	static final void method281(final int i, final int i_0_, final int i_1_) {
		try {
			if (!Class91_Sub20_Sub9.method800(i, -1207080259)) {
				if (i_1_ <= 1993696984) {
					throw new IllegalStateException();
				}
			} else {
				Class91_Sub20_Sub14_Sub1_Sub2.method934(Class91_Sub18.aClass91_Sub18ArrayArray1962[i], i_0_, -1762485807);
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "cl.cx()");
		}
	}

	public static void method282(final int i) {
		try {
			final Object object = Class78.anObject1108;
			synchronized (object) {
				if (-1535148391 * Class78.anInt1110 != 0) {
					Class78.anInt1110 = 1580594601;
					try {
						Class78.anObject1108.wait();
					} catch (final InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "cl.t()");
		}
	}

	Class34(final int i, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final boolean bool) {
		try {
			this.aBoolean402 = true;
			this.anInt403 = i * 1698253093;
			this.anInt407 = 1351486707 * i_2_;
			this.anInt400 = i_3_ * -1281011361;
			this.anInt401 = i_4_ * -969063943;
			this.anInt409 = -1188608657 * i_5_;
			this.anInt398 = 1307622125 * i_6_;
			this.aBoolean402 = bool;
		} catch (final RuntimeException var8) {
			throw Class102.method1086(var8, "cl.<init>()");
		}
	}

	static final void method283(final int i, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final byte i_12_) {
		try {
			final int i_13_ = 2048 - i_9_ & 0x7ff;
			final int i_14_ = 2048 - i_10_ & 0x7ff;
			int i_15_ = 0;
			int i_16_ = 0;
			int i_17_ = i_11_;
			if (i_13_ != 0) {
				final int i_18_ = Class91_Sub20_Sub13_Sub2.anIntArray2546[i_13_];
				final int i_19_ = Class91_Sub20_Sub13_Sub2.anIntArray2547[i_13_];
				final int i_20_ = i_16_ * i_19_ - i_18_ * i_11_ >> 16;
				i_17_ = i_11_ * i_19_ + i_16_ * i_18_ >> 16;
				i_16_ = i_20_;
			}
			if (i_14_ != 0) {
				final int i_21_ = Class91_Sub20_Sub13_Sub2.anIntArray2546[i_14_];
				final int i_22_ = Class91_Sub20_Sub13_Sub2.anIntArray2547[i_14_];
				final int i_23_ = i_21_ * i_17_ + i_22_ * i_15_ >> 16;
				i_17_ = i_22_ * i_17_ - i_15_ * i_21_ >> 16;
				i_15_ = i_23_;
			}
			Class101.anInt1288 = -229921965 * (i - i_15_);
			Class100.anInt1244 = (i_7_ - i_16_) * -238608779;
			Class105.anInt1365 = (i_8_ - i_17_) * 495894353;
			Class91_Sub20_Sub14_Sub1_Sub2.anInt2860 = 1862537411 * i_9_;
			Class97.anInt1219 = i_10_ * -110944069;
		} catch (final RuntimeException var15) {
			throw Class102.method1086(var15, "cl.au()");
		}
	}
}
