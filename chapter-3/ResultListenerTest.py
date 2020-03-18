def testNotification(self):
    result = TestResult()
    listener = ResultListener()
    result.addListener(listener)
    WasRun("testMethod").run(result)
    assert(1 == listener.count)
