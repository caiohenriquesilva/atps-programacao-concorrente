/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atps.programacao.concorrente;

import java.io.FileWriter;
import java.util.Date;

/**
 *
 * @author caiohenrique
 */
public class GeraPedido extends Thread {
    public Buffer buffer;
    public Pedido pedido;
    public Log log;
    
    public GeraPedido(Log log) {
        this.log = log;
    }
    
    public void setBuffer(Buffer b) {
        this.buffer = b;
    }
        
    @Override
    public void run() {
        try {
//            final long startTime = System.currentTimeMillis();
            
            while (buffer.getValor() > 0 ) {
                pedido = new Pedido();
                pedido.setPedidoId(buffer.getValor());
                log.escreveLog(Thread.currentThread().getName() +
                        "PedidoId: " + pedido.getPedidoId() + 
                        " - CurrentTime: " + System.currentTimeMillis() + "\n\n");
                
                buffer.decrementaValor();
            }
            
//            log.fechaArquivo();
//            final long endTime = System.currentTimeMillis();
//            System.out.println("Tempo total de execu\u00e7\u00e3o: " + (endTime - startTime) );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
