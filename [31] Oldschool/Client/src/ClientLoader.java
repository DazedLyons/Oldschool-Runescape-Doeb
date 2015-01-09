/* ClientLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.net.URL;
import java.util.Properties;

import javax.swing.JFrame;

public class ClientLoader {
	public Properties client_parameters = new Properties();
	public JFrame frame;

	public static boolean useISAAC = false;
	public static boolean useRSA = false;

	public static void main(final String[] strings) {
		new ClientLoader();
	}

	public ClientLoader() {
		try {
			frame = new JFrame("OS Client.");
			frame.setLayout(new BorderLayout());
			frame.setResizable(false);
			client_parameters.put("separate_jvm", "true");
			client_parameters.put("java_arguments", "-Xmx256m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
			client_parameters.put("image", "http://www.runescape.com/img/rsp777/oldschool_ani.gif");
			client_parameters.put("code", "client.class");
			client_parameters.put("boxborder", "false");
			client_parameters.put("3", "0");
			client_parameters.put("2", "5");
			client_parameters.put("haveie6", "true");
			client_parameters.put("1", "0");
			client_parameters.put("boxbgcolor", "black");
			client_parameters.put("7", "true");
			client_parameters.put("6", "366");
			client_parameters.put("5", "false");
			client_parameters.put("4", "http://www.runescape.com/slr.ws?order=LPWM");
			client_parameters.put("centerimage", "true");
			client_parameters.put("9", "true");
			client_parameters.put("archive", "gamepack_5681393.jar");
			client_parameters.put("8", "0");
			final AppletStubContext appletstubcontext = AppletStubContext.create(client_parameters, new URL("http://127.0.0.1"));
			final client var_client = new client();
			var_client.setStub(appletstubcontext);
			var_client.init();
			var_client.start();
			var_client.setPreferredSize(new Dimension(765, 503));
			frame.getContentPane().add(var_client, "Center");
			frame.pack();
			frame.setVisible(true);
		} catch (final Exception exception) {
			exception.printStackTrace();
		}
	}
}
