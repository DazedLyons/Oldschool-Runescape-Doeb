/* Class26_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class26_Sub2 extends Class26 {
	long aLong1724;

	Class26_Sub2() {
		try {
			this.aLong1724 = System.nanoTime() * -1112580425618710077L;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "ck.<init>()");
		}
	}

	@Override
	public void method242(final int i) {
		try {
			this.aLong1724 = System.nanoTime() * -1112580425618710077L;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "ck.i()");
		}
	}

	@Override
	public void method246() {
		this.aLong1724 = System.nanoTime() * -1112580425618710077L;
	}

	@Override
	public void method241() {
		this.aLong1724 = System.nanoTime() * -1112580425618710077L;
	}

	@Override
	int method243(final int i, final int i_0_, final byte i_1_) {
		int i_2_;
		try {
			final long l = i_0_ * 1000000L;
			long l_3_ = this.aLong1724 * -2324986199179831573L - System.nanoTime();
			if (l_3_ < l) {
				l_3_ = l;
			}
			Class91_Sub20_Sub5.method761(l_3_ / 1000000L);
			final long l_4_ = System.nanoTime();
			int i_5_ = 0;
			while (i_5_ < 10) {
				if (i_5_ >= 1 && this.aLong1724 * -2324986199179831573L >= l_4_) {
					break;
				}
				i_5_++;
				this.aLong1724 += -1950301065890384192L * i;
			}
			if (-2324986199179831573L * this.aLong1724 < l_4_) {
				this.aLong1724 = -1112580425618710077L * l_4_;
			}
			i_2_ = i_5_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ck.w()");
		}
		return i_2_;
	}

	@Override
	int method248(final int i, final int i_6_) {
		final long l = i_6_ * 1000000L;
		long l_7_ = this.aLong1724 * -2324986199179831573L - System.nanoTime();
		if (l_7_ < l) {
			l_7_ = l;
		}
		Class91_Sub20_Sub5.method761(l_7_ / 1000000L);
		final long l_8_ = System.nanoTime();
		int i_9_;
		for (i_9_ = 0; i_9_ < 10 && (i_9_ < 1 || this.aLong1724 * -2324986199179831573L < l_8_); this.aLong1724 += -1950301065890384192L * i) {
			i_9_++;
		}
		if (-2324986199179831573L * this.aLong1724 < l_8_) {
			this.aLong1724 = -1112580425618710077L * l_8_;
		}
		return i_9_;
	}

	@Override
	int method247(final int i, final int i_10_) {
		final long l = i_10_ * 1000000L;
		long l_11_ = this.aLong1724 * -2324986199179831573L - System.nanoTime();
		if (l_11_ < l) {
			l_11_ = l;
		}
		Class91_Sub20_Sub5.method761(l_11_ / 1000000L);
		final long l_12_ = System.nanoTime();
		int i_13_;
		for (i_13_ = 0; i_13_ < 10 && (i_13_ < 1 || this.aLong1724 * -2324986199179831573L < l_12_); this.aLong1724 += -1950301065890384192L * i) {
			i_13_++;
		}
		if (-2324986199179831573L * this.aLong1724 < l_12_) {
			this.aLong1724 = -1112580425618710077L * l_12_;
		}
		return i_13_;
	}

	@Override
	int method245(final int i, final int i_14_) {
		final long l = i_14_ * 1000000L;
		long l_15_ = this.aLong1724 * -2324986199179831573L - System.nanoTime();
		if (l_15_ < l) {
			l_15_ = l;
		}
		Class91_Sub20_Sub5.method761(l_15_ / 1000000L);
		final long l_16_ = System.nanoTime();
		int i_17_;
		for (i_17_ = 0; i_17_ < 10 && (i_17_ < 1 || this.aLong1724 * -2324986199179831573L < l_16_); this.aLong1724 += -1950301065890384192L * i) {
			i_17_++;
		}
		if (-2324986199179831573L * this.aLong1724 < l_16_) {
			this.aLong1724 = -1112580425618710077L * l_16_;
		}
		return i_17_;
	}
}
