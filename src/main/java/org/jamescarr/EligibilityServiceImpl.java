package org.jamescarr;

import java.util.List;

public class EligibilityServiceImpl implements EligibilityService {
	
	public EligibilityServiceImpl() {
		System.out.println("I was constructed");
	}

	@Override
	public void upgradeVins(List<String> vins) {
		System.out.println("I got the vins: " +vins);

	}

}
