package com.atguigu.gmall.gmalluser.mapper;

import com.atguigu.gmall.gmalluser.bean.UmsMember;


import java.util.List;
/*import tk.mybatis.mapper.common.Mapper;*/


public interface UserMapper  {

    List<UmsMember> selectAllUser();
}
