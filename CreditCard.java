public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit){
        this.owner = newCardHolder;
        this.creditLimit = limit;
        this.balance = new Money(0);
    }

    public Money getBalance(){
        return balance;
    }

    public Money getCreditLimit(){
        return creditLimit;
    }

    public String getPersonals(){
        return owner.toString();
    }
    public void charge(Money amount){
       Money newBalance = this.balance.add(amount);
    
    // i could not get this to work "properly" ; it does work as intended now, however it would charged the card twice. now it charges twice still, but the extra amount is immediately removed

        if((this.creditLimit.compareTo(newBalance) == -1)){
            System.err.println("YOUR BALANCE WOULD EXCEED YOUR CREDIT LIMIT");
            this.balance.subtract(amount);
        }else{
            this.balance = newBalance;
            System.err.println("YOUR BALANCE HAS BEEN CHARGED : " + amount);
       }
    
    
    }

    public void payment(Money amount){
        this.balance.subtract(amount);
    }
}
