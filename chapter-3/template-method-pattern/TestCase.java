public void runBare() throws Throwable {
    setUp();
    try {
        runTest();
    } finally {
        tearDown();
    }
}