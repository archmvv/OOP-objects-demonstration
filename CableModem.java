package Java24;


public class CableModem extends Modem{

String method = "cable connection";

public void connect(){
System.out.println("Connecting to the Internet ...");
System.out.println("Using a " + method);
}
public void disconnect(){
System.out.println("Disconnecting from the Internet ...");
}
}
