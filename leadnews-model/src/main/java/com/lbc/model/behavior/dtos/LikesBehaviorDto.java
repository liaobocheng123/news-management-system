package com.lbc.model.behavior.dtos;

import com.lbc.model.common.annotation.IdEncrypt;
import lombok.Data;

@Data
public class LikesBehaviorDto {
    // 设备ID
    @IdEncrypt
    Integer equipmentId;
    // 文章、动态、评论等ID
    @IdEncrypt
    Long articleId;
    /**
     * 喜欢内容类型
     * 0 文章
     * 1 动态
     * 2 评论
     */
    Short type;

    /**
     * 喜欢操作方式
     * 0 点赞
     * 1 取消点赞
     */
    Short operation;
}