
package figuras;


public class Trapecio {
    
    public static double calcularArea(double altura, double basemenor, double basemayor){
        return ((basemenor+basemayor)/2) * altura;
    }
  
    public static double calcularPerimetro(double altura, double basemenor, double basemayor){
        double ladosobrante, HipotenusaTrap;
        ladosobrante = (basemayor-basemenor)/2;
        HipotenusaTrap = Math.sqrt(Math.pow(altura, 2)+Math.pow(ladosobrante,2));
        return HipotenusaTrap*2+basemenor+basemayor;
    }

}
