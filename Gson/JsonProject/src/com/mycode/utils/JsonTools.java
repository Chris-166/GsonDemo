package com.mycode.utils;

import com.google.gson.Gson;

public class JsonTools {

	public JsonTools() {
		// TODO Auto-generated constructor stub
	}
	
/*	*//**
	 * 单纯的JSON方式
	 * @param key
	 * @param value
	 * @return Json对象的字符串表示
	 *//*
	public static String createJsonString(String key, Object value){
		JSONObject jsonobject = new JSONObject(); 
		jsonobject.put(key, value);
		return jsonobject.toString();
	}*/
	
	/**使用gson的方法将Json对象使用字符串表示
	 * Gson工具转换Json是不需要key的
	 * @param value
	 * @return Json对象的字符串表示
	 */
	public static String createJsonString(Object value){
		Gson gson = new Gson(); 
		String gsonString =  gson.toJson(value);
		return gsonString;
	} 
}
