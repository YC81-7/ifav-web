package com.yc.ifav.controller;

import com.yc.ifav.feign.MyFavFeign;
import com.yc.ifav.feign.UserFeign;
import feign.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/myfav")
public class MyFavController {

    @Autowired
    private MyFavFeign myFavFeign;


    /**
     * 查询某用户的所有收藏
     * @param muid
     * @return
     */
    @Async
    @RequestMapping(method = RequestMethod.POST, value = "/findById")
    public CompletableFuture<String> findAll(@Param("muid") int muid){
        return CompletableFuture.supplyAsync(() -> {
            return myFavFeign.findAll(muid);
        });
    }


    /**
     * 添加收藏
     * @param muid
     * @param mfname
     * @param mfurl
     * @param mfdesc
     * @return
     */
    @Async
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public CompletableFuture<String> create(@RequestParam("muid") int muid,@Param("mfname") String mfname,@Param("mfurl") String mfurl,@Param("mfdesc") String mfdesc){
        return CompletableFuture.supplyAsync(() -> {
            return myFavFeign.create(muid,mfname,mfurl,mfdesc);
        });

    }


    /**
     * 删除收藏
     * @param mid
     * @return
     */
    @Async
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete")
    public CompletableFuture<String> delete(@RequestParam("mid") Integer mid){
        return CompletableFuture.supplyAsync(() -> {
            return myFavFeign.delete(mid);
        });

    }



}