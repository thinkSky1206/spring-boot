package com.liuwp.es;

import com.liuwp.model.Blog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Author: liuwuping
 * Date: 17/4/22
 * Description:
 */
public interface BlogRepository extends ElasticsearchRepository<Blog,Long> {
}
