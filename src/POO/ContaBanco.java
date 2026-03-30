package POO;

public class ContaBanco {

// ATRIBUTOS

    public int numConta;
    protected String tipoConta;
    private String dono;
    private double saldo;
    private boolean statusConta;


// METODOS PERSONALIZADOS

    public void abrirConta(String tipoConta) {
        this.setTipoConta(tipoConta);
        this.setStatusConta(true);
        if (tipoConta == "CC") {
            this.setSaldo(50);
        } else if (tipoConta == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {

        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito!");
        } else {
            this.setStatusConta(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(double valorDeposito) {

        if (this.getStatusConta()) {
            this.setSaldo(this.getSaldo() + valorDeposito);
            System.out.println("Depósito realizado com sucesso na conta de: " + this.getDono());
        } else {
            System.out.println("Impossível depositar. Você não tem uma conta!");
        }
    }

    public void sacar(double valorSacar) {

        if (this.getStatusConta()) {
            if (this.getSaldo() >= valorSacar) {
                this.setSaldo(this.getSaldo() - valorSacar);
                System.out.println("Saque realizado na conta de: " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível sacar!");
        }
    }

    public void pagarMensalidade() {
        double valorMensalidade = 0;

        if (this.getTipoConta() == "CC") {
            valorMensalidade = 12.00;
        } else if (this.getTipoConta() == "CP"){
            valorMensalidade = 20.00;
        }
        if (this.getStatusConta()) {
            this.setSaldo(this.getSaldo() - valorMensalidade);
            System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada.");
        }
    }

    //METODO ESTADO ATUAL DA CONTA
    public void estadoAtual() {
        System.out.println("--------------------------------------");
        System.out.println("Número da Conta: " + this.getNumConta());
        System.out.println("Tipo da Conta: " + this.getTipoConta());
        System.out.println("Dono da Conta: " + this.getDono());
        System.out.println("Saldo da Conta: R$" + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatusConta());
    }

// METODO CONSTRUTOR

    public ContaBanco() { // sempre quando eu for abrir/criar uma conta pra alguém
        this.setSaldo(0); // eu estou dizendo que a conta inicia com R$0,00
        this.setStatusConta(false); // e status falso, pois a conta está fechada ou seja, não existe ainda
    }

// METODOS ESPECIAIS GETTER E SETTER

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }


}

















