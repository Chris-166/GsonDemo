package com.mycode.utils;

import com.google.gson.Gson;

public class JsonTools {

	public JsonTools() {
		// TODO Auto-generated constructor stub
	}
	
/*	*//**
	 * ������JSON��ʽ
	 * @param key
	 * @param value
	 * @return Json������ַ�����ʾ
	 *//*
	public static String createJsonString(String key, Object value){
		JSONObject jsonobject = new JSONObject(); 
		jsonobject.put(key, value);
		return jsonobject.toString();
	}*/
	
	/**ʹ��gson�ķ�����Json����ʹ���ַ�����ʾ
	 * Gson����ת��Json�ǲ���Ҫkey��
	 * @param value
	 * @return Json������ַ�����ʾ
	 */
	public static String createJsonString(Object value){
		Gson gson = new Gson(); 
		String gsonString =  gson.toJson(value);
		return gsonString;
	} 
}
