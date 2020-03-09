package Classes;

class BankAccount {
    String name;
    long cents;

    public void deposit(long amount) {
        this.cents = this.cents + amount;
    }

    public void withdraw(long amount) {
        this.cents = this.cents - amount;
    }

    public long balance() {
        return this.cents;
    }

    public boolean isOverDrawn() {
        final boolean b = this.cents < 0;
        return b;
    }
}