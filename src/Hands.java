public enum Hands {

    ROCK,
    SCISSORS,
    PAPER,
    LIZARD,
    SPOK;

    public static Hands randomHand() {
        int random = (int) Math.floor(Math.random() * 5);

        return switch (random) {
            case 0 -> ROCK;
            case 1 -> SCISSORS;
            case 2 -> PAPER;
            case 3 -> LIZARD;
            default -> SPOK;
        };
    }

}
