package atividadeAvaliativa;

public abstract class Aparelho {
    private boolean ligada;
    private int volume;

    public Aparelho() {
        this.ligada = false;
        this.volume = 0;
    }

    public boolean isLigada() {
        return ligada;
    }

    protected void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getVolume() {
        return volume;
    }

    protected void setVolume(int volume) {
        if (volume < 0) {
            this.volume = 0;
        } else if (volume > 100) {
            this.volume = 100;
        } else {
            this.volume = volume;
        }
    }

    public void ligar() {
        setLigada(true);
        System.out.println("TV ligada.");
    }

    public void desligar() {
        setLigada(false);
        setVolume(0);
        System.out.println("TV desligada.");
    }

    public void aumentarVolume() {
        if (isLigada()) {
            setVolume(getVolume() + 1);
            System.out.println("Volume aumentado para: " + getVolume());
        } else {
            System.out.println("TV deve estar ligada para ajustar volume.");
        }
    }

    public void diminuirVolume() {
        if (isLigada()) {
            setVolume(getVolume() - 1);
            System.out.println("Volume diminuído para: " + getVolume());
        } else {
            System.out.println("TV deve estar ligada para ajustar volume.");
        }
    }
}