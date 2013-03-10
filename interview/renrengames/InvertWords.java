package interview.renrengames;

/**  
 *   
 * 类名称：InvertWords
  
 * 类描述：
  
 * 创建人：chao.fang
  
 * 修改人：chao.fang
  
 * 修改时间：2013-3-9 下午4:43:36
  
 * 修改备注：
  
 * @version 1.0.0
  
 *   
 */
public class InvertWords {
	
	public static String invertWords(String statment, String separator) {
		String[] words = statment.split(separator);
		StringBuffer res = new StringBuffer();
		for (int i = words.length - 1; i > 0; i--) {
			res = res.append(words[i]).append(separator);
		}
		return res.append(words[0]).toString();
	}

	public static void main(String[] args) {
		System.out.println(InvertWords.invertWords("Less is More", " "));
	}

}
