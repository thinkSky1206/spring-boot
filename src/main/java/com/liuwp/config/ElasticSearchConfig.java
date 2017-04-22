package com.liuwp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * Author: liuwuping
 * Date: 17/4/22
 * Description:
 */
@Configuration
@EnableElasticsearchRepositories(basePackages = "com.liuwp.es")
public class ElasticSearchConfig {
}
