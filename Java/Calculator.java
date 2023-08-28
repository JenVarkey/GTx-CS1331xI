import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an operation:");
        String operation = input.nextLine();
        operation = operation.toLowerCase();
        switch(operation){
            case "add":
                System.out.println("Enter two integers:");
                String answerOne = input.nextLine();
                int countOne = 0;
                int numOfPointsOne = 0;
                int letterCount1 = 0;
                for(int i = 0; i < answerOne.length(); i++){
                    if(answerOne.substring(i, i+1).equals(" ")){
                        countOne++;
                    }
                    if(answerOne.substring(i, i+1).equals(".")){
                        numOfPointsOne++;
                    }
                    if(Character.isLetter(answerOne.charAt(i))){
                        letterCount1++;
                    }
                }

                if((!(countOne == 1) || (answerOne.substring(0, 1).equals(" ")
                        || answerOne.substring(answerOne.length()-1).equals(" "))) || numOfPointsOne > 0){
                    System.out.println("Invalid input entered. Terminating...");
                } else if (letterCount1 > 0){
                    System.out.println("Invalid input entered. Terminating...");
                }else{
                    int addOne = Integer.parseInt(answerOne.substring(0, answerOne.indexOf(" ")));
                    int addTwo = Integer.parseInt(answerOne.substring(answerOne.indexOf(" ") + 1));
                    System.out.println("The Answer is: " + (addOne + addTwo));
                    System.out.println("Terminating...");
                }
                break;
            case "subtract":
                System.out.println("Enter two integers:");
                String answerTwo = input.nextLine();
                int countTwo = 0;
                int numOfPointsTwo = 0;
                int letterCount2 = 0;
                for(int i = 0; i < answerTwo.length(); i++){
                    if(answerTwo.substring(i, i+1).equals(" ")){
                        countTwo++;
                    }
                    if(answerTwo.substring(i, i+1).equals(".")){
                        numOfPointsTwo++;
                    }
                    if(Character.isLetter(answerTwo.charAt(i))){
                        letterCount2++;
                    }
                }
                if((!(countTwo == 1) || (answerTwo.substring(0, 1).equals(" ") || answerTwo.substring(answerTwo.length()-1).equals(" ")))
                        || numOfPointsTwo > 0){
                    System.out.println("Invalid input entered. Terminating...");
                } else if (letterCount2 > 0){
                    System.out.println("Invalid input entered. Terminating...");
                } else {
                    int subOne = Integer.parseInt(answerTwo.substring(0, answerTwo.indexOf(" ")));
                    int subTwo = Integer.parseInt(answerTwo.substring(answerTwo.indexOf(" ") + 1));
                    System.out.println("The Answer is: " + (subOne - subTwo));
                    System.out.println("Terminating...");
                }
                break;
            case "multiply":
                System.out.println("Enter two doubles:");
                String answerThree = input.nextLine();
                int countThree = 0;
                int letterCount3 = 0;
                for(int i = 0; i < answerThree.length(); i++){
                    if(answerThree.substring(i, i+1).equals(" ")){
                        countThree++;
                    }
                    if(Character.isLetter(answerThree.charAt(i))){
                        letterCount3++;
                    }
                }
                if(!(countThree == 1) && (answerThree.substring(0, 1).equals(" ") || answerThree.substring(answerThree.length()-1).equals(" "))){
                    System.out.println("Invalid Input. Terminating...");
                } else if (letterCount3 > 0){
                    System.out.println("Invalid input entered. Terminating...");
                } else {
                    double multiOne = Double.parseDouble(answerThree.substring(0, answerThree.indexOf(" ")));
                    double multiTwo = Double.parseDouble(answerThree.substring(answerThree.indexOf(" ") + 1));
                    double product = multiOne * multiTwo;
                    System.out.print("The Answer is: ");
                    System.out.printf("%,.2f", product);
                    System.out.println();
                    System.out.println("Terminating...");
                }
                break;
            case "divide":
                System.out.println("Enter two doubles:");
                String answerFour = input.nextLine();
                int countFour = 0;
                int letterCount4 = 0;
                for(int i = 0; i < answerFour.length(); i++){
                    if(answerFour.substring(i, i+1).equals(" ")){
                        countFour++;
                    }
                    if(Character.isLetter(answerFour.charAt(i))){
                        letterCount4++;
                    }
                }
                if(!(countFour == 1) && (answerFour.substring(0, 1).equals(" ") || answerFour.substring(answerFour.length()-1).equals(" "))){
                    System.out.println("Invalid Input. Terminating...");
                }else if (letterCount4 > 0){
                    System.out.println("Invalid input entered. Terminating...");
                } else {
                    double divideOne = Double.parseDouble(answerFour.substring(0, answerFour.indexOf(" ")));
                    double divideTwo = Double.parseDouble(answerFour.substring(answerFour.indexOf(" ") + 1));
                    if (divideTwo == 0) {
                        System.out.println("Invalid input entered. Terminating...");
                    } else {
                        double quotient = divideOne / divideTwo;

                        System.out.print("The Answer is: ");
                        System.out.printf("%,.2f", quotient);
                        System.out.println();
                        System.out.println("Terminating...");
                    }
                }
                break;
            case "alphabetize":
                System.out.println("Enter two words:");
                String answerFive = input.nextLine();
                int countFive = 0;
                int numberCount = 0;
                for(int i = 0; i < answerFive.length(); i++){
                    if(answerFive.substring(i, i+1).equals(" ")){
                        countFive++;
                    }
                    if(Character.isDigit(answerFive.charAt(i))){
                        numberCount++;
                    }
                }
                if(!(countFive == 1) && (answerFive.substring(0, 1).equals(" ") || answerFive.substring(answerFive.length()-1).equals(" "))){
                    System.out.println("Invalid input entered. Terminating...");
                } else if (numberCount > 0){
                    System.out.println("Invalid input entered. Terminating...");
                } else {
                    String wordOne = answerFive.substring(0, answerFive.indexOf(" "));
                    String wordTwo = answerFive.substring(answerFive.indexOf(" ") + 1);
                    int compare = wordOne.toLowerCase().compareTo(wordTwo.toLowerCase());
                    if (compare == 0) {
                        System.out.println("Answer: Chicken or Egg.");
                    } else if (compare < 0) {
                        System.out.println("Answer: " + wordOne + " comes before " + wordTwo + " alphabetically.");
                    } else {
                        System.out.println("Answer: " + wordTwo + " comes before " + wordOne + " alphabetically.");
                    }
                }
                break;
            default:
                System.out.println("Invalid input entered. Terminating...");
                break;
        }
    }
}