public class Funciones {

  public static double circleArea(double r) {
    return Math.PI * Math.pow(r, 2);
  }

  public static double sphereArea(double r) {
    return 4 * Math.PI * Math.pow(r, 2);
  }

  public static double sphereVolume(double r) {
    return (4/3) * Math.PI * Math.pow(r, 3);
  }

  /**
   * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares
   * @param quantity Cantidad de dinero
   * @param currency Tipo de moneda: Solo acepta MXN o COP
   * @return quantity Devuelve la cantidad actualizada en dolares
   */
  public static double convertToDolar(double quantity, String currency) {
    switch (currency) {
      case "MXN":
        quantity *= 0.052;
        break;
      case "COP":
        quantity *= 0.00031;
    }
    return quantity;
  }

  public static void main(String[] args) {

    double y = 4;
    
    double area = circleArea(y);
    System.out.println(area);
    double areaEsfera = sphereArea(y);
    System.out.println(areaEsfera);
    double volumenEsfera = sphereVolume(y);
    System.out.println(volumenEsfera);

    double conv = convertToDolar(200, "MXN");
    System.out.println("Pesos a dolares: " + conv);
  }
}