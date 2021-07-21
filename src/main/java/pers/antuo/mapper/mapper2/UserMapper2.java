package pers.antuo.mapper.mapper2;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import pers.antuo.entity.User;

import java.util.List;

@Service
@Mapper
public interface UserMapper2 {
    @Select("SELECT * FROM t_user")
    List<User> findAll();
}
