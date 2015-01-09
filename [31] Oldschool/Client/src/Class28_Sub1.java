/* Class28_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public final class Class28_Sub1 extends Class28 implements ImageProducer, ImageObserver {
	ColorModel aColorModel1725;
	ImageConsumer anImageConsumer1726;
	static final int anInt1727 = 33;
	static int anInt1728;
	static int anInt1729;
	public static final int anInt1730 = 23;
	public static final int anInt1731 = 112;

	@Override
	final void method257(final int i, final int i_0_, final Component component) {
		this.anInt338 = 1475699383 * i;
		this.anInt342 = 1181581557 * i_0_;
		anIntArray339 = new int[1 + i * i_0_];
		this.aColorModel1725 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage341 = component.createImage(this);
		method268((byte) 16);
		component.prepareImage(this.anImage341, this);
		method268((byte) 16);
		component.prepareImage(this.anImage341, this);
		method268((byte) 16);
		component.prepareImage(this.anImage341, this);
		method267((byte) 2);
	}

	@Override
	final void method253(final int i, final int i_1_, final Component component, final byte i_2_) {
		try {
			this.anInt338 = 1475699383 * i;
			this.anInt342 = 1181581557 * i_1_;
			anIntArray339 = new int[1 + i * i_1_];
			this.aColorModel1725 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage341 = component.createImage(this);
			method268((byte) 16);
			component.prepareImage(this.anImage341, this);
			method268((byte) 16);
			component.prepareImage(this.anImage341, this);
			method268((byte) 16);
			component.prepareImage(this.anImage341, this);
			method267((byte) 2);
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "cg.i()");
		}
	}

	@Override
	public final void method255(final Graphics graphics, final int i, final int i_3_, final int i_4_, final int i_5_, final byte i_6_) {
		try {
			method270(i, i_3_, i_4_, i_5_, 1835739897);
			final Shape shape = graphics.getClip();
			graphics.clipRect(i, i_3_, i_4_, i_5_);
			graphics.drawImage(this.anImage341, 0, 0, this);
			graphics.setClip(shape);
		} catch (final RuntimeException var8) {
			throw Class102.method1086(var8, "cg.f()");
		}
	}

	@Override
	public synchronized void addConsumer(final ImageConsumer imageconsumer) {
		try {
			this.anImageConsumer1726 = imageconsumer;
			imageconsumer.setDimensions(this.anInt338 * -1155065081, this.anInt342 * 166931293);
			imageconsumer.setProperties(null);
			imageconsumer.setColorModel(this.aColorModel1725);
			imageconsumer.setHints(14);
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "cg.addConsumer()");
		}
	}

	@Override
	public synchronized boolean isConsumer(final ImageConsumer imageconsumer) {
		boolean bool;
		try {
			if (imageconsumer == this.anImageConsumer1726) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "cg.isConsumer()");
		}
		return bool;
	}

	@Override
	public void startProduction(final ImageConsumer imageconsumer) {
		try {
			addConsumer(imageconsumer);
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "cg.startProduction()");
		}
	}

	@Override
	public void requestTopDownLeftRightResend(final ImageConsumer imageconsumer) {
		/* empty */
	}

	synchronized void method268(final byte i) {
		try {
			if (this.anImageConsumer1726 == null) {
				if (i != 16) {
					throw new IllegalStateException();
				}
			} else {
				this.anImageConsumer1726.setPixels(0, 0, -1155065081 * this.anInt338, this.anInt342 * 166931293, this.aColorModel1725, anIntArray339, 0, this.anInt338 * -1155065081);
				this.anImageConsumer1726.imageComplete(2);
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "cg.e()");
		}
	}

	static final void method269(final int i, final int i_7_, final int i_8_, final int i_9_) {
		try {
			Class91_Sub20_Sub5.method759((byte) -77);
			Class91_Sub20_Sub13.method821(i, i_7_, i + Class45.aClass91_Sub20_Sub13_Sub1_1431.anInt2517, Class45.aClass91_Sub20_Sub13_Sub1_1431.anInt2519 + i_7_);
			if (2 != -19780067 * client.anInt1676 && 5 != -19780067 * client.anInt1676) {
				final int i_10_ = client.anInt1513 * -1562784247 + client.anInt1528 * -1533574683 & 0x7ff;
				final int i_11_ = 48 + 107578049 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 / 32;
				final int i_12_ = 464 - -668540675 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 / 32;
				Class97.aClass91_Sub20_Sub13_Sub3_1214.method876(i + 25, i_7_ + 5, 146, 151, i_11_, i_12_, i_10_, -907024925 * client.anInt1515 + 256, Class57.anIntArray697, Class91_Sub20_Sub6.anIntArray2291);
				for (int i_13_ = 0; i_13_ < client.anInt1670 * 1945097923; i_13_++) {
					final int i_14_ = client.anIntArray1671[i_13_] * 4 + 2 - 107578049 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 / 32;
					final int i_15_ = 2 + 4 * client.anIntArray1672[i_13_] - Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 * -668540675 / 32;
					Class91_Sub20_Sub17.method1030(i, i_7_, i_14_, i_15_, client.aClass91_Sub20_Sub13_Sub3Array1673[i_13_], (byte) -43);
				}
				for (int i_16_ = 0; i_16_ < 104; i_16_++) {
					if (i_9_ == 1873559766) {
						return;
					}
					for (int i_17_ = 0; i_17_ < 104; i_17_++) {
						final Class95 class95 = client.aClass95ArrayArrayArray1477[-1723088013 * Class100.anInt1248][i_16_][i_17_];
						if (class95 != null) {
							final int i_18_ = i_16_ * 4 + 2 - 107578049 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 / 32;
							final int i_19_ = 2 + i_17_ * 4 - Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 * -668540675 / 32;
							Class91_Sub20_Sub17.method1030(i, i_7_, i_18_, i_19_, Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub20_Sub13_Sub3Array2862[0], (byte) -2);
						}
					}
				}
				for (int i_20_ = 0; i_20_ < client.anInt1684 * 1050401801; i_20_++) {
					final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[client.anIntArray1445[i_20_]];
					if (class91_sub20_sub14_sub1_sub2 != null && class91_sub20_sub14_sub1_sub2.method923((byte) -125)) {
						NpcType class91_sub20_sub11 = class91_sub20_sub14_sub1_sub2.aClass91_Sub20_Sub11_2858;
						if (class91_sub20_sub11 != null && class91_sub20_sub11.anIntArray2453 != null) {
							class91_sub20_sub11 = class91_sub20_sub11.method814((byte) 106);
						}
						if (class91_sub20_sub11 != null && class91_sub20_sub11.aBoolean2444 && class91_sub20_sub11.aBoolean2456) {
							final int i_21_ = 107578049 * class91_sub20_sub14_sub1_sub2.anInt2589 / 32 - Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 * 107578049 / 32;
							final int i_22_ = -668540675 * class91_sub20_sub14_sub1_sub2.anInt2583 / 32 - -668540675 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 / 32;
							Class91_Sub20_Sub17.method1030(i, i_7_, i_21_, i_22_, Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub20_Sub13_Sub3Array2862[1], (byte) -121);
						}
					}
				}
				for (int i_23_ = 0; i_23_ < 735674511 * client.anInt1563; i_23_++) {
					final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[client.anIntArray1483[i_23_]];
					if (class91_sub20_sub14_sub1_sub1 != null && class91_sub20_sub14_sub1_sub1.method923((byte) -121)) {
						final int i_24_ = 107578049 * class91_sub20_sub14_sub1_sub1.anInt2589 / 32 - Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 * 107578049 / 32;
						final int i_25_ = -668540675 * class91_sub20_sub14_sub1_sub1.anInt2583 / 32 - Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 * -668540675 / 32;
						boolean bool = false;
						if (Class91_Sub22.method1042(class91_sub20_sub14_sub1_sub1.aString2841, 1493777627)) {
							bool = true;
						}
						boolean bool_26_ = false;
						for (int i_27_ = 0; i_27_ < -579770847 * Class17.anInt241; i_27_++) {
							if (class91_sub20_sub14_sub1_sub1.aString2841.equals(ObjType.aClass91_Sub23Array2395[i_27_].aString2123)) {
								bool_26_ = true;
								break;
							}
						}
						boolean bool_28_ = false;
						if (Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2855 * 1483016477 != 0 && class91_sub20_sub14_sub1_sub1.anInt2855 * 1483016477 != 0 && class91_sub20_sub14_sub1_sub1.anInt2855 * 1483016477 == Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2855 * 1483016477) {
							bool_28_ = true;
						}
						if (bool) {
							Class91_Sub20_Sub17.method1030(i, i_7_, i_24_, i_25_, Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub20_Sub13_Sub3Array2862[3], (byte) -123);
						} else if (bool_28_) {
							Class91_Sub20_Sub17.method1030(i, i_7_, i_24_, i_25_, Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub20_Sub13_Sub3Array2862[4], (byte) -27);
						} else if (bool_26_) {
							Class91_Sub20_Sub17.method1030(i, i_7_, i_24_, i_25_, Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub20_Sub13_Sub3Array2862[5], (byte) -46);
						} else {
							Class91_Sub20_Sub17.method1030(i, i_7_, i_24_, i_25_, Class91_Sub20_Sub14_Sub1_Sub2.aClass91_Sub20_Sub13_Sub3Array2862[2], (byte) -36);
						}
					}
				}
				if (-522819943 * client.anInt1457 != 0 && 2026135825 * client.anInt1449 % 20 < 10) {
					if (-522819943 * client.anInt1457 == 1 && -634829137 * client.anInt1458 >= 0 && client.anInt1458 * -634829137 < client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590.length) {
						final Class91_Sub20_Sub14_Sub1_Sub2 class91_sub20_sub14_sub1_sub2 = client.aClass91_Sub20_Sub14_Sub1_Sub2Array1590[client.anInt1458 * -634829137];
						if (class91_sub20_sub14_sub1_sub2 != null) {
							final int i_29_ = 107578049 * class91_sub20_sub14_sub1_sub2.anInt2589 / 32 - Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 * 107578049 / 32;
							final int i_30_ = class91_sub20_sub14_sub1_sub2.anInt2583 * -668540675 / 32 - -668540675 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 / 32;
							Class91_Sub20_Sub14_Sub4.method1001(i, i_7_, i_29_, i_30_, Class27.aClass91_Sub20_Sub13_Sub3Array329[1], (byte) 62);
						}
					}
					if (-522819943 * client.anInt1457 == 2) {
						final int i_31_ = 2 + client.anInt1518 * 2140721004 - Class40.anInt541 * -1046389484 - 107578049 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 / 32;
						final int i_32_ = 191962996 * client.anInt1560 - Class91_Sub20_Sub15.anInt2497 * -1235826324 + 2 - -668540675 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 / 32;
						Class91_Sub20_Sub14_Sub4.method1001(i, i_7_, i_31_, i_32_, Class27.aClass91_Sub20_Sub13_Sub3Array329[1], (byte) -49);
					}
					if (client.anInt1457 * -522819943 == 10 && 1100926913 * client.anInt1459 >= 0 && 1100926913 * client.anInt1459 < client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562.length) {
						final Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[client.anInt1459 * 1100926913];
						if (class91_sub20_sub14_sub1_sub1 != null) {
							final int i_33_ = class91_sub20_sub14_sub1_sub1.anInt2589 * 107578049 / 32 - 107578049 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 / 32;
							final int i_34_ = class91_sub20_sub14_sub1_sub1.anInt2583 * -668540675 / 32 - Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 * -668540675 / 32;
							Class91_Sub20_Sub14_Sub4.method1001(i, i_7_, i_33_, i_34_, Class27.aClass91_Sub20_Sub13_Sub3Array329[1], (byte) -43);
						}
					}
				}
				if (-1572174271 * client.anInt1674 != 0) {
					final int i_35_ = -1993729788 * client.anInt1674 + 2 - 107578049 * Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2589 / 32;
					final int i_36_ = 2 + client.anInt1675 * -1406209916 - Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anInt2583 * -668540675 / 32;
					Class91_Sub20_Sub17.method1030(i, i_7_, i_35_, i_36_, Class27.aClass91_Sub20_Sub13_Sub3Array329[0], (byte) -101);
				}
				Class91_Sub20_Sub13.method828(4 + i + 93, 82 + i_7_ - 4, 3, 3, 16777215);
			} else {
				Class91_Sub20_Sub13.method836(i + 25, i_7_ + 5, 0, Class57.anIntArray697, Class91_Sub20_Sub6.anIntArray2291);
			}
			if (-19780067 * client.anInt1676 < 3) {
				Class25.aClass91_Sub20_Sub13_Sub3_305.method876(i, i_7_, 33, 33, 25, 25, -1533574683 * client.anInt1528, 256, Class62.anIntArray758, client.anIntArray1520);
			} else {
				Class91_Sub20_Sub13.method836(i, i_7_, 0, Class62.anIntArray758, client.anIntArray1520);
			}
			if (client.aBooleanArray1647[i_8_]) {
				Class45.aClass91_Sub20_Sub13_Sub1_1431.method840(i, i_7_);
			}
			client.aBooleanArray1646[i_8_] = true;
		} catch (final RuntimeException var14) {
			throw Class102.method1086(var14, "cg.ci()");
		}
	}

	@Override
	public boolean imageUpdate(final Image image, final int i, final int i_37_, final int i_38_, final int i_39_, final int i_40_) {
		return true;
	}

	@Override
	public synchronized void removeConsumer(final ImageConsumer imageconsumer) {
		try {
			if (imageconsumer == this.anImageConsumer1726) {
				this.anImageConsumer1726 = null;
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "cg.removeConsumer()");
		}
	}

	@Override
	public final void method254(final Graphics graphics, final int i, final int i_41_, final int i_42_) {
		try {
			method268((byte) 16);
			graphics.drawImage(this.anImage341, i, i_41_, this);
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "cg.w()");
		}
	}

	@Override
	final void method258(final int i, final int i_43_, final Component component) {
		this.anInt338 = -590466667 * i;
		this.anInt342 = 246815432 * i_43_;
		anIntArray339 = new int[1 + i * i_43_];
		this.aColorModel1725 = new DirectColorModel(-655054856, 16711680, 65280, 255);
		this.anImage341 = component.createImage(this);
		method268((byte) 16);
		component.prepareImage(this.anImage341, this);
		method268((byte) 16);
		component.prepareImage(this.anImage341, this);
		method268((byte) 16);
		component.prepareImage(this.anImage341, this);
		method267((byte) 2);
	}

	@Override
	public final void method262(final Graphics graphics, final int i, final int i_44_) {
		method268((byte) 16);
		graphics.drawImage(this.anImage341, i, i_44_, this);
	}

	@Override
	public final void method266(final Graphics graphics, final int i, final int i_45_, final int i_46_, final int i_47_) {
		method270(i, i_45_, i_46_, i_47_, 2000482142);
		final Shape shape = graphics.getClip();
		graphics.clipRect(i, i_45_, i_46_, i_47_);
		graphics.drawImage(this.anImage341, 0, 0, this);
		graphics.setClip(shape);
	}

	synchronized void method270(final int i, final int i_48_, final int i_49_, final int i_50_, final int i_51_) {
		try {
			if (this.anImageConsumer1726 == null) {
				if (i_51_ == -1723088013) {
					throw new IllegalStateException();
				}
			} else {
				this.anImageConsumer1726.setPixels(i, i_48_, i_49_, i_50_, this.aColorModel1725, anIntArray339, this.anInt338 * -1155065081 * i_48_ + i, this.anInt338 * -1155065081);
				this.anImageConsumer1726.imageComplete(2);
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "cg.t()");
		}
	}

	static Class method271(final String string, final int i) throws ClassNotFoundException {
		Class var_class;
		try {
			if (string.equals("B")) {
				return Byte.TYPE;
			}
			if (string.equals("I")) {
				return Integer.TYPE;
			}
			if (string.equals("S")) {
				return Short.TYPE;
			}
			if (string.equals("J")) {
				return Long.TYPE;
			}
			if (string.equals("Z")) {
				return Boolean.TYPE;
			}
			if (string.equals("F")) {
				return Float.TYPE;
			}
			if (string.equals("D")) {
				return Double.TYPE;
			}
			if (string.equals("C")) {
				return Character.TYPE;
			}
			var_class = Class.forName(string);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "cg.e()");
		}
		return var_class;
	}

	Class28_Sub1() {
		/* empty */
	}

	@Override
	public final void method261(final Graphics graphics, final int i, final int i_52_, final int i_53_, final int i_54_) {
		method270(i, i_52_, i_53_, i_54_, 910602619);
		final Shape shape = graphics.getClip();
		graphics.clipRect(i, i_52_, i_53_, i_54_);
		graphics.drawImage(this.anImage341, 0, 0, this);
		graphics.setClip(shape);
	}

	static void method272(final Class91_Sub18 class91_sub18, final int i) {
		try {
			if (class91_sub18.anInt2085 * -2009530999 == client.anInt1644 * 2099026841) {
				client.aBooleanArray1645[-1346305317 * class91_sub18.anInt2084] = true;
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "cg.cm()");
		}
	}

	@Override
	public final void method260(final Graphics graphics, final int i, final int i_55_) {
		method268((byte) 16);
		graphics.drawImage(this.anImage341, i, i_55_, this);
	}

	public static Class91_Sub20_Sub13_Sub4_Sub1 method273(final Js5 class63, final Js5 class63_56_, final int i, final int i_57_, final int i_58_) {
		Class91_Sub20_Sub13_Sub4_Sub1 class91_sub20_sub13_sub4_sub1;
		try {
			class91_sub20_sub13_sub4_sub1 = !IdkType.method731(class63, i, i_57_, 51884362) ? null : Class70.method435(class63_56_.getFile(i, i_57_, -1392598164), -811849233);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "cg.i()");
		}
		return class91_sub20_sub13_sub4_sub1;
	}

	@Override
	public final void method259(final Graphics graphics, final int i, final int i_59_, final int i_60_, final int i_61_) {
		method270(i, i_59_, i_60_, i_61_, -603431499);
		final Shape shape = graphics.getClip();
		graphics.clipRect(i, i_59_, i_60_, i_61_);
		graphics.drawImage(this.anImage341, 0, 0, this);
		graphics.setClip(shape);
	}

	@Override
	final void method256(final int i, final int i_62_, final Component component) {
		this.anInt338 = 1475699383 * i;
		this.anInt342 = 1181581557 * i_62_;
		anIntArray339 = new int[1 + i * i_62_];
		this.aColorModel1725 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage341 = component.createImage(this);
		method268((byte) 16);
		component.prepareImage(this.anImage341, this);
		method268((byte) 16);
		component.prepareImage(this.anImage341, this);
		method268((byte) 16);
		component.prepareImage(this.anImage341, this);
		method267((byte) 2);
	}
}
