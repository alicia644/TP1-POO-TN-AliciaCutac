package ar.org.centro8.curso.java.Alicia_Cutac_Tp1_Tn.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class AutoClasico extends Vehiculo {
    
    public AutoClasico(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    @Override
    public void informarTipoDeVehiculo() {
       System.out.println("Este es un auto clásico");
    
       
    }


}
