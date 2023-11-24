package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa() {

    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPessoa;
    private String nome;

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
