package org.spring.boot.multiple.ds.service.impl;

import org.spring.boot.multiple.ds.TargetDataSource;
import org.spring.boot.multiple.ds.bean.City;
import org.spring.boot.multiple.ds.dao.CityDao;
import org.spring.boot.multiple.ds.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 城市业务逻辑实现类
 *
 * @author donghongchen
 * @create 2017-08-30 16:18
 **/
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityDao cityDao;

    @TargetDataSource("dataSource")
    @Override
    public City findByName(String cityName) {
        return cityDao.findByName(cityName);
    }

    @TargetDataSource("ds3")
    @Override
    public Integer insert(City city) {
        return cityDao.insert(city);
    }

    @TargetDataSource("ds1")
    @Override
    public List<City> findList() {
        return cityDao.findList();
    }
}
