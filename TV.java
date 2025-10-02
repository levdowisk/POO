import java.util.ArrayList;
import java.util.List;

public class TV extends Aparelho {
    private List<Canal> canais;
    private int canalAtualIndex;
    private int numeroTV;

    public TV(int numeroTV) {
        super();
        this.canais = new ArrayList<>();
        this.canalAtualIndex = -1;
        this.numeroTV = numeroTV;

        // Canais padrão
        adicionarCanal(new Canal(1, "Globo"));
        adicionarCanal(new Canal(2, "SBT"));
        adicionarCanal(new Canal(3, "Record"));
        adicionarCanal(new Canal(4, "Band"));
    }

    public List<Canal> getCanais() {
        return new ArrayList<>(canais);
    }

    public void setCanais(List<Canal> canais) {
        this.canais = new ArrayList<>(canais);
    }

    public int getCanalAtualIndex() {
        return canalAtualIndex;
    }

    protected void setCanalAtualIndex(int canalAtualIndex) {
        if (canalAtualIndex >= 0 && canalAtualIndex < canais.size()) {
            this.canalAtualIndex = canalAtualIndex;
        }
    }

    public int getNumeroTV() {
        return numeroTV;
    }

    public void setNumeroTV(int numeroTV) {
        this.numeroTV = numeroTV;
    }

    public void adicionarCanal(Canal canal) {
        canais.add(canal);
    }

    public void verCanalAtual() {
        if (isLigada()) {
            if (canalAtualIndex >= 0 && canalAtualIndex < canais.size()) {
                System.out.println("Canal atual: " + canais.get(canalAtualIndex));
            } else {
                System.out.println("Nenhum canal selecionado.");
            }
        } else {
            System.out.println("TV deve estar ligada para ver canal.");
        }
    }

    public void trocarCanalMais() {
        if (isLigada()) {
            if (canais.isEmpty()) {
                System.out.println("Nenhum canal disponível.");
                return;
            }
            canalAtualIndex = (canalAtualIndex + 1) % canais.size();
            System.out.println("Canal trocado para: " + canais.get(canalAtualIndex));
        } else {
            System.out.println("TV deve estar ligada para trocar canal.");
        }
    }

    public void trocarCanalMenos() {
        if (isLigada()) {
            if (canais.isEmpty()) {
                System.out.println("Nenhum canal disponível.");
                return;
            }
            canalAtualIndex = (canalAtualIndex - 1 + canais.size()) % canais.size();
            System.out.println("Canal trocado para: " + canais.get(canalAtualIndex));
        } else {
            System.out.println("TV deve estar ligada para trocar canal.");
        }
    }

    public void escolherCanal(int numeroCanal) {
        if (isLigada()) {
            for (int i = 0; i < canais.size(); i++) {
                if (canais.get(i).getNumero() == numeroCanal) {
                    setCanalAtualIndex(i);
                    System.out.println("Canal selecionado: " + canais.get(i));
                    return;
                }
            }
            System.out.println("Canal " + numeroCanal + " não encontrado.");
        } else {
            System.out.println("TV deve estar ligada para escolher canal.");
        }
    }

    public void listarCanais() {
        if (canais.isEmpty()) {
            System.out.println("Nenhum canal cadastrado.");
            return;
        }
        System.out.println("Lista de canais:");
        for (Canal c : canais) {
            System.out.println(c);
        }
    }

    public void verInformacoes() {
        System.out.println("=== Informações da TV ===");
        System.out.println("Número da TV: " + numeroTV);
        System.out.println("Status: " + (isLigada() ? "Ligada" : "Desligada"));
        System.out.println("Volume atual: " + getVolume());
        if (isLigada()) {
            if (canalAtualIndex >= 0) {
                System.out.println("Canal atual: " + canais.get(canalAtualIndex));
            } else {
                System.out.println("Canal atual: Nenhum");
            }
        } else {
            System.out.println("Canal atual: N/A (TV desligada)");
        }
        System.out.println("========================");
    }
}