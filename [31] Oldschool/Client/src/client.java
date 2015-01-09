/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;

public final class client extends Applet_Sub1 {
	static int anInt1438 = 0;
	static client aClient1439;
	static boolean aBoolean1440 = true;
	static int anInt1441 = 0;
	static int anInt1442 = 0;
	static Class65 aClass65_1443;
	static int[] anIntArray1444 = new int[1000];
	static int[] anIntArray1445 = new int[32768];
	static int anInt1446 = 0;
	static int anInt1447 = 0;
	static boolean aBoolean1448 = true;
	static int anInt1449 = 0;
	static int anInt1450 = 1598011077;
	static int anInt1451 = -2022277979;
	static int anInt1452 = 738961593;
	static int anInt1453 = -780866403;
	static Class91_Sub20_Sub13_Sub3[] aClass91_Sub20_Sub13_Sub3Array1454;
	static boolean aBoolean1455 = false;
	static int anInt1456 = 0;
	static int anInt1457 = 0;
	static int anInt1458 = 0;
	static int anInt1459 = 0;
	static int[][] anIntArrayArray1460 = new int[104][104];
	static Class91_Sub18 aClass91_Sub18_1461 = null;
	static final int[] anIntArray1462 = { 44, 45, 46, 47, 48, 49, 50, 51 };
	static int anInt1463 = 0;
	static int anInt1464 = 0;
	static int anInt1465 = 0;
	static int anInt1466 = 0;
	static int anInt1467 = 0;
	static int anInt1468 = 0;
	static int anInt1469 = 0;
	static boolean aBoolean1470 = false;
	static int anInt1471 = 0;
	static int anInt1472 = 0;
	static int anInt1473 = 0;
	static int anInt1474;
	static int anInt1475 = 1573526400;
	public static final int anInt1476 = 99;
	static Class95[][][] aClass95ArrayArrayArray1477 = new Class95[4][104][104];
	static Class91_Sub9_Sub1 aClass91_Sub9_Sub1_1478 = new Class91_Sub9_Sub1(5000);
	static Class91_Sub9_Sub1 aClass91_Sub9_Sub1_1479 = new Class91_Sub9_Sub1(5000);
	static Class91_Sub9_Sub1 aClass91_Sub9_Sub1_1480 = new Class91_Sub9_Sub1(5000);
	static int anInt1536 = 1246454414;
	static String[] aStringArray1481 = new String[anInt1536 * 594310047];
	static int anInt1482 = 0;
	static int[] anIntArray1483 = new int[2048];
	static int anInt1484 = 0;
	static int anInt1485 = 0;
	static int anInt1486 = 0;
	static int[] anIntArray1487 = new int[594310047 * anInt1536];
	static int[] anIntArray1488 = new int[25];
	static boolean aBoolean1489 = false;
	static int anInt1490 = 0;
	static Class100[] aClass100Array1491 = new Class100[400];
	static int anInt1492 = 0;
	static int anInt1493 = 0;
	static ByteBuffer aClass91_Sub9_1494 = new ByteBuffer(new byte[5000]);
	static Class95 aClass95_1495 = new Class95();
	static int anInt1496 = 0;
	static int anInt1497 = 268680491;
	static boolean aBoolean1498 = false;
	static int[][][] anIntArrayArrayArray1499 = new int[4][13][13];
	static final int[] anIntArray1500 = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	static int anInt1501 = 0;
	static int[][] anIntArrayArray1502 = new int[104][104];
	static int anInt1503 = 0;
	static long aLong1504 = 6242849406103274373L;
	static int[] anIntArray1505 = new int[4000];
	static int anInt1506 = 0;
	static int anInt1507 = -503287058;
	static int anInt1508 = 0;
	static int anInt1509 = 2106523602;
	static int anInt1510 = 0;
	static int anInt1511 = 391414707;
	static int anInt1512 = 0;
	static int anInt1513 = 0;
	static int anInt1514 = 0;
	static int anInt1515 = 0;
	static int anInt1516 = -390307791;
	static int anInt1517 = 0;
	static int anInt1518 = 0;
	static int anInt1519 = -994661789;
	static int[] anIntArray1520;
	static boolean aBoolean1521 = false;
	static int anInt1522 = 0;
	static int anInt1523 = -1121286923;
	static int anInt1524 = 0;
	static boolean aBoolean1525 = false;
	static int anInt1526 = 0;
	static int anInt1527 = 0;
	static int anInt1528 = 0;
	static int anInt1529 = 0;
	static Class76[] aClass76Array1530 = new Class76[4];
	static int anInt1531;
	static int anInt1532 = 0;
	static int anInt1533 = 0;
	static int[] anIntArray1534 = new int[5];
	static int anInt1535 = 0;
	static int[] anIntArray1537 = new int[32];
	static boolean aBoolean1538 = false;
	static int anInt1539 = 0;
	static int[] anIntArray1540 = new int[594310047 * anInt1536];
	static int[] anIntArray1541 = new int[anInt1536 * 594310047];
	static int[] anIntArray1542 = new int[594310047 * anInt1536];
	static int[] anIntArray1543 = new int[594310047 * anInt1536];
	static int anInt1544 = 0;
	static int[][] anIntArrayArray1545 = new int[104][104];
	static int[] anIntArray1546 = new int[5];
	static int anInt1547 = -130624067;
	static int[] anIntArray1548 = new int[50];
	static int anInt1549 = 733031361;
	static int anInt1550 = 0;
	static int anInt1551 = 0;
	static int anInt1552 = 0;
	static String aString1553 = null;
	static int anInt1554 = 0;
	static int anInt1555 = 0;
	static int anInt1556 = 0;
	static int anInt1557 = 0;
	static boolean aBoolean1558 = false;
	static boolean aBoolean1559 = false;
	static int anInt1560 = 0;
	static int anInt1561 = 0;
	static Class91_Sub20_Sub14_Sub1_Sub1[] aClass91_Sub20_Sub14_Sub1_Sub1Array1562 = new Class91_Sub20_Sub14_Sub1_Sub1[2048];
	static int anInt1563 = 0;
	static int anInt1564 = 1609476748;
	static int anInt1565 = 0;
	static int[] anIntArray1566 = new int[2048];
	static ByteBuffer[] aClass91_Sub9Array1567 = new ByteBuffer[2048];
	static boolean aBoolean1568 = false;
	static int anInt1569 = 0;
	static int anInt1570 = 0;
	static int[] anIntArray1571 = new int[128];
	static boolean aBoolean1572 = true;
	static String[] aStringArray1573 = new String[8];
	static boolean[] aBooleanArray1574 = new boolean[8];
	static int anInt1575 = 0;
	static int anInt1576 = -2116211775;
	static Class95 aClass95_1577 = new Class95();
	static Class95 aClass95_1578 = new Class95();
	static Class95 aClass95_1579 = new Class95();
	static int[] anIntArray1580 = new int[25];
	static int[] anIntArray1581 = new int[25];
	static int anInt1582 = 0;
	static int anInt1583 = -1445930705;
	static int[] anIntArray1584 = new int[594310047 * anInt1536];
	static int anInt1585 = 0;
	static int[] anIntArray1586 = new int[500];
	static int[] anIntArray1587 = new int[500];
	static int[] anIntArray1588 = new int[500];
	static int[] anIntArray1589 = new int[500];
	static Class91_Sub20_Sub14_Sub1_Sub2[] aClass91_Sub20_Sub14_Sub1_Sub2Array1590 = new Class91_Sub20_Sub14_Sub1_Sub2[32768];
	static String[] aStringArray1591 = new String[500];
	static int anInt1592 = 1715677899;
	static int anInt1593 = -1223688735;
	static int anInt1594 = 0;
	static int anInt1595 = -1143992970;
	static int anInt1596 = 0;
	static String aString1597 = null;
	static int anInt1598 = 0;
	static int anInt1599 = 0;
	static String aString1600 = null;
	static int[] anIntArray1601 = { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
	static int anInt1602 = 1301836881;
	static Class83 aClass83_1603 = new Class83(8);
	static int anInt1604 = 0;
	static int anInt1605 = 0;
	static Class91_Sub18 aClass91_Sub18_1606 = null;
	static int anInt1607 = 0;
	static int[] anIntArray1608 = new int[100];
	static final String aString1609 = "oldschool";
	static int anInt1610 = 0;
	static boolean aBoolean1611 = false;
	static boolean aBoolean1612 = false;
	static int anInt1613 = 0;
	static int anInt1614 = 0;
	static int anInt1615 = 0;
	static int anInt1616 = 0;
	static Class91_Sub18 aClass91_Sub18_1617 = null;
	static boolean aBoolean1618 = false;
	static String aString1619 = null;
	static int anInt1620 = -497688269;
	static int anInt1621 = 1545170223;
	static Class85 aClass85_1622 = new Class85();
	static int anInt1623 = -910329709;
	static boolean aBoolean1624 = false;
	static int[] anIntArray1625 = new int[4000];
	static int[] anIntArray1626 = new int[32];
	static int anInt1627 = 0;
	static int anInt1628 = 0;
	static int anInt1629 = 0;
	static int[] anIntArray1630 = new int[32];
	static int anInt1631 = 0;
	static int anInt1632 = -2096261122;
	static int anInt1633 = 0;
	static int anInt1634 = 0;
	static int anInt1635 = 0;
	static int[] anIntArray1636 = new int[2000];
	static String[] aStringArray1637 = new String[1000];
	static String[] aStringArray1638 = new String[500];
	static Class92 aClass92_1639 = new Class92();
	static int anInt1640 = 253913873;
	static Class95 aClass95_1641 = new Class95();
	static Class83 aClass83_1642 = new Class83(512);
	static int anInt1643 = 0;
	static int anInt1644 = 752283310;
	static boolean[] aBooleanArray1645 = new boolean[100];
	static boolean[] aBooleanArray1646 = new boolean[100];
	static boolean[] aBooleanArray1647 = new boolean[100];
	static int[] anIntArray1648 = new int[100];
	static int[] anIntArray1649 = new int[100];
	static boolean aBoolean1650 = false;
	static int[] anIntArray1651 = new int[100];
	static int anInt1652 = 0;
	static int[] anIntArray1653 = new int[100];
	static String[] aStringArray1654 = new String[100];
	static String[] aStringArray1655 = new String[100];
	static String[] aStringArray1656 = new String[100];
	static int anInt1657 = -1794803679;
	static int[] anIntArray1658 = { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
	static int anInt1659 = 0;
	static int anInt1660 = -1802056771;
	static long[] aLongArray1661 = new long[100];
	static boolean aBoolean1662 = false;
	static int anInt1663 = 0;
	static int[] anIntArray1664 = new int[128];
	static int anInt1665 = 1179864391;
	static long aLong1666 = -8758961876110083129L;
	static int anInt1667 = 1136841785;
	public static final int anInt1668 = 163;
	static int anInt1669 = -1784021645;
	static int anInt1670 = 0;
	static int[] anIntArray1671 = new int[1000];
	static int[] anIntArray1672 = new int[1000];
	static Class91_Sub20_Sub13_Sub3[] aClass91_Sub20_Sub13_Sub3Array1673 = new Class91_Sub20_Sub13_Sub3[1000];
	static int anInt1674 = 0;
	static int anInt1675 = 0;
	static int anInt1676 = 0;
	static int anInt1677 = 1875851069;
	static int anInt1678 = 1817922601;
	static String aString1679 = null;
	static int anInt1680 = 385483473;
	static int[] anIntArray1681 = new int[anInt1536 * 594310047];
	static Class6 aClass6_1682;
	static int anInt1683 = 0;
	static int anInt1684 = 0;
	static int[] anIntArray1685 = new int[50];
	static int[] anIntArray1686 = new int[50];
	static int anInt1687 = 0;
	static Class22[] aClass22Array1688 = new Class22[50];
	static boolean aBoolean1689 = false;
	static boolean[] aBooleanArray1690 = new boolean[5];
	static boolean aBoolean1691 = false;
	static int[] anIntArray1692 = new int[5];
	static int anInt1693 = 0;
	static int[] anIntArray1694 = new int[5];
	static int anInt1695 = 0;
	static int anInt1696 = 0;
	static int anInt1697 = 0;
	static int anInt1698;
	static Class91_Sub18 aClass91_Sub18_1699 = null;
	static Class1[] aClass1Array1700 = new Class1[400];
	static int[] anIntArray1701 = new int[50];
	static int anInt1702 = -1065196709;
	static int anInt1703 = 76186279;
	static Class95 aClass95_1704 = new Class95();
	static int anInt1705;
	public static final int anInt1706 = 4;
	static int anInt1707 = 0;

	@Override
	protected final void method49(final byte i) {
		/* empty */
	}

	@Override
	protected final void method45(final int i) {
		try {
			int i_0_;
			if (986135985 * anInt1442 == 0) {
				i_0_ = 43594;
			} else {
				i_0_ = 121784213 * anInt1660 + 40000;
			}
			Class97.anInt1215 = -1467153203 * i_0_;
			if (986135985 * anInt1442 == 0) {
				i_0_ = 443;
			} else {
				i_0_ = 50000 + anInt1660 * 121784213;
			}
			anInt1474 = -265338895 * i_0_;
			Class28_Sub1.anInt1729 = 1949429041 * Class97.anInt1215;
			Class85.aShortArray1163 = Class80.aShortArray1115;
			Class91_Sub8.aShortArrayArray1852 = Class80.aShortArrayArray1116;
			Class85.aShortArray1161 = Class80.aShortArray1120;
			Class91_Sub20_Sub17.aShortArrayArray2503 = Class80.aShortArrayArray1118;
			if (Class25.aString311.toLowerCase().indexOf("microsoft") != -1) {
				Class15.anIntArray220[186] = 57;
				Class15.anIntArray220[187] = 27;
				Class15.anIntArray220[188] = 71;
				Class15.anIntArray220[189] = 26;
				Class15.anIntArray220[190] = 72;
				Class15.anIntArray220[191] = 73;
				Class15.anIntArray220[192] = 58;
				Class15.anIntArray220[219] = 42;
				Class15.anIntArray220[220] = 74;
				Class15.anIntArray220[221] = 43;
				Class15.anIntArray220[222] = 59;
				Class15.anIntArray220[223] = 28;
			} else {
				Class15.anIntArray220[44] = 71;
				Class15.anIntArray220[45] = 26;
				Class15.anIntArray220[46] = 72;
				Class15.anIntArray220[47] = 73;
				Class15.anIntArray220[59] = 57;
				Class15.anIntArray220[61] = 27;
				Class15.anIntArray220[91] = 42;
				Class15.anIntArray220[92] = 74;
				Class15.anIntArray220[93] = 43;
				Class15.anIntArray220[192] = 28;
				Class15.anIntArray220[222] = 58;
				Class15.anIntArray220[520] = 59;
			}
			method69(Class102.aCanvas1309, (byte) 0);
			Class91_Sub11.method703(Class102.aCanvas1309, -811609616);
			Class24_Sub1 class24_sub1;
			try {
				class24_sub1 = new Class24_Sub1();
			} catch (final Throwable throwable) {
				class24_sub1 = null;
			}
			Class105.aClass24_1366 = class24_sub1;
			if (Class105.aClass24_1366 != null) {
				if (i >= -1517645347) {
					return;
				}
				Class105.aClass24_1366.method215(Class102.aCanvas1309, (byte) 10);
			}
			Class91_Sub24.aClass14_2136 = new Class14(255, Class35.aClass4_417, Class35.aClass4_418, 500000);
			Class91_Sub20_Sub14_Sub4.aClass108_2769 = Class60.method391((byte) 25);
			if (anInt1442 * 986135985 != 0) {
				aBoolean1455 = true;
			}
		} catch (final RuntimeException var5) {
			throw Class102.method1086(var5, "client.p()");
		}
	}

	@Override
	protected final void method59(final int i) {
		try {
			final boolean bool = Class57.method386((byte) 38);
			if (bool) {
				if (i >= -63640781) {
					return;
				}
				if (aBoolean1521 && aClass6_1682 != null) {
					if (i >= -63640781) {
						return;
					}
					aClass6_1682.method121(-1305677536);
				}
			}
			if (aBoolean7) {
				if (i >= -63640781) {
					return;
				}
				final Canvas canvas = Class102.aCanvas1309;
				canvas.removeKeyListener(Class15.aClass15_216);
				canvas.removeFocusListener(Class15.aClass15_216);
				Class15.anInt221 = -271812205;
				Class35.method285(Class102.aCanvas1309, -1471960883);
				if (Class105.aClass24_1366 != null) {
					Class105.aClass24_1366.method218(Class102.aCanvas1309, -298817233);
				}
				method55(-280827620);
				method69(Class102.aCanvas1309, (byte) 0);
				Class91_Sub11.method703(Class102.aCanvas1309, -811609616);
				if (Class105.aClass24_1366 != null) {
					if (i >= -63640781) {
						return;
					}
					Class105.aClass24_1366.method215(Class102.aCanvas1309, (byte) 64);
				}
			}
			if (anInt1599 * -1935794829 == 0) {
				final int i_1_ = Class101.anInt1276 * -1610631297;
				final String string = Class101.aString1272;
				Color color = null;
				do {
					try {
						final Graphics graphics = Class102.aCanvas1309.getGraphics();
						if (Class103.aFont1330 == null) {
							if (i >= -63640781) {
								return;
							}
							Class103.aFont1330 = new Font("Helvetica", 1, 13);
							Class27.aFontMetrics323 = Class102.aCanvas1309.getFontMetrics(Class103.aFont1330);
						}
						if (aBoolean12) {
							aBoolean12 = false;
							graphics.setColor(Color.black);
							graphics.fillRect(0, 0, Class17.anInt240 * 472613227, -1872450005 * Class27.anInt333);
						}
						if (color == null) {
							color = new Color(140, 17, 17);
						}
						try {
							if (NpcType.anImage2441 == null) {
								NpcType.anImage2441 = Class102.aCanvas1309.createImage(304, 34);
							}
							final Graphics graphics_2_ = NpcType.anImage2441.getGraphics();
							graphics_2_.setColor(color);
							graphics_2_.drawRect(0, 0, 303, 33);
							graphics_2_.fillRect(2, 2, 3 * i_1_, 30);
							graphics_2_.setColor(Color.black);
							graphics_2_.drawRect(1, 1, 301, 31);
							graphics_2_.fillRect(2 + 3 * i_1_, 2, 300 - i_1_ * 3, 30);
							graphics_2_.setFont(Class103.aFont1330);
							graphics_2_.setColor(Color.white);
							graphics_2_.drawString(string, (304 - Class27.aFontMetrics323.stringWidth(string)) / 2, 22);
							graphics.drawImage(NpcType.anImage2441, 472613227 * Class17.anInt240 / 2 - 152, Class27.anInt333 * -1872450005 / 2 - 18, null);
						} catch (final Exception exception) {
							final int i_3_ = Class17.anInt240 * 472613227 / 2 - 152;
							final int i_4_ = -1872450005 * Class27.anInt333 / 2 - 18;
							graphics.setColor(color);
							graphics.drawRect(i_3_, i_4_, 303, 33);
							graphics.fillRect(2 + i_3_, i_4_ + 2, 3 * i_1_, 30);
							graphics.setColor(Color.black);
							graphics.drawRect(1 + i_3_, i_4_ + 1, 301, 31);
							graphics.fillRect(i_1_ * 3 + i_3_ + 2, 2 + i_4_, 300 - 3 * i_1_, 30);
							graphics.setFont(Class103.aFont1330);
							graphics.setColor(Color.white);
							graphics.drawString(string, i_3_ + (304 - Class27.aFontMetrics323.stringWidth(string)) / 2, 22 + i_4_);
							break;
						}
						break;
					} catch (final Exception exception) {
						Class102.aCanvas1309.repaint();
						break;
					}
				} while (false);
			} else if (5 == anInt1599 * -1935794829) {
				if (i >= -63640781) {
					return;
				}
				Class91_Sub20_Sub17.method1027(Class91_Sub20_Sub2.aClass91_Sub20_Sub13_Sub4_Sub1_2235, Class2.aClass91_Sub20_Sub13_Sub4_Sub1_42, -360349759);
			} else if (anInt1599 * -1935794829 == 10) {
				if (i >= -63640781) {
					return;
				}
				Class91_Sub20_Sub17.method1027(Class91_Sub20_Sub2.aClass91_Sub20_Sub13_Sub4_Sub1_2235, Class2.aClass91_Sub20_Sub13_Sub4_Sub1_42, -637046072);
			} else if (20 == anInt1599 * -1935794829) {
				if (i >= -63640781) {
					return;
				}
				Class91_Sub20_Sub17.method1027(Class91_Sub20_Sub2.aClass91_Sub20_Sub13_Sub4_Sub1_2235, Class2.aClass91_Sub20_Sub13_Sub4_Sub1_42, -1221888827);
			} else if (25 == anInt1599 * -1935794829) {
				if (anInt1496 * -2133230389 == 1) {
					if (anInt1468 * -623557147 > 646784843 * anInt1519) {
						anInt1519 = 1169299855 * anInt1468;
					}
					final int i_5_ = (-2020496218 * anInt1519 - anInt1468 * -1113086278) / (anInt1519 * 646784843);
					Class86_Sub1.method489(new StringBuilder(Class75.aString856).append(Class106.aString1374).append(Class106.aString1368).append(i_5_).append("%").append(Class106.aString1377).toString(), false, 43463550);
				} else if (-2133230389 * anInt1496 == 2) {
					if (i >= -63640781) {
						return;
					}
					if (anInt1469 * -848653917 > -433039347 * anInt1450) {
						anInt1450 = anInt1469 * 715715695;
					}
					final int i_6_ = (anInt1450 * -177130870 - 516977110 * anInt1469) / (anInt1450 * -433039347) + 50;
					Class86_Sub1.method489(new StringBuilder(Class75.aString856).append(Class106.aString1374).append(Class106.aString1368).append(i_6_).append("%").append(Class106.aString1377).toString(), false, -244337270);
				} else {
					Class86_Sub1.method489(Class75.aString856, false, -297991950);
				}
			} else if (30 == anInt1599 * -1935794829) {
				Class91_Sub20_Sub17.method1031((byte) 98);
			} else if (-1935794829 * anInt1599 == 40) {
				if (i >= -63640781) {
					return;
				}
				Class86_Sub1.method489(new StringBuilder(Class75.aString857).append(Class106.aString1374).append(Class75.aString907).toString(), false, 195384507);
			}
			if (30 == -1935794829 * anInt1599 && anInt1652 * -368459173 == 0) {
				if (i >= -63640781) {
					return;
				}
				if (!aBoolean12) {
					try {
						final Graphics graphics = Class102.aCanvas1309.getGraphics();
						for (int i_7_ = 0; i_7_ < anInt1456 * -437440627; i_7_++) {
							if (aBooleanArray1646[i_7_]) {
								Class97.aClass28_1218.method255(graphics, anIntArray1648[i_7_], anIntArray1649[i_7_], anIntArray1608[i_7_], anIntArray1651[i_7_], (byte) 55);
								aBooleanArray1646[i_7_] = false;
							}
						}
					} catch (final Exception exception) {
						Class102.aCanvas1309.repaint();
					}
					return;
				}
			}
			if (-1935794829 * anInt1599 > 0) {
				try {
					final Graphics graphics = Class102.aCanvas1309.getGraphics();
					Class97.aClass28_1218.method254(graphics, 0, 0, -967050258);
					aBoolean12 = false;
					for (int i_8_ = 0; i_8_ < anInt1456 * -437440627; i_8_++) {
						aBooleanArray1646[i_8_] = false;
					}
				} catch (final Exception exception) {
					Class102.aCanvas1309.repaint();
				}
			}
		} catch (final RuntimeException var14) {
			throw Class102.method1086(var14, "client.r()");
		}
	}

	@Override
	protected final void method47(final int i) {
		try {
			if (Class36.aClass97_438 != null) {
				Class36.aClass97_438.aBoolean1217 = false;
			}
			Class36.aClass97_438 = null;
			if (Class91_Sub20_Sub14_Sub6.aClass20_2819 != null) {
				Class91_Sub20_Sub14_Sub6.aClass20_2819.method194((byte) 1);
				Class91_Sub20_Sub14_Sub6.aClass20_2819 = null;
			}
			Class105.method1095((short) 150);
			Class91_Sub21.method1035(-516809102);
			Class105.aClass24_1366 = null;
			if (aClass6_1682 != null) {
				aClass6_1682.method120(2053149930);
			}
			if (Class86_Sub1.aClass6_1750 != null) {
				if (i != 689814044) {
					return;
				}
				Class86_Sub1.aClass6_1750.method120(2140639292);
			}
			if (Class59.aClass20_722 != null) {
				Class59.aClass20_722.method194((byte) 1);
			}
			Class34.method282(-363938325);
			Class91_Sub14.method710(-1721475708);
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "client.l()");
		}
	}

	void method63(final byte i) {
		do {
			try {
				if (-1554797891 * Class59.anInt734 >= 4) {
					method48("js5crc", -147563379);
					anInt1599 = -18386312;
				} else {
					if (-856911529 * Class59.anInt727 >= 4) {
						if (anInt1599 * -1935794829 <= 5) {
							method48("js5io", 2098437005);
							anInt1599 = -18386312;
							break;
						}
						anInt1503 = 2037861784;
						Class59.anInt727 = -1772437707;
					}
					if ((anInt1503 -= -1400911707) * 2031804205 + 1 > 0) {
						if (i == 8) {
							throw new IllegalStateException();
						}
					} else {
						try {
							if (1795576275 * anInt1467 == 0) {
								if (i == 8) {
									break;
								}
								Canvas_Sub1.aClass29_18 = Class91_Sub22.aClass25_2110.method237(Class17.aString238, Class28_Sub1.anInt1729 * -660438251, 890553208);
								anInt1467 += 10432091;
							}
							if (anInt1467 * 1795576275 == 1) {
								if (2 == Canvas_Sub1.aClass29_18.anInt348) {
									method64(-1, (byte) 1);
									break;
								}
								if (Canvas_Sub1.aClass29_18.anInt348 == 1) {
									anInt1467 += 10432091;
								}
							}
							if (anInt1467 * 1795576275 == 2) {
								if (i == 8) {
									break;
								}
								Class19.aClass20_259 = new Class20((Socket) Canvas_Sub1.aClass29_18.anObject350, Class91_Sub22.aClass25_2110);
								final ByteBuffer class91_sub9 = new ByteBuffer(5);
								class91_sub9.writeWordBigEndian(15);
								class91_sub9.writeDWord(31);
								Class19.aClass20_259.method197(class91_sub9.buffer, 0, 5, (byte) 0);
								anInt1467 += 10432091;
								Class91_Sub22.aLong2107 = Class108.method1111(1692283566) * -6014149722737258519L;
							}
							if (3 == 1795576275 * anInt1467) {
								if (anInt1599 * -1935794829 > 5 && Class19.aClass20_259.method196((byte) 5) <= 0) {
									if (Class108.method1111(184425307) - Class91_Sub22.aLong2107 * 4187806051116808281L > 30000L) {
										method64(-2, (byte) 1);
										break;
									}
								} else {
									final int i_9_ = Class19.aClass20_259.method195(87914402);
									if (i_9_ != 0) {
										method64(i_9_, (byte) 1);
										break;
									}
									anInt1467 += 10432091;
								}
							}
							if (4 == 1795576275 * anInt1467) {
								boolean bool;
								if (-1935794829 * anInt1599 > 20) {
									bool = true;
								} else {
									bool = false;
								}
								Class91_Sub20_Sub4.method750(Class19.aClass20_259, bool, 663550789);
								Canvas_Sub1.aClass29_18 = null;
								Class19.aClass20_259 = null;
								anInt1467 = 0;
								anInt1575 = 0;
							}
						} catch (final IOException ioexception) {
							method64(-3, (byte) 1);
							break;
						}
					}
				}
				break;
			} catch (final RuntimeException var4) {
				throw Class102.method1086(var4, "client.s()");
			}
		} while (false);
	}

	void method64(final int i, final byte i_10_) {
		try {
			Canvas_Sub1.aClass29_18 = null;
			Class19.aClass20_259 = null;
			anInt1467 = 0;
			if (Class97.anInt1215 * -2055567355 == Class28_Sub1.anInt1729 * -660438251) {
				Class28_Sub1.anInt1729 = anInt1474 * -734870259;
			} else {
				Class28_Sub1.anInt1729 = Class97.anInt1215 * 1949429041;
			}
			anInt1575 += -700014861;
			do {
				if (-1440437701 * anInt1575 >= 2) {
					if (7 != i) {
						if (i != 9) {
							break;
						}
						if (i_10_ != 1) {
							return;
						}
					}
					if (anInt1599 * -1935794829 <= 5) {
						method48("js5connect_full", -1045682784);
						anInt1599 = -18386312;
					} else {
						anInt1503 = 2037861784;
					}
					return;
				}
			} while (false);
			if (-1440437701 * anInt1575 >= 2 && i == 6) {
				method48("js5connect_outofdate", 1094207665);
				anInt1599 = -18386312;
			} else if (anInt1575 * -1440437701 >= 4) {
				if (-1935794829 * anInt1599 <= 5) {
					method48("js5connect", 196016337);
					anInt1599 = -18386312;
				} else {
					anInt1503 = 2037861784;
				}
			}
		} catch (final RuntimeException var3) {
			throw Class102.method1086(var3, "client.m()");
		}
	}

	@Override
	protected final void method60() {
		/* empty */
	}

	@Override
	public final void method52() {
		if (method50(-165143057)) {
			final Class88[] class88s = { Class88.aClass88_1176, Class88.aClass88_1173, Class88.aClass88_1181, Class88.aClass88_1177, Class88.aClass88_1175, Class88.aClass88_1174, Class88.aClass88_1179, Class88.aClass88_1178, Class88.aClass88_1180 };
			final Class88[] class88s_11_ = class88s;
			Class88[] class88s_12_;
			final int i = (class88s_12_ = class88s_11_).length;
			for (int i_13_ = 0; i_13_ < i; i_13_++) {
				final Class88 class88 = class88s_12_[i_13_];
				final String string = getParameter(class88.aString1182);
				if (string != null) {
					switch (Integer.parseInt(class88.aString1182)) {
					case 1: {
						final int i_14_ = Integer.parseInt(string);
						final Class60[] class60s = { Class60.aClass60_739, Class60.aClass60_744, Class60.aClass60_742, Class60.aClass60_738 };
						final Class60[] class60s_15_ = class60s;
						int i_16_ = 0;
						Class60 class60;
						for (;;) {
							if (i_16_ >= class60s_15_.length) {
								class60 = null;
								break;
							}
							final Class60 class60_17_ = class60s_15_[i_16_];
							if (class60_17_.anInt745 * 1999054352 == i_14_) {
								class60 = class60_17_;
								break;
							}
							i_16_++;
						}
						Class91_Sub20_Sub14_Sub1_Sub2.aClass60_2863 = class60;
						break;
					}
					case 2: {
						final Class65[] class65s = LocType.method776(9761329);
						final int i_18_ = Integer.parseInt(string);
						final Class65[] class65s_19_ = class65s;
						int i_20_ = 0;
						Class65 class65;
						for (;;) {
							if (i_20_ >= class65s_19_.length) {
								class65 = null;
								break;
							}
							final Class65 class65_21_ = class65s_19_[i_20_];
							if (i_18_ == class65_21_.method23(-703552814)) {
								class65 = class65_21_;
								break;
							}
							i_20_++;
						}
						aClass65_1443 = class65;
						if (aClass65_1443 == Class65.aClass65_1421) {
							Class41.aClass98_551 = Class98.aClass98_1234;
						} else {
							Class41.aClass98_551 = Class98.aClass98_1230;
						}
						break;
					}
					case 3:
						anInt1442 = Integer.parseInt(string) * 2069957632;
						break;
					case 4:
						Class40.aString546 = string;
						/* fall through */
					default:
						break;
					case 6:
						anInt1660 = Integer.parseInt(string) * -1802056771;
						break;
					case 7:
						if (string.equalsIgnoreCase(Class106.aString1372)) {
							/* empty */
						}
						break;
					case 8:
						anInt1446 = Integer.parseInt(string) * 272138603;
						break;
					case 9:
						if (string.equalsIgnoreCase(Class106.aString1372)) {
							aBoolean1612 = true;
						} else {
							aBoolean1612 = false;
						}
					}
				}
			}
			Class91_Sub23.method1045(54259018);
			Class17.aString238 = getCodeBase().getHost();
			final String string = Class91_Sub20_Sub14_Sub1_Sub2.aClass60_2863.aString741;
			try {
				Class101.method1078("oldschool", string, 0, 16, 557516550);
			} catch (final Exception var12) {
				Class91_Sub21.method1036(null, var12, (byte) -34);
			}
			aClient1439 = this;
			method39(1587981636, 503, 31, 755139730);
		}
	}

	@Override
	protected final void method40() {
		final boolean bool = Class57.method386((byte) 9);
		if (bool && aBoolean1521 && aClass6_1682 != null) {
			aClass6_1682.method121(-1768005694);
		}
		if (aBoolean7) {
			final Canvas canvas = Class102.aCanvas1309;
			canvas.removeKeyListener(Class15.aClass15_216);
			canvas.removeFocusListener(Class15.aClass15_216);
			Class15.anInt221 = 338913447;
			Class35.method285(Class102.aCanvas1309, -1826497100);
			if (Class105.aClass24_1366 != null) {
				Class105.aClass24_1366.method218(Class102.aCanvas1309, -2019694827);
			}
			method55(48906992);
			method69(Class102.aCanvas1309, (byte) 0);
			Class91_Sub11.method703(Class102.aCanvas1309, -811609616);
			if (Class105.aClass24_1366 != null) {
				Class105.aClass24_1366.method215(Class102.aCanvas1309, (byte) -5);
			}
		}
		if (anInt1599 * -1935794829 == 0) {
			final int i = Class101.anInt1276 * -402758770;
			final String string = Class101.aString1272;
			Color color = null;
			do {
				try {
					final Graphics graphics = Class102.aCanvas1309.getGraphics();
					if (Class103.aFont1330 == null) {
						Class103.aFont1330 = new Font("Helvetica", 1, 13);
						Class27.aFontMetrics323 = Class102.aCanvas1309.getFontMetrics(Class103.aFont1330);
					}
					if (aBoolean12) {
						aBoolean12 = false;
						graphics.setColor(Color.black);
						graphics.fillRect(0, 0, Class17.anInt240 * 1253991199, -1872450005 * Class27.anInt333);
					}
					if (color == null) {
						color = new Color(-2065630909, 17, 17);
					}
					try {
						if (NpcType.anImage2441 == null) {
							NpcType.anImage2441 = Class102.aCanvas1309.createImage(835718681, -1165663971);
						}
						final Graphics graphics_22_ = NpcType.anImage2441.getGraphics();
						graphics_22_.setColor(color);
						graphics_22_.drawRect(0, 0, 303, 33);
						graphics_22_.fillRect(2, 2, 3 * i, 30);
						graphics_22_.setColor(Color.black);
						graphics_22_.drawRect(1, 1, -635305257, -2136840787);
						graphics_22_.fillRect(2 + 3 * i, 2, 300 - i * 3, 30);
						graphics_22_.setFont(Class103.aFont1330);
						graphics_22_.setColor(Color.white);
						graphics_22_.drawString(string, (370978255 - Class27.aFontMetrics323.stringWidth(string)) / 2, 22);
						graphics.drawImage(NpcType.anImage2441, 1123801479 * Class17.anInt240 / 2 - 152, Class27.anInt333 * 636549588 / 2 - 18, null);
					} catch (final Exception exception) {
						final int i_23_ = Class17.anInt240 * -1802716915 / 2 - 152;
						final int i_24_ = -2124342342 * Class27.anInt333 / 2 - 18;
						graphics.setColor(color);
						graphics.drawRect(i_23_, i_24_, -2100773141, 33);
						graphics.fillRect(2 + i_23_, i_24_ + 2, 3 * i, 30);
						graphics.setColor(Color.black);
						graphics.drawRect(1 + i_23_, i_24_ + 1, 301, 2147165500);
						graphics.fillRect(i * 3 + i_23_ + 2, 2 + i_24_, 300 - 3 * i, 30);
						graphics.setFont(Class103.aFont1330);
						graphics.setColor(Color.white);
						graphics.drawString(string, i_23_ + (304 - Class27.aFontMetrics323.stringWidth(string)) / 2, 22 + i_24_);
						break;
					}
					break;
				} catch (final Exception var11) {
					Class102.aCanvas1309.repaint();
					break;
				}
			} while (false);
		} else if (5 == anInt1599 * -1935794829) {
			Class91_Sub20_Sub17.method1027(Class91_Sub20_Sub2.aClass91_Sub20_Sub13_Sub4_Sub1_2235, Class2.aClass91_Sub20_Sub13_Sub4_Sub1_42, -1766500706);
		} else if (anInt1599 * -1935794829 == 10) {
			Class91_Sub20_Sub17.method1027(Class91_Sub20_Sub2.aClass91_Sub20_Sub13_Sub4_Sub1_2235, Class2.aClass91_Sub20_Sub13_Sub4_Sub1_42, -1340196520);
		} else if (20 == anInt1599 * -1492117838) {
			Class91_Sub20_Sub17.method1027(Class91_Sub20_Sub2.aClass91_Sub20_Sub13_Sub4_Sub1_2235, Class2.aClass91_Sub20_Sub13_Sub4_Sub1_42, -1003953733);
		} else if (25 == anInt1599 * -1935794829) {
			if (anInt1496 * -2133230389 == 1) {
				if (anInt1468 * 1526579435 > 646784843 * anInt1519) {
					anInt1519 = 400572292 * anInt1468;
				}
				final int i = (-2020496218 * anInt1519 - anInt1468 * -1113086278) / (anInt1519 * 646784843);
				Class86_Sub1.method489(new StringBuilder(Class75.aString856).append(Class106.aString1374).append(Class106.aString1368).append(i).append("%").append(Class106.aString1377).toString(), false, 938035579);
			} else if (1063445314 * anInt1496 == 2) {
				if (anInt1469 * 596872130 > -433039347 * anInt1450) {
					anInt1450 = anInt1469 * 139889383;
				}
				final int i = (anInt1450 * -177130870 - 516977110 * anInt1469) / (anInt1450 * -433039347) + -724178513;
				Class86_Sub1.method489(new StringBuilder(Class75.aString856).append(Class106.aString1374).append(Class106.aString1368).append(i).append("%").append(Class106.aString1377).toString(), false, -780185563);
			} else {
				Class86_Sub1.method489(Class75.aString856, false, 559729578);
			}
		} else if (30 == anInt1599 * 716490150) {
			Class91_Sub20_Sub17.method1031((byte) 88);
		} else if (-1903906777 * anInt1599 == 1368108105) {
			Class86_Sub1.method489(new StringBuilder(Class75.aString857).append(Class106.aString1374).append(Class75.aString907).toString(), false, 555954603);
		}
		if (30 == -1935794829 * anInt1599 && anInt1652 * 1528018535 == 0 && !aBoolean12) {
			try {
				final Graphics graphics = Class102.aCanvas1309.getGraphics();
				for (int i = 0; i < anInt1456 * -437440627; i++) {
					if (aBooleanArray1646[i]) {
						Class97.aClass28_1218.method255(graphics, anIntArray1648[i], anIntArray1649[i], anIntArray1608[i], anIntArray1651[i], (byte) 109);
						aBooleanArray1646[i] = false;
					}
				}
			} catch (final Exception var11) {
				Class102.aCanvas1309.repaint();
			}
		} else if (-1593813112 * anInt1599 > 0) {
			try {
				final Graphics graphics = Class102.aCanvas1309.getGraphics();
				Class97.aClass28_1218.method254(graphics, 0, 0, 170743771);
				aBoolean12 = false;
				for (int i = 0; i < anInt1456 * 496396655; i++) {
					aBooleanArray1646[i] = false;
				}
			} catch (final Exception var11) {
				Class102.aCanvas1309.repaint();
			}
		}
	}

	@Override
	protected final void method58() {
		final boolean bool = Class57.method386((byte) 47);
		if (bool && aBoolean1521 && aClass6_1682 != null) {
			aClass6_1682.method121(-1028752249);
		}
		if (aBoolean7) {
			final Canvas canvas = Class102.aCanvas1309;
			canvas.removeKeyListener(Class15.aClass15_216);
			canvas.removeFocusListener(Class15.aClass15_216);
			Class15.anInt221 = 1966344492;
			Class35.method285(Class102.aCanvas1309, -1933222751);
			if (Class105.aClass24_1366 != null) {
				Class105.aClass24_1366.method218(Class102.aCanvas1309, -2131703211);
			}
			method55(630692360);
			method69(Class102.aCanvas1309, (byte) 0);
			Class91_Sub11.method703(Class102.aCanvas1309, -811609616);
			if (Class105.aClass24_1366 != null) {
				Class105.aClass24_1366.method215(Class102.aCanvas1309, (byte) -91);
			}
		}
		if (anInt1599 * -1935794829 == 0) {
			final int i = Class101.anInt1276 * -1610631297;
			final String string = Class101.aString1272;
			Color color = null;
			do {
				try {
					final Graphics graphics = Class102.aCanvas1309.getGraphics();
					if (Class103.aFont1330 == null) {
						Class103.aFont1330 = new Font("Helvetica", 1, 13);
						Class27.aFontMetrics323 = Class102.aCanvas1309.getFontMetrics(Class103.aFont1330);
					}
					if (aBoolean12) {
						aBoolean12 = false;
						graphics.setColor(Color.black);
						graphics.fillRect(0, 0, Class17.anInt240 * 472613227, -1872450005 * Class27.anInt333);
					}
					if (color == null) {
						color = new Color(140, 17, 17);
					}
					try {
						if (NpcType.anImage2441 == null) {
							NpcType.anImage2441 = Class102.aCanvas1309.createImage(304, -340180920);
						}
						final Graphics graphics_25_ = NpcType.anImage2441.getGraphics();
						graphics_25_.setColor(color);
						graphics_25_.drawRect(0, 0, 303, 1892363299);
						graphics_25_.fillRect(2, 2, 3 * i, 30);
						graphics_25_.setColor(Color.black);
						graphics_25_.drawRect(1, 1, 301, 408130403);
						graphics_25_.fillRect(2 + 3 * i, 2, 300 - i * 3, 30);
						graphics_25_.setFont(Class103.aFont1330);
						graphics_25_.setColor(Color.white);
						graphics_25_.drawString(string, (1078711857 - Class27.aFontMetrics323.stringWidth(string)) / 2, 22);
						graphics.drawImage(NpcType.anImage2441, -137150194 * Class17.anInt240 / 2 - 1641535728, Class27.anInt333 * -1872450005 / 2 - 18, null);
					} catch (final Exception exception) {
						final int i_26_ = Class17.anInt240 * 472613227 / 2 - 835906119;
						final int i_27_ = -1872450005 * Class27.anInt333 / 2 - 18;
						graphics.setColor(color);
						graphics.drawRect(i_26_, i_27_, 303, 1887022881);
						graphics.fillRect(2 + i_26_, i_27_ + 2, 3 * i, 30);
						graphics.setColor(Color.black);
						graphics.drawRect(1 + i_26_, i_27_ + 1, 1492993159, 31);
						graphics.fillRect(i * 3 + i_26_ + 2, 2 + i_27_, -651401749 - 3 * i, 30);
						graphics.setFont(Class103.aFont1330);
						graphics.setColor(Color.white);
						graphics.drawString(string, i_26_ + (-2139325597 - Class27.aFontMetrics323.stringWidth(string)) / 2, 22 + i_27_);
						break;
					}
					break;
				} catch (final Exception var11) {
					Class102.aCanvas1309.repaint();
					break;
				}
			} while (false);
		} else if (5 == anInt1599 * -1935794829) {
			Class91_Sub20_Sub17.method1027(Class91_Sub20_Sub2.aClass91_Sub20_Sub13_Sub4_Sub1_2235, Class2.aClass91_Sub20_Sub13_Sub4_Sub1_42, -1752163492);
		} else if (anInt1599 * 521700793 == 10) {
			Class91_Sub20_Sub17.method1027(Class91_Sub20_Sub2.aClass91_Sub20_Sub13_Sub4_Sub1_2235, Class2.aClass91_Sub20_Sub13_Sub4_Sub1_42, -826113571);
		} else if (20 == anInt1599 * -1935794829) {
			Class91_Sub20_Sub17.method1027(Class91_Sub20_Sub2.aClass91_Sub20_Sub13_Sub4_Sub1_2235, Class2.aClass91_Sub20_Sub13_Sub4_Sub1_42, -938122);
		} else if (25 == anInt1599 * 1635984516) {
			if (anInt1496 * -2133230389 == 1) {
				if (anInt1468 * -623557147 > -810217433 * anInt1519) {
					anInt1519 = 1591792448 * anInt1468;
				}
				final int i = (181225223 * anInt1519 - anInt1468 * -1113086278) / (anInt1519 * 646784843);
				Class86_Sub1.method489(new StringBuilder(Class75.aString856).append(Class106.aString1374).append(Class106.aString1368).append(i).append("%").append(Class106.aString1377).toString(), false, -889694587);
			} else if (721651105 * anInt1496 == 2) {
				if (anInt1469 * -848653917 > -433039347 * anInt1450) {
					anInt1450 = anInt1469 * 715715695;
				}
				final int i = (anInt1450 * -177130870 - 516977110 * anInt1469) / (anInt1450 * -433039347) + 50;
				Class86_Sub1.method489(new StringBuilder(Class75.aString856).append(Class106.aString1374).append(Class106.aString1368).append(i).append("%").append(Class106.aString1377).toString(), false, -895375191);
			} else {
				Class86_Sub1.method489(Class75.aString856, false, -1612418465);
			}
		} else if (30 == anInt1599 * 267330724) {
			Class91_Sub20_Sub17.method1031((byte) 7);
		} else if (-1935794829 * anInt1599 == 40) {
			Class86_Sub1.method489(new StringBuilder(Class75.aString857).append(Class106.aString1374).append(Class75.aString907).toString(), false, 735362115);
		}
		if (30 == -1935794829 * anInt1599 && anInt1652 * -368459173 == 0 && !aBoolean12) {
			try {
				final Graphics graphics = Class102.aCanvas1309.getGraphics();
				for (int i = 0; i < anInt1456 * -437440627; i++) {
					if (aBooleanArray1646[i]) {
						Class97.aClass28_1218.method255(graphics, anIntArray1648[i], anIntArray1649[i], anIntArray1608[i], anIntArray1651[i], (byte) 14);
						aBooleanArray1646[i] = false;
					}
				}
			} catch (final Exception var11) {
				Class102.aCanvas1309.repaint();
			}
		} else if (-1935794829 * anInt1599 > 0) {
			try {
				final Graphics graphics = Class102.aCanvas1309.getGraphics();
				Class97.aClass28_1218.method254(graphics, 0, 0, -1186925065);
				aBoolean12 = false;
				for (int i = 0; i < anInt1456 * -376638676; i++) {
					aBooleanArray1646[i] = false;
				}
			} catch (final Exception var11) {
				Class102.aCanvas1309.repaint();
			}
		}
	}

	@Override
	protected final void method43() {
		if (Class36.aClass97_438 != null) {
			Class36.aClass97_438.aBoolean1217 = false;
		}
		Class36.aClass97_438 = null;
		if (Class91_Sub20_Sub14_Sub6.aClass20_2819 != null) {
			Class91_Sub20_Sub14_Sub6.aClass20_2819.method194((byte) 1);
			Class91_Sub20_Sub14_Sub6.aClass20_2819 = null;
		}
		Class105.method1095((short) 150);
		Class91_Sub21.method1035(-516809102);
		Class105.aClass24_1366 = null;
		if (aClass6_1682 != null) {
			aClass6_1682.method120(2063135530);
		}
		if (Class86_Sub1.aClass6_1750 != null) {
			Class86_Sub1.aClass6_1750.method120(2126784737);
		}
		if (Class59.aClass20_722 != null) {
			Class59.aClass20_722.method194((byte) 1);
		}
		Class34.method282(-363938325);
		Class91_Sub14.method710(698787883);
	}

	@Override
	protected final void method44() {
		if (Class36.aClass97_438 != null) {
			Class36.aClass97_438.aBoolean1217 = false;
		}
		Class36.aClass97_438 = null;
		if (Class91_Sub20_Sub14_Sub6.aClass20_2819 != null) {
			Class91_Sub20_Sub14_Sub6.aClass20_2819.method194((byte) 1);
			Class91_Sub20_Sub14_Sub6.aClass20_2819 = null;
		}
		Class105.method1095((short) 150);
		Class91_Sub21.method1035(-516809102);
		Class105.aClass24_1366 = null;
		if (aClass6_1682 != null) {
			aClass6_1682.method120(2043858750);
		}
		if (Class86_Sub1.aClass6_1750 != null) {
			Class86_Sub1.aClass6_1750.method120(2070588592);
		}
		if (Class59.aClass20_722 != null) {
			Class59.aClass20_722.method194((byte) 1);
		}
		Class34.method282(-363938325);
		Class91_Sub14.method710(1906039650);
	}

	@Override
	protected final void method56() {
		Class97.anInt1215 = -1467153203 * (-673482783 * anInt1442 == 0 ? 43594 : 121784213 * anInt1660 + -263943472);
		anInt1474 = -1115324864 * (986135985 * anInt1442 == 0 ? 443 : 50000 + anInt1660 * -1337295854);
		Class28_Sub1.anInt1729 = -196429855 * Class97.anInt1215;
		Class85.aShortArray1163 = Class80.aShortArray1115;
		Class91_Sub8.aShortArrayArray1852 = Class80.aShortArrayArray1116;
		Class85.aShortArray1161 = Class80.aShortArray1120;
		Class91_Sub20_Sub17.aShortArrayArray2503 = Class80.aShortArrayArray1118;
		if (Class25.aString311.toLowerCase().indexOf("microsoft") != -1) {
			Class15.anIntArray220[186] = -1700136022;
			Class15.anIntArray220[-1311198076] = 27;
			Class15.anIntArray220[-338645899] = -1676953082;
			Class15.anIntArray220[189] = 26;
			Class15.anIntArray220[-403610606] = 72;
			Class15.anIntArray220[1808703707] = -859109963;
			Class15.anIntArray220[-1923361666] = 58;
			Class15.anIntArray220[219] = 1654555891;
			Class15.anIntArray220[220] = 74;
			Class15.anIntArray220[489510652] = 43;
			Class15.anIntArray220[-1119591086] = 59;
			Class15.anIntArray220[-1790890204] = 28;
		} else {
			Class15.anIntArray220[44] = 163229678;
			Class15.anIntArray220[45] = 26;
			Class15.anIntArray220[46] = 261833947;
			Class15.anIntArray220[47] = 73;
			Class15.anIntArray220[59] = 57;
			Class15.anIntArray220[61] = 27;
			Class15.anIntArray220[1355281363] = -480499492;
			Class15.anIntArray220[-1238699624] = 587758249;
			Class15.anIntArray220[824009151] = 491763828;
			Class15.anIntArray220[-290382617] = 28;
			Class15.anIntArray220[-1121937005] = 1615181388;
			Class15.anIntArray220[-1815323029] = 111981826;
		}
		method69(Class102.aCanvas1309, (byte) 0);
		Class91_Sub11.method703(Class102.aCanvas1309, -811609616);
		Class24_Sub1 class24_sub1;
		try {
			class24_sub1 = new Class24_Sub1();
		} catch (final Throwable var3) {
			class24_sub1 = null;
		}
		Class105.aClass24_1366 = class24_sub1;
		if (Class105.aClass24_1366 != null) {
			Class105.aClass24_1366.method215(Class102.aCanvas1309, (byte) -80);
		}
		Class91_Sub24.aClass14_2136 = new Class14(255, Class35.aClass4_417, Class35.aClass4_418, 500000);
		Class91_Sub20_Sub14_Sub4.aClass108_2769 = Class60.method391((byte) 120);
		if (anInt1442 * 986135985 != 0) {
			aBoolean1455 = true;
		}
	}

	@Override
	public final void init() {
		try {
			if (method50(-165143057)) {
				final Class88[] class88s = { Class88.aClass88_1176, Class88.aClass88_1173, Class88.aClass88_1181, Class88.aClass88_1177, Class88.aClass88_1175, Class88.aClass88_1174, Class88.aClass88_1179, Class88.aClass88_1178, Class88.aClass88_1180 };
				final Class88[] class88s_28_ = class88s;
				Class88[] class88s_29_;
				final int i = (class88s_29_ = class88s_28_).length;
				for (int i_30_ = 0; i_30_ < i; i_30_++) {
					final Class88 class88 = class88s_29_[i_30_];
					final String string = getParameter(class88.aString1182);
					if (string != null) {
						switch (Integer.parseInt(class88.aString1182)) {
						case 1: {
							final int i_31_ = Integer.parseInt(string);
							final Class60[] class60s = { Class60.aClass60_739, Class60.aClass60_744, Class60.aClass60_742, Class60.aClass60_738 };
							final Class60[] class60s_32_ = class60s;
							int i_33_ = 0;
							Class60 class60;
							for (;;) {
								if (i_33_ >= class60s_32_.length) {
									class60 = null;
									break;
								}
								final Class60 class60_34_ = class60s_32_[i_33_];
								if (class60_34_.anInt745 * -1933020805 == i_31_) {
									class60 = class60_34_;
									break;
								}
								i_33_++;
							}
							Class91_Sub20_Sub14_Sub1_Sub2.aClass60_2863 = class60;
							break;
						}
						case 2: {
							final Class65[] class65s = LocType.method776(1127486191);
							final int i_35_ = Integer.parseInt(string);
							final Class65[] class65s_36_ = class65s;
							int i_37_ = 0;
							Class65 class65;
							for (;;) {
								if (i_37_ >= class65s_36_.length) {
									class65 = null;
									break;
								}
								final Class65 class65_38_ = class65s_36_[i_37_];
								if (i_35_ == class65_38_.method23(-1288002185)) {
									class65 = class65_38_;
									break;
								}
								i_37_++;
							}
							aClass65_1443 = class65;
							if (aClass65_1443 == Class65.aClass65_1421) {
								Class41.aClass98_551 = Class98.aClass98_1234;
							} else {
								Class41.aClass98_551 = Class98.aClass98_1230;
							}
							break;
						}
						case 3:
							anInt1442 = Integer.parseInt(string) * 127200081;
							break;
						case 4:
							Class40.aString546 = string;
							/* fall through */
						default:
							break;
						case 6:
							anInt1660 = Integer.parseInt(string) * -1802056771;
							break;
						case 7:
							if (string.equalsIgnoreCase(Class106.aString1372)) {
								/* empty */
							}
							break;
						case 8:
							anInt1446 = Integer.parseInt(string) * 272138603;
							break;
						case 9:
							if (string.equalsIgnoreCase(Class106.aString1372)) {
								aBoolean1612 = true;
							} else {
								aBoolean1612 = false;
							}
						}
					}
				}
				Class91_Sub23.method1045(-834895);
				Class17.aString238 = getCodeBase().getHost();
				final String string = Class91_Sub20_Sub14_Sub1_Sub2.aClass60_2863.aString741;
				try {
					Class101.method1078("oldschool", string, 0, 16, 482340963);
				} catch (final Exception exception) {
					Class91_Sub21.method1036(null, exception, (byte) 6);
				}
				aClient1439 = this;
				method39(765, 503, 31, 1882996110);
			}
		} catch (final RuntimeException var13) {
			throw Class102.method1086(var13, "client.init()");
		}
	}

	static final void method65(final Class91_Sub5 class91_sub5, final int i) {
		try {
			int i_39_ = 0;
			int i_40_ = -1;
			int i_41_ = 0;
			int i_42_ = 0;
			if (class91_sub5.anInt1794 * -1081232747 == 0) {
				i_39_ = Class107.aClass39_1397.method303(-1012182999 * class91_sub5.anInt1807, class91_sub5.anInt1795 * -1323813057, class91_sub5.anInt1796 * -1641318309);
			}
			if (class91_sub5.anInt1794 * -1081232747 == 1) {
				i_39_ = Class107.aClass39_1397.method306(class91_sub5.anInt1807 * -1012182999, -1323813057 * class91_sub5.anInt1795, -1641318309 * class91_sub5.anInt1796);
			}
			if (2 == class91_sub5.anInt1794 * -1081232747) {
				i_39_ = Class107.aClass39_1397.method310(class91_sub5.anInt1807 * -1012182999, class91_sub5.anInt1795 * -1323813057, class91_sub5.anInt1796 * -1641318309);
			}
			if (3 == class91_sub5.anInt1794 * -1081232747) {
				i_39_ = Class107.aClass39_1397.method311(-1012182999 * class91_sub5.anInt1807, -1323813057 * class91_sub5.anInt1795, class91_sub5.anInt1796 * -1641318309);
			}
			if (i_39_ != 0) {
				final int i_43_ = Class107.aClass39_1397.method312(-1012182999 * class91_sub5.anInt1807, -1323813057 * class91_sub5.anInt1795, class91_sub5.anInt1796 * -1641318309, i_39_);
				i_40_ = i_39_ >> 14 & 0x7fff;
				i_41_ = i_43_ & 0x1f;
				i_42_ = i_43_ >> 6 & 0x3;
			}
			class91_sub5.anInt1797 = 650475043 * i_40_;
			class91_sub5.anInt1799 = 560256019 * i_41_;
			class91_sub5.anInt1801 = i_42_ * 462099935;
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "client.bf()");
		}
	}

