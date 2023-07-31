public class Demo6D{
    public static void main(String[] args) {
        String bold = "\033[1m";
        String reset = "\033[0m" ;
        String col1 = "\033[34m";
        String col2 = "\033[32m" ;
        String col3 = "\033[35m" ;
        System.out.println("+"+"-".repeat(7)+"+"+"-".repeat(10)+"+"+"-".repeat(7)+"+");
        System.out.printf("|%s%-7s%s|%1$s%10s%3$s|%1$s%-7s%3$s| \n",bold," ITEM",reset," QUANTITY "," PRICE ") ;
        System.out.println("+"+"\033[32m-\033[0m".repeat(7)+"+"+"-".repeat(10)+"+"+"\033[32m-\033[0m".repeat(7)+"+");
        System.out.printf("|%7s|%s%10d%s|%s %s%s%-5.2f%s| \n","Apples",col1,5,reset,col2,"$",col3,0.99,reset);
        System.out.printf("|%7s|%s%10d%s|%s %s%s%-5.2f%s| \n","Oranges",col1,10,reset,col2,"$",col3,1.49,reset);
        System.out.println("+"+"\033[32m-\033[0m".repeat(7)+"+"+"-".repeat(10)+"+"+"\033[32m-\033[0m".repeat(7)+"+");
    }
}       