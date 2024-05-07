package org.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import pojo.Products;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        Products prod = (Products) factory.getBean("prods");
        prod.getData();
    }
}
