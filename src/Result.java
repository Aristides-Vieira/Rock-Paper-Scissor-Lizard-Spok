import java.util.HashMap;

public class Result {

    private final HashMap<Hands, HashMap<Hands, Integer>> map = new HashMap<>();

    public Result() {
        HashMap<Hands, Integer> secondMap = new HashMap<>();
        HashMap<Hands, Integer> thirdMap = new HashMap<>();
        HashMap<Hands, Integer> fourthMap = new HashMap<>();
        HashMap<Hands, Integer> fifthMap = new HashMap<>();
        HashMap<Hands, Integer> sixthMap = new HashMap<>();

        secondMap.put(Hands.ROCK, 0);
        secondMap.put(Hands.PAPER, 2);
        secondMap.put(Hands.SCISSORS, 1);
        secondMap.put(Hands.LIZARD, 1);
        secondMap.put(Hands.SPOK, 2);

        map.put(Hands.ROCK, secondMap);

        thirdMap.put(Hands.ROCK, 1);
        thirdMap.put(Hands.PAPER, 0);
        thirdMap.put(Hands.SCISSORS, 2);
        thirdMap.put(Hands.LIZARD, 2);
        thirdMap.put(Hands.SPOK, 1);

        map.put(Hands.PAPER, thirdMap);

        fourthMap.put(Hands.ROCK, 2);
        fourthMap.put(Hands.PAPER, 1);
        fourthMap.put(Hands.SCISSORS, 0);
        fourthMap.put(Hands.LIZARD, 1);
        fourthMap.put(Hands.SPOK, 2);

        map.put(Hands.SCISSORS, fourthMap);

        fifthMap.put(Hands.ROCK, 2);
        fifthMap.put(Hands.PAPER, 1);
        fifthMap.put(Hands.SCISSORS, 2);
        fifthMap.put(Hands.LIZARD, 0);
        fifthMap.put(Hands.SPOK, 1);

        map.put(Hands.LIZARD, fifthMap);

        sixthMap.put(Hands.ROCK, 1);
        sixthMap.put(Hands.PAPER, 2);
        sixthMap.put(Hands.SCISSORS, 1);
        sixthMap.put(Hands.LIZARD, 2);
        sixthMap.put(Hands.SPOK, 0);

        map.put(Hands.SPOK, sixthMap);
    }


    public Integer checkResult(Hands p1Hand, Hands p2Hands) {
       return map.get(p1Hand).get(p2Hands);
    }

}
