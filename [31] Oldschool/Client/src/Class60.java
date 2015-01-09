/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class60 {
	public static final int anInt737 = 41;
	public static final Class60 aClass60_738 = new Class60("BUILDLIVE", 3);
	public static final Class60 aClass60_739 = new Class60("RC", 1);
	static final int anInt740 = 49;
	public final String aString741;
	public static final Class60 aClass60_742 = new Class60("LIVE", 0);
	static final int anInt743 = 1;
	public static final Class60 aClass60_744 = new Class60("WIP", 2);
	public final int anInt745;
	public static final int anInt746 = 107;
	public static final int anInt747 = 169;

	static Class108 method391(final byte i) {
		Class108 class108;
		try {
			Class2 class2 = null;
			Class108 class108_0_ = new Class108();
			try {
				class2 = Class102.method1087("", client.aClass65_1443.aString1420, false, (short) 14173);
				final byte[] is = new byte[(int) class2.method85((byte) 82)];
				int i_1_;
				for (int i_2_ = 0; i_2_ < is.length; i_2_ += i_1_) {
					i_1_ = class2.method86(is, i_2_, is.length - i_2_, -1114471681);
					if (-1 == i_1_) {
						throw new IOException();
					}
				}
				class108_0_ = new Class108(new ByteBuffer(is));
			} catch (final Exception exception) {
				/* empty */
			}
			try {
				if (class2 != null) {
					class2.method87((byte) -13);
				}
			} catch (final Exception exception) {
				/* empty */
			}
			class108 = class108_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eb.f()");
		}
		return class108;
	}

	public static LocType method392(final int i, final int i_3_) {
		//so i know i probably wasnt helpful but i identified a few for u lol
		//all good but another thing.. Idk if frost sent me it correctly or if i'm just missing these things.
		//i only have two options for the frame am i outdated or? thats all i added so far
		LocType class91_sub20_sub7;
		try {
			LocType class91_sub20_sub7_4_ = (LocType) LocType.aClass96_2299.method1068(i);
			if (class91_sub20_sub7_4_ != null) {
				return class91_sub20_sub7_4_;
			}
			final byte[] is = LocType.aClass63_2336.getFile(6, i, 948179739);//this is archive 6 in index2// which is objects/loc
			//how'd you change?? As in one button change all. never knew that
			class91_sub20_sub7_4_ = new LocType();//highlight then press alt+shift+r
			class91_sub20_sub7_4_.anInt2304 = -1362439873 * i;
			if (is != null) {
				class91_sub20_sub7_4_.decode(new ByteBuffer(is), -2088271103);
			}
			class91_sub20_sub7_4_.postDecode(808641238);
			if (class91_sub20_sub7_4_.aBoolean2337) {
				class91_sub20_sub7_4_.anInt2314 = 0;
				class91_sub20_sub7_4_.aBoolean2315 = false;
			}
			LocType.aClass96_2299.method1067(class91_sub20_sub7_4_, i);
			class91_sub20_sub7 = class91_sub20_sub7_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eb.w()");
		}
		return class91_sub20_sub7;
	}

	Class60(final String string, final int i) {
		try {
			aString741 = string;
			anInt745 = -1509964365 * i;
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "eb.<init>()");
		}
	}

	public static Class91_Sub20_Sub6 method393(final int i, final byte i_5_) {
		Class91_Sub20_Sub6 class91_sub20_sub6;
		try {
			Class91_Sub20_Sub6 class91_sub20_sub6_6_ = (Class91_Sub20_Sub6) Class91_Sub20_Sub6.aClass96_2296.method1068(i);
			if (class91_sub20_sub6_6_ != null) {
				return class91_sub20_sub6_6_;
			}
			final byte[] is = Class91_Sub20_Sub6.aClass63_2285.getFile(16, i, 1463501545);
			class91_sub20_sub6_6_ = new Class91_Sub20_Sub6();
			if (is != null) {
				class91_sub20_sub6_6_.method764(new ByteBuffer(is), (byte) -62);
			}
			Class91_Sub20_Sub6.aClass96_2296.method1067(class91_sub20_sub6_6_, i);
			class91_sub20_sub6 = class91_sub20_sub6_6_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "eb.w()");
		}
		return class91_sub20_sub6;
	}
}
