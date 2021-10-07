package Get_Set;

public class Time {
    private String nomeTime;

    public void setTime(String meuTime){
        nomeTime = meuTime;
    } 
    public String getTime(){
        return nomeTime;
    }

    public void mostraTime(){
        System.out.println("Seu time é: " + getTime());
    }
}
