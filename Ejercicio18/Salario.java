
package ejercicio18;

public class Salario {
    
    public static double método_salario_bruto(double hora, double valorhora){
        double salariob;
        salariob = hora*valorhora;
        return salariob;}
    
    
    public static double método_retención_fuente(double hora, double valorhora, double porcentajere){
        double dinero_retenido;
        dinero_retenido = ((hora*valorhora)*porcentajere)/100;
        return dinero_retenido;}
    
    
    public static double método_salario_neto(double hora, double valorhora, double porcentajere){
        double salarion;
        salarion = (hora*valorhora)-(hora*valorhora)*(porcentajere/100);
        return salarion;
    }
}
