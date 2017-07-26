package us.codecraft.tinyioc.beans.xml;

import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import us.codecraft.tinyioc.beans.BeanDefinition;
import us.codecraft.tinyioc.beans.io.ResourceLoader;

/**
 * @author yihua.huang@dianping.com
 */
public class XmlBeanDefinitionReaderTest {

	@Test
	public void test() throws Exception {
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
		xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");
		Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
		for (Entry<String, BeanDefinition> entry : registry.entrySet()) {
			System.out.println("entry:" + entry.getKey() + "," + entry.getValue());
		}
	}
}
