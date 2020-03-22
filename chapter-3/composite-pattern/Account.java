class Account implements Holding {
    Holding[] holdings;
    Money balance() {
        Money sum = Money.zero();
        for (int i = 0; i < holdings.length; i++) {
            sum.plus(holdings[i].value);
        }
        return sum;
    }
}

