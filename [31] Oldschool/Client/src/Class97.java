/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class97 implements Runnable {
	static Class63_Sub1 aClass63_Sub1_1209;
	Object anObject1210;
	int anInt1211;
	int[] anIntArray1212;
	int[] anIntArray1213;
	static Class91_Sub20_Sub13_Sub3 aClass91_Sub20_Sub13_Sub3_1214;
	static int anInt1215;
	static Class91_Sub20_Sub13_Sub3[] aClass91_Sub20_Sub13_Sub3Array1216;
	boolean aBoolean1217;
	public static Class28 aClass28_1218;
	static int anInt1219;
	public static final int anInt1220 = 177;
	public static final int anInt1221 = 97;
	public static final int anInt1222 = 19661184;

	public static int method1071(final ByteBuffer class91_sub9, final String string, final int i) {
		int i_0_;
		try {
			final int i_1_ = class91_sub9.currentOffset * -1128893257;
			final byte[] is = Class58.method389(string, 673089859);
			class91_sub9.method639(is.length, (byte) -3);
			class91_sub9.currentOffset += Class99.aClass53_1235.method375(is, 0, is.length, class91_sub9.buffer, -1128893257 * class91_sub9.currentOffset, 1493884543) * 565881095;
			i_0_ = -1128893257 * class91_sub9.currentOffset - i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "g.w()");
		}
		return i_0_;
	}

	Class97() {
		try {
			this.aBoolean1217 = true;
			this.anObject1210 = new Object();
			this.anInt1211 = 0;
			this.anIntArray1212 = new int[500];
			this.anIntArray1213 = new int[500];
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "g.<init>()");
		}
	}

	static void method1072(final int i, final byte i_2_) {
		try {
			if (-1 == i) {
				if (i_2_ < 42) {
					/* empty */
				}
			} else if (!Class91_Sub20_Sub9.method800(i, -150782344)) {
				if (i_2_ >= 42) {
					throw new IllegalStateException();
				}
			} else {
				final Class91_Sub18[] class91_sub18s = Class91_Sub18.aClass91_Sub18ArrayArray1962[i];
				Class91_Sub18[] class91_sub18s_4_;
				final int i_3_ = (class91_sub18s_4_ = class91_sub18s).length;
				for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
					final Class91_Sub18 class91_sub18 = class91_sub18s_4_[i_5_];
					if (i_2_ >= 42) {
						break;
					}
					if (class91_sub18.anObjectArray2009 != null) {
						final Class91_Sub21 class91_sub21 = new Class91_Sub21();
						class91_sub21.aClass91_Sub18_2090 = class91_sub18;
						class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray2009;
						Class91_Sub20_Sub14.method919(class91_sub21, (short) 5597);
					}
				}
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "g.w()");
		}
	}

	static void method1073(final int i, final int i_6_, final byte i_7_) {
		try {
			if (1217281259 * client.anInt1677 != 0 && i != -1) {
				Class81.method468(Class103.aClass63_Sub1_1318, i, 0, 1217281259 * client.anInt1677, false, (byte) 3);
				client.aBoolean1521 = true;
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "g.ae()");
		}
	}

	@Override
	public void run() {
		try {
			while (this.aBoolean1217) {
				final Object object = this.anObject1210;
				synchronized (object) {
					if (-1265624073 * this.anInt1211 < 500) {
						this.anIntArray1212[this.anInt1211 * -1265624073] = -695750341 * Class12.anInt173;
						this.anIntArray1213[this.anInt1211 * -1265624073] = Class12.anInt178 * -855709389;
						this.anInt1211 += 1510544839;
					}
				}
				Class91_Sub20_Sub5.method761(50L);
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "g.run()");
		}
	}
}
