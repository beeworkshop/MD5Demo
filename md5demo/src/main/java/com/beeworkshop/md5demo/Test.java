package com.beeworkshop.md5demo;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import org.springframework.util.DigestUtils;

import com.beeworkshop.md5demo.tools.ShiroMD5_1;
import com.beeworkshop.md5demo.tools.StringMD5Encrypt;

public class Test {

	public static void main(String[] args) {
		// Test1
		try {
			// 固定24个字符输出
			System.out.println(StringMD5Encrypt.encodeByMd5("1234567890"));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// Test2
		ShiroMD5_1 shiromd5 = new ShiroMD5_1();
		System.out.println(shiromd5.shiroPasswdEncrypt("1234567890", "balabala", 1024));

		// Test3
		System.out.println(DigestUtils.md5DigestAsHex("1234567890".getBytes()));
	}

}
