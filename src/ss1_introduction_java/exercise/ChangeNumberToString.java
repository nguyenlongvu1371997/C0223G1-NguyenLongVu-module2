package ss1_introduction_java.exercise;

import java.util.Scanner;

public class ChangeNumberToString {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("nhập số bạn muốn đọc thành chữ ");
        String number = sr.nextLine();

        String units = "";
        String dozens = "";
        String hundreds = "";
        if(number.length()==1) {
            switch (number.charAt(number.length() - 1)) {
                case '1':
                    units = "one";
                    break;
                case '2':
                    units = "two";
                    break;
                case '3':
                    units = "three";
                    break;
                case '4':
                    units = "four";
                    break;
                case '5':
                    units = "five";
                    break;
                case '6':
                    units = "six";
                    break;
                case '7':
                    units = "seven";
                    break;
                case '8':
                    units += "eight";
                    break;
                case '9':
                    units = "nine";
                    break;
                default:
                    units = "zero";
                    break;
            }
        }else if (number.length() == 2) {
            switch (number.charAt(number.length() - 1)) {
                case '1':
                    units = "one";
                    break;
                case '2':
                    units = "two";
                    break;
                case '3':
                    units = "three";
                    break;
                case '4':
                    units = "four";
                    break;
                case '5':
                    units = "five";
                    break;
                case '6':
                    units = "six";
                    break;
                case '7':
                    units = "seven";
                    break;
                case '8':
                    units += "eight";
                    break;
                case '9':
                    units = "nine";
                    break;
                default:
                    break;
            }
            switch (number.charAt(number.length() - 2)) {
                case '1':
                    switch (number.charAt(number.length() - 1)) {
                        case '1':
                            units = "eleven";
                            break;
                        case '2':
                            units = "twelve";
                            break;
                        case '3':
                            units = "thirteen";
                            break;
                        case '4':
                            units = "fourteen";
                            break;
                        case '5':
                            units = "fifteen";
                            break;
                        case '6':
                            units = "sixteen";
                            break;
                        case '7':
                            units = "seventeen";
                            break;
                        case '8':
                            units = "eighteen";
                            break;
                        case '9':
                            units = "nineteen";
                            break;
                        default:
                            break;
                    }

                    break;
                case '2':
                    dozens = "twenty";
                    break;
                case '3':
                    dozens = "thirdty";
                    break;
                case '4':
                    dozens = "forty";
                    break;
                case '5':
                    dozens = "fifty";
                    break;
                case '6':
                    dozens = "sixty";
                    break;
                case '7':
                    dozens = "seventy";
                    break;
                case '8':
                    dozens = "eighty";
                    break;
                case '9':
                    dozens = "ninety";
                    break;
                default:
                    break;
            }
        } else if(number.length() == 3) {
            switch (number.charAt(number.length() - 1)) {
                case '1':
                    units = "one";
                    break;
                case '2':
                    units = "two";
                    break;
                case '3':
                    units = "three";
                    break;
                case '4':
                    units = "four";
                    break;
                case '5':
                    units = "five";
                    break;
                case '6':
                    units = "six";
                    break;
                case '7':
                    units = "seven";
                    break;
                case '8':
                    units += "eight";
                    break;
                case '9':
                    units = "nine";
                    break;
                default:
                    break;
            }
            switch (number.charAt(number.length() - 2)) {
                case '1':
                    switch (number.charAt(number.length() - 1)) {
                        case '1':
                            units = "eleven";
                            break;
                        case '2':
                            units = "twelve";
                            break;
                        case '3':
                            units = "thirteen";
                            break;
                        case '4':
                            units = "fourteen";
                            break;
                        case '5':
                            units = "fifteen";
                            break;
                        case '6':
                            units = "sixteen";
                            break;
                        case '7':
                            units = "seventeen";
                            break;
                        case '8':
                            units = "eighteen";
                            break;
                        case '9':
                            units = "nineteen";
                            break;
                        default:
                            break;
                    }

                    break;
                case '2':
                    dozens = "twenty";
                    break;
                case '3':
                    dozens = "thirdty";
                    break;
                case '4':
                    dozens = "forty";
                    break;
                case '5':
                    dozens = "fifty";
                    break;
                case '6':
                    dozens = "sixty";
                    break;
                case '7':
                    dozens = "seventy";
                    break;
                case '8':
                    dozens = "eighty";
                    break;
                case '9':
                    dozens = "ninety";
                    break;
                default:
                    break;
            }
            switch (number.charAt(number.length() - 3)) {
                case '1':
                    hundreds = "one hundred";
                    break;
                case '2':
                    hundreds = "two hundreds";
                    break;
                case '3':
                    hundreds = "three hundreds";
                    break;
                case '4':
                    hundreds = "four hundreds";
                    break;
                case '5':
                    hundreds = "five hundreds";
                    break;
                case '6':
                    hundreds = "six hundreds";
                    break;
                case '7':
                    hundreds = "seven hundreds";
                    break;
                case '8':
                    hundreds = "eight hundreds";
                    break;
                case '9':
                    hundreds = "nine hundreds";
                    break;
                default:
                    break;
            }
        }
        System.out.println(hundreds + " " + dozens + " " + units);
    }
}
