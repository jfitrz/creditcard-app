package pl.jkan.creditcard;

public class CreditCard {

    private double limit;
    private boolean blocked;
    private final Account account;
    private double debt;
    private String id;

    public CreditCard() {
        this.id = "random_string";
    }
    
    pbulic CreditCard(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public CreditCard(Account account){
        this.account = account;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setDebt(double debt){
        this.debt = debt;
    }

    public double getDebt(){
        return debt;
    }

    public void withdraw(double money){

        if(isBlocked()){
            throw new RuntimeException("Card is blocked");
        }

        if(account.getMoney() < money){
           throw new RuntimeException("Not enough money");
        }
        double result = account.getMoney() - money;
        account.setMoney(result);
    }

    public void repayDebt(){
        if(account.getMoney() >= debt){
            double result = account.getMoney() - debt;
            account.setMoney((result));
        }
        else{
            throw new RuntimeException("Not enough money");
        }
    }

}