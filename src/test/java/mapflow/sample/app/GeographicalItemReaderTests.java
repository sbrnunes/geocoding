package mapflow.sample.app; 

import junit.framework.TestCase;
import mapflow.sample.app.batch.model.GeographicalData;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-application-context.xml"})
public class GeographicalItemReaderTests extends TestCase {

	@Autowired
	private FlatFileItemReader<GeographicalData> reader;
	
	@Test
	public void testRead() throws Exception {
		reader.open(new ExecutionContext());
		GeographicalData data = reader.read();
		assertNotNull(data);
		assertNotNull(data.getPolicyNumber());
	}
}
