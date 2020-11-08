package com.interview.spring;

/*
 Spring singleton beans are not thread safe.
 ---------------------------
 Spring Connection Pooling
 * -------------------------
 * Spring Boot uses HikariCP as the default connection pool, due to its remarkable performance and enterprise-ready 
 * features.
 * Hikari is a JDBC DataSource implementation that provides a connection pooling mechanism.
 * 
 * Here's how Spring Boot automatically configures a connection pool datasource:
 * 
 * 1. Spring Boot will look for HikariCP on the classpath and use it by default when present.
 * 2. If HikariCP is not found on the classpath, then Spring Boot will pick up the Tomcat JDBC Connection Pool, 
 * if it's available
 * 3. If neither of these options is available, Spring Boot will choose Apache Commons DBCP2, if that is available
 * 
 * To configure a Tomcat JDBC connection pool instead of the default HikariCP, we'll exclude HikariCP from 
 * the spring-boot-starter-data-jpa dependency and add the tomcat-jdbc Maven dependency to our pom.xml:
 * <dependency>
	    <groupId>org.springframework.boot</groupId>
	    <artifactId>spring-boot-starter-data-jpa</artifactId>
	    <exclusions>
	        <exclusion>
	            <groupId>com.zaxxer</groupId>
	            <artifactId>HikariCP</artifactId>
	        </exclusion>
	    </exclusions>
	</dependency>
	
 * ---------------------------------
 * BeanFactory VS ApplicationContext
 * ---------------------------------
 * 	BeanFactory
 *  Doesn't support annotation based dependency
 *  Doesn't allow multiple configuration file
 *  BeanFactory f = new XmlBeanFactory(new ClassPathResource("bean.xml"));
 *  
 *  ApplicationContext
 *  Support annotation based dependency
 *	Allow multiple configuration file
 *	ApplicationContext c = new ClassPathXmlApplicationContext({"a.xml","b.xml"});
 *
 * -------------------
 * @Bean VS @Component:
 * -------------------
 * @Bean
 * 1. Method level annotation
 * 2. Used for adding third-party classes to the context. i.e. Swagger's Docket class 
 * 3. Used inside @Configuraton annotation
 * 4. Let's imagine that you want to wire components from 3rd-party libraries (you don't have the source code so 
 * you can't annotate its classes with @Component), so automatic configuration is not possible. 
 * 
 * 
 * @Component:
 * Class level annotation
 * Used for adding classes inside your single application.
 * @Configuraton annotation don't requires
 *
 * --------------------------------------------------
 * Difference between @Component @Service @Repository
 * --------------------------------------------------
/*
 * @Component public @interface Service { }
 * 
 * Its's not wrong to say that @Controller, @Service and @Repository are special
 * types of @Component annotation. <context:component-scan> picks them up and
 * registers their following classes as beans, because these are annotated
 * with @Component.
 * 
 * @Component @Service @Repository are also scanned, because they themselves are
 * annotated with @Component annotation, which means they are also @Components.
 * If we define our own custom annotation and annotate it with @Component, it
 * will also get scanned with <context:component-scan> 
 */
public class MySpring {

}
