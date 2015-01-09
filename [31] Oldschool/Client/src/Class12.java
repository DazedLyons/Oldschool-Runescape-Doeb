/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Class12 implements MouseListener, MouseMotionListener, FocusListener {
	public static int anInt167 = 0;
	public static volatile int anInt168 = 0;
	public static volatile int anInt169 = 0;
	public static volatile int anInt170 = 950546139;
	public static int anInt171 = 0;
	public static int anInt172 = 0;
	public static int anInt173 = 0;
	public static volatile long aLong174 = 0L;
	static Class19 aClass19_175;
	public static volatile int anInt176 = 0;
	public static volatile int anInt177 = 0;
	public static int anInt178 = 0;
	public static volatile int anInt179 = -427770583;
	public static int anInt180 = 0;
	public static volatile int anInt181 = 0;
	public static long aLong182 = 0L;
	public static Class12 aClass12_183 = new Class12();
	public static final int anInt184 = 255;
	static int anInt185;

	@Override
	public final synchronized void mouseExited(final MouseEvent mouseevent) {
		try {
			if (aClass12_183 != null) {
				anInt168 = 0;
				anInt170 = 950546139;
				anInt179 = -427770583;
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "bi.mouseExited()");
		}
	}

	@Override
	public final synchronized void focusLost(final FocusEvent focusevent) {
		try {
			if (aClass12_183 != null) {
				anInt169 = 0;
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "bi.focusLost()");
		}
	}

	@Override
	public final void mouseClicked(final MouseEvent mouseevent) {
		try {
			if (mouseevent.isPopupTrigger()) {
				mouseevent.consume();
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "bi.mouseClicked()");
		}
	}

	@Override
	public final synchronized void mouseEntered(final MouseEvent mouseevent) {
		try {
			if (aClass12_183 != null) {
				anInt168 = 0;
				anInt170 = mouseevent.getX() * -950546139;
				anInt179 = mouseevent.getY() * 427770583;
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "bi.mouseEntered()");
		}
	}

	@Override
	public final synchronized void mouseDragged(final MouseEvent mouseevent) {
		try {
			if (aClass12_183 != null) {
				anInt168 = 0;
				anInt170 = mouseevent.getX() * -950546139;
				anInt179 = mouseevent.getY() * 427770583;
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "bi.mouseDragged()");
		}
	}

	@Override
	public final synchronized void mouseMoved(final MouseEvent mouseevent) {
		try {
			if (aClass12_183 != null) {
				anInt168 = 0;
				anInt170 = mouseevent.getX() * -950546139;
				anInt179 = mouseevent.getY() * 427770583;
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "bi.mouseMoved()");
		}
	}

	@Override
	public final void focusGained(final FocusEvent focusevent) {
		/* empty */
	}

	@Override
	public final synchronized void mousePressed(final MouseEvent mouseevent) {
		try {
			if (aClass12_183 != null) {
				anInt168 = 0;
				anInt176 = mouseevent.getX() * -673510647;
				anInt177 = mouseevent.getY() * -364224987;
				aLong174 = Class108.method1111(1342874726) * -5612171782210627863L;
				if (mouseevent.isMetaDown()) {
					anInt181 = -1212607338;
					anInt169 = -1803939642;
				} else {
					anInt181 = 1541179979;
					anInt169 = 1245513827;
				}
			}
			if (mouseevent.isPopupTrigger()) {
				mouseevent.consume();
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "bi.mousePressed()");
		}
	}

	@Override
	public final synchronized void mouseReleased(final MouseEvent mouseevent) {
		try {
			if (aClass12_183 != null) {
				anInt168 = 0;
				anInt169 = 0;
			}
			if (mouseevent.isPopupTrigger()) {
				mouseevent.consume();
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "bi.mouseReleased()");
		}
	}

	Class12() {
		/* empty */
	}
}
