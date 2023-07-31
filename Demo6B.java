public class Demo6B{
    public static void main(String[] args) {
        String coloString = "\033[32m" ;
        System.out.println("+"+"-".repeat(10)+"+"+"-".repeat(5)+"+");
        System.out.printf("|\033[1;36m%-10s\033[0m|\033[1;36m%-5s\033[0m| \n","NAME","AGE");
        System.out.println("+"+"-".repeat(10)+"+"+"-".repeat(5)+"+");
        System.out.printf("|%-10s|%-5s| \n","Alice","24");
        System.out.printf("|%-10s|%-5s| \n","Bob","30");
        System.out.println("+"+"-".repeat(10)+"+"+"-".repeat(5)+"+");
    }
}