/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {
	protected static int anInt2 = 0;
	static int anInt3 = 0;
	static Applet_Sub1 anApplet_Sub1_4 = null;
	static boolean aBoolean5 = false;
	static int anInt6 = 1285105484;
	protected static volatile boolean aBoolean7 = false;
	static int anInt8 = 1217454319;
	public static final int anInt9 = 8;
	static long aLong10 = 0L;
	protected static long[] aLongArray11 = new long[32];
	protected static volatile boolean aBoolean12 = true;
	static int anInt13 = -1869316948;
	protected static long[] aLongArray14 = new long[32];
	static volatile long aLong15 = 0L;
	static volatile boolean aBoolean16 = true;
	boolean aBoolean17;

	protected final void method39(final int i, final int i_0_, final int i_1_, final int i_2_) {
		do {
			try {
				try {
					if (anApplet_Sub1_4 != null) {
						anInt3 += 1349948527;
						if (anInt3 * 1649756815 >= 3) {
							if (i_2_ > -648689184) {
								method48("alreadyloaded", -858097630);
							}
						} else {
							getAppletContext().showDocument(getDocumentBase(), "_self");
						}
					} else {
						anApplet_Sub1_4 = this;
						Class17.anInt240 = i * 1998758723;
						Class27.anInt333 = 1591779459 * i_0_;
						Class54.anInt643 = -362021777 * i_1_;
						RuntimeException_Sub1.anApplet1410 = this;
						if (Class91_Sub22.aClass25_2110 == null) {
							Class91_Sub22.aClass25_2110 = new Class25();
						}
						Class91_Sub22.aClass25_2110.method232(this, 1, 368001806);
					}
				} catch (final Exception exception) {
					Class91_Sub21.method1036(null, exception, (byte) 7);
					method48("crash", -1507929928);
					break;
				}
				break;
			} catch (final RuntimeException var7) {
				throw Class102.method1086(var7, "bs.nv()");
			}
		} while (false);
	}

	protected abstract void method40();

	@Override
	public void run() {
		try {
			try {
				if (Class25.aString311 != null) {
					final String string = Class25.aString311.toLowerCase();
					if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
						final String string_3_ = Class25.aString314;
						if (string_3_.equals("1.1") || string_3_.startsWith("1.1.") || string_3_.equals("1.2") || string_3_.startsWith("1.2.") || string_3_.equals("1.3") || string_3_.startsWith("1.3.") || string_3_.equals("1.4") || string_3_.startsWith("1.4.") || string_3_.equals("1.5") || string_3_.startsWith("1.5.") || string_3_.equals("1.6.0")) {
							method48("wrongjava", 915367975);
							return;
						}
						if (string_3_.startsWith("1.6.0_")) {
							int i;
							for (i = 6; i < string_3_.length(); i++) {
								final char c = string_3_.charAt(i);
								final boolean bool = c >= '0' && c <= '9';
								if (!bool) {
									break;
								}
							}
							final String string_4_ = string_3_.substring(6, i);
							if (Class102.method1088(string_4_, 1424411442)) {
								final int i_5_ = Class40.method340(string_4_, 10, true, -2005995539);
								if (i_5_ < 10) {
									method48("wrongjava", -1942299442);
									return;
								}
							}
						}
						anInt8 = 1792304299;
					}
				}
				setFocusCycleRoot(true);
				method55(-1017057333);
				Class97.aClass28_1218 = Class36.method287(Class17.anInt240 * 472613227, -1872450005 * Class27.anInt333, Class102.aCanvas1309, -1750848144);
				method45(-2145712040);
				Class100.aClass26_1246 = Class4.method98((byte) 0);
				while (0L == 7192393668036864877L * aLong10 || Class108.method1111(973949797) < aLong10 * 7192393668036864877L) {
					Class73.anInt842 = Class100.aClass26_1246.method243(anInt6 * -1603678265, anInt8 * 1084640783, (byte) 8) * -716362063;
					for (int i = 0; i < Class73.anInt842 * 826956369; i++) {
						method61(-361472751);
					}
					method41(-1361775453);
					final Class25 class25 = Class91_Sub22.aClass25_2110;
					final java.awt.Canvas canvas = Class102.aCanvas1309;
					if (class25.anEventQueue309 != null) {
						for (int i = 0; i < 50 && class25.anEventQueue309.peekEvent() != null; i++) {
							Class91_Sub20_Sub5.method761(1L);
						}
						if (canvas != null) {
							class25.anEventQueue309.postEvent(new ActionEvent(canvas, 1001, "dummy"));
						}
					}
				}
			} catch (final Exception exception) {
				Class91_Sub21.method1036(null, exception, (byte) 9);
				method48("crash", 2108026386);
			}
			method42((short) 21477);
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "bs.run()");
		}
	}

	void method41(final int i) {
		try {
			final long l = Class108.method1111(1041635500);
			final long l_6_ = aLongArray14[Class103.anInt1327 * 1094051119];
			aLongArray14[1094051119 * Class103.anInt1327] = l;
			Class103.anInt1327 = (1 + 1094051119 * Class103.anInt1327 & 0x1f) * -733904433;
			if (l_6_ != 0L && l > l_6_) {
				final int i_7_ = (int) (l - l_6_);
				anInt2 = (32000 + (i_7_ >> 1)) / i_7_ * -2034917445;
			}
			if ((anInt13 += 2040665799) * -1924805897 - 1 > 50) {
				if (i != -1361775453) {
					return;
				}
				anInt13 -= -1045925154;
				aBoolean12 = true;
				Class102.aCanvas1309.setSize(472613227 * Class17.anInt240, -1872450005 * Class27.anInt333);
				Class102.aCanvas1309.setVisible(true);
				if (Class91_Sub24.aFrame2134 != null) {
					final Insets insets = Class91_Sub24.aFrame2134.getInsets();
					Class102.aCanvas1309.setLocation(insets.left, insets.top);
				} else {
					Class102.aCanvas1309.setLocation(0, 0);
				}
			}
			method59(-2111957991);
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "bs.ni()");
		}
	}

	final synchronized void method42(final short i) {
		try {
			if (!aBoolean5) {
				aBoolean5 = true;
				try {
					Class102.aCanvas1309.removeFocusListener(this);
				} catch (final Exception exception) {
					/* empty */
				}
				try {
					method47(689814044);
				} catch (final Exception exception) {
					/* empty */
				}
				if (Class91_Sub24.aFrame2134 != null) {
					try {
						System.exit(0);
					} catch (final Throwable throwable) {
						/* empty */
					}
				}
				if (Class91_Sub22.aClass25_2110 != null) {
					try {
						Class91_Sub22.aClass25_2110.method239(-683713923);
					} catch (final Exception exception) {
						/* empty */
					}
				}
				method49((byte) 16);
			}
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "bs.nz()");
		}
	}

	@Override
	public void start() {
		try {
			if (this == anApplet_Sub1_4 && !aBoolean5) {
				aLong10 = 0L;
			}
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "bs.start()");
		}
	}

	@Override
	public void stop() {
		try {
			if (this == anApplet_Sub1_4 && !aBoolean5) {
				aLong10 = (Class108.method1111(331959315) + 4000L) * -8071301237469964699L;
			}
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "bs.stop()");
		}
	}

	protected abstract void method43();

	@Override
	public final void update(final Graphics graphics) {
		try {
			paint(graphics);
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "bs.update()");
		}
	}

	@Override
	public final void focusGained(final FocusEvent focusevent) {
		try {
			aBoolean16 = true;
			aBoolean12 = true;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "bs.focusGained()");
		}
	}

	@Override
	public final void focusLost(final FocusEvent focusevent) {
		try {
			aBoolean16 = false;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "bs.focusLost()");
		}
	}

	@Override
	public final void windowActivated(final WindowEvent windowevent) {
		/* empty */
	}

	@Override
	public final void windowClosed(final WindowEvent windowevent) {
		/* empty */
	}

	@Override
	public final void windowClosing(final WindowEvent windowevent) {
		try {
			destroy();
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "bs.windowClosing()");
		}
	}

	@Override
	public final void windowDeiconified(final WindowEvent windowevent) {
		/* empty */
	}

	protected abstract void method44();

	@Override
	public final void windowOpened(final WindowEvent windowevent) {
		/* empty */
	}

	@Override
	public abstract void init();

	protected abstract void method45(int i);

	protected abstract void method46(int i);

	protected abstract void method47(int i);

	protected void method48(final String string, final int i) {
		do {
			try {
				if (!this.aBoolean17) {
					this.aBoolean17 = true;
					System.out.println(new StringBuilder("error_game_").append(string).toString());
					try {
						getAppletContext().showDocument(new URL(getCodeBase(), new StringBuilder("error_game_").append(string).append(".ws").toString()), "_self");
					} catch (final Exception exception) {
						break;
					}
				}
				break;
			} catch (final RuntimeException var5) {
				throw Class102.method1086(var5, "bs.nm()");
			}
		} while (false);
	}

	protected abstract void method49(byte i);

	@Override
	public final void windowDeactivated(final WindowEvent windowevent) {
		/* empty */
	}

	protected final boolean method50(final int i) {
		try {
			String string = getDocumentBase().getHost().toLowerCase();
			if (!string.equals("jagex.com") && !string.endsWith(".jagex.com")) {
				if (!string.equals("runescape.com") && !string.endsWith(".runescape.com")) {
					if (!string.equals("mechscape.com") && !string.endsWith(".mechscape.com")) {
						if (string.endsWith("127.0.0.1")) {
							return true;
						}
						for (/**/; string.length() > 0; string = string.substring(0, string.length() - 1)) {
							if (string.charAt(string.length() - 1) < '0' || string.charAt(string.length() - 1) > '9') {
								break;
							}
						}
						if (string.endsWith("192.168.1.")) {
							return true;
						}
						method48("invalidhost", 369338207);
						return false;
					}
					return true;
				}
				return true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bs.ny()");
		}
		return true;
	}

	protected abstract void method51();

	public abstract void method52();

	protected abstract void method53();

	protected abstract void method54();

	@Override
	public void destroy() {
		try {
			if (this == anApplet_Sub1_4 && !aBoolean5) {
				aLong10 = Class108.method1111(1235860824) * -8071301237469964699L;
				Class91_Sub20_Sub5.method761(5000L);
				method42((short) 13374);
			}
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "bs.destroy()");
		}
	}

	@Override
	public final void windowIconified(final WindowEvent windowevent) {
		/* empty */
	}

	protected final synchronized void method55(final int i) {
		try {
			Container container;
			if (Class91_Sub24.aFrame2134 != null) {
				container = Class91_Sub24.aFrame2134;
			} else {
				container = this;
			}
			if (Class102.aCanvas1309 != null) {
				Class102.aCanvas1309.removeFocusListener(this);
				container.remove(Class102.aCanvas1309);
			}
			Class102.aCanvas1309 = new Canvas_Sub1(this);
			container.add(Class102.aCanvas1309);
			Class102.aCanvas1309.setSize(472613227 * Class17.anInt240, Class27.anInt333 * -1872450005);
			Class102.aCanvas1309.setVisible(true);
			if (Class91_Sub24.aFrame2134 != null) {
				if (i == 40820196) {
					return;
				}
				final Insets insets = Class91_Sub24.aFrame2134.getInsets();
				Class102.aCanvas1309.setLocation(insets.left, insets.top);
			} else {
				Class102.aCanvas1309.setLocation(0, 0);
			}
			Class102.aCanvas1309.addFocusListener(this);
			Class102.aCanvas1309.requestFocus();
			aBoolean12 = true;
			aBoolean7 = false;
			aLong15 = Class108.method1111(1044786674) * -2791715503329617265L;
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "bs.no()");
		}
	}

	protected abstract void method56();

	@Override
	public final synchronized void paint(final Graphics graphics) {
		try {
			if (this == anApplet_Sub1_4 && !aBoolean5) {
				aBoolean12 = true;
				if (Class25.aString314 != null && Class25.aString314.startsWith("1.5") && Class108.method1111(371585575) - 8381293357750781039L * aLong15 > 1000L) {
					final Rectangle rectangle = graphics.getClipBounds();
					if (rectangle == null || rectangle.width >= Class17.anInt240 * 472613227 && rectangle.height >= -1872450005 * Class27.anInt333) {
						aBoolean7 = true;
					}
				}
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "bs.paint()");
		}
	}

	protected abstract void method57();

	protected abstract void method58();

	protected abstract void method59(int i);

	protected Applet_Sub1() {
		try {
			this.aBoolean17 = false;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "bs.<init>()");
		}
	}

	protected abstract void method60();

	void method61(final int i) {
		try {
			final long l = Class108.method1111(206235179);
			final long l_8_ = aLongArray11[-809296997 * Class91_Sub20_Sub6.anInt2287];
			aLongArray11[-809296997 * Class91_Sub20_Sub6.anInt2287] = l;
			Class91_Sub20_Sub6.anInt2287 = -988360045 * (1 + Class91_Sub20_Sub6.anInt2287 * -809296997 & 0x1f);
			do {
				if (l_8_ != 0L) {
					if (i != -361472751) {
						return;
					}
					if (l > l_8_) {
						break;
					}
				}
			} while (false);
			synchronized (this) {
				Class7.aBoolean110 = aBoolean16;
			}
			method46(-1111945491);
		} catch (final RuntimeException var9) {
			throw Class102.method1086(var9, "bs.nh()");
		}
	}
}
