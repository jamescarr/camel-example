package org.jamescarr;

import java.util.List;

import javax.jws.Oneway;
import javax.jws.WebService;

@WebService
public interface EligibilityService {
	@Oneway
	void upgradeVins(List<String> vins);
}
