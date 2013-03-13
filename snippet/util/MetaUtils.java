package snippet.util;

/**  
 *   
 * 类名称：MetaUtils
  
 * 类描述：
  
 * 创建人：chao.fang
  
 * 修改人：chao.fang
  
 * 修改时间：2013-3-13 下午4:59:31
  
 * 修改备注：
  
 * @version 1.0.0
  
 *   
 */
public class MetaUtils {
	
	public static int getLineNumber() {
		return Thread.currentThread().getStackTrace()[2].getLineNumber();
	}
	
	public static String getMethodName() {
//		System.out.println(new Gson().toJson(Thread.currentThread().getStackTrace()));
		return Thread.currentThread().getStackTrace()[2].getMethodName();
	}
	
	public static String getClassName() {
		return Thread.currentThread().getStackTrace()[2].getClassName();
	}
	
	public static String getFileName() {
		return Thread.currentThread().getStackTrace()[2].getFileName();
	}
	
}
