package mapflow.sample.app;

import java.util.ArrayList;
import java.util.List;

import mapflow.sample.app.batch.model.GeographicalData;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.item.database.JpaItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-application-context.xml"})
@Transactional(rollbackFor=Exception.class)
public class GeographicalItemWriterTests  {

	@Autowired
	private JpaItemWriter<GeographicalData> writer;
	
	private List<GeographicalData> data;
	
	@Before
	public void init() {
		data = new ArrayList<GeographicalData>();
		
		GeographicalData item = new GeographicalData();
		item.setPolicyNumber(123456789L);
		
		data.add( item );
	}
	
	@Test
	public void testWrite() throws Exception {
		writer.write(data);
	}

}
