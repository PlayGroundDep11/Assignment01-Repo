public class Demo6C{
    public static void main(String[] args) {
        String bold = "\033[1m";
        String reset = "\033[0m" ;
        String Col1 = "\033[35m";
        String Col2 = "\033[32m";
        System.out.println("+"+"-".repeat(15)+"+"+"-".repeat(10)+"+"+"-".repeat(10)+"+");
        System.out.printf("|%s%-15s%s|%1$s%-10s%3$s|%1$s%-10s%3$s| \n",bold,"CITY",reset,"STATE","POPULATION") ;
        System.out.println("+"+"-".repeat(15)+"+"+"-".repeat(10)+"+"+"-".repeat(10)+"+");
        System.out.printf("|%-15s|%-10s|%s%,10d%s| \n","Los Angeles","california",Col1,3966936,reset) ;
        System.out.printf("|%s%-3s%s %-11s|%1$s%2$-3s%3$s %4$-6s|%s%,10d%s| \n",Col2,"New",reset,"York",Col1,8336817,reset);
        System.out.println("+"+"-".repeat(15)+"+"+"-".repeat(10)+"+"+"-".repeat(10)+"+");
    }
}