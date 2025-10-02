package atividadeAvaliativa;

public class sistematv {
    public static void main(String[] args) {
        TV tv1 = new TV(12345);

        tv1.verInformacoes();

        tv1.ligar();
        tv1.verInformacoes();

        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.verInformacoes();

        tv1.listarCanais();

        tv1.trocarCanalMais();
        tv1.verCanalAtual();

        tv1.escolherCanal(3);
        tv1.verCanalAtual();

        tv1.trocarCanalMenos();
        tv1.verCanalAtual();

        tv1.diminuirVolume();
        tv1.verInformacoes();

        tv1.desligar();
        tv1.verInformacoes();

        tv1.trocarCanalMais();
    }
}