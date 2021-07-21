package pers.antuo.mapper.mapper1;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import pers.antuo.entity.User;

import java.util.List;

@Service
@Mapper
public interface UserMapper1 {
    @Select("SELECT * FROM t_user")
    List<User> findAll();
}