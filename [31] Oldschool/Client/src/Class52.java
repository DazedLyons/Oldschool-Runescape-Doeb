/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

public class Class52 {
	public static final int anInt632 = 244;
	public static final int anInt633 = 5;
	static final int anInt634 = 53;
	Inflater anInflater635;

	Class52(final int i, final int i_0_, final int i_1_) {
		/* empty */
	}

	public Class52() {
		this(-1, 1000000, 1000000);
	}

	public void method374(final ByteBuffer class91_sub9, final byte[] is, final int i) {
		try {
			if (31 == class91_sub9.buffer[-1128893257 * class91_sub9.currentOffset] && class91_sub9.buffer[1 + -1128893257 * class91_sub9.currentOffset] == -117) {
				if (this.anInflater635 == null) {
					this.anInflater635 = new Inflater(true);
				}
				try {
					this.anInflater635.setInput(class91_sub9.buffer, class91_sub9.currentOffset * -1128893257 + 10, class91_sub9.buffer.length - (8 + class91_sub9.currentOffset * -1128893257 + 10));
					this.anInflater635.inflate(is);
				} catch (final Exception exception) {
					this.anInflater635.reset();
					throw new RuntimeException("");
				}
				this.anInflater635.reset();
			} else {
				throw new RuntimeException("");
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "dp.i()");
		}
	}
}
