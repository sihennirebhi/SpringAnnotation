package com.sihenni.spring.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Arm64 implements MobileCPU {

	@Override
	public void process() {
		System.out.println("Powerfull CPU");

	}

}
