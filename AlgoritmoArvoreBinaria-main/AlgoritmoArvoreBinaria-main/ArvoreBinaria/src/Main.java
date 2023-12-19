// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(6);
        arvore.inserir(4);
        arvore.inserir(35);
        arvore.inserir(55);
        arvore.inserir(25);
        arvore.inserir(15);
        arvore.inserir(9);

        arvore.imprimirArvore();
        arvore.encontrar(10);

        System.out.println("=================");
        arvore.imprimirArvore();

        }
    }