package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
Desafio 6 - Verificar se a lista contém algum número maior que 10:
Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
*/

public class VerificaMaior {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> maiorQueDez = numero -> numero > 10;
        boolean existeMaiorQueDez = numeros.stream()
                                    .anyMatch(maiorQueDez);
        System.out.println("Existe algum número maior que 10? " + existeMaiorQueDez);
    }
}
