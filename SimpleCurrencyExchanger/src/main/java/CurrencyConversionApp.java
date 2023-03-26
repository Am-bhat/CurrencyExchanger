import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConversionApp extends CurrencyData {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" [1] USA DOLLAR\t     [5] EURO\n [2] UK POUND\t     [6] CANADIAN DOLLAR\n [3] CHINESE YUAN\t [7] JAPANESE YEN\n [4] MEXICAN PESO\t [8] PAKISTANI RUPEE\n");
        System.out.print("Please enter the number associated with a Currency to be converted: ");
        int convert = scanner.nextInt();

        System.out.println(" [1] USA DOLLAR\t     [5] EURO\n [2] UK POUND\t     [6] CANADIAN DOLLAR\n [3] CHINESE YUAN\t [7] JAPANESE YEN\n [4] MEXICAN PESO\t [8] PAKISTANI RUPEE\n");
        System.out.print("Please enter the number for the Currency to convert to: ");
        int converted = scanner.nextInt();

        System.out.print("Please Enter the amount you want to convert: ");
        double amountToConvert = scanner.nextDouble();

        DecimalFormat a = new DecimalFormat("##.##");

        switch (convert) {
            case 1:
                if (converted == Integer.parseInt("2")) {
                    double dollarToPound = amountToConvert * USA_DOLLAR_TO_UK_POUND;
                    System.out.println(amountToConvert + " USA dollar(s) = " + a.format(dollarToPound) + " Pound(s)");
                } else if (converted == Integer.parseInt("3")) {
                    double dollarToYuan = amountToConvert * USA_DOLLAR_TO_CHINESE_YUAN;
                    System.out.println(amountToConvert + " USA dollar(s) = " + a.format(dollarToYuan) + " Yuan");
                } else if (converted == Integer.parseInt("4")) {
                    double dollarToPeso = amountToConvert * USA_DOLLAR_TO_MEXICAN_PESO;
                    System.out.println(amountToConvert + " USA dollar(s) = " + a.format(dollarToPeso) + " Peso(s)");
                } else if (converted == Integer.parseInt("5")) {
                    double dollarToEuro = amountToConvert * USA_DOLLAR_TO_EURO;
                    System.out.println(amountToConvert + " USA dollar(s) = " + a.format(dollarToEuro) + " Euro(s)");
                } else if (converted == Integer.parseInt("6")) {
                    double dollarToCanadianDollar = amountToConvert * USA_DOLLAR_TO_CANADIAN_DOLLAR;
                    System.out.println(amountToConvert + " USA dollar(s) = " + a.format(dollarToCanadianDollar) + " Canadian Dollar(s)");
                } else if (converted == Integer.parseInt("7")) {
                    double dollarToYen = amountToConvert * USA_DOLLAR_TO_JAPANESE_YEN;
                    System.out.println(amountToConvert + " USA dollar(s) = " + a.format(dollarToYen) + " Yen");
                } else if (converted == Integer.parseInt("8")) {
                    double dollarToPakistaniRupee = amountToConvert * USA_DOLLAR_TO_PAKISTANI_RUPEE;
                    System.out.println(amountToConvert + " USA dollar(s) = " + a.format(dollarToPakistaniRupee) + " Pakistani Rupee(s)");
                }
                break;

            case 2:
                if (converted == Integer.parseInt("1")) {
                    double poundToDollar = amountToConvert / USA_DOLLAR_TO_UK_POUND;
                    System.out.println(amountToConvert + " pound(s) = " + a.format(poundToDollar) + " USA Dollar(s)");
                } else if (converted == Integer.parseInt("3")) {
                    double poundToYuan = amountToConvert * UK_POUND_TO_CHINESE_YUAN;
                    System.out.println(amountToConvert + " pound(s) = " + a.format(poundToYuan) + " Yuan");
                } else if (converted == Integer.parseInt("4")) {
                    double poundToPeso = amountToConvert * UK_POUND_TO_MEXICAN_PESO;
                    System.out.println(amountToConvert + " pound(s) = " + a.format(poundToPeso) + " Peso(s)");
                } else if (converted == Integer.parseInt("5")) {
                    double poundsToEuro = amountToConvert / EURO_TO_UK_POUND;
                    System.out.println(amountToConvert + " pound(s) = " + a.format(poundsToEuro) + " Euro(s)");
                } else if (converted == Integer.parseInt("6")) {
                    double poundsToCanadianDollar = amountToConvert * UK_POUND_TO_CANADIAN_DOLLAR;
                    System.out.println(amountToConvert + " pound(s) = " + a.format(poundsToCanadianDollar) + " Canadian Dollar(s)");
                } else if (converted == Integer.parseInt("7")) {
                    double poundsToYen = amountToConvert * UK_POUND_TO_JAPANESE_YEN;
                    System.out.println(amountToConvert + " pound(s) = " + a.format(poundsToYen) + " Yen");
                } else if (converted == Integer.parseInt("8")) {
                    double poundsToPakistaniRupee = amountToConvert * UK_POUND_TO_PAKISTANI_RUPEE;
                    System.out.println(amountToConvert + " pound(s) = " + a.format(poundsToPakistaniRupee) + " Pakistani Rupee(s)");
                }
                break;

            case 3:
                if (converted == Integer.parseInt("1")) {
                    double yuanToDollar = amountToConvert / USA_DOLLAR_TO_CHINESE_YUAN;
                    System.out.println(amountToConvert + " yuan = " + a.format(yuanToDollar) + " USA Dollar(s)");
                } else if (converted == Integer.parseInt("2")) {
                    double yuanToEuro = amountToConvert / EURO_TO_CHINESE_YUAN;
                    System.out.println(amountToConvert + " yuan = " + a.format(yuanToEuro) + " Euro(s)");
                } else if (converted == Integer.parseInt("4")) {
                    double yuanToPeso = amountToConvert * CHINESE_YUAN_TO_MEXICAN_PESO;
                    System.out.println(amountToConvert + " yuan = " + a.format(yuanToPeso) + " Peso(s)");
                } else if (converted == Integer.parseInt("5")) {
                    double yuanToPound = amountToConvert / UK_POUND_TO_CHINESE_YUAN;
                    System.out.println(amountToConvert + " yuan = " + a.format(yuanToPound) + " Pound(s)");
                } else if (converted == Integer.parseInt("6")) {
                    double yuanToCanadianDollar = amountToConvert / CANADIAN_DOLLAR_TO_CHINESE_YUAN;
                    System.out.println(amountToConvert + " yuan = " + a.format(yuanToCanadianDollar) + " Canadian Dollar(s)");
                } else if (converted == Integer.parseInt("7")) {
                    double yuanToYen = amountToConvert * CHINESE_YUAN_TO_JAPANESE_YEN;
                    System.out.println(amountToConvert + " yuan = " + a.format(yuanToYen) + " Yen");
                } else if (converted == Integer.parseInt("8")) {
                    double yuanToPakistaniRupee = amountToConvert * CHINESE_YUAN_TO_PAKISTANI_RUPEE;
                    System.out.println(amountToConvert + " yuan = " + a.format(yuanToPakistaniRupee) + " Pakistani Rupee(s)");
                }
                break;

            case 4:
                if (converted == Integer.parseInt("1")) {
                    double pesosToDollar = amountToConvert / USA_DOLLAR_TO_MEXICAN_PESO;
                    System.out.println(amountToConvert + " peso(s) = " + a.format(pesosToDollar) + " Dollar(s)");
                } else if (converted == Integer.parseInt("2")) {
                    double pesosToEuro = amountToConvert / EURO_TO_MEXICAN_PESO;
                    System.out.println(amountToConvert + " yuan = " + a.format(pesosToEuro) + " Euro(s)");
                } else if (converted == Integer.parseInt("3")) {
                    double pesosToYuan = amountToConvert / CHINESE_YUAN_TO_MEXICAN_PESO;
                    System.out.println(amountToConvert + " peso(s) = " + a.format(pesosToYuan) + " Yuan");
                } else if (converted == Integer.parseInt("5")) {
                    double pesosToPound = amountToConvert / UK_POUND_TO_MEXICAN_PESO;
                    System.out.println(amountToConvert + " peso(s) = " + a.format(pesosToPound) + " Pound(s)");
                } else if (converted == Integer.parseInt("6")) {
                    double pesosToCanadianDollar = amountToConvert / CANADIAN_DOLLAR_TO_MEXICAN_PESO;
                    System.out.println(amountToConvert + " peso(s) = " + a.format(pesosToCanadianDollar) + " Canadian Dollar(s)");
                } else if (converted == Integer.parseInt("7")) {
                    double pesosToYen = amountToConvert / JAPANESE_YEN_TO_MEXICAN_PESO;
                    System.out.println(amountToConvert + " peso(s) = " + a.format(pesosToYen) + " Yen");
                } else if (converted == Integer.parseInt("8")) {
                    double pesosToPakistaniRupee = amountToConvert * MEXICAN_PESO_TO_PAKISTANI_RUPEE;
                    System.out.println(amountToConvert + " peso(s) = " + a.format(pesosToPakistaniRupee) + " Pakistani Rupee(s)");
                }
                break;

            case 5:
                if (converted == Integer.parseInt("1")) {
                    double euroToDollar = amountToConvert / USA_DOLLAR_TO_EURO;
                    System.out.println(amountToConvert + " euro(s) = " + a.format(euroToDollar) + " USA Dollar(s)");
                } else if (converted == Integer.parseInt("2")) {
                    double euroToPound = amountToConvert * EURO_TO_UK_POUND;
                    System.out.println(amountToConvert + " euro(s) = " + a.format(euroToPound) + "Pound(s)");
                } else if (converted == Integer.parseInt("3")) {
                    double euroToYuan = amountToConvert * EURO_TO_CHINESE_YUAN;
                    System.out.println(amountToConvert + " euro(s) = " + a.format(euroToYuan) + " Yuan");
                } else if (converted == Integer.parseInt("4")) {
                    double euroToPesos = amountToConvert / EURO_TO_MEXICAN_PESO;
                    System.out.println(amountToConvert + " euro(s) = " + a.format(euroToPesos) + " Peso(s)");
                } else if (converted == Integer.parseInt("6")) {
                    double euroToCanadianDollar = amountToConvert * EURO_TO_CANADIAN_DOLLAR;
                    System.out.println(amountToConvert + " euro(s) = " + a.format(euroToCanadianDollar) + " Canadian Dollar(s)");
                } else if (converted == Integer.parseInt("7")) {
                    double euroToYen = amountToConvert * EURO_TO_JAPANESE_YEN;
                    System.out.println(amountToConvert + " euro(s) = " + a.format(euroToYen) + " Yen");
                } else if (converted == Integer.parseInt("8")) {
                    double euroToPakistaniRupee = amountToConvert * EURO_TO_PAKISTANI_RUPEE;
                    System.out.println(amountToConvert + " euro(s) = " + a.format(euroToPakistaniRupee) + " Pakistani Rupee(s)");
                }
                break;

            case 6:
                if (converted == Integer.parseInt("1")) {
                    double canadianDollarToUSADollar = amountToConvert / USA_DOLLAR_TO_CANADIAN_DOLLAR;
                    System.out.println(amountToConvert + " canadian dollar(s) = " + a.format(canadianDollarToUSADollar) + " USA Dollar(s)");
                } else if (converted == Integer.parseInt("2")) {
                    double canadianDollarToPound = amountToConvert / UK_POUND_TO_CANADIAN_DOLLAR;
                    System.out.println(amountToConvert + " canadian dollar(s) = " + a.format(canadianDollarToPound) + "Pound(s)");
                } else if (converted == Integer.parseInt("3")) {
                    double canadianDollarToYuan = amountToConvert * CANADIAN_DOLLAR_TO_CHINESE_YUAN;
                    System.out.println(amountToConvert + " canadian dollar(s) = " + a.format(canadianDollarToYuan) + " Yuan");
                } else if (converted == Integer.parseInt("4")) {
                    double canadianDollarToPesos = amountToConvert / EURO_TO_MEXICAN_PESO;
                    System.out.println(amountToConvert + " canadian dollar(s) = " + a.format(canadianDollarToPesos) + " Peso(s)");
                } else if (converted == Integer.parseInt("5")) {
                    double canadianDollarToEuro = amountToConvert / EURO_TO_CANADIAN_DOLLAR;
                    System.out.println(amountToConvert + " canadian dollar(s) = " + a.format(canadianDollarToEuro) + " Euro(s)");
                } else if (converted == Integer.parseInt("7")) {
                    double canadianDollarToYen = amountToConvert * CANADIAN_DOLLAR_TO_JAPANESE_YEN;
                    System.out.println(amountToConvert + " canadian dollar(s) = " + a.format(canadianDollarToYen) + " Yen");
                } else if (converted == Integer.parseInt("8")) {
                    double canadianDollarToPakistaniRupee = amountToConvert * CANADIAN_DOLLAR_TO_PAKISTANI_RUPEE;
                    System.out.println(amountToConvert + " canadian dollar(s) = " + a.format(canadianDollarToPakistaniRupee) + " Pakistani Rupee(s)");
                }
                break;

            case 7:
                if (converted == Integer.parseInt("1")) {
                    double yenToUSADollar = amountToConvert / USA_DOLLAR_TO_JAPANESE_YEN;
                    System.out.println(amountToConvert + " yen = " + a.format(yenToUSADollar) + " USA Dollar(s)");
                } else if (converted == Integer.parseInt("2")) {
                    double yenToPound = amountToConvert / UK_POUND_TO_JAPANESE_YEN;
                    System.out.println(amountToConvert + " yen = " + a.format(yenToPound) + "Pound(s)");
                } else if (converted == Integer.parseInt("3")) {
                    double yenToYuan = amountToConvert / CHINESE_YUAN_TO_JAPANESE_YEN;
                    System.out.println(amountToConvert + " yen = " + a.format(yenToYuan) + " Yuan");
                } else if (converted == Integer.parseInt("4")) {
                    double yenToPesos = amountToConvert * JAPANESE_YEN_TO_MEXICAN_PESO;
                    System.out.println(amountToConvert + " yen = " + a.format(yenToPesos) + " Peso(s)");
                } else if (converted == Integer.parseInt("5")) {
                    double yenToEuro = amountToConvert / EURO_TO_JAPANESE_YEN;
                    System.out.println(amountToConvert + " yen = " + a.format(yenToEuro) + " Euro");
                } else if (converted == Integer.parseInt("6")) {
                    double yenToCanadianDollar = amountToConvert / CANADIAN_DOLLAR_TO_JAPANESE_YEN;
                    System.out.println(amountToConvert + " yen = " + a.format(yenToCanadianDollar) + " Canadian Dollar");
                } else if (converted == Integer.parseInt("8")) {
                    double yenToPakistaniRupee = amountToConvert * JAPANESE_YEN_TO_PAKISTANI_RUPEE;
                    System.out.println(amountToConvert + " yen = " + a.format(yenToPakistaniRupee) + " Pakistani Rupee(s)");
                }
                break;

            case 8:
                if (converted == Integer.parseInt("1")) {
                    double pakistaniRupeeToUSADollar = amountToConvert / USA_DOLLAR_TO_PAKISTANI_RUPEE;
                    System.out.println(amountToConvert + " pakistani rupee = " + a.format(pakistaniRupeeToUSADollar) + " USA Dollar(s)");
                } else if (converted == Integer.parseInt("2")) {
                    double pakistaniRupeeToPound = amountToConvert / UK_POUND_TO_PAKISTANI_RUPEE;
                    System.out.println(amountToConvert + " pakistani rupee = " + a.format(pakistaniRupeeToPound) + "Pound(s)");
                } else if (converted == Integer.parseInt("3")) {
                    double pakistaniRupeeToYuan = amountToConvert / CHINESE_YUAN_TO_PAKISTANI_RUPEE;
                    System.out.println(amountToConvert + " pakistani rupee = " + a.format(pakistaniRupeeToYuan) + " Yuan");
                } else if (converted == Integer.parseInt("4")) {
                    double pakistaniRupeeToPesos = amountToConvert / MEXICAN_PESO_TO_PAKISTANI_RUPEE;
                    System.out.println(amountToConvert + " pakistani rupee = " + a.format(pakistaniRupeeToPesos) + " Peso(s)");
                } else if (converted == Integer.parseInt("5")) {
                    double pakistaniRupeeToEuro = amountToConvert / EURO_TO_PAKISTANI_RUPEE;
                    System.out.println(amountToConvert + " pakistani rupee = " + a.format(pakistaniRupeeToEuro) + " Euro");
                } else if (converted == Integer.parseInt("6")) {
                    double pakistaniRupeeToCanadianDollar = amountToConvert / CANADIAN_DOLLAR_TO_PAKISTANI_RUPEE;
                    System.out.println(amountToConvert + " pakistani rupee = " + a.format(pakistaniRupeeToCanadianDollar) + " Canadian Dollar");
                } else if (converted == Integer.parseInt("7")) {
                    double pakistaniRupeeToYen = amountToConvert / JAPANESE_YEN_TO_PAKISTANI_RUPEE;
                    System.out.println(amountToConvert + " pakistani rupee = " + a.format(pakistaniRupeeToYen) + " Yen");
                }
                break;

        }
    }
}




