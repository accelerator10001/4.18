package demo.test;
import demo.StringDemo;
import junit.framework.TestCase;
public class testStringDemo1 extends TestCase {
	private StringDemo str;
	protected void setUp(){
		str = new StringDemo();
	}
		public void testSmallString() {
		assertEquals("һ����ĸ��Сд",str.smallString("A"),"a");
		}
		public void testSmallString1() {
			assertEquals("һ����ĸ��Сд",str.smallString("A"),"b");
		
	}
		public void testSmallString2() {
			assertEquals("һ����ĸ��Сд",str.smallString("B"),"b");
		
	}
		public void testSmallString3() {
			assertEquals("һ����ĸ��Сд",str.smallString("C"),"b");
		
	}
		public void testSmallString4() {
			assertEquals("һ����ĸ��Сд",str.smallString("D"),"d");
		
	}
		public void testSmallString5() {
			assertEquals("һ����ĸ��Сд",str.smallString("E"),"b");
		
	}
		public void testSmallString6() {
			assertEquals("һ����ĸ��Сд",str.smallString("A"),"e");
		
	}
		public void testSmallString7() {
			assertEquals("һ����ĸ��Сд",str.smallString("F"),"f");
		
	}
		public void testSmallString8() {
			assertEquals("һ����ĸ��Сд",str.smallString("AA"),"aa");
		
	}
		public void testSmallString9() {
			assertEquals("һ����ĸ��Сд",str.smallString(" ")," ");
		
	}
}