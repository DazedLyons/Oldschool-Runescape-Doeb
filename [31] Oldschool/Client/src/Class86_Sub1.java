/* Class86_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

public class Class86_Sub1 extends Class86 {
	String aString1745;
	public static final int anInt1746 = 68;
	short aShort1747;
	static final int anInt1748 = 1005;
	static final int anInt1749 = 40;
	static Class6 aClass6_1750;
	public static final int anInt1751 = 13;
	int anInt1752;

	static final void method489(final String string, final boolean bool, final int i) {
		try {
			final int i_3_ = Class32.aClass91_Sub20_Sub13_Sub4_Sub1_376.method891(string, 250);
			final int i_4_ = Class32.aClass91_Sub20_Sub13_Sub4_Sub1_376.method912(string, 250) * 13;
			Class91_Sub20_Sub13.method828(6, 6, 8 + i_3_, 4 + i_4_ + 4, 0);
			Class91_Sub20_Sub13.method834(6, 6, 4 + i_3_ + 4, 4 + i_4_ + 4, 16777215);
			Class32.aClass91_Sub20_Sub13_Sub4_Sub1_376.method894(string, 10, 10, i_3_, i_4_, 16777215, -1, 1, 1, 0);
			Class91_Sub20_Sub14_Sub1_Sub2.method944(6, 6, 4 + i_3_ + 4, 8 + i_4_, -2107036419);
			if (bool) {
				try {
					final Graphics graphics = Class102.aCanvas1309.getGraphics();
					Class97.aClass28_1218.method254(graphics, 0, 0, 153902412);
				} catch (final Exception exception) {
					Class102.aCanvas1309.repaint();
				}
			} else {
				final int i_7_ = i_3_;
				final int i_8_ = i_4_;
				for (int i_9_ = 0; i_9_ < client.anInt1456 * -437440627; i_9_++) {
					if (client.anIntArray1648[i_9_] + client.anIntArray1608[i_9_] > 10 && client.anIntArray1648[i_9_] < i_7_ + 10 && client.anIntArray1651[i_9_] + client.anIntArray1649[i_9_] > 10 && client.anIntArray1649[i_9_] < 10 + i_8_) {
						client.aBooleanArray1646[i_9_] = true;
					}
				}
			}
		} catch (final RuntimeException var14) {
			throw Class102.method1086(var14, "ae.ai()");
		}
	}

	public static ObjType method490(final int i, final int i_10_) {
		ObjType class91_sub20_sub8;
		try {
			ObjType class91_sub20_sub8_11_ = (ObjType) ObjType.aClass96_2352.method1068(i);
			if (class91_sub20_sub8_11_ != null) {
				return class91_sub20_sub8_11_;
			}
			final byte[] is = ObjType.aClass63_2381.getFile(10, i, -540222423);
			class91_sub20_sub8_11_ = new ObjType();
			class91_sub20_sub8_11_.anInt2355 = i * -53430747;
			if (is != null) {
				class91_sub20_sub8_11_.decode(new ByteBuffer(is), 46770069);
			}
			class91_sub20_sub8_11_.method781(78318066);
			if (-1826659211 * class91_sub20_sub8_11_.anInt2384 != -1) {
				class91_sub20_sub8_11_.method791(method490(class91_sub20_sub8_11_.anInt2384 * -1826659211, 234554293), method490(-490096559 * class91_sub20_sub8_11_.anInt2387, 234554293), 1315096031);
			}
			if (!ObjType.aBoolean2379 && class91_sub20_sub8_11_.aBoolean2388) {
				class91_sub20_sub8_11_.aString2357 = Class75.aString1007;
				class91_sub20_sub8_11_.aStringArray2369 = null;
				class91_sub20_sub8_11_.aStringArray2372 = null;
				class91_sub20_sub8_11_.anInt2375 = 0;
			}
			ObjType.aClass96_2352.method1067(class91_sub20_sub8_11_, i);
			class91_sub20_sub8 = class91_sub20_sub8_11_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ae.i()");
		}
		return class91_sub20_sub8;
	}

	Class86_Sub1(final String string, final int i) {
		try {
			this.anInt1752 = (int) (Class108.method1111(1741064372) / 1000L) * 400001479;
			this.aString1745 = string;
			this.aShort1747 = (short) i;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "ae.<init>()");
		}
	}
}
