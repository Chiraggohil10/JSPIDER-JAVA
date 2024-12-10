package NumberBasic;
public class pr31 {
public static void main(String[] args) {
    int startYear=2000,endYear=2500;
    for(int year= startYear;year<=endYear;year++){
        if (year%4==0&&year%100!=0||year%400==0) {
            System.out.println(year+" is a leap year");
        }
    }
}  
}