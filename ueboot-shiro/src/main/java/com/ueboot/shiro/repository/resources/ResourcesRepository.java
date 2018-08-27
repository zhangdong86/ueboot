/*
* Copyright (c)  2018
* All rights reserved.
* 2018-08-22 19:58:32
*/
package com.ueboot.shiro.repository.resources;

import com.ueboot.shiro.entity.Resources;
import com.ueboot.core.repository.BaseRepository;
import org.springframework.stereotype.Repository;

/**
* 这个类里面使用spring data jpa 方式实现数据库的CRUD
* Created on 2018-08-22 19:58:32
* @author yangkui
* @since 2.1.0 by ueboot-generator
*/
@Repository
public interface ResourcesRepository extends BaseRepository<Resources, Long>,ResourcesBaseRepository {
    Resources findById(Long id);
}
