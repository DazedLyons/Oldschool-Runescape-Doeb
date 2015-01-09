/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;

public class Class101 {
	public static final int anInt1252 = 78;
	static Class91_Sub20_Sub13_Sub1 aClass91_Sub20_Sub13_Sub1_1253;
	static Class91_Sub20_Sub13_Sub1 aClass91_Sub20_Sub13_Sub1_1254;
	static String aString1255 = "";
	static Class91_Sub20_Sub13_Sub3 aClass91_Sub20_Sub13_Sub3_1256;
	static boolean aBoolean1257;
	static Class91_Sub20_Sub13_Sub1 aClass91_Sub20_Sub13_Sub1_1258;
	static final int anInt1259 = 202;
	static final int anInt1260 = 171;
	static final int anInt1261 = 360;
	static int[] anIntArray1262 = new int[256];
	static int[] anIntArray1263;
	static int anInt1264 = 0;
	static String aString1265 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00c2\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
	static int[] anIntArray1266;
	static int anInt1267 = 0;
	static int anInt1268 = 0;
	static int anInt1269 = 0;
	static int anInt1270 = 0;
	static Class91_Sub20_Sub13_Sub3 aClass91_Sub20_Sub13_Sub3_1271;
	static String aString1272 = "";
	static int anInt1273 = 0;
	static int[] anIntArray1274 = { 1, 1, 1, 1 };
	static String aString1275 = "";
	static int anInt1276 = 804279542;
	static String aString1277 = "";
	static String aString1278 = "";
	static int anInt1279 = 0;
	static Class91_Sub20_Sub13_Sub1[] aClass91_Sub20_Sub13_Sub1Array1280;
	static final int anInt1281 = 200;
	static Class91_Sub20_Sub13_Sub1[] aClass91_Sub20_Sub13_Sub1Array1282;
	static boolean aBoolean1283 = false;
	static final int anInt1284 = 2;
	static int[] anIntArray1285 = { 0, 1, 2, 3 };
	static String aString1286 = "";
	static int anInt1287 = -1671154067;
	static int anInt1288;
	static final int anInt1289 = 2;
	static int anInt1290 = 0;
	static int anInt1291 = 0;

