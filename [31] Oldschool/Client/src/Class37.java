/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37 {
	static Class63_Sub1 aClass63_Sub1_442;
	public static final int anInt443 = 19661187;
	static final int anInt444 = 4;
	static int[] anIntArray445;
	static int anInt446;
	static int anInt447;
	public static final int anInt448 = 10;
	static int[] anIntArray449;
	static final int anInt450 = 1004;
	static int anInt451;
	public static final int anInt452 = 90;
	public static final int anInt453 = 98;

	static final void method288(final byte i) {
		try {
			for (int i_0_ = 0; i_0_ < -1087706681 * client.anInt1565; i_0_++) {
				final int i_1_ = client.anIntArray1566[i_0_];
				final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_1_];
				int i_2_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
				if ((i_2_ & 0x20) != 0) {
					i_2_ += client.aClass91_Sub9_Sub1_1480.readUnsignedByte() << 8;
				}
				Class106.method1100(i_1_, class91_sub20_sub14_sub1_sub1, i_2_, 1924511878);
			}
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "ct.by()");
		}
	}

	Class37() throws Throwable {
		try {
			throw new Error();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ct.<init>()");
		}
	}

	public static FloUnderlayType method289(final int i, final byte i_3_) {
		FloUnderlayType class91_sub20_sub10;
		try {
			FloUnderlayType class91_sub20_sub10_4_ = (FloUnderlayType) FloUnderlayType.aClass96_2421.method1068(i);
			if (class91_sub20_sub10_4_ != null) {
				return class91_sub20_sub10_4_;
			}
			final byte[] is = FloUnderlayType.underlayJs5.getFile(1, i, -896455996);//well ill do another one that goes with this
			class91_sub20_sub10_4_ = new FloUnderlayType();
			if (is != null) {
				class91_sub20_sub10_4_.method803(new ByteBuffer(is), i, -727788889);
			}
			class91_sub20_sub10_4_.method802((byte) 50);
			FloUnderlayType.aClass96_2421.method1067(class91_sub20_sub10_4_, i);
			class91_sub20_sub10 = class91_sub20_sub10_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ct.w()");
		}
		return class91_sub20_sub10;
	}
}
