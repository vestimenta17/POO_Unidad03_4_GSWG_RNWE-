/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Matricula {
    int numero;
    String fechaMatricula;
    int numeroChasis;
    int duracionMatricula;
    Propietario propietario;
    Auto auto;
    
    public int calcularExpiracion(){
        var retorno=1000;
        
        return retorno;
    }
    public boolean validadChasis(){
        var retorno=true;
        
        return retorno;
    }
}