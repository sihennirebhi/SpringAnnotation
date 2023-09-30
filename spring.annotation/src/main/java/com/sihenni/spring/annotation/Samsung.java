package com.sihenni.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

	@Autowired
	@Qualifier("arm64") // instead of using @Primary 
						//qualifier in Arm64 or IntelCpu classes. 
	private MobileCPU cpu;
	
		public MobileCPU getCpu() {
		return cpu;
	}

	public void setCpu(MobileCPU cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("ARM64, 8 gb, 18MP");
		cpu.process();
	}
}
