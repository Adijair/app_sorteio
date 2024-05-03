public class Sorteio {
    private Long id;
    private int ano;
    private int identificador;
    private int valor_do_premio;
    private int apresentador;
    private int auditor;
    private int premiado;
    private String descricao;

    public Sorteio(Long id, int ano, int identificador, int valor_do_premio, int apresentador, int auditor, int premiado, String descricao){
        this.id = id;
        this.ano = ano;
        this.identificador = identificador;
        this.valor_do_premio = valor_do_premio;
        this.apresentador = apresentador;
        this.auditor = auditor;
        this.premiado = premiado;
        this.descricao = descricao;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getIdentificador(){
        return identificador;
    }

    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }

    public int getValorDoPremio(){
        return valor_do_premio;
    }

    public void setValorDoPremio(int valor_do_premio){
        this.valor_do_premio = valor_do_premio;
    }

    public int getApresentador(){
        return apresentador;
    }

    public void setApresentador(int apresentador){
        this.apresentador = apresentador;
    }

    public int getAuditor(){
        return auditor;
    }

    public void setAuditor(int auditor){
        this.auditor = auditor;
    }

    public int getPremiado(){
        return premiado;
    }

    public void setPremiado(int premiado){
        this.premiado = premiado;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
