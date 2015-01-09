/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class78 implements Runnable {
	static Object anObject1108 = new Object();
	public static Class95 aClass95_1109 = new Class95();
	static int anInt1110 = 0;
	public static Class95 aClass95_1111 = new Class95();

	public static void method467(final byte i) {
		try {
			IdkType.aClass96_2218.method1070();
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "fc.r()");
		}
	}

	@Override
	public void run() {
		try {
			try {
				for (;;) {
					Class95 class95 = aClass95_1111;
					Class91_Sub12 class91_sub12;
					synchronized (class95) {
						class91_sub12 = (Class91_Sub12) aClass95_1111.method1062();
					}
					if (class91_sub12 != null) {
						do {
							if (class91_sub12.anInt1891 * 1838660013 == 0) {
								class91_sub12.aClass14_1887.method173((int) class91_sub12.aLong1192, class91_sub12.aByteArray1890, class91_sub12.aByteArray1890.length, (byte) -57);
								class95 = aClass95_1111;
								synchronized (class95) {
									class91_sub12.method495();
									break;
								}
							}
							if (1838660013 * class91_sub12.anInt1891 == 1) {
								class91_sub12.aByteArray1890 = class91_sub12.aClass14_1887.method172((int) class91_sub12.aLong1192, 667008646);
								class95 = aClass95_1111;
								synchronized (class95) {
									aClass95_1109.method1058(class91_sub12);
								}
							}
						} while (false);
						final Object object = anObject1108;
						synchronized (object) {
							if (-1535148391 * anInt1110 <= 1) {
								anInt1110 = 0;
								anObject1108.notifyAll();
							} else {
								anInt1110 = -831011816;
								continue;
							}
							break;
						}
					}
					Class91_Sub20_Sub5.method761(100L);
					final Object object = anObject1108;
					synchronized (object) {
						if (anInt1110 * -1535148391 <= 1) {
							anInt1110 = 0;
							anObject1108.notifyAll();
							break;
						}
						anInt1110 -= 1580594601;
					}
				}
			} catch (final Exception exception) {
				Class91_Sub21.method1036(null, exception, (byte) -23);
			}
		} catch (final RuntimeException var14) {
			throw Class102.method1086(var14, "fc.run()");
		}
	}

	Class78() {
		/* empty */
	}
}