	@Override
	protected final void method46(final int i) {
		try {
			anInt1449 += 610709489;
			method66((byte) 0);
			for (;;) {
				final Class95 class95 = Class78.aClass95_1111;
				Class91_Sub12 class91_sub12;
				synchronized (class95) {
					class91_sub12 = (Class91_Sub12) Class78.aClass95_1109.method1064();
				}
				if (class91_sub12 == null) {
					if (i != 823373173) {
						Class41.method343(-360081226);
						Class91_Sub20_Sub5.method759((byte) 96);
						Class59.method390((short) 32483);
						final Class12 class12 = Class12.aClass12_183;
						synchronized (class12) {
							Class12.anInt171 = -439419619 * Class12.anInt169;
							Class12.anInt173 = Class12.anInt170 * -670859977;
							Class12.anInt178 = -389201539 * Class12.anInt179;
							Class12.anInt172 = Class12.anInt181 * 1580298131;
							Class12.anInt180 = Class12.anInt176 * -1444347267;
							Class12.anInt167 = Class12.anInt177 * 1857342989;
							Class12.aLong182 = Class12.aLong174 * -8017771125483093315L;
							Class12.anInt181 = 0;
						}
						if (Class105.aClass24_1366 != null) {
							if (i == 823373173) {
								break;
							}
							final int i_44_ = Class105.aClass24_1366.method217((byte) 0);
							anInt1613 = 459221931 * i_44_;
						}
						if (anInt1599 * -1935794829 == 0) {
							if (i == 823373173) {
								break;
							}
							Class91_Sub8.method629(-2005995539);
							Class100.aClass26_1246.method242(-897025067);
							for (int i_45_ = 0; i_45_ < 32; i_45_++) {
								if (i == 823373173) {
									return;
								}
								aLongArray14[i_45_] = 0L;
							}
							for (int i_46_ = 0; i_46_ < 32; i_46_++) {
								if (i == 823373173) {
									return;
								}
								aLongArray11[i_46_] = 0L;
							}
							Class73.anInt842 = 0;
						} else if (5 == anInt1599 * -1935794829) {
							if (i == 823373173) {
								break;
							}
							Class91_Sub22.method1039(this, (byte) 0);
							Class91_Sub8.method629(-2005995539);
							Class100.aClass26_1246.method242(-948246833);
							for (int i_47_ = 0; i_47_ < 32; i_47_++) {
								aLongArray14[i_47_] = 0L;
							}
							for (int i_48_ = 0; i_48_ < 32; i_48_++) {
								if (i == 823373173) {
									return;
								}
								aLongArray11[i_48_] = 0L;
							}
							Class73.anInt842 = 0;
						} else if (10 == -1935794829 * anInt1599) {
							Class91_Sub22.method1039(this, (byte) 0);
						} else if (anInt1599 * -1935794829 == 20) {
							Class91_Sub22.method1039(this, (byte) 0);
							Class91_Sub20_Sub14_Sub7.method1016(-217281285);
						} else if (25 == -1935794829 * anInt1599) {
							Class24.method226(false, (byte) 78);
							anInt1468 = 0;
							boolean bool = true;
							for (int i_49_ = 0; i_49_ < ByteBuffer.aByteArrayArray1859.length; i_49_++) {
								if (Class91_Sub24.anIntArray2140[i_49_] != -1 && ByteBuffer.aByteArrayArray1859[i_49_] == null) {
									ByteBuffer.aByteArrayArray1859[i_49_] = Class67.aClass63_Sub1_800.getFile(Class91_Sub24.anIntArray2140[i_49_], 0, -356751755);
									if (ByteBuffer.aByteArrayArray1859[i_49_] == null) {
										bool = false;
										anInt1468 += 1044410349;
									}
								}
								if (Class91_Sub21.anIntArray2089[i_49_] != -1 && Class91_Sub5.aByteArrayArray1805[i_49_] == null) {
									if (i == 823373173) {
										return;
									}
									Class91_Sub5.aByteArrayArray1805[i_49_] = Class67.aClass63_Sub1_800.method398(Class91_Sub21.anIntArray2089[i_49_], 0, Class81.anIntArrayArray1121[i_49_], (byte) 8);
									if (Class91_Sub5.aByteArrayArray1805[i_49_] == null) {
										if (i == 823373173) {
											return;
										}
										bool = false;
										anInt1468 += 1044410349;
									}
								}
							}
							if (!bool) {
								if (i == 823373173) {
									break;
								}
								anInt1496 = -1312814877;
							} else {
								anInt1469 = 0;
								bool = true;
								for (int i_50_ = 0; i_50_ < ByteBuffer.aByteArrayArray1859.length; i_50_++) {
									if (i == 823373173) {
										return;
									}
									final byte[] is = Class91_Sub5.aByteArrayArray1805[i_50_];
									if (is != null) {
										int i_51_ = 64 * (Class68.anIntArray802[i_50_] >> 8) - 1885886277 * Class40.anInt541;
										int i_52_ = 64 * (Class68.anIntArray802[i_50_] & 0xff) - Class91_Sub20_Sub15.anInt2497 * 1838527067;
										if (aBoolean1498) {
											i_51_ = 10;
											i_52_ = 10;
										}
										bool &= Class104.method1092(is, i_51_, i_52_, 748193687);
									}
								}
								if (!bool) {
									anInt1496 = 1669337542;
								} else {
									if (anInt1496 * -2133230389 != 0) {
										Class86_Sub1.method489(new StringBuilder(Class75.aString856).append(Class106.aString1374).append(Class106.aString1368).append(100).append("%").append(Class106.aString1377).toString(), true, -996841271);
									}
									Class91_Sub20_Sub5.method759((byte) -100);
									Class107.method1106(552549763);
									Class91_Sub20_Sub5.method759((byte) 5);
									Class107.aClass39_1397.method330();
									Class91_Sub20_Sub5.method759((byte) -98);
									System.gc();
									for (int i_53_ = 0; i_53_ < 4; i_53_++) {
										aClass76Array1530[i_53_].method462((byte) 58);
									}
									for (int i_54_ = 0; i_54_ < 4; i_54_++) {
										for (int i_55_ = 0; i_55_ < 104; i_55_++) {
											for (int i_56_ = 0; i_56_ < 104; i_56_++) {
												Class102.aByteArrayArrayArray1299[i_54_][i_55_][i_56_] = (byte) 0;
											}
										}
									}
									Class91_Sub20_Sub5.method759((byte) 48);
									Class32.method275((byte) 0);
									final int i_57_ = ByteBuffer.aByteArrayArray1859.length;
									for (Class91_Sub24 class91_sub24 = (Class91_Sub24) Class91_Sub24.aClass95_2137.method1062(); class91_sub24 != null; class91_sub24 = (Class91_Sub24) Class91_Sub24.aClass95_2137.method1063()) {
										if (class91_sub24.aClass91_Sub2_Sub1_2133 != null) {
											Class91_Sub22.aClass91_Sub2_Sub2_2109.method560(class91_sub24.aClass91_Sub2_Sub1_2133);
											class91_sub24.aClass91_Sub2_Sub1_2133 = null;
										}
										if (class91_sub24.aClass91_Sub2_Sub1_2138 != null) {
											if (i == 823373173) {
												return;
											}
											Class91_Sub22.aClass91_Sub2_Sub2_2109.method560(class91_sub24.aClass91_Sub2_Sub1_2138);
											class91_sub24.aClass91_Sub2_Sub1_2138 = null;
										}
									}
									Class91_Sub24.aClass95_2137.method1057();
									Class24.method226(true, (byte) 82);
									if (!aBoolean1498) {
										for (int i_58_ = 0; i_58_ < i_57_; i_58_++) {
											final int i_59_ = 64 * (Class68.anIntArray802[i_58_] >> 8) - Class40.anInt541 * 1885886277;
											final int i_60_ = (Class68.anIntArray802[i_58_] & 0xff) * 64 - 1838527067 * Class91_Sub20_Sub15.anInt2497;
											final byte[] is = ByteBuffer.aByteArrayArray1859[i_58_];
											if (is != null) {
												Class91_Sub20_Sub5.method759((byte) 57);
												Class91_Sub20_Sub14.method918(is, i_59_, i_60_, anInt1705 * 94452248 - 48, anInt1698 * -2093105368 - 48, aClass76Array1530, -777643589);
											}
										}
										for (int i_61_ = 0; i_61_ < i_57_; i_61_++) {
											if (i == 823373173) {
												return;
											}
											final int i_62_ = 64 * (Class68.anIntArray802[i_61_] >> 8) - Class40.anInt541 * 1885886277;
											final int i_63_ = 64 * (Class68.anIntArray802[i_61_] & 0xff) - Class91_Sub20_Sub15.anInt2497 * 1838527067;
											final byte[] is = ByteBuffer.aByteArrayArray1859[i_61_];
											if (is == null && -1872250907 * anInt1698 < 800) {
												Class91_Sub20_Sub5.method759((byte) 23);
												Class20.method198(i_62_, i_63_, 64, 64, -2095826547);
											}
										}
										Class24.method226(true, (byte) 58);
										for (int i_64_ = 0; i_64_ < i_57_; i_64_++) {
											if (i == 823373173) {
												return;
											}
											final byte[] is = Class91_Sub5.aByteArrayArray1805[i_64_];
											if (is != null) {
												if (i == 823373173) {
													return;
												}
												final int i_65_ = (Class68.anIntArray802[i_64_] >> 8) * 64 - 1885886277 * Class40.anInt541;
												final int i_66_ = 64 * (Class68.anIntArray802[i_64_] & 0xff) - 1838527067 * Class91_Sub20_Sub15.anInt2497;
												Class91_Sub20_Sub5.method759((byte) 92);
												final Class39 class39 = Class107.aClass39_1397;
												final Class76[] class76s = aClass76Array1530;
												final ByteBuffer class91_sub9 = new ByteBuffer(is);
												int i_67_ = -1;
												for (;;) {
													final int i_68_ = class91_sub9.method649(-1757756991);
													if (i_68_ == 0) {
														if (i != 823373173) {
															break;
														}
														return;
													}
													i_67_ += i_68_;
													int i_69_ = 0;
													for (;;) {
														final int i_70_ = class91_sub9.method649(-2067309673);
														if (i_70_ == 0) {
															break;
														}
														i_69_ += i_70_ - 1;
														final int i_71_ = i_69_ & 0x3f;
														final int i_72_ = i_69_ >> 6 & 0x3f;
														final int i_73_ = i_69_ >> 12;
														final int i_74_ = class91_sub9.readUnsignedByte();
														final int i_75_ = i_74_ >> 2;
														final int i_76_ = i_74_ & 0x3;
														final int i_77_ = i_72_ + i_65_;
														final int i_78_ = i_71_ + i_66_;
														if (i_77_ > 0 && i_78_ > 0 && i_77_ < 103 && i_78_ < 103) {
															int i_79_ = i_73_;
															if ((Class102.aByteArrayArrayArray1299[1][i_77_][i_78_] & 0x2) == 2) {
																i_79_ = i_73_ - 1;
															}
															Class76 class76 = null;
															if (i_79_ >= 0) {
																class76 = class76s[i_79_];
															}
															Class91_Sub20_Sub14_Sub1.method925(i_73_, i_77_, i_78_, i_67_, i_76_, i_75_, class39, class76, -1191648466);
														}
													}
												}
											}
										}
									}
									if (aBoolean1498) {
										for (int i_80_ = 0; i_80_ < 4; i_80_++) {
											if (i == 823373173) {
												return;
											}
											Class91_Sub20_Sub5.method759((byte) -38);
											for (int i_81_ = 0; i_81_ < 13; i_81_++) {
												for (int i_82_ = 0; i_82_ < 13; i_82_++) {
													boolean bool_83_ = false;
													final int i_84_ = anIntArrayArrayArray1499[i_80_][i_81_][i_82_];
													if (-1 != i_84_) {
														if (i == 823373173) {
															return;
														}
														final int i_85_ = i_84_ >> 24 & 0x3;
														final int i_86_ = i_84_ >> 1 & 0x3;
														final int i_87_ = i_84_ >> 14 & 0x3ff;
														final int i_88_ = i_84_ >> 3 & 0x7ff;
														final int i_89_ = (i_87_ / 8 << 8) + i_88_ / 8;
														for (int i_90_ = 0; i_90_ < Class68.anIntArray802.length; i_90_++) {
															if (i_89_ == Class68.anIntArray802[i_90_] && ByteBuffer.aByteArrayArray1859[i_90_] != null) {
																Class91_Sub20_Sub14_Sub1_Sub2.method946(ByteBuffer.aByteArrayArray1859[i_90_], i_80_, i_81_ * 8, 8 * i_82_, i_85_, (i_87_ & 0x7) * 8, (i_88_ & 0x7) * 8, i_86_, aClass76Array1530, (byte) -83);
																bool_83_ = true;
																break;
															}
														}
													}
													if (!bool_83_) {
														Class44.method359(i_80_, i_81_ * 8, 8 * i_82_, 1718494425);
													}
												}
											}
										}
										for (int i_91_ = 0; i_91_ < 13; i_91_++) {
											if (i == 823373173) {
												return;
											}
											for (int i_92_ = 0; i_92_ < 13; i_92_++) {
												if (i == 823373173) {
													return;
												}
												final int i_93_ = anIntArrayArrayArray1499[0][i_91_][i_92_];
												if (i_93_ == -1) {
													Class20.method198(8 * i_91_, 8 * i_92_, 8, 8, -1883024042);
												}
											}
										}
										Class24.method226(true, (byte) 82);
										for (int i_94_ = 0; i_94_ < 4; i_94_++) {
											if (i == 823373173) {
												return;
											}
											Class91_Sub20_Sub5.method759((byte) 59);
											for (int i_95_ = 0; i_95_ < 13; i_95_++) {
												for (int i_96_ = 0; i_96_ < 13; i_96_++) {
													final int i_97_ = anIntArrayArrayArray1499[i_94_][i_95_][i_96_];
													if (-1 != i_97_) {
														final int i_98_ = i_97_ >> 24 & 0x3;
														final int i_99_ = i_97_ >> 1 & 0x3;
														final int i_100_ = i_97_ >> 14 & 0x3ff;
														final int i_101_ = i_97_ >> 3 & 0x7ff;
														final int i_102_ = i_101_ / 8 + (i_100_ / 8 << 8);
														for (int i_103_ = 0; i_103_ < Class68.anIntArray802.length; i_103_++) {
															if (i_102_ == Class68.anIntArray802[i_103_] && Class91_Sub5.aByteArrayArray1805[i_103_] != null) {
																Class1.method75(Class91_Sub5.aByteArrayArray1805[i_103_], i_94_, 8 * i_95_, i_96_ * 8, i_98_, (i_100_ & 0x7) * 8, 8 * (i_101_ & 0x7), i_99_, Class107.aClass39_1397, aClass76Array1530, -2127589555);
																break;
															}
														}
													}
												}
											}
										}
									}
									Class24.method226(true, (byte) 81);
									Class107.method1106(1308920804);
									Class91_Sub20_Sub5.method759((byte) 42);
									Class91_Sub20_Sub14_Sub7.method1023(Class107.aClass39_1397, aClass76Array1530, 1943849660);
									Class24.method226(true, (byte) 72);
									int i_104_ = -1711069075 * Class102.anInt1294;
									if (i_104_ > Class100.anInt1248 * -1723088013) {
										if (i == 823373173) {
											break;
										}
										i_104_ = -1723088013 * Class100.anInt1248;
									}
									if (i_104_ < -1723088013 * Class100.anInt1248 - 1) {
										i_104_ = Class100.anInt1248 * -1723088013 - 1;
									}
									if (aBoolean1691) {
										if (i == 823373173) {
											break;
										}
										Class107.aClass39_1397.method329(-1711069075 * Class102.anInt1294);
									} else {
										Class107.aClass39_1397.method329(0);
									}
									for (int i_105_ = 0; i_105_ < 104; i_105_++) {
										for (int i_106_ = 0; i_106_ < 104; i_106_++) {
											Class33.method278(i_105_, i_106_, (byte) 92);
										}
									}
									Class91_Sub20_Sub5.method759((byte) -44);
									Class91_Sub23.method1044(16711680);
									LocType.aClass96_2300.method1070();
									if (Class91_Sub24.aFrame2134 != null) {
										aClass91_Sub9_Sub1_1478.method690(93, 1160292001);
										aClass91_Sub9_Sub1_1478.writeDWord(1057001181);
									}
									if (!aBoolean1498) {
										final int i_107_ = (1622419267 * anInt1705 - 6) / 8;
										final int i_108_ = (1622419267 * anInt1705 + 6) / 8;
										final int i_109_ = (-1872250907 * anInt1698 - 6) / 8;
										final int i_110_ = (-1872250907 * anInt1698 + 6) / 8;
										for (int i_111_ = i_107_ - 1; i_111_ <= i_108_ + 1; i_111_++) {
											if (i == 823373173) {
												return;
											}
											for (int i_112_ = i_109_ - 1; i_112_ <= i_110_ + 1; i_112_++) {
												if (i == 823373173) {
													return;
												}
												if (i_111_ < i_107_ || i_111_ > i_108_ || i_112_ < i_109_ || i_112_ > i_110_) {
													Class67.aClass63_Sub1_800.method413(new StringBuilder("m").append(i_111_).append("_").append(i_112_).toString(), (byte) 21);
													Class67.aClass63_Sub1_800.method413(new StringBuilder("l").append(i_111_).append("_").append(i_112_).toString(), (byte) -71);
												}
											}
										}
									}
									Class91_Sub20_Sub14_Sub1_Sub2.method939(30, 1038177052);
									Class91_Sub20_Sub5.method759((byte) -64);
									Class102.aByteArrayArrayArray1295 = null;
									Class91_Sub20_Sub6.aByteArrayArrayArray2292 = null;
									Class102.aByteArrayArrayArray1296 = null;
									Class49.aByteArrayArrayArray610 = null;
									Class32.anIntArrayArrayArray375 = null;
									Class102.aByteArrayArrayArray1310 = null;
									Class102.anIntArrayArray1298 = null;
									Class102.anIntArray1304 = null;
									Class32.anIntArray377 = null;
									Class91_Sub20_Sub9.anIntArray2403 = null;
									Class106.anIntArray1376 = null;
									Class46.anIntArray589 = null;
									aClass91_Sub9_Sub1_1478.method690(157, 1160292001);
									Class100.aClass26_1246.method242(1502295497);
									for (int i_113_ = 0; i_113_ < 32; i_113_++) {
										if (i == 823373173) {
											return;
										}
										aLongArray14[i_113_] = 0L;
									}
									for (int i_114_ = 0; i_114_ < 32; i_114_++) {
										if (i == 823373173) {
											return;
										}
										aLongArray11[i_114_] = 0L;
									}
									Class73.anInt842 = 0;
								}
							}
						}
						if (30 == anInt1599 * -1935794829) {
							Class88.method492(-949851482);
						} else if (40 == -1935794829 * anInt1599) {
							Class91_Sub20_Sub14_Sub7.method1016(1435766796);
						}
						break;
					}
					break;
				}
				class91_sub12.aClass63_Sub1_1888.method431(class91_sub12.aClass14_1887, (int) class91_sub12.aLong1192, class91_sub12.aByteArray1890, false, 1154101984);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "client.k()");
		}
	}

