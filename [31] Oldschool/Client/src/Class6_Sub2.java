/* Class6_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class6_Sub2 extends Class6 {
	int anInt1710;
	SourceDataLine aSourceDataLine1711;
	AudioFormat anAudioFormat1712;
	byte[] aByteArray1713;

	@Override
	void method116(final int i) throws LineUnavailableException {
		try {
			try {
				final DataLine.Info info = new DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.anAudioFormat1712, i << (aBoolean80 ? 2 : 1));
				this.aSourceDataLine1711 = (SourceDataLine) AudioSystem.getLine(info);
				this.aSourceDataLine1711.open();
				this.aSourceDataLine1711.start();
				this.anInt1710 = -15799405 * i;
			} catch (final LineUnavailableException lineunavailableexception) {
				if (Class91_Sub20_Sub5.method760(i, -1614153257) != 1) {
					int i_0_ = i - 1;
					i_0_ |= i_0_ >>> 1;
					i_0_ |= i_0_ >>> 2;
					i_0_ |= i_0_ >>> 4;
					i_0_ |= i_0_ >>> 8;
					i_0_ |= i_0_ >>> 16;
					final int i_1_ = 1 + i_0_;
					method116(i_1_);
				} else {
					this.aSourceDataLine1711 = null;
					throw lineunavailableexception;
				}
			}
		} catch (final RuntimeException var6) {
			throw Class102.method1086(var6, "az.w()");
		}
	}

	void method115(final Component component) {
		try {
			this.anAudioFormat1712 = new AudioFormat(anInt81 * -45833585, 16, aBoolean80 ? 2 : 1, true, false);
			this.aByteArray1713 = new byte[256 << (aBoolean80 ? 2 : 1)];
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "az.i()");
		}
	}

	@Override
	int method114() {
		int i;
		try {
			i = 2058480283 * this.anInt1710 - (this.aSourceDataLine1711.available() >> (aBoolean80 ? 2 : 1));
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "az.f()");
		}
		return i;
	}

	@Override
	void method117() {
		int i = 256;
		if (aBoolean80) {
			i <<= 1;
		}
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			int i_3_ = this.anIntArray85[i_2_];
			if ((i_3_ + 8388608 & ~0xffffff) != 0) {
				i_3_ = 0x7fffff ^ i_3_ >> 31;
			}
			this.aByteArray1713[2 * i_2_] = (byte) (i_3_ >> 8);
			this.aByteArray1713[1 + 2 * i_2_] = (byte) (i_3_ >> 16);
		}
		this.aSourceDataLine1711.write(this.aByteArray1713, 0, i << 1);
	}

	@Override
	void method111() {
		try {
			this.aSourceDataLine1711.flush();
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "az.d()");
		}
	}

	Class6_Sub2() {
		/* empty */
	}

	@Override
	void method118() {
		try {
			if (this.aSourceDataLine1711 != null) {
				this.aSourceDataLine1711.close();
				this.aSourceDataLine1711 = null;
			}
		} catch (final RuntimeException var1) {
			throw Class102.method1086(var1, "az.t()");
		}
	}
}
