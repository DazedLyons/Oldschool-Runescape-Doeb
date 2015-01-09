/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class Canvas_Sub1 extends Canvas {
	static Class29 aClass29_18;
	static final int anInt19 = 56;
	static final int anInt20 = 524288;
	static final int anInt21 = 1002;
	static final int anInt22 = 9;
	static final int anInt23 = 1;
	static final int anInt24 = 32;
	public static final int anInt25 = 45;
	public static final int anInt26 = 61;
	public static final int anInt27 = 94;
	Component aComponent28;

	@Override
	public final void update(final Graphics graphics) {
		try {
			this.aComponent28.update(graphics);
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "be.update()");
		}
	}

	@Override
	public final void paint(final Graphics graphics) {
		try {
			this.aComponent28.paint(graphics);
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "be.paint()");
		}
	}

	Canvas_Sub1(final Component component) {
		try {
			this.aComponent28 = component;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "be.<init>()");
		}
	}

	static final void method72(final int i) {
		try {
			if (Class91_Sub20_Sub14_Sub6.aClass20_2819 != null) {
				Class91_Sub20_Sub14_Sub6.aClass20_2819.method194((byte) 1);
				Class91_Sub20_Sub14_Sub6.aClass20_2819 = null;
			}
			Class107.method1106(1928643827);
			Class107.aClass39_1397.method330();
			for (int i_0_ = 0; i_0_ < 4; i_0_++) {
				client.aClass76Array1530[i_0_].method462((byte) 0);
			}
			System.gc();
			Class107.method1104(2, -215189718);
			client.anInt1678 = 1817922601;
			client.aBoolean1521 = false;
			for (Class91_Sub24 class91_sub24 = (Class91_Sub24) Class91_Sub24.aClass95_2137.method1062(); class91_sub24 != null; class91_sub24 = (Class91_Sub24) Class91_Sub24.aClass95_2137.method1063()) {
				if (class91_sub24.aClass91_Sub2_Sub1_2133 != null) {
					Class91_Sub22.aClass91_Sub2_Sub2_2109.method560(class91_sub24.aClass91_Sub2_Sub1_2133);
					class91_sub24.aClass91_Sub2_Sub1_2133 = null;
				}
				if (class91_sub24.aClass91_Sub2_Sub1_2138 != null) {
					Class91_Sub22.aClass91_Sub2_Sub2_2109.method560(class91_sub24.aClass91_Sub2_Sub1_2138);
					class91_sub24.aClass91_Sub2_Sub1_2138 = null;
				}
			}
			Class91_Sub24.aClass95_2137.method1057();
			Class91_Sub20_Sub14_Sub1_Sub2.method939(10, 2006993865);
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "be.n()");
		}
	}
}
