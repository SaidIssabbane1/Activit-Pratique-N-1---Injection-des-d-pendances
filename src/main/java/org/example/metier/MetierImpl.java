package org.example.metier;

import org.example.dao.IDao;

public class MetierImpl implements IMetier {
    // instanciation statique
    private IDao idao;

    public MetierImpl(IDao idao) {
        this.idao = idao;
    }

    public MetierImpl(){

    }

    @Override
    public double calcul() {
        return idao.getData();
    }
}
