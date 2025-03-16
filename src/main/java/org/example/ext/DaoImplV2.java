package org.example.ext;

import org.example.dao.IDao;
import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData(){
        double temp = 50.25;
        return temp;
    }
}
