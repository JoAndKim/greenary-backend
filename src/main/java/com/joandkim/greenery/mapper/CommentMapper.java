package com.joandkim.greenery.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {
    void save(Long postId);
}
