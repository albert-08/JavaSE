public class IfStatement {
  public static void main(String[] args) {
    boolean isBluetoothEnabled = false;
    int fileSended = 3;
    System.out.println(fileSended);

    if (isBluetoothEnabled) {
      //Send file
      fileSended ++;
      System.out.println("Archivo enviado");
      System.out.println(fileSended);
      int i = 0;
      i++;
    } else {
      fileSended --;
      System.out.println("Por favor enciende tu Bluetooth, para iniciar la transferencia");
    }
    System.out.println(isBluetoothEnabled);
    System.out.println(fileSended);
  }
}