abstract class Report {
    String printMessage;
    Report(String printMessage) {
        this.printMessage = printMessage;
    }
    void print() throws ReflectiveOperationException {
        Method runMethod = getClass().getMethod(printMessage, null);
        runMethod.invoke(runMethod, new Class[0]);
    }
    void printHTML() {}
    void printXML() {}
}