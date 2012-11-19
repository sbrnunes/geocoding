package mapflow.sample.app;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-application-context.xml"})
public class GeographicalDataJobTests {
	
	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private Job job;
	
	@Test
	public void testSimpleProperties() throws Exception {
		assertNotNull(jobLauncher);
	}
	
	@Test
	public void testLaunchJob() throws Exception {
		jobLauncher.run(job, new JobParameters());
	}
	
}
