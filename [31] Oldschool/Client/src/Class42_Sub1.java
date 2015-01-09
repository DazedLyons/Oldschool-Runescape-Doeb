/* Class42_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class42_Sub1 extends Class42 {
	ByteBuffer aByteBuffer1733;

	@Override
	void method353(final byte[] is) {
		this.aByteBuffer1733 = ByteBuffer.allocateDirect(is.length);
		this.aByteBuffer1733.position(0);
		this.aByteBuffer1733.put(is);
	}

	Class42_Sub1() {
		/* empty */
	}

	@Override
	byte[] method350(final byte i) {
		byte[] is;
		try {
			final byte[] is_0_ = new byte[this.aByteBuffer1733.capacity()];
			this.aByteBuffer1733.position(0);
			this.aByteBuffer1733.get(is_0_);
			is = is_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "di.e()");
		}
		return is;
	}

	@Override
	byte[] method348() {
		final byte[] is = new byte[this.aByteBuffer1733.capacity()];
		this.aByteBuffer1733.position(0);
		this.aByteBuffer1733.get(is);
		return is;
	}

	@Override
	void method349(final byte[] is, final byte i) {
		try {
			this.aByteBuffer1733 = ByteBuffer.allocateDirect(is.length);
			this.aByteBuffer1733.position(0);
			this.aByteBuffer1733.put(is);
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "di.t()");
		}
	}

	@Override
	void method352(final byte[] is) {
		this.aByteBuffer1733 = ByteBuffer.allocateDirect(is.length);
		this.aByteBuffer1733.position(0);
		this.aByteBuffer1733.put(is);
	}

	@Override
	byte[] method351() {
		final byte[] is = new byte[this.aByteBuffer1733.capacity()];
		this.aByteBuffer1733.position(0);
		this.aByteBuffer1733.get(is);
		return is;
	}
}
