/* Class91_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub2_Sub2 extends Class91_Sub2 {
	Class95 aClass95_2169 = new Class95();
	Class95 aClass95_2170 = new Class95();
	int anInt2171 = 0;
	int anInt2172 = -1;

	@Override
	public final synchronized void method498(final int[] is, int i, int i_0_) {
		do {
			if (this.anInt2172 < 0) {
				method562(is, i, i_0_);
				break;
			}
			if (this.anInt2171 + i_0_ < this.anInt2172) {
				this.anInt2171 += i_0_;
				method562(is, i, i_0_);
				break;
			}
			final int i_1_ = this.anInt2172 - this.anInt2171;
			method562(is, i, i_1_);
			i += i_1_;
			i_0_ -= i_1_;
			this.anInt2171 += i_1_;
			method564();
			final Class91_Sub3 class91_sub3 = (Class91_Sub3) this.aClass95_2169.method1062();
			synchronized (class91_sub3) {
				final int var7 = class91_sub3.method601(this);
				if (var7 < 0) {
					class91_sub3.anInt1758 = 0;
					method563(class91_sub3);
				} else {
					class91_sub3.anInt1758 = var7;
					method561(class91_sub3.aClass91_1191, class91_sub3);
				}
			}
		} while (i_0_ != 0);
	}

	public final synchronized void method559(final Class91_Sub2 class91_sub2) {
		this.aClass95_2170.method1059(class91_sub2);
	}

	public final synchronized void method560(final Class91_Sub2 class91_sub2) {
		class91_sub2.method495();
	}

	@Override
	protected int method510() {
		return 0;
	}

	void method561(Class91 class91, final Class91_Sub3 class91_sub3) {
		for (/**/; class91 != this.aClass95_2169.aClass91_1202 && ((Class91_Sub3) class91).anInt1758 <= class91_sub3.anInt1758; class91 = class91.aClass91_1191) {
			/* empty */
		}
		Class95.method1060(class91_sub3, class91);
		this.anInt2172 = ((Class91_Sub3) this.aClass95_2169.aClass91_1202.aClass91_1191).anInt1758;
	}

	@Override
	protected Class91_Sub2 method506() {
		return (Class91_Sub2) this.aClass95_2170.method1063();
	}

	@Override
	protected Class91_Sub2 method515() {
		return (Class91_Sub2) this.aClass95_2170.method1063();
	}

	void method562(final int[] is, final int i, final int i_2_) {
		for (Class91_Sub2 class91_sub2 = (Class91_Sub2) this.aClass95_2170.method1062(); class91_sub2 != null; class91_sub2 = (Class91_Sub2) this.aClass95_2170.method1063()) {
			class91_sub2.method503(is, i, i_2_);
		}
	}

	@Override
	public final synchronized void method505(int i) {
		do {
			if (this.anInt2172 < 0) {
				method565(i);
				break;
			}
			if (this.anInt2171 + i < this.anInt2172) {
				this.anInt2171 += i;
				method565(i);
				break;
			}
			final int i_3_ = this.anInt2172 - this.anInt2171;
			method565(i_3_);
			i -= i_3_;
			this.anInt2171 += i_3_;
			method564();
			final Class91_Sub3 class91_sub3 = (Class91_Sub3) this.aClass95_2169.method1062();
			synchronized (class91_sub3) {
				final int var5 = class91_sub3.method601(this);
				if (var5 < 0) {
					class91_sub3.anInt1758 = 0;
					method563(class91_sub3);
				} else {
					class91_sub3.anInt1758 = var5;
					method561(class91_sub3.aClass91_1191, class91_sub3);
				}
			}
		} while (i != 0);
	}

	void method563(final Class91_Sub3 class91_sub3) {
		class91_sub3.method495();
		class91_sub3.method600();
		final Class91 class91 = this.aClass95_2169.aClass91_1202.aClass91_1191;
		if (class91 == this.aClass95_2169.aClass91_1202) {
			this.anInt2172 = -1;
		} else {
			this.anInt2172 = ((Class91_Sub3) class91).anInt1758;
		}
	}

	@Override
	protected Class91_Sub2 method504() {
		return (Class91_Sub2) this.aClass95_2170.method1062();
	}

	@Override
	protected Class91_Sub2 method507() {
		return (Class91_Sub2) this.aClass95_2170.method1063();
	}

	@Override
	protected Class91_Sub2 method508() {
		return (Class91_Sub2) this.aClass95_2170.method1063();
	}

	@Override
	protected int method509() {
		return 0;
	}

	@Override
	protected Class91_Sub2 method499() {
		return (Class91_Sub2) this.aClass95_2170.method1062();
	}

	@Override
	protected int method497() {
		return 0;
	}

	@Override
	protected int method501() {
		return 0;
	}

	@Override
	public final synchronized void method514(final int[] is, int i, int i_4_) {
		do {
			if (this.anInt2172 < 0) {
				method562(is, i, i_4_);
				break;
			}
			if (this.anInt2171 + i_4_ < this.anInt2172) {
				this.anInt2171 += i_4_;
				method562(is, i, i_4_);
				break;
			}
			final int i_5_ = this.anInt2172 - this.anInt2171;
			method562(is, i, i_5_);
			i += i_5_;
			i_4_ -= i_5_;
			this.anInt2171 += i_5_;
			method564();
			final Class91_Sub3 class91_sub3 = (Class91_Sub3) this.aClass95_2169.method1062();
			synchronized (class91_sub3) {
				final int var7 = class91_sub3.method601(this);
				if (var7 < 0) {
					class91_sub3.anInt1758 = 0;
					method563(class91_sub3);
				} else {
					class91_sub3.anInt1758 = var7;
					method561(class91_sub3.aClass91_1191, class91_sub3);
				}
			}
		} while (i_4_ != 0);
	}

	void method564() {
		if (this.anInt2171 > 0) {
			for (Class91_Sub3 class91_sub3 = (Class91_Sub3) this.aClass95_2169.method1062(); class91_sub3 != null; class91_sub3 = (Class91_Sub3) this.aClass95_2169.method1063()) {
				class91_sub3.anInt1758 -= this.anInt2171;
			}
			this.anInt2172 -= this.anInt2171;
			this.anInt2171 = 0;
		}
	}

	@Override
	public final synchronized void method512(final int[] is, int i, int i_6_) {
		do {
			if (this.anInt2172 < 0) {
				method562(is, i, i_6_);
				break;
			}
			if (this.anInt2171 + i_6_ < this.anInt2172) {
				this.anInt2171 += i_6_;
				method562(is, i, i_6_);
				break;
			}
			final int i_7_ = this.anInt2172 - this.anInt2171;
			method562(is, i, i_7_);
			i += i_7_;
			i_6_ -= i_7_;
			this.anInt2171 += i_7_;
			method564();
			final Class91_Sub3 class91_sub3 = (Class91_Sub3) this.aClass95_2169.method1062();
			synchronized (class91_sub3) {
				final int var7 = class91_sub3.method601(this);
				if (var7 < 0) {
					class91_sub3.anInt1758 = 0;
					method563(class91_sub3);
				} else {
					class91_sub3.anInt1758 = var7;
					method561(class91_sub3.aClass91_1191, class91_sub3);
				}
			}
		} while (i_6_ != 0);
	}

	void method565(final int i) {
		for (Class91_Sub2 class91_sub2 = (Class91_Sub2) this.aClass95_2170.method1062(); class91_sub2 != null; class91_sub2 = (Class91_Sub2) this.aClass95_2170.method1063()) {
			class91_sub2.method505(i);
		}
	}

	@Override
	public final synchronized void method500(final int[] is, int i, int i_8_) {
		do {
			if (this.anInt2172 < 0) {
				method562(is, i, i_8_);
				break;
			}
			if (this.anInt2171 + i_8_ < this.anInt2172) {
				this.anInt2171 += i_8_;
				method562(is, i, i_8_);
				break;
			}
			final int i_9_ = this.anInt2172 - this.anInt2171;
			method562(is, i, i_9_);
			i += i_9_;
			i_8_ -= i_9_;
			this.anInt2171 += i_9_;
			method564();
			final Class91_Sub3 class91_sub3 = (Class91_Sub3) this.aClass95_2169.method1062();
			synchronized (class91_sub3) {
				final int var7 = class91_sub3.method601(this);
				if (var7 < 0) {
					class91_sub3.anInt1758 = 0;
					method563(class91_sub3);
				} else {
					class91_sub3.anInt1758 = var7;
					method561(class91_sub3.aClass91_1191, class91_sub3);
				}
			}
		} while (i_8_ != 0);
	}

	@Override
	public final synchronized void method511(int i) {
		do {
			if (this.anInt2172 < 0) {
				method565(i);
				break;
			}
			if (this.anInt2171 + i < this.anInt2172) {
				this.anInt2171 += i;
				method565(i);
				break;
			}
			final int i_10_ = this.anInt2172 - this.anInt2171;
			method565(i_10_);
			i -= i_10_;
			this.anInt2171 += i_10_;
			method564();
			final Class91_Sub3 class91_sub3 = (Class91_Sub3) this.aClass95_2169.method1062();
			synchronized (class91_sub3) {
				final int var5 = class91_sub3.method601(this);
				if (var5 < 0) {
					class91_sub3.anInt1758 = 0;
					method563(class91_sub3);
				} else {
					class91_sub3.anInt1758 = var5;
					method561(class91_sub3.aClass91_1191, class91_sub3);
				}
			}
		} while (i != 0);
	}

	@Override
	protected Class91_Sub2 method502() {
		return (Class91_Sub2) this.aClass95_2170.method1062();
	}
}
