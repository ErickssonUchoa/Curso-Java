package entities;

public final class ContaPoupanca extends ContaHeranca {

    private Double interestRate;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    //Sobreposição de método, adicinando diferença no saque da conta poupança
    @Override
    public final void withdraw(double amount) {
        balance -= amount;
    }

}
