package kr.co.nmplus.front.controller;

import kr.co.nmplus.front.service.ArticleService;
import kr.co.nmplus.front.vo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/search")
public class ArticleMasterController {

    @Autowired
    private ArticleService aSvc;

    @GetMapping("articleList")
    public List<Article> getArticleList(@RequestParam(name="t") String title) {
        return  aSvc.getArticleList(title);
    }
}
