package org.spring.boot.multiple.ds.service;


import org.spring.boot.multiple.ds.bean.City;

import java.util.List;

/**
 * @author donghongchen
 * @create 2017-08-30 16:17
 **/
public interface CityService {

    City findByName(String cityName);

    Integer insert(City city);

    List<City> findList();

}
