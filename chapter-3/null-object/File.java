public class File {
    public boolean setReadOnly(){
        SecurityManager guard = System.getSecurityManager();
        guard.canWrite(path);
        return fileSystem.setReadOnly(this);
    }
}
