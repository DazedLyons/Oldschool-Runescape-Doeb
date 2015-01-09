/* Class24_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class24_Sub1 extends Class24 implements MouseWheelListener {
	int anInt1714;

	@Override
	public synchronized int method217(final byte i) {
		int i_0_;
		try {
			final int i_1_ = 1880483335 * this.anInt1714;
			this.anInt1714 = 0;
			i_0_ = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bt.f()");
		}
		return i_0_;
	}

	@Override
	public synchronized int method224() {
		final int i = 1880483335 * this.anInt1714;
		this.anInt1714 = 0;
		return i;
	}

	@Override
	public void method218(final Component component, final int i) {
		try {
			component.removeMouseWheelListener(this);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "bt.w()");
		}
	}

	@Override
	public synchronized int method223() {
		final int i = -957899158 * this.anInt1714;
		this.anInt1714 = 0;
		return i;
	}

	@Override
	public void method225(final Component component) {
		component.removeMouseWheelListener(this);
	}

	@Override
	public void method214(final Component component) {
		component.addMouseWheelListener(this);
	}

	@Override
	public void method219(final Component component) {
		component.addMouseWheelListener(this);
	}

	@Override
	public void method220(final Component component) {
		component.addMouseWheelListener(this);
	}

	public Class24_Sub1() {
		try {
			this.anInt1714 = 0;
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "bt.<init>()");
		}
	}

	@Override
	public void method221(final Component component) {
		component.addMouseWheelListener(this);
	}

	@Override
	public synchronized int method222() {
		final int i = 1880483335 * this.anInt1714;
		this.anInt1714 = 0;
		return i;
	}

	@Override
	public void method216(final Component component) {
		component.addMouseWheelListener(this);
	}

	@Override
	public void method215(final Component component, final byte i) {
		try {
			component.addMouseWheelListener(this);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "bt.i()");
		}
	}

	@Override
	public synchronized void mouseWheelMoved(final MouseWheelEvent mousewheelevent) {
		try {
			this.anInt1714 += mousewheelevent.getWheelRotation() * 1810278327;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "bt.mouseWheelMoved()");
		}
	}

	@Override
	public void method229(final Component component) {
		component.removeMouseWheelListener(this);
	}
}
