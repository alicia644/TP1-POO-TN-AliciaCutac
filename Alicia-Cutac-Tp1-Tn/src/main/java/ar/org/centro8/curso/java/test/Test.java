package ar.org.centro8.curso.java.test;

import ar.org.centro8.curso.java.Alicia_Cutac_Tp1_Tn.entidades.AutoClasico;
import ar.org.centro8.curso.java.Alicia_Cutac_Tp1_Tn.entidades.AutoNuevo;
import ar.org.centro8.curso.java.Alicia_Cutac_Tp1_Tn.entidades.Colectivo;
import ar.org.centro8.curso.java.Alicia_Cutac_Tp1_Tn.entidades.Radio;

public class Test {
    public static void main(String[] args) {
        Radio radio1=new Radio("Boss Audio Systems", 60);
        Radio radio2=new Radio("JVC", 50);
        Radio radio3=new Radio("Clarion", 50);
        System.out.println(radio1);
        System.out.println(radio2);
        System.out.println(radio3);
        System.out.println();

        AutoClasico autoClasico1= new AutoClasico("Peugeot", "504","Azul");
        AutoClasico autoClasico2= new AutoClasico("Ford", "F100","Blanco");
        AutoClasico autoClasico3= new AutoClasico("Fiat", "128","Negro");
        System.out.println(autoClasico1);
        System.out.println(autoClasico2);
        System.out.println(autoClasico3);
        System.out.println();

        AutoNuevo autoNuevo1= new AutoNuevo("Kia","k3","Negro",radio3);
        AutoNuevo autoNuevo2= new AutoNuevo("Toyota", "Hilux","Rojo" , radio2);
        AutoNuevo autoNuevo3= new AutoNuevo("Chevrolet", "Onix", "Gris", radio1);
        System.out.println(autoNuevo1);
        System.out.println(autoNuevo2);
        System.out.println(autoNuevo3);
        System.out.println();

        Colectivo colectivo1= new Colectivo("Tatsa","Puma D12","Blanco y azul");
        Colectivo colectivo2= new Colectivo("Agrale","MT17","Rojo y negro");
        Colectivo colectivo3= new Colectivo("Scania","K113","Negro,azul y rojo");
        System.out.println(colectivo1);
        System.out.println(colectivo2);
        System.out.println(colectivo3);
        System.out.println();

        autoClasico1.agregarRadio(radio3);
        System.out.println(autoClasico1);
        System.out.println(radio3);

        autoClasico1.setPrecio(50000);
        System.out.println(autoClasico1);
        
    

     
        
       
            
        




    }
}
