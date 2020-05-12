package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DiscussPostMapper {

    /**
     *
     * @param userId
     * @param offset 起始行的行号
     * @param limit  每页显示数据的个数
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //@Param("别名")
    //如果只有一个参数，并且在<if>里使用，必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);

    int insertDiscussPost(DiscussPost discussPost);

}
