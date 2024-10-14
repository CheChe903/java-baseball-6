package baseball;


import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class Game {

    static ArrayList<Integer> computerNums;


    public void start() {
    }


    /**
     * 랜덤 수 3개를 갖는 리스트를 만드는 getComputerNums() 메서드
     * @return 3개의 랜덤 수를 갖는 ArrayList 반환
     */

    public ArrayList<Integer> getComputerNums() {

        ArrayList<Integer> computerNums = new ArrayList<>();

        while(computerNums.size() < 3) {
            int num = Randoms.pickNumberInRange(1, 9);
            if(!computerNums.contains(num)) {
                computerNums.add(num);
            }
        }

        return computerNums;
    }
}
