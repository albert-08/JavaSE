public class DataTypesJava {
  public static void main(String[] args) {
    //Tipos de datos para números enteros (sin decimales):
    //byte: Ocupa 1 byte de memoria y su rango es de -128 hasta 127.
    //short: Ocupa 2 bytes de memoria y su rango es de -32,768 hasta 32,727.
    //int: Ocupa 4 bytes de memoria y su rango es de -2,147,483,648 hasta 2,147,483,647. 
    //Es muy cómodo de usar, ya que no es tan pequeño para que no quepan nuestros números ni tan grande como para desperdiciar mucha memoria. 
    //Puede almacenar hasta 10 dígitos.
    //long: Ocupa 8 bytes de memoria y su rango es de -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807. 
    //Para diferenciarlo de un tipo de dato long debemos terminar el número con la letra L.
    //Tipos de datos para números flotantes (con decimales):
    //float: Ocupan 4 bytes de memoria y su rango es de 1.40129846432481707e-45 hasta 3.40282346638528860e+38. 
    //Así como long, debemos colocar una letra F al final.
    //double: Ocupan 8 bytes de memoria y su rango es de 4.94065645841246544e-324d hasta 1.79769313486231570e+308d.
    //char: Ocupa 2 bytes y solo puede almacenar 1 dígito, debemos usar comillas simples en vez de comillas dobles.
    //boolean: Son un tipo de dato lógico, solo aceptan los valores true y false. También ocupa 2 bytes y almacena únicamente 1 dígito.
    //Seguro te diste cuenta que siempre debemos escribir el tipo de dato de nuestras variables antes de definir su nombre y valor. 
    //Pero esto cambia a partir de Java 10: solo debemos escribir la palabra reservada var y Java definirá el tipo de dato de nuestras variables automáticamente:
    int n = 1234567890;
    long nL = 1234567890123456789L;

    double nD = 123.4567890;
    float nF = 123.456F;

    var salary = 1000;
    var PENSION = 0.03;

    var pension = salary * PENSION;

    var totalSalary = salary - pension;
  
    System.out.println(n);
    System.out.println(nL);
    System.out.println(nD);
    System.out.println(nF);

    System.out.println(salary);
    System.out.println(PENSION);
    System.out.println(pension);
    System.out.println(totalSalary);

    var employeeName = "Anahí Salgado";
    System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
  }
}