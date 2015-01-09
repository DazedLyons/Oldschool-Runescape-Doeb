/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class59 {
	public static boolean aBoolean716;
	public static int anInt717 = 0;
	public static long aLong718;
	public static Class83 aClass83_719 = new Class83(4096);
	public static int anInt720 = 0;
	public static Class83 aClass83_721 = new Class83(32);
	public static Class20 aClass20_722;
	public static int anInt723 = 0;
	static Class83 aClass83_724 = new Class83(4096);
	public static int anInt725 = 0;
	public static Class82 aClass82_726 = new Class82();
	public static int anInt727 = 0;
	public static ByteBuffer aClass91_Sub9_728 = new ByteBuffer(8);
	public static Class83 aClass83_729 = new Class83(4096);
	public static int anInt730 = 0;
	public static CRC32 aCRC32_731 = new CRC32();
	public static Class63_Sub1[] aClass63_Sub1Array732 = new Class63_Sub1[256];
	public static byte aByte733 = 0;
	public static int anInt734 = 0;
	public static int anInt735 = 0;
	public static final int anInt736 = 105;

	public static void method390(final short i) {
		try {
			final Class15 class15 = Class15.aClass15_216;
			synchronized (class15) {
				Class15.anInt228 += 729920841;
				Class15.anInt226 = -888086165 * Class15.anInt204;
				Class15.anInt225 = 0;
				if (Class15.anInt221 * 1976398693 < 0) {
					for (int i_0_ = 0; i_0_ < 112; i_0_++) {
						Class15.aBooleanArray218[i_0_] = false;
					}
					Class15.anInt221 = 126407151 * Class15.anInt224;
				} else {
					while (Class15.anInt221 * 1976398693 != -961793973 * Class15.anInt224) {
						final int i_1_ = Class15.anIntArray231[Class15.anInt224 * -961793973];
						Class15.anInt224 = 1960188259 * (1 + -961793973 * Class15.anInt224 & 0x7f);
						if (i_1_ < 0) {
							Class15.aBooleanArray218[i_1_ ^ 0xffffffff] = false;
						} else {
							if (!Class15.aBooleanArray218[i_1_] && Class15.anInt225 * -1188242827 < Class15.anIntArray209.length - 1) {
								Class15.anIntArray209[(Class15.anInt225 += -95246883) * -1188242827 - 1] = i_1_;
							}
							Class15.aBooleanArray218[i_1_] = true;
						}
					}
				}
				Class15.anInt204 = Class15.anInt217 * -214374359;
			}
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "ea.f()");
		}
	}

	Class59() throws Throwable {
		try {
			throw new Error();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ea.<init>()");
		}
	}
}