	Class101() throws Throwable {
		try {
			throw new Error();
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "q.<init>()");
		}
	}

	static final void method1076(final int i, final String string, final String string_0_, final int i_1_) {
		try {
			Class91_Sub20_Sub14_Sub1_Sub2.method935(i, string, string_0_, null, (byte) -31);
		} catch (final RuntimeException var4) {
			throw Class102.method1086(var4, "q.co()");
		}
	}

	public static void method1077(final Js5 class63, final int i) {
		try {
			Class91_Sub20_Sub6.aClass63_2285 = class63;
			Class91_Sub20_Sub6.anInt2286 = Class91_Sub20_Sub6.aClass63_2285.method405(16, -89833451) * -771913387;
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "q.i()");
		}
	}

	public static void method1078(final String string, final String string_2_, final int i, final int i_3_, final int i_4_) throws IOException {
		try {
			Class91_Sub20_Sub16.anInt2501 = i_3_ * 334229995;
			Class35.anInt415 = -477765905 * i;
			try {
				Class91_Sub5.aString1798 = System.getProperty("os.name");
			} catch (final Exception exception) {
				Class91_Sub5.aString1798 = "Unknown";
			}
			Class103.aString1323 = Class91_Sub5.aString1798.toLowerCase();
			try {
				Class45.aString1436 = System.getProperty("user.home");
				if (Class45.aString1436 != null) {
					Class45.aString1436 = new StringBuilder(Class45.aString1436).append("/").toString();
				}
			} catch (final Exception exception) {
				/* empty */
			}
			try {
				if (Class103.aString1323.startsWith("win")) {
					if (Class45.aString1436 == null) {
						Class45.aString1436 = System.getenv("USERPROFILE");
					}
				} else if (Class45.aString1436 == null) {
					Class45.aString1436 = System.getenv("HOME");
				}
				if (Class45.aString1436 != null) {
					Class45.aString1436 = new StringBuilder(Class45.aString1436).append("/").toString();
				}
			} catch (final Exception exception) {
				/* empty */
			}
			if (Class45.aString1436 == null) {
				Class45.aString1436 = "~/";
			}
			Class108.aStringArray1402 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class45.aString1436, "/tmp/", "" };
			Class7.aStringArray103 = new String[] { new StringBuilder(".jagex_cache_").append(374804495 * Class35.anInt415).toString(), new StringBuilder(".file_store_").append(374804495 * Class35.anInt415).toString() };
			int i_5_ = 0;
			while_27_: while (i_5_ < 4) {
				final String string_6_ = i_5_ == 0 ? "" : new StringBuilder().append(i_5_).toString();
				Class99.aFile1236 = new File(Class45.aString1436, new StringBuilder("jagex_cl_").append(string).append("_").append(string_2_).append(string_6_).append(".dat").toString());
				String string_7_ = null;
				String string_8_ = null;
				boolean bool = false;
				if (Class99.aFile1236.exists()) {
					try {
						final Class2 class2 = new Class2(Class99.aFile1236, "rw", 10000L);
						int i_9_;
						ByteBuffer class91_sub9;
						for (class91_sub9 = new ByteBuffer((int) class2.method85((byte) -22)); class91_sub9.currentOffset * -1128893257 < class91_sub9.buffer.length; class91_sub9.currentOffset += 565881095 * i_9_) {
							i_9_ = class2.method86(class91_sub9.buffer, -1128893257 * class91_sub9.currentOffset, class91_sub9.buffer.length - -1128893257 * class91_sub9.currentOffset, -1114471681);
							if (-1 == i_9_) {
								throw new IOException();
							}
						}
						class91_sub9.currentOffset = 0;
						i_9_ = class91_sub9.readUnsignedByte();
						if (i_9_ < 1 || i_9_ > 3) {
							throw new IOException(new StringBuilder().append(i_9_).toString());
						}
						int i_10_ = 0;
						if (i_9_ > 1) {
							i_10_ = class91_sub9.readUnsignedByte();
						}
						if (i_9_ <= 2) {
							string_7_ = class91_sub9.method673((byte) 1);
							if (i_10_ == 1) {
								string_8_ = class91_sub9.method673((byte) 1);
							}
						} else {
							string_7_ = class91_sub9.method646((byte) 0);
							if (1 == i_10_) {
								string_8_ = class91_sub9.method646((byte) 0);
							}
						}
						class2.method87((byte) 59);
					} catch (final IOException ioexception) {
						ioexception.printStackTrace();
					}
					if (string_7_ != null) {
						final File file = new File(string_7_);
						if (!file.exists()) {
							string_7_ = null;
						}
					}
					if (string_7_ != null) {
						final File file = new File(string_7_, "test.dat");
						if (!Class1.method77(file, true, -800231774)) {
							string_7_ = null;
						}
					}
				}
				if (string_7_ == null && i_5_ == 0) {
					while_26_: for (int i_11_ = 0; i_11_ < Class7.aStringArray103.length; i_11_++) {
						for (int i_12_ = 0; i_12_ < Class108.aStringArray1402.length; i_12_++) {
							final File file = new File(new StringBuilder(Class108.aStringArray1402[i_12_]).append(Class7.aStringArray103[i_11_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
							if (file.exists() && Class1.method77(new File(file, "test.dat"), true, -800231774)) {
								string_7_ = file.toString();
								bool = true;
								break while_26_;
							}
						}
					}
				}
				if (string_7_ == null) {
					string_7_ = new StringBuilder(Class45.aString1436).append(File.separatorChar).append("jagexcache").append(string_6_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_2_).append(File.separatorChar).toString();
					bool = true;
				}
				if (string_8_ != null) {
					final File file = new File(string_8_);
					final File file_13_ = new File(string_7_);
					try {
						final File[] files = file.listFiles();
						final File[] files_14_ = files;
						File[] files_16_;
						final int i_15_ = (files_16_ = files_14_).length;
						for (int i_17_ = 0; i_17_ < i_15_; i_17_++) {
							final File file_18_ = files_16_[i_17_];
							final File file_19_ = new File(file_13_, file_18_.getName());
							final boolean bool_20_ = file_18_.renameTo(file_19_);
							if (!bool_20_) {
								throw new IOException();
							}
						}
					} catch (final Exception exception) {
						exception.printStackTrace();
					}
					bool = true;
				}
				if (bool) {
					Class1.method76(new File(string_7_), null, 1378977969);
				}
				final File file = new File(string_7_);
				Class35.aFile424 = file;
				if (!Class35.aFile424.exists()) {
					Class35.aFile424.mkdirs();
				}
				final File[] files = Class35.aFile424.listFiles();
				if (files == null) {
					break;
				}
				final File[] files_21_ = files;
				int i_22_ = 0;
				for (;;) {
					if (i_22_ >= files_21_.length) {
						break while_27_;
					}
					final File file_23_ = files_21_[i_22_];
					if (!Class1.method77(file_23_, false, -800231774)) {
						i_5_++;
						break;
					}
					i_22_++;
				}
			}
			final File file = Class35.aFile424;
			Class18.aFile251 = file;
			if (!Class18.aFile251.exists()) {
				throw new RuntimeException("");
			}
			Class18.aBoolean245 = true;
			Class91_Sub22.method1038(1430966369);
			Class35.aClass4_417 = new Class4(new Class2(Class91_Sub20_Sub2.method739("main_file_cache.dat2", (short) -2894), "rw", 1048576000L), 5200, 0);
			Class35.aClass4_418 = new Class4(new Class2(Class91_Sub20_Sub2.method739("main_file_cache.idx255", (short) 4070), "rw", 1048576L), 6000, 0);
			Class1.aClass4Array35 = new Class4[Class91_Sub20_Sub16.anInt2501 * 2135666371];
			for (int i_24_ = 0; i_24_ < 2135666371 * Class91_Sub20_Sub16.anInt2501; i_24_++) {
				Class1.aClass4Array35[i_24_] = new Class4(new Class2(Class91_Sub20_Sub2.method739(new StringBuilder("main_file_cache.idx").append(i_24_).toString(), (short) -14538), "rw", 1048576L), 6000, 0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "q.i()");
		}
	}

	static final void method1079(final boolean bool, final int i) {
		try {
			client.aBoolean1498 = bool;
			if (!client.aBoolean1498) {
				final int i_25_ = client.aClass91_Sub9_Sub1_1480.method656(830588933);
				final int i_26_ = client.aClass91_Sub9_Sub1_1480.method662(1511091638);
				int i_27_ = (1152500623 * client.anInt1570 - -1128893257 * client.aClass91_Sub9_Sub1_1480.currentOffset) / 16;
				Class81.anIntArrayArray1121 = new int[i_27_][4];
				for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
					for (int i_29_ = 0; i_29_ < 4; i_29_++) {
						Class81.anIntArrayArray1121[i_28_][i_29_] = client.aClass91_Sub9_Sub1_1480.method669(2020318655);
					}
				}
				final int i_30_ = client.aClass91_Sub9_Sub1_1480.method662(1305777632);
				final int i_31_ = client.aClass91_Sub9_Sub1_1480.method686((byte) -70);
				final int i_32_ = client.aClass91_Sub9_Sub1_1480.method663((byte) -124);
				Class68.anIntArray802 = new int[i_27_];
				Class91_Sub24.anIntArray2140 = new int[i_27_];
				Class91_Sub21.anIntArray2089 = new int[i_27_];
				ByteBuffer.aByteArrayArray1859 = new byte[i_27_][];
				Class91_Sub5.aByteArrayArray1805 = new byte[i_27_][];
				boolean bool_33_ = false;
				if ((i_32_ / 8 == 48 || 49 == i_32_ / 8) && i_26_ / 8 == 48) {
					bool_33_ = true;
				}
				if (48 == i_32_ / 8 && i_26_ / 8 == 148) {
					bool_33_ = true;
				}
				i_27_ = 0;
				for (int i_34_ = (i_32_ - 6) / 8; i_34_ <= (i_32_ + 6) / 8; i_34_++) {
					for (int i_35_ = (i_26_ - 6) / 8; i_35_ <= (6 + i_26_) / 8; i_35_++) {
						final int i_36_ = i_35_ + (i_34_ << 8);
						if (!bool_33_ || 49 != i_35_ && i_35_ != 149 && i_35_ != 147 && 50 != i_34_ && (49 != i_34_ || 47 != i_35_)) {
							Class68.anIntArray802[i_27_] = i_36_;
							Class91_Sub24.anIntArray2140[i_27_] = Class67.aClass63_Sub1_800.method409(new StringBuilder("m").append(i_34_).append("_").append(i_35_).toString(), 1485809013);
							Class91_Sub21.anIntArray2089[i_27_] = Class67.aClass63_Sub1_800.method409(new StringBuilder("l").append(i_34_).append("_").append(i_35_).toString(), 785253317);
							i_27_++;
						}
					}
				}
				Class41.method347(i_32_, i_26_, i_25_, i_30_, i_31_, -712014186);
			} else {
				final int i_37_ = client.aClass91_Sub9_Sub1_1480.method662(2090548442);
				final int i_38_ = client.aClass91_Sub9_Sub1_1480.method656(547116195);
				client.aClass91_Sub9_Sub1_1480.method695((byte) 5);
				for (int i_39_ = 0; i_39_ < 4; i_39_++) {
					for (int i_40_ = 0; i_40_ < 13; i_40_++) {
						for (int i_41_ = 0; i_41_ < 13; i_41_++) {
							final int i_42_ = client.aClass91_Sub9_Sub1_1480.method693(1, 1286800452);
							if (i_42_ == 1) {
								client.anIntArrayArrayArray1499[i_39_][i_40_][i_41_] = client.aClass91_Sub9_Sub1_1480.method693(26, 1286800452);
							} else {
								client.anIntArrayArrayArray1499[i_39_][i_40_][i_41_] = -1;
							}
						}
					}
				}
				client.aClass91_Sub9_Sub1_1480.method694((byte) 109);
				int i_43_ = (client.anInt1570 * 1152500623 - client.aClass91_Sub9_Sub1_1480.currentOffset * -1128893257) / 16;
				Class81.anIntArrayArray1121 = new int[i_43_][4];
				for (int i_44_ = 0; i_44_ < i_43_; i_44_++) {
					for (int i_45_ = 0; i_45_ < 4; i_45_++) {
						Class81.anIntArrayArray1121[i_44_][i_45_] = client.aClass91_Sub9_Sub1_1480.method669(1870364121);
					}
				}
				final int i_46_ = client.aClass91_Sub9_Sub1_1480.method662(1845817537);
				final int i_47_ = client.aClass91_Sub9_Sub1_1480.method663((byte) -11);
				final int i_48_ = client.aClass91_Sub9_Sub1_1480.method663((byte) -26);
				Class68.anIntArray802 = new int[i_43_];
				Class91_Sub24.anIntArray2140 = new int[i_43_];
				Class91_Sub21.anIntArray2089 = new int[i_43_];
				ByteBuffer.aByteArrayArray1859 = new byte[i_43_][];
				Class91_Sub5.aByteArrayArray1805 = new byte[i_43_][];
				i_43_ = 0;
				for (int i_49_ = 0; i_49_ < 4; i_49_++) {
					for (int i_50_ = 0; i_50_ < 13; i_50_++) {
						if (i == 1578143239) {
							return;
						}
						for (int i_51_ = 0; i_51_ < 13; i_51_++) {
							final int i_52_ = client.anIntArrayArrayArray1499[i_49_][i_50_][i_51_];
							if (-1 != i_52_) {
								final int i_53_ = i_52_ >> 14 & 0x3ff;
								final int i_54_ = i_52_ >> 3 & 0x7ff;
								int i_55_ = (i_53_ / 8 << 8) + i_54_ / 8;
								for (int i_56_ = 0; i_56_ < i_43_; i_56_++) {
									if (Class68.anIntArray802[i_56_] == i_55_) {
										i_55_ = -1;
										break;
									}
								}
								if (i_55_ != -1) {
									Class68.anIntArray802[i_43_] = i_55_;
									final int i_57_ = i_55_ >> 8 & 0xff;
									final int i_58_ = i_55_ & 0xff;
									Class91_Sub24.anIntArray2140[i_43_] = Class67.aClass63_Sub1_800.method409(new StringBuilder("m").append(i_57_).append("_").append(i_58_).toString(), 1659688091);
									Class91_Sub21.anIntArray2089[i_43_] = Class67.aClass63_Sub1_800.method409(new StringBuilder("l").append(i_57_).append("_").append(i_58_).toString(), -187266885);
									i_43_++;
								}
							}
						}
					}
				}
				Class41.method347(i_48_, i_47_, i_38_, i_37_, i_46_, -470752990);
			}
		} catch (final RuntimeException var17) {
			throw Class102.method1086(var17, "q.ad()");
		}
	}
}
