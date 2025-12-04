
public class terceirizados {
    private String nome;
    private int numero;
    private String empresa;
    private String funcao;
    
    public terceirizados(String nome, int numero, String empresa, String funcao) {
        this.nome = nome;
        this.numero = numero;
        this.empresa = empresa;
        this.funcao = funcao;
    }
    
    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }
    
    public String getEmpresa() {
        return empresa;
    }
    
    public String getFuncao() {
        return funcao;
    }
    
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
