public class Demo4{
    public static void main(String[] args) {
        int day = 28 ;
        int month = 12 ;
        int year = 2023 ;
        int hour = 23 ;
        int minute = 59 ;
        int second = 59 ;
        String colString1= "\033[32m" ;
        String colString2= "\033[33m" ;
        String colString3= "\033[34m" ;
        String colString4= "\033[35m" ;
        String colString5= "\033[36m" ;
        String colString6= "\033[31m" ;
        String reSet = "\033[0m" ;
        System.out.printf("%s%s%s/%s%s%3$s/%s%s %s%s%3$s:%s%s%3$s:%s%s",colString1,day,reSet,colString2,month,colString3,year,colString4,hour,colString5,minute,colString6,second);
    }
}