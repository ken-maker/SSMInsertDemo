package com.service.impl;

import com.dao.DeptDao;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public void insert(String name) {
        deptDao.insert(name);
    }
}
