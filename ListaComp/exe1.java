
/**
 * Escreva uma descrição da classe exe1 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class exe1
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        double enter, exit, totalTime, dayEn, dayEx;
        double value = 0;
        double price = 0;
        int type;
        final double car = 5;
        final double bike = 3;
        final double truck = 8;

        System.out.println("\fQual o tipo de veiculo?");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.println("3 - Caminhonete");
        type = in.nextInt();
        System.out.println("Qual a hora de entrada ?");
        enter = in.nextDouble();
        System.out.println("Qual o dia de entrada ?");
        dayEn = in.nextDouble();
        System.out.println("Qual o horario de saida");
        exit = in.nextDouble();
        System.out.println("Qual o dia de saida ?");
        dayEx = in.nextDouble();

        if(dayEn == dayEx){
            if(enter < exit){
                totalTime = exit - enter;
                switch(type){
                    case 1:
                        if(enter >= 22 || enter <= 6 || exit >= 22 || exit <= 6 ){
                            value += (car * totalTime) * 1.2;
                            if (totalTime >= 5){
                                price += value * 0.9;
                            }
                        } else{
                            if (totalTime >= 5){
                                price += value * 0.9;
                            } else {
                                price += value;
                            }
                        }
                        break;
                    case 2:
                        if(enter >= 22 || enter <= 6 || exit >= 22 || exit <= 6 ){
                            value += (bike * totalTime) * 1.2;
                            if (totalTime >= 5){
                                price += value * 0.9;
                            }
                        } else{
                            if (totalTime >= 5){
                                price += value * 0.9;
                            } else {
                                price += value;
                            }
                        }
                        break;
                    case 3:
                        if(enter >= 22 || enter <= 6 || exit >= 22 || exit <= 6 ){
                            value += (truck * totalTime) * 1.2;
                            if (totalTime >= 5){
                                price += value * 0.9;
                            }
                        } else{
                            if (totalTime >= 5){
                                price += value * 0.9;
                            } else {
                                price += value;
                            }
                        }
                        break;
                }
            } else {
                System.out.println("Valor invalido");
            }
        } else if (dayEn < dayEx){
            totalTime =  (((dayEx - dayEn) * 24) + exit) - enter;
            switch(type){
                case 1:
                    value = (totalTime * car) * 1.2;
                    price += value;
                    break;
                case 2:
                    value = (totalTime * bike) * 1.2;
                    price += value;
                    break;
                case 3:
                    value = (totalTime * truck) * 1.2;
                    price += value;
                    break;
            }
        }

        System.out.println(price);

    }
}