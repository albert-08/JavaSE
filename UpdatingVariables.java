public class UpdatingVariables {
  public static void main(String[] args) {
    int salary = 1000;
    int bono = 200;
    int pension = 50;
    int extra = 30;
    int comida = 45;

    salary = salary + bono;
    System.out.println(salary);

    salary = salary - pension;
    System.out.println(salary);

    salary = salary + extra*2 - comida;
    System.out.println(salary);

    //Actualizando cadenas de texto
    String employeeName = "Anahí Salgado";
    System.out.println(employeeName);

    employeeName = employeeName + " Díaz de la Vega";
    System.out.println(employeeName);

    employeeName = "Irene " + employeeName;
    System.out.println(employeeName);

    System.out.println("Su nombre es: "+ employeeName);
  }
}