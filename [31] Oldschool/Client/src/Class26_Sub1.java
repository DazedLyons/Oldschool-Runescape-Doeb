/* Class26_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class26_Sub1 extends Class26 {
	int anInt1715;
	long[] aLongArray1716;
	int anInt1717;
	long aLong1718;
	static final int anInt1719 = 57;
	int anInt1720;
	static final int anInt1721 = 112;
	static final int anInt1722 = 12;
	int anInt1723;

	public static void method250(final Class91_Sub9_Sub1 class91_sub9_sub1, final int i, final short i_0_) {
		try {
			for (;;) {
				final Class91_Sub16 class91_sub16 = (Class91_Sub16) Class79.aClass95_1114.method1062();
				if (class91_sub16 == null) {
					break;
				}
				class91_sub9_sub1.method690(i, 1160292001);
				class91_sub9_sub1.writeWordBigEndian(0);
				final int i_1_ = class91_sub9_sub1.currentOffset * -1128893257;
				class91_sub9_sub1.writeDWord(-1070123673 * class91_sub16.anInt1958);
				for (int i_2_ = 0; i_2_ < 187524707 * class91_sub16.anInt1952; i_2_++) {
					if (class91_sub16.anIntArray1954[i_2_] != 0) {
						class91_sub9_sub1.writeWordBigEndian(class91_sub16.anIntArray1954[i_2_]);
					} else {
						try {
							final int i_3_ = class91_sub16.anIntArray1953[i_2_];
							if (i_3_ == 0) {
								final Field field = class91_sub16.aFieldArray1955[i_2_];
								final int i_4_ = field.getInt(null);
								class91_sub9_sub1.writeWordBigEndian(0);
								class91_sub9_sub1.writeDWord(i_4_);
							} else if (1 == i_3_) {
								final Field field = class91_sub16.aFieldArray1955[i_2_];
								field.setInt(null, class91_sub16.anIntArray1951[i_2_]);
								class91_sub9_sub1.writeWordBigEndian(0);
							} else if (i_3_ == 2) {
								final Field field = class91_sub16.aFieldArray1955[i_2_];
								final int i_5_ = field.getModifiers();
								class91_sub9_sub1.writeWordBigEndian(0);
								class91_sub9_sub1.writeDWord(i_5_);
							}
							if (i_3_ == 3) {
								final Method method = class91_sub16.aMethodArray1957[i_2_];
								final byte[][] is = class91_sub16.aByteArrayArrayArray1956[i_2_];
								final Object[] objects = new Object[is.length];
								for (int i_6_ = 0; i_6_ < is.length; i_6_++) {
									final ObjectInputStream objectinputstream = new ObjectInputStream(new ByteArrayInputStream(is[i_6_]));
									objects[i_6_] = objectinputstream.readObject();
								}
								final Object object = method.invoke(null, objects);
								if (object == null) {
									class91_sub9_sub1.writeWordBigEndian(0);
								} else if (object instanceof Number) {
									class91_sub9_sub1.writeWordBigEndian(1);
									class91_sub9_sub1.writeQWord(((Number) object).longValue());
								} else if (object instanceof String) {
									class91_sub9_sub1.writeWordBigEndian(2);
									class91_sub9_sub1.method634((String) object, (byte) 66);
								} else {
									class91_sub9_sub1.writeWordBigEndian(4);
								}
							} else if (4 == i_3_) {
								final Method method = class91_sub16.aMethodArray1957[i_2_];
								final int i_7_ = method.getModifiers();
								class91_sub9_sub1.writeWordBigEndian(0);
								class91_sub9_sub1.writeDWord(i_7_);
							}
						} catch (final ClassNotFoundException classnotfoundexception) {
							class91_sub9_sub1.writeWordBigEndian(-10);
						} catch (final InvalidClassException invalidclassexception) {
							class91_sub9_sub1.writeWordBigEndian(-11);
						} catch (final StreamCorruptedException streamcorruptedexception) {
							class91_sub9_sub1.writeWordBigEndian(-12);
						} catch (final OptionalDataException optionaldataexception) {
							class91_sub9_sub1.writeWordBigEndian(-13);
						} catch (final IllegalAccessException illegalaccessexception) {
							class91_sub9_sub1.writeWordBigEndian(-14);
						} catch (final IllegalArgumentException illegalargumentexception) {
							class91_sub9_sub1.writeWordBigEndian(-15);
						} catch (final InvocationTargetException invocationtargetexception) {
							class91_sub9_sub1.writeWordBigEndian(-16);
						} catch (final SecurityException securityexception) {
							class91_sub9_sub1.writeWordBigEndian(-17);
						} catch (final IOException ioexception) {
							class91_sub9_sub1.writeWordBigEndian(-18);
						} catch (final NullPointerException nullpointerexception) {
							class91_sub9_sub1.writeWordBigEndian(-19);
						} catch (final Exception exception) {
							class91_sub9_sub1.writeWordBigEndian(-20);
						} catch (final Throwable throwable) {
							class91_sub9_sub1.writeWordBigEndian(-21);
						}
					}
				}
				class91_sub9_sub1.method652(i_1_, (byte) 69);
				class91_sub9_sub1.method638(class91_sub9_sub1.currentOffset * -1128893257 - i_1_, (byte) -29);
				class91_sub16.method495();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "by.w()");
		}
	}

	@Override
	public void method242(final int i) {
		try {
			for (int i_8_ = 0; i_8_ < 10; i_8_++) {
				this.aLongArray1716[i_8_] = 0L;
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "by.i()");
		}
	}

	@Override
	public void method241() {
		for (int i = 0; i < 10; i++) {
			this.aLongArray1716[i] = 0L;
		}
	}

	@Override
	public void method246() {
		for (int i = 0; i < 10; i++) {
			this.aLongArray1716[i] = 0L;
		}
	}

	@Override
	int method248(final int i, final int i_9_) {
		final int i_10_ = 566729417 * this.anInt1717;
		final int i_11_ = -1991342491 * this.anInt1723;
		this.anInt1717 = 1136058828;
		this.anInt1723 = 453098349;
		this.aLong1718 = Class108.method1111(732040937) * -8010425877051406227L;
		if (0L == this.aLongArray1716[this.anInt1720 * 443003617]) {
			this.anInt1717 = -253911175 * i_10_;
			this.anInt1723 = i_11_ * 453098349;
		} else if (1111756641294106981L * this.aLong1718 > this.aLongArray1716[443003617 * this.anInt1720]) {
			this.anInt1717 = -253911175 * (int) (2560 * i / (1111756641294106981L * this.aLong1718 - this.aLongArray1716[this.anInt1720 * 443003617]));
		}
		if (this.anInt1717 * 566729417 < 25) {
			this.anInt1717 = -2052812079;
		}
		if (this.anInt1717 * 566729417 > 256) {
			this.anInt1717 = -576751360;
			this.anInt1723 = 453098349 * (int) (i - (this.aLong1718 * 1111756641294106981L - this.aLongArray1716[443003617 * this.anInt1720]) / 10L);
		}
		if (-1991342491 * this.anInt1723 > i) {
			this.anInt1723 = i * 453098349;
		}
		this.aLongArray1716[this.anInt1720 * 443003617] = 1111756641294106981L * this.aLong1718;
		this.anInt1720 = 1054937377 * ((this.anInt1720 * 443003617 + 1) % 10);
		if (this.anInt1723 * -1991342491 > 1) {
			for (int i_12_ = 0; i_12_ < 10; i_12_++) {
				if (0L != this.aLongArray1716[i_12_]) {
					this.aLongArray1716[i_12_] += this.anInt1723 * -1991342491;
				}
			}
		}
		if (-1991342491 * this.anInt1723 < i_9_) {
			this.anInt1723 = 453098349 * i_9_;
		}
		Class91_Sub20_Sub5.method761(this.anInt1723 * -1991342491);
		int i_13_ = 0;
		for (/**/; -647421053 * this.anInt1715 < 256; this.anInt1715 += 427612867 * this.anInt1717) {
			i_13_++;
		}
		this.anInt1715 = 1111065387 * (-647421053 * this.anInt1715 & 0xff);
		return i_13_;
	}

	static Class91_Sub20_Sub15 method251(final int i, final byte i_14_) {
		Class91_Sub20_Sub15 class91_sub20_sub15;
		try {
			Class91_Sub20_Sub15 class91_sub20_sub15_15_ = (Class91_Sub20_Sub15) Class91_Sub20_Sub5.aClass96_2284.method1068(i);
			if (class91_sub20_sub15_15_ != null) {
				return class91_sub20_sub15_15_;
			}
			class91_sub20_sub15_15_ = Class44.method360(Class91_Sub20_Sub5.aClass63_2264, Class91_Sub20_Sub5.aClass63_2273, i, false, (byte) -59);
			if (class91_sub20_sub15_15_ != null) {
				Class91_Sub20_Sub5.aClass96_2284.method1067(class91_sub20_sub15_15_, i);
			}
			class91_sub20_sub15 = class91_sub20_sub15_15_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "by.a()");
		}
		return class91_sub20_sub15;
	}

	@Override
	int method247(final int i, final int i_16_) {
		final int i_17_ = 566729417 * this.anInt1717;
		final int i_18_ = -1991342491 * this.anInt1723;
		this.anInt1717 = 1136058828;
		this.anInt1723 = 453098349;
		this.aLong1718 = Class108.method1111(1942871488) * -8010425877051406227L;
		if (0L == this.aLongArray1716[this.anInt1720 * 443003617]) {
			this.anInt1717 = -253911175 * i_17_;
			this.anInt1723 = i_18_ * 453098349;
		} else if (1111756641294106981L * this.aLong1718 > this.aLongArray1716[443003617 * this.anInt1720]) {
			this.anInt1717 = -253911175 * (int) (2560 * i / (1111756641294106981L * this.aLong1718 - this.aLongArray1716[this.anInt1720 * 443003617]));
		}
		if (this.anInt1717 * 566729417 < 25) {
			this.anInt1717 = -2052812079;
		}
		if (this.anInt1717 * 566729417 > 256) {
			this.anInt1717 = -576751360;
			this.anInt1723 = 453098349 * (int) (i - (this.aLong1718 * 1111756641294106981L - this.aLongArray1716[443003617 * this.anInt1720]) / 10L);
		}
		if (-1991342491 * this.anInt1723 > i) {
			this.anInt1723 = i * 453098349;
		}
		this.aLongArray1716[this.anInt1720 * 443003617] = 1111756641294106981L * this.aLong1718;
		this.anInt1720 = 1054937377 * ((this.anInt1720 * 443003617 + 1) % 10);
		if (this.anInt1723 * -1991342491 > 1) {
			for (int i_19_ = 0; i_19_ < 10; i_19_++) {
				if (0L != this.aLongArray1716[i_19_]) {
					this.aLongArray1716[i_19_] += this.anInt1723 * -1991342491;
				}
			}
		}
		if (-1991342491 * this.anInt1723 < i_16_) {
			this.anInt1723 = 453098349 * i_16_;
		}
		Class91_Sub20_Sub5.method761(this.anInt1723 * -1991342491);
		int i_20_ = 0;
		for (/**/; -647421053 * this.anInt1715 < 256; this.anInt1715 += 427612867 * this.anInt1717) {
			i_20_++;
		}
		this.anInt1715 = 1111065387 * (-647421053 * this.anInt1715 & 0xff);
		return i_20_;
	}

	@Override
	int method245(final int i, final int i_21_) {
		final int i_22_ = 566729417 * this.anInt1717;
		final int i_23_ = -1991342491 * this.anInt1723;
		this.anInt1717 = 1136058828;
		this.anInt1723 = 453098349;
		this.aLong1718 = Class108.method1111(164544024) * -8010425877051406227L;
		if (0L == this.aLongArray1716[this.anInt1720 * 443003617]) {
			this.anInt1717 = -253911175 * i_22_;
			this.anInt1723 = i_23_ * 453098349;
		} else if (1111756641294106981L * this.aLong1718 > this.aLongArray1716[443003617 * this.anInt1720]) {
			this.anInt1717 = -253911175 * (int) (2560 * i / (1111756641294106981L * this.aLong1718 - this.aLongArray1716[this.anInt1720 * 443003617]));
		}
		if (this.anInt1717 * 566729417 < 25) {
			this.anInt1717 = -2052812079;
		}
		if (this.anInt1717 * 566729417 > 256) {
			this.anInt1717 = -576751360;
			this.anInt1723 = 453098349 * (int) (i - (this.aLong1718 * 1111756641294106981L - this.aLongArray1716[443003617 * this.anInt1720]) / 10L);
		}
		if (-1991342491 * this.anInt1723 > i) {
			this.anInt1723 = i * 453098349;
		}
		this.aLongArray1716[this.anInt1720 * 443003617] = 1111756641294106981L * this.aLong1718;
		this.anInt1720 = 1054937377 * ((this.anInt1720 * 443003617 + 1) % 10);
		if (this.anInt1723 * -1991342491 > 1) {
			for (int i_24_ = 0; i_24_ < 10; i_24_++) {
				if (0L != this.aLongArray1716[i_24_]) {
					this.aLongArray1716[i_24_] += this.anInt1723 * -1991342491;
				}
			}
		}
		if (-1991342491 * this.anInt1723 < i_21_) {
			this.anInt1723 = 453098349 * i_21_;
		}
		Class91_Sub20_Sub5.method761(this.anInt1723 * -1991342491);
		int i_25_ = 0;
		for (/**/; -647421053 * this.anInt1715 < 256; this.anInt1715 += 427612867 * this.anInt1717) {
			i_25_++;
		}
		this.anInt1715 = 1111065387 * (-647421053 * this.anInt1715 & 0xff);
		return i_25_;
	}

	@Override
	int method243(final int i, final int i_26_, final byte i_27_) {
		int i_28_;
		try {
			final int i_29_ = 566729417 * this.anInt1717;
			final int i_30_ = -1991342491 * this.anInt1723;
			this.anInt1717 = 1136058828;
			this.anInt1723 = 453098349;
			this.aLong1718 = Class108.method1111(1670507482) * -8010425877051406227L;
			if (0L == this.aLongArray1716[this.anInt1720 * 443003617]) {
				this.anInt1717 = -253911175 * i_29_;
				this.anInt1723 = i_30_ * 453098349;
			} else if (1111756641294106981L * this.aLong1718 > this.aLongArray1716[443003617 * this.anInt1720]) {
				this.anInt1717 = -253911175 * (int) (2560 * i / (1111756641294106981L * this.aLong1718 - this.aLongArray1716[this.anInt1720 * 443003617]));
			}
			if (this.anInt1717 * 566729417 < 25) {
				this.anInt1717 = -2052812079;
			}
			if (this.anInt1717 * 566729417 > 256) {
				this.anInt1717 = -576751360;
				this.anInt1723 = 453098349 * (int) (i - (this.aLong1718 * 1111756641294106981L - this.aLongArray1716[443003617 * this.anInt1720]) / 10L);
			}
			if (-1991342491 * this.anInt1723 > i) {
				this.anInt1723 = i * 453098349;
			}
			this.aLongArray1716[this.anInt1720 * 443003617] = 1111756641294106981L * this.aLong1718;
			this.anInt1720 = 1054937377 * ((this.anInt1720 * 443003617 + 1) % 10);
			if (this.anInt1723 * -1991342491 > 1) {
				for (int i_31_ = 0; i_31_ < 10; i_31_++) {
					if (0L != this.aLongArray1716[i_31_]) {
						this.aLongArray1716[i_31_] += this.anInt1723 * -1991342491;
					}
				}
			}
			if (-1991342491 * this.anInt1723 < i_26_) {
				this.anInt1723 = 453098349 * i_26_;
			}
			Class91_Sub20_Sub5.method761(this.anInt1723 * -1991342491);
			int i_32_ = 0;
			for (/**/; -647421053 * this.anInt1715 < 256; this.anInt1715 += 427612867 * this.anInt1717) {
				i_32_++;
			}
			this.anInt1715 = 1111065387 * (-647421053 * this.anInt1715 & 0xff);
			i_28_ = i_32_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "by.w()");
		}
		return i_28_;
	}

	Class26_Sub1() {
		try {
			this.aLongArray1716 = new long[10];
			this.anInt1717 = -576751360;
			this.anInt1723 = 453098349;
			this.anInt1715 = 0;
			this.aLong1718 = Class108.method1111(277103497) * -8010425877051406227L;
			for (int i = 0; i < 10; i++) {
				this.aLongArray1716[i] = 1111756641294106981L * this.aLong1718;
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "by.<init>()");
		}
	}
}
