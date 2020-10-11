package com.yc.misprovider.service;


import com.yc.misprovider.bean.Book;
import com.yc.misprovider.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService{

    @Autowired(required = false)
    private BookMapper bookMapper;

    @Override
    public Book getBook(Integer id) {
        //selectByPrimaryKey根据主键id查
        return bookMapper.selectByPrimaryKey(id);
    }


}
