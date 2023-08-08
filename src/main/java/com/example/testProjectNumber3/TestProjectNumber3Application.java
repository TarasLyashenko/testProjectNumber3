package com.example.testProjectNumber3;

import com.example.testProjectNumber3.dao.AirplaneDao;
import com.example.testProjectNumber3.entity.Airplane;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProjectNumber3Application implements CommandLineRunner
{
    @Resource
    private AirplaneDao airplaneDao;

    public static void main(String[] args)
    {
        SpringApplication.run(TestProjectNumber3Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception
    {
        Airplane airplane = new Airplane();
        airplane.setModel("Boing");
        airplane.setNumber(231);
        airplaneDao.save(airplane);

        Airplane airplane1 = new Airplane();
        airplane.setModel("Swing");
        airplane.setNumber(192);
        airplaneDao.save(airplane1);
    }
}
