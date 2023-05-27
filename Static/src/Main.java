public class Main {
    public static void main(String[] args) {
        Player ismail=new Player("ismail");
        ismail.addScore(20);
        ismail.addScore(100);
        ismail.addScore(29);

        Player hossain=new Player("hossain");
        hossain.addScore(19);
        hossain.addScore(28);
        hossain.addScore(99);

        System.out.println(ismail);
        System.out.println(hossain);
        System.out.println("Total Score= "+Player.getTotalScore());

    }
}