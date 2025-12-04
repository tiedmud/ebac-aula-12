public class Carro {
    String cor;
    String modelo;
    String ano;
    Float preco;

    @Override
    public String toString() {
        return "Carro{" + "cor=" + cor + ", modelo=" + modelo + ", ano=" + ano + ", preco=" + preco.toString() + "}";
    }
}
