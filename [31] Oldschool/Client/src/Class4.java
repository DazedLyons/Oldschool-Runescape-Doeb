/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

public class Class4 {
	long aLong51;
	byte[] aByteArray52;
	Class2 aClass2_53;
	int anInt54;
	byte[] aByteArray55;
	long aLong56;
	int anInt57;
	long aLong58;
	long aLong59;
	long aLong60;
	long aLong61;
	static final int anInt62 = 44;
	static int anInt63;
	public static final int anInt64 = 101;
	public static final int anInt65 = 42;
	public static final int anInt66 = 75;

	public static final boolean method88(final String string, final String string_0_, final String string_1_, final String string_2_, final byte i) {
		try {
			if (string != null) {
				if (i >= 0) {
					throw new IllegalStateException();
				}
				if (string_1_ != null) {
					if (!string.startsWith("#")) {
						if (i >= 0) {
							throw new IllegalStateException();
						}
						if (!string_1_.startsWith("#")) {
							return string_0_.equals(string_2_);
						}
						if (i >= 0) {
							throw new IllegalStateException();
						}
					}
					return string.equals(string_1_);
				}
				if (i >= 0) {
					throw new IllegalStateException();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ah.i()");
		}
		return false;
	}

	public void method89(final byte i) throws IOException {
		try {
			method97(1825286963);
			this.aClass2_53.method87((byte) -2);
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "ah.i()");
		}
	}

	public void method90(final long l) throws IOException {
		try {
			if (l < 0L) {
				throw new IOException("");
			}
			this.aLong58 = -5824319593683666823L * l;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "ah.w()");
		}
	}

	public long method91(final int i) {
		long l;
		try {
			l = -6974766057909144977L * this.aLong51;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ah.f()");
		}
		return l;
	}

	static final int method92(final int i, final int i_3_, final int i_4_, final int i_5_) {
		try {
			final int i_6_ = i >> 7;
			final int i_7_ = i_3_ >> 7;
			if (i_6_ >= 0 && i_7_ >= 0 && i_6_ <= 103 && i_7_ <= 103) {
				int i_8_ = i_4_;
				if (i_4_ < 3 && 2 == (Class102.aByteArrayArrayArray1299[1][i_6_][i_7_] & 0x2)) {
					i_8_ = i_4_ + 1;
				}
				final int i_9_ = i & 0x7f;
				final int i_10_ = i_3_ & 0x7f;
				final int i_11_ = Class102.anIntArrayArrayArray1292[i_8_][i_6_][i_7_] * (128 - i_9_) + Class102.anIntArrayArrayArray1292[i_8_][i_6_ + 1][i_7_] * i_9_ >> 7;
				final int i_12_ = Class102.anIntArrayArrayArray1292[i_8_][i_6_][i_7_ + 1] * (128 - i_9_) + i_9_ * Class102.anIntArrayArrayArray1292[i_8_][i_6_ + 1][i_7_ + 1] >> 7;
				return (128 - i_10_) * i_11_ + i_10_ * i_12_ >> 7;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "ah.ar()");
		}
		return 0;
	}

