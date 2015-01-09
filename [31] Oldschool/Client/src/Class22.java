/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class22 {
	int anInt282;
	Class8[] aClass8Array283 = new Class8[10];
	static final int anInt284 = 22050;
	int anInt285;

	Class22(final ByteBuffer class91_sub9) {
		for (int i = 0; i < 10; i++) {
			final int var3 = class91_sub9.readUnsignedByte();
			if (var3 != 0) {
				class91_sub9.currentOffset -= 565881095;
				this.aClass8Array283[i] = new Class8();
				this.aClass8Array283[i].method157(class91_sub9);
			}
		}
		this.anInt282 = class91_sub9.method686((byte) -63);
		this.anInt285 = class91_sub9.method686((byte) -49);
	}

	public Class91_Sub1_Sub1 method208() {
		final byte[] is = method211();
		return new Class91_Sub1_Sub1(22050, is, 22050 * this.anInt282 / 1000, 22050 * this.anInt285 / 1000);
	}

	public final int method209() {
		int i = 9999999;
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			if (this.aClass8Array283[i_0_] != null && this.aClass8Array283[i_0_].anInt117 / 20 < i) {
				i = this.aClass8Array283[i_0_].anInt117 / 20;
			}
		}
		if (this.anInt282 < this.anInt285 && this.anInt282 / 20 < i) {
			i = this.anInt282 / 20;
		}
		if (i != 9999999 && i != 0) {
			for (int i_1_ = 0; i_1_ < 10; i_1_++) {
				if (this.aClass8Array283[i_1_] != null) {
					this.aClass8Array283[i_1_].anInt117 -= i * 20;
				}
			}
			if (this.anInt282 < this.anInt285) {
				this.anInt282 -= i * 20;
				this.anInt285 -= i * 20;
			}
			return i;
		}
		return 0;
	}

	public static Class22 method210(final Js5 class63, final int i, final int i_2_) {
		final byte[] is = class63.getFile(i, i_2_, -738684887);
		return is == null ? null : new Class22(new ByteBuffer(is));
	}

	final byte[] method211() {
		int i = 0;
		for (int i_3_ = 0; i_3_ < 10; i_3_++) {
			if (this.aClass8Array283[i_3_] != null && this.aClass8Array283[i_3_].anInt131 + this.aClass8Array283[i_3_].anInt117 > i) {
				i = this.aClass8Array283[i_3_].anInt131 + this.aClass8Array283[i_3_].anInt117;
			}
		}
		if (i == 0) {
			return new byte[0];
		}
		final int i_4_ = 22050 * i / 1000;
		final byte[] is = new byte[i_4_];
		for (int i_5_ = 0; i_5_ < 10; i_5_++) {
			if (this.aClass8Array283[i_5_] != null) {
				final int i_6_ = this.aClass8Array283[i_5_].anInt131 * 22050 / 1000;
				final int i_7_ = this.aClass8Array283[i_5_].anInt117 * 22050 / 1000;
				final int[] is_8_ = this.aClass8Array283[i_5_].method156(i_6_, this.aClass8Array283[i_5_].anInt131);
				for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
					int i_10_ = is[i_9_ + i_7_] + (is_8_[i_9_] >> 8);
					if ((i_10_ + 128 & ~0xff) != 0) {
						i_10_ = i_10_ >> 31 ^ 0x7f;
					}
					is[i_9_ + i_7_] = (byte) i_10_;
				}
			}
		}
		return is;
	}
}
