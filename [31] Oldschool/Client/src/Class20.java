/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class Class20 implements Runnable {
	Class29 aClass29_263;
	OutputStream anOutputStream264;
	Socket aSocket265;
	static final int anInt266 = 36;
	Class25 aClass25_267;
	static final int anInt268 = 31;
	byte[] aByteArray269;
	int anInt270;
	int anInt271;
	boolean aBoolean272;
	static int anInt273;
	boolean aBoolean274;
	InputStream anInputStream275;

	@Override
	public void run() {
		try {
			try {
				for (;;) {
					int i;
					int i_0_;
					synchronized (this) {
						if (1139930981 * this.anInt271 == this.anInt270 * -1363478259) {
							if (this.aBoolean274) {
								break;
							}
							try {
								this.wait();
							} catch (final InterruptedException interruptedexception) {
								/* empty */
							}
						}
						i = this.anInt270 * -1363478259;
						if (this.anInt271 * 1139930981 >= this.anInt270 * -1363478259) {
							i_0_ = 1139930981 * this.anInt271 - -1363478259 * this.anInt270;
						} else {
							i_0_ = 5000 - -1363478259 * this.anInt270;
						}
					}
					if (i_0_ > 0) {
						try {
							this.anOutputStream264.write(this.aByteArray269, i, i_0_);
						} catch (final IOException ioexception) {
							this.aBoolean272 = true;
						}
						this.anInt270 = (i_0_ + this.anInt270 * -1363478259) % 5000 * 298810821;
						try {
							if (-1363478259 * this.anInt270 == 1139930981 * this.anInt271) {
								this.anOutputStream264.flush();
							}
						} catch (final IOException ioexception) {
							this.aBoolean272 = true;
						}
					}
				}
				try {
					if (this.anInputStream275 != null) {
						this.anInputStream275.close();
					}
					if (this.anOutputStream264 != null) {
						this.anOutputStream264.close();
					}
					if (this.aSocket265 != null) {
						this.aSocket265.close();
					}
				} catch (final IOException ioexception) {
					/* empty */
				}
				this.aByteArray269 = null;
			} catch (final Exception exception) {
				Class91_Sub21.method1036(null, exception, (byte) -75);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bq.run()");
		}
	}

	public void method194(final byte i) {
		try {
			if (this.aBoolean274) {
				if (i == 1) {
					/* empty */
				}
			} else {
				synchronized (this) {
					this.aBoolean274 = true;
					notifyAll();
				}
				if (this.aClass29_263 != null) {
					if (i != 1) {
						throw new IllegalStateException();
					}
					while (this.aClass29_263.anInt348 == 0) {
						Class91_Sub20_Sub5.method761(1L);
					}
					if (this.aClass29_263.anInt348 == 1) {
						try {
							((Thread) this.aClass29_263.anObject350).join();
						} catch (final InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				this.aClass29_263 = null;
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "bq.e()");
		}
	}

	@Override
	protected void finalize() {
		try {
			method194((byte) 1);
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "bq.finalize()");
		}
	}

	public int method195(final int i) throws IOException {
		int i_1_;
		try {
			if (this.aBoolean274) {
				return 0;
			}
			i_1_ = this.anInputStream275.read();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bq.t()");
		}
		return i_1_;
	}

	public int method196(final byte i) throws IOException {
		int i_2_;
		try {
			i_2_ = this.aBoolean274 ? 0 : this.anInputStream275.available();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bq.d()");
		}
		return i_2_;
	}

	public void method197(final byte[] is, final int i, final int i_3_, final byte i_4_) throws IOException {
		try {
			if (this.aBoolean274) {
				if (i_4_ != 0) {
					throw new IllegalStateException();
				}
			} else {
				if (this.aBoolean272) {
					if (i_4_ != 0) {
						throw new IllegalStateException();
					}
					this.aBoolean272 = false;
					throw new IOException();
				}
				if (this.aByteArray269 == null) {
					if (i_4_ != 0) {
						throw new IllegalStateException();
					}
					this.aByteArray269 = new byte[5000];
				}
				synchronized (this) {
					for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
						if (i_4_ != 0) {
							return;
						}
						this.aByteArray269[1139930981 * this.anInt271] = is[i_5_ + i];
						this.anInt271 = (1 + this.anInt271 * 1139930981) % 5000 * -1537121683;
						if ((-1363478259 * this.anInt270 + 4900) % 5000 == this.anInt271 * 1139930981) {
							throw new IOException();
						}
					}
					if (this.aClass29_263 == null) {
						if (i_4_ != 0) {
							throw new IllegalStateException();
						}
						this.aClass29_263 = this.aClass25_267.method232(this, 3, -1897122658);
					}
					notifyAll();
				}
			}
		} catch (final RuntimeException var9) {
			throw Class102.method1086(var9, "bq.k()");
		}
	}

	static final void method198(final int i, final int i_6_, final int i_7_, final int i_8_, final int i_9_) {
		try {
			for (int i_10_ = i_6_; i_10_ <= i_8_ + i_6_; i_10_++) {
				for (int i_11_ = i; i_11_ <= i + i_7_; i_11_++) {
					if (i_11_ >= 0 && i_11_ < 104 && i_10_ >= 0 && i_10_ < 104) {
						Class102.aByteArrayArrayArray1310[0][i_11_][i_10_] = (byte) 127;
						if (i == i_11_ && i_11_ > 0) {
							Class102.anIntArrayArrayArray1292[0][i_11_][i_10_] = Class102.anIntArrayArrayArray1292[0][i_11_ - 1][i_10_];
						}
						if (i_11_ == i_7_ + i && i_11_ < 103) {
							Class102.anIntArrayArrayArray1292[0][i_11_][i_10_] = Class102.anIntArrayArrayArray1292[0][i_11_ + 1][i_10_];
						}
						if (i_10_ == i_6_ && i_10_ > 0) {
							Class102.anIntArrayArrayArray1292[0][i_11_][i_10_] = Class102.anIntArrayArrayArray1292[0][i_11_][i_10_ - 1];
						}
						if (i_10_ == i_8_ + i_6_ && i_10_ < 103) {
							Class102.anIntArrayArrayArray1292[0][i_11_][i_10_] = Class102.anIntArrayArrayArray1292[0][i_11_][i_10_ + 1];
						}
					}
				}
			}
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "bq.w()");
		}
	}

	public Class20(final Socket socket, final Class25 class25) throws IOException {
		try {
			this.aBoolean274 = false;
			this.anInt270 = 0;
			this.anInt271 = 0;
			this.aBoolean272 = false;
			this.aClass25_267 = class25;
			this.aSocket265 = socket;
			this.aSocket265.setSoTimeout(30000);
			this.aSocket265.setTcpNoDelay(true);
			this.anInputStream275 = this.aSocket265.getInputStream();
			this.anOutputStream264 = this.aSocket265.getOutputStream();
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "bq.<init>()");
		}
	}

	public void method199(final byte[] is, int i, int i_12_, final short i_13_) throws IOException {
		try {
			if (this.aBoolean274) {
				if (i_13_ == 512) {
					throw new IllegalStateException();
				}
			} else {
				int i_14_;
				for (/**/; i_12_ > 0; i_12_ -= i_14_) {
					i_14_ = this.anInputStream275.read(is, i, i_12_);
					if (i_14_ <= 0) {
						throw new EOFException();
					}
					i += i_14_;
				}
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "bq.p()");
		}
	}

	static final void method200(final int i) {
		try {
			if (220 == client.anInt1482 * -2005995539) {
				final int i_15_ = client.aClass91_Sub9_Sub1_1480.method683((byte) 43);
				int i_16_ = client.aClass91_Sub9_Sub1_1480.method642(1829422550);
				final int i_17_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
				final int i_18_ = (i_17_ >> 4 & 0x7) + Class91_Sub20_Sub14_Sub1.anInt2639 * -577523455;
				final int i_19_ = -164667693 * Class91_Sub20_Sub14_Sub6.anInt2820 + (i_17_ & 0x7);
				int i_20_ = client.aClass91_Sub9_Sub1_1480.method657((short) -6028);
				int i_21_ = client.aClass91_Sub9_Sub1_1480.method642(1699935550);
				final int i_22_ = client.aClass91_Sub9_Sub1_1480.method662(1741883914);
				final int i_23_ = client.aClass91_Sub9_Sub1_1480.method655(1446465888);
				final int i_24_ = i_23_ >> 2;
				final int i_25_ = i_23_ & 0x3;
				final int i_26_ = client.anIntArray1500[i_24_];
				int i_27_ = client.aClass91_Sub9_Sub1_1480.method657((short) -29552);
				final int i_28_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -109);
				final int i_29_ = client.aClass91_Sub9_Sub1_1480.method663((byte) -5);
				Class91_Sub20_Sub14_Sub1_Sub1 class91_sub20_sub14_sub1_sub1;
				if (i_22_ == 2082413503 * client.anInt1576) {
					class91_sub20_sub14_sub1_sub1 = Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316;
				} else {
					class91_sub20_sub14_sub1_sub1 = client.aClass91_Sub20_Sub14_Sub1_Sub1Array1562[i_22_];
				}
				if (class91_sub20_sub14_sub1_sub1 != null) {
					final LocType class91_sub20_sub7 = Class60.method392(i_28_, 276758857);
					int i_30_;
					int i_31_;
					if (1 != i_25_ && i_25_ != 3) {
						i_30_ = -2039520181 * class91_sub20_sub7.anInt2312;
						i_31_ = -1173592851 * class91_sub20_sub7.anInt2313;
					} else {
						i_30_ = class91_sub20_sub7.anInt2313 * -1173592851;
						i_31_ = class91_sub20_sub7.anInt2312 * -2039520181;
					}
					final int i_32_ = i_18_ + (i_30_ >> 1);
					final int i_33_ = i_18_ + (i_30_ + 1 >> 1);
					final int i_34_ = i_19_ + (i_31_ >> 1);
					final int i_35_ = (1 + i_31_ >> 1) + i_19_;
					final int[][] is = Class102.anIntArrayArrayArray1292[Class100.anInt1248 * -1723088013];
					final int i_36_ = is[i_33_][i_35_] + is[i_32_][i_35_] + is[i_33_][i_34_] + is[i_32_][i_34_] >> 2;
					final int i_37_ = (i_18_ << 7) + (i_30_ << 6);
					final int i_38_ = (i_19_ << 7) + (i_31_ << 6);
					final Class91_Sub20_Sub14_Sub3 class91_sub20_sub14_sub3 = class91_sub20_sub7.method772(i_24_, i_25_, is, i_37_, i_36_, i_38_, (short) -14635);
					if (class91_sub20_sub14_sub3 != null) {
						Class106.method1103(-1723088013 * Class100.anInt1248, i_18_, i_19_, i_26_, -1, 0, 0, i_29_ + 1, 1 + i_15_, -1985265035);
						class91_sub20_sub14_sub1_sub1.anInt2839 = 914301599 * (client.anInt1449 * 2026135825 + i_29_);
						class91_sub20_sub14_sub1_sub1.anInt2845 = (client.anInt1449 * 2026135825 + i_15_) * 1744879263;
						class91_sub20_sub14_sub1_sub1.aClass91_Sub20_Sub14_Sub3_2849 = class91_sub20_sub14_sub3;
						class91_sub20_sub14_sub1_sub1.anInt2840 = 635119040 * i_30_ + 1270238080 * i_18_;
						class91_sub20_sub14_sub1_sub1.anInt2848 = 1205966464 * i_19_ + 602983232 * i_31_;
						class91_sub20_sub14_sub1_sub1.anInt2847 = i_36_ * 1394489621;
						if (i_20_ > i_16_) {
							final int i_39_ = i_20_;
							i_20_ = i_16_;
							i_16_ = i_39_;
						}
						if (i_21_ > i_27_) {
							final int i_40_ = i_21_;
							i_21_ = i_27_;
							i_27_ = i_40_;
						}
						class91_sub20_sub14_sub1_sub1.anInt2850 = (i_18_ + i_20_) * -1259035767;
						class91_sub20_sub14_sub1_sub1.anInt2852 = 1719432951 * (i_18_ + i_16_);
						class91_sub20_sub14_sub1_sub1.anInt2844 = (i_21_ + i_19_) * 130934253;
						class91_sub20_sub14_sub1_sub1.anInt2853 = -78470141 * (i_27_ + i_19_);
					}
				}
			}
			if (client.anInt1482 * -2005995539 == 182) {
				final int i_41_ = client.aClass91_Sub9_Sub1_1480.method663((byte) -12);
				final int i_42_ = client.aClass91_Sub9_Sub1_1480.method656(1811754009);
				int i_43_ = i_42_ >> 2;
				final int i_44_ = i_42_ & 0x3;
				final int i_45_ = client.anIntArray1500[i_43_];
				final int i_46_ = client.aClass91_Sub9_Sub1_1480.method655(403897448);
				final int i_47_ = -577523455 * Class91_Sub20_Sub14_Sub1.anInt2639 + (i_46_ >> 4 & 0x7);
				final int i_48_ = -164667693 * Class91_Sub20_Sub14_Sub6.anInt2820 + (i_46_ & 0x7);
				if (i_47_ >= 0 && i_48_ >= 0 && i_47_ < 103 && i_48_ < 103) {
					if (i_45_ == 0) {
						final Class36 class36 = Class107.aClass39_1397.method335(Class100.anInt1248 * -1723088013, i_47_, i_48_);
						if (class36 != null) {
							final int i_49_ = 1235214067 * class36.anInt425 >> 14 & 0x7fff;
							if (2 == i_43_) {
								class36.aClass91_Sub20_Sub14_430 = new Class91_Sub20_Sub14_Sub5(i_49_, 2, i_44_ + 4, -1723088013 * Class100.anInt1248, i_47_, i_48_, i_41_, false, class36.aClass91_Sub20_Sub14_430);
								class36.aClass91_Sub20_Sub14_431 = new Class91_Sub20_Sub14_Sub5(i_49_, 2, i_44_ + 1 & 0x3, Class100.anInt1248 * -1723088013, i_47_, i_48_, i_41_, false, class36.aClass91_Sub20_Sub14_431);
							} else {
								class36.aClass91_Sub20_Sub14_430 = new Class91_Sub20_Sub14_Sub5(i_49_, i_43_, i_44_, -1723088013 * Class100.anInt1248, i_47_, i_48_, i_41_, false, class36.aClass91_Sub20_Sub14_430);
							}
						}
					}
					if (1 == i_45_) {
						final Class58 class58 = Class107.aClass39_1397.method308(-1723088013 * Class100.anInt1248, i_47_, i_48_);
						if (class58 != null) {
							final int i_50_ = class58.anInt711 * -1543714541 >> 14 & 0x7fff;
							if (i_43_ != 4 && i_43_ != 5) {
								if (i_43_ == 6) {
									class58.aClass91_Sub20_Sub14_709 = new Class91_Sub20_Sub14_Sub5(i_50_, 4, i_44_ + 4, Class100.anInt1248 * -1723088013, i_47_, i_48_, i_41_, false, class58.aClass91_Sub20_Sub14_709);
								} else if (i_43_ == 7) {
									class58.aClass91_Sub20_Sub14_709 = new Class91_Sub20_Sub14_Sub5(i_50_, 4, 4 + (2 + i_44_ & 0x3), Class100.anInt1248 * -1723088013, i_47_, i_48_, i_41_, false, class58.aClass91_Sub20_Sub14_709);
								} else if (8 == i_43_) {
									class58.aClass91_Sub20_Sub14_709 = new Class91_Sub20_Sub14_Sub5(i_50_, 4, i_44_ + 4, -1723088013 * Class100.anInt1248, i_47_, i_48_, i_41_, false, class58.aClass91_Sub20_Sub14_709);
									class58.aClass91_Sub20_Sub14_702 = new Class91_Sub20_Sub14_Sub5(i_50_, 4, 4 + (i_44_ + 2 & 0x3), -1723088013 * Class100.anInt1248, i_47_, i_48_, i_41_, false, class58.aClass91_Sub20_Sub14_702);
								}
							} else {
								class58.aClass91_Sub20_Sub14_709 = new Class91_Sub20_Sub14_Sub5(i_50_, 4, i_44_, Class100.anInt1248 * -1723088013, i_47_, i_48_, i_41_, false, class58.aClass91_Sub20_Sub14_709);
							}
						}
					}
					if (i_45_ == 2) {
						final Class33 class33 = Class107.aClass39_1397.method339(Class100.anInt1248 * -1723088013, i_47_, i_48_);
						if (i_43_ == 11) {
							i_43_ = 10;
						}
						if (class33 != null) {
							class33.aClass91_Sub20_Sub14_384 = new Class91_Sub20_Sub14_Sub5(class33.anInt396 * -685714703 >> 14 & 0x7fff, i_43_, i_44_, -1723088013 * Class100.anInt1248, i_47_, i_48_, i_41_, false, class33.aClass91_Sub20_Sub14_384);
						}
					}
					if (i_45_ == 3) {
						final Class44 class44 = Class107.aClass39_1397.method309(Class100.anInt1248 * -1723088013, i_47_, i_48_);
						if (class44 != null) {
							class44.aClass91_Sub20_Sub14_575 = new Class91_Sub20_Sub14_Sub5(class44.anInt585 * -1148312425 >> 14 & 0x7fff, 22, i_44_, Class100.anInt1248 * -1723088013, i_47_, i_48_, i_41_, false, class44.aClass91_Sub20_Sub14_575);
						}
					}
				}
			} else if (64 == -2005995539 * client.anInt1482) {
				final int i_51_ = client.aClass91_Sub9_Sub1_1480.method655(1250859366);
				final int i_52_ = -577523455 * Class91_Sub20_Sub14_Sub1.anInt2639 + (i_51_ >> 4 & 0x7);
				final int i_53_ = (i_51_ & 0x7) + -164667693 * Class91_Sub20_Sub14_Sub6.anInt2820;
				final int i_54_ = client.aClass91_Sub9_Sub1_1480.method683((byte) 43);
				final int i_55_ = client.aClass91_Sub9_Sub1_1480.method662(1605943976);
				final int i_56_ = client.aClass91_Sub9_Sub1_1480.method683((byte) 51);
				if (i_52_ >= 0 && i_53_ >= 0 && i_52_ < 104 && i_53_ < 104 && 2082413503 * client.anInt1576 != i_54_) {
					final Class91_Sub20_Sub14_Sub7 class91_sub20_sub14_sub7 = new Class91_Sub20_Sub14_Sub7();
					class91_sub20_sub14_sub7.anInt2831 = i_56_ * -1491060307;
					class91_sub20_sub14_sub7.anInt2827 = i_55_ * 686677233;
					if (client.aClass95ArrayArrayArray1477[-1723088013 * Class100.anInt1248][i_52_][i_53_] == null) {
						client.aClass95ArrayArrayArray1477[Class100.anInt1248 * -1723088013][i_52_][i_53_] = new Class95();
					}
					client.aClass95ArrayArrayArray1477[Class100.anInt1248 * -1723088013][i_52_][i_53_].method1058(class91_sub20_sub14_sub7);
					Class33.method278(i_52_, i_53_, (byte) 104);
				}
			} else if (89 == client.anInt1482 * -2005995539) {
				final int i_57_ = client.aClass91_Sub9_Sub1_1480.method683((byte) 111);
				final int i_58_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
				final int i_59_ = (i_58_ >> 4 & 0x7) + Class91_Sub20_Sub14_Sub1.anInt2639 * -577523455;
				final int i_60_ = Class91_Sub20_Sub14_Sub6.anInt2820 * -164667693 + (i_58_ & 0x7);
				if (i_59_ >= 0 && i_60_ >= 0 && i_59_ < 104 && i_60_ < 104) {
					final Class95 class95 = client.aClass95ArrayArrayArray1477[-1723088013 * Class100.anInt1248][i_59_][i_60_];
					if (class95 != null) {
						for (Class91_Sub20_Sub14_Sub7 class91_sub20_sub14_sub7 = (Class91_Sub20_Sub14_Sub7) class95.method1062(); class91_sub20_sub14_sub7 != null; class91_sub20_sub14_sub7 = (Class91_Sub20_Sub14_Sub7) class95.method1063()) {
							if ((i_57_ & 0x7fff) == class91_sub20_sub14_sub7.anInt2831 * -643853787) {
								class91_sub20_sub14_sub7.method495();
								break;
							}
						}
						if (class95.method1062() == null) {
							client.aClass95ArrayArrayArray1477[-1723088013 * Class100.anInt1248][i_59_][i_60_] = null;
						}
						Class33.method278(i_59_, i_60_, (byte) 121);
					}
				}
			} else {
				if (111 == client.anInt1482 * -2005995539) {
					final int i_61_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					final int i_62_ = Class91_Sub20_Sub14_Sub1.anInt2639 * -577523455 + (i_61_ >> 4 & 0x7);
					final int i_63_ = (i_61_ & 0x7) + Class91_Sub20_Sub14_Sub6.anInt2820 * -164667693;
					final int i_64_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -91);
					final int i_65_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					final int i_66_ = i_65_ >> 4 & 0xf;
					final int i_67_ = i_65_ & 0x7;
					final int i_68_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					if (i_62_ >= 0 && i_63_ >= 0 && i_62_ < 104 && i_63_ < 104) {
						final int i_69_ = i_66_ + 1;
						if (Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0] >= i_62_ - i_69_ && Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2603[0] <= i_69_ + i_62_ && Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0] >= i_63_ - i_69_ && Class102.aClass91_Sub20_Sub14_Sub1_Sub1_1316.anIntArray2609[0] <= i_63_ + i_69_ && client.anInt1497 * -1237997571 != 0
								&& i_67_ > 0 && 700768557 * client.anInt1506 < 50) {
							client.anIntArray1701[700768557 * client.anInt1506] = i_64_;
							client.anIntArray1685[700768557 * client.anInt1506] = i_67_;
							client.anIntArray1686[700768557 * client.anInt1506] = i_68_;
							client.aClass22Array1688[client.anInt1506 * 700768557] = null;
							client.anIntArray1548[client.anInt1506 * 700768557] = i_66_ + (i_63_ << 8) + (i_62_ << 16);
							client.anInt1506 += -630909275;
						}
					}
				}
				if (client.anInt1482 * -2005995539 == 70) {
					final int i_70_ = client.aClass91_Sub9_Sub1_1480.method663((byte) -13);
					final int i_71_ = client.aClass91_Sub9_Sub1_1480.method655(597908074);
					final int i_72_ = (i_71_ >> 4 & 0x7) + -577523455 * Class91_Sub20_Sub14_Sub1.anInt2639;
					final int i_73_ = -164667693 * Class91_Sub20_Sub14_Sub6.anInt2820 + (i_71_ & 0x7);
					final int i_74_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -105);
					if (i_72_ >= 0 && i_73_ >= 0 && i_72_ < 104 && i_73_ < 104) {
						final Class91_Sub20_Sub14_Sub7 class91_sub20_sub14_sub7 = new Class91_Sub20_Sub14_Sub7();
						class91_sub20_sub14_sub7.anInt2831 = -1491060307 * i_74_;
						class91_sub20_sub14_sub7.anInt2827 = 686677233 * i_70_;
						if (client.aClass95ArrayArrayArray1477[-1723088013 * Class100.anInt1248][i_72_][i_73_] == null) {
							client.aClass95ArrayArrayArray1477[-1723088013 * Class100.anInt1248][i_72_][i_73_] = new Class95();
						}
						client.aClass95ArrayArrayArray1477[Class100.anInt1248 * -1723088013][i_72_][i_73_].method1058(class91_sub20_sub14_sub7);
						Class33.method278(i_72_, i_73_, (byte) 87);
					}
				} else if (-2005995539 * client.anInt1482 == 103) {
					final int i_75_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					final int i_76_ = Class91_Sub20_Sub14_Sub1.anInt2639 * -577523455 + (i_75_ >> 4 & 0x7);
					final int i_77_ = (i_75_ & 0x7) + -164667693 * Class91_Sub20_Sub14_Sub6.anInt2820;
					final int i_78_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -15);
					final int i_79_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -67);
					final int i_80_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -105);
					if (i_76_ >= 0 && i_77_ >= 0 && i_76_ < 104 && i_77_ < 104) {
						final Class95 class95 = client.aClass95ArrayArrayArray1477[-1723088013 * Class100.anInt1248][i_76_][i_77_];
						if (class95 != null) {
							for (Class91_Sub20_Sub14_Sub7 class91_sub20_sub14_sub7 = (Class91_Sub20_Sub14_Sub7) class95.method1062(); class91_sub20_sub14_sub7 != null; class91_sub20_sub14_sub7 = (Class91_Sub20_Sub14_Sub7) class95.method1063()) {
								if (-643853787 * class91_sub20_sub14_sub7.anInt2831 == (i_78_ & 0x7fff) && 627729 * class91_sub20_sub14_sub7.anInt2827 == i_79_) {
									class91_sub20_sub14_sub7.anInt2827 = i_80_ * 686677233;
									break;
								}
							}
							Class33.method278(i_76_, i_77_, (byte) 93);
						}
					}
				} else if (65 == client.anInt1482 * -2005995539) {
					final int i_81_ = client.aClass91_Sub9_Sub1_1480.method655(160089410);
					final int i_82_ = i_81_ >> 2;
					final int i_83_ = i_81_ & 0x3;
					final int i_84_ = client.anIntArray1500[i_82_];
					final int i_85_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					final int i_86_ = Class91_Sub20_Sub14_Sub1.anInt2639 * -577523455 + (i_85_ >> 4 & 0x7);
					final int i_87_ = Class91_Sub20_Sub14_Sub6.anInt2820 * -164667693 + (i_85_ & 0x7);
					final int i_88_ = client.aClass91_Sub9_Sub1_1480.method662(1238972406);
					if (i_86_ >= 0 && i_87_ >= 0 && i_86_ < 104 && i_87_ < 104) {
						Class106.method1103(-1723088013 * Class100.anInt1248, i_86_, i_87_, i_84_, i_88_, i_82_, i_83_, 0, -1, -2052508939);
					}
				} else if (-2005995539 * client.anInt1482 == 13) {
					final int i_89_ = client.aClass91_Sub9_Sub1_1480.method655(-1163279863);
					final int i_90_ = -577523455 * Class91_Sub20_Sub14_Sub1.anInt2639 + (i_89_ >> 4 & 0x7);
					final int i_91_ = (i_89_ & 0x7) + Class91_Sub20_Sub14_Sub6.anInt2820 * -164667693;
					final int i_92_ = client.aClass91_Sub9_Sub1_1480.method655(948775652);
					final int i_93_ = i_92_ >> 2;
					final int i_94_ = i_92_ & 0x3;
					final int i_95_ = client.anIntArray1500[i_93_];
					if (i_90_ >= 0 && i_91_ >= 0 && i_90_ < 104 && i_91_ < 104) {
						Class106.method1103(Class100.anInt1248 * -1723088013, i_90_, i_91_, i_95_, -1, i_93_, i_94_, 0, -1, -1697518022);
					}
				} else if (client.anInt1482 * -2005995539 == 238) {
					final int i_96_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					int i_97_ = (i_96_ >> 4 & 0x7) + Class91_Sub20_Sub14_Sub1.anInt2639 * -577523455;
					int i_98_ = (i_96_ & 0x7) + Class91_Sub20_Sub14_Sub6.anInt2820 * -164667693;
					int i_99_ = i_97_ + client.aClass91_Sub9_Sub1_1480.method642(102428671);
					int i_100_ = i_98_ + client.aClass91_Sub9_Sub1_1480.method642(605135400);
					final int i_101_ = client.aClass91_Sub9_Sub1_1480.readShort2();
					final int i_102_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -10);
					final int i_103_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * 4;
					final int i_104_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte() * 4;
					final int i_105_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -2);
					final int i_106_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -70);
					final int i_107_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					final int i_108_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					if (i_97_ >= 0 && i_98_ >= 0 && i_97_ < 104 && i_98_ < 104 && i_99_ >= 0 && i_100_ >= 0 && i_99_ < 104 && i_100_ < 104 && i_102_ != 65535) {
						i_97_ = i_97_ * 128 + 64;
						i_98_ = 64 + 128 * i_98_;
						i_99_ = 128 * i_99_ + 64;
						i_100_ = i_100_ * 128 + 64;
						final Class91_Sub20_Sub14_Sub4 class91_sub20_sub14_sub4 = new Class91_Sub20_Sub14_Sub4(i_102_, -1723088013 * Class100.anInt1248, i_97_, i_98_, Class4.method92(i_97_, i_98_, Class100.anInt1248 * -1723088013, -1851955030) - i_103_, 2026135825 * client.anInt1449 + i_105_, i_106_ + 2026135825 * client.anInt1449, i_107_, i_108_, i_101_, i_104_);
						class91_sub20_sub14_sub4.method996(i_99_, i_100_, Class4.method92(i_99_, i_100_, -1723088013 * Class100.anInt1248, -1955352109) - i_104_, i_105_ + client.anInt1449 * 2026135825, (byte) 116);
						client.aClass95_1578.method1058(class91_sub20_sub14_sub4);
					}
				} else if (41 == client.anInt1482 * -2005995539) {
					final int i_109_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					int i_110_ = (i_109_ >> 4 & 0x7) + Class91_Sub20_Sub14_Sub1.anInt2639 * -577523455;
					int i_111_ = (i_109_ & 0x7) + -164667693 * Class91_Sub20_Sub14_Sub6.anInt2820;
					final int i_112_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -123);
					final int i_113_ = client.aClass91_Sub9_Sub1_1480.readUnsignedByte();
					final int i_114_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -63);
					if (i_110_ >= 0 && i_111_ >= 0 && i_110_ < 104 && i_111_ < 104) {
						i_110_ = i_110_ * 128 + 64;
						i_111_ = i_111_ * 128 + 64;
						final Class91_Sub20_Sub14_Sub6 class91_sub20_sub14_sub6 = new Class91_Sub20_Sub14_Sub6(i_112_, -1723088013 * Class100.anInt1248, i_110_, i_111_, Class4.method92(i_110_, i_111_, Class100.anInt1248 * -1723088013, -1474853687) - i_113_, i_114_, 2026135825 * client.anInt1449);
						client.aClass95_1579.method1058(class91_sub20_sub14_sub6);
					}
				}
			}
		} catch (final RuntimeException var30) {
			throw Class102.method1086(var30, "bq.bu()");
		}
	}
}
