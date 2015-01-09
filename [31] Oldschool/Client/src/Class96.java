/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class96 {
	Class82 aClass82_1204 = new Class82();
	int anInt1205;
	int anInt1206;
	Class83 aClass83_1207;
	Class91_Sub20 aClass91_Sub20_1208 = new Class91_Sub20();

	public void method1067(final Class91_Sub20 class91_sub20, final long l) {
		if (this.anInt1206 == 0) {
			Class91_Sub20 class91_sub20_0_ = this.aClass82_1204.method473();
			class91_sub20_0_.method495();
			class91_sub20_0_.method724();
			if (class91_sub20_0_ == this.aClass91_Sub20_1208) {
				class91_sub20_0_ = this.aClass82_1204.method473();
				class91_sub20_0_.method495();
				class91_sub20_0_.method724();
			}
		} else {
			this.anInt1206--;
		}
		this.aClass83_1207.method478(class91_sub20, l);
		this.aClass82_1204.method469(class91_sub20);
	}

	public Class91_Sub20 method1068(final long l) {
		final Class91_Sub20 class91_sub20 = (Class91_Sub20) this.aClass83_1207.method474(l);
		if (class91_sub20 != null) {
			this.aClass82_1204.method469(class91_sub20);
		}
		return class91_sub20;
	}

	public void method1069(final long l) {
		final Class91_Sub20 class91_sub20 = (Class91_Sub20) this.aClass83_1207.method474(l);
		if (class91_sub20 != null) {
			class91_sub20.method495();
			class91_sub20.method724();
			this.anInt1206++;
		}
	}

	public Class96(final int i) {
		this.anInt1205 = i;
		this.anInt1206 = i;
		int i_1_;
		for (i_1_ = 1; i_1_ + i_1_ < i; i_1_ += i_1_) {
			/* empty */
		}
		this.aClass83_1207 = new Class83(i_1_);
	}

	public void method1070() {
		this.aClass82_1204.method472();
		this.aClass83_1207.method475();
		this.aClass91_Sub20_1208 = new Class91_Sub20();
		this.anInt1206 = this.anInt1205;
	}
}
