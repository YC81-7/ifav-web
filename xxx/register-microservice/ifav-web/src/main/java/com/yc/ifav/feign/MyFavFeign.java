package com.yc.ifav.feign;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@FeignClient(name="IFAV-PROVIDER-MYFAV",
        configuration = FeignClientConfig.class
)
public interface MyFavFeign {
    @RequestMapping(method = RequestMethod.POST, value = "/myfavs/findById",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String findAll(@RequestParam("muid") int muid);

    @RequestMapping(method = RequestMethod.POST, value = "/myfavs/add",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String create(@RequestParam("muid") int muid,@RequestParam("mfname") String mfname,@RequestParam("mfurl") String mfurl,@RequestParam("mfdesc") String mfdesc);

    @RequestMapping(method = RequestMethod.DELETE, value = "/myfavs/delete")
    String delete(@RequestParam("mid") int mid);
}