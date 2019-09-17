package io.spring.cloud.dataflow.ingest.config;

import javax.sql.DataSource;
import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudFactory;
import org.springframework.context.annotation.Bean;

public class DataSourceConfig {
  @Bean
  public DataSource dataSource() {
    CloudFactory cloudFactory = new CloudFactory();
    Cloud cloud = cloudFactory.getCloud();
    return cloud.getSingletonServiceConnector(DataSource.class, null);
  }

}
