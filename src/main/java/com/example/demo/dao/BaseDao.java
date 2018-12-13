package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.BaseEntity;

@Repository
public interface BaseDao extends CrudRepository<BaseEntity,Long>{
	
	

}
