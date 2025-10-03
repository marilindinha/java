package PrimeiroProjeto;

public class Lista19 {

    // 1 – Classificando valores
    public static void classificarValor(int numero) {
        if (numero > 0) {
            System.out.println(numero + " é Positivo");
        } else if (numero < 0) {
            System.out.println(numero + " é Negativo");
        } else {
            System.out.println(numero + " é Zero");
        }
    }

    // 2 – Maioridade
    public static void verificarMaioridade(int idade) {
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }

    // 3 – Boas Vindas
    public static void boasVindas(String nome) {
        System.out.println("Bem-vindo(a), " + nome + "!");
    }

    // 4 – Tabuada
    public static void tabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // 5 – Juntando palavras
    public static void juntarPalavras(String palavra1, String palavra2) {
        System.out.println(palavra1 + palavra2);
    }

    // 6 – Verificando par ou ímpar
    public static void parOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " é Par");
        } else {
            System.out.println(numero + " é Ímpar");
        }
    }

    // 7 – Classificando temperatura
    public static void classificarTemperatura(double temp) {
        if (temp < 15) {
            System.out.println("Frio");
        } else if (temp <= 25) {
            System.out.println("Agradável");
        } else {
            System.out.println("Quente");
        }
    }

    // 8 – Saudação por turno
    public static void saudacaoPorTurno(String turno) {
        switch (turno.toLowerCase()) {
            case "manhã":
                System.out.println("Bom dia!");
                break;
            case "tarde":
                System.out.println("Boa tarde!");
                break;
            case "noite":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Turno inválido.");
        }
    }

    // 9 – Calculando média
    public static void calcularMedia(double n1, double n2, double n3) {
        double media = (n1 + n2 + n3) / 3.0;
        System.out.println("Média: " + media);
    }

    // 10 – Verificando aprovação
    public static void verificarAprovacao(double notaFinal) {
        if (notaFinal >= 7) {
            System.out.println("Aprovado");
        } else if (notaFinal >= 5) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void main(String[] args) {
        // Testando todas as funções
        classificarValor(10);
        classificarValor(-3);
        classificarValor(0);

        verificarMaioridade(16);
        verificarMaioridade(20);

        boasVindas("Mariana");

        tabuada(7);

        juntarPalavras("Java", "Rocks");

        parOuImpar(9);
        parOuImpar(12);

        classificarTemperatura(10);
        classificarTemperatura(20);
        classificarTemperatura(30);

        saudacaoPorTurno("manhã");
        saudacaoPorTurno("tarde");
        saudacaoPorTurno("noite");

        calcularMedia(8.5, 7.0, 6.0);

        verificarAprovacao(8.0);
        verificarAprovacao(6.5);
        verificarAprovacao(4.0);
    }
}
