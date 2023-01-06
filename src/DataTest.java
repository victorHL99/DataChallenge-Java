public class DataTest {
  public static void main(String[] args) {

    Data newDate1 = new Data();
    newDate1.day = 06;
    newDate1.month = 01;
    newDate1.year = 2023;

    Data newDate2 = new Data();
    newDate2.day = 16;
    newDate2.month = 10;
    newDate2.year = 1999;

    System.out.println("A data de hoje é: " + newDate1.day + "/" + newDate1.month + "/" + newDate1.year);
    System.out.println("Meu aniversário é: " + newDate2.day + "/" + newDate2.month + "/" + newDate2.year);
  }
}
