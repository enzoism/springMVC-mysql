package com.enzo.service.impl;

import com.enzo.dao.PersonMapperDao;
import com.enzo.entity.Person;
import com.enzo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonServiceImpl implements PersonService {
    @Resource
    private PersonMapperDao personMapperDao;
    public Person findPersonById(long id) {
        Person person = null;
        try{
            person = personMapperDao.findPersonById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return person;
    }
}