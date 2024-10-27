public class Calculadora {
    public static double calcularPorcentagem(double valor, double porcentagem){
        return(valor * porcentagem) / 100;
    }
    public static void calcularGastos(Usuario usuario){
        double salario = usuario.getSalario();
        double porcentagemEssenciais = 50;
        double porcentagemInvestimentos = 20;
        double porcentagemLazer = 15;
        double porcentagemOutros = 15;

        double gastosEssenciais = calcularPorcentagem(salario, porcentagemEssenciais);
        double gastosInventimentos = calcularPorcentagem(salario, porcentagemInvestimentos);
        double gastosLazer = calcularPorcentagem(salario, porcentagemLazer);
        double gastosOutros = calcularPorcentagem(salario, porcentagemOutros);

        System.out.println("Olá " + usuario.getNome() + " com base no seu salário de R$" + usuario.getSalario() + " aqui está as recomendações de gastos para cada área: ");
        System.out.println("Gastos Essenciais - R$" + gastosEssenciais);
        System.out.println("Gastos para investimentos - R$" + gastosInventimentos);
        System.out.println("Gastos para lazer - R$" + gastosLazer);
        System.out.println("Gastos para outras coisas - R$" + gastosOutros);

    }
    
}
