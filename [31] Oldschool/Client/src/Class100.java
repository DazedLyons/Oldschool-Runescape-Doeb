/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class100 {
	boolean aBoolean1238;
	String aString1239;
	int anInt1240;
	int anInt1241;
	boolean aBoolean1242;
	public static final int anInt1243 = 94;
	static int anInt1244;
	static Class91_Sub20_Sub13_Sub3 aClass91_Sub20_Sub13_Sub3_1245;
	protected static Class26 aClass26_1246;
	static final int anInt1247 = 50;
	static int anInt1248;
	public static final int anInt1249 = 2;
	public static final int anInt1250 = 152;
	String aString1251;

	Class100() {
		/* empty */
	}

	public static void setupIdkStores(final Js5 class63, final Js5 class63_0_, final int i) {
		try {
			IdkType.idkJs5 = class63;
			IdkType.aClass63_2214 = class63_0_;
			IdkType.anInt2217 = IdkType.idkJs5.method405(3, 2009604192) * -1824549525;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "h.i()");
		}
	}

	public static NpcType method1075(final int i, final int i_1_) {
		NpcType class91_sub20_sub11;
		try {
			NpcType class91_sub20_sub11_2_ = (NpcType) NpcType.aClass96_2425.method1068(i);
			if (class91_sub20_sub11_2_ != null) {
				return class91_sub20_sub11_2_;
			}
			final byte[] is = NpcType.npcJs5.getFile(9, i, 1871358586);
			class91_sub20_sub11_2_ = new NpcType();
			class91_sub20_sub11_2_.anInt2427 = -1049043245 * i;
			if (is != null) {
				class91_sub20_sub11_2_.method807(new ByteBuffer(is), (byte) 108);
			}
			class91_sub20_sub11_2_.method806((byte) 44);
			NpcType.aClass96_2425.method1067(class91_sub20_sub11_2_, i);
			class91_sub20_sub11 = class91_sub20_sub11_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "h.w()");
		}
		return class91_sub20_sub11;
	}
}
