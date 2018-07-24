package com.zhuchuanxiao.makefine.IDao;

import org.springframework.stereotype.Repository;

import com.zhuchuanxiao.makefine.entity.Designer;

@Repository
public interface DesignerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Designer record);

    int insertSelective(Designer record);

    Designer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Designer record);

    int updateByPrimaryKey(Designer record);
}