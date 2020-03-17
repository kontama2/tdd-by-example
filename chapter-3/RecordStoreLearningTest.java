private RecordStore store;

@BeforeEach
public void setUp() {
    store = RecordStore.openRecordStore("testing");
}

@Test
public void testStore() {
    int id = store.addRecord(new byte[]{5, 6}, 0, 2);
    assertEquals(2, store.getRecordSize(id));
    byte[] buffer = new byte[2];
    assertEquals(2, store.getRecord(id, buffer, 0));
    assertEquals(5, buffer[0]);
    assertEquals(6, buffer[1]);
}
