/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class Class25 implements Runnable {
	static final int anInt301 = 1;
	Class29 aClass29_302;
	Interface1 anInterface1_303;
	Class29 aClass29_304;
	static Class91_Sub20_Sub13_Sub3 aClass91_Sub20_Sub13_Sub3_305;
	Thread aThread306;
	boolean aBoolean307;
	static final int anInt308 = 2;
	public EventQueue anEventQueue309;
	public static final int anInt310 = 27;
	public static String aString311;
	static final int anInt312 = 54;
	static final int anInt313 = 42;
	static String aString314;
	static Class91_Sub20_Sub13_Sub1[] aClass91_Sub20_Sub13_Sub1Array315;
	public static final int anInt316 = 19661070;
	public static final int anInt317 = 31;
	public static final int anInt318 = 189;
	public static final int anInt319 = 250;

	public static String method230(final String string, final int i) {
		String string_0_;
		try {
			final int i_1_ = string.length();
			final char[] cs = new char[i_1_];
			int i_2_ = 2;
			for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
				char c = string.charAt(i_3_);
				if (i_2_ == 0) {
					c = Character.toLowerCase(c);
				} else if (i_2_ == 2 || Character.isUpperCase(c)) {
					char c_4_;
					if ('\u00b5' != c && '\u0192' != c) {
						c_4_ = Character.toTitleCase(c);
					} else {
						c_4_ = c;
					}
					c = c_4_;
				}
				if (Character.isLetter(c)) {
					i_2_ = 0;
				} else if ('.' != c && '?' != c && '!' != c) {
					if (Character.isSpaceChar(c)) {
						if (2 != i_2_) {
							i_2_ = 1;
						}
					} else {
						i_2_ = 1;
					}
				} else {
					i_2_ = 2;
				}
				cs[i_3_] = c;
			}
			string_0_ = new String(cs);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bx.d()");
		}
		return string_0_;
	}

	public static Class91_Sub20_Sub13_Sub1 method231(final Js5 class63, final String string, final String string_5_, final int i) {
		Class91_Sub20_Sub13_Sub1 class91_sub20_sub13_sub1;
		try {
			final int i_6_ = class63.method409(string, 1909066868);
			final int i_7_ = class63.method415(i_6_, string_5_, (byte) 85);
			Class91_Sub20_Sub13_Sub1 class91_sub20_sub13_sub1_8_;
			if (!IdkType.method731(class63, i_6_, i_7_, 1643327271)) {
				class91_sub20_sub13_sub1_8_ = null;
			} else {
				final Class91_Sub20_Sub13_Sub1 class91_sub20_sub13_sub1_9_ = new Class91_Sub20_Sub13_Sub1();
				class91_sub20_sub13_sub1_9_.anInt2521 = Class37.anInt451 * 201426335;
				class91_sub20_sub13_sub1_9_.anInt2522 = 1455742675 * Class37.anInt447;
				class91_sub20_sub13_sub1_9_.anInt2518 = Class37.anIntArray445[0];
				class91_sub20_sub13_sub1_9_.anInt2516 = Class89.anIntArray1183[0];
				class91_sub20_sub13_sub1_9_.anInt2517 = Class57.anIntArray698[0];
				class91_sub20_sub13_sub1_9_.anInt2519 = Class37.anIntArray449[0];
				class91_sub20_sub13_sub1_9_.anIntArray2515 = FloUnderlayType.anIntArray2418;
				class91_sub20_sub13_sub1_9_.aByteArray2520 = Class74.aByteArrayArray844[0];
				Class18.method186(224207419);
				class91_sub20_sub13_sub1_8_ = class91_sub20_sub13_sub1_9_;
			}
			class91_sub20_sub13_sub1 = class91_sub20_sub13_sub1_8_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bx.f()");
		}
		return class91_sub20_sub13_sub1;
	}

	public final Class29 method232(final Runnable runnable, final int i, final int i_10_) {
		Class29 class29;
		try {
			class29 = method236(2, i, 0, runnable, -1142728720);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bx.p()");
		}
		return class29;
	}

	public final Class29 method233(final URL url, final int i) {
		Class29 class29;
		try {
			class29 = method236(4, 0, 0, url, -1142728720);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bx.r()");
		}
		return class29;
	}

	public final Interface1 method234(final int i) {
		Interface1 interface1;
		try {
			interface1 = this.anInterface1_303;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bx.l()");
		}
		return interface1;
	}

	public final Class29 method235(final int i, final short i_11_) {
		Class29 class29;
		try {
			class29 = method236(3, i, 0, null, -1142728720);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bx.k()");
		}
		return class29;
	}

	@Override
	public final void run() {
		try {
			for (;;) {
				Class29 class29;
				synchronized (this) {
					for (;;) {
						if (this.aBoolean307) {
							return;
						}
						if (this.aClass29_302 != null) {
							class29 = this.aClass29_302;
							this.aClass29_302 = this.aClass29_302.aClass29_344;
							if (this.aClass29_302 == null) {
								this.aClass29_304 = null;
							}
							break;
						}
						try {
							this.wait();
						} catch (final InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				try {
					final int i = -687636611 * class29.anInt349;
					if (i == 1) {
						class29.anObject350 = new Socket(InetAddress.getByName((String) class29.anObject351), class29.anInt352);
					} else if (2 == i) {
						final Thread thread = new Thread((Runnable) class29.anObject351);
						thread.setDaemon(true);
						thread.start();
						thread.setPriority(class29.anInt352);
						class29.anObject350 = thread;
					} else if (4 == i) {
						class29.anObject350 = new DataInputStream(((URL) class29.anObject351).openStream());
					} else if (i == 3) {
						final String string = new StringBuilder(String.valueOf(class29.anInt352 >> 24 & 0xff)).append(".").append(class29.anInt352 >> 16 & 0xff).append(".").append(class29.anInt352 >> 8 & 0xff).append(".").append(class29.anInt352 & 0xff).toString();
						class29.anObject350 = InetAddress.getByName(string).getHostName();
					}
					class29.anInt348 = 1;
				} catch (final ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (final Throwable throwable) {
					class29.anInt348 = 2;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bx.run()");
		}
	}

	final Class29 method236(final int i, final int i_12_, final int i_13_, final Object object, final int i_14_) {
		try {
			final Class29 class29 = new Class29();
			class29.anInt349 = i * -932171307;
			class29.anInt352 = i_12_;
			class29.anObject351 = object;
			synchronized (this) {
				if (this.aClass29_304 != null) {
					this.aClass29_304.aClass29_344 = class29;
					this.aClass29_304 = class29;
				} else {
					this.aClass29_304 = this.aClass29_302 = class29;
				}
				notify();
				final Class29 class29_15_ = class29;
				return class29_15_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bx.t()");
		}
	}

	public final Class29 method237(final String string, final int i, final int i_16_) {
		Class29 class29;
		try {
			class29 = method236(1, i, 0, string, -1142728720);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bx.d()");
		}
		return class29;
	}

	public static void method238(final int i) {
		try {
			Class91_Sub20_Sub5.aClass96_2266.method1070();
			Class91_Sub20_Sub5.aClass96_2284.method1070();
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "bx.z()");
		}
	}

	final void method239(final int i) {
		try {
			synchronized (this) {
				this.aBoolean307 = true;
				notifyAll();
			}
			try {
				this.aThread306.join();
			} catch (final InterruptedException interruptedexception) {
				/* empty */
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "bx.e()");
		}
	}

	Class25() {
		try {
			this.aClass29_302 = null;
			this.aClass29_304 = null;
			this.aBoolean307 = false;
			aString311 = "Unknown";
			aString314 = "1.1";
			try {
				aString311 = System.getProperty("java.vendor");
				aString314 = System.getProperty("java.version");
			} catch (final Exception exception) {
				/* empty */
			}
			try {
				anEventQueue309 = Toolkit.getDefaultToolkit().getSystemEventQueue();
			} catch (final Throwable throwable) {
				/* empty */
			}
			this.aBoolean307 = false;
			this.aThread306 = new Thread(this);
			this.aThread306.setPriority(10);
			this.aThread306.setDaemon(true);
			this.aThread306.start();
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "bx.<init>()");
		}
	}

	public static int method240(final CharSequence charsequence, final int i, final int i_17_, final byte[] is, final int i_18_, final int i_19_) {
		int i_20_;
		try {
			final int i_21_ = i_17_ - i;
			for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
				final char c = charsequence.charAt(i_22_ + i);
				if (c <= 0 || c >= '\u0080') {
					if (c >= '\u00a0' && c <= '\u00ff') {
						if (i_19_ <= -2111458540) {
							throw new IllegalStateException();
						}
					} else {
						if ('\u20ac' == c) {
							is[i_22_ + i_18_] = (byte) -128;
						} else if ('\u201a' == c) {
							is[i_18_ + i_22_] = (byte) -126;
						} else if (c == '\u0192') {
							is[i_22_ + i_18_] = (byte) -125;
						} else if (c == '\u201e') {
							is[i_18_ + i_22_] = (byte) -124;
						} else if (c == '\u2026') {
							is[i_22_ + i_18_] = (byte) -123;
						} else if ('\u2020' == c) {
							is[i_18_ + i_22_] = (byte) -122;
						} else if (c == '\u2021') {
							is[i_22_ + i_18_] = (byte) -121;
						} else if ('\u02c6' == c) {
							is[i_22_ + i_18_] = (byte) -120;
						} else if (c == '\u2030') {
							is[i_18_ + i_22_] = (byte) -119;
						} else if ('\u0160' == c) {
							is[i_22_ + i_18_] = (byte) -118;
						} else if ('\u2039' == c) {
							is[i_22_ + i_18_] = (byte) -117;
						} else if (c == '\u0152') {
							is[i_18_ + i_22_] = (byte) -116;
						} else if ('\u017d' == c) {
							is[i_18_ + i_22_] = (byte) -114;
						} else if (c == '\u2018') {
							is[i_18_ + i_22_] = (byte) -111;
						} else if (c == '\u2019') {
							is[i_18_ + i_22_] = (byte) -110;
						} else if ('\u201c' == c) {
							is[i_18_ + i_22_] = (byte) -109;
						} else if (c == '\u201d') {
							is[i_18_ + i_22_] = (byte) -108;
						} else if (c == '\u2022') {
							is[i_22_ + i_18_] = (byte) -107;
						} else if ('\u2013' == c) {
							is[i_22_ + i_18_] = (byte) -106;
						} else if (c == '\u2014') {
							is[i_18_ + i_22_] = (byte) -105;
						} else if ('\u02dc' == c) {
							is[i_22_ + i_18_] = (byte) -104;
						} else if ('\u2122' == c) {
							is[i_22_ + i_18_] = (byte) -103;
						} else if (c == '\u0161') {
							is[i_22_ + i_18_] = (byte) -102;
						} else if ('\u203a' == c) {
							is[i_18_ + i_22_] = (byte) -101;
						} else if (c == '\u0153') {
							is[i_18_ + i_22_] = (byte) -100;
						} else if ('\u017e' == c) {
							is[i_18_ + i_22_] = (byte) -98;
						} else if (c == '\u0178') {
							is[i_22_ + i_18_] = (byte) -97;
						} else {
							is[i_22_ + i_18_] = (byte) 63;
						}
						continue;
					}
				}
				is[i_18_ + i_22_] = (byte) c;
			}
			i_20_ = i_21_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bx.f()");
		}
		return i_20_;
	}
}
