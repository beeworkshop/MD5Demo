package com.beeworkshop.md5demo.tools;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class ShiroMD5_1 {
	public ShiroMD5_1() {

	}

	public Object shiroPasswdEncrypt(String passwd, String salt, int hashIterations) {
		ByteSource credentialsSalt = ByteSource.Util.bytes(salt);
		return new SimpleHash("MD5", passwd, credentialsSalt, hashIterations);
	}
}
