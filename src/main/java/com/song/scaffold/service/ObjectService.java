package com.song.scaffold.service;

import com.song.scaffold.mapper.ObjectMapper;
import com.song.scaffold.pojo.ObjectScaffold;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "test")
public class ObjectService {
    @Autowired
    private ObjectMapper objectMapper;

    /**
     * @CacheEvict(value = "user", key = "#id"),这表示擦除缓存
     * @param id
     * @return
     */
    @Cacheable(value  = "sss" ,key = "#id")
    public ObjectScaffold queryById(Long id){

        return objectMapper.selectByPrimaryKey(id);
    }
}
