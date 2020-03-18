@Test
public void testOrderLookup() {
    Database db = new MockDatabase();
    db.expectQuery("Some query");
    db.returnResult(new String[]{"Order 2", "Order 3"});
    
}
