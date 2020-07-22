package com.movie.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
public class OracleDBConfiguration {

	/* Movie Database Configuration */
	/*@Bean(name = "orclDSMovie")
	@ConfigurationProperties(prefix = "movie.orcl.datasource")
	public DataSource movieDataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		return dataSourceBuilder.build();
	}

	*//* Transaction management for Movie database *//*
	@Bean(name = "transactionManager")
	public PlatformTransactionManager txManager() {
		return new DataSourceTransactionManager(movieDataSource());
	}*/

}