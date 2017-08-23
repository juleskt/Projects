//This is an example that shows how quicksort operates
import java.util.Arrays;

public class QuickSort
{
   private static int[] anArray;
   private static int arrayLength; 
   
   public static void main(String[] args)
   {
      QuickSort hArray = new QuickSort(10);
      hArray.createRandArray();
      System.out.println(Arrays.toString(QuickSort.anArray));
   }
      
   QuickSort(int currArraySize) 
   {
      arrayLength = currArraySize;
      anArray = new int[arrayLength];
   }
   
   //method to create an array with random values from 10 to 100 
   public void createRandArray()  
   {
      for (int i = 0; i < arrayLength; i++)
      {
         anArray[i] = (int)(Math.random() * 91) + 10;
      } 
   }
   
   //method to switch the position of two integers
   public void switchVals(int posOne, int posTwo) 
   {
      int temp = anArray[posOne];
      anArray[posOne] = anArray[posTwo];
      anArray[posTwo] = temp;
   }
    
   public void quickSort()
   {
      
   }
   
   //method takes in left and right pointers and a pivot point   
   public int partition(int leftP, int rightP, int pivotP) 
   {
      int leftPoint = leftP -1;
      int rightPoint = rightP;
      while (true)
      {
         //operates until an integer smaller than the pivot
         //is found or reaches the pivot point
         while (anArray[++leftPoint] < pivot); 
         
         //operates until an integer larger than the pivot
         //is found or reaches the pivot point
         while (rightPoint > 0 && theArray[--rightPoint] > pivot);
         
         /*if a number on the left side is found to be
           greater than a number on the right side,
           the points will stop and switch the two */
         if (leftPoint >= rightPoint)
         {
            break;
         }   
         
         else
         {
            switchVals(leftPoint, rightPoint)
         }
      }
      
      switchVals(leftPoint, rightP);
      return leftPoint;
   }            
}
