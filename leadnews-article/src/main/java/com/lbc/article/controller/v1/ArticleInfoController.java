package com.lbc.article.controller.v1;

import com.lbc.apis.article.ArticleInfoControllerApi;
import com.lbc.article.service.ArticleInfoService;
import com.lbc.model.article.dtos.ArticleInfoDto;
import com.lbc.model.common.dtos.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/article")
public class ArticleInfoController implements ArticleInfoControllerApi {

    @Autowired
    ArticleInfoService articleInfoService;

    @PostMapping("/load_article_info")
    @Override
    public ResponseResult loadArticleInfo(@RequestBody ArticleInfoDto dto) {
        return articleInfoService.loadArticleInfo(dto);
    }
    

    @PostMapping("/load_article_behavior")
    @Override
    public ResponseResult loadArticleBehavior(@RequestBody ArticleInfoDto dto) {
        return articleInfoService.loadArticleBehavior(dto);
    }
}