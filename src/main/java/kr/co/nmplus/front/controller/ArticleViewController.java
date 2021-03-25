package kr.co.nmplus.front.controller;

import kr.co.nmplus.front.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ArticleViewController {

    private final static String page = "index";

    @Autowired
    private ArticleService aSvc;

    @RequestMapping("/")
    public String list(Model model) {
        model.addAttribute("list", aSvc.getArticleList(""));
        return page;
    }
}
