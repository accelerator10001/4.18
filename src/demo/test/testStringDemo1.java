package demo.test;
import demo.StringDemo;
import junit.framework.TestCase;
public class testStringDemo1 extends TestCase {
	private StringDemo str;
	protected void setUp(){
		str = new StringDemo();
	}
		public void testSmallString() {
		assertEquals("一个字母变小写",str.smallString("A"),"a");
		}
		public void testSmallString1() {
			assertEquals("一个字母变小写",str.smallString("A"),"b");
		
	}
		public void testSmallString2() {
			assertEquals("一个字母变小写",str.smallString("B"),"b");
		
	}
		public void testSmallString3() {
			assertEquals("一个字母变小写",str.smallString("C"),"b");
		
	}
		public void testSmallString4() {
			assertEquals("一个字母变小写",str.smallString("D"),"d");
		
	}
		public void testSmallString5() {
			assertEquals("一个字母变小写",str.smallString("E"),"b");
		
	}
		public void testSmallString6() {
			assertEquals("一个字母变小写",str.smallString("A"),"e");
		
	}
		public void testSmallString7() {
			assertEquals("一个字母变小写",str.smallString("F"),"f");
		
	}
		public void testSmallString8() {
			assertEquals("一个字母变小写",str.smallString("AA"),"aa");
		
	}
		public void testSmallString9() {
			assertEquals("一个字母变小写",str.smallString(" ")," ");
		
	}
}