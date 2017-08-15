package com.ztw.hxzq.common.datasource;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@MapperScan(basePackages = FinchinaDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "finchinaSqlSessionFactory")
public class FinchinaDataSourceConfig {

	static final String PACKAGE = "com.ztw.hxzq.mapper.finchina";

	static final String MAPPER_LOCATION = "classpath:com/ztw/hxzq/mapper/finchina/*.xml";

	@Value("${jdbc.finchina.url}")
	private String url;

	@Value("${jdbc.finchina.username}")
	private String user;

	@Value("${jdbc.finchina.password}")
	private String password;

	@Value("${jdbc.finchina.driver}")
	private String driverClass;

	@Bean(name = "finchinaDataSource")
	@Primary
	public DataSource finchinaDataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(driverClass);
		dataSource.setUrl(url);
		dataSource.setUsername(user);
		dataSource.setPassword(password);
		return dataSource;
	}

	@Bean(name = "finchinaTransactionManager")
	@Primary
	public DataSourceTransactionManager finchinaTransactionManager() {
		return new DataSourceTransactionManager(finchinaDataSource());
	}

	@Bean(name = "finchinaSqlSessionFactory")
	@Primary
	public SqlSessionFactory finchinaSqlSessionFactory(@Qualifier("finchinaDataSource") DataSource finchinaDataSource)
			throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(finchinaDataSource);
		sessionFactory.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources(FinchinaDataSourceConfig.MAPPER_LOCATION));
		return sessionFactory.getObject();
	}

}
