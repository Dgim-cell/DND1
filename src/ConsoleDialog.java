import java.util.Scanner;

public class ConsoleDialog {

    static private int chekAns (String ans, int n){
        try {
            int a = Integer.parseInt(ans);
            if (0 < a &&  a <= n)
                return a;
            else
                return -1;
        }catch (Exception e){
            return -1;
        }
    }

    static public int  show (Scanner sc, String text, String [] items){
        System.out.println(text);
        while (true) {
            System.out.println();
            System.out.println(Strings.CHOCE_TEXT);
            for (int i = 0; i < items.length; i++)
                System.out.println((i + 1) + ". " + items[i]);
            String ans = sc.nextLine();
            int res = chekAns(ans, items.length);
            if (res != -1)
                return res;
            else
                System.out.println(Strings.ERROR_TEXT);
        }
    }
}
