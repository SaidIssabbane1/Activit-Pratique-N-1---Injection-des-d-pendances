package org.example.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        double temp = 23.90;
        return  temp;
    }
}
