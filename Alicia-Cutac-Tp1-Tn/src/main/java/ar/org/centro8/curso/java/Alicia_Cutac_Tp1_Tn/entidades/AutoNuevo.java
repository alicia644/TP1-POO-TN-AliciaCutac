package ar.org.centro8.curso.java.Alicia_Cutac_Tp1_Tn.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class AutoNuevo extends Vehiculo {

    public AutoNuevo(String marca, String modelo, String color, Radio radio) {
        super(marca, modelo, color);
        this.radio=radio;

    }

    @Override
    public void informarTipoDeVehiculo() {
        System.out.println("Este es un auto nuevo");
        
    }


}
