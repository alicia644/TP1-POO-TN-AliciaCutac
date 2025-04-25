package ar.org.centro8.curso.java.Alicia_Cutac_Tp1_Tn.entidades;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter 
@Setter
@ToString
@AllArgsConstructor

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private double precio;

    @Setter(AccessLevel.NONE)//El AccessLevel impide que el setter actúe sobre radio.
    protected Radio radio; //Protected porque asi puedo crear el constructor de autoNuevo con radio.
    
    //Los atributos de las clases son privados y se accede a ellos por medio de @Getter y @Setter(se generan con lombok).

    /**
     *Con source action agregué constructor con marca,color y modelo que son obligatorios.
     * @param marca
     * @param modelo
     * @param color
     */
    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;

    }

    //Método abstracto porque en las clases heredadas se sobreescribirá la función.
    public abstract void informarTipoDeVehiculo();

    /**
     * Este método valida que la radio que quiere implementar
     * en el vehículo esté disponible.Si no, la desconecta.
     * Verifica que el vehículo no posea radio y si tiene, la desconecta.
     * Conecta la radio nueva.
     * @param radioNueva  Este parámetro es la radio que vamos a implementar.
     */
    public void agregarRadio(Radio radioNueva){ 
        if (radioNueva.isRadioConectada()==true) { 
            System.out.println("Radio en uso");
            System.out.println("Desconectando radio " + radioNueva);
            radioNueva.setRadioConectada(false);
            System.out.println("Radio disponible para su uso");
        }    
        if (this.radio!= null) {
            System.out.println("Se detectó una radio en éste vehículo");
            this.radio= null;
            System.out.println("Radio desconectada del vehículo");
        }else{
            radioNueva.conectarRadio();
            this.radio= radioNueva;
            System.out.println("Radio " + radioNueva + " conectada con éxito");
        }



    }
    
}
