package com.foxinmy.weixin4j.util;

import java.io.Serializable;

/**
 * aes & token
 * 
 * @className AesToken
 * @author jy
 * @date 2015年5月6日
 * @since JDK 1.7
 * @see
 */
public class AesToken implements Serializable, Cloneable {

	private static final long serialVersionUID = -6001008896414323534L;

	/**
	 * 账号ID(原始ID或者appid)
	 */
	private String weixinId;
	/**
	 * 开发者的token
	 */
	private String token;
	/**
	 * 安全模式下的加密密钥
	 */
	private String aesKey;

	/**
	 * 一般为明文模式
	 * 
	 * @param openid
	 *            微信号(原始ID)
	 * @param token
	 *            开发者的Token
	 */
	public AesToken(String openid, String token) {
		this(openid, token, null);
	}

	/**
	 * 一般为AES加密模式
	 * 
	 * @param appid
	 *            应用ID
	 * @param token
	 *            开发者Token
	 * @param aesKey
	 *            解密的EncodingAESKey
	 */
	public AesToken(String appid, String token, String aesKey) {
		this.weixinId = appid;
		this.token = token;
		this.aesKey = aesKey;
	}

	public String getWeixinId() {
		return weixinId;
	}

	public String getToken() {
		return token;
	}

	public String getAesKey() {
		return aesKey;
	}
}
