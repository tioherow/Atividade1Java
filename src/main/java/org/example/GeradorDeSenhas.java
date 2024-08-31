package org.example;

import java.util.Random;

public class GeradorDeSenhas {
    private static final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String LETRAS_MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%^&*()-_=+[]{}|;:',.<>?/";
    private static final Random random = new Random();

    public String gerarSenha(int comprimento, boolean incluirMinusculas, boolean incluirMaiusculas, boolean incluirNumeros, boolean incluirEspeciais) {
        StringBuilder caracteresPermitidos = new StringBuilder(); /*StringBuilder  modifica uma cadeia de caracteres sem criar um novo objeto*/

        if (incluirMinusculas) {
            caracteresPermitidos.append(LETRAS_MINUSCULAS);
        }

        if (incluirMaiusculas) {
            caracteresPermitidos.append(LETRAS_MAIUSCULAS);
        }

        if (incluirNumeros) {
            caracteresPermitidos.append(NUMEROS);
        }

        if (incluirEspeciais) {
            caracteresPermitidos.append(SIMBOLOS);
        }


        StringBuilder senha = new StringBuilder(comprimento);
        for (int i = 0; i < comprimento; i++) {
            int index = random.nextInt(caracteresPermitidos.length());
            senha.append(caracteresPermitidos.charAt(index));
        }

        return senha.toString();
    }
}