package entities;

public class ContaEmpresaHeranca extends ContaHeranca {

    private Double loanLimit;

    public ContaEmpresaHeranca() {
        super();
    }

    public ContaEmpresaHeranca(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <=loanLimit) {
            balance += amount - 10.0;
        }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount); //uso da palavra super, chamando o metodo da superclasse
        balance -= 2.0;
    }

}
