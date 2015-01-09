/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class68 {
	static int[] anIntArray802;

	Class68() throws Throwable {
		try {
			throw new Error();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "el.<init>()");
		}
	}

	public static void method434(final boolean bool, final int i) {
		do {
			try {
				if (Class59.aClass20_722 != null) {
					try {
						final ByteBuffer class91_sub9 = new ByteBuffer(4);
						class91_sub9.writeWordBigEndian(bool ? 2 : 3);
						class91_sub9.method672(0, (byte) 112);
						Class59.aClass20_722.method197(class91_sub9.buffer, 0, 4, (byte) 0);
					} catch (final IOException ioexception) {
						try {
							Class59.aClass20_722.method194((byte) 1);
						} catch (final Exception exception) {
							/* empty */
						}
						Class59.anInt727 += -590812569;
						Class59.aClass20_722 = null;
						break;
					}
				}
				break;
			} catch (final RuntimeException var6) {
				throw Class102.method1086(var6, "el.i()");
			}
		} while (false);
	}
}
