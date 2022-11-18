public class RollingDie {
    static void rollTheDie() {
        int min = 1;
        int max = 6;
        int dieNumber = (int) Math.floor(Math.random() * (max - min) + min);

        System.out.println("Die = " + dieNumber);
    }
    static void checkPlayer(int check) {

        // check They are no play, Ladder or Snake
        switch (check) {
            case 0:
                System.out.println("They are No play");
                break;
            case 1:
                System.out.println("Ladder");
                rollTheDie();
                break;
            case 2:
                System.out.println("Snake");
                rollTheDie();
                break;
            default:
                System.out.println("Please try again");
        }
    }
    public static void main(String[] args) {
        int position = 0;
        System.out.println("Player in the position = " + position);
        // Generate random Numbers
        int check = (int) Math.floor((Math.random() * 10) % 3);
        // Function call
        checkPlayer(check);

    }
}
