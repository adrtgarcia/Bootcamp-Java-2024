package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console. 
*/

public class VerificaNegativo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> negativo = numero -> numero < 0;
        boolean existeNegativo = numeros.stream()
                                .anyMatch(negativo);
        System.out.println("Existe algum número negativo? " + existeNegativo);
    }
}
