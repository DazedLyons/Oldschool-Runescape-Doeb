/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class13 {
	int[] anIntArray186 = new int[2];
	int[] anIntArray187 = new int[2];
	int anInt188;
	int anInt189;
	int anInt190;
	int anInt191;
	int anInt192 = 2;
	int anInt193;
	int anInt194;
	int anInt195;
	int anInt196;

	final int method168(final int i) {
		if (this.anInt195 >= this.anInt191) {
			this.anInt188 = this.anIntArray186[this.anInt193++] << 15;
			if (this.anInt193 >= this.anInt192) {
				this.anInt193 = this.anInt192 - 1;
			}
			this.anInt191 = (int) (this.anIntArray187[this.anInt193] / 65536.0 * i);
			if (this.anInt191 > this.anInt195) {
				this.anInt194 = ((this.anIntArray186[this.anInt193] << 15) - this.anInt188) / (this.anInt191 - this.anInt195);
			}
		}
		this.anInt188 += this.anInt194;
		this.anInt195++;
		return this.anInt188 - this.anInt194 >> 15;
	}

	final void method169(final ByteBuffer class91_sub9) {
		this.anInt189 = class91_sub9.readUnsignedByte();
		this.anInt196 = class91_sub9.readDword();
		this.anInt190 = class91_sub9.readDword();
		method171(class91_sub9);
	}

	final void method170() {
		this.anInt191 = 0;
		this.anInt193 = 0;
		this.anInt194 = 0;
		this.anInt188 = 0;
		this.anInt195 = 0;
	}

	Class13() {
		this.anIntArray187[0] = 0;
		this.anIntArray187[1] = 65535;
		this.anIntArray186[0] = 0;
		this.anIntArray186[1] = 65535;
	}

	final void method171(final ByteBuffer class91_sub9) {
		this.anInt192 = class91_sub9.readUnsignedByte();
		this.anIntArray187 = new int[this.anInt192];
		this.anIntArray186 = new int[this.anInt192];
		for (int i = 0; i < this.anInt192; i++) {
			this.anIntArray187[i] = class91_sub9.method686((byte) -107);
			this.anIntArray186[i] = class91_sub9.method686((byte) -23);
		}
	}
}
