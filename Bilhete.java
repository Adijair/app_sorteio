public class Bilhete {
    private Long id;
    private int ano;
    private int mes;
    private int numero;
    private Long nota_fiscal_id;
    private Long usuario_id;

    public Bilhete(Long id, int ano, int mes, int numero, Long nota_fiscal_id, Long usuario_id) {
        this.id = id;
        this.ano = ano;
        this.mes = mes;
        this.numero = numero;
        this.nota_fiscal_id = nota_fiscal_id;
        this.usuario_id = usuario_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Long getNotaFiscalId() {
        return nota_fiscal_id;
    }

    public void setNotaFiscalId(Long nota_fiscal_id) {
        this.nota_fiscal_id = nota_fiscal_id;
    }

    public Long getUsuarioId() {
        return usuario_id;
    }

    public void setUsuarioId(Long usuario_id) {
        this.usuario_id = usuario_id;
    }
}
