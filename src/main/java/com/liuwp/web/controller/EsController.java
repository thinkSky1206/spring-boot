package com.liuwp.web.controller;

import com.liuwp.es.BlogRepository;
import com.liuwp.model.Blog;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author: liuwuping
 * Date: 17/4/22
 * Description:
 */
@RestController
@RequestMapping("/es")
public class EsController {


    @Autowired
    private BlogRepository blogRepository;


    @RequestMapping(value = "/init")
    public String init() {
        for (int i = 0; i < 20; i++) {
            Blog blog = new Blog();
            blog.setId(Long.valueOf(i));
            if (i < 10) {
                blog.setAuthor("liu");
            } else {
                blog.setAuthor("wu");
            }
            blog.setTitle("t" + i);
            if (i < 10) {
                blog.setContent("ggppkkkkk" + i);
            } else {
                blog.setContent(i + "aabbcc" + i);
            }
            blogRepository.save(blog);
        }
        return "init";
    }

    @RequestMapping(value = "/s/{keyword}")
    public List<Blog> search(@PathVariable String keyword){
        List<Blog> list=new ArrayList<>();
        QueryStringQueryBuilder builder=new QueryStringQueryBuilder(keyword);
        Iterable<Blog> searchResult =   blogRepository.search(builder);
        Iterator<Blog> iterator = searchResult.iterator();
        while(iterator.hasNext()){
                list.add(iterator.next());
        }
        return  list;

    }

}
