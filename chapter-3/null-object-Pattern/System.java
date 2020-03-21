public static SecurityManager getSecurityManager() {
    return security == null ? new LaxSecurity() : security;
}