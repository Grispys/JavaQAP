public class Money {
    private long dollars;
    private long cents;


    public Money(double amount){
        this.dollars = (long)amount;
        this.cents = Math.round((amount-dollars)*100);
    }

    public Money(Money otherObject){
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherObject){
        this.dollars = (this.dollars + otherObject.dollars);
        this.cents = (this.cents + otherObject.cents);
        double newTotal = this.dollars;
        return new Money(newTotal);

    }

    public Money subtract(Money otherObject){
        this.dollars = (this.dollars - otherObject.dollars);
        this.cents = (this.cents - otherObject.cents);
        double newTotal = this.dollars + this.cents;
        return new Money(newTotal);
    }

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

    public String toString(){
        return String.format("$%d.%02d", this.dollars, this.cents);
    }
}
