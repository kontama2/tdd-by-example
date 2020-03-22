class Transaction implements Holding {
    Moeny value;
    Transaction (Moeny value) {
        this.value = value;
    }
    public Money balance() {return this.value;}
}