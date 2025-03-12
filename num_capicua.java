//comprobar si un numero es capicua
import java.util.Scanner;
public class num_capicua {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,x,r,p;
        System.out.println("introduce un numero");
        n=leer.nextInt();
        p=n; r=0;
        while(n>0){
            x=n % 10;
            r=r*10+x;
            n=n/10;
        }
        if(p==r){
            System.out.println("el numero "+p+" es capicua");
        }else{
            System.out.println("el numero "+p+" no es capicua");
        }        
    }    
}
