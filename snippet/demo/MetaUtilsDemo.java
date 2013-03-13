package snippet.demo;

import snippet.util.MetaUtils;

import com.google.gson.Gson;

/**
 * 
 * 类名称：MetaInfo
 * 
 * 类描述：
 * 
 * 创建人：chao.fang
 * 
 * 修改人：chao.fang
 * 
 * 修改时间：2013-3-13 下午4:49:36
 * 
 * 修改备注：
 * 
 * @version 1.0.0
 * 
 * 
 */
public class MetaUtilsDemo {

	public void getMetaInfo() {
		System.out.println(MetaUtils.getClassName() + " ("
				+ MetaUtils.getMethodName() + ":" + MetaUtils.getLineNumber()
				+ ")");
		//snippet.demo.MetaUtilsDemo (getMetaInfo:29)
	}

	public static void main(String[] args) {
		new MetaUtilsDemo().getMetaInfo();
	}

}
