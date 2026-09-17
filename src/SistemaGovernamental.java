import java.util.Scanner;

public class SistemaGovernamental {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Beneficio Governamental ----");
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua renda mensal: ");
        float rendaMensal = sc.nextFloat();

        System.out.println("Digite quantidade de pessoas na família, que moram junto com voC6e");
        int pessoa = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite seu Estado Civil (S) - Solteiro | (C) - Casado | (D) - Divorciado | (V) 0 Viuvu ");
        String estadoCivil = sc.nextLine().toUpperCase().trim();

        System.out.println("Digite o código do seu estado (EE): ");
        String estado = sc.nextLine().toUpperCase().trim();

        if (idade < 1 || rendaMensal < 0 || pessoa < 1){
            System.out.println("Erro Dados invalidos!");
            return;
        }

        float rendaFamiliar = rendaMensal / pessoa;

        System.out.println("----------------------------------------------");

        if (idade >= 60 && rendaFamiliar <= 2000){
            System.out.println("Beneficio integral liberado!");

        } else if (idade >= 18 && rendaFamiliar <= 1500) {
            System.out.println("Beneficio parcial liberado!");

        }else {
            System.out.println("Sem direito ao beneficio!");
        }

        switch (estado){
            case "SC", "PR", "RS":
                System.out.println("Região Sul");
                break;
            case "SP", "RJ", "MG", "ES":
                System.out.println("Região Sudeste");
                break;
            case "BA", "PE", "CE":
                System.out.println("Região Nordeste");
                break;
            default:
                System.out.println("Estado não cadastrado");
                break;
        }

        String estadoCivilFormatado = "";

        if (estadoCivil.equals("S")){
            estadoCivilFormatado = "Solteiro";
        } else if (estadoCivil.equals("C")) {
            estadoCivilFormatado = "Casado";
        } else if (estadoCivil.equals("D")) {
            estadoCivilFormatado = "Divorciado";
        }else if (estadoCivil.equals("V")) {
            estadoCivilFormatado = "Viúvo";
        }else {
            estadoCivilFormatado = "inválido.";
        }
        System.out.printf("Estado cívil %s%n ", estadoCivilFormatado);
    }
}
