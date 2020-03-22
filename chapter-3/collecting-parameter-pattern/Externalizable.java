public interface Externalizable extends java.io.Serializable {
    Sum sum = new Sum(Money.dollar(5), Money.franc(7));
    assertEquals("5 USD + 7 CHF", sum.toString());
}