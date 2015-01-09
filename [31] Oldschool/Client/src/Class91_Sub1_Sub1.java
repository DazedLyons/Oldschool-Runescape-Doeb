/* Class91_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91_Sub1_Sub1 extends Class91_Sub1 {
	public byte[] aByteArray2149;
	int anInt2150;
	public int anInt2151;
	public int anInt2152;
	public boolean aBoolean2153;

	Class91_Sub1_Sub1(final int i, final byte[] is, final int i_0_, final int i_1_, final boolean bool) {
		anInt2152 = i;
		aByteArray2149 = is;
		anInt2151 = i_0_;
		this.anInt2150 = i_1_;
		aBoolean2153 = bool;
	}

	Class91_Sub1_Sub1(final int i, final byte[] is, final int i_2_, final int i_3_) {
		anInt2152 = i;
		aByteArray2149 = is;
		anInt2151 = i_2_;
		this.anInt2150 = i_3_;
	}

	public Class91_Sub1_Sub1 method496(final Class19 class19) {
		aByteArray2149 = class19.method190(aByteArray2149, 1688586797);
		anInt2152 = class19.method192(anInt2152, (byte) 69);
		if (anInt2151 == this.anInt2150) {
			anInt2151 = this.anInt2150 = class19.method191(anInt2151, 2135692617);
		} else {
			anInt2151 = class19.method191(anInt2151, 1757057197);
			this.anInt2150 = class19.method191(this.anInt2150, 1613546912);
			if (anInt2151 == this.anInt2150) {
				anInt2151--;
			}
		}
		return this;
	}
}
