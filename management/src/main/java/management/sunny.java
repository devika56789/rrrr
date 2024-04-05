package management;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class sunny {

	public static void main(String[] args)
	{
Resource rs=new ClassPathResource("lakshmi1.xml");
BeanFactory bn=new XmlBeanFactory(rs);
simple si=(simple)bn.getBean("simple");
si.disp();

	}

}
