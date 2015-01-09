/* Class91_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class Class91_Sub21 extends Class91 {
	static int[] anIntArray2089;
	Class91_Sub18 aClass91_Sub18_2090;
	int anInt2091;
	int anInt2092;
	int anInt2093;
	Class91_Sub18 aClass91_Sub18_2094;
	static final int anInt2095 = 8;
	int anInt2096;
	String aString2097;
	int anInt2098;
	static final int anInt2099 = 12;
	Object[] anObjectArray2100;
	static final int anInt2101 = 58;
	public static final int anInt2102 = 236;
	public static final int anInt2103 = 115;

	static String method1033(final int i, final int i_0_) {
		String string;
		try {
			string = new StringBuilder("<col=").append(Integer.toHexString(i)).append(">").toString();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "i.w()");
		}
		return string;
	}

	static void method1034(final int i) {
		try {
			if (!client.aBoolean1568) {
				if (i >= -642189858) {
					throw new IllegalStateException();
				}
			} else {
				final Class91_Sub18 class91_sub18 = Js5.method412(-1881812719 * Class91_Sub20_Sub14_Sub6.anInt2821, client.anInt1549 * -269280321, (byte) 1);
				if (class91_sub18 != null && class91_sub18.anObjectArray1990 != null) {
					final Class91_Sub21 class91_sub21 = new Class91_Sub21();
					class91_sub21.aClass91_Sub18_2090 = class91_sub18;
					class91_sub21.anObjectArray2100 = class91_sub18.anObjectArray1990;
					Class91_Sub20_Sub14.method919(class91_sub21, (short) 16649);
				}
				client.aBoolean1568 = false;
				Class28_Sub1.method272(class91_sub18, -1905179897);
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "i.bo()");
		}
	}

	public static void method1035(final int i) {
		try {
			if (Class12.aClass12_183 != null) {
				final Class12 class12 = Class12.aClass12_183;
				synchronized (class12) {
					Class12.aClass12_183 = null;
				}
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "i.f()");
		}
	}

	Class91_Sub21() {
		/* empty */
	}

	public static void method1036(final String string, final Throwable throwable, final byte i) {
		do {
			try {
				try {
					String string_1_ = "";
					if (throwable != null) {
						Throwable throwable_2_ = throwable;
						String string_3_;
						if (throwable instanceof RuntimeException_Sub1) {
							final RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
							string_3_ = new StringBuilder(runtimeexception_sub1.aString1411).append(" | ").toString();
							throwable_2_ = runtimeexception_sub1.aThrowable1412;
						} else {
							string_3_ = "";
						}
						final StringWriter stringwriter = new StringWriter();
						final PrintWriter printwriter = new PrintWriter(stringwriter);
						throwable_2_.printStackTrace(printwriter);
						printwriter.close();
						final String string_4_ = stringwriter.toString();
						final BufferedReader bufferedreader = new BufferedReader(new StringReader(string_4_));
						final String string_5_ = bufferedreader.readLine();
						for (;;) {
							String string_6_ = bufferedreader.readLine();
							if (string_6_ == null) {
								string_3_ = new StringBuilder(string_3_).append("| ").append(string_5_).toString();
								string_1_ = string_3_;
								break;
							}
							final int i_7_ = string_6_.indexOf('(');
							final int i_8_ = string_6_.indexOf(')', 1 + i_7_);
							if (i_7_ >= 0 && i_8_ >= 0) {
								String string_9_ = string_6_.substring(1 + i_7_, i_8_);
								final int i_10_ = string_9_.indexOf(".java:");
								if (i_10_ >= 0) {
									string_9_ = new StringBuilder(string_9_.substring(0, i_10_)).append(string_9_.substring(5 + i_10_)).toString();
									string_3_ = new StringBuilder(string_3_).append(string_9_).append(' ').toString();
									continue;
								}
								string_6_ = string_6_.substring(0, i_7_);
							}
							string_6_ = string_6_.trim();
							string_6_ = string_6_.substring(string_6_.lastIndexOf(' ') + 1);
							string_6_ = string_6_.substring(string_6_.lastIndexOf('\t') + 1);
							string_3_ = new StringBuilder(string_3_).append(string_6_).append(' ').toString();
						}
					}
					if (string != null) {
						if (throwable != null) {
							string_1_ = new StringBuilder(string_1_).append(" | ").toString();
						}
						string_1_ = new StringBuilder(string_1_).append(string).toString();
					}
					System.out.println(new StringBuilder("Error: ").append(string_1_).toString());
					string_1_ = string_1_.replace(':', '.');
					string_1_ = string_1_.replace('@', '_');
					string_1_ = string_1_.replace('&', '_');
					string_1_ = string_1_.replace('#', '_');
					if (RuntimeException_Sub1.anApplet1410 != null) {
						final URL url = new URL(RuntimeException_Sub1.anApplet1410.getCodeBase(), new StringBuilder("clienterror.ws?c=").append(1718411919 * Class54.anInt643).append("&u=").append(RuntimeException_Sub1.aString1409).append("&v1=").append(Class25.aString311).append("&v2=").append(Class25.aString314).append("&e=").append(string_1_).toString());
						final DataInputStream datainputstream = new DataInputStream(url.openStream());
						datainputstream.read();
						datainputstream.close();
					}
				} catch (final Exception exception) {
					break;
				}
				break;
			} catch (final RuntimeException var18) {
				throw Class102.method1086(var18, "i.i()");
			}
		} while (false);
	}

	static final int method1037(final int i, final int i_11_, final byte i_12_) {
		int i_13_;
		try {
			final int i_14_ = Class91_Sub20_Sub17.method1032(i - 1, i_11_ - 1, (byte) 53) + Class91_Sub20_Sub17.method1032(1 + i, i_11_ - 1, (byte) 70) + Class91_Sub20_Sub17.method1032(i - 1, 1 + i_11_, (byte) 115) + Class91_Sub20_Sub17.method1032(1 + i, 1 + i_11_, (byte) 65);
			final int i_15_ = Class91_Sub20_Sub17.method1032(i - 1, i_11_, (byte) 92) + Class91_Sub20_Sub17.method1032(i + 1, i_11_, (byte) 120) + Class91_Sub20_Sub17.method1032(i, i_11_ - 1, (byte) 103) + Class91_Sub20_Sub17.method1032(i, 1 + i_11_, (byte) 28);
			final int i_16_ = Class91_Sub20_Sub17.method1032(i, i_11_, (byte) 59);
			i_13_ = i_14_ / 16 + i_15_ / 8 + i_16_ / 4;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "i.s()");
		}
		return i_13_;
	}
}
