/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

public class RuntimeException_Sub1 extends RuntimeException {
	public static String aString1409;
	static Applet anApplet1410;
	String aString1411;
	Throwable aThrowable1412;
	public static final int anInt1413 = 131;
	public static final int anInt1414 = 71;
	public static final int anInt1415 = 42;

	RuntimeException_Sub1(final Throwable throwable, final String string) {
		try {
			this.aString1411 = string;
			this.aThrowable1412 = throwable;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "ca.<init>()");
		}
	}
}
