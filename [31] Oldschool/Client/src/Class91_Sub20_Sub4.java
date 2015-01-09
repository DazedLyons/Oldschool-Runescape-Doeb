/* Class91_Sub20_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class91_Sub20_Sub4 extends Class91_Sub20 {
	public static Class96 aClass96_2254 = new Class96(64);
	public int anInt2255;
	public int anInt2256;
	public int anInt2257;
	public static Js5 aClass63_2258;
	static final int anInt2259 = 19;
	static final int anInt2260 = 55;
	static boolean aBoolean2261;
	public static int anInt2262;

	public void method748(final ByteBuffer class91_sub9, final byte i) {
		try {
			for (;;) {
				final int i_0_ = class91_sub9.readUnsignedByte();
				if (i_0_ == 0) {
					break;
				}
				method749(class91_sub9, i_0_, (byte) -27);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ai.w()");
		}
	}

	void method749(final ByteBuffer class91_sub9, final int i, final byte i_1_) {
		try {
			if (i == 1) {
				anInt2256 = class91_sub9.method686((byte) -20) * 1141538761;
				anInt2257 = class91_sub9.readUnsignedByte() * 404124093;
				anInt2255 = class91_sub9.readUnsignedByte() * 1966626027;
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "ai.f()");
		}
	}

	public static void method750(final Class20 class20, final boolean bool, final int i) {
		try {
			if (Class59.aClass20_722 != null) {
				try {
					Class59.aClass20_722.method194((byte) 1);
				} catch (final Exception exception) {
					/* empty */
				}
				Class59.aClass20_722 = null;
			}
			Class59.aClass20_722 = class20;
			Class68.method434(bool, -907129429);
			Class59.aClass91_Sub9_728.currentOffset = 0;
			Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177 = null;
			Class23.aClass91_Sub9_290 = null;
			Class59.anInt730 = 0;
			for (;;) {
				Class91_Sub20_Sub16 class91_sub20_sub16 = (Class91_Sub20_Sub16) Class59.aClass83_721.method476();
				if (class91_sub20_sub16 == null) {
					for (;;) {
						class91_sub20_sub16 = (Class91_Sub20_Sub16) Class59.aClass83_729.method476();
						if (class91_sub20_sub16 == null) {
							if (Class59.aByte733 != 0) {
								try {
									final ByteBuffer class91_sub9 = new ByteBuffer(4);
									class91_sub9.writeWordBigEndian(4);
									class91_sub9.writeWordBigEndian(Class59.aByte733);
									class91_sub9.method681(0, -372694149);
									Class59.aClass20_722.method197(class91_sub9.buffer, 0, 4, (byte) 0);
								} catch (final IOException ioexception) {
									try {
										Class59.aClass20_722.method194((byte) 1);
									} catch (final Exception exception) {
										/* empty */
									}
									Class59.anInt727 += -590812569;
									Class59.aClass20_722 = null;
								}
							}
							Class59.anInt717 = 0;
							Class59.aLong718 = Class108.method1111(864175026) * 3379739841472972119L;
							break;
						}
						Class59.aClass82_726.method470(class91_sub20_sub16);
						Class59.aClass83_724.method478(class91_sub20_sub16, class91_sub20_sub16.aLong1192);
						Class59.anInt725 += -2088692321;
						Class59.anInt723 -= 506421201;
					}
					break;
				}
				Class59.aClass83_719.method478(class91_sub20_sub16, class91_sub20_sub16.aLong1192);
				Class59.anInt720 += 483014633;
				Class59.anInt735 -= -1623500755;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ai.w()");
		}
	}
}
