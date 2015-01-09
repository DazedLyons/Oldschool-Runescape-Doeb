/* Class91_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class ByteBuffer extends Class91 {
	static int[] anIntArray1856 = new int[256];

	static {
		
		for (int i = 0; i < 256; i++) {
			int i_0_ = i;
			for (int i_1_ = 0; i_1_ < 8; i_1_++) {
				if (1 == (i_0_ & 0x1)) {
					i_0_ = i_0_ >>> 1 ^ ~0x12477cdf;
				} else {
					i_0_ >>>= 1;
				}
			}
			anIntArray1856[i] = i_0_;
		}
	}

	public void method403(int j) {
		buffer[currentOffset++] = (byte)j;
		buffer[currentOffset++] = (byte)(j >> 8);
		buffer[currentOffset++] = (byte)(j >> 16);
		buffer[currentOffset++] = (byte)(j >> 24);
			
	}

	public void writeWordBigEndian(int i) {
			buffer[currentOffset++] = (byte) i;
	}

	public void writeDWord(int i) {
			buffer[(currentOffset ++) - 1] = (byte) (i >> 24);
			buffer[(currentOffset ++) - 1] = (byte) (i >> 16);
			buffer[(currentOffset ++) - 1] = (byte) (i >> 8);
			buffer[(currentOffset ++) - 1] = (byte) i;
	}

	public void writeQWord(long l) {
		try {
			buffer[(currentOffset ++) - 1] = (byte) (int) (l >> 56);
			buffer[(currentOffset ++) - 1] = (byte) (int) (l >> 48);
			buffer[(currentOffset ++) - 1] = (byte) (int) (l >> 40);
			buffer[(currentOffset ++) - 1] = (byte) (int) (l >> 32);
			buffer[(currentOffset ++) - 1] = (byte) (int) (l >> 24);
			buffer[(currentOffset ++) - 1] = (byte) (int) (l >> 16);
			buffer[(currentOffset ++) - 1] = (byte) (int) (l >> 8);
			buffer[(currentOffset ++) - 1] = (byte) (int) l;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.ak()");
		}
	}

	public void method634(final String string, final byte i) {
		try {
			final int i_5_ = string.indexOf('\0');
			if (i_5_ >= 0) {
				if (i <= 0) {
					throw new IllegalStateException();
				}
				throw new IllegalArgumentException("");
			}
			currentOffset += Class25.method240(string, 0, string.length(), buffer, currentOffset, -1287953055) * 565881095;
			buffer[(currentOffset ++) - 1] = (byte) 0;
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "dz.ax()");
		}
	}

	public void method635(final String string, final byte i) {
		try {
			final int i_6_ = string.indexOf('\0');
			if (i_6_ >= 0) {
				throw new IllegalArgumentException("");
			}
			buffer[(currentOffset ++) - 1] = (byte) 0;
			currentOffset += Class25.method240(string, 0, string.length(), buffer, currentOffset, 1362629731) * 565881095;
			buffer[(currentOffset ++) - 1] = (byte) 0;
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "dz.af()");
		}
	}

	public void method636(final CharSequence charsequence, final int i) {
		try {
			final int i_7_ = charsequence.length();
			int i_8_ = 0;
			for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
				final char c = charsequence.charAt(i_9_);
				if (c <= '\u007f') {
					i_8_++;
				} else if (c <= '\u07ff') {
					i_8_ += 2;
				} else {
					i_8_ += 3;
				}
			}
			buffer[(currentOffset ++) - 1] = (byte) 0;
			method640(i_8_, (byte) -14);
			i_8_ = currentOffset;
			final byte[] is = buffer;
			final int i_10_ =  currentOffset;
			final int i_11_ = charsequence.length();
			int i_12_ = i_10_;
			for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
				final int i_14_ = charsequence.charAt(i_13_);
				if (i_14_ <= 127) {
					is[i_12_++] = (byte) i_14_;
				} else if (i_14_ <= 2047) {
					is[i_12_++] = (byte) (0xc0 | i_14_ >> 6);
					is[i_12_++] = (byte) (0x80 | i_14_ & 0x3f);
				} else {
					is[i_12_++] = (byte) (0xe0 | i_14_ >> 12);
					is[i_12_++] = (byte) (0x80 | i_14_ >> 6 & 0x3f);
					is[i_12_++] = (byte) (0x80 | i_14_ & 0x3f);
				}
			}
			final int i_15_ = i_12_ - i_10_;
			currentOffset = 565881095 * i_15_ + i_8_;
		} catch (final RuntimeException var13) {
			throw Class102.method1086(var13, "dz.ai()");
		}
	}

	public void writeWord(int i) {
			buffer[currentOffset - i - 2] = (byte) (i >> 8);
			buffer[currentOffset - i - 1] = (byte) i;
	}

	public void method638(final int i, final byte i_17_) {
		try {
			buffer[currentOffset - i - 1] = (byte) i;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dz.al()");
		}
	}

	public void method639(final int i, final byte i_18_) {
		try {
			if (i >= 0 && i < 128) {
				if (i_18_ != 1) {
					writeWordBigEndian(i);
				}
			} else if (i >= 0 && i < 32768) {
				method681(i + 32768, -372694149);
			} else {
				throw new IllegalArgumentException();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.ag()");
		}
	}

	public void method640(final int i, final byte i_19_) {
		try {
			if ((i & ~0x7f) != 0) {
				if ((i & ~0x3fff) != 0) {
					if (i_19_ >= 17) {
						return;
					}
					if ((i & ~0x1fffff) != 0) {
						if ((i & ~0xfffffff) != 0) {
							writeWordBigEndian(i >>> 28 | 0x80);
						}
						writeWordBigEndian(i >>> 21 | 0x80);
					}
					writeWordBigEndian(i >>> 14 | 0x80);
				}
				writeWordBigEndian(i >>> 7 | 0x80);
			}
			writeWordBigEndian(i & 0x7f);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dz.ap()");
		}
	}

	public void method641(final int i, final int i_20_) {
		try {
			buffer[(currentOffset ++) - 1] = (byte) (i + 128);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dz.bw()");
		}
	}

	public byte method642(final int i) {
		byte i_21_;
		try {
			i_21_ = buffer[(currentOffset ++) - 1];
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.as()");
		}
		return i_21_;
	}

	public int readShort2() {
			currentOffset += 2;
			int i = (buffer[currentOffset - 1] & 0xff) 
					+ ((buffer[currentOffset - 2] & 0xff) << 8);
			if (i > 32767) {
				i -= 65536;
			}
			return i;
	}

	public int readDword() {
			currentOffset += 4;
			return  ((buffer[currentOffset - 1] & 0xff)
					+ ((buffer[currentOffset - 2] & 0xff) << 8) 
					+ ((buffer[currentOffset - 3] & 0xff) << 16) 
					+ (buffer[ currentOffset - 4] & 0xff) << 24);
	}

	public String method645(final byte i) {
		try {
			final int i_25_ = currentOffset;
			do {
				if (buffer[(currentOffset ++) - 1] == 0) {
					final int i_26_ = currentOffset - i_25_ - 1;
					if (i_26_ == 0) {
						if (i >= 0) {
							throw new IllegalStateException();
						}
						return "";
					}
					return Class91_Sub10.method697(buffer, i_25_, i_26_, (byte) 16);
				}
			} while (i < 0);
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.bh()");
		}
	}

	public String method646(final byte i) {
		String string;
		try {
			final byte i_27_ = buffer[(currentOffset ++) - 1];
			if (i_27_ != 0) {
				if (i != 0) {
					throw new IllegalStateException();
				}
				throw new IllegalStateException("");
			}
			final int i_28_ = method650(-1327002148);
			if (i_28_ + currentOffset > buffer.length) {
				throw new IllegalStateException("");
			}
			final String string_29_ = Class43.method358(buffer, currentOffset, i_28_, -102849223);
			currentOffset += i_28_ * 565881095;
			string = string_29_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.bn()");
		}
		return string;
	}

	public void method647(final byte[] is, final int i, final int i_30_, final int i_31_) {
		try {
			for (int i_32_ = i; i_32_ < i_30_ + i; i_32_++) {
				if (i_31_ == 711572798) {
					break;
				}
				is[i_32_] = buffer[(currentOffset ++) - 1];
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "dz.bj()");
		}
	}

	public int method648(final byte i) {
		int i_33_;
		try {
			final int i_34_ = buffer[currentOffset] & 0xff;
			if (i_34_ < 128) {
				return readUnsignedByte() - 64;
			}
			i_33_ = method686((byte) -5) - 49152;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.bu()");
		}
		return i_33_;
	}

	public int method649(final int i) {
		int i_35_;
		try {
			final int i_36_ = buffer[currentOffset] & 0xff;
			if (i_36_ < 128) {
				return readUnsignedByte();
			}
			i_35_ = method686((byte) -38) - 32768;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.br()");
		}
		return i_35_;
	}

	public int method650(final int i) {
		int i_37_;
		try {
			int i_38_ = buffer[(currentOffset ++) - 1];
			int i_39_ = 0;
			for (/**/; i_38_ < 0; i_38_ = buffer[(currentOffset ++) - 1]) {
				i_39_ = (i_39_ | i_38_ & 0x7f) << 7;
			}
			i_37_ = i_39_ | i_38_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.bf()");
		}
		return i_37_;
	}

	public void method651(final int[] is, final int i, final int i_40_, final int i_41_) {
		try {
			final int i_42_ = currentOffset;
			currentOffset = 565881095 * i;
			final int i_43_ = (i_40_ - i) / 8;
			for (int i_44_ = 0; i_44_ < i_43_; i_44_++) {
				if (i_41_ != 880379889) {
					return;
				}
				int i_45_ = readDword();
				int i_46_ = readDword();
				int i_47_ = -957401312;
				int i_49_ = 32;
				while (i_49_-- > 0) {
					if (i_41_ != 880379889) {
						return;
					}
					i_46_ -= (i_45_ << 4 ^ i_45_ >>> 5) + i_45_ ^ is[i_47_ >>> 11 & 0x3] + i_47_;
					i_47_ -= -1640531527;
					i_45_ -= (i_46_ << 4 ^ i_46_ >>> 5) + i_46_ ^ is[i_47_ & 0x3] + i_47_;
				}
				currentOffset -= 232081464;
				writeDWord(i_45_);
				writeDWord(i_46_);
			}
			currentOffset = i_42_ * 565881095;
		} catch (final RuntimeException var13) {
			throw Class102.method1086(var13, "dz.bp()");
		}
	}

	public int method652(final int i, final byte i_50_) {
		int i_51_;
		try {
			final int i_52_ = Class91_Sub20_Sub2.method738(buffer, i, currentOffset, -882867145);
			writeDWord(i_52_);
			i_51_ = i_52_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.bc()");
		}
		return i_51_;
	}

	public int readUnsignedByte() {
		return buffer[(currentOffset ++) - 1] & 0xff;
		
	}

	public void method654(final int i, final byte i_54_) {
		try {
			buffer[(currentOffset ++) - 1] = (byte) (0 - i);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dz.bm()");
		}
	}

	public int method655(final int i) {
		int i_55_;
		try {
			i_55_ = buffer[(currentOffset ++) - 1] - 128 & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.bz()");
		}
		return i_55_;
	}

	public int method656(final int i) {
		int i_56_;
		try {
			i_56_ = 128 - buffer[(currentOffset ++) - 1] & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.bq()");
		}
		return i_56_;
	}

	public byte method657(final short i) {
		byte i_57_;
		try {
			i_57_ = (byte) (buffer[(currentOffset ++) - 1] - 128);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.bk()");
		}
		return i_57_;
	}

	public byte method658(final short i) {
		byte i_58_;
		try {
			i_58_ = (byte) (128 - buffer[(currentOffset ++) - 1]);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.bo()");
		}
		return i_58_;
	}

	public void method659(final int i, final byte i_59_) {
		try {
			buffer[(currentOffset ++) - 1] = (byte) i;
			buffer[(currentOffset ++) - 1] = (byte) (i >> 8);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dz.bs()");
		}
	}

	public void method660(final int i, final byte i_60_) {
		try {
			buffer[(currentOffset ++) - 1] = (byte) (i >> 8);
			buffer[(currentOffset ++) - 1] = (byte) (128 + i);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dz.bx()");
		}
	}

	public void method661(final int i, final int i_61_) {
		try {
			buffer[(currentOffset ++) - 1] = (byte) i;
			buffer[(currentOffset ++) - 1] = (byte) (i >> 8);
			buffer[(currentOffset ++) - 1] = (byte) (i >> 16);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dz.ck()");
		}
	}

	public int method662(final int i) {
		int i_62_;
		try {
			currentOffset += 1131762190;
			i_62_ = ((buffer[currentOffset - 1] & 0xff) << 8) 
					+ (buffer[currentOffset - 2] & 0xff);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.be()");
		}
		return i_62_;
	}

	public int method663(final byte i) {
		int i_63_;
		try {
			currentOffset += 1131762190;
			i_63_ = ((buffer[currentOffset - 2] & 0xff) << 8) 
					+ (buffer[currentOffset - 1] - 128 & 0xff);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.bi()");
		}
		return i_63_;
	}

	public boolean method664(final int i) {
		do {
			try {
				currentOffset -= -2031442916;
				final int i_64_ = Class91_Sub20_Sub2.method738(buffer, 0, currentOffset, 827746782);
				final int i_65_ = readDword();
				if (i_65_ != i_64_) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "dz.by()");
			}
			return true;
		} while (false);
		return false;
	}

	public int method665(final int i) {
		int i_66_;
		try {
			if (buffer[currentOffset] < 0) {
				return readDword() & 0x7fffffff;
			}
			i_66_ = method686((byte) -87);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.bd()");
		}
		return i_66_;
	}

	public void method666(final int i, final byte i_67_) {
		try {
			buffer[(currentOffset ++) - 1] = (byte) i;
			buffer[(currentOffset ++) - 1] = (byte) (i >> 8);
			buffer[(currentOffset ++) - 1] = (byte) (i >> 16);
			buffer[(currentOffset ++) - 1] = (byte) (i >> 24);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dz.cq()");
		}
	}

	public void method667(final int i, final int i_68_) {
		try {
			buffer[(currentOffset ++) - 1] = (byte) (i >> 8);
			buffer[(currentOffset ++) - 1] = (byte) i;
			buffer[(currentOffset ++) - 1] = (byte) (i >> 24);
			buffer[(currentOffset ++) - 1] = (byte) (i >> 16);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dz.cg()");
		}
	}

	public void method668(final int i, final byte i_69_) {
		try {
			buffer[(currentOffset ++) - 1] = (byte) (i >> 16);
			buffer[(currentOffset ++) - 1] = (byte) (i >> 24);
			buffer[(currentOffset ++) - 1] = (byte) i;
			buffer[(currentOffset ++) - 1] = (byte) (i >> 8);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dz.ct()");
		}
	}

	public int method669(final int i) {
		int i_70_;
		try {
			currentOffset += -2031442916;
			i_70_ = (buffer[currentOffset - 2] & 0xff) 
					+ ((buffer[currentOffset - 1] & 0xff) << 8) 
					+ ((buffer[currentOffset - 3] & 0xff) << 24) 
					+ ((buffer[currentOffset - 4] & 0xff) << 16);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.cu()");
		}
		return i_70_;
	}

	public int method670(final byte i) {
		int i_71_;
		try {
			currentOffset += 1131762190;
			int i_72_ = (buffer[currentOffset - 2] - 128 & 0xff) 
					+ ((buffer[currentOffset - 1] & 0xff) << 8);
			if (i_72_ > 32767) {
				i_72_ -= 65536;
			}
			i_71_ = i_72_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.ca()");
		}
		return i_71_;
	}

	public ByteBuffer(final byte[] is) {
		try {
			buffer = is;
			currentOffset = 0;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "dz.<init>()");
		}
	}

	public void method671(final BigInteger biginteger, final BigInteger biginteger_73_, final byte i) {
		try {
			final int i_74_ = currentOffset;
			currentOffset = 0;
			final byte[] is = new byte[i_74_];
			method647(is, 0, i_74_, 959567294);
			final BigInteger biginteger_75_ = new BigInteger(is);
			final BigInteger biginteger_76_ = biginteger_75_.modPow(biginteger, biginteger_73_);
			final byte[] is_77_ = biginteger_76_.toByteArray();
			currentOffset = 0;
			method681(is_77_.length, -372694149);
			method685(is_77_, 0, is_77_.length, 1886308211);
		} catch (final RuntimeException var9) {
			throw Class102.method1086(var9, "dz.bb()");
		}
	}

	public void method672(final int i, final byte i_78_) {
		try {
			buffer[(currentOffset ++) - 1] = (byte) (i >> 16);
			buffer[(currentOffset ++) - 1] = (byte) (i >> 8);
			buffer[(currentOffset ++) - 1] = (byte) i;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dz.an()");
		}
	}

	public String method673(final byte i) {
		try {
			final byte i_79_ = buffer[(currentOffset ++) - 1];
			if (i_79_ != 0) {
				throw new IllegalStateException("");
			}
			final int i_80_ = currentOffset;
			do {
				if (buffer[(currentOffset ++) - 1] == 0) {
					final int i_81_ = currentOffset - i_80_ - 1;
					if (i_81_ == 0) {
						return "";
					}
					return Class91_Sub10.method697(buffer, i_80_, i_81_, (byte) 16);
				}
			} while (i == 1);
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.ba()");
		}
	}

	public ByteBuffer(final int i) {
		try {
			buffer = Class43.method356(i, (byte) 44);
			currentOffset = 0;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "dz.<init>()");
		}
	}

	public void method674(final int i, final byte i_82_) {
		try {
			buffer[currentOffset - i - 4] = (byte) (i >> 24);
			buffer[currentOffset - i - 3] = (byte) (i >> 16);
			buffer[currentOffset - i - 2] = (byte) (i >> 8);
			buffer[currentOffset - i - 1] = (byte) i;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dz.aq()");
		}
	}

	public int method675(final byte i) {
		int i_83_;
		try {
			i_83_ = 0 - buffer[(currentOffset ++) - 1] & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.bv()");
		}
		return i_83_;
	}

	public int method676(final byte i) {
		int i_84_;
		try {
			currentOffset += -2031442916;
			i_84_ = (buffer[currentOffset - 3] & 0xff) 
					+ ((buffer[currentOffset - 1] & 0xff) << 16) 
					+ ((buffer[currentOffset - 2] & 0xff) << 24) 
					+ ((buffer[currentOffset - 4] & 0xff) << 8);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.cx()");
		}
		return i_84_;
	}

	public long method677(final int i) {
		long l;
		try {
			final long l_85_ = readDword() & 0xffffffffL;
			final long l_86_ = readDword() & 0xffffffffL;
			l = (l_85_ << 32) + l_86_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.az()");
		}
		return l;
	}

	public int method678(final byte i) {
		int i_87_;
		try {
			currentOffset += 1131762190;
			int i_88_ = ((buffer[ currentOffset - 1] & 0xff) << 8) 
					+ (buffer[currentOffset - 2] & 0xff);
			if (i_88_ > 32767) {
				i_88_ -= 65536;
			}
			i_87_ = i_88_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.cd()");
		}
		return i_87_;
	}

	public void method679(final int i, final int i_89_) {
		try {
			buffer[(currentOffset ++) - 1] = (byte) (i + 128);
			buffer[(currentOffset ++) - 1] = (byte) (i >> 8);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dz.bl()");
		}
	}

	public void method680(final int[] is, final int i, final int i_90_, final int i_91_) {
		try {
			final int i_92_ = currentOffset;
			currentOffset = 565881095 * i;
			final int i_93_ = (i_90_ - i) / 8;
			for (int i_94_ = 0; i_94_ < i_93_; i_94_++) {
				int i_95_ = readDword();
				int i_96_ = readDword();
				int i_97_ = 0;
				int i_99_ = 32;
				while (i_99_-- > 0) {
					i_95_ += i_96_ + (i_96_ << 4 ^ i_96_ >>> 5) ^ is[i_97_ & 0x3] + i_97_;
					i_97_ += -1640531527;
					i_96_ += i_95_ + (i_95_ << 4 ^ i_95_ >>> 5) ^ is[i_97_ >>> 11 & 0x3] + i_97_;
				}
				currentOffset -= 232081464;
				writeDWord(i_95_);
				writeDWord(i_96_);
			}
			currentOffset = i_92_ * 565881095;
		} catch (final RuntimeException var13) {
			throw Class102.method1086(var13, "dz.bg()");
		}
	}

	public void method681(final int i, final int i_100_) {
		try {
			buffer[(currentOffset ++) - 1] = (byte) (i >> 8);
			buffer[(currentOffset ++) - 1] = (byte) i;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "dz.aw()");
		}
	}

	public String method682(final int i) {
		String string;
		try {
			if (buffer[currentOffset] == 0) {
				currentOffset ++;
				return null;
			}
			string = method645((byte) -83);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.ay()");
		}
		return string;
	}

	public int method683(final byte i) {
		int i_101_;
		try {
			currentOffset += 1131762190;
			i_101_ = ((buffer[currentOffset - 1] & 0xff) << 8) 
					+ (buffer[currentOffset - 2] - 128 & 0xff);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.bt()");
		}
		return i_101_;
	}

	public int read3Bytes() {
			currentOffset += 3;
			return ((buffer[currentOffset - 1] & 0xff) 
					+ ((buffer[currentOffset - 3] & 0xff) << 16) 
					+ ((buffer[currentOffset - 2] & 0xff) << 8));
	}

	public void method685(final byte[] is, final int i, final int i_103_, final int i_104_) {
		try {
			for (int i_105_ = i; i_105_ < i + i_103_; i_105_++) {
				if (i_104_ <= 1094874963) {
					break;
				}
				buffer[(currentOffset ++) - 1] = is[i_105_];
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "dz.at()");
		}
	}

	public int method686(final byte i) {
		int i_106_;
		try {
			currentOffset += 1131762190;
			i_106_ = (buffer[currentOffset - 1] & 0xff) 
					+ ((buffer[currentOffset - 2] & 0xff) << 8);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.aj()");
		}
		return i_106_;
	}

	public static char method687(final char c, final int i, final int i_107_) {
		char c_108_;
		try {
			if (c >= '\u00c0' && c <= '\u00ff') {
				if (c >= '\u00c0' && c <= '\u00c6') {
					return 'A';
				}
				if (c == '\u00c7') {
					return 'C';
				}
				if (c >= '\u00c8' && c <= '\u00cb') {
					return 'E';
				}
				if (c >= '\u00cc' && c <= '\u00cf') {
					return 'I';
				}
				if (c >= '\u00d2' && c <= '\u00d6') {
					return 'O';
				}
				if (c >= '\u00d9' && c <= '\u00dc') {
					return 'U';
				}
				if (c == '\u00dd') {
					return 'Y';
				}
				if (c == '\u00df') {
					return 's';
				}
				if (c >= '\u00e0' && c <= '\u00e6') {
					return 'a';
				}
				if (c == '\u00e7') {
					return 'c';
				}
				if (c >= '\u00e8' && c <= '\u00eb') {
					return 'e';
				}
				if (c >= '\u00ec' && c <= '\u00ef') {
					return 'i';
				}
				if (c >= '\u00f2' && c <= '\u00f6') {
					return 'o';
				}
				if (c >= '\u00f9' && c <= '\u00fc') {
					return 'u';
				}
				if ('\u00fd' == c || '\u00ff' == c) {
					return 'y';
				}
			}
			if (c == '\u0152') {
				return 'O';
			}
			if (c == '\u0153') {
				return 'o';
			}
			if ('\u0178' == c) {
				return 'Y';
			}
			c_108_ = c;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.i()");
		}
		return c_108_;
	}

	public static boolean method688(final int i, final int i_109_) {
		boolean bool;
		try {
			if ((i >> 28 & 0x1) != 0) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dz.d()");
		}
		return bool;
	}
	static int[] anIntArray1854;
	public static final int anInt1855 = 5000;
	public static final int anInt1857 = 6;
	public static final int anInt1860 = 210;
	public static final int anInt1861 = 137;
	
	public int currentOffset;
	public byte[] buffer;
	static byte[][] aByteArrayArray1859;
	static Class91_Sub18[] aClass91_Sub18Array1863;
}
