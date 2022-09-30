package baseball.views;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class InputViews {
    private static String NUMBER_FORMAT_ERROR_MESSAGE = "숫자 형식을 입력해주세요.";

    public static int getBallNumberByPlayer() {
        System.out.println("숫자를 입력해주세요");
        String threeNumbersByPlayer = "0";
        while(!validateInt(threeNumbersByPlayer)){
            threeNumbersByPlayer = Console.readLine();
        }
        return Integer.parseInt(threeNumbersByPlayer);
    }

    public static boolean validateInt(String stringValue){
        try{
            Integer.parseInt(stringValue);

        }catch(NumberFormatException e){
            System.out.println(NUMBER_FORMAT_ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean validateMaxNumber(int maxNumber){

        return false;
    }
}
