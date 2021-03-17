
public class HypotenuseAndTemperatureConverter {

    public static double temperatureConverter(String temperature, boolean isCelsius) {
        return isCelsius ? (Double.parseDouble(temperature) - 32) * 5/9 : (Double.parseDouble(temperature) * 9/5) + 32;
    }

    public static double calculateHypotenuse(String firstTriangleLeg, String secondTriangleLeg) {
        return Math.sqrt(Math.pow(Double.parseDouble(firstTriangleLeg), 2) + Math.pow(Double.parseDouble(secondTriangleLeg), 2));
    }

    public static void main(String[] args) throws Exception {
        boolean keepGoing = true;
        while(keepGoing) {
            System.out.println("Escolha uma das opções: \n 1 - Calcular hipotenusa \n 2 - Celsius para Fahreinheit \n 3 - Fahreinheit para Celsius: ");
            String input = System.console().readLine();
            String temperature;
            switch (input) {
                case "1":
                    System.out.println("Digite o primeiro lado do triângulo: ");
                    String firstTriangleLeg = System.console().readLine();
                    System.out.println("Digite o segundo lado do triângulo: ");
                    String secondTriangleLeg = System.console().readLine();
                    System.out.println("A hipotenusa é: "+calculateHypotenuse(firstTriangleLeg, secondTriangleLeg));
                    break;
                case "2":
                    System.out.println("Digite os graus Celsius: ");
                    temperature = System.console().readLine();
                    System.out.println(temperature+"° celsius é equivalente a "+temperatureConverter(temperature, true)+"° fahreinheit");
                    break;
                case "3":
                    System.out.println("Digite os graus fareinheit: ");
                    temperature = System.console().readLine();
                    System.out.println(temperature+"° fahreinheit é equivalente a "+temperatureConverter(temperature, true)+"° celsius");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Deseja terminar o programa? Digite qualquer tecla para continuar ou S para sair: ");
            input = System.console().readLine();
            keepGoing = input.toLowerCase().contains("s") ? keepGoing = false : keepGoing; 
        }  
    }
}
