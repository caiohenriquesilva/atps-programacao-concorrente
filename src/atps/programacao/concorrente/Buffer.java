/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atps.programacao.concorrente;

/**
 *
 * @author caiohenrique
 */
public class Buffer {
    private int valor = 5000;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void incrementaValor() {
        this.valor++;
    }
    
    public void decrementaValor() {
        this.valor--;
    }
}
