package com.example.demo.service;

import java.io.Serializable;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BaseDao;
import com.example.demo.domain.BaseEntity;

@Service
public class BaseService {
	
	@Autowired
	private BaseDao baseDao;
	
	public BaseEntity findById(Long id) {
		Optional<BaseEntity> o = baseDao.findById(id);
		return o.get();
	}
}
