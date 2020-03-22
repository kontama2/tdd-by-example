@Test
public void testSumPrinting() {
    Sum sum = new Sum(Money.dollar(5), Money.franc(7));
    assertEquals("+\n\t5 USD \n\t CHF", sum.toString());
}