	@Override
	protected final void method57() {
		anInt1449 += 610709489;
		method66((byte) 0);
		for (;;) {
			final Class95 class95 = Class78.aClass95_1111;
			Class91_Sub12 class91_sub12;
			synchronized (class95) {
				class91_sub12 = (Class91_Sub12) Class78.aClass95_1109.method1064();
			}
			if (class91_sub12 == null) {
				Class41.method343(-360081226);
				Class91_Sub20_Sub5.method759((byte) 65);
				Class59.method390((short) 15427);
				final Class12 class12 = Class12.aClass12_183;
				synchronized (class12) {
					Class12.anInt171 = -439419619 * Class12.anInt169;
					Class12.anInt173 = Class12.anInt170 * -670859977;
					Class12.anInt178 = -389201539 * Class12.anInt179;
					Class12.anInt172 = Class12.anInt181 * 1580298131;
					Class12.anInt180 = Class12.anInt176 * -1444347267;
					Class12.anInt167 = Class12.anInt177 * 1857342989;
					Class12.aLong182 = Class12.aLong174 * -8017771125483093315L;
					Class12.anInt181 = 0;
				}
				if (Class105.aClass24_1366 != null) {
					final int i = Class105.aClass24_1366.method217((byte) 0);
					anInt1613 = 459221931 * i;
				}
				if (anInt1599 * -1935794829 == 0) {
					Class91_Sub8.method629(-2005995539);
					Class100.aClass26_1246.method242(-1372793957);
					for (int i = 0; i < 32; i++) {
						aLongArray14[i] = 0L;
					}
					for (int i = 0; i < 32; i++) {
						aLongArray11[i] = 0L;
					}
					Class73.anInt842 = 0;
				} else if (5 == anInt1599 * -1935794829) {
					Class91_Sub22.method1039(this, (byte) 0);
					Class91_Sub8.method629(-2005995539);
					Class100.aClass26_1246.method242(-926048140);
					for (int i = 0; i < 32; i++) {
						aLongArray14[i] = 0L;
					}
					for (int i = 0; i < 32; i++) {
						aLongArray11[i] = 0L;
					}
					Class73.anInt842 = 0;
				} else if (10 == -1935794829 * anInt1599) {
					Class91_Sub22.method1039(this, (byte) 0);
				} else if (anInt1599 * -1935794829 == 20) {
					Class91_Sub22.method1039(this, (byte) 0);
					Class91_Sub20_Sub14_Sub7.method1016(-499690616);
				} else if (25 == -1935794829 * anInt1599) {
					Class24.method226(false, (byte) 118);
					anInt1468 = 0;
					boolean bool = true;
					for (int i = 0; i < ByteBuffer.aByteArrayArray1859.length; i++) {
						if (Class91_Sub24.anIntArray2140[i] != -1 && ByteBuffer.aByteArrayArray1859[i] == null) {
							ByteBuffer.aByteArrayArray1859[i] = Class67.aClass63_Sub1_800.getFile(Class91_Sub24.anIntArray2140[i], 0, -896212102);
							if (ByteBuffer.aByteArrayArray1859[i] == null) {
								bool = false;
								anInt1468 += 1044410349;
							}
						}
						if (Class91_Sub21.anIntArray2089[i] != -1 && Class91_Sub5.aByteArrayArray1805[i] == null) {
							Class91_Sub5.aByteArrayArray1805[i] = Class67.aClass63_Sub1_800.method398(Class91_Sub21.anIntArray2089[i], 0, Class81.anIntArrayArray1121[i], (byte) 8);
							if (Class91_Sub5.aByteArrayArray1805[i] == null) {
								bool = false;
								anInt1468 += 1044410349;
							}
						}
					}
					if (!bool) {
						anInt1496 = -1312814877;
					} else {
						anInt1469 = 0;
						bool = true;
						for (int i = 0; i < ByteBuffer.aByteArrayArray1859.length; i++) {
							final byte[] is = Class91_Sub5.aByteArrayArray1805[i];
							if (is != null) {
								int i_115_ = 64 * (Class68.anIntArray802[i] >> 8) - 1885886277 * Class40.anInt541;
								int i_116_ = 64 * (Class68.anIntArray802[i] & 0xff) - Class91_Sub20_Sub15.anInt2497 * 1838527067;
								if (aBoolean1498) {
									i_115_ = 10;
									i_116_ = 10;
								}
								bool &= Class104.method1092(is, i_115_, i_116_, 1946868955);
							}
						}
						if (!bool) {
							anInt1496 = 1669337542;
						} else {
							if (anInt1496 * -2133230389 != 0) {
								Class86_Sub1.method489(new StringBuilder(Class75.aString856).append(Class106.aString1374).append(Class106.aString1368).append(100).append("%").append(Class106.aString1377).toString(), true, 1024271978);
							}
							Class91_Sub20_Sub5.method759((byte) 48);
							Class107.method1106(759703287);
							Class91_Sub20_Sub5.method759((byte) 36);
							Class107.aClass39_1397.method330();
							Class91_Sub20_Sub5.method759((byte) 19);
							System.gc();
							for (int i = 0; i < 4; i++) {
								aClass76Array1530[i].method462((byte) 72);
							}
							for (int i = 0; i < 4; i++) {
								for (int i_117_ = 0; i_117_ < 104; i_117_++) {
									for (int i_118_ = 0; i_118_ < 104; i_118_++) {
										Class102.aByteArrayArrayArray1299[i][i_117_][i_118_] = (byte) 0;
									}
								}
							}
							Class91_Sub20_Sub5.method759((byte) -22);
							Class32.method275((byte) 0);
							final int i = ByteBuffer.aByteArrayArray1859.length;
							for (Class91_Sub24 class91_sub24 = (Class91_Sub24) Class91_Sub24.aClass95_2137.method1062(); class91_sub24 != null; class91_sub24 = (Class91_Sub24) Class91_Sub24.aClass95_2137.method1063()) {
								if (class91_sub24.aClass91_Sub2_Sub1_2133 != null) {
									Class91_Sub22.aClass91_Sub2_Sub2_2109.method560(class91_sub24.aClass91_Sub2_Sub1_2133);
									class91_sub24.aClass91_Sub2_Sub1_2133 = null;
								}
								if (class91_sub24.aClass91_Sub2_Sub1_2138 != null) {
									Class91_Sub22.aClass91_Sub2_Sub2_2109.method560(class91_sub24.aClass91_Sub2_Sub1_2138);
									class91_sub24.aClass91_Sub2_Sub1_2138 = null;
								}
							}
							Class91_Sub24.aClass95_2137.method1057();
							Class24.method226(true, (byte) 16);
							if (!aBoolean1498) {
								for (int i_119_ = 0; i_119_ < i; i_119_++) {
									final int i_120_ = 64 * (Class68.anIntArray802[i_119_] >> 8) - Class40.anInt541 * 1885886277;
									final int i_121_ = (Class68.anIntArray802[i_119_] & 0xff) * 64 - 1838527067 * Class91_Sub20_Sub15.anInt2497;
									final byte[] is = ByteBuffer.aByteArrayArray1859[i_119_];
									if (is != null) {
										Class91_Sub20_Sub5.method759((byte) -76);
										Class91_Sub20_Sub14.method918(is, i_120_, i_121_, anInt1705 * 94452248 - 48, anInt1698 * -2093105368 - 48, aClass76Array1530, -777643589);
									}
								}
								for (int i_122_ = 0; i_122_ < i; i_122_++) {
									final int i_123_ = 64 * (Class68.anIntArray802[i_122_] >> 8) - Class40.anInt541 * 1885886277;
									final int i_124_ = 64 * (Class68.anIntArray802[i_122_] & 0xff) - Class91_Sub20_Sub15.anInt2497 * 1838527067;
									final byte[] is = ByteBuffer.aByteArrayArray1859[i_122_];
									if (is == null && -1872250907 * anInt1698 < 800) {
										Class91_Sub20_Sub5.method759((byte) 70);
										Class20.method198(i_123_, i_124_, 64, 64, -2056304688);
									}
								}
								Class24.method226(true, (byte) 92);
								for (int i_125_ = 0; i_125_ < i; i_125_++) {
									final byte[] is = Class91_Sub5.aByteArrayArray1805[i_125_];
									if (is != null) {
										final int i_126_ = (Class68.anIntArray802[i_125_] >> 8) * 64 - 1885886277 * Class40.anInt541;
										final int i_127_ = 64 * (Class68.anIntArray802[i_125_] & 0xff) - 1838527067 * Class91_Sub20_Sub15.anInt2497;
										Class91_Sub20_Sub5.method759((byte) -57);
										final Class39 class39 = Class107.aClass39_1397;
										final Class76[] class76s = aClass76Array1530;
										final ByteBuffer class91_sub9 = new ByteBuffer(is);
										int i_128_ = -1;
										for (;;) {
											final int i_129_ = class91_sub9.method649(-1387796069);
											if (i_129_ == 0) {
												break;
											}
											i_128_ += i_129_;
											int i_130_ = 0;
											for (;;) {
												final int i_131_ = class91_sub9.method649(-1138840622);
												if (i_131_ == 0) {
													break;
												}
												i_130_ += i_131_ - 1;
												final int i_132_ = i_130_ & 0x3f;
												final int i_133_ = i_130_ >> 6 & 0x3f;
												final int i_134_ = i_130_ >> 12;
												final int i_135_ = class91_sub9.readUnsignedByte();
												final int i_136_ = i_135_ >> 2;
												final int i_137_ = i_135_ & 0x3;
												final int i_138_ = i_133_ + i_126_;
												final int i_139_ = i_132_ + i_127_;
												if (i_138_ > 0 && i_139_ > 0 && i_138_ < 103 && i_139_ < 103) {
													int i_140_ = i_134_;
													if ((Class102.aByteArrayArrayArray1299[1][i_138_][i_139_] & 0x2) == 2) {
														i_140_ = i_134_ - 1;
													}
													Class76 class76 = null;
													if (i_140_ >= 0) {
														class76 = class76s[i_140_];
													}
													Class91_Sub20_Sub14_Sub1.method925(i_134_, i_138_, i_139_, i_128_, i_137_, i_136_, class39, class76, 979251044);
												}
											}
										}
									}
								}
							}
							if (aBoolean1498) {
								for (int i_141_ = 0; i_141_ < 4; i_141_++) {
									Class91_Sub20_Sub5.method759((byte) -27);
									for (int i_142_ = 0; i_142_ < 13; i_142_++) {
										for (int i_143_ = 0; i_143_ < 13; i_143_++) {
											boolean var35 = false;
											final int i_144_ = anIntArrayArrayArray1499[i_141_][i_142_][i_143_];
											if (-1 != i_144_) {
												final int i_145_ = i_144_ >> 24 & 0x3;
												final int i_146_ = i_144_ >> 1 & 0x3;
												final int i_147_ = i_144_ >> 14 & 0x3ff;
												final int i_148_ = i_144_ >> 3 & 0x7ff;
												final int i_149_ = (i_147_ / 8 << 8) + i_148_ / 8;
												for (int i_150_ = 0; i_150_ < Class68.anIntArray802.length; i_150_++) {
													if (i_149_ == Class68.anIntArray802[i_150_] && ByteBuffer.aByteArrayArray1859[i_150_] != null) {
														Class91_Sub20_Sub14_Sub1_Sub2.method946(ByteBuffer.aByteArrayArray1859[i_150_], i_141_, i_142_ * 8, 8 * i_143_, i_145_, (i_147_ & 0x7) * 8, (i_148_ & 0x7) * 8, i_146_, aClass76Array1530, (byte) -127);
														var35 = true;
														break;
													}
												}
											}
											if (!var35) {
												Class44.method359(i_141_, i_142_ * 8, 8 * i_143_, 1177279821);
											}
										}
									}
								}
								for (int i_151_ = 0; i_151_ < 13; i_151_++) {
									for (int i_152_ = 0; i_152_ < 13; i_152_++) {
										final int i_153_ = anIntArrayArrayArray1499[0][i_151_][i_152_];
										if (i_153_ == -1) {
											Class20.method198(8 * i_151_, 8 * i_152_, 8, 8, -1704353165);
										}
									}
								}
								Class24.method226(true, (byte) 65);
								for (int i_154_ = 0; i_154_ < 4; i_154_++) {
									Class91_Sub20_Sub5.method759((byte) -9);
									for (int i_155_ = 0; i_155_ < 13; i_155_++) {
										for (int i_156_ = 0; i_156_ < 13; i_156_++) {
											final int i_157_ = anIntArrayArrayArray1499[i_154_][i_155_][i_156_];
											if (-1 != i_157_) {
												final int i_158_ = i_157_ >> 24 & 0x3;
												final int i_159_ = i_157_ >> 1 & 0x3;
												final int i_160_ = i_157_ >> 14 & 0x3ff;
												final int i_161_ = i_157_ >> 3 & 0x7ff;
												final int i_162_ = i_161_ / 8 + (i_160_ / 8 << 8);
												for (int i_163_ = 0; i_163_ < Class68.anIntArray802.length; i_163_++) {
													if (i_162_ == Class68.anIntArray802[i_163_] && Class91_Sub5.aByteArrayArray1805[i_163_] != null) {
														Class1.method75(Class91_Sub5.aByteArrayArray1805[i_163_], i_154_, 8 * i_155_, i_156_ * 8, i_158_, (i_160_ & 0x7) * 8, 8 * (i_161_ & 0x7), i_159_, Class107.aClass39_1397, aClass76Array1530, -2126747103);
														break;
													}
												}
											}
										}
									}
								}
							}
							Class24.method226(true, (byte) 55);
							Class107.method1106(2113453134);
							Class91_Sub20_Sub5.method759((byte) 5);
							Class91_Sub20_Sub14_Sub7.method1023(Class107.aClass39_1397, aClass76Array1530, 456573940);
							Class24.method226(true, (byte) 78);
							int i_164_ = -1711069075 * Class102.anInt1294;
							if (i_164_ > Class100.anInt1248 * -1723088013) {
								i_164_ = -1723088013 * Class100.anInt1248;
							}
							if (i_164_ < -1723088013 * Class100.anInt1248 - 1) {
								i_164_ = Class100.anInt1248 * -1723088013 - 1;
							}
							if (aBoolean1691) {
								Class107.aClass39_1397.method329(-1711069075 * Class102.anInt1294);
							} else {
								Class107.aClass39_1397.method329(0);
							}
							for (int i_165_ = 0; i_165_ < 104; i_165_++) {
								for (int i_166_ = 0; i_166_ < 104; i_166_++) {
									Class33.method278(i_165_, i_166_, (byte) 116);
								}
							}
							Class91_Sub20_Sub5.method759((byte) -15);
							Class91_Sub23.method1044(16711680);
							LocType.aClass96_2300.method1070();
							if (Class91_Sub24.aFrame2134 != null) {
								aClass91_Sub9_Sub1_1478.method690(93, 1160292001);
								aClass91_Sub9_Sub1_1478.writeDWord(1057001181);
							}
							if (!aBoolean1498) {
								final int i_167_ = (1622419267 * anInt1705 - 6) / 8;
								final int i_168_ = (1622419267 * anInt1705 + 6) / 8;
								final int i_169_ = (-1872250907 * anInt1698 - 6) / 8;
								final int i_170_ = (-1872250907 * anInt1698 + 6) / 8;
								for (int i_171_ = i_167_ - 1; i_171_ <= i_168_ + 1; i_171_++) {
									for (int i_172_ = i_169_ - 1; i_172_ <= i_170_ + 1; i_172_++) {
										if (i_171_ < i_167_ || i_171_ > i_168_ || i_172_ < i_169_ || i_172_ > i_170_) {
											Class67.aClass63_Sub1_800.method413(new StringBuilder("m").append(i_171_).append("_").append(i_172_).toString(), (byte) 38);
											Class67.aClass63_Sub1_800.method413(new StringBuilder("l").append(i_171_).append("_").append(i_172_).toString(), (byte) 62);
										}
									}
								}
							}
							Class91_Sub20_Sub14_Sub1_Sub2.method939(30, -659740108);
							Class91_Sub20_Sub5.method759((byte) 104);
							Class102.aByteArrayArrayArray1295 = null;
							Class91_Sub20_Sub6.aByteArrayArrayArray2292 = null;
							Class102.aByteArrayArrayArray1296 = null;
							Class49.aByteArrayArrayArray610 = null;
							Class32.anIntArrayArrayArray375 = null;
							Class102.aByteArrayArrayArray1310 = null;
							Class102.anIntArrayArray1298 = null;
							Class102.anIntArray1304 = null;
							Class32.anIntArray377 = null;
							Class91_Sub20_Sub9.anIntArray2403 = null;
							Class106.anIntArray1376 = null;
							Class46.anIntArray589 = null;
							aClass91_Sub9_Sub1_1478.method690(157, 1160292001);
							Class100.aClass26_1246.method242(604584578);
							for (int i_173_ = 0; i_173_ < 32; i_173_++) {
								aLongArray14[i_173_] = 0L;
							}
							for (int i_174_ = 0; i_174_ < 32; i_174_++) {
								aLongArray11[i_174_] = 0L;
							}
							Class73.anInt842 = 0;
						}
					}
				}
				if (30 == anInt1599 * -1935794829) {
					Class88.method492(739009376);
				} else if (40 == -1935794829 * anInt1599) {
					Class91_Sub20_Sub14_Sub7.method1016(-1279345271);
				}
				break;
			}
			class91_sub12.aClass63_Sub1_1888.method431(class91_sub12.aClass14_1887, (int) class91_sub12.aLong1192, class91_sub12.aByteArray1890, false, -537830344);
		}
	}

