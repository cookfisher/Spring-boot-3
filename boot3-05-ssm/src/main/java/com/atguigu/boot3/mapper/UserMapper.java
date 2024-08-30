package com.atguigu.boot3.mapper;

import com.atguigu.boot3.bean.TUser;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    TUser getUserById(@Param("id") Long id);
}
