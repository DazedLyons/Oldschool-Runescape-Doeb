/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class43 {
	static final int anInt562 = 4;
	static int anInt563 = 0;
	static int anInt564 = 0;
	static int anInt565 = 0;
	static byte[][] aByteArrayArray566 = new byte[250][];
	static byte[][] aByteArrayArray567 = new byte[50][];
	static final String aString568 = "main_file_cache.idx255";
	static final int anInt569 = 11;
	static byte[][] aByteArrayArray570 = new byte[1000][];
	static Class71 aClass71_571;

	static final void method355(final Class91_Sub18 class91_sub18, final int i, final int i_0_, final int i_1_) {
		try {
			if (client.aClass91_Sub18_1461 == null) {
				if (!client.aBoolean1538) {
					if (class91_sub18 != null) {
						Class91_Sub18 class91_sub18_2_ = class91_sub18;
						int i_3_ = Class64.method433(Class17.method182(class91_sub18, -901334785), (byte) 24);
						Class91_Sub18 class91_sub18_4_;
						if (i_3_ == 0) {
							class91_sub18_4_ = null;
						} else {
							int i_5_ = 0;
							for (;;) {
								if (i_5_ >= i_3_) {
									class91_sub18_4_ = class91_sub18_2_;
									break;
								}
								class91_sub18_2_ = Class61.method394(class91_sub18_2_.anInt1980 * 777859439, -631047529);
								if (class91_sub18_2_ == null) {
									class91_sub18_4_ = null;
									break;
								}
								i_5_++;
							}
						}
						Class91_Sub18 class91_sub18_6_ = class91_sub18_4_;
						if (class91_sub18_4_ == null) {
							class91_sub18_6_ = class91_sub18.aClass91_Sub18_2031;
						}
						if (class91_sub18_6_ != null) {
							client.aClass91_Sub18_1461 = class91_sub18;
							class91_sub18_2_ = class91_sub18;
							i_3_ = Class64.method433(Class17.method182(class91_sub18, -1851793283), (byte) 24);
							if (i_3_ == 0) {
								class91_sub18_4_ = null;
							} else {
								int i_7_ = 0;
								for (;;) {
									if (i_7_ >= i_3_) {
										class91_sub18_4_ = class91_sub18_2_;
										break;
									}
									class91_sub18_2_ = Class61.method394(class91_sub18_2_.anInt1980 * 777859439, -631047529);
									if (class91_sub18_2_ == null) {
										class91_sub18_4_ = null;
										break;
									}
									i_7_++;
								}
							}
							class91_sub18_6_ = class91_sub18_4_;
							if (class91_sub18_4_ == null) {
								class91_sub18_6_ = class91_sub18.aClass91_Sub18_2031;
							}
							client.aClass91_Sub18_1699 = class91_sub18_6_;
							client.anInt1615 = i * -1714231167;
							client.anInt1616 = i_0_ * -456682421;
							Class108.anInt1406 = 0;
							client.aBoolean1624 = false;
						}
					}
				} else if (i_1_ <= 1511145084) {
					throw new IllegalStateException();
				}
			}
		} catch (final RuntimeException var9) {
			throw Class102.method1086(var9, "dc.cj()");
		}
	}

	Class43() throws Throwable {
		try {
			throw new Error();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dc.<init>()");
		}
	}

	static synchronized byte[] method356(final int i, final byte i_8_) {
		byte[] is;
		try {
			if (100 == i && anInt565 * 529060697 > 0) {
				if (i_8_ == 0) {
					throw new IllegalStateException();
				}
				final byte[] is_9_ = aByteArrayArray570[(anInt565 -= -1334557463) * 529060697];
				aByteArrayArray570[anInt565 * 529060697] = null;
				return is_9_;
			}
			if (5000 == i && 1604918181 * anInt563 > 0) {
				if (i_8_ == 0) {
					throw new IllegalStateException();
				}
				final byte[] is_10_ = aByteArrayArray566[(anInt563 -= 1663325229) * 1604918181];
				aByteArrayArray566[anInt563 * 1604918181] = null;
				return is_10_;
			}
			if (30000 == i) {
				if (i_8_ == 0) {
					throw new IllegalStateException();
				}
				if (anInt564 * 967989589 > 0) {
					if (i_8_ == 0) {
						throw new IllegalStateException();
					}
					final byte[] is_11_ = aByteArrayArray567[(anInt564 -= 1057676285) * 967989589];
					aByteArrayArray567[967989589 * anInt564] = null;
					return is_11_;
				}
			}
			is = new byte[i];
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dc.i()");
		}
		return is;
	}

	public static String method357(final CharSequence charsequence, final int i) {
		String string;
		try {
			string = Class91_Sub7.method623('*', charsequence.length(), (byte) 4);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dc.k()");
		}
		return string;
	}

	public static String method358(final byte[] is, final int i, final int i_12_, final int i_13_) {
		String string;
		try {
			final char[] cs = new char[i_12_];
			int i_14_ = 0;
			int i_15_ = i;
			final int i_16_ = i_12_ + i;
			while (i_15_ < i_16_) {
				final int i_17_ = is[i_15_++] & 0xff;
				int i_18_;
				if (i_17_ < 128) {
					if (i_17_ == 0) {
						i_18_ = 65533;
					} else {
						i_18_ = i_17_;
					}
				} else if (i_17_ < 192) {
					i_18_ = 65533;
				} else if (i_17_ < 224) {
					if (i_15_ < i_16_ && (is[i_15_] & 0xc0) == 128) {
						i_18_ = (i_17_ & 0x1f) << 6 | is[i_15_++] & 0x3f;
						if (i_18_ < 128) {
							i_18_ = 65533;
						}
					} else {
						i_18_ = 65533;
					}
				} else if (i_17_ < 240) {
					if (i_15_ + 1 < i_16_ && 128 == (is[i_15_] & 0xc0) && 128 == (is[i_15_ + 1] & 0xc0)) {
						i_18_ = (i_17_ & 0xf) << 12 | (is[i_15_++] & 0x3f) << 6 | is[i_15_++] & 0x3f;
						if (i_18_ < 2048) {
							i_18_ = 65533;
						}
					} else {
						i_18_ = 65533;
					}
				} else if (i_17_ < 248) {
					if (2 + i_15_ < i_16_ && 128 == (is[i_15_] & 0xc0) && (is[i_15_ + 1] & 0xc0) == 128 && (is[2 + i_15_] & 0xc0) == 128) {
						i_18_ = (i_17_ & 0x7) << 18 | (is[i_15_++] & 0x3f) << 12 | (is[i_15_++] & 0x3f) << 6 | is[i_15_++] & 0x3f;
						if (i_18_ >= 65536 && i_18_ <= 1114111) {
							i_18_ = 65533;
						} else {
							i_18_ = 65533;
						}
					} else {
						i_18_ = 65533;
					}
				} else {
					i_18_ = 65533;
				}
				cs[i_14_++] = (char) i_18_;
			}
			string = new String(cs, 0, i_14_);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dc.i()");
		}
		return string;
	}
}