	public void method93(final byte[] is, int i, int i_13_, final int i_14_) throws IOException {
		try {
			try {
				if (i_13_ + i > is.length) {
					throw new ArrayIndexOutOfBoundsException(i_13_ + i - is.length);
				}
				if (this.aLong60 * -1763900121741353539L != -1L && -8457656801214221879L * this.aLong58 >= this.aLong60 * -1763900121741353539L && this.aLong58 * -8457656801214221879L + i_13_ <= this.aLong60 * -1763900121741353539L + -1191237939 * this.anInt57) {
					System.arraycopy(this.aByteArray55, (int) (-8457656801214221879L * this.aLong58 - -1763900121741353539L * this.aLong60), is, i, i_13_);
					this.aLong58 += i_13_ * -5824319593683666823L;
					return;
				}
				final long l = -8457656801214221879L * this.aLong58;
				final int i_15_ = i_13_;
				if (-8457656801214221879L * this.aLong58 >= this.aLong56 * 1507913309884370855L) {
					if (i_14_ >= 2041825765) {
						return;
					}
					if (this.aLong58 * -8457656801214221879L < this.anInt54 * 1137511881 + 1507913309884370855L * this.aLong56) {
						int i_16_ = (int) (this.anInt54 * 1137511881 - (-8457656801214221879L * this.aLong58 - this.aLong56 * 1507913309884370855L));
						if (i_16_ > i_13_) {
							i_16_ = i_13_;
						}
						System.arraycopy(this.aByteArray52, (int) (-8457656801214221879L * this.aLong58 - 1507913309884370855L * this.aLong56), is, i, i_16_);
						this.aLong58 += -5824319593683666823L * i_16_;
						i += i_16_;
						i_13_ -= i_16_;
					}
				}
				if (i_13_ > this.aByteArray52.length) {
					this.aClass2_53.method82(-8457656801214221879L * this.aLong58);
					this.aLong61 = -6297824948385556053L * this.aLong58;
					int i_17_;
					for (/**/; i_13_ > 0; i_13_ -= i_17_) {
						i_17_ = this.aClass2_53.method86(is, i, i_13_, -1114471681);
						if (i_17_ == -1) {
							break;
						}
						this.aLong61 += -621057865159325229L * i_17_;
						this.aLong58 += i_17_ * -5824319593683666823L;
						i += i_17_;
					}
				} else if (i_13_ > 0) {
					if (i_14_ >= 2041825765) {
						return;
					}
					method94(2102639210);
					int i_18_ = i_13_;
					if (i_13_ > this.anInt54 * 1137511881) {
						i_18_ = 1137511881 * this.anInt54;
					}
					System.arraycopy(this.aByteArray52, 0, is, i, i_18_);
					i += i_18_;
					i_13_ -= i_18_;
					this.aLong58 += -5824319593683666823L * i_18_;
				}
				if (-1L != -1763900121741353539L * this.aLong60) {
					if (this.aLong60 * -1763900121741353539L > this.aLong58 * -8457656801214221879L && i_13_ > 0) {
						int i_19_ = i + (int) (-1763900121741353539L * this.aLong60 - -8457656801214221879L * this.aLong58);
						if (i_19_ > i_13_ + i) {
							if (i_14_ >= 2041825765) {
								return;
							}
							i_19_ = i_13_ + i;
						}
						while (i < i_19_) {
							is[i++] = (byte) 0;
							i_13_--;
							this.aLong58 += -5824319593683666823L;
						}
					}
					long l_20_ = -1L;
					long l_21_ = -1L;
					if (this.aLong60 * -1763900121741353539L >= l && this.aLong60 * -1763900121741353539L < i_15_ + l) {
						l_20_ = -1763900121741353539L * this.aLong60;
					} else if (l >= -1763900121741353539L * this.aLong60 && l < -1191237939 * this.anInt57 + -1763900121741353539L * this.aLong60) {
						l_20_ = l;
					}
					if (-1763900121741353539L * this.aLong60 + this.anInt57 * -1191237939 > l && this.anInt57 * -1191237939 + -1763900121741353539L * this.aLong60 <= l + i_15_) {
						l_21_ = -1763900121741353539L * this.aLong60 + this.anInt57 * -1191237939;
					} else if (i_15_ + l > this.aLong60 * -1763900121741353539L && i_15_ + l <= -1191237939 * this.anInt57 + -1763900121741353539L * this.aLong60) {
						l_21_ = i_15_ + l;
					}
					if (l_20_ > -1L && l_21_ > l_20_) {
						final int i_22_ = (int) (l_21_ - l_20_);
						System.arraycopy(this.aByteArray55, (int) (l_20_ - -1763900121741353539L * this.aLong60), is, i + (int) (l_20_ - l), i_22_);
						if (l_21_ > -8457656801214221879L * this.aLong58) {
							if (i_14_ >= 2041825765) {
								return;
							}
							i_13_ -= l_21_ - this.aLong58 * -8457656801214221879L;
							this.aLong58 = l_21_ * -5824319593683666823L;
						}
					}
				}
			} catch (final IOException ioexception) {
				this.aLong61 = 621057865159325229L;
				throw ioexception;
			}
			if (i_13_ > 0) {
				throw new EOFException();
			}
		} catch (final RuntimeException var15) {
			throw Class102.method1086(var15, "ah.t()");
		}
	}

	void method94(final int i) throws IOException {
		try {
			this.anInt54 = 0;
			if (this.aLong58 * -8457656801214221879L != this.aLong61 * 160704439327979099L) {
				this.aClass2_53.method82(-8457656801214221879L * this.aLong58);
				this.aLong61 = -6297824948385556053L * this.aLong58;
			}
			this.aLong56 = this.aLong58 * -1276477148460343025L;
			int i_23_;
			for (/**/; 1137511881 * this.anInt54 < this.aByteArray52.length; this.anInt54 += i_23_ * -515990407) {
				i_23_ = this.aClass2_53.method86(this.aByteArray52, 1137511881 * this.anInt54, this.aByteArray52.length - this.anInt54 * 1137511881, -1114471681);
				if (i_23_ == -1) {
					if (i != 2102639210) {
						throw new IllegalStateException();
					}
					break;
				}
				this.aLong61 += i_23_ * -621057865159325229L;
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "ah.d()");
		}
	}

