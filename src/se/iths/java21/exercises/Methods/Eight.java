package se.iths.java21.exercises.Methods;

public class Eight {

    public static void main(String[] args) {
        String date = "2000-11-04";
        if(date.length() == 10){
            System.out.println(year(date));
        }else
            System.out.println("Invaild");

    }

    public static String year(String date){
        return date.substring(0, 4);
    }
}
