/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Lenovo
 */
public class calculo {
    public static double calculo_de_pago(double patrimonio, double estrato){
        if ((patrimonio>2000000 && estrato>3)){
            return 0.03*patrimonio +50000;
        }
        else{
            return 50000;
        }}}      
    