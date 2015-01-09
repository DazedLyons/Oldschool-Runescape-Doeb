/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class83 {
	Class91 aClass91_1125;
	Class91[] aClass91Array1126;
	int anInt1127;
	Class91 aClass91_1128;
	int anInt1129 = 0;

	public Class91 method474(final long l) {
		final Class91 class91 = this.aClass91Array1126[(int) (l & this.anInt1127 - 1)];
		for (this.aClass91_1125 = class91.aClass91_1191; this.aClass91_1125 != class91; this.aClass91_1125 = this.aClass91_1125.aClass91_1191) {
			if (this.aClass91_1125.aLong1192 == l) {
				final Class91 var4 = this.aClass91_1125;
				this.aClass91_1125 = this.aClass91_1125.aClass91_1191;
				return var4;
			}
		}
		this.aClass91_1125 = null;
		return null;
	}

	void method475() {
		int i = 0;
		while (i < this.anInt1127) {
			final Class91 class91 = this.aClass91Array1126[i];
			for (;;) {
				final Class91 class91_0_ = class91.aClass91_1191;
				if (class91_0_ == class91) {
					i++;
					break;
				}
				class91_0_.method495();
			}
		}
		this.aClass91_1125 = null;
		this.aClass91_1128 = null;
	}

	public Class91 method476() {
		this.anInt1129 = 0;
		return method477();
	}

	public Class91 method477() {
		if (this.anInt1129 > 0 && this.aClass91_1128 != this.aClass91Array1126[this.anInt1129 - 1]) {
			final Class91 class91 = this.aClass91_1128;
			this.aClass91_1128 = class91.aClass91_1191;
			return class91;
		}
		Class91 class91;
		do {
			if (this.anInt1129 >= this.anInt1127) {
				return null;
			}
			class91 = this.aClass91Array1126[this.anInt1129++].aClass91_1191;
		} while (class91 == this.aClass91Array1126[this.anInt1129 - 1]);
		this.aClass91_1128 = class91.aClass91_1191;
		return class91;
	}

	public void method478(final Class91 class91, final long l) {
		if (class91.aClass91_1193 != null) {
			class91.method495();
		}
		final Class91 class91_1_ = this.aClass91Array1126[(int) (l & this.anInt1127 - 1)];
		class91.aClass91_1193 = class91_1_.aClass91_1193;
		class91.aClass91_1191 = class91_1_;
		class91.aClass91_1193.aClass91_1191 = class91;
		class91.aClass91_1191.aClass91_1193 = class91;
		class91.aLong1192 = l;
	}

	public Class83(final int i) {
		this.anInt1127 = i;
		this.aClass91Array1126 = new Class91[i];
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			final Class91 class91 = this.aClass91Array1126[i_2_] = new Class91();
			class91.aClass91_1191 = class91;
			class91.aClass91_1193 = class91;
		}
	}
}
