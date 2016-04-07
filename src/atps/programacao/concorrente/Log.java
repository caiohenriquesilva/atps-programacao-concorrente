/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atps.programacao.concorrente;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author caiohenrique
 */
public class Log {
    File arquivo;
    FileWriter escreveArquivo;
    String textoArquivo;
    
    public Log() {
        try{
            arquivo = new File("/tmp/log.txt");
            escreveArquivo = new FileWriter(arquivo);
        } catch(IOException execpetion) {
            execpetion.printStackTrace();
        } catch(Exception exception) {
            exception.printStackTrace();
        }
    }
    
    public void escreveLog(String texto) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get("/tmp/log.txt"));
        textoArquivo = StandardCharsets.UTF_8.decode(ByteBuffer.wrap(encoded)).toString();
        
        try{
            if (arquivo.exists()) {
                escreveArquivo.append(texto);
            } else {
                escreveArquivo.write(texto);
            }
        } catch(IOException exception) {
            exception.printStackTrace();
        } catch(Exception exception) {
            exception.printStackTrace();
        }
    }
    
    
    public void fechaArquivo() throws IOException {
        escreveArquivo.close();
    }
}
