package org.webService;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.webService.Service.HashCoder;

@Configuration
public class MyConfig {
	@Autowired
	private Bus bus;
	
	
	@Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus,new HashCoder());
        endpoint.publish("/hello");
        return endpoint;
    }
}

