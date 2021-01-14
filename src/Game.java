public class Game {

    private int numberRounds;
    private int player1Wins;
    private int player2Wins;
    private Hands player1Hand;
    private Hands player2Hand;
    private Player player1;
    private Player player2;
    private Result result;


    public Game (int numberRounds) {
        this.numberRounds = numberRounds;
        player1 = new Player("Carlos");
        player2 = new Player("Aristides");
        player1Wins = 0;
        player2Wins = 0;
        result = new Result();
    }

    public void playGame () {

        while (!checkFinishedGame()) {

            player1Hand = player1.chooseHand();
            player2Hand = player2.chooseHand();

            System.out.println(player1.getName() + " has chosen " + player1Hand);
            System.out.println(player2.getName() + " has chosen " + player2Hand);

            switch (result.checkResult(player1Hand, player2Hand)) {
                case 0 -> System.out.println("\n Draw Round \n");
                case 1 -> {
                    System.out.println("\n" + player1.getName() + " has won the round! \n");
                    player1Wins++;
                }
                case 2 -> {
                    System.out.println("\n" + player2.getName() + " has wont the round! \n");
                    player2Wins++;
                }
                default -> System.out.println("An Error Has Occurred");
            }

            if(player1Wins == numberRounds) {
                System.out.println("\n\n" + player1.getName() + " HAS WON THE GAME!!");
            }
            if (player2Wins == numberRounds) {
                System.out.println("\n\n" + player2.getName() + " HAS WON THE GAME!!");
            }

        }
    }

    public boolean checkFinishedGame() {

        return player1Wins == numberRounds || (player2Wins == numberRounds);

    }

}
