package Get_Set;
import java.util.Scanner;

public class TimeTeste {
    public static void main(String[] args) {
        String time;
        Time torcida = new Time();
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual time voce torce?: ");
        time = input.nextLine();

        torcida.setTime(time);
        torcida.mostraTime();


    }
    
}
