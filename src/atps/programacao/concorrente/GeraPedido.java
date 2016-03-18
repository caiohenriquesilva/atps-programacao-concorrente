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
public class GeraPedido extends Thread {
    public Buffer buffer;
    public int pedidoId;
    
    public void setBuffer(Buffer b) {
        this.buffer = b;
    }
    
    @Override
    public void run() {
        try {
            if (buffer.getValor() > 0) {
                
            }
        } catch (Exception e) {
        }
    }
}
