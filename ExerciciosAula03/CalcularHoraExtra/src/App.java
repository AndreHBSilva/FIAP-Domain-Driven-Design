public class App {

    public static double CalcularHoraExtra(int horas, double valorDiaria) {
        double valorHora = valorDiaria/8.0;
        double horasExtra = horas - 8;
        return horas > 8 ? (horas <= 10 ? (horasExtra * valorHora * 1.55) + valorDiaria : (horasExtra * valorHora * 1.66) + valorDiaria) : horas * valorHora;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Digite o valor da sua diária: ");
        String valorDiaria = System.console().readLine();
        System.out.println("Digite o número de horas trabalhadas: ");
        String horas = System.console().readLine();
        System.out.printf("O valor é de R$%.2f", CalcularHoraExtra(Integer.parseInt(horas), Double.parseDouble(valorDiaria)));
    }
}
