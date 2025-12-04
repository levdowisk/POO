
class Aluno {
    private int numero;
    private String nome;
    private double[] notas;
    
    public Aluno(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.notas = new double[4]; // 4 disciplinas
    }
    
    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }
    
    public double[] getNotas() {
        return notas;
    }
    
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return notas.length > 0 ? soma / notas.length : 0;
    }
}