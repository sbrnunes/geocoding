package mapflow.sample.app;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ 
	GeographicalItemReaderTests.class, 
	GeographicalItemWriterTests.class,
	GeographicalDataQueryingTest.class,
	TotalInsuredByPolicyNumberItemReaderTests.class,
	TotalSumInsuranceCalculationTest.class
})
public class GeographicalSampleAppTestSuite implements TestSuite {}
