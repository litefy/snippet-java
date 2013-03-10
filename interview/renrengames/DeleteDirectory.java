package interview.renrengames;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**  
 *   
 * 类名称：deleteDirectory
  
 * 类描述：
  
 * 创建人：chao.fang
  
 * 修改人：chao.fang
  
 * 修改时间：2013-3-9 下午3:52:32
  
 * 修改备注：
  
 * @version 1.0.0
  
 *   
 */
public class DeleteDirectory {
	
	public static void deleteDirectory(String path) {
		File filesDir = new File(path);
		String filesDirPath = filesDir.getAbsolutePath();
		File files[] = filesDir.listFiles();
		for (int i = 0; i < files.length; i++) {
			String filePath = files[i].getAbsolutePath();
			if (files[i].isDirectory()) {
				deleteDirectory(filePath);
			}
			System.out.println(filePath.substring(filesDirPath.length(), filePath.length()));
			if (filePath.endsWith(".txt")) {
				catTxt(files[i]);
			}
			if (files[i].delete()) {
				System.out.println("\tdelete: " + filePath.substring(filesDirPath.length(), filePath.length()));
			}
		}
	}
	
	private static void catTxt(File file) {
		try {
			Reader reader = new InputStreamReader(new FileInputStream(file));
			int tmpChar;
			System.out.print("\t");
			while ((tmpChar = reader.read()) != -1) {
				System.out.print((char)tmpChar);
			}
			reader.close();
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}

	public static void main(String[] args) {
		DeleteDirectory.deleteDirectory("C:/Users/litefy/Downloads/Documents/test");
	}

}