	@Override
	protected final void method54() {
		if (Class36.aClass97_438 != null) {
			Class36.aClass97_438.aBoolean1217 = false;
		}
		Class36.aClass97_438 = null;
		if (Class91_Sub20_Sub14_Sub6.aClass20_2819 != null) {
			Class91_Sub20_Sub14_Sub6.aClass20_2819.method194((byte) 1);
			Class91_Sub20_Sub14_Sub6.aClass20_2819 = null;
		}
		Class105.method1095((short) 150);
		Class91_Sub21.method1035(-516809102);
		Class105.aClass24_1366 = null;
		if (aClass6_1682 != null) {
			aClass6_1682.method120(2094232740);
		}
		if (Class86_Sub1.aClass6_1750 != null) {
			Class86_Sub1.aClass6_1750.method120(2072199285);
		}
		if (Class59.aClass20_722 != null) {
			Class59.aClass20_722.method194((byte) 1);
		}
		Class34.method282(-363938325);
		Class91_Sub14.method710(-2119542283);
	}

	void method66(final byte i) {
		try {
			if (-1935794829 * anInt1599 != 1000) {
				final long l = Class108.method1111(223775401);
				int i_175_ = (int) (l - -8386270300442495385L * Class59.aLong718);
				Class59.aLong718 = 3379739841472972119L * l;
				if (i_175_ > 200) {
					if (i != 0) {
						throw new IllegalStateException();
					}
					i_175_ = 200;
				}
				Class59.anInt717 += 700862417 * i_175_;
				boolean bool;
				while_15_: do {
					if (628054321 * Class59.anInt723 == 0) {
						if (i != 0) {
							throw new IllegalStateException();
						}
						if (-124209243 * Class59.anInt735 == 0) {
							if (i != 0) {
								throw new IllegalStateException();
							}
							if (-2019506593 * Class59.anInt725 == 0) {
								if (i != 0) {
									throw new IllegalStateException();
								}
								if (Class59.anInt720 * -1676406695 == 0) {
									if (i != 0) {
										throw new IllegalStateException();
									}
									bool = true;
									break;
								}
							}
						}
					}
					if (Class59.aClass20_722 == null) {
						if (i != 0) {
							return;
						}
						bool = false;
					} else {
						try {
							if (-1762760399 * Class59.anInt717 > 30000) {
								throw new IOException();
							}
							for (/**/; -124209243 * Class59.anInt735 < 20; Class59.anInt735 += -1623500755) {
								if (i != 0) {
									throw new IllegalStateException();
								}
								if (Class59.anInt720 * -1676406695 <= 0) {
									break;
								}
								final Class91_Sub20_Sub16 class91_sub20_sub16 = (Class91_Sub20_Sub16) Class59.aClass83_719.method476();
								final ByteBuffer class91_sub9 = new ByteBuffer(4);
								class91_sub9.writeWordBigEndian(1);
								class91_sub9.method672((int) class91_sub20_sub16.aLong1192, (byte) 54);
								Class59.aClass20_722.method197(class91_sub9.buffer, 0, 4, (byte) 0);
								Class59.aClass83_721.method478(class91_sub20_sub16, class91_sub20_sub16.aLong1192);
								Class59.anInt720 -= 483014633;
							}
							for (/**/; Class59.anInt723 * 628054321 < 20; Class59.anInt723 += 506421201) {
								if (i != 0) {
									throw new IllegalStateException();
								}
								if (-2019506593 * Class59.anInt725 <= 0) {
									break;
								}
								final Class91_Sub20_Sub16 class91_sub20_sub16 = (Class91_Sub20_Sub16) Class59.aClass82_726.method471();
								final ByteBuffer class91_sub9 = new ByteBuffer(4);
								class91_sub9.writeWordBigEndian(0);
								class91_sub9.method672((int) class91_sub20_sub16.aLong1192, (byte) 127);
								Class59.aClass20_722.method197(class91_sub9.buffer, 0, 4, (byte) 0);
								class91_sub20_sub16.method724();
								Class59.aClass83_729.method478(class91_sub20_sub16, class91_sub20_sub16.aLong1192);
								Class59.anInt725 -= -2088692321;
							}
							for (int i_176_ = 0; i_176_ < 100; i_176_++) {
								if (i != 0) {
									return;
								}
								final int i_177_ = Class59.aClass20_722.method196((byte) 5);
								if (i_177_ < 0) {
									if (i != 0) {
										throw new IllegalStateException();
									}
									throw new IOException();
								}
								if (i_177_ == 0) {
									if (i != 0) {
										throw new IllegalStateException();
									}
									break;
								}
								Class59.anInt717 = 0;
								int i_178_ = 0;
								if (Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177 == null) {
									if (i != 0) {
										return;
									}
									i_178_ = 8;
								} else if (756567613 * Class59.anInt730 == 0) {
									if (i != 0) {
										throw new IllegalStateException();
									}
									i_178_ = 1;
								}
								if (i_178_ > 0) {
									if (i != 0) {
										throw new IllegalStateException();
									}
									int i_179_ = i_178_ - Class59.aClass91_Sub9_728.currentOffset * -1128893257;
									if (i_179_ > i_177_) {
										i_179_ = i_177_;
									}
									Class59.aClass20_722.method199(Class59.aClass91_Sub9_728.buffer, -1128893257 * Class59.aClass91_Sub9_728.currentOffset, i_179_, (short) -16391);
									if (Class59.aByte733 != 0) {
										if (i != 0) {
											throw new IllegalStateException();
										}
										for (int i_180_ = 0; i_180_ < i_179_; i_180_++) {
											Class59.aClass91_Sub9_728.buffer[Class59.aClass91_Sub9_728.currentOffset * -1128893257 + i_180_] ^= Class59.aByte733;
										}
									}
									Class59.aClass91_Sub9_728.currentOffset += 565881095 * i_179_;
									if (Class59.aClass91_Sub9_728.currentOffset * -1128893257 < i_178_) {
										break;
									}
									if (Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177 == null) {
										if (i != 0) {
											throw new IllegalStateException();
										}
										Class59.aClass91_Sub9_728.currentOffset = 0;
										final int i_181_ = Class59.aClass91_Sub9_728.readUnsignedByte();
										final int i_182_ = Class59.aClass91_Sub9_728.method686((byte) -113);
										final int i_183_ = Class59.aClass91_Sub9_728.readUnsignedByte();
										final int i_184_ = Class59.aClass91_Sub9_728.readDword();
										final long l_185_ = (i_181_ << 16) + i_182_;
										Class91_Sub20_Sub16 class91_sub20_sub16 = (Class91_Sub20_Sub16) Class59.aClass83_721.method474(l_185_);
										Class59.aBoolean716 = true;
										if (class91_sub20_sub16 == null) {
											if (i != 0) {
												throw new IllegalStateException();
											}
											class91_sub20_sub16 = (Class91_Sub20_Sub16) Class59.aClass83_729.method474(l_185_);
											Class59.aBoolean716 = false;
										}
										if (class91_sub20_sub16 == null) {
											if (i != 0) {
												throw new IllegalStateException();
											}
											throw new IOException();
										}
										int i_186_;
										if (i_183_ == 0) {
											if (i != 0) {
												throw new IllegalStateException();
											}
											i_186_ = 5;
										} else {
											i_186_ = 9;
										}
										final int i_187_ = i_186_;
										Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177 = class91_sub20_sub16;
										Class23.aClass91_Sub9_290 = new ByteBuffer(Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177.aByte2500 + i_184_ + i_187_);
										Class23.aClass91_Sub9_290.writeWordBigEndian(i_183_);
										Class23.aClass91_Sub9_290.writeDWord(i_184_);
										Class59.anInt730 = -1972254552;
										Class59.aClass91_Sub9_728.currentOffset = 0;
									} else if (756567613 * Class59.anInt730 == 0) {
										if (i != 0) {
											throw new IllegalStateException();
										}
										if (Class59.aClass91_Sub9_728.buffer[0] == -1) {
											if (i != 0) {
												throw new IllegalStateException();
											}
											Class59.anInt730 = 290339093;
											Class59.aClass91_Sub9_728.currentOffset = 0;
										} else {
											Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177 = null;
										}
									}
								} else {
									final int i_188_ = Class23.aClass91_Sub9_290.buffer.length - Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177.aByte2500;
									int i_189_ = 512 - Class59.anInt730 * 756567613;
									if (i_189_ > i_188_ - Class23.aClass91_Sub9_290.currentOffset * -1128893257) {
										if (i != 0) {
											throw new IllegalStateException();
										}
										i_189_ = i_188_ - Class23.aClass91_Sub9_290.currentOffset * -1128893257;
									}
									if (i_189_ > i_177_) {
										if (i != 0) {
											throw new IllegalStateException();
										}
										i_189_ = i_177_;
									}
									Class59.aClass20_722.method199(Class23.aClass91_Sub9_290.buffer, Class23.aClass91_Sub9_290.currentOffset * -1128893257, i_189_, (short) 12402);
									if (Class59.aByte733 != 0) {
										if (i != 0) {
											throw new IllegalStateException();
										}
										for (int i_190_ = 0; i_190_ < i_189_; i_190_++) {
											if (i != 0) {
												return;
											}
											Class23.aClass91_Sub9_290.buffer[i_190_ + -1128893257 * Class23.aClass91_Sub9_290.currentOffset] ^= Class59.aByte733;
										}
									}
									Class23.aClass91_Sub9_290.currentOffset += 565881095 * i_189_;
									Class59.anInt730 += 290339093 * i_189_;
									if (-1128893257 * Class23.aClass91_Sub9_290.currentOffset == i_188_) {
										if (i != 0) {
											throw new IllegalStateException();
										}
										if (16711935L == Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177.aLong1192) {
											if (i != 0) {
												throw new IllegalStateException();
											}
											Class58.aClass91_Sub9_714 = Class23.aClass91_Sub9_290;
											for (int i_191_ = 0; i_191_ < 256; i_191_++) {
												if (i != 0) {
													throw new IllegalStateException();
												}
												final Class63_Sub1 class63_sub1 = Class59.aClass63_Sub1Array732[i_191_];
												if (class63_sub1 != null) {
													Class58.aClass91_Sub9_714.currentOffset = -1465561821 + i_191_ * 232081464;
													final int i_192_ = Class58.aClass91_Sub9_714.readDword();
													final int i_193_ = Class58.aClass91_Sub9_714.readDword();
													class63_sub1.method423(i_192_, i_193_, 1100855903);
												}
											}
										} else {
											Class59.aCRC32_731.reset();
											Class59.aCRC32_731.update(Class23.aClass91_Sub9_290.buffer, 0, i_188_);
											final int i_194_ = (int) Class59.aCRC32_731.getValue();
											if (-1950990879 * Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177.anInt2499 != i_194_) {
												if (i != 0) {
													throw new IllegalStateException();
												}
												try {
													Class59.aClass20_722.method194((byte) 1);
												} catch (final Exception exception) {
													/* empty */
												}
												Class59.anInt734 += 1361977493;
												Class59.aClass20_722 = null;
												Class59.aByte733 = (byte) (int) (Math.random() * 255.0 + 1.0);
												bool = false;
												break while_15_;
											}
											Class59.anInt734 = 0;
											Class59.anInt727 = 0;
											final int i_195_ = (int) (Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177.aLong1192 & 0xffffL);
											boolean bool_196_;
											if ((Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177.aLong1192 & 0xff0000L) == 16711680L) {
												if (i != 0) {
													throw new IllegalStateException();
												}
												bool_196_ = true;
											} else {
												bool_196_ = false;
											}
											Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177.aClass63_Sub1_2502.method424(i_195_, Class23.aClass91_Sub9_290.buffer, bool_196_, Class59.aBoolean716, 1935708410);
										}
										Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177.method495();
										if (Class59.aBoolean716) {
											if (i != 0) {
												return;
											}
											Class59.anInt735 -= -1623500755;
										} else {
											Class59.anInt723 -= 506421201;
										}
										Class59.anInt730 = 0;
										Class91_Sub2_Sub3.aClass91_Sub20_Sub16_2177 = null;
										Class23.aClass91_Sub9_290 = null;
									} else {
										if (512 != 756567613 * Class59.anInt730) {
											break;
										}
										if (i != 0) {
											throw new IllegalStateException();
										}
										Class59.anInt730 = 0;
									}
								}
							}
							bool = true;
						} catch (final IOException ioexception) {
							try {
								Class59.aClass20_722.method194((byte) 1);
							} catch (final Exception exception) {
								/* empty */
							}
							Class59.anInt727 += -590812569;
							Class59.aClass20_722 = null;
							bool = false;
						}
					}
				} while (false);
				if (!bool) {
					if (i != 0) {
						throw new IllegalStateException();
					}
					method63((byte) -8);
				}
			}
		} catch (final RuntimeException var21) {
			throw Class102.method1086(var21, "client.z()");
		}
	}

