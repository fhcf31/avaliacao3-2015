package utfpr.ct.dainf.if62c.avaliacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial.
 * @author 
 */
public class ProcessaLancamentos {
    private BufferedReader reader;

    public ProcessaLancamentos(File arquivo) throws FileNotFoundException {
        if(!arquivo.exists()){
            throw new UnsupportedOperationException("Arquivo não encontrado!");
        }
        this.reader = new BufferedReader(new FileReader(arquivo));
    }

    public ProcessaLancamentos(String path) throws FileNotFoundException {
        if(!new File(path).exists()){
            throw new UnsupportedOperationException("Arquivo não encontrado, o caminho está errado!");
        }
        this.reader = new BufferedReader(new FileReader(new File(path)));
    }
    
    private String getNextLine() throws IOException {
        if(reader.readLine().equals("")){
            throw new UnsupportedOperationException("O arquivo esta vazia");
        }
        return reader.readLine();
    }
    
    private Lancamento processaLinha(String linha) {
        throw new UnsupportedOperationException("Não implementado");
    }
    
    private Lancamento getNextLancamento() throws IOException {
        throw new UnsupportedOperationException("Não implementado");
    }
    
    public List<Lancamento> getLancamentos() throws IOException {
        throw new UnsupportedOperationException("Não implementado");
    }
    
}
