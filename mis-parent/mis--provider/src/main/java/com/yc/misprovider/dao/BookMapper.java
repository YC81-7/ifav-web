package com.yc.misprovider.dao;

import com.yc.misprovider.bean.Book;
import org.apache.ibatis.annotations.Mapper;


@Mapper//自动创建实现类
public interface BookMapper extends MisBaseMapper<Book>{
}