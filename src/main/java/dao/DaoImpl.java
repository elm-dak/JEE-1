package dao;

import org.springframework.stereotype.Component;



@Component("dao")

public class DaoImpl implements IDao{

    @Override
    public double getData() {
        //conncter la BD pour recuperer
        System.out.println("version DB");
        double temp= Math.random()*40;
        return temp;
    }
}
