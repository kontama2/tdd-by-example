Socket socker = new Socket();
String message = "Hello";
socket.write(message);
assertEquals(message, socket.read());
