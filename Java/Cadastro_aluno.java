package com.mycompany.cadastro_aluno;
 
public class Cadastro_aluno {
    private String nomedoaluno;
    private String datadenascimento;
    private String email;
    private String telefone;
    private String cpf;
    private String periodo;
    private String curso;
    
    public String getNomedoaluno(){
    return nomedoaluno;
    }
    
    public void setNomedoaluno(String nomedoaluno){
    this.nomedoaluno = nomedoaluno;   
    }

    public String getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(String datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
