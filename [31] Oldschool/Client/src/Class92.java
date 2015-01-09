/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class92 {
	Class86 aClass86_1194;
	Class86 aClass86_1195 = new Class86();

	public void method1054(final Class86 class86) {
		if (class86.aClass86_1170 != null) {
			class86.method488();
		}
		class86.aClass86_1170 = this.aClass86_1195.aClass86_1170;
		class86.aClass86_1171 = this.aClass86_1195;
		class86.aClass86_1170.aClass86_1171 = class86;
		class86.aClass86_1171.aClass86_1170 = class86;
	}

	public Class86 method1055() {
		final Class86 class86 = this.aClass86_1194;
		if (class86 == this.aClass86_1195) {
			this.aClass86_1194 = null;
			return null;
		}
		this.aClass86_1194 = class86.aClass86_1171;
		return class86;
	}

	public Class92() {
		this.aClass86_1195.aClass86_1171 = this.aClass86_1195;
		this.aClass86_1195.aClass86_1170 = this.aClass86_1195;
	}

	public Class86 method1056() {
		final Class86 class86 = this.aClass86_1195.aClass86_1171;
		if (class86 == this.aClass86_1195) {
			this.aClass86_1194 = null;
			return null;
		}
		this.aClass86_1194 = class86.aClass86_1171;
		return class86;
	}
}
