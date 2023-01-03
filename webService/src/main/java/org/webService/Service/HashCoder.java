package org.webService.Service;

import java.security.MessageDigest;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.log4j.Logger;



@WebService(name = "HashCoder")
public class HashCoder{
	private static final Logger logger = Logger.getLogger(HashCoder.class);
	@WebMethod(action = "urn:getHashCode")
	public String getHashCode(byte[] data) {
        try {
        	String resultHolder = "";
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(data);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < hash.length; i++) {
                sb.append(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));
            }
            resultHolder = sb.toString();
            logger.info(resultHolder);
            return resultHolder;
        } catch (Exception e) {
            return "Error calculating hash code: " + e.getMessage();
        }
    }

}
