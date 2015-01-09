/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91 {
	public Class91 aClass91_1191;
	public long aLong1192;
	Class91 aClass91_1193;

	protected Class91() {
		/* empty */
	}

	public boolean method494() {
		if (this.aClass91_1193 != null) {
			return true;
		}
		return false;
	}

	public void method495() {
		if (this.aClass91_1193 != null) {
			this.aClass91_1193.aClass91_1191 = aClass91_1191;
			aClass91_1191.aClass91_1193 = this.aClass91_1193;
			aClass91_1191 = null;
			this.aClass91_1193 = null;
		}
	}
}
