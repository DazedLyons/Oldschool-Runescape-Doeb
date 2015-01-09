/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class2 {
	static int anInt37;
	public static final int anInt38 = 127;
	long aLong39;
	RandomAccessFile aRandomAccessFile40;
	static final int anInt41 = 34;
	static Class91_Sub20_Sub13_Sub4_Sub1 aClass91_Sub20_Sub13_Sub4_Sub1_42;
	public static final int anInt43 = 190;
	static final int anInt44 = 1006;
	long aLong45;
	static final int anInt46 = 87;

	static void method80(final int i, final int i_0_, final byte i_1_) {
		try {
			final int[] is = new int[4];
			final int[] is_2_ = new int[4];
			is[0] = i;
			is_2_[0] = i_0_;
			int i_3_ = 1;
			for (int i_4_ = 0; i_4_ < 4; i_4_++) {
				if (i_1_ != 0) {
					throw new IllegalStateException();
				}
				if (Class101.anIntArray1285[i_4_] != i) {
					if (i_1_ != 0) {
						throw new IllegalStateException();
					}
					is[i_3_] = Class101.anIntArray1285[i_4_];
					is_2_[i_3_] = Class101.anIntArray1274[i_4_];
					i_3_++;
				}
			}
			Class101.anIntArray1285 = is;
			Class101.anIntArray1274 = is_2_;
			Class35.method284(Class46.aClass103Array594, 0, Class46.aClass103Array594.length - 1, Class101.anIntArray1285, Class101.anIntArray1274, (short) 16031);
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "aa.r()");
		}
	}

	public final void method81(final byte[] is, final int i, final int i_5_, final int i_6_) throws IOException {
		try {
			if (this.aLong39 * 2424757620251857165L + i_5_ > this.aLong45 * -3016691964605625057L) {
				this.aRandomAccessFile40.seek(1L + this.aLong45 * -3016691964605625057L);
				this.aRandomAccessFile40.write(1);
				throw new EOFException();
			}
			this.aRandomAccessFile40.write(is, i, i_5_);
			this.aLong39 += -4141189845737822779L * i_5_;
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "aa.w()");
		}
	}

	final void method82(final long l) throws IOException {
		try {
			this.aRandomAccessFile40.seek(l);
			this.aLong39 = -4141189845737822779L * l;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "aa.i()");
		}
	}

	public static void method83(final Js5 class63, final Js5 class63_7_, final int i) {
		try {
			Class91_Sub20_Sub12.aClass63_2465 = class63;
			Class91_Sub20_Sub12.aClass63_2473 = class63_7_;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "aa.i()");
		}
	}

	public static final Class6 method84(final Class25 class25, final Component component, final int i, int i_8_, final int i_9_) {
		try {
			if (-45833585 * Class6.anInt81 == 0) {
				throw new IllegalStateException();
			}
			if (i >= 0 && i < 2) {
				if (i_8_ < 256) {
					i_8_ = 256;
				}
				Class6_Sub2 class6_sub2;
				try {
					final Class6_Sub2 class6_sub2_10_ = new Class6_Sub2();
					class6_sub2_10_.anIntArray85 = new int[256 * (Class6.aBoolean80 ? 2 : 1)];
					class6_sub2_10_.anInt87 = i_8_ * -942273793;
					class6_sub2_10_.method115(component);
					class6_sub2_10_.anInt82 = ((i_8_ & ~0x3ff) + 1024) * -230364019;
					if (class6_sub2_10_.anInt82 * -801065403 > 16384) {
						class6_sub2_10_.anInt82 = 992165888;
					}
					class6_sub2_10_.method116(class6_sub2_10_.anInt82 * -801065403);
					if (Class91_Sub20_Sub15.anInt2493 * -402273875 > 0 && Class91_Sub20_Sub14_Sub7.aClass17_2834 == null) {
						Class91_Sub20_Sub14_Sub7.aClass17_2834 = new Class17();
						Class91_Sub20_Sub14_Sub7.aClass17_2834.aClass25_234 = class25;
						class25.method232(Class91_Sub20_Sub14_Sub7.aClass17_2834, Class91_Sub20_Sub15.anInt2493 * -402273875, -1144055235);
					}
					if (Class91_Sub20_Sub14_Sub7.aClass17_2834 != null) {
						if (Class91_Sub20_Sub14_Sub7.aClass17_2834.aClass6Array237[i] != null) {
							throw new IllegalArgumentException();
						}
						Class91_Sub20_Sub14_Sub7.aClass17_2834.aClass6Array237[i] = class6_sub2_10_;
					}
					class6_sub2 = class6_sub2_10_;
				} catch (final Throwable throwable) {
					Class6_Sub1 class6_sub1;
					try {
						final Class6_Sub1 class6_sub1_11_ = new Class6_Sub1(class25, i);
						class6_sub1_11_.anIntArray85 = new int[(Class6.aBoolean80 ? 2 : 1) * 256];
						class6_sub1_11_.anInt87 = i_8_ * -942273793;
						class6_sub1_11_.method115(component);
						class6_sub1_11_.anInt82 = 992165888;
						class6_sub1_11_.method116(class6_sub1_11_.anInt82 * -801065403);
						if (-402273875 * Class91_Sub20_Sub15.anInt2493 > 0 && Class91_Sub20_Sub14_Sub7.aClass17_2834 == null) {
							Class91_Sub20_Sub14_Sub7.aClass17_2834 = new Class17();
							Class91_Sub20_Sub14_Sub7.aClass17_2834.aClass25_234 = class25;
							class25.method232(Class91_Sub20_Sub14_Sub7.aClass17_2834, Class91_Sub20_Sub15.anInt2493 * -402273875, 1000370485);
						}
						if (Class91_Sub20_Sub14_Sub7.aClass17_2834 != null) {
							if (Class91_Sub20_Sub14_Sub7.aClass17_2834.aClass6Array237[i] != null) {
								throw new IllegalArgumentException();
							}
							Class91_Sub20_Sub14_Sub7.aClass17_2834.aClass6Array237[i] = class6_sub1_11_;
						}
						class6_sub1 = class6_sub1_11_;
					} catch (final Throwable throwable_12_) {
						return new Class6();
					}
					return class6_sub1;
				}
				return class6_sub2;
			}
			throw new IllegalArgumentException();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aa.q()");
		}
	}

	public final long method85(final byte i) throws IOException {
		long l;
		try {
			l = this.aRandomAccessFile40.length();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aa.e()");
		}
		return l;
	}

	public Class2(final File file, final String string, long l) throws IOException {
		try {
			if (-1L == l) {
				l = 9223372036854775807L;
			}
			if (file.length() >= l) {
				file.delete();
			}
			this.aRandomAccessFile40 = new RandomAccessFile(file, string);
			this.aLong45 = l * -876300568679731489L;
			this.aLong39 = 0L;
			final int i = this.aRandomAccessFile40.read();
			if (-1 != i && !string.equals("r")) {
				this.aRandomAccessFile40.seek(0L);
				this.aRandomAccessFile40.write(i);
			}
			this.aRandomAccessFile40.seek(0L);
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "aa.<init>()");
		}
	}

	public final int method86(final byte[] is, final int i, final int i_13_, final int i_14_) throws IOException {
		int i_15_;
		try {
			final int i_16_ = this.aRandomAccessFile40.read(is, i, i_13_);
			if (i_16_ > 0) {
				this.aLong39 += -4141189845737822779L * i_16_;
			}
			i_15_ = i_16_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "aa.t()");
		}
		return i_15_;
	}

	public final void method87(final byte i) throws IOException {
		try {
			if (this.aRandomAccessFile40 != null) {
				this.aRandomAccessFile40.close();
				this.aRandomAccessFile40 = null;
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "aa.f()");
		}
	}

	@Override
	protected void finalize() throws Throwable {
		try {
			if (this.aRandomAccessFile40 != null) {
				System.out.println("");
				method87((byte) 28);
			}
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "aa.finalize()");
		}
	}
}
