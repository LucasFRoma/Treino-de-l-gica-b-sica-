import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner e = new Scanner(System.in);
        String resp, nome;
        System.out.println("Qual o seu nome?");
        //e.nextLine => O código não irá pular uma linha, ou seja, podendo receber nomes compostos
        nome = e.nextLine();


        System.out.println("Olá, " + nome + ", tudo bem com você?");
        resp = e.next();

        //equalsIgnoreCase vai ignorar se o user escreveu a resposta em minúscula ou maiúscula
        //!resp.equalsIgnoreCase, o sinal "!" tem a mesma função que o sinal !=
        //Este while está sendo usado para que os próximos Ifs só respondam caso a resposta esteja correta, senão o user vai ficar preso no while

        while (!resp.equalsIgnoreCase("Sim") && !resp.equalsIgnoreCase("Não")) {
            System.out.println("Não entendi sua resposta, poderia tentar novamente?");
            resp = e.next();
        }

        if (resp.equalsIgnoreCase("Sim")) {
            System.out.println("Que bom, " + nome + ", desejo-lhe um bom fim de noite ");
            resp = null;
        } else if (resp.equalsIgnoreCase("Não")) {
            System.out.println("Que pena, gostaria de se abrir comigo?");
            resp = e.next();
        }
        if (resp.equalsIgnoreCase("Sim")){
            System.out.println("Conte-me mais, estarei ouvindo!");
            resp = e.next();
        } else if (resp.equalsIgnoreCase("Não")){
            System.out.println("Tudo bem, " + nome + ", qualquer coisa estarei aqui.");
        }


    }

}