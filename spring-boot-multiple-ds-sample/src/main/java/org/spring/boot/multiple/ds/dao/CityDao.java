package org.spring.boot.multiple.ds.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.boot.multiple.ds.bean.City;

import java.util.List;

/**
 * @author donghongchen
 * @create 2017-08-30 16:15
 **/
public interface CityDao {
    /**
     * 根据城市名称，查询城市信息
     * @param cityName 城市名称
     * @return
     */
    City findByName(@Param("cityName") String cityName);


    Integer insert(City city);

    List<City> findList();

}
