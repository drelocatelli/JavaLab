public class formata {

    public static void clear() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    public static void title(String title){
        System.out.printf("=========== %s ===========\n", title);
    }
    
}