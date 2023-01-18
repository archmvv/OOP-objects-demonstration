package Java24;

public class ModemTester{
    public static void main(String[] args){
    
        CableModem surfBoard = new CableModem();
        DslModem gateway = new DslModem();
        surfBoard.speed = 500000;
        gateway.speed = 400000;
        System.out.println("Trying the cable modem:");
        surfBoard.displaySpeed();
        surfBoard.connect();
        surfBoard.disconnect();
        
        System.out.println("Trying the DSL modem:");
        gateway.displaySpeed();
        gateway.connect();
        gateway.disconnect();
        
        
        Commodore64Modem commodore = new Commodore64Modem();
        commodore.speed = 300000;
        System.out.println("Trying the Commodore64 Modem:");
        commodore.displaySpeed();
        commodore.connect();
        commodore.disconnect();
    
        
        
    }
}
