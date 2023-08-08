package com.example.testProjectNumber3.dao;

import com.example.testProjectNumber3.entity.Airplane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneDao extends CrudRepository<Airplane, Long>
{
    Airplane findByModel(String model);
}
