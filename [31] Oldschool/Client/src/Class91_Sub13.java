/* Class91_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub13 extends Class91 {
	String aString1892;
	static final int anInt1893 = 1;
	static final int anInt1894 = 2;
	static final int anInt1895 = 4;
	int anInt1896;
	static final int anInt1897 = 6;
	static final int anInt1898 = 1;
	static final int anInt1899 = 2;
	static final int anInt1900 = 22;
	static final int anInt1901 = 5;
	int anInt1902;
	static final int anInt1903 = 7;
	int anInt1904;
	String aString1905;
	static final int anInt1906 = 20;
	int anInt1907;
	int anInt1908;
	int anInt1909;
	boolean aBoolean1910;
	String aString1911;
	int anInt1912;
	int anInt1913;
	int anInt1914;
	String aString1915;
	boolean aBoolean1916;
	int anInt1917;
	String aString1918;
	int anInt1919;
	int anInt1920;
	int anInt1921;
	int anInt1922;
	static final int anInt1923 = 3;
	String aString1924;
	int[] anIntArray1925;
	int anInt1926;

	void method704(final int i) {
		try {
			if (this.aString1915.length() > 40) {
				this.aString1915 = this.aString1915.substring(0, 40);
			}
			if (this.aString1892.length() > 40) {
				this.aString1892 = this.aString1892.substring(0, 40);
			}
			if (this.aString1905.length() > 10) {
				this.aString1905 = this.aString1905.substring(0, 10);
			}
			if (this.aString1918.length() > 10) {
				this.aString1918 = this.aString1918.substring(0, 10);
			}
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "en.i()");
		}
	}

	public void method705(final ByteBuffer class91_sub9, final int i) {
		try {
			class91_sub9.writeWordBigEndian(6);
			class91_sub9.writeWordBigEndian(this.anInt1917 * -851566347);
			int i_0_;
			if (this.aBoolean1916) {
				if (i >= 777859439) {
					return;
				}
				i_0_ = 1;
			} else {
				i_0_ = 0;
			}
			class91_sub9.writeWordBigEndian(i_0_);
			class91_sub9.writeWordBigEndian(-1658732663 * this.anInt1914);
			class91_sub9.writeWordBigEndian(685837909 * this.anInt1904);
			class91_sub9.writeWordBigEndian(-773984665 * this.anInt1907);
			class91_sub9.writeWordBigEndian(-1592045051 * this.anInt1908);
			class91_sub9.writeWordBigEndian(2073105753 * this.anInt1909);
			if (this.aBoolean1910) {
				if (i >= 777859439) {
					return;
				}
				i_0_ = 1;
			} else {
				i_0_ = 0;
			}
			class91_sub9.writeWordBigEndian(i_0_);
			class91_sub9.method681(this.anInt1913 * -1735788417, -372694149);
			class91_sub9.writeWordBigEndian(-93572037 * this.anInt1912);
			class91_sub9.method672(-1295616499 * this.anInt1896, (byte) 56);
			class91_sub9.method681(-1730184651 * this.anInt1902, -372694149);
			class91_sub9.method635(this.aString1915, (byte) -1);
			class91_sub9.method635(this.aString1892, (byte) -115);
			class91_sub9.method635(this.aString1905, (byte) -26);
			class91_sub9.method635(this.aString1918, (byte) 116);
			class91_sub9.writeWordBigEndian(1962544379 * this.anInt1920);
			class91_sub9.method681(-925923035 * this.anInt1919, -372694149);
			class91_sub9.method635(this.aString1911, (byte) 14);
			class91_sub9.method635(this.aString1924, (byte) -5);
			class91_sub9.writeWordBigEndian(-428076807 * this.anInt1921);
			class91_sub9.writeWordBigEndian(this.anInt1922 * -1985786693);
			int[] is;
			final int i_1_ = (is = this.anIntArray1925).length;
			for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
				final int i_3_ = is[i_2_];
				class91_sub9.writeDWord(i_3_);
			}
			class91_sub9.writeDWord(this.anInt1926 * -1937825681);
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "en.w()");
		}
	}

	public int method706(final int i) {
		int i_4_;
		try {
			int i_6_ = 38 + Class56.method385(this.aString1915, (short) 31657);
			i_6_ += Class56.method385(this.aString1892, (short) 30338);
			i_6_ += Class56.method385(this.aString1905, (short) 29313);
			i_6_ += Class56.method385(this.aString1918, (short) 5765);
			i_6_ += Class56.method385(this.aString1911, (short) 8026);
			i_6_ += Class56.method385(this.aString1924, (short) 12210);
			i_4_ = i_6_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "en.f()");
		}
		return i_4_;
	}

	public Class91_Sub13(final boolean bool) {
		try {
			this.anIntArray1925 = new int[3];
			if (bool) {
				if (Class103.aString1323.startsWith("win")) {
					this.anInt1917 = -121271459;
				} else if (Class103.aString1323.startsWith("mac")) {
					this.anInt1917 = -242542918;
				} else if (Class103.aString1323.startsWith("linux")) {
					this.anInt1917 = -363814377;
				} else {
					this.anInt1917 = -485085836;
				}
				String string;
				try {
					string = System.getProperty("os.arch").toLowerCase();
				} catch (final Exception exception) {
					string = "";
				}
				String string_7_;
				try {
					string_7_ = System.getProperty("os.version").toLowerCase();
				} catch (final Exception exception) {
					string_7_ = "";
				}
				String string_8_ = "Unknown";
				String string_9_ = "1.1";
				try {
					string_8_ = System.getProperty("java.vendor");
					string_9_ = System.getProperty("java.version");
				} catch (final Exception exception) {
					/* empty */
				}
				if (!string.startsWith("amd64") && !string.startsWith("x86_64")) {
					this.aBoolean1916 = false;
				} else {
					this.aBoolean1916 = true;
				}
				if (this.anInt1917 * -851566347 == 1) {
					if (string_7_.indexOf("4.0") != -1) {
						this.anInt1914 = 2129422009;
					} else if (string_7_.indexOf("4.1") != -1) {
						this.anInt1914 = -36123278;
					} else if (string_7_.indexOf("4.9") != -1) {
						this.anInt1914 = 2093298731;
					} else if (string_7_.indexOf("5.0") != -1) {
						this.anInt1914 = -72246556;
					} else if (string_7_.indexOf("5.1") != -1) {
						this.anInt1914 = 2057175453;
					} else if (string_7_.indexOf("5.2") != -1) {
						this.anInt1914 = -144493112;
					} else if (string_7_.indexOf("6.0") != -1) {
						this.anInt1914 = -108369834;
					} else if (string_7_.indexOf("6.1") != -1) {
						this.anInt1914 = 2021052175;
					} else if (string_7_.indexOf("6.2") != -1) {
						this.anInt1914 = 1984928897;
					}
				} else if (2 == -851566347 * this.anInt1917) {
					if (string_7_.indexOf("10.4") != -1) {
						this.anInt1914 = -361232780;
					} else if (string_7_.indexOf("10.5") != -1) {
						this.anInt1914 = 1768189229;
					} else if (string_7_.indexOf("10.6") != -1) {
						this.anInt1914 = -397356058;
					} else if (string_7_.indexOf("10.7") != -1) {
						this.anInt1914 = 1732065951;
					}
				}
				if (string_8_.toLowerCase().indexOf("sun") != -1) {
					this.anInt1904 = 2070642429;
				} else if (string_8_.toLowerCase().indexOf("microsoft") != -1) {
					this.anInt1904 = -153682438;
				} else if (string_8_.toLowerCase().indexOf("apple") != -1) {
					this.anInt1904 = 1916959991;
				} else {
					this.anInt1904 = -307364876;
				}
				int i = 2;
				int i_10_ = 0;
				try {
					for (/**/; i < string_9_.length(); i++) {
						final int i_11_ = string_9_.charAt(i);
						if (i_11_ < 48 || i_11_ > 57) {
							break;
						}
						i_10_ = 10 * i_10_ + i_11_ - 48;
					}
				} catch (final Exception exception) {
					/* empty */
				}
				this.anInt1907 = i_10_ * -1832301225;
				i = string_9_.indexOf('.', 2) + 1;
				i_10_ = 0;
				try {
					for (/**/; i < string_9_.length(); i++) {
						final int i_12_ = string_9_.charAt(i);
						if (i_12_ < 48 || i_12_ > 57) {
							break;
						}
						i_10_ = i_10_ * 10 + i_12_ - 48;
					}
				} catch (final Exception exception) {
					/* empty */
				}
				this.anInt1908 = 243837645 * i_10_;
				i = string_9_.indexOf('_', 4) + 1;
				i_10_ = 0;
				try {
					for (/**/; i < string_9_.length(); i++) {
						final int i_13_ = string_9_.charAt(i);
						if (i_13_ < 48 || i_13_ > 57) {
							break;
						}
						i_10_ = 10 * i_10_ + i_13_ - 48;
					}
				} catch (final Exception exception) {
					/* empty */
				}
				this.anInt1909 = -2104237335 * i_10_;
				this.aBoolean1910 = false;
				this.anInt1913 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -1826764929;
				if (this.anInt1907 * -773984665 > 3) {
					this.anInt1912 = Runtime.getRuntime().availableProcessors() * 1196721395;
				} else {
					this.anInt1912 = 0;
				}
				this.anInt1896 = 0;
			}
			if (this.aString1915 == null) {
				this.aString1915 = "";
			}
			if (this.aString1892 == null) {
				this.aString1892 = "";
			}
			if (this.aString1905 == null) {
				this.aString1905 = "";
			}
			if (this.aString1918 == null) {
				this.aString1918 = "";
			}
			if (this.aString1911 == null) {
				this.aString1911 = "";
			}
			if (this.aString1924 == null) {
				this.aString1924 = "";
			}
			method704(-1168719008);
		} catch (final RuntimeException var15) {
			throw Class102.method1086(var15, "en.<init>()");
		}
	}

	static final boolean method707(final int i, final byte i_14_) {
		boolean bool;
		try {
			if (i < 0) {
				return false;
			}
			int i_15_ = client.anIntArray1588[i];
			if (i_15_ >= 2000) {
				i_15_ -= 2000;
			}
			if (i_15_ == 1007) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "en.bq()");
		}
		return bool;
	}

	public static int method708(final int i, final int i_16_, final byte i_17_) {
		int i_18_;
		try {
			final int i_19_ = i >>> 31;
			i_18_ = (i_19_ + i) / i_16_ - i_19_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "en.t()");
		}
		return i_18_;
	}
}
