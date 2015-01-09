/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class76 {
	static final int anInt1080 = 32;
	static final int anInt1081 = 1;
	static final int anInt1082 = 4;
	static final int anInt1083 = 8;
	static final int anInt1084 = 2;
	public int[][] anIntArrayArray1085;
	static final int anInt1086 = 512;
	static final int anInt1087 = 1024;
	static final int anInt1088 = 2048;
	static final int anInt1089 = 4096;
	static final int anInt1090 = 16384;
	static final int anInt1091 = 32768;
	static final int anInt1092 = 2097152;
	static final int anInt1093 = 16;
	int anInt1094;
	int anInt1095;
	int anInt1096;
	int anInt1097;
	public static final int anInt1098 = 19661058;
	public static final int anInt1099 = 78;

	public void method454(int i, int i_0_, final int i_1_) {
		try {
			i -= this.anInt1094 * -2041994183;
			i_0_ -= 1929878913 * this.anInt1095;
			anIntArrayArray1085[i][i_0_] &= ~0x40000;
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "fa.l()");
		}
	}

	public void method455(int i, int i_2_, final int i_3_, final int i_4_, final boolean bool, final short i_5_) {
		try {
			i -= this.anInt1094 * -2041994183;
			i_2_ -= 1929878913 * this.anInt1095;
			if (i_3_ == 0) {
				if (i_5_ != 143) {
					return;
				}
				if (i_4_ == 0) {
					method459(i, i_2_, 128, 1140992051);
					method459(i - 1, i_2_, 8, -550610431);
				}
				if (i_4_ == 1) {
					method459(i, i_2_, 2, -1072690075);
					method459(i, 1 + i_2_, 32, 1139232318);
				}
				if (2 == i_4_) {
					method459(i, i_2_, 8, 1768667188);
					method459(1 + i, i_2_, 128, 1038889989);
				}
				if (3 == i_4_) {
					if (i_5_ != 143) {
						return;
					}
					method459(i, i_2_, 32, 1674622943);
					method459(i, i_2_ - 1, 2, 1834083837);
				}
			}
			if (1 == i_3_ || 3 == i_3_) {
				if (i_4_ == 0) {
					method459(i, i_2_, 1, 2142588301);
					method459(i - 1, i_2_ + 1, 16, 1924996870);
				}
				if (1 == i_4_) {
					method459(i, i_2_, 4, -1087061213);
					method459(i + 1, 1 + i_2_, 64, -2001721216);
				}
				if (i_4_ == 2) {
					method459(i, i_2_, 16, -574945003);
					method459(i + 1, i_2_ - 1, 1, -1423762013);
				}
				if (i_4_ == 3) {
					method459(i, i_2_, 64, -31886797);
					method459(i - 1, i_2_ - 1, 4, 2069566411);
				}
			}
			if (2 == i_3_) {
				if (i_4_ == 0) {
					method459(i, i_2_, 130, -480682887);
					method459(i - 1, i_2_, 8, 1458141130);
					method459(i, 1 + i_2_, 32, -1759602974);
				}
				if (1 == i_4_) {
					method459(i, i_2_, 10, -603852746);
					method459(i, i_2_ + 1, 32, 699946035);
					method459(i + 1, i_2_, 128, -1477831493);
				}
				if (i_4_ == 2) {
					method459(i, i_2_, 40, 689732306);
					method459(i + 1, i_2_, 128, 590039656);
					method459(i, i_2_ - 1, 2, 838214030);
				}
				if (i_4_ == 3) {
					method459(i, i_2_, 160, -1620830972);
					method459(i, i_2_ - 1, 2, 363661685);
					method459(i - 1, i_2_, 8, 689646936);
				}
			}
			if (bool) {
				if (i_3_ == 0) {
					if (i_4_ == 0) {
						method459(i, i_2_, 65536, -958864221);
						method459(i - 1, i_2_, 4096, -775181181);
					}
					if (i_4_ == 1) {
						method459(i, i_2_, 1024, -1343210992);
						method459(i, i_2_ + 1, 16384, -1064919991);
					}
					if (i_4_ == 2) {
						method459(i, i_2_, 4096, 858764895);
						method459(1 + i, i_2_, 65536, 1056652389);
					}
					if (3 == i_4_) {
						if (i_5_ != 143) {
							return;
						}
						method459(i, i_2_, 16384, -1816938062);
						method459(i, i_2_ - 1, 1024, -1032041259);
					}
				}
				if (i_3_ == 1 || i_3_ == 3) {
					if (i_4_ == 0) {
						method459(i, i_2_, 512, -74780039);
						method459(i - 1, 1 + i_2_, 8192, 1907207468);
					}
					if (i_4_ == 1) {
						method459(i, i_2_, 2048, 371578176);
						method459(1 + i, 1 + i_2_, 32768, 82485474);
					}
					if (2 == i_4_) {
						method459(i, i_2_, 8192, -151797377);
						method459(1 + i, i_2_ - 1, 512, -1909847900);
					}
					if (i_4_ == 3) {
						if (i_5_ != 143) {
							return;
						}
						method459(i, i_2_, 32768, -1103387797);
						method459(i - 1, i_2_ - 1, 2048, 2049630373);
					}
				}
				if (i_3_ == 2) {
					if (i_4_ == 0) {
						method459(i, i_2_, 66560, 1867178697);
						method459(i - 1, i_2_, 4096, 218649579);
						method459(i, i_2_ + 1, 16384, 1341288119);
					}
					if (i_4_ == 1) {
						method459(i, i_2_, 5120, 486126757);
						method459(i, i_2_ + 1, 16384, 1593226883);
						method459(i + 1, i_2_, 65536, -1812485774);
					}
					if (i_4_ == 2) {
						method459(i, i_2_, 20480, 848584566);
						method459(i + 1, i_2_, 65536, 1363468217);
						method459(i, i_2_ - 1, 1024, -293042265);
					}
					if (3 == i_4_) {
						method459(i, i_2_, 81920, -1284664586);
						method459(i, i_2_ - 1, 1024, -685218358);
						method459(i - 1, i_2_, 4096, 120994056);
					}
				}
			}
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "fa.w()");
		}
	}

	public void method456(int i, int i_6_, final int i_7_, final int i_8_, final boolean bool, final int i_9_) {
		try {
			int i_10_ = 256;
			if (bool) {
				i_10_ += 131072;
			}
			i -= -2041994183 * this.anInt1094;
			i_6_ -= this.anInt1095 * 1929878913;
			for (int i_11_ = i; i_11_ < i_7_ + i; i_11_++) {
				if (i_11_ >= 0 && i_11_ < this.anInt1096 * 2040891953) {
					for (int i_12_ = i_6_; i_12_ < i_6_ + i_8_; i_12_++) {
						if (i_12_ >= 0) {
							if (i_9_ == 474356862) {
								return;
							}
							if (i_12_ < this.anInt1097 * 259937827) {
								method459(i_11_, i_12_, i_10_, 33625599);
							}
						}
					}
				}
			}
		} catch (final RuntimeException var10) {
			throw Class102.method1086(var10, "fa.f()");
		}
	}

	public void method457(int i, int i_13_, final int i_14_) {
		try {
			i -= -2041994183 * this.anInt1094;
			i_13_ -= 1929878913 * this.anInt1095;
			anIntArrayArray1085[i][i_13_] |= 0x200000;
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "fa.e()");
		}
	}

	public void method458(int i, int i_15_, final byte i_16_) {
		try {
			i -= this.anInt1094 * -2041994183;
			i_15_ -= 1929878913 * this.anInt1095;
			anIntArrayArray1085[i][i_15_] |= 0x40000;
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "fa.t()");
		}
	}

	void method459(final int i, final int i_17_, final int i_18_, final int i_19_) {
		try {
			anIntArrayArray1085[i][i_17_] |= i_18_;
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "fa.d()");
		}
	}

	public void method460(int i, int i_20_, final int i_21_, final int i_22_, final boolean bool, final byte i_23_) {
		try {
			i -= -2041994183 * this.anInt1094;
			i_20_ -= this.anInt1095 * 1929878913;
			if (i_21_ == 0) {
				if (i_23_ != 0) {
					throw new IllegalStateException();
				}
				if (i_22_ == 0) {
					if (i_23_ != 0) {
						return;
					}
					method461(i, i_20_, 128, (byte) -120);
					method461(i - 1, i_20_, 8, (byte) -54);
				}
				if (i_22_ == 1) {
					if (i_23_ != 0) {
						throw new IllegalStateException();
					}
					method461(i, i_20_, 2, (byte) -14);
					method461(i, 1 + i_20_, 32, (byte) 3);
				}
				if (2 == i_22_) {
					method461(i, i_20_, 8, (byte) -93);
					method461(1 + i, i_20_, 128, (byte) -63);
				}
				if (i_22_ == 3) {
					if (i_23_ != 0) {
						throw new IllegalStateException();
					}
					method461(i, i_20_, 32, (byte) 37);
					method461(i, i_20_ - 1, 2, (byte) -60);
				}
			}
			do {
				if (1 != i_21_) {
					if (i_23_ != 0) {
						throw new IllegalStateException();
					}
					if (3 != i_21_) {
						break;
					}
					if (i_23_ != 0) {
						throw new IllegalStateException();
					}
				}
				if (i_22_ == 0) {
					if (i_23_ != 0) {
						throw new IllegalStateException();
					}
					method461(i, i_20_, 1, (byte) -104);
					method461(i - 1, 1 + i_20_, 16, (byte) -13);
				}
				if (1 == i_22_) {
					if (i_23_ != 0) {
						return;
					}
					method461(i, i_20_, 4, (byte) -73);
					method461(1 + i, 1 + i_20_, 64, (byte) -110);
				}
				if (2 == i_22_) {
					if (i_23_ != 0) {
						return;
					}
					method461(i, i_20_, 16, (byte) -5);
					method461(i + 1, i_20_ - 1, 1, (byte) -116);
				}
				if (i_22_ == 3) {
					if (i_23_ != 0) {
						throw new IllegalStateException();
					}
					method461(i, i_20_, 64, (byte) -98);
					method461(i - 1, i_20_ - 1, 4, (byte) -105);
				}
			} while (false);
			if (2 == i_21_) {
				if (i_23_ != 0) {
					throw new IllegalStateException();
				}
				if (i_22_ == 0) {
					method461(i, i_20_, 130, (byte) -59);
					method461(i - 1, i_20_, 8, (byte) -1);
					method461(i, i_20_ + 1, 32, (byte) -106);
				}
				if (i_22_ == 1) {
					if (i_23_ != 0) {
						throw new IllegalStateException();
					}
					method461(i, i_20_, 10, (byte) -109);
					method461(i, 1 + i_20_, 32, (byte) -51);
					method461(i + 1, i_20_, 128, (byte) 19);
				}
				if (2 == i_22_) {
					if (i_23_ != 0) {
						throw new IllegalStateException();
					}
					method461(i, i_20_, 40, (byte) -112);
					method461(i + 1, i_20_, 128, (byte) -9);
					method461(i, i_20_ - 1, 2, (byte) -30);
				}
				if (i_22_ == 3) {
					if (i_23_ != 0) {
						return;
					}
					method461(i, i_20_, 160, (byte) 52);
					method461(i, i_20_ - 1, 2, (byte) 8);
					method461(i - 1, i_20_, 8, (byte) 5);
				}
			}
			if (bool) {
				if (i_21_ == 0) {
					if (i_23_ != 0) {
						return;
					}
					if (i_22_ == 0) {
						if (i_23_ != 0) {
							return;
						}
						method461(i, i_20_, 65536, (byte) -121);
						method461(i - 1, i_20_, 4096, (byte) 20);
					}
					if (i_22_ == 1) {
						if (i_23_ != 0) {
							throw new IllegalStateException();
						}
						method461(i, i_20_, 1024, (byte) -125);
						method461(i, 1 + i_20_, 16384, (byte) -47);
					}
					if (i_22_ == 2) {
						if (i_23_ != 0) {
							throw new IllegalStateException();
						}
						method461(i, i_20_, 4096, (byte) 34);
						method461(i + 1, i_20_, 65536, (byte) 30);
					}
					if (3 == i_22_) {
						method461(i, i_20_, 16384, (byte) -63);
						method461(i, i_20_ - 1, 1024, (byte) -52);
					}
				}
				do {
					if (1 != i_21_) {
						if (i_23_ != 0) {
							throw new IllegalStateException();
						}
						if (3 != i_21_) {
							break;
						}
						if (i_23_ != 0) {
							throw new IllegalStateException();
						}
					}
					if (i_22_ == 0) {
						method461(i, i_20_, 512, (byte) -72);
						method461(i - 1, i_20_ + 1, 8192, (byte) -105);
					}
					if (i_22_ == 1) {
						if (i_23_ != 0) {
							throw new IllegalStateException();
						}
						method461(i, i_20_, 2048, (byte) -118);
						method461(i + 1, 1 + i_20_, 32768, (byte) -57);
					}
					if (i_22_ == 2) {
						if (i_23_ != 0) {
							return;
						}
						method461(i, i_20_, 8192, (byte) 8);
						method461(1 + i, i_20_ - 1, 512, (byte) -60);
					}
					if (3 == i_22_) {
						if (i_23_ != 0) {
							return;
						}
						method461(i, i_20_, 32768, (byte) -33);
						method461(i - 1, i_20_ - 1, 2048, (byte) -76);
					}
				} while (false);
				if (i_21_ == 2) {
					if (i_23_ == 0) {
						if (i_22_ == 0) {
							if (i_23_ != 0) {
								throw new IllegalStateException();
							}
							method461(i, i_20_, 66560, (byte) 31);
							method461(i - 1, i_20_, 4096, (byte) 32);
							method461(i, i_20_ + 1, 16384, (byte) 12);
						}
						if (1 == i_22_) {
							if (i_23_ != 0) {
								throw new IllegalStateException();
							}
							method461(i, i_20_, 5120, (byte) -112);
							method461(i, i_20_ + 1, 16384, (byte) -127);
							method461(i + 1, i_20_, 65536, (byte) -46);
						}
						if (2 == i_22_) {
							if (i_23_ != 0) {
								return;
							}
							method461(i, i_20_, 20480, (byte) -108);
							method461(i + 1, i_20_, 65536, (byte) -9);
							method461(i, i_20_ - 1, 1024, (byte) -112);
						}
						if (3 == i_22_) {
							method461(i, i_20_, 81920, (byte) 24);
							method461(i, i_20_ - 1, 1024, (byte) 16);
							method461(i - 1, i_20_, 4096, (byte) -115);
						}
					}
				}
			}
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "fa.p()");
		}
	}

	void method461(final int i, final int i_24_, final int i_25_, final byte i_26_) {
		try {
			anIntArrayArray1085[i][i_24_] &= i_25_ ^ 0xffffffff;
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "fa.r()");
		}
	}

	public void method462(final byte i) {
		try {
			for (int i_27_ = 0; i_27_ < this.anInt1096 * 2040891953; i_27_++) {
				for (int i_28_ = 0; i_28_ < this.anInt1097 * 259937827; i_28_++) {
					if (i_27_ != 0) {
						if (i <= -1) {
							return;
						}
						if (i_28_ != 0 && i_27_ < 2040891953 * this.anInt1096 - 5 && i_28_ < this.anInt1097 * 259937827 - 5) {
							anIntArrayArray1085[i_27_][i_28_] = 16777216;
							continue;
						}
					}
					anIntArrayArray1085[i_27_][i_28_] = 16777215;
				}
			}
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "fa.i()");
		}
	}

	public boolean method463(int i, int i_29_, int i_30_, int i_31_, final int i_32_, final int i_33_, final int i_34_) {
		do {
			try {
				if (i == i_30_ && i_29_ == i_31_) {
					return true;
				}
				i -= -2041994183 * this.anInt1094;
				i_29_ -= this.anInt1095 * 1929878913;
				i_30_ -= this.anInt1094 * -2041994183;
				i_31_ -= this.anInt1095 * 1929878913;
				if (i_32_ == 0) {
					if (i_33_ == 0) {
						if (i == i_30_ - 1 && i_29_ == i_31_) {
							return true;
						}
						if (i == i_30_ && 1 + i_31_ == i_29_ && (anIntArrayArray1085[i][i_29_] & 0x12c0120) == 0) {
							return true;
						}
						if (i == i_30_ && i_29_ == i_31_ - 1 && (anIntArrayArray1085[i][i_29_] & 0x12c0102) == 0) {
							return true;
						}
					} else if (i_33_ == 1) {
						if (i_30_ == i && i_31_ + 1 == i_29_) {
							return true;
						}
						if (i == i_30_ - 1 && i_31_ == i_29_ && (anIntArrayArray1085[i][i_29_] & 0x12c0108) == 0) {
							return true;
						}
						if (i == i_30_ + 1 && i_29_ == i_31_ && (anIntArrayArray1085[i][i_29_] & 0x12c0180) == 0) {
							return true;
						}
					} else if (2 == i_33_) {
						if (1 + i_30_ == i && i_29_ == i_31_) {
							return true;
						}
						if (i == i_30_ && 1 + i_31_ == i_29_ && (anIntArrayArray1085[i][i_29_] & 0x12c0120) == 0) {
							return true;
						}
						if (i_30_ == i && i_31_ - 1 == i_29_ && (anIntArrayArray1085[i][i_29_] & 0x12c0102) == 0) {
							return true;
						}
					} else if (i_33_ == 3) {
						if (i_30_ == i && i_29_ == i_31_ - 1) {
							return true;
						}
						if (i_30_ - 1 == i && i_29_ == i_31_ && (anIntArrayArray1085[i][i_29_] & 0x12c0108) == 0) {
							return true;
						}
						if (i_30_ + 1 == i && i_31_ == i_29_ && (anIntArrayArray1085[i][i_29_] & 0x12c0180) == 0) {
							return true;
						}
					}
				}
				if (2 == i_32_) {
					if (i_33_ == 0) {
						if (i_30_ - 1 == i && i_31_ == i_29_) {
							return true;
						}
						if (i == i_30_ && i_29_ == 1 + i_31_) {
							return true;
						}
						if (i_30_ + 1 == i && i_29_ == i_31_ && (anIntArrayArray1085[i][i_29_] & 0x12c0180) == 0) {
							return true;
						}
						if (i_30_ == i && i_29_ == i_31_ - 1 && (anIntArrayArray1085[i][i_29_] & 0x12c0102) == 0) {
							return true;
						}
					} else if (1 == i_33_) {
						if (i == i_30_ - 1 && i_31_ == i_29_ && (anIntArrayArray1085[i][i_29_] & 0x12c0108) == 0) {
							return true;
						}
						if (i == i_30_ && i_29_ == 1 + i_31_) {
							return true;
						}
						if (1 + i_30_ == i && i_31_ == i_29_) {
							return true;
						}
						if (i_30_ == i && i_29_ == i_31_ - 1 && (anIntArrayArray1085[i][i_29_] & 0x12c0102) == 0) {
							return true;
						}
					} else if (2 == i_33_) {
						if (i == i_30_ - 1 && i_31_ == i_29_ && (anIntArrayArray1085[i][i_29_] & 0x12c0108) == 0) {
							return true;
						}
						if (i == i_30_ && i_29_ == i_31_ + 1 && (anIntArrayArray1085[i][i_29_] & 0x12c0120) == 0) {
							return true;
						}
						if (i_30_ + 1 == i && i_31_ == i_29_) {
							return true;
						}
						if (i == i_30_ && i_29_ == i_31_ - 1) {
							return true;
						}
					} else if (i_33_ == 3) {
						if (i == i_30_ - 1 && i_29_ == i_31_) {
							return true;
						}
						if (i_30_ == i && i_29_ == i_31_ + 1 && (anIntArrayArray1085[i][i_29_] & 0x12c0120) == 0) {
							return true;
						}
						if (i_30_ + 1 == i && i_29_ == i_31_ && (anIntArrayArray1085[i][i_29_] & 0x12c0180) == 0) {
							return true;
						}
						if (i_30_ == i && i_31_ - 1 == i_29_) {
							return true;
						}
					}
				}
				if (i_32_ != 9) {
					break;
				}
				if (i == i_30_ && i_29_ == 1 + i_31_ && (anIntArrayArray1085[i][i_29_] & 0x20) == 0) {
					return true;
				}
				if (i == i_30_ && i_29_ == i_31_ - 1 && (anIntArrayArray1085[i][i_29_] & 0x2) == 0) {
					return true;
				}
				if (i_30_ - 1 == i && i_29_ == i_31_ && (anIntArrayArray1085[i][i_29_] & 0x8) == 0) {
					return true;
				}
				if (i != 1 + i_30_ || i_29_ != i_31_ || (anIntArrayArray1085[i][i_29_] & 0x80) != 0) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "fa.a()");
			}
			return true;
		} while (false);
		return false;
	}

	public boolean method464(int i, int i_35_, int i_36_, int i_37_, final int i_38_, int i_39_, final int i_40_) {
		do {
			try {
				if (i_36_ == i && i_37_ == i_35_) {
					return true;
				}
				i -= -2041994183 * this.anInt1094;
				i_35_ -= 1929878913 * this.anInt1095;
				i_36_ -= -2041994183 * this.anInt1094;
				i_37_ -= 1929878913 * this.anInt1095;
				if (6 == i_38_ || i_38_ == 7) {
					if (7 == i_38_) {
						i_39_ = i_39_ + 2 & 0x3;
					}
					if (i_39_ == 0) {
						if (i == 1 + i_36_ && i_35_ == i_37_ && (anIntArrayArray1085[i][i_35_] & 0x80) == 0) {
							return true;
						}
						if (i == i_36_ && i_35_ == i_37_ - 1 && (anIntArrayArray1085[i][i_35_] & 0x2) == 0) {
							return true;
						}
					} else if (1 == i_39_) {
						if (i_36_ - 1 == i && i_37_ == i_35_ && (anIntArrayArray1085[i][i_35_] & 0x8) == 0) {
							return true;
						}
						if (i == i_36_ && i_35_ == i_37_ - 1 && (anIntArrayArray1085[i][i_35_] & 0x2) == 0) {
							return true;
						}
					} else if (2 == i_39_) {
						if (i_36_ - 1 == i && i_37_ == i_35_ && (anIntArrayArray1085[i][i_35_] & 0x8) == 0) {
							return true;
						}
						if (i == i_36_ && i_37_ + 1 == i_35_ && (anIntArrayArray1085[i][i_35_] & 0x20) == 0) {
							return true;
						}
					} else if (i_39_ == 3) {
						if (i == i_36_ + 1 && i_35_ == i_37_ && (anIntArrayArray1085[i][i_35_] & 0x80) == 0) {
							return true;
						}
						if (i == i_36_ && i_37_ + 1 == i_35_ && (anIntArrayArray1085[i][i_35_] & 0x20) == 0) {
							return true;
						}
					}
				}
				if (i_38_ != 8) {
					break;
				}
				if (i_36_ == i && i_35_ == 1 + i_37_ && (anIntArrayArray1085[i][i_35_] & 0x20) == 0) {
					return true;
				}
				if (i_36_ == i && i_35_ == i_37_ - 1 && (anIntArrayArray1085[i][i_35_] & 0x2) == 0) {
					return true;
				}
				if (i_36_ - 1 == i && i_35_ == i_37_ && (anIntArrayArray1085[i][i_35_] & 0x8) == 0) {
					return true;
				}
				if (i != 1 + i_36_ || i_35_ != i_37_ || (anIntArrayArray1085[i][i_35_] & 0x80) != 0) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "fa.z()");
			}
			return true;
		} while (false);
		return false;
	}

	public void method465(int i, int i_41_, int i_42_, int i_43_, final int i_44_, final boolean bool, final int i_45_) {
		try {
			int i_46_ = 256;
			if (bool) {
				i_46_ += 131072;
			}
			i -= -2041994183 * this.anInt1094;
			i_41_ -= 1929878913 * this.anInt1095;
			if (1 == i_44_ || i_45_ != -595653689) {
				int i_47_ = i_42_;
				i_42_ = i_43_;
				i_43_ = i_47_;
				for (i_47_ = i; i_47_ < i + i_42_; i_47_++) {
					if (i_47_ >= 0) {
						if (i_45_ == -595653689) {
							break;
						}
						if (i_47_ < this.anInt1096 * 2040891953) {
							for (int i_48_ = i_41_; i_48_ < i_43_ + i_41_; i_48_++) {
								if (i_48_ >= 0 && i_48_ < this.anInt1097 * 259937827) {
									method461(i_47_, i_48_, i_46_, (byte) -84);
								}
							}
						}
					}
				}
			}
		} catch (final RuntimeException var11) {
			throw Class102.method1086(var11, "fa.k()");
		}
	}

	public Class76(final int i, final int i_49_) {
		try {
			this.anInt1094 = 0;
			this.anInt1095 = 0;
			this.anInt1096 = -526151983 * i;
			this.anInt1097 = -1423963765 * i_49_;
			anIntArrayArray1085 = new int[this.anInt1096 * 2040891953][this.anInt1097 * 259937827];
			method462((byte) 122);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "fa.<init>()");
		}
	}

	public boolean method466(final int i, final int i_50_, final int i_51_, final int i_52_, final int i_53_, final int i_54_, final int i_55_, final int i_56_) {
		do {
			try {
				final int i_57_ = i_53_ + i_51_ - 1;
				final int i_58_ = i_54_ + i_52_ - 1;
				if (i >= i_51_ && i <= i_57_ && i_50_ >= i_52_ && i_50_ <= i_58_) {
					return true;
				}
				if (i == i_51_ - 1 && i_50_ >= i_52_ && i_50_ <= i_58_ && (anIntArrayArray1085[i - -2041994183 * this.anInt1094][i_50_ - 1929878913 * this.anInt1095] & 0x8) == 0 && (i_55_ & 0x8) == 0) {
					return true;
				}
				if (1 + i_57_ == i && i_50_ >= i_52_ && i_50_ <= i_58_ && (anIntArrayArray1085[i - -2041994183 * this.anInt1094][i_50_ - 1929878913 * this.anInt1095] & 0x80) == 0 && (i_55_ & 0x2) == 0) {
					return true;
				}
				if (i_50_ == i_52_ - 1 && i >= i_51_ && i <= i_57_ && (anIntArrayArray1085[i - -2041994183 * this.anInt1094][i_50_ - this.anInt1095 * 1929878913] & 0x2) == 0 && (i_55_ & 0x4) == 0) {
					return true;
				}
				if (i_50_ != 1 + i_58_ || i < i_51_ || i > i_57_ || (anIntArrayArray1085[i - -2041994183 * this.anInt1094][i_50_ - 1929878913 * this.anInt1095] & 0x20) != 0 || (i_55_ & 0x1) != 0) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "fa.s()");
			}
			return true;
		} while (false);
		return false;
	}
}
