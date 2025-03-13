import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // TODO: Make an array of doubles, and test your sumArray method

    // TODO: Make an array of Strings, and test your averageLength method

    // TODO: Make an array of ints, and test your arrayMax method

    // TODO: Make an array of Strings as well as a target, and test your linearSearch method
  }


  public static double sumArray(double[] arr)
  {
    double sum = 0.0;
    for (int i = 0; i < arr.length; i++)
    {
      sum += arr[i];
    }
    return sum;
  }

  public static double averageLength(String[] arr)
  {
    int sum = 0;
    for (int i = 0; i < arr.length; i++)
    {
      sum += arr[i].length()
    }
    return sum / arr.length;
  }

  public static int arrayMax(int[] arr)
  {
    int max = Integer.MIN_VALUE
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] < max)
      {
        max = arr[i];
      }
    }
    return max;
  }

  public static boolean linearSearch(String[] arr, String target)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i].equals(target))
      {
        return true;
      }
    }
    return false;
  }
}
