public class Exercise2 {
  public static void main(String[] args) {
    char c = 'z';
    int i = 250;
    double d = 301.067;
    int n = 100;
    int x = 737;
    double d2 = 298.638;

    int cI = c; //implícito exactitud
    System.out.println(cI);

    long iL = i; //implícito estimación
    System.out.println(iL);
    short iS = (short) iL; //explícito estimación
    System.out.println(iS);

    long dL = (long) d; //explícito estimación
    System.out.println(dL);

    float nf = n + (float) 5000.66; //explícito exactitud
    System.out.println(nf);

    byte xb = (byte) (x * 100); //explícito estimación
    System.out.println(xb);

    long d2l = (long) d2 / 25; //explícito estimación
    System.out.println(d2l);
  }
}