package algoritmos.validadorSenha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        boolean temNumero = false;
        boolean temMaiuscula = false;

        for (char c: senha.toCharArray()) {
            if (Character.isDigit(c)) { temNumero = true; }
            if (Character.isUpperCase(c)) { temMaiuscula = true;}
        }

        if (senha.length() >= 8 && temMaiuscula && temNumero) {
            System.out.println("Sua senha é segura!");
        }

        if (senha.length() < 8) { System.out.println("Sua senha é fraca! Sua senha precisa ter 8 caracteres!"); }
        if (!temMaiuscula) { System.out.println("Sua senha é fraca! Sua senha precisa conter caracter maiúsculo!"); }
        if (!temNumero) { System.out.println("Sua senha é fraca! Sua senha precisa conter números!"); }

    }
}
