public class Impressora{
    //tipo de retorno: void
    //nome: exibir
    //lista de parâmetros: (float f)
    //corpo: {...}
    //f: 2.5 -> 2.5
    void exibir(float f){
        System.out.println(f);
    }
    //f1: 2.7 e f2: 5.6 -> 2.7, 5.6
    void exibir (float f1, float f2){
        System.out.printf("%.2f, %.2f\n", f1, f2);
        System.out.println(f1 + ", " + f2);
        //System.out.println(f1, f2);
        String aux = String.format("%.2f, %.2f\n", f1, f2);
        System.out.println(aux);
    }


}