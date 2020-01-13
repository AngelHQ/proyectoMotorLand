/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

/**
 *
 * @author Pc
 */
public class Motores {
    //Definimos los campos:
    String modelo_pk;
    String fabricante;
    int potencia;
    int peso;
    int cantidad;
//Creamos un constructor vacío y otro con todos los campos, 
    //y por último los getters y setters
    public Motores() {
    }

    public Motores(String modelo_pk, String fabricante, int potencia, int peso, int cantidad) {
        this.modelo_pk = modelo_pk;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.peso = peso;
        this.cantidad = cantidad;
    }

    public String getModelo_pk() {
        return modelo_pk;
    }

    public void setModelo_pk(String modelo_pk) {
        this.modelo_pk = modelo_pk;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
