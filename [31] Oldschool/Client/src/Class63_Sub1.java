/* Class63_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class63_Sub1 extends Js5 {
	volatile boolean[] aBooleanArray1734;
	Class14 aClass14_1735;
	int anInt1736;
	volatile boolean aBoolean1737;
	boolean aBoolean1738;
	int anInt1739;
	static CRC32 aCRC32_1740 = new CRC32();
	int anInt1741;
	int anInt1742;
	static final int anInt1743 = 38;
	Class14 aClass14_1744;

	public int method422(final byte i) {
		int i_0_;
		try {
			if (this.aBoolean1737) {
				return 100;
			}
			if (this.anObjectArray761 != null) {
				if (i <= 0) {
					throw new IllegalStateException();
				}
				return 99;
			}
			int i_1_ = -2060966385 * this.anInt1736;
			final long l = i_1_ + 16711680;
			int i_2_;
			do {
				if (Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177 != null) {
					if (i <= 0) {
						throw new IllegalStateException();
					}
					if (Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177.aLong1192 == l) {
						i_2_ = 1 + -91282747 * Class23.aClass91_Sub9_290.currentOffset / (Class23.aClass91_Sub9_290.buffer.length - Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177.aByte2500);
						break;
					}
				}
				i_2_ = 0;
			} while (false);
			i_1_ = i_2_;
			if (i_2_ >= 100) {
				i_1_ = 99;
			}
			i_0_ = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ez.ca()");
		}
		return i_0_;
	}

	@Override
	void method411(final int i, final int i_3_) {
		try {
			Class1.method73(this.anInt1736 * -2060966385, i, -1481700867);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "ez.w()");
		}
	}

	@Override
	void method404(final int i, final int i_4_) {
		try {
			if (this.aClass14_1744 != null) {
				if (i_4_ <= 16776960) {
					return;
				}
				if (this.aBooleanArray1734 != null && this.aBooleanArray1734[i]) {
					final Class14 class14 = this.aClass14_1744;
					byte[] is = null;
					final Class95 class95 = Class78.aClass95_1111;
					synchronized (class95) {
						for (Class91_Sub12 class91_sub12 = (Class91_Sub12) Class78.aClass95_1111.method1062(); class91_sub12 != null; class91_sub12 = (Class91_Sub12) Class78.aClass95_1111.method1063()) {
							if (class91_sub12.aLong1192 == i && class91_sub12.aClass14_1887 == class14 && 1838660013 * class91_sub12.anInt1891 == 0) {
								if (i_4_ <= 16776960) {
									/* empty */
								} else {
									is = class91_sub12.aByteArray1890;
									break;
								}
								return;
							}
						}
					}
					if (is != null) {
						method431(class14, i, is, true, 1645900196);
					} else {
						final byte[] is_5_ = class14.method172(i, 1001076692);
						method431(class14, i, is_5_, true, 856148509);
					}
					return;
				}
			}
			Class62.method395(this, this.anInt1736 * -2060966385, i, this.anIntArray765[i], (byte) 2, true, 993488889);
		} catch (final RuntimeException var10) {
			throw Class102.method1086(var10, "ez.a()");
		}
	}

	public void method423(final int i, final int i_6_, final int i_7_) {
		try {
			this.anInt1741 = -1411260851 * i;
			this.anInt1742 = i_6_ * 772397763;
			if (this.aClass14_1735 != null) {
				final int i_8_ = -2060966385 * this.anInt1736;
				final Class14 class14 = this.aClass14_1735;
				byte[] is = null;
				final Class95 class95 = Class78.aClass95_1111;
				synchronized (class95) {
					for (Class91_Sub12 class91_sub12 = (Class91_Sub12) Class78.aClass95_1111.method1062(); class91_sub12 != null; class91_sub12 = (Class91_Sub12) Class78.aClass95_1111.method1063()) {
						if (i_8_ == class91_sub12.aLong1192) {
							if (i_7_ == 32768) {
								return;
							}
							if (class14 == class91_sub12.aClass14_1887) {
								if (i_7_ == 32768) {
									return;
								}
								if (class91_sub12.anInt1891 * 1838660013 == 0) {
									is = class91_sub12.aByteArray1890;
									break;
								}
							}
						}
					}
				}
				if (is != null) {
					if (i_7_ != 32768) {
						method431(class14, i_8_, is, true, -1412884297);
					}
				} else {
					final byte[] is_9_ = class14.method172(i_8_, 1138591507);
					method431(class14, i_8_, is_9_, true, 1038874538);
				}
			} else {
				Class62.method395(this, 255, this.anInt1736 * -2060966385, this.anInt1741 * -702903675, (byte) 0, true, 461290713);
			}
		} catch (final RuntimeException var12) {
			throw Class102.method1086(var12, "ez.ck()");
		}
	}

	public void method424(final int i, final byte[] is, final boolean bool, final boolean bool_10_, final int i_11_) {
		try {
			if (bool) {
				if (this.aBoolean1737) {
					if (i_11_ <= -1392277897) {
						return;
					}
					throw new RuntimeException();
				}
				if (this.aClass14_1735 != null) {
					if (i_11_ <= -1392277897) {
						return;
					}
					final int i_12_ = this.anInt1736 * -2060966385;
					final Class14 class14 = this.aClass14_1735;
					final Class91_Sub12 class91_sub12 = new Class91_Sub12();
					class91_sub12.anInt1891 = 0;
					class91_sub12.aLong1192 = i_12_;
					class91_sub12.aByteArray1890 = is;
					class91_sub12.aClass14_1887 = class14;
					final Class95 class95 = Class78.aClass95_1111;
					synchronized (class95) {
						Class78.aClass95_1111.method1058(class91_sub12);
					}
					final Object object = Class78.anObject1108;
					synchronized (object) {
						if (Class78.anInt1110 * -1535148391 == 0) {
							Class91_Sub22.aClass25_2110.method232(new Class78(), 5, -314164061);
						}
						Class78.anInt1110 = -831011816;
					}
				}
				method396(is, (byte) 1);
				method428((byte) -45);
			} else {
				is[is.length - 2] = (byte) (this.anIntArray771[i] >> 8);
				is[is.length - 1] = (byte) this.anIntArray771[i];
				if (this.aClass14_1744 != null) {
					if (i_11_ <= -1392277897) {
						return;
					}
					final Class14 class14 = this.aClass14_1744;
					final Class91_Sub12 class91_sub12 = new Class91_Sub12();
					class91_sub12.anInt1891 = 0;
					class91_sub12.aLong1192 = i;
					class91_sub12.aByteArray1890 = is;
					class91_sub12.aClass14_1887 = class14;
					final Class95 class95 = Class78.aClass95_1111;
					synchronized (class95) {
						Class78.aClass95_1111.method1058(class91_sub12);
					}
					final Object object = Class78.anObject1108;
					synchronized (object) {
						if (-1535148391 * Class78.anInt1110 == 0) {
							Class91_Sub22.aClass25_2110.method232(new Class78(), 5, -938164890);
						}
						Class78.anInt1110 = -831011816;
					}
					this.aBooleanArray1734[i] = true;
				}
				if (bool_10_) {
					this.anObjectArray761[i] = Class91_Sub9_Sub1.method696(is, false, 478825819);
				}
			}
		} catch (final RuntimeException var18) {
			throw Class102.method1086(var18, "ez.cq()");
		}
	}

	public Class63_Sub1(final Class14 class14, final Class14 class14_13_, final int i, final boolean bool, final boolean bool_14_, final boolean bool_15_) {
		super(bool, bool_14_);
		try {
			this.aBoolean1737 = false;
			this.aBoolean1738 = false;
			this.anInt1739 = 1180918189;
			this.aClass14_1744 = class14;
			this.aClass14_1735 = class14_13_;
			this.anInt1736 = i * -1603532561;
			this.aBoolean1738 = bool_15_;
			Class91_Sub20_Sub9.method799(this, this.anInt1736 * -2060966385, 1480018448);
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "ez.<init>()");
		}
	}

	public int method425(final int i) {
		int i_16_;
		try {
			int i_17_ = 0;
			int i_18_ = 0;
			for (int i_19_ = 0; i_19_ < this.anObjectArray761.length; i_19_++) {
				if (this.anIntArray774[i_19_] > 0) {
					i_17_ += 100;
					i_18_ += method426(i_19_, (byte) 13);
				}
			}
			if (i_17_ == 0) {
				return 100;
			}
			final int i_20_ = i_18_ * 100 / i_17_;
			i_16_ = i_20_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ez.cx()");
		}
		return i_16_;
	}

	int method426(final int i, final byte i_21_) {
		int i_22_;
		try {
			i_22_ = this.anObjectArray761[i] != null ? 100 : this.aBooleanArray1734[i] ? 100 : Class19.method193(this.anInt1736 * -2060966385, i, (byte) 64);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ez.cc()");
		}
		return i_22_;
	}

	void method428(final byte i) {
		try {
			this.aBooleanArray1734 = new boolean[this.anObjectArray761.length];
			for (int i_23_ = 0; i_23_ < this.aBooleanArray1734.length; i_23_++) {
				this.aBooleanArray1734[i_23_] = false;
			}
			if (this.aClass14_1744 == null) {
				if (i != 1) {
					this.aBoolean1737 = true;
				}
			} else {
				this.anInt1739 = 1180918189;
				for (int i_24_ = 0; i_24_ < this.aBooleanArray1734.length; i_24_++) {
					if (this.anIntArray774[i_24_] > 0) {
						Class91_Sub2_Sub4.method587(i_24_, this.aClass14_1744, this, (byte) -32);
						this.anInt1739 = i_24_ * -1180918189;
					}
				}
				if (-1 == this.anInt1739 * -1017031205) {
					this.aBoolean1737 = true;
				}
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "ez.ct()");
		}
	}

	public void method431(final Class14 class14, final int i, final byte[] is, final boolean bool, final int i_25_) {
		try {
			if (class14 == this.aClass14_1735) {
				if (this.aBoolean1737) {
					throw new RuntimeException();
				}
				if (is == null) {
					if (i_25_ > -1438449645) {
						Class62.method395(this, 255, this.anInt1736 * -2060966385, this.anInt1741 * -702903675, (byte) 0, true, 2041649183);
					}
				} else {
					aCRC32_1740.reset();
					aCRC32_1740.update(is, 0, is.length);
					final int i_26_ = (int) aCRC32_1740.getValue();
					final ByteBuffer class91_sub9 = new ByteBuffer(Class47.method365(is, 558200466));
					final int i_27_ = class91_sub9.readUnsignedByte();
					if (i_27_ != 5 && 6 != i_27_) {
						throw new RuntimeException("");
					}
					int i_28_ = 0;
					if (i_27_ >= 6) {
						i_28_ = class91_sub9.readDword();
					}
					if (-702903675 * this.anInt1741 == i_26_ && i_28_ == 754066923 * this.anInt1742) {
						method396(is, (byte) 1);
						method428((byte) 44);
					} else {
						Class62.method395(this, 255, -2060966385 * this.anInt1736, -702903675 * this.anInt1741, (byte) 0, true, -2049509913);
					}
				}
			} else {
				if (!bool && -1017031205 * this.anInt1739 == i) {
					this.aBoolean1737 = true;
				}
				if (is != null) {
					if (is.length > 2) {
						aCRC32_1740.reset();
						aCRC32_1740.update(is, 0, is.length - 2);
						final int i_29_ = (int) aCRC32_1740.getValue();
						final int i_30_ = (is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8);
						if (i_29_ == this.anIntArray765[i] && i_30_ == this.anIntArray771[i]) {
							this.aBooleanArray1734[i] = true;
							if (bool) {
								if (i_25_ > -1438449645) {
									this.anObjectArray761[i] = Class91_Sub9_Sub1.method696(is, false, 478825819);
								}
							}
						} else {
							this.aBooleanArray1734[i] = false;
							if (this.aBoolean1738 || bool) {
								Class62.method395(this, -2060966385 * this.anInt1736, i, this.anIntArray765[i], (byte) 2, bool, -472167361);
								return;
							}
							return;
						}
						return;
					}
					if (i_25_ <= -1438449645) {
						return;
					}
				}
				this.aBooleanArray1734[i] = false;
				if (this.aBoolean1738 || bool) {
					Class62.method395(this, this.anInt1736 * -2060966385, i, this.anIntArray765[i], (byte) 2, bool, -1615930763);
				}
			}
		} catch (final RuntimeException var10) {
			throw Class102.method1086(var10, "ez.cg()");
		}
	}

	static boolean method432(final Class91_Sub18 class91_sub18, final byte i) {
		boolean bool;
		try {
			if (client.aBoolean1611) {
				if (Class17.method182(class91_sub18, 87034241) != 0) {
					return false;
				}
				if (633275603 * class91_sub18.anInt2057 == 0) {
					if (i >= 0) {
						throw new IllegalStateException();
					}
					return false;
				}
			}
			bool = class91_sub18.aBoolean1981;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ez.do()");
		}
		return bool;
	}
}
