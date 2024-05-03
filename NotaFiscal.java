import java.util.Date;

public class NotaFiscal {
    private Long id;
    private Long usuario_id;
    private String chave;
    private String sequencial;
    private Date data_processamento;

    public NotaFiscal(Long id, Long usuario_id, String chave, String sequencial, Date data_processamento) {
        this.id = id;
        this.usuario_id = usuario_id;
        this.chave = chave;
        this.sequencial = sequencial;
        this.data_processamento = data_processamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return usuario_id;
    }

    public void setUsuarioId(Long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getSequencial() {
        return sequencial;
    }

    public void setSequencial(String sequencial) {
        this.sequencial = sequencial;
    }

    public Date getDataProcessamento() {
        return data_processamento;
    }

    public void setDataProcessamento(Date data_processamento) {
        this.data_processamento = data_processamento;
    }
}
