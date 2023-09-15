package puntodos.implementations;

import puntodos.contracts.ICobrable;

public class Libro implements ICobrable {

    @Override
    public double impuesto() {
        return 0.5;
    }

    public void mostrar(){
        System.out.println("mostrando");
    }

}
