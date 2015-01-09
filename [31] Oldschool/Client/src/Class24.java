/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.io.IOException;

public abstract class Class24 {
	static final int anInt295 = 89;
	static final int anInt296 = 400;
	static final int anInt297 = 256;
	static int anInt298;
	static final int anInt299 = 16;
	static int anInt300;

	public abstract void method214(Component component);

	public abstract void method215(Component component, byte i);

	public abstract void method216(Component component);

	public abstract int method217(byte i);

	public abstract void method218(Component component, int i);

	public abstract void method219(Component component);

	public abstract void method220(Component component);

	public abstract void method221(Component component);

	Class24() {
		/* empty */
	}

	public abstract int method222();

	public abstract int method223();

	public abstract int method224();

	public abstract void method225(Component component);

	static final void method226(final boolean bool, final byte i) {
		do {
			try {
				Class91_Sub20_Sub5.method759((byte) -83);
				client.anInt1628 += 1423314787;
				if (client.anInt1628 * 867428939 >= 50 || bool) {
					client.anInt1628 = 0;
					if (!client.aBoolean1489 && Class91_Sub20_Sub14_Sub6.aClass20_2819 != null) {
						client.aClass91_Sub9_Sub1_1478.method690(217, 1160292001);
						try {
							Class91_Sub20_Sub14_Sub6.aClass20_2819.method197(client.aClass91_Sub9_Sub1_1478.buffer, 0, client.aClass91_Sub9_Sub1_1478.currentOffset * -1128893257, (byte) 0);
							client.aClass91_Sub9_Sub1_1478.currentOffset = 0;
						} catch (final IOException ioexception) {
							client.aBoolean1489 = true;
							break;
						}
					}
				}
				break;
			} catch (final RuntimeException var4) {
				throw Class102.method1086(var4, "bw.ay()");
			}
		} while (false);
	}
//this is identikit or what most people call identity kit but actually andrew gower said its identikit
	public static IdkType method227(final int i, final int i_0_) {//u could name these classes better but im using what jagex calls them
		IdkType class91_sub20_sub1;
		try {
			IdkType class91_sub20_sub1_1_ = (IdkType) IdkType.aClass96_2218.method1068(i);
			if (class91_sub20_sub1_1_ != null) {
				return class91_sub20_sub1_1_;
			}
			final byte[] is = IdkType.idkJs5.getFile(3, i, -1502105353);//this is identikit
			class91_sub20_sub1_1_ = new IdkType();
			if (is != null) {
				class91_sub20_sub1_1_.method725(new ByteBuffer(is), -765867495);
			}
			IdkType.aClass96_2218.method1067(class91_sub20_sub1_1_, i);
			class91_sub20_sub1 = class91_sub20_sub1_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bw.w()");
		}
		return class91_sub20_sub1;
	}

	public static int method228(final CharSequence charsequence, final int i) {
		int i_2_;
		try {
			final int i_3_ = charsequence.length();
			int i_4_ = 0;
			for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
				i_4_ = (i_4_ << 5) - i_4_ + Class91_Sub20_Sub2.method742(charsequence.charAt(i_5_), (byte) -31);
			}
			i_2_ = i_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "bw.t()");
		}
		return i_2_;
	}

	public abstract void method229(Component component);
}
