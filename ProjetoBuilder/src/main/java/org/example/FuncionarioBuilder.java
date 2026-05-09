package org.example;


public class FuncionarioBuilder {

    private Funcionario funcionario;

    public FuncionarioBuilder() {
        this.funcionario = new Funcionario();
    }

    public Funcionario build() {
        if (funcionario.getId() == 0) {
            throw new IllegalArgumentException("É necessário um ID válido");
        }
        if (funcionario.getNome().equals("")) {
            throw new IllegalArgumentException("Nome do funcionário inválido");
        }
        return funcionario;
    }


    public FuncionarioBuilder setId(int id) {
        funcionario.setId(id);
        return this;
    }

    public FuncionarioBuilder setNome(String nome) {
        funcionario.setNome(nome);
        return this;
    }

    public FuncionarioBuilder setCargo(String cargo) {
        funcionario.setCargo(cargo);
        return this;
    }

    public FuncionarioBuilder setSalario(double salario) {
        funcionario.setSalario(salario);
        return this;
    }

    public FuncionarioBuilder setCpf(String cpf) {
        funcionario.setCpf(cpf);
        return this;
    }

    public FuncionarioBuilder setEmail(String email) {
        funcionario.setEmail(email);
        return this;
    }

    public FuncionarioBuilder setTelefone(String telefone) {
        funcionario.setTelefone(telefone);
        return this;
    }

    public FuncionarioBuilder setDepartamento(String departamento) {
        funcionario.setDepartamento(departamento);
        return this;
    }

    public FuncionarioBuilder setDataAdmissao(java.util.Date dataAdmissao) {
        funcionario.setDataAdmissao(dataAdmissao);
        return this;
    }

    public FuncionarioBuilder setLogradouro(String logradouro) {
        funcionario.setLogradouro(logradouro);
        return this;
    }

    public FuncionarioBuilder setNumero(int numero) {
        funcionario.setNumero(numero);
        return this;
    }

    public FuncionarioBuilder setBairro(String bairro) {
        funcionario.setBairro(bairro);
        return this;
    }

    public FuncionarioBuilder setCidade(String cidade) {
        funcionario.setCidade(cidade);
        return this;
    }

    public FuncionarioBuilder setUf(String uf) {
        funcionario.setUf(uf);
        return this;
    }

}
