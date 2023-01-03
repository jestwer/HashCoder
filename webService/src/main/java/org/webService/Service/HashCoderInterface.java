package org.webService.Service;

import javax.jws.WebService;

@WebService(portName="portHashCoder",serviceName="hashCoder",endpointInterface = "org.webService.HashCoder")
public interface HashCoderInterface {
	String getHashCode(byte[] data);
}
