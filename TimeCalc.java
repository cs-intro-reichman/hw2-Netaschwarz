public class TimeCalc {
    public static void main(String[] args) {
        int hrs = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int min = Integer.parseInt(""+ args[0].charAt(3) + args[0].charAt(4));
        int addMin = Integer.parseInt(args[1]);
        int totMin = (hrs*60)+ min + addMin;
        int totHr = (totMin/60);
        int new_min = totMin -(totHr*60);
        int new_hour = totHr%24;
        String minutes;
        String hours;
        if (new_min<10){
            minutes = "0"+ new_min;
        }
        else {
            minutes = "" + new_min;
        }
        if (new_hour<10){
            hours = "0" +new_hour;
        }
        else{
            hours = "" + new_hour;
        }
        System.out.println(hours + ":" + minutes);






        

        
    }
}