	public void method95(final byte[] is, int i, int i_24_, final int i_25_) throws IOException {
		try {
			try {
				if (this.aLong58 * -8457656801214221879L + i_24_ > -6974766057909144977L * this.aLong51) {
					this.aLong51 = (i_24_ + -8457656801214221879L * this.aLong58) * 160024902198619279L;
				}
				if (-1L != this.aLong60 * -1763900121741353539L && (this.aLong58 * -8457656801214221879L < this.aLong60 * -1763900121741353539L || this.aLong58 * -8457656801214221879L > -1763900121741353539L * this.aLong60 + this.anInt57 * -1191237939)) {
					method97(65258281);
				}
				if (-1L != -1763900121741353539L * this.aLong60) {
					if (i_25_ <= -393490213) {
						return;
					}
					if (-8457656801214221879L * this.aLong58 + i_24_ > this.aByteArray55.length + -1763900121741353539L * this.aLong60) {
						if (i_25_ <= -393490213) {
							return;
						}
						final int i_26_ = (int) (this.aByteArray55.length - (-8457656801214221879L * this.aLong58 - this.aLong60 * -1763900121741353539L));
						System.arraycopy(is, i, this.aByteArray55, (int) (this.aLong58 * -8457656801214221879L - this.aLong60 * -1763900121741353539L), i_26_);
						this.aLong58 += i_26_ * -5824319593683666823L;
						i += i_26_;
						i_24_ -= i_26_;
						this.anInt57 = this.aByteArray55.length * -1037486587;
						method97(1808573373);
					}
				}
				if (i_24_ > this.aByteArray55.length) {
					if (this.aLong58 * -8457656801214221879L != this.aLong61 * 160704439327979099L) {
						this.aClass2_53.method82(this.aLong58 * -8457656801214221879L);
						this.aLong61 = this.aLong58 * -6297824948385556053L;
					}
					this.aClass2_53.method81(is, i, i_24_, -35665545);
					this.aLong61 += i_24_ * -621057865159325229L;
					if (this.aLong61 * 160704439327979099L > 5175186755617944099L * this.aLong59) {
						if (i_25_ <= -393490213) {
							return;
						}
						this.aLong59 = 2783122910866580073L * this.aLong61;
					}
					long l = -1L;
					long l_27_ = -1L;
					if (-8457656801214221879L * this.aLong58 >= 1507913309884370855L * this.aLong56 && this.aLong58 * -8457656801214221879L < 1137511881 * this.anInt54 + 1507913309884370855L * this.aLong56) {
						l = -8457656801214221879L * this.aLong58;
					} else if (1507913309884370855L * this.aLong56 >= this.aLong58 * -8457656801214221879L && 1507913309884370855L * this.aLong56 < -8457656801214221879L * this.aLong58 + i_24_) {
						l = 1507913309884370855L * this.aLong56;
					}
					if (this.aLong58 * -8457656801214221879L + i_24_ > 1507913309884370855L * this.aLong56 && i_24_ + -8457656801214221879L * this.aLong58 <= this.aLong56 * 1507913309884370855L + this.anInt54 * 1137511881) {
						l_27_ = i_24_ + this.aLong58 * -8457656801214221879L;
					} else if (this.anInt54 * 1137511881 + 1507913309884370855L * this.aLong56 > this.aLong58 * -8457656801214221879L) {
						if (i_25_ <= -393490213) {
							return;
						}
						if (this.aLong56 * 1507913309884370855L + 1137511881 * this.anInt54 <= i_24_ + this.aLong58 * -8457656801214221879L) {
							if (i_25_ <= -393490213) {
								return;
							}
							l_27_ = this.anInt54 * 1137511881 + 1507913309884370855L * this.aLong56;
						}
					}
					if (l > -1L && l_27_ > l) {
						if (i_25_ <= -393490213) {
							return;
						}
						final int i_28_ = (int) (l_27_ - l);
						System.arraycopy(is, (int) (i + l - this.aLong58 * -8457656801214221879L), this.aByteArray52, (int) (l - this.aLong56 * 1507913309884370855L), i_28_);
					}
					this.aLong58 += i_24_ * -5824319593683666823L;
				} else if (i_24_ > 0 && i_25_ > -393490213) {
					if (-1L == this.aLong60 * -1763900121741353539L) {
						this.aLong60 = 1887572202282608381L * this.aLong58;
					}
					System.arraycopy(is, i, this.aByteArray55, (int) (this.aLong58 * -8457656801214221879L - -1763900121741353539L * this.aLong60), i_24_);
					this.aLong58 += -5824319593683666823L * i_24_;
					if (this.aLong58 * -8457656801214221879L - this.aLong60 * -1763900121741353539L > -1191237939 * this.anInt57) {
						this.anInt57 = (int) (-8457656801214221879L * this.aLong58 - -1763900121741353539L * this.aLong60) * -1037486587;
					}
				}
			} catch (final IOException ioexception) {
				this.aLong61 = 621057865159325229L;
				throw ioexception;
			}
		} catch (final RuntimeException var11) {
			throw Class102.method1086(var11, "ah.p()");
		}
	}

