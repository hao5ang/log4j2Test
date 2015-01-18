package log4jTest.pkgtest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PackageTest {
	private static transient Logger logger = LogManager.getLogger();
	
	public static void test(){
		logger.debug("### package debug ###");
	}
}
