package utfpr.ct.dainf.if62c.avaliacao;

import java.util.Comparator;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial.
 * @author 
 */
public class LancamentoComparator implements Comparator<Lancamento>{
    private boolean ordNum = true;
    private int multNumConta = 1;
    private int multData = 1;

    public LancamentoComparator() {
    }

    public LancamentoComparator(boolean ordNum, boolean numAsc, boolean nomeAsc) {
        this.ordNum = ordNum;
        this.multNumConta = numAsc ? 1 : -1;
        this.multData = nomeAsc ? 1 : -1;
    }

    public boolean isOrdNumConta() {
        return ordNum;
    }

    public void setOrdNumConta(boolean ordNum) {
        this.ordNum = ordNum;
    }

    public boolean isNumContaAsc() {
        return multNumConta == 1;
    }

    public void setNumContaAsc(boolean numAsc) {
        this.multNumConta = numAsc ? 1 : -1;
    }

    public boolean getDataAsc() {
        return multData == 1;
    }

    public void setDataAsc(boolean nomeAsc) {
        this.multData = nomeAsc ? 1 : -1;
    }

    private int comparaNumConta(Lancamento j1, Lancamento j2) {
        return multNumConta * (j1.getConta() - j2.getConta());
    }

    private double comparaData(Lancamento j1, Lancamento j2) {
        return multData * (j1.getData().getTime() - j2.getData().getTime());
    }

    @Override
    public int compare(Lancamento j1, Lancamento j2) {
        double comp;
        if (ordNum) {
            comp = comparaNumConta(j1, j2);
            if (comp == 0) comp = comparaData(j1, j2);
        } else {
            comp = comparaData(j1, j2);
            if (comp == 0) comp = comparaNumConta(j1, j2);
        }
        return (int)comp;
    }
}
