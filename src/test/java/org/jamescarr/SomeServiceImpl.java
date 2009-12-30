package org.jamescarr;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/org/jamescarr/test-context.xml" })
public class SomeServiceImpl {
	@Autowired
	private EligibilityService helloClient;

	@Test
	public void shouldInvokeHelloService() {
			helloClient.upgradeVins(Arrays.asList("ERWG54G24THG2234",
					"23414TWERGQWREG", "ZF34F2E3RF22GFEW"));
	}
}
