class Sum {
    String toString() {
        IndentingStream writer = new IndentingStream();
        toString(writer);
        return writer.contents();
    }

    void toString(IndentingStream writer) {
        writer.println("+");
        writer.indent();
        augend.toString(writer);
        writer.println();
        addend.toString(writer);
        writer.exdent();
    }
}