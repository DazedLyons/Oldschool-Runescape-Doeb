/* AppletStubContext - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Properties;

public class AppletStubContext implements AppletStub, AppletContext, Enumeration {
	public static boolean ALLOW_SHOW_DOCUMENT = false;
	private int nextElementCalled = 0;
	private final HashMap appletStreams = new HashMap();
	private final HashMap parameters = new HashMap();
	private URL codeBase;
	private URL documentBase;

	@Override
	public void appletResize(final int i, final int i_0_) {
		/* empty */
	}

	@Override
	public AppletContext getAppletContext() {
		return this;
	}

	@Override
	public URL getCodeBase() {
		return codeBase;
	}

	public void setCodeBase(final URL url) {
		codeBase = url;
	}

	@Override
	public URL getDocumentBase() {
		return documentBase;
	}

	public void setDocumentBase(final URL url) {
		documentBase = url;
	}

	@Override
	public String getParameter(final String string) {
		return (String) getParameters().get(string);
	}

	public void putParameter(final String string, final String string_1_) {
		getParameters().put(string, string_1_);
	}

	@Override
	public boolean isActive() {
		return true;
	}

	@Override
	public java.applet.AudioClip getAudioClip(final URL url) {
		return new AudioClip(url);
	}

	@Override
	public Image getImage(final URL url) {
		return Toolkit.getDefaultToolkit().createImage(url);
	}

	@Override
	public Applet getApplet(final String string) {
		return null;
	}

	@Override
	public Enumeration getApplets() {
		return this;
	}

	@Override
	public void showDocument(final URL url) {
		if (ALLOW_SHOW_DOCUMENT && Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().browse(url.toURI());
			} catch (final IOException ioexception) {
				ioexception.printStackTrace();
			} catch (final URISyntaxException urisyntaxexception) {
				urisyntaxexception.printStackTrace();
			}
		} else {
			url.toString().contains("runescape.com/l=");
		}
	}

	@Override
	public void showDocument(final URL url, final String string) {
		showDocument(url);
	}

	@Override
	public void showStatus(final String string) {
		System.out.println(string);
	}

	@Override
	public void setStream(final String string, final InputStream inputstream) throws IOException {
		appletStreams.put(string, inputstream);
	}

	@Override
	public InputStream getStream(final String string) {
		return (InputStream) appletStreams.get(string);
	}

	@Override
	public Iterator getStreamKeys() {
		return appletStreams.keySet().iterator();
	}

	@Override
	public boolean hasMoreElements() {
		if (nextElementCalled == 0) {
			return true;
		}
		return false;
	}

	@Override
	public Applet nextElement() throws NoSuchElementException {
		nextElementCalled++;
		if (nextElementCalled != 1) {
			throw new NoSuchElementException();
		}
		return null;
	}

	public static AppletStubContext create(final Properties properties, final URL url) {
		final AppletStubContext appletstubcontext = new AppletStubContext();
		appletstubcontext.setCodeBase(url);
		appletstubcontext.setDocumentBase(url);
		final Iterator iterator = properties.keySet().iterator();
		while (iterator.hasNext()) {
			final Object object = iterator.next();
			appletstubcontext.putParameter(object.toString(), properties.get(object).toString());
			System.out.println(new StringBuilder("client_parameters.put(\"").append(object).append("\" , \"").append(properties.get(object)).append("\");").toString());
		}
		return appletstubcontext;
	}

	public HashMap getParameters() {
		return parameters;
	}

}
