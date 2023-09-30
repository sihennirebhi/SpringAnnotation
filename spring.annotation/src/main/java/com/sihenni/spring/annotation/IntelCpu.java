package com.sihenni.spring.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class IntelCpu implements MobileCPU {

	@Override
	public void process() {
		System.out.println("2nd Powerfull CPU");

	}

}
