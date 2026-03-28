
/**
 * Escreva uma descrição da classe exe2 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class exe2
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int type, age, gain, score; 
        String scoreClass = "";

        System.out.println("\fDigite sua idade:");
        age = in.nextInt();
        if(age >= 18){
            System.out.println("Digite seu Tipo de Cliente");
            System.out.println("1 - Novo");
            System.out.println("2 - Recorrente");
            System.out.println("3 - Premium");
            type = in.nextInt();
            System.out.println("Qual seu Score (0 a 1000)");
            score = in.nextInt();
            System.out.println("Qual sua Renda?");
            gain = in.nextInt();

            if(score <= 1000 && score >= 0){
                switch(type){
                    case 1:
                        if(gain > 10000){
                            score += 200;
                        } else if(gain < 2000){
                            if (score == 1000){
                                score += -201;
                            } else {
                                score += -200;
                            }
                        }
                        break;
                    case 2:
                        score += 200;
                        if(gain > 10000){
                            score += 200;
                        } else if(gain < 2000){
                            if (score == 1000){
                                score += -201;
                            } else {
                                score += -200;
                            }
                        }
                        break;
                    case 3:
                        score += 400;
                        if(gain > 10000){
                            score += 200;
                        } else if(gain < 2000){
                            if (score == 1000){
                                score += -201;

                            } else {
                                score += -200;
                            }
                        }
                        break;
                }
                if (score >= 800){
                                scoreClass = "Excelente";
                            } else if(score < 800 && score >= 600){
                                scoreClass = "Bom";
                            } else if(score < 600 && score >= 400){
                                scoreClass = "Regular";
                            } else if(score < 400){
                                scoreClass = "Ruim";                                
                            }
                System.out.println("Seu Score é: " + scoreClass);
            }
        } else{
            System.out.println("Crédito negado, (Menor de idade)");
        }
    }
}