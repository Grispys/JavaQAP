public class Money {
    private long dollars;
    private long cents;

    // sets up values for dollars and cents, where cents is the amount value minus the dollar value *100, rounded to the nearest whole number and placed after the decimal.
    public Money(double amount){
        this.dollars = (long)amount;
        this.cents = Math.round((amount-dollars)*100);
    }

    public Money(Money otherObject){
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }
    // for some reason, i could not get it to add cents to the balance. i have no idea why. it is commented out because if + this.cents was used, it would add cents as if they were dollars. i could not figure out why!
    public Money add(Money otherObject){
        this.dollars = (this.dollars + otherObject.dollars);
        this.cents = (this.cents + otherObject.cents);
        double newTotal = this.dollars; //+ this.cents;
        return new Money(newTotal);

    }
    // takes argument money away from target money
    public Money subtract(Money otherObject){
        this.dollars = (this.dollars - otherObject.dollars);
        this.cents = (this.cents - otherObject.cents);
        double newTotal = this.dollars + this.cents;
        return new Money(newTotal);
    }

    // compares by simply checking which is greater or lesser
    public int compareTo(Money otherObject){
        // all of the system prints were for debugging. i left them in as evidence
        if(this.dollars >otherObject.dollars){
            // System.out.println("greater than");
            return 1;
        }else if (this.dollars < otherObject.dollars){
            // System.out.println("less than");
            return -1;
        } else {
           return 0;
        }
    }
    

    public boolean equals(Money otherObject){
        if (this.dollars==otherObject.dollars && this.cents == otherObject.cents){
            System.err.println("Equal");
            return true;
        }else{
            System.err.println("Unequal");
            return false;
        }
    }

    // string is returned formatted in $0.00
    public String toString(){
        return String.format("$%d.%02d", this.dollars, this.cents);
    }
}
