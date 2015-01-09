/* AudioClip - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

class AudioClip implements java.applet.AudioClip {
	public static final short STATE_STOPPED = 0;
	public static final short STATE_PLAYING = 1;
	public static final short STATE_LOOPING = 2;
	private final URL sourceURL;
	private short audioClipState;

	public AudioClip(final URL url) {
		sourceURL = url;
		audioClipState = (short) 0;
	}

	public short getAudioClipState() {
		return audioClipState;
	}

	public URL getURL() {
		return sourceURL;
	}

	@Override
	public boolean equals(final Object object) {
		if (object == null) {
			return false;
		}
		if (object == this) {
			return true;
		}
		if (!(object instanceof AudioClip)) {
			return false;
		}
		final AudioClip audioclip_0_ = (AudioClip) object;
		if (audioclip_0_.getAudioClipState() == audioClipState && audioclip_0_.getURL().equals(sourceURL)) {
			return true;
		}
		return false;
	}

	@Override
	public void play() {
		audioClipState = (short) 1;
	}

	@Override
	public void loop() {
		audioClipState = (short) 2;
	}

	@Override
	public void stop() {
		audioClipState = (short) 0;
	}
}
