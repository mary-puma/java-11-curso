public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(65,45)); //imprime el string que recibe del method
        System.out.println(getDurationString(-6));         //imprime el string que recibe del method

    }
    public static String getDurationString(int minutes, int seconds){
        if (minutes >= 0 && seconds >=0 && seconds <=59) {
            int hours = minutes / 60;
            minutes %=60;
           return hours+"h" + minutes+"m" +seconds+"s"; // return string
        }
        return "Invalid Value";
    }

    public static String getDurationString(int seconds){
        if (seconds >= 0){
            int minutes = seconds/60;
            seconds %=60;
            return getDurationString(minutes,seconds);  // los minutes and seconds calculados de los envia al metodo y este devuelve un string y a la vez este string lo devuelve al metodo principal para que imprima
        }
        return "Invalid Value";
    }
}
