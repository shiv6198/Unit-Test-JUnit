package testing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ Counting.class, DivTest.class, SqreTest.class })
public class AllTests {

}
