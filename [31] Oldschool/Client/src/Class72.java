/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class72 {
	static final int anInt827 = 3;
	int anInt828;
	int[] anIntArray829;
	static final byte[] aByteArray830 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0 };
	ByteBuffer aClass91_Sub9_831;
	int[] anIntArray832;
	int anInt833;
	int[] anIntArray834;
	static final int anInt835 = 0;
	int[] anIntArray836;
	static final int anInt837 = 500000;
	static final int anInt838 = 1;
	static final int anInt839 = 2;
	long aLong840;

	Class72(final byte[] is) {
		this.aClass91_Sub9_831 = new ByteBuffer(null);
		method451(is);
	}

	boolean method437() {
		if (this.aClass91_Sub9_831.buffer != null) {
			return true;
		}
		return false;
	}

	void method438() {
		this.aClass91_Sub9_831.buffer = null;
		this.anIntArray829 = null;
		this.anIntArray834 = null;
		this.anIntArray832 = null;
		this.anIntArray836 = null;
	}

	int method439() {
		return this.anIntArray834.length;
	}

	void method440(final int i) {
		this.aClass91_Sub9_831.currentOffset = this.anIntArray834[i] * 565881095;
	}

	void method441(final int i) {
		this.anIntArray834[i] = this.aClass91_Sub9_831.currentOffset * -1128893257;
	}

	void method442(final int i) {
		final int i_0_ = this.aClass91_Sub9_831.method650(-1490935696);
		this.anIntArray832[i] += i_0_;
	}

	int method443(final int i) {
		final int i_1_ = method444(i);
		return i_1_;
	}

	int method444(final int i) {
		final int i_2_ = this.aClass91_Sub9_831.buffer[this.aClass91_Sub9_831.currentOffset * -1128893257];
		int i_3_;
		if (i_2_ < 0) {
			i_3_ = i_2_ & 0xff;
			this.anIntArray836[i] = i_3_;
			this.aClass91_Sub9_831.currentOffset += 565881095;
		} else {
			i_3_ = this.anIntArray836[i];
		}
		if (i_3_ != 240 && i_3_ != 247) {
			return method445(i, i_3_);
		}
		final int i_4_ = this.aClass91_Sub9_831.method650(-1717653153);
		if (i_3_ == 247 && i_4_ > 0) {
			final int var4 = this.aClass91_Sub9_831.buffer[this.aClass91_Sub9_831.currentOffset * -1128893257] & 0xff;
			if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
				this.aClass91_Sub9_831.currentOffset += 565881095;
				this.anIntArray836[i] = var4;
				return method445(i, var4);
			}
		}
		this.aClass91_Sub9_831.currentOffset += i_4_ * 565881095;
		return 0;
	}

	int method445(final int i, final int i_5_) {
		if (i_5_ == 255) {
			final int i_6_ = this.aClass91_Sub9_831.readUnsignedByte();
			int i_7_ = this.aClass91_Sub9_831.method650(-1889256251);
			if (i_6_ == 47) {
				this.aClass91_Sub9_831.currentOffset += i_7_ * 565881095;
				return 1;
			}
			if (i_6_ == 81) {
				final int i_8_ = this.aClass91_Sub9_831.read3Bytes();
				i_7_ -= 3;
				final int i_9_ = this.anIntArray832[i];
				this.aLong840 += (long) i_9_ * (long) (this.anInt833 - i_8_);
				this.anInt833 = i_8_;
				this.aClass91_Sub9_831.currentOffset += i_7_ * 565881095;
				return 2;
			}
			this.aClass91_Sub9_831.currentOffset += i_7_ * 565881095;
			return 3;
		}
		final byte i_10_ = aByteArray830[i_5_ - 128];
		int i_11_ = i_5_;
		if (i_10_ >= 1) {
			i_11_ = i_5_ | this.aClass91_Sub9_831.readUnsignedByte() << 8;
		}
		if (i_10_ >= 2) {
			i_11_ |= this.aClass91_Sub9_831.readUnsignedByte() << 16;
		}
		return i_11_;
	}

	long method446(final int i) {
		return this.aLong840 + (long) i * (long) this.anInt833;
	}

	boolean method447() {
		final int i = this.anIntArray834.length;
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			if (this.anIntArray834[i_12_] >= 0) {
				return false;
			}
		}
		return true;
	}

	void method448(final long l) {
		this.aLong840 = l;
		final int i = this.anIntArray834.length;
		for (int i_13_ = 0; i_13_ < i; i_13_++) {
			this.anIntArray832[i_13_] = 0;
			this.anIntArray836[i_13_] = 0;
			this.aClass91_Sub9_831.currentOffset = this.anIntArray829[i_13_] * 565881095;
			method442(i_13_);
			this.anIntArray834[i_13_] = this.aClass91_Sub9_831.currentOffset * -1128893257;
		}
	}

	void method449() {
		this.aClass91_Sub9_831.currentOffset = -565881095;
	}

	int method450() {
		final int i = this.anIntArray834.length;
		int i_14_ = -1;
		int i_15_ = 2147483647;
		for (int i_16_ = 0; i_16_ < i; i_16_++) {
			if (this.anIntArray834[i_16_] >= 0 && this.anIntArray832[i_16_] < i_15_) {
				i_14_ = i_16_;
				i_15_ = this.anIntArray832[i_16_];
			}
		}
		return i_14_;
	}

	Class72() {
		this.aClass91_Sub9_831 = new ByteBuffer(null);
	}

	void method451(final byte[] is) {
		this.aClass91_Sub9_831.buffer = is;
		this.aClass91_Sub9_831.currentOffset = 1363843654;
		final int i = this.aClass91_Sub9_831.method686((byte) -83);
		this.anInt828 = this.aClass91_Sub9_831.method686((byte) -10);
		this.anInt833 = 500000;
		this.anIntArray829 = new int[i];
		int i_17_ = 0;
		while (i_17_ < i) {
			final int var4 = this.aClass91_Sub9_831.readDword();
			final int i_18_ = this.aClass91_Sub9_831.readDword();
			if (var4 == 1297379947) {
				this.anIntArray829[i_17_] = this.aClass91_Sub9_831.currentOffset * -1128893257;
				i_17_++;
			}
			this.aClass91_Sub9_831.currentOffset += i_18_ * 565881095;
		}
		this.aLong840 = 0L;
		this.anIntArray834 = new int[i];
		for (i_17_ = 0; i_17_ < i; i_17_++) {
			this.anIntArray834[i_17_] = this.anIntArray829[i_17_];
		}
		this.anIntArray832 = new int[i];
		this.anIntArray836 = new int[i];
	}
}
