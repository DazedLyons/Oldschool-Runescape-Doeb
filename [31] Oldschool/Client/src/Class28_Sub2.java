/* Class28_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class28_Sub2 extends Class28 {
	Component aComponent1732;

	@Override
	public final void method260(final Graphics graphics, final int i, final int i_0_) {
		graphics.drawImage(this.anImage341, i, i_0_, this.aComponent1732);
	}

	@Override
	final void method253(final int i, final int i_1_, final Component component, final byte i_2_) {
		try {
			this.anInt338 = i * 1475699383;
			this.anInt342 = i_1_ * 1181581557;
			anIntArray339 = new int[1 + i * i_1_];
			final DataBufferInt databufferint = new DataBufferInt(anIntArray339, anIntArray339.length);
			final DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
			final WritableRaster writableraster = Raster.createWritableRaster(directcolormodel.createCompatibleSampleModel(this.anInt338 * -1155065081, this.anInt342 * 166931293), databufferint, null);
			this.anImage341 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
			this.aComponent1732 = component;
			method267((byte) 2);
		} catch (final RuntimeException var8) {
			throw Class102.method1086(var8, "cj.i()");
		}
	}

	Class28_Sub2() {
		/* empty */
	}

	@Override
	public final void method255(final Graphics graphics, final int i, final int i_3_, final int i_4_, final int i_5_, final byte i_6_) {
		try {
			final Shape shape = graphics.getClip();
			graphics.clipRect(i, i_3_, i_4_, i_5_);
			graphics.drawImage(this.anImage341, 0, 0, this.aComponent1732);
			graphics.setClip(shape);
		} catch (final RuntimeException var8) {
			throw Class102.method1086(var8, "cj.f()");
		}
	}

	@Override
	public final void method262(final Graphics graphics, final int i, final int i_7_) {
		graphics.drawImage(this.anImage341, i, i_7_, this.aComponent1732);
	}

	@Override
	final void method257(final int i, final int i_8_, final Component component) {
		this.anInt338 = i * 828717929;
		this.anInt342 = i_8_ * 1181581557;
		anIntArray339 = new int[1 + i * i_8_];
		final DataBufferInt databufferint = new DataBufferInt(anIntArray339, anIntArray339.length);
		final DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, -429464770, 255);
		final WritableRaster writableraster = Raster.createWritableRaster(directcolormodel.createCompatibleSampleModel(this.anInt338 * -1155065081, this.anInt342 * -2065236197), databufferint, null);
		this.anImage341 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
		this.aComponent1732 = component;
		method267((byte) 2);
	}

	@Override
	public final void method259(final Graphics graphics, final int i, final int i_9_, final int i_10_, final int i_11_) {
		final Shape shape = graphics.getClip();
		graphics.clipRect(i, i_9_, i_10_, i_11_);
		graphics.drawImage(this.anImage341, 0, 0, this.aComponent1732);
		graphics.setClip(shape);
	}

	@Override
	public final void method254(final Graphics graphics, final int i, final int i_12_, final int i_13_) {
		try {
			graphics.drawImage(this.anImage341, i, i_12_, this.aComponent1732);
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "cj.w()");
		}
	}

	@Override
	final void method256(final int i, final int i_14_, final Component component) {
		this.anInt338 = i * 1475699383;
		this.anInt342 = i_14_ * -1687762499;
		anIntArray339 = new int[1 + i * i_14_];
		final DataBufferInt databufferint = new DataBufferInt(anIntArray339, anIntArray339.length);
		final DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		final WritableRaster writableraster = Raster.createWritableRaster(directcolormodel.createCompatibleSampleModel(this.anInt338 * 566683400, this.anInt342 * 166931293), databufferint, null);
		this.anImage341 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
		this.aComponent1732 = component;
		method267((byte) 2);
	}

	@Override
	public final void method266(final Graphics graphics, final int i, final int i_15_, final int i_16_, final int i_17_) {
		final Shape shape = graphics.getClip();
		graphics.clipRect(i, i_15_, i_16_, i_17_);
		graphics.drawImage(this.anImage341, 0, 0, this.aComponent1732);
		graphics.setClip(shape);
	}

	@Override
	final void method258(final int i, final int i_18_, final Component component) {
		this.anInt338 = i * 1475699383;
		this.anInt342 = i_18_ * 1181581557;
		anIntArray339 = new int[1 + i * i_18_];
		final DataBufferInt databufferint = new DataBufferInt(anIntArray339, anIntArray339.length);
		final DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		final WritableRaster writableraster = Raster.createWritableRaster(directcolormodel.createCompatibleSampleModel(this.anInt338 * -1155065081, this.anInt342 * 166931293), databufferint, null);
		this.anImage341 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
		this.aComponent1732 = component;
		method267((byte) 2);
	}

	@Override
	public final void method261(final Graphics graphics, final int i, final int i_19_, final int i_20_, final int i_21_) {
		final Shape shape = graphics.getClip();
		graphics.clipRect(i, i_19_, i_20_, i_21_);
		graphics.drawImage(this.anImage341, 0, 0, this.aComponent1732);
		graphics.setClip(shape);
	}
}
