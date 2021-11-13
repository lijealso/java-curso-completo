package A91.entities;

public class Aluguer {

    private String nome;
    private String email;


    public Aluguer(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Aluguer [email=" + email + ", nome=" + nome + "]";
    }

    

    
    
}
