public class Ejercicio {
    public static void main (String[] args){
        String name = "mary";
        int position = 1500;

        int score = calculateHighScorePosition(position);
        displayHighScorePosition(name, score);

        score = calculateHighScorePosition(900);
        displayHighScorePosition("maty", score);

        score = calculateHighScorePosition(400);
        displayHighScorePosition("mabel", score);

        score = calculateHighScorePosition(50);
        displayHighScorePosition("sole", score);
    }
    public static void displayHighScorePosition(String name,int score){
        System.out.println(name + score );

    }
    public static int calculateHighScorePosition(int position){
        if (position >= 1000){
            return 1;
        }else if (position >= 500){
            return 2;
        } else if (position >=100 ){
            return 3;
        }
        return 4;
    }

}
