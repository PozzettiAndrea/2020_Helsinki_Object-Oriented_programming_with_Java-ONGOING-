
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros()+ addition.euros(), this.cents() + addition.cents());
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros() * 100 + this.cents < compared.euros() * 100 + compared.cents()) {
            return true;
        } else {
            return false;
        }
    }
    
    public Money minus(Money decreaser) {
        int newEuros = this.euros() - decreaser.euros();
        int newCents = this.cents() - decreaser.cents();
        if (newCents < 0) {
            newEuros += -1;
            newCents = 100 + newCents;
        }
        if (newEuros >=0){
            Money newMoney = new Money(newEuros, newCents);
            return newMoney;
        } else {
            Money newMoney = new Money(0, 0);
            return newMoney;
        }
    }
    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
