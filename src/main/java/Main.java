import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        int massLength = scanner.nextInt();
        int [] mass = new int[massLength];
        Random random = new Random();
        for (int i = 0; i < massLength; i++)
        {
            mass[i] = random.nextInt(1000)+1;
        }
        System.out.println("Ваш сгенерированный массив целых чисел : "+ Arrays.toString(mass));
        FindPreMax findPreMax = (int[] array) ->
        {
            int[] cloneArray  = new int[array.length];
            cloneArray =  array;
            Arrays.sort(cloneArray);
            int maxInt = cloneArray[cloneArray.length-1];
            int preMax=0;
            for (int i = cloneArray.length-1; i >= 0 ; i--)
            {
                if(cloneArray[i]<maxInt)
                {
                    preMax = cloneArray[i];
                    break;
                }
            }
            return preMax;
        };
        scanner.close();
        System.out.println("второй по величине элемент - "+findPreMax.findPremax(mass));
    }
}
