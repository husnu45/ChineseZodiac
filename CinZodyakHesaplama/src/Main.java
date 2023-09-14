
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Chinese astrology, which has been used for 4,000 years, describes people with 12 different signs and symbols. The Chinese Zodiac is a ring of animals, each representing one of the 12 signs, and it is arranged in equal intervals of 10 degrees. It has little to do with stars.");
        System.out.println("***************************************************************************************************************************************************************************************************************************************************************************************");
        Scanner getBirthYear = new Scanner(System.in);
        
        System.out.print("Enter Your Birth Year : ");
        
        int birthYear = getBirthYear.nextInt();
        
        String chineseZodiac = "";

        switch (birthYear % 12) {
            case 0:
                chineseZodiac = "Monkey";
                break;
            case 1:
                chineseZodiac = "Rooster";
                break;
            case 2:
                chineseZodiac = "Dog";
                break;
            case 3:
                chineseZodiac = "Pig";
                break;
            case 4:
                chineseZodiac = "Mouse";
                break;
            case 5:
                chineseZodiac = "Ox";
                break;
            case 6:
                chineseZodiac = "Tiger";
                break;
            case 7:
                chineseZodiac = "Rabbit";
                break;
            case 8:
                chineseZodiac = "Dragon";
                break;
            case 9:
                chineseZodiac = "Snake";
                break;
            case 10:
                chineseZodiac = "Horse";
                break;
            case 11:
                chineseZodiac = "Sheep";
                break;
        }

        System.out.println("Your Chinese Zodiac is : " + chineseZodiac);
        getBirthYear.close();
    }
        
        
        
    }
    

