package com.sinosofter.transfer.dbconfig;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * Oracle数据源
 * @author xl
 */
@Configuration
@ConditionalOnProperty(value = "spring.datasource.oracle.enabled", havingValue = "true")
@MapperScan(basePackages = "com.sinosofter.transfer.mapper.oracle", sqlSessionFactoryRef = "oracleSqlSessionFactory")
public class OracleDataSourceConfiguration {

	/**
	 * oracle数据源
	 * @return
	 */
	@Bean(name = "oracleDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.oracle")
	public DataSource oracleDataSource() {
		return DataSourceBuilder.create().build();
	}

	/**
	 * 
	 * Oracle 会话工厂
	 * @return
	 * @throws Exception
	 */
	@Bean(name = "oracleSqlSessionFactory")
	public SqlSessionFactory oracleSqlSessionFactory(@Qualifier("oracleDataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapping/oracle/*.xml")); // 配置xml文件位置
		return factoryBean.getObject();
	}

	/**
	 * Oracle事务管理器
	 * @return
	 */
	@Bean(name = "oracleTransactionManager")
	public DataSourceTransactionManager oracleTransactionManager(@Qualifier("oracleDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	/**
	 * Oracle模版处理
	 * @return
	 * @throws Exception
	 */
	@Bean(name = "oracleSqlSessionTemplate")
	public SqlSessionTemplate oracleSqlSessionTemplate(@Qualifier("oracleSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
