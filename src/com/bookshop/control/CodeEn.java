package com.bookshop.control;

import java.security.MessageDigest;
import java.util.Base64;

public class CodeEn {

	public static String encode(String code) {
		MessageDigest md5;
		byte[] digest = null;
		try {
			md5 = MessageDigest.getInstance("md5");
			digest = md5.digest(code.getBytes("utf-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Base64.getEncoder().encodeToString(digest);
	}
}
