package MeitySelenium;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import dev.failsafe.internal.util.Assert;

public class main {
@Test(priority = -1)
public void a() {
	String test="a";
	System.out.println(test);	
	assertEquals(false, true);
}
@Test(priority = 0)
public void b() {
	String test="b";
	System.out.println(test);	
}
@Test(priority = -1,dependsOnMethods = "a")
public void c() {	
	String test="c";
	System.out.println(test);	
}
@Test(priority = 1)
public void d() {
	String test="d";
	System.out.println(test);	
}

}
