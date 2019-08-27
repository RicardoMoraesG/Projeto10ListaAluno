/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Aluno {
    private int idAluno;
    private String nome;
    private String celular;
    
    //CONTRUTORES
    
    //Vazio
    public Aluno() {
        
    }//Fim Construtor Vazio
    
    public Aluno(int idAluno, String nome, String celular) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.celular = celular;
    }//FIM CONSTRUTOR
    
    //GETTERS E SETTERS

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    //FIM GETTERS E SETTERS
    
    
}    
