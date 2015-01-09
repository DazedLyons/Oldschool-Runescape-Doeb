/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class87 {
	int[] anIntArray1172;

	public int method491(final int i) {
		final int i_0_ = (this.anIntArray1172.length >> 1) - 1;
		int i_1_ = i & i_0_;
		for (;;) {
			final int i_2_ = this.anIntArray1172[i_1_ + i_1_ + 1];
			if (i_2_ == -1) {
				return -1;
			}
			if (this.anIntArray1172[i_1_ + i_1_] == i) {
				return i_2_;
			}
			i_1_ = i_1_ + 1 & i_0_;
		}
	}

	public Class87(final int[] is) {
		int i;
		for (i = 1; i <= is.length + (is.length >> 1); i <<= 1) {
			/* empty */
		}
		this.anIntArray1172 = new int[i + i];
		for (int i_3_ = 0; i_3_ < i + i; i_3_++) {
			this.anIntArray1172[i_3_] = -1;
		}
		int i_4_ = 0;
		while (i_4_ < is.length) {
			int var4;
			for (var4 = is[i_4_] & i - 1; this.anIntArray1172[var4 + var4 + 1] != -1; var4 = var4 + 1 & i - 1) {
				/* empty */
			}
			this.anIntArray1172[var4 + var4] = is[i_4_];
			this.anIntArray1172[var4 + var4 + 1] = i_4_++;
		}
	}
}
