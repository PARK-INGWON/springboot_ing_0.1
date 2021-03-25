package kr.co.nmplus.front.service;

import kr.co.nmplus.front.vo.Article;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ArticleService {
    public List<Article> getArticleList(String title) {

        System.out.println("타이틀 넘어온다::::"+title);

        return Arrays.asList(
                Article.builder().title("헬로우 스프링부트1").bodyData("환영한다.  스프링 부트는 처음이지?").createData("20210101").createUserId("ing").number(1).build(),
                Article.builder().title("헬로우 스프링부트2").bodyData("환영한다. 스프링 부트는 처음이지?").createData("20210102").createUserId("ing").number(2).build(),
                Article.builder().title("헬로우 스프링부트3").bodyData("환영한다.  스프링 부트는 처음이지?").createData("20210201").createUserId("ing").number(3).build()
        );
    }
}
