package com.yc.springcloud812.domain;

import lombok.Data;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.math.BigDecimal;
import java.util.Date;

@Data      //  lombok 注解，节省getter, setter
public class Book {

    private Integer bookId;   //注意: 对应的数据表中的字段名叫 book_id
    private String bookName;
    private String bookAuthor;
    private BigDecimal bookPrice;
    private Date bookDate;
    private Integer userId;

  

}



