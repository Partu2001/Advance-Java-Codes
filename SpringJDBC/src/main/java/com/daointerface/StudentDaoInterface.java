package com.daointerface;

import java.util.List;

import org.springframework.stereotype.Component;

import com.entity.Students;

@Component
public interface StudentDaoInterface {
	
	public void save(Students s);
	public void update(Students s);
	public void delete(int id);
	public Students getById(int id);
	public List<Students> getAll();

}
