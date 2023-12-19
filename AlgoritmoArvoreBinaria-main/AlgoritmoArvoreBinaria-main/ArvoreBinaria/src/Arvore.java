import java.util.Scanner;

public class Arvore<T extends Comparable> {

    private No<T> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void inserir(T valor) {
        No<T> novoNo = new No<T>(valor);
        if (raiz == null) {
            this.raiz = novoNo;
        } else {
            No<T> atual = this.raiz;
            // ate conseguir adicionar o no na arvore
            while (true) {
                if (novoNo.getvalor().compareTo(atual.getvalor()) == -1) { // 0 quando e igual, -1 menor, 1 maior
                    if (atual.getEsquerda() != null) { // verifica se possue filho a esquerda
                        atual = atual.getEsquerda();
                    } else { //verificou ate nao ter mais = ser nulo, e inclui o filho a esquerda/dir
                        atual.setEsquerda(novoNo);
                        break;
                    }
                } else { // maior ou igual
                    if (atual.getDireita() != null) {
                        atual = atual.getDireita();
                    } else {
                        atual.setDireita(novoNo);
                        break;
                    }
                }
            }
        }
    }

    public void imprimir(No<T> atual, String prefixo, boolean isEsquerda) {
        if (atual != null) {
            System.out.println(prefixo + (isEsquerda ? "├── " : "└── ") + atual.getvalor());
            imprimir(atual.getDireita(), prefixo + (isEsquerda ? "│   " : "    "), true);
            imprimir(atual.getEsquerda(), prefixo + (isEsquerda ? "│   " : "    "), false);
        }
    }
    public void imprimirArvore() {
        imprimir(raiz, "", false);
    }

    public void encontrar(T valor) {
        No<T> atual = this.raiz;
        No<T> pai = null;
        while (atual != null) {
            if (atual.getvalor().equals(valor)) {
                break;
            } else if (valor.compareTo(atual.getvalor()) == -1) { // valor menor que o atual
                pai = atual;
                atual = atual.getEsquerda();
            } else { // valor maior que o atual
                pai = atual;
                atual = atual.getDireita();
            }
        }
        if (atual != null) {
            System.out.println("Valor encontrado, deseja remover ? 1 --> S 2 --> N");
            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();
            if (opcao == 1) {
                if (atual.getDireita() != null) { // filho a direita
                    No<T> novoNo = atual.getDireita();
                    No<T> novoPai = atual;
                    while (novoNo.getEsquerda() != null) { // ir tudo para a esquerda junto com o pai
                        novoPai = novoNo;
                        novoNo = novoNo.getEsquerda();
                    }
                    // removeu --> substituiu o valor
                    novoNo.setEsquerda(atual.getEsquerda());
                    if (pai != null) {
                        if (atual.getvalor().compareTo(pai.getvalor()) == -1) {
                            pai.setEsquerda(novoNo);
                        } else {
                            pai.setDireita(novoNo);
                        }
                    } else {
                        this.raiz = novoNo;
                        novoPai.setEsquerda(null);
                        this.raiz.setDireita(novoPai);
                        this.raiz.setEsquerda(atual.getEsquerda());
                    }

                    if (novoNo.getvalor().compareTo(novoPai.getvalor()) == -1) {
                        novoPai.setEsquerda(null);
                    } else {
                        novoPai.setDireita(null);
                    }

                } else if (atual.getEsquerda() != null) { //filho a esquerda
                    No<T> novoNo = atual.getEsquerda();
                    No<T> novoPai = atual;
                    while (novoNo.getDireita() != null) { // ir tudo para a direita junto com o pai
                        novoPai = novoNo;
                        novoNo = novoNo.getDireita();
                    }
                    // removeu --> substituiu o valor
                    novoNo.setDireita(atual.getDireita());
                    if (pai != null) {
                        if (atual.getvalor().compareTo(pai.getvalor()) == -1) {
                            pai.setEsquerda(novoNo);
                        } else {
                            pai.setDireita(novoNo);
                        }
                    } else { // se nao tem pai atual entao e raiz
                        this.raiz = novoNo;

                    }

                    if (novoNo.getvalor().compareTo(novoPai.getvalor()) == -1) {
                        novoPai.setEsquerda(null);
                    } else {
                        novoPai.setDireita(null);

                    }

                } else {
                    if (pai != null) {
                        if (atual.getvalor().compareTo(pai.getvalor()) == -1) { // valor atual menor que pai
                            pai.setEsquerda(null);
                        } else {
                            pai.setDireita(null);
                        }
                    } else {
                        this.raiz = null;
                    }
                }
            }else{
                System.out.println("Nao removido");
            }
        }else {
            System.out.println("Nao existe");
        }
    }

    public No<T> getRaiz() {
        return raiz;
    }
}
