package org.spring.boot.multiple.ds.controller;

import org.spring.boot.multiple.ds.bean.City;
import org.spring.boot.multiple.ds.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author donghongchen
 * @create 2017-08-30 16:20
 **/
@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city",method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName",required = true) String cityName){
        return cityService.findByName(cityName);
    }

    @RequestMapping(value = "/api/add",method = RequestMethod.GET)
    public String addCity(){
        City city = new City();
        city.setCityName("测试城市");
        city.setDescription("测试城市描述");
        city.setProvinceId(2);
        return "success"+":"+cityService.insert(city);
    }

    @RequestMapping(value = "/api/list",method = RequestMethod.GET)
    public List<City> findList(){
        return cityService.findList();
    }

}
