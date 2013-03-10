package interview.renrengames;

import java.util.ArrayList;
import java.util.List;

/**  
 *   
 * 类名称：Other
  
 * 类描述：
  
 * 创建人：chao.fang
  
 * 修改人：chao.fang
  
 * 修改时间：2013-3-9 下午4:51:55
  
 * 修改备注：
  
 * @version 1.0.0
  
 *   
 */
public class Other {
	
	public static void findErrors() {
		List list = new ArrayList();
		char a = '字';
		list.add(String.valueOf(a));
		list.add(new Integer(1));
		list.add(new Double(2.0));
		for (int i = 0; i < list.size(); i++) {
			System.out.println((String)list.get(i));
//			System.out.println(String.valueOf(list.get(i)));
		}
	}
	
	public static void predictResult() {
		String a = "1";
		String b = "b";
		foo(a, b);
		System.out.println(a);
		System.out.println(b);
	}
	
	private static void foo(String a, String b) {
		a.replace("1", "2");
		b = "a";
	}
	
	public static void main(String[] args) {
		System.out.println(Math.round(11.5));
		System.out.println(Math.round(-11.5));
		System.out.println(4 | 3); //按位"或"运算
//		Other.findErrors();
		Other.predictResult();
	}

}
