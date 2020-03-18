private class FullFile extends File {
    public FullFile(String path) {
        super(path)
    }
    public boolean createNewFile() throws Exception {
        throw new IOException();
    }
}