package com.marketappws.service.impl;

import java.util.Calendar;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.marketappws.service.PingService;

@Service("pingServiceImpl")
@WebService(endpointInterface="com.receitasappserver.service.PingService")
public class PingServiceImpl implements PingService
{
	@SuppressWarnings("unused")
	@PostConstruct
    private void init() {
        System.out.println("PostConstruct pingService injected ==> Initialized");
    }
	
	@Override
	@WebMethod(operationName="ping")
	public String ping()
	{
		return "Services alive " + Calendar.getInstance().getTime();
	}

}