	public static final boolean method67(final int i) {
		try {
			final Class15 class15 = Class15.aClass15_216;
			synchronized (class15) {
				if (Class15.anInt204 * 1639997233 == Class15.anInt226 * 249871571) {
					return false;
				}
				Class91_Sub20_Sub4.anInt2262 = Class15.anIntArray223[Class15.anInt226 * 249871571] * 94099215;
				Class48.aChar607 = Class15.aCharArray222[Class15.anInt226 * 249871571];
				Class15.anInt226 = (249871571 * Class15.anInt226 + 1 & 0x7f) * -512033957;
				return true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class102.method1086(runtimeexception, "client.e()");
		}
	}

	@Override
	protected final void method53() {
		Class97.anInt1215 = -1467153203 * (986135985 * anInt1442 == 0 ? 43594 : 121784213 * anInt1660 + 40000);
		anInt1474 = -265338895 * (986135985 * anInt1442 == 0 ? 443 : 50000 + anInt1660 * 121784213);
		Class28_Sub1.anInt1729 = 1949429041 * Class97.anInt1215;
		Class85.aShortArray1163 = Class80.aShortArray1115;
		Class91_Sub8.aShortArrayArray1852 = Class80.aShortArrayArray1116;
		Class85.aShortArray1161 = Class80.aShortArray1120;
		Class91_Sub20_Sub17.aShortArrayArray2503 = Class80.aShortArrayArray1118;
		if (Class25.aString311.toLowerCase().indexOf("microsoft") != -1) {
			Class15.anIntArray220[186] = 57;
			Class15.anIntArray220[187] = 27;
			Class15.anIntArray220[188] = 71;
			Class15.anIntArray220[189] = 26;
			Class15.anIntArray220[190] = 72;
			Class15.anIntArray220[191] = 73;
			Class15.anIntArray220[192] = 58;
			Class15.anIntArray220[219] = 42;
			Class15.anIntArray220[220] = 74;
			Class15.anIntArray220[221] = 43;
			Class15.anIntArray220[222] = 59;
			Class15.anIntArray220[223] = 28;
		} else {
			Class15.anIntArray220[44] = 71;
			Class15.anIntArray220[45] = 26;
			Class15.anIntArray220[46] = 72;
			Class15.anIntArray220[47] = 73;
			Class15.anIntArray220[59] = 57;
			Class15.anIntArray220[61] = 27;
			Class15.anIntArray220[91] = 42;
			Class15.anIntArray220[92] = 74;
			Class15.anIntArray220[93] = 43;
			Class15.anIntArray220[192] = 28;
			Class15.anIntArray220[222] = 58;
			Class15.anIntArray220[520] = 59;
		}
		method69(Class102.aCanvas1309, (byte) 0);
		Class91_Sub11.method703(Class102.aCanvas1309, -811609616);
		Class24_Sub1 class24_sub1;
		try {
			class24_sub1 = new Class24_Sub1();
		} catch (final Throwable var3) {
			class24_sub1 = null;
		}
		Class105.aClass24_1366 = class24_sub1;
		if (Class105.aClass24_1366 != null) {
			Class105.aClass24_1366.method215(Class102.aCanvas1309, (byte) -33);
		}
		Class91_Sub24.aClass14_2136 = new Class14(255, Class35.aClass4_417, Class35.aClass4_418, 500000);
		Class91_Sub20_Sub14_Sub4.aClass108_2769 = Class60.method391((byte) 37);
		if (anInt1442 * 986135985 != 0) {
			aBoolean1455 = true;
		}
	}

	static final boolean method68(final Class91_Sub18 class91_sub18, final int i) {
		do {
			try {
				final int i_197_ = -299916553 * class91_sub18.anInt1973;
				if (205 == i_197_) {
					anInt1485 = 994937834;
					return true;
				}
				if (i_197_ >= 300 && i_197_ <= 313) {
					final int i_198_ = (i_197_ - 300) / 2;
					final int i_199_ = i_197_ & 0x1;
					aClass85_1622.method486(i_198_, 1 == i_199_, -1600817817);
				}
				if (i_197_ >= 314 && i_197_ <= 323) {
					final int i_200_ = (i_197_ - 314) / 2;
					final int i_201_ = i_197_ & 0x1;
					aClass85_1622.method480(i_200_, i_201_ == 1, 1981641785);
				}
				if (i_197_ == 324) {
					aClass85_1622.method481(false, 206549519);
				}
				if (i_197_ == 325) {
					aClass85_1622.method481(true, 206549519);
				}
				if (326 != i_197_) {
					break;
				}
				aClass91_Sub9_Sub1_1478.method690(115, 1160292001);
				aClass85_1622.method482(aClass91_Sub9_Sub1_1478, 307590579);
			} catch (final RuntimeException runtimeexception) {
				throw Class102.method1086(runtimeexception, "client.cf()");
			}
			return true;
		} while (false);
		return false;
	}

	public static void method69(final Component component, final byte i) {
		try {
			component.setFocusTraversalKeysEnabled(false);
			component.addKeyListener(Class15.aClass15_216);
			component.addFocusListener(Class15.aClass15_216);
		} catch (final RuntimeException var2) {
			throw Class102.method1086(var2, "client.i()");
		}
	}

	@Override
	protected final void method51() {
		/* empty */
	}

	public static void method70(final ByteBuffer class91_sub9, final int i, final int i_202_) {
		do {
			try {
				if (Class35.aClass4_411 != null) {
					try {
						Class35.aClass4_411.method90(0L);
						Class35.aClass4_411.method95(class91_sub9.buffer, i, 24, 469026001);
					} catch (final Exception exception) {
						break;
					}
				}
				break;
			} catch (final RuntimeException var5) {
				throw Class102.method1086(var5, "client.d()");
			}
		} while (false);
	}

	static void method71(final int i) {
		try {
			for (Class91_Sub10 class91_sub10 = (Class91_Sub10) aClass83_1603.method476(); class91_sub10 != null; class91_sub10 = (Class91_Sub10) aClass83_1603.method477()) {
				final int i_203_ = 337747539 * class91_sub10.anInt1865;
				if (Class91_Sub20_Sub9.method800(i_203_, 518233592)) {
					boolean bool = true;
					final Class91_Sub18[] class91_sub18s = Class91_Sub18.aClass91_Sub18ArrayArray1962[i_203_];
					for (final Class91_Sub18 class91_sub18 : class91_sub18s) {
						if (class91_sub18 != null) {
							bool = class91_sub18.aBoolean1968;
							break;
						}
					}
					if (!bool) {
						final int i_205_ = (int) class91_sub10.aLong1192;
						final Class91_Sub18 class91_sub18 = Class61.method394(i_205_, -631047529);
						if (class91_sub18 != null) {
							Class28_Sub1.method272(class91_sub18, -1905179897);
						}
					}
				}
			}
		} catch (final RuntimeException var7) {
			throw Class102.method1086(var7, "client.ch()");
		}
	}
}
