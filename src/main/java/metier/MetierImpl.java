package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("metier")
public class MetierImpl implements IMetier {
    //couplage faible


    private IDao dao ;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp = dao.getData() ;
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }

    // Injecter dans la variable dao un objet d une classe qui implemnter l'interface Idao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
