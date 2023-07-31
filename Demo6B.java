public class Demo6B{
    public static void main(String[] args) {
        String coloString = "\033[35m" ;
        String reset = "\033[0m" ;
        System.out.println("+"+"-".repeat(10)+"+"+"-".repeat(5)+"+");
        System.out.printf("|\033[1;36m%-10s\033[0m|\033[1;36m%-5s\033[0m| \n","NAME","AGE");
        System.out.println("+"+"-".repeat(10)+"+"+"-".repeat(5)+"+");
        System.out.printf("|%-10s|%s%-5s%s| \n","Alice",coloString,"24",reset);
        System.out.printf("|%-10s|%s%-5s%s| \n","Bob",coloString,"30",reset);
        System.out.println("+"+"-".repeat(10)+"+"+"-".repeat(5)+"+");
    }
}