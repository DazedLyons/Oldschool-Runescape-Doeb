/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Js5 {
	Object[] anObjectArray761;
	int[][] anIntArrayArray762;
	int[] anIntArray763;
	Class87 aClass87_764;
	int[] anIntArray765;
	public int anInt766;
	static final int anInt767 = 70;
	int[][] anIntArrayArray768;
	static int anInt769 = 0;
	Class87[] aClass87Array770;
	int[] anIntArray771;
	Object[][] anObjectArrayArray772;
	static Class52 aClass52_773 = new Class52();
	int[] anIntArray774;
	boolean aBoolean775;
	boolean aBoolean776;
	int[] anIntArray777;
	static final int anInt778 = 1;
	public static final int anInt779 = 184;
	int anInt780;

	void method396(final byte[] is, final byte i) {
		try {
			anInt766 = Class18.method187(is, is.length, (byte) -8) * -1745244697;
			final ByteBuffer class91_sub9 = new ByteBuffer(Class47.method365(is, 558200466));
			final int i_0_ = class91_sub9.readUnsignedByte();
			if (i_0_ >= 5) {
				if (i != 1) {
					return;
				}
				if (i_0_ <= 7) {
					if (i_0_ >= 6) {
						class91_sub9.readDword();
					}
					final int i_1_ = class91_sub9.readUnsignedByte();
					if (i_0_ >= 7) {
						this.anInt780 = class91_sub9.method665(125687335) * -375658879;
					} else {
						this.anInt780 = class91_sub9.method686((byte) -128) * -375658879;
					}
					int i_2_ = 0;
					int i_3_ = -1;
					this.anIntArray777 = new int[-632399487 * this.anInt780];
					if (i_0_ >= 7) {
						if (i != 1) {
							return;
						}
						for (int i_4_ = 0; i_4_ < this.anInt780 * -632399487; i_4_++) {
							this.anIntArray777[i_4_] = i_2_ += class91_sub9.method665(63051578);
							if (this.anIntArray777[i_4_] > i_3_) {
								i_3_ = this.anIntArray777[i_4_];
							}
						}
					} else {
						for (int i_5_ = 0; i_5_ < this.anInt780 * -632399487; i_5_++) {
							this.anIntArray777[i_5_] = i_2_ += class91_sub9.method686((byte) -35);
							if (this.anIntArray777[i_5_] > i_3_) {
								i_3_ = this.anIntArray777[i_5_];
							}
						}
					}
					this.anIntArray765 = new int[i_3_ + 1];
					this.anIntArray771 = new int[i_3_ + 1];
					this.anIntArray774 = new int[i_3_ + 1];
					this.anIntArrayArray768 = new int[i_3_ + 1][];
					this.anObjectArray761 = new Object[i_3_ + 1];
					this.anObjectArrayArray772 = new Object[1 + i_3_][];
					if (i_1_ != 0) {
						this.anIntArray763 = new int[i_3_ + 1];
						for (int i_6_ = 0; i_6_ < this.anInt780 * -632399487; i_6_++) {
							if (i != 1) {
								return;
							}
							this.anIntArray763[this.anIntArray777[i_6_]] = class91_sub9.readDword();
						}
						this.aClass87_764 = new Class87(this.anIntArray763);
					}
					for (int i_7_ = 0; i_7_ < this.anInt780 * -632399487; i_7_++) {
						this.anIntArray765[this.anIntArray777[i_7_]] = class91_sub9.readDword();
					}
					for (int i_8_ = 0; i_8_ < this.anInt780 * -632399487; i_8_++) {
						this.anIntArray771[this.anIntArray777[i_8_]] = class91_sub9.readDword();
					}
					for (int i_9_ = 0; i_9_ < -632399487 * this.anInt780; i_9_++) {
						if (i != 1) {
							return;
						}
						this.anIntArray774[this.anIntArray777[i_9_]] = class91_sub9.method686((byte) -53);
					}
					if (i_0_ >= 7) {
						if (i != 1) {
							return;
						}
						for (int i_10_ = 0; i_10_ < -632399487 * this.anInt780; i_10_++) {
							final int i_11_ = this.anIntArray777[i_10_];
							final int i_12_ = this.anIntArray774[i_11_];
							i_2_ = 0;
							int i_13_ = -1;
							this.anIntArrayArray768[i_11_] = new int[i_12_];
							for (int i_14_ = 0; i_14_ < i_12_; i_14_++) {
								final int i_15_ = this.anIntArrayArray768[i_11_][i_14_] = i_2_ += class91_sub9.method665(-2007751055);
								if (i_15_ > i_13_) {
									i_13_ = i_15_;
								}
							}
							this.anObjectArrayArray772[i_11_] = new Object[i_13_ + 1];
						}
					} else {
						for (int i_16_ = 0; i_16_ < -632399487 * this.anInt780; i_16_++) {
							final int i_17_ = this.anIntArray777[i_16_];
							final int i_18_ = this.anIntArray774[i_17_];
							i_2_ = 0;
							int i_19_ = -1;
							this.anIntArrayArray768[i_17_] = new int[i_18_];
							for (int i_20_ = 0; i_20_ < i_18_; i_20_++) {
								final int i_21_ = this.anIntArrayArray768[i_17_][i_20_] = i_2_ += class91_sub9.method686((byte) -114);
								if (i_21_ > i_19_) {
									i_19_ = i_21_;
								}
							}
							this.anObjectArrayArray772[i_17_] = new Object[i_19_ + 1];
						}
					}
					if (i_1_ != 0) {
						this.anIntArrayArray762 = new int[i_3_ + 1][];
						this.aClass87Array770 = new Class87[i_3_ + 1];
						for (int i_22_ = 0; i_22_ < this.anInt780 * -632399487; i_22_++) {
							final int i_23_ = this.anIntArray777[i_22_];
							final int i_24_ = this.anIntArray774[i_23_];
							this.anIntArrayArray762[i_23_] = new int[this.anObjectArrayArray772[i_23_].length];
							for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
								this.anIntArrayArray762[i_23_][this.anIntArrayArray768[i_23_][i_25_]] = class91_sub9.readDword();
							}
							this.aClass87Array770[i_23_] = new Class87(this.anIntArrayArray762[i_23_]);
						}
					}
					return;
				}
			}
			throw new RuntimeException("");
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eg.i()");
		}
	}

	public byte[] getFile(final int i, final int i_26_, final int i_27_) {
		byte[] is;
		try {
			is = method398(i, i_26_, null, (byte) 8);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eg.f()");
		}
		return is;
	}

	public byte[] method398(final int i, final int i_28_, final int[] is, final byte i_29_) {
		try {
			if (i >= 0 && i < this.anObjectArrayArray772.length && this.anObjectArrayArray772[i] != null && i_28_ >= 0 && i_28_ < this.anObjectArrayArray772[i].length) {
				if (this.anObjectArrayArray772[i][i_28_] == null) {
					boolean bool = method408(i, is, (byte) 21);
					if (!bool) {
						method404(i, 1948418485);
						bool = method408(i, is, (byte) 14);
						if (!bool) {
							return null;
						}
					}
				}
				final byte[] is_30_ = Class91_Sub23.method1046(this.anObjectArrayArray772[i][i_28_], false, 898243085);
				if (this.aBoolean776) {
					this.anObjectArrayArray772[i][i_28_] = null;
				}
				return is_30_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eg.e()");
		}
		return null;
	}

	public boolean method399(final int i, final int i_31_, final int i_32_) {
		try {
			if (i >= 0 && i < this.anObjectArrayArray772.length && this.anObjectArrayArray772[i] != null && i_31_ >= 0 && i_31_ < this.anObjectArrayArray772[i].length) {
				if (this.anObjectArrayArray772[i][i_31_] != null) {
					return true;
				}
				if (this.anObjectArray761[i] != null) {
					return true;
				}
				method404(i, 1530213102);
				if (this.anObjectArray761[i] != null) {
					return true;
				}
				return false;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eg.t()");
		}
		return false;
	}

	public boolean method400(final int i, final int i_33_) {
		do {
			try {
				if (this.anObjectArray761[i] != null) {
					return true;
				}
				method404(i, 549068223);
				if (this.anObjectArray761[i] == null) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "eg.d()");
			}
			return true;
		} while (false);
		return false;
	}

	public boolean method401(final int i) {
		boolean bool;
		try {
			boolean bool_34_ = true;
			int[] is;
			final int i_35_ = (is = this.anIntArray777).length;
			for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
				final int i_37_ = is[i_36_];
				if (this.anObjectArray761[i_37_] == null) {
					method404(i_37_, 878901833);
					if (this.anObjectArray761[i_37_] == null) {
						bool_34_ = false;
					}
				}
			}
			bool = bool_34_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eg.p()");
		}
		return bool;
	}

	public byte[] method402(final int i, final int i_38_) {
		try {
			if (1 == this.anObjectArrayArray772.length) {
				return getFile(0, i, -1453247623);
			}
			if (this.anObjectArrayArray772[i].length == 1) {
				return getFile(i, 0, -76405617);
			}
			throw new RuntimeException();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eg.k()");
		}
	}

	public byte[] method403(final int i, final int i_39_, final short i_40_) {
		try {
			if (i >= 0 && i < this.anObjectArrayArray772.length && this.anObjectArrayArray772[i] != null && i_39_ >= 0 && i_39_ < this.anObjectArrayArray772[i].length) {
				if (this.anObjectArrayArray772[i][i_39_] == null) {
					boolean bool = method408(i, null, (byte) 8);
					if (!bool) {
						method404(i, 1836698060);
						bool = method408(i, null, (byte) -43);
						if (!bool) {
							return null;
						}
					}
				}
				final byte[] is = Class91_Sub23.method1046(this.anObjectArrayArray772[i][i_39_], false, 1979183095);
				return is;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eg.r()");
		}
		return null;
	}

	void method404(final int i, final int i_41_) {
		/* empty */
	}

	public int method405(final int i, final int i_42_) {
		int i_43_;
		try {
			i_43_ = this.anObjectArrayArray772[i].length;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eg.s()");
		}
		return i_43_;
	}

	public void method406(final int i, final int i_44_) {
		try {
			for (int i_45_ = 0; i_45_ < this.anObjectArrayArray772[i].length; i_45_++) {
				this.anObjectArrayArray772[i][i_45_] = null;
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "eg.u()");
		}
	}

	public void method407(final short i) {
		try {
			for (int i_46_ = 0; i_46_ < this.anObjectArrayArray772.length; i_46_++) {
				if (this.anObjectArrayArray772[i_46_] != null) {
					if (i >= 255) {
						break;
					}
					for (int i_47_ = 0; i_47_ < this.anObjectArrayArray772[i_46_].length; i_47_++) {
						this.anObjectArrayArray772[i_46_][i_47_] = null;
					}
				}
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "eg.g()");
		}
	}

	boolean method408(final int i, final int[] is, final byte i_48_) {
		try {
			if (this.anObjectArray761[i] == null) {
				return false;
			}
			final int i_49_ = this.anIntArray774[i];
			final int[] is_50_ = this.anIntArrayArray768[i];
			final Object[] objects = this.anObjectArrayArray772[i];
			boolean bool = true;
			for (int i_51_ = 0; i_51_ < i_49_; i_51_++) {
				if (objects[is_50_[i_51_]] == null) {
					bool = false;
					break;
				}
			}
			if (bool) {
				return true;
			}
			byte[] is_52_;
			if (is != null && (is[0] != 0 || is[1] != 0 || is[2] != 0 || is[3] != 0)) {
				is_52_ = Class91_Sub23.method1046(this.anObjectArray761[i], true, 1072836546);
				final ByteBuffer class91_sub9 = new ByteBuffer(is_52_);
				class91_sub9.method651(is, 5, class91_sub9.buffer.length, 880379889);
			} else {
				is_52_ = Class91_Sub23.method1046(this.anObjectArray761[i], false, 1625642773);
			}
			byte[] is_53_;
			try {
				is_53_ = Class47.method365(is_52_, 558200466);
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, new StringBuilder().append(is != null).append(",").append(i).append(",").append(is_52_.length).append(",").append(Class18.method187(is_52_, is_52_.length, (byte) -97)).append(",").append(Class18.method187(is_52_, is_52_.length - 2, (byte) -25)).append(",").append(this.anIntArray765[i]).append(",").append(anInt766 * -1103292969)
						.toString());
			}
			if (this.aBoolean775) {
				this.anObjectArray761[i] = null;
			}
			if (i_49_ > 1) {
				int i_54_ = is_53_.length;
				i_54_--;
				final int i_55_ = is_53_[i_54_] & 0xff;
				i_54_ -= 4 * i_49_ * i_55_;
				final ByteBuffer class91_sub9 = new ByteBuffer(is_53_);
				final int[] is_56_ = new int[i_49_];
				class91_sub9.currentOffset = 565881095 * i_54_;
				for (int i_57_ = 0; i_57_ < i_55_; i_57_++) {
					int i_58_ = 0;
					for (int i_59_ = 0; i_59_ < i_49_; i_59_++) {
						i_58_ += class91_sub9.readDword();
						is_56_[i_59_] += i_58_;
					}
				}
				final byte[][] is_60_ = new byte[i_49_][];
				for (int i_61_ = 0; i_61_ < i_49_; i_61_++) {
					is_60_[i_61_] = new byte[is_56_[i_61_]];
					is_56_[i_61_] = 0;
				}
				class91_sub9.currentOffset = 565881095 * i_54_;
				int i_62_ = 0;
				for (int i_63_ = 0; i_63_ < i_55_; i_63_++) {
					int i_64_ = 0;
					for (int i_65_ = 0; i_65_ < i_49_; i_65_++) {
						i_64_ += class91_sub9.readDword();
						System.arraycopy(is_53_, i_62_, is_60_[i_65_], is_56_[i_65_], i_64_);
						is_56_[i_65_] += i_64_;
						i_62_ += i_64_;
					}
				}
				for (int i_66_ = 0; i_66_ < i_49_; i_66_++) {
					if (!this.aBoolean776) {
						objects[is_50_[i_66_]] = Class91_Sub9_Sub1.method696(is_60_[i_66_], false, 478825819);
					} else {
						objects[is_50_[i_66_]] = is_60_[i_66_];
					}
				}
			} else if (!this.aBoolean776) {
				objects[is_50_[0]] = Class91_Sub9_Sub1.method696(is_53_, false, 478825819);
			} else {
				objects[is_50_[0]] = is_53_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eg.o()");
		}
		return true;
	}

	public int method409(String string, final int i) {
		int i_67_;
		try {
			string = string.toLowerCase();
			i_67_ = this.aClass87_764.method491(Class24.method228(string, -1762275111));
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eg.v()");
		}
		return i_67_;
	}

	public boolean method410(String string, String string_68_, final byte i) {
		boolean bool;
		try {
			string = string.toLowerCase();
			string_68_ = string_68_.toLowerCase();
			final int i_69_ = this.aClass87_764.method491(Class24.method228(string, -1762275111));
			final int i_70_ = this.aClass87Array770[i_69_].method491(Class24.method228(string_68_, -1762275111));
			bool = method399(i_69_, i_70_, 1218792745);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eg.q()");
		}
		return bool;
	}

	void method411(final int i, final int i_71_) {
		/* empty */
	}

	public static Class91_Sub18 method412(final int i, final int i_72_, final byte i_73_) {
		do {
			Class91_Sub18 class91_sub18;
			try {
				final Class91_Sub18 class91_sub18_74_ = Class61.method394(i, -631047529);
				if (-1 == i_72_) {
					return class91_sub18_74_;
				}
				if (class91_sub18_74_ == null || class91_sub18_74_.aClass91_Sub18Array2077 == null || i_72_ >= class91_sub18_74_.aClass91_Sub18Array2077.length) {
					break;
				}
				class91_sub18 = class91_sub18_74_.aClass91_Sub18Array2077[i_72_];
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "eg.w()");
			}
			return class91_sub18;
		} while (false);
		return null;
	}

	public void method413(String string, final byte i) {
		try {
			string = string.toLowerCase();
			final int i_75_ = this.aClass87_764.method491(Class24.method228(string, -1762275111));
			if (i_75_ >= 0) {
				method411(i_75_, 716945303);
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "eg.c()");
		}
	}

	public byte[] method414(final int i, final int i_76_) {
		try {
			if (1 == this.anObjectArrayArray772.length) {
				return method403(0, i, (short) -4851);
			}
			if (1 == this.anObjectArrayArray772[i].length) {
				return method403(i, 0, (short) -28351);
			}
			throw new RuntimeException();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eg.l()");
		}
	}

	public int method415(final int i, String string, final byte i_77_) {
		int i_78_;
		try {
			string = string.toLowerCase();
			i_78_ = this.aClass87Array770[i].method491(Class24.method228(string, -1762275111));
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eg.j()");
		}
		return i_78_;
	}

	public int[] method416(final int i, final int i_79_) {
		int[] is;
		try {
			is = this.anIntArrayArray768[i];
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eg.z()");
		}
		return is;
	}

	Js5(final boolean bool, final boolean bool_80_) {
		try {
			this.aBoolean775 = bool;
			this.aBoolean776 = bool_80_;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "eg.<init>()");
		}
	}

	boolean method417(final int i, final int[] is) {
		if (this.anObjectArray761[i] == null) {
			return false;
		}
		final int i_81_ = this.anIntArray774[i];
		final int[] is_82_ = this.anIntArrayArray768[i];
		final Object[] objects = this.anObjectArrayArray772[i];
		boolean bool = true;
		for (int i_83_ = 0; i_83_ < i_81_; i_83_++) {
			if (objects[is_82_[i_83_]] == null) {
				bool = false;
				break;
			}
		}
		if (bool) {
			return true;
		}
		byte[] is_84_;
		if (is != null && (is[0] != 0 || is[1] != 0 || is[2] != 0 || is[3] != 0)) {
			is_84_ = Class91_Sub23.method1046(this.anObjectArray761[i], true, 128039248);
			final ByteBuffer class91_sub9 = new ByteBuffer(is_84_);
			class91_sub9.method651(is, 5, class91_sub9.buffer.length, 880379889);
		} else {
			is_84_ = Class91_Sub23.method1046(this.anObjectArray761[i], false, 1390414572);
		}
		byte[] is_85_;
		try {
			is_85_ = Class47.method365(is_84_, 558200466);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, new StringBuilder().append(is != null).append(",").append(i).append(",").append(is_84_.length).append(",").append(Class18.method187(is_84_, is_84_.length, (byte) -49)).append(",").append(Class18.method187(is_84_, is_84_.length - 2, (byte) -114)).append(",").append(this.anIntArray765[i]).append(",").append(anInt766 * 166732332).toString());
		}
		if (this.aBoolean775) {
			this.anObjectArray761[i] = null;
		}
		if (i_81_ > 1) {
			int i_86_ = is_85_.length;
			i_86_--;
			final int i_87_ = is_85_[i_86_] & 0x28348ad8;
			i_86_ -= 4 * i_81_ * i_87_;
			final ByteBuffer class91_sub9 = new ByteBuffer(is_85_);
			final int[] is_88_ = new int[i_81_];
			class91_sub9.currentOffset = -591148164 * i_86_;
			for (int i_89_ = 0; i_89_ < i_87_; i_89_++) {
				int i_90_ = 0;
				for (int i_91_ = 0; i_91_ < i_81_; i_91_++) {
					i_90_ += class91_sub9.readDword();
					is_88_[i_91_] += i_90_;
				}
			}
			final byte[][] is_92_ = new byte[i_81_][];
			for (int i_93_ = 0; i_93_ < i_81_; i_93_++) {
				is_92_[i_93_] = new byte[is_88_[i_93_]];
				is_88_[i_93_] = 0;
			}
			class91_sub9.currentOffset = 565881095 * i_86_;
			int i_94_ = 0;
			for (int i_95_ = 0; i_95_ < i_87_; i_95_++) {
				int i_96_ = 0;
				for (int i_97_ = 0; i_97_ < i_81_; i_97_++) {
					i_96_ += class91_sub9.readDword();
					System.arraycopy(is_85_, i_94_, is_92_[i_97_], is_88_[i_97_], i_96_);
					is_88_[i_97_] += i_96_;
					i_94_ += i_96_;
				}
			}
			for (int i_98_ = 0; i_98_ < i_81_; i_98_++) {
				if (!this.aBoolean776) {
					objects[is_82_[i_98_]] = Class91_Sub9_Sub1.method696(is_92_[i_98_], false, 478825819);
				} else {
					objects[is_82_[i_98_]] = is_92_[i_98_];
				}
			}
		} else if (!this.aBoolean776) {
			objects[is_82_[0]] = Class91_Sub9_Sub1.method696(is_85_, false, 478825819);
		} else {
			objects[is_82_[0]] = is_85_;
		}
		return true;
	}

	boolean method418(final int i, final int[] is) {
		if (this.anObjectArray761[i] == null) {
			return false;
		}
		final int i_99_ = this.anIntArray774[i];
		final int[] is_100_ = this.anIntArrayArray768[i];
		final Object[] objects = this.anObjectArrayArray772[i];
		boolean bool = true;
		for (int i_101_ = 0; i_101_ < i_99_; i_101_++) {
			if (objects[is_100_[i_101_]] == null) {
				bool = false;
				break;
			}
		}
		if (bool) {
			return true;
		}
		byte[] is_102_;
		if (is != null && (is[0] != 0 || is[1] != 0 || is[2] != 0 || is[3] != 0)) {
			is_102_ = Class91_Sub23.method1046(this.anObjectArray761[i], true, 215621739);
			final ByteBuffer class91_sub9 = new ByteBuffer(is_102_);
			class91_sub9.method651(is, 5, class91_sub9.buffer.length, 880379889);
		} else {
			is_102_ = Class91_Sub23.method1046(this.anObjectArray761[i], false, 737286770);
		}
		byte[] is_103_;
		try {
			is_103_ = Class47.method365(is_102_, 558200466);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, new StringBuilder().append(is != null).append(",").append(i).append(",").append(is_102_.length).append(",").append(Class18.method187(is_102_, is_102_.length, (byte) -106)).append(",").append(Class18.method187(is_102_, is_102_.length - 2, (byte) -22)).append(",").append(this.anIntArray765[i]).append(",").append(anInt766 * -1103292969)
					.toString());
		}
		if (this.aBoolean775) {
			this.anObjectArray761[i] = null;
		}
		if (i_99_ > 1) {
			int i_104_ = is_103_.length;
			i_104_--;
			final int i_105_ = is_103_[i_104_] & 0xff;
			i_104_ -= 4 * i_99_ * i_105_;
			final ByteBuffer class91_sub9 = new ByteBuffer(is_103_);
			final int[] is_106_ = new int[i_99_];
			class91_sub9.currentOffset = 565881095 * i_104_;
			for (int i_107_ = 0; i_107_ < i_105_; i_107_++) {
				int i_108_ = 0;
				for (int i_109_ = 0; i_109_ < i_99_; i_109_++) {
					i_108_ += class91_sub9.readDword();
					is_106_[i_109_] += i_108_;
				}
			}
			final byte[][] is_110_ = new byte[i_99_][];
			for (int i_111_ = 0; i_111_ < i_99_; i_111_++) {
				is_110_[i_111_] = new byte[is_106_[i_111_]];
				is_106_[i_111_] = 0;
			}
			class91_sub9.currentOffset = 565881095 * i_104_;
			int i_112_ = 0;
			for (int i_113_ = 0; i_113_ < i_105_; i_113_++) {
				int i_114_ = 0;
				for (int i_115_ = 0; i_115_ < i_99_; i_115_++) {
					i_114_ += class91_sub9.readDword();
					System.arraycopy(is_103_, i_112_, is_110_[i_115_], is_106_[i_115_], i_114_);
					is_106_[i_115_] += i_114_;
					i_112_ += i_114_;
				}
			}
			for (int i_116_ = 0; i_116_ < i_99_; i_116_++) {
				if (!this.aBoolean776) {
					objects[is_100_[i_116_]] = Class91_Sub9_Sub1.method696(is_110_[i_116_], false, 478825819);
				} else {
					objects[is_100_[i_116_]] = is_110_[i_116_];
				}
			}
		} else if (!this.aBoolean776) {
			objects[is_100_[0]] = Class91_Sub9_Sub1.method696(is_103_, false, 478825819);
		} else {
			objects[is_100_[0]] = is_103_;
		}
		return true;
	}

	boolean method419(final int i, final int[] is) {
		if (this.anObjectArray761[i] == null) {
			return false;
		}
		final int i_117_ = this.anIntArray774[i];
		final int[] is_118_ = this.anIntArrayArray768[i];
		final Object[] objects = this.anObjectArrayArray772[i];
		boolean bool = true;
		for (int i_119_ = 0; i_119_ < i_117_; i_119_++) {
			if (objects[is_118_[i_119_]] == null) {
				bool = false;
				break;
			}
		}
		if (bool) {
			return true;
		}
		byte[] is_120_;
		if (is != null && (is[0] != 0 || is[1] != 0 || is[2] != 0 || is[3] != 0)) {
			is_120_ = Class91_Sub23.method1046(this.anObjectArray761[i], true, 1733200182);
			final ByteBuffer class91_sub9 = new ByteBuffer(is_120_);
			class91_sub9.method651(is, 5, class91_sub9.buffer.length, 880379889);
		} else {
			is_120_ = Class91_Sub23.method1046(this.anObjectArray761[i], false, 1475975298);
		}
		byte[] is_121_;
		try {
			is_121_ = Class47.method365(is_120_, 558200466);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, new StringBuilder().append(is != null).append(",").append(i).append(",").append(is_120_.length).append(",").append(Class18.method187(is_120_, is_120_.length, (byte) -78)).append(",").append(Class18.method187(is_120_, is_120_.length - 2, (byte) -28)).append(",").append(this.anIntArray765[i]).append(",").append(anInt766 * -1613594397)
					.toString());
		}
		if (this.aBoolean775) {
			this.anObjectArray761[i] = null;
		}
		if (i_117_ > 1) {
			int i_122_ = is_121_.length;
			i_122_--;
			final int i_123_ = is_121_[i_122_] & 0xff;
			i_122_ -= 4 * i_117_ * i_123_;
			final ByteBuffer class91_sub9 = new ByteBuffer(is_121_);
			final int[] is_124_ = new int[i_117_];
			class91_sub9.currentOffset = 565881095 * i_122_;
			for (int i_125_ = 0; i_125_ < i_123_; i_125_++) {
				int i_126_ = 0;
				for (int i_127_ = 0; i_127_ < i_117_; i_127_++) {
					i_126_ += class91_sub9.readDword();
					is_124_[i_127_] += i_126_;
				}
			}
			final byte[][] is_128_ = new byte[i_117_][];
			for (int i_129_ = 0; i_129_ < i_117_; i_129_++) {
				is_128_[i_129_] = new byte[is_124_[i_129_]];
				is_124_[i_129_] = 0;
			}
			class91_sub9.currentOffset = 565881095 * i_122_;
			int i_130_ = 0;
			for (int i_131_ = 0; i_131_ < i_123_; i_131_++) {
				int i_132_ = 0;
				for (int i_133_ = 0; i_133_ < i_117_; i_133_++) {
					i_132_ += class91_sub9.readDword();
					System.arraycopy(is_121_, i_130_, is_128_[i_133_], is_124_[i_133_], i_132_);
					is_124_[i_133_] += i_132_;
					i_130_ += i_132_;
				}
			}
			for (int i_134_ = 0; i_134_ < i_117_; i_134_++) {
				if (!this.aBoolean776) {
					objects[is_118_[i_134_]] = Class91_Sub9_Sub1.method696(is_128_[i_134_], false, 478825819);
				} else {
					objects[is_118_[i_134_]] = is_128_[i_134_];
				}
			}
		} else if (!this.aBoolean776) {
			objects[is_118_[0]] = Class91_Sub9_Sub1.method696(is_121_, false, 478825819);
		} else {
			objects[is_118_[0]] = is_121_;
		}
		return true;
	}

	public byte[] method420(String string, String string_135_, final byte i) {
		byte[] is;
		try {
			string = string.toLowerCase();
			string_135_ = string_135_.toLowerCase();
			final int i_136_ = this.aClass87_764.method491(Class24.method228(string, -1762275111));
			final int i_137_ = this.aClass87Array770[i_136_].method491(Class24.method228(string_135_, -1762275111));
			is = getFile(i_136_, i_137_, -1037646631);
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eg.n()");
		}
		return is;
	}

	public int method421(final byte i) {
		int i_138_;
		try {
			i_138_ = this.anObjectArrayArray772.length;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eg.m()");
		}
		return i_138_;
	}
}
