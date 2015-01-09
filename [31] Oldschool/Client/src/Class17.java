/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.ActionEvent;

public class Class17 implements Runnable {
	Class25 aClass25_234;
	volatile boolean aBoolean235;
	volatile boolean aBoolean236;
	volatile Class6[] aClass6Array237;
	static String aString238;
	public static final int anInt239 = 71;
	protected static int anInt240;
	static int anInt241;
	static final int anInt242 = 46;
	public static final int anInt243 = 237;

	static void method181(final int i, final int i_0_, final int i_1_, final LocType class91_sub20_sub7, final int i_2_, final int i_3_) {
		try {
			final Class91_Sub24 class91_sub24 = new Class91_Sub24();
			class91_sub24.anInt2126 = i * -2081038533;
			class91_sub24.anInt2127 = i_0_ * 889090944;
			class91_sub24.anInt2128 = -1237703040 * i_1_;
			int i_4_ = -2039520181 * class91_sub20_sub7.anInt2312;
			int i_5_ = class91_sub20_sub7.anInt2313 * -1173592851;
			if (i_2_ == 1) {
				/* empty */
			}
			i_4_ = class91_sub20_sub7.anInt2313 * -1173592851;
			i_5_ = class91_sub20_sub7.anInt2312 * -2039520181;
			class91_sub24.anInt2129 = -753587072 * (i_4_ + i_0_);
			class91_sub24.anInt2142 = 1222041472 * (i_5_ + i_1_);
			class91_sub24.anInt2132 = class91_sub20_sub7.anInt2316 * 1963771209;
			class91_sub24.anInt2131 = -2131153280 * class91_sub20_sub7.anInt2318;
			class91_sub24.anInt2143 = class91_sub20_sub7.anInt2344 * -428370871;
			class91_sub24.anInt2135 = class91_sub20_sub7.anInt2348 * -2064810117;
			class91_sub24.anIntArray2130 = class91_sub20_sub7.anIntArray2345;
			if (class91_sub20_sub7.anIntArray2305 != null) {
				class91_sub24.aClass91_Sub20_Sub7_2147 = class91_sub20_sub7;
				class91_sub24.method1050((byte) -108);
			}
			Class91_Sub24.aClass95_2137.method1058(class91_sub24);
			if (class91_sub24.anIntArray2130 != null) {
				class91_sub24.anInt2144 = (968412839 * class91_sub24.anInt2143 + (int) (Math.random() * (-792944459 * class91_sub24.anInt2135 - class91_sub24.anInt2143 * 968412839))) * -1454473095;
			}
		} catch (final RuntimeException var9) {
			throw Class102.method1086(var9, "bn.w()");
		}
	}

	@Override
	public void run() {
		try {
			this.aBoolean235 = true;
			try {
				try {
					while (!this.aBoolean236) {
						for (int i = 0; i < 2; i++) {
							final Class6 class6 = this.aClass6Array237[i];
							if (class6 != null) {
								class6.method109(871010723);
							}
						}
						Class91_Sub20_Sub5.method761(10L);
						final Class25 class25 = this.aClass25_234;
						final RuntimeException var10 = null;
						if (class25.anEventQueue309 != null) {
							for (int i = 0; i < 50 && class25.anEventQueue309.peekEvent() != null; i++) {
								Class91_Sub20_Sub5.method761(1L);
							}
							if (var10 != null) {
								class25.anEventQueue309.postEvent(new ActionEvent(var10, 1001, "dummy"));
							}
						}
					}
				} catch (final Exception exception) {
					Class91_Sub21.method1036(null, exception, (byte) 46);
					this.aBoolean235 = false;
					this.aBoolean235 = false;
					return;
				}
				this.aBoolean235 = false;
			} catch (final RuntimeException object) {
				this.aBoolean235 = false;
				throw object;
			}
			this.aBoolean235 = false;
		} catch (final RuntimeException var10) {
			throw Class102.method1086(var10, "bn.run()");
		}
	}

