/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atps.programacao.concorrente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author caiohenrique
 */
public class AtpsProgramacaoConcorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        Log log = new Log();
        final long startTime = System.currentTimeMillis();
        log.escreveLog("\n\n==============================\nHora de inicio: " + startTime + "\n\n");
        
        Buffer buffer = new Buffer();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Digite a quantidade de threads simultaneas que deseja executar: ");
        String threadsSimultaneas = br.readLine();  
        System.out.println(threadsSimultaneas);  
        
        int numThreadsSimultaneas = Integer.parseInt(threadsSimultaneas);
        GeraPedido[] pedido = new GeraPedido[numThreadsSimultaneas];
        
        for (int i = 0; i < pedido.length; i++) {
            pedido[i] = new GeraPedido(log);
            pedido[i].setName("ThreadSimultaneaNum: " + i+1 + " ThreadId: " + buffer.getValor() + "\n");
            pedido[i].setBuffer(buffer);
            pedido[i].start();
        }
        
        final long endTime = System.currentTimeMillis();
        log.escreveLog("==============================\nHora de fim: " + endTime);
        log.escreveLog("\nTempo total de execu\u00e7\u00e3o: " + (endTime - startTime) + "ms");
        
    }
    
}
