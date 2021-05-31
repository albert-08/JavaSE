public class NamingJava {
  public static void main(String[] args) {
    //Sensible a mayúsculas y minúsculas
    //Comenzar con letras, $ o _
    //Letras posteriores pueden ser letras, números, $ y _
    //Las constantes se escriben en mayúsculas y contienen _
    //Debemos usar Upper Camel Case en los nombres de las clases y archivos. 
    //Y Lower Camel Case en los nombres de las variables o métodos.
    int celphone = 123456789;
    int celPhone = 987654321;
    System.out.println(celphone);
    System.out.println(celPhone);

    String $countryName = "Colombia";
    String _backgroundColor = "Green";

    String currency$ = "MXN";
    String background_color = "BLUE";

    int POSITION = -5;
    int MAX_WIDTH = 9999;
    int MIN_WIDTH = 1;

    String fullName = "Irena Anahi Salgado Díaz de la Vega";
    int sizeInCentimeters = 26;
  }
}