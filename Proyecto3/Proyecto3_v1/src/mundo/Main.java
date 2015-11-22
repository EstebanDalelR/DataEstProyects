package mundo;

public class Main{

//Las clases deben ubicarse en el paquete "mundo"

  public static void main(String[] args){

    ParteA parteA = new ParteA();
    ParteB parteB = new ParteB();
    ParteC parteC = new ParteC();

    parteA.calcularRutaPorDistancia();
    parteB.calcularRutaPorTiempo();
    parteC.calcularRutaPorPrecio();
    
    parteA.exportarUltimaRutaCalculada();
    parteB.exportarUltimaRutaCalculada();
    parteC.exportarUltimaRutaCalculada();
    
  }

}