	public void method96(final byte[] is, final byte i) throws IOException {
		try {
			method93(is, 0, is.length, -1756667942);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "ah.e()");
		}
	}

	void method97(final int i) throws IOException {
		try {
			if (-1L != this.aLong60 * -1763900121741353539L) {
				if (this.aLong60 * -1763900121741353539L != this.aLong61 * 160704439327979099L) {
					this.aClass2_53.method82(-1763900121741353539L * this.aLong60);
					this.aLong61 = this.aLong60 * 9031744626825488327L;
				}
				this.aClass2_53.method81(this.aByteArray55, 0, -1191237939 * this.anInt57, 2056701436);
				this.aLong61 += this.anInt57 * -9072231104023859209L;
				if (160704439327979099L * this.aLong61 > this.aLong59 * 5175186755617944099L) {
					if (i <= -1261545312) {
						return;
					}
					this.aLong59 = 2783122910866580073L * this.aLong61;
				}
				long l = -1L;
				long l_29_ = -1L;
				if (-1763900121741353539L * this.aLong60 >= 1507913309884370855L * this.aLong56 && -1763900121741353539L * this.aLong60 < this.anInt54 * 1137511881 + 1507913309884370855L * this.aLong56) {
					l = this.aLong60 * -1763900121741353539L;
				} else if (this.aLong56 * 1507913309884370855L >= this.aLong60 * -1763900121741353539L && 1507913309884370855L * this.aLong56 < -1191237939 * this.anInt57 + this.aLong60 * -1763900121741353539L) {
					l = 1507913309884370855L * this.aLong56;
				}
				do {
					if (-1763900121741353539L * this.aLong60 + this.anInt57 * -1191237939 > this.aLong56 * 1507913309884370855L) {
						if (i <= -1261545312) {
							return;
						}
						if (-1191237939 * this.anInt57 + this.aLong60 * -1763900121741353539L <= this.anInt54 * 1137511881 + this.aLong56 * 1507913309884370855L) {
							l_29_ = this.anInt57 * -1191237939 + this.aLong60 * -1763900121741353539L;
							break;
						}
					}
					if (this.anInt54 * 1137511881 + 1507913309884370855L * this.aLong56 > this.aLong60 * -1763900121741353539L && 1507913309884370855L * this.aLong56 + this.anInt54 * 1137511881 <= this.aLong60 * -1763900121741353539L + -1191237939 * this.anInt57) {
						l_29_ = 1137511881 * this.anInt54 + 1507913309884370855L * this.aLong56;
					}
				} while (false);
				if (l > -1L && l_29_ > l) {
					final int i_30_ = (int) (l_29_ - l);
					System.arraycopy(this.aByteArray55, (int) (l - this.aLong60 * -1763900121741353539L), this.aByteArray52, (int) (l - 1507913309884370855L * this.aLong56), i_30_);
				}
				this.aLong60 = 4187836571424160363L;
				this.anInt57 = 0;
			}
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "ah.k()");
		}
	}

	public Class4(final Class2 class2, final int i, final int i_31_) throws IOException {
		try {
			this.aLong56 = 8508280799298721769L;
			this.aLong60 = 4187836571424160363L;
			this.anInt57 = 0;
			this.aClass2_53 = class2;
			this.aLong51 = (this.aLong59 = class2.method85((byte) -14) * 883058494089416075L) * 298719024895722893L;
			this.aByteArray52 = new byte[i];
			this.aByteArray55 = new byte[i_31_];
			this.aLong58 = 0L;
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "ah.<init>()");
		}
	}

	static Class26 method98(final byte i) {
		Class26_Sub1 class26_sub1;
		do {
			try {
				Class26_Sub2 class26_sub2;
				try {
					class26_sub2 = new Class26_Sub2();
				} catch (final Throwable throwable) {
					class26_sub1 = new Class26_Sub1();
					break;
				}
				return class26_sub2;
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "ah.k()");
			}
		} while (false);
		return class26_sub1;
	}

	static void method99(final String string, final String string_32_, final String string_33_, final int i) {
		try {
			Class101.aString1255 = string;
			Class101.aString1275 = string_32_;
			Class101.aString1286 = string_33_;
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "ah.f()");
		}
	}
}
