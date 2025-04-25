package ar.org.centro8.curso.java.Alicia_Cutac_Tp1_Tn.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Radio {
    private String marca;
    private  int potencia;

    
    private boolean radioConectada;

    public Radio(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
        this.radioConectada=false;
    }
    
    public void conectarRadio(){
        this.radioConectada=true;
    }

}
