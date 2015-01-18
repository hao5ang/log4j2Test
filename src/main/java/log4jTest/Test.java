package log4jTest;

import log4jTest.pkgtest.PackageTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
	static transient Logger logger = LogManager.getLogger();

	public static void main(String[] args) throws Exception {
		for (;;) {
			logger.debug("!!! debug !!!");
			logger.info("info");
			logger.error("error");
			PackageTest.test();
			Thread.sleep(1000);
		}
	}
}
