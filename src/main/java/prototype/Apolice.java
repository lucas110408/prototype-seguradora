package prototype;

public class Apolice implements Cloneable {
    private String numero;
    private String nomeSegurado;
    private Veiculo veiculo;
    private String cidade;

    public Apolice(String numero, String nomeSegurado, Veiculo veiculo, String cidade) {
        this.numero = numero;
        this.nomeSegurado = nomeSegurado;
        this.veiculo = veiculo;
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public Apolice clone() throws CloneNotSupportedException {
        Apolice apoliceClone = (Apolice) super.clone();
        apoliceClone.veiculo = (Veiculo) apoliceClone.veiculo.clone();
        return apoliceClone;
    }

    @Override
    public String toString() {
        return "Apolice{" +
                "numero='" + numero + '\'' +
                ", nomeSegurado='" + nomeSegurado + '\'' +
                ", veiculo=" + veiculo +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
