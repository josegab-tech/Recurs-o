import java.util.Scanner;

public class App {

    static int potencia(int base, int exp){
        if(exp ==0){
            System.out.println("Caso base\n 1");
            return 1;
        }else{
            int retorno = base* potencia(base, exp-1);
            System.out.println("Instancia pot("+base+"^"+exp+")="+retorno);
            return retorno;
        }
    }
    static int fatorialComentado(int n){
        System.out.println("fat("+n+")");
        if(n==0){
            System.out.println("Caso base\n 1");
            return 1;
        }
            int retorno = n* fatorialComentado(n-1);
            System.out.println("Instacia fat("+n+")="+retorno);
            return retorno;
    }

    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        System.out.println("Entre com um valor");
        int num = leia.nextInt();
        System.out.println("Fatorial:"+ fatorialComentado(num));
        int nump, pot;
        System.out.println("Digite a base: ");
        nump = leia.nextInt();
        System.out.println("Digite  a potencia: ");
        pot = leia.nextInt();
        System.out.println("Potencia:"+ potencia(nump, pot));
    }
}