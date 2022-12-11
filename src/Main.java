import java.time.LocalDate;

public class Main {
    private final static int CURRENTYEAR = LocalDate.now().getYear();
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("//task1 ");
        //task6
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a*(b+(c-d*e));
        System.out.println(result);


        printVersionOS(1998,0);

    }
    public static boolean isNowYear(int year){
        return year == CURRENTYEAR;
    }
    public static String getVersionOS(int versionOS){
        if (versionOS == 0){
            return "IOS";
        }
        else if ( versionOS == 1){
            return "Android";
        }
        return "Введите допустимое значение";
    }
    public static void printVersionOS(int year, int versionOS){
        if(isNowYear(year)){
            System.out.println("Установите полную версию для вашего " + getVersionOS(versionOS));
        }
        else {
            System.out.println("Установите lite- версию для вашего " + getVersionOS(versionOS));
        }
    }
}