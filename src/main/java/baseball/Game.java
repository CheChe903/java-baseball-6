package baseball;


import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class Game {

    static ArrayList<Integer> computerNums;


    /**
     * Game 을 시작하는 start() 메서드
     * Application 에서 인스턴스화 하여 이 메서드를 부름으로써 게임을 시작한다.
     */
    public void start() {

        boolean isStartGame = true;

        while(isStartGame) {

            computerNums = getComputerNums();

            startRound();

            isStartGame = checkStart();
        }
    }


    /**
     * 라운드 진행 startRound() 메서드
     */
    public void startRound() {

    }


    /**
     * 게임이 끝난 후, 재시작을 묻는 checkStart() 메서드
     * @return Boolean 형 반환, true => 재시작, false => 종료
     */
    public boolean checkStart() {

        return true;
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


    /**
     * 사용자 입력 예외를 잡는 checkException() 메서드
     * 1. 게임 시작 및 종료 선택 시, 1 또는 2의 입력이 아닐 때
     * 2. 게임 라운드 진행 시, 3개의 숫자가 아닌, 2개 이하, 4개 이상의 숫자가 입력될 때
     */
    public void checkException() {

    }

}