	Class17() {
		try {
			this.aClass6Array237 = new Class6[2];
			this.aBoolean236 = false;
			this.aBoolean235 = false;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "bn.<init>()");
		}
	}

	static int method182(final Class91_Sub18 class91_sub18, final int i) {
		int i_6_;
		try {
			final Class91_Sub17 class91_sub17 = (Class91_Sub17) client.aClass83_1642.method474(((long) (-1026201747 * class91_sub18.anInt2032) << 32) + -819014149 * class91_sub18.anInt2012);
			if (class91_sub17 != null) {
				return class91_sub17.anInt1959;
			}
			i_6_ = -1186862795 * class91_sub18.anInt2037;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bn.de()");
		}
		return i_6_;
	}

	static Class91_Sub11 method183(final Js5 class63, final int i, final int i_7_) {
		Class91_Sub11 class91_sub11;
		try {
			final byte[] is = class63.method402(i, -19293751);
			if (is == null) {
				return null;
			}
			class91_sub11 = new Class91_Sub11(is);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bn.i()");
		}
		return class91_sub11;
	}

	static final void method184(final int i) {
		try {
			Class91_Sub5 class91_sub5 = (Class91_Sub5) client.aClass95_1577.method1062();
			for (/**/; class91_sub5 != null; class91_sub5 = (Class91_Sub5) client.aClass95_1577.method1063()) {
				if (class91_sub5.anInt1804 * 1461627319 > 0) {
					class91_sub5.anInt1804 -= -1030650873;
				}
				if (1461627319 * class91_sub5.anInt1804 == 0) {
					if (class91_sub5.anInt1797 * -1654527605 >= 0) {
						final int i_8_ = class91_sub5.anInt1797 * -1654527605;
						int i_9_ = 197924379 * class91_sub5.anInt1799;
						final LocType class91_sub20_sub7 = Class60.method392(i_8_, 1385203988);
						if (11 == i_9_) {
							i_9_ = 10;
						}
						if (i_9_ >= 5 && i_9_ <= 8) {
							i_9_ = 4;
						}
						final boolean bool = class91_sub20_sub7.method770(i_9_, (byte) 6);
						if (!bool) {
							if (i >= 406349745) {
								throw new IllegalStateException();
							}
							continue;
						}
					}
					Class15.method179(-1012182999 * class91_sub5.anInt1807, -1081232747 * class91_sub5.anInt1794, class91_sub5.anInt1795 * -1323813057, class91_sub5.anInt1796 * -1641318309, class91_sub5.anInt1797 * -1654527605, -1480661473 * class91_sub5.anInt1801, class91_sub5.anInt1799 * 197924379, -813557226);
					class91_sub5.method495();
				} else {
					if (1378793377 * class91_sub5.anInt1803 > 0) {
						class91_sub5.anInt1803 -= -1669010335;
					}
					if (class91_sub5.anInt1803 * 1378793377 == 0 && -1323813057 * class91_sub5.anInt1795 >= 1 && -1641318309 * class91_sub5.anInt1796 >= 1 && class91_sub5.anInt1795 * -1323813057 <= 102 && -1641318309 * class91_sub5.anInt1796 <= 102) {
						if (-112715479 * class91_sub5.anInt1800 >= 0) {
							final int i_10_ = -112715479 * class91_sub5.anInt1800;
							int i_11_ = class91_sub5.anInt1802 * 1672159599;
							final LocType class91_sub20_sub7 = Class60.method392(i_10_, -1537939346);
							if (i_11_ == 11) {
								i_11_ = 10;
							}
							if (i_11_ >= 5 && i_11_ <= 8) {
								i_11_ = 4;
							}
							final boolean bool = class91_sub20_sub7.method770(i_11_, (byte) 6);
							if (!bool) {
								if (i >= 406349745) {
									throw new IllegalStateException();
								}
								continue;
							}
						}
						Class15.method179(class91_sub5.anInt1807 * -1012182999, -1081232747 * class91_sub5.anInt1794, class91_sub5.anInt1795 * -1323813057, class91_sub5.anInt1796 * -1641318309, -112715479 * class91_sub5.anInt1800, 299486043 * class91_sub5.anInt1793, 1672159599 * class91_sub5.anInt1802, 703160669);
						class91_sub5.anInt1803 = 1669010335;
						if (-112715479 * class91_sub5.anInt1800 == class91_sub5.anInt1797 * -1654527605 && -1654527605 * class91_sub5.anInt1797 == -1) {
							class91_sub5.method495();
						} else if (class91_sub5.anInt1800 * -112715479 == -1654527605 * class91_sub5.anInt1797 && -1480661473 * class91_sub5.anInt1801 == class91_sub5.anInt1793 * 299486043 && 1672159599 * class91_sub5.anInt1802 == 197924379 * class91_sub5.anInt1799) {
							class91_sub5.method495();
						}
					}
				}
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "bn.bg()");
		}
	}
}